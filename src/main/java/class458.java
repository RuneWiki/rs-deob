import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class458 {

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "F")
    public static float field5983;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "I")
    public static int field5980;

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "I")
    public static int field5981;

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "I")
    public static int field5982;

    @OriginalMember(owner = "client!rv", name = "e", descriptor = "I")
    public static int field5984;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(B)V", line = 4)
    public static final void method2589(byte arg0) {
        class702.field9291.method898(class528.field6710, class721.field9474, class679.field8788);
        field5982++;
        if (arg0 < 92) {
            field5983 = 1.0857047F;
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(III)Z", line = 19)
    public static final boolean method2590(int arg0, int arg1, int arg2) {
        field5981++;
        if (arg0 >= 1000 && arg1 < 1000) {
            return true;
        }
        int var3 = 93 % ((arg2 - 21) / 39);
        if (arg0 >= 1000 || arg1 >= 1000) {
            return arg0 >= 1000 && arg1 >= 1000;
        } else if (class279.method1714(arg1, false)) {
            return true;
        } else {
            return !class279.method1714(arg0, false);
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(ZLjava/lang/String;ZB)V", line = 58)
    public static final void method2591(boolean arg0, String arg1, boolean arg2, byte arg3) {
        field5980++;
        if (arg3 != 46) {
            method2590(10, -53, -85);
        }
        try {
            if (arg1.equalsIgnoreCase("commands") || arg1.equalsIgnoreCase("help")) {
                class789.method4318("commands - This command", false);
                class789.method4318("cls - Clear console", false);
                class789.method4318("displayfps - Toggle FPS and other information", false);
                class789.method4318("renderer - Print graphics renderer information", false);
                class789.method4318("heap - Print java memory information", false);
                return;
            }
            if (arg1.equalsIgnoreCase("cls")) {
                class184.field2591 = 0;
                class435.field5714 = 0;
                return;
            }
            if (arg1.equalsIgnoreCase("displayfps")) {
                class520.field6621 = !class520.field6621;
                if (class520.field6621) {
                    class789.method4318("FPS on", false);
                    return;
                }
                class789.method4318("FPS off", false);
                return;
            }
            if (arg1.equals("renderer")) {
                class291 var4 = class576.field7320.method927();
                class789.method4318("Vendor: " + var4.field3712, false);
                class789.method4318("Name: " + var4.field3707, false);
                class789.method4318("Version: " + var4.field3705, false);
                class789.method4318("Device: " + var4.field3709, false);
                class789.method4318("Driver Version: " + var4.field3706, false);
                return;
            }
            if (arg1.equals("heap")) {
                class789.method4318("Heap: " + class91.field1248 + "MB", false);
                return;
            }
        } catch (Exception var46) {
            class789.method4318(class659.field8545.method3589(class496.field6338, -22395), false);
            return;
        }
        if (class611.field7718 != class290.field3701 || class20.field186 >= 2) {
            if (arg1.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg1.equals("nativememerror")) {
                throw new OutOfMemoryError("native(MPR");
            }
            try {
                if (arg1.equalsIgnoreCase("printfps")) {
                    class789.method4318("FPS: " + class92.field1254, false);
                    return;
                }
                if (arg1.equalsIgnoreCase("occlude")) {
                    class750.field10229 = !class750.field10229;
                    if (class750.field10229) {
                        class789.method4318("Occlsion now on!", false);
                        return;
                    }
                    class789.method4318("Occlsion now off!", false);
                    return;
                }
                if (arg1.equalsIgnoreCase("fpson")) {
                    class520.field6621 = true;
                    class789.method4318("fps debug enabled", false);
                    return;
                }
                if (arg1.equalsIgnoreCase("fpsoff")) {
                    class520.field6621 = false;
                    class789.method4318("fps debug disabled", false);
                    return;
                }
                if (arg1.equals("systemmem")) {
                    try {
                        class789.method4318("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + class231.field3108.field4432 + "Mb", false);
                        return;
                    } catch (Throwable var40) {
                        return;
                    }
                }
                if (arg1.equalsIgnoreCase("cleartext")) {
                    class21.field195.method863(0);
                    class789.method4318("Text coords cleared", false);
                    return;
                }
                if (arg1.equalsIgnoreCase("gc")) {
                    class217.method1425(false);
                    for (int var5 = 0; var5 < 10; var5++) {
                        System.gc();
                    }
                    Runtime var6 = Runtime.getRuntime();
                    int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                    class789.method4318("mem=" + var7 + "k", false);
                    return;
                }
                if (arg1.equalsIgnoreCase("compact")) {
                    class217.method1425(false);
                    for (int var8 = 0; var8 < 10; var8++) {
                        System.gc();
                    }
                    Runtime var9 = Runtime.getRuntime();
                    int var10 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                    class789.method4318("Memory before cleanup=" + var10 + "k", false);
                    class450.method2566(28);
                    class217.method1425(false);
                    for (int var11 = 0; var11 < 10; var11++) {
                        System.gc();
                    }
                    int var12 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                    class789.method4318("Memory after cleanup=" + var12 + "k", false);
                    return;
                }
                if (arg1.equalsIgnoreCase("unloadnatives")) {
                    class789.method4318(class420.method2429(true) ? "Libraries unloaded" : "Library unloading failed!", false);
                    return;
                }
                if (arg1.equalsIgnoreCase("clientdrop")) {
                    class789.method4318("Dropped client connection", false);
                    if (class332.field4052 == 10) {
                        class638.method3447((byte) 67);
                        return;
                    }
                    if (class332.field4052 == 11) {
                        class711.field9392 = true;
                    }
                    return;
                }
                if (arg1.equalsIgnoreCase("rotateconnectmethods")) {
                    class379.field4640.method1602(arg3 + 79);
                    class789.method4318("Rotated connection methods", false);
                    return;
                }
                if (arg1.equalsIgnoreCase("clientjs5drop")) {
                    class722.field9484.method672(-124);
                    class789.method4318("Dropped client js5 net queue", false);
                    return;
                }
                if (arg1.equalsIgnoreCase("serverjs5drop")) {
                    class722.field9484.method684(109);
                    class789.method4318("Dropped server js5 net queue", false);
                    return;
                }
                if (arg1.equalsIgnoreCase("breakcon")) {
                    class740.field10014.method4237((byte) -124);
                    class252.field3437.method1815(-99);
                    class722.field9484.method674(true);
                    class789.method4318("Breaking new connections for 5 seconds", false);
                    return;
                }
                if (arg1.equalsIgnoreCase("rebuild")) {
                    class486.method2723(-8);
                    class493.method2749(false);
                    class789.method4318("Rebuilding map", false);
                    return;
                }
                if (arg1.equalsIgnoreCase("rebuildprofile")) {
                    class467.field6053 = class502.method2786(arg3 ^ 0xFFFFE418);
                    class196.field2727 = true;
                    class486.method2723(-8);
                    class493.method2749(false);
                    class789.method4318("Rebuilding map (with profiling)", false);
                    return;
                }
                if (arg1.equalsIgnoreCase("wm1")) {
                    class52.method329(-1, false, 1, -1, 0);
                    if (class400.method2313((byte) -101) == 1) {
                        class789.method4318("wm1 succeeded", false);
                        return;
                    }
                    class789.method4318("wm1 failed", false);
                    return;
                }
                if (arg1.equalsIgnoreCase("wm2")) {
                    class52.method329(-1, false, 2, -1, arg3 - 46);
                    if (class400.method2313((byte) -101) == 2) {
                        class789.method4318("wm2 succeeded", false);
                        return;
                    }
                    class789.method4318("wm2 failed", false);
                    return;
                }
                if (arg1.equalsIgnoreCase("wm3")) {
                    class52.method329(768, false, 3, 1024, 0);
                    if (class400.method2313((byte) -101) != 3) {
                        class789.method4318("wm3 failed", false);
                        return;
                    }
                    class789.method4318("wm3 succeeded", false);
                    return;
                }
                if (arg1.equalsIgnoreCase("tk0")) {
                    class432.method2483((byte) 76, 0, false);
                    if (class485.field6252.field6949.method2402(false) == 0) {
                        class789.method4318("Entered tk0", false);
                        class485.field6252.method2986(0, class485.field6252.field6922, (byte) 126);
                        class627.method3356(5);
                        class165.field2184 = false;
                        return;
                    }
                    class789.method4318("Failed to enter tk0", false);
                    return;
                }
                if (arg1.equalsIgnoreCase("tk1")) {
                    class432.method2483((byte) 76, 1, false);
                    if (class485.field6252.field6949.method2402(false) == 1) {
                        class789.method4318("Entered tk1", false);
                        class485.field6252.method2986(1, class485.field6252.field6922, (byte) -85);
                        class627.method3356(88);
                        class165.field2184 = false;
                        return;
                    }
                    class789.method4318("Failed to enter tk1", false);
                    return;
                }
                if (arg1.equalsIgnoreCase("tk2")) {
                    class432.method2483((byte) 76, 2, false);
                    if (class485.field6252.field6949.method2402(false) == 2) {
                        class789.method4318("Entered tk2", false);
                        class485.field6252.method2986(2, class485.field6252.field6922, (byte) 116);
                        class627.method3356(98);
                        class165.field2184 = false;
                        return;
                    }
                    class789.method4318("Failed to enter tk2", false);
                    return;
                }
                if (arg1.equalsIgnoreCase("tk3")) {
                    class432.method2483((byte) 76, 3, false);
                    if (class485.field6252.field6949.method2402(false) != 3) {
                        class789.method4318("Failed to enter tk3", false);
                        return;
                    }
                    class789.method4318("Entered tk3", false);
                    class485.field6252.method2986(3, class485.field6252.field6922, (byte) -109);
                    class627.method3356(arg3 ^ 0x1D);
                    class165.field2184 = false;
                    return;
                }
                if (arg1.equalsIgnoreCase("tk5")) {
                    class432.method2483((byte) 76, 5, false);
                    if (class485.field6252.field6949.method2402(false) == 5) {
                        class789.method4318("Entered tk5", false);
                        class485.field6252.method2986(5, class485.field6252.field6922, (byte) 120);
                        class627.method3356(arg3 + 36);
                        class165.field2184 = false;
                        return;
                    }
                    class789.method4318("Failed to enter tk5", false);
                    return;
                }
                if (arg1.startsWith("setba")) {
                    if (arg1.length() < 6) {
                        class789.method4318("Invalid buildarea value", false);
                        return;
                    }
                    int var13 = class530.method2908((byte) 37, arg1.substring(6));
                    if (var13 >= 0 && var13 <= class356.method2045(class91.field1248, true)) {
                        class485.field6252.method2986(var13, class485.field6252.field6916, (byte) -85);
                        class627.method3356(85);
                        class165.field2184 = false;
                        class789.method4318("maxbuildarea=" + class485.field6252.field6916.method1641(false), false);
                        return;
                    }
                    class789.method4318("Invalid buildarea value", false);
                    return;
                }
                if (arg1.startsWith("rect_debug")) {
                    if (arg1.length() < 10) {
                        class789.method4318("Invalid rect_debug value", false);
                        return;
                    }
                    class97.field1311 = class530.method2908((byte) 87, arg1.substring(10).trim());
                    class789.method4318("rect_debug=" + class97.field1311, false);
                    return;
                }
                if (arg1.equalsIgnoreCase("qa_op_test")) {
                    class538.field6782 = true;
                    class789.method4318("qa_op_test=" + class538.field6782, false);
                    return;
                }
                if (arg1.equalsIgnoreCase("clipcomponents")) {
                    class502.field6439 = !class502.field6439;
                    class789.method4318("clipcomponents=" + class502.field6439, false);
                    return;
                }
                if (arg1.startsWith("bloom")) {
                    boolean var14 = class576.field7320.method899();
                    if (class283.method1728(arg3 - 2317, !var14)) {
                        if (!var14) {
                            class789.method4318("Bloom enabled", false);
                            return;
                        }
                        class789.method4318("Bloom disabled", false);
                        return;
                    }
                    class789.method4318("Failed to enable bloom", false);
                    return;
                }
                if (arg1.equalsIgnoreCase("tween")) {
                    if (!class449.field5850) {
                        class449.field5850 = true;
                        class789.method4318("Forced tweening ENABLED!", false);
                        return;
                    }
                    class449.field5850 = false;
                    class789.method4318("Forced tweening disabled.", false);
                    return;
                }
                if (arg1.equalsIgnoreCase("shiftclick")) {
                    if (!class698.field9249) {
                        class789.method4318("Shift-click ENABLED!", false);
                        class698.field9249 = true;
                        return;
                    }
                    class789.method4318("Shift-click disabled.", false);
                    class698.field9249 = false;
                    return;
                }
                if (arg1.equalsIgnoreCase("getcgcoord")) {
                    class789.method4318("x:" + (class422.field5564.field2896 >> 9) + " z:" + (class422.field5564.field2900 >> 9), false);
                    return;
                }
                if (arg1.equalsIgnoreCase("getheight")) {
                    class789.method4318("Height: " + class116.field1542[class422.field5564.field2895].method2060(class422.field5564.field2900 >> 9, -121, class422.field5564.field2896 >> 9), false);
                    return;
                }
                if (arg1.equalsIgnoreCase("resetminimap")) {
                    class172.field2270.method132(-80);
                    class172.field2270.method155(false);
                    class702.field9289.method2695((byte) 115);
                    class272.field3575.method2324(107);
                    class493.method2749(false);
                    class789.method4318("Minimap reset", false);
                    return;
                }
                if (arg1.startsWith("mc")) {
                    if (class576.field7320.method906()) {
                        int var15 = Integer.parseInt(arg1.substring(3));
                        if (var15 < 1) {
                            var15 = 1;
                        } else if (var15 > 4) {
                            var15 = 4;
                        }
                        class788.field10791 = var15;
                        class486.method2723(-8);
                        class789.method4318("Render cores now: " + class788.field10791, false);
                        return;
                    }
                    class789.method4318("Current toolkit doesn't support multiple cores", false);
                    return;
                }
                if (arg1.startsWith("cachespace")) {
                    class789.method4318("I(s): " + class294.field3738.method2924(-1) + "/" + class294.field3738.method2926(-14046), false);
                    class789.method4318("I(m): " + class282.field3656.method2924(-1) + "/" + class282.field3656.method2926(arg3 ^ 0xFFFFC90C), false);
                    class789.method4318("O(s): " + class640.field8189.field1579.method3464(-124) + "/" + class640.field8189.field1579.method3453(9653), false);
                    return;
                }
                if (arg1.equalsIgnoreCase("getcamerapos")) {
                    class789.method4318("Pos: " + class422.field5564.field2895 + "," + ((class97.field1309 >> 9) + class714.field9407 >> 6) + "," + ((class148.field1890 >> 9) + class240.field3293 >> 6) + "," + ((class97.field1309 >> 9) + class714.field9407 & 0x3F) + "," + ((class148.field1890 >> 9) + class240.field3293 & 0x3F) + " Height: " + (class512.method2831(class422.field5564.field2895, (byte) -87, class97.field1309, class148.field1890) - class439.field5770), false);
                    class789.method4318("Look: " + class422.field5564.field2895 + "," + (class714.field9407 + class285.field3668 >> 6) + "," + (class650.field8287 + class240.field3293 >> 6) + "," + (class714.field9407 + class285.field3668 & 0x3F) + "," + (class650.field8287 + class240.field3293 & 0x3F) + " Height: " + (class512.method2831(class422.field5564.field2895, (byte) 49, class285.field3668, class650.field8287) - class240.field3277), false);
                    return;
                }
                if (arg1.equals("renderprofile") || arg1.equals("rp")) {
                    class625.field7958 = !class625.field7958;
                    class576.field7320.method934(class625.field7958);
                    class498.method2767(10178);
                    class789.method4318("showprofiling=" + class625.field7958, false);
                    return;
                }
                if (arg1.startsWith("performancetest")) {
                    int var16 = -1;
                    int var17 = 1000;
                    if (arg1.length() > 15) {
                        String[] var18 = class340.method1966(1, ' ', arg1);
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
                    if (var16 != -1) {
                        class789.method4318("Performance: " + class490.method2737(var17, var16, -99), false);
                        return;
                    }
                    class789.method4318("Java toolkit: " + class490.method2737(var17, 0, -77), false);
                    class789.method4318("SSE toolkit:  " + class490.method2737(var17, 2, -55), false);
                    class789.method4318("D3D toolkit:  " + class490.method2737(var17, 3, -52), false);
                    class789.method4318("GL toolkit:   " + class490.method2737(var17, 1, -101), false);
                    class789.method4318("GLX toolkit:  " + class490.method2737(var17, 5, -65), false);
                    return;
                }
                if (arg1.equals("nonpcs")) {
                    class480.field6205 = !class480.field6205;
                    class789.method4318("nonpcs=" + class480.field6205, false);
                    return;
                }
                if (arg1.equals("autoworld")) {
                    class283.method1729((byte) -58);
                    class789.method4318("auto world selected", false);
                    return;
                }
                if (arg1.startsWith("switchworld")) {
                    int var19 = Integer.parseInt(arg1.substring(12));
                    class186.method1313(true, var19, class190.method1331(var19, 7484).field3101);
                    class789.method4318("switched", false);
                    return;
                }
                if (arg1.equals("getworld")) {
                    class789.method4318("w: " + class379.field4640.field3371, false);
                    return;
                }
                if (arg1.startsWith("pc")) {
                    class13 var20 = class659.method3587(class68.field909, 98, class3.field16);
                    var20.field130.method1491(-129, 0);
                    int var21 = var20.field130.field3133;
                    int var22 = arg1.indexOf(" ", 4);
                    var20.field130.method1547(arg1.substring(3, var22), arg3 - 6503);
                    class292.method1763(var20.field130, arg1.substring(var22), (byte) 53);
                    var20.field130.method1532(var20.field130.field3133 - var21, arg3 + 49);
                    class116.method679(var20, 0);
                    return;
                }
                if (arg1.equals("savevarcs")) {
                    class399.method2308((byte) 84);
                    class789.method4318("perm varcs saved", false);
                    return;
                }
                if (arg1.equals("scramblevarcs")) {
                    for (int var23 = 0; var23 < class176.field2317.length; var23++) {
                        if (class681.field8791[var23]) {
                            class176.field2317[var23] = (int) (Math.random() * 99999.0D);
                            if (Math.random() > 0.5D) {
                                class176.field2317[var23] *= -1;
                            }
                        }
                    }
                    class399.method2308((byte) 102);
                    class789.method4318("perm varcs scrambled", false);
                    return;
                }
                if (arg1.equals("showcolmap")) {
                    class171.field2263 = true;
                    class493.method2749(false);
                    class789.method4318("colmap is shown", false);
                    return;
                }
                if (arg1.equals("hidecolmap")) {
                    class171.field2263 = false;
                    class493.method2749(false);
                    class789.method4318("colmap is hidden", false);
                    return;
                }
                if (arg1.equals("resetcache")) {
                    class146.method836(0);
                    class789.method4318("Caches reset", false);
                    return;
                }
                if (arg1.equals("profilecpu")) {
                    class789.method4318(class365.method2101(100) + "ms", false);
                    return;
                }
                if (arg1.startsWith("getclientvarpbit")) {
                    int var24 = Integer.parseInt(arg1.substring(17));
                    class789.method4318("varpbit=" + class381.field4705.method1467(false, var24), false);
                    return;
                }
                if (arg1.startsWith("getclientvarp")) {
                    int var25 = Integer.parseInt(arg1.substring(14));
                    class789.method4318("varp=" + class381.field4705.method1469(var25, 102), false);
                    return;
                }
                if (arg1.startsWith("directlogin")) {
                    String[] var26 = class340.method1966(arg3 - 45, ' ', arg1.substring(12));
                    if (var26.length >= 2) {
                        int var27 = var26.length > 2 ? Integer.parseInt(var26[2]) : 0;
                        class369.method2120(var26[1], var27, (byte) -13, var26[0]);
                        return;
                    }
                }
                if (arg1.startsWith("csprofileclear")) {
                    class760.method4151();
                    return;
                }
                if (arg1.startsWith("csprofileoutputc")) {
                    class760.method4146(100, false);
                    return;
                }
                if (arg1.startsWith("csprofileoutputt")) {
                    class760.method4146(10, true);
                    return;
                }
                if (arg1.startsWith("texsize")) {
                    int var28 = Integer.parseInt(arg1.substring(8));
                    class576.field7320.method989(var28);
                    return;
                }
                if (arg1.equals("soundstreamcount")) {
                    class789.method4318("Active streams: " + class1.field10.method35(), false);
                    return;
                }
                if (arg1.equals("autosetup")) {
                    class709.method3831(arg3 - 165);
                    class789.method4318("Complete. Toolkit now: " + class485.field6252.field6949.method2402(false), false);
                    return;
                }
                if (arg1.equals("errormessage")) {
                    class789.method4318(class102.field1382.method2621((byte) 125), false);
                    return;
                }
                if (arg1.equals("heapdump")) {
                    if (class775.field10561.startsWith("win")) {
                        class100.method576(new File("C:\\Temp\\heap.dump"), arg3 ^ 0x60, false);
                    } else {
                        class100.method576(new File("/tmp/heap.dump"), arg3 ^ 0xFFFFFFE8, false);
                    }
                    class789.method4318("Done", false);
                    return;
                }
                if (arg1.equals("os")) {
                    class789.method4318("Name: " + class775.field10561, false);
                    class789.method4318("Arch: " + class775.field10564, false);
                    class789.method4318("Ver: " + class775.field10579, false);
                    return;
                }
                if (arg1.startsWith("w2debug")) {
                    int var29 = Integer.parseInt(arg1.substring(8, 9));
                    class5.field60 = var29;
                    class486.method2723(arg3 ^ 0xFFFFFFD6);
                    class789.method4318("Toggled!", false);
                    return;
                }
                if (arg1.startsWith("ortho ")) {
                    int var30 = arg1.indexOf(32);
                    if (var30 < 0) {
                        class789.method4318("Syntax: ortho <n>", false);
                        return;
                    }
                    int var31 = class530.method2908((byte) 84, arg1.substring(var30 + 1));
                    class485.field6252.method2986(var31, class485.field6252.field6927, (byte) 112);
                    class627.method3356(91);
                    class165.field2184 = false;
                    class243.method1597(2);
                    if (var31 != class485.field6252.field6927.method1821(false)) {
                        class789.method4318("Failed to change ortho mode", false);
                        return;
                    }
                    class789.method4318("Successfully changed ortho mode", false);
                    return;
                }
                if (arg1.startsWith("orthozoom ")) {
                    if (class485.field6252.field6927.method1821(false) == 0) {
                        class789.method4318("enable ortho mode first (use 'ortho <n>')", false);
                        return;
                    }
                    int var32 = class530.method2908((byte) 68, arg1.substring(arg1.indexOf(32) + 1));
                    class628.field7979 = var32;
                    class789.method4318("orthozoom=" + class628.field7979, false);
                    return;
                }
                if (arg1.startsWith("orthotilesize ")) {
                    int var33 = class530.method2908((byte) -125, arg1.substring(arg1.indexOf(32) + 1));
                    class784.field10742 = var33;
                    class611.field7717 = var33;
                    class789.method4318("ortho tile size=" + var33, false);
                    class243.method1597(2);
                    return;
                }
                if (arg1.equals("orthocamlock")) {
                    class575.field7308 = !class575.field7308;
                    class789.method4318("ortho camera lock is " + (class575.field7308 ? "on" : "off"), false);
                    return;
                }
                if (arg1.startsWith("setoutput ")) {
                    File var34 = new File(arg1.substring(10));
                    if (var34.exists()) {
                        var34 = new File(arg1.substring(10) + "." + class502.method2786(-7114) + ".log");
                        if (var34.exists()) {
                            class789.method4318("file already exists!", false);
                            return;
                        }
                    }
                    if (class659.field8608 != null) {
                        class659.field8608.close();
                        class659.field8608 = null;
                    }
                    try {
                        class659.field8608 = new FileOutputStream(var34);
                        return;
                    } catch (FileNotFoundException var43) {
                        class789.method4318("Could not create " + var34.getName(), false);
                        return;
                    } catch (SecurityException var44) {
                        class789.method4318("Cannot write to " + var34.getName(), false);
                        return;
                    }
                }
                if (arg1.equals("closeoutput")) {
                    if (class659.field8608 != null) {
                        class659.field8608.close();
                    }
                    class659.field8608 = null;
                    return;
                }
                if (arg1.startsWith("runscript ")) {
                    File var35 = new File(arg1.substring(10));
                    if (!var35.exists()) {
                        class789.method4318("No such file", false);
                        return;
                    }
                    byte[] var36 = class500.method2773((byte) 72, var35);
                    if (var36 == null) {
                        class789.method4318("Failed to read file", false);
                        return;
                    }
                    String[] var37 = class340.method1966(arg3 ^ 0x2F, '\n', class30.method153(12724, '\r', "", class316.method1849(-123, var36)));
                    class627.method3351(-603633050, var37);
                }
                if (arg1.startsWith("zoom ")) {
                    short var38 = (short) class530.method2908((byte) -111, arg1.substring(5));
                    if (var38 > 0) {
                        class178.field2341 = var38;
                    }
                    return;
                }
                if (class332.field4052 == 10) {
                    class509.field6501++;
                    class13 var39 = class659.method3587(class68.field909, 98, class171.field2266);
                    var39.field130.method1491(-129, arg1.length() + 3);
                    var39.field130.method1491(-129, arg0 ? 1 : 0);
                    var39.field130.method1491(-129, arg2 ? 1 : 0);
                    var39.field130.method1547(arg1, -6457);
                    class116.method679(var39, arg3 ^ 0x2E);
                }
                if (arg1.startsWith("fps ") && class611.field7718 != class290.field3701) {
                    class562.method3044(class530.method2908((byte) 65, arg1.substring(4)), 70);
                    return;
                }
            } catch (Exception var45) {
                class789.method4318(class659.field8545.method3589(class496.field6338, -22395), false);
                return;
            }
        }
        if (class332.field4052 != 10) {
            class789.method4318(class659.field8546.method3589(class496.field6338, arg3 ^ 0xFFFFA8AB) + arg1, false);
        }
    }
}
