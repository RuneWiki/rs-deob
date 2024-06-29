import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class195 extends class656 {

    @OriginalMember(owner = "client!pq", name = "j", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!pq", name = "l", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!pq", name = "o", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!pq", name = "p", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!pq", name = "r", descriptor = "I")
    public int field2941;

    @OriginalMember(owner = "client!pq", name = "u", descriptor = "I")
    public int field2944;

    @OriginalMember(owner = "client!pq", name = "k", descriptor = "[I")
    public int[] field2934;

    @OriginalMember(owner = "client!pq", name = "q", descriptor = "[I")
    public int[] field2940;

    @OriginalMember(owner = "client!pq", name = "s", descriptor = "[I")
    public int[] field2942;

    @OriginalMember(owner = "client!pq", name = "m", descriptor = "[Ltj;")
    public class198[] field2936;

    @OriginalMember(owner = "client!pq", name = "n", descriptor = "[Ltj;")
    public class198[] field2937;

    @OriginalMember(owner = "client!pq", name = "i", descriptor = "[Lkf;")
    public static class256[] field2932;

    @OriginalMember(owner = "client!pq", name = "t", descriptor = "[[[B")
    public byte[][][] field2943;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)V", line = 8)
    public static final void method1330(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field2939++;
        if (class66.field824 <= 0) {
            class490.field6655 = "";
            return;
        }
        int var1 = 0;
        for (int var2 = 0; var2 < class475.field6519.length; var2++) {
            if (class475.field6519[var2].indexOf("--> ") != -1) {
                var1++;
                if (class66.field824 == var1) {
                    class490.field6655 = class475.field6519[var2].substring(class475.field6519[var2].indexOf(">") + 2);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZZZLjava/lang/String;)V", line = 40)
    public static final void method1331(boolean arg0, boolean arg1, boolean arg2, String arg3) {
        field2933++;
        try {
            if (arg3.equalsIgnoreCase("commands") || arg3.equalsIgnoreCase("help")) {
                class710.method3991("commands - This command", (byte) 76);
                class710.method3991("cls - Clear console", (byte) 98);
                class710.method3991("displayfps - Toggle FPS and other information", (byte) 105);
                class710.method3991("renderer - Print graphics renderer information", (byte) 111);
                class710.method3991("heap - Print java memory information", (byte) 111);
                return;
            }
            if (arg3.equalsIgnoreCase("cls")) {
                class723.field10069 = 0;
                class313.field4476 = 0;
                return;
            }
            if (arg3.equalsIgnoreCase("displayfps")) {
                class365.field5129 = !class365.field5129;
                if (!class365.field5129) {
                    class710.method3991("FPS off", (byte) 117);
                    return;
                }
                class710.method3991("FPS on", (byte) 74);
                return;
            }
            if (arg3.equals("renderer")) {
                class240 var4 = class341.field4807.method397();
                class710.method3991("Vendor: " + var4.field3378, (byte) 115);
                class710.method3991("Name: " + var4.field3376, (byte) 92);
                class710.method3991("Version: " + var4.field3377, (byte) 95);
                class710.method3991("Device: " + var4.field3379, (byte) 124);
                class710.method3991("Driver Version: " + var4.field3382, (byte) 101);
                return;
            }
            if (arg3.equals("heap")) {
                class710.method3991("Heap: " + class365.field5128 + "MB", (byte) 111);
                return;
            }
        } catch (Exception var46) {
            class710.method3991(class517.field6841.method2877(class713.field9854, (byte) -108), (byte) 100);
            return;
        }
        if (arg0) {
            method1332(37, 49, (byte) 79);
        }
        if (class508.field6778 != class304.field4326 || class257.field3521 >= 2) {
            if (arg3.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg3.equals("nativememerror")) {
                throw new OutOfMemoryError("native(MPR");
            }
            try {
                if (arg3.equalsIgnoreCase("printfps")) {
                    class710.method3991("FPS: " + class662.field8734, (byte) 117);
                    return;
                }
                if (arg3.equalsIgnoreCase("occlude")) {
                    class499.field6715 = !class499.field6715;
                    if (!class499.field6715) {
                        class710.method3991("Occlsion now off!", (byte) 117);
                        return;
                    }
                    class710.method3991("Occlsion now on!", (byte) 115);
                    return;
                }
                if (arg3.equalsIgnoreCase("fpson")) {
                    class365.field5129 = true;
                    class710.method3991("fps debug enabled", (byte) 127);
                    return;
                }
                if (arg3.equalsIgnoreCase("fpsoff")) {
                    class365.field5129 = false;
                    class710.method3991("fps debug disabled", (byte) 87);
                    return;
                }
                if (arg3.equals("systemmem")) {
                    try {
                        class710.method3991("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + class136.field2170.field8620 + "Mb", (byte) 110);
                        return;
                    } catch (Throwable var40) {
                        return;
                    }
                }
                if (arg3.equalsIgnoreCase("cleartext")) {
                    class36.field518.method3872(0);
                    class710.method3991("Text coords cleared", (byte) 123);
                    return;
                }
                if (arg3.equalsIgnoreCase("gc")) {
                    class745.method4178(-32492);
                    for (int var5 = 0; var5 < 10; var5++) {
                        System.gc();
                    }
                    Runtime var6 = Runtime.getRuntime();
                    int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                    class710.method3991("mem=" + var7 + "k", (byte) 102);
                    return;
                }
                if (arg3.equalsIgnoreCase("compact")) {
                    class745.method4178(-32492);
                    for (int var8 = 0; var8 < 10; var8++) {
                        System.gc();
                    }
                    Runtime var9 = Runtime.getRuntime();
                    int var10 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                    class710.method3991("Memory before cleanup=" + var10 + "k", (byte) 99);
                    class740.method4123((byte) 85);
                    class745.method4178(-32492);
                    for (int var11 = 0; var11 < 10; var11++) {
                        System.gc();
                    }
                    int var12 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                    class710.method3991("Memory after cleanup=" + var12 + "k", (byte) 117);
                    return;
                }
                if (arg3.equalsIgnoreCase("unloadnatives")) {
                    class710.method3991(class584.method3190(-25) ? "Libraries unloaded" : "Library unloading failed!", (byte) 111);
                    return;
                }
                if (arg3.equalsIgnoreCase("clientdrop")) {
                    class710.method3991("Dropped client connection", (byte) 83);
                    if (class15.field215 == 10) {
                        class92.method694(16384);
                    } else if (class15.field215 == 11) {
                        class383.field5328 = true;
                        return;
                    }
                    return;
                }
                if (arg3.equalsIgnoreCase("rotateconnectmethods")) {
                    class284.field4030.method3103((byte) 67);
                    class710.method3991("Rotated connection methods", (byte) 102);
                    return;
                }
                if (arg3.equalsIgnoreCase("clientjs5drop")) {
                    class448.field6137.method2082((byte) -121);
                    class710.method3991("Dropped client js5 net queue", (byte) 107);
                    return;
                }
                if (arg3.equalsIgnoreCase("serverjs5drop")) {
                    class448.field6137.method2085(1);
                    class710.method3991("Dropped server js5 net queue", (byte) 100);
                    return;
                }
                if (arg3.equalsIgnoreCase("breakcon")) {
                    class66.field828.method1312(-118);
                    class209.field3089.method1441(-3200);
                    class448.field6137.method2083((byte) 70);
                    class710.method3991("Breaking new connections for 5 seconds", (byte) 102);
                    return;
                }
                if (arg3.equalsIgnoreCase("rebuild")) {
                    class436.method2508((byte) -78);
                    class586.method3207(-31736);
                    class710.method3991("Rebuilding map", (byte) 117);
                    return;
                }
                if (arg3.equalsIgnoreCase("rebuildprofile")) {
                    class257.field3525 = class375.method2193(116);
                    class394.field5494 = true;
                    class436.method2508((byte) -113);
                    class586.method3207(-31736);
                    class710.method3991("Rebuilding map (with profiling)", (byte) 79);
                    return;
                }
                if (arg3.equalsIgnoreCase("wm1")) {
                    class554.method3084(false, 1, -1, -1, -1);
                    if (class343.method2050((byte) -112) == 1) {
                        class710.method3991("wm1 succeeded", (byte) 99);
                        return;
                    }
                    class710.method3991("wm1 failed", (byte) 96);
                    return;
                }
                if (arg3.equalsIgnoreCase("wm2")) {
                    class554.method3084(false, 2, -1, -1, -1);
                    if (class343.method2050((byte) -112) == 2) {
                        class710.method3991("wm2 succeeded", (byte) 118);
                        return;
                    }
                    class710.method3991("wm2 failed", (byte) 125);
                    return;
                }
                if (arg3.equalsIgnoreCase("wm3")) {
                    class554.method3084(false, 3, 768, 1024, -1);
                    if (class343.method2050((byte) -112) == 3) {
                        class710.method3991("wm3 succeeded", (byte) 100);
                        return;
                    }
                    class710.method3991("wm3 failed", (byte) 124);
                    return;
                }
                if (arg3.equalsIgnoreCase("tk0")) {
                    class421.method2435(false, 65, 0);
                    if (class411.field5711.field3913.method3282(true) != 0) {
                        class710.method3991("Failed to enter tk0", (byte) 97);
                        return;
                    }
                    class710.method3991("Entered tk0", (byte) 125);
                    class411.field5711.method1677(class411.field5711.field3877, (byte) -71, 0);
                    class2.method15(17458);
                    class41.field548 = false;
                    return;
                }
                if (arg3.equalsIgnoreCase("tk1")) {
                    class421.method2435(false, 89, 1);
                    if (class411.field5711.field3913.method3282(true) == 1) {
                        class710.method3991("Entered tk1", (byte) 90);
                        class411.field5711.method1677(class411.field5711.field3877, (byte) -71, 1);
                        class2.method15(17458);
                        class41.field548 = false;
                        return;
                    }
                    class710.method3991("Failed to enter tk1", (byte) 83);
                    return;
                }
                if (arg3.equalsIgnoreCase("tk2")) {
                    class421.method2435(false, 118, 2);
                    if (class411.field5711.field3913.method3282(true) == 2) {
                        class710.method3991("Entered tk2", (byte) 92);
                        class411.field5711.method1677(class411.field5711.field3877, (byte) -71, 2);
                        class2.method15(17458);
                        class41.field548 = false;
                        return;
                    }
                    class710.method3991("Failed to enter tk2", (byte) 96);
                    return;
                }
                if (arg3.equalsIgnoreCase("tk3")) {
                    class421.method2435(false, -103, 3);
                    if (class411.field5711.field3913.method3282(true) != 3) {
                        class710.method3991("Failed to enter tk3", (byte) 119);
                        return;
                    }
                    class710.method3991("Entered tk3", (byte) 79);
                    class411.field5711.method1677(class411.field5711.field3877, (byte) -71, 3);
                    class2.method15(17458);
                    class41.field548 = false;
                    return;
                }
                if (arg3.equalsIgnoreCase("tk5")) {
                    class421.method2435(false, 99, 5);
                    if (class411.field5711.field3913.method3282(true) != 5) {
                        class710.method3991("Failed to enter tk5", (byte) 127);
                        return;
                    }
                    class710.method3991("Entered tk5", (byte) 91);
                    class411.field5711.method1677(class411.field5711.field3877, (byte) -71, 5);
                    class2.method15(17458);
                    class41.field548 = false;
                    return;
                }
                if (arg3.startsWith("setba")) {
                    if (arg3.length() < 6) {
                        class710.method3991("Invalid buildarea value", (byte) 126);
                        return;
                    }
                    int var13 = class397.method2337((byte) -113, arg3.substring(6));
                    if (var13 >= 0 && var13 <= class235.method1481(class365.field5128, 108)) {
                        class411.field5711.method1677(class411.field5711.field3891, (byte) -71, var13);
                        class2.method15(17458);
                        class41.field548 = false;
                        class710.method3991("maxbuildarea=" + class411.field5711.field3891.method1341(!arg0), (byte) 124);
                        return;
                    }
                    class710.method3991("Invalid buildarea value", (byte) 110);
                    return;
                }
                if (arg3.startsWith("rect_debug")) {
                    if (arg3.length() < 10) {
                        class710.method3991("Invalid rect_debug value", (byte) 113);
                        return;
                    }
                    class263.field3674 = class397.method2337((byte) -122, arg3.substring(10).trim());
                    class710.method3991("rect_debug=" + class263.field3674, (byte) 106);
                    return;
                }
                if (arg3.equalsIgnoreCase("qa_op_test")) {
                    class320.field4567 = true;
                    class710.method3991("qa_op_test=" + class320.field4567, (byte) 100);
                    return;
                }
                if (arg3.equalsIgnoreCase("clipcomponents")) {
                    class112.field1852 = !class112.field1852;
                    class710.method3991("clipcomponents=" + class112.field1852, (byte) 106);
                    return;
                }
                if (arg3.startsWith("bloom")) {
                    boolean var14 = class341.field4807.method459();
                    if (class438.method2519(27, !var14)) {
                        if (!var14) {
                            class710.method3991("Bloom enabled", (byte) 87);
                            return;
                        }
                        class710.method3991("Bloom disabled", (byte) 85);
                        return;
                    }
                    class710.method3991("Failed to enable bloom", (byte) 87);
                    return;
                }
                if (arg3.equalsIgnoreCase("tween")) {
                    if (class37.field529) {
                        class37.field529 = false;
                        class710.method3991("Forced tweening disabled.", (byte) 98);
                        return;
                    }
                    class37.field529 = true;
                    class710.method3991("Forced tweening ENABLED!", (byte) 101);
                    return;
                }
                if (arg3.equalsIgnoreCase("shiftclick")) {
                    if (class658.field8699) {
                        class710.method3991("Shift-click disabled.", (byte) 112);
                        class658.field8699 = false;
                        return;
                    }
                    class710.method3991("Shift-click ENABLED!", (byte) 90);
                    class658.field8699 = true;
                    return;
                }
                if (arg3.equalsIgnoreCase("getcgcoord")) {
                    class710.method3991("x:" + (class472.field6475.field3505 >> 9) + " z:" + (class472.field6475.field3502 >> 9), (byte) 125);
                    return;
                }
                if (arg3.equalsIgnoreCase("getheight")) {
                    class710.method3991("Height: " + class507.field6771[class472.field6475.field3508].method1742(class472.field6475.field3505 >> 9, 62, class472.field6475.field3502 >> 9), (byte) 125);
                    return;
                }
                if (arg3.equalsIgnoreCase("resetminimap")) {
                    class84.field1023.method2201(0);
                    class84.field1023.method2208(0);
                    class468.field6426.method1621(3);
                    class361.field5088.method3197(0);
                    class586.method3207(-31736);
                    class710.method3991("Minimap reset", (byte) 107);
                    return;
                }
                if (arg3.startsWith("mc")) {
                    if (class341.field4807.method485()) {
                        int var15 = Integer.parseInt(arg3.substring(3));
                        if (var15 < 1) {
                            var15 = 1;
                        } else if (var15 > 4) {
                            var15 = 4;
                        }
                        class79.field957 = var15;
                        class436.method2508((byte) -31);
                        class710.method3991("Render cores now: " + class79.field957, (byte) 107);
                        return;
                    }
                    class710.method3991("Current toolkit doesn't support multiple cores", (byte) 105);
                    return;
                }
                if (arg3.startsWith("cachespace")) {
                    class710.method3991("I(s): " + class442.field6091.method557(-6) + "/" + class442.field6091.method559(arg0), (byte) 75);
                    class710.method3991("I(m): " + class96.field1190.method557(-40) + "/" + class96.field1190.method559(arg0), (byte) 97);
                    class710.method3991("O(s): " + class77.field948.field2468.method3054(2) + "/" + class77.field948.field2468.method3052(76), (byte) 100);
                    return;
                }
                if (arg3.equalsIgnoreCase("getcamerapos")) {
                    class710.method3991("Pos: " + class472.field6475.field3508 + "," + ((class694.field9662 >> 9) + class503.field6752 >> 6) + "," + ((class314.field4488 >> 9) + class334.field4757 >> 6) + "," + ((class694.field9662 >> 9) + class503.field6752 & 0x3F) + "," + ((class314.field4488 >> 9) + class334.field4757 & 0x3F) + " Height: " + (class153.method1118(class314.field4488, class694.field9662, -68, class472.field6475.field3508) - class222.field3162), (byte) 83);
                    class710.method3991("Look: " + class472.field6475.field3508 + "," + (class617.field8245 + class503.field6752 >> 6) + "," + (class98.field1230 + class334.field4757 >> 6) + "," + (class617.field8245 + class503.field6752 & 0x3F) + "," + (class98.field1230 + class334.field4757 & 0x3F) + " Height: " + (class153.method1118(class98.field1230, class617.field8245, 126, class472.field6475.field3508) - class516.field6830), (byte) 76);
                    return;
                }
                if (arg3.equals("renderprofile") || arg3.equals("rp")) {
                    class122.field2005 = !class122.field2005;
                    class341.field4807.method456(class122.field2005);
                    class427.method2467(-124);
                    class710.method3991("showprofiling=" + class122.field2005, (byte) 89);
                    return;
                }
                if (arg3.startsWith("performancetest")) {
                    int var16 = -1;
                    int var17 = 1000;
                    if (arg3.length() > 15) {
                        String[] var18 = class323.method1958(31, arg3, ' ');
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
                        class710.method3991("Performance: " + class35.method289(var16, true, var17), (byte) 107);
                        return;
                    }
                    class710.method3991("Java toolkit: " + class35.method289(0, true, var17), (byte) 94);
                    class710.method3991("SSE toolkit:  " + class35.method289(2, !arg0, var17), (byte) 99);
                    class710.method3991("D3D toolkit:  " + class35.method289(3, true, var17), (byte) 110);
                    class710.method3991("GL toolkit:   " + class35.method289(1, true, var17), (byte) 86);
                    class710.method3991("GLX toolkit:  " + class35.method289(5, !arg0, var17), (byte) 111);
                    return;
                }
                if (arg3.equals("nonpcs")) {
                    class184.field2780 = !class184.field2780;
                    class710.method3991("nonpcs=" + class184.field2780, (byte) 84);
                    return;
                }
                if (arg3.equals("autoworld")) {
                    class609.method3324(4096);
                    class710.method3991("auto world selected", (byte) 121);
                    return;
                }
                if (arg3.startsWith("switchworld")) {
                    int var19 = Integer.parseInt(arg3.substring(12));
                    class607.method3299((byte) -47, class629.method3466(-3652, var19).field8652, var19);
                    class710.method3991("switched", (byte) 99);
                    return;
                }
                if (arg3.equals("getworld")) {
                    class710.method3991("w: " + class284.field4030.field7338, (byte) 97);
                    return;
                }
                if (arg3.startsWith("pc")) {
                    class583 var20 = class381.method2246(1, class128.field2105, class31.field488);
                    var20.field7637.method3823(-76, 0);
                    int var21 = var20.field7637.field9419;
                    int var22 = arg3.indexOf(" ", 4);
                    var20.field7637.method3795(arg3.substring(3, var22), (byte) -82);
                    class393.method2325((byte) -98, var20.field7637, arg3.substring(var22));
                    var20.field7637.method3828(-20198, var20.field7637.field9419 - var21);
                    class42.method309(var20, 0);
                    return;
                }
                if (arg3.equals("savevarcs")) {
                    class654.method3560((byte) -99);
                    class710.method3991("perm varcs saved", (byte) 87);
                    return;
                }
                if (arg3.equals("scramblevarcs")) {
                    for (int var23 = 0; var23 < class540.field7160.length; var23++) {
                        if (class763.field10629[var23]) {
                            class540.field7160[var23] = (int) (Math.random() * 99999.0D);
                            if (Math.random() > 0.5D) {
                                class540.field7160[var23] *= -1;
                            }
                        }
                    }
                    class654.method3560((byte) -99);
                    class710.method3991("perm varcs scrambled", (byte) 122);
                    return;
                }
                if (arg3.equals("showcolmap")) {
                    class113.field1864 = true;
                    class586.method3207(-31736);
                    class710.method3991("colmap is shown", (byte) 114);
                    return;
                }
                if (arg3.equals("hidecolmap")) {
                    class113.field1864 = false;
                    class586.method3207(-31736);
                    class710.method3991("colmap is hidden", (byte) 110);
                    return;
                }
                if (arg3.equals("resetcache")) {
                    class1.method1(true);
                    class710.method3991("Caches reset", (byte) 102);
                    return;
                }
                if (arg3.equals("profilecpu")) {
                    class710.method3991(class256.method1556((byte) -117) + "ms", (byte) 114);
                    return;
                }
                if (arg3.startsWith("getclientvarpbit")) {
                    int var24 = Integer.parseInt(arg3.substring(17));
                    class710.method3991("varpbit=" + class74.field901.method1524(var24, (byte) -127), (byte) 109);
                    return;
                }
                if (arg3.startsWith("getclientvarp")) {
                    int var25 = Integer.parseInt(arg3.substring(14));
                    class710.method3991("varp=" + class74.field901.method1525(var25, (byte) 112), (byte) 91);
                    return;
                }
                if (arg3.startsWith("directlogin")) {
                    String[] var26 = class323.method1958(26, arg3.substring(12), ' ');
                    if (var26.length >= 2) {
                        int var27 = var26.length <= 2 ? 0 : Integer.parseInt(var26[2]);
                        class625.method3436(var26[0], var26[1], 123, var27);
                        return;
                    }
                }
                if (arg3.startsWith("csprofileclear")) {
                    class182.method1256();
                    return;
                }
                if (arg3.startsWith("csprofileoutputc")) {
                    class182.method1247(100, false);
                    return;
                }
                if (arg3.startsWith("csprofileoutputt")) {
                    class182.method1247(10, true);
                    return;
                }
                if (arg3.startsWith("texsize")) {
                    int var28 = Integer.parseInt(arg3.substring(8));
                    class341.field4807.method420(var28);
                    return;
                }
                if (arg3.equals("soundstreamcount")) {
                    class710.method3991("Active streams: " + class603.field7927.method1609(), (byte) 116);
                    return;
                }
                if (arg3.equals("autosetup")) {
                    class374.method2190((byte) 53);
                    class710.method3991("Complete. Toolkit now: " + class411.field5711.field3913.method3282(true), (byte) 97);
                    return;
                }
                if (arg3.equals("errormessage")) {
                    class710.method3991(class243.field3401.method1882(75), (byte) 77);
                    return;
                }
                if (arg3.equals("heapdump")) {
                    if (class192.field2897.startsWith("win")) {
                        class388.method2298(0, false, new File("C:\\Temp\\heap.dump"));
                    } else {
                        class388.method2298(0, false, new File("/tmp/heap.dump"));
                    }
                    class710.method3991("Done", (byte) 97);
                    return;
                }
                if (arg3.equals("os")) {
                    class710.method3991("Name: " + class192.field2897, (byte) 123);
                    class710.method3991("Arch: " + class192.field2881, (byte) 84);
                    class710.method3991("Ver: " + class192.field2898, (byte) 120);
                    return;
                }
                if (arg3.startsWith("w2debug")) {
                    int var29 = Integer.parseInt(arg3.substring(8, 9));
                    class308.field4432 = var29;
                    class436.method2508((byte) 5);
                    class710.method3991("Toggled!", (byte) 89);
                    return;
                }
                if (arg3.startsWith("ortho ")) {
                    int var30 = arg3.indexOf(32);
                    if (var30 < 0) {
                        class710.method3991("Syntax: ortho <n>", (byte) 75);
                        return;
                    }
                    int var31 = class397.method2337((byte) -116, arg3.substring(var30 + 1));
                    class411.field5711.method1677(class411.field5711.field3870, (byte) -71, var31);
                    class2.method15(17458);
                    class41.field548 = false;
                    class596.method3236((byte) -114);
                    if (var31 == class411.field5711.field3870.method2335(!arg0)) {
                        class710.method3991("Successfully changed ortho mode", (byte) 99);
                        return;
                    }
                    class710.method3991("Failed to change ortho mode", (byte) 124);
                    return;
                }
                if (arg3.startsWith("orthozoom ")) {
                    if (class411.field5711.field3870.method2335(!arg0) == 0) {
                        class710.method3991("enable ortho mode first (use 'ortho <n>')", (byte) 86);
                        return;
                    }
                    int var32 = class397.method2337((byte) -119, arg3.substring(arg3.indexOf(32) + 1));
                    class100.field1299 = var32;
                    class710.method3991("orthozoom=" + class100.field1299, (byte) 91);
                    return;
                }
                if (arg3.startsWith("orthotilesize ")) {
                    int var33 = class397.method2337((byte) -119, arg3.substring(arg3.indexOf(32) + 1));
                    class630.field8395 = var33;
                    class315.field4502 = var33;
                    class710.method3991("ortho tile size=" + var33, (byte) 97);
                    class596.method3236((byte) -114);
                    return;
                }
                if (arg3.equals("orthocamlock")) {
                    class415.field5734 = !class415.field5734;
                    class710.method3991("ortho camera lock is " + (class415.field5734 ? "on" : "off"), (byte) 91);
                    return;
                }
                if (arg3.startsWith("setoutput ")) {
                    File var34 = new File(arg3.substring(10));
                    if (var34.exists()) {
                        var34 = new File(arg3.substring(10) + "." + class375.method2193(116) + ".log");
                        if (var34.exists()) {
                            class710.method3991("file already exists!", (byte) 107);
                            return;
                        }
                    }
                    if (class260.field3626 != null) {
                        class260.field3626.close();
                        class260.field3626 = null;
                    }
                    try {
                        class260.field3626 = new FileOutputStream(var34);
                        return;
                    } catch (FileNotFoundException var43) {
                        class710.method3991("Could not create " + var34.getName(), (byte) 98);
                        return;
                    } catch (SecurityException var44) {
                        class710.method3991("Cannot write to " + var34.getName(), (byte) 87);
                        return;
                    }
                }
                if (arg3.equals("closeoutput")) {
                    if (class260.field3626 != null) {
                        class260.field3626.close();
                    }
                    class260.field3626 = null;
                    return;
                }
                if (arg3.startsWith("runscript ")) {
                    File var35 = new File(arg3.substring(10));
                    if (!var35.exists()) {
                        class710.method3991("No such file", (byte) 116);
                        return;
                    }
                    byte[] var36 = class397.method2334(var35, (byte) -112);
                    if (var36 == null) {
                        class710.method3991("Failed to read file", (byte) 90);
                        return;
                    }
                    String[] var37 = class323.method1958(-103, class8.method93(85, class643.method3529(!arg0, var36), '\r', ""), '\n');
                    class375.method2191(117, var37);
                }
                if (arg3.startsWith("zoom ")) {
                    short var38 = (short) class397.method2337((byte) -126, arg3.substring(5));
                    if (var38 > 0) {
                        class178.field2685 = var38;
                    }
                    return;
                }
                if (class15.field215 == 10) {
                    class564.field7398++;
                    class583 var39 = class381.method2246(1, class128.field2105, class689.field9588);
                    var39.field7637.method3823(-36, arg3.length() + 3);
                    var39.field7637.method3823(-115, arg1 ? 1 : 0);
                    var39.field7637.method3823(-82, arg2 ? 1 : 0);
                    var39.field7637.method3795(arg3, (byte) -89);
                    class42.method309(var39, 0);
                }
                if (arg3.startsWith("fps ") && class508.field6778 != class304.field4326) {
                    class662.method3587(class397.method2337((byte) -122, arg3.substring(4)), -1);
                    return;
                }
            } catch (Exception var45) {
                class710.method3991(class517.field6841.method2877(class713.field9854, (byte) -108), (byte) 77);
                return;
            }
        }
        if (class15.field215 != 10) {
            class710.method3991(class517.field6842.method2877(class713.field9854, (byte) -108) + arg3, (byte) 107);
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIB)B", line = 1042)
    public static final byte method1332(int arg0, int arg1, byte arg2) {
        if (arg2 != 55) {
            method1331(true, true, true, null);
        }
        field2935++;
        if (arg1 == 9) {
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(I)V", line = 1061)
    public static void method1333(int arg0) {
        if (arg0 != 0) {
            field2938 = -19;
        }
        field2932 = null;
    }
}
