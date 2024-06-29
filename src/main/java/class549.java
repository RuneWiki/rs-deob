import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public class class549 {

    @OriginalMember(owner = "client!lba", name = "c", descriptor = "Lin;")
    private class91 field7556;

    @OriginalMember(owner = "client!lba", name = "f", descriptor = "I")
    public int field7559;

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "I")
    public static int field7555;

    @OriginalMember(owner = "client!lba", name = "d", descriptor = "I")
    public static int field7557;

    @OriginalMember(owner = "client!lba", name = "e", descriptor = "I")
    public static int field7558;

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "Lin;")
    public static class91 field7554;

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(B)V")
    public static void method3161(byte arg0) {
        if (arg0 > -109) {
            field7555 = 69;
        }
        field7554 = null;
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(Ljava/lang/String;ZZB)V")
    public static final void method3162(String arg0, boolean arg1, boolean arg2, byte arg3) {
        if (arg3 != -79) {
            method3164((byte) -79, 126L);
        }
        field7557++;
        try {
            if (arg0.equalsIgnoreCase("commands") || arg0.equalsIgnoreCase("help")) {
                class355.method2228("commands - This command", arg3 ^ 0x1);
                class355.method2228("cls - Clear console", -54);
                class355.method2228("displayfps - Toggle FPS and other information", -89);
                class355.method2228("renderer - Print graphics renderer information", 122);
                class355.method2228("heap - Print java memory information", -88);
                return;
            }
            if (arg0.equalsIgnoreCase("cls")) {
                class685.field9279 = 0;
                class605.field8302 = 0;
                return;
            }
            if (arg0.equalsIgnoreCase("displayfps")) {
                class137.field2298 = !class137.field2298;
                if (class137.field2298) {
                    class355.method2228("FPS on", 83);
                    return;
                }
                class355.method2228("FPS off", -69);
                return;
            }
            if (arg0.equals("renderer")) {
                class575 var4 = class272.field3822.method298();
                class355.method2228("Vendor: " + var4.field7895, 89);
                class355.method2228("Name: " + var4.field7889, 71);
                class355.method2228("Version: " + var4.field7894, -110);
                class355.method2228("Device: " + var4.field7891, arg3 + 146);
                class355.method2228("Driver Version: " + var4.field7890, arg3 - 32);
                return;
            }
            if (arg0.equals("heap")) {
                class355.method2228("Heap: " + class69.field1286 + "MB", 69);
                return;
            }
        } catch (Exception var46) {
            class355.method2228(class497.field6893.method2936(class607.field8336, 544), -99);
            return;
        }
        if (class740.field9967 != class436.field6234 || class476.field6653 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equals("nativememerror")) {
                throw new OutOfMemoryError("native(MPR");
            }
            try {
                if (arg0.equalsIgnoreCase("printfps")) {
                    class355.method2228("FPS: " + class602.field8268, -58);
                    return;
                }
                if (arg0.equalsIgnoreCase("occlude")) {
                    class728.field9848 = !class728.field9848;
                    if (!class728.field9848) {
                        class355.method2228("Occlsion now off!", -106);
                        return;
                    }
                    class355.method2228("Occlsion now on!", -102);
                    return;
                }
                if (arg0.equalsIgnoreCase("fpson")) {
                    class137.field2298 = true;
                    class355.method2228("fps debug enabled", -115);
                    return;
                }
                if (arg0.equalsIgnoreCase("fpsoff")) {
                    class137.field2298 = false;
                    class355.method2228("fps debug disabled", 125);
                    return;
                }
                if (arg0.equals("systemmem")) {
                    try {
                        class355.method2228("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + class270.field3807.field3419 + "Mb", arg3 + 26);
                        return;
                    } catch (Throwable var40) {
                        return;
                    }
                }
                if (arg0.equalsIgnoreCase("cleartext")) {
                    class399.field5901.method1305((byte) -45);
                    class355.method2228("Text coords cleared", arg3 + 21);
                    return;
                }
                if (arg0.equalsIgnoreCase("gc")) {
                    class378.method2387(arg3 + 180);
                    for (int var5 = 0; var5 < 10; var5++) {
                        System.gc();
                    }
                    Runtime var6 = Runtime.getRuntime();
                    int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                    class355.method2228("mem=" + var7 + "k", 110);
                    return;
                }
                if (arg0.equalsIgnoreCase("compact")) {
                    class378.method2387(-41);
                    for (int var8 = 0; var8 < 10; var8++) {
                        System.gc();
                    }
                    Runtime var9 = Runtime.getRuntime();
                    int var10 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                    class355.method2228("Memory before cleanup=" + var10 + "k", 115);
                    class271.method1794(31268);
                    class378.method2387(96);
                    for (int var11 = 0; var11 < 10; var11++) {
                        System.gc();
                    }
                    int var12 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                    class355.method2228("Memory after cleanup=" + var12 + "k", -110);
                    return;
                }
                if (arg0.equalsIgnoreCase("unloadnatives")) {
                    class355.method2228(class559.method3211(true) ? "Libraries unloaded" : "Library unloading failed!", 63);
                    return;
                }
                if (arg0.equalsIgnoreCase("clientdrop")) {
                    class355.method2228("Dropped client connection", -119);
                    if (class214.field3036 == 10) {
                        class288.method1878(105);
                        return;
                    }
                    if (class214.field3036 == 11) {
                        class145.field2406 = true;
                    }
                    return;
                }
                if (arg0.equalsIgnoreCase("rotateconnectmethods")) {
                    class678.field9207.method3761(0);
                    class355.method2228("Rotated connection methods", arg3 ^ 0xFFFFFFEC);
                    return;
                }
                if (arg0.equalsIgnoreCase("clientjs5drop")) {
                    class235.field3411.method1935(-83);
                    class355.method2228("Dropped client js5 net queue", -116);
                    return;
                }
                if (arg0.equalsIgnoreCase("serverjs5drop")) {
                    class235.field3411.method1939(0);
                    class355.method2228("Dropped server js5 net queue", -100);
                    return;
                }
                if (arg0.equalsIgnoreCase("breakcon")) {
                    class689.field9299.method1213(-95);
                    class512.field7137.method704(arg3 + 123);
                    class235.field3411.method1932(true);
                    class355.method2228("Breaking new connections for 5 seconds", arg3 - 4);
                    return;
                }
                if (arg0.equalsIgnoreCase("rebuild")) {
                    class717.method3997((byte) -117);
                    class748.method4175(-1);
                    class355.method2228("Rebuilding map", -113);
                    return;
                }
                if (arg0.equalsIgnoreCase("rebuildprofile")) {
                    class367.field5235 = class554.method3190(-75);
                    class284.field3969 = true;
                    class717.method3997((byte) -114);
                    class748.method4175(-1);
                    class355.method2228("Rebuilding map (with profiling)", -117);
                    return;
                }
                if (arg0.equalsIgnoreCase("wm1")) {
                    class486.method2864(1, -1, (byte) 102, false, -1);
                    if (class324.method2072(-61) != 1) {
                        class355.method2228("wm1 failed", arg3 ^ 0xFFFFFFE8);
                        return;
                    }
                    class355.method2228("wm1 succeeded", -65);
                    return;
                }
                if (arg0.equalsIgnoreCase("wm2")) {
                    class486.method2864(2, -1, (byte) 102, false, -1);
                    if (class324.method2072(-119) == 2) {
                        class355.method2228("wm2 succeeded", -109);
                        return;
                    }
                    class355.method2228("wm2 failed", arg3 + 154);
                    return;
                }
                if (arg0.equalsIgnoreCase("wm3")) {
                    class486.method2864(3, 1024, (byte) 102, false, 768);
                    if (class324.method2072(arg3 ^ 0x3D) == 3) {
                        class355.method2228("wm3 succeeded", 111);
                        return;
                    }
                    class355.method2228("wm3 failed", 83);
                    return;
                }
                if (arg0.equalsIgnoreCase("tk0")) {
                    class171.method1284(false, (byte) 104, 0);
                    if (class693.field9368.field4468.method1099(-32350) != 0) {
                        class355.method2228("Failed to enter tk0", 69);
                        return;
                    }
                    class355.method2228("Entered tk0", 101);
                    class693.field9368.method2065((byte) 74, class693.field9368.field4448, 0);
                    class310.method2019(37);
                    class184.field2782 = false;
                    return;
                }
                if (arg0.equalsIgnoreCase("tk1")) {
                    class171.method1284(false, (byte) 109, 1);
                    if (class693.field9368.field4468.method1099(-32350) != 1) {
                        class355.method2228("Failed to enter tk1", -56);
                        return;
                    }
                    class355.method2228("Entered tk1", -65);
                    class693.field9368.method2065((byte) 74, class693.field9368.field4448, 1);
                    class310.method2019(arg3 ^ 0xFFFFFF94);
                    class184.field2782 = false;
                    return;
                }
                if (arg0.equalsIgnoreCase("tk2")) {
                    class171.method1284(false, (byte) 115, 2);
                    if (class693.field9368.field4468.method1099(-32350) == 2) {
                        class355.method2228("Entered tk2", arg3 + 151);
                        class693.field9368.method2065((byte) 74, class693.field9368.field4448, 2);
                        class310.method2019(37);
                        class184.field2782 = false;
                        return;
                    }
                    class355.method2228("Failed to enter tk2", arg3 ^ 0x22);
                    return;
                }
                if (arg0.equalsIgnoreCase("tk3")) {
                    class171.method1284(false, (byte) 107, 3);
                    if (class693.field9368.field4468.method1099(-32350) != 3) {
                        class355.method2228("Failed to enter tk3", 54);
                        return;
                    }
                    class355.method2228("Entered tk3", 78);
                    class693.field9368.method2065((byte) 74, class693.field9368.field4448, 3);
                    class310.method2019(37);
                    class184.field2782 = false;
                    return;
                }
                if (arg0.equalsIgnoreCase("tk5")) {
                    class171.method1284(false, (byte) 113, 5);
                    if (class693.field9368.field4468.method1099(arg3 ^ 0x7E13) == 5) {
                        class355.method2228("Entered tk5", -108);
                        class693.field9368.method2065((byte) 74, class693.field9368.field4448, 5);
                        class310.method2019(37);
                        class184.field2782 = false;
                        return;
                    }
                    class355.method2228("Failed to enter tk5", 63);
                    return;
                }
                if (arg0.startsWith("setba")) {
                    if (arg0.length() < 6) {
                        class355.method2228("Invalid buildarea value", arg3 - 36);
                        return;
                    }
                    int var13 = class432.method2626(true, arg0.substring(6));
                    if (var13 >= 0 && class362.method2309(-126, class69.field1286) >= var13) {
                        class693.field9368.method2065((byte) 74, class693.field9368.field4423, var13);
                        class310.method2019(37);
                        class184.field2782 = false;
                        class355.method2228("maxbuildarea=" + class693.field9368.field4423.method3539(-32350), 98);
                        return;
                    }
                    class355.method2228("Invalid buildarea value", 53);
                    return;
                }
                if (arg0.startsWith("rect_debug")) {
                    if (arg0.length() < 10) {
                        class355.method2228("Invalid rect_debug value", -94);
                        return;
                    }
                    class745.field10159 = class432.method2626(true, arg0.substring(10).trim());
                    class355.method2228("rect_debug=" + class745.field10159, -124);
                    return;
                }
                if (arg0.equalsIgnoreCase("qa_op_test")) {
                    class319.field4396 = true;
                    class355.method2228("qa_op_test=" + class319.field4396, -114);
                    return;
                }
                if (arg0.equalsIgnoreCase("clipcomponents")) {
                    class143.field2363 = !class143.field2363;
                    class355.method2228("clipcomponents=" + class143.field2363, 88);
                    return;
                }
                if (arg0.startsWith("bloom")) {
                    boolean var14 = class272.field3822.method328();
                    if (!class396.method2480(!var14, (byte) -24)) {
                        class355.method2228("Failed to enable bloom", 52);
                        return;
                    }
                    if (!var14) {
                        class355.method2228("Bloom enabled", 71);
                        return;
                    }
                    class355.method2228("Bloom disabled", arg3 - 49);
                    return;
                }
                if (arg0.equalsIgnoreCase("tween")) {
                    if (!class133.field2243) {
                        class133.field2243 = true;
                        class355.method2228("Forced tweening ENABLED!", -89);
                        return;
                    }
                    class133.field2243 = false;
                    class355.method2228("Forced tweening disabled.", arg3 ^ 0xFFFFFF8E);
                    return;
                }
                if (arg0.equalsIgnoreCase("shiftclick")) {
                    if (class304.field4240) {
                        class355.method2228("Shift-click disabled.", arg3 ^ 0xFFFFFFDB);
                        class304.field4240 = false;
                        return;
                    }
                    class355.method2228("Shift-click ENABLED!", 106);
                    class304.field4240 = true;
                    return;
                }
                if (arg0.equalsIgnoreCase("getcgcoord")) {
                    class355.method2228("x:" + (class58.field1147.field5922 >> 9) + " z:" + (class58.field1147.field5933 >> 9), -117);
                    return;
                }
                if (arg0.equalsIgnoreCase("getheight")) {
                    class355.method2228("Height: " + class683.field9250[class58.field1147.field5926].method1851((byte) -86, class58.field1147.field5933 >> 9, class58.field1147.field5922 >> 9), arg3 ^ 0x1);
                    return;
                }
                if (arg0.equalsIgnoreCase("resetminimap")) {
                    class569.field7819.method858(arg3 ^ 0xFFFFFFB1);
                    class569.field7819.method865((byte) 127);
                    class351.field4888.method1037((byte) 125);
                    class72.field1322.method2130(7851);
                    class748.method4175(-1);
                    class355.method2228("Minimap reset", 70);
                    return;
                }
                if (arg0.startsWith("mc")) {
                    if (class272.field3822.method364()) {
                        int var15 = Integer.parseInt(arg0.substring(3));
                        if (var15 < 1) {
                            var15 = 1;
                        } else if (var15 > 4) {
                            var15 = 4;
                        }
                        class218.field3161 = var15;
                        class717.method3997((byte) -128);
                        class355.method2228("Render cores now: " + class218.field3161, -77);
                        return;
                    }
                    class355.method2228("Current toolkit doesn't support multiple cores", arg3 + 138);
                    return;
                }
                if (arg0.startsWith("cachespace")) {
                    class355.method2228("I(s): " + class124.field2128.method990(-18529) + "/" + class124.field2128.method986(-4), -101);
                    class355.method2228("I(m): " + class493.field6825.method990(-18529) + "/" + class493.field6825.method986(arg3 ^ 0x4D), 127);
                    class355.method2228("O(s): " + class721.field9801.field319.method1398((byte) 126) + "/" + class721.field9801.field319.method1387(100), arg3 + 203);
                    return;
                }
                if (arg0.equalsIgnoreCase("getcamerapos")) {
                    class355.method2228("Pos: " + class58.field1147.field5926 + "," + ((class108.field1896 >> 9) + class221.field3177 >> 6) + "," + ((class275.field3870 >> 9) + class367.field5236 >> 6) + "," + ((class108.field1896 >> 9) + class221.field3177 & 0x3F) + "," + ((class275.field3870 >> 9) + class367.field5236 & 0x3F) + " Height: " + (class197.method1403(class108.field1896, class58.field1147.field5926, 11219, class275.field3870) - class458.field6444), 126);
                    class355.method2228("Look: " + class58.field1147.field5926 + "," + (class547.field7541 + class221.field3177 >> 6) + "," + (class367.field5236 + class276.field3874 >> 6) + "," + (class547.field7541 + class221.field3177 & 0x3F) + "," + (class276.field3874 + class367.field5236 & 0x3F) + " Height: " + (class197.method1403(class547.field7541, class58.field1147.field5926, 11219, class276.field3874) - class343.field4814), -90);
                    return;
                }
                if (arg0.equals("renderprofile") || arg0.equals("rp")) {
                    class567.field7806 = !class567.field7806;
                    class272.field3822.method325(class567.field7806);
                    class420.method2583((byte) 23);
                    class355.method2228("showprofiling=" + class567.field7806, 106);
                    return;
                }
                if (arg0.startsWith("performancetest")) {
                    int var16 = -1;
                    int var17 = 1000;
                    if (arg0.length() > 15) {
                        String[] var18 = class728.method4031(' ', true, arg0);
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
                        class355.method2228("Performance: " + class394.method2476(var16, -69, var17), -84);
                        return;
                    }
                    class355.method2228("Java toolkit: " + class394.method2476(0, -85, var17), arg3 - 32);
                    class355.method2228("SSE toolkit:  " + class394.method2476(2, -73, var17), 60);
                    class355.method2228("D3D toolkit:  " + class394.method2476(3, arg3 - 24, var17), arg3 ^ 0xFFFFFFEE);
                    class355.method2228("GL toolkit:   " + class394.method2476(1, -84, var17), -121);
                    class355.method2228("GLX toolkit:  " + class394.method2476(5, -77, var17), -101);
                    return;
                }
                if (arg0.equals("nonpcs")) {
                    class61.field1214 = !class61.field1214;
                    class355.method2228("nonpcs=" + class61.field1214, -120);
                    return;
                }
                if (arg0.equals("autoworld")) {
                    class336.method2129(127);
                    class355.method2228("auto world selected", -59);
                    return;
                }
                if (arg0.startsWith("switchworld")) {
                    int var19 = Integer.parseInt(arg0.substring(12));
                    class689.method3851(class602.method3429(false, var19).field6074, var19, -93);
                    class355.method2228("switched", 70);
                    return;
                }
                if (arg0.equals("getworld")) {
                    class355.method2228("w: " + class678.field9207.field9140, -120);
                    return;
                }
                if (arg0.startsWith("pc")) {
                    class564 var20 = class227.method1594(class459.field6481, class72.field1320, -97);
                    var20.field7778.method1526(false, 0);
                    int var21 = var20.field7778.field3109;
                    int var22 = arg0.indexOf(" ", 4);
                    var20.field7778.method1481((byte) -5, arg0.substring(3, var22));
                    class376.method2376(var20.field7778, arg3 - 12, arg0.substring(var22));
                    var20.field7778.method1487(114, var20.field7778.field3109 - var21);
                    class167.method1260(arg3 ^ 0xFFFFFFB6, var20);
                    return;
                }
                if (arg0.equals("savevarcs")) {
                    class380.method2405(119);
                    class355.method2228("perm varcs saved", -103);
                    return;
                }
                if (arg0.equals("scramblevarcs")) {
                    for (int var23 = 0; var23 < class377.field5346.length; var23++) {
                        if (class269.field3797[var23]) {
                            class377.field5346[var23] = (int) (Math.random() * 99999.0D);
                            if (Math.random() > 0.5D) {
                                class377.field5346[var23] *= -1;
                            }
                        }
                    }
                    class380.method2405(-61);
                    class355.method2228("perm varcs scrambled", -74);
                    return;
                }
                if (arg0.equals("showcolmap")) {
                    class278.field3920 = true;
                    class748.method4175(-1);
                    class355.method2228("colmap is shown", 53);
                    return;
                }
                if (arg0.equals("hidecolmap")) {
                    class278.field3920 = false;
                    class748.method4175(arg3 ^ 0x4E);
                    class355.method2228("colmap is hidden", 61);
                    return;
                }
                if (arg0.equals("resetcache")) {
                    class340.method2149((byte) 122);
                    class355.method2228("Caches reset", -113);
                    return;
                }
                if (arg0.equals("profilecpu")) {
                    class355.method2228(class685.method3833(-26584) + "ms", 87);
                    return;
                }
                if (arg0.startsWith("getclientvarpbit")) {
                    int var24 = Integer.parseInt(arg0.substring(17));
                    class355.method2228("varpbit=" + class390.field5635.method895(var24, arg3 ^ 0xFFB1), arg3 + 198);
                    return;
                }
                if (arg0.startsWith("getclientvarp")) {
                    int var25 = Integer.parseInt(arg0.substring(14));
                    class355.method2228("varp=" + class390.field5635.method904(var25, (byte) -16), -68);
                    return;
                }
                if (arg0.startsWith("directlogin")) {
                    String[] var26 = class728.method4031(' ', true, arg0.substring(12));
                    if (var26.length >= 2) {
                        int var27 = var26.length > 2 ? Integer.parseInt(var26[2]) : 0;
                        class74.method700(var26[1], var27, var26[0], true);
                        return;
                    }
                }
                if (arg0.startsWith("csprofileclear")) {
                    class83.method789();
                    return;
                }
                if (arg0.startsWith("csprofileoutputc")) {
                    class83.method798(100, false);
                    return;
                }
                if (arg0.startsWith("csprofileoutputt")) {
                    class83.method798(10, true);
                    return;
                }
                if (arg0.startsWith("texsize")) {
                    int var28 = Integer.parseInt(arg0.substring(8));
                    class272.field3822.method227(var28);
                    return;
                }
                if (arg0.equals("soundstreamcount")) {
                    class355.method2228("Active streams: " + class326.field4510.method1328(), 84);
                    return;
                }
                if (arg0.equals("autosetup")) {
                    class100.method936(1000);
                    class355.method2228("Complete. Toolkit now: " + class693.field9368.field4468.method1099(arg3 - 32271), -97);
                    return;
                }
                if (arg0.equals("errormessage")) {
                    class355.method2228(class334.field4684.method1991((byte) 102), 102);
                    return;
                }
                if (arg0.equals("heapdump")) {
                    if (class158.field2551.startsWith("win")) {
                        class590.method3367(new File("C:\\Temp\\heap.dump"), false, false);
                    } else {
                        class590.method3367(new File("/tmp/heap.dump"), false, false);
                    }
                    class355.method2228("Done", 74);
                    return;
                }
                if (arg0.equals("os")) {
                    class355.method2228("Name: " + class158.field2551, 59);
                    class355.method2228("Arch: " + class158.field2528, arg3 ^ 0xFFFFFFFE);
                    class355.method2228("Ver: " + class158.field2526, 79);
                    return;
                }
                if (arg0.startsWith("w2debug")) {
                    int var29 = Integer.parseInt(arg0.substring(8, 9));
                    class127.field2138 = var29;
                    class717.method3997((byte) -103);
                    class355.method2228("Toggled!", -99);
                    return;
                }
                if (arg0.startsWith("ortho ")) {
                    int var30 = arg0.indexOf(32);
                    if (var30 < 0) {
                        class355.method2228("Syntax: ortho <n>", 66);
                        return;
                    }
                    int var31 = class432.method2626(true, arg0.substring(var30 + 1));
                    class693.field9368.method2065((byte) 74, class693.field9368.field4419, var31);
                    class310.method2019(37);
                    class184.field2782 = false;
                    class587.method3355(arg3 + 79);
                    if (class693.field9368.field4419.method3484(-32350) != var31) {
                        class355.method2228("Failed to change ortho mode", -112);
                        return;
                    }
                    class355.method2228("Successfully changed ortho mode", -82);
                    return;
                }
                if (arg0.startsWith("orthozoom ")) {
                    if (class693.field9368.field4419.method3484(arg3 - 32271) == 0) {
                        class355.method2228("enable ortho mode first (use 'ortho <n>')", arg3 + 182);
                        return;
                    }
                    int var32 = class432.method2626(true, arg0.substring(arg0.indexOf(32) + 1));
                    class58.field1151 = var32;
                    class355.method2228("orthozoom=" + class58.field1151, 68);
                    return;
                }
                if (arg0.startsWith("orthotilesize ")) {
                    int var33 = class432.method2626(true, arg0.substring(arg0.indexOf(32) + 1));
                    class91.field1624 = var33;
                    class453.field6392 = var33;
                    class355.method2228("ortho tile size=" + var33, -70);
                    class587.method3355(0);
                    return;
                }
                if (arg0.equals("orthocamlock")) {
                    class548.field7548 = !class548.field7548;
                    class355.method2228("ortho camera lock is " + (class548.field7548 ? "on" : "off"), -92);
                    return;
                }
                if (arg0.startsWith("setoutput ")) {
                    File var34 = new File(arg0.substring(10));
                    if (var34.exists()) {
                        var34 = new File(arg0.substring(10) + "." + class554.method3190(-76) + ".log");
                        if (var34.exists()) {
                            class355.method2228("file already exists!", 80);
                            return;
                        }
                    }
                    if (class3.field26 != null) {
                        class3.field26.close();
                        class3.field26 = null;
                    }
                    try {
                        class3.field26 = new FileOutputStream(var34);
                        return;
                    } catch (FileNotFoundException var43) {
                        class355.method2228("Could not create " + var34.getName(), 81);
                        return;
                    } catch (SecurityException var44) {
                        class355.method2228("Cannot write to " + var34.getName(), arg3 ^ 0xFFFFFFDD);
                        return;
                    }
                }
                if (arg0.equals("closeoutput")) {
                    if (class3.field26 != null) {
                        class3.field26.close();
                    }
                    class3.field26 = null;
                    return;
                }
                if (arg0.startsWith("runscript ")) {
                    File var35 = new File(arg0.substring(10));
                    if (!var35.exists()) {
                        class355.method2228("No such file", 120);
                        return;
                    }
                    byte[] var36 = class94.method888(arg3 ^ 0x41, var35);
                    if (var36 == null) {
                        class355.method2228("Failed to read file", 119);
                        return;
                    }
                    String[] var37 = class728.method4031('\n', true, class210.method1441(class442.method2659(var36, true), (byte) -89, '\r', ""));
                    class715.method3984(0, var37);
                }
                if (arg0.startsWith("zoom ")) {
                    short var38 = (short) class432.method2626(true, arg0.substring(5));
                    if (var38 > 0) {
                        class722.field9802 = var38;
                    }
                    return;
                }
                if (class214.field3036 == 10) {
                    class302.field4206++;
                    class564 var39 = class227.method1594(class81.field1439, class72.field1320, arg3 ^ 0x24);
                    var39.field7778.method1526(false, arg0.length() + 3);
                    var39.field7778.method1526(false, arg1 ? 1 : 0);
                    var39.field7778.method1526(false, arg2 ? 1 : 0);
                    var39.field7778.method1481((byte) -5, arg0);
                    class167.method1260(120, var39);
                }
                if (arg0.startsWith("fps ") && class740.field9967 != class436.field6234) {
                    class67.method674(class432.method2626(true, arg0.substring(4)), (byte) -124);
                    return;
                }
            } catch (Exception var45) {
                class355.method2228(class497.field6893.method2936(class607.field8336, 544), -92);
                return;
            }
        }
        if (class214.field3036 != 10) {
            class355.method2228(class497.field6894.method2936(class607.field8336, 544) + arg0, 57);
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(III)Lqfa;")
    public static final class100 method3163(int arg0, int arg1, int arg2) {
        class384 var3 = class649.field8928[arg0][arg1][arg2];
        return var3 == null ? null : var3.field5574;
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(BJ)V")
    public static final void method3164(byte arg0, long arg1) {
        field7558++;
        int var3 = class667.field9105;
        if (arg0 <= 106) {
            return;
        }
        if (class162.field2584 != var3) {
            int var4 = var3 - class162.field2584;
            int var5 = (int) ((long) var4 * arg1 / 320L);
            if (var4 <= 0) {
                if (var5 == 0) {
                    var5 = -1;
                } else if (var4 > var5) {
                    var5 = var4;
                }
            } else if (var5 == 0) {
                var5 = 1;
            } else if (var5 > var4) {
                var5 = var4;
            }
            class162.field2584 += var5;
        }
        int var6 = class54.field1111;
        class440.field6267 += (float) arg1 * class55.field1119 / 40.0F * 8.0F;
        class451.field6366 += (float) arg1 * class201.field2912 / 40.0F * 8.0F;
        if (class476.field6650 != var6) {
            int var7 = var6 - class476.field6650;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var8 < var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var7 < var8) {
                var8 = var7;
            }
            class476.field6650 += var8;
        }
        class294.method1924(262144);
    }

    @OriginalMember(owner = "client!lba", name = "<init>", descriptor = "(Lsj;ILin;)V")
    public class549(class460 arg0, int arg1, class91 arg2) {
        new class112(64);
        this.field7556 = arg2;
        this.field7559 = this.field7556.method860(0, 15);
    }
}
