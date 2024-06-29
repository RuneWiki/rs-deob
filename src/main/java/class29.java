import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public class class29 extends class516 {

    @OriginalMember(owner = "client!mca", name = "o", descriptor = "Z")
    private boolean field325 = false;

    @OriginalMember(owner = "client!mca", name = "n", descriptor = "Z")
    private boolean field324;

    @OriginalMember(owner = "client!mca", name = "s", descriptor = "[Lwv;")
    private class31[] field329;

    @OriginalMember(owner = "client!mca", name = "w", descriptor = "Lmt;")
    public static class336 field333 = new class336("WTWIP", 3);

    @OriginalMember(owner = "client!mca", name = "l", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!mca", name = "m", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!mca", name = "p", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!mca", name = "q", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!mca", name = "r", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!mca", name = "t", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!mca", name = "u", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!mca", name = "v", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!mca", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field321;

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(ZZ)V", line = 3)
    public final void method195(boolean arg0, boolean arg1) {
        ++field328;
        if (arg1) {
            super.field7353.method2643(class296.field4074, -10304, class132.field1816);
        }
    }

    @OriginalMember(owner = "client!mca", name = "c", descriptor = "(Z)V", line = 15)
    public static void method196(boolean arg0) {
        field321 = null;
        if (!arg0) {
            method198(38, false, (String) null, false);
        }
        field333 = null;
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(Z)V", line = 26)
    public final void method197(boolean arg0) {
        if (arg0) {
            field333 = null;
        }
        if (this.field325) {
            super.field7353.method2646(1, 119);
            super.field7353.method2632((class563) null, 0);
            super.field7353.method2651((byte) -106, class209.field3093);
            super.field7353.method2664(-103);
            if (this.field324) {
                super.field7353.method2643(class132.field1816, -10304, class132.field1816);
                super.field7353.method2598(class453.field6405, 0, (byte) 59);
                super.field7353.method2655(0, -95, class453.field6405);
            } else {
                super.field7353.method2643(class132.field1816, -10304, class132.field1816);
                super.field7353.method2598(class453.field6405, 0, (byte) 59);
                super.field7353.method2646(2, 113);
                super.field7353.method2643(class132.field1816, -10304, class132.field1816);
                super.field7353.method2598(class453.field6405, 0, (byte) 59);
                super.field7353.method2598(class645.field9388, 1, (byte) 59);
                super.field7353.method2655(0, -111, class453.field6405);
                super.field7353.method2632((class563) null, 0);
            }
            super.field7353.method2646(0, 120);
            this.field325 = false;
        } else {
            super.field7353.method2655(0, -97, class453.field6405);
        }
        ++field323;
        super.field7353.method2643(class132.field1816, -10304, class132.field1816);
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(IZLjava/lang/String;Z)V", line = 67)
    public static final void method198(int arg0, boolean arg1, String arg2, boolean arg3) {
        ++field331;
        if (arg0 == 13699) {
            if (class577.field8514 != class186.field2781 || class163.field2578 >= 2) {
                if (arg2.equalsIgnoreCase("errortest")) {
                    throw new RuntimeException();
                }
                if (arg2.equals("nativememerror")) {
                    throw new OutOfMemoryError("native(MPR");
                }
                try {
                    if (arg2.equalsIgnoreCase("fpson")) {
                        class188.field2800 = true;
                        class393.method2337("fps debug enabled", 1);
                        return;
                    }
                    if (arg2.equalsIgnoreCase("fpsoff")) {
                        class188.field2800 = false;
                        class393.method2337("fps debug disabled", arg0 ^ 13698);
                        return;
                    }
                    if (arg2.equals("systemmem")) {
                        try {
                            class393.method2337("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb", 1);
                            return;
                        } catch (Throwable var31) {
                            return;
                        }
                    }
                    if (arg2.equalsIgnoreCase("cls")) {
                        class182.field2744 = 0;
                        class33.field399 = 0;
                        return;
                    }
                    if (arg2.equalsIgnoreCase("cleartext")) {
                        class626.field9219.method2234((byte) -24);
                        class393.method2337("Text coords cleared", 1);
                        return;
                    }
                    if (arg2.equalsIgnoreCase("gc")) {
                        class487.method2918((byte) -98);
                        for (int var4 = 0; var4 < 10; ++var4) {
                            System.gc();
                        }
                        Runtime var5 = Runtime.getRuntime();
                        int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
                        class393.method2337("mem=" + var6 + "k", 1);
                        return;
                    }
                    if (arg2.equalsIgnoreCase("compact")) {
                        class487.method2918((byte) -120);
                        for (int var7 = 0; var7 < 10; ++var7) {
                            System.gc();
                        }
                        Runtime var8 = Runtime.getRuntime();
                        int var9 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
                        class393.method2337("Memory before cleanup=" + var9 + "k", 1);
                        class324.method1946(19349);
                        class487.method2918((byte) 40);
                        for (int var10 = 0; ~var10 > -11; ++var10) {
                            System.gc();
                        }
                        int var11 = (int) ((var8.totalMemory() + -var8.freeMemory()) / 1024L);
                        class393.method2337("Memory after cleanup=" + var11 + "k", 1);
                        return;
                    }
                    if (arg2.equalsIgnoreCase("unloadnatives")) {
                        class393.method2337(class405.method2385((byte) -98) ? "Libraries unloaded" : "Library unloading failed!", arg0 + -13698);
                        return;
                    }
                    if (arg2.equalsIgnoreCase("pcachesize")) {
                        class393.method2337("Number of player models in cache:" + class479.method2883(-51), 1);
                        return;
                    }
                    if (arg2.equalsIgnoreCase("clientdrop")) {
                        class393.method2337("Dropped client connection", 1);
                        if (~class472.field6670 != -10) {
                            if (~class472.field6670 == -11) {
                                class152.field2301 = true;
                                return;
                            }
                        } else {
                            class641.method3704(12);
                        }
                        return;
                    }
                    if (arg2.equalsIgnoreCase("clientjs5drop")) {
                        class177.field2706.method2469((byte) 53);
                        class393.method2337("Dropped client js5 net queue", 1);
                        return;
                    }
                    if (arg2.equalsIgnoreCase("serverjs5drop")) {
                        class177.field2706.method2471((byte) 122);
                        class393.method2337("Dropped server js5 net queue", 1);
                        return;
                    }
                    if (arg2.equalsIgnoreCase("breakcon")) {
                        class442.field5896.method2022(arg0 ^ 9739);
                        class296.field4075.method1832((byte) -121);
                        class177.field2706.method2461(-12492);
                        class393.method2337("Breaking new connections for 5 seconds", 1);
                        return;
                    }
                    if (arg2.equalsIgnoreCase("rebuild")) {
                        class554.method3346((byte) 5);
                        class618.method3620(-126);
                        class393.method2337("Rebuilding map", 1);
                        return;
                    }
                    if (arg2.equalsIgnoreCase("wm1")) {
                        class622.method3638(arg0 + -13703, false, 1, -1, -1);
                        if (~class609.method3580(true) == -2) {
                            class393.method2337("wm1 succeeded", 1);
                            return;
                        }
                        class393.method2337("wm1 failed", arg0 + -13698);
                        return;
                    }
                    if (arg2.equalsIgnoreCase("wm2")) {
                        class622.method3638(-4, false, 2, -1, -1);
                        if (class609.method3580(true) != 2) {
                            class393.method2337("wm2 failed", 1);
                            return;
                        }
                        class393.method2337("wm2 succeeded", 1);
                        return;
                    }
                    if (arg2.equalsIgnoreCase("wm3")) {
                        class622.method3638(-4, false, 3, 1024, 768);
                        if (~class609.method3580(true) == -4) {
                            class393.method2337("wm3 succeeded", 1);
                            return;
                        }
                        class393.method2337("wm3 failed", 1);
                        return;
                    }
                    if (arg2.equalsIgnoreCase("tk0")) {
                        class430.method2521(0, -2);
                        if (~class526.field7533 == -1) {
                            class393.method2337("Entered tk0", arg0 ^ 13698);
                            class56.field668.field6872 = 0;
                            class56.field668.method1480(class442.field5896, (byte) -69);
                            class508.field7214 = false;
                            return;
                        }
                        class393.method2337("Failed to enter tk0", 1);
                        return;
                    }
                    if (arg2.equalsIgnoreCase("tk1")) {
                        class430.method2521(1, -2);
                        if (class526.field7533 == 1) {
                            class393.method2337("Entered tk1", 1);
                            class56.field668.field6872 = 1;
                            class56.field668.method1480(class442.field5896, (byte) -69);
                            class508.field7214 = false;
                            return;
                        }
                        class393.method2337("Failed to enter tk1", arg0 + -13698);
                        return;
                    }
                    if (arg2.equalsIgnoreCase("tk2")) {
                        class430.method2521(2, -2);
                        if (class526.field7533 != 2) {
                            class393.method2337("Failed to enter tk2", 1);
                            return;
                        }
                        class393.method2337("Entered tk2", 1);
                        class56.field668.field6872 = 2;
                        class56.field668.method1480(class442.field5896, (byte) -69);
                        class508.field7214 = false;
                        return;
                    }
                    if (arg2.equalsIgnoreCase("tk3")) {
                        class430.method2521(3, -2);
                        if (~class526.field7533 == -4) {
                            class393.method2337("Entered tk3", 1);
                            class56.field668.field6872 = 3;
                            class56.field668.method1480(class442.field5896, (byte) -69);
                            class508.field7214 = false;
                            return;
                        }
                        class393.method2337("Failed to enter tk3", 1);
                        return;
                    }
                    if (arg2.equalsIgnoreCase("tk4")) {
                        class430.method2521(4, -2);
                        if (~class526.field7533 != -5) {
                            class393.method2337("Failed to enter tk4", 1);
                            return;
                        }
                        class393.method2337("Entered tk4", 1);
                        class56.field668.field6872 = 4;
                        class56.field668.method1480(class442.field5896, (byte) -69);
                        class508.field7214 = false;
                        return;
                    }
                    if (arg2.equalsIgnoreCase("tk5")) {
                        class430.method2521(5, arg0 + -13701);
                        if (class526.field7533 != 5) {
                            class393.method2337("Failed to enter tk5", 1);
                            return;
                        }
                        class393.method2337("Entered tk5", 1);
                        class56.field668.field6872 = 5;
                        class56.field668.method1480(class442.field5896, (byte) -69);
                        class508.field7214 = false;
                        return;
                    }
                    if (arg2.equalsIgnoreCase("ot")) {
                        class56.field668.field6845 = !class56.field668.field6845;
                        class56.field668.method1480(class442.field5896, (byte) -69);
                        class508.field7214 = false;
                        class554.method3346((byte) 5);
                        class393.method2337("ot=" + class56.field668.field6845, 1);
                        return;
                    }
                    if (arg2.equalsIgnoreCase("gb")) {
                        class56.field668.field6853 = !class56.field668.field6853;
                        class56.field668.method1480(class442.field5896, (byte) -69);
                        class508.field7214 = false;
                        class554.method3346((byte) 5);
                        class393.method2337("gb=" + class56.field668.field6853, arg0 + -13698);
                        return;
                    }
                    if (arg2.startsWith("shadows")) {
                        if (~arg2.length() > -9) {
                            class393.method2337("Invalid shadows value", arg0 ^ 13698);
                            return;
                        }
                        String var12 = arg2.substring(8);
                        int var13 = !class631.method3673(var12, 10) ? -1 : class197.method1327(var12, arg0 ^ -13771);
                        if (~var13 <= -1 && var13 <= 2) {
                            class56.field668.method2894(var13, class526.field7533, 0);
                            class56.field668.method1480(class442.field5896, (byte) -69);
                            class508.field7214 = false;
                            class554.method3346((byte) 5);
                            class393.method2337("shadows=" + var13, arg0 + -13698);
                            return;
                        }
                        class393.method2337("Invalid shadows value", arg0 ^ 13698);
                        return;
                    }
                    if (arg2.startsWith("textures")) {
                        class56.field668.field6847 = !class56.field668.field6847;
                        class56.field668.method1480(class442.field5896, (byte) -69);
                        class508.field7214 = false;
                        class226.method1453((byte) 0);
                        class554.method3346((byte) 5);
                        class393.method2337("textures=" + class56.field668.field6847, 1);
                        return;
                    }
                    if (arg2.startsWith("lighting")) {
                        class56.field668.method2893(arg0 ^ 13699, class526.field7533, !class56.field668.method2895(class526.field7533, 0));
                        class56.field668.method1480(class442.field5896, (byte) -69);
                        class508.field7214 = false;
                        class232.method1489(8);
                        class226.method1453((byte) 0);
                        class554.method3346((byte) 5);
                        class393.method2337("lighting=" + class56.field668.method2895(class526.field7533, arg0 + -13699), 1);
                        return;
                    }
                    if (arg2.startsWith("setba")) {
                        if (arg2.length() < 6) {
                            class393.method2337("Invalid buildarea value", 1);
                            return;
                        }
                        int var14 = class197.method1327(arg2.substring(6), arg0 ^ -13747);
                        if (~var14 <= -1 && class647.method3731((byte) 77, class467.field6579) >= var14) {
                            class56.field668.field6859 = var14;
                            class56.field668.method1480(class442.field5896, (byte) -69);
                            class508.field7214 = false;
                            class393.method2337("maxbuildarea=" + class56.field668.field6859, 1);
                            return;
                        }
                        class393.method2337("Invalid buildarea value", 1);
                        return;
                    }
                    if (arg2.startsWith("setparticles")) {
                        if (arg2.length() < 13) {
                            class393.method2337("Invalid particles value", 1);
                            return;
                        }
                        class480.method2892(class197.method1327(arg2.substring(13), -54), 0);
                        class56.field668.method1480(class442.field5896, (byte) -69);
                        class508.field7214 = false;
                        class393.method2337("particles=" + class86.method644((byte) 68), 1);
                        return;
                    }
                    if (arg2.startsWith("rect_debug")) {
                        if (arg2.length() < 10) {
                            class393.method2337("Invalid rect_debug value", 1);
                            return;
                        }
                        class527.field7535 = class197.method1327(arg2.substring(10).trim(), -54);
                        class393.method2337("rect_debug=" + class527.field7535, 1);
                        return;
                    }
                    if (arg2.equalsIgnoreCase("qa_op_test")) {
                        class112.field1592 = true;
                        class393.method2337("qa_op_test=" + class112.field1592, 1);
                        return;
                    }
                    if (arg2.equalsIgnoreCase("clipcomponents")) {
                        class22.field222 = !class22.field222;
                        class393.method2337("clipcomponents=" + class22.field222, 1);
                        return;
                    }
                    if (arg2.startsWith("bloom")) {
                        boolean var15 = class99.field1445.method423();
                        if (!class631.method3674((byte) -27, !var15)) {
                            class393.method2337("Failed to enable bloom", 1);
                            return;
                        }
                        if (var15) {
                            class393.method2337("Bloom disabled", 1);
                            return;
                        }
                        class393.method2337("Bloom enabled", 1);
                        return;
                    }
                    if (arg2.equalsIgnoreCase("tween")) {
                        if (class638.field9309) {
                            class638.field9309 = false;
                            class393.method2337("Forced tweening disabled.", 1);
                            return;
                        }
                        class638.field9309 = true;
                        class393.method2337("Forced tweening ENABLED!", 1);
                        return;
                    }
                    if (arg2.equalsIgnoreCase("shiftclick")) {
                        if (class335.field4641) {
                            class393.method2337("Shift-click disabled.", 1);
                            class335.field4641 = false;
                            return;
                        }
                        class393.method2337("Shift-click ENABLED!", arg0 ^ 13698);
                        class335.field4641 = true;
                        return;
                    }
                    if (arg2.equalsIgnoreCase("getcgcoord")) {
                        class393.method2337("x:" + (class541.field8119.field8496 >> 7) + " z:" + (class541.field8119.field8500 >> 7), 1);
                        return;
                    }
                    if (arg2.equalsIgnoreCase("getheight")) {
                        class393.method2337("Height: " + class165.field2609[class541.field8119.field8501].method1239(class541.field8119.field8496 >> 7, class541.field8119.field8500 >> 7), 1);
                        return;
                    }
                    if (arg2.equalsIgnoreCase("resetminimap")) {
                        class585.field8595.method1972(22156);
                        class585.field8595.method1969(false);
                        class599.field8839.method546(64);
                        class440.field5876.method3063(20725);
                        class618.method3620(-122);
                        class393.method2337("Minimap reset", arg0 ^ 13698);
                        return;
                    }
                    if (arg2.startsWith("mc")) {
                        if (!class99.field1445.method434()) {
                            class393.method2337("Current toolkit doesn't support multiple cores", 1);
                            return;
                        }
                        int var16 = Integer.parseInt(arg2.substring(3));
                        if (~var16 <= -2) {
                            if (var16 > 4) {
                                var16 = 4;
                            }
                        } else {
                            var16 = 1;
                        }
                        class238.field3433 = var16;
                        class99.field1445.method502(class238.field3433);
                        class99.field1445.method459(0);
                        class393.method2337("Render cores now: " + class238.field3433, 1);
                        return;
                    }
                    if (arg2.startsWith("cachespace")) {
                        class393.method2337("I(s): " + class317.field4370.method847(arg0 + -13699) + "/" + class317.field4370.method840(28024), 1);
                        class393.method2337("I(m): " + class496.field7054.method847(0) + "/" + class496.field7054.method840(28024), arg0 ^ 13698);
                        class393.method2337("O(s): " + class150.field2242.field9097.method1726((byte) -34) + "/" + class150.field2242.field9097.method1725(-99), 1);
                        return;
                    }
                    if (arg2.equalsIgnoreCase("getcamerapos")) {
                        class393.method2337("Pos: " + class541.field8119.field8501 + "," + ((class125.field1760 >> 7) + class473.field6687 >> 6) + "," + ((class214.field3161 >> 7) + class38.field463 >> 6) + "," + (63 & (class125.field1760 >> 7) + class473.field6687) + "," + (63 & (class214.field3161 >> 7) + class38.field463) + " Height: " + (class132.method919(class541.field8119.field8501, class214.field3161, class125.field1760, (byte) -82) - class118.field1665), 1);
                        class393.method2337("Look: " + class541.field8119.field8501 + "," + (class469.field6617 - -class473.field6687 >> 6) + "," + (class606.field9003 + class38.field463 >> 6) + "," + (63 & class473.field6687 + class469.field6617) + "," + (63 & class606.field9003 + class38.field463) + " Height: " + (class132.method919(class541.field8119.field8501, class606.field9003, class469.field6617, (byte) -82) - class83.field1194), arg0 ^ 13698);
                        return;
                    }
                    if (arg2.equals("showocc")) {
                        class427.field5746 = !class427.field5746;
                        class554.method3346((byte) 5);
                        class393.method2337("showocc=" + class427.field5746, arg0 + -13698);
                        return;
                    }
                    if (arg2.equals("wallocc")) {
                        class236.field3415 = !class236.field3415;
                        class554.method3346((byte) 5);
                        class393.method2337("forcewallocc=" + class236.field3415, arg0 ^ 13698);
                        return;
                    }
                    if (arg2.equals("renderprofile") || arg2.equals("rp")) {
                        class310.field4281 = !class310.field4281;
                        class99.field1445.method449(class310.field4281);
                        class285.method1773((byte) 116);
                        class393.method2337("showprofiling=" + class310.field4281, 1);
                        return;
                    }
                    if (arg2.startsWith("performancetest")) {
                        int var17 = -1;
                        int var18 = 1000;
                        if (arg2.length() > 15) {
                            String[] var19 = class587.method3490(' ', arg0 ^ -13750, arg2);
                            try {
                                if (~var19.length < -2) {
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
                            class393.method2337("Performance: " + class283.method1762(204, class526.field7533, var18), 1);
                            return;
                        }
                        class393.method2337("Java toolkit: " + class283.method1762(204, 0, var18), arg0 + -13698);
                        class393.method2337("SSE toolkit:  " + class283.method1762(arg0 + -13495, 2, var18), 1);
                        class393.method2337("D3D toolkit:  " + class283.method1762(204, 3, var18), 1);
                        class393.method2337("GL toolkit:   " + class283.method1762(204, 1, var18), 1);
                        return;
                    }
                    if (arg2.equals("renderer")) {
                        class493 var20 = class99.field1445.method480();
                        class393.method2337("Vendor: " + var20.field7007, 1);
                        class393.method2337("Name: " + var20.field7006, 1);
                        class393.method2337("Version: " + var20.field7010, 1);
                        class393.method2337("Device: " + var20.field7005, 1);
                        class393.method2337("Driver Version: " + var20.field7008, arg0 ^ 13698);
                        return;
                    }
                    if (arg2.equals("nonpcs")) {
                        class22.field207 = !class22.field207;
                        class393.method2337("nonpcs=" + class22.field207, 1);
                        return;
                    }
                    if (arg2.equals("autoworld")) {
                        class278.method1743(11);
                        class393.method2337("auto world selected", 1);
                        return;
                    }
                    if (arg2.startsWith("switchworld")) {
                        int var21 = Integer.parseInt(arg2.substring(12));
                        class72.method585(77, class8.method37(var21, 126).field2788, var21);
                        class393.method2337("switched", 1);
                        return;
                    }
                    if (arg2.equals("getworld")) {
                        class393.method2337("w: " + class286.field3993.field5709, 1);
                        return;
                    }
                    if (arg2.startsWith("pc")) {
                        class402.method2367(class296.field4067, (byte) 84);
                        class112.field1589.method1049(arg0 ^ -13700, 0);
                        int var22 = class112.field1589.field2177;
                        int var23 = arg2.indexOf(" ", 4);
                        class112.field1589.method1050((byte) 32, arg2.substring(3, var23));
                        class542.method3292(class112.field1589, 0, arg2.substring(var23));
                        class112.field1589.method1066(class112.field1589.field2177 - var22, arg0 ^ 13726);
                        return;
                    }
                    if (arg2.equals("heap")) {
                        class393.method2337("Heap: " + class467.field6579 + "MB", 1);
                        return;
                    }
                    if (arg2.equals("savevarcs")) {
                        class76.method589(1);
                        class393.method2337("perm varcs saved", arg0 ^ 13698);
                        return;
                    }
                    if (arg2.equals("scramblevarcs")) {
                        for (int var24 = 0; ~class624.field9201.length < ~var24; ++var24) {
                            if (class428.field5753[var24]) {
                                class624.field9201[var24] = (int) (99999.0D * Math.random());
                                if (Math.random() > 0.5D) {
                                    class624.field9201[var24] *= -1;
                                }
                            }
                        }
                        class76.method589(1);
                        class393.method2337("perm varcs scrambled", 1);
                        return;
                    }
                    if (arg2.equals("showcolmap")) {
                        class134.field1825 = true;
                        class618.method3620(arg0 ^ -13817);
                        class393.method2337("colmap is shown", 1);
                        return;
                    }
                    if (arg2.equals("hidecolmap")) {
                        class134.field1825 = false;
                        class618.method3620(-126);
                        class393.method2337("colmap is hidden", 1);
                        return;
                    }
                    if (arg2.equals("resetcache")) {
                        class459.method2781((byte) 86);
                        class393.method2337("Caches reset", arg0 ^ 13698);
                        return;
                    }
                    if (arg2.equals("profilecpu")) {
                        class393.method2337(class457.method2771(true) + "ms", arg0 ^ 13698);
                        return;
                    }
                    if (arg2.startsWith("cpuusage")) {
                        int var25 = Integer.parseInt(arg2.substring(9));
                        if (~var25 <= -1 && ~var25 >= -5) {
                            class56.field668.field6855 = var25;
                        }
                        class393.method2337("cpuusage=" + class56.field668.field6855, 1);
                        return;
                    }
                    if (arg2.startsWith("getclientvarpbit")) {
                        int var26 = Integer.parseInt(arg2.substring(17));
                        class393.method2337("varpbit=" + class556.field8280.method141((byte) -110, var26), 1);
                        return;
                    }
                    if (arg2.startsWith("getclientvarp")) {
                        int var27 = Integer.parseInt(arg2.substring(14));
                        class393.method2337("varp=" + class556.field8280.method140((byte) 113, var27), 1);
                        return;
                    }
                    if (arg2.startsWith("demologin")) {
                        class532.method3210(0, false, -116);
                        return;
                    }
                    if (arg2.startsWith("newdemologin")) {
                        class532.method3210(0, true, -125);
                        return;
                    }
                    if (arg2.startsWith("directlogin")) {
                        String[] var28 = class587.method3490(' ', 106, arg2.substring(12));
                        if (var28.length >= 2) {
                            int var29 = var28.length > 2 ? Integer.parseInt(var28[2]) : 0;
                            class246.method1560(var28[0], (byte) -16, var29, var28[1]);
                            return;
                        }
                    }
                    if (arg2.startsWith("csprofileclear")) {
                        class98.method745();
                        return;
                    }
                    if (arg2.startsWith("csprofileoutputc")) {
                        class98.method751(100, false);
                        return;
                    }
                    if (arg2.startsWith("csprofileoutputt")) {
                        class98.method751(10, true);
                        return;
                    }
                    if (arg2.startsWith("texsize")) {
                        int var30 = Integer.parseInt(arg2.substring(8));
                        class99.field1445.method419(var30);
                        return;
                    }
                    if (arg2.equals("soundstreamcount")) {
                        class393.method2337("Active streams: " + class155.field2316.method259(), 1);
                        return;
                    }
                    if (arg2.equals("autosetup")) {
                        class56.field668.method1476((byte) 78);
                        class393.method2337("Complete. Toolkit now: " + class526.field7533, arg0 ^ 13698);
                        return;
                    }
                    if (arg2.equals("errormessage")) {
                        class393.method2337(class460.field6511.method1613((byte) 126), 1);
                        return;
                    }
                    if (class472.field6670 == 9) {
                        ++class111.field1586;
                        class402.method2367(class122.field1718, (byte) 67);
                        class112.field1589.method1049(-1, 3 + arg2.length());
                        class112.field1589.method1049(arg0 ^ -13700, arg3 ? 1 : 0);
                        class112.field1589.method1049(-1, arg1 ? 1 : 0);
                        class112.field1589.method1050((byte) 32, arg2);
                    }
                    if (arg2.startsWith("fps ") && class577.field8514 != class186.field2781) {
                        class510.method3037((byte) 95, class197.method1327(arg2.substring(4), -106));
                        return;
                    }
                    if (~class472.field6670 != -10) {
                        class393.method2337("Unrecogonised commmand when not logged in: " + arg2, arg0 ^ 13698);
                        return;
                    }
                } catch (Exception var34) {
                    class393.method2337("Whoops, something went wrong.", arg0 + -13698);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(BZ)V", line = 972)
    public final void method199(byte arg0, boolean arg1) {
        if (this.field329 != null && arg1) {
            super.field7353.method2646(1, 110);
            super.field7353.method2651((byte) -106, class502.field7115);
            class57 var3 = super.field7353.method2653((byte) -110);
            var3.method355(1024);
            super.field7353.method2623(-112, class464.field6525);
            if (!this.field324) {
                super.field7353.method2643(class132.field1816, -10304, class296.field4074);
                super.field7353.method2598(class645.field9388, 0, (byte) 59);
                super.field7353.method2646(2, 105);
                super.field7353.method2643(class296.field4074, -10304, class533.field7939);
                super.field7353.method2598(class645.field9388, 0, (byte) 59);
                super.field7353.method2612(true, 1, (byte) 64, false, class645.field9388);
                super.field7353.method2655(0, -49, class325.field4478);
                super.field7353.method2632(super.field7353.field6179, 0);
            } else {
                super.field7353.method2643(class296.field4074, -10304, class533.field7939);
                super.field7353.method2612(true, 0, (byte) 64, false, class453.field6405);
                super.field7353.method2655(0, -62, class325.field4478);
            }
            super.field7353.method2646(0, 107);
            this.field325 = true;
        } else {
            super.field7353.method2655(0, -49, class325.field4478);
        }
        int var4 = -46 % ((arg0 - 63) / 38);
        ++field327;
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(III)V", line = 1016)
    public final void method200(int arg0, int arg1, int arg2) {
        int var4 = -35 / ((arg0 - -41) / 57);
        ++field326;
        if (this.field325) {
            super.field7353.method2646(1, 110);
            super.field7353.method2632(this.field329[arg1 + -1], 0);
            super.field7353.method2646(0, 125);
        }
    }

    @OriginalMember(owner = "client!mca", name = "<init>", descriptor = "(Lcb;)V", line = 1061)
    public class29(class444 arg0) {
        super(arg0);
        if (arg0.field6159) {
            this.field324 = arg0.field6128 < 3;
            int var2 = this.field324 ? 48 : 127;
            int[][] var3 = new int[6][4096];
            int[][] var4 = new int[6][4096];
            int[][] var5 = new int[6][4096];
            int var6 = 0;
            for (int var7 = 0; var7 < 64; ++var7) {
                for (int var8 = 0; var8 < 64; ++var8) {
                    float var9 = (float) var7 * 2.0F / 64.0F - 1.0F;
                    float var10 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var9 * var9 + var10 * var10 + 1.0F)));
                    float var12 = var10 * var11;
                    float var13 = var9 * var11;
                    for (int var14 = 0; var14 < 6; ++var14) {
                        float var15;
                        if (~var14 == -1) {
                            var15 = -var12;
                        } else if (~var14 == -2) {
                            var15 = var12;
                        } else if (~var14 != -3) {
                            if (~var14 != -4) {
                                if (var14 != 4) {
                                    var15 = -var11;
                                } else {
                                    var15 = var11;
                                }
                            } else {
                                var15 = -var13;
                            }
                        } else {
                            var15 = var13;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (var15 > 0.0F) {
                            var16 = (int) ((double) var2 * Math.pow((double) var15, 96.0D));
                            var17 = (int) ((double) var2 * Math.pow((double) var15, 36.0D));
                            var18 = (int) (Math.pow((double) var15, 12.0D) * (double) var2);
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
            this.field329 = new class31[3];
            this.field329[0] = super.field7353.method2690(-1, 64, false, var4);
            this.field329[1] = super.field7353.method2690(-1, 64, false, var5);
            this.field329[2] = super.field7353.method2690(-1, 64, false, var3);
        }
    }

    @OriginalMember(owner = "client!mca", name = "c", descriptor = "(B)Z", line = 1036)
    public final boolean method201(byte arg0) {
        ++field330;
        return arg0 <= -60;
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(Lpb;II)V", line = 1048)
    public final void method202(class563 arg0, int arg1, int arg2) {
        super.field7353.method2632(arg0, 0);
        ++field322;
        if (arg2 == -1) {
            super.field7353.method2698(arg1, 1);
        }
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(ZIILuh;I)V", line = 1175)
    public static final void method203(boolean arg0, int arg1, int arg2, class145 arg3, int arg4) {
        ++field332;
        class14 var5 = (class14) class1.field5.method124((byte) 42);
        if (!arg0) {
            while (var5 != null) {
                if (var5.field129 == arg1 && arg4 << 7 == var5.field123 && ~(arg2 << 7) == ~var5.field130 && ~var5.field124.field2049 == ~arg3.field2049) {
                    if (var5.field139 != null) {
                        class155.field2316.method258(var5.field139);
                        var5.field139 = null;
                    }
                    if (var5.field128 != null) {
                        class155.field2316.method258(var5.field128);
                        var5.field128 = null;
                    }
                    var5.method2457(-8422);
                    return;
                }
                var5 = (class14) class1.field5.method120(65);
            }
        }
    }
}
