import jagex3.jagmisc.jagmisc;
import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class332 {

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "Lpca;")
    private class653 field4298 = new class653(128);

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "Ljo;")
    private class303 field4297;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "Lep;")
    public static class382 field4291 = null;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "[I")
    public static int[] field4290 = new int[13];

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    public static int field4292;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
    public static int field4296;

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "Lao;")
    public static class258 field4299;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZZBLjava/lang/String;)V", line = 3)
    public static final void method1866(boolean arg0, boolean arg1, byte arg2, String arg3) {
        if (arg2 != 123) {
            return;
        }
        field4288++;
        if (class73.field771 == class553.field7884 && class295.field3874 < 2) {
            return;
        }
        if (arg3.equalsIgnoreCase("errortest")) {
            throw new RuntimeException();
        }
        if (arg3.equals("nativememerror")) {
            throw new OutOfMemoryError("native(MPR");
        }
        try {
            if (arg3.equalsIgnoreCase("fpson")) {
                class75.field787 = true;
                class446.method2473("fps debug enabled", (byte) 101);
                return;
            }
            if (arg3.equalsIgnoreCase("fpsoff")) {
                class75.field787 = false;
                class446.method2473("fps debug disabled", (byte) 119);
                return;
            }
            if (arg3.equals("systemmem")) {
                try {
                    class446.method2473("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb", (byte) 100);
                    return;
                } catch (Throwable var31) {
                    return;
                }
            }
            if (arg3.equalsIgnoreCase("cls")) {
                class37.field413 = 0;
                class154.field1735 = 0;
                return;
            }
            if (arg3.equalsIgnoreCase("cleartext")) {
                class224.field2837.method85(25042);
                class446.method2473("Text coords cleared", (byte) 126);
                return;
            }
            if (arg3.equalsIgnoreCase("gc")) {
                class601.method3357(arg2 - 195);
                for (int var4 = 0; var4 < 10; var4++) {
                    System.gc();
                }
                Runtime var5 = Runtime.getRuntime();
                int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
                class446.method2473("mem=" + var6 + "k", (byte) 92);
                return;
            }
            if (arg3.equalsIgnoreCase("compact")) {
                class601.method3357(104);
                for (int var7 = 0; var7 < 10; var7++) {
                    System.gc();
                }
                Runtime var8 = Runtime.getRuntime();
                int var9 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
                class446.method2473("Memory before cleanup=" + var9 + "k", (byte) 126);
                class595.method3333(-125);
                class601.method3357(-47);
                for (int var10 = 0; var10 < 10; var10++) {
                    System.gc();
                }
                int var11 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
                class446.method2473("Memory after cleanup=" + var11 + "k", (byte) 113);
                return;
            }
            if (arg3.equalsIgnoreCase("unloadnatives")) {
                class446.method2473(class655.method3700((byte) -98) ? "Libraries unloaded" : "Library unloading failed!", (byte) 119);
                return;
            }
            if (arg3.equalsIgnoreCase("pcachesize")) {
                class446.method2473("Number of player models in cache:" + class277.method1573(1), (byte) 120);
                return;
            }
            if (arg3.equalsIgnoreCase("clientdrop")) {
                class446.method2473("Dropped client connection", (byte) 115);
                if (class351.field4601 == 10) {
                    class548.method3097(-120);
                    return;
                }
                if (class351.field4601 == 11) {
                    class236.field3000 = true;
                }
                return;
            }
            if (arg3.equalsIgnoreCase("rotateconnectmethods")) {
                class277.field3494.method1746(0);
                class446.method2473("Rotated connection methods", (byte) 91);
                return;
            }
            if (arg3.equalsIgnoreCase("clientjs5drop")) {
                class448.field6156.method2487(false);
                class446.method2473("Dropped client js5 net queue", (byte) 113);
                return;
            }
            if (arg3.equalsIgnoreCase("serverjs5drop")) {
                class448.field6156.method2491(arg2 ^ 0x9);
                class446.method2473("Dropped server js5 net queue", (byte) 92);
                return;
            }
            if (arg3.equalsIgnoreCase("breakcon")) {
                class623.field8837.method3143(5000);
                class170.field2043.method1645(-22678);
                class448.field6156.method2477((byte) 12);
                class446.method2473("Breaking new connections for 5 seconds", (byte) 114);
                return;
            }
            if (arg3.equalsIgnoreCase("rebuild")) {
                class675.method3778((byte) 125);
                class622.method3488(6065);
                class446.method2473("Rebuilding map", (byte) 121);
                return;
            }
            if (arg3.equalsIgnoreCase("wm1")) {
                class472.method2676(1, -1, arg2 ^ 0x7B, false, -1);
                if (class480.method2800(32032) != 1) {
                    class446.method2473("wm1 failed", (byte) 97);
                    return;
                }
                class446.method2473("wm1 succeeded", (byte) 94);
                return;
            }
            if (arg3.equalsIgnoreCase("wm2")) {
                class472.method2676(2, -1, 0, false, -1);
                if (class480.method2800(arg2 + 31909) == 2) {
                    class446.method2473("wm2 succeeded", (byte) 97);
                    return;
                }
                class446.method2473("wm2 failed", (byte) 118);
                return;
            }
            if (arg3.equalsIgnoreCase("wm3")) {
                class472.method2676(3, 1024, 0, false, 768);
                if (class480.method2800(32032) != 3) {
                    class446.method2473("wm3 failed", (byte) 114);
                    return;
                }
                class446.method2473("wm3 succeeded", (byte) 93);
                return;
            }
            if (arg3.equalsIgnoreCase("tk0")) {
                class466.method2646(8000, 0);
                if (class150.field1711 == 0) {
                    class446.method2473("Entered tk0", (byte) 103);
                    class601.field8530.field2884 = 0;
                    class601.field8530.method1841(122, class623.field8837);
                    class272.field3441 = false;
                    return;
                }
                class446.method2473("Failed to enter tk0", (byte) 95);
                return;
            }
            if (arg3.equalsIgnoreCase("tk1")) {
                class466.method2646(arg2 + 7877, 1);
                if (class150.field1711 != 1) {
                    class446.method2473("Failed to enter tk1", (byte) 107);
                    return;
                }
                class446.method2473("Entered tk1", (byte) 105);
                class601.field8530.field2884 = 1;
                class601.field8530.method1841(126, class623.field8837);
                class272.field3441 = false;
                return;
            }
            if (arg3.equalsIgnoreCase("tk2")) {
                class466.method2646(8000, 2);
                if (class150.field1711 != 2) {
                    class446.method2473("Failed to enter tk2", (byte) 116);
                    return;
                }
                class446.method2473("Entered tk2", (byte) 104);
                class601.field8530.field2884 = 2;
                class601.field8530.method1841(124, class623.field8837);
                class272.field3441 = false;
                return;
            }
            if (arg3.equalsIgnoreCase("tk3")) {
                class466.method2646(8000, 3);
                if (class150.field1711 == 3) {
                    class446.method2473("Entered tk3", (byte) 114);
                    class601.field8530.field2884 = 3;
                    class601.field8530.method1841(125, class623.field8837);
                    class272.field3441 = false;
                    return;
                }
                class446.method2473("Failed to enter tk3", (byte) 117);
                return;
            }
            if (arg3.equalsIgnoreCase("tk4")) {
                class466.method2646(8000, 4);
                if (class150.field1711 == 4) {
                    class446.method2473("Entered tk4", (byte) 112);
                    class601.field8530.field2884 = 4;
                    class601.field8530.method1841(arg2 - 1, class623.field8837);
                    class272.field3441 = false;
                    return;
                }
                class446.method2473("Failed to enter tk4", (byte) 108);
                return;
            }
            if (arg3.equalsIgnoreCase("tk5")) {
                class466.method2646(arg2 + 7877, 5);
                if (class150.field1711 == 5) {
                    class446.method2473("Entered tk5", (byte) 124);
                    class601.field8530.field2884 = 5;
                    class601.field8530.method1841(124, class623.field8837);
                    class272.field3441 = false;
                    return;
                }
                class446.method2473("Failed to enter tk5", (byte) 126);
                return;
            }
            if (arg3.equalsIgnoreCase("ot")) {
                class601.field8530.field2845 = !class601.field8530.field2845;
                class601.field8530.method1841(arg2 - 3, class623.field8837);
                class272.field3441 = false;
                class675.method3778((byte) 125);
                class446.method2473("ot=" + class601.field8530.field2845, (byte) 95);
                return;
            }
            if (arg3.equalsIgnoreCase("gb")) {
                class601.field8530.field2860 = !class601.field8530.field2860;
                class601.field8530.method1841(122, class623.field8837);
                class272.field3441 = false;
                class675.method3778((byte) 125);
                class446.method2473("gb=" + class601.field8530.field2860, (byte) 102);
                return;
            }
            if (arg3.startsWith("shadows")) {
                if (arg3.length() < 8) {
                    class446.method2473("Invalid shadows value", (byte) 124);
                    return;
                }
                String var12 = arg3.substring(8);
                int var13 = class630.method3530(74, var12) ? class399.method2185(var12, (byte) -34) : -1;
                if (var13 >= 0 && var13 <= 2) {
                    class601.field8530.method1318(class150.field1711, var13, arg2 + 4);
                    class601.field8530.method1841(120, class623.field8837);
                    class272.field3441 = false;
                    class675.method3778((byte) 125);
                    class446.method2473("shadows=" + var13, (byte) 124);
                    return;
                }
                class446.method2473("Invalid shadows value", (byte) 119);
                return;
            }
            if (arg3.startsWith("textures")) {
                class601.field8530.field2876 = !class601.field8530.field2876;
                class601.field8530.method1841(arg2 + 3, class623.field8837);
                class272.field3441 = false;
                class593.method3325((byte) -98);
                class675.method3778((byte) 126);
                class446.method2473("textures=" + class601.field8530.field2876, (byte) 110);
                return;
            }
            if (arg3.startsWith("lighting")) {
                class601.field8530.method1319(class150.field1711, !class601.field8530.method1320(arg2 ^ 0x20, class150.field1711), (byte) 66);
                class601.field8530.method1841(123, class623.field8837);
                class272.field3441 = false;
                class89.method558(0);
                class593.method3325((byte) -121);
                class675.method3778((byte) 125);
                class446.method2473("lighting=" + class601.field8530.method1320(87, class150.field1711), (byte) 95);
                return;
            }
            if (arg3.startsWith("setba")) {
                if (arg3.length() < 6) {
                    class446.method2473("Invalid buildarea value", (byte) 105);
                    return;
                }
                int var14 = class399.method2185(arg3.substring(6), (byte) -34);
                if (var14 >= 0 && class601.method3360(class145.field1630, (byte) 3) >= var14) {
                    class601.field8530.field2854 = var14;
                    class601.field8530.method1841(125, class623.field8837);
                    class272.field3441 = false;
                    class446.method2473("maxbuildarea=" + class601.field8530.field2854, (byte) 124);
                    return;
                }
                class446.method2473("Invalid buildarea value", (byte) 127);
                return;
            }
            if (arg3.startsWith("setparticles")) {
                if (arg3.length() < 13) {
                    class446.method2473("Invalid particles value", (byte) 112);
                    return;
                }
                class178.method1049((byte) 34, class399.method2185(arg3.substring(13), (byte) -34));
                class601.field8530.method1841(arg2 - 3, class623.field8837);
                class272.field3441 = false;
                class446.method2473("particles=" + class376.method2066((byte) 1), (byte) 96);
                return;
            }
            if (arg3.startsWith("rect_debug")) {
                if (arg3.length() < 10) {
                    class446.method2473("Invalid rect_debug value", (byte) 100);
                    return;
                }
                class268.field3380 = class399.method2185(arg3.substring(10).trim(), (byte) -34);
                class446.method2473("rect_debug=" + class268.field3380, (byte) 92);
                return;
            }
            if (arg3.equalsIgnoreCase("qa_op_test")) {
                class87.field933 = true;
                class446.method2473("qa_op_test=" + class87.field933, (byte) 126);
                return;
            }
            if (arg3.equalsIgnoreCase("clipcomponents")) {
                class641.field9076 = !class641.field9076;
                class446.method2473("clipcomponents=" + class641.field9076, (byte) 106);
                return;
            }
            if (arg3.startsWith("bloom")) {
                boolean var15 = class453.field6284.method310();
                if (!class445.method2464(!var15, (byte) -27)) {
                    class446.method2473("Failed to enable bloom", (byte) 116);
                    return;
                }
                if (!var15) {
                    class446.method2473("Bloom enabled", (byte) 93);
                    return;
                }
                class446.method2473("Bloom disabled", (byte) 107);
                return;
            }
            if (arg3.equalsIgnoreCase("tween")) {
                if (class504.field7259) {
                    class504.field7259 = false;
                    class446.method2473("Forced tweening disabled.", (byte) 92);
                    return;
                }
                class504.field7259 = true;
                class446.method2473("Forced tweening ENABLED!", (byte) 126);
                return;
            }
            if (arg3.equalsIgnoreCase("shiftclick")) {
                if (!class602.field8543) {
                    class446.method2473("Shift-click ENABLED!", (byte) 106);
                    class602.field8543 = true;
                    return;
                }
                class446.method2473("Shift-click disabled.", (byte) 104);
                class602.field8543 = false;
                return;
            }
            if (arg3.equalsIgnoreCase("getcgcoord")) {
                class446.method2473("x:" + (class377.field4914.field4641 >> 9) + " z:" + (class377.field4914.field4647 >> 9), (byte) 103);
                return;
            }
            if (arg3.equalsIgnoreCase("getheight")) {
                class446.method2473("Height: " + class628.field8912[class377.field4914.field4638].method253(class377.field4914.field4641 >> 7, class377.field4914.field4647 >> 7), (byte) 94);
                return;
            }
            if (arg3.equalsIgnoreCase("resetminimap")) {
                class633.field8972.method1731((byte) -98);
                class633.field8972.method1732(false);
                class536.field7655.method2777(34);
                class147.field1644.method1969(93);
                class622.method3488(arg2 + 5942);
                class446.method2473("Minimap reset", (byte) 101);
                return;
            }
            if (arg3.startsWith("mc")) {
                if (!class453.field6284.method386()) {
                    class446.method2473("Current toolkit doesn't support multiple cores", (byte) 120);
                    return;
                }
                int var16 = Integer.parseInt(arg3.substring(3));
                if (var16 < 1) {
                    var16 = 1;
                } else if (var16 > 4) {
                    var16 = 4;
                }
                class665.field9458 = var16;
                class453.field6284.method333(class665.field9458);
                class453.field6284.method288(0);
                class446.method2473("Render cores now: " + class665.field9458, (byte) 118);
                return;
            }
            if (arg3.startsWith("cachespace")) {
                class446.method2473("I(s): " + class645.field9139.method3686(-125) + "/" + class645.field9139.method3692(0), (byte) 119);
                class446.method2473("I(m): " + class522.field7475.method3686(-101) + "/" + class522.field7475.method3692(0), (byte) 127);
                class446.method2473("O(s): " + class472.field6588.field4465.method3589(0) + "/" + class472.field6588.field4465.method3592(false), (byte) 94);
                return;
            }
            if (arg3.equalsIgnoreCase("getcamerapos")) {
                class446.method2473("Pos: " + class377.field4914.field4638 + "," + ((class345.field4493 >> 9) + class682.field9685 >> 6) + "," + ((class662.field9411 >> 9) + class146.field1642 >> 6) + "," + ((class345.field4493 >> 9) + class682.field9685 & 0x3F) + "," + ((class662.field9411 >> 9) + class146.field1642 & 0x3F) + " Height: " + (class363.method1995(class377.field4914.field4638, class662.field9411, arg2 - 1327568530, class345.field4493) - class150.field1707), (byte) 113);
                class446.method2473("Look: " + class377.field4914.field4638 + "," + (class682.field9685 + class399.field5335 >> 6) + "," + (class566.field8023 + class146.field1642 >> 6) + "," + (class399.field5335 + class682.field9685 & 0x3F) + "," + (class566.field8023 + class146.field1642 & 0x3F) + " Height: " + (class363.method1995(class377.field4914.field4638, class566.field8023, arg2 ^ 0xB0DEE992, class399.field5335) - class422.field5624), (byte) 107);
                return;
            }
            if (arg3.equals("showocc")) {
                class544.field7795 = !class544.field7795;
                class675.method3778((byte) 127);
                class446.method2473("showocc=" + class544.field7795, (byte) 108);
                return;
            }
            if (arg3.equals("wallocc")) {
                class473.field6611 = !class473.field6611;
                class675.method3778((byte) 126);
                class446.method2473("forcewallocc=" + class473.field6611, (byte) 122);
                return;
            }
            if (arg3.equals("renderprofile") || arg3.equals("rp")) {
                class54.field553 = !class54.field553;
                class453.field6284.method346(class54.field553);
                class309.method1759(arg2 ^ 0x18);
                class446.method2473("showprofiling=" + class54.field553, (byte) 92);
                return;
            }
            if (arg3.startsWith("performancetest")) {
                int var17 = -1;
                int var18 = 1000;
                if (arg3.length() > 15) {
                    String[] var19 = class107.method674(arg3, 1, ' ');
                    try {
                        if (var19.length > 1) {
                            var18 = Integer.parseInt(var19[1]);
                        }
                    } catch (Throwable var33) {
                    }
                    try {
                        if (var19.length > 2) {
                            var17 = Integer.parseInt(var19[2]);
                        }
                    } catch (Throwable var32) {
                    }
                }
                if (var17 == -1) {
                    class446.method2473("Java toolkit: " + class362.method1990((byte) 50, 0, var18), (byte) 117);
                    class446.method2473("SSE toolkit:  " + class362.method1990((byte) 50, 2, var18), (byte) 120);
                    class446.method2473("D3D toolkit:  " + class362.method1990((byte) 50, 3, var18), (byte) 98);
                    class446.method2473("GL toolkit:   " + class362.method1990((byte) 50, 1, var18), (byte) 110);
                    class446.method2473("GLX toolkit:  " + class362.method1990((byte) 50, 5, var18), (byte) 110);
                    return;
                }
                class446.method2473("Performance: " + class362.method1990((byte) 50, class150.field1711, var18), (byte) 123);
                return;
            }
            if (arg3.equals("renderer")) {
                class482 var20 = class453.field6284.method298();
                class446.method2473("Vendor: " + var20.field7050, (byte) 100);
                class446.method2473("Name: " + var20.field7047, (byte) 114);
                class446.method2473("Version: " + var20.field7048, (byte) 122);
                class446.method2473("Device: " + var20.field7051, (byte) 124);
                class446.method2473("Driver Version: " + var20.field7049, (byte) 92);
                return;
            }
            if (arg3.equals("nonpcs")) {
                class15.field140 = !class15.field140;
                class446.method2473("nonpcs=" + class15.field140, (byte) 112);
                return;
            }
            if (arg3.equals("autoworld")) {
                class223.method1312((byte) -35);
                class446.method2473("auto world selected", (byte) 99);
                return;
            }
            if (arg3.startsWith("switchworld")) {
                int var21 = Integer.parseInt(arg3.substring(12));
                class485.method2815(class383.method2108((byte) 81, var21).field8717, -32012, var21);
                class446.method2473("switched", (byte) 118);
                return;
            }
            if (arg3.equals("getworld")) {
                class446.method2473("w: " + class277.field3494.field3986, (byte) 123);
                return;
            }
            if (arg3.startsWith("pc")) {
                class480.method2802(class592.field8421, 16751);
                class334.field4314.method2525(0, -81849);
                int var22 = class334.field4314.field6215;
                int var23 = arg3.indexOf(" ", 4);
                class334.field4314.method2573(arg3.substring(3, var23), arg2 ^ 0x4111);
                class562.method3166(arg2 ^ 0x47B, class334.field4314, arg3.substring(var23));
                class334.field4314.method2551(class334.field4314.field6215 - var22, 44);
                return;
            }
            if (arg3.equals("heap")) {
                class446.method2473("Heap: " + class145.field1630 + "MB", (byte) 101);
                return;
            }
            if (arg3.equals("savevarcs")) {
                class321.method1813(913);
                class446.method2473("perm varcs saved", (byte) 106);
                return;
            }
            if (arg3.equals("scramblevarcs")) {
                for (int var24 = 0; var24 < class585.field8313.length; var24++) {
                    if (class462.field6424[var24]) {
                        class585.field8313[var24] = (int) (Math.random() * 99999.0D);
                        if (Math.random() > 0.5D) {
                            class585.field8313[var24] *= -1;
                        }
                    }
                }
                class321.method1813(913);
                class446.method2473("perm varcs scrambled", (byte) 109);
                return;
            }
            if (arg3.equals("showcolmap")) {
                class341.field4433 = true;
                class622.method3488(6065);
                class446.method2473("colmap is shown", (byte) 109);
                return;
            }
            if (arg3.equals("hidecolmap")) {
                class341.field4433 = false;
                class622.method3488(arg2 ^ 0x17CA);
                class446.method2473("colmap is hidden", (byte) 105);
                return;
            }
            if (arg3.equals("resetcache")) {
                class99.method612(-28086);
                class446.method2473("Caches reset", (byte) 107);
                return;
            }
            if (arg3.equals("profilecpu")) {
                class446.method2473(class453.method2579(100) + "ms", (byte) 118);
                return;
            }
            if (arg3.startsWith("cpuusage")) {
                int var25 = Integer.parseInt(arg3.substring(9));
                if (var25 >= 0 && var25 <= 4) {
                    class601.field8530.field2857 = var25;
                }
                class446.method2473("cpuusage=" + class601.field8530.field2857, (byte) 102);
                return;
            }
            if (arg3.startsWith("getclientvarpbit")) {
                int var26 = Integer.parseInt(arg3.substring(17));
                class446.method2473("varpbit=" + class491.field7127.method1372(var26, (byte) -114), (byte) 121);
                return;
            }
            if (arg3.startsWith("getclientvarp")) {
                int var27 = Integer.parseInt(arg3.substring(14));
                class446.method2473("varp=" + class491.field7127.method1371(var27, -13366), (byte) 104);
                return;
            }
            if (arg3.startsWith("demologin")) {
                class210.method1264(0, (byte) -121, false);
                return;
            }
            if (arg3.startsWith("newdemologin")) {
                class210.method1264(0, (byte) -123, true);
                return;
            }
            if (arg3.startsWith("directlogin")) {
                String[] var28 = class107.method674(arg3.substring(12), 1, ' ');
                if (var28.length >= 2) {
                    int var29 = var28.length <= 2 ? 0 : Integer.parseInt(var28[2]);
                    class267.method1510(var28[0], arg2 + 29353, var28[1], var29);
                    return;
                }
            }
            if (arg3.startsWith("csprofileclear")) {
                class364.method2006();
                return;
            }
            if (arg3.startsWith("csprofileoutputc")) {
                class364.method2010(100, false);
                return;
            }
            if (arg3.startsWith("csprofileoutputt")) {
                class364.method2010(10, true);
                return;
            }
            if (arg3.startsWith("texsize")) {
                int var30 = Integer.parseInt(arg3.substring(8));
                class453.field6284.method307(var30);
                return;
            }
            if (arg3.equals("soundstreamcount")) {
                class446.method2473("Active streams: " + class424.field5641.method2853(), (byte) 95);
                return;
            }
            if (arg3.equals("autosetup")) {
                class601.field8530.method1827(54);
                class446.method2473("Complete. Toolkit now: " + class150.field1711, (byte) 100);
                return;
            }
            if (arg3.equals("errormessage")) {
                class446.method2473(class239.field3025.method1531(-1), (byte) 110);
                return;
            }
            if (class351.field4601 == 10) {
                class147.field1643++;
                class480.method2802(class207.field2520, 16751);
                class334.field4314.method2525(arg3.length() + 3, -81849);
                class334.field4314.method2525(arg1 ? 1 : 0, -81849);
                class334.field4314.method2525(arg0 ? 1 : 0, -81849);
                class334.field4314.method2573(arg3, 16746);
            }
            if (arg3.startsWith("fps ") && class73.field771 != class553.field7884) {
                class435.method2322(-910, class399.method2185(arg3.substring(4), (byte) -34));
                return;
            }
            if (class351.field4601 != 10) {
                class446.method2473("Unrecogonised commmand when not logged in: " + arg3, (byte) 120);
                return;
            }
        } catch (Exception var34) {
            class446.method2473("Whoops, something went wrong.", (byte) 111);
            return;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V", line = 922)
    public static void method1867(int arg0) {
        if (arg0 == 10) {
            field4290 = null;
            field4299 = null;
            field4291 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V", line = 935)
    public final void method1868(byte arg0) {
        field4289++;
        int var2 = -27 / ((arg0 + 22) / 63);
        class653 var3 = this.field4298;
        synchronized (this.field4298) {
            this.field4298.method3687((byte) -10);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IBILpi;I)V", line = 956)
    public static final void method1869(int arg0, byte arg1, int arg2, class455 arg3, int arg4) {
        field4300++;
        int var5 = arg3.field3839[0];
        int var6 = arg3.field3841[0];
        if (var5 < 0 || var5 >= class399.field5338 || var6 < 0 || class349.field4567 <= var6 || arg2 < 0 || arg2 >= class399.field5338 || arg4 < 0 || class349.field4567 <= arg4) {
            return;
        }
        int var7 = class292.method1662(0, class7.field57, arg4, -4, class475.field6919[arg3.field4638], 0, -116, 0, true, arg2, class475.field6920, 0, arg3.method1656(true), var6, var5);
        int var8 = -115 / ((-arg0 - 6) / 60);
        if (var7 >= 1 && var7 <= 3) {
            for (int var9 = 0; var9 < (var7 - 1); var9++) {
                arg3.method2584(class7.field57[var9], (byte) 54, arg1, class475.field6920[var9]);
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)V", line = 994)
    public static final void method1870(byte arg0) {
        class653.field9339.method1803(false);
        field4292++;
        class407.field5419.method157((byte) -43);
        if (arg0 != 79) {
            return;
        }
        class239.field3025.method3011((byte) -41);
        class220.field2664.setBackground(Color.black);
        class566.field8019 = -1;
        class653.field9339 = class381.method2086(-11356, class220.field2664);
        class407.field5419 = class678.method3784(class220.field2664, true, arg0 - 74);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V", line = 1017)
    public static final void method1871(boolean arg0) {
        if (!arg0) {
            method1867(74);
        }
        field4294++;
        int var1 = client.field3410.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (client.field3410[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class194.field2335; var4++) {
                    if (class287.field3696[var2] == class221.field2786[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class221.field2786[class194.field2335] = class287.field3696[var2];
                    var3 = class194.field2335++;
                }
                class452 var5 = new class452(client.field3410[var2]);
                int var6 = 0;
                while (client.field3410[var2].length > var5.field6215 && var6 < 511 && class118.field1356 < 1023) {
                    int var7 = var3 | var6++ << 6;
                    int var8 = var5.method2574(-1758460248);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = var8 & 0x3F;
                    int var12 = (class287.field3696[var2] >> 8) * 64 - (class682.field9685 - var10);
                    int var13 = (class287.field3696[var2] & 0xFF) * 64 + var11 - class146.field1642;
                    class23 var14 = class608.field8585.method3273(-1119, var5.method2574(-1758460248));
                    class443 var15 = (class443) class392.field5223.method3234((byte) -88, (long) var7);
                    if (var15 == null && (var14.field258 & 0x1) > 0 && class676.field9588 == var9 && var12 >= 0 && class399.field5338 > (var14.field234 + var12) && var13 >= 0 && var13 + var14.field234 < class349.field4567) {
                        class625 var16 = new class625();
                        var16.field3784 = var7;
                        class443 var17 = new class443(var16);
                        class392.field5223.method3235((long) var7, -1, var17);
                        class609.field8605[class208.field2528++] = var17;
                        class664.field9449[class118.field1356++] = var7;
                        var16.field3734 = class469.field6549;
                        var16.method3501(var14, 65);
                        var16.method1664((byte) 112, var16.field8855.field234);
                        var16.field3792 = var16.field8855.field232 << 3;
                        var16.method1648(true, var16.field8855.field233 + 4 << 11 & 0x3963, (byte) -96);
                        var16.method3497(var9, true, var12, var16.method1656(true), -84, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IB)V", line = 1122)
    public final void method1872(int arg0, byte arg1) {
        if (arg1 <= 13) {
            method1867(-34);
        }
        field4296++;
        class653 var3 = this.field4298;
        synchronized (this.field4298) {
            this.field4298.method3691(false, arg0);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)Lbda;", line = 1137)
    public final class462 method1873(int arg0, int arg1) {
        field4293++;
        class653 var3 = this.field4298;
        class462 var4;
        synchronized (this.field4298) {
            var4 = (class462) this.field4298.method3690((byte) 125, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class303 var5 = this.field4297;
        byte[] var6;
        synchronized (this.field4297) {
            var6 = this.field4297.method1719(arg1, 1, 4);
        }
        class462 var7 = new class462();
        if (var6 != null) {
            var7.method2630(12359, new class452(var6));
        }
        class653 var8 = this.field4298;
        synchronized (this.field4298) {
            int var9 = 53 / ((9 - arg0) / 36);
            this.field4298.method3683(var7, (byte) 113, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Ljda;ILjo;)V", line = 1168)
    public class332(class207 arg0, int arg1, class303 arg2) {
        this.field4297 = arg2;
        this.field4297.method1727(-77, 1);
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V", line = 1183)
    public final void method1874(int arg0) {
        field4295++;
        class653 var2 = this.field4298;
        synchronized (this.field4298) {
            this.field4298.method3684(arg0 - 17204);
            if (arg0 != 4) {
                this.field4297 = null;
            }
        }
    }
}
