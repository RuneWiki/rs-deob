import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class640 {

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "Liba;")
    public static class211 field9184 = new class211(48, -1);

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "[Lwda;")
    public static class439[] field9188 = new class439[75];

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public static int field9185;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    public static int field9186;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public static int field9187;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "[Lf;")
    public static class256[] field9189;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIB)I", line = 4)
    public static final int method3647(int arg0, int arg1, byte arg2) {
        field9185++;
        int var3 = arg0 * 57 + arg1;
        int var4 = var3 << 13 ^ var3;
        int var5 = Integer.MAX_VALUE & (var4 * var4 * 15731 + 789221) * var4 + 1376312589;
        if (arg2 > -87) {
            method3649(85);
        }
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZZLjava/lang/String;I)V", line = 20)
    public static final void method3648(boolean arg0, boolean arg1, String arg2, int arg3) {
        field9187++;
        try {
            if (arg2.equalsIgnoreCase("commands") || arg2.equalsIgnoreCase("help")) {
                class600.method3415("commands - This command", true);
                class600.method3415("cls - Clear console", true);
                class600.method3415("displayfps - Toggle FPS and other information", true);
                class600.method3415("renderer - Print graphics renderer information", true);
                class600.method3415("heap - Print java memory information", true);
                return;
            }
            if (arg2.equalsIgnoreCase("cls")) {
                class217.field2899 = 0;
                class477.field6836 = 0;
                return;
            }
            if (arg3 > -32) {
                field9184 = null;
            }
            if (arg2.equalsIgnoreCase("displayfps")) {
                class300.field4448 = !class300.field4448;
                if (!class300.field4448) {
                    class600.method3415("FPS off", true);
                    return;
                }
                class600.method3415("FPS on", true);
                return;
            }
            if (arg2.equals("renderer")) {
                class658 var4 = class332.field4821.method683();
                class600.method3415("Vendor: " + var4.field9401, true);
                class600.method3415("Name: " + var4.field9398, true);
                class600.method3415("Version: " + var4.field9396, true);
                class600.method3415("Device: " + var4.field9402, true);
                class600.method3415("Driver Version: " + var4.field9400, true);
                return;
            }
            if (arg2.equals("heap")) {
                class600.method3415("Heap: " + class190.field2576 + "MB", true);
                return;
            }
        } catch (Exception var43) {
            class600.method3415(class279.field3627.method1654(-92, class262.field3401), true);
            return;
        }
        if (class280.field3708 != class215.field2882 || class248.field3272 >= 2) {
            if (arg2.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg2.equals("nativememerror")) {
                throw new OutOfMemoryError("native(MPR");
            }
            try {
                if (arg2.equalsIgnoreCase("printfps")) {
                    class600.method3415("FPS: " + class116.field1741, true);
                    return;
                }
                if (arg2.equalsIgnoreCase("occlude")) {
                    class512.field7212 = !class512.field7212;
                    if (!class512.field7212) {
                        class600.method3415("Occlsion now off!", true);
                        return;
                    }
                    class600.method3415("Occlsion now on!", true);
                    return;
                }
                if (arg2.equalsIgnoreCase("fpson")) {
                    class300.field4448 = true;
                    class600.method3415("fps debug enabled", true);
                    return;
                }
                if (arg2.equalsIgnoreCase("fpsoff")) {
                    class300.field4448 = false;
                    class600.method3415("fps debug disabled", true);
                    return;
                }
                if (arg2.equals("systemmem")) {
                    try {
                        class600.method3415("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb", true);
                        return;
                    } catch (Throwable var37) {
                        return;
                    }
                }
                if (arg2.equalsIgnoreCase("cleartext")) {
                    class597.field8638.method2366(false);
                    class600.method3415("Text coords cleared", true);
                    return;
                }
                if (arg2.equalsIgnoreCase("gc")) {
                    class186.method1234(0);
                    for (int var5 = 0; var5 < 10; var5++) {
                        System.gc();
                    }
                    Runtime var6 = Runtime.getRuntime();
                    int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                    class600.method3415("mem=" + var7 + "k", true);
                    return;
                }
                if (arg2.equalsIgnoreCase("compact")) {
                    class186.method1234(0);
                    for (int var8 = 0; var8 < 10; var8++) {
                        System.gc();
                    }
                    Runtime var9 = Runtime.getRuntime();
                    int var10 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                    class600.method3415("Memory before cleanup=" + var10 + "k", true);
                    class308.method1923(0);
                    class186.method1234(0);
                    for (int var11 = 0; var11 < 10; var11++) {
                        System.gc();
                    }
                    int var12 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                    class600.method3415("Memory after cleanup=" + var12 + "k", true);
                    return;
                }
                if (arg2.equalsIgnoreCase("unloadnatives")) {
                    class600.method3415(class28.method180((byte) -108) ? "Libraries unloaded" : "Library unloading failed!", true);
                    return;
                }
                if (arg2.equalsIgnoreCase("clientdrop")) {
                    class600.method3415("Dropped client connection", true);
                    if (class264.field3451 == 10) {
                        class102.method728((byte) -105);
                        return;
                    }
                    if (class264.field3451 == 11) {
                        class87.field1347 = true;
                    }
                    return;
                }
                if (arg2.equalsIgnoreCase("rotateconnectmethods")) {
                    class684.field9654.method729(31292);
                    class600.method3415("Rotated connection methods", true);
                    return;
                }
                if (arg2.equalsIgnoreCase("clientjs5drop")) {
                    class212.field2856.method2842(-25);
                    class600.method3415("Dropped client js5 net queue", true);
                    return;
                }
                if (arg2.equalsIgnoreCase("serverjs5drop")) {
                    class212.field2856.method2837(false);
                    class600.method3415("Dropped server js5 net queue", true);
                    return;
                }
                if (arg2.equalsIgnoreCase("breakcon")) {
                    class61.field978.method1417(-7);
                    class230.field3051.method1361((byte) -54);
                    class212.field2856.method2850((byte) -70);
                    class600.method3415("Breaking new connections for 5 seconds", true);
                    return;
                }
                if (arg2.equalsIgnoreCase("rebuild")) {
                    class654.method3700(-1681322014);
                    class185.method1232(-124);
                    class600.method3415("Rebuilding map", true);
                    return;
                }
                if (arg2.equalsIgnoreCase("rebuildprofile")) {
                    class338.field4910 = class60.method371(false);
                    class149.field2114 = true;
                    class654.method3700(-1681322014);
                    class185.method1232(-123);
                    class600.method3415("Rebuilding map (with profiling)", true);
                    return;
                }
                if (arg2.equalsIgnoreCase("wm1")) {
                    class378.method2336(-1, false, (byte) -127, -1, 1);
                    if (class38.method219(-2) == 1) {
                        class600.method3415("wm1 succeeded", true);
                        return;
                    }
                    class600.method3415("wm1 failed", true);
                    return;
                }
                if (arg2.equalsIgnoreCase("wm2")) {
                    class378.method2336(-1, false, (byte) -123, -1, 2);
                    if (class38.method219(-2) == 2) {
                        class600.method3415("wm2 succeeded", true);
                        return;
                    }
                    class600.method3415("wm2 failed", true);
                    return;
                }
                if (arg2.equalsIgnoreCase("wm3")) {
                    class378.method2336(768, false, (byte) -104, 1024, 3);
                    if (class38.method219(-2) != 3) {
                        class600.method3415("wm3 failed", true);
                        return;
                    }
                    class600.method3415("wm3 succeeded", true);
                    return;
                }
                if (arg2.equalsIgnoreCase("tk0")) {
                    class409.method2509(512, 0);
                    if (class62.field996 != 0) {
                        class600.method3415("Failed to enter tk0", true);
                        return;
                    }
                    class600.method3415("Entered tk0", true);
                    class335.field4872.field9483 = 0;
                    class335.field4872.method3442(class61.field978, 111);
                    class326.field4730 = false;
                    return;
                }
                if (arg2.equalsIgnoreCase("tk1")) {
                    class409.method2509(512, 1);
                    if (class62.field996 == 1) {
                        class600.method3415("Entered tk1", true);
                        class335.field4872.field9483 = 1;
                        class335.field4872.method3442(class61.field978, 124);
                        class326.field4730 = false;
                        return;
                    }
                    class600.method3415("Failed to enter tk1", true);
                    return;
                }
                if (arg2.equalsIgnoreCase("tk2")) {
                    class409.method2509(512, 2);
                    if (class62.field996 != 2) {
                        class600.method3415("Failed to enter tk2", true);
                        return;
                    }
                    class600.method3415("Entered tk2", true);
                    class335.field4872.field9483 = 2;
                    class335.field4872.method3442(class61.field978, 115);
                    class326.field4730 = false;
                    return;
                }
                if (arg2.equalsIgnoreCase("tk3")) {
                    class409.method2509(512, 3);
                    if (class62.field996 != 3) {
                        class600.method3415("Failed to enter tk3", true);
                        return;
                    }
                    class600.method3415("Entered tk3", true);
                    class335.field4872.field9483 = 3;
                    class335.field4872.method3442(class61.field978, 116);
                    class326.field4730 = false;
                    return;
                }
                if (arg2.equalsIgnoreCase("tk5")) {
                    class409.method2509(512, 5);
                    if (class62.field996 != 5) {
                        class600.method3415("Failed to enter tk5", true);
                        return;
                    }
                    class600.method3415("Entered tk5", true);
                    class335.field4872.field9483 = 5;
                    class335.field4872.method3442(class61.field978, 104);
                    class326.field4730 = false;
                    return;
                }
                if (arg2.equalsIgnoreCase("ot")) {
                    class335.field4872.field9497 = !class335.field4872.field9497;
                    class335.field4872.method3442(class61.field978, 119);
                    class326.field4730 = false;
                    class654.method3700(-1681322014);
                    class600.method3415("ot=" + class335.field4872.field9497, true);
                    return;
                }
                if (arg2.equalsIgnoreCase("gb")) {
                    class335.field4872.field9475 = !class335.field4872.field9475;
                    class335.field4872.method3442(class61.field978, 123);
                    class326.field4730 = false;
                    class654.method3700(-1681322014);
                    class600.method3415("gb=" + class335.field4872.field9475, true);
                    return;
                }
                if (arg2.startsWith("shadows")) {
                    if (arg2.length() < 8) {
                        class600.method3415("Invalid shadows value", true);
                        return;
                    }
                    String var13 = arg2.substring(8);
                    int var14 = class86.method488((byte) 116, var13) ? class87.method496(var13, (byte) -126) : -1;
                    if (var14 >= 0 && var14 <= 2) {
                        class335.field4872.method3782(class62.field996, (byte) -102, var14);
                        class335.field4872.method3442(class61.field978, 124);
                        class326.field4730 = false;
                        class654.method3700(-1681322014);
                        class600.method3415("shadows=" + var14, true);
                        return;
                    }
                    class600.method3415("Invalid shadows value", true);
                    return;
                }
                if (arg2.startsWith("textures")) {
                    class335.field4872.field9465 = !class335.field4872.field9465;
                    class335.field4872.method3442(class61.field978, 112);
                    class326.field4730 = false;
                    class614.method3500(40);
                    class654.method3700(-1681322014);
                    class600.method3415("textures=" + class335.field4872.field9465, true);
                    return;
                }
                if (arg2.startsWith("lighting")) {
                    class335.field4872.method3783(26488, !class335.field4872.method3785(class62.field996, 3), class62.field996);
                    class335.field4872.method3442(class61.field978, 124);
                    class326.field4730 = false;
                    class456.method2668(255);
                    class614.method3500(59);
                    class654.method3700(-1681322014);
                    class600.method3415("lighting=" + class335.field4872.method3785(class62.field996, 3), true);
                    return;
                }
                if (arg2.startsWith("setba")) {
                    if (arg2.length() < 6) {
                        class600.method3415("Invalid buildarea value", true);
                        return;
                    }
                    int var15 = class87.method496(arg2.substring(6), (byte) -85);
                    if (var15 >= 0 && class236.method1450(class190.field2576, 83) >= var15) {
                        class335.field4872.field9481 = var15;
                        class335.field4872.method3442(class61.field978, 123);
                        class326.field4730 = false;
                        class600.method3415("maxbuildarea=" + class335.field4872.field9481, true);
                        return;
                    }
                    class600.method3415("Invalid buildarea value", true);
                    return;
                }
                if (arg2.startsWith("rect_debug")) {
                    if (arg2.length() < 10) {
                        class600.method3415("Invalid rect_debug value", true);
                        return;
                    }
                    class145.field2086 = class87.method496(arg2.substring(10).trim(), (byte) -110);
                    class600.method3415("rect_debug=" + class145.field2086, true);
                    return;
                }
                if (arg2.equalsIgnoreCase("qa_op_test")) {
                    class1.field9 = true;
                    class600.method3415("qa_op_test=" + class1.field9, true);
                    return;
                }
                if (arg2.equalsIgnoreCase("clipcomponents")) {
                    class257.field3336 = !class257.field3336;
                    class600.method3415("clipcomponents=" + class257.field3336, true);
                    return;
                }
                if (arg2.startsWith("bloom")) {
                    boolean var16 = class332.field4821.method705();
                    if (!class379.method2352(!var16, -1)) {
                        class600.method3415("Failed to enable bloom", true);
                        return;
                    }
                    if (!var16) {
                        class600.method3415("Bloom enabled", true);
                        return;
                    }
                    class600.method3415("Bloom disabled", true);
                    return;
                }
                if (arg2.equalsIgnoreCase("tween")) {
                    if (class59.field959) {
                        class59.field959 = false;
                        class600.method3415("Forced tweening disabled.", true);
                        return;
                    }
                    class59.field959 = true;
                    class600.method3415("Forced tweening ENABLED!", true);
                    return;
                }
                if (arg2.equalsIgnoreCase("shiftclick")) {
                    if (class51.field790) {
                        class600.method3415("Shift-click disabled.", true);
                        class51.field790 = false;
                        return;
                    }
                    class600.method3415("Shift-click ENABLED!", true);
                    class51.field790 = true;
                    return;
                }
                if (arg2.equalsIgnoreCase("getcgcoord")) {
                    class600.method3415("x:" + (class321.field4681.field7895 >> 9) + " z:" + (class321.field4681.field7896 >> 9), true);
                    return;
                }
                if (arg2.equalsIgnoreCase("getheight")) {
                    class600.method3415("Height: " + class178.field2480[class321.field4681.field7905].method3822(class321.field4681.field7896 >> 9, class321.field4681.field7895 >> 9, 0), true);
                    return;
                }
                if (arg2.equalsIgnoreCase("resetminimap")) {
                    class595.field8616.method1825(-41);
                    class595.field8616.method1829(0);
                    class652.field9331.method229((byte) 65);
                    class189.field2572.method2755(79);
                    class185.method1232(-96);
                    class600.method3415("Minimap reset", true);
                    return;
                }
                if (arg2.startsWith("mc")) {
                    if (class332.field4821.method654()) {
                        int var17 = Integer.parseInt(arg2.substring(3));
                        if (var17 < 1) {
                            var17 = 1;
                        } else if (var17 > 4) {
                            var17 = 4;
                        }
                        class280.field3704 = var17;
                        class654.method3700(-1681322014);
                        class600.method3415("Render cores now: " + class280.field3704, true);
                        return;
                    }
                    class600.method3415("Current toolkit doesn't support multiple cores", true);
                    return;
                }
                if (arg2.startsWith("cachespace")) {
                    class600.method3415("I(s): " + class211.field2855.method3895(113) + "/" + class211.field2855.method3899((byte) -78), true);
                    class600.method3415("I(m): " + class475.field6813.method3895(-99) + "/" + class475.field6813.method3899((byte) -78), true);
                    class600.method3415("O(s): " + class259.field3355.field5799.method3831((byte) 103) + "/" + class259.field3355.field5799.method3839((byte) -59), true);
                    return;
                }
                if (arg2.equalsIgnoreCase("getcamerapos")) {
                    class600.method3415("Pos: " + class321.field4681.field7905 + "," + ((class306.field4529 >> 9) + class397.field6005 >> 6) + "," + ((class603.field8702 >> 9) + class403.field6049 >> 6) + "," + ((class306.field4529 >> 9) + class397.field6005 & 0x3F) + "," + ((class603.field8702 >> 9) + class403.field6049 & 0x3F) + " Height: " + (class504.method2870((byte) -121, class603.field8702, class306.field4529, class321.field4681.field7905) - class533.field7839), true);
                    class600.method3415("Look: " + class321.field4681.field7905 + "," + (class119.field1780 + class397.field6005 >> 6) + "," + (class478.field6845 + class403.field6049 >> 6) + "," + (class397.field6005 + class119.field1780 & 0x3F) + "," + (class478.field6845 + class403.field6049 & 0x3F) + " Height: " + (class504.method2870((byte) -120, class478.field6845, class119.field1780, class321.field4681.field7905) - class109.field1626), true);
                    return;
                }
                if (arg2.equals("renderprofile") || arg2.equals("rp")) {
                    class111.field1637 = !class111.field1637;
                    class332.field4821.method713(class111.field1637);
                    class405.method2494(15774);
                    class600.method3415("showprofiling=" + class111.field1637, true);
                    return;
                }
                if (arg2.startsWith("performancetest")) {
                    int var18 = -1;
                    int var19 = 1000;
                    if (arg2.length() > 15) {
                        String[] var20 = class509.method2891(arg2, ' ', 126);
                        try {
                            if (var20.length > 1) {
                                var19 = Integer.parseInt(var20[1]);
                            }
                        } catch (Throwable var39) {
                        }
                        try {
                            if (var20.length > 2) {
                                var18 = Integer.parseInt(var20[2]);
                            }
                        } catch (Throwable var38) {
                        }
                    }
                    if (var18 != -1) {
                        class600.method3415("Performance: " + class388.method2394(true, var19, class62.field996), true);
                        return;
                    }
                    class600.method3415("Java toolkit: " + class388.method2394(true, var19, 0), true);
                    class600.method3415("SSE toolkit:  " + class388.method2394(true, var19, 2), true);
                    class600.method3415("D3D toolkit:  " + class388.method2394(true, var19, 3), true);
                    class600.method3415("GL toolkit:   " + class388.method2394(true, var19, 1), true);
                    class600.method3415("GLX toolkit:  " + class388.method2394(true, var19, 5), true);
                    return;
                }
                if (arg2.equals("nonpcs")) {
                    class263.field3411 = !class263.field3411;
                    class600.method3415("nonpcs=" + class263.field3411, true);
                    return;
                }
                if (arg2.equals("autoworld")) {
                    class200.method1301(false);
                    class600.method3415("auto world selected", true);
                    return;
                }
                if (arg2.startsWith("switchworld")) {
                    int var21 = Integer.parseInt(arg2.substring(12));
                    class127.method910(class378.method2334(-1, var21).field1742, -120, var21);
                    class600.method3415("switched", true);
                    return;
                }
                if (arg2.equals("getworld")) {
                    class600.method3415("w: " + class684.field9654.field1522, true);
                    return;
                }
                if (arg2.startsWith("pc")) {
                    class654 var22 = class631.method3628(class401.field6040, (byte) -51, class357.field5280);
                    var22.field9358.method3110(0, 83);
                    int var23 = var22.field9358.field7956;
                    int var24 = arg2.indexOf(" ", 4);
                    var22.field9358.method3132(arg2.substring(3, var24), 3);
                    class309.method1928((byte) -112, arg2.substring(var24), var22.field9358);
                    var22.field9358.method3142(var22.field9358.field7956 - var23, true);
                    class444.method2623(120, var22);
                    return;
                }
                if (arg2.equals("savevarcs")) {
                    class177.method1206((byte) -112);
                    class600.method3415("perm varcs saved", true);
                    return;
                }
                if (arg2.equals("scramblevarcs")) {
                    for (int var25 = 0; var25 < class653.field9351.length; var25++) {
                        if (class338.field4914[var25]) {
                            class653.field9351[var25] = (int) (Math.random() * 99999.0D);
                            if (Math.random() > 0.5D) {
                                class653.field9351[var25] *= -1;
                            }
                        }
                    }
                    class177.method1206((byte) -112);
                    class600.method3415("perm varcs scrambled", true);
                    return;
                }
                if (arg2.equals("showcolmap")) {
                    class32.field539 = true;
                    class185.method1232(-100);
                    class600.method3415("colmap is shown", true);
                    return;
                }
                if (arg2.equals("hidecolmap")) {
                    class32.field539 = false;
                    class185.method1232(-23);
                    class600.method3415("colmap is hidden", true);
                    return;
                }
                if (arg2.equals("resetcache")) {
                    class245.method1499(-102);
                    class600.method3415("Caches reset", true);
                    return;
                }
                if (arg2.equals("profilecpu")) {
                    class600.method3415(class658.method3711((byte) -103) + "ms", true);
                    return;
                }
                if (arg2.startsWith("getclientvarpbit")) {
                    int var26 = Integer.parseInt(arg2.substring(17));
                    class600.method3415("varpbit=" + class308.field4545.method2492(var26, (byte) 53), true);
                    return;
                }
                if (arg2.startsWith("getclientvarp")) {
                    int var27 = Integer.parseInt(arg2.substring(14));
                    class600.method3415("varp=" + class308.field4545.method2491(var27, (byte) 110), true);
                    return;
                }
                if (arg2.startsWith("demologin")) {
                    class133.method946(0, false, 3);
                    return;
                }
                if (arg2.startsWith("newdemologin")) {
                    class133.method946(0, true, 3);
                    return;
                }
                if (arg2.startsWith("directlogin")) {
                    String[] var28 = class509.method2891(arg2.substring(12), ' ', -123);
                    if (var28.length >= 2) {
                        int var29 = var28.length > 2 ? Integer.parseInt(var28[2]) : 0;
                        class370.method2292(-19, var28[1], var28[0], var29);
                        return;
                    }
                }
                if (arg2.startsWith("csprofileclear")) {
                    class195.method1264();
                    return;
                }
                if (arg2.startsWith("csprofileoutputc")) {
                    class195.method1265(100, false);
                    return;
                }
                if (arg2.startsWith("csprofileoutputt")) {
                    class195.method1265(10, true);
                    return;
                }
                if (arg2.startsWith("texsize")) {
                    int var30 = Integer.parseInt(arg2.substring(8));
                    class332.field4821.method690(var30);
                    return;
                }
                if (arg2.equals("soundstreamcount")) {
                    class600.method3415("Active streams: " + class556.field8166.method2211(), true);
                    return;
                }
                if (arg2.equals("autosetup")) {
                    class335.field4872.method3434(1);
                    class600.method3415("Complete. Toolkit now: " + class62.field996, true);
                    return;
                }
                if (arg2.equals("errormessage")) {
                    class600.method3415(class420.field6187.method567(-108), true);
                    return;
                }
                if (arg2.equals("heapdump")) {
                    if (class226.field2996.startsWith("win")) {
                        class231.method1432((byte) -81, new File("C:\\Temp\\heap.dump"), false);
                    } else {
                        class231.method1432((byte) 90, new File("/tmp/heap.dump"), false);
                    }
                    class600.method3415("Done", true);
                    return;
                }
                if (arg2.equals("os")) {
                    class600.method3415("Name: " + class226.field2996, true);
                    class600.method3415("Arch: " + class226.field2984, true);
                    class600.method3415("Ver: " + class226.field2998, true);
                    return;
                }
                if (arg2.startsWith("w2debug")) {
                    int var31 = Integer.parseInt(arg2.substring(8, 9));
                    class448.field6500 = var31;
                    class654.method3700(-1681322014);
                    class600.method3415("Toggled!", true);
                    return;
                }
                if (arg2.startsWith("setoutput ")) {
                    File var32 = new File(arg2.substring(10));
                    if (var32.exists()) {
                        var32 = new File(arg2.substring(10) + "." + class60.method371(false) + ".log");
                        if (var32.exists()) {
                            class600.method3415("file already exists!", true);
                            return;
                        }
                    }
                    if (class600.field8685 != null) {
                        class600.field8685.close();
                        class600.field8685 = null;
                    }
                    try {
                        class600.field8685 = new FileOutputStream(var32);
                        return;
                    } catch (FileNotFoundException var40) {
                        class600.method3415("Could not create " + var32.getName(), true);
                        return;
                    } catch (SecurityException var41) {
                        class600.method3415("Cannot write to " + var32.getName(), true);
                        return;
                    }
                }
                if (arg2.equals("closeoutput")) {
                    if (class600.field8685 != null) {
                        class600.field8685.close();
                    }
                    class600.field8685 = null;
                    return;
                }
                if (arg2.startsWith("runscript ")) {
                    File var33 = new File(arg2.substring(10));
                    if (!var33.exists()) {
                        class600.method3415("No such file", true);
                        return;
                    }
                    byte[] var34 = class420.method2542((byte) -92, var33);
                    if (var34 == null) {
                        class600.method3415("Failed to read file", true);
                        return;
                    }
                    String[] var35 = class509.method2891(class25.method168('\r', class216.method1366(-1, var34), "", -27195), '\n', 118);
                    class187.method1240(var35, (byte) -128);
                    return;
                }
                if (class264.field3451 == 10) {
                    class557.field8177++;
                    class654 var36 = class631.method3628(class332.field4823, (byte) -51, class357.field5280);
                    var36.field9358.method3110(arg2.length() + 3, 38);
                    var36.field9358.method3110(arg0 ? 1 : 0, 105);
                    var36.field9358.method3110(arg1 ? 1 : 0, 101);
                    var36.field9358.method3132(arg2, 3);
                    class444.method2623(121, var36);
                }
                if (arg2.startsWith("fps ") && class280.field3708 != class215.field2882) {
                    class231.method1435(class87.method496(arg2.substring(4), (byte) -119), 24938);
                    return;
                }
            } catch (Exception var42) {
                class600.method3415(class279.field3627.method1654(-124, class262.field3401), true);
                return;
            }
        }
        if (class264.field3451 != 10) {
            class600.method3415(class279.field3628.method1654(92, class262.field3401) + arg2, true);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V", line = 1026)
    public static void method3649(int arg0) {
        if (arg0 != 75) {
            field9188 = null;
        }
        field9188 = null;
        field9189 = null;
        field9184 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)V", line = 1048)
    public static final void method3650(int arg0, int arg1) {
        field9186++;
        class489 var2 = class704.method3942(arg1, arg0, 0);
        var2.method2799(-98);
    }
}
