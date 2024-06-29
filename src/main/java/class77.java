import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public class class77 {

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "[I")
    public int[] field887 = new int[100];

    @OriginalMember(owner = "client!haa", name = "h", descriptor = "[Llba;")
    public class237[] field893 = new class237[100];

    @OriginalMember(owner = "client!haa", name = "i", descriptor = "[I")
    public int[] field894 = new int[3];

    @OriginalMember(owner = "client!haa", name = "e", descriptor = "[Lat;")
    public class535[] field890 = new class535[8];

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "[I")
    public static int[] field886 = new int[50];

    @OriginalMember(owner = "client!haa", name = "d", descriptor = "I")
    public static int field889 = 0;

    @OriginalMember(owner = "client!haa", name = "g", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!haa", name = "j", descriptor = "I")
    public int field895;

    @OriginalMember(owner = "client!haa", name = "k", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!haa", name = "l", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!haa", name = "c", descriptor = "Loca;")
    public static class544 field888;

    @OriginalMember(owner = "client!haa", name = "f", descriptor = "Ljava/lang/Object;")
    public Object field891;

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(I)V", line = 3)
    public static void method448(int arg0) {
        if (arg0 != 1024) {
            method451(-50, 34, -16, (byte) 4);
        }
        field886 = null;
        field888 = null;
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(ZZILjava/lang/String;)V", line = 19)
    public static final void method449(boolean arg0, boolean arg1, int arg2, String arg3) {
        if (arg2 <= 22) {
            field886 = null;
        }
        field892++;
        if (class643.field9339 == class582.field8561 && class370.field5351 < 2) {
            return;
        }
        if (arg3.equalsIgnoreCase("errortest")) {
            throw new RuntimeException();
        }
        if (arg3.equals("nativememerror")) {
            throw new OutOfMemoryError("native(MPR");
        }
        try {
            if (arg3.equalsIgnoreCase("fpson")) {
                class64.field740 = true;
                class492.method2982("fps debug enabled", (byte) 54);
                return;
            }
            if (arg3.equalsIgnoreCase("fpsoff")) {
                class64.field740 = false;
                class492.method2982("fps debug disabled", (byte) 75);
                return;
            }
            if (arg3.equals("systemmem")) {
                try {
                    class492.method2982("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb", (byte) 65);
                    return;
                } catch (Throwable var31) {
                    return;
                }
            }
            if (arg3.equalsIgnoreCase("cls")) {
                class549.field8179 = 0;
                class174.field2410 = 0;
                return;
            }
            if (arg3.equalsIgnoreCase("cleartext")) {
                class413.field5873.method778((byte) -36);
                class492.method2982("Text coords cleared", (byte) 125);
                return;
            }
            if (arg3.equalsIgnoreCase("gc")) {
                class441.method2689(-126);
                for (int var4 = 0; var4 < 10; var4++) {
                    System.gc();
                }
                Runtime var5 = Runtime.getRuntime();
                int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
                class492.method2982("mem=" + var6 + "k", (byte) 59);
                return;
            }
            if (arg3.equalsIgnoreCase("compact")) {
                class441.method2689(-111);
                for (int var7 = 0; var7 < 10; var7++) {
                    System.gc();
                }
                Runtime var8 = Runtime.getRuntime();
                int var9 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
                class492.method2982("Memory before cleanup=" + var9 + "k", (byte) 98);
                class626.method3657(-109);
                class441.method2689(-124);
                for (int var10 = 0; var10 < 10; var10++) {
                    System.gc();
                }
                int var11 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
                class492.method2982("Memory after cleanup=" + var11 + "k", (byte) 101);
                return;
            }
            if (arg3.equalsIgnoreCase("unloadnatives")) {
                class492.method2982(class390.method2359(14306) ? "Libraries unloaded" : "Library unloading failed!", (byte) 68);
                return;
            }
            if (arg3.equalsIgnoreCase("pcachesize")) {
                class492.method2982("Number of player models in cache:" + class477.method2898(89), (byte) 112);
                return;
            }
            if (arg3.equalsIgnoreCase("clientdrop")) {
                class492.method2982("Dropped client connection", (byte) 69);
                if (class192.field2903 == 9) {
                    class561.method3283((byte) 125);
                } else if (class192.field2903 == 10) {
                    class590.field8736 = true;
                    return;
                }
                return;
            }
            if (arg3.equalsIgnoreCase("clientjs5drop")) {
                class80.field919.method2184(-117);
                class492.method2982("Dropped client js5 net queue", (byte) 68);
                return;
            }
            if (arg3.equalsIgnoreCase("serverjs5drop")) {
                class80.field919.method2190(false);
                class492.method2982("Dropped server js5 net queue", (byte) 102);
                return;
            }
            if (arg3.equalsIgnoreCase("breakcon")) {
                class328.field4850.method2165(0);
                class513.field7606.method1244(0);
                class80.field919.method2189(7730);
                class492.method2982("Breaking new connections for 5 seconds", (byte) 93);
                return;
            }
            if (arg3.equalsIgnoreCase("rebuild")) {
                class29.method128((byte) 126);
                class10.method49(true);
                class492.method2982("Rebuilding map", (byte) 126);
                return;
            }
            if (arg3.equalsIgnoreCase("wm1")) {
                class463.method2748(-1, false, (byte) 124, -1, 1);
                if (class608.method3540(120) == 1) {
                    class492.method2982("wm1 succeeded", (byte) 96);
                    return;
                }
                class492.method2982("wm1 failed", (byte) 54);
                return;
            }
            if (arg3.equalsIgnoreCase("wm2")) {
                class463.method2748(-1, false, (byte) 123, -1, 2);
                if (class608.method3540(127) != 2) {
                    class492.method2982("wm2 failed", (byte) 67);
                    return;
                }
                class492.method2982("wm2 succeeded", (byte) 92);
                return;
            }
            if (arg3.equalsIgnoreCase("wm3")) {
                class463.method2748(768, false, (byte) 127, 1024, 3);
                if (class608.method3540(125) != 3) {
                    class492.method2982("wm3 failed", (byte) 110);
                    return;
                }
                class492.method2982("wm3 succeeded", (byte) 107);
                return;
            }
            if (arg3.equalsIgnoreCase("tk0")) {
                class447.method2712(10, 0);
                if (class239.field3499 == 0) {
                    class492.method2982("Entered tk0", (byte) 97);
                    class94.field1158.field264 = 0;
                    class94.field1158.method2661(class328.field4850, -1);
                    class393.field5714 = false;
                    return;
                }
                class492.method2982("Failed to enter tk0", (byte) 54);
                return;
            }
            if (arg3.equalsIgnoreCase("tk1")) {
                class447.method2712(10, 1);
                if (class239.field3499 == 1) {
                    class492.method2982("Entered tk1", (byte) 97);
                    class94.field1158.field264 = 1;
                    class94.field1158.method2661(class328.field4850, -1);
                    class393.field5714 = false;
                    return;
                }
                class492.method2982("Failed to enter tk1", (byte) 112);
                return;
            }
            if (arg3.equalsIgnoreCase("tk2")) {
                class447.method2712(10, 2);
                if (class239.field3499 != 2) {
                    class492.method2982("Failed to enter tk2", (byte) 83);
                    return;
                }
                class492.method2982("Entered tk2", (byte) 118);
                class94.field1158.field264 = 2;
                class94.field1158.method2661(class328.field4850, -1);
                class393.field5714 = false;
                return;
            }
            if (arg3.equalsIgnoreCase("tk3")) {
                class447.method2712(10, 3);
                if (class239.field3499 == 3) {
                    class492.method2982("Entered tk3", (byte) 90);
                    class94.field1158.field264 = 3;
                    class94.field1158.method2661(class328.field4850, -1);
                    class393.field5714 = false;
                    return;
                }
                class492.method2982("Failed to enter tk3", (byte) 116);
                return;
            }
            if (arg3.equalsIgnoreCase("tk4")) {
                class447.method2712(10, 4);
                if (class239.field3499 == 4) {
                    class492.method2982("Entered tk4", (byte) 45);
                    class94.field1158.field264 = 4;
                    class94.field1158.method2661(class328.field4850, -1);
                    class393.field5714 = false;
                    return;
                }
                class492.method2982("Failed to enter tk4", (byte) 84);
                return;
            }
            if (arg3.equalsIgnoreCase("tk5")) {
                class447.method2712(10, 5);
                if (class239.field3499 == 5) {
                    class492.method2982("Entered tk5", (byte) 63);
                    class94.field1158.field264 = 5;
                    class94.field1158.method2661(class328.field4850, -1);
                    class393.field5714 = false;
                    return;
                }
                class492.method2982("Failed to enter tk5", (byte) 77);
                return;
            }
            if (arg3.equalsIgnoreCase("ot")) {
                class94.field1158.field290 = !class94.field1158.field290;
                class94.field1158.method2661(class328.field4850, -1);
                class393.field5714 = false;
                class29.method128((byte) 126);
                class492.method2982("ot=" + class94.field1158.field290, (byte) 125);
                return;
            }
            if (arg3.equalsIgnoreCase("gb")) {
                class94.field1158.field296 = !class94.field1158.field296;
                class94.field1158.method2661(class328.field4850, -1);
                class393.field5714 = false;
                class29.method128((byte) 125);
                class492.method2982("gb=" + class94.field1158.field296, (byte) 103);
                return;
            }
            if (arg3.startsWith("shadows")) {
                if (arg3.length() < 8) {
                    class492.method2982("Invalid shadows value", (byte) 45);
                    return;
                }
                String var12 = arg3.substring(8);
                int var13 = class258.method1628(true, var12) ? class233.method1518(var12, (byte) -123) : -1;
                if (var13 >= 0 && var13 <= 2) {
                    class94.field1158.method134(var13, -1, class239.field3499);
                    class94.field1158.method2661(class328.field4850, -1);
                    class393.field5714 = false;
                    class29.method128((byte) 125);
                    class492.method2982("shadows=" + var13, (byte) 82);
                    return;
                }
                class492.method2982("Invalid shadows value", (byte) 103);
                return;
            }
            if (arg3.startsWith("textures")) {
                class94.field1158.field262 = !class94.field1158.field262;
                class94.field1158.method2661(class328.field4850, -1);
                class393.field5714 = false;
                class394.method2372(true);
                class29.method128((byte) 126);
                class492.method2982("textures=" + class94.field1158.field262, (byte) 115);
                return;
            }
            if (arg3.startsWith("lighting")) {
                class94.field1158.method132(!class94.field1158.method130(-27423, class239.field3499), false, class239.field3499);
                class94.field1158.method2661(class328.field4850, -1);
                class393.field5714 = false;
                class598.method3496(118);
                class394.method2372(true);
                class29.method128((byte) 127);
                class492.method2982("lighting=" + class94.field1158.method130(-27423, class239.field3499), (byte) 126);
                return;
            }
            if (arg3.startsWith("setba")) {
                if (arg3.length() < 6) {
                    class492.method2982("Invalid buildarea value", (byte) 113);
                    return;
                }
                int var14 = class233.method1518(arg3.substring(6), (byte) -122);
                if (var14 >= 0 && var14 <= class390.method2353(false, class223.field3276)) {
                    class94.field1158.field278 = var14;
                    class94.field1158.method2661(class328.field4850, -1);
                    class393.field5714 = false;
                    class492.method2982("maxbuildarea=" + class94.field1158.field278, (byte) 78);
                    return;
                }
                class492.method2982("Invalid buildarea value", (byte) 93);
                return;
            }
            if (arg3.startsWith("setparticles")) {
                if (arg3.length() < 13) {
                    class492.method2982("Invalid particles value", (byte) 69);
                    return;
                }
                class295.method1828((byte) -113, class233.method1518(arg3.substring(13), (byte) -126));
                class94.field1158.method2661(class328.field4850, -1);
                class393.field5714 = false;
                class492.method2982("particles=" + class640.method3707((byte) -128), (byte) 95);
                return;
            }
            if (arg3.startsWith("rect_debug")) {
                if (arg3.length() < 10) {
                    class492.method2982("Invalid rect_debug value", (byte) 58);
                    return;
                }
                class40.field446 = class233.method1518(arg3.substring(10).trim(), (byte) -122);
                class492.method2982("rect_debug=" + class40.field446, (byte) 114);
                return;
            }
            if (arg3.equalsIgnoreCase("qa_op_test")) {
                class220.field3252 = true;
                class492.method2982("qa_op_test=" + class220.field3252, (byte) 72);
                return;
            }
            if (arg3.equalsIgnoreCase("clipcomponents")) {
                class509.field7571 = !class509.field7571;
                class492.method2982("clipcomponents=" + class509.field7571, (byte) 115);
                return;
            }
            if (arg3.startsWith("bloom")) {
                boolean var15 = class379.field5558.method345();
                if (!class99.method579((byte) 121, !var15)) {
                    class492.method2982("Failed to enable bloom", (byte) 107);
                    return;
                }
                if (!var15) {
                    class492.method2982("Bloom enabled", (byte) 72);
                    return;
                }
                class492.method2982("Bloom disabled", (byte) 90);
                return;
            }
            if (arg3.equalsIgnoreCase("tween")) {
                if (class516.field7637) {
                    class516.field7637 = false;
                    class492.method2982("Forced tweening disabled.", (byte) 80);
                    return;
                }
                class516.field7637 = true;
                class492.method2982("Forced tweening ENABLED!", (byte) 92);
                return;
            }
            if (arg3.equalsIgnoreCase("shiftclick")) {
                if (!class154.field1979) {
                    class492.method2982("Shift-click ENABLED!", (byte) 77);
                    class154.field1979 = true;
                    return;
                }
                class492.method2982("Shift-click disabled.", (byte) 120);
                class154.field1979 = false;
                return;
            }
            if (arg3.equalsIgnoreCase("getcgcoord")) {
                class492.method2982("x:" + (class239.field3493.field3464 >> 7) + " z:" + (class239.field3493.field3463 >> 7), (byte) 122);
                return;
            }
            if (arg3.equalsIgnoreCase("getheight")) {
                class492.method2982("Height: " + class235.field3455[class239.field3493.field3457].method1319(class239.field3493.field3464 >> 7, class239.field3493.field3463 >> 7), (byte) 68);
                return;
            }
            if (arg3.equalsIgnoreCase("resetminimap")) {
                class371.field5368.method3484(true);
                class371.field5368.method3488(false);
                class402.field5766.method1712(-17274);
                class540.field8011.method1214((byte) -58);
                class10.method49(true);
                class492.method2982("Minimap reset", (byte) 56);
                return;
            }
            if (arg3.startsWith("mc")) {
                if (!class379.field5558.method955()) {
                    class492.method2982("Current toolkit doesn't support multiple cores", (byte) 75);
                    return;
                }
                int var16 = Integer.parseInt(arg3.substring(3));
                if (var16 < 1) {
                    var16 = 1;
                } else if (var16 > 4) {
                    var16 = 4;
                }
                class218.field3235 = var16;
                class379.field5558.method1044(class218.field3235);
                class379.field5558.method981(0);
                class492.method2982("Render cores now: " + class218.field3235, (byte) 79);
                return;
            }
            if (arg3.startsWith("cachespace")) {
                class492.method2982("I(s): " + class328.field4849.method2036(16383) + "/" + class328.field4849.method2031(2), (byte) 66);
                class492.method2982("I(m): " + class100.field1273.method2036(16383) + "/" + class100.field1273.method2031(2), (byte) 79);
                class492.method2982("O(s): " + class216.field3204.field8480.method791(14) + "/" + class216.field3204.field8480.method779(1998), (byte) 65);
                return;
            }
            if (arg3.equalsIgnoreCase("getcamerapos")) {
                class492.method2982("Pos: " + class239.field3493.field3457 + "," + ((class358.field5200 >> 7) + class584.field8677 >> 6) + "," + ((class367.field5319 >> 7) + class424.field6061 >> 6) + "," + ((class358.field5200 >> 7) + class584.field8677 & 0x3F) + "," + ((class367.field5319 >> 7) + class424.field6061 & 0x3F) + " Height: " + (class226.method1477(class239.field3493.field3457, true, class358.field5200, class367.field5319) - class111.field1412), (byte) 90);
                class492.method2982("Look: " + class239.field3493.field3457 + "," + (class584.field8677 + class32.field343 >> 6) + "," + (class529.field7853 + class424.field6061 >> 6) + "," + (class584.field8677 + class32.field343 & 0x3F) + "," + (class529.field7853 + class424.field6061 & 0x3F) + " Height: " + (class226.method1477(class239.field3493.field3457, true, class32.field343, class529.field7853) - class133.field1770), (byte) 77);
                return;
            }
            if (arg3.equals("showocc")) {
                class177.field2696 = !class177.field2696;
                class29.method128((byte) 126);
                class492.method2982("showocc=" + class177.field2696, (byte) 90);
                return;
            }
            if (arg3.equals("wallocc")) {
                class235.field3454 = !class235.field3454;
                class29.method128((byte) 124);
                class492.method2982("forcewallocc=" + class235.field3454, (byte) 115);
                return;
            }
            if (arg3.equals("renderprofile") || arg3.equals("rp")) {
                class533.field7897 = !class533.field7897;
                class379.field5558.method307(class533.field7897);
                class434.method2649((byte) -48);
                class492.method2982("showprofiling=" + class533.field7897, (byte) 105);
                return;
            }
            if (arg3.startsWith("performancetest")) {
                int var17 = -1;
                int var18 = 1000;
                if (arg3.length() > 15) {
                    String[] var19 = class317.method1994(8, ' ', arg3);
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
                if (var17 != -1) {
                    class492.method2982("Performance: " + class73.method431(var18, class239.field3499, -12693), (byte) 44);
                    return;
                }
                class492.method2982("Java toolkit: " + class73.method431(var18, 0, -12693), (byte) 81);
                class492.method2982("SSE toolkit:  " + class73.method431(var18, 2, -12693), (byte) 65);
                class492.method2982("D3D toolkit:  " + class73.method431(var18, 3, -12693), (byte) 56);
                class492.method2982("GL toolkit:   " + class73.method431(var18, 1, -12693), (byte) 68);
                return;
            }
            if (arg3.equals("renderer")) {
                class374 var20 = class379.field5558.method287();
                class492.method2982("Vendor: " + var20.field5509, (byte) 96);
                class492.method2982("Name: " + var20.field5504, (byte) 63);
                class492.method2982("Version: " + var20.field5503, (byte) 107);
                class492.method2982("Device: " + var20.field5510, (byte) 110);
                class492.method2982("Driver Version: " + var20.field5508, (byte) 86);
                return;
            }
            if (arg3.equals("nonpcs")) {
                class534.field7903 = !class534.field7903;
                class492.method2982("nonpcs=" + class534.field7903, (byte) 117);
                return;
            }
            if (arg3.equals("autoworld")) {
                class479.method2907((byte) -29);
                class492.method2982("auto world selected", (byte) 92);
                return;
            }
            if (arg3.startsWith("switchworld")) {
                int var21 = Integer.parseInt(arg3.substring(12));
                class395.method2377(var21, class627.method3658(var21, false).field6005, -2);
                class492.method2982("switched", (byte) 63);
                return;
            }
            if (arg3.equals("getworld")) {
                class492.method2982("w: " + class536.field7933.field6633, (byte) 90);
                return;
            }
            if (arg3.startsWith("pc")) {
                class165.method1046(-3466, class43.field526);
                class221.field3268.method2563(-13021, 0);
                int var22 = class221.field3268.field6221;
                int var23 = arg3.indexOf(" ", 4);
                class221.field3268.method2580(arg3.substring(3, var23), 30127);
                class502.method3017(0, class221.field3268, arg3.substring(var23));
                class221.field3268.method2572(-19419, class221.field3268.field6221 - var22);
                return;
            }
            if (arg3.equals("heap")) {
                class492.method2982("Heap: " + class223.field3276 + "MB", (byte) 94);
                return;
            }
            if (arg3.equals("savevarcs")) {
                class622.method3622(113);
                class492.method2982("perm varcs saved", (byte) 46);
                return;
            }
            if (arg3.equals("scramblevarcs")) {
                for (int var24 = 0; var24 < class526.field7774.length; var24++) {
                    if (class595.field8769[var24]) {
                        class526.field7774[var24] = (int) (Math.random() * 99999.0D);
                        if (Math.random() > 0.5D) {
                            class526.field7774[var24] *= -1;
                        }
                    }
                }
                class622.method3622(99);
                class492.method2982("perm varcs scrambled", (byte) 85);
                return;
            }
            if (arg3.equals("showcolmap")) {
                class442.field6457 = true;
                class10.method49(true);
                class492.method2982("colmap is shown", (byte) 51);
                return;
            }
            if (arg3.equals("hidecolmap")) {
                class442.field6457 = false;
                class10.method49(true);
                class492.method2982("colmap is hidden", (byte) 92);
                return;
            }
            if (arg3.equals("resetcache")) {
                class151.method883((byte) 81);
                class492.method2982("Caches reset", (byte) 64);
                return;
            }
            if (arg3.equals("profilecpu")) {
                class492.method2982(class28.method125(false) + "ms", (byte) 80);
                return;
            }
            if (arg3.startsWith("cpuusage")) {
                int var25 = Integer.parseInt(arg3.substring(9));
                if (var25 >= 0 && var25 <= 4) {
                    class94.field1158.field270 = var25;
                }
                class492.method2982("cpuusage=" + class94.field1158.field270, (byte) 82);
                return;
            }
            if (arg3.startsWith("getclientvarpbit")) {
                int var26 = Integer.parseInt(arg3.substring(17));
                class492.method2982("varpbit=" + class406.field5823.method653(var26, -11730), (byte) 75);
                return;
            }
            if (arg3.startsWith("getclientvarp")) {
                int var27 = Integer.parseInt(arg3.substring(14));
                class492.method2982("varp=" + class406.field5823.method654(86, var27), (byte) 82);
                return;
            }
            if (arg3.startsWith("demologin")) {
                client.method3600((byte) -105, false, 0);
                return;
            }
            if (arg3.startsWith("newdemologin")) {
                client.method3600((byte) -117, true, 0);
                return;
            }
            if (arg3.startsWith("directlogin")) {
                String[] var28 = class317.method1994(8, ' ', arg3.substring(12));
                if (var28.length >= 2) {
                    int var29 = var28.length <= 2 ? 0 : Integer.parseInt(var28[2]);
                    class195.method1256(var28[1], var29, (byte) 95, var28[0]);
                    return;
                }
            }
            if (arg3.startsWith("csprofileclear")) {
                class330.method2066();
                return;
            }
            if (arg3.startsWith("csprofileoutputc")) {
                class330.method2068(100, false);
                return;
            }
            if (arg3.startsWith("csprofileoutputt")) {
                class330.method2068(10, true);
                return;
            }
            if (arg3.startsWith("texsize")) {
                int var30 = Integer.parseInt(arg3.substring(8));
                class379.field5558.method1043(var30);
                return;
            }
            if (arg3.equals("soundstreamcount")) {
                class492.method2982("Active streams: " + class105.field1321.method2087(), (byte) 54);
                return;
            }
            if (arg3.equals("autosetup")) {
                class94.field1158.method2665((byte) -113);
                class492.method2982("Complete. Toolkit now: " + class239.field3499, (byte) 118);
                return;
            }
            if (arg3.equals("errormessage")) {
                class492.method2982(class621.field9076.method3113((byte) -79), (byte) 73);
                return;
            }
            if (class192.field2903 == 9) {
                class165.method1046(-3466, class177.field2695);
                class89.field1130++;
                class221.field3268.method2563(-13021, arg3.length() + 3);
                class221.field3268.method2563(-13021, arg1 ? 1 : 0);
                class221.field3268.method2563(-13021, arg0 ? 1 : 0);
                class221.field3268.method2580(arg3, 30127);
            }
            if (arg3.startsWith("fps ") && class643.field9339 != class582.field8561) {
                class264.method1692((byte) -51, class233.method1518(arg3.substring(4), (byte) -128));
                return;
            }
            if (class192.field2903 != 9) {
                class492.method2982("Unrecogonised commmand when not logged in: " + arg3, (byte) 83);
                return;
            }
        } catch (Exception var34) {
            class492.method2982("Whoops, something went wrong.", (byte) 107);
            return;
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(Lhaa;IIIII)V", line = 928)
    public static final void method450(class77 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field895 = 0;
        for (int var6 = 0; var6 < 4; var6++) {
            if (arg0.field890[var6] != null) {
                arg0.field895++;
            }
        }
        label50: for (int var7 = 0; var7 < arg0.field895; var7++) {
            long var8 = class22.field199[arg1][arg2][arg3];
            while (var8 != 0L) {
                class323 var14 = class29.field260[(int) ((var8 & 0xFFFFL) - 1L)];
                var8 >>>= 0x10;
                if (arg0.field890[var7] == var14.field4799) {
                    continue label50;
                }
            }
            long var10 = class22.field199[arg1][arg4][arg5];
            while (var10 != 0L) {
                class323 var13 = class29.field260[(int) ((var10 & 0xFFFFL) - 1L)];
                var10 >>>= 0x10;
                if (arg0.field890[var7] == var13.field4799) {
                    continue label50;
                }
            }
            for (int var12 = var7; var12 < arg0.field895 - 1; var12++) {
                arg0.field890[var12] = arg0.field890[var12 + 1];
            }
            arg0.field895--;
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(IIIB)I", line = 983)
    public static final int method451(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0 & 0x3;
        field897++;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else if (arg3 <= 81) {
            return 85;
        } else {
            return arg2;
        }
    }
}
