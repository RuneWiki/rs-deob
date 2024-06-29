import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class159 {

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "J")
    public long field2146;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "Lmg;")
    public class159 field2139;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "Lmg;")
    public class159 field2144;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "[Lre;")
    public static class626[] field2141;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "(I)V", line = 4)
    public static void method1100(int arg0) {
        if (arg0 == 19946) {
            field2141 = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IBLmu;)V", line = 14)
    public static final void method1101(int arg0, byte arg1, class317 arg2) {
        field2143++;
        if (class10.field118 >= 50 || arg2 == null || arg2.field4463 == null || arg2.field4463.length <= arg0 || arg2.field4463[arg0] == null) {
            return;
        }
        int var3 = arg2.field4463[arg0][0];
        int var4 = var3 >> 8;
        if (arg2.field4463[arg0].length > 1) {
            int var5 = (int) ((double) arg2.field4463[arg0].length * Math.random());
            if (var5 > 0) {
                var4 = arg2.field4463[arg0][var5];
            }
        }
        int var6 = (var3 & 0xE2) >> 5;
        int var7 = 23 % ((arg1 + 34) / 48);
        int var8 = 256;
        if (arg2.field4483 != null && arg2.field4491 != null) {
            var8 = class270.method1799(2, arg2.field4491[arg0], arg2.field4483[arg0]);
        }
        if (arg2.field4479) {
            class416.method2509(var8, var6, var4, 255, false, 0, true);
        } else {
            class449.method2673(var4, 0, 255, var8, 2003865932, var6);
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(B)V", line = 57)
    public final void method1102(byte arg0) {
        field2145++;
        if (this.field2144 == null) {
            return;
        }
        if (arg0 < 51) {
            method1101(48, (byte) -128, null);
        }
        this.field2144.field2139 = this.field2139;
        this.field2139.field2144 = this.field2144;
        this.field2139 = null;
        this.field2144 = null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZZBLjava/lang/String;)V", line = 76)
    public static final void method1103(boolean arg0, boolean arg1, byte arg2, String arg3) {
        field2140++;
        try {
            if (arg3.equalsIgnoreCase("commands") || arg3.equalsIgnoreCase("help")) {
                class280.method1834((byte) 88, "commands - This command");
                class280.method1834((byte) 88, "cls - Clear console");
                class280.method1834((byte) 88, "displayfps - Toggle FPS and other information");
                class280.method1834((byte) 88, "renderer - Print graphics renderer information");
                class280.method1834((byte) 88, "heap - Print java memory information");
                return;
            }
            if (arg3.equalsIgnoreCase("cls")) {
                class507.field7106 = 0;
                class559.field7666 = 0;
                return;
            }
            if (arg3.equalsIgnoreCase("displayfps")) {
                class275.field3992 = !class275.field3992;
                if (class275.field3992) {
                    class280.method1834((byte) 88, "FPS on");
                    return;
                }
                class280.method1834((byte) 88, "FPS off");
                return;
            }
            if (arg3.equals("renderer")) {
                class189 var4 = class375.field5490.method542();
                class280.method1834((byte) 88, "Vendor: " + var4.field2466);
                class280.method1834((byte) 88, "Name: " + var4.field2461);
                class280.method1834((byte) 88, "Version: " + var4.field2460);
                class280.method1834((byte) 88, "Device: " + var4.field2463);
                class280.method1834((byte) 88, "Driver Version: " + var4.field2462);
                return;
            }
            if (arg3.equals("heap")) {
                class280.method1834((byte) 88, "Heap: " + class115.field1557 + "MB");
                return;
            }
        } catch (Exception var46) {
            class280.method1834((byte) 88, class58.field699.method365(class55.field647, (byte) 86));
            return;
        }
        if (class554.field7645 != class222.field2884 || class479.field6726 >= 2) {
            if (arg3.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg3.equals("nativememerror")) {
                throw new OutOfMemoryError("native(MPR");
            }
            try {
                if (arg3.equalsIgnoreCase("printfps")) {
                    class280.method1834((byte) 88, "FPS: " + class697.field9248);
                    return;
                }
                if (arg3.equalsIgnoreCase("occlude")) {
                    class14.field144 = !class14.field144;
                    if (class14.field144) {
                        class280.method1834((byte) 88, "Occlsion now on!");
                        return;
                    }
                    class280.method1834((byte) 88, "Occlsion now off!");
                    return;
                }
                if (arg3.equalsIgnoreCase("fpson")) {
                    class275.field3992 = true;
                    class280.method1834((byte) 88, "fps debug enabled");
                    return;
                }
                if (arg3.equalsIgnoreCase("fpsoff")) {
                    class275.field3992 = false;
                    class280.method1834((byte) 88, "fps debug disabled");
                    return;
                }
                if (arg3.equals("systemmem")) {
                    try {
                        class280.method1834((byte) 88, "System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + class706.field9663.field9953 + "Mb");
                        return;
                    } catch (Throwable var40) {
                        return;
                    }
                }
                if (arg3.equalsIgnoreCase("cleartext")) {
                    class325.field4620.method2194(true);
                    class280.method1834((byte) 88, "Text coords cleared");
                    return;
                }
                if (arg3.equalsIgnoreCase("gc")) {
                    class792.method4330(-1);
                    for (int var5 = 0; var5 < 10; var5++) {
                        System.gc();
                    }
                    Runtime var6 = Runtime.getRuntime();
                    int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                    class280.method1834((byte) 88, "mem=" + var7 + "k");
                    return;
                }
                if (arg3.equalsIgnoreCase("compact")) {
                    class792.method4330(-1);
                    for (int var8 = 0; var8 < 10; var8++) {
                        System.gc();
                    }
                    Runtime var9 = Runtime.getRuntime();
                    int var10 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                    class280.method1834((byte) 88, "Memory before cleanup=" + var10 + "k");
                    class555.method3186(-120);
                    class792.method4330(-1);
                    for (int var11 = 0; var11 < 10; var11++) {
                        System.gc();
                    }
                    int var12 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                    class280.method1834((byte) 88, "Memory after cleanup=" + var12 + "k");
                    return;
                }
                if (arg3.equalsIgnoreCase("unloadnatives")) {
                    class280.method1834((byte) 88, class507.method2950(0) ? "Libraries unloaded" : "Library unloading failed!");
                    return;
                }
                if (arg3.equalsIgnoreCase("clientdrop")) {
                    class280.method1834((byte) 88, "Dropped client connection");
                    if (class780.field10712 == 10) {
                        class73.method594((byte) -127);
                        return;
                    }
                    if (class780.field10712 == 11) {
                        class160.field2151 = true;
                    }
                    return;
                }
                if (arg3.equalsIgnoreCase("rotateconnectmethods")) {
                    class102.field1464.method3734(374);
                    class280.method1834((byte) 88, "Rotated connection methods");
                    return;
                }
                if (arg3.equalsIgnoreCase("clientjs5drop")) {
                    class479.field6732.method63((byte) -46);
                    class280.method1834((byte) 88, "Dropped client js5 net queue");
                    return;
                }
                if (arg3.equalsIgnoreCase("serverjs5drop")) {
                    class479.field6732.method49(5);
                    class280.method1834((byte) 88, "Dropped server js5 net queue");
                    return;
                }
                if (arg3.equalsIgnoreCase("breakcon")) {
                    class786.field10800.method1537((byte) -86);
                    class710.field9707.method136(21);
                    class479.field6732.method59((byte) 99);
                    class280.method1834((byte) 88, "Breaking new connections for 5 seconds");
                    return;
                }
                if (arg3.equalsIgnoreCase("rebuild")) {
                    class452.method2690(11);
                    class630.method3478(-19580);
                    class280.method1834((byte) 88, "Rebuilding map");
                    return;
                }
                if (arg3.equalsIgnoreCase("rebuildprofile")) {
                    class620.field8395 = class401.method2440(false);
                    class246.field3213 = true;
                    class452.method2690(11);
                    class630.method3478(-19580);
                    class280.method1834((byte) 88, "Rebuilding map (with profiling)");
                    return;
                }
                if (arg3.equalsIgnoreCase("wm1")) {
                    class77.method625(false, true, 1, -1, -1);
                    if (class164.method1133(-15388) == 1) {
                        class280.method1834((byte) 88, "wm1 succeeded");
                        return;
                    }
                    class280.method1834((byte) 88, "wm1 failed");
                    return;
                }
                if (arg3.equalsIgnoreCase("wm2")) {
                    class77.method625(false, true, 2, -1, -1);
                    if (class164.method1133(-15388) == 2) {
                        class280.method1834((byte) 88, "wm2 succeeded");
                        return;
                    }
                    class280.method1834((byte) 88, "wm2 failed");
                    return;
                }
                if (arg3.equalsIgnoreCase("wm3")) {
                    class77.method625(false, true, 3, 768, 1024);
                    if (class164.method1133(-15388) != 3) {
                        class280.method1834((byte) 88, "wm3 failed");
                        return;
                    }
                    class280.method1834((byte) 88, "wm3 succeeded");
                    return;
                }
                if (arg3.equalsIgnoreCase("tk0")) {
                    class399.method2434(false, (byte) 122, 0);
                    if (class125.field1721.field5141.method2541(43) == 0) {
                        class280.method1834((byte) 88, "Entered tk0");
                        class125.field1721.method2255(true, 0, class125.field1721.field5140);
                        class515.method3006(-2);
                        class180.field2362 = false;
                        return;
                    }
                    class280.method1834((byte) 88, "Failed to enter tk0");
                    return;
                }
                if (arg3.equalsIgnoreCase("tk1")) {
                    class399.method2434(false, (byte) 120, 1);
                    if (class125.field1721.field5141.method2541(43) == 1) {
                        class280.method1834((byte) 88, "Entered tk1");
                        class125.field1721.method2255(true, 1, class125.field1721.field5140);
                        class515.method3006(-2);
                        class180.field2362 = false;
                        return;
                    }
                    class280.method1834((byte) 88, "Failed to enter tk1");
                    return;
                }
                if (arg3.equalsIgnoreCase("tk2")) {
                    class399.method2434(false, (byte) -83, 2);
                    if (class125.field1721.field5141.method2541(43) != 2) {
                        class280.method1834((byte) 88, "Failed to enter tk2");
                        return;
                    }
                    class280.method1834((byte) 88, "Entered tk2");
                    class125.field1721.method2255(true, 2, class125.field1721.field5140);
                    class515.method3006(-2);
                    class180.field2362 = false;
                    return;
                }
                if (arg3.equalsIgnoreCase("tk3")) {
                    class399.method2434(false, (byte) 104, 3);
                    if (class125.field1721.field5141.method2541(43) != 3) {
                        class280.method1834((byte) 88, "Failed to enter tk3");
                        return;
                    }
                    class280.method1834((byte) 88, "Entered tk3");
                    class125.field1721.method2255(true, 3, class125.field1721.field5140);
                    class515.method3006(-2);
                    class180.field2362 = false;
                    return;
                }
                if (arg3.equalsIgnoreCase("tk5")) {
                    class399.method2434(false, (byte) 83, 5);
                    if (class125.field1721.field5141.method2541(43) == 5) {
                        class280.method1834((byte) 88, "Entered tk5");
                        class125.field1721.method2255(true, 5, class125.field1721.field5140);
                        class515.method3006(-2);
                        class180.field2362 = false;
                        return;
                    }
                    class280.method1834((byte) 88, "Failed to enter tk5");
                    return;
                }
                if (arg3.startsWith("setba")) {
                    if (arg3.length() < 6) {
                        class280.method1834((byte) 88, "Invalid buildarea value");
                        return;
                    }
                    int var13 = class469.method2750((byte) 117, arg3.substring(6));
                    if (var13 >= 0 && var13 <= class329.method2134(class115.field1557, -129)) {
                        class125.field1721.method2255(true, var13, class125.field1721.field5144);
                        class515.method3006(-2);
                        class180.field2362 = false;
                        class280.method1834((byte) 88, "maxbuildarea=" + class125.field1721.field5144.method3724(43));
                        return;
                    }
                    class280.method1834((byte) 88, "Invalid buildarea value");
                    return;
                }
                if (arg3.startsWith("rect_debug")) {
                    if (arg3.length() < 10) {
                        class280.method1834((byte) 88, "Invalid rect_debug value");
                        return;
                    }
                    class81.field1126 = class469.method2750((byte) 57, arg3.substring(10).trim());
                    class280.method1834((byte) 88, "rect_debug=" + class81.field1126);
                    return;
                }
                if (arg3.equalsIgnoreCase("qa_op_test")) {
                    class341.field4764 = true;
                    class280.method1834((byte) 88, "qa_op_test=" + class341.field4764);
                    return;
                }
                if (arg3.equalsIgnoreCase("clipcomponents")) {
                    class492.field6929 = !class492.field6929;
                    class280.method1834((byte) 88, "clipcomponents=" + class492.field6929);
                    return;
                }
                if (arg3.startsWith("bloom")) {
                    boolean var14 = class375.field5490.method472();
                    if (class201.method1324(1073741823, !var14)) {
                        if (!var14) {
                            class280.method1834((byte) 88, "Bloom enabled");
                            return;
                        }
                        class280.method1834((byte) 88, "Bloom disabled");
                        return;
                    }
                    class280.method1834((byte) 88, "Failed to enable bloom");
                    return;
                }
                if (arg3.equalsIgnoreCase("tween")) {
                    if (class779.field10699) {
                        class779.field10699 = false;
                        class280.method1834((byte) 88, "Forced tweening disabled.");
                        return;
                    }
                    class779.field10699 = true;
                    class280.method1834((byte) 88, "Forced tweening ENABLED!");
                    return;
                }
                if (arg3.equalsIgnoreCase("shiftclick")) {
                    if (!class186.field2437) {
                        class280.method1834((byte) 88, "Shift-click ENABLED!");
                        class186.field2437 = true;
                        return;
                    }
                    class280.method1834((byte) 88, "Shift-click disabled.");
                    class186.field2437 = false;
                    return;
                }
                if (arg3.equalsIgnoreCase("getcgcoord")) {
                    class280.method1834((byte) 88, "x:" + (class625.field8475.field2802 >> 9) + " z:" + (class625.field8475.field2810 >> 9));
                    return;
                }
                if (arg3.equalsIgnoreCase("getheight")) {
                    class280.method1834((byte) 88, "Height: " + class645.field8694[class625.field8475.field2813].method1898(class625.field8475.field2810 >> 9, class625.field8475.field2802 >> 9, (byte) -103));
                    return;
                }
                if (arg3.equalsIgnoreCase("resetminimap")) {
                    class490.field6826.method1177(-34837);
                    class490.field6826.method1187(65);
                    class548.field7574.method3174(-14292);
                    class323.field4586.method2072(-4);
                    class630.method3478(-19580);
                    class280.method1834((byte) 88, "Minimap reset");
                    return;
                }
                if (arg3.startsWith("mc")) {
                    if (!class375.field5490.method458()) {
                        class280.method1834((byte) 88, "Current toolkit doesn't support multiple cores");
                        return;
                    }
                    int var15 = Integer.parseInt(arg3.substring(3));
                    if (var15 < 1) {
                        var15 = 1;
                    } else if (var15 > 4) {
                        var15 = 4;
                    }
                    class552.field7620 = var15;
                    class452.method2690(11);
                    class280.method1834((byte) 88, "Render cores now: " + class552.field7620);
                    return;
                }
                if (arg3.startsWith("cachespace")) {
                    class280.method1834((byte) 88, "I(s): " + class282.field4078.method3104((byte) -118) + "/" + class282.field4078.method3111(-1));
                    class280.method1834((byte) 88, "I(m): " + class338.field4739.method3104((byte) -46) + "/" + class338.field4739.method3111(-1));
                    class280.method1834((byte) 88, "O(s): " + class16.field156.field4669.method2519(-124) + "/" + class16.field156.field4669.method2523(1));
                    return;
                }
                if (arg3.equalsIgnoreCase("getcamerapos")) {
                    class280.method1834((byte) 88, "Pos: " + class625.field8475.field2813 + "," + ((class435.field6273 >> 9) + class120.field1625 >> 6) + "," + ((class223.field2892 >> 9) + class259.field3849 >> 6) + "," + ((class435.field6273 >> 9) + class120.field1625 & 0x3F) + "," + ((class223.field2892 >> 9) + class259.field3849 & 0x3F) + " Height: " + (class778.method4273(class223.field2892, (byte) -113, class435.field6273, class625.field8475.field2813) - class269.field3926));
                    class280.method1834((byte) 88, "Look: " + class625.field8475.field2813 + "," + (class594.field8105 + class120.field1625 >> 6) + "," + (class507.field7102 + class259.field3849 >> 6) + "," + (class594.field8105 + class120.field1625 & 0x3F) + "," + (class507.field7102 + class259.field3849 & 0x3F) + " Height: " + (class778.method4273(class507.field7102, (byte) -20, class594.field8105, class625.field8475.field2813) - class532.field7393));
                    return;
                }
                if (arg3.equals("renderprofile") || arg3.equals("rp")) {
                    class572.field7794 = !class572.field7794;
                    class375.field5490.method485(class572.field7794);
                    class679.method3731(0);
                    class280.method1834((byte) 88, "showprofiling=" + class572.field7794);
                    return;
                }
                if (arg3.startsWith("performancetest")) {
                    int var16 = -1;
                    int var17 = 1000;
                    if (arg3.length() > 15) {
                        String[] var18 = class684.method3748(-2242, arg3, ' ');
                        try {
                            if (var18.length > 1) {
                                var17 = Integer.parseInt(var18[1]);
                            }
                        } catch (Throwable var42) {
                        }
                        try {
                            if (var18.length > 2) {
                                var16 = Integer.parseInt(var18[2]);
                            }
                        } catch (Throwable var41) {
                        }
                    }
                    if (var16 == -1) {
                        class280.method1834((byte) 88, "Java toolkit: " + class400.method2437(var17, (byte) -87, 0));
                        class280.method1834((byte) 88, "SSE toolkit:  " + class400.method2437(var17, (byte) -87, 2));
                        class280.method1834((byte) 88, "D3D toolkit:  " + class400.method2437(var17, (byte) -87, 3));
                        class280.method1834((byte) 88, "GL toolkit:   " + class400.method2437(var17, (byte) -87, 1));
                        class280.method1834((byte) 88, "GLX toolkit:  " + class400.method2437(var17, (byte) -87, 5));
                        return;
                    }
                    class280.method1834((byte) 88, "Performance: " + class400.method2437(var17, (byte) -87, var16));
                    return;
                }
                if (arg3.equals("nonpcs")) {
                    class181.field2378 = !class181.field2378;
                    class280.method1834((byte) 88, "nonpcs=" + class181.field2378);
                    return;
                }
                if (arg3.equals("autoworld")) {
                    class503.method2939(false);
                    class280.method1834((byte) 88, "auto world selected");
                    return;
                }
                if (arg3.startsWith("switchworld")) {
                    int var19 = Integer.parseInt(arg3.substring(12));
                    class624.method3445(class673.method3712((byte) 97, var19).field2085, var19, -128);
                    class280.method1834((byte) 88, "switched");
                    return;
                }
                if (arg3.equals("getworld")) {
                    class280.method1834((byte) 88, "w: " + class102.field1464.field9099);
                    return;
                }
                if (arg3.startsWith("pc")) {
                    class43 var20 = class492.method2903(class687.field9191, 0, class73.field983);
                    var20.field457.method1725(0, 111);
                    int var21 = var20.field457.field3725;
                    int var22 = arg3.indexOf(" ", 4);
                    var20.field457.method1678(arg3.substring(3, var22), (byte) 52);
                    class511.method2983(arg3.substring(var22), 0, var20.field457);
                    var20.field457.method1726((byte) -127, var20.field457.field3725 - var21);
                    class409.method2457((byte) -100, var20);
                    return;
                }
                if (arg3.equals("savevarcs")) {
                    class756.method4144((byte) 115);
                    class280.method1834((byte) 88, "perm varcs saved");
                    return;
                }
                if (arg3.equals("scramblevarcs")) {
                    for (int var23 = 0; var23 < class138.field1865.length; var23++) {
                        if (class679.field9091[var23]) {
                            class138.field1865[var23] = (int) (Math.random() * 99999.0D);
                            if (Math.random() > 0.5D) {
                                class138.field1865[var23] *= -1;
                            }
                        }
                    }
                    class756.method4144((byte) -120);
                    class280.method1834((byte) 88, "perm varcs scrambled");
                    return;
                }
                if (arg3.equals("showcolmap")) {
                    class250.field3506 = true;
                    class630.method3478(-19580);
                    class280.method1834((byte) 88, "colmap is shown");
                    return;
                }
                if (arg3.equals("hidecolmap")) {
                    class250.field3506 = false;
                    class630.method3478(-19580);
                    class280.method1834((byte) 88, "colmap is hidden");
                    return;
                }
                if (arg3.equals("resetcache")) {
                    class74.method601((byte) 50);
                    class280.method1834((byte) 88, "Caches reset");
                    return;
                }
                if (arg3.equals("profilecpu")) {
                    class280.method1834((byte) 88, class127.method897(20) + "ms");
                    return;
                }
                if (arg3.startsWith("getclientvarpbit")) {
                    int var24 = Integer.parseInt(arg3.substring(17));
                    class280.method1834((byte) 88, "varpbit=" + class480.field6740.method2443(0, var24));
                    return;
                }
                if (arg3.startsWith("getclientvarp")) {
                    int var25 = Integer.parseInt(arg3.substring(14));
                    class280.method1834((byte) 88, "varp=" + class480.field6740.method2442(var25, 105));
                    return;
                }
                if (arg3.startsWith("directlogin")) {
                    String[] var26 = class684.method3748(-2242, arg3.substring(12), ' ');
                    if (var26.length >= 2) {
                        int var27 = var26.length > 2 ? Integer.parseInt(var26[2]) : 0;
                        class96.method755(var27, var26[0], var26[1], 101);
                        return;
                    }
                }
                if (arg3.startsWith("csprofileclear")) {
                    class727.method4019();
                    return;
                }
                if (arg3.startsWith("csprofileoutputc")) {
                    class727.method4022(100, false);
                    return;
                }
                if (arg3.startsWith("csprofileoutputt")) {
                    class727.method4022(10, true);
                    return;
                }
                if (arg3.startsWith("texsize")) {
                    int var28 = Integer.parseInt(arg3.substring(8));
                    class375.field5490.method528(var28);
                    return;
                }
                if (arg3.equals("soundstreamcount")) {
                    class280.method1834((byte) 88, "Active streams: " + class701.field9285.method19());
                    return;
                }
                if (arg3.equals("autosetup")) {
                    class72.method589((byte) 39);
                    class280.method1834((byte) 88, "Complete. Toolkit now: " + class125.field1721.field5141.method2541(43));
                    return;
                }
                if (arg3.equals("errormessage")) {
                    class280.method1834((byte) 88, class723.field9821.method2031(-31064));
                    return;
                }
                if (arg3.equals("heapdump")) {
                    if (class248.field3232.startsWith("win")) {
                        class141.method982(false, new File("C:\\Temp\\heap.dump"), 110);
                    } else {
                        class141.method982(false, new File("/tmp/heap.dump"), 110);
                    }
                    class280.method1834((byte) 88, "Done");
                    return;
                }
                if (arg3.equals("os")) {
                    class280.method1834((byte) 88, "Name: " + class248.field3232);
                    class280.method1834((byte) 88, "Arch: " + class248.field3247);
                    class280.method1834((byte) 88, "Ver: " + class248.field3235);
                    return;
                }
                if (arg3.startsWith("w2debug")) {
                    int var29 = Integer.parseInt(arg3.substring(8, 9));
                    class134.field1827 = var29;
                    class452.method2690(11);
                    class280.method1834((byte) 88, "Toggled!");
                    return;
                }
                if (arg3.startsWith("ortho ")) {
                    int var30 = arg3.indexOf(32);
                    if (var30 < 0) {
                        class280.method1834((byte) 88, "Syntax: ortho <n>");
                        return;
                    }
                    int var31 = class469.method2750((byte) 111, arg3.substring(var30 + 1));
                    class125.field1721.method2255(true, var31, class125.field1721.field5154);
                    class515.method3006(-2);
                    class180.field2362 = false;
                    class654.method3639(-117);
                    if (class125.field1721.field5154.method1216(43) == var31) {
                        class280.method1834((byte) 88, "Successfully changed ortho mode");
                        return;
                    }
                    class280.method1834((byte) 88, "Failed to change ortho mode");
                    return;
                }
                if (arg3.startsWith("orthozoom ")) {
                    if (class125.field1721.field5154.method1216(43) == 0) {
                        class280.method1834((byte) 88, "enable ortho mode first (use 'ortho <n>')");
                        return;
                    }
                    int var32 = class469.method2750((byte) 104, arg3.substring(arg3.indexOf(32) + 1));
                    class72.field981 = var32;
                    class280.method1834((byte) 88, "orthozoom=" + class72.field981);
                    return;
                }
                if (arg3.startsWith("orthotilesize ")) {
                    int var33 = class469.method2750((byte) 72, arg3.substring(arg3.indexOf(32) + 1));
                    class205.field2652 = var33;
                    class657.field8863 = var33;
                    class280.method1834((byte) 88, "ortho tile size=" + var33);
                    class654.method3639(-80);
                    return;
                }
                if (arg3.equals("orthocamlock")) {
                    class52.field625 = !class52.field625;
                    class280.method1834((byte) 88, "ortho camera lock is " + (class52.field625 ? "on" : "off"));
                    return;
                }
                if (arg3.startsWith("setoutput ")) {
                    File var34 = new File(arg3.substring(10));
                    if (var34.exists()) {
                        var34 = new File(arg3.substring(10) + "." + class401.method2440(false) + ".log");
                        if (var34.exists()) {
                            class280.method1834((byte) 88, "file already exists!");
                            return;
                        }
                    }
                    if (class640.field8634 != null) {
                        class640.field8634.close();
                        class640.field8634 = null;
                    }
                    try {
                        class640.field8634 = new FileOutputStream(var34);
                        return;
                    } catch (FileNotFoundException var43) {
                        class280.method1834((byte) 88, "Could not create " + var34.getName());
                        return;
                    } catch (SecurityException var44) {
                        class280.method1834((byte) 88, "Cannot write to " + var34.getName());
                        return;
                    }
                }
                if (arg3.equals("closeoutput")) {
                    if (class640.field8634 != null) {
                        class640.field8634.close();
                    }
                    class640.field8634 = null;
                    return;
                }
                if (arg3.startsWith("runscript ")) {
                    File var35 = new File(arg3.substring(10));
                    if (!var35.exists()) {
                        class280.method1834((byte) 88, "No such file");
                        return;
                    }
                    byte[] var36 = class306.method1980(var35, 105);
                    if (var36 == null) {
                        class280.method1834((byte) 88, "Failed to read file");
                        return;
                    }
                    String[] var37 = class684.method3748(-2242, class547.method3150(31384, class474.method2756(var36, (byte) -126), '\r', ""), '\n');
                    class197.method1292(-1953, var37);
                }
                if (arg3.startsWith("zoom ")) {
                    short var38 = (short) class469.method2750((byte) 115, arg3.substring(5));
                    if (var38 > 0) {
                        class423.field6086 = var38;
                    }
                    return;
                }
                if (class780.field10712 == 10) {
                    class658.field8872++;
                    class43 var39 = class492.method2903(class30.field296, 0, class73.field983);
                    var39.field457.method1725(arg3.length() + 3, 127);
                    var39.field457.method1725(arg1 ? 1 : 0, 40);
                    var39.field457.method1725(arg0 ? 1 : 0, 72);
                    var39.field457.method1678(arg3, (byte) 126);
                    class409.method2457((byte) -100, var39);
                }
                if (arg3.startsWith("fps ") && class554.field7645 != class222.field2884) {
                    class679.method3732(class469.method2750((byte) 106, arg3.substring(4)), 13);
                    return;
                }
            } catch (Exception var45) {
                class280.method1834((byte) 88, class58.field699.method365(class55.field647, (byte) 114));
                return;
            }
        }
        if (arg2 >= 84 && class780.field10712 != 10) {
            class280.method1834((byte) 88, class58.field700.method365(class55.field647, (byte) 100) + arg3);
        }
    }

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "(I)Z", line = 1073)
    public final boolean method1104(int arg0) {
        field2138++;
        if (this.field2144 == null) {
            return false;
        } else {
            if (arg0 != 3) {
                method1103(false, true, (byte) -101, null);
            }
            return true;
        }
    }
}
