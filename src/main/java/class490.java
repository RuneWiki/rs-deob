import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class490 {

    @OriginalMember(owner = "client!ll", name = "p", descriptor = "[B")
    private byte[] field7043;

    @OriginalMember(owner = "client!ll", name = "l", descriptor = "I")
    public int field7039;

    @OriginalMember(owner = "client!ll", name = "m", descriptor = "[[B")
    private byte[][] field7040;

    @OriginalMember(owner = "client!ll", name = "k", descriptor = "I")
    public int field7038;

    @OriginalMember(owner = "client!ll", name = "n", descriptor = "I")
    public int field7041;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "[I")
    public static int[] field7032 = new int[3];

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "[Lbaa;")
    public static class576[] field7031 = new class576[6];

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
    public static int field7028;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
    public static int field7030;

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "I")
    public static int field7033;

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
    public static int field7034;

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "I")
    public static int field7035;

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "I")
    public static int field7036;

    @OriginalMember(owner = "client!ll", name = "j", descriptor = "I")
    public static int field7037;

    @OriginalMember(owner = "client!ll", name = "o", descriptor = "I")
    public static int field7042;

    @OriginalMember(owner = "client!ll", name = "q", descriptor = "I")
    public static int field7044;

    @OriginalMember(owner = "client!ll", name = "r", descriptor = "I")
    public static int field7045;

    @OriginalMember(owner = "client!ll", name = "s", descriptor = "I")
    public static int field7046;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "Lr;")
    public static class98 field7029;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I[Lf;ILjava/lang/String;)I")
    public final int method2862(int arg0, class257[] arg1, int arg2, String arg3) {
        field7034++;
        int var5 = -12 % ((arg2 - 2) / 49);
        int var6 = this.method2864(arg1, class636.field9029, new int[] { arg0 }, arg3, 0);
        int var7 = 0;
        for (int var8 = 0; var8 < var6; var8++) {
            int var9 = this.method2873(-60, class636.field9029[var8], arg1);
            if (var7 < var9) {
                var7 = var9;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZZBLjava/lang/String;)V")
    public static final void method2863(boolean arg0, boolean arg1, byte arg2, String arg3) {
        field7045++;
        try {
            label639: {
                if (!arg3.equalsIgnoreCase("commands") && !arg3.equalsIgnoreCase("help")) {
                    if (arg3.equalsIgnoreCase("cls")) {
                        class303.field4250 = 0;
                        class487.field6943 = 0;
                        return;
                    }
                    if (arg3.equalsIgnoreCase("displayfps")) {
                        class570.field8319 = !class570.field8319;
                        if (!class570.field8319) {
                            class28.method269(32316, "FPS off");
                            return;
                        }
                        class28.method269(32316, "FPS on");
                        return;
                    }
                    if (arg3.equals("renderer")) {
                        class568 var4 = class637.field9048.method77();
                        class28.method269(32316, "Vendor: " + var4.field8312);
                        class28.method269(32316, "Name: " + var4.field8308);
                        class28.method269(32316, "Version: " + var4.field8309);
                        class28.method269(32316, "Device: " + var4.field8305);
                        class28.method269(32316, "Driver Version: " + var4.field8304);
                        return;
                    }
                    if (!arg3.equals("heap")) {
                        break label639;
                    }
                    class28.method269(32316, "Heap: " + class246.field3583 + "MB");
                    return;
                }
                class28.method269(32316, "commands - This command");
                class28.method269(32316, "cls - Clear console");
                class28.method269(32316, "displayfps - Toggle FPS and other information");
                class28.method269(32316, "renderer - Print graphics renderer information");
                class28.method269(32316, "heap - Print java memory information");
                return;
            }
        } catch (Exception var43) {
            class28.method269(32316, class343.field4751.method2059(class238.field3511, true));
            return;
        }
        if (arg2 <= 27) {
            return;
        }
        if (class554.field8103 != class205.field3174 || class447.field6459 >= 2) {
            if (arg3.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg3.equals("nativememerror")) {
                throw new OutOfMemoryError("native(MPR");
            }
            try {
                if (arg3.equalsIgnoreCase("printfps")) {
                    class28.method269(32316, "FPS: " + class327.field4548);
                    return;
                }
                if (arg3.equalsIgnoreCase("occlude")) {
                    class155.field2557 = !class155.field2557;
                    if (class155.field2557) {
                        class28.method269(32316, "Occlsion now on!");
                        return;
                    }
                    class28.method269(32316, "Occlsion now off!");
                    return;
                }
                if (arg3.equalsIgnoreCase("fpson")) {
                    class570.field8319 = true;
                    class28.method269(32316, "fps debug enabled");
                    return;
                }
                if (arg3.equalsIgnoreCase("fpsoff")) {
                    class570.field8319 = false;
                    class28.method269(32316, "fps debug disabled");
                    return;
                }
                if (arg3.equals("systemmem")) {
                    try {
                        class28.method269(32316, "System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
                        return;
                    } catch (Throwable var37) {
                        return;
                    }
                }
                if (arg3.equalsIgnoreCase("cleartext")) {
                    class539.field7921.method3311(123);
                    class28.method269(32316, "Text coords cleared");
                    return;
                }
                if (arg3.equalsIgnoreCase("gc")) {
                    class303.method1857((byte) -30);
                    for (int var5 = 0; var5 < 10; var5++) {
                        System.gc();
                    }
                    Runtime var6 = Runtime.getRuntime();
                    int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                    class28.method269(32316, "mem=" + var7 + "k");
                    return;
                }
                if (arg3.equalsIgnoreCase("compact")) {
                    class303.method1857((byte) -30);
                    for (int var8 = 0; var8 < 10; var8++) {
                        System.gc();
                    }
                    Runtime var9 = Runtime.getRuntime();
                    int var10 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                    class28.method269(32316, "Memory before cleanup=" + var10 + "k");
                    class399.method2424((byte) 42);
                    class303.method1857((byte) -30);
                    for (int var11 = 0; var11 < 10; var11++) {
                        System.gc();
                    }
                    int var12 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                    class28.method269(32316, "Memory after cleanup=" + var12 + "k");
                    return;
                }
                if (arg3.equalsIgnoreCase("unloadnatives")) {
                    class28.method269(32316, class294.method1799(-29458) ? "Libraries unloaded" : "Library unloading failed!");
                    return;
                }
                if (arg3.equalsIgnoreCase("clientdrop")) {
                    class28.method269(32316, "Dropped client connection");
                    if (class515.field7636 == 10) {
                        class322.method1926((byte) 46);
                    } else if (class515.field7636 == 11) {
                        class253.field3666 = true;
                        return;
                    }
                    return;
                }
                if (arg3.equalsIgnoreCase("rotateconnectmethods")) {
                    class97.field1450.method1872(0);
                    class28.method269(32316, "Rotated connection methods");
                    return;
                }
                if (arg3.equalsIgnoreCase("clientjs5drop")) {
                    class511.field7607.method1524(4);
                    class28.method269(32316, "Dropped client js5 net queue");
                    return;
                }
                if (arg3.equalsIgnoreCase("serverjs5drop")) {
                    class511.field7607.method1510(-513);
                    class28.method269(32316, "Dropped server js5 net queue");
                    return;
                }
                if (arg3.equalsIgnoreCase("breakcon")) {
                    class653.field9220.method3950((byte) -111);
                    class256.field3696.method916((byte) -115);
                    class511.field7607.method1512((byte) -99);
                    class28.method269(32316, "Breaking new connections for 5 seconds");
                    return;
                }
                if (arg3.equalsIgnoreCase("rebuild")) {
                    class387.method2368((byte) 81);
                    class541.method3183((byte) 41);
                    class28.method269(32316, "Rebuilding map");
                    return;
                }
                if (arg3.equalsIgnoreCase("rebuildprofile")) {
                    class538.field7902 = class254.method1619(true);
                    class511.field7610 = true;
                    class387.method2368((byte) 101);
                    class541.method3183((byte) 125);
                    class28.method269(32316, "Rebuilding map (with profiling)");
                    return;
                }
                if (arg3.equalsIgnoreCase("wm1")) {
                    class246.method1584((byte) -98, -1, 1, false, -1);
                    if (class154.method1160(-95) != 1) {
                        class28.method269(32316, "wm1 failed");
                        return;
                    }
                    class28.method269(32316, "wm1 succeeded");
                    return;
                }
                if (arg3.equalsIgnoreCase("wm2")) {
                    class246.method1584((byte) -101, -1, 2, false, -1);
                    if (class154.method1160(54) == 2) {
                        class28.method269(32316, "wm2 succeeded");
                        return;
                    }
                    class28.method269(32316, "wm2 failed");
                    return;
                }
                if (arg3.equalsIgnoreCase("wm3")) {
                    class246.method1584((byte) -120, 768, 3, false, 1024);
                    if (class154.method1160(-93) != 3) {
                        class28.method269(32316, "wm3 failed");
                        return;
                    }
                    class28.method269(32316, "wm3 succeeded");
                    return;
                }
                if (arg3.equalsIgnoreCase("tk0")) {
                    class251.method1604(94, 0);
                    if (class76.field1182 == 0) {
                        class28.method269(32316, "Entered tk0");
                        class525.field7713.field6000 = 0;
                        class525.field7713.method3481(true, class653.field9220);
                        class622.field8855 = false;
                        return;
                    }
                    class28.method269(32316, "Failed to enter tk0");
                    return;
                }
                if (arg3.equalsIgnoreCase("tk1")) {
                    class251.method1604(32, 1);
                    if (class76.field1182 != 1) {
                        class28.method269(32316, "Failed to enter tk1");
                        return;
                    }
                    class28.method269(32316, "Entered tk1");
                    class525.field7713.field6000 = 1;
                    class525.field7713.method3481(true, class653.field9220);
                    class622.field8855 = false;
                    return;
                }
                if (arg3.equalsIgnoreCase("tk2")) {
                    class251.method1604(95, 2);
                    if (class76.field1182 != 2) {
                        class28.method269(32316, "Failed to enter tk2");
                        return;
                    }
                    class28.method269(32316, "Entered tk2");
                    class525.field7713.field6000 = 2;
                    class525.field7713.method3481(true, class653.field9220);
                    class622.field8855 = false;
                    return;
                }
                if (arg3.equalsIgnoreCase("tk3")) {
                    class251.method1604(38, 3);
                    if (class76.field1182 != 3) {
                        class28.method269(32316, "Failed to enter tk3");
                        return;
                    }
                    class28.method269(32316, "Entered tk3");
                    class525.field7713.field6000 = 3;
                    class525.field7713.method3481(true, class653.field9220);
                    class622.field8855 = false;
                    return;
                }
                if (arg3.equalsIgnoreCase("tk5")) {
                    class251.method1604(55, 5);
                    if (class76.field1182 != 5) {
                        class28.method269(32316, "Failed to enter tk5");
                        return;
                    }
                    class28.method269(32316, "Entered tk5");
                    class525.field7713.field6000 = 5;
                    class525.field7713.method3481(true, class653.field9220);
                    class622.field8855 = false;
                    return;
                }
                if (arg3.equalsIgnoreCase("ot")) {
                    class525.field7713.field5986 = !class525.field7713.field5986;
                    class525.field7713.method3481(true, class653.field9220);
                    class622.field8855 = false;
                    class387.method2368((byte) 57);
                    class28.method269(32316, "ot=" + class525.field7713.field5986);
                    return;
                }
                if (arg3.equalsIgnoreCase("gb")) {
                    class525.field7713.field5967 = !class525.field7713.field5967;
                    class525.field7713.method3481(true, class653.field9220);
                    class622.field8855 = false;
                    class387.method2368((byte) 52);
                    class28.method269(32316, "gb=" + class525.field7713.field5967);
                    return;
                }
                if (arg3.startsWith("shadows")) {
                    if (arg3.length() < 8) {
                        class28.method269(32316, "Invalid shadows value");
                        return;
                    }
                    String var13 = arg3.substring(8);
                    int var14 = class428.method2518((byte) -30, var13) ? class252.method1611(var13, (byte) 34) : -1;
                    if (var14 >= 0 && var14 <= 2) {
                        class525.field7713.method2488(class76.field1182, var14, -51);
                        class525.field7713.method3481(true, class653.field9220);
                        class622.field8855 = false;
                        class387.method2368((byte) 96);
                        class28.method269(32316, "shadows=" + var14);
                        return;
                    }
                    class28.method269(32316, "Invalid shadows value");
                    return;
                }
                if (arg3.startsWith("textures")) {
                    class525.field7713.field5979 = !class525.field7713.field5979;
                    class525.field7713.method3481(true, class653.field9220);
                    class622.field8855 = false;
                    class69.method566((byte) 56);
                    class387.method2368((byte) 107);
                    class28.method269(32316, "textures=" + class525.field7713.field5979);
                    return;
                }
                if (arg3.startsWith("lighting")) {
                    class525.field7713.method2481(26475, !class525.field7713.method2485((byte) 93, class76.field1182), class76.field1182);
                    class525.field7713.method3481(true, class653.field9220);
                    class622.field8855 = false;
                    class403.method2433(-120);
                    class69.method566((byte) -105);
                    class387.method2368((byte) 37);
                    class28.method269(32316, "lighting=" + class525.field7713.method2485((byte) 85, class76.field1182));
                    return;
                }
                if (arg3.startsWith("setba")) {
                    if (arg3.length() < 6) {
                        class28.method269(32316, "Invalid buildarea value");
                        return;
                    }
                    int var15 = class252.method1611(arg3.substring(6), (byte) 40);
                    if (var15 >= 0 && class99.method827(class246.field3583, false) >= var15) {
                        class525.field7713.field5988 = var15;
                        class525.field7713.method3481(true, class653.field9220);
                        class622.field8855 = false;
                        class28.method269(32316, "maxbuildarea=" + class525.field7713.field5988);
                        return;
                    }
                    class28.method269(32316, "Invalid buildarea value");
                    return;
                }
                if (arg3.startsWith("rect_debug")) {
                    if (arg3.length() < 10) {
                        class28.method269(32316, "Invalid rect_debug value");
                        return;
                    }
                    class548.field8046 = class252.method1611(arg3.substring(10).trim(), (byte) 121);
                    class28.method269(32316, "rect_debug=" + class548.field8046);
                    return;
                }
                if (arg3.equalsIgnoreCase("qa_op_test")) {
                    class88.field1324 = true;
                    class28.method269(32316, "qa_op_test=" + class88.field1324);
                    return;
                }
                if (arg3.equalsIgnoreCase("clipcomponents")) {
                    class252.field3653 = !class252.field3653;
                    class28.method269(32316, "clipcomponents=" + class252.field3653);
                    return;
                }
                if (arg3.startsWith("bloom")) {
                    boolean var16 = class637.field9048.method95();
                    if (class677.method3829((byte) -128, !var16)) {
                        if (!var16) {
                            class28.method269(32316, "Bloom enabled");
                            return;
                        }
                        class28.method269(32316, "Bloom disabled");
                        return;
                    }
                    class28.method269(32316, "Failed to enable bloom");
                    return;
                }
                if (arg3.equalsIgnoreCase("tween")) {
                    if (!class61.field888) {
                        class61.field888 = true;
                        class28.method269(32316, "Forced tweening ENABLED!");
                        return;
                    }
                    class61.field888 = false;
                    class28.method269(32316, "Forced tweening disabled.");
                    return;
                }
                if (arg3.equalsIgnoreCase("shiftclick")) {
                    if (class577.field8449) {
                        class28.method269(32316, "Shift-click disabled.");
                        class577.field8449 = false;
                        return;
                    }
                    class28.method269(32316, "Shift-click ENABLED!");
                    class577.field8449 = true;
                    return;
                }
                if (arg3.equalsIgnoreCase("getcgcoord")) {
                    class28.method269(32316, "x:" + (class103.field1708.field3155 >> 9) + " z:" + (class103.field1708.field3154 >> 9));
                    return;
                }
                if (arg3.equalsIgnoreCase("getheight")) {
                    class28.method269(32316, "Height: " + class687.field9745[class103.field1708.field3158].method3858(class103.field1708.field3154 >> 9, class103.field1708.field3155 >> 9, (byte) 89));
                    return;
                }
                if (arg3.equalsIgnoreCase("resetminimap")) {
                    class468.field6754.method2078(0);
                    class468.field6754.method2097(-116);
                    class624.field8902.method1503(-86);
                    class304.field4255.method2844((byte) -10);
                    class541.method3183((byte) 112);
                    class28.method269(32316, "Minimap reset");
                    return;
                }
                if (arg3.startsWith("mc")) {
                    if (!class637.field9048.method786()) {
                        class28.method269(32316, "Current toolkit doesn't support multiple cores");
                        return;
                    }
                    int var17 = Integer.parseInt(arg3.substring(3));
                    if (var17 < 1) {
                        var17 = 1;
                    } else if (var17 > 4) {
                        var17 = 4;
                    }
                    class680.field9683 = var17;
                    class387.method2368((byte) 77);
                    class28.method269(32316, "Render cores now: " + class680.field9683);
                    return;
                }
                if (arg3.startsWith("cachespace")) {
                    class28.method269(32316, "I(s): " + class580.field8512.method948(false) + "/" + class580.field8512.method945(0));
                    class28.method269(32316, "I(m): " + class638.field9056.method948(false) + "/" + class638.field9056.method945(0));
                    class28.method269(32316, "O(s): " + class430.field6132.field122.method3699(false) + "/" + class430.field6132.field122.method3690(true));
                    return;
                }
                if (arg3.equalsIgnoreCase("getcamerapos")) {
                    class28.method269(32316, "Pos: " + class103.field1708.field3158 + "," + ((class551.field8078 >> 9) + class143.field2474 >> 6) + "," + ((class322.field4478 >> 9) + class63.field917 >> 6) + "," + ((class551.field8078 >> 9) + class143.field2474 & 0x3F) + "," + ((class322.field4478 >> 9) + class63.field917 & 0x3F) + " Height: " + (class603.method3433(class322.field4478, class103.field1708.field3158, class551.field8078, -67) - class277.field3933));
                    class28.method269(32316, "Look: " + class103.field1708.field3158 + "," + (class168.field2750 + class143.field2474 >> 6) + "," + (class63.field917 + class498.field7412 >> 6) + "," + (class168.field2750 + class143.field2474 & 0x3F) + "," + (class498.field7412 + class63.field917 & 0x3F) + " Height: " + (class603.method3433(class498.field7412, class103.field1708.field3158, class168.field2750, -56) - class320.field4409));
                    return;
                }
                if (arg3.equals("renderprofile") || arg3.equals("rp")) {
                    class21.field284 = !class21.field284;
                    class637.field9048.method97(class21.field284);
                    class286.method1760(65);
                    class28.method269(32316, "showprofiling=" + class21.field284);
                    return;
                }
                if (arg3.startsWith("performancetest")) {
                    int var18 = -1;
                    int var19 = 1000;
                    if (arg3.length() > 15) {
                        String[] var20 = class6.method26(arg3, (byte) 91, ' ');
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
                        class28.method269(32316, "Performance: " + class673.method3808(true, var19, class76.field1182));
                        return;
                    }
                    class28.method269(32316, "Java toolkit: " + class673.method3808(true, var19, 0));
                    class28.method269(32316, "SSE toolkit:  " + class673.method3808(true, var19, 2));
                    class28.method269(32316, "D3D toolkit:  " + class673.method3808(true, var19, 3));
                    class28.method269(32316, "GL toolkit:   " + class673.method3808(true, var19, 1));
                    class28.method269(32316, "GLX toolkit:  " + class673.method3808(true, var19, 5));
                    return;
                }
                if (arg3.equals("nonpcs")) {
                    class61.field896 = !class61.field896;
                    class28.method269(32316, "nonpcs=" + class61.field896);
                    return;
                }
                if (arg3.equals("autoworld")) {
                    class197.method1387(0);
                    class28.method269(32316, "auto world selected");
                    return;
                }
                if (arg3.startsWith("switchworld")) {
                    int var21 = Integer.parseInt(arg3.substring(12));
                    class173.method1275(var21, class657.method3705((byte) -63, var21).field8780, 654776389);
                    class28.method269(32316, "switched");
                    return;
                }
                if (arg3.equals("getworld")) {
                    class28.method269(32316, "w: " + class97.field1450.field4294);
                    return;
                }
                if (arg3.startsWith("pc")) {
                    class699 var22 = class452.method2630(class699.field9897, class117.field1860, (byte) 123);
                    var22.field9908.method2753((byte) 52, 0);
                    int var23 = var22.field9908.field6710;
                    int var24 = arg3.indexOf(" ", 4);
                    var22.field9908.method2703(false, arg3.substring(3, var24));
                    class421.method2490(arg3.substring(var24), var22.field9908, 0);
                    var22.field9908.method2692((byte) -107, var22.field9908.field6710 - var23);
                    class149.method1134(var22, true);
                    return;
                }
                if (arg3.equals("savevarcs")) {
                    class539.method3174((byte) -103);
                    class28.method269(32316, "perm varcs saved");
                    return;
                }
                if (arg3.equals("scramblevarcs")) {
                    for (int var25 = 0; var25 < class384.field5620.length; var25++) {
                        if (class331.field4580[var25]) {
                            class384.field5620[var25] = (int) (Math.random() * 99999.0D);
                            if (Math.random() > 0.5D) {
                                class384.field5620[var25] *= -1;
                            }
                        }
                    }
                    class539.method3174((byte) -103);
                    class28.method269(32316, "perm varcs scrambled");
                    return;
                }
                if (arg3.equals("showcolmap")) {
                    class680.field9681 = true;
                    class541.method3183((byte) -121);
                    class28.method269(32316, "colmap is shown");
                    return;
                }
                if (arg3.equals("hidecolmap")) {
                    class680.field9681 = false;
                    class541.method3183((byte) -118);
                    class28.method269(32316, "colmap is hidden");
                    return;
                }
                if (arg3.equals("resetcache")) {
                    class293.method1795((byte) -109);
                    class28.method269(32316, "Caches reset");
                    return;
                }
                if (arg3.equals("profilecpu")) {
                    class28.method269(32316, class547.method3210((byte) -47) + "ms");
                    return;
                }
                if (arg3.startsWith("getclientvarpbit")) {
                    int var26 = Integer.parseInt(arg3.substring(17));
                    class28.method269(32316, "varpbit=" + class230.field3404.method1426(65, var26));
                    return;
                }
                if (arg3.startsWith("getclientvarp")) {
                    int var27 = Integer.parseInt(arg3.substring(14));
                    class28.method269(32316, "varp=" + class230.field3404.method1425(false, var27));
                    return;
                }
                if (arg3.startsWith("demologin")) {
                    class537.method3150(false, 0, 3);
                    return;
                }
                if (arg3.startsWith("newdemologin")) {
                    class537.method3150(true, 0, 3);
                    return;
                }
                if (arg3.startsWith("directlogin")) {
                    String[] var28 = class6.method26(arg3.substring(12), (byte) 71, ' ');
                    if (var28.length >= 2) {
                        int var29 = var28.length <= 2 ? 0 : Integer.parseInt(var28[2]);
                        class365.method2191(var28[1], false, var28[0], var29);
                        return;
                    }
                }
                if (arg3.startsWith("csprofileclear")) {
                    class362.method2173();
                    return;
                }
                if (arg3.startsWith("csprofileoutputc")) {
                    class362.method2176(100, false);
                    return;
                }
                if (arg3.startsWith("csprofileoutputt")) {
                    class362.method2176(10, true);
                    return;
                }
                if (arg3.startsWith("texsize")) {
                    int var30 = Integer.parseInt(arg3.substring(8));
                    class637.field9048.method752(var30);
                    return;
                }
                if (arg3.equals("soundstreamcount")) {
                    class28.method269(32316, "Active streams: " + class387.field5675.method3089());
                    return;
                }
                if (arg3.equals("autosetup")) {
                    class525.field7713.method3488((byte) -96);
                    class28.method269(32316, "Complete. Toolkit now: " + class76.field1182);
                    return;
                }
                if (arg3.equals("errormessage")) {
                    class28.method269(32316, class573.field8424.method695(50));
                    return;
                }
                if (arg3.equals("heapdump")) {
                    if (class705.field9971.startsWith("win")) {
                        class309.method1875(new File("C:\\Temp\\heap.dump"), false, 92);
                    } else {
                        class309.method1875(new File("/tmp/heap.dump"), false, 103);
                    }
                    class28.method269(32316, "Done");
                    return;
                }
                if (arg3.equals("os")) {
                    class28.method269(32316, "Name: " + class705.field9971);
                    class28.method269(32316, "Arch: " + class705.field9986);
                    class28.method269(32316, "Ver: " + class705.field9969);
                    return;
                }
                if (arg3.startsWith("w2debug")) {
                    int var31 = Integer.parseInt(arg3.substring(8, 9));
                    class563.field8217 = var31;
                    class387.method2368((byte) 77);
                    class28.method269(32316, "Toggled!");
                    return;
                }
                if (arg3.startsWith("setoutput ")) {
                    File var32 = new File(arg3.substring(10));
                    if (var32.exists()) {
                        var32 = new File(arg3.substring(10) + "." + class254.method1619(true) + ".log");
                        if (var32.exists()) {
                            class28.method269(32316, "file already exists!");
                            return;
                        }
                    }
                    if (class661.field9300 != null) {
                        class661.field9300.close();
                        class661.field9300 = null;
                    }
                    try {
                        class661.field9300 = new FileOutputStream(var32);
                        return;
                    } catch (FileNotFoundException var40) {
                        class28.method269(32316, "Could not create " + var32.getName());
                        return;
                    } catch (SecurityException var41) {
                        class28.method269(32316, "Cannot write to " + var32.getName());
                        return;
                    }
                }
                if (arg3.equals("closeoutput")) {
                    if (class661.field9300 != null) {
                        class661.field9300.close();
                    }
                    class661.field9300 = null;
                    return;
                }
                if (arg3.startsWith("runscript ")) {
                    File var33 = new File(arg3.substring(10));
                    if (!var33.exists()) {
                        class28.method269(32316, "No such file");
                        return;
                    }
                    byte[] var34 = class472.method2775(var33, (byte) 96);
                    if (var34 == null) {
                        class28.method269(32316, "Failed to read file");
                        return;
                    }
                    String[] var35 = class6.method26(class109.method893(class448.method2611(var34, 0), "", '\r', 0), (byte) 98, '\n');
                    class72.method586(var35, (byte) -78);
                    return;
                }
                if (class515.field7636 == 10) {
                    class684.field9723++;
                    class699 var36 = class452.method2630(class699.field9897, class371.field5134, (byte) 123);
                    var36.field9908.method2753((byte) 84, arg3.length() + 3);
                    var36.field9908.method2753((byte) 70, arg1 ? 1 : 0);
                    var36.field9908.method2753((byte) 127, arg0 ? 1 : 0);
                    var36.field9908.method2703(false, arg3);
                    class149.method1134(var36, true);
                }
                if (arg3.startsWith("fps ") && class554.field8103 != class205.field3174) {
                    class273.method1716(class252.method1611(arg3.substring(4), (byte) 57), 81);
                    return;
                }
            } catch (Exception var42) {
                class28.method269(32316, class343.field4751.method2059(class238.field3511, true));
                return;
            }
        }
        if (class515.field7636 != 10) {
            class28.method269(32316, class343.field4752.method2059(class238.field3511, true) + arg3);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "([Lf;[Ljava/lang/String;[ILjava/lang/String;I)I")
    public final int method2864(class257[] arg0, String[] arg1, int[] arg2, String arg3, int arg4) {
        field7035++;
        if (arg3 == null) {
            return 0;
        }
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        int var9 = arg4;
        byte var10 = 0;
        int var11 = -1;
        int var12 = -1;
        int var13 = 0;
        int var14 = arg3.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class107.method888(-161, arg3.charAt(var15)) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var17 += this.method2866(21346, var16);
                    var18 = var15;
                    if (this.field7040 != null && var12 != -1) {
                        var17 += this.field7040[var12][var16];
                    }
                    var12 = var16;
                } else {
                    if (var16 != 62) {
                        continue;
                    }
                    var18 = var11;
                    String var19 = arg3.substring(var11 + 1, var15);
                    var11 = -1;
                    if (var19.equals("br")) {
                        arg1[var13] = arg3.substring(var7, var15 + 1);
                        var13++;
                        if (var13 >= arg1.length) {
                            return 0;
                        }
                        var12 = -1;
                        var8 = -1;
                        var7 = var15 + 1;
                        var6 = 0;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method2866(21346, 60);
                        if (this.field7040 != null && var12 != -1) {
                            var17 += this.field7040[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method2866(arg4 + 21346, 62);
                        if (this.field7040 != null && var12 != -1) {
                            var17 += this.field7040[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method2866(21346, 160);
                        if (this.field7040 != null && var12 != -1) {
                            var17 += this.field7040[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method2866(arg4 + 21346, 173);
                        if (this.field7040 != null && var12 != -1) {
                            var17 += this.field7040[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method2866(21346, 215);
                        if (this.field7040 != null && var12 != -1) {
                            var17 += this.field7040[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method2866(21346, 8364);
                        if (this.field7040 != null && var12 != -1) {
                            var17 += this.field7040[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method2866(21346, 169);
                        if (this.field7040 != null && var12 != -1) {
                            var17 += this.field7040[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method2866(21346, 174);
                        if (this.field7040 != null && var12 != -1) {
                            var17 += this.field7040[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg0 != null) {
                        try {
                            int var20 = class252.method1611(var19.substring(4), (byte) 70);
                            var12 = -1;
                            var17 += arg0[var20].method11();
                        } catch (Exception var21) {
                        }
                    }
                    var16 = -1;
                }
                if (var17 > 0) {
                    var6 += var17;
                    if (arg2 != null) {
                        if (var16 == 32) {
                            var8 = var15;
                            var10 = 1;
                            var9 = var6;
                        }
                        if (var6 > arg2[arg2.length <= var13 ? arg2.length - 1 : var13]) {
                            if (var8 >= 0) {
                                arg1[var13] = arg3.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (var13 >= arg1.length) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var8 = -1;
                                var6 -= var9;
                                var12 = -1;
                            } else {
                                arg1[var13] = arg3.substring(var7, var18);
                                var13++;
                                if (var13 >= arg1.length) {
                                    return 0;
                                }
                                var12 = -1;
                                var7 = var18;
                                var8 = -1;
                                var6 = var17;
                            }
                        }
                        if (var16 == 45) {
                            var10 = 0;
                            var8 = var15;
                            var9 = var6;
                        }
                    }
                }
            }
        }
        if (arg3.length() > var7) {
            arg1[var13] = arg3.substring(var7, arg3.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIC)I")
    public final int method2865(int arg0, int arg1, char arg2) {
        field7030++;
        if (arg0 != -23241) {
            method2863(false, false, (byte) 114, null);
        }
        return this.field7040 == null ? 0 : this.field7040[arg1][arg2];
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(II)I")
    public final int method2866(int arg0, int arg1) {
        if (arg0 != 21346) {
            this.field7043 = null;
        }
        field7042++;
        return this.field7043[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Ljava/lang/String;II[Lf;)I")
    public final int method2867(String arg0, int arg1, int arg2, class257[] arg3) {
        if (arg2 != 173) {
            this.field7039 = 52;
        }
        field7044++;
        return this.method2864(arg3, class636.field9029, new int[] { arg1 }, arg0, 0);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)V")
    public static void method2868(byte arg0) {
        field7032 = null;
        field7031 = null;
        field7029 = null;
        if (arg0 < 50) {
            method2871(false, -77);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILjava/lang/String;I[Lf;)Ljava/lang/String;")
    public final String method2869(int arg0, String arg1, int arg2, class257[] arg3) {
        field7037++;
        if (this.method2873(108, arg1, arg3) <= arg0) {
            return arg1;
        }
        int var5 = arg0 - this.method2873(-78, "...", null);
        int var6 = -1;
        int var7 = -1;
        int var8 = 0;
        int var9 = arg1.length();
        String var10 = "";
        if (arg2 >= -111) {
            field7029 = null;
        }
        for (int var11 = 0; var11 < var9; var11++) {
            char var12 = arg1.charAt(var11);
            if (var12 == '<') {
                var6 = var11;
            } else {
                if (var12 == '>' && var6 != -1) {
                    String var13 = arg1.substring(var6 + 1, var11);
                    var6 = -1;
                    if (var13.equals("lt")) {
                        var12 = '<';
                    } else if (var13.equals("gt")) {
                        var12 = '>';
                    } else if (var13.equals("nbsp")) {
                        var12 = ' ';
                    } else if (var13.equals("shy")) {
                        var12 = '\u00AD';
                    } else if (var13.equals("times")) {
                        var12 = '×';
                    } else if (var13.equals("euro")) {
                        var12 = '€';
                    } else if (var13.equals("copy")) {
                        var12 = '©';
                    } else {
                        if (!var13.equals("reg")) {
                            if (var13.startsWith("img=") && arg3 != null) {
                                try {
                                    int var14 = class252.method1611(var13.substring(4), (byte) 76);
                                    var7 = -1;
                                    var8 += arg3[var14].method11();
                                    if (var5 < var8) {
                                        return var10 + "...";
                                    }
                                    var10 = arg1.substring(0, var11 + 1);
                                } catch (Exception var16) {
                                }
                            }
                            continue;
                        }
                        var12 = '®';
                    }
                }
                if (var6 == -1) {
                    var8 += this.field7043[class107.method888(-161, var12) & 0xFF] & 0xFF;
                    if (this.field7040 != null && var7 != -1) {
                        var8 += this.field7040[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field7040 != null) {
                        var15 = this.field7040[var12][46] + var8;
                    }
                    if (var5 < var15) {
                        return var10 + "...";
                    }
                    var10 = arg1.substring(0, var11 + 1);
                }
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZLjava/lang/String;)I")
    public final int method2870(boolean arg0, String arg1) {
        field7028++;
        if (!arg0) {
            this.field7040 = null;
        }
        return this.method2873(125, arg1, null);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZI)Z")
    public static final boolean method2871(boolean arg0, int arg1) {
        field7046++;
        if (!arg0) {
            method2868((byte) -47);
        }
        return arg1 == 3 || arg1 == 4 || arg1 == 5 || arg1 == 6;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIILjava/lang/String;[Lf;)I")
    public final int method2872(int arg0, int arg1, int arg2, String arg3, class257[] arg4) {
        if (arg1 == 0) {
            arg1 = this.field7039;
        }
        field7033++;
        int var6 = -82 / ((3 - arg2) / 40);
        int var7 = this.method2864(arg4, class636.field9029, new int[] { arg0 }, arg3, 0);
        int var8 = (var7 - 1) * arg1;
        return this.field7038 - (-this.field7041 - var8);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILjava/lang/String;[Lf;)I")
    public final int method2873(int arg0, String arg1, class257[] arg2) {
        field7036++;
        if (arg1 == null) {
            return 0;
        }
        int var4 = -1;
        int var5 = -1;
        int var6 = 0;
        int var7 = arg1.length();
        int var8 = -15 / ((28 - arg0) / 56);
        for (int var9 = 0; var9 < var7; var9++) {
            char var10 = arg1.charAt(var9);
            if (var10 == '<') {
                var4 = var9;
            } else {
                if (var10 == '>' && var4 != -1) {
                    String var11 = arg1.substring(var4 + 1, var9);
                    var4 = -1;
                    if (var11.equals("lt")) {
                        var10 = '<';
                    } else if (var11.equals("gt")) {
                        var10 = '>';
                    } else if (var11.equals("nbsp")) {
                        var10 = ' ';
                    } else if (var11.equals("shy")) {
                        var10 = '\u00AD';
                    } else if (var11.equals("times")) {
                        var10 = '×';
                    } else if (var11.equals("euro")) {
                        var10 = '€';
                    } else if (var11.equals("copy")) {
                        var10 = '©';
                    } else {
                        if (!var11.equals("reg")) {
                            if (var11.startsWith("img=") && arg2 != null) {
                                try {
                                    int var12 = class252.method1611(var11.substring(4), (byte) 46);
                                    var5 = -1;
                                    var6 += arg2[var12].method11();
                                } catch (Exception var13) {
                                }
                            }
                            continue;
                        }
                        var10 = '®';
                    }
                }
                if (var4 == -1) {
                    var6 += this.field7043[class107.method888(-161, var10) & 0xFF] & 0xFF;
                    if (this.field7040 != null && var5 != -1) {
                        var6 += this.field7040[var5][var10];
                    }
                    var5 = var10;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "([B)V")
    public class490(byte[] arg0) {
        class465 var2 = new class465(arg0);
        int var3 = var2.method2705(-63);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method2705(-46) == 1;
        this.field7043 = new byte[256];
        var2.method2750(this.field7043, -119, 256, 0);
        if (var4) {
            int[] var5 = new int[256];
            for (int var6 = 0; var6 < 256; var6++) {
                var5[var6] = var2.method2705(-62);
            }
            int[] var7 = new int[256];
            for (int var8 = 0; var8 < 256; var8++) {
                var7[var8] = var2.method2705(-35);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method2712(-123);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method2712(-124);
                    var11[var12][var16] = var15;
                }
            }
            this.field7040 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field7040[var13][var14] = (byte) class481.method2809(var11, (byte) 127, this.field7043, var14, var7, var13, var9, var5);
                        }
                    }
                }
            }
            this.field7039 = var5[32] + var7[32];
        } else {
            this.field7039 = var2.method2705(-55);
        }
        var2.method2705(-102);
        var2.method2705(-109);
        this.field7038 = var2.method2705(-61);
        this.field7041 = var2.method2705(-120);
    }
}
