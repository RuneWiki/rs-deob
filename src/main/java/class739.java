import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mga")
public class class739 {

    @OriginalMember(owner = "client!mga", name = "b", descriptor = "I")
    private int field10202;

    @OriginalMember(owner = "client!mga", name = "h", descriptor = "I")
    public int field10208;

    @OriginalMember(owner = "client!mga", name = "e", descriptor = "Z")
    public static boolean field10205 = false;

    @OriginalMember(owner = "client!mga", name = "c", descriptor = "Lib;")
    public static class164 field10203 = new class164("WTRC", "office", "_rc", 1);

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "I")
    public static int field10201;

    @OriginalMember(owner = "client!mga", name = "d", descriptor = "I")
    public static int field10204;

    @OriginalMember(owner = "client!mga", name = "f", descriptor = "I")
    public static int field10206;

    @OriginalMember(owner = "client!mga", name = "g", descriptor = "I")
    public static int field10207;

    @OriginalMember(owner = "client!mga", name = "i", descriptor = "I")
    public static int field10209;

    @OriginalMember(owner = "client!mga", name = "j", descriptor = "I")
    public static int field10210;

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(Ljava/util/Random;II)I")
    public static final int method4090(Random arg0, int arg1, int arg2) {
        int var3 = -51 / ((arg1 + 60) / 47);
        field10209++;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class117.method957(-6602, arg2)) {
            return (int) ((long) arg2 * ((long) arg0.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var4 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg2));
            int var5;
            do {
                var5 = arg0.nextInt();
            } while (var5 >= var4);
            return class402.method2505(arg2, var5, -126);
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(CBI)C")
    public static final char method4091(char arg0, byte arg1, int arg2) {
        field10210++;
        if (arg0 >= 'À' && arg0 <= 'ÿ') {
            if (arg0 >= 'À' && arg0 <= 'Æ') {
                return 'A';
            }
            if (arg0 == 'Ç') {
                return 'C';
            }
            if (arg0 >= 'È' && arg0 <= 'Ë') {
                return 'E';
            }
            if (arg0 >= 'Ì' && arg0 <= 'Ï') {
                return 'I';
            }
            if (arg0 >= 'Ò' && arg0 <= 'Ö') {
                return 'O';
            }
            if (arg0 >= 'Ù' && arg0 <= 'Ü') {
                return 'U';
            }
            if (arg0 == 'Ý') {
                return 'Y';
            }
            if (arg0 == 'ß') {
                return 's';
            }
            if (arg0 >= 'à' && arg0 <= 'æ') {
                return 'a';
            }
            if (arg0 == 'ç') {
                return 'c';
            }
            if (arg0 >= 'è' && arg0 <= 'ë') {
                return 'e';
            }
            if (arg0 >= 'ì' && arg0 <= 'ï') {
                return 'i';
            }
            if (arg0 >= 'ò' && arg0 <= 'ö') {
                return 'o';
            }
            if (arg0 >= 'ù' && arg0 <= 'ü') {
                return 'u';
            }
            if (arg0 == 'ý' || arg0 == 'ÿ') {
                return 'y';
            }
        }
        if (arg1 >= -112) {
            method4093(null, false, true, 126);
        }
        if (arg0 == 'Œ') {
            return 'O';
        } else if (arg0 == 'œ') {
            return 'o';
        } else if (arg0 == 'Ÿ') {
            return 'Y';
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(B)I")
    public final int method4092(byte arg0) {
        field10201++;
        if (arg0 > -49) {
            field10205 = false;
        }
        return this.field10202;
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(Ljava/lang/String;ZZI)V")
    public static final void method4093(String arg0, boolean arg1, boolean arg2, int arg3) {
        field10204++;
        try {
            label689: {
                if (!arg0.equalsIgnoreCase("commands") && !arg0.equalsIgnoreCase("help")) {
                    if (arg0.equalsIgnoreCase("cls")) {
                        class332.field4784 = 0;
                        class700.field9809 = 0;
                        return;
                    }
                    if (!arg0.equalsIgnoreCase("displayfps")) {
                        if (arg0.equals("renderer")) {
                            class45 var4 = class379.field5542.method558();
                            class164.method1188((byte) -119, "Vendor: " + var4.field677);
                            class164.method1188((byte) -124, "Name: " + var4.field680);
                            class164.method1188((byte) -117, "Version: " + var4.field678);
                            class164.method1188((byte) -124, "Device: " + var4.field682);
                            class164.method1188((byte) -110, "Driver Version: " + var4.field683);
                            return;
                        }
                        if (arg3 != -1) {
                            return;
                        }
                        if (arg0.equals("heap")) {
                            class164.method1188((byte) -128, "Heap: " + class396.field5817 + "MB");
                            return;
                        }
                        break label689;
                    }
                    class605.field8216 = !class605.field8216;
                    if (!class605.field8216) {
                        class164.method1188((byte) -111, "FPS off");
                        return;
                    }
                    class164.method1188((byte) -124, "FPS on");
                    return;
                }
                class164.method1188((byte) -103, "commands - This command");
                class164.method1188((byte) -113, "cls - Clear console");
                class164.method1188((byte) -121, "displayfps - Toggle FPS and other information");
                class164.method1188((byte) -113, "renderer - Print graphics renderer information");
                class164.method1188((byte) -107, "heap - Print java memory information");
                return;
            }
        } catch (Exception var49) {
            class164.method1188((byte) -105, class474.field6538.method2780(126, class38.field589));
            return;
        }
        if (class731.field10141 != class197.field2634 || class712.field9963 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equals("nativememerror")) {
                throw new OutOfMemoryError("native(MPR");
            }
            try {
                if (arg0.equalsIgnoreCase("printfps")) {
                    class164.method1188((byte) -108, "FPS: " + class549.field7446);
                    return;
                }
                if (arg0.equalsIgnoreCase("occlude")) {
                    class522.field7164 = !class522.field7164;
                    if (!class522.field7164) {
                        class164.method1188((byte) -105, "Occlsion now off!");
                        return;
                    }
                    class164.method1188((byte) -115, "Occlsion now on!");
                    return;
                }
                if (arg0.equalsIgnoreCase("fpson")) {
                    class605.field8216 = true;
                    class164.method1188((byte) -110, "fps debug enabled");
                    return;
                }
                if (arg0.equalsIgnoreCase("fpsoff")) {
                    class605.field8216 = false;
                    class164.method1188((byte) -104, "fps debug disabled");
                    return;
                }
                if (arg0.equals("systemmem")) {
                    try {
                        class164.method1188((byte) -114, "System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + class693.field9717.field550 + "Mb");
                        return;
                    } catch (Throwable var43) {
                        return;
                    }
                }
                if (arg0.equalsIgnoreCase("cleartext")) {
                    class237.field3201.method113(0);
                    class164.method1188((byte) -117, "Text coords cleared");
                    return;
                }
                if (arg0.equalsIgnoreCase("gc")) {
                    class166.method1197(false);
                    for (int var5 = 0; var5 < 10; var5++) {
                        System.gc();
                    }
                    Runtime var6 = Runtime.getRuntime();
                    int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                    class164.method1188((byte) -113, "mem=" + var7 + "k");
                    return;
                }
                if (arg0.equalsIgnoreCase("compact")) {
                    class166.method1197(false);
                    for (int var8 = 0; var8 < 10; var8++) {
                        System.gc();
                    }
                    Runtime var9 = Runtime.getRuntime();
                    int var10 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                    class164.method1188((byte) -122, "Memory before cleanup=" + var10 + "k");
                    class658.method3647(arg3 ^ 0x76);
                    class166.method1197(false);
                    for (int var11 = 0; var11 < 10; var11++) {
                        System.gc();
                    }
                    int var12 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                    class164.method1188((byte) -125, "Memory after cleanup=" + var12 + "k");
                    return;
                }
                if (arg0.equalsIgnoreCase("unloadnatives")) {
                    class164.method1188((byte) -113, class54.method394((byte) -28) ? "Libraries unloaded" : "Library unloading failed!");
                    return;
                }
                if (arg0.equalsIgnoreCase("clientdrop")) {
                    class164.method1188((byte) -113, "Dropped client connection");
                    if (class458.field6355 == 10) {
                        class299.method1894((byte) -54);
                        return;
                    }
                    if (class458.field6355 == 11) {
                        class539.field7334 = true;
                    }
                    return;
                }
                if (arg0.equalsIgnoreCase("rotateconnectmethods")) {
                    class369.field5359.method680(43594);
                    class164.method1188((byte) -119, "Rotated connection methods");
                    return;
                }
                if (arg0.equalsIgnoreCase("clientjs5drop")) {
                    class647.field8984.method3271((byte) 112);
                    class164.method1188((byte) -121, "Dropped client js5 net queue");
                    return;
                }
                if (arg0.equalsIgnoreCase("serverjs5drop")) {
                    class647.field8984.method3269(~arg3);
                    class164.method1188((byte) -115, "Dropped server js5 net queue");
                    return;
                }
                if (arg0.equalsIgnoreCase("breakcon")) {
                    class730.field10124.method621((byte) -128);
                    class457.field6340.method3029(-119);
                    class647.field8984.method3263(-96);
                    class164.method1188((byte) -127, "Breaking new connections for 5 seconds");
                    return;
                }
                if (arg0.equalsIgnoreCase("rebuild")) {
                    class627.method3531(-79);
                    class322.method2039(-101);
                    class164.method1188((byte) -115, "Rebuilding map");
                    return;
                }
                if (arg0.equalsIgnoreCase("rebuildprofile")) {
                    class499.field6884 = class302.method1910(0);
                    class650.field9017 = true;
                    class627.method3531(-73);
                    class322.method2039(-72);
                    class164.method1188((byte) -114, "Rebuilding map (with profiling)");
                    return;
                }
                if (arg0.equalsIgnoreCase("wm1")) {
                    class142.method1090(-1, -352753888, 1, -1, false);
                    if (class485.method2816(-124) != 1) {
                        class164.method1188((byte) -114, "wm1 failed");
                        return;
                    }
                    class164.method1188((byte) -107, "wm1 succeeded");
                    return;
                }
                if (arg0.equalsIgnoreCase("wm2")) {
                    class142.method1090(-1, -352753888, 2, -1, false);
                    if (class485.method2816(arg3 ^ 0x46) == 2) {
                        class164.method1188((byte) -117, "wm2 succeeded");
                        return;
                    }
                    class164.method1188((byte) -109, "wm2 failed");
                    return;
                }
                if (arg0.equalsIgnoreCase("wm3")) {
                    class142.method1090(1024, -352753888, 3, 768, false);
                    if (class485.method2816(73) == 3) {
                        class164.method1188((byte) -106, "wm3 succeeded");
                        return;
                    }
                    class164.method1188((byte) -103, "wm3 failed");
                    return;
                }
                if (arg0.equalsIgnoreCase("tk0")) {
                    class793.method4365((byte) -41, false, 0);
                    if (class712.field9959.field1270.method4293(125) == 0) {
                        class164.method1188((byte) -125, "Entered tk0");
                        class712.field9959.method735(0, class712.field9959.field1299, 88);
                        class617.method3389(false);
                        class747.field10301 = false;
                        return;
                    }
                    class164.method1188((byte) -113, "Failed to enter tk0");
                    return;
                }
                if (arg0.equalsIgnoreCase("tk1")) {
                    class793.method4365((byte) -41, false, 1);
                    if (class712.field9959.field1270.method4293(96) != 1) {
                        class164.method1188((byte) -127, "Failed to enter tk1");
                        return;
                    }
                    class164.method1188((byte) -109, "Entered tk1");
                    class712.field9959.method735(1, class712.field9959.field1299, arg3 ^ 0xFFFFFFAD);
                    class617.method3389(false);
                    class747.field10301 = false;
                    return;
                }
                if (arg0.equalsIgnoreCase("tk2")) {
                    class793.method4365((byte) -41, false, 2);
                    if (class712.field9959.field1270.method4293(32) != 2) {
                        class164.method1188((byte) -125, "Failed to enter tk2");
                        return;
                    }
                    class164.method1188((byte) -121, "Entered tk2");
                    class712.field9959.method735(2, class712.field9959.field1299, 97);
                    class617.method3389(false);
                    class747.field10301 = false;
                    return;
                }
                if (arg0.equalsIgnoreCase("tk3")) {
                    class793.method4365((byte) -41, false, 3);
                    if (class712.field9959.field1270.method4293(44) != 3) {
                        class164.method1188((byte) -108, "Failed to enter tk3");
                        return;
                    }
                    class164.method1188((byte) -127, "Entered tk3");
                    class712.field9959.method735(3, class712.field9959.field1299, 102);
                    class617.method3389(false);
                    class747.field10301 = false;
                    return;
                }
                if (arg0.equalsIgnoreCase("tk5")) {
                    class793.method4365((byte) -41, false, 5);
                    if (class712.field9959.field1270.method4293(78) != 5) {
                        class164.method1188((byte) -118, "Failed to enter tk5");
                        return;
                    }
                    class164.method1188((byte) -124, "Entered tk5");
                    class712.field9959.method735(5, class712.field9959.field1299, arg3 + 94);
                    class617.method3389(false);
                    class747.field10301 = false;
                    return;
                }
                if (arg0.startsWith("setba")) {
                    if (arg0.length() < 6) {
                        class164.method1188((byte) -127, "Invalid buildarea value");
                        return;
                    }
                    int var13 = class334.method2123(1, arg0.substring(6));
                    if (var13 >= 0 && class381.method2430(arg3 ^ 0xFFFFFFB3, class396.field5817) >= var13) {
                        class712.field9959.method735(var13, class712.field9959.field1297, 78);
                        class617.method3389(false);
                        class747.field10301 = false;
                        class164.method1188((byte) -120, "maxbuildarea=" + class712.field9959.field1297.method2806(59));
                        return;
                    }
                    class164.method1188((byte) -126, "Invalid buildarea value");
                    return;
                }
                if (arg0.startsWith("rect_debug")) {
                    if (arg0.length() < 10) {
                        class164.method1188((byte) -108, "Invalid rect_debug value");
                        return;
                    }
                    class322.field4710 = class334.method2123(arg3 ^ 0xFFFFFFFE, arg0.substring(10).trim());
                    class164.method1188((byte) -128, "rect_debug=" + class322.field4710);
                    return;
                }
                if (arg0.equalsIgnoreCase("qa_op_test")) {
                    class688.field9683 = true;
                    class164.method1188((byte) -126, "qa_op_test=" + class688.field9683);
                    return;
                }
                if (arg0.equalsIgnoreCase("clipcomponents")) {
                    class104.field1438 = !class104.field1438;
                    class164.method1188((byte) -116, "clipcomponents=" + class104.field1438);
                    return;
                }
                if (arg0.startsWith("bloom")) {
                    boolean var14 = class379.field5542.method461();
                    if (class688.method3821((byte) 75, !var14)) {
                        if (!var14) {
                            class164.method1188((byte) -106, "Bloom enabled");
                            return;
                        }
                        class164.method1188((byte) -118, "Bloom disabled");
                        return;
                    }
                    class164.method1188((byte) -125, "Failed to enable bloom");
                    return;
                }
                if (arg0.equalsIgnoreCase("tween")) {
                    if (!class423.field6046) {
                        class423.field6046 = true;
                        class164.method1188((byte) -103, "Forced tweening ENABLED!");
                        return;
                    }
                    class423.field6046 = false;
                    class164.method1188((byte) -122, "Forced tweening disabled.");
                    return;
                }
                if (arg0.equalsIgnoreCase("shiftclick")) {
                    if (class672.field9457) {
                        class164.method1188((byte) -111, "Shift-click disabled.");
                        class672.field9457 = false;
                        return;
                    }
                    class164.method1188((byte) -122, "Shift-click ENABLED!");
                    class672.field9457 = true;
                    return;
                }
                if (arg0.equalsIgnoreCase("getcgcoord")) {
                    class164.method1188((byte) -109, "x:" + (class551.field7456.field2257 >> 9) + " z:" + (class551.field7456.field2259 >> 9));
                    return;
                }
                if (arg0.equalsIgnoreCase("getheight")) {
                    class164.method1188((byte) -118, "Height: " + class528.field7227[class551.field7456.field2250].method1880(class551.field7456.field2257 >> 9, false, class551.field7456.field2259 >> 9));
                    return;
                }
                if (arg0.equalsIgnoreCase("resetminimap")) {
                    class643.field8927.method2093(-56);
                    class643.field8927.method2119(false);
                    class159.field2194.method393(true);
                    class495.field6846.method2236((byte) -124);
                    class322.method2039(-96);
                    class164.method1188((byte) -124, "Minimap reset");
                    return;
                }
                if (arg0.startsWith("mc")) {
                    if (!class379.field5542.method522()) {
                        class164.method1188((byte) -126, "Current toolkit doesn't support multiple cores");
                        return;
                    }
                    int var15 = Integer.parseInt(arg0.substring(3));
                    if (var15 < 1) {
                        var15 = 1;
                    } else if (var15 > 4) {
                        var15 = 4;
                    }
                    class389.field5670 = var15;
                    class627.method3531(-54);
                    class164.method1188((byte) -124, "Render cores now: " + class389.field5670);
                    return;
                }
                if (arg0.startsWith("cachespace")) {
                    class164.method1188((byte) -123, "I(s): " + class298.field4322.method1547(0) + "/" + class298.field4322.method1553(119));
                    class164.method1188((byte) -103, "I(m): " + class322.field4711.method1547(0) + "/" + class322.field4711.method1553(-128));
                    class164.method1188((byte) -111, "O(s): " + class770.field10602.field5671.method2212(7) + "/" + class770.field10602.field5671.method2217(false));
                    return;
                }
                if (arg0.equalsIgnoreCase("getcamerapos")) {
                    class164.method1188((byte) -125, "Pos: " + class551.field7456.field2250 + "," + ((class634.field8856 >> 9) + class121.field1765 >> 6) + "," + ((class350.field5138 >> 9) + class230.field3147 >> 6) + "," + ((class634.field8856 >> 9) + class121.field1765 & 0x3F) + "," + ((class350.field5138 >> 9) + class230.field3147 & 0x3F) + " Height: " + (class783.method4338(class551.field7456.field2250, class634.field8856, -12040, class350.field5138) - class405.field5867));
                    class164.method1188((byte) -118, "Look: " + class551.field7456.field2250 + "," + (class596.field8129 + class121.field1765 >> 6) + "," + (class383.field5608 + class230.field3147 >> 6) + "," + (class596.field8129 + class121.field1765 & 0x3F) + "," + (class383.field5608 + class230.field3147 & 0x3F) + " Height: " + (class783.method4338(class551.field7456.field2250, class596.field8129, arg3 ^ 0x2F07, class383.field5608) - class777.field10681));
                    return;
                }
                if (arg0.equals("renderprofile") || arg0.equals("rp")) {
                    class260.field3871 = !class260.field3871;
                    class379.field5542.method541(class260.field3871);
                    class769.method4256(arg3 ^ 0xFFFFFFD6);
                    class164.method1188((byte) -125, "showprofiling=" + class260.field3871);
                    return;
                }
                if (arg0.startsWith("performancetest")) {
                    int var16 = -1;
                    int var17 = 1000;
                    if (arg0.length() > 15) {
                        String[] var18 = class46.method355(arg0, 0, ' ');
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
                    if (var16 == -1) {
                        class164.method1188((byte) -104, "Java toolkit: " + class186.method1290(var17, (byte) 28, 0));
                        class164.method1188((byte) -103, "SSE toolkit:  " + class186.method1290(var17, (byte) 28, 2));
                        class164.method1188((byte) -124, "D3D toolkit:  " + class186.method1290(var17, (byte) 28, 3));
                        class164.method1188((byte) -116, "GL toolkit:   " + class186.method1290(var17, (byte) 28, 1));
                        class164.method1188((byte) -106, "GLX toolkit:  " + class186.method1290(var17, (byte) 28, 5));
                        return;
                    }
                    class164.method1188((byte) -122, "Performance: " + class186.method1290(var17, (byte) 28, var16));
                    return;
                }
                if (arg0.equals("nonpcs")) {
                    class6.field55 = !class6.field55;
                    class164.method1188((byte) -118, "nonpcs=" + class6.field55);
                    return;
                }
                if (arg0.equals("autoworld")) {
                    class627.method3529(97);
                    class164.method1188((byte) -119, "auto world selected");
                    return;
                }
                if (arg0.startsWith("switchworld")) {
                    int var19 = Integer.parseInt(arg0.substring(12));
                    class57.method408(class773.method4286(var19, 46).field7035, var19, false);
                    class164.method1188((byte) -122, "switched");
                    return;
                }
                if (arg0.equals("getworld")) {
                    class164.method1188((byte) -107, "w: " + class369.field5359.field1148);
                    return;
                }
                if (arg0.startsWith("pc")) {
                    class267 var20 = class545.method3099((byte) 81, class269.field3966, class625.field8435);
                    var20.field3938.method2380(65280, 0);
                    int var21 = var20.field3938.field5459;
                    int var22 = arg0.indexOf(" ", 4);
                    var20.field3938.method2349(65, arg0.substring(3, var22));
                    class539.method3077(var20.field3938, arg0.substring(var22), (byte) 17);
                    var20.field3938.method2394(126, var20.field3938.field5459 - var21);
                    class617.method3392(var20, true);
                    return;
                }
                if (arg0.equals("savevarcs")) {
                    class454.method2696((byte) 9);
                    class164.method1188((byte) -115, "perm varcs saved");
                    return;
                }
                if (arg0.equals("scramblevarcs")) {
                    for (int var23 = 0; var23 < class700.field9825.length; var23++) {
                        if (class197.field2639[var23]) {
                            class700.field9825[var23] = (int) (Math.random() * 99999.0D);
                            if (Math.random() > 0.5D) {
                                class700.field9825[var23] *= -1;
                            }
                        }
                    }
                    class454.method2696((byte) 9);
                    class164.method1188((byte) -109, "perm varcs scrambled");
                    return;
                }
                if (arg0.equals("showcolmap")) {
                    class697.field9777 = true;
                    class322.method2039(arg3 - 91);
                    class164.method1188((byte) -127, "colmap is shown");
                    return;
                }
                if (arg0.equals("hidecolmap")) {
                    class697.field9777 = false;
                    class322.method2039(-69);
                    class164.method1188((byte) -124, "colmap is hidden");
                    return;
                }
                if (arg0.equals("resetcache")) {
                    class772.method4279((byte) -108);
                    class164.method1188((byte) -112, "Caches reset");
                    return;
                }
                if (arg0.equals("profilecpu")) {
                    class164.method1188((byte) -128, class601.method3347(true) + "ms");
                    return;
                }
                if (arg0.startsWith("getclientvarpbit")) {
                    int var24 = Integer.parseInt(arg0.substring(17));
                    class164.method1188((byte) -126, "varpbit=" + class382.field5602.method2271(var24, arg3 ^ 0xFFFFC88D));
                    return;
                }
                if (arg0.startsWith("getclientvarp")) {
                    int var25 = Integer.parseInt(arg0.substring(14));
                    class164.method1188((byte) -121, "varp=" + class382.field5602.method2272(0, var25));
                    return;
                }
                if (arg0.startsWith("directlogin")) {
                    String[] var26 = class46.method355(arg0.substring(12), 0, ' ');
                    if (var26.length >= 2) {
                        int var27 = var26.length <= 2 ? 0 : Integer.parseInt(var26[2]);
                        class15.method114(var26[1], var27, 6, var26[0]);
                        return;
                    }
                }
                if (arg0.startsWith("snlogin ")) {
                    String[] var28 = class46.method355(arg0.substring(8), 0, ' ');
                    int var29 = Integer.parseInt(var28[0]);
                    int var30 = var28.length == 2 ? Integer.parseInt(var28[1]) : 0;
                    class449.method2684(var30, var29, arg3 + 126);
                    return;
                }
                if (arg0.startsWith("csprofileclear")) {
                    class173.method1234();
                    return;
                }
                if (arg0.startsWith("csprofileoutputc")) {
                    class173.method1232(100, false);
                    return;
                }
                if (arg0.startsWith("csprofileoutputt")) {
                    class173.method1232(10, true);
                    return;
                }
                if (arg0.startsWith("texsize")) {
                    int var31 = Integer.parseInt(arg0.substring(8));
                    class379.field5542.method506(var31);
                    return;
                }
                if (arg0.equals("soundstreamcount")) {
                    class164.method1188((byte) -119, "Active streams: " + class686.field9647.method594());
                    return;
                }
                if (arg0.equals("autosetup")) {
                    class710.method3974((byte) 60);
                    class164.method1188((byte) -125, "Complete. Toolkit now: " + class712.field9959.field1270.method4293(35));
                    return;
                }
                if (arg0.equals("errormessage")) {
                    class164.method1188((byte) -116, class627.field8774.method1919(112));
                    return;
                }
                if (arg0.equals("heapdump")) {
                    if (class70.field976.startsWith("win")) {
                        class634.method3552(arg3 + 70, false, new File("C:\\Temp\\heap.dump"));
                    } else {
                        class634.method3552(-127, false, new File("/tmp/heap.dump"));
                    }
                    class164.method1188((byte) -128, "Done");
                    return;
                }
                if (arg0.equals("os")) {
                    class164.method1188((byte) -106, "Name: " + class70.field976);
                    class164.method1188((byte) -124, "Arch: " + class70.field1001);
                    class164.method1188((byte) -127, "Ver: " + class70.field982);
                    return;
                }
                if (arg0.startsWith("w2debug")) {
                    int var32 = Integer.parseInt(arg0.substring(8, 9));
                    class731.field10143 = var32;
                    class627.method3531(-14);
                    class164.method1188((byte) -106, "Toggled!");
                    return;
                }
                if (arg0.startsWith("ortho ")) {
                    int var33 = arg0.indexOf(32);
                    if (var33 < 0) {
                        class164.method1188((byte) -123, "Syntax: ortho <n>");
                        return;
                    }
                    int var34 = class334.method2123(1, arg0.substring(var33 + 1));
                    class712.field9959.method735(var34, class712.field9959.field1323, 119);
                    class617.method3389(false);
                    class747.field10301 = false;
                    class332.method2082(26);
                    if (var34 != class712.field9959.field1323.method3651(47)) {
                        class164.method1188((byte) -106, "Failed to change ortho mode");
                        return;
                    }
                    class164.method1188((byte) -122, "Successfully changed ortho mode");
                    return;
                }
                if (arg0.startsWith("orthozoom ")) {
                    if (class712.field9959.field1323.method3651(60) == 0) {
                        class164.method1188((byte) -103, "enable ortho mode first (use 'ortho <n>')");
                        return;
                    }
                    int var35 = class334.method2123(1, arg0.substring(arg0.indexOf(32) + 1));
                    class330.field4772 = var35;
                    class164.method1188((byte) -116, "orthozoom=" + class330.field4772);
                    return;
                }
                if (arg0.startsWith("orthotilesize ")) {
                    int var36 = class334.method2123(1, arg0.substring(arg0.indexOf(32) + 1));
                    class462.field6397 = var36;
                    class494.field6842 = var36;
                    class164.method1188((byte) -105, "ortho tile size=" + var36);
                    class332.method2082(63);
                    return;
                }
                if (arg0.equals("orthocamlock")) {
                    class110.field1518 = !class110.field1518;
                    class164.method1188((byte) -127, "ortho camera lock is " + (class110.field1518 ? "on" : "off"));
                    return;
                }
                if (arg0.startsWith("setoutput ")) {
                    File var37 = new File(arg0.substring(10));
                    if (var37.exists()) {
                        var37 = new File(arg0.substring(10) + "." + class302.method1910(0) + ".log");
                        if (var37.exists()) {
                            class164.method1188((byte) -105, "file already exists!");
                            return;
                        }
                    }
                    if (class784.field10800 != null) {
                        class784.field10800.close();
                        class784.field10800 = null;
                    }
                    try {
                        class784.field10800 = new FileOutputStream(var37);
                        return;
                    } catch (FileNotFoundException var46) {
                        class164.method1188((byte) -106, "Could not create " + var37.getName());
                        return;
                    } catch (SecurityException var47) {
                        class164.method1188((byte) -127, "Cannot write to " + var37.getName());
                        return;
                    }
                }
                if (arg0.equals("closeoutput")) {
                    if (class784.field10800 != null) {
                        class784.field10800.close();
                    }
                    class784.field10800 = null;
                    return;
                }
                if (arg0.startsWith("runscript ")) {
                    File var38 = new File(arg0.substring(10));
                    if (!var38.exists()) {
                        class164.method1188((byte) -125, "No such file");
                        return;
                    }
                    byte[] var39 = class474.method2783(var38, arg3 + 9);
                    if (var39 == null) {
                        class164.method1188((byte) -111, "Failed to read file");
                        return;
                    }
                    String[] var40 = class46.method355(class440.method2647(class382.method2433(1, var39), true, "", '\r'), 0, '\n');
                    class271.method1763(-31780, var40);
                }
                if (arg0.startsWith("zoom ")) {
                    short var41 = (short) class334.method2123(1, arg0.substring(5));
                    if (var41 > 0) {
                        class10.field166 = var41;
                    }
                    return;
                }
                if (class458.field6355 == 10) {
                    class131.field1948++;
                    class267 var42 = class545.method3099((byte) 118, class269.field3966, class277.field4112);
                    var42.field3938.method2380(65280, arg0.length() + 3);
                    var42.field3938.method2380(arg3 + 65281, arg1 ? 1 : 0);
                    var42.field3938.method2380(65280, arg2 ? 1 : 0);
                    var42.field3938.method2349(arg3 ^ 0xFFFFFFC2, arg0);
                    class617.method3392(var42, true);
                }
                if (arg0.startsWith("fps ") && class731.field10141 != class197.field2634) {
                    class664.method3680(124, class334.method2123(1, arg0.substring(4)));
                    return;
                }
            } catch (Exception var48) {
                class164.method1188((byte) -113, class474.field6538.method2780(114, class38.field589));
                return;
            }
        }
        if (class458.field6355 != 10) {
            class164.method1188((byte) -125, class474.field6541.method2780(arg3 + 86, class38.field589) + arg0);
        }
    }

    @OriginalMember(owner = "client!mga", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field10207++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(I)V")
    public static void method4094(int arg0) {
        if (arg0 > -96) {
            method4091((char) 65508, (byte) -51, -68);
        }
        field10203 = null;
    }

    @OriginalMember(owner = "client!mga", name = "<init>", descriptor = "(II)V")
    public class739(int arg0, int arg1) {
        this.field10202 = arg0;
        this.field10208 = arg1;
    }
}
