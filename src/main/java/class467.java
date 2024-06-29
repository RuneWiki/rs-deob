import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class467 {

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "Laq;")
    public class494 field6373 = new class494(20);

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "Laq;")
    private class494 field6378 = new class494(64);

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "Lgga;")
    public class513 field6368;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "Lgga;")
    private class513 field6377;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "[J")
    public static long[] field6367 = new long[32];

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
    public static int field6372 = 0;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "[I")
    public static int[] field6374 = new int[1];

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public static int field6369;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public static int field6370;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
    public static int field6371;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public static int field6375;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
    public static int field6376;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)V")
    public final void method2729(boolean arg0) {
        class494 var2 = this.field6378;
        synchronized (this.field6378) {
            this.field6378.method2881((byte) -121);
        }
        field6376++;
        class494 var3 = this.field6373;
        synchronized (this.field6373) {
            this.field6373.method2881((byte) -29);
        }
        if (!arg0) {
            field6367 = null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZZLjava/lang/String;I)V")
    public static final void method2730(boolean arg0, boolean arg1, String arg2, int arg3) {
        field6370++;
        try {
            if (arg2.equalsIgnoreCase("commands") || arg2.equalsIgnoreCase("help")) {
                class30.method251(false, "commands - This command");
                class30.method251(false, "cls - Clear console");
                class30.method251(false, "displayfps - Toggle FPS and other information");
                class30.method251(false, "renderer - Print graphics renderer information");
                class30.method251(false, "heap - Print java memory information");
                return;
            }
            if (arg2.equalsIgnoreCase("cls")) {
                class719.field10037 = 0;
                class442.field6126 = 0;
                return;
            }
            if (arg2.equalsIgnoreCase("displayfps")) {
                class530.field7378 = !class530.field7378;
                if (!class530.field7378) {
                    class30.method251(false, "FPS off");
                    return;
                }
                class30.method251(false, "FPS on");
                return;
            }
            if (arg2.equals("renderer")) {
                class165 var4 = class686.field9702.method108();
                class30.method251(false, "Vendor: " + var4.field2520);
                class30.method251(false, "Name: " + var4.field2518);
                class30.method251(false, "Version: " + var4.field2519);
                class30.method251(false, "Device: " + var4.field2522);
                class30.method251(false, "Driver Version: " + var4.field2521);
                return;
            }
            if (arg2.equals("heap")) {
                class30.method251(false, "Heap: " + class139.field2293 + "MB");
                return;
            }
        } catch (Exception var46) {
            class30.method251(false, class563.field7800.method3281(class423.field5892, arg3 - 11));
            return;
        }
        if (class94.field1340 != class145.field2353 || class778.field10675 >= 2) {
            if (arg2.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg2.equals("nativememerror")) {
                throw new OutOfMemoryError("native(MPR");
            }
            try {
                if (arg2.equalsIgnoreCase("printfps")) {
                    class30.method251(false, "FPS: " + class458.field6265);
                    return;
                }
                if (arg2.equalsIgnoreCase("occlude")) {
                    class83.field1263 = !class83.field1263;
                    if (!class83.field1263) {
                        class30.method251(false, "Occlsion now off!");
                        return;
                    }
                    class30.method251(false, "Occlsion now on!");
                    return;
                }
                if (arg2.equalsIgnoreCase("fpson")) {
                    class530.field7378 = true;
                    class30.method251(false, "fps debug enabled");
                    return;
                }
                if (arg2.equalsIgnoreCase("fpsoff")) {
                    class530.field7378 = false;
                    class30.method251(false, "fps debug disabled");
                    return;
                }
                if (arg2.equals("systemmem")) {
                    try {
                        class30.method251(false, "System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + class63.field964.field10844 + "Mb");
                        return;
                    } catch (Throwable var40) {
                        return;
                    }
                }
                if (arg2.equalsIgnoreCase("cleartext")) {
                    class383.field5370.method1731(86);
                    class30.method251(false, "Text coords cleared");
                    return;
                }
                if (arg2.equalsIgnoreCase("gc")) {
                    class368.method2198(2);
                    for (int var5 = 0; var5 < 10; var5++) {
                        System.gc();
                    }
                    Runtime var6 = Runtime.getRuntime();
                    int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                    class30.method251(false, "mem=" + var7 + "k");
                    return;
                }
                if (arg2.equalsIgnoreCase("compact")) {
                    class368.method2198(arg3 - 8);
                    for (int var8 = 0; var8 < 10; var8++) {
                        System.gc();
                    }
                    Runtime var9 = Runtime.getRuntime();
                    int var10 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                    class30.method251(false, "Memory before cleanup=" + var10 + "k");
                    class12.method160((byte) 93);
                    class368.method2198(2);
                    for (int var11 = 0; var11 < 10; var11++) {
                        System.gc();
                    }
                    int var12 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                    class30.method251(false, "Memory after cleanup=" + var12 + "k");
                    return;
                }
                if (arg2.equalsIgnoreCase("unloadnatives")) {
                    class30.method251(false, class316.method1926(7957) ? "Libraries unloaded" : "Library unloading failed!");
                    return;
                }
                if (arg2.equalsIgnoreCase("clientdrop")) {
                    class30.method251(false, "Dropped client connection");
                    if (class141.field2306 == 10) {
                        class317.method1929(13);
                    } else if (class141.field2306 == 11) {
                        class244.field3488 = true;
                        return;
                    }
                    return;
                }
                if (arg2.equalsIgnoreCase("rotateconnectmethods")) {
                    class472.field6424.method2406(arg3 + 10);
                    class30.method251(false, "Rotated connection methods");
                    return;
                }
                if (arg2.equalsIgnoreCase("clientjs5drop")) {
                    class138.field2286.method1846((byte) -110);
                    class30.method251(false, "Dropped client js5 net queue");
                    return;
                }
                if (arg2.equalsIgnoreCase("serverjs5drop")) {
                    class138.field2286.method1836(-6630);
                    class30.method251(false, "Dropped server js5 net queue");
                    return;
                }
                if (arg2.equalsIgnoreCase("breakcon")) {
                    class336.field4775.method911(arg3 + 4990);
                    class600.field8551.method182(-1);
                    class138.field2286.method1848(1379);
                    class30.method251(false, "Breaking new connections for 5 seconds");
                    return;
                }
                if (arg2.equalsIgnoreCase("rebuild")) {
                    class473.method2764((byte) 62);
                    class726.method4025(false);
                    class30.method251(false, "Rebuilding map");
                    return;
                }
                if (arg2.equalsIgnoreCase("rebuildprofile")) {
                    class778.field10680 = class337.method2062(false);
                    class184.field2794 = true;
                    class473.method2764((byte) -89);
                    class726.method4025(false);
                    class30.method251(false, "Rebuilding map (with profiling)");
                    return;
                }
                if (arg2.equalsIgnoreCase("wm1")) {
                    class548.method3169(-1, -8361, 1, -1, false);
                    if (class388.method2333((byte) 47) != 1) {
                        class30.method251(false, "wm1 failed");
                        return;
                    }
                    class30.method251(false, "wm1 succeeded");
                    return;
                }
                if (arg2.equalsIgnoreCase("wm2")) {
                    class548.method3169(-1, -8361, 2, -1, false);
                    if (class388.method2333((byte) 47) != 2) {
                        class30.method251(false, "wm2 failed");
                        return;
                    }
                    class30.method251(false, "wm2 succeeded");
                    return;
                }
                if (arg2.equalsIgnoreCase("wm3")) {
                    class548.method3169(1024, -8361, 3, 768, false);
                    if (class388.method2333((byte) 47) != 3) {
                        class30.method251(false, "wm3 failed");
                        return;
                    }
                    class30.method251(false, "wm3 succeeded");
                    return;
                }
                if (arg2.equalsIgnoreCase("tk0")) {
                    class636.method3625(false, 0, -30);
                    if (class420.field5820.field9482.method2338(17539) != 0) {
                        class30.method251(false, "Failed to enter tk0");
                        return;
                    }
                    class30.method251(false, "Entered tk0");
                    class420.field5820.method3781(class420.field5820.field9466, 72, 0);
                    class95.method797(-113);
                    class356.field5069 = false;
                    return;
                }
                if (arg2.equalsIgnoreCase("tk1")) {
                    class636.method3625(false, 1, 117);
                    if (class420.field5820.field9482.method2338(arg3 + 17529) == 1) {
                        class30.method251(false, "Entered tk1");
                        class420.field5820.method3781(class420.field5820.field9466, arg3 + 97, 1);
                        class95.method797(arg3 + 98);
                        class356.field5069 = false;
                        return;
                    }
                    class30.method251(false, "Failed to enter tk1");
                    return;
                }
                if (arg2.equalsIgnoreCase("tk2")) {
                    class636.method3625(false, 2, arg3 ^ 0xFFFFFFD4);
                    if (class420.field5820.field9482.method2338(17539) == 2) {
                        class30.method251(false, "Entered tk2");
                        class420.field5820.method3781(class420.field5820.field9466, 114, 2);
                        class95.method797(125);
                        class356.field5069 = false;
                        return;
                    }
                    class30.method251(false, "Failed to enter tk2");
                    return;
                }
                if (arg2.equalsIgnoreCase("tk3")) {
                    class636.method3625(false, 3, arg3 ^ 0x77);
                    if (class420.field5820.field9482.method2338(17539) != 3) {
                        class30.method251(false, "Failed to enter tk3");
                        return;
                    }
                    class30.method251(false, "Entered tk3");
                    class420.field5820.method3781(class420.field5820.field9466, 76, 3);
                    class95.method797(arg3 ^ 0xFFFFFF81);
                    class356.field5069 = false;
                    return;
                }
                if (arg2.equalsIgnoreCase("tk5")) {
                    class636.method3625(false, 5, -28);
                    if (class420.field5820.field9482.method2338(17539) == 5) {
                        class30.method251(false, "Entered tk5");
                        class420.field5820.method3781(class420.field5820.field9466, 125, 5);
                        class95.method797(86);
                        class356.field5069 = false;
                        return;
                    }
                    class30.method251(false, "Failed to enter tk5");
                    return;
                }
                if (arg2.startsWith("setba")) {
                    if (arg2.length() < 6) {
                        class30.method251(false, "Invalid buildarea value");
                        return;
                    }
                    int var13 = class185.method1340(arg2.substring(6), (byte) 97);
                    if (var13 >= 0 && var13 <= class50.method392(-1, class139.field2293)) {
                        class420.field5820.method3781(class420.field5820.field9461, arg3 ^ 0x7A, var13);
                        class95.method797(83);
                        class356.field5069 = false;
                        class30.method251(false, "maxbuildarea=" + class420.field5820.field9461.method3934(17539));
                        return;
                    }
                    class30.method251(false, "Invalid buildarea value");
                    return;
                }
                if (arg2.startsWith("rect_debug")) {
                    if (arg2.length() < 10) {
                        class30.method251(false, "Invalid rect_debug value");
                        return;
                    }
                    class707.field9903 = class185.method1340(arg2.substring(10).trim(), (byte) 122);
                    class30.method251(false, "rect_debug=" + class707.field9903);
                    return;
                }
                if (arg2.equalsIgnoreCase("qa_op_test")) {
                    class346.field4929 = true;
                    class30.method251(false, "qa_op_test=" + class346.field4929);
                    return;
                }
                if (arg2.equalsIgnoreCase("clipcomponents")) {
                    class422.field5870 = !class422.field5870;
                    class30.method251(false, "clipcomponents=" + class422.field5870);
                    return;
                }
                if (arg2.startsWith("bloom")) {
                    boolean var14 = class686.field9702.method99();
                    if (!class222.method1524(!var14, (byte) -117)) {
                        class30.method251(false, "Failed to enable bloom");
                        return;
                    }
                    if (!var14) {
                        class30.method251(false, "Bloom enabled");
                        return;
                    }
                    class30.method251(false, "Bloom disabled");
                    return;
                }
                if (arg2.equalsIgnoreCase("tween")) {
                    if (class568.field7904) {
                        class568.field7904 = false;
                        class30.method251(false, "Forced tweening disabled.");
                        return;
                    }
                    class568.field7904 = true;
                    class30.method251(false, "Forced tweening ENABLED!");
                    return;
                }
                if (arg2.equalsIgnoreCase("shiftclick")) {
                    if (!class553.field7666) {
                        class30.method251(false, "Shift-click ENABLED!");
                        class553.field7666 = true;
                        return;
                    }
                    class30.method251(false, "Shift-click disabled.");
                    class553.field7666 = false;
                    return;
                }
                if (arg2.equalsIgnoreCase("getcgcoord")) {
                    class30.method251(false, "x:" + (class719.field10041.field10347 >> 9) + " z:" + (class719.field10041.field10350 >> 9));
                    return;
                }
                if (arg2.equalsIgnoreCase("getheight")) {
                    class30.method251(false, "Height: " + class678.field9594[class719.field10041.field10361].method2476(class719.field10041.field10350 >> 9, class719.field10041.field10347 >> 9, -1));
                    return;
                }
                if (arg2.equalsIgnoreCase("resetminimap")) {
                    class176.field2648.method2999(false);
                    class176.field2648.method2992((byte) 123);
                    class309.field4401.method655(true);
                    class451.field6195.method4110(-9740);
                    class726.method4025(false);
                    class30.method251(false, "Minimap reset");
                    return;
                }
                if (arg2.startsWith("mc")) {
                    if (!class686.field9702.method424()) {
                        class30.method251(false, "Current toolkit doesn't support multiple cores");
                        return;
                    }
                    int var15 = Integer.parseInt(arg2.substring(3));
                    if (var15 < 1) {
                        var15 = 1;
                    } else if (var15 > 4) {
                        var15 = 4;
                    }
                    class261.field3701 = var15;
                    class473.method2764((byte) -97);
                    class30.method251(false, "Render cores now: " + class261.field3701);
                    return;
                }
                if (arg2.startsWith("cachespace")) {
                    class30.method251(false, "I(s): " + class589.field8465.method2892(115) + "/" + class589.field8465.method2889(1));
                    class30.method251(false, "I(m): " + class87.field1292.method2892(113) + "/" + class87.field1292.method2889(1));
                    class30.method251(false, "O(s): " + class422.field5873.field6910.method2302(26399) + "/" + class422.field5873.field6910.method2312(-121));
                    return;
                }
                if (arg2.equalsIgnoreCase("getcamerapos")) {
                    class30.method251(false, "Pos: " + class719.field10041.field10361 + "," + ((class733.field10199 >> 9) + class222.field3266 >> 6) + "," + ((class286.field4204 >> 9) + class697.field9798 >> 6) + "," + ((class733.field10199 >> 9) + class222.field3266 & 0x3F) + "," + ((class286.field4204 >> 9) + class697.field9798 & 0x3F) + " Height: " + (class577.method3399(class286.field4204, class733.field10199, arg3 - 8734, class719.field10041.field10361) - class243.field3482));
                    class30.method251(false, "Look: " + class719.field10041.field10361 + "," + (class355.field5022 + class222.field3266 >> 6) + "," + (class697.field9798 + class410.field5616 >> 6) + "," + (class355.field5022 + class222.field3266 & 0x3F) + "," + (class697.field9798 + class410.field5616 & 0x3F) + " Height: " + (class577.method3399(class410.field5616, class355.field5022, -8724, class719.field10041.field10361) - class142.field2317));
                    return;
                }
                if (arg2.equals("renderprofile") || arg2.equals("rp")) {
                    class359.field5086 = !class359.field5086;
                    class686.field9702.method137(class359.field5086);
                    class647.method3661((byte) 50);
                    class30.method251(false, "showprofiling=" + class359.field5086);
                    return;
                }
                if (arg2.startsWith("performancetest")) {
                    int var16 = -1;
                    int var17 = 1000;
                    if (arg2.length() > 15) {
                        String[] var18 = class544.method3151((byte) -119, ' ', arg2);
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
                        class30.method251(false, "Performance: " + class742.method4090(var17, (byte) -112, var16));
                        return;
                    }
                    class30.method251(false, "Java toolkit: " + class742.method4090(var17, (byte) -116, 0));
                    class30.method251(false, "SSE toolkit:  " + class742.method4090(var17, (byte) -127, 2));
                    class30.method251(false, "D3D toolkit:  " + class742.method4090(var17, (byte) -123, 3));
                    class30.method251(false, "GL toolkit:   " + class742.method4090(var17, (byte) -126, 1));
                    class30.method251(false, "GLX toolkit:  " + class742.method4090(var17, (byte) -113, 5));
                    return;
                }
                if (arg2.equals("nonpcs")) {
                    class508.field6986 = !class508.field6986;
                    class30.method251(false, "nonpcs=" + class508.field6986);
                    return;
                }
                if (arg2.equals("autoworld")) {
                    class302.method1877(arg3 ^ 0xF);
                    class30.method251(false, "auto world selected");
                    return;
                }
                if (arg2.startsWith("switchworld")) {
                    int var19 = Integer.parseInt(arg2.substring(12));
                    class293.method1857(var19, class630.method3595(26316, var19).field5868, arg3 - 8);
                    class30.method251(false, "switched");
                    return;
                }
                if (arg2.equals("getworld")) {
                    class30.method251(false, "w: " + class472.field6424.field5598);
                    return;
                }
                if (arg2.startsWith("pc")) {
                    class302 var20 = class582.method3419(class451.field6194, (byte) 127, class626.field8901);
                    var20.field4341.method2524(false, 0);
                    int var21 = var20.field4341.field5983;
                    int var22 = arg2.indexOf(" ", 4);
                    var20.field4341.method2566(arg3 - 12, arg2.substring(3, var22));
                    class339.method2071(arg2.substring(var22), var20.field4341, true);
                    var20.field4341.method2571(-1350378040, var20.field4341.field5983 - var21);
                    class501.method2928(0, var20);
                    return;
                }
                if (arg2.equals("savevarcs")) {
                    class203.method1433(arg3 ^ 0x3F);
                    class30.method251(false, "perm varcs saved");
                    return;
                }
                if (arg2.equals("scramblevarcs")) {
                    for (int var23 = 0; var23 < class362.field5135.length; var23++) {
                        if (class769.field10616[var23]) {
                            class362.field5135[var23] = (int) (Math.random() * 99999.0D);
                            if (Math.random() > 0.5D) {
                                class362.field5135[var23] *= -1;
                            }
                        }
                    }
                    class203.method1433(53);
                    class30.method251(false, "perm varcs scrambled");
                    return;
                }
                if (arg2.equals("showcolmap")) {
                    class164.field2512 = true;
                    class726.method4025(false);
                    class30.method251(false, "colmap is shown");
                    return;
                }
                if (arg2.equals("hidecolmap")) {
                    class164.field2512 = false;
                    class726.method4025(false);
                    class30.method251(false, "colmap is hidden");
                    return;
                }
                if (arg2.equals("resetcache")) {
                    class727.method4035(-108);
                    class30.method251(false, "Caches reset");
                    return;
                }
                if (arg2.equals("profilecpu")) {
                    class30.method251(false, class686.method3874((byte) -127) + "ms");
                    return;
                }
                if (arg2.startsWith("getclientvarpbit")) {
                    int var24 = Integer.parseInt(arg2.substring(17));
                    class30.method251(false, "varpbit=" + class578.field8328.method2863((byte) -100, var24));
                    return;
                }
                if (arg2.startsWith("getclientvarp")) {
                    int var25 = Integer.parseInt(arg2.substring(14));
                    class30.method251(false, "varp=" + class578.field8328.method2864(5, var25));
                    return;
                }
                if (arg2.startsWith("directlogin")) {
                    String[] var26 = class544.method3151((byte) 119, ' ', arg2.substring(12));
                    if (var26.length >= 2) {
                        int var27 = var26.length > 2 ? Integer.parseInt(var26[2]) : 0;
                        class594.method3469(var27, var26[1], var26[0], arg3 ^ 0xFFFFFFF5);
                        return;
                    }
                }
                if (arg2.startsWith("csprofileclear")) {
                    class46.method348();
                    return;
                }
                if (arg2.startsWith("csprofileoutputc")) {
                    class46.method346(100, false);
                    return;
                }
                if (arg2.startsWith("csprofileoutputt")) {
                    class46.method346(10, true);
                    return;
                }
                if (arg2.startsWith("texsize")) {
                    int var28 = Integer.parseInt(arg2.substring(8));
                    class686.field9702.method470(var28);
                    return;
                }
                if (arg2.equals("soundstreamcount")) {
                    class30.method251(false, "Active streams: " + class234.field3399.method4224());
                    return;
                }
                if (arg2.equals("autosetup")) {
                    class341.method2095(-112);
                    class30.method251(false, "Complete. Toolkit now: " + class420.field5820.field9482.method2338(arg3 ^ 0x4489));
                    return;
                }
                if (arg2.equals("errormessage")) {
                    class30.method251(false, class199.field2988.method898((byte) -101));
                    return;
                }
                if (arg2.equals("heapdump")) {
                    if (class111.field1584.startsWith("win")) {
                        class728.method4045((byte) -122, new File("C:\\Temp\\heap.dump"), false);
                    } else {
                        class728.method4045((byte) 67, new File("/tmp/heap.dump"), false);
                    }
                    class30.method251(false, "Done");
                    return;
                }
                if (arg2.equals("os")) {
                    class30.method251(false, "Name: " + class111.field1584);
                    class30.method251(false, "Arch: " + class111.field1596);
                    class30.method251(false, "Ver: " + class111.field1597);
                    return;
                }
                if (arg2.startsWith("w2debug")) {
                    int var29 = Integer.parseInt(arg2.substring(8, 9));
                    class423.field5888 = var29;
                    class473.method2764((byte) 75);
                    class30.method251(false, "Toggled!");
                    return;
                }
                if (arg2.startsWith("ortho ")) {
                    int var30 = arg2.indexOf(32);
                    if (var30 < 0) {
                        class30.method251(false, "Syntax: ortho <n>");
                        return;
                    }
                    int var31 = class185.method1340(arg2.substring(var30 + 1), (byte) 101);
                    class420.field5820.method3781(class420.field5820.field9469, 123, var31);
                    class95.method797(99);
                    class356.field5069 = false;
                    class134.method1110((byte) 105);
                    if (class420.field5820.field9469.method2839(arg3 + 17529) == var31) {
                        class30.method251(false, "Successfully changed ortho mode");
                        return;
                    }
                    class30.method251(false, "Failed to change ortho mode");
                    return;
                }
                if (arg2.startsWith("orthozoom ")) {
                    if (class420.field5820.field9469.method2839(17539) == 0) {
                        class30.method251(false, "enable ortho mode first (use 'ortho <n>')");
                        return;
                    }
                    int var32 = class185.method1340(arg2.substring(arg2.indexOf(32) + 1), (byte) 44);
                    class349.field4948 = var32;
                    class30.method251(false, "orthozoom=" + class349.field4948);
                    return;
                }
                if (arg2.startsWith("orthotilesize ")) {
                    int var33 = class185.method1340(arg2.substring(arg2.indexOf(32) + 1), (byte) 20);
                    class737.field10234 = var33;
                    class492.field6745 = var33;
                    class30.method251(false, "ortho tile size=" + var33);
                    class134.method1110((byte) 104);
                    return;
                }
                if (arg2.equals("orthocamlock")) {
                    class347.field4935 = !class347.field4935;
                    class30.method251(false, "ortho camera lock is " + (class347.field4935 ? "on" : "off"));
                    return;
                }
                if (arg2.startsWith("setoutput ")) {
                    File var34 = new File(arg2.substring(10));
                    if (var34.exists()) {
                        var34 = new File(arg2.substring(10) + "." + class337.method2062(false) + ".log");
                        if (var34.exists()) {
                            class30.method251(false, "file already exists!");
                            return;
                        }
                    }
                    if (class263.field3723 != null) {
                        class263.field3723.close();
                        class263.field3723 = null;
                    }
                    try {
                        class263.field3723 = new FileOutputStream(var34);
                        return;
                    } catch (FileNotFoundException var43) {
                        class30.method251(false, "Could not create " + var34.getName());
                        return;
                    } catch (SecurityException var44) {
                        class30.method251(false, "Cannot write to " + var34.getName());
                        return;
                    }
                }
                if (arg2.equals("closeoutput")) {
                    if (class263.field3723 != null) {
                        class263.field3723.close();
                    }
                    class263.field3723 = null;
                    return;
                }
                if (arg2.startsWith("runscript ")) {
                    File var35 = new File(arg2.substring(10));
                    if (!var35.exists()) {
                        class30.method251(false, "No such file");
                        return;
                    }
                    byte[] var36 = class441.method2615((byte) -121, var35);
                    if (var36 == null) {
                        class30.method251(false, "Failed to read file");
                        return;
                    }
                    String[] var37 = class544.method3151((byte) -67, '\n', class107.method862(class459.method2683(var36, 8), "", 113, '\r'));
                    class779.method4281(28924, var37);
                }
                if (arg2.startsWith("zoom ")) {
                    short var38 = (short) class185.method1340(arg2.substring(5), (byte) 70);
                    if (var38 > 0) {
                        class740.field10254 = var38;
                    }
                    return;
                }
                if (class141.field2306 == 10) {
                    class382.field5351++;
                    class302 var39 = class582.method3419(class261.field3705, (byte) 125, class626.field8901);
                    var39.field4341.method2524(false, arg2.length() + 3);
                    var39.field4341.method2524(false, arg0 ? 1 : 0);
                    var39.field4341.method2524(false, arg1 ? 1 : 0);
                    var39.field4341.method2566(arg3 - 12, arg2);
                    class501.method2928(0, var39);
                }
                if (arg2.startsWith("fps ") && class94.field1340 != class145.field2353) {
                    class392.method2347(arg3 - 9, class185.method1340(arg2.substring(4), (byte) 110));
                    return;
                }
            } catch (Exception var45) {
                class30.method251(false, class563.field7800.method3281(class423.field5892, arg3 ^ 0xFFFFFFF5));
                return;
            }
        }
        if (class141.field2306 != arg3) {
            class30.method251(false, class563.field7801.method3281(class423.field5892, -1) + arg2);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V")
    public static void method2731(byte arg0) {
        if (arg0 > 104) {
            field6367 = null;
            field6374 = null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)V")
    public final void method2732(byte arg0) {
        int var2 = -72 / ((arg0 - 6) / 57);
        field6371++;
        class494 var3 = this.field6378;
        synchronized (this.field6378) {
            this.field6378.method2893((byte) 86);
        }
        class494 var4 = this.field6373;
        synchronized (this.field6373) {
            this.field6373.method2893((byte) 2);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BI)Llg;")
    public final class218 method2733(byte arg0, int arg1) {
        field6369++;
        class494 var3 = this.field6378;
        class218 var4;
        synchronized (this.field6378) {
            var4 = (class218) this.field6378.method2882((long) arg1, (byte) -48);
        }
        if (var4 != null) {
            return var4;
        }
        class513 var5 = this.field6377;
        byte[] var6;
        synchronized (this.field6377) {
            var6 = this.field6377.method3019(46, arg1, 119);
        }
        class218 var7 = new class218();
        var7.field3190 = this;
        if (var6 != null) {
            var7.method1501(new class431(var6), (byte) -127);
        }
        class494 var8 = this.field6378;
        synchronized (this.field6378) {
            if (arg0 < 66) {
                this.field6378 = null;
            }
            this.field6378.method2890(-7307, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)V")
    public final void method2734(int arg0, int arg1) {
        class494 var3 = this.field6378;
        synchronized (this.field6378) {
            this.field6378.method2888(arg1, 124);
        }
        field6375++;
        class494 var4 = this.field6373;
        synchronized (this.field6373) {
            this.field6373.method2888(arg1, 116);
        }
        if (arg0 != 2869) {
            field6372 = -90;
        }
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lmca;ILgga;Lgga;)V")
    public class467(class41 arg0, int arg1, class513 arg2, class513 arg3) {
        this.field6368 = arg3;
        this.field6377 = arg2;
        this.field6377.method3007(-1, 46);
    }
}
