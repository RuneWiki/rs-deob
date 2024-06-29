import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class747 extends class227 {

    @OriginalMember(owner = "client!pn", name = "D", descriptor = "Lkg;")
    public static class275 field10442 = new class275(118, 0);

    @OriginalMember(owner = "client!pn", name = "z", descriptor = "I")
    public static int field10439;

    @OriginalMember(owner = "client!pn", name = "A", descriptor = "I")
    public static int field10440;

    @OriginalMember(owner = "client!pn", name = "E", descriptor = "I")
    public static int field10443;

    @OriginalMember(owner = "client!pn", name = "F", descriptor = "I")
    public static int field10444;

    @OriginalMember(owner = "client!pn", name = "G", descriptor = "I")
    public static int field10445;

    @OriginalMember(owner = "client!pn", name = "H", descriptor = "I")
    public static int field10446;

    @OriginalMember(owner = "client!pn", name = "C", descriptor = "[B")
    private byte[] field10441;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method4155(int arg0, String arg1) {
        field10446++;
        if (arg0 != -1) {
            field10442 = null;
        }
        return arg1.length() + 1;
    }

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "(B)V")
    public static void method4156(byte arg0) {
        field10442 = null;
        if (arg0 != -77) {
            method4155(95, null);
        }
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "()V")
    public class747() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(IIII)[B")
    public final byte[] method4157(int arg0, int arg1, int arg2, int arg3) {
        field10444++;
        this.field10441 = new byte[arg0 * arg2 * arg1 * 2];
        if (arg3 <= 60) {
            this.field10441 = null;
        }
        this.method1058(arg1, arg0, arg2, (byte) -124);
        return this.field10441;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Ljava/lang/String;IZZ)V")
    public static final void method4158(String arg0, int arg1, boolean arg2, boolean arg3) {
        field10443++;
        try {
            if (arg0.equalsIgnoreCase("commands") || arg0.equalsIgnoreCase("help")) {
                class320.method1883((byte) -60, "commands - This command");
                class320.method1883((byte) -60, "cls - Clear console");
                class320.method1883((byte) -60, "displayfps - Toggle FPS and other information");
                class320.method1883((byte) -60, "renderer - Print graphics renderer information");
                class320.method1883((byte) -60, "heap - Print java memory information");
                return;
            }
            if (arg0.equalsIgnoreCase("cls")) {
                class71.field997 = 0;
                class5.field47 = 0;
                return;
            }
            if (arg0.equalsIgnoreCase("displayfps")) {
                class556.field7748 = !class556.field7748;
                if (class556.field7748) {
                    class320.method1883((byte) -60, "FPS on");
                    return;
                }
                class320.method1883((byte) -60, "FPS off");
                return;
            }
            if (arg0.equals("renderer")) {
                class647 var4 = class386.field4930.method499();
                class320.method1883((byte) -60, "Vendor: " + var4.field8954);
                class320.method1883((byte) -60, "Name: " + var4.field8956);
                class320.method1883((byte) -60, "Version: " + var4.field8958);
                class320.method1883((byte) -60, "Device: " + var4.field8953);
                class320.method1883((byte) -60, "Driver Version: " + var4.field8961);
                return;
            }
            if (arg0.equals("heap")) {
                class320.method1883((byte) -60, "Heap: " + client.field3992 + "MB");
                return;
            }
            if (arg1 != -21091) {
                field10442 = null;
            }
        } catch (Exception var46) {
            class320.method1883((byte) -60, class454.field6005.method2547(arg1 + 21016, class243.field3143));
            return;
        }
        if (class7.field75 != class225.field2991 || class683.field9525 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equals("nativememerror")) {
                throw new OutOfMemoryError("native(MPR");
            }
            try {
                if (arg0.equalsIgnoreCase("printfps")) {
                    class320.method1883((byte) -60, "FPS: " + class5.field54);
                    return;
                }
                if (arg0.equalsIgnoreCase("occlude")) {
                    client.field3984 = !client.field3984;
                    if (client.field3984) {
                        class320.method1883((byte) -60, "Occlsion now on!");
                        return;
                    }
                    class320.method1883((byte) -60, "Occlsion now off!");
                    return;
                }
                if (arg0.equalsIgnoreCase("fpson")) {
                    class556.field7748 = true;
                    class320.method1883((byte) -60, "fps debug enabled");
                    return;
                }
                if (arg0.equalsIgnoreCase("fpsoff")) {
                    class556.field7748 = false;
                    class320.method1883((byte) -60, "fps debug disabled");
                    return;
                }
                if (arg0.equals("systemmem")) {
                    try {
                        class320.method1883((byte) -60, "System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + class323.field4162.field367 + "Mb");
                        return;
                    } catch (Throwable var40) {
                        return;
                    }
                }
                if (arg0.equalsIgnoreCase("cleartext")) {
                    class273.field3427.method165(-121);
                    class320.method1883((byte) -60, "Text coords cleared");
                    return;
                }
                if (arg0.equalsIgnoreCase("gc")) {
                    class229.method1461((byte) -20);
                    for (int var5 = 0; var5 < 10; var5++) {
                        System.gc();
                    }
                    Runtime var6 = Runtime.getRuntime();
                    int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                    class320.method1883((byte) -60, "mem=" + var7 + "k");
                    return;
                }
                if (arg0.equalsIgnoreCase("compact")) {
                    class229.method1461((byte) -27);
                    for (int var8 = 0; var8 < 10; var8++) {
                        System.gc();
                    }
                    Runtime var9 = Runtime.getRuntime();
                    int var10 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                    class320.method1883((byte) -60, "Memory before cleanup=" + var10 + "k");
                    class84.method696(-116);
                    class229.method1461((byte) -79);
                    for (int var11 = 0; var11 < 10; var11++) {
                        System.gc();
                    }
                    int var12 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                    class320.method1883((byte) -60, "Memory after cleanup=" + var12 + "k");
                    return;
                }
                if (arg0.equalsIgnoreCase("unloadnatives")) {
                    class320.method1883((byte) -60, class391.method2215(45) ? "Libraries unloaded" : "Library unloading failed!");
                    return;
                }
                if (arg0.equalsIgnoreCase("clientdrop")) {
                    class320.method1883((byte) -60, "Dropped client connection");
                    if (class27.field484 == 10) {
                        class274.method1614((byte) 83);
                        return;
                    }
                    if (class27.field484 == 11) {
                        class459.field6127 = true;
                    }
                    return;
                }
                if (arg0.equalsIgnoreCase("rotateconnectmethods")) {
                    class292.field3842.method990(0);
                    class320.method1883((byte) -60, "Rotated connection methods");
                    return;
                }
                if (arg0.equalsIgnoreCase("clientjs5drop")) {
                    class437.field5817.method4208(0);
                    class320.method1883((byte) -60, "Dropped client js5 net queue");
                    return;
                }
                if (arg0.equalsIgnoreCase("serverjs5drop")) {
                    class437.field5817.method4205((byte) 32);
                    class320.method1883((byte) -60, "Dropped server js5 net queue");
                    return;
                }
                if (arg0.equalsIgnoreCase("breakcon")) {
                    class162.field2227.method2647(-39);
                    class12.field143.method2303(-124);
                    class437.field5817.method4209((byte) 102);
                    class320.method1883((byte) -60, "Breaking new connections for 5 seconds");
                    return;
                }
                if (arg0.equalsIgnoreCase("rebuild")) {
                    class540.method3099(3);
                    class126.method947((byte) 71);
                    class320.method1883((byte) -60, "Rebuilding map");
                    return;
                }
                if (arg0.equalsIgnoreCase("rebuildprofile")) {
                    class199.field2706 = class446.method2525(arg1 ^ 0xFFFFAC69);
                    class721.field10037 = true;
                    class540.method3099(3);
                    class126.method947((byte) 60);
                    class320.method1883((byte) -60, "Rebuilding map (with profiling)");
                    return;
                }
                if (arg0.equalsIgnoreCase("wm1")) {
                    class318.method1876(-1, 0, false, 1, -1);
                    if (class120.method926(arg1 + 36583) == 1) {
                        class320.method1883((byte) -60, "wm1 succeeded");
                        return;
                    }
                    class320.method1883((byte) -60, "wm1 failed");
                    return;
                }
                if (arg0.equalsIgnoreCase("wm2")) {
                    class318.method1876(-1, 0, false, 2, -1);
                    if (class120.method926(arg1 + 36583) == 2) {
                        class320.method1883((byte) -60, "wm2 succeeded");
                        return;
                    }
                    class320.method1883((byte) -60, "wm2 failed");
                    return;
                }
                if (arg0.equalsIgnoreCase("wm3")) {
                    class318.method1876(1024, 0, false, 3, 768);
                    if (class120.method926(15492) == 3) {
                        class320.method1883((byte) -60, "wm3 succeeded");
                        return;
                    }
                    class320.method1883((byte) -60, "wm3 failed");
                    return;
                }
                if (arg0.equalsIgnoreCase("tk0")) {
                    class415.method2331(false, 0, arg1 + 21087);
                    if (class748.field10451.field10399.method1924((byte) -84) == 0) {
                        class320.method1883((byte) -60, "Entered tk0");
                        class748.field10451.method4150(class748.field10451.field10400, 0, arg1 + 21086);
                        class472.method2688(87);
                        class332.field4236 = false;
                        return;
                    }
                    class320.method1883((byte) -60, "Failed to enter tk0");
                    return;
                }
                if (arg0.equalsIgnoreCase("tk1")) {
                    class415.method2331(false, 1, -4);
                    if (class748.field10451.field10399.method1924((byte) 83) == 1) {
                        class320.method1883((byte) -60, "Entered tk1");
                        class748.field10451.method4150(class748.field10451.field10400, 1, -5);
                        class472.method2688(-117);
                        class332.field4236 = false;
                        return;
                    }
                    class320.method1883((byte) -60, "Failed to enter tk1");
                    return;
                }
                if (arg0.equalsIgnoreCase("tk2")) {
                    class415.method2331(false, 2, -4);
                    if (class748.field10451.field10399.method1924((byte) -121) == 2) {
                        class320.method1883((byte) -60, "Entered tk2");
                        class748.field10451.method4150(class748.field10451.field10400, 2, arg1 + 21086);
                        class472.method2688(102);
                        class332.field4236 = false;
                        return;
                    }
                    class320.method1883((byte) -60, "Failed to enter tk2");
                    return;
                }
                if (arg0.equalsIgnoreCase("tk3")) {
                    class415.method2331(false, 3, -4);
                    if (class748.field10451.field10399.method1924((byte) -49) != 3) {
                        class320.method1883((byte) -60, "Failed to enter tk3");
                        return;
                    }
                    class320.method1883((byte) -60, "Entered tk3");
                    class748.field10451.method4150(class748.field10451.field10400, 3, -5);
                    class472.method2688(127);
                    class332.field4236 = false;
                    return;
                }
                if (arg0.equalsIgnoreCase("tk5")) {
                    class415.method2331(false, 5, -4);
                    if (class748.field10451.field10399.method1924((byte) -54) != 5) {
                        class320.method1883((byte) -60, "Failed to enter tk5");
                        return;
                    }
                    class320.method1883((byte) -60, "Entered tk5");
                    class748.field10451.method4150(class748.field10451.field10400, 5, -5);
                    class472.method2688(1);
                    class332.field4236 = false;
                    return;
                }
                if (arg0.startsWith("setba")) {
                    if (arg0.length() < 6) {
                        class320.method1883((byte) -60, "Invalid buildarea value");
                        return;
                    }
                    int var13 = class160.method1124(arg0.substring(6), 124);
                    if (var13 >= 0 && var13 <= class607.method3420((byte) -58, client.field3992)) {
                        class748.field10451.method4150(class748.field10451.field10422, var13, arg1 + 21086);
                        class472.method2688(-125);
                        class332.field4236 = false;
                        class320.method1883((byte) -60, "maxbuildarea=" + class748.field10451.field10422.method2332((byte) -112));
                        return;
                    }
                    class320.method1883((byte) -60, "Invalid buildarea value");
                    return;
                }
                if (arg0.startsWith("rect_debug")) {
                    if (arg0.length() < 10) {
                        class320.method1883((byte) -60, "Invalid rect_debug value");
                        return;
                    }
                    class52.field739 = class160.method1124(arg0.substring(10).trim(), 114);
                    class320.method1883((byte) -60, "rect_debug=" + class52.field739);
                    return;
                }
                if (arg0.equalsIgnoreCase("qa_op_test")) {
                    class711.field9869 = true;
                    class320.method1883((byte) -60, "qa_op_test=" + class711.field9869);
                    return;
                }
                if (arg0.equalsIgnoreCase("clipcomponents")) {
                    class473.field6357 = !class473.field6357;
                    class320.method1883((byte) -60, "clipcomponents=" + class473.field6357);
                    return;
                }
                if (arg0.startsWith("bloom")) {
                    boolean var14 = class386.field4930.method442();
                    if (!class631.method3544(!var14, (byte) 100)) {
                        class320.method1883((byte) -60, "Failed to enable bloom");
                        return;
                    }
                    if (var14) {
                        class320.method1883((byte) -60, "Bloom disabled");
                        return;
                    }
                    class320.method1883((byte) -60, "Bloom enabled");
                    return;
                }
                if (arg0.equalsIgnoreCase("tween")) {
                    if (class130.field1838) {
                        class130.field1838 = false;
                        class320.method1883((byte) -60, "Forced tweening disabled.");
                        return;
                    }
                    class130.field1838 = true;
                    class320.method1883((byte) -60, "Forced tweening ENABLED!");
                    return;
                }
                if (arg0.equalsIgnoreCase("shiftclick")) {
                    if (class599.field8344) {
                        class320.method1883((byte) -60, "Shift-click disabled.");
                        class599.field8344 = false;
                        return;
                    }
                    class320.method1883((byte) -60, "Shift-click ENABLED!");
                    class599.field8344 = true;
                    return;
                }
                if (arg0.equalsIgnoreCase("getcgcoord")) {
                    class320.method1883((byte) -60, "x:" + (class380.field4847.field5801 >> 9) + " z:" + (class380.field4847.field5797 >> 9));
                    return;
                }
                if (arg0.equalsIgnoreCase("getheight")) {
                    class320.method1883((byte) -60, "Height: " + class195.field2669[class380.field4847.field5796].method1677(class380.field4847.field5797 >> 9, (byte) 48, class380.field4847.field5801 >> 9));
                    return;
                }
                if (arg0.equalsIgnoreCase("resetminimap")) {
                    class268.field3369.method3162((byte) 85);
                    class268.field3369.method3163(-49);
                    class52.field741.method587(26002);
                    class424.field5399.method3086(0);
                    class126.method947((byte) 82);
                    class320.method1883((byte) -60, "Minimap reset");
                    return;
                }
                if (arg0.startsWith("mc")) {
                    if (class386.field4930.method549()) {
                        int var15 = Integer.parseInt(arg0.substring(3));
                        if (var15 < 1) {
                            var15 = 1;
                        } else if (var15 > 4) {
                            var15 = 4;
                        }
                        class306.field4039 = var15;
                        class540.method3099(3);
                        class320.method1883((byte) -60, "Render cores now: " + class306.field4039);
                        return;
                    }
                    class320.method1883((byte) -60, "Current toolkit doesn't support multiple cores");
                    return;
                }
                if (arg0.startsWith("cachespace")) {
                    class320.method1883((byte) -60, "I(s): " + class687.field9574.method3067((byte) -127) + "/" + class687.field9574.method3071((byte) 115));
                    class320.method1883((byte) -60, "I(m): " + class60.field844.method3067((byte) -108) + "/" + class60.field844.method3071((byte) 91));
                    class320.method1883((byte) -60, "O(s): " + class21.field381.field3344.method45(arg1 + 37028) + "/" + class21.field381.field3344.method44(arg1 + 24297));
                    return;
                }
                if (arg0.equalsIgnoreCase("getcamerapos")) {
                    class320.method1883((byte) -60, "Pos: " + class380.field4847.field5796 + "," + ((class450.field5953 >> 9) + class332.field4232 >> 6) + "," + ((class318.field4121 >> 9) + class447.field5936 >> 6) + "," + ((class450.field5953 >> 9) + class332.field4232 & 0x3F) + "," + ((class318.field4121 >> 9) + class447.field5936 & 0x3F) + " Height: " + (class225.method1448(class380.field4847.field5796, class450.field5953, class318.field4121, (byte) 28) - class66.field954));
                    class320.method1883((byte) -60, "Look: " + class380.field4847.field5796 + "," + (class332.field4232 + class230.field3029 >> 6) + "," + (class579.field8109 + class447.field5936 >> 6) + "," + (class332.field4232 + class230.field3029 & 0x3F) + "," + (class579.field8109 + class447.field5936 & 0x3F) + " Height: " + (class225.method1448(class380.field4847.field5796, class230.field3029, class579.field8109, (byte) 28) - class97.field1344));
                    return;
                }
                if (arg0.equals("renderprofile") || arg0.equals("rp")) {
                    class553.field7720 = !class553.field7720;
                    class386.field4930.method507(class553.field7720);
                    class663.method3738((byte) 109);
                    class320.method1883((byte) -60, "showprofiling=" + class553.field7720);
                    return;
                }
                if (arg0.startsWith("performancetest")) {
                    int var16 = -1;
                    int var17 = 1000;
                    if (arg0.length() > 15) {
                        String[] var18 = class249.method1538(' ', 0, arg0);
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
                        class320.method1883((byte) -60, "Java toolkit: " + class103.method819(0, var17, (byte) -71));
                        class320.method1883((byte) -60, "SSE toolkit:  " + class103.method819(2, var17, (byte) -67));
                        class320.method1883((byte) -60, "D3D toolkit:  " + class103.method819(3, var17, (byte) -72));
                        class320.method1883((byte) -60, "GL toolkit:   " + class103.method819(1, var17, (byte) -79));
                        class320.method1883((byte) -60, "GLX toolkit:  " + class103.method819(5, var17, (byte) -126));
                        return;
                    }
                    class320.method1883((byte) -60, "Performance: " + class103.method819(var16, var17, (byte) -90));
                    return;
                }
                if (arg0.equals("nonpcs")) {
                    class310.field4081 = !class310.field4081;
                    class320.method1883((byte) -60, "nonpcs=" + class310.field4081);
                    return;
                }
                if (arg0.equals("autoworld")) {
                    class353.method2062(55);
                    class320.method1883((byte) -60, "auto world selected");
                    return;
                }
                if (arg0.startsWith("switchworld")) {
                    int var19 = Integer.parseInt(arg0.substring(12));
                    class657.method3704(class760.method4226(-94, var19).field1977, var19, -8755);
                    class320.method1883((byte) -60, "switched");
                    return;
                }
                if (arg0.equals("getworld")) {
                    class320.method1883((byte) -60, "w: " + class292.field3842.field1929);
                    return;
                }
                if (arg0.startsWith("pc")) {
                    class589 var20 = class514.method2994(-29488, class760.field10605, class651.field9043);
                    var20.field8251.method2578(0, -1221492240);
                    int var21 = var20.field8251.field6193;
                    int var22 = arg0.indexOf(" ", 4);
                    var20.field8251.method2597(arg0.substring(3, var22), (byte) 85);
                    class22.method139(var20.field8251, arg0.substring(var22), 28108);
                    var20.field8251.method2581(arg1 ^ 0x5262, var20.field8251.field6193 - var21);
                    class737.method4107(var20, 7);
                    return;
                }
                if (arg0.equals("savevarcs")) {
                    class548.method3187(true);
                    class320.method1883((byte) -60, "perm varcs saved");
                    return;
                }
                if (arg0.equals("scramblevarcs")) {
                    for (int var23 = 0; var23 < class564.field7931.length; var23++) {
                        if (class133.field1924[var23]) {
                            class564.field7931[var23] = (int) (Math.random() * 99999.0D);
                            if (Math.random() > 0.5D) {
                                class564.field7931[var23] *= -1;
                            }
                        }
                    }
                    class548.method3187(true);
                    class320.method1883((byte) -60, "perm varcs scrambled");
                    return;
                }
                if (arg0.equals("showcolmap")) {
                    class746.field10432 = true;
                    class126.method947((byte) 106);
                    class320.method1883((byte) -60, "colmap is shown");
                    return;
                }
                if (arg0.equals("hidecolmap")) {
                    class746.field10432 = false;
                    class126.method947((byte) 127);
                    class320.method1883((byte) -60, "colmap is hidden");
                    return;
                }
                if (arg0.equals("resetcache")) {
                    class660.method3714(0);
                    class320.method1883((byte) -60, "Caches reset");
                    return;
                }
                if (arg0.equals("profilecpu")) {
                    class320.method1883((byte) -60, class477.method2748((byte) 123) + "ms");
                    return;
                }
                if (arg0.startsWith("getclientvarpbit")) {
                    int var24 = Integer.parseInt(arg0.substring(17));
                    class320.method1883((byte) -60, "varpbit=" + class516.field7236.method1524(0, var24));
                    return;
                }
                if (arg0.startsWith("getclientvarp")) {
                    int var25 = Integer.parseInt(arg0.substring(14));
                    class320.method1883((byte) -60, "varp=" + class516.field7236.method1525(true, var25));
                    return;
                }
                if (arg0.startsWith("directlogin")) {
                    String[] var26 = class249.method1538(' ', 0, arg0.substring(12));
                    if (var26.length >= 2) {
                        int var27 = var26.length <= 2 ? 0 : Integer.parseInt(var26[2]);
                        class422.method2350(var26[1], var26[0], 2, var27);
                        return;
                    }
                }
                if (arg0.startsWith("csprofileclear")) {
                    class188.method1272();
                    return;
                }
                if (arg0.startsWith("csprofileoutputc")) {
                    class188.method1265(100, false);
                    return;
                }
                if (arg0.startsWith("csprofileoutputt")) {
                    class188.method1265(10, true);
                    return;
                }
                if (arg0.startsWith("texsize")) {
                    int var28 = Integer.parseInt(arg0.substring(8));
                    class386.field4930.method473(var28);
                    return;
                }
                if (arg0.equals("soundstreamcount")) {
                    class320.method1883((byte) -60, "Active streams: " + class307.field4055.method1324());
                    return;
                }
                if (arg0.equals("autosetup")) {
                    class537.method3089(3);
                    class320.method1883((byte) -60, "Complete. Toolkit now: " + class748.field10451.field10399.method1924((byte) -80));
                    return;
                }
                if (arg0.equals("errormessage")) {
                    class320.method1883((byte) -60, class654.field9104.method1814((byte) -108));
                    return;
                }
                if (arg0.equals("heapdump")) {
                    if (class465.field6233.startsWith("win")) {
                        class239.method1495(false, new File("C:\\Temp\\heap.dump"), -121);
                    } else {
                        class239.method1495(false, new File("/tmp/heap.dump"), arg1 ^ 0x523D);
                    }
                    class320.method1883((byte) -60, "Done");
                    return;
                }
                if (arg0.equals("os")) {
                    class320.method1883((byte) -60, "Name: " + class465.field6233);
                    class320.method1883((byte) -60, "Arch: " + class465.field6241);
                    class320.method1883((byte) -60, "Ver: " + class465.field6240);
                    return;
                }
                if (arg0.startsWith("w2debug")) {
                    int var29 = Integer.parseInt(arg0.substring(8, 9));
                    class566.field7947 = var29;
                    class540.method3099(3);
                    class320.method1883((byte) -60, "Toggled!");
                    return;
                }
                if (arg0.startsWith("ortho ")) {
                    int var30 = arg0.indexOf(32);
                    if (var30 < 0) {
                        class320.method1883((byte) -60, "Syntax: ortho <n>");
                        return;
                    }
                    int var31 = class160.method1124(arg0.substring(var30 + 1), arg1 + 21207);
                    class748.field10451.method4150(class748.field10451.field10413, var31, -5);
                    class472.method2688(arg1 + 20963);
                    class332.field4236 = false;
                    class427.method2450(0);
                    if (var31 == class748.field10451.field10413.method1188((byte) 82)) {
                        class320.method1883((byte) -60, "Successfully changed ortho mode");
                        return;
                    }
                    class320.method1883((byte) -60, "Failed to change ortho mode");
                    return;
                }
                if (arg0.startsWith("orthozoom ")) {
                    if (class748.field10451.field10413.method1188((byte) -85) == 0) {
                        class320.method1883((byte) -60, "enable ortho mode first (use 'ortho <n>')");
                        return;
                    }
                    int var32 = class160.method1124(arg0.substring(arg0.indexOf(32) + 1), arg1 + 21211);
                    class286.field3598 = var32;
                    class320.method1883((byte) -60, "orthozoom=" + class286.field3598);
                    return;
                }
                if (arg0.startsWith("orthotilesize ")) {
                    int var33 = class160.method1124(arg0.substring(arg0.indexOf(32) + 1), 121);
                    class329.field4201 = var33;
                    class282.field3560 = var33;
                    class320.method1883((byte) -60, "ortho tile size=" + var33);
                    class427.method2450(0);
                    return;
                }
                if (arg0.equals("orthocamlock")) {
                    class690.field9598 = !class690.field9598;
                    class320.method1883((byte) -60, "ortho camera lock is " + (class690.field9598 ? "on" : "off"));
                    return;
                }
                if (arg0.startsWith("setoutput ")) {
                    File var34 = new File(arg0.substring(10));
                    if (var34.exists()) {
                        var34 = new File(arg0.substring(10) + "." + class446.method2525(500) + ".log");
                        if (var34.exists()) {
                            class320.method1883((byte) -60, "file already exists!");
                            return;
                        }
                    }
                    if (class505.field7122 != null) {
                        class505.field7122.close();
                        class505.field7122 = null;
                    }
                    try {
                        class505.field7122 = new FileOutputStream(var34);
                        return;
                    } catch (FileNotFoundException var43) {
                        class320.method1883((byte) -60, "Could not create " + var34.getName());
                        return;
                    } catch (SecurityException var44) {
                        class320.method1883((byte) -60, "Cannot write to " + var34.getName());
                        return;
                    }
                }
                if (arg0.equals("closeoutput")) {
                    if (class505.field7122 != null) {
                        class505.field7122.close();
                    }
                    class505.field7122 = null;
                    return;
                }
                if (arg0.startsWith("runscript ")) {
                    File var35 = new File(arg0.substring(10));
                    if (!var35.exists()) {
                        class320.method1883((byte) -60, "No such file");
                        return;
                    }
                    byte[] var36 = class380.method2170((byte) -12, var35);
                    if (var36 == null) {
                        class320.method1883((byte) -60, "Failed to read file");
                        return;
                    }
                    String[] var37 = class249.method1538('\n', 0, class432.method2469('\r', class503.method2940(var36, (byte) 121), "", (byte) 101));
                    class414.method2325(48000, var37);
                }
                if (arg0.startsWith("zoom ")) {
                    short var38 = (short) class160.method1124(arg0.substring(5), 119);
                    if (var38 > 0) {
                        class324.field4171 = var38;
                    }
                    return;
                }
                if (class27.field484 == 10) {
                    class446.field5931++;
                    class589 var39 = class514.method2994(-29488, class760.field10605, class726.field10117);
                    var39.field8251.method2578(arg0.length() + 3, arg1 + -1221471149);
                    var39.field8251.method2578(arg2 ? 1 : 0, -1221492240);
                    var39.field8251.method2578(arg3 ? 1 : 0, -1221492240);
                    var39.field8251.method2597(arg0, (byte) 106);
                    class737.method4107(var39, 7);
                }
                if (arg0.startsWith("fps ") && class7.field75 != class225.field2991) {
                    class661.method3718(96, class160.method1124(arg0.substring(4), 121));
                    return;
                }
            } catch (Exception var45) {
                class320.method1883((byte) -60, class454.field6005.method2547(-77, class243.field3143));
                return;
            }
        }
        if (class27.field484 != 10) {
            class320.method1883((byte) -60, class454.field6006.method2547(arg1 ^ 0x525F, class243.field3143) + arg0);
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IBB)V")
    public final void method1358(int arg0, byte arg1, byte arg2) {
        field10445++;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var5 = arg0 * 2;
        int var10001 = var5;
        int var6 = var5 + 1;
        this.field10441[var10001] = var4;
        this.field10441[var6] = var4;
        if (arg2 >= -15) {
            field10442 = null;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IZLcc;)V")
    public static final void method4159(int arg0, boolean arg1, class733 arg2) {
        field10439++;
        if (class159.field2181 >= 400) {
            return;
        }
        class131 var3 = arg2.field10192;
        String var4 = arg2.field10189;
        if (var3.field1899 != null) {
            var3 = var3.method981(65, class516.field7236);
            var4 = var3.field1851;
            if (var3 == null) {
                return;
            }
        }
        if (!var3.field1881) {
            return;
        }
        if (arg2.field10204 != 0) {
            String var5 = class722.field10048 == class293.field3867 ? class454.field6033.method2547(-76, class243.field3143) : class454.field6031.method2547(-111, class243.field3143);
            var4 = var4 + class448.method2528(class380.field4847.field10070, arg2.field10204, (byte) 127) + " (" + var5 + arg2.field10204 + ")";
        }
        if (class8.field103 && !arg1) {
            class242 var6 = class599.field8349 == -1 ? null : class513.field7206.method791((byte) -77, class599.field8349);
            if ((class565.field7935 & 0x2) != 0 && (var6 == null || var3.method973(false, var6.field3137, class599.field8349) != var6.field3137)) {
                class452.field5977++;
                class92.method740((long) arg2.field189, (long) arg2.field189, false, true, class731.field10176 + " -> <col=ffff00>" + var4, -1, class702.field9767, 11, 0, class551.field7704, false, 0, false);
            }
        }
        if (arg0 < 0) {
            return;
        }
        if (!arg1) {
            String[] var7 = var3.field1867;
            if (class208.field2752) {
                var7 = class387.method2200(-113, var7);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && (var3.field1858 == 0 || !var7[var8].equalsIgnoreCase(class454.field6026.method2547(-58, class243.field3143)))) {
                        byte var9 = 0;
                        if (var8 == 0) {
                            var9 = 12;
                        }
                        int var10 = class75.field1065;
                        if (var8 == 1) {
                            var9 = 60;
                        }
                        if (var8 == 2) {
                            var9 = 58;
                        }
                        if (var8 == 3) {
                            var9 = 25;
                        }
                        if (var3.field1910 == var8) {
                            var10 = var3.field1890;
                        }
                        if (var8 == 4) {
                            var9 = 4;
                        }
                        if (var3.field1894 == var8) {
                            var10 = var3.field1855;
                        }
                        class92.method740((long) arg2.field189, (long) arg2.field189, false, true, "<col=ffff00>" + var4, -1, var7[var8].equalsIgnoreCase(class454.field6026.method2547(-98, class243.field3143)) ? var3.field1866 : var10, var9, 0, var7[var8], false, 0, false);
                        class7.field67++;
                    }
                }
            }
            if (var3.field1858 == 1 && var7 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var7[var11] != null && var7[var11].equalsIgnoreCase(class454.field6026.method2547(-103, class243.field3143))) {
                        short var12 = 0;
                        if (arg2.field10204 > class380.field4847.field10070) {
                            var12 = 2000;
                        }
                        short var13 = 0;
                        if (var11 == 0) {
                            var13 = 12;
                        }
                        if (var11 == 1) {
                            var13 = 60;
                        }
                        if (var11 == 2) {
                            var13 = 58;
                        }
                        if (var11 == 3) {
                            var13 = 25;
                        }
                        if (var11 == 4) {
                            var13 = 4;
                        }
                        if (var13 != 0) {
                            var13 += var12;
                        }
                        class92.method740((long) arg2.field189, (long) arg2.field189, false, true, "<col=ffff00>" + var4, -1, var3.field1866, var13, 0, var7[var11], false, 0, false);
                        class560.field7895++;
                    }
                }
            }
        }
        class477.field6504++;
        class92.method740((long) arg2.field189, (long) arg2.field189, arg1, true, "<col=ffff00>" + var4, -1, class38.field594, 1001, 0, class454.field6025.method2547(-122, class243.field3143), false, 0, false);
    }
}
