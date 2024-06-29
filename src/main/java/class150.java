import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class150 {

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public static int field2124 = -1;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "Ldv;")
    public static class657 field2130 = new class657(64);

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "[I")
    public static int[] field2135 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public int field2121;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "I")
    public int field2129;

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "I")
    public int field2132;

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "I")
    public int field2133;

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "I")
    public int field2134;

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "I")
    public int field2136;

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "I")
    public int field2137;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "[B")
    public byte[] field2123;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "[B")
    public byte[] field2131;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
    public static final void method1020(int arg0) {
        for (class37 var1 = (class37) class215.field2820.method2765(-12261); var1 != null; var1 = (class37) class215.field2820.method2759(-15361)) {
            if (class727.method4088(-1003, var1.field463)) {
                class310.method2013(true, var1);
            }
        }
        if (arg0 >= -57) {
            field2130 = null;
        }
        field2125++;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1021(int arg0, String arg1) {
        field2128++;
        if (arg0 != -1) {
            field2130 = null;
        }
        if (arg1 == null) {
            return;
        }
        if (!(class215.field2828 < 200 || class758.field10534) || class215.field2828 >= 200) {
            class642.method3549(true, 4, class71.field906.method588((byte) 118, class549.field7669));
            String var2 = class71.field907.method588((byte) 120, class549.field7669);
            if (var2 != null) {
                class642.method3549(true, 4, var2);
            }
            return;
        }
        String var3 = class705.method3964(arg0 + 1, arg1);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class215.field2828; var4++) {
            String var9 = class705.method3964(0, class703.field9786[var4]);
            if (var9 != null && var9.equals(var3)) {
                class642.method3549(true, 4, arg1 + class71.field934.method588((byte) 84, class549.field7669));
                return;
            }
            if (class479.field6784[var4] != null) {
                String var10 = class705.method3964(~arg0, class479.field6784[var4]);
                if (var10 != null && var10.equals(var3)) {
                    class642.method3549(true, 4, arg1 + class71.field934.method588((byte) 124, class549.field7669));
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class261.field3764; var5++) {
            String var7 = class705.method3964(0, class260.field3742[var5]);
            if (var7 != null && var7.equals(var3)) {
                class642.method3549(true, 4, class71.field939.method588((byte) 121, class549.field7669) + arg1 + class71.field940.method588((byte) 115, class549.field7669));
                return;
            }
            if (class539.field7559[var5] != null) {
                String var8 = class705.method3964(~arg0, class539.field7559[var5]);
                if (var8 != null && var8.equals(var3)) {
                    class642.method3549(true, 4, class71.field939.method588((byte) 88, class549.field7669) + arg1 + class71.field940.method588((byte) 95, class549.field7669));
                    return;
                }
            }
        }
        if (class705.method3964(0, class660.field9039.field3965).equals(var3)) {
            class642.method3549(true, 4, class71.field937.method588((byte) 92, class549.field7669));
            return;
        }
        class104.field1233++;
        class519 var6 = class357.method2293(class427.field5994, class409.field5791, (byte) 122);
        var6.field7384.method3694(class505.method2988(arg1, 0), arg0 - 1528071455);
        var6.field7384.method3747((byte) 27, arg1);
        class151.method1027(var6, -20);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ljava/lang/String;ZZI)V")
    public static final void method1022(String arg0, boolean arg1, boolean arg2, int arg3) {
        field2122++;
        try {
            if (arg0.equalsIgnoreCase("commands") || arg0.equalsIgnoreCase("help")) {
                class559.method3221("commands - This command", (byte) -98);
                class559.method3221("cls - Clear console", (byte) -88);
                class559.method3221("displayfps - Toggle FPS and other information", (byte) 54);
                class559.method3221("renderer - Print graphics renderer information", (byte) 110);
                class559.method3221("heap - Print java memory information", (byte) -103);
                return;
            }
            if (arg0.equalsIgnoreCase("cls")) {
                class407.field5766 = 0;
                class446.field6324 = 0;
                return;
            }
            if (arg0.equalsIgnoreCase("displayfps")) {
                class59.field737 = !class59.field737;
                if (class59.field737) {
                    class559.method3221("FPS on", (byte) -103);
                    return;
                }
                class559.method3221("FPS off", (byte) -86);
                return;
            }
            if (arg3 >= -113) {
                method1020(83);
            }
            if (arg0.equals("renderer")) {
                class603 var4 = class268.field3831.method451();
                class559.method3221("Vendor: " + var4.field8480, (byte) -96);
                class559.method3221("Name: " + var4.field8471, (byte) 33);
                class559.method3221("Version: " + var4.field8473, (byte) -101);
                class559.method3221("Device: " + var4.field8479, (byte) -100);
                class559.method3221("Driver Version: " + var4.field8478, (byte) 33);
                return;
            }
            if (arg0.equals("heap")) {
                class559.method3221("Heap: " + class698.field9627 + "MB", (byte) 34);
                return;
            }
        } catch (Exception var46) {
            class559.method3221(class71.field898.method588((byte) 88, class549.field7669), (byte) 43);
            return;
        }
        if (class408.field5781 != class277.field3922 || class399.field5645 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equals("nativememerror")) {
                throw new OutOfMemoryError("native(MPR");
            }
            try {
                if (arg0.equalsIgnoreCase("printfps")) {
                    class559.method3221("FPS: " + class411.field5801, (byte) 11);
                    return;
                }
                if (arg0.equalsIgnoreCase("occlude")) {
                    class734.field10226 = !class734.field10226;
                    if (class734.field10226) {
                        class559.method3221("Occlsion now on!", (byte) -104);
                        return;
                    }
                    class559.method3221("Occlsion now off!", (byte) -128);
                    return;
                }
                if (arg0.equalsIgnoreCase("fpson")) {
                    class59.field737 = true;
                    class559.method3221("fps debug enabled", (byte) 38);
                    return;
                }
                if (arg0.equalsIgnoreCase("fpsoff")) {
                    class59.field737 = false;
                    class559.method3221("fps debug disabled", (byte) -88);
                    return;
                }
                if (arg0.equals("systemmem")) {
                    try {
                        class559.method3221("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + class470.field6666.field5558 + "Mb", (byte) -114);
                        return;
                    } catch (Throwable var40) {
                        return;
                    }
                }
                if (arg0.equalsIgnoreCase("cleartext")) {
                    class251.field3369.method2304(-76);
                    class559.method3221("Text coords cleared", (byte) -115);
                    return;
                }
                if (arg0.equalsIgnoreCase("gc")) {
                    class414.method2544(false);
                    for (int var5 = 0; var5 < 10; var5++) {
                        System.gc();
                    }
                    Runtime var6 = Runtime.getRuntime();
                    int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                    class559.method3221("mem=" + var7 + "k", (byte) 6);
                    return;
                }
                if (arg0.equalsIgnoreCase("compact")) {
                    class414.method2544(false);
                    for (int var8 = 0; var8 < 10; var8++) {
                        System.gc();
                    }
                    Runtime var9 = Runtime.getRuntime();
                    int var10 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                    class559.method3221("Memory before cleanup=" + var10 + "k", (byte) -95);
                    class162.method1065(false);
                    class414.method2544(false);
                    for (int var11 = 0; var11 < 10; var11++) {
                        System.gc();
                    }
                    int var12 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                    class559.method3221("Memory after cleanup=" + var12 + "k", (byte) 49);
                    return;
                }
                if (arg0.equalsIgnoreCase("unloadnatives")) {
                    class559.method3221(class507.method2996((byte) -72) ? "Libraries unloaded" : "Library unloading failed!", (byte) -100);
                    return;
                }
                if (arg0.equalsIgnoreCase("clientdrop")) {
                    class559.method3221("Dropped client connection", (byte) -128);
                    if (class222.field2897 == 10) {
                        class467.method2786((byte) 93);
                        return;
                    }
                    if (class222.field2897 == 11) {
                        class711.field9881 = true;
                    }
                    return;
                }
                if (arg0.equalsIgnoreCase("rotateconnectmethods")) {
                    class584.field8222.method4163(98);
                    class559.method3221("Rotated connection methods", (byte) 65);
                    return;
                }
                if (arg0.equalsIgnoreCase("clientjs5drop")) {
                    class25.field349.method3404((byte) -65);
                    class559.method3221("Dropped client js5 net queue", (byte) 95);
                    return;
                }
                if (arg0.equalsIgnoreCase("serverjs5drop")) {
                    class25.field349.method3396(false);
                    class559.method3221("Dropped server js5 net queue", (byte) 27);
                    return;
                }
                if (arg0.equalsIgnoreCase("breakcon")) {
                    class202.field2644.method2047(-96);
                    class333.field4663.method2845((byte) 125);
                    class25.field349.method3401((byte) -103);
                    class559.method3221("Breaking new connections for 5 seconds", (byte) -91);
                    return;
                }
                if (arg0.equalsIgnoreCase("rebuild")) {
                    class510.method3014(3);
                    class636.method3534(16598);
                    class559.method3221("Rebuilding map", (byte) 48);
                    return;
                }
                if (arg0.equalsIgnoreCase("rebuildprofile")) {
                    class690.field9424 = class479.method2864((byte) -110);
                    class609.field8572 = true;
                    class510.method3014(3);
                    class636.method3534(16598);
                    class559.method3221("Rebuilding map (with profiling)", (byte) 43);
                    return;
                }
                if (arg0.equalsIgnoreCase("wm1")) {
                    class342.method2214(3, false, 1, -1, -1);
                    if (class605.method3408((byte) 54) != 1) {
                        class559.method3221("wm1 failed", (byte) -97);
                        return;
                    }
                    class559.method3221("wm1 succeeded", (byte) 99);
                    return;
                }
                if (arg0.equalsIgnoreCase("wm2")) {
                    class342.method2214(3, false, 2, -1, -1);
                    if (class605.method3408((byte) 54) == 2) {
                        class559.method3221("wm2 succeeded", (byte) 90);
                        return;
                    }
                    class559.method3221("wm2 failed", (byte) -109);
                    return;
                }
                if (arg0.equalsIgnoreCase("wm3")) {
                    class342.method2214(3, false, 3, 1024, 768);
                    if (class605.method3408((byte) 54) == 3) {
                        class559.method3221("wm3 succeeded", (byte) 8);
                        return;
                    }
                    class559.method3221("wm3 failed", (byte) 72);
                    return;
                }
                if (arg0.equalsIgnoreCase("tk0")) {
                    class759.method4212(false, 0, 0);
                    if (class557.field7812.field6521.method2556(false) == 0) {
                        class559.method3221("Entered tk0", (byte) 70);
                        class557.field7812.method2755(249682952, 0, class557.field7812.field6555);
                        class90.method681(10343);
                        class673.field9128 = false;
                        return;
                    }
                    class559.method3221("Failed to enter tk0", (byte) 14);
                    return;
                }
                if (arg0.equalsIgnoreCase("tk1")) {
                    class759.method4212(false, 0, 1);
                    if (class557.field7812.field6521.method2556(false) != 1) {
                        class559.method3221("Failed to enter tk1", (byte) -98);
                        return;
                    }
                    class559.method3221("Entered tk1", (byte) -89);
                    class557.field7812.method2755(249682952, 1, class557.field7812.field6555);
                    class90.method681(10343);
                    class673.field9128 = false;
                    return;
                }
                if (arg0.equalsIgnoreCase("tk2")) {
                    class759.method4212(false, 0, 2);
                    if (class557.field7812.field6521.method2556(false) != 2) {
                        class559.method3221("Failed to enter tk2", (byte) -88);
                        return;
                    }
                    class559.method3221("Entered tk2", (byte) -99);
                    class557.field7812.method2755(249682952, 2, class557.field7812.field6555);
                    class90.method681(10343);
                    class673.field9128 = false;
                    return;
                }
                if (arg0.equalsIgnoreCase("tk3")) {
                    class759.method4212(false, 0, 3);
                    if (class557.field7812.field6521.method2556(false) != 3) {
                        class559.method3221("Failed to enter tk3", (byte) -102);
                        return;
                    }
                    class559.method3221("Entered tk3", (byte) -127);
                    class557.field7812.method2755(249682952, 3, class557.field7812.field6555);
                    class90.method681(10343);
                    class673.field9128 = false;
                    return;
                }
                if (arg0.equalsIgnoreCase("tk5")) {
                    class759.method4212(false, 0, 5);
                    if (class557.field7812.field6521.method2556(false) != 5) {
                        class559.method3221("Failed to enter tk5", (byte) 119);
                        return;
                    }
                    class559.method3221("Entered tk5", (byte) 127);
                    class557.field7812.method2755(249682952, 5, class557.field7812.field6555);
                    class90.method681(10343);
                    class673.field9128 = false;
                    return;
                }
                if (arg0.startsWith("setba")) {
                    if (arg0.length() < 6) {
                        class559.method3221("Invalid buildarea value", (byte) -107);
                        return;
                    }
                    int var13 = class325.method2121(arg0.substring(6), -23213);
                    if (var13 >= 0 && class566.method3265(2, class698.field9627) >= var13) {
                        class557.field7812.method2755(249682952, var13, class557.field7812.field6514);
                        class90.method681(10343);
                        class673.field9128 = false;
                        class559.method3221("maxbuildarea=" + class557.field7812.field6514.method651(false), (byte) 96);
                        return;
                    }
                    class559.method3221("Invalid buildarea value", (byte) -85);
                    return;
                }
                if (arg0.startsWith("rect_debug")) {
                    if (arg0.length() < 10) {
                        class559.method3221("Invalid rect_debug value", (byte) 65);
                        return;
                    }
                    class422.field5956 = class325.method2121(arg0.substring(10).trim(), -23213);
                    class559.method3221("rect_debug=" + class422.field5956, (byte) 111);
                    return;
                }
                if (arg0.equalsIgnoreCase("qa_op_test")) {
                    class600.field8422 = true;
                    class559.method3221("qa_op_test=" + class600.field8422, (byte) 37);
                    return;
                }
                if (arg0.equalsIgnoreCase("clipcomponents")) {
                    class100.field1193 = !class100.field1193;
                    class559.method3221("clipcomponents=" + class100.field1193, (byte) -123);
                    return;
                }
                if (arg0.startsWith("bloom")) {
                    boolean var14 = class268.field3831.method491();
                    if (!class479.method2861(-86, !var14)) {
                        class559.method3221("Failed to enable bloom", (byte) 85);
                        return;
                    }
                    if (var14) {
                        class559.method3221("Bloom disabled", (byte) -94);
                        return;
                    }
                    class559.method3221("Bloom enabled", (byte) 72);
                    return;
                }
                if (arg0.equalsIgnoreCase("tween")) {
                    if (!class411.field5804) {
                        class411.field5804 = true;
                        class559.method3221("Forced tweening ENABLED!", (byte) 12);
                        return;
                    }
                    class411.field5804 = false;
                    class559.method3221("Forced tweening disabled.", (byte) 11);
                    return;
                }
                if (arg0.equalsIgnoreCase("shiftclick")) {
                    if (class713.field9914) {
                        class559.method3221("Shift-click disabled.", (byte) -90);
                        class713.field9914 = false;
                        return;
                    }
                    class559.method3221("Shift-click ENABLED!", (byte) 110);
                    class713.field9914 = true;
                    return;
                }
                if (arg0.equalsIgnoreCase("getcgcoord")) {
                    class559.method3221("x:" + (class660.field9039.field1264 >> 9) + " z:" + (class660.field9039.field1250 >> 9), (byte) 11);
                    return;
                }
                if (arg0.equalsIgnoreCase("getheight")) {
                    class559.method3221("Height: " + class459.field6474[class660.field9039.field1266].method1816((byte) -1, class660.field9039.field1250 >> 9, class660.field9039.field1264 >> 9), (byte) 125);
                    return;
                }
                if (arg0.equalsIgnoreCase("resetminimap")) {
                    class374.field5245.method2109((byte) 87);
                    class374.field5245.method2081(-105);
                    class48.field564.method1411(2060105417);
                    class569.field8079.method3085((byte) -86);
                    class636.method3534(16598);
                    class559.method3221("Minimap reset", (byte) -125);
                    return;
                }
                if (arg0.startsWith("mc")) {
                    if (!class268.field3831.method441()) {
                        class559.method3221("Current toolkit doesn't support multiple cores", (byte) -84);
                        return;
                    }
                    int var15 = Integer.parseInt(arg0.substring(3));
                    if (var15 < 1) {
                        var15 = 1;
                    } else if (var15 > 4) {
                        var15 = 4;
                    }
                    class509.field7281 = var15;
                    class510.method3014(3);
                    class559.method3221("Render cores now: " + class509.field7281, (byte) -103);
                    return;
                }
                if (arg0.startsWith("cachespace")) {
                    class559.method3221("I(s): " + class238.field3180.method4025(40) + "/" + class238.field3180.method4027(0), (byte) 81);
                    class559.method3221("I(m): " + class347.field4909.method4025(-103) + "/" + class347.field4909.method4027(0), (byte) -103);
                    class559.method3221("O(s): " + class682.field9361.field8551.method87((byte) 121) + "/" + class682.field9361.field8551.method86(0), (byte) -111);
                    return;
                }
                if (arg0.equalsIgnoreCase("getcamerapos")) {
                    class559.method3221("Pos: " + class660.field9039.field1266 + "," + ((class511.field7303 >> 9) + class228.field3063 >> 6) + "," + ((class32.field426 >> 9) + class3.field30 >> 6) + "," + ((class511.field7303 >> 9) + class228.field3063 & 0x3F) + "," + ((class32.field426 >> 9) + class3.field30 & 0x3F) + " Height: " + (class469.method2798(75, class32.field426, class660.field9039.field1266, class511.field7303) - class155.field2169), (byte) -125);
                    class559.method3221("Look: " + class660.field9039.field1266 + "," + (class623.field8674 + class228.field3063 >> 6) + "," + (class622.field8671 + class3.field30 >> 6) + "," + (class623.field8674 + class228.field3063 & 0x3F) + "," + (class622.field8671 + class3.field30 & 0x3F) + " Height: " + (class469.method2798(87, class622.field8671, class660.field9039.field1266, class623.field8674) - class401.field5697), (byte) -82);
                    return;
                }
                if (arg0.equals("renderprofile") || arg0.equals("rp")) {
                    class33.field430 = !class33.field430;
                    class268.field3831.method449(class33.field430);
                    class50.method312((byte) -100);
                    class559.method3221("showprofiling=" + class33.field430, (byte) 106);
                    return;
                }
                if (arg0.startsWith("performancetest")) {
                    int var16 = -1;
                    int var17 = 1000;
                    if (arg0.length() > 15) {
                        String[] var18 = class719.method4040(11027, ' ', arg0);
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
                        class559.method3221("Performance: " + class752.method4186(var17, var16, (byte) 83), (byte) 84);
                        return;
                    }
                    class559.method3221("Java toolkit: " + class752.method4186(var17, 0, (byte) 83), (byte) -97);
                    class559.method3221("SSE toolkit:  " + class752.method4186(var17, 2, (byte) 83), (byte) 79);
                    class559.method3221("D3D toolkit:  " + class752.method4186(var17, 3, (byte) 83), (byte) -86);
                    class559.method3221("GL toolkit:   " + class752.method4186(var17, 1, (byte) 83), (byte) -114);
                    class559.method3221("GLX toolkit:  " + class752.method4186(var17, 5, (byte) 83), (byte) 32);
                    return;
                }
                if (arg0.equals("nonpcs")) {
                    class237.field3174 = !class237.field3174;
                    class559.method3221("nonpcs=" + class237.field3174, (byte) -110);
                    return;
                }
                if (arg0.equals("autoworld")) {
                    class41.method276((byte) 117);
                    class559.method3221("auto world selected", (byte) -125);
                    return;
                }
                if (arg0.startsWith("switchworld")) {
                    int var19 = Integer.parseInt(arg0.substring(12));
                    class518.method3038((byte) 49, class233.method1502(-125, var19).field4062, var19);
                    class559.method3221("switched", (byte) -120);
                    return;
                }
                if (arg0.equals("getworld")) {
                    class559.method3221("w: " + class584.field8222.field10399, (byte) -97);
                    return;
                }
                if (arg0.startsWith("pc")) {
                    class519 var20 = class357.method2293(class427.field5994, class488.field6891, (byte) -73);
                    var20.field7384.method3694(0, -1528071456);
                    int var21 = var20.field7384.field9146;
                    int var22 = arg0.indexOf(" ", 4);
                    var20.field7384.method3747((byte) 27, arg0.substring(3, var22));
                    class182.method1148(arg0.substring(var22), false, var20.field7384);
                    var20.field7384.method3728(var20.field7384.field9146 - var21, (byte) 113);
                    class151.method1027(var20, -72);
                    return;
                }
                if (arg0.equals("savevarcs")) {
                    class642.method3550(false);
                    class559.method3221("perm varcs saved", (byte) 84);
                    return;
                }
                if (arg0.equals("scramblevarcs")) {
                    for (int var23 = 0; var23 < class718.field9975.length; var23++) {
                        if (class538.field7548[var23]) {
                            class718.field9975[var23] = (int) (Math.random() * 99999.0D);
                            if (Math.random() > 0.5D) {
                                class718.field9975[var23] *= -1;
                            }
                        }
                    }
                    class642.method3550(false);
                    class559.method3221("perm varcs scrambled", (byte) -123);
                    return;
                }
                if (arg0.equals("showcolmap")) {
                    class254.field3723 = true;
                    class636.method3534(16598);
                    class559.method3221("colmap is shown", (byte) -91);
                    return;
                }
                if (arg0.equals("hidecolmap")) {
                    class254.field3723 = false;
                    class636.method3534(16598);
                    class559.method3221("colmap is hidden", (byte) -116);
                    return;
                }
                if (arg0.equals("resetcache")) {
                    class184.method1167((byte) -73);
                    class559.method3221("Caches reset", (byte) -116);
                    return;
                }
                if (arg0.equals("profilecpu")) {
                    class559.method3221(class675.method3740(120) + "ms", (byte) -89);
                    return;
                }
                if (arg0.startsWith("getclientvarpbit")) {
                    int var24 = Integer.parseInt(arg0.substring(17));
                    class559.method3221("varpbit=" + class101.field1201.method1990(var24, 26951), (byte) -106);
                    return;
                }
                if (arg0.startsWith("getclientvarp")) {
                    int var25 = Integer.parseInt(arg0.substring(14));
                    class559.method3221("varp=" + class101.field1201.method1992(-1, var25), (byte) -103);
                    return;
                }
                if (arg0.startsWith("directlogin")) {
                    String[] var26 = class719.method4040(11027, ' ', arg0.substring(12));
                    if (var26.length >= 2) {
                        int var27 = var26.length <= 2 ? 0 : Integer.parseInt(var26[2]);
                        class153.method1033(15341, var26[0], var26[1], var27);
                        return;
                    }
                }
                if (arg0.startsWith("csprofileclear")) {
                    class241.method1542();
                    return;
                }
                if (arg0.startsWith("csprofileoutputc")) {
                    class241.method1544(100, false);
                    return;
                }
                if (arg0.startsWith("csprofileoutputt")) {
                    class241.method1544(10, true);
                    return;
                }
                if (arg0.startsWith("texsize")) {
                    int var28 = Integer.parseInt(arg0.substring(8));
                    class268.field3831.method408(var28);
                    return;
                }
                if (arg0.equals("soundstreamcount")) {
                    class559.method3221("Active streams: " + class192.field2560.method1727(), (byte) 18);
                    return;
                }
                if (arg0.equals("autosetup")) {
                    class471.method2819((byte) -76);
                    class559.method3221("Complete. Toolkit now: " + class557.field7812.field6521.method2556(false), (byte) 55);
                    return;
                }
                if (arg0.equals("errormessage")) {
                    class559.method3221(class499.field7161.method1957(true), (byte) 68);
                    return;
                }
                if (arg0.equals("heapdump")) {
                    if (class316.field4377.startsWith("win")) {
                        class731.method4100((byte) -58, new File("C:\\Temp\\heap.dump"), false);
                    } else {
                        class731.method4100((byte) -44, new File("/tmp/heap.dump"), false);
                    }
                    class559.method3221("Done", (byte) -100);
                    return;
                }
                if (arg0.equals("os")) {
                    class559.method3221("Name: " + class316.field4377, (byte) -120);
                    class559.method3221("Arch: " + class316.field4386, (byte) -88);
                    class559.method3221("Ver: " + class316.field4371, (byte) -82);
                    return;
                }
                if (arg0.startsWith("w2debug")) {
                    int var29 = Integer.parseInt(arg0.substring(8, 9));
                    class353.field5025 = var29;
                    class510.method3014(3);
                    class559.method3221("Toggled!", (byte) -103);
                    return;
                }
                if (arg0.startsWith("ortho ")) {
                    int var30 = arg0.indexOf(32);
                    if (var30 < 0) {
                        class559.method3221("Syntax: ortho <n>", (byte) -111);
                        return;
                    }
                    int var31 = class325.method2121(arg0.substring(var30 + 1), -23213);
                    class557.field7812.method2755(249682952, var31, class557.field7812.field6556);
                    class90.method681(10343);
                    class673.field9128 = false;
                    class729.method4096(-1);
                    if (class557.field7812.field6556.method2647(false) != var31) {
                        class559.method3221("Failed to change ortho mode", (byte) -115);
                        return;
                    }
                    class559.method3221("Successfully changed ortho mode", (byte) -89);
                    return;
                }
                if (arg0.startsWith("orthozoom ")) {
                    if (class557.field7812.field6556.method2647(false) == 0) {
                        class559.method3221("enable ortho mode first (use 'ortho <n>')", (byte) -116);
                        return;
                    }
                    int var32 = class325.method2121(arg0.substring(arg0.indexOf(32) + 1), -23213);
                    class516.field7359 = var32;
                    class559.method3221("orthozoom=" + class516.field7359, (byte) -126);
                    return;
                }
                if (arg0.startsWith("orthotilesize ")) {
                    int var33 = class325.method2121(arg0.substring(arg0.indexOf(32) + 1), -23213);
                    class280.field3990 = var33;
                    class106.field1276 = var33;
                    class559.method3221("ortho tile size=" + var33, (byte) -90);
                    class729.method4096(-1);
                    return;
                }
                if (arg0.equals("orthocamlock")) {
                    class221.field2888 = !class221.field2888;
                    class559.method3221("ortho camera lock is " + (class221.field2888 ? "on" : "off"), (byte) 56);
                    return;
                }
                if (arg0.startsWith("setoutput ")) {
                    File var34 = new File(arg0.substring(10));
                    if (var34.exists()) {
                        var34 = new File(arg0.substring(10) + "." + class479.method2864((byte) -73) + ".log");
                        if (var34.exists()) {
                            class559.method3221("file already exists!", (byte) -95);
                            return;
                        }
                    }
                    if (class689.field9409 != null) {
                        class689.field9409.close();
                        class689.field9409 = null;
                    }
                    try {
                        class689.field9409 = new FileOutputStream(var34);
                        return;
                    } catch (FileNotFoundException var43) {
                        class559.method3221("Could not create " + var34.getName(), (byte) -115);
                        return;
                    } catch (SecurityException var44) {
                        class559.method3221("Cannot write to " + var34.getName(), (byte) -92);
                        return;
                    }
                }
                if (arg0.equals("closeoutput")) {
                    if (class689.field9409 != null) {
                        class689.field9409.close();
                    }
                    class689.field9409 = null;
                    return;
                }
                if (arg0.startsWith("runscript ")) {
                    File var35 = new File(arg0.substring(10));
                    if (!var35.exists()) {
                        class559.method3221("No such file", (byte) -117);
                        return;
                    }
                    byte[] var36 = class116.method808(var35, 26308);
                    if (var36 == null) {
                        class559.method3221("Failed to read file", (byte) -106);
                        return;
                    }
                    String[] var37 = class719.method4040(11027, '\n', class236.method1515("", (byte) 122, class107.method766(-107, var36), '\r'));
                    class251.method1596(-13841, var37);
                }
                if (arg0.startsWith("zoom ")) {
                    short var38 = (short) class325.method2121(arg0.substring(5), -23213);
                    if (var38 > 0) {
                        class343.field4787 = var38;
                    }
                    return;
                }
                if (class222.field2897 == 10) {
                    class568.field8059++;
                    class519 var39 = class357.method2293(class427.field5994, class200.field2635, (byte) 65);
                    var39.field7384.method3694(arg0.length() + 3, -1528071456);
                    var39.field7384.method3694(arg1 ? 1 : 0, -1528071456);
                    var39.field7384.method3694(arg2 ? 1 : 0, -1528071456);
                    var39.field7384.method3747((byte) 27, arg0);
                    class151.method1027(var39, -36);
                }
                if (arg0.startsWith("fps ") && class408.field5781 != class277.field3922) {
                    class268.method1745(-110, class325.method2121(arg0.substring(4), -23213));
                    return;
                }
            } catch (Exception var45) {
                class559.method3221(class71.field898.method588((byte) 125, class549.field7669), (byte) -94);
                return;
            }
        }
        if (class222.field2897 != 10) {
            class559.method3221(class71.field899.method588((byte) 94, class549.field7669) + arg0, (byte) 98);
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)V")
    public static final void method1023(int arg0) {
        if (arg0 != 22104) {
            field2130 = null;
        }
        class180.method1139((byte) -95);
        field2126++;
        class615.method3442(class557.field7812.field6536.method3530(false) == 1, 22050, 2, 86);
        class220.field2882 = class139.method983(22050, class366.field5196, 0, (byte) -107, class202.field2644);
        class29.method168(true, (byte) -106, class509.method3011(null, (byte) 9));
        class503.field7209 = class139.method983(2048, class366.field5196, 1, (byte) 53, class202.field2644);
        class503.field7209.method2491(true, class192.field2560);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lwm;B)I")
    public static final int method1024(class564 arg0, byte arg1) {
        field2127++;
        if (arg0.field7959 == 0) {
            return 0;
        }
        int var2 = 121 / ((arg1 + 17) / 63);
        if (arg0.field8001 != -1) {
            class564 var3 = null;
            if (arg0.field8001 < 32768) {
                class740 var4 = (class740) class373.field5230.method1180((byte) 26, (long) arg0.field8001);
                if (var4 != null) {
                    var3 = var4.field10289;
                }
            } else if (arg0.field8001 >= 32768) {
                var3 = class309.field4311[arg0.field8001 - 32768];
            }
            if (var3 != null) {
                int var5 = arg0.field1264 - var3.field1264;
                int var6 = arg0.field1250 - var3.field1250;
                if (var5 != 0 || var6 != 0) {
                    arg0.method3242(8192, (int) (Math.atan2((double) var5, (double) var6) * 2607.5945876176133D) & 0x3FFF);
                }
            }
        }
        if ((arg0 instanceof class280)) {
            class280 var10 = (class280) arg0;
            if (var10.field3966 != -1 && (var10.field8014 == 0 || var10.field8012 > 0)) {
                var10.method3242(8192, var10.field3966);
                var10.field3966 = -1;
            }
        } else if (arg0 instanceof class468) {
            class468 var7 = (class468) arg0;
            if (var7.field6638 != -1 && (var7.field8014 == 0 || var7.field8012 > 0)) {
                int var8 = var7.field1264 - ((var7.field6638 - class228.field3063 - class228.field3063) * 256);
                int var9 = var7.field1250 - ((var7.field6636 - class3.field30 - class3.field30) * 256);
                if (var8 != 0 || var9 != 0) {
                    var7.method3242(8192, (int) (Math.atan2((double) var8, (double) var9) * 2607.5945876176133D) & 0x3FFF);
                }
                var7.field6638 = -1;
            }
        }
        return arg0.method3246((byte) 39);
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(I)V")
    public static void method1025(int arg0) {
        if (arg0 == 9) {
            field2135 = null;
            field2130 = null;
        }
    }
}
