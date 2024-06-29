import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class553 {

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field8018;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "Lri;")
    public static class97 field8017;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V", line = 4)
    public static void method3318(byte arg0) {
        if (arg0 == -92) {
            field8017 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ZLjava/lang/String;ZB)V", line = 17)
    public static final void method3319(boolean arg0, String arg1, boolean arg2, byte arg3) {
        field8018++;
        try {
            if (arg1.equalsIgnoreCase("commands") || arg1.equalsIgnoreCase("help")) {
                class529.method3200("commands - This command", -128);
                class529.method3200("cls - Clear console", -117);
                class529.method3200("displayfps - Toggle FPS and other information", -90);
                class529.method3200("renderer - Print graphics renderer information", -122);
                class529.method3200("heap - Print java memory information", -103);
                return;
            }
            if (arg1.equalsIgnoreCase("cls")) {
                class706.field9990 = 0;
                class106.field1729 = 0;
                return;
            }
            if (arg1.equalsIgnoreCase("displayfps")) {
                class217.field3567 = !class217.field3567;
                if (!class217.field3567) {
                    class529.method3200("FPS off", -95);
                    return;
                }
                class529.method3200("FPS on", -109);
                return;
            }
            if (arg1.equals("renderer")) {
                class530 var4 = class627.field8857.method160();
                class529.method3200("Vendor: " + var4.field7727, -92);
                class529.method3200("Name: " + var4.field7730, -98);
                class529.method3200("Version: " + var4.field7725, -97);
                class529.method3200("Device: " + var4.field7732, -86);
                class529.method3200("Driver Version: " + var4.field7731, -102);
                return;
            }
            if (arg3 <= 28) {
                field8017 = null;
            }
            if (arg1.equals("heap")) {
                class529.method3200("Heap: " + class204.field3324 + "MB", -110);
                return;
            }
        } catch (Exception var43) {
            class529.method3200(class122.field1974.method1091(class135.field2206, 1), -92);
            return;
        }
        if (class660.field9192 != class182.field3060 || class139.field2342 >= 2) {
            if (arg1.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg1.equals("nativememerror")) {
                throw new OutOfMemoryError("native(MPR");
            }
            try {
                if (arg1.equalsIgnoreCase("printfps")) {
                    class529.method3200("FPS: " + class41.field583, -106);
                    return;
                }
                if (arg1.equalsIgnoreCase("occlude")) {
                    class185.field3114 = !class185.field3114;
                    if (!class185.field3114) {
                        class529.method3200("Occlsion now off!", -103);
                        return;
                    }
                    class529.method3200("Occlsion now on!", -100);
                    return;
                }
                if (arg1.equalsIgnoreCase("fpson")) {
                    class217.field3567 = true;
                    class529.method3200("fps debug enabled", -95);
                    return;
                }
                if (arg1.equalsIgnoreCase("fpsoff")) {
                    class217.field3567 = false;
                    class529.method3200("fps debug disabled", -110);
                    return;
                }
                if (arg1.equals("systemmem")) {
                    try {
                        class529.method3200("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb", -86);
                        return;
                    } catch (Throwable var37) {
                        return;
                    }
                }
                if (arg1.equalsIgnoreCase("cleartext")) {
                    class677.field9525.method2749(-19473);
                    class529.method3200("Text coords cleared", -103);
                    return;
                }
                if (arg1.equalsIgnoreCase("gc")) {
                    class168.method1357(-10);
                    for (int var5 = 0; var5 < 10; var5++) {
                        System.gc();
                    }
                    Runtime var6 = Runtime.getRuntime();
                    int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                    class529.method3200("mem=" + var7 + "k", -98);
                    return;
                }
                if (arg1.equalsIgnoreCase("compact")) {
                    class168.method1357(85);
                    for (int var8 = 0; var8 < 10; var8++) {
                        System.gc();
                    }
                    Runtime var9 = Runtime.getRuntime();
                    int var10 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                    class529.method3200("Memory before cleanup=" + var10 + "k", -100);
                    class454.method2852(1);
                    class168.method1357(-14);
                    for (int var11 = 0; var11 < 10; var11++) {
                        System.gc();
                    }
                    int var12 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                    class529.method3200("Memory after cleanup=" + var12 + "k", -111);
                    return;
                }
                if (arg1.equalsIgnoreCase("unloadnatives")) {
                    class529.method3200(class676.method3867((byte) 127) ? "Libraries unloaded" : "Library unloading failed!", -107);
                    return;
                }
                if (arg1.equalsIgnoreCase("clientdrop")) {
                    class529.method3200("Dropped client connection", -86);
                    if (class682.field9564 == 10) {
                        class125.method1104((byte) 28);
                        return;
                    }
                    if (class682.field9564 == 11) {
                        class628.field8864 = true;
                    }
                    return;
                }
                if (arg1.equalsIgnoreCase("rotateconnectmethods")) {
                    class221.field3591.method2919((byte) -100);
                    class529.method3200("Rotated connection methods", -92);
                    return;
                }
                if (arg1.equalsIgnoreCase("clientjs5drop")) {
                    class683.field9586.method2962((byte) -94);
                    class529.method3200("Dropped client js5 net queue", -99);
                    return;
                }
                if (arg1.equalsIgnoreCase("serverjs5drop")) {
                    class683.field9586.method2954((byte) 81);
                    class529.method3200("Dropped server js5 net queue", -107);
                    return;
                }
                if (arg1.equalsIgnoreCase("breakcon")) {
                    class402.field6207.method3171((byte) -28);
                    class499.field7329.method594((byte) 68);
                    class683.field9586.method2963(true);
                    class529.method3200("Breaking new connections for 5 seconds", -105);
                    return;
                }
                if (arg1.equalsIgnoreCase("rebuild")) {
                    class329.method2213((byte) -21);
                    class145.method1234(-24329);
                    class529.method3200("Rebuilding map", -127);
                    return;
                }
                if (arg1.equalsIgnoreCase("rebuildprofile")) {
                    class441.field6726 = class112.method1033(-11752);
                    class572.field8175 = true;
                    class329.method2213((byte) -21);
                    class145.method1234(-24329);
                    class529.method3200("Rebuilding map (with profiling)", -117);
                    return;
                }
                if (arg1.equalsIgnoreCase("wm1")) {
                    class356.method2392(false, -94, -1, 1, -1);
                    if (class33.method452(2) == 1) {
                        class529.method3200("wm1 succeeded", -127);
                        return;
                    }
                    class529.method3200("wm1 failed", -91);
                    return;
                }
                if (arg1.equalsIgnoreCase("wm2")) {
                    class356.method2392(false, -106, -1, 2, -1);
                    if (class33.method452(2) == 2) {
                        class529.method3200("wm2 succeeded", -107);
                        return;
                    }
                    class529.method3200("wm2 failed", -93);
                    return;
                }
                if (arg1.equalsIgnoreCase("wm3")) {
                    class356.method2392(false, -116, 1024, 3, 768);
                    if (class33.method452(2) == 3) {
                        class529.method3200("wm3 succeeded", -104);
                        return;
                    }
                    class529.method3200("wm3 failed", -104);
                    return;
                }
                if (arg1.equalsIgnoreCase("tk0")) {
                    class265.method1878(0, -14473);
                    if (class497.field7259 == 0) {
                        class529.method3200("Entered tk0", -123);
                        class17.field282.field4868 = 0;
                        class17.field282.method2094(false, class402.field6207);
                        class644.field9057 = false;
                        return;
                    }
                    class529.method3200("Failed to enter tk0", -101);
                    return;
                }
                if (arg1.equalsIgnoreCase("tk1")) {
                    class265.method1878(1, -14473);
                    if (class497.field7259 == 1) {
                        class529.method3200("Entered tk1", -122);
                        class17.field282.field4868 = 1;
                        class17.field282.method2094(false, class402.field6207);
                        class644.field9057 = false;
                        return;
                    }
                    class529.method3200("Failed to enter tk1", -114);
                    return;
                }
                if (arg1.equalsIgnoreCase("tk2")) {
                    class265.method1878(2, -14473);
                    if (class497.field7259 != 2) {
                        class529.method3200("Failed to enter tk2", -103);
                        return;
                    }
                    class529.method3200("Entered tk2", -118);
                    class17.field282.field4868 = 2;
                    class17.field282.method2094(false, class402.field6207);
                    class644.field9057 = false;
                    return;
                }
                if (arg1.equalsIgnoreCase("tk3")) {
                    class265.method1878(3, -14473);
                    if (class497.field7259 != 3) {
                        class529.method3200("Failed to enter tk3", -124);
                        return;
                    }
                    class529.method3200("Entered tk3", -87);
                    class17.field282.field4868 = 3;
                    class17.field282.method2094(false, class402.field6207);
                    class644.field9057 = false;
                    return;
                }
                if (arg1.equalsIgnoreCase("tk5")) {
                    class265.method1878(5, -14473);
                    if (class497.field7259 == 5) {
                        class529.method3200("Entered tk5", -97);
                        class17.field282.field4868 = 5;
                        class17.field282.method2094(false, class402.field6207);
                        class644.field9057 = false;
                        return;
                    }
                    class529.method3200("Failed to enter tk5", -100);
                    return;
                }
                if (arg1.equalsIgnoreCase("ot")) {
                    class17.field282.field4877 = !class17.field282.field4877;
                    class17.field282.method2094(false, class402.field6207);
                    class644.field9057 = false;
                    class329.method2213((byte) -21);
                    class529.method3200("ot=" + class17.field282.field4877, -107);
                    return;
                }
                if (arg1.equalsIgnoreCase("gb")) {
                    class17.field282.field4890 = !class17.field282.field4890;
                    class17.field282.method2094(false, class402.field6207);
                    class644.field9057 = false;
                    class329.method2213((byte) -21);
                    class529.method3200("gb=" + class17.field282.field4890, -92);
                    return;
                }
                if (arg1.startsWith("shadows")) {
                    if (arg1.length() < 8) {
                        class529.method3200("Invalid shadows value", -91);
                        return;
                    }
                    String var13 = arg1.substring(8);
                    int var14 = class357.method2400(10, var13) ? class566.method3354((byte) -119, var13) : -1;
                    if (var14 >= 0 && var14 <= 2) {
                        class17.field282.method2131(class497.field7259, var14, true);
                        class17.field282.method2094(false, class402.field6207);
                        class644.field9057 = false;
                        class329.method2213((byte) -21);
                        class529.method3200("shadows=" + var14, -128);
                        return;
                    }
                    class529.method3200("Invalid shadows value", -87);
                    return;
                }
                if (arg1.startsWith("textures")) {
                    class17.field282.field4872 = !class17.field282.field4872;
                    class17.field282.method2094(false, class402.field6207);
                    class644.field9057 = false;
                    class49.method574(48);
                    class329.method2213((byte) -21);
                    class529.method3200("textures=" + class17.field282.field4872, -109);
                    return;
                }
                if (arg1.startsWith("lighting")) {
                    class17.field282.method2124(class497.field7259, !class17.field282.method2127(7525, class497.field7259), 1);
                    class17.field282.method2094(false, class402.field6207);
                    class644.field9057 = false;
                    class338.method2317(35);
                    class49.method574(106);
                    class329.method2213((byte) -21);
                    class529.method3200("lighting=" + class17.field282.method2127(7525, class497.field7259), -122);
                    return;
                }
                if (arg1.startsWith("setba")) {
                    if (arg1.length() < 6) {
                        class529.method3200("Invalid buildarea value", -98);
                        return;
                    }
                    int var15 = class566.method3354((byte) -46, arg1.substring(6));
                    if (var15 >= 0 && var15 <= class258.method1825(class204.field3324, -99)) {
                        class17.field282.field4856 = var15;
                        class17.field282.method2094(false, class402.field6207);
                        class644.field9057 = false;
                        class529.method3200("maxbuildarea=" + class17.field282.field4856, -103);
                        return;
                    }
                    class529.method3200("Invalid buildarea value", -114);
                    return;
                }
                if (arg1.startsWith("rect_debug")) {
                    if (arg1.length() < 10) {
                        class529.method3200("Invalid rect_debug value", -109);
                        return;
                    }
                    class150.field2483 = class566.method3354((byte) -52, arg1.substring(10).trim());
                    class529.method3200("rect_debug=" + class150.field2483, -93);
                    return;
                }
                if (arg1.equalsIgnoreCase("qa_op_test")) {
                    class518.field7505 = true;
                    class529.method3200("qa_op_test=" + class518.field7505, -116);
                    return;
                }
                if (arg1.equalsIgnoreCase("clipcomponents")) {
                    class347.field5566 = !class347.field5566;
                    class529.method3200("clipcomponents=" + class347.field5566, -91);
                    return;
                }
                if (arg1.startsWith("bloom")) {
                    boolean var16 = class627.field8857.method168();
                    if (!class500.method3050(!var16, -17699)) {
                        class529.method3200("Failed to enable bloom", -125);
                        return;
                    }
                    if (!var16) {
                        class529.method3200("Bloom enabled", -96);
                        return;
                    }
                    class529.method3200("Bloom disabled", -90);
                    return;
                }
                if (arg1.equalsIgnoreCase("tween")) {
                    if (class436.field6656) {
                        class436.field6656 = false;
                        class529.method3200("Forced tweening disabled.", -112);
                        return;
                    }
                    class436.field6656 = true;
                    class529.method3200("Forced tweening ENABLED!", -102);
                    return;
                }
                if (arg1.equalsIgnoreCase("shiftclick")) {
                    if (class159.field2705) {
                        class529.method3200("Shift-click disabled.", -85);
                        class159.field2705 = false;
                        return;
                    }
                    class529.method3200("Shift-click ENABLED!", -114);
                    class159.field2705 = true;
                    return;
                }
                if (arg1.equalsIgnoreCase("getcgcoord")) {
                    class529.method3200("x:" + (class567.field8141.field9696 >> 9) + " z:" + (class567.field8141.field9705 >> 9), -98);
                    return;
                }
                if (arg1.equalsIgnoreCase("getheight")) {
                    class529.method3200("Height: " + class587.field8346[class567.field8141.field9695].method479(class567.field8141.field9705 >> 9, class567.field8141.field9696 >> 9, -99), -113);
                    return;
                }
                if (arg1.equalsIgnoreCase("resetminimap")) {
                    class158.field2699.method936(-26392);
                    class158.field2699.method929(101);
                    class584.field8299.method1881((byte) 122);
                    class498.field7303.method3285(-1);
                    class145.method1234(-24329);
                    class529.method3200("Minimap reset", -125);
                    return;
                }
                if (arg1.startsWith("mc")) {
                    if (class627.field8857.method266()) {
                        int var17 = Integer.parseInt(arg1.substring(3));
                        if (var17 < 1) {
                            var17 = 1;
                        } else if (var17 > 4) {
                            var17 = 4;
                        }
                        class155.field2639 = var17;
                        class329.method2213((byte) -21);
                        class529.method3200("Render cores now: " + class155.field2639, -92);
                        return;
                    }
                    class529.method3200("Current toolkit doesn't support multiple cores", -109);
                    return;
                }
                if (arg1.startsWith("cachespace")) {
                    class529.method3200("I(s): " + class66.field854.method572((byte) -23) + "/" + class66.field854.method566(-29701), -112);
                    class529.method3200("I(m): " + class177.field2913.method572((byte) -23) + "/" + class177.field2913.method566(-29701), -118);
                    class529.method3200("O(s): " + class91.field1083.field6832.method3534(87) + "/" + class91.field1083.field6832.method3540(false), -102);
                    return;
                }
                if (arg1.equalsIgnoreCase("getcamerapos")) {
                    class529.method3200("Pos: " + class567.field8141.field9695 + "," + ((class675.field9521 >> 9) + class612.field8702 >> 6) + "," + ((class412.field6318 >> 9) + class626.field8855 >> 6) + "," + ((class675.field9521 >> 9) + class612.field8702 & 0x3F) + "," + ((class412.field6318 >> 9) + class626.field8855 & 0x3F) + " Height: " + (class202.method1568(class675.field9521, class567.field8141.field9695, class412.field6318, 2) - class607.field8638), -89);
                    class529.method3200("Look: " + class567.field8141.field9695 + "," + (class612.field8702 + class177.field2910 >> 6) + "," + (class640.field8986 + class626.field8855 >> 6) + "," + (class612.field8702 + class177.field2910 & 0x3F) + "," + (class640.field8986 + class626.field8855 & 0x3F) + " Height: " + (class202.method1568(class177.field2910, class567.field8141.field9695, class640.field8986, 2) - class131.field2151), -121);
                    return;
                }
                if (arg1.equals("renderprofile") || arg1.equals("rp")) {
                    class499.field7327 = !class499.field7327;
                    class627.field8857.method114(class499.field7327);
                    class500.method3048(true);
                    class529.method3200("showprofiling=" + class499.field7327, -115);
                    return;
                }
                if (arg1.startsWith("performancetest")) {
                    int var18 = -1;
                    int var19 = 1000;
                    if (arg1.length() > 15) {
                        String[] var20 = class698.method3944(' ', arg1, -4);
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
                        class529.method3200("Performance: " + class126.method1106(-2066990686, class497.field7259, var19), -88);
                        return;
                    }
                    class529.method3200("Java toolkit: " + class126.method1106(-2066990686, 0, var19), -107);
                    class529.method3200("SSE toolkit:  " + class126.method1106(-2066990686, 2, var19), -98);
                    class529.method3200("D3D toolkit:  " + class126.method1106(-2066990686, 3, var19), -116);
                    class529.method3200("GL toolkit:   " + class126.method1106(-2066990686, 1, var19), -128);
                    class529.method3200("GLX toolkit:  " + class126.method1106(-2066990686, 5, var19), -111);
                    return;
                }
                if (arg1.equals("nonpcs")) {
                    class354.field5656 = !class354.field5656;
                    class529.method3200("nonpcs=" + class354.field5656, -86);
                    return;
                }
                if (arg1.equals("autoworld")) {
                    class184.method1498(true);
                    class529.method3200("auto world selected", -108);
                    return;
                }
                if (arg1.startsWith("switchworld")) {
                    int var21 = Integer.parseInt(arg1.substring(12));
                    class463.method2895(var21, class88.method803(-125, var21).field3635, -21117);
                    class529.method3200("switched", -128);
                    return;
                }
                if (arg1.equals("getworld")) {
                    class529.method3200("w: " + class221.field3591.field6971, -113);
                    return;
                }
                if (arg1.startsWith("pc")) {
                    class165 var22 = class271.method1917(class420.field6424, (byte) -53, class479.field7079);
                    var22.field2776.method65(0, -77);
                    int var23 = var22.field2776.field57;
                    int var24 = arg1.indexOf(" ", 4);
                    var22.field2776.method28(arg1.substring(3, var24), 0);
                    class252.method1791(var22.field2776, arg1.substring(var24), 13);
                    var22.field2776.method24(var22.field2776.field57 - var23, (byte) 119);
                    class642.method3726(-684096285, var22);
                    return;
                }
                if (arg1.equals("savevarcs")) {
                    class651.method3757(true);
                    class529.method3200("perm varcs saved", -124);
                    return;
                }
                if (arg1.equals("scramblevarcs")) {
                    for (int var25 = 0; var25 < class52.field702.length; var25++) {
                        if (class691.field9687[var25]) {
                            class52.field702[var25] = (int) (Math.random() * 99999.0D);
                            if (Math.random() > 0.5D) {
                                class52.field702[var25] *= -1;
                            }
                        }
                    }
                    class651.method3757(true);
                    class529.method3200("perm varcs scrambled", -111);
                    return;
                }
                if (arg1.equals("showcolmap")) {
                    class11.field192 = true;
                    class145.method1234(-24329);
                    class529.method3200("colmap is shown", -100);
                    return;
                }
                if (arg1.equals("hidecolmap")) {
                    class11.field192 = false;
                    class145.method1234(-24329);
                    class529.method3200("colmap is hidden", -106);
                    return;
                }
                if (arg1.equals("resetcache")) {
                    class66.method705(0);
                    class529.method3200("Caches reset", -98);
                    return;
                }
                if (arg1.equals("profilecpu")) {
                    class529.method3200(class520.method3132(-119) + "ms", -103);
                    return;
                }
                if (arg1.startsWith("getclientvarpbit")) {
                    int var26 = Integer.parseInt(arg1.substring(17));
                    class529.method3200("varpbit=" + class539.field7869.method2031((byte) 92, var26), -125);
                    return;
                }
                if (arg1.startsWith("getclientvarp")) {
                    int var27 = Integer.parseInt(arg1.substring(14));
                    class529.method3200("varp=" + class539.field7869.method2032((byte) -111, var27), -89);
                    return;
                }
                if (arg1.startsWith("demologin")) {
                    class314.method2147(1, false, 0);
                    return;
                }
                if (arg1.startsWith("newdemologin")) {
                    class314.method2147(1, true, 0);
                    return;
                }
                if (arg1.startsWith("directlogin")) {
                    String[] var28 = class698.method3944(' ', arg1.substring(12), -4);
                    if (var28.length >= 2) {
                        int var29 = var28.length <= 2 ? 0 : Integer.parseInt(var28[2]);
                        class89.method805(-29536, var28[0], var29, var28[1]);
                        return;
                    }
                }
                if (arg1.startsWith("csprofileclear")) {
                    class142.method1210();
                    return;
                }
                if (arg1.startsWith("csprofileoutputc")) {
                    class142.method1203(100, false);
                    return;
                }
                if (arg1.startsWith("csprofileoutputt")) {
                    class142.method1203(10, true);
                    return;
                }
                if (arg1.startsWith("texsize")) {
                    int var30 = Integer.parseInt(arg1.substring(8));
                    class627.field8857.method301(var30);
                    return;
                }
                if (arg1.equals("soundstreamcount")) {
                    class529.method3200("Active streams: " + class505.field7381.method1987(), -94);
                    return;
                }
                if (arg1.equals("autosetup")) {
                    class17.field282.method2085(true);
                    class529.method3200("Complete. Toolkit now: " + class497.field7259, -114);
                    return;
                }
                if (arg1.equals("errormessage")) {
                    class529.method3200(class157.field2684.method1941(-126), -85);
                    return;
                }
                if (arg1.equals("heapdump")) {
                    if (class525.field7660.startsWith("win")) {
                        class3.method10(false, new File("C:\\Temp\\heap.dump"), (byte) 46);
                    } else {
                        class3.method10(false, new File("/tmp/heap.dump"), (byte) 100);
                    }
                    class529.method3200("Done", -123);
                    return;
                }
                if (arg1.equals("os")) {
                    class529.method3200("Name: " + class525.field7660, -124);
                    class529.method3200("Arch: " + class525.field7659, -119);
                    class529.method3200("Ver: " + class525.field7664, -110);
                    return;
                }
                if (arg1.startsWith("w2debug")) {
                    int var31 = Integer.parseInt(arg1.substring(8, 9));
                    class617.field8743 = var31;
                    class329.method2213((byte) -21);
                    class529.method3200("Toggled!", -93);
                    return;
                }
                if (arg1.startsWith("setoutput ")) {
                    File var32 = new File(arg1.substring(10));
                    if (var32.exists()) {
                        var32 = new File(arg1.substring(10) + "." + class112.method1033(-11752) + ".log");
                        if (var32.exists()) {
                            class529.method3200("file already exists!", -95);
                            return;
                        }
                    }
                    if (class267.field4340 != null) {
                        class267.field4340.close();
                        class267.field4340 = null;
                    }
                    try {
                        class267.field4340 = new FileOutputStream(var32);
                        return;
                    } catch (FileNotFoundException var40) {
                        class529.method3200("Could not create " + var32.getName(), -88);
                        return;
                    } catch (SecurityException var41) {
                        class529.method3200("Cannot write to " + var32.getName(), -117);
                        return;
                    }
                }
                if (arg1.equals("closeoutput")) {
                    if (class267.field4340 != null) {
                        class267.field4340.close();
                    }
                    class267.field4340 = null;
                    return;
                }
                if (arg1.startsWith("runscript ")) {
                    File var33 = new File(arg1.substring(10));
                    if (!var33.exists()) {
                        class529.method3200("No such file", -116);
                        return;
                    }
                    byte[] var34 = class22.method363(var33, 85);
                    if (var34 == null) {
                        class529.method3200("Failed to read file", -89);
                        return;
                    }
                    String[] var35 = class698.method3944('\n', class650.method3752((byte) 118, class550.method3315(var34, -1710), "", '\r'), -4);
                    class531.method3212(var35, 1);
                    return;
                }
                if (class682.field9564 == 10) {
                    class234.field3709++;
                    class165 var36 = class271.method1917(class420.field6424, (byte) -73, class579.field8254);
                    var36.field2776.method65(arg1.length() + 3, -77);
                    var36.field2776.method65(arg0 ? 1 : 0, -77);
                    var36.field2776.method65(arg2 ? 1 : 0, -77);
                    var36.field2776.method28(arg1, 0);
                    class642.method3726(-684096285, var36);
                }
                if (arg1.startsWith("fps ") && class660.field9192 != class182.field3060) {
                    class51.method579((byte) 106, class566.method3354((byte) 84, arg1.substring(4)));
                    return;
                }
            } catch (Exception var42) {
                class529.method3200(class122.field1974.method1091(class135.field2206, 1), -96);
                return;
            }
        }
        if (class682.field9564 != 10) {
            class529.method3200(class122.field1975.method1091(class135.field2206, 1) + arg1, -90);
        }
    }
}
