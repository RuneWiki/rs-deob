import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class211 {

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "Z")
    public static boolean field2717;

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "[[S")
    public static short[][] field2719;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILjava/lang/String;Z)V")
    public static final void method1307(int arg0, String arg1, boolean arg2) {
        field2715++;
        if (class324.field4107 != class218.field2784 || class322.field4086 >= 2) {
            if (arg1.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg1.equals("nativememerror")) {
                throw new OutOfMemoryError("native(MPR");
            }
            try {
                if (arg1.equalsIgnoreCase("fpson")) {
                    class394.field5285 = true;
                    class306.method1794("fps debug enabled", arg0 ^ 0x7968);
                    return;
                }
                if (arg1.equalsIgnoreCase("fpsoff")) {
                    class394.field5285 = false;
                    class306.method1794("fps debug disabled", -1);
                    return;
                }
                if (arg1.equals("systemmem")) {
                    try {
                        class306.method1794("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb", -1);
                        return;
                    } catch (Throwable var26) {
                        return;
                    }
                }
                if (arg1.equalsIgnoreCase("cls")) {
                    class488.field7109 = 0;
                    class520.field7512 = 0;
                    return;
                }
                if (arg1.equalsIgnoreCase("cleartext")) {
                    class214.field2754.method2095(arg0 + 31189);
                    class306.method1794("Text coords cleared", -1);
                    return;
                }
                if (arg1.equalsIgnoreCase("gc")) {
                    class322.method1890(0);
                    for (int var3 = 0; var3 < 10; var3++) {
                        System.gc();
                    }
                    Runtime var4 = Runtime.getRuntime();
                    int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
                    class306.method1794("mem=" + var5 + "k", -1);
                    return;
                }
                if (arg1.equalsIgnoreCase("compact")) {
                    class322.method1890(0);
                    for (int var6 = 0; var6 < 10; var6++) {
                        System.gc();
                    }
                    Runtime var7 = Runtime.getRuntime();
                    int var8 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                    class306.method1794("Memory before cleanup=" + var8 + "k", -1);
                    class300.method1773(67);
                    class322.method1890(0);
                    for (int var9 = 0; var9 < 10; var9++) {
                        System.gc();
                    }
                    int var10 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                    class306.method1794("Memory after cleanup=" + var10 + "k", -1);
                    return;
                }
                if (arg1.equalsIgnoreCase("pcachesize")) {
                    class306.method1794("Number of player models in cache:" + class93.method719(arg0 + 38882), -1);
                    return;
                }
                if (arg1.equalsIgnoreCase("clientdrop")) {
                    class306.method1794("Dropped client connection", arg0 ^ 0x7968);
                    if (class483.field7059 == 9) {
                        class253.method1525(-1860040276);
                        return;
                    }
                    if (class483.field7059 == 10) {
                        class178.field2348 = true;
                    }
                    return;
                }
                if (arg1.equalsIgnoreCase("clientjs5drop")) {
                    class298.field3825.method2063(true);
                    class306.method1794("Dropped client js5 net queue", -1);
                    return;
                }
                if (arg1.equalsIgnoreCase("serverjs5drop")) {
                    class298.field3825.method2064(-2);
                    class306.method1794("Dropped server js5 net queue", arg0 ^ 0x7968);
                    return;
                }
                if (arg1.equalsIgnoreCase("breakcon")) {
                    class219.field2794.method2884(arg0 ^ 0xFFFF951F);
                    class64.field835.method2471((byte) -118);
                    class298.field3825.method2066((byte) -92);
                    class306.method1794("Breaking new connections for 5 seconds", -1);
                    return;
                }
                if (arg1.equalsIgnoreCase("rebuild")) {
                    class384.method2171(-27);
                    class2.method5(false);
                    class306.method1794("Rebuilding map", -1);
                    return;
                }
                if (arg1.equalsIgnoreCase("wm1")) {
                    class163.method1052(false, (byte) 111, -1, -1, 1);
                    if (class191.method1184(false) == 1) {
                        class306.method1794("wm1 succeeded", -1);
                        return;
                    }
                    class306.method1794("wm1 failed", arg0 ^ 0x7968);
                    return;
                }
                if (arg1.equalsIgnoreCase("wm2")) {
                    class163.method1052(false, (byte) 47, -1, -1, 2);
                    if (class191.method1184(false) != 2) {
                        class306.method1794("wm2 failed", -1);
                        return;
                    }
                    class306.method1794("wm2 succeeded", -1);
                    return;
                }
                if (arg1.equalsIgnoreCase("wm3")) {
                    class163.method1052(false, (byte) 127, 768, 1024, 3);
                    if (class191.method1184(false) == 3) {
                        class306.method1794("wm3 succeeded", arg0 + 31080);
                        return;
                    }
                    class306.method1794("wm3 failed", arg0 ^ 0x7968);
                    return;
                }
                if (arg1.equalsIgnoreCase("tk0")) {
                    class53.method525(109, 0);
                    if (class377.field4959 != 0) {
                        class306.method1794("Failed to enter tk0", -1);
                        return;
                    }
                    class306.method1794("Entered tk0", -1);
                    class407.field5817.field3656 = 0;
                    class407.field5817.method578((byte) 18, class219.field2794);
                    class236.field3006 = false;
                    return;
                }
                if (arg1.equalsIgnoreCase("tk1")) {
                    class53.method525(74, 1);
                    if (class377.field4959 == 1) {
                        class306.method1794("Entered tk1", -1);
                        class407.field5817.field3656 = 1;
                        class407.field5817.method578((byte) 59, class219.field2794);
                        class236.field3006 = false;
                        return;
                    }
                    class306.method1794("Failed to enter tk1", arg0 + 31080);
                    return;
                }
                if (arg1.equalsIgnoreCase("tk2")) {
                    class53.method525(arg0 ^ 0xFFFF86E4, 2);
                    if (class377.field4959 != 2) {
                        class306.method1794("Failed to enter tk2", -1);
                        return;
                    }
                    class306.method1794("Entered tk2", -1);
                    class407.field5817.field3656 = 2;
                    class407.field5817.method578((byte) 3, class219.field2794);
                    class236.field3006 = false;
                    return;
                }
                if (arg1.equalsIgnoreCase("tk3")) {
                    class53.method525(arg0 + 31180, 3);
                    if (class377.field4959 == 3) {
                        class306.method1794("Entered tk3", -1);
                        return;
                    }
                    class306.method1794("Failed to enter tk3", arg0 + 31080);
                    return;
                }
                if (arg1.equalsIgnoreCase("ot")) {
                    class407.field5817.field3617 = !class407.field5817.field3617;
                    class407.field5817.method578((byte) 27, class219.field2794);
                    class236.field3006 = false;
                    class384.method2171(arg0 ^ 0x794F);
                    class306.method1794("ot=" + class407.field5817.field3617, -1);
                    return;
                }
                if (arg1.equalsIgnoreCase("gb")) {
                    class407.field5817.field3654 = !class407.field5817.field3654;
                    class407.field5817.method578((byte) 7, class219.field2794);
                    class236.field3006 = false;
                    class384.method2171(-28);
                    class306.method1794("gb=" + class407.field5817.field3654, -1);
                    return;
                }
                if (arg1.startsWith("shadows")) {
                    if (arg1.length() < 8) {
                        class306.method1794("Invalid shadows value", -1);
                        return;
                    }
                    String var11 = arg1.substring(8);
                    int var12 = class341.method1963(arg0 ^ 0xFFFF869D, var11) ? class521.method3099(var11, 109) : -1;
                    if (var12 >= 0 && var12 <= 2) {
                        class407.field5817.method1683(112, class377.field4959, var12);
                        class407.field5817.method578((byte) 70, class219.field2794);
                        class236.field3006 = false;
                        class384.method2171(-127);
                        class306.method1794("shadows=" + var12, -1);
                        return;
                    }
                    class306.method1794("Invalid shadows value", -1);
                    return;
                }
                if (arg1.startsWith("textures")) {
                    class407.field5817.field3625 = !class407.field5817.field3625;
                    class407.field5817.method578((byte) 113, class219.field2794);
                    class236.field3006 = false;
                    class237.method1426(1);
                    class384.method2171(-79);
                    class306.method1794("textures=" + class407.field5817.field3625, -1);
                    return;
                }
                if (arg1.startsWith("setba")) {
                    if (arg1.length() < 6) {
                        class306.method1794("Invalid buildarea value", -1);
                        return;
                    }
                    int var13 = class521.method3099(arg1.substring(6), 81);
                    if (var13 >= 0 && class496.method2999(true, class105.field1333) >= var13) {
                        class407.field5817.field3624 = var13;
                        class407.field5817.method578((byte) 107, class219.field2794);
                        class236.field3006 = false;
                        class306.method1794("maxbuildarea=" + class407.field5817.field3624, arg0 + 31080);
                        return;
                    }
                    class306.method1794("Invalid buildarea value", -1);
                    return;
                }
                if (arg1.startsWith("setparticles")) {
                    if (arg1.length() < 13) {
                        class306.method1794("Invalid particles value", arg0 ^ 0x7968);
                        return;
                    }
                    class410.method2436(57, class521.method3099(arg1.substring(13), 46));
                    class407.field5817.method578((byte) 5, class219.field2794);
                    class236.field3006 = false;
                    class306.method1794("particles=" + class451.method2689(-17524), -1);
                    return;
                }
                if (arg1.startsWith("rect_debug")) {
                    if (arg1.length() < 10) {
                        class306.method1794("Invalid rect_debug value", -1);
                        return;
                    }
                    class42.field519 = class521.method3099(arg1.substring(10).trim(), arg0 + 31149);
                    class306.method1794("rect_debug=" + class42.field519, -1);
                    return;
                }
                if (arg1.equalsIgnoreCase("qa_op_test")) {
                    class191.field2480 = true;
                    class306.method1794("qa_op_test=" + class191.field2480, -1);
                    return;
                }
                if (arg1.equalsIgnoreCase("clipcomponents")) {
                    class468.field6765 = !class468.field6765;
                    class306.method1794("clipcomponents=" + class468.field6765, arg0 ^ 0x7968);
                    return;
                }
                if (arg1.startsWith("bloom")) {
                    boolean var14 = class33.field416.method304();
                    if (!class176.method1131(!var14, arg0 + 31162)) {
                        class306.method1794("Failed to enable bloom", -1);
                        return;
                    }
                    if (!var14) {
                        class306.method1794("Bloom enabled", arg0 ^ 0x7968);
                        return;
                    }
                    class306.method1794("Bloom disabled", -1);
                    return;
                }
                if (arg1.equalsIgnoreCase("tween")) {
                    if (!class279.field3533) {
                        class279.field3533 = true;
                        class306.method1794("Forced tweening ENABLED!", arg0 ^ 0x7968);
                        return;
                    }
                    class279.field3533 = false;
                    class306.method1794("Forced tweening disabled.", -1);
                    return;
                }
                if (arg1.equalsIgnoreCase("shiftclick")) {
                    if (class56.field744) {
                        class306.method1794("Shift-click disabled.", -1);
                        class56.field744 = false;
                        return;
                    }
                    class306.method1794("Shift-click ENABLED!", arg0 + 31080);
                    class56.field744 = true;
                    return;
                }
                if (arg1.equalsIgnoreCase("getcgcoord")) {
                    class306.method1794("x:" + (class23.field336.field2666 >> 7) + " z:" + (class23.field336.field2677 >> 7), arg0 + 31080);
                    return;
                }
                if (arg1.equalsIgnoreCase("getheight")) {
                    class306.method1794("Height: " + class520.field7520[class23.field336.field2676].method399(class23.field336.field2666 >> 7, class23.field336.field2677 >> 7), -1);
                    return;
                }
                if (arg1.equalsIgnoreCase("resetminimap")) {
                    class448.field6413.method461(0);
                    class448.field6413.method483(0);
                    class72.field931.method948(false);
                    class505.field7281.method1625(29252);
                    class2.method5(false);
                    class306.method1794("Minimap reset", arg0 + 31080);
                    return;
                }
                if (arg1.startsWith("mc")) {
                    if (!class33.field416.method363()) {
                        class306.method1794("Current toolkit doesn't support multiple cores", arg0 + 31080);
                        return;
                    }
                    int var15 = Integer.parseInt(arg1.substring(3));
                    if (var15 < 1) {
                        var15 = 1;
                    } else if (var15 > 4) {
                        var15 = 4;
                    }
                    class517.field7489 = var15;
                    class33.field416.method336(class517.field7489);
                    class33.field416.method279(0);
                    class306.method1794("Render cores now: " + class517.field7489, -1);
                    return;
                }
                if (arg1.startsWith("cachespace")) {
                    class306.method1794("I(s): " + client.field2572.method2644(arg0 + 31081) + "/" + client.field2572.method2637((byte) -10), arg0 + 31080);
                    class306.method1794("I(m): " + class240.field3085.method2644(0) + "/" + class240.field3085.method2637((byte) -10), -1);
                    class306.method1794("O(s): " + class376.field4949.field921.method2917(arg0 ^ 0x796B) + "/" + class376.field4949.field921.method2922(117), -1);
                    return;
                }
                if (arg1.equalsIgnoreCase("getcamerapos")) {
                    class306.method1794("Pos: " + class23.field336.field2676 + "," + ((class310.field3971 >> 7) + class441.field6317 >> 6) + "," + ((class193.field2500 >> 7) + class320.field4064 >> 6) + "," + ((class310.field3971 >> 7) + class441.field6317 & 0x3F) + "," + ((class193.field2500 >> 7) + class320.field4064 & 0x3F) + " Height: " + (class151.method991(class193.field2500, false, class23.field336.field2676, class310.field3971) - class286.field3665), -1);
                    class306.method1794("Look: " + class23.field336.field2676 + "," + (class445.field6382 + class441.field6317 >> 6) + "," + (class253.field3222 + class320.field4064 >> 6) + "," + (class445.field6382 + class441.field6317 & 0x3F) + "," + (class320.field4064 + class253.field3222 & 0x3F) + " Height: " + (class151.method991(class253.field3222, false, class23.field336.field2676, class445.field6382) - class116.field1571), -1);
                    return;
                }
                if (arg1.equals("showocc")) {
                    class1.field8 = !class1.field8;
                    class384.method2171(-112);
                    class306.method1794("showocc=" + class1.field8, arg0 + 31080);
                    return;
                }
                if (arg1.equals("wallocc")) {
                    class296.field3799 = !class296.field3799;
                    class384.method2171(-79);
                    class306.method1794("forcewallocc=" + class296.field3799, -1);
                    return;
                }
                if (arg1.equals("renderprofile") || arg1.equals("rp")) {
                    class404.field5752 = !class404.field5752;
                    class33.field416.method284(class404.field5752);
                    class319.method1879(-5689);
                    class306.method1794("showprofiling=" + class404.field5752, -1);
                    return;
                }
                if (arg1.equals("performancetest")) {
                    class306.method1794("Java toolkit: " + class99.method744(class219.field2794, 0, -1), -1);
                    class306.method1794("GL toolkit:   " + class99.method744(class219.field2794, 1, -1), -1);
                    class306.method1794("SSE toolkit:  " + class99.method744(class219.field2794, 2, -1), -1);
                    return;
                }
                if (arg1.equals("nonpcs")) {
                    class427.field6069 = !class427.field6069;
                    class306.method1794("nonpcs=" + class427.field6069, -1);
                    return;
                }
                if (arg1.equals("autoworld")) {
                    class455.method2706(118);
                    class306.method1794("auto world selected", -1);
                    return;
                }
                if (arg1.startsWith("switchworld")) {
                    int var16 = Integer.parseInt(arg1.substring(12));
                    class152.method994((byte) -117, var16, class534.method3161(var16, 16).field3237);
                    class306.method1794("switched", -1);
                    return;
                }
                if (arg1.startsWith("pc")) {
                    class282.method1669(class144.field1847, false);
                    class40.field511.method2729(0, false);
                    int var17 = class40.field511.field6631;
                    int var18 = arg1.indexOf(" ", 4);
                    class40.field511.method2769(arg1.substring(3, var18), true);
                    class59.method547(class40.field511, arg1.substring(var18), (byte) -73);
                    class40.field511.method2755(class40.field511.field6631 - var17, (byte) -66);
                    return;
                }
                if (arg1.equals("heap")) {
                    class306.method1794("Heap: " + class105.field1333 + "MB", -1);
                    return;
                }
                if (arg1.equals("savevarcs")) {
                    class144.method966(120);
                    class306.method1794("perm varcs saved", -1);
                    return;
                }
                if (arg1.equals("scramblevarcs")) {
                    for (int var19 = 0; var19 < class372.field4824.length; var19++) {
                        if (class341.field4300[var19]) {
                            class372.field4824[var19] = (int) (Math.random() * 99999.0D);
                            if (Math.random() > 0.5D) {
                                class372.field4824[var19] *= -1;
                            }
                        }
                    }
                    class144.method966(arg0 + 31192);
                    class306.method1794("perm varcs scrambled", -1);
                    return;
                }
                if (arg1.equals("showcolmap")) {
                    class233.field2970 = true;
                    class2.method5(false);
                    class306.method1794("colmap is shown", -1);
                    return;
                }
                if (arg1.equals("hidecolmap")) {
                    class233.field2970 = false;
                    class2.method5(false);
                    class306.method1794("colmap is hidden", arg0 + 31080);
                    return;
                }
                if (arg1.equals("resetcache")) {
                    class124.method876((byte) 107);
                    class306.method1794("Caches reset", -1);
                    return;
                }
                if (arg1.equals("profilecpu")) {
                    class306.method1794(class21.method175(25212) + "ms", arg0 ^ 0x7968);
                    return;
                }
                if (arg1.startsWith("cpuusage")) {
                    int var20 = Integer.parseInt(arg1.substring(9));
                    if (var20 >= 0 && var20 <= 4) {
                        class407.field5817.field3648 = var20;
                    }
                    class306.method1794("cpuusage=" + class407.field5817.field3648, -1);
                    return;
                }
                if (arg1.startsWith("getclientvarpbit")) {
                    int var21 = Integer.parseInt(arg1.substring(17));
                    class306.method1794("varpbit=" + class491.field7160.method377(-1994346078, var21), -1);
                    return;
                }
                if (arg1.startsWith("getclientvarp")) {
                    int var22 = Integer.parseInt(arg1.substring(14));
                    class306.method1794("varp=" + class491.field7160.method376(98, var22), arg0 + 31080);
                    return;
                }
                if (arg1.startsWith("demologin")) {
                    class200.method1260(0, false, (byte) -120);
                    return;
                }
                if (arg1.startsWith("newdemologin")) {
                    class200.method1260(0, true, (byte) -121);
                    return;
                }
                if (arg1.startsWith("directlogin")) {
                    String[] var23 = class335.method1937(-75, arg1.substring(12), ' ');
                    if (var23.length >= 2) {
                        int var24 = var23.length > 2 ? Integer.parseInt(var23[2]) : 0;
                        class36.method261(var23[0], -85, var23[1], var24);
                        return;
                    }
                }
                if (arg1.startsWith("csprofileclear")) {
                    class239.method1442();
                    return;
                }
                if (arg1.startsWith("csprofileoutputc")) {
                    class239.method1439(100, false);
                    return;
                }
                if (arg1.startsWith("csprofileoutputt")) {
                    class239.method1439(10, true);
                    return;
                }
                if (arg1.startsWith("texsize")) {
                    int var25 = Integer.parseInt(arg1.substring(8));
                    class33.field416.method332(var25);
                    return;
                }
                if (arg1.equals("soundstreamcount")) {
                    class306.method1794("Active streams: " + class113.field1506.method2531(), -1);
                    return;
                }
                if (class483.field7059 == 9) {
                    class390.field5237++;
                    class282.method1669(class384.field5057, false);
                    class40.field511.method2729(arg1.length() + 2, false);
                    class40.field511.method2729(arg2 ? 1 : 0, false);
                    class40.field511.method2769(arg1, true);
                }
                if (arg1.startsWith("fps ") && class324.field4107 != class218.field2784) {
                    class131.method916(class521.method3099(arg1.substring(4), 96), (byte) -60);
                    return;
                }
                if (class483.field7059 != 9) {
                    class306.method1794("Unrecogonised commmand when not logged in: " + arg1, arg0 + 31080);
                }
            } catch (Exception var27) {
                class306.method1794("Whoops, something went wrong.", -1);
            }
        }
        if (arg0 != -31081) {
            field2717 = false;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V")
    public static final void method1308(byte arg0) {
        if (arg0 > -102) {
            field2718 = -40;
        }
        if (class33.field416 != null) {
            class170.field2183.method2095(31);
            class194.method1203();
            class2.method5(false);
            class451.method2690(false);
            class47.method462(0);
            class216.method1325(-103);
            if (class521.field7538 != null) {
                class521.field7538.method2034((byte) 105);
            }
            class523.method3109((byte) 55);
            class124.method876((byte) 107);
            class247.method1502(-49);
            class280.method1663(false, 1475);
            class68.method607(-88);
            for (int var1 = 0; var1 < 2048; var1++) {
                class223 var5 = class387.field5107[var1];
                if (var5 != null) {
                    var5.field4939 = null;
                    for (int var6 = 0; var6 < var5.field4937.length; var6++) {
                        var5.field4937[var6] = null;
                    }
                }
            }
            for (int var2 = 0; var2 < class187.field2446.length; var2++) {
                class295 var3 = class187.field2446[var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field4937.length; var4++) {
                        var3.field4937[var4] = null;
                    }
                }
            }
            class293.field3753 = null;
            class208.field2695 = null;
            class33.field416.method275((byte) -126);
            class33.field416 = null;
        }
        field2714++;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Z)V")
    public static void method1309(boolean arg0) {
        field2719 = null;
        if (!arg0) {
            field2717 = false;
        }
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(Z)V")
    public static final void method1310(boolean arg0) {
        if (!arg0) {
            method1310(true);
        }
        field2716++;
        int var1 = class407.field5817.method583(-21537, class377.field4959);
        if (var1 == 0) {
            class387.field5105 = null;
            class128.method905(0, 116);
        } else if (var1 == 1) {
            class296.method1740(0, (byte) 0);
            class128.method905(512, 105);
            if (class379.field4998 != null) {
                class14.method108(-29);
            }
        } else {
            class296.method1740(0, (byte) (class386.field5073 - 4 & 0xFF));
            class128.method905(2, 95);
        }
        class365.field4746 = class276.field3488;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)I")
    public static final int method1311(int arg0, int arg1) {
        return class214.field2756 == null ? 0 : class214.field2756[arg0][arg1] & 0xFF;
    }

    static {
        new class335("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
        field2717 = false;
        field2719 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
    }
}
