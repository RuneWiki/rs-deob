import jagex3.jagmisc.jagmisc;
import java.awt.Canvas;
import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class78 extends class375 {

    @OriginalMember(owner = "client!tt", name = "x", descriptor = "Lmf;")
    public static class382 field1342 = new class382(8);

    @OriginalMember(owner = "client!tt", name = "t", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!tt", name = "u", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!tt", name = "w", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!tt", name = "y", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!tt", name = "z", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!tt", name = "A", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!tt", name = "B", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!tt", name = "E", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!tt", name = "F", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!tt", name = "D", descriptor = "Lwea;")
    public static class141 field1347;

    @OriginalMember(owner = "client!tt", name = "v", descriptor = "Lkea;")
    private class213 field1340;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZILjava/lang/String;Z)V", line = 3)
    public static final void method715(boolean arg0, int arg1, String arg2, boolean arg3) {
        field1348++;
        try {
            label603: {
                if (!arg2.equalsIgnoreCase("commands") && !arg2.equalsIgnoreCase("help")) {
                    if (arg2.equalsIgnoreCase("cls")) {
                        class466.field6706 = 0;
                        class619.field8629 = 0;
                        return;
                    }
                    if (arg2.equalsIgnoreCase("displayfps")) {
                        class122.field1830 = !class122.field1830;
                        if (!class122.field1830) {
                            class262.method1723(true, "FPS off");
                            return;
                        }
                        class262.method1723(true, "FPS on");
                        return;
                    }
                    if (arg2.equals("renderer")) {
                        class463 var4 = class282.field4228.method140();
                        class262.method1723(true, "Vendor: " + var4.field6669);
                        class262.method1723(true, "Name: " + var4.field6665);
                        class262.method1723(true, "Version: " + var4.field6667);
                        class262.method1723(true, "Device: " + var4.field6666);
                        class262.method1723(true, "Driver Version: " + var4.field6668);
                        return;
                    }
                    if (!arg2.equals("heap")) {
                        break label603;
                    }
                    class262.method1723(true, "Heap: " + class266.field4022 + "MB");
                    return;
                }
                class262.method1723(true, "commands - This command");
                class262.method1723(true, "cls - Clear console");
                class262.method1723(true, "displayfps - Toggle FPS and other information");
                class262.method1723(true, "renderer - Print graphics renderer information");
                class262.method1723(true, "heap - Print java memory information");
                return;
            }
        } catch (Exception var36) {
            class262.method1723(true, class274.field4118.method1804(7175, class512.field7203));
            return;
        }
        if (arg1 < 117) {
            return;
        }
        if (class379.field5372 != class296.field4357 || class558.field7877 >= 2) {
            if (arg2.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg2.equals("nativememerror")) {
                throw new OutOfMemoryError("native(MPR");
            }
            try {
                if (arg2.equalsIgnoreCase("printfps")) {
                    class262.method1723(true, "FPS: " + class697.field9864);
                    return;
                }
                if (arg2.equalsIgnoreCase("occlude")) {
                    class202.field2847 = !class202.field2847;
                    if (!class202.field2847) {
                        class262.method1723(true, "Occlsion now off!");
                        return;
                    }
                    class262.method1723(true, "Occlsion now on!");
                    return;
                }
                if (arg2.equalsIgnoreCase("fpson")) {
                    class122.field1830 = true;
                    class262.method1723(true, "fps debug enabled");
                    return;
                }
                if (arg2.equalsIgnoreCase("fpsoff")) {
                    class122.field1830 = false;
                    class262.method1723(true, "fps debug disabled");
                    return;
                }
                if (arg2.equals("systemmem")) {
                    try {
                        class262.method1723(true, "System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
                        return;
                    } catch (Throwable var32) {
                        return;
                    }
                }
                if (arg2.equalsIgnoreCase("cleartext")) {
                    class208.field2926.method2409(94);
                    class262.method1723(true, "Text coords cleared");
                    return;
                }
                if (arg2.equalsIgnoreCase("gc")) {
                    class619.method3444(100);
                    for (int var5 = 0; var5 < 10; var5++) {
                        System.gc();
                    }
                    Runtime var6 = Runtime.getRuntime();
                    int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                    class262.method1723(true, "mem=" + var7 + "k");
                    return;
                }
                if (arg2.equalsIgnoreCase("compact")) {
                    class619.method3444(105);
                    for (int var8 = 0; var8 < 10; var8++) {
                        System.gc();
                    }
                    Runtime var9 = Runtime.getRuntime();
                    int var10 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                    class262.method1723(true, "Memory before cleanup=" + var10 + "k");
                    class132.method976((byte) -57);
                    class619.method3444(15);
                    for (int var11 = 0; var11 < 10; var11++) {
                        System.gc();
                    }
                    int var12 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                    class262.method1723(true, "Memory after cleanup=" + var12 + "k");
                    return;
                }
                if (arg2.equalsIgnoreCase("unloadnatives")) {
                    class262.method1723(true, class466.method2758(108) ? "Libraries unloaded" : "Library unloading failed!");
                    return;
                }
                if (arg2.equalsIgnoreCase("clientdrop")) {
                    class262.method1723(true, "Dropped client connection");
                    if (class420.field6113 == 10) {
                        class421.method2529((byte) 80);
                    } else if (class420.field6113 == 11) {
                        class48.field839 = true;
                        return;
                    }
                    return;
                }
                if (arg2.equalsIgnoreCase("rotateconnectmethods")) {
                    class228.field3284.method2103(-1);
                    class262.method1723(true, "Rotated connection methods");
                    return;
                }
                if (arg2.equalsIgnoreCase("clientjs5drop")) {
                    class622.field8693.method3430(0);
                    class262.method1723(true, "Dropped client js5 net queue");
                    return;
                }
                if (arg2.equalsIgnoreCase("serverjs5drop")) {
                    class622.field8693.method3436((byte) -63);
                    class262.method1723(true, "Dropped server js5 net queue");
                    return;
                }
                if (arg2.equalsIgnoreCase("breakcon")) {
                    class368.field5267.method31((byte) 51);
                    class274.field4181.method2232(false);
                    class622.field8693.method3433((byte) 76);
                    class262.method1723(true, "Breaking new connections for 5 seconds");
                    return;
                }
                if (arg2.equalsIgnoreCase("rebuild")) {
                    class705.method3923(4);
                    class575.method3262(-1);
                    class262.method1723(true, "Rebuilding map");
                    return;
                }
                if (arg2.equalsIgnoreCase("rebuildprofile")) {
                    class573.field8061 = class490.method2840(true);
                    class621.field8658 = true;
                    class705.method3923(4);
                    class575.method3262(-1);
                    class262.method1723(true, "Rebuilding map (with profiling)");
                    return;
                }
                if (arg2.equalsIgnoreCase("wm1")) {
                    class134.method983(1, -1, false, -1, false);
                    if (class488.method2836(3) != 1) {
                        class262.method1723(true, "wm1 failed");
                        return;
                    }
                    class262.method1723(true, "wm1 succeeded");
                    return;
                }
                if (arg2.equalsIgnoreCase("wm2")) {
                    class134.method983(2, -1, false, -1, false);
                    if (class488.method2836(3) != 2) {
                        class262.method1723(true, "wm2 failed");
                        return;
                    }
                    class262.method1723(true, "wm2 succeeded");
                    return;
                }
                if (arg2.equalsIgnoreCase("wm3")) {
                    class134.method983(3, 1024, false, 768, false);
                    if (class488.method2836(3) != 3) {
                        class262.method1723(true, "wm3 failed");
                        return;
                    }
                    class262.method1723(true, "wm3 succeeded");
                    return;
                }
                if (arg2.equalsIgnoreCase("tk0")) {
                    class33.method363(-30052, 0);
                    if (class328.field4859 != 0) {
                        class262.method1723(true, "Failed to enter tk0");
                        return;
                    }
                    class262.method1723(true, "Entered tk0");
                    class287.field4270.field3722 = 0;
                    class287.field4270.method2753(false, class368.field5267);
                    class227.field3189 = false;
                    return;
                }
                if (arg2.equalsIgnoreCase("tk1")) {
                    class33.method363(-30052, 1);
                    if (class328.field4859 == 1) {
                        class262.method1723(true, "Entered tk1");
                        class287.field4270.field3722 = 1;
                        class287.field4270.method2753(false, class368.field5267);
                        class227.field3189 = false;
                        return;
                    }
                    class262.method1723(true, "Failed to enter tk1");
                    return;
                }
                if (arg2.equalsIgnoreCase("tk2")) {
                    class33.method363(-30052, 2);
                    if (class328.field4859 == 2) {
                        class262.method1723(true, "Entered tk2");
                        class287.field4270.field3722 = 2;
                        class287.field4270.method2753(false, class368.field5267);
                        class227.field3189 = false;
                        return;
                    }
                    class262.method1723(true, "Failed to enter tk2");
                    return;
                }
                if (arg2.equalsIgnoreCase("tk3")) {
                    class33.method363(-30052, 3);
                    if (class328.field4859 != 3) {
                        class262.method1723(true, "Failed to enter tk3");
                        return;
                    }
                    class262.method1723(true, "Entered tk3");
                    class287.field4270.field3722 = 3;
                    class287.field4270.method2753(false, class368.field5267);
                    class227.field3189 = false;
                    return;
                }
                if (arg2.equalsIgnoreCase("tk5")) {
                    class33.method363(-30052, 5);
                    if (class328.field4859 == 5) {
                        class262.method1723(true, "Entered tk5");
                        class287.field4270.field3722 = 5;
                        class287.field4270.method2753(false, class368.field5267);
                        class227.field3189 = false;
                        return;
                    }
                    class262.method1723(true, "Failed to enter tk5");
                    return;
                }
                if (arg2.equalsIgnoreCase("ot")) {
                    class287.field4270.field3688 = !class287.field4270.field3688;
                    class287.field4270.method2753(false, class368.field5267);
                    class227.field3189 = false;
                    class705.method3923(4);
                    class262.method1723(true, "ot=" + class287.field4270.field3688);
                    return;
                }
                if (arg2.equalsIgnoreCase("gb")) {
                    class287.field4270.field3683 = !class287.field4270.field3683;
                    class287.field4270.method2753(false, class368.field5267);
                    class227.field3189 = false;
                    class705.method3923(4);
                    class262.method1723(true, "gb=" + class287.field4270.field3683);
                    return;
                }
                if (arg2.startsWith("shadows")) {
                    if (arg2.length() < 8) {
                        class262.method1723(true, "Invalid shadows value");
                        return;
                    }
                    String var13 = arg2.substring(8);
                    int var14 = class645.method3583(-99, var13) ? class440.method2607(7330, var13) : -1;
                    if (var14 >= 0 && var14 <= 2) {
                        class287.field4270.method1626(-7152, class328.field4859, var14);
                        class287.field4270.method2753(false, class368.field5267);
                        class227.field3189 = false;
                        class705.method3923(4);
                        class262.method1723(true, "shadows=" + var14);
                        return;
                    }
                    class262.method1723(true, "Invalid shadows value");
                    return;
                }
                if (arg2.startsWith("textures")) {
                    class287.field4270.field3724 = !class287.field4270.field3724;
                    class287.field4270.method2753(false, class368.field5267);
                    class227.field3189 = false;
                    class496.method2869(112);
                    class705.method3923(4);
                    class262.method1723(true, "textures=" + class287.field4270.field3724);
                    return;
                }
                if (arg2.startsWith("lighting")) {
                    class287.field4270.method1623(class328.field4859, !class287.field4270.method1624(10814, class328.field4859), 1);
                    class287.field4270.method2753(false, class368.field5267);
                    class227.field3189 = false;
                    class646.method3587((byte) -115);
                    class496.method2869(113);
                    class705.method3923(4);
                    class262.method1723(true, "lighting=" + class287.field4270.method1624(10814, class328.field4859));
                    return;
                }
                if (arg2.startsWith("setba")) {
                    if (arg2.length() < 6) {
                        class262.method1723(true, "Invalid buildarea value");
                        return;
                    }
                    int var15 = class440.method2607(7330, arg2.substring(6));
                    if (var15 >= 0 && var15 <= class569.method3242(class266.field4022, 128)) {
                        class287.field4270.field3699 = var15;
                        class287.field4270.method2753(false, class368.field5267);
                        class227.field3189 = false;
                        class262.method1723(true, "maxbuildarea=" + class287.field4270.field3699);
                        return;
                    }
                    class262.method1723(true, "Invalid buildarea value");
                    return;
                }
                if (arg2.startsWith("rect_debug")) {
                    if (arg2.length() < 10) {
                        class262.method1723(true, "Invalid rect_debug value");
                        return;
                    }
                    class700.field9890 = class440.method2607(7330, arg2.substring(10).trim());
                    class262.method1723(true, "rect_debug=" + class700.field9890);
                    return;
                }
                if (arg2.equalsIgnoreCase("qa_op_test")) {
                    class681.field9611 = true;
                    class262.method1723(true, "qa_op_test=" + class681.field9611);
                    return;
                }
                if (arg2.equalsIgnoreCase("clipcomponents")) {
                    class600.field8481 = !class600.field8481;
                    class262.method1723(true, "clipcomponents=" + class600.field8481);
                    return;
                }
                if (arg2.startsWith("bloom")) {
                    boolean var16 = class282.field4228.method127();
                    if (class224.method1479(!var16, 17016)) {
                        if (!var16) {
                            class262.method1723(true, "Bloom enabled");
                            return;
                        }
                        class262.method1723(true, "Bloom disabled");
                        return;
                    }
                    class262.method1723(true, "Failed to enable bloom");
                    return;
                }
                if (arg2.equalsIgnoreCase("tween")) {
                    if (!class498.field7060) {
                        class498.field7060 = true;
                        class262.method1723(true, "Forced tweening ENABLED!");
                        return;
                    }
                    class498.field7060 = false;
                    class262.method1723(true, "Forced tweening disabled.");
                    return;
                }
                if (arg2.equalsIgnoreCase("shiftclick")) {
                    if (!class671.field9479) {
                        class262.method1723(true, "Shift-click ENABLED!");
                        class671.field9479 = true;
                        return;
                    }
                    class262.method1723(true, "Shift-click disabled.");
                    class671.field9479 = false;
                    return;
                }
                if (arg2.equalsIgnoreCase("getcgcoord")) {
                    class262.method1723(true, "x:" + (class648.field9106.field3024 >> 9) + " z:" + (class648.field9106.field3029 >> 9));
                    return;
                }
                if (arg2.equalsIgnoreCase("getheight")) {
                    class262.method1723(true, "Height: " + class296.field4340[class648.field9106.field3019].method432(class648.field9106.field3024 >> 9, false, class648.field9106.field3029 >> 9));
                    return;
                }
                if (arg2.equalsIgnoreCase("resetminimap")) {
                    class703.field9909.method2999((byte) 56);
                    class703.field9909.method2993(-1);
                    class27.field401.method3065((byte) 125);
                    class255.field3916.method813((byte) 81);
                    class575.method3262(-1);
                    class262.method1723(true, "Minimap reset");
                    return;
                }
                if (arg2.startsWith("mc")) {
                    if (!class282.field4228.method109()) {
                        class262.method1723(true, "Current toolkit doesn't support multiple cores");
                        return;
                    }
                    int var17 = Integer.parseInt(arg2.substring(3));
                    if (var17 < 1) {
                        var17 = 1;
                    } else if (var17 > 4) {
                        var17 = 4;
                    }
                    class247.field3825 = var17;
                    class705.method3923(4);
                    class262.method1723(true, "Render cores now: " + class247.field3825);
                    return;
                }
                if (arg2.startsWith("cachespace")) {
                    class262.method1723(true, "I(s): " + class120.field1823.method2283(0) + "/" + class120.field1823.method2289(100));
                    class262.method1723(true, "I(m): " + class138.field2010.method2283(0) + "/" + class138.field2010.method2289(105));
                    class262.method1723(true, "O(s): " + class41.field682.field5257.method1699(false) + "/" + class41.field682.field5257.method1704((byte) 88));
                    return;
                }
                if (arg2.equalsIgnoreCase("getcamerapos")) {
                    class262.method1723(true, "Pos: " + class648.field9106.field3019 + "," + ((class131.field1928 >> 9) + class109.field1672 >> 6) + "," + ((class413.field6011 >> 9) + class203.field2874 >> 6) + "," + ((class131.field1928 >> 9) + class109.field1672 & 0x3F) + "," + ((class413.field6011 >> 9) + class203.field2874 & 0x3F) + " Height: " + (class674.method3748(class131.field1928, class648.field9106.field3019, 106, class413.field6011) - class568.field7998));
                    class262.method1723(true, "Look: " + class648.field9106.field3019 + "," + (class503.field7116 + class109.field1672 >> 6) + "," + (class203.field2874 + class174.field2481 >> 6) + "," + (class503.field7116 + class109.field1672 & 0x3F) + "," + (class174.field2481 + class203.field2874 & 0x3F) + " Height: " + (class674.method3748(class503.field7116, class648.field9106.field3019, 108, class174.field2481) - class129.field1910));
                    return;
                }
                if (arg2.equals("renderprofile") || arg2.equals("rp")) {
                    class207.field2913 = !class207.field2913;
                    class282.field4228.method179(class207.field2913);
                    class443.method2629((byte) -115);
                    class262.method1723(true, "showprofiling=" + class207.field2913);
                    return;
                }
                if (arg2.startsWith("performancetest")) {
                    int var18 = -1;
                    int var19 = 1000;
                    if (arg2.length() > 15) {
                        String[] var20 = class208.method1377(' ', (byte) -109, arg2);
                        try {
                            if (var20.length > 1) {
                                var19 = Integer.parseInt(var20[1]);
                            }
                        } catch (Throwable var34) {
                        }
                        try {
                            if (var20.length > 2) {
                                var18 = Integer.parseInt(var20[2]);
                            }
                        } catch (Throwable var33) {
                        }
                    }
                    if (var18 == -1) {
                        class262.method1723(true, "Java toolkit: " + class416.method2496(-37, var19, 0));
                        class262.method1723(true, "SSE toolkit:  " + class416.method2496(28, var19, 2));
                        class262.method1723(true, "D3D toolkit:  " + class416.method2496(114, var19, 3));
                        class262.method1723(true, "GL toolkit:   " + class416.method2496(125, var19, 1));
                        class262.method1723(true, "GLX toolkit:  " + class416.method2496(117, var19, 5));
                        return;
                    }
                    class262.method1723(true, "Performance: " + class416.method2496(120, var19, class328.field4859));
                    return;
                }
                if (arg2.equals("nonpcs")) {
                    class542.field7626 = !class542.field7626;
                    class262.method1723(true, "nonpcs=" + class542.field7626);
                    return;
                }
                if (arg2.equals("autoworld")) {
                    class701.method3906((byte) 120);
                    class262.method1723(true, "auto world selected");
                    return;
                }
                if (arg2.startsWith("switchworld")) {
                    int var21 = Integer.parseInt(arg2.substring(12));
                    class669.method3710((byte) 112, var21, class508.method2918(100, var21).field2532);
                    class262.method1723(true, "switched");
                    return;
                }
                if (arg2.equals("getworld")) {
                    class262.method1723(true, "w: " + class228.field3284.field4938);
                    return;
                }
                if (arg2.startsWith("pc")) {
                    class135 var22 = class688.method3794(class395.field5864, class583.field8198, (byte) 38);
                    var22.field1978.method3853((byte) 51, 0);
                    int var23 = var22.field1978.field9761;
                    int var24 = arg2.indexOf(" ", 4);
                    var22.field1978.method3837(4102, arg2.substring(3, var24));
                    class37.method435(var22.field1978, arg2.substring(var24), 121);
                    var22.field1978.method3867(var22.field1978.field9761 - var23, (byte) -122);
                    class19.method223(var22, 0);
                    return;
                }
                if (arg2.equals("savevarcs")) {
                    class436.method2598(-81);
                    class262.method1723(true, "perm varcs saved");
                    return;
                }
                if (arg2.equals("scramblevarcs")) {
                    for (int var25 = 0; var25 < class524.field7403.length; var25++) {
                        if (class591.field8281[var25]) {
                            class524.field7403[var25] = (int) (Math.random() * 99999.0D);
                            if (Math.random() > 0.5D) {
                                class524.field7403[var25] *= -1;
                            }
                        }
                    }
                    class436.method2598(-122);
                    class262.method1723(true, "perm varcs scrambled");
                    return;
                }
                if (arg2.equals("showcolmap")) {
                    class689.field9699 = true;
                    class575.method3262(-1);
                    class262.method1723(true, "colmap is shown");
                    return;
                }
                if (arg2.equals("hidecolmap")) {
                    class689.field9699 = false;
                    class575.method3262(-1);
                    class262.method1723(true, "colmap is hidden");
                    return;
                }
                if (arg2.equals("resetcache")) {
                    class242.method1643(-19585);
                    class262.method1723(true, "Caches reset");
                    return;
                }
                if (arg2.equals("profilecpu")) {
                    class262.method1723(true, class229.method1582(true) + "ms");
                    return;
                }
                if (arg2.startsWith("getclientvarpbit")) {
                    int var26 = Integer.parseInt(arg2.substring(17));
                    class262.method1723(true, "varpbit=" + class61.field1163.method1727(var26, 0));
                    return;
                }
                if (arg2.startsWith("getclientvarp")) {
                    int var27 = Integer.parseInt(arg2.substring(14));
                    class262.method1723(true, "varp=" + class61.field1163.method1733(true, var27));
                    return;
                }
                if (arg2.startsWith("demologin")) {
                    class284.method1834((byte) -120, 0, false);
                    return;
                }
                if (arg2.startsWith("newdemologin")) {
                    class284.method1834((byte) -11, 0, true);
                    return;
                }
                if (arg2.startsWith("directlogin")) {
                    String[] var28 = class208.method1377(' ', (byte) -126, arg2.substring(12));
                    if (var28.length >= 2) {
                        int var29 = var28.length > 2 ? Integer.parseInt(var28[2]) : 0;
                        class372.method2249(var29, var28[1], (byte) 103, var28[0]);
                        return;
                    }
                }
                if (arg2.startsWith("csprofileclear")) {
                    class220.method1444();
                    return;
                }
                if (arg2.startsWith("csprofileoutputc")) {
                    class220.method1442(100, false);
                    return;
                }
                if (arg2.startsWith("csprofileoutputt")) {
                    class220.method1442(10, true);
                    return;
                }
                if (arg2.startsWith("texsize")) {
                    int var30 = Integer.parseInt(arg2.substring(8));
                    class282.field4228.method101(var30);
                    return;
                }
                if (arg2.equals("soundstreamcount")) {
                    class262.method1723(true, "Active streams: " + class627.field8780.method2110());
                    return;
                }
                if (arg2.equals("autosetup")) {
                    class287.field4270.method2757((byte) 123);
                    class262.method1723(true, "Complete. Toolkit now: " + class328.field4859);
                    return;
                }
                if (arg2.equals("errormessage")) {
                    class262.method1723(true, class565.field7967.method1774(116));
                    return;
                }
                if (arg2.equals("heapdump")) {
                    if (class4.field22.startsWith("win")) {
                        class138.method996(new File("C:\\Temp\\heap.dump"), false, false);
                    } else {
                        class138.method996(new File("/tmp/heap.dump"), false, false);
                    }
                    class262.method1723(true, "Done");
                    return;
                }
                if (arg2.equals("os")) {
                    class262.method1723(true, "Name: " + class4.field22);
                    class262.method1723(true, "Arch: " + class4.field40);
                    class262.method1723(true, "Ver: " + class4.field33);
                    return;
                }
                if (arg2.equals("w2debug")) {
                    class650.field9111 = !class650.field9111;
                    class705.method3923(4);
                    class262.method1723(true, "Toggled!");
                    return;
                }
                if (class420.field6113 == 10) {
                    class595.field8415++;
                    class135 var31 = class688.method3794(class458.field6551, class583.field8198, (byte) 38);
                    var31.field1978.method3853((byte) 51, arg2.length() + 3);
                    var31.field1978.method3853((byte) 51, arg3 ? 1 : 0);
                    var31.field1978.method3853((byte) 51, arg0 ? 1 : 0);
                    var31.field1978.method3837(4102, arg2);
                    class19.method223(var31, 0);
                }
                if (arg2.startsWith("fps ") && class379.field5372 != class296.field4357) {
                    class219.method1433(3553, class440.method2607(7330, arg2.substring(4)));
                    return;
                }
            } catch (Exception var35) {
                class262.method1723(true, class274.field4118.method1804(7175, class512.field7203));
                return;
            }
        }
        if (class420.field6113 != 10) {
            class262.method1723(true, class274.field4119.method1804(7175, class512.field7203) + arg2);
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lmo;II)V", line = 945)
    private final void method716(class695 arg0, int arg1, int arg2) {
        field1345++;
        if (arg2 != -7785) {
            field1342 = null;
        }
        if (arg1 != 249) {
            return;
        }
        int var4 = arg0.method3826(false);
        if (this.field1340 == null) {
            int var5 = class2.method9(var4, 95);
            this.field1340 = new class213(var5);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            boolean var7 = arg0.method3826(false) == 1;
            int var8 = arg0.method3873(255);
            class665 var9;
            if (var7) {
                var9 = new class500(arg0.method3836(false));
            } else {
                var9 = new class111(arg0.method3880(8));
            }
            this.field1340.method1403((byte) -18, var9, (long) var8);
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lmo;I)V", line = 991)
    public final void method717(class695 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3826(false);
            if (var3 == 0) {
                field1338++;
                if (arg1 <= 13) {
                    field1347 = null;
                    return;
                }
                return;
            }
            this.method716(arg0, var3, -7785);
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(BLjava/awt/Canvas;ILfa;)Lr;", line = 1013)
    public static final class166 method718(byte arg0, Canvas arg1, int arg2, class209 arg3) {
        field1339++;
        return arg0 > -5 ? null : new class228(arg1, arg3, arg2);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IZI)I", line = 1024)
    public final int method719(int arg0, boolean arg1, int arg2) {
        field1343++;
        if (this.field1340 == null) {
            return arg2;
        }
        if (arg1) {
            field1342 = null;
        }
        class111 var4 = (class111) this.field1340.method1405((long) arg0, (byte) -39);
        return var4 == null ? arg2 : var4.field1683;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)V", line = 1044)
    public static void method720(int arg0) {
        if (arg0 == 1198) {
            field1347 = null;
            field1342 = null;
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZI)Z", line = 1064)
    public static final boolean method721(boolean arg0, int arg1) {
        if (!arg0) {
            method720(49);
        }
        field1344++;
        return arg1 == 3 || arg1 == 5 || arg1 == 6;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Ljava/lang/String;IB)Ljava/lang/String;", line = 1077)
    public final String method722(String arg0, int arg1, byte arg2) {
        field1346++;
        if (this.field1340 == null) {
            return arg0;
        }
        class500 var4 = (class500) this.field1340.method1405((long) arg1, (byte) -32);
        if (arg2 >= -61) {
            field1347 = null;
        }
        return var4 == null ? arg0 : var4.field7083;
    }
}
