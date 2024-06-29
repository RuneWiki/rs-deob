import jagex3.jagmisc.jagmisc;
import jaggl.OpenGL;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tea")
public class class564 implements class386 {

    @OriginalMember(owner = "client!tea", name = "s", descriptor = "I")
    private int field8017 = 0;

    @OriginalMember(owner = "client!tea", name = "q", descriptor = "I")
    private int field8015 = -1;

    @OriginalMember(owner = "client!tea", name = "f", descriptor = "[Lifa;")
    private class411[] field8004 = new class411[9];

    @OriginalMember(owner = "client!tea", name = "b", descriptor = "Lep;")
    private class371 field8000;

    @OriginalMember(owner = "client!tea", name = "w", descriptor = "I")
    private int field8021;

    @OriginalMember(owner = "client!tea", name = "y", descriptor = "I")
    public static int field8023 = 1;

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "I")
    public static int field7999;

    @OriginalMember(owner = "client!tea", name = "c", descriptor = "I")
    public static int field8001;

    @OriginalMember(owner = "client!tea", name = "d", descriptor = "I")
    public static int field8002;

    @OriginalMember(owner = "client!tea", name = "e", descriptor = "I")
    public static int field8003;

    @OriginalMember(owner = "client!tea", name = "g", descriptor = "I")
    public static int field8005;

    @OriginalMember(owner = "client!tea", name = "h", descriptor = "I")
    public static int field8006;

    @OriginalMember(owner = "client!tea", name = "i", descriptor = "I")
    public static int field8007;

    @OriginalMember(owner = "client!tea", name = "j", descriptor = "I")
    public static int field8008;

    @OriginalMember(owner = "client!tea", name = "k", descriptor = "I")
    public static int field8009;

    @OriginalMember(owner = "client!tea", name = "l", descriptor = "I")
    public static int field8010;

    @OriginalMember(owner = "client!tea", name = "m", descriptor = "I")
    public static int field8011;

    @OriginalMember(owner = "client!tea", name = "n", descriptor = "I")
    public static int field8012;

    @OriginalMember(owner = "client!tea", name = "o", descriptor = "I")
    public static int field8013;

    @OriginalMember(owner = "client!tea", name = "p", descriptor = "I")
    public static int field8014;

    @OriginalMember(owner = "client!tea", name = "r", descriptor = "I")
    private int field8016;

    @OriginalMember(owner = "client!tea", name = "t", descriptor = "I")
    public static int field8018;

    @OriginalMember(owner = "client!tea", name = "u", descriptor = "I")
    public static int field8019;

    @OriginalMember(owner = "client!tea", name = "v", descriptor = "I")
    public static int field8020;

    @OriginalMember(owner = "client!tea", name = "x", descriptor = "I")
    private int field8022;

    @OriginalMember(owner = "client!tea", name = "z", descriptor = "I")
    private int field8024;

    @OriginalMember(owner = "client!tea", name = "A", descriptor = "I")
    public static int field8025;

    @OriginalMember(owner = "client!tea", name = "B", descriptor = "I")
    public static int field8026;

    @OriginalMember(owner = "client!tea", name = "D", descriptor = "I")
    public static int field8027;

    @OriginalMember(owner = "client!tea", name = "E", descriptor = "I")
    public static int field8028;

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(IB)Z")
    public static final boolean method3366(int arg0, byte arg1) {
        int var2 = 3 / ((-arg1 - 11) / 58);
        field8014++;
        return arg0 == 2 || arg0 == 3;
    }

    @OriginalMember(owner = "client!tea", name = "e", descriptor = "(I)V")
    public final void method2356(int arg0) {
        if (arg0 != -4718) {
            this.method2356(-28);
        }
        field8027++;
        OpenGL.glBindFramebufferEXT(36009, 0);
        this.field8017 &= 0xFFFFFFFD;
        this.field8015 = this.method3376(36008);
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(IZLjava/lang/String;Z)V")
    public static final void method3367(int arg0, boolean arg1, String arg2, boolean arg3) {
        field8003++;
        try {
            if (arg2.equalsIgnoreCase("commands") || arg2.equalsIgnoreCase("help")) {
                class645.method3738("commands - This command", (byte) -49);
                class645.method3738("cls - Clear console", (byte) -49);
                class645.method3738("displayfps - Toggle FPS and other information", (byte) -49);
                class645.method3738("renderer - Print graphics renderer information", (byte) -49);
                class645.method3738("heap - Print java memory information", (byte) -49);
                return;
            }
            if (arg2.equalsIgnoreCase("cls")) {
                class30.field436 = 0;
                class196.field2824 = 0;
                return;
            }
            if (arg2.equalsIgnoreCase("displayfps")) {
                class222.field3119 = !class222.field3119;
                if (!class222.field3119) {
                    class645.method3738("FPS off", (byte) -49);
                    return;
                }
                class645.method3738("FPS on", (byte) -49);
                return;
            }
            if (arg2.equals("renderer")) {
                class702 var4 = class96.field1401.method568();
                class645.method3738("Vendor: " + var4.field9777, (byte) -49);
                class645.method3738("Name: " + var4.field9776, (byte) -49);
                class645.method3738("Version: " + var4.field9780, (byte) -49);
                class645.method3738("Device: " + var4.field9774, (byte) -49);
                class645.method3738("Driver Version: " + var4.field9775, (byte) -49);
                return;
            }
            if (arg2.equals("heap")) {
                class645.method3738("Heap: " + class674.field9497 + "MB", (byte) -49);
                return;
            }
        } catch (Exception var47) {
            class645.method3738(class138.field1838.method891(-2041650704, class369.field4721), (byte) -49);
            return;
        }
        if (class746.field10392 != class456.field6280 || class467.field6375 >= 2) {
            if (arg2.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg2.equals("nativememerror")) {
                throw new OutOfMemoryError("native(MPR");
            }
            try {
                if (arg2.equalsIgnoreCase("printfps")) {
                    class645.method3738("FPS: " + class38.field527, (byte) -49);
                    return;
                }
                if (arg2.equalsIgnoreCase("occlude")) {
                    class57.field802 = !class57.field802;
                    if (class57.field802) {
                        class645.method3738("Occlsion now on!", (byte) -49);
                        return;
                    }
                    class645.method3738("Occlsion now off!", (byte) -49);
                    return;
                }
                if (arg2.equalsIgnoreCase("fpson")) {
                    class222.field3119 = true;
                    class645.method3738("fps debug enabled", (byte) -49);
                    return;
                }
                if (arg2.equalsIgnoreCase("fpsoff")) {
                    class222.field3119 = false;
                    class645.method3738("fps debug disabled", (byte) -49);
                    return;
                }
                if (arg2.equals("systemmem")) {
                    try {
                        class645.method3738("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb", (byte) -49);
                        return;
                    } catch (Throwable var41) {
                        return;
                    }
                }
                if (arg2.equalsIgnoreCase("cleartext")) {
                    class184.field2669.method1955(true);
                    class645.method3738("Text coords cleared", (byte) -49);
                    return;
                }
                if (arg2.equalsIgnoreCase("gc")) {
                    class512.method3059((byte) -32);
                    for (int var5 = 0; var5 < 10; var5++) {
                        System.gc();
                    }
                    Runtime var6 = Runtime.getRuntime();
                    int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                    class645.method3738("mem=" + var7 + "k", (byte) -49);
                    return;
                }
                if (arg2.equalsIgnoreCase("compact")) {
                    class512.method3059((byte) -30);
                    for (int var8 = 0; var8 < 10; var8++) {
                        System.gc();
                    }
                    Runtime var9 = Runtime.getRuntime();
                    int var10 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                    class645.method3738("Memory before cleanup=" + var10 + "k", (byte) -49);
                    class319.method1856((byte) -41);
                    class512.method3059((byte) -27);
                    for (int var11 = 0; var11 < 10; var11++) {
                        System.gc();
                    }
                    int var12 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                    class645.method3738("Memory after cleanup=" + var12 + "k", (byte) -49);
                    return;
                }
                if (arg2.equalsIgnoreCase("unloadnatives")) {
                    class645.method3738(class466.method2779(false) ? "Libraries unloaded" : "Library unloading failed!", (byte) -49);
                    return;
                }
                if (arg2.equalsIgnoreCase("clientdrop")) {
                    class645.method3738("Dropped client connection", (byte) -49);
                    if (class213.field3004 == 10) {
                        class333.method1928(1);
                        return;
                    }
                    if (class213.field3004 == 11) {
                        class594.field8566 = true;
                    }
                    return;
                }
                if (arg2.equalsIgnoreCase("rotateconnectmethods")) {
                    class396.field5504.method388((byte) 70);
                    class645.method3738("Rotated connection methods", (byte) -49);
                    return;
                }
                if (arg2.equalsIgnoreCase("clientjs5drop")) {
                    class480.field6528.method1751(4);
                    class645.method3738("Dropped client js5 net queue", (byte) -49);
                    return;
                }
                if (arg2.equalsIgnoreCase("serverjs5drop")) {
                    class480.field6528.method1749((byte) 24);
                    class645.method3738("Dropped server js5 net queue", (byte) -49);
                    return;
                }
                if (arg2.equalsIgnoreCase("breakcon")) {
                    class379.field5339.method3588(-24);
                    class275.field3699.method2458(1);
                    class480.field6528.method1750(-110);
                    class645.method3738("Breaking new connections for 5 seconds", (byte) -49);
                    return;
                }
                if (arg2.equalsIgnoreCase("rebuild")) {
                    class126.method817(-1);
                    class446.method2659(-1);
                    class645.method3738("Rebuilding map", (byte) -49);
                    return;
                }
                if (arg2.equalsIgnoreCase("rebuildprofile")) {
                    class558.field7940 = class224.method1457((byte) -62);
                    class511.field7122 = true;
                    class126.method817(-1);
                    class446.method2659(-1);
                    class645.method3738("Rebuilding map (with profiling)", (byte) -49);
                    return;
                }
                if (arg2.equalsIgnoreCase("wm1")) {
                    class518.method3079(false, -1, -1, true, 1);
                    if (class615.method3609((byte) 98) != 1) {
                        class645.method3738("wm1 failed", (byte) -49);
                        return;
                    }
                    class645.method3738("wm1 succeeded", (byte) -49);
                    return;
                }
                if (arg2.equalsIgnoreCase("wm2")) {
                    class518.method3079(false, -1, -1, true, 2);
                    if (class615.method3609((byte) 98) != 2) {
                        class645.method3738("wm2 failed", (byte) -49);
                        return;
                    }
                    class645.method3738("wm2 succeeded", (byte) -49);
                    return;
                }
                if (arg2.equalsIgnoreCase("wm3")) {
                    class518.method3079(false, 1024, 768, true, 3);
                    if (class615.method3609((byte) 98) != 3) {
                        class645.method3738("wm3 failed", (byte) -49);
                        return;
                    }
                    class645.method3738("wm3 succeeded", (byte) -49);
                    return;
                }
                if (arg2.equalsIgnoreCase("tk0")) {
                    class736.method4088((byte) 122, false, 0);
                    if (class674.field9500.field5158.method1006(0) == 0) {
                        class645.method3738("Entered tk0", (byte) -49);
                        class674.field9500.method2250((byte) 104, 0, class674.field9500.field5118);
                        class199.method1350(-26159);
                        class83.field1158 = false;
                        return;
                    }
                    class645.method3738("Failed to enter tk0", (byte) -49);
                    return;
                }
                if (arg2.equalsIgnoreCase("tk1")) {
                    class736.method4088((byte) 122, false, 1);
                    if (class674.field9500.field5158.method1006(0) != 1) {
                        class645.method3738("Failed to enter tk1", (byte) -49);
                        return;
                    }
                    class645.method3738("Entered tk1", (byte) -49);
                    class674.field9500.method2250((byte) 103, 1, class674.field9500.field5118);
                    class199.method1350(-26159);
                    class83.field1158 = false;
                    return;
                }
                if (arg2.equalsIgnoreCase("tk2")) {
                    class736.method4088((byte) 122, false, 2);
                    if (class674.field9500.field5158.method1006(0) != 2) {
                        class645.method3738("Failed to enter tk2", (byte) -49);
                        return;
                    }
                    class645.method3738("Entered tk2", (byte) -49);
                    class674.field9500.method2250((byte) 112, 2, class674.field9500.field5118);
                    class199.method1350(-26159);
                    class83.field1158 = false;
                    return;
                }
                if (arg2.equalsIgnoreCase("tk3")) {
                    class736.method4088((byte) 122, false, 3);
                    if (class674.field9500.field5158.method1006(0) != 3) {
                        class645.method3738("Failed to enter tk3", (byte) -49);
                        return;
                    }
                    class645.method3738("Entered tk3", (byte) -49);
                    class674.field9500.method2250((byte) 114, 3, class674.field9500.field5118);
                    class199.method1350(-26159);
                    class83.field1158 = false;
                    return;
                }
                if (arg2.equalsIgnoreCase("tk5")) {
                    class736.method4088((byte) 122, false, 5);
                    if (class674.field9500.field5158.method1006(0) == 5) {
                        class645.method3738("Entered tk5", (byte) -49);
                        class674.field9500.method2250((byte) 87, 5, class674.field9500.field5118);
                        class199.method1350(-26159);
                        class83.field1158 = false;
                        return;
                    }
                    class645.method3738("Failed to enter tk5", (byte) -49);
                    return;
                }
                if (arg2.startsWith("setba")) {
                    if (arg2.length() < 6) {
                        class645.method3738("Invalid buildarea value", (byte) -49);
                        return;
                    }
                    int var13 = class665.method3815(arg2.substring(6), -125);
                    if (var13 >= 0 && class498.method2985(class674.field9497, false) >= var13) {
                        class674.field9500.method2250((byte) 93, var13, class674.field9500.field5120);
                        class199.method1350(-26159);
                        class83.field1158 = false;
                        class645.method3738("maxbuildarea=" + class674.field9500.field5120.method3602(0), (byte) -49);
                        return;
                    }
                    class645.method3738("Invalid buildarea value", (byte) -49);
                    return;
                }
                if (arg2.startsWith("rect_debug")) {
                    if (arg2.length() < 10) {
                        class645.method3738("Invalid rect_debug value", (byte) -49);
                        return;
                    }
                    class575.field8125 = class665.method3815(arg2.substring(10).trim(), -127);
                    class645.method3738("rect_debug=" + class575.field8125, (byte) -49);
                    return;
                }
                if (arg2.equalsIgnoreCase("qa_op_test")) {
                    class399.field5526 = true;
                    class645.method3738("qa_op_test=" + class399.field5526, (byte) -49);
                    return;
                }
                if (arg2.equalsIgnoreCase("clipcomponents")) {
                    class362.field4644 = !class362.field4644;
                    class645.method3738("clipcomponents=" + class362.field4644, (byte) -49);
                    return;
                }
                if (arg2.startsWith("bloom")) {
                    boolean var14 = class96.field1401.method569();
                    if (class191.method1269(-1, !var14)) {
                        if (var14) {
                            class645.method3738("Bloom disabled", (byte) -49);
                            return;
                        }
                        class645.method3738("Bloom enabled", (byte) -49);
                        return;
                    }
                    class645.method3738("Failed to enable bloom", (byte) -49);
                    return;
                }
                if (arg2.equalsIgnoreCase("tween")) {
                    if (!class729.field10218) {
                        class729.field10218 = true;
                        class645.method3738("Forced tweening ENABLED!", (byte) -49);
                        return;
                    }
                    class729.field10218 = false;
                    class645.method3738("Forced tweening disabled.", (byte) -49);
                    return;
                }
                if (arg2.equalsIgnoreCase("shiftclick")) {
                    if (!class349.field4447) {
                        class645.method3738("Shift-click ENABLED!", (byte) -49);
                        class349.field4447 = true;
                        return;
                    }
                    class645.method3738("Shift-click disabled.", (byte) -49);
                    class349.field4447 = false;
                    return;
                }
                if (arg2.equalsIgnoreCase("getcgcoord")) {
                    class645.method3738("x:" + (class473.field6483.field9490 >> 9) + " z:" + (class473.field6483.field9489 >> 9), (byte) -49);
                    return;
                }
                if (arg2.equalsIgnoreCase("getheight")) {
                    class645.method3738("Height: " + class52.field741[class473.field6483.field9501].method1959(126, class473.field6483.field9489 >> 9, class473.field6483.field9490 >> 9), (byte) -49);
                    return;
                }
                if (arg2.equalsIgnoreCase("resetminimap")) {
                    class323.field4156.method3334((byte) -70);
                    class323.field4156.method3328((byte) -124);
                    class625.field8924.method893(-32199);
                    class92.field1241.method1974(94);
                    class446.method2659(-1);
                    class645.method3738("Minimap reset", (byte) -49);
                    return;
                }
                if (arg2.startsWith("mc")) {
                    if (!class96.field1401.method2180()) {
                        class645.method3738("Current toolkit doesn't support multiple cores", (byte) -49);
                        return;
                    }
                    int var15 = Integer.parseInt(arg2.substring(3));
                    if (var15 < 1) {
                        var15 = 1;
                    } else if (var15 > 4) {
                        var15 = 4;
                    }
                    class231.field3215 = var15;
                    class126.method817(-1);
                    class645.method3738("Render cores now: " + class231.field3215, (byte) -49);
                    return;
                }
                if (arg2.startsWith("cachespace")) {
                    class645.method3738("I(s): " + class352.field4523.method3206(334) + "/" + class352.field4523.method3212(-12), (byte) -49);
                    class645.method3738("I(m): " + class555.field7836.method3206(334) + "/" + class555.field7836.method3212(63), (byte) -49);
                    class645.method3738("O(s): " + class487.field6572.field7138.method4191(6731) + "/" + class487.field6572.field7138.method4197((byte) 93), (byte) -49);
                    return;
                }
                if (arg2.equalsIgnoreCase("getcamerapos")) {
                    class645.method3738("Pos: " + class473.field6483.field9501 + "," + ((class24.field266 >> 9) + class179.field2535 >> 6) + "," + ((class235.field3250 >> 9) + class510.field7109 >> 6) + "," + ((class24.field266 >> 9) + class179.field2535 & 0x3F) + "," + ((class235.field3250 >> 9) + class510.field7109 & 0x3F) + " Height: " + (class438.method2628(class24.field266, class473.field6483.field9501, class235.field3250, (byte) 119) - class57.field798), (byte) -49);
                    class645.method3738("Look: " + class473.field6483.field9501 + "," + (class584.field8361 + class179.field2535 >> 6) + "," + (class93.field1343 + class510.field7109 >> 6) + "," + (class584.field8361 + class179.field2535 & 0x3F) + "," + (class93.field1343 + class510.field7109 & 0x3F) + " Height: " + (class438.method2628(class584.field8361, class473.field6483.field9501, class93.field1343, (byte) 116) - class333.field4271), (byte) -49);
                    return;
                }
                if (arg2.equals("renderprofile") || arg2.equals("rp")) {
                    class617.field8783 = !class617.field8783;
                    class96.field1401.method559(class617.field8783);
                    class370.method2066((byte) 111);
                    class645.method3738("showprofiling=" + class617.field8783, (byte) -49);
                    return;
                }
                if (arg2.startsWith("performancetest")) {
                    int var16 = -1;
                    int var17 = 1000;
                    if (arg2.length() > 15) {
                        String[] var18 = class498.method2984(arg2, ' ', -97);
                        try {
                            if (var18.length > 1) {
                                var17 = Integer.parseInt(var18[1]);
                            }
                        } catch (Throwable var43) {
                        }
                        try {
                            if (var18.length > 2) {
                                var16 = Integer.parseInt(var18[2]);
                            }
                        } catch (Throwable var42) {
                        }
                    }
                    if (var16 == -1) {
                        class645.method3738("Java toolkit: " + class477.method2825(var17, 0, -50), (byte) -49);
                        class645.method3738("SSE toolkit:  " + class477.method2825(var17, 2, -50), (byte) -49);
                        class645.method3738("D3D toolkit:  " + class477.method2825(var17, 3, -50), (byte) -49);
                        class645.method3738("GL toolkit:   " + class477.method2825(var17, 1, -50), (byte) -49);
                        class645.method3738("GLX toolkit:  " + class477.method2825(var17, 5, -50), (byte) -49);
                        return;
                    }
                    class645.method3738("Performance: " + class477.method2825(var17, class674.field9500.field5158.method1006(0), -50), (byte) -49);
                    return;
                }
                if (arg2.equals("nonpcs")) {
                    class555.field7830 = !class555.field7830;
                    class645.method3738("nonpcs=" + class555.field7830, (byte) -49);
                    return;
                }
                if (arg2.equals("autoworld")) {
                    class351.method1999(0);
                    class645.method3738("auto world selected", (byte) -49);
                    return;
                }
                if (arg2.startsWith("switchworld")) {
                    int var19 = Integer.parseInt(arg2.substring(12));
                    class470.method2800(-13796, var19, class50.method340(var19, (byte) -108).field2659);
                    class645.method3738("switched", (byte) -49);
                    return;
                }
                if (arg2.equals("getworld")) {
                    class645.method3738("w: " + class396.field5504.field812, (byte) -49);
                    return;
                }
                if (arg2.startsWith("pc")) {
                    class120 var20 = class292.method1716(class608.field8668, true, class702.field9778);
                    var20.field1653.method184(0, -127);
                    int var21 = var20.field1653.field330;
                    int var22 = arg2.indexOf(" ", 4);
                    var20.field1653.method187(arg2.substring(3, var22), (byte) -64);
                    class729.method4065(var20.field1653, arg2.substring(var22), 42);
                    var20.field1653.method161(var20.field1653.field330 - var21, true);
                    class471.method2805(117, var20);
                    return;
                }
                if (arg2.equals("savevarcs")) {
                    class244.method1551(-78);
                    class645.method3738("perm varcs saved", (byte) -49);
                    return;
                }
                if (arg2.equals("scramblevarcs")) {
                    for (int var23 = 0; var23 < class594.field8568.length; var23++) {
                        if (class504.field7038[var23]) {
                            class594.field8568[var23] = (int) (Math.random() * 99999.0D);
                            if (Math.random() > 0.5D) {
                                class594.field8568[var23] *= -1;
                            }
                        }
                    }
                    class244.method1551(-111);
                    class645.method3738("perm varcs scrambled", (byte) -49);
                    return;
                }
                if (arg2.equals("showcolmap")) {
                    class589.field8460 = true;
                    class446.method2659(-1);
                    class645.method3738("colmap is shown", (byte) -49);
                    return;
                }
                if (arg2.equals("hidecolmap")) {
                    class589.field8460 = false;
                    class446.method2659(-1);
                    class645.method3738("colmap is hidden", (byte) -49);
                    return;
                }
                if (arg2.equals("resetcache")) {
                    class294.method1723(true);
                    class645.method3738("Caches reset", (byte) -49);
                    return;
                }
                if (arg2.equals("profilecpu")) {
                    class645.method3738(class139.method901((byte) 50) + "ms", (byte) -49);
                    return;
                }
                if (arg2.startsWith("getclientvarpbit")) {
                    int var24 = Integer.parseInt(arg2.substring(17));
                    class645.method3738("varpbit=" + class554.field7826.method1433((byte) -77, var24), (byte) -49);
                    return;
                }
                if (arg2.startsWith("getclientvarp")) {
                    int var25 = Integer.parseInt(arg2.substring(14));
                    class645.method3738("varp=" + class554.field7826.method1434(var25, (byte) 94), (byte) -49);
                    return;
                }
                if (arg2.startsWith("directlogin")) {
                    String[] var26 = class498.method2984(arg2.substring(12), ' ', -97);
                    if (var26.length >= 2) {
                        int var27 = var26.length <= 2 ? 0 : Integer.parseInt(var26[2]);
                        class225.method1461(true, var26[1], var27, var26[0]);
                        return;
                    }
                }
                if (arg2.startsWith("csprofileclear")) {
                    class318.method1846();
                    return;
                }
                if (arg2.startsWith("csprofileoutputc")) {
                    class318.method1849(100, false);
                    return;
                }
                if (arg2.startsWith("csprofileoutputt")) {
                    class318.method1849(10, true);
                    return;
                }
                if (arg2.startsWith("texsize")) {
                    int var28 = Integer.parseInt(arg2.substring(8));
                    class96.field1401.method2073(var28);
                    return;
                }
                if (arg2.equals("soundstreamcount")) {
                    class645.method3738("Active streams: " + class237.field3299.method3764(), (byte) -49);
                    return;
                }
                if (arg2.equals("autosetup")) {
                    class608.method3552(-1);
                    class645.method3738("Complete. Toolkit now: " + class674.field9500.field5158.method1006(0), (byte) -49);
                    return;
                }
                if (arg2.equals("errormessage")) {
                    class645.method3738(class306.field3966.method2686((byte) 124), (byte) -49);
                    return;
                }
                if (arg2.equals("heapdump")) {
                    if (class613.field8710.startsWith("win")) {
                        class316.method1829(false, 1, new File("C:\\Temp\\heap.dump"));
                    } else {
                        class316.method1829(false, 1, new File("/tmp/heap.dump"));
                    }
                    class645.method3738("Done", (byte) -49);
                    return;
                }
                if (arg2.equals("os")) {
                    class645.method3738("Name: " + class613.field8710, (byte) -49);
                    class645.method3738("Arch: " + class613.field8722, (byte) -49);
                    class645.method3738("Ver: " + class613.field8725, (byte) -49);
                    return;
                }
                if (arg2.startsWith("w2debug")) {
                    int var29 = Integer.parseInt(arg2.substring(8, 9));
                    class48.field713 = var29;
                    class126.method817(-1);
                    class645.method3738("Toggled!", (byte) -49);
                    return;
                }
                if (arg2.startsWith("ortho ")) {
                    int var30 = arg2.indexOf(32);
                    if (var30 < 0) {
                        class645.method3738("Syntax: ortho <n>", (byte) -49);
                        return;
                    }
                    int var31 = class665.method3815(arg2.substring(var30 + 1), -128);
                    class674.field9500.method2250((byte) 127, var31, class674.field9500.field5129);
                    class199.method1350(-26159);
                    class83.field1158 = false;
                    class48.method331((byte) 27);
                    if (var31 == class674.field9500.field5129.method1636(0)) {
                        class645.method3738("Successfully changed ortho mode", (byte) -49);
                        return;
                    }
                    class645.method3738("Failed to change ortho mode", (byte) -49);
                    return;
                }
                if (arg2.startsWith("orthozoom ")) {
                    if (class674.field9500.field5129.method1636(0) == 0) {
                        class645.method3738("enable ortho mode first (use 'ortho <n>')", (byte) -49);
                        return;
                    }
                    int var32 = class665.method3815(arg2.substring(arg2.indexOf(32) + 1), -125);
                    class527.field7374 = var32;
                    class645.method3738("orthozoom=" + class527.field7374, (byte) -49);
                    return;
                }
                if (arg2.startsWith("orthotilesize ")) {
                    int var33 = class665.method3815(arg2.substring(arg2.indexOf(32) + 1), -126);
                    class295.field3845 = var33;
                    class282.field3747 = var33;
                    class645.method3738("ortho tile size=" + var33, (byte) -49);
                    class48.method331((byte) 27);
                    return;
                }
                if (arg2.equals("orthocamlock")) {
                    class759.field10544 = !class759.field10544;
                    class645.method3738("ortho camera lock is " + (class759.field10544 ? "on" : "off"), (byte) -49);
                    return;
                }
                if (arg2.startsWith("setoutput ")) {
                    File var34 = new File(arg2.substring(10));
                    if (var34.exists()) {
                        var34 = new File(arg2.substring(10) + "." + class224.method1457((byte) -62) + ".log");
                        if (var34.exists()) {
                            class645.method3738("file already exists!", (byte) -49);
                            return;
                        }
                    }
                    if (class283.field3758 != null) {
                        class283.field3758.close();
                        class283.field3758 = null;
                    }
                    try {
                        class283.field3758 = new FileOutputStream(var34);
                        return;
                    } catch (FileNotFoundException var44) {
                        class645.method3738("Could not create " + var34.getName(), (byte) -49);
                        return;
                    } catch (SecurityException var45) {
                        class645.method3738("Cannot write to " + var34.getName(), (byte) -49);
                        return;
                    }
                }
                if (arg2.equals("closeoutput")) {
                    if (class283.field3758 != null) {
                        class283.field3758.close();
                    }
                    class283.field3758 = null;
                    return;
                }
                if (arg2.startsWith("runscript ")) {
                    File var35 = new File(arg2.substring(10));
                    if (!var35.exists()) {
                        class645.method3738("No such file", (byte) -49);
                        return;
                    }
                    byte[] var36 = class704.method3957(64, var35);
                    if (var36 == null) {
                        class645.method3738("Failed to read file", (byte) -49);
                        return;
                    }
                    String[] var37 = class498.method2984(class459.method2752('\r', class639.method3713((byte) -74, var36), 122, ""), '\n', -97);
                    class535.method3196(-72, var37);
                }
                if (arg2.startsWith("zoom ")) {
                    short var38 = (short) class665.method3815(arg2.substring(5), -126);
                    if (var38 > 0) {
                        class610.field8686 = var38;
                    }
                    return;
                }
                if (class213.field3004 == 10) {
                    class249.field3464++;
                    class120 var39 = class292.method1716(class608.field8668, true, class712.field10036);
                    var39.field1653.method184(arg2.length() + 3, -60);
                    var39.field1653.method184(arg3 ? 1 : 0, -78);
                    var39.field1653.method184(arg1 ? 1 : 0, -75);
                    var39.field1653.method187(arg2, (byte) -63);
                    class471.method2805(123, var39);
                }
                if (arg2.startsWith("fps ") && class746.field10392 != class456.field6280) {
                    class740.method4126(29, class665.method3815(arg2.substring(4), -128));
                    return;
                }
            } catch (Exception var46) {
                class645.method3738(class138.field1838.method891(-2041650704, class369.field4721), (byte) -49);
                return;
            }
        }
        int var40 = 20 % ((49 - arg0) / 55);
        if (class213.field3004 != 10) {
            class645.method3738(class138.field1839.method891(-2041650704, class369.field4721) + arg2, (byte) -49);
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(BLha;I)Loq;")
    public static final class742 method3368(byte arg0, class545 arg1, int arg2) {
        field8008++;
        class599 var3 = class542.method3226(true, -128, arg1, arg2);
        if (var3 == null) {
            return null;
        } else {
            if (arg0 < 85) {
                field8023 = 120;
            }
            return var3.field8594;
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(IILrh;I)V")
    public final void method3369(int arg0, int arg1, class633 arg2, int arg3) {
        field8001++;
        this.method3374(true, arg3, arg0, arg2, 0);
        if (arg1 >= -38) {
            this.method2353(105);
        }
    }

    @OriginalMember(owner = "client!tea", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field8000.method2171(this.field8021, -16915);
        field8006++;
        super.finalize();
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(I)V")
    public final void method2351(int arg0) {
        OpenGL.glBindFramebufferEXT(36160, 0);
        if (arg0 != 3498) {
            this.method3375(90, -128);
        }
        field8013++;
        this.field8017 &= 0xFFFFFFFB;
        this.field8015 = this.method3376(arg0 + 32510);
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(ILfq;I)V")
    public final void method3370(int arg0, class204 arg1, int arg2) {
        int var4 = -95 % ((arg0 + 24) / 47);
        this.method3371(arg2, 0, 1, arg1);
        field8018++;
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(IIILfq;)V")
    private final void method3371(int arg0, int arg1, int arg2, class204 arg3) {
        field8026++;
        if (this.field8015 == -1) {
            throw new RuntimeException();
        }
        int var5 = arg2 << arg0;
        if ((~var5 & this.field8022) == 0) {
            this.field8016 = arg3.field2924;
            this.field8024 = arg3.field2934;
        } else if (this.field8024 != arg3.field2934 || this.field8016 != arg3.field2924) {
            throw new RuntimeException();
        }
        arg3.method1369(this.field8015, arg1, true, class393.field5476[arg0]);
        this.field8004[arg0] = arg3;
        this.field8022 |= var5;
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(II)V")
    public final void method3372(int arg0, int arg1) {
        if (this.field8004[arg0] != null) {
            this.field8004[arg0].method527(125);
        }
        field8012++;
        if (arg1 != 36009) {
            this.method3372(113, 74);
        }
        this.field8022 &= ~(0x1 << arg0);
        this.field8004[arg0] = null;
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(BI)V")
    public final void method3373(byte arg0, int arg1) {
        field8009++;
        if (this.field8015 == -1) {
            throw new RuntimeException();
        } else if (arg0 > 30) {
            OpenGL.glReadBuffer(class393.field5476[arg1]);
        }
    }

    @OriginalMember(owner = "client!tea", name = "b", descriptor = "(I)V")
    public final void method2353(int arg0) {
        if (arg0 >= 1) {
            field7999++;
            OpenGL.glBindFramebufferEXT(36009, this.field8021);
            this.field8017 |= 0x2;
            this.field8015 = this.method3376(36008);
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(ZIILrh;I)V")
    private final void method3374(boolean arg0, int arg1, int arg2, class633 arg3, int arg4) {
        field8020++;
        if (this.field8015 == -1) {
            throw new RuntimeException();
        }
        int var6 = 0x1 << arg1;
        if ((~var6 & this.field8022) == 0) {
            this.field8016 = arg3.field9009;
            this.field8024 = arg3.field9009;
        } else if (this.field8024 != arg3.field9009 || this.field8016 != arg3.field9009) {
            throw new RuntimeException();
        }
        arg3.method3678(arg2, class393.field5476[arg1], arg4, this.field8015, arg0);
        this.field8004[arg1] = arg3;
        this.field8022 |= var6;
    }

    @OriginalMember(owner = "client!tea", name = "b", descriptor = "(II)V")
    public final void method3375(int arg0, int arg1) {
        field8005++;
        if (this.field8015 == -1) {
            throw new RuntimeException();
        } else if (arg0 == 2) {
            OpenGL.glDrawBuffer(class393.field5476[arg1]);
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(B)V")
    public final void method2352(byte arg0) {
        field8028++;
        OpenGL.glBindFramebufferEXT(36160, this.field8021);
        this.field8017 |= 0x4;
        if (arg0 != -60) {
            this.method3377(-53);
        }
        this.field8015 = this.method3376(36008);
    }

    @OriginalMember(owner = "client!tea", name = "f", descriptor = "(I)I")
    private final int method3376(int arg0) {
        if (arg0 != 36008) {
            return -53;
        }
        field8011++;
        if ((this.field8017 & 0x4) != 0) {
            return 36160;
        } else if ((this.field8017 & 0x2) == 0) {
            return (this.field8017 & 0x1) == 0 ? -1 : 36008;
        } else {
            return 36009;
        }
    }

    @OriginalMember(owner = "client!tea", name = "d", descriptor = "(I)V")
    public final void method2355(int arg0) {
        if (arg0 == 13095) {
            field8019++;
            OpenGL.glBindFramebufferEXT(36008, 0);
            this.field8017 &= 0xFFFFFFFE;
            this.field8015 = this.method3376(36008);
        }
    }

    @OriginalMember(owner = "client!tea", name = "c", descriptor = "(I)V")
    public final void method2354(int arg0) {
        field8002++;
        OpenGL.glBindFramebufferEXT(36008, this.field8021);
        this.field8017 |= 0x1;
        this.field8015 = this.method3376(arg0 ^ 0xDEE0);
        if (arg0 != 21064) {
            this.method3378(null, -77, true);
        }
    }

    @OriginalMember(owner = "client!tea", name = "g", descriptor = "(I)Z")
    public final boolean method3377(int arg0) {
        if (arg0 < 92) {
            return true;
        } else {
            field8010++;
            int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field8015);
            return var2 == 36053;
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(Llf;IZ)V")
    public final void method3378(class264 arg0, int arg1, boolean arg2) {
        field8025++;
        if (this.field8015 == -1) {
            throw new RuntimeException();
        }
        if (arg2) {
            this.field8024 = 16;
        }
        int var4 = 0x1 << arg1;
        if ((~var4 & this.field8022) == 0) {
            this.field8024 = arg0.field3602;
            this.field8016 = arg0.field3598;
        } else if (this.field8024 != arg0.field3602 || this.field8016 != arg0.field3598) {
            throw new RuntimeException();
        }
        arg0.method1631((byte) -125, class393.field5476[arg1], this.field8015);
        this.field8004[arg1] = arg0;
        this.field8022 |= var4;
    }

    @OriginalMember(owner = "client!tea", name = "<init>", descriptor = "(Lep;)V")
    public class564(class371 arg0) {
        if (!arg0.field5028) {
            throw new IllegalStateException("");
        }
        this.field8000 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class409.field5686, 0);
        this.field8021 = class409.field5686[0];
    }
}
