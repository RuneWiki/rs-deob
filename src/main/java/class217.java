import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class217 {

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "I")
    public static int field3092 = 0;

    @OriginalMember(owner = "client!cu", name = "d", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!cu", name = "f", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!cu", name = "g", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!cu", name = "h", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "Lbba;")
    public class113 field3090;

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "Lcu;")
    public class217 field3091;

    @OriginalMember(owner = "client!cu", name = "e", descriptor = "[Laf;")
    public static class433[] field3094;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1509(int arg0) {
        field3093++;
        class42 var1 = null;
        try {
            var1 = class367.method2287(true, "2");
            class35 var2 = new class35(class544.field7679 * 6 + 3);
            var2.method263((byte) -104, 1);
            var2.method223(1493807496, class544.field7679);
            if (arg0 < 114) {
                field3092 = 74;
            }
            for (int var3 = 0; var3 < class41.field598.length; var3++) {
                if (class104.field1738[var3]) {
                    var2.method223(1493807496, var3);
                    var2.method233(class41.field598[var3], -23162);
                }
            }
            var1.method385(0, 1, var2.field483, var2.field469);
        } catch (Exception var5) {
        }
        try {
            if (var1 != null) {
                var1.method389(31);
            }
        } catch (Exception var4) {
        }
        class363.field5094 = class742.method4128(1);
        class291.field4082 = false;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Z)V", line = 53)
    public static void method1510(boolean arg0) {
        field3094 = null;
        if (arg0) {
            field3094 = null;
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(B)V", line = 67)
    public final void method1511(byte arg0) {
        field3097++;
        if (class125.field1915 >= 500) {
            return;
        }
        this.field3091 = class532.field7536;
        if (arg0 != -60) {
            this.field3090 = null;
        }
        this.field3090 = null;
        class125.field1915++;
        class532.field7536 = this;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(ZZILjava/lang/String;)V", line = 87)
    public static final void method1512(boolean arg0, boolean arg1, int arg2, String arg3) {
        field3095++;
        try {
            if (arg2 != -19797) {
                method1512(false, true, 51, null);
            }
            if (arg3.equalsIgnoreCase("commands") || arg3.equalsIgnoreCase("help")) {
                class569.method3326("commands - This command", (byte) -42);
                class569.method3326("cls - Clear console", (byte) -42);
                class569.method3326("displayfps - Toggle FPS and other information", (byte) -42);
                class569.method3326("renderer - Print graphics renderer information", (byte) -42);
                class569.method3326("heap - Print java memory information", (byte) -42);
                return;
            }
            if (arg3.equalsIgnoreCase("cls")) {
                class405.field5649 = 0;
                class58.field1077 = 0;
                return;
            }
            if (arg3.equalsIgnoreCase("displayfps")) {
                class143.field2194 = !class143.field2194;
                if (!class143.field2194) {
                    class569.method3326("FPS off", (byte) -42);
                    return;
                }
                class569.method3326("FPS on", (byte) -42);
                return;
            }
            if (arg3.equals("renderer")) {
                class732 var4 = class359.field5046.method599();
                class569.method3326("Vendor: " + var4.field10244, (byte) -42);
                class569.method3326("Name: " + var4.field10245, (byte) -42);
                class569.method3326("Version: " + var4.field10247, (byte) -42);
                class569.method3326("Device: " + var4.field10246, (byte) -42);
                class569.method3326("Driver Version: " + var4.field10242, (byte) -42);
                return;
            }
            if (arg3.equals("heap")) {
                class569.method3326("Heap: " + class438.field6123 + "MB", (byte) -42);
                return;
            }
        } catch (Exception var46) {
            class569.method3326(class281.field3942.method1839((byte) 45, class744.field10426), (byte) -42);
            return;
        }
        if (class231.field3294 != class118.field1857 || class79.field1485 >= 2) {
            if (arg3.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg3.equals("nativememerror")) {
                throw new OutOfMemoryError("native(MPR");
            }
            try {
                if (arg3.equalsIgnoreCase("printfps")) {
                    class569.method3326("FPS: " + class77.field1452, (byte) -42);
                    return;
                }
                if (arg3.equalsIgnoreCase("occlude")) {
                    class186.field2665 = !class186.field2665;
                    if (class186.field2665) {
                        class569.method3326("Occlsion now on!", (byte) -42);
                        return;
                    }
                    class569.method3326("Occlsion now off!", (byte) -42);
                    return;
                }
                if (arg3.equalsIgnoreCase("fpson")) {
                    class143.field2194 = true;
                    class569.method3326("fps debug enabled", (byte) -42);
                    return;
                }
                if (arg3.equalsIgnoreCase("fpsoff")) {
                    class143.field2194 = false;
                    class569.method3326("fps debug disabled", (byte) -42);
                    return;
                }
                if (arg3.equals("systemmem")) {
                    try {
                        class569.method3326("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb", (byte) -42);
                        return;
                    } catch (Throwable var40) {
                        return;
                    }
                }
                if (arg3.equalsIgnoreCase("cleartext")) {
                    class99.field1678.method4160((byte) -77);
                    class569.method3326("Text coords cleared", (byte) -42);
                    return;
                }
                if (arg3.equalsIgnoreCase("gc")) {
                    class656.method3698(false);
                    for (int var5 = 0; var5 < 10; var5++) {
                        System.gc();
                    }
                    Runtime var6 = Runtime.getRuntime();
                    int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                    class569.method3326("mem=" + var7 + "k", (byte) -42);
                    return;
                }
                if (arg3.equalsIgnoreCase("compact")) {
                    class656.method3698(false);
                    for (int var8 = 0; var8 < 10; var8++) {
                        System.gc();
                    }
                    Runtime var9 = Runtime.getRuntime();
                    int var10 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                    class569.method3326("Memory before cleanup=" + var10 + "k", (byte) -42);
                    class123.method976(false);
                    class656.method3698(false);
                    for (int var11 = 0; var11 < 10; var11++) {
                        System.gc();
                    }
                    int var12 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                    class569.method3326("Memory after cleanup=" + var12 + "k", (byte) -42);
                    return;
                }
                if (arg3.equalsIgnoreCase("unloadnatives")) {
                    class569.method3326(class52.method478(5308) ? "Libraries unloaded" : "Library unloading failed!", (byte) -42);
                    return;
                }
                if (arg3.equalsIgnoreCase("clientdrop")) {
                    class569.method3326("Dropped client connection", (byte) -42);
                    if (class611.field8839 == 10) {
                        class62.method672(64);
                        return;
                    }
                    if (class611.field8839 == 11) {
                        class420.field5904 = true;
                    }
                    return;
                }
                if (arg3.equalsIgnoreCase("rotateconnectmethods")) {
                    class67.field1223.method3401(arg2 + 19675);
                    class569.method3326("Rotated connection methods", (byte) -42);
                    return;
                }
                if (arg3.equalsIgnoreCase("clientjs5drop")) {
                    class612.field8856.method3358((byte) 86);
                    class569.method3326("Dropped client js5 net queue", (byte) -42);
                    return;
                }
                if (arg3.equalsIgnoreCase("serverjs5drop")) {
                    class612.field8856.method3355(24543);
                    class569.method3326("Dropped server js5 net queue", (byte) -42);
                    return;
                }
                if (arg3.equalsIgnoreCase("breakcon")) {
                    class341.field4796.method2283(83);
                    class555.field7776.method65(true);
                    class612.field8856.method3360(7);
                    class569.method3326("Breaking new connections for 5 seconds", (byte) -42);
                    return;
                }
                if (arg3.equalsIgnoreCase("rebuild")) {
                    class314.method2030(41);
                    class615.method3536((byte) 76);
                    class569.method3326("Rebuilding map", (byte) -42);
                    return;
                }
                if (arg3.equalsIgnoreCase("rebuildprofile")) {
                    class625.field8977 = class742.method4128(1);
                    class386.field5411 = true;
                    class314.method2030(arg2 + 19918);
                    class615.method3536((byte) 93);
                    class569.method3326("Rebuilding map (with profiling)", (byte) -42);
                    return;
                }
                if (arg3.equalsIgnoreCase("wm1")) {
                    class492.method2959(1, false, -1, -1, (byte) 120);
                    if (class190.method1336((byte) -106) == 1) {
                        class569.method3326("wm1 succeeded", (byte) -42);
                        return;
                    }
                    class569.method3326("wm1 failed", (byte) -42);
                    return;
                }
                if (arg3.equalsIgnoreCase("wm2")) {
                    class492.method2959(2, false, -1, -1, (byte) 79);
                    if (class190.method1336((byte) -106) == 2) {
                        class569.method3326("wm2 succeeded", (byte) -42);
                        return;
                    }
                    class569.method3326("wm2 failed", (byte) -42);
                    return;
                }
                if (arg3.equalsIgnoreCase("wm3")) {
                    class492.method2959(3, false, 768, 1024, (byte) 94);
                    if (class190.method1336((byte) -106) == 3) {
                        class569.method3326("wm3 succeeded", (byte) -42);
                        return;
                    }
                    class569.method3326("wm3 failed", (byte) -42);
                    return;
                }
                if (arg3.equalsIgnoreCase("tk0")) {
                    class54.method490((byte) 117, false, 0);
                    if (class471.field6781.field6684.method1843(27669) == 0) {
                        class569.method3326("Entered tk0", (byte) -42);
                        class471.field6781.method2826(0, (byte) 79, class471.field6781.field6695);
                        class129.method994((byte) 42);
                        class671.field9412 = false;
                        return;
                    }
                    class569.method3326("Failed to enter tk0", (byte) -42);
                    return;
                }
                if (arg3.equalsIgnoreCase("tk1")) {
                    class54.method490((byte) -125, false, 1);
                    if (class471.field6781.field6684.method1843(arg2 + 47466) == 1) {
                        class569.method3326("Entered tk1", (byte) -42);
                        class471.field6781.method2826(1, (byte) 127, class471.field6781.field6695);
                        class129.method994((byte) 97);
                        class671.field9412 = false;
                        return;
                    }
                    class569.method3326("Failed to enter tk1", (byte) -42);
                    return;
                }
                if (arg3.equalsIgnoreCase("tk2")) {
                    class54.method490((byte) 117, false, 2);
                    if (class471.field6781.field6684.method1843(arg2 + 47466) == 2) {
                        class569.method3326("Entered tk2", (byte) -42);
                        class471.field6781.method2826(2, (byte) 126, class471.field6781.field6695);
                        class129.method994((byte) 72);
                        class671.field9412 = false;
                        return;
                    }
                    class569.method3326("Failed to enter tk2", (byte) -42);
                    return;
                }
                if (arg3.equalsIgnoreCase("tk3")) {
                    class54.method490((byte) 117, false, 3);
                    if (class471.field6781.field6684.method1843(27669) == 3) {
                        class569.method3326("Entered tk3", (byte) -42);
                        class471.field6781.method2826(3, (byte) 125, class471.field6781.field6695);
                        class129.method994((byte) 106);
                        class671.field9412 = false;
                        return;
                    }
                    class569.method3326("Failed to enter tk3", (byte) -42);
                    return;
                }
                if (arg3.equalsIgnoreCase("tk5")) {
                    class54.method490((byte) 109, false, 5);
                    if (class471.field6781.field6684.method1843(27669) != 5) {
                        class569.method3326("Failed to enter tk5", (byte) -42);
                        return;
                    }
                    class569.method3326("Entered tk5", (byte) -42);
                    class471.field6781.method2826(5, (byte) 112, class471.field6781.field6695);
                    class129.method994((byte) 124);
                    class671.field9412 = false;
                    return;
                }
                if (arg3.startsWith("setba")) {
                    if (arg3.length() < 6) {
                        class569.method3326("Invalid buildarea value", (byte) -42);
                        return;
                    }
                    int var13 = class547.method3226((byte) 101, arg3.substring(6));
                    if (var13 >= 0 && class749.method4167((byte) 103, class438.field6123) >= var13) {
                        class471.field6781.method2826(var13, (byte) 127, class471.field6781.field6677);
                        class129.method994((byte) 112);
                        class671.field9412 = false;
                        class569.method3326("maxbuildarea=" + class471.field6781.field6677.method2540(27669), (byte) -42);
                        return;
                    }
                    class569.method3326("Invalid buildarea value", (byte) -42);
                    return;
                }
                if (arg3.startsWith("rect_debug")) {
                    if (arg3.length() < 10) {
                        class569.method3326("Invalid rect_debug value", (byte) -42);
                        return;
                    }
                    class478.field6822 = class547.method3226((byte) 112, arg3.substring(10).trim());
                    class569.method3326("rect_debug=" + class478.field6822, (byte) -42);
                    return;
                }
                if (arg3.equalsIgnoreCase("qa_op_test")) {
                    class588.field8274 = true;
                    class569.method3326("qa_op_test=" + class588.field8274, (byte) -42);
                    return;
                }
                if (arg3.equalsIgnoreCase("clipcomponents")) {
                    class445.field6183 = !class445.field6183;
                    class569.method3326("clipcomponents=" + class445.field6183, (byte) -42);
                    return;
                }
                if (arg3.startsWith("bloom")) {
                    boolean var14 = class359.field5046.method562();
                    if (!class338.method2150(arg2 + 19798, !var14)) {
                        class569.method3326("Failed to enable bloom", (byte) -42);
                        return;
                    }
                    if (!var14) {
                        class569.method3326("Bloom enabled", (byte) -42);
                        return;
                    }
                    class569.method3326("Bloom disabled", (byte) -42);
                    return;
                }
                if (arg3.equalsIgnoreCase("tween")) {
                    if (class712.field9957) {
                        class712.field9957 = false;
                        class569.method3326("Forced tweening disabled.", (byte) -42);
                        return;
                    }
                    class712.field9957 = true;
                    class569.method3326("Forced tweening ENABLED!", (byte) -42);
                    return;
                }
                if (arg3.equalsIgnoreCase("shiftclick")) {
                    if (class630.field9043) {
                        class569.method3326("Shift-click disabled.", (byte) -42);
                        class630.field9043 = false;
                        return;
                    }
                    class569.method3326("Shift-click ENABLED!", (byte) -42);
                    class630.field9043 = true;
                    return;
                }
                if (arg3.equalsIgnoreCase("getcgcoord")) {
                    class569.method3326("x:" + (class468.field6748.field644 >> 9) + " z:" + (class468.field6748.field648 >> 9), (byte) -42);
                    return;
                }
                if (arg3.equalsIgnoreCase("getheight")) {
                    class569.method3326("Height: " + class138.field2153[class468.field6748.field649].method1825(class468.field6748.field648 >> 9, -128, class468.field6748.field644 >> 9), (byte) -42);
                    return;
                }
                if (arg3.equalsIgnoreCase("resetminimap")) {
                    class501.field7161.method1456(false);
                    class501.field7161.method1464((byte) 87);
                    class93.field1631.method791((byte) -97);
                    class399.field5581.method2645(2080593256);
                    class615.method3536((byte) 46);
                    class569.method3326("Minimap reset", (byte) -42);
                    return;
                }
                if (arg3.startsWith("mc")) {
                    if (class359.field5046.method579()) {
                        int var15 = Integer.parseInt(arg3.substring(3));
                        if (var15 < 1) {
                            var15 = 1;
                        } else if (var15 > 4) {
                            var15 = 4;
                        }
                        class93.field1630 = var15;
                        class314.method2030(arg2 ^ 0xFFFFB2A4);
                        class569.method3326("Render cores now: " + class93.field1630, (byte) -42);
                        return;
                    }
                    class569.method3326("Current toolkit doesn't support multiple cores", (byte) -42);
                    return;
                }
                if (arg3.startsWith("cachespace")) {
                    class569.method3326("I(s): " + class166.field2454.method3041(false) + "/" + class166.field2454.method3043(87), (byte) -42);
                    class569.method3326("I(m): " + class467.field6734.method3041(false) + "/" + class467.field6734.method3043(arg2 ^ 0xFFFFB2F5), (byte) -42);
                    class569.method3326("O(s): " + class558.field7942.field1269.method1404((byte) -1) + "/" + class558.field7942.field1269.method1405(-18964), (byte) -42);
                    return;
                }
                if (arg3.equalsIgnoreCase("getcamerapos")) {
                    class569.method3326("Pos: " + class468.field6748.field649 + "," + ((class685.field9660 >> 9) + class115.field1845 >> 6) + "," + ((class260.field3810 >> 9) + class64.field1160 >> 6) + "," + ((class685.field9660 >> 9) + class115.field1845 & 0x3F) + "," + ((class260.field3810 >> 9) + class64.field1160 & 0x3F) + " Height: " + (class534.method3136(1, class468.field6748.field649, class685.field9660, class260.field3810) - class136.field2118), (byte) -42);
                    class569.method3326("Look: " + class468.field6748.field649 + "," + (class348.field4891 + class115.field1845 >> 6) + "," + (class668.field9370 + class64.field1160 >> 6) + "," + (class348.field4891 + class115.field1845 & 0x3F) + "," + (class668.field9370 + class64.field1160 & 0x3F) + " Height: " + (class534.method3136(1, class468.field6748.field649, class348.field4891, class668.field9370) - class78.field1464), (byte) -42);
                    return;
                }
                if (arg3.equals("renderprofile") || arg3.equals("rp")) {
                    class646.field9151 = !class646.field9151;
                    class359.field5046.method564(class646.field9151);
                    class230.method1581(true);
                    class569.method3326("showprofiling=" + class646.field9151, (byte) -42);
                    return;
                }
                if (arg3.startsWith("performancetest")) {
                    int var16 = -1;
                    int var17 = 1000;
                    if (arg3.length() > 15) {
                        String[] var18 = class327.method2091(' ', 26911, arg3);
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
                        class569.method3326("Java toolkit: " + class242.method1625((byte) -89, 0, var17), (byte) -42);
                        class569.method3326("SSE toolkit:  " + class242.method1625((byte) 99, 2, var17), (byte) -42);
                        class569.method3326("D3D toolkit:  " + class242.method1625((byte) 103, 3, var17), (byte) -42);
                        class569.method3326("GL toolkit:   " + class242.method1625((byte) 110, 1, var17), (byte) -42);
                        class569.method3326("GLX toolkit:  " + class242.method1625((byte) -78, 5, var17), (byte) -42);
                        return;
                    }
                    class569.method3326("Performance: " + class242.method1625((byte) -60, class471.field6781.field6684.method1843(27669), var17), (byte) -42);
                    return;
                }
                if (arg3.equals("nonpcs")) {
                    class117.field1848 = !class117.field1848;
                    class569.method3326("nonpcs=" + class117.field1848, (byte) -42);
                    return;
                }
                if (arg3.equals("autoworld")) {
                    class401.method2479(-303881189);
                    class569.method3326("auto world selected", (byte) -42);
                    return;
                }
                if (arg3.startsWith("switchworld")) {
                    int var19 = Integer.parseInt(arg3.substring(12));
                    class578.method3347(class66.method696(var19, (byte) -117).field6839, arg2 ^ 0xFFFFB2B9, var19);
                    class569.method3326("switched", (byte) -42);
                    return;
                }
                if (arg3.equals("getworld")) {
                    class569.method3326("w: " + class67.field1223.field8324, (byte) -42);
                    return;
                }
                if (arg3.startsWith("pc")) {
                    class135 var20 = class273.method1801(class459.field6629, class203.field2892, 2);
                    var20.field2109.method263((byte) -92, 0);
                    int var21 = var20.field2109.field469;
                    int var22 = arg3.indexOf(" ", 4);
                    var20.field2109.method287((byte) 0, arg3.substring(3, var22));
                    class687.method3863(arg2 ^ 0xFFFFB2AB, arg3.substring(var22), var20.field2109);
                    var20.field2109.method230(105, var20.field2109.field469 - var21);
                    class539.method3178(var20, arg2 + 872);
                    return;
                }
                if (arg3.equals("savevarcs")) {
                    method1509(124);
                    class569.method3326("perm varcs saved", (byte) -42);
                    return;
                }
                if (arg3.equals("scramblevarcs")) {
                    for (int var23 = 0; var23 < class41.field598.length; var23++) {
                        if (class104.field1738[var23]) {
                            class41.field598[var23] = (int) (Math.random() * 99999.0D);
                            if (Math.random() > 0.5D) {
                                class41.field598[var23] *= -1;
                            }
                        }
                    }
                    method1509(127);
                    class569.method3326("perm varcs scrambled", (byte) -42);
                    return;
                }
                if (arg3.equals("showcolmap")) {
                    class671.field9408 = true;
                    class615.method3536((byte) 82);
                    class569.method3326("colmap is shown", (byte) -42);
                    return;
                }
                if (arg3.equals("hidecolmap")) {
                    class671.field9408 = false;
                    class615.method3536((byte) 41);
                    class569.method3326("colmap is hidden", (byte) -42);
                    return;
                }
                if (arg3.equals("resetcache")) {
                    class114.method941(0);
                    class569.method3326("Caches reset", (byte) -42);
                    return;
                }
                if (arg3.equals("profilecpu")) {
                    class569.method3326(class591.method3391(arg2 ^ 0xFFFFB2CF) + "ms", (byte) -42);
                    return;
                }
                if (arg3.startsWith("getclientvarpbit")) {
                    int var24 = Integer.parseInt(arg3.substring(17));
                    class569.method3326("varpbit=" + class742.field10408.method3176((byte) 101, var24), (byte) -42);
                    return;
                }
                if (arg3.startsWith("getclientvarp")) {
                    int var25 = Integer.parseInt(arg3.substring(14));
                    class569.method3326("varp=" + class742.field10408.method3174(var25, 70), (byte) -42);
                    return;
                }
                if (arg3.startsWith("directlogin")) {
                    String[] var26 = class327.method2091(' ', 26911, arg3.substring(12));
                    if (var26.length >= 2) {
                        int var27 = var26.length <= 2 ? 0 : Integer.parseInt(var26[2]);
                        class396.method2457(var27, false, var26[1], var26[0]);
                        return;
                    }
                }
                if (arg3.startsWith("csprofileclear")) {
                    class357.method2230();
                    return;
                }
                if (arg3.startsWith("csprofileoutputc")) {
                    class357.method2234(100, false);
                    return;
                }
                if (arg3.startsWith("csprofileoutputt")) {
                    class357.method2234(10, true);
                    return;
                }
                if (arg3.startsWith("texsize")) {
                    int var28 = Integer.parseInt(arg3.substring(8));
                    class359.field5046.method559(var28);
                    return;
                }
                if (arg3.equals("soundstreamcount")) {
                    class569.method3326("Active streams: " + class484.field6848.method4050(), (byte) -42);
                    return;
                }
                if (arg3.equals("autosetup")) {
                    class683.method3850(arg2 + 19846);
                    class569.method3326("Complete. Toolkit now: " + class471.field6781.field6684.method1843(27669), (byte) -42);
                    return;
                }
                if (arg3.equals("errormessage")) {
                    class569.method3326(class345.field4858.method1939(-112), (byte) -42);
                    return;
                }
                if (arg3.equals("heapdump")) {
                    if (class367.field5136.startsWith("win")) {
                        class575.method3336((byte) -92, new File("C:\\Temp\\heap.dump"), false);
                    } else {
                        class575.method3336((byte) -118, new File("/tmp/heap.dump"), false);
                    }
                    class569.method3326("Done", (byte) -42);
                    return;
                }
                if (arg3.equals("os")) {
                    class569.method3326("Name: " + class367.field5136, (byte) -42);
                    class569.method3326("Arch: " + class367.field5114, (byte) -42);
                    class569.method3326("Ver: " + class367.field5126, (byte) -42);
                    return;
                }
                if (arg3.startsWith("w2debug")) {
                    int var29 = Integer.parseInt(arg3.substring(8, 9));
                    class586.field8250 = var29;
                    class314.method2030(arg2 ^ 0xFFFFB297);
                    class569.method3326("Toggled!", (byte) -42);
                    return;
                }
                if (arg3.startsWith("ortho ")) {
                    int var30 = arg3.indexOf(32);
                    if (var30 < 0) {
                        class569.method3326("Syntax: ortho <n>", (byte) -42);
                        return;
                    }
                    int var31 = class547.method3226((byte) 76, arg3.substring(var30 + 1));
                    class471.field6781.method2826(var31, (byte) 82, class471.field6781.field6708);
                    class129.method994((byte) 79);
                    class671.field9412 = false;
                    class633.method3638(true);
                    if (var31 == class471.field6781.field6708.method3692(27669)) {
                        class569.method3326("Successfully changed ortho mode", (byte) -42);
                        return;
                    }
                    class569.method3326("Failed to change ortho mode", (byte) -42);
                    return;
                }
                if (arg3.startsWith("orthozoom ")) {
                    if (class471.field6781.field6708.method3692(27669) == 0) {
                        class569.method3326("enable ortho mode first (use 'ortho <n>')", (byte) -42);
                        return;
                    }
                    int var32 = class547.method3226((byte) 28, arg3.substring(arg3.indexOf(32) + 1));
                    class220.field3141 = var32;
                    class569.method3326("orthozoom=" + class220.field3141, (byte) -42);
                    return;
                }
                if (arg3.startsWith("orthotilesize ")) {
                    int var33 = class547.method3226((byte) 21, arg3.substring(arg3.indexOf(32) + 1));
                    class626.field8992 = var33;
                    class254.field3689 = var33;
                    class569.method3326("ortho tile size=" + var33, (byte) -42);
                    class633.method3638(true);
                    return;
                }
                if (arg3.equals("orthocamlock")) {
                    class154.field2324 = !class154.field2324;
                    class569.method3326("ortho camera lock is " + (class154.field2324 ? "on" : "off"), (byte) -42);
                    return;
                }
                if (arg3.startsWith("setoutput ")) {
                    File var34 = new File(arg3.substring(10));
                    if (var34.exists()) {
                        var34 = new File(arg3.substring(10) + "." + class742.method4128(arg2 + 19798) + ".log");
                        if (var34.exists()) {
                            class569.method3326("file already exists!", (byte) -42);
                            return;
                        }
                    }
                    if (class555.field7767 != null) {
                        class555.field7767.close();
                        class555.field7767 = null;
                    }
                    try {
                        class555.field7767 = new FileOutputStream(var34);
                        return;
                    } catch (FileNotFoundException var43) {
                        class569.method3326("Could not create " + var34.getName(), (byte) -42);
                        return;
                    } catch (SecurityException var44) {
                        class569.method3326("Cannot write to " + var34.getName(), (byte) -42);
                        return;
                    }
                }
                if (arg3.equals("closeoutput")) {
                    if (class555.field7767 != null) {
                        class555.field7767.close();
                    }
                    class555.field7767 = null;
                    return;
                }
                if (arg3.startsWith("runscript ")) {
                    File var35 = new File(arg3.substring(10));
                    if (!var35.exists()) {
                        class569.method3326("No such file", (byte) -42);
                        return;
                    }
                    byte[] var36 = class190.method1334(false, var35);
                    if (var36 == null) {
                        class569.method3326("Failed to read file", (byte) -42);
                        return;
                    }
                    String[] var37 = class327.method2091('\n', 26911, class255.method1737("", class393.method2445(var36, -37), 0, '\r'));
                    class579.method3348(var37, 7281);
                }
                if (arg3.startsWith("zoom ")) {
                    short var38 = (short) class547.method3226((byte) 122, arg3.substring(5));
                    if (var38 > 0) {
                        class475.field6800 = var38;
                    }
                    return;
                }
                if (class611.field8839 == 10) {
                    class34.field442++;
                    class135 var39 = class273.method1801(class459.field6629, class539.field7587, 2);
                    var39.field2109.method263((byte) -106, arg3.length() + 3);
                    var39.field2109.method263((byte) -71, arg1 ? 1 : 0);
                    var39.field2109.method263((byte) 102, arg0 ? 1 : 0);
                    var39.field2109.method287((byte) 0, arg3);
                    class539.method3178(var39, -18925);
                }
                if (arg3.startsWith("fps ") && class231.field3294 != class118.field1857) {
                    class181.method1300(class547.method3226((byte) 35, arg3.substring(4)), arg2 + 36181);
                    return;
                }
            } catch (Exception var45) {
                class569.method3326(class281.field3942.method1839((byte) 45, class744.field10426), (byte) -42);
                return;
            }
        }
        if (class611.field8839 != 10) {
            class569.method3326(class281.field3944.method1839((byte) 45, class744.field10426) + arg3, (byte) -42);
        }
    }

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(I)V", line = 1077)
    public static final void method1513(int arg0) {
        field3096++;
        class84.field1530++;
        class135 var1 = class273.method1801(class459.field6629, class744.field10422, 2);
        var1.field2109.method263((byte) -115, arg0);
        class539.method3178(var1, arg0 ^ 0xFFFFB613);
    }
}
