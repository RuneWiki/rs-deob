import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class417 {

    @OriginalMember(owner = "client!im", name = "j", descriptor = "I")
    private int field5933 = -1;

    @OriginalMember(owner = "client!im", name = "k", descriptor = "Z")
    private boolean field5934 = true;

    @OriginalMember(owner = "client!im", name = "l", descriptor = "I")
    private int field5935;

    @OriginalMember(owner = "client!im", name = "b", descriptor = "[Llaa;")
    private class478[] field5925;

    @OriginalMember(owner = "client!im", name = "n", descriptor = "I")
    private int field5937;

    @OriginalMember(owner = "client!im", name = "h", descriptor = "I")
    private int field5931;

    @OriginalMember(owner = "client!im", name = "i", descriptor = "I")
    private int field5932;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "[Llaa;")
    private class478[] field5924;

    @OriginalMember(owner = "client!im", name = "c", descriptor = "Llaa;")
    private class478 field5926;

    @OriginalMember(owner = "client!im", name = "d", descriptor = "J")
    public static long field5927 = -1L;

    @OriginalMember(owner = "client!im", name = "e", descriptor = "I")
    public static int field5928;

    @OriginalMember(owner = "client!im", name = "f", descriptor = "I")
    private int field5929;

    @OriginalMember(owner = "client!im", name = "g", descriptor = "I")
    public static int field5930;

    @OriginalMember(owner = "client!im", name = "m", descriptor = "I")
    public static int field5936;

    @OriginalMember(owner = "client!im", name = "o", descriptor = "I")
    public static int field5938;

    @OriginalMember(owner = "client!im", name = "q", descriptor = "I")
    private int field5940;

    @OriginalMember(owner = "client!im", name = "p", descriptor = "Lac;")
    private class712 field5939;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIIIIILha;II)V", line = 6)
    public final void method2480(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class454 arg7, int arg8, int arg9) {
        field5930++;
        int var11 = arg1 + arg2 & 0x3FFF;
        if (this.field5932 == -1 || this.field5929 == 0) {
            arg7.method167(arg4, arg8, arg5, arg3, arg9, 0);
        } else {
            class91 var12 = class396.field5513.method389(9559, this.field5932);
            if (this.field5939 == null && class396.field5513.method390(this.field5932, -9396)) {
                int[] var13 = var12.field1165 == 2 ? class396.field5513.method397(this.field5932, 0.7F, 13049, this.field5929, this.field5929, false) : class396.field5513.method395(false, 0.7F, this.field5929, this.field5932, -11288, this.field5929);
                this.field5939 = arg7.method2666(this.field5929, this.field5929, (byte) -48, var13, 0, this.field5929);
            }
            if (var12.field1165 == 2) {
                arg7.method167(arg4, arg8, arg5, arg3, arg9, 0);
            }
            if (this.field5939 != null) {
                int var14 = var12.field1165 == 2 ? 1 : 0;
                int var15 = arg3 * arg6 / -4096;
                int var16;
                for (var16 = (arg5 - arg3) / 2 + (arg3 * var11 / 4096); var16 > arg3; var16 -= arg3) {
                }
                while (var15 > arg3) {
                    var15 -= arg3;
                }
                while (var16 < 0) {
                    var16 += arg3;
                }
                while (var15 < 0) {
                    var15 += arg3;
                }
                for (int var17 = var16 - arg3; var17 < arg5; var17 += arg3) {
                    for (int var18 = var15 - arg3; var18 < arg3; var18 += arg3) {
                        this.field5939.method3937(var17 + arg4, arg8 + var18, arg3, arg3, 1, 0, var14);
                    }
                }
            }
        }
        if (arg0 >= -78) {
            this.method2481(false);
        }
        for (int var19 = this.field5940 - 1; var19 >= 0; var19--) {
            this.field5924[var19].method2802(arg7, arg4, arg8, arg5, arg3, arg6, var11);
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Z)V", line = 84)
    public final void method2481(boolean arg0) {
        field5936++;
        if (!arg0) {
            method2482(true, null, false, (byte) -98);
        }
        if (this.field5925 != null) {
            for (int var2 = 0; var2 < this.field5925.length; var2++) {
                this.field5925[var2].method2799();
            }
        }
        this.field5939 = null;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ZLjava/lang/String;ZB)V", line = 118)
    public static final void method2482(boolean arg0, String arg1, boolean arg2, byte arg3) {
        field5928++;
        try {
            if (arg1.equalsIgnoreCase("commands") || arg1.equalsIgnoreCase("help")) {
                class192.method1210(-113, "commands - This command");
                class192.method1210(arg3 - 173, "cls - Clear console");
                class192.method1210(35, "displayfps - Toggle FPS and other information");
                class192.method1210(-114, "renderer - Print graphics renderer information");
                class192.method1210(arg3 ^ 0xFFFFFFD1, "heap - Print java memory information");
                return;
            }
            if (arg1.equalsIgnoreCase("cls")) {
                class10.field113 = 0;
                class249.field3167 = 0;
                return;
            }
            if (arg1.equalsIgnoreCase("displayfps")) {
                class679.field9225 = !class679.field9225;
                if (!class679.field9225) {
                    class192.method1210(-1, "FPS off");
                    return;
                }
                class192.method1210(113, "FPS on");
                return;
            }
            if (arg1.equals("renderer")) {
                class633 var4 = class458.field6407.method79();
                class192.method1210(-80, "Vendor: " + var4.field8783);
                class192.method1210(-106, "Name: " + var4.field8777);
                class192.method1210(-127, "Version: " + var4.field8779);
                class192.method1210(arg3 ^ 0x1B, "Device: " + var4.field8778);
                class192.method1210(-97, "Driver Version: " + var4.field8782);
                return;
            }
            if (arg1.equals("heap")) {
                class192.method1210(48, "Heap: " + class722.field10162 + "MB");
                return;
            }
        } catch (Exception var46) {
            class192.method1210(arg3 ^ 0xFFFFFFD7, class586.field8126.method3261(class416.field5920, (byte) 82));
            return;
        }
        if (class323.field4120 != class171.field2248 || class408.field5753 >= 2) {
            if (arg1.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg1.equals("nativememerror")) {
                throw new OutOfMemoryError("native(MPR");
            }
            try {
                if (arg1.equalsIgnoreCase("printfps")) {
                    class192.method1210(17, "FPS: " + class423.field6018);
                    return;
                }
                if (arg1.equalsIgnoreCase("occlude")) {
                    class182.field2387 = !class182.field2387;
                    if (class182.field2387) {
                        class192.method1210(-104, "Occlsion now on!");
                        return;
                    }
                    class192.method1210(30, "Occlsion now off!");
                    return;
                }
                if (arg1.equalsIgnoreCase("fpson")) {
                    class679.field9225 = true;
                    class192.method1210(-101, "fps debug enabled");
                    return;
                }
                if (arg1.equalsIgnoreCase("fpsoff")) {
                    class679.field9225 = false;
                    class192.method1210(55, "fps debug disabled");
                    return;
                }
                if (arg1.equals("systemmem")) {
                    try {
                        class192.method1210(119, "System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + class241.field3102.field8654 + "Mb");
                        return;
                    } catch (Throwable var40) {
                        return;
                    }
                }
                if (arg1.equalsIgnoreCase("cleartext")) {
                    class652.field8973.method1838((byte) 76);
                    class192.method1210(arg3 - 186, "Text coords cleared");
                    return;
                }
                if (arg1.equalsIgnoreCase("gc")) {
                    class301.method1778((byte) 115);
                    for (int var5 = 0; var5 < 10; var5++) {
                        System.gc();
                    }
                    Runtime var6 = Runtime.getRuntime();
                    int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                    class192.method1210(66, "mem=" + var7 + "k");
                    return;
                }
                if (arg1.equalsIgnoreCase("compact")) {
                    class301.method1778((byte) 115);
                    for (int var8 = 0; var8 < 10; var8++) {
                        System.gc();
                    }
                    Runtime var9 = Runtime.getRuntime();
                    int var10 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                    class192.method1210(-110, "Memory before cleanup=" + var10 + "k");
                    class587.method3265(true);
                    class301.method1778((byte) 115);
                    for (int var11 = 0; var11 < 10; var11++) {
                        System.gc();
                    }
                    int var12 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                    class192.method1210(arg3 - 27, "Memory after cleanup=" + var12 + "k");
                    return;
                }
                if (arg1.equalsIgnoreCase("unloadnatives")) {
                    class192.method1210(-90, class286.method1710((byte) 52) ? "Libraries unloaded" : "Library unloading failed!");
                    return;
                }
                if (arg1.equalsIgnoreCase("clientdrop")) {
                    class192.method1210(arg3 - 5, "Dropped client connection");
                    if (class668.field9150 == 10) {
                        class238.method1491((byte) 101);
                    } else if (class668.field9150 == 11) {
                        class541.field7612 = true;
                        return;
                    }
                    return;
                }
                if (arg1.equalsIgnoreCase("rotateconnectmethods")) {
                    class575.field8035.method1193((byte) -68);
                    class192.method1210(111, "Rotated connection methods");
                    return;
                }
                if (arg1.equalsIgnoreCase("clientjs5drop")) {
                    class101.field1243.method4099(-124);
                    class192.method1210(89, "Dropped client js5 net queue");
                    return;
                }
                if (arg1.equalsIgnoreCase("serverjs5drop")) {
                    class101.field1243.method4103(-24);
                    class192.method1210(arg3 - 194, "Dropped server js5 net queue");
                    return;
                }
                if (arg1.equalsIgnoreCase("breakcon")) {
                    class681.field9312.method1548(5000);
                    class426.field6057.method871((byte) -73);
                    class101.field1243.method4096(0);
                    class192.method1210(99, "Breaking new connections for 5 seconds");
                    return;
                }
                if (arg1.equalsIgnoreCase("rebuild")) {
                    class480.method2810((byte) -113);
                    class289.method1730((byte) -108);
                    class192.method1210(-120, "Rebuilding map");
                    return;
                }
                if (arg1.equalsIgnoreCase("rebuildprofile")) {
                    class153.field1858 = class97.method654((byte) 65);
                    class172.field2259 = true;
                    class480.method2810((byte) -105);
                    class289.method1730((byte) -108);
                    class192.method1210(arg3 - 26, "Rebuilding map (with profiling)");
                    return;
                }
                if (arg1.equalsIgnoreCase("wm1")) {
                    class653.method3523(-1, 1, -1, -1, false);
                    if (class126.method814((byte) 23) == 1) {
                        class192.method1210(-112, "wm1 succeeded");
                        return;
                    }
                    class192.method1210(59, "wm1 failed");
                    return;
                }
                if (arg1.equalsIgnoreCase("wm2")) {
                    class653.method3523(-1, 2, -1, -1, false);
                    if (class126.method814((byte) 23) == 2) {
                        class192.method1210(1, "wm2 succeeded");
                        return;
                    }
                    class192.method1210(102, "wm2 failed");
                    return;
                }
                if (arg1.equalsIgnoreCase("wm3")) {
                    class653.method3523(768, 3, arg3 - 78, 1024, false);
                    if (class126.method814((byte) 23) != 3) {
                        class192.method1210(4, "wm3 failed");
                        return;
                    }
                    class192.method1210(-98, "wm3 succeeded");
                    return;
                }
                if (arg1.equalsIgnoreCase("tk0")) {
                    class462.method2730(1, false, 0);
                    if (class223.field2944.field633.method4191((byte) -125) == 0) {
                        class192.method1210(46, "Entered tk0");
                        class223.field2944.method346(class223.field2944.field601, 0, false);
                        class252.method1530((byte) 94);
                        class78.field1035 = false;
                        return;
                    }
                    class192.method1210(arg3 - 184, "Failed to enter tk0");
                    return;
                }
                if (arg1.equalsIgnoreCase("tk1")) {
                    class462.method2730(1, false, 1);
                    if (class223.field2944.field633.method4191((byte) -125) == 1) {
                        class192.method1210(34, "Entered tk1");
                        class223.field2944.method346(class223.field2944.field601, 1, false);
                        class252.method1530((byte) 68);
                        class78.field1035 = false;
                        return;
                    }
                    class192.method1210(-101, "Failed to enter tk1");
                    return;
                }
                if (arg1.equalsIgnoreCase("tk2")) {
                    class462.method2730(arg3 - 76, false, 2);
                    if (class223.field2944.field633.method4191((byte) -122) != 2) {
                        class192.method1210(108, "Failed to enter tk2");
                        return;
                    }
                    class192.method1210(-110, "Entered tk2");
                    class223.field2944.method346(class223.field2944.field601, 2, false);
                    class252.method1530((byte) 62);
                    class78.field1035 = false;
                    return;
                }
                if (arg1.equalsIgnoreCase("tk3")) {
                    class462.method2730(arg3 - 76, false, 3);
                    if (class223.field2944.field633.method4191((byte) -125) != 3) {
                        class192.method1210(arg3 - 25, "Failed to enter tk3");
                        return;
                    }
                    class192.method1210(arg3 ^ 0xFFFFFFC4, "Entered tk3");
                    class223.field2944.method346(class223.field2944.field601, 3, false);
                    class252.method1530((byte) 92);
                    class78.field1035 = false;
                    return;
                }
                if (arg1.equalsIgnoreCase("tk5")) {
                    class462.method2730(1, false, 5);
                    if (class223.field2944.field633.method4191((byte) -121) != 5) {
                        class192.method1210(91, "Failed to enter tk5");
                        return;
                    }
                    class192.method1210(-98, "Entered tk5");
                    class223.field2944.method346(class223.field2944.field601, 5, false);
                    class252.method1530((byte) 87);
                    class78.field1035 = false;
                    return;
                }
                if (arg1.startsWith("setba")) {
                    if (arg1.length() < 6) {
                        class192.method1210(-104, "Invalid buildarea value");
                        return;
                    }
                    int var13 = class337.method1980(-27187, arg1.substring(6));
                    if (var13 >= 0 && var13 <= class181.method1161(class722.field10162, -97)) {
                        class223.field2944.method346(class223.field2944.field612, var13, false);
                        class252.method1530((byte) 60);
                        class78.field1035 = false;
                        class192.method1210(-109, "maxbuildarea=" + class223.field2944.field612.method2953((byte) -121));
                        return;
                    }
                    class192.method1210(108, "Invalid buildarea value");
                    return;
                }
                if (arg1.startsWith("rect_debug")) {
                    if (arg1.length() < 10) {
                        class192.method1210(28, "Invalid rect_debug value");
                        return;
                    }
                    class286.field3633 = class337.method1980(-27187, arg1.substring(10).trim());
                    class192.method1210(124, "rect_debug=" + class286.field3633);
                    return;
                }
                if (arg1.equalsIgnoreCase("qa_op_test")) {
                    class491.field6959 = true;
                    class192.method1210(-125, "qa_op_test=" + class491.field6959);
                    return;
                }
                if (arg1.equalsIgnoreCase("clipcomponents")) {
                    class643.field8874 = !class643.field8874;
                    class192.method1210(41, "clipcomponents=" + class643.field8874);
                    return;
                }
                if (arg1.startsWith("bloom")) {
                    boolean var14 = class458.field6407.method57();
                    if (class219.method1364(!var14, -1150)) {
                        if (!var14) {
                            class192.method1210(87, "Bloom enabled");
                            return;
                        }
                        class192.method1210(101, "Bloom disabled");
                        return;
                    }
                    class192.method1210(27, "Failed to enable bloom");
                    return;
                }
                if (arg1.equalsIgnoreCase("tween")) {
                    if (!class322.field4112) {
                        class322.field4112 = true;
                        class192.method1210(87, "Forced tweening ENABLED!");
                        return;
                    }
                    class322.field4112 = false;
                    class192.method1210(76, "Forced tweening disabled.");
                    return;
                }
                if (arg1.equalsIgnoreCase("shiftclick")) {
                    if (class20.field259) {
                        class192.method1210(62, "Shift-click disabled.");
                        class20.field259 = false;
                        return;
                    }
                    class192.method1210(-123, "Shift-click ENABLED!");
                    class20.field259 = true;
                    return;
                }
                if (arg1.equalsIgnoreCase("getcgcoord")) {
                    class192.method1210(arg3 ^ 0xFFFFFFEE, "x:" + (class339.field4374.field5790 >> 9) + " z:" + (class339.field4374.field5784 >> 9));
                    return;
                }
                if (arg1.equalsIgnoreCase("getheight")) {
                    class192.method1210(arg3 - 186, "Height: " + class517.field7282[class339.field4374.field5779].method2381(-120, class339.field4374.field5790 >> 9, class339.field4374.field5784 >> 9));
                    return;
                }
                if (arg1.equalsIgnoreCase("resetminimap")) {
                    class645.field8897.method3830(-75);
                    class645.field8897.method3835((byte) -106);
                    class70.field946.method1485((byte) -84);
                    class37.field551.method2770(-115);
                    class289.method1730((byte) -108);
                    class192.method1210(-86, "Minimap reset");
                    return;
                }
                if (arg1.startsWith("mc")) {
                    if (class458.field6407.method107()) {
                        int var15 = Integer.parseInt(arg1.substring(3));
                        if (var15 < 1) {
                            var15 = 1;
                        } else if (var15 > 4) {
                            var15 = 4;
                        }
                        class718.field10121 = var15;
                        class480.method2810((byte) -123);
                        class192.method1210(arg3 ^ 0x49, "Render cores now: " + class718.field10121);
                        return;
                    }
                    class192.method1210(0, "Current toolkit doesn't support multiple cores");
                    return;
                }
                if (arg1.startsWith("cachespace")) {
                    class192.method1210(111, "I(s): " + class573.field8008.method773(1) + "/" + class573.field8008.method768((byte) 96));
                    class192.method1210(9, "I(m): " + class30.field487.method773(arg3 - 76) + "/" + class30.field487.method768((byte) 119));
                    class192.method1210(43, "O(s): " + class190.field2488.field10040.method3888(-21) + "/" + class190.field2488.field10040.method3887((byte) 43));
                    return;
                }
                if (arg1.equalsIgnoreCase("getcamerapos")) {
                    class192.method1210(-116, "Pos: " + class339.field4374.field5779 + "," + ((class505.field7134 >> 9) + class63.field851 >> 6) + "," + ((class407.field5744 >> 9) + class753.field10509 >> 6) + "," + ((class505.field7134 >> 9) + class63.field851 & 0x3F) + "," + ((class407.field5744 >> 9) + class753.field10509 & 0x3F) + " Height: " + (class592.method3287(false, class407.field5744, class339.field4374.field5779, class505.field7134) - class524.field7412));
                    class192.method1210(-115, "Look: " + class339.field4374.field5779 + "," + (class63.field851 + class49.field728 >> 6) + "," + (class753.field10509 + class579.field8054 >> 6) + "," + (class63.field851 + class49.field728 & 0x3F) + "," + (class753.field10509 + class579.field8054 & 0x3F) + " Height: " + (class592.method3287(false, class579.field8054, class339.field4374.field5779, class49.field728) - class223.field2945));
                    return;
                }
                if (arg1.equals("renderprofile") || arg1.equals("rp")) {
                    class534.field7494 = !class534.field7494;
                    class458.field6407.method169(class534.field7494);
                    class245.method1515(arg3 - 6377);
                    class192.method1210(75, "showprofiling=" + class534.field7494);
                    return;
                }
                if (arg1.startsWith("performancetest")) {
                    int var16 = -1;
                    int var17 = 1000;
                    if (arg1.length() > 15) {
                        String[] var18 = class124.method809(' ', -94, arg1);
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
                        class192.method1210(arg3 ^ 0xFFFFFFE0, "Performance: " + class442.method2604(var16, (byte) -88, var17));
                        return;
                    }
                    class192.method1210(68, "Java toolkit: " + class442.method2604(0, (byte) -74, var17));
                    class192.method1210(-87, "SSE toolkit:  " + class442.method2604(2, (byte) -110, var17));
                    class192.method1210(123, "D3D toolkit:  " + class442.method2604(3, (byte) -115, var17));
                    class192.method1210(-79, "GL toolkit:   " + class442.method2604(1, (byte) -124, var17));
                    class192.method1210(106, "GLX toolkit:  " + class442.method2604(5, (byte) -103, var17));
                    return;
                }
                if (arg1.equals("nonpcs")) {
                    class286.field3630 = !class286.field3630;
                    class192.method1210(105, "nonpcs=" + class286.field3630);
                    return;
                }
                if (arg1.equals("autoworld")) {
                    class667.method3610((byte) -29);
                    class192.method1210(-95, "auto world selected");
                    return;
                }
                if (arg1.startsWith("switchworld")) {
                    int var19 = Integer.parseInt(arg1.substring(12));
                    class581.method3240(var19, arg3 ^ 0x9C0D, class531.method3032(var19, (byte) -102).field3367);
                    class192.method1210(arg3 - 77, "switched");
                    return;
                }
                if (arg1.equals("getworld")) {
                    class192.method1210(arg3 ^ 0x74, "w: " + class575.field8035.field2454);
                    return;
                }
                if (arg1.startsWith("pc")) {
                    class650 var20 = class314.method1837(class210.field2692, true, class625.field8727);
                    var20.field8928.method1141(0, -112);
                    int var21 = var20.field8928.field2354;
                    int var22 = arg1.indexOf(" ", 4);
                    var20.field8928.method1110(arg1.substring(3, var22), arg3 ^ 0xFFFF8941);
                    class665.method3600(arg1.substring(var22), var20.field8928, arg3 - 77);
                    var20.field8928.method1126(arg3 ^ 0xFFFFFFB2, var20.field8928.field2354 - var21);
                    class108.method745(var20, -116);
                    return;
                }
                if (arg1.equals("savevarcs")) {
                    class61.method477(false);
                    class192.method1210(122, "perm varcs saved");
                    return;
                }
                if (arg1.equals("scramblevarcs")) {
                    for (int var23 = 0; var23 < class173.field2267.length; var23++) {
                        if (class665.field9111[var23]) {
                            class173.field2267[var23] = (int) (Math.random() * 99999.0D);
                            if (Math.random() > 0.5D) {
                                class173.field2267[var23] *= -1;
                            }
                        }
                    }
                    class61.method477(false);
                    class192.method1210(-1, "perm varcs scrambled");
                    return;
                }
                if (arg1.equals("showcolmap")) {
                    class233.field3012 = true;
                    class289.method1730((byte) -108);
                    class192.method1210(-121, "colmap is shown");
                    return;
                }
                if (arg1.equals("hidecolmap")) {
                    class233.field3012 = false;
                    class289.method1730((byte) -108);
                    class192.method1210(arg3 + 40, "colmap is hidden");
                    return;
                }
                if (arg1.equals("resetcache")) {
                    class326.method1932(0);
                    class192.method1210(-84, "Caches reset");
                    return;
                }
                if (arg1.equals("profilecpu")) {
                    class192.method1210(-92, class383.method2306(arg3 - 7381) + "ms");
                    return;
                }
                if (arg1.startsWith("getclientvarpbit")) {
                    int var24 = Integer.parseInt(arg1.substring(17));
                    class192.method1210(-82, "varpbit=" + class461.field6637.method1681(0, var24));
                    return;
                }
                if (arg1.startsWith("getclientvarp")) {
                    int var25 = Integer.parseInt(arg1.substring(14));
                    class192.method1210(-100, "varp=" + class461.field6637.method1687(arg3 - 75, var25));
                    return;
                }
                if (arg1.startsWith("directlogin")) {
                    String[] var26 = class124.method809(' ', arg3 ^ 0xFFFFFFEB, arg1.substring(12));
                    if (var26.length >= 2) {
                        int var27 = var26.length > 2 ? Integer.parseInt(var26[2]) : 0;
                        class142.method879(arg3 ^ 0x4F, var26[1], var27, var26[0]);
                        return;
                    }
                }
                if (arg1.startsWith("csprofileclear")) {
                    class445.method2627();
                    return;
                }
                if (arg1.startsWith("csprofileoutputc")) {
                    class445.method2622(100, false);
                    return;
                }
                if (arg1.startsWith("csprofileoutputt")) {
                    class445.method2622(10, true);
                    return;
                }
                if (arg1.startsWith("texsize")) {
                    int var28 = Integer.parseInt(arg1.substring(8));
                    class458.field6407.method68(var28);
                    return;
                }
                if (arg1.equals("soundstreamcount")) {
                    class192.method1210(-79, "Active streams: " + class668.field9148.method665());
                    return;
                }
                if (arg1.equals("autosetup")) {
                    class400.method2368(-21867);
                    class192.method1210(-93, "Complete. Toolkit now: " + class223.field2944.field633.method4191((byte) -125));
                    return;
                }
                if (arg1.equals("errormessage")) {
                    class192.method1210(-87, class612.field8463.method714(115));
                    return;
                }
                if (arg1.equals("heapdump")) {
                    if (class256.field3250.startsWith("win")) {
                        class489.method2858(false, (byte) -122, new File("C:\\Temp\\heap.dump"));
                    } else {
                        class489.method2858(false, (byte) -128, new File("/tmp/heap.dump"));
                    }
                    class192.method1210(60, "Done");
                    return;
                }
                if (arg1.equals("os")) {
                    class192.method1210(arg3 ^ 0xFFFFFFEF, "Name: " + class256.field3250);
                    class192.method1210(117, "Arch: " + class256.field3247);
                    class192.method1210(69, "Ver: " + class256.field3262);
                    return;
                }
                if (arg1.startsWith("w2debug")) {
                    int var29 = Integer.parseInt(arg1.substring(8, 9));
                    class82.field1065 = var29;
                    class480.method2810((byte) -117);
                    class192.method1210(98, "Toggled!");
                    return;
                }
                if (arg1.startsWith("ortho ")) {
                    int var30 = arg1.indexOf(32);
                    if (var30 < 0) {
                        class192.method1210(71, "Syntax: ortho <n>");
                        return;
                    }
                    int var31 = class337.method1980(arg3 - 27264, arg1.substring(var30 + 1));
                    class223.field2944.method346(class223.field2944.field634, var31, false);
                    class252.method1530((byte) 100);
                    class78.field1035 = false;
                    class619.method3397((byte) 114);
                    if (class223.field2944.field634.method2971((byte) -122) == var31) {
                        class192.method1210(123, "Successfully changed ortho mode");
                        return;
                    }
                    class192.method1210(35, "Failed to change ortho mode");
                    return;
                }
                if (arg1.startsWith("orthozoom ")) {
                    if (class223.field2944.field634.method2971((byte) -125) == 0) {
                        class192.method1210(54, "enable ortho mode first (use 'ortho <n>')");
                        return;
                    }
                    int var32 = class337.method1980(-27187, arg1.substring(arg1.indexOf(32) + 1));
                    class468.field6736 = var32;
                    class192.method1210(77, "orthozoom=" + class468.field6736);
                    return;
                }
                if (arg1.startsWith("orthotilesize ")) {
                    int var33 = class337.method1980(-27187, arg1.substring(arg1.indexOf(32) + 1));
                    class189.field2485 = var33;
                    class662.field9078 = var33;
                    class192.method1210(66, "ortho tile size=" + var33);
                    class619.method3397((byte) 114);
                    return;
                }
                if (arg1.equals("orthocamlock")) {
                    class44.field665 = !class44.field665;
                    class192.method1210(-124, "ortho camera lock is " + (class44.field665 ? "on" : "off"));
                    return;
                }
                if (arg1.startsWith("setoutput ")) {
                    File var34 = new File(arg1.substring(10));
                    if (var34.exists()) {
                        var34 = new File(arg1.substring(10) + "." + class97.method654((byte) 117) + ".log");
                        if (var34.exists()) {
                            class192.method1210(arg3 + 45, "file already exists!");
                            return;
                        }
                    }
                    if (class422.field6000 != null) {
                        class422.field6000.close();
                        class422.field6000 = null;
                    }
                    try {
                        class422.field6000 = new FileOutputStream(var34);
                        return;
                    } catch (FileNotFoundException var43) {
                        class192.method1210(arg3 ^ 0x57, "Could not create " + var34.getName());
                        return;
                    } catch (SecurityException var44) {
                        class192.method1210(65, "Cannot write to " + var34.getName());
                        return;
                    }
                }
                if (arg1.equals("closeoutput")) {
                    if (class422.field6000 != null) {
                        class422.field6000.close();
                    }
                    class422.field6000 = null;
                    return;
                }
                if (arg1.startsWith("runscript ")) {
                    File var35 = new File(arg1.substring(10));
                    if (!var35.exists()) {
                        class192.method1210(-117, "No such file");
                        return;
                    }
                    byte[] var36 = class581.method3238(-118, var35);
                    if (var36 == null) {
                        class192.method1210(-117, "Failed to read file");
                        return;
                    }
                    String[] var37 = class124.method809('\n', arg3 ^ 0x45, class521.method2993("", '\r', class659.method3578(var36, (byte) -84), 0));
                    class701.method3885((byte) -74, var37);
                }
                if (arg1.startsWith("zoom ")) {
                    short var38 = (short) class337.method1980(arg3 - 27264, arg1.substring(5));
                    if (var38 > 0) {
                        class598.field8311 = var38;
                    }
                    return;
                }
                if (class668.field9150 == 10) {
                    class41.field629++;
                    class650 var39 = class314.method1837(class39.field573, true, class625.field8727);
                    var39.field8928.method1141(arg1.length() + 3, 98);
                    var39.field8928.method1141(arg2 ? 1 : 0, -98);
                    var39.field8928.method1141(arg0 ? 1 : 0, -91);
                    var39.field8928.method1110(arg1, -30452);
                    class108.method745(var39, -104);
                }
                if (arg1.startsWith("fps ") && class323.field4120 != class171.field2248) {
                    class102.method685(class337.method1980(-27187, arg1.substring(4)), 132733924);
                    return;
                }
            } catch (Exception var45) {
                class192.method1210(44, class586.field8126.method3261(class416.field5920, (byte) 82));
                return;
            }
        }
        if (arg3 == 77 && class668.field9150 != 10) {
            class192.method1210(arg3 ^ 0xFFFFFFE3, class586.field8128.method3261(class416.field5920, (byte) 82) + arg1);
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Lha;IB)Z", line = 1109)
    public final boolean method2483(class454 arg0, int arg1, byte arg2) {
        if (this.field5933 != arg1) {
            this.field5933 = arg1;
            int var4 = class568.method3199(false, arg1);
            if (var4 > 512) {
                var4 = 512;
            }
            if (var4 <= 0) {
                var4 = 1;
            }
            if (this.field5929 != var4) {
                this.field5939 = null;
                this.field5929 = var4;
            }
            if (this.field5925 != null) {
                this.field5940 = 0;
                int[] var5 = new int[this.field5925.length];
                for (int var6 = 0; var6 < this.field5925.length; var6++) {
                    class478 var7 = this.field5925[var6];
                    if (var7.method2797(this.field5937, this.field5935, this.field5931, this.field5933)) {
                        var5[this.field5940] = var7.field6825;
                        this.field5924[this.field5940++] = var7;
                    }
                }
                class727.method4030(this.field5940 - 1, 0, (byte) 90, this.field5924, var5);
            }
            this.field5934 = true;
        }
        field5938++;
        boolean var8 = false;
        if (this.field5934) {
            this.field5934 = false;
            for (int var9 = this.field5940 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field5924[var9].method2795(arg0, this.field5926);
                this.field5934 |= !var10;
                var8 |= var10;
            }
        }
        if (arg2 < 33) {
            method2482(false, null, false, (byte) 19);
        }
        return var8;
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(I[Llaa;IIII)V", line = 1196)
    public class417(int arg0, class478[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field5935 = arg4;
        this.field5925 = arg1;
        this.field5937 = arg3;
        this.field5931 = arg5;
        this.field5932 = arg0;
        if (arg1 == null) {
            this.field5926 = null;
            this.field5924 = null;
        } else {
            this.field5924 = new class478[arg1.length];
            this.field5926 = arg2 < 0 ? null : arg1[arg2];
        }
    }
}
