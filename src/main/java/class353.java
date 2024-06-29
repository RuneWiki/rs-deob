import jagex3.jagmisc.jagmisc;
import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class353 {

    @OriginalMember(owner = "client!j", name = "d", descriptor = "I")
    private int field4754 = -1;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "I")
    private int field4761 = 0;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "Lgk;")
    private class616 field4753 = new class616();

    @OriginalMember(owner = "client!j", name = "o", descriptor = "Z")
    public boolean field4765 = false;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "I")
    private int field4758;

    @OriginalMember(owner = "client!j", name = "m", descriptor = "I")
    private int field4763;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "[[[I")
    private int[][][] field4756;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "[Lub;")
    private class407[] field4759;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "F")
    public static float field4755;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    public static int field4751;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "I")
    public static int field4752;

    @OriginalMember(owner = "client!j", name = "j", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!j", name = "l", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!j", name = "n", descriptor = "I")
    public static int field4764;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "Lpi;")
    public static class464 field4757;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V", line = 8)
    public static final void method2087(int arg0) {
        field4751++;
        if (class231.field2854) {
            return;
        }
        class119.field1336 = true;
        class231.field2854 = true;
        if (class639.field9075.field6762) {
            class654.field9173 = ((int) class654.field9173 - 17 & 0xFFFFFFF0);
        } else {
            class381.field5158 += (-12.0F - class381.field5158) / 2.0F;
        }
        if (arg0 != -1152722743) {
            field4755 = 1.3931047F;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ZZLjava/lang/String;I)V", line = 35)
    public static final void method2088(boolean arg0, boolean arg1, String arg2, int arg3) {
        if (arg3 != -1) {
            return;
        }
        field4762++;
        try {
            label664: {
                if (!arg2.equalsIgnoreCase("commands") && !arg2.equalsIgnoreCase("help")) {
                    if (!arg2.equalsIgnoreCase("cls")) {
                        if (arg2.equalsIgnoreCase("displayfps")) {
                            class585.field8296 = !class585.field8296;
                            if (class585.field8296) {
                                class415.method2335("FPS on", 11);
                                return;
                            }
                            class415.method2335("FPS off", arg3 ^ 0xFFFFFFF4);
                            return;
                        }
                        if (arg2.equals("renderer")) {
                            class286 var4 = class701.field9813.method1037();
                            class415.method2335("Vendor: " + var4.field3569, 11);
                            class415.method2335("Name: " + var4.field3574, 11);
                            class415.method2335("Version: " + var4.field3571, arg3 + 12);
                            class415.method2335("Device: " + var4.field3575, 11);
                            class415.method2335("Driver Version: " + var4.field3573, 11);
                            return;
                        }
                        if (arg2.equals("heap")) {
                            class415.method2335("Heap: " + class689.field9702 + "MB", arg3 + 12);
                            return;
                        }
                        break label664;
                    }
                    class90.field903 = 0;
                    class406.field5429 = 0;
                    return;
                }
                class415.method2335("commands - This command", 11);
                class415.method2335("cls - Clear console", 11);
                class415.method2335("displayfps - Toggle FPS and other information", 11);
                class415.method2335("renderer - Print graphics renderer information", 11);
                class415.method2335("heap - Print java memory information", 11);
                return;
            }
        } catch (Exception var36) {
            class415.method2335(class198.field2287.method1195((byte) 62, class504.field7267), 11);
            return;
        }
        if (class364.field4875 != class337.field4237 || class296.field3704 >= 2) {
            if (arg2.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg2.equals("nativememerror")) {
                throw new OutOfMemoryError("native(MPR");
            }
            try {
                if (arg2.equalsIgnoreCase("printfps")) {
                    class415.method2335("FPS: " + class359.field4816, arg3 + 12);
                    return;
                }
                if (arg2.equalsIgnoreCase("occlude")) {
                    class321.field3945 = !class321.field3945;
                    if (!class321.field3945) {
                        class415.method2335("Occlsion now off!", 11);
                        return;
                    }
                    class415.method2335("Occlsion now on!", arg3 + 12);
                    return;
                }
                if (arg2.equalsIgnoreCase("fpson")) {
                    class585.field8296 = true;
                    class415.method2335("fps debug enabled", 11);
                    return;
                }
                if (arg2.equalsIgnoreCase("fpsoff")) {
                    class585.field8296 = false;
                    class415.method2335("fps debug disabled", 11);
                    return;
                }
                if (arg2.equals("systemmem")) {
                    try {
                        class415.method2335("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb", 11);
                        return;
                    } catch (Throwable var32) {
                        return;
                    }
                }
                if (arg2.equalsIgnoreCase("cleartext")) {
                    class473.field6810.method1666((byte) 71);
                    class415.method2335("Text coords cleared", 11);
                    return;
                }
                if (arg2.equalsIgnoreCase("gc")) {
                    class24.method123((byte) 119);
                    for (int var5 = 0; var5 < 10; var5++) {
                        System.gc();
                    }
                    Runtime var6 = Runtime.getRuntime();
                    int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                    class415.method2335("mem=" + var7 + "k", arg3 + 12);
                    return;
                }
                if (arg2.equalsIgnoreCase("compact")) {
                    class24.method123((byte) 122);
                    for (int var8 = 0; var8 < 10; var8++) {
                        System.gc();
                    }
                    Runtime var9 = Runtime.getRuntime();
                    int var10 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                    class415.method2335("Memory before cleanup=" + var10 + "k", 11);
                    class236.method1411((byte) -107);
                    class24.method123((byte) 123);
                    for (int var11 = 0; var11 < 10; var11++) {
                        System.gc();
                    }
                    int var12 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                    class415.method2335("Memory after cleanup=" + var12 + "k", arg3 + 12);
                    return;
                }
                if (arg2.equalsIgnoreCase("unloadnatives")) {
                    class415.method2335(class226.method1363(64) ? "Libraries unloaded" : "Library unloading failed!", arg3 ^ 0xFFFFFFF4);
                    return;
                }
                if (arg2.equalsIgnoreCase("clientdrop")) {
                    class415.method2335("Dropped client connection", 11);
                    if (class421.field5601 == 10) {
                        class254.method1505(-22614);
                    } else if (class421.field5601 == 11) {
                        class163.field1818 = true;
                        return;
                    }
                    return;
                }
                if (arg2.equalsIgnoreCase("rotateconnectmethods")) {
                    class117.field1294.method1087(0);
                    class415.method2335("Rotated connection methods", arg3 ^ 0xFFFFFFF4);
                    return;
                }
                if (arg2.equalsIgnoreCase("clientjs5drop")) {
                    class510.field7323.method901(false);
                    class415.method2335("Dropped client js5 net queue", arg3 + 12);
                    return;
                }
                if (arg2.equalsIgnoreCase("serverjs5drop")) {
                    class510.field7323.method900((byte) -120);
                    class415.method2335("Dropped server js5 net queue", 11);
                    return;
                }
                if (arg2.equalsIgnoreCase("breakcon")) {
                    field4757.method2673((byte) -47);
                    class99.field1061.method1513(98);
                    class510.field7323.method893(false);
                    class415.method2335("Breaking new connections for 5 seconds", 11);
                    return;
                }
                if (arg2.equalsIgnoreCase("rebuild")) {
                    class403.method2266((byte) 80);
                    class527.method2968((byte) -26);
                    class415.method2335("Rebuilding map", 11);
                    return;
                }
                if (arg2.equalsIgnoreCase("rebuildprofile")) {
                    class213.field2596 = class557.method3157(arg3 ^ 0x6B);
                    class458.field6501 = true;
                    class403.method2266((byte) 80);
                    class527.method2968((byte) -26);
                    class415.method2335("Rebuilding map (with profiling)", 11);
                    return;
                }
                if (arg2.equalsIgnoreCase("wm1")) {
                    class103.method561(false, (byte) 15, -1, -1, 1);
                    if (class201.method1206(97) == 1) {
                        class415.method2335("wm1 succeeded", 11);
                        return;
                    }
                    class415.method2335("wm1 failed", 11);
                    return;
                }
                if (arg2.equalsIgnoreCase("wm2")) {
                    class103.method561(false, (byte) 15, -1, -1, 2);
                    if (class201.method1206(99) != 2) {
                        class415.method2335("wm2 failed", arg3 ^ 0xFFFFFFF4);
                        return;
                    }
                    class415.method2335("wm2 succeeded", arg3 ^ 0xFFFFFFF4);
                    return;
                }
                if (arg2.equalsIgnoreCase("wm3")) {
                    class103.method561(false, (byte) 15, 1024, 768, 3);
                    if (class201.method1206(65) == 3) {
                        class415.method2335("wm3 succeeded", arg3 ^ 0xFFFFFFF4);
                        return;
                    }
                    class415.method2335("wm3 failed", arg3 ^ 0xFFFFFFF4);
                    return;
                }
                if (arg2.equalsIgnoreCase("tk0")) {
                    class434.method2489(0, (byte) 95);
                    if (class430.field6109 == 0) {
                        class415.method2335("Entered tk0", arg3 + 12);
                        class639.field9075.field6777 = 0;
                        class639.field9075.method2642(-2, field4757);
                        class389.field5269 = false;
                        return;
                    }
                    class415.method2335("Failed to enter tk0", 11);
                    return;
                }
                if (arg2.equalsIgnoreCase("tk1")) {
                    class434.method2489(1, (byte) 31);
                    if (class430.field6109 == 1) {
                        class415.method2335("Entered tk1", 11);
                        class639.field9075.field6777 = 1;
                        class639.field9075.method2642(-2, field4757);
                        class389.field5269 = false;
                        return;
                    }
                    class415.method2335("Failed to enter tk1", arg3 ^ 0xFFFFFFF4);
                    return;
                }
                if (arg2.equalsIgnoreCase("tk2")) {
                    class434.method2489(2, (byte) -104);
                    if (class430.field6109 == 2) {
                        class415.method2335("Entered tk2", arg3 + 12);
                        class639.field9075.field6777 = 2;
                        class639.field9075.method2642(-2, field4757);
                        class389.field5269 = false;
                        return;
                    }
                    class415.method2335("Failed to enter tk2", 11);
                    return;
                }
                if (arg2.equalsIgnoreCase("tk3")) {
                    class434.method2489(3, (byte) -111);
                    if (class430.field6109 == 3) {
                        class415.method2335("Entered tk3", 11);
                        class639.field9075.field6777 = 3;
                        class639.field9075.method2642(-2, field4757);
                        class389.field5269 = false;
                        return;
                    }
                    class415.method2335("Failed to enter tk3", 11);
                    return;
                }
                if (arg2.equalsIgnoreCase("tk5")) {
                    class434.method2489(5, (byte) -125);
                    if (class430.field6109 == 5) {
                        class415.method2335("Entered tk5", arg3 ^ 0xFFFFFFF4);
                        class639.field9075.field6777 = 5;
                        class639.field9075.method2642(-2, field4757);
                        class389.field5269 = false;
                        return;
                    }
                    class415.method2335("Failed to enter tk5", 11);
                    return;
                }
                if (arg2.equalsIgnoreCase("ot")) {
                    class639.field9075.field6795 = !class639.field9075.field6795;
                    class639.field9075.method2642(arg3 - 1, field4757);
                    class389.field5269 = false;
                    class403.method2266((byte) 80);
                    class415.method2335("ot=" + class639.field9075.field6795, arg3 + 12);
                    return;
                }
                if (arg2.equalsIgnoreCase("gb")) {
                    class639.field9075.field6792 = !class639.field9075.field6792;
                    class639.field9075.method2642(-2, field4757);
                    class389.field5269 = false;
                    class403.method2266((byte) 80);
                    class415.method2335("gb=" + class639.field9075.field6792, 11);
                    return;
                }
                if (arg2.startsWith("shadows")) {
                    if (arg2.length() < 8) {
                        class415.method2335("Invalid shadows value", 11);
                        return;
                    }
                    String var13 = arg2.substring(8);
                    int var14 = class63.method334(arg3 ^ 0xFFFFDB4D, var13) ? class274.method1607(var13, 1) : -1;
                    if (var14 >= 0 && var14 <= 2) {
                        class639.field9075.method2719(var14, (byte) 55, class430.field6109);
                        class639.field9075.method2642(-2, field4757);
                        class389.field5269 = false;
                        class403.method2266((byte) 80);
                        class415.method2335("shadows=" + var14, 11);
                        return;
                    }
                    class415.method2335("Invalid shadows value", 11);
                    return;
                }
                if (arg2.startsWith("textures")) {
                    class639.field9075.field6770 = !class639.field9075.field6770;
                    class639.field9075.method2642(arg3 - 1, field4757);
                    class389.field5269 = false;
                    class114.method609(-71);
                    class403.method2266((byte) 80);
                    class415.method2335("textures=" + class639.field9075.field6770, 11);
                    return;
                }
                if (arg2.startsWith("lighting")) {
                    class639.field9075.method2716(class430.field6109, (byte) 36, !class639.field9075.method2718(class430.field6109, (byte) 76));
                    class639.field9075.method2642(arg3 - 1, field4757);
                    class389.field5269 = false;
                    class173.method1055(arg3 + 1679);
                    class114.method609(arg3 ^ 0xFFFFFF9B);
                    class403.method2266((byte) 80);
                    class415.method2335("lighting=" + class639.field9075.method2718(class430.field6109, (byte) 76), arg3 ^ 0xFFFFFFF4);
                    return;
                }
                if (arg2.startsWith("setba")) {
                    if (arg2.length() < 6) {
                        class415.method2335("Invalid buildarea value", 11);
                        return;
                    }
                    int var15 = class274.method1607(arg2.substring(6), 1);
                    if (var15 >= 0 && var15 <= class118.method691(class689.field9702, (byte) -122)) {
                        class639.field9075.field6797 = var15;
                        class639.field9075.method2642(-2, field4757);
                        class389.field5269 = false;
                        class415.method2335("maxbuildarea=" + class639.field9075.field6797, 11);
                        return;
                    }
                    class415.method2335("Invalid buildarea value", 11);
                    return;
                }
                if (arg2.startsWith("rect_debug")) {
                    if (arg2.length() < 10) {
                        class415.method2335("Invalid rect_debug value", arg3 + 12);
                        return;
                    }
                    class593.field8373 = class274.method1607(arg2.substring(10).trim(), 1);
                    class415.method2335("rect_debug=" + class593.field8373, 11);
                    return;
                }
                if (arg2.equalsIgnoreCase("qa_op_test")) {
                    class590.field8339 = true;
                    class415.method2335("qa_op_test=" + class590.field8339, 11);
                    return;
                }
                if (arg2.equalsIgnoreCase("clipcomponents")) {
                    class683.field9625 = !class683.field9625;
                    class415.method2335("clipcomponents=" + class683.field9625, 11);
                    return;
                }
                if (arg2.startsWith("bloom")) {
                    boolean var16 = class701.field9813.method1044();
                    if (!class700.method3848(!var16, arg3 ^ 0xFFFFFF91)) {
                        class415.method2335("Failed to enable bloom", arg3 + 12);
                        return;
                    }
                    if (var16) {
                        class415.method2335("Bloom disabled", 11);
                        return;
                    }
                    class415.method2335("Bloom enabled", 11);
                    return;
                }
                if (arg2.equalsIgnoreCase("tween")) {
                    if (!class510.field7317) {
                        class510.field7317 = true;
                        class415.method2335("Forced tweening ENABLED!", arg3 ^ 0xFFFFFFF4);
                        return;
                    }
                    class510.field7317 = false;
                    class415.method2335("Forced tweening disabled.", 11);
                    return;
                }
                if (arg2.equalsIgnoreCase("shiftclick")) {
                    if (class701.field9845) {
                        class415.method2335("Shift-click disabled.", 11);
                        class701.field9845 = false;
                        return;
                    }
                    class415.method2335("Shift-click ENABLED!", 11);
                    class701.field9845 = true;
                    return;
                }
                if (arg2.equalsIgnoreCase("getcgcoord")) {
                    class415.method2335("x:" + (class362.field4859.field5179 >> 9) + " z:" + (class362.field4859.field5176 >> 9), 11);
                    return;
                }
                if (arg2.equalsIgnoreCase("getheight")) {
                    class415.method2335("Height: " + class156.field1743[class362.field4859.field5166].method1608(class362.field4859.field5176 >> 9, arg3 + 841, class362.field4859.field5179 >> 9), 11);
                    return;
                }
                if (arg2.equalsIgnoreCase("resetminimap")) {
                    class408.field5441.method3853(~arg3);
                    class408.field5441.method3867(false);
                    class689.field9695.method1113(false);
                    class247.field3060.method703(6);
                    class527.method2968((byte) -26);
                    class415.method2335("Minimap reset", 11);
                    return;
                }
                if (arg2.startsWith("mc")) {
                    if (!class701.field9813.method1052()) {
                        class415.method2335("Current toolkit doesn't support multiple cores", 11);
                        return;
                    }
                    int var17 = Integer.parseInt(arg2.substring(3));
                    if (var17 < 1) {
                        var17 = 1;
                    } else if (var17 > 4) {
                        var17 = 4;
                    }
                    class162.field1802 = var17;
                    class403.method2266((byte) 80);
                    class415.method2335("Render cores now: " + class162.field1802, 11);
                    return;
                }
                if (arg2.startsWith("cachespace")) {
                    class415.method2335("I(s): " + class196.field2265.method87(0) + "/" + class196.field2265.method79((byte) 40), 11);
                    class415.method2335("I(m): " + class602.field8467.method87(0) + "/" + class602.field8467.method79((byte) 40), 11);
                    class415.method2335("O(s): " + class19.field153.field540.method3167((byte) -126) + "/" + class19.field153.field540.method3161((byte) 66), 11);
                    return;
                }
                if (arg2.equalsIgnoreCase("getcamerapos")) {
                    class415.method2335("Pos: " + class362.field4859.field5166 + "," + ((class516.field7360 >> 9) + class26.field245 >> 6) + "," + ((class689.field9698 >> 9) + class231.field2860 >> 6) + "," + ((class516.field7360 >> 9) + class26.field245 & 0x3F) + "," + ((class689.field9698 >> 9) + class231.field2860 & 0x3F) + " Height: " + (class593.method3335(class689.field9698, class362.field4859.field5166, 27648, class516.field7360) - class44.field432), arg3 + 12);
                    class415.method2335("Look: " + class362.field4859.field5166 + "," + (class538.field7583 + class26.field245 >> 6) + "," + (class152.field1684 + class231.field2860 >> 6) + "," + (class538.field7583 + class26.field245 & 0x3F) + "," + (class231.field2860 + class152.field1684 & 0x3F) + " Height: " + (class593.method3335(class152.field1684, class362.field4859.field5166, 27648, class538.field7583) - class588.field8320), 11);
                    return;
                }
                if (arg2.equals("renderprofile") || arg2.equals("rp")) {
                    class257.field3232 = !class257.field3232;
                    class701.field9813.method954(class257.field3232);
                    class104.method566((byte) 56);
                    class415.method2335("showprofiling=" + class257.field3232, arg3 + 12);
                    return;
                }
                if (arg2.startsWith("performancetest")) {
                    int var18 = -1;
                    int var19 = 1000;
                    if (arg2.length() > 15) {
                        String[] var20 = class182.method1105(' ', (byte) -75, arg2);
                        try {
                            if (var20.length > 1) {
                                var19 = Integer.parseInt(var20[1]);
                            }
                        } catch (Throwable var34) {
                        }
                        try {
                            if (var20.length > 2) {
                                var18 = Integer.parseInt(var20[2]);
                            }
                        } catch (Throwable var33) {
                        }
                    }
                    if (var18 != -1) {
                        class415.method2335("Performance: " + class9.method55(var19, class430.field6109, true), 11);
                        return;
                    }
                    class415.method2335("Java toolkit: " + class9.method55(var19, 0, true), 11);
                    class415.method2335("SSE toolkit:  " + class9.method55(var19, 2, true), arg3 + 12);
                    class415.method2335("D3D toolkit:  " + class9.method55(var19, 3, true), 11);
                    class415.method2335("GL toolkit:   " + class9.method55(var19, 1, true), arg3 ^ 0xFFFFFFF4);
                    class415.method2335("GLX toolkit:  " + class9.method55(var19, 5, true), 11);
                    return;
                }
                if (arg2.equals("nonpcs")) {
                    class375.field5098 = !class375.field5098;
                    class415.method2335("nonpcs=" + class375.field5098, 11);
                    return;
                }
                if (arg2.equals("autoworld")) {
                    class669.method3701(-115);
                    class415.method2335("auto world selected", 11);
                    return;
                }
                if (arg2.startsWith("switchworld")) {
                    int var21 = Integer.parseInt(arg2.substring(12));
                    class291.method1699(var21, class63.method345(3, var21).field1461, 32506);
                    class415.method2335("switched", arg3 + 12);
                    return;
                }
                if (arg2.equals("getworld")) {
                    class415.method2335("w: " + class117.field1294.field2001, 11);
                    return;
                }
                if (arg2.startsWith("pc")) {
                    class653 var22 = class699.method3845((byte) 45, class39.field395, class222.field2759);
                    var22.field9158.method658(0, (byte) 53);
                    int var23 = var22.field9158.field1218;
                    int var24 = arg2.indexOf(" ", 4);
                    var22.field9158.method672((byte) -120, arg2.substring(3, var24));
                    class365.method2130(arg2.substring(var24), var22.field9158, arg3 + 5);
                    var22.field9158.method642(var22.field9158.field1218 - var23, true);
                    class568.method3220(var22, (byte) 55);
                    return;
                }
                if (arg2.equals("savevarcs")) {
                    class355.method2097((byte) -92);
                    class415.method2335("perm varcs saved", 11);
                    return;
                }
                if (arg2.equals("scramblevarcs")) {
                    for (int var25 = 0; var25 < class371.field5066.length; var25++) {
                        if (class588.field8319[var25]) {
                            class371.field5066[var25] = (int) (Math.random() * 99999.0D);
                            if (Math.random() > 0.5D) {
                                class371.field5066[var25] *= -1;
                            }
                        }
                    }
                    class355.method2097((byte) -72);
                    class415.method2335("perm varcs scrambled", arg3 + 12);
                    return;
                }
                if (arg2.equals("showcolmap")) {
                    class505.field7274 = true;
                    class527.method2968((byte) -26);
                    class415.method2335("colmap is shown", 11);
                    return;
                }
                if (arg2.equals("hidecolmap")) {
                    class505.field7274 = false;
                    class527.method2968((byte) -26);
                    class415.method2335("colmap is hidden", 11);
                    return;
                }
                if (arg2.equals("resetcache")) {
                    class471.method2715(false);
                    class415.method2335("Caches reset", 11);
                    return;
                }
                if (arg2.equals("profilecpu")) {
                    class415.method2335(class115.method614(arg3 ^ 0xFFFFFF9D) + "ms", arg3 + 12);
                    return;
                }
                if (arg2.startsWith("getclientvarpbit")) {
                    int var26 = Integer.parseInt(arg2.substring(17));
                    class415.method2335("varpbit=" + class628.field8859.method160(-726, var26), 11);
                    return;
                }
                if (arg2.startsWith("getclientvarp")) {
                    int var27 = Integer.parseInt(arg2.substring(14));
                    class415.method2335("varp=" + class628.field8859.method159(var27, arg3 ^ 0xFFFFFFF1), arg3 ^ 0xFFFFFFF4);
                    return;
                }
                if (arg2.startsWith("demologin")) {
                    class229.method1376(false, false, 0);
                    return;
                }
                if (arg2.startsWith("newdemologin")) {
                    class229.method1376(true, false, 0);
                    return;
                }
                if (arg2.startsWith("directlogin")) {
                    String[] var28 = class182.method1105(' ', (byte) -75, arg2.substring(12));
                    if (var28.length >= 2) {
                        int var29 = var28.length > 2 ? Integer.parseInt(var28[2]) : 0;
                        class170.method927(var28[0], var29, var28[1], -1);
                        return;
                    }
                }
                if (arg2.startsWith("csprofileclear")) {
                    class281.method1644();
                    return;
                }
                if (arg2.startsWith("csprofileoutputc")) {
                    class281.method1638(100, false);
                    return;
                }
                if (arg2.startsWith("csprofileoutputt")) {
                    class281.method1638(10, true);
                    return;
                }
                if (arg2.startsWith("texsize")) {
                    int var30 = Integer.parseInt(arg2.substring(8));
                    class701.field9813.method991(var30);
                    return;
                }
                if (arg2.equals("soundstreamcount")) {
                    class415.method2335("Active streams: " + class209.field2471.method3887(), 11);
                    return;
                }
                if (arg2.equals("autosetup")) {
                    class639.field9075.method2634(126);
                    class415.method2335("Complete. Toolkit now: " + class430.field6109, 11);
                    return;
                }
                if (arg2.equals("errormessage")) {
                    class415.method2335(class338.field4252.method2560(false), 11);
                    return;
                }
                if (arg2.equals("heapdump")) {
                    if (class464.field6624.startsWith("win")) {
                        class636.method3577(52, new File("C:\\Temp\\heap.dump"), false);
                    } else {
                        class636.method3577(122, new File("/tmp/heap.dump"), false);
                    }
                    class415.method2335("Done", arg3 ^ 0xFFFFFFF4);
                    return;
                }
                if (arg2.equals("os")) {
                    class415.method2335("Name: " + class464.field6624, 11);
                    class415.method2335("Arch: " + class464.field6620, 11);
                    class415.method2335("Ver: " + class464.field6622, 11);
                    return;
                }
                if (arg2.equals("w2debug")) {
                    class106.field1144 = !class106.field1144;
                    class403.method2266((byte) 80);
                    class415.method2335("Toggled!", 11);
                    return;
                }
                if (class421.field5601 == 10) {
                    class364.field4882++;
                    class653 var31 = class699.method3845((byte) 45, class39.field395, class182.field2046);
                    var31.field9158.method658(arg2.length() + 3, (byte) 83);
                    var31.field9158.method658(arg0 ? 1 : 0, (byte) 126);
                    var31.field9158.method658(arg1 ? 1 : 0, (byte) 112);
                    var31.field9158.method672((byte) -114, arg2);
                    class568.method3220(var31, (byte) 109);
                }
                if (arg2.startsWith("fps ") && class364.field4875 != class337.field4237) {
                    class503.method2887(0, class274.method1607(arg2.substring(4), arg3 ^ 0xFFFFFFFE));
                    return;
                }
            } catch (Exception var35) {
                class415.method2335(class198.field2287.method1195((byte) 62, class504.field7267), arg3 + 12);
                return;
            }
        }
        if (class421.field5601 != 10) {
            class415.method2335(class198.field2288.method1195((byte) 62, class504.field7267) + arg2, arg3 + 12);
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V", line = 971)
    public static void method2089(int arg0) {
        field4757 = null;
        if (arg0 != 27502) {
            method2088(false, true, null, 93);
        }
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(III)V", line = 1118)
    public class353(int arg0, int arg1, int arg2) {
        this.field4758 = arg1;
        this.field4763 = arg0;
        this.field4756 = new int[this.field4763][3][arg2];
        this.field4759 = new class407[this.field4758];
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(I)[[[I", line = 989)
    public final int[][][] method2090(int arg0) {
        field4752++;
        if (this.field4763 != this.field4758) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field4763; var2++) {
            this.field4759[var2] = class503.field7241;
        }
        return arg0 == 1 ? this.field4756 : null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II)[[I", line = 1015)
    public final int[][] method2091(int arg0, int arg1) {
        int var3 = -65 / ((arg0 + 72) / 43);
        field4760++;
        if (this.field4763 == this.field4758) {
            this.field4765 = this.field4759[arg1] == null;
            this.field4759[arg1] = class503.field7241;
            return this.field4756[arg1];
        } else if (this.field4763 == 1) {
            this.field4765 = this.field4754 != arg1;
            this.field4754 = arg1;
            return this.field4756[0];
        } else {
            class407 var4 = this.field4759[arg1];
            if (var4 == null) {
                this.field4765 = true;
                if (this.field4761 >= this.field4763) {
                    class407 var5 = (class407) this.field4753.method3432(-46);
                    var4 = new class407(arg1, var5.field5433);
                    this.field4759[var5.field5432] = null;
                    var5.method1922(103);
                } else {
                    var4 = new class407(arg1, this.field4761);
                    this.field4761++;
                }
                this.field4759[arg1] = var4;
            } else {
                this.field4765 = false;
            }
            this.field4753.method3437((byte) 115, var4);
            return this.field4756[var4.field5433];
        }
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "(I)V", line = 1084)
    public final void method2092(int arg0) {
        for (int var2 = 0; var2 < this.field4763; var2++) {
            this.field4756[var2][0] = null;
            this.field4756[var2][1] = null;
            this.field4756[var2][2] = null;
            this.field4756[var2] = null;
        }
        field4764++;
        this.field4759 = null;
        this.field4756 = null;
        int var3 = 17 / ((arg0 + 59) / 49);
        this.field4753.method3438(16);
        this.field4753 = null;
    }
}
