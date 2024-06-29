import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class90 implements Runnable {

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "Ldha;")
    private class83 field1008 = new class83();

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "I")
    public int field1018 = 0;

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "Z")
    private boolean field1020 = false;

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "Ljava/lang/Thread;")
    private Thread field1019;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
    public static int field1011 = 0;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "F")
    public static float field1015;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IILuaa;)Lms;")
    public final class792 method670(int arg0, int arg1, class126 arg2) {
        field1012++;
        class792 var4 = new class792();
        var4.field1597 = arg1;
        var4.field928 = false;
        var4.field10891 = arg2;
        var4.field10888 = arg0;
        this.method671(6, var4);
        return var4;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILms;)V")
    private final void method671(int arg0, class792 arg1) {
        class83 var3 = this.field1008;
        synchronized (this.field1008) {
            if (arg0 != 6) {
                return;
            }
            this.field1008.method626((byte) 7, arg1);
            this.field1018++;
            this.field1008.notifyAll();
        }
        field1017++;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "([BILuaa;I)Lms;")
    public final class792 method672(byte[] arg0, int arg1, class126 arg2, int arg3) {
        field1013++;
        class792 var5 = new class792();
        var5.field1597 = arg3;
        var5.field928 = false;
        var5.field10891 = arg2;
        var5.field10888 = 2;
        if (arg1 != 63) {
            this.method670(-34, 11, null);
        }
        var5.field10892 = arg0;
        this.method671(6, var5);
        return var5;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Luaa;II)Lms;")
    public final class792 method673(class126 arg0, int arg1, int arg2) {
        field1014++;
        class792 var4 = new class792();
        var4.field10888 = 1;
        class83 var5 = this.field1008;
        synchronized (this.field1008) {
            class792 var6 = (class792) this.field1008.method636(arg1 + 259);
            while (true) {
                if (var6 == null) {
                    if (arg1 != -3) {
                        this.run();
                    }
                    break;
                }
                if ((long) arg2 == var6.field1597 && var6.field10891 == arg0 && var6.field10888 == 2) {
                    var4.field930 = false;
                    var4.field10892 = var6.field10892;
                    return var4;
                }
                var6 = (class792) this.field1008.method637(false);
            }
        }
        var4.field10892 = arg0.method948((byte) -58, arg2);
        var4.field930 = false;
        var4.field928 = true;
        return var4;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
    public final void method674(int arg0) {
        field1016++;
        this.field1020 = true;
        class83 var2 = this.field1008;
        synchronized (this.field1008) {
            this.field1008.notifyAll();
        }
        try {
            this.field1019.join();
            if (arg0 != 2) {
                this.field1008 = null;
            }
        } catch (InterruptedException var3) {
        }
        this.field1019 = null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ljava/lang/String;IZZ)V")
    public static final void method675(String arg0, int arg1, boolean arg2, boolean arg3) {
        field1010++;
        try {
            label687: {
                if (!arg0.equalsIgnoreCase("commands") && !arg0.equalsIgnoreCase("help")) {
                    if (arg0.equalsIgnoreCase("cls")) {
                        class787.field10806 = 0;
                        class138.field2057 = 0;
                        return;
                    }
                    if (arg0.equalsIgnoreCase("displayfps")) {
                        class216.field3351 = !class216.field3351;
                        if (class216.field3351) {
                            class587.method3423("FPS on", arg1 - 123);
                            return;
                        }
                        class587.method3423("FPS off", -128);
                        return;
                    }
                    if (!arg0.equals("renderer")) {
                        if (arg0.equals("heap")) {
                            class587.method3423("Heap: " + class54.field676 + "MB", -115);
                            return;
                        }
                        break label687;
                    }
                    class491 var4 = class37.field491.method553();
                    class587.method3423("Vendor: " + var4.field6964, arg1 ^ 0xFFFFFF80);
                    class587.method3423("Name: " + var4.field6965, -128);
                    class587.method3423("Version: " + var4.field6962, -113);
                    class587.method3423("Device: " + var4.field6963, -111);
                    class587.method3423("Driver Version: " + var4.field6967, -110);
                    return;
                }
                class587.method3423("commands - This command", -123);
                class587.method3423("cls - Clear console", -127);
                class587.method3423("displayfps - Toggle FPS and other information", -118);
                class587.method3423("renderer - Print graphics renderer information", -125);
                class587.method3423("heap - Print java memory information", arg1 - 130);
                return;
            }
        } catch (Exception var49) {
            class587.method3423(class620.field8660.method3580(class140.field2081, 12), arg1 ^ 0xFFFFFF81);
            return;
        }
        if (class622.field8739 != class300.field4326 || class745.field10317 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equals("nativememerror")) {
                throw new OutOfMemoryError("native(MPR");
            }
            try {
                if (arg0.equalsIgnoreCase("printfps")) {
                    class587.method3423("FPS: " + class694.field9696, -122);
                    return;
                }
                if (arg0.equalsIgnoreCase("occlude")) {
                    class694.field9700 = !class694.field9700;
                    if (class694.field9700) {
                        class587.method3423("Occlsion now on!", -128);
                        return;
                    }
                    class587.method3423("Occlsion now off!", -108);
                    return;
                }
                if (arg0.equalsIgnoreCase("fpson")) {
                    class216.field3351 = true;
                    class587.method3423("fps debug enabled", -115);
                    return;
                }
                if (arg0.equalsIgnoreCase("fpsoff")) {
                    class216.field3351 = false;
                    class587.method3423("fps debug disabled", arg1 - 132);
                    return;
                }
                if (arg0.equals("systemmem")) {
                    try {
                        class587.method3423("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + class716.field9938.field249 + "Mb", -109);
                        return;
                    } catch (Throwable var43) {
                        return;
                    }
                }
                if (arg0.equalsIgnoreCase("cleartext")) {
                    class610.field8580.method2169(0);
                    class587.method3423("Text coords cleared", -110);
                    return;
                }
                if (arg0.equalsIgnoreCase("gc")) {
                    class245.method1622(-3);
                    for (int var5 = 0; var5 < 10; var5++) {
                        System.gc();
                    }
                    Runtime var6 = Runtime.getRuntime();
                    int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                    class587.method3423("mem=" + var7 + "k", -123);
                    return;
                }
                if (arg0.equalsIgnoreCase("compact")) {
                    class245.method1622(-3);
                    for (int var8 = 0; var8 < 10; var8++) {
                        System.gc();
                    }
                    Runtime var9 = Runtime.getRuntime();
                    int var10 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                    class587.method3423("Memory before cleanup=" + var10 + "k", -106);
                    class758.method4212((byte) -45);
                    class245.method1622(arg1 ^ 0xFFFFFFFB);
                    for (int var11 = 0; var11 < 10; var11++) {
                        System.gc();
                    }
                    int var12 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                    class587.method3423("Memory after cleanup=" + var12 + "k", arg1 - 113);
                    return;
                }
                if (arg0.equalsIgnoreCase("unloadnatives")) {
                    class587.method3423(class743.method4137(-68) ? "Libraries unloaded" : "Library unloading failed!", arg1 ^ 0xFFFFFF86);
                    return;
                }
                if (arg0.equalsIgnoreCase("clientdrop")) {
                    class587.method3423("Dropped client connection", -109);
                    if (class266.field3873 == 10) {
                        class174.method1265(13);
                        return;
                    }
                    if (class266.field3873 == 11) {
                        class100.field1157 = true;
                    }
                    return;
                }
                if (arg0.equalsIgnoreCase("rotateconnectmethods")) {
                    class5.field34.method417((byte) -86);
                    class587.method3423("Rotated connection methods", -126);
                    return;
                }
                if (arg0.equalsIgnoreCase("clientjs5drop")) {
                    class65.field783.method3503(95);
                    class587.method3423("Dropped client js5 net queue", arg1 - 131);
                    return;
                }
                if (arg0.equalsIgnoreCase("serverjs5drop")) {
                    class65.field783.method3508(false);
                    class587.method3423("Dropped server js5 net queue", -110);
                    return;
                }
                if (arg0.equalsIgnoreCase("breakcon")) {
                    class519.field7328.method2835((byte) 109);
                    class527.field7529.method619((byte) 104);
                    class65.field783.method3507((byte) 107);
                    class587.method3423("Breaking new connections for 5 seconds", -109);
                    return;
                }
                if (arg0.equalsIgnoreCase("rebuild")) {
                    class13.method139(true);
                    class515.method3108(arg1 ^ 0x54CE);
                    class587.method3423("Rebuilding map", -127);
                    return;
                }
                if (arg0.equalsIgnoreCase("rebuildprofile")) {
                    class647.field9057 = class459.method2731(115);
                    class106.field1345 = true;
                    class13.method139(true);
                    class515.method3108(21704);
                    class587.method3423("Rebuilding map (with profiling)", arg1 - 116);
                    return;
                }
                if (arg0.equalsIgnoreCase("wm1")) {
                    class666.method3797(-1, -96, -1, false, 1);
                    if (class592.method3442((byte) -51) == 1) {
                        class587.method3423("wm1 succeeded", -126);
                        return;
                    }
                    class587.method3423("wm1 failed", -114);
                    return;
                }
                if (arg0.equalsIgnoreCase("wm2")) {
                    class666.method3797(-1, arg1 ^ -97, -1, false, 2);
                    if (class592.method3442((byte) -104) == 2) {
                        class587.method3423("wm2 succeeded", -127);
                        return;
                    }
                    class587.method3423("wm2 failed", -123);
                    return;
                }
                if (arg0.equalsIgnoreCase("wm3")) {
                    class666.method3797(1024, -113, 768, false, 3);
                    if (class592.method3442((byte) -48) != 3) {
                        class587.method3423("wm3 failed", -120);
                        return;
                    }
                    class587.method3423("wm3 succeeded", -118);
                    return;
                }
                if (arg0.equalsIgnoreCase("tk0")) {
                    class9.method61(0, false, (byte) -40);
                    if (class21.field353.field10098.method1588(-63) == 0) {
                        class587.method3423("Entered tk0", -107);
                        class21.field353.method4080(true, class21.field353.field10076, 0);
                        class580.method3397((byte) 13);
                        class768.field10567 = false;
                        return;
                    }
                    class587.method3423("Failed to enter tk0", -126);
                    return;
                }
                if (arg0.equalsIgnoreCase("tk1")) {
                    class9.method61(1, false, (byte) -40);
                    if (class21.field353.field10098.method1588(-108) != 1) {
                        class587.method3423("Failed to enter tk1", -106);
                        return;
                    }
                    class587.method3423("Entered tk1", -107);
                    class21.field353.method4080(true, class21.field353.field10076, 1);
                    class580.method3397((byte) 13);
                    class768.field10567 = false;
                    return;
                }
                if (arg0.equalsIgnoreCase("tk2")) {
                    class9.method61(2, false, (byte) -40);
                    if (class21.field353.field10098.method1588(arg1 ^ 0xFFFFFF97) == 2) {
                        class587.method3423("Entered tk2", -122);
                        class21.field353.method4080(true, class21.field353.field10076, 2);
                        class580.method3397((byte) 13);
                        class768.field10567 = false;
                        return;
                    }
                    class587.method3423("Failed to enter tk2", -106);
                    return;
                }
                if (arg0.equalsIgnoreCase("tk3")) {
                    class9.method61(3, false, (byte) -40);
                    if (class21.field353.field10098.method1588(-22) != 3) {
                        class587.method3423("Failed to enter tk3", -118);
                        return;
                    }
                    class587.method3423("Entered tk3", -123);
                    class21.field353.method4080(true, class21.field353.field10076, 3);
                    class580.method3397((byte) 13);
                    class768.field10567 = false;
                    return;
                }
                if (arg0.equalsIgnoreCase("tk5")) {
                    class9.method61(5, false, (byte) -40);
                    if (class21.field353.field10098.method1588(-32) == 5) {
                        class587.method3423("Entered tk5", -124);
                        class21.field353.method4080(true, class21.field353.field10076, 5);
                        class580.method3397((byte) 13);
                        class768.field10567 = false;
                        return;
                    }
                    class587.method3423("Failed to enter tk5", -124);
                    return;
                }
                if (arg0.startsWith("setba")) {
                    if (arg0.length() < 6) {
                        class587.method3423("Invalid buildarea value", -111);
                        return;
                    }
                    int var13 = class163.method1224(false, arg0.substring(6));
                    if (var13 >= 0 && var13 <= class214.method1475(class54.field676, arg1 - 83)) {
                        class21.field353.method4080(true, class21.field353.field10100, var13);
                        class580.method3397((byte) 13);
                        class768.field10567 = false;
                        class587.method3423("maxbuildarea=" + class21.field353.field10100.method1660(-128), arg1 - 116);
                        return;
                    }
                    class587.method3423("Invalid buildarea value", -113);
                    return;
                }
                if (arg0.startsWith("rect_debug")) {
                    if (arg0.length() < 10) {
                        class587.method3423("Invalid rect_debug value", -118);
                        return;
                    }
                    class42.field545 = class163.method1224(false, arg0.substring(10).trim());
                    class587.method3423("rect_debug=" + class42.field545, -109);
                    return;
                }
                if (arg0.equalsIgnoreCase("qa_op_test")) {
                    class81.field901 = true;
                    class587.method3423("qa_op_test=" + class81.field901, -119);
                    return;
                }
                if (arg0.equalsIgnoreCase("clipcomponents")) {
                    class378.field5215 = !class378.field5215;
                    class587.method3423("clipcomponents=" + class378.field5215, -123);
                    return;
                }
                if (arg0.startsWith("bloom")) {
                    boolean var14 = class37.field491.method451();
                    if (class338.method2145((byte) -126, !var14)) {
                        if (var14) {
                            class587.method3423("Bloom disabled", -109);
                            return;
                        }
                        class587.method3423("Bloom enabled", -107);
                        return;
                    }
                    class587.method3423("Failed to enable bloom", arg1 ^ 0xFFFFFF97);
                    return;
                }
                if (arg0.equalsIgnoreCase("tween")) {
                    if (!class778.field10685) {
                        class778.field10685 = true;
                        class587.method3423("Forced tweening ENABLED!", -118);
                        return;
                    }
                    class778.field10685 = false;
                    class587.method3423("Forced tweening disabled.", arg1 ^ 0xFFFFFF8B);
                    return;
                }
                if (arg0.equalsIgnoreCase("shiftclick")) {
                    if (!class548.field7872) {
                        class587.method3423("Shift-click ENABLED!", arg1 ^ 0xFFFFFF94);
                        class548.field7872 = true;
                        return;
                    }
                    class587.method3423("Shift-click disabled.", -121);
                    class548.field7872 = false;
                    return;
                }
                if (arg0.equalsIgnoreCase("getcgcoord")) {
                    class587.method3423("x:" + (class210.field3250.field5742 >> 9) + " z:" + (class210.field3250.field5746 >> 9), arg1 ^ 0xFFFFFF85);
                    return;
                }
                if (arg0.equalsIgnoreCase("getheight")) {
                    class587.method3423("Height: " + class208.field3219[class210.field3250.field5755].method1904(class210.field3250.field5746 >> 9, (byte) -127, class210.field3250.field5742 >> 9), -111);
                    return;
                }
                if (arg0.equalsIgnoreCase("resetminimap")) {
                    class152.field2163.method4344(0);
                    class152.field2163.method4340((byte) -111);
                    class618.field8642.method4324(-1);
                    class53.field669.method1234(true);
                    class515.method3108(21704);
                    class587.method3423("Minimap reset", -106);
                    return;
                }
                if (arg0.startsWith("mc")) {
                    if (class37.field491.method477()) {
                        int var15 = Integer.parseInt(arg0.substring(3));
                        if (var15 < 1) {
                            var15 = 1;
                        } else if (var15 > 4) {
                            var15 = 4;
                        }
                        class683.field9463 = var15;
                        class13.method139(true);
                        class587.method3423("Render cores now: " + class683.field9463, -110);
                        return;
                    }
                    class587.method3423("Current toolkit doesn't support multiple cores", arg1 ^ 0xFFFFFF8D);
                    return;
                }
                if (arg0.startsWith("cachespace")) {
                    class587.method3423("I(s): " + class254.field3744.method3744(false) + "/" + class254.field3744.method3737(-128), -117);
                    class587.method3423("I(m): " + class225.field3465.method3744(false) + "/" + class225.field3465.method3737(arg1 - 85), arg1 ^ 0xFFFFFF84);
                    class587.method3423("O(s): " + class313.field4456.field3788.method2520((byte) 6) + "/" + class313.field4456.field3788.method2522(0), -126);
                    return;
                }
                if (arg0.equalsIgnoreCase("getcamerapos")) {
                    class587.method3423("Pos: " + class210.field3250.field5755 + "," + ((class614.field8619 >> 9) + class124.field1922 >> 6) + "," + ((class472.field6622 >> 9) + class88.field999 >> 6) + "," + ((class614.field8619 >> 9) + class124.field1922 & 0x3F) + "," + ((class472.field6622 >> 9) + class88.field999 & 0x3F) + " Height: " + (class702.method3970(class614.field8619, class210.field3250.field5755, -20103, class472.field6622) - class546.field7862), -112);
                    class587.method3423("Look: " + class210.field3250.field5755 + "," + (class256.field3763 + class124.field1922 >> 6) + "," + (class88.field999 + class263.field3856 >> 6) + "," + (class256.field3763 + class124.field1922 & 0x3F) + "," + (class88.field999 + class263.field3856 & 0x3F) + " Height: " + (class702.method3970(class256.field3763, class210.field3250.field5755, -20103, class263.field3856) - class353.field4969), -121);
                    return;
                }
                if (arg0.equals("renderprofile") || arg0.equals("rp")) {
                    class404.field5531 = !class404.field5531;
                    class37.field491.method554(class404.field5531);
                    class784.method4299(46);
                    class587.method3423("showprofiling=" + class404.field5531, -114);
                    return;
                }
                if (arg0.startsWith("performancetest")) {
                    int var16 = -1;
                    int var17 = 1000;
                    if (arg0.length() > 15) {
                        String[] var18 = class3.method22(true, ' ', arg0);
                        try {
                            if (var18.length > 1) {
                                var17 = Integer.parseInt(var18[1]);
                            }
                        } catch (Throwable var45) {
                        }
                        try {
                            if (var18.length > 2) {
                                var16 = Integer.parseInt(var18[2]);
                            }
                        } catch (Throwable var44) {
                        }
                    }
                    if (var16 != -1) {
                        class587.method3423("Performance: " + class400.method2464(var16, 14170, var17), -127);
                        return;
                    }
                    class587.method3423("Java toolkit: " + class400.method2464(0, 14170, var17), -117);
                    class587.method3423("SSE toolkit:  " + class400.method2464(2, 14170, var17), -108);
                    class587.method3423("D3D toolkit:  " + class400.method2464(3, 14170, var17), -126);
                    class587.method3423("GL toolkit:   " + class400.method2464(1, 14170, var17), -114);
                    class587.method3423("GLX toolkit:  " + class400.method2464(5, 14170, var17), -118);
                    return;
                }
                if (arg0.equals("nonpcs")) {
                    class197.field3006 = !class197.field3006;
                    class587.method3423("nonpcs=" + class197.field3006, -110);
                    return;
                }
                if (arg0.equals("autoworld")) {
                    class564.method3328(false);
                    class587.method3423("auto world selected", -109);
                    return;
                }
                if (arg0.startsWith("switchworld")) {
                    int var19 = Integer.parseInt(arg0.substring(12));
                    class157.method1204(var19, class577.method3390(2, var19).field3169, 50000);
                    class587.method3423("switched", -118);
                    return;
                }
                if (arg0.equals("getworld")) {
                    class587.method3423("w: " + class5.field34.field763, -125);
                    return;
                }
                if (arg0.startsWith("pc")) {
                    class312 var20 = class353.method2245(class87.field971, class410.field5564, (byte) 119);
                    var20.field4445.method2952(0, 0);
                    int var21 = var20.field4445.field7042;
                    int var22 = arg0.indexOf(" ", 4);
                    var20.field4445.method2953(arg0.substring(3, var22), -28136);
                    class488.method2904(arg0.substring(var22), arg1 + 121, var20.field4445);
                    var20.field4445.method2951(false, var20.field4445.field7042 - var21);
                    class208.method1440(var20, 68);
                    return;
                }
                if (arg0.equals("savevarcs")) {
                    class787.method4312(-30475);
                    class587.method3423("perm varcs saved", -116);
                    return;
                }
                if (arg0.equals("scramblevarcs")) {
                    for (int var23 = 0; var23 < class672.field9369.length; var23++) {
                        if (class433.field5868[var23]) {
                            class672.field9369[var23] = (int) (Math.random() * 99999.0D);
                            if (Math.random() > 0.5D) {
                                class672.field9369[var23] *= -1;
                            }
                        }
                    }
                    class787.method4312(-30475);
                    class587.method3423("perm varcs scrambled", -107);
                    return;
                }
                if (arg0.equals("showcolmap")) {
                    class409.field5559 = true;
                    class515.method3108(21704);
                    class587.method3423("colmap is shown", -120);
                    return;
                }
                if (arg0.equals("hidecolmap")) {
                    class409.field5559 = false;
                    class515.method3108(arg1 ^ 0x54CE);
                    class587.method3423("colmap is hidden", -126);
                    return;
                }
                if (arg0.equals("resetcache")) {
                    class449.method2678(0);
                    class587.method3423("Caches reset", -111);
                    return;
                }
                if (arg0.equals("profilecpu")) {
                    class587.method3423(class592.method3444((byte) 115) + "ms", -119);
                    return;
                }
                if (arg0.startsWith("getclientvarpbit")) {
                    int var24 = Integer.parseInt(arg0.substring(17));
                    class587.method3423("varpbit=" + class537.field7727.method4135(var24, (byte) -119), -111);
                    return;
                }
                if (arg0.startsWith("getclientvarp")) {
                    int var25 = Integer.parseInt(arg0.substring(14));
                    class587.method3423("varp=" + class537.field7727.method4133(var25, arg1 - 51), -114);
                    return;
                }
                if (arg0.startsWith("directlogin")) {
                    String[] var26 = class3.method22(true, ' ', arg0.substring(12));
                    if (var26.length >= 2) {
                        int var27 = var26.length <= 2 ? 0 : Integer.parseInt(var26[2]);
                        class745.method4153(var26[0], var26[1], var27, 0);
                        return;
                    }
                }
                if (arg0.startsWith("snlogin ")) {
                    String[] var28 = class3.method22(true, ' ', arg0.substring(8));
                    int var29 = Integer.parseInt(var28[0]);
                    int var30 = var28.length == 2 ? Integer.parseInt(var28[1]) : 0;
                    class55.method386((byte) 108, var30, var29);
                    return;
                }
                if (arg0.startsWith("csprofileclear")) {
                    class379.method2360();
                    return;
                }
                if (arg0.startsWith("csprofileoutputc")) {
                    class379.method2357(100, false);
                    return;
                }
                if (arg0.startsWith("csprofileoutputt")) {
                    class379.method2357(10, true);
                    return;
                }
                if (arg0.startsWith("texsize")) {
                    int var31 = Integer.parseInt(arg0.substring(8));
                    class37.field491.method525(var31);
                    return;
                }
                if (arg0.equals("soundstreamcount")) {
                    class587.method3423("Active streams: " + class184.field2828.method425(), -124);
                    return;
                }
                if (arg0.equals("autosetup")) {
                    class745.method4156((byte) 115);
                    class587.method3423("Complete. Toolkit now: " + class21.field353.field10098.method1588(-118), arg1 - 113);
                    return;
                }
                if (arg0.equals("errormessage")) {
                    class587.method3423(class256.field3768.method2039(1001), -123);
                    return;
                }
                if (arg0.equals("heapdump")) {
                    if (class477.field6690.startsWith("win")) {
                        class599.method3491((byte) -29, new File("C:\\Temp\\heap.dump"), false);
                    } else {
                        class599.method3491((byte) -29, new File("/tmp/heap.dump"), false);
                    }
                    class587.method3423("Done", arg1 ^ 0xFFFFFF95);
                    return;
                }
                if (arg0.equals("os")) {
                    class587.method3423("Name: " + class477.field6690, -115);
                    class587.method3423("Arch: " + class477.field6683, arg1 ^ 0xFFFFFF8B);
                    class587.method3423("Ver: " + class477.field6700, -108);
                    return;
                }
                if (arg0.startsWith("w2debug")) {
                    int var32 = Integer.parseInt(arg0.substring(8, 9));
                    class103.field1191 = var32;
                    class13.method139(true);
                    class587.method3423("Toggled!", arg1 - 125);
                    return;
                }
                if (arg0.startsWith("ortho ")) {
                    int var33 = arg0.indexOf(32);
                    if (var33 < 0) {
                        class587.method3423("Syntax: ortho <n>", arg1 - 132);
                        return;
                    }
                    int var34 = class163.method1224(false, arg0.substring(var33 + 1));
                    class21.field353.method4080(true, class21.field353.field10082, var34);
                    class580.method3397((byte) 13);
                    class768.field10567 = false;
                    class83.method627(808);
                    if (var34 != class21.field353.field10082.method4067(-57)) {
                        class587.method3423("Failed to change ortho mode", -128);
                        return;
                    }
                    class587.method3423("Successfully changed ortho mode", -127);
                    return;
                }
                if (arg0.startsWith("orthozoom ")) {
                    if (class21.field353.field10082.method4067(arg1 - 127) == 0) {
                        class587.method3423("enable ortho mode first (use 'ortho <n>')", -128);
                        return;
                    }
                    int var35 = class163.method1224(false, arg0.substring(arg0.indexOf(32) + 1));
                    class740.field10197 = var35;
                    class587.method3423("orthozoom=" + class740.field10197, -116);
                    return;
                }
                if (arg0.startsWith("orthotilesize ")) {
                    int var36 = class163.method1224(false, arg0.substring(arg0.indexOf(32) + 1));
                    class207.field3208 = var36;
                    class236.field3553 = var36;
                    class587.method3423("ortho tile size=" + var36, -108);
                    class83.method627(808);
                    return;
                }
                if (arg0.equals("orthocamlock")) {
                    class459.field6424 = !class459.field6424;
                    class587.method3423("ortho camera lock is " + (class459.field6424 ? "on" : "off"), -110);
                    return;
                }
                if (arg0.startsWith("setoutput ")) {
                    File var37 = new File(arg0.substring(10));
                    if (var37.exists()) {
                        var37 = new File(arg0.substring(10) + "." + class459.method2731(arg1 + 104) + ".log");
                        if (var37.exists()) {
                            class587.method3423("file already exists!", -122);
                            return;
                        }
                    }
                    if (class239.field3592 != null) {
                        class239.field3592.close();
                        class239.field3592 = null;
                    }
                    try {
                        class239.field3592 = new FileOutputStream(var37);
                        return;
                    } catch (FileNotFoundException var46) {
                        class587.method3423("Could not create " + var37.getName(), -111);
                        return;
                    } catch (SecurityException var47) {
                        class587.method3423("Cannot write to " + var37.getName(), -118);
                        return;
                    }
                }
                if (arg0.equals("closeoutput")) {
                    if (class239.field3592 != null) {
                        class239.field3592.close();
                    }
                    class239.field3592 = null;
                    return;
                }
                if (arg0.startsWith("runscript ")) {
                    File var38 = new File(arg0.substring(10));
                    if (!var38.exists()) {
                        class587.method3423("No such file", -128);
                        return;
                    }
                    byte[] var39 = class687.method3877(true, var38);
                    if (var39 == null) {
                        class587.method3423("Failed to read file", -118);
                        return;
                    }
                    String[] var40 = class3.method22(true, '\n', class375.method2325(arg1 - 7, class3.method20(arg1 ^ 0x6, var39), '\r', ""));
                    class752.method4187((byte) 97, var40);
                }
                if (arg0.startsWith("zoom ")) {
                    short var41 = (short) class163.method1224(false, arg0.substring(5));
                    if (var41 > 0) {
                        class313.field4458 = var41;
                    }
                    return;
                }
                if (class266.field3873 == 10) {
                    class363.field5067++;
                    class312 var42 = class353.method2245(class87.field971, class128.field1956, (byte) 114);
                    var42.field4445.method2952(arg1 ^ 0x6, arg0.length() + 3);
                    var42.field4445.method2952(0, arg3 ? 1 : 0);
                    var42.field4445.method2952(0, arg2 ? 1 : 0);
                    var42.field4445.method2953(arg0, arg1 - 28142);
                    class208.method1440(var42, 53);
                }
                if (arg0.startsWith("fps ") && class622.field8739 != class300.field4326) {
                    class222.method1516(class163.method1224(false, arg0.substring(4)), 106);
                    return;
                }
            } catch (Exception var48) {
                class587.method3423(class620.field8660.method3580(class140.field2081, 12), -123);
                return;
            }
        }
        if (class266.field3873 != 10) {
            class587.method3423(class620.field8664.method3580(class140.field2081, 12) + arg0, -110);
        }
        if (arg1 != 6) {
            method675(null, 69, true, true);
        }
    }

    @OriginalMember(owner = "client!rf", name = "run", descriptor = "()V")
    public final void run() {
        field1009++;
        while (!this.field1020) {
            class83 var1 = this.field1008;
            class792 var2;
            synchronized (this.field1008) {
                var2 = (class792) this.field1008.method633(18801);
                if (var2 == null) {
                    try {
                        this.field1008.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field1018--;
            }
            try {
                if (var2.field10888 == 2) {
                    var2.field10891.method951(-18221, (int) var2.field1597, var2.field10892, var2.field10892.length);
                } else if (var2.field10888 == 3) {
                    var2.field10892 = var2.field10891.method948((byte) -58, (int) var2.field1597);
                }
            } catch (Exception var6) {
                class678.method3848(null, var6, false);
            }
            var2.field930 = false;
        }
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Ltd;)V")
    public class90(class477 arg0) {
        class141 var2 = arg0.method2850(5, this, 35);
        while (var2.field2089 == 0) {
            class107.method828(10L, (byte) 112);
        }
        if (var2.field2089 == 2) {
            throw new RuntimeException();
        }
        this.field1019 = (Thread) var2.field2092;
    }
}
