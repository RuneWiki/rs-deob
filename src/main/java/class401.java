import jagex3.jagmisc.jagmisc;
import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class401 {

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "J")
    private long field5690;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    private int field5689;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "[Ljava/awt/Color;")
    public static Color[] field5694 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public static int field5686;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public static int field5687;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public static int field5688;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
    public static int field5691;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
    public static int field5692;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
    public static int field5693;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "I")
    public static int field5695;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "Lpq;")
    public static class159 field5696;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "Ljava/lang/Object;")
    public static Object field5697;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "[[[B")
    public static byte[][][] field5698;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BI)Lpj;")
    public final class102 method2362(byte arg0, int arg1) {
        int var3 = 88 / ((arg0 + 52) / 38);
        field5691++;
        return class102.method550(3)[this.method2367((byte) 103, arg1)];
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZLjava/lang/String;IZ)V")
    public static final void method2363(boolean arg0, String arg1, int arg2, boolean arg3) {
        if (arg2 > -60) {
            field5694 = null;
        }
        field5695++;
        if (class375.field5396 == class333.field4859 && class485.field6560 < 2) {
            return;
        }
        if (arg1.equalsIgnoreCase("errortest")) {
            throw new RuntimeException();
        }
        if (arg1.equals("nativememerror")) {
            throw new OutOfMemoryError("native(MPR");
        }
        try {
            if (arg1.equalsIgnoreCase("fpson")) {
                class150.field1885 = true;
                class451.method2571("fps debug enabled", 109);
                return;
            }
            if (arg1.equalsIgnoreCase("fpsoff")) {
                class150.field1885 = false;
                class451.method2571("fps debug disabled", 105);
                return;
            }
            if (arg1.equals("systemmem")) {
                try {
                    class451.method2571("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb", 104);
                    return;
                } catch (Throwable var31) {
                    return;
                }
            }
            if (arg1.equalsIgnoreCase("cls")) {
                class541.field7402 = 0;
                class443.field6117 = 0;
                return;
            }
            if (arg1.equalsIgnoreCase("cleartext")) {
                class565.field7805.method2225(29483);
                class451.method2571("Text coords cleared", 124);
                return;
            }
            if (arg1.equalsIgnoreCase("gc")) {
                class202.method1274(-26555);
                for (int var4 = 0; var4 < 10; var4++) {
                    System.gc();
                }
                Runtime var5 = Runtime.getRuntime();
                int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
                class451.method2571("mem=" + var6 + "k", 82);
                return;
            }
            if (arg1.equalsIgnoreCase("compact")) {
                class202.method1274(-26555);
                for (int var7 = 0; var7 < 10; var7++) {
                    System.gc();
                }
                Runtime var8 = Runtime.getRuntime();
                int var9 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
                class451.method2571("Memory before cleanup=" + var9 + "k", 86);
                class457.method2584(-58);
                class202.method1274(-26555);
                for (int var10 = 0; var10 < 10; var10++) {
                    System.gc();
                }
                int var11 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
                class451.method2571("Memory after cleanup=" + var11 + "k", 121);
                return;
            }
            if (arg1.equalsIgnoreCase("unloadnatives")) {
                class451.method2571(class330.method2117(0) ? "Libraries unloaded" : "Library unloading failed!", 93);
                return;
            }
            if (arg1.equalsIgnoreCase("pcachesize")) {
                class451.method2571("Number of player models in cache:" + class6.method37(-122), 95);
                return;
            }
            if (arg1.equalsIgnoreCase("clientdrop")) {
                class451.method2571("Dropped client connection", 96);
                if (class476.field6436 == 10) {
                    class537.method3032((byte) 85);
                    return;
                }
                if (class476.field6436 == 11) {
                    class367.field5274 = true;
                }
                return;
            }
            if (arg1.equalsIgnoreCase("rotateconnectmethods")) {
                class79.field1002.method3726(66);
                class451.method2571("Rotated connection methods", 118);
                return;
            }
            if (arg1.equalsIgnoreCase("clientjs5drop")) {
                class311.field4180.method2839(0);
                class451.method2571("Dropped client js5 net queue", 76);
                return;
            }
            if (arg1.equalsIgnoreCase("serverjs5drop")) {
                class311.field4180.method2829(0);
                class451.method2571("Dropped server js5 net queue", 82);
                return;
            }
            if (arg1.equalsIgnoreCase("breakcon")) {
                class495.field6687.method626((byte) -47);
                class80.field1014.method966(true);
                class311.field4180.method2835(19575);
                class451.method2571("Breaking new connections for 5 seconds", 87);
                return;
            }
            if (arg1.equalsIgnoreCase("rebuild")) {
                class70.method413(11);
                class578.method3254(true);
                class451.method2571("Rebuilding map", 98);
                return;
            }
            if (arg1.equalsIgnoreCase("wm1")) {
                class587.method3284(-1, 3954, -1, 1, false);
                if (class42.method252(-128) == 1) {
                    class451.method2571("wm1 succeeded", 96);
                    return;
                }
                class451.method2571("wm1 failed", 95);
                return;
            }
            if (arg1.equalsIgnoreCase("wm2")) {
                class587.method3284(-1, 3954, -1, 2, false);
                if (class42.method252(-128) != 2) {
                    class451.method2571("wm2 failed", 123);
                    return;
                }
                class451.method2571("wm2 succeeded", 78);
                return;
            }
            if (arg1.equalsIgnoreCase("wm3")) {
                class587.method3284(768, 3954, 1024, 3, false);
                if (class42.method252(-128) != 3) {
                    class451.method2571("wm3 failed", 92);
                    return;
                }
                class451.method2571("wm3 succeeded", 93);
                return;
            }
            if (arg1.equalsIgnoreCase("tk0")) {
                class564.method3180(0, (byte) 31);
                if (class161.field2038 == 0) {
                    class451.method2571("Entered tk0", 109);
                    class72.field935.field6511 = 0;
                    class72.field935.method1856(0, class495.field6687);
                    class665.field9426 = false;
                    return;
                }
                class451.method2571("Failed to enter tk0", 78);
                return;
            }
            if (arg1.equalsIgnoreCase("tk1")) {
                class564.method3180(1, (byte) 36);
                if (class161.field2038 == 1) {
                    class451.method2571("Entered tk1", 109);
                    class72.field935.field6511 = 1;
                    class72.field935.method1856(0, class495.field6687);
                    class665.field9426 = false;
                    return;
                }
                class451.method2571("Failed to enter tk1", 112);
                return;
            }
            if (arg1.equalsIgnoreCase("tk2")) {
                class564.method3180(2, (byte) 88);
                if (class161.field2038 != 2) {
                    class451.method2571("Failed to enter tk2", 90);
                    return;
                }
                class451.method2571("Entered tk2", 108);
                class72.field935.field6511 = 2;
                class72.field935.method1856(0, class495.field6687);
                class665.field9426 = false;
                return;
            }
            if (arg1.equalsIgnoreCase("tk3")) {
                class564.method3180(3, (byte) 70);
                if (class161.field2038 == 3) {
                    class451.method2571("Entered tk3", 106);
                    class72.field935.field6511 = 3;
                    class72.field935.method1856(0, class495.field6687);
                    class665.field9426 = false;
                    return;
                }
                class451.method2571("Failed to enter tk3", 76);
                return;
            }
            if (arg1.equalsIgnoreCase("tk4")) {
                class564.method3180(4, (byte) 95);
                if (class161.field2038 == 4) {
                    class451.method2571("Entered tk4", 97);
                    class72.field935.field6511 = 4;
                    class72.field935.method1856(0, class495.field6687);
                    class665.field9426 = false;
                    return;
                }
                class451.method2571("Failed to enter tk4", 91);
                return;
            }
            if (arg1.equalsIgnoreCase("tk5")) {
                class564.method3180(5, (byte) 42);
                if (class161.field2038 != 5) {
                    class451.method2571("Failed to enter tk5", 119);
                    return;
                }
                class451.method2571("Entered tk5", 89);
                class72.field935.field6511 = 5;
                class72.field935.method1856(0, class495.field6687);
                class665.field9426 = false;
                return;
            }
            if (arg1.equalsIgnoreCase("ot")) {
                class72.field935.field6522 = !class72.field935.field6522;
                class72.field935.method1856(0, class495.field6687);
                class665.field9426 = false;
                class70.method413(11);
                class451.method2571("ot=" + class72.field935.field6522, 90);
                return;
            }
            if (arg1.equalsIgnoreCase("gb")) {
                class72.field935.field6525 = !class72.field935.field6525;
                class72.field935.method1856(0, class495.field6687);
                class665.field9426 = false;
                class70.method413(11);
                class451.method2571("gb=" + class72.field935.field6525, 127);
                return;
            }
            if (arg1.startsWith("shadows")) {
                if (arg1.length() < 8) {
                    class451.method2571("Invalid shadows value", 106);
                    return;
                }
                String var12 = arg1.substring(8);
                int var13 = class224.method1371(var12, (byte) 116) ? class433.method2495(var12, 0) : -1;
                if (var13 >= 0 && var13 <= 2) {
                    class72.field935.method2692(class161.field2038, (byte) -112, var13);
                    class72.field935.method1856(0, class495.field6687);
                    class665.field9426 = false;
                    class70.method413(11);
                    class451.method2571("shadows=" + var13, 126);
                    return;
                }
                class451.method2571("Invalid shadows value", 101);
                return;
            }
            if (arg1.startsWith("textures")) {
                class72.field935.field6499 = !class72.field935.field6499;
                class72.field935.method1856(0, class495.field6687);
                class665.field9426 = false;
                class107.method572(123);
                class70.method413(11);
                class451.method2571("textures=" + class72.field935.field6499, 106);
                return;
            }
            if (arg1.startsWith("lighting")) {
                class72.field935.method2689((byte) -101, !class72.field935.method2695(false, class161.field2038), class161.field2038);
                class72.field935.method1856(0, class495.field6687);
                class665.field9426 = false;
                class399.method2358((byte) 66);
                class107.method572(125);
                class70.method413(11);
                class451.method2571("lighting=" + class72.field935.method2695(false, class161.field2038), 119);
                return;
            }
            if (arg1.startsWith("setba")) {
                if (arg1.length() < 6) {
                    class451.method2571("Invalid buildarea value", 89);
                    return;
                }
                int var14 = class433.method2495(arg1.substring(6), 0);
                if (var14 >= 0 && var14 <= class86.method479(class77.field969, -32769)) {
                    class72.field935.field6529 = var14;
                    class72.field935.method1856(0, class495.field6687);
                    class665.field9426 = false;
                    class451.method2571("maxbuildarea=" + class72.field935.field6529, 124);
                    return;
                }
                class451.method2571("Invalid buildarea value", 92);
                return;
            }
            if (arg1.startsWith("setparticles")) {
                if (arg1.length() < 13) {
                    class451.method2571("Invalid particles value", 88);
                    return;
                }
                class635.method3462(class433.method2495(arg1.substring(13), 0), true);
                class72.field935.method1856(0, class495.field6687);
                class665.field9426 = false;
                class451.method2571("particles=" + class330.method2116(-1), 92);
                return;
            }
            if (arg1.startsWith("rect_debug")) {
                if (arg1.length() < 10) {
                    class451.method2571("Invalid rect_debug value", 106);
                    return;
                }
                class664.field9418 = class433.method2495(arg1.substring(10).trim(), 0);
                class451.method2571("rect_debug=" + class664.field9418, 124);
                return;
            }
            if (arg1.equalsIgnoreCase("qa_op_test")) {
                class380.field5455 = true;
                class451.method2571("qa_op_test=" + class380.field5455, 84);
                return;
            }
            if (arg1.equalsIgnoreCase("clipcomponents")) {
                class460.field6269 = !class460.field6269;
                class451.method2571("clipcomponents=" + class460.field6269, 101);
                return;
            }
            if (arg1.startsWith("bloom")) {
                boolean var15 = class9.field103.method811();
                if (class614.method3376(!var15, (byte) -93)) {
                    if (var15) {
                        class451.method2571("Bloom disabled", 87);
                        return;
                    }
                    class451.method2571("Bloom enabled", 95);
                    return;
                }
                class451.method2571("Failed to enable bloom", 112);
                return;
            }
            if (arg1.equalsIgnoreCase("tween")) {
                if (class425.field5919) {
                    class425.field5919 = false;
                    class451.method2571("Forced tweening disabled.", 111);
                    return;
                }
                class425.field5919 = true;
                class451.method2571("Forced tweening ENABLED!", 87);
                return;
            }
            if (arg1.equalsIgnoreCase("shiftclick")) {
                if (!class483.field6541) {
                    class451.method2571("Shift-click ENABLED!", 90);
                    class483.field6541 = true;
                    return;
                }
                class451.method2571("Shift-click disabled.", 97);
                class483.field6541 = false;
                return;
            }
            if (arg1.equalsIgnoreCase("getcgcoord")) {
                class451.method2571("x:" + (class596.field8164.field3929 >> 9) + " z:" + (class596.field8164.field3917 >> 9), 104);
                return;
            }
            if (arg1.equalsIgnoreCase("getheight")) {
                class451.method2571("Height: " + class397.field5666[class596.field8164.field3925].method150(class596.field8164.field3929 >> 7, class596.field8164.field3917 >> 7), 104);
                return;
            }
            if (arg1.equalsIgnoreCase("resetminimap")) {
                class39.field510.method1058(true);
                class39.field510.method1060(-124);
                class70.field916.method1012(-120);
                class665.field9460.method221(19834);
                class578.method3254(true);
                class451.method2571("Minimap reset", 115);
                return;
            }
            if (arg1.startsWith("mc")) {
                if (!class9.field103.method1989()) {
                    class451.method2571("Current toolkit doesn't support multiple cores", 94);
                    return;
                }
                int var16 = Integer.parseInt(arg1.substring(3));
                if (var16 < 1) {
                    var16 = 1;
                } else if (var16 > 4) {
                    var16 = 4;
                }
                class637.field8701 = var16;
                class9.field103.method1793(class637.field8701);
                class9.field103.method1797(0);
                class451.method2571("Render cores now: " + class637.field8701, 126);
                return;
            }
            if (arg1.startsWith("cachespace")) {
                class451.method2571("I(s): " + class151.field1899.method3140((byte) -111) + "/" + class151.field1899.method3131((byte) 95), 92);
                class451.method2571("I(m): " + class645.field9137.method3140((byte) -48) + "/" + class645.field9137.method3131((byte) -87), 113);
                class451.method2571("O(s): " + class237.field3088.field2850.method2969(true) + "/" + class237.field3088.field2850.method2967(-9117), 111);
                return;
            }
            if (arg1.equalsIgnoreCase("getcamerapos")) {
                class451.method2571("Pos: " + class596.field8164.field3925 + "," + ((class132.field1679 >> 9) + class253.field3490 >> 6) + "," + ((class471.field6379 >> 9) + class186.field2280 >> 6) + "," + ((class132.field1679 >> 9) + class253.field3490 & 0x3F) + "," + ((class471.field6379 >> 9) + class186.field2280 & 0x3F) + " Height: " + (class394.method2340(class132.field1679, -1, class596.field8164.field3925, class471.field6379) - class628.field8545), 108);
                class451.method2571("Look: " + class596.field8164.field3925 + "," + (class253.field3490 + class18.field164 >> 6) + "," + (class495.field6699 + class186.field2280 >> 6) + "," + (class253.field3490 + class18.field164 & 0x3F) + "," + (class495.field6699 + class186.field2280 & 0x3F) + " Height: " + (class394.method2340(class18.field164, -1, class596.field8164.field3925, class495.field6699) - class198.field2618), 87);
                return;
            }
            if (arg1.equals("showocc")) {
                class35.field356 = !class35.field356;
                class70.method413(11);
                class451.method2571("showocc=" + class35.field356, 90);
                return;
            }
            if (arg1.equals("wallocc")) {
                class575.field7959 = !class575.field7959;
                class70.method413(11);
                class451.method2571("forcewallocc=" + class575.field7959, 80);
                return;
            }
            if (arg1.equals("renderprofile") || arg1.equals("rp")) {
                class19.field174 = !class19.field174;
                class9.field103.method778(class19.field174);
                class123.method755(-16646);
                class451.method2571("showprofiling=" + class19.field174, 82);
                return;
            }
            if (arg1.startsWith("performancetest")) {
                int var17 = -1;
                int var18 = 1000;
                if (arg1.length() > 15) {
                    String[] var19 = class105.method562(arg1, ' ', true);
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
                    class451.method2571("Java toolkit: " + class669.method3709(0, -21664, var18), 91);
                    class451.method2571("SSE toolkit:  " + class669.method3709(2, -21664, var18), 81);
                    class451.method2571("D3D toolkit:  " + class669.method3709(3, -21664, var18), 76);
                    class451.method2571("GL toolkit:   " + class669.method3709(1, -21664, var18), 117);
                    class451.method2571("GLX toolkit:  " + class669.method3709(5, -21664, var18), 96);
                    return;
                }
                class451.method2571("Performance: " + class669.method3709(class161.field2038, -21664, var18), 84);
                return;
            }
            if (arg1.equals("renderer")) {
                class276 var20 = class9.field103.method794();
                class451.method2571("Vendor: " + var20.field3738, 120);
                class451.method2571("Name: " + var20.field3739, 110);
                class451.method2571("Version: " + var20.field3743, 102);
                class451.method2571("Device: " + var20.field3742, 121);
                class451.method2571("Driver Version: " + var20.field3740, 76);
                return;
            }
            if (arg1.equals("nonpcs")) {
                class360.field5199 = !class360.field5199;
                class451.method2571("nonpcs=" + class360.field5199, 123);
                return;
            }
            if (arg1.equals("autoworld")) {
                class245.method1510(-96);
                class451.method2571("auto world selected", 107);
                return;
            }
            if (arg1.startsWith("switchworld")) {
                int var21 = Integer.parseInt(arg1.substring(12));
                class78.method442(40000, var21, class140.method967(var21, (byte) 126).field533);
                class451.method2571("switched", 113);
                return;
            }
            if (arg1.equals("getworld")) {
                class451.method2571("w: " + class79.field1002.field9558, 78);
                return;
            }
            if (arg1.startsWith("pc")) {
                class389.method2326((byte) 118, class373.field5379);
                class253.field3491.method951((byte) -82, 0);
                int var22 = class253.field3491.field1745;
                int var23 = arg1.indexOf(" ", 4);
                class253.field3491.method905(arg1.substring(3, var23), 95);
                class66.method395(class253.field3491, arg1.substring(var23), true);
                class253.field3491.method901(-12951, class253.field3491.field1745 - var22);
                return;
            }
            if (arg1.equals("heap")) {
                class451.method2571("Heap: " + class77.field969 + "MB", 121);
                return;
            }
            if (arg1.equals("savevarcs")) {
                class72.method426(76);
                class451.method2571("perm varcs saved", 100);
                return;
            }
            if (arg1.equals("scramblevarcs")) {
                for (int var24 = 0; var24 < class85.field1042.length; var24++) {
                    if (class521.field7223[var24]) {
                        class85.field1042[var24] = (int) (Math.random() * 99999.0D);
                        if (Math.random() > 0.5D) {
                            class85.field1042[var24] *= -1;
                        }
                    }
                }
                class72.method426(96);
                class451.method2571("perm varcs scrambled", 115);
                return;
            }
            if (arg1.equals("showcolmap")) {
                class560.field7635 = true;
                class578.method3254(true);
                class451.method2571("colmap is shown", 123);
                return;
            }
            if (arg1.equals("hidecolmap")) {
                class560.field7635 = false;
                class578.method3254(true);
                class451.method2571("colmap is hidden", 101);
                return;
            }
            if (arg1.equals("resetcache")) {
                class308.method1848(true);
                class451.method2571("Caches reset", 116);
                return;
            }
            if (arg1.equals("profilecpu")) {
                class451.method2571(class474.method2661(-65536) + "ms", 127);
                return;
            }
            if (arg1.startsWith("cpuusage")) {
                int var25 = Integer.parseInt(arg1.substring(9));
                if (var25 >= 0 && var25 <= 4) {
                    class72.field935.field6518 = var25;
                }
                class451.method2571("cpuusage=" + class72.field935.field6518, 80);
                return;
            }
            if (arg1.startsWith("getclientvarpbit")) {
                int var26 = Integer.parseInt(arg1.substring(17));
                class451.method2571("varpbit=" + class327.field4771.method1324(var26, -71), 77);
                return;
            }
            if (arg1.startsWith("getclientvarp")) {
                int var27 = Integer.parseInt(arg1.substring(14));
                class451.method2571("varp=" + class327.field4771.method1323(0, var27), 87);
                return;
            }
            if (arg1.startsWith("demologin")) {
                class199.method1263(false, true, 0);
                return;
            }
            if (arg1.startsWith("newdemologin")) {
                class199.method1263(true, true, 0);
                return;
            }
            if (arg1.startsWith("directlogin")) {
                String[] var28 = class105.method562(arg1.substring(12), ' ', true);
                if (var28.length >= 2) {
                    int var29 = var28.length <= 2 ? 0 : Integer.parseInt(var28[2]);
                    class270.method1658(var29, false, var28[1], var28[0]);
                    return;
                }
            }
            if (arg1.startsWith("csprofileclear")) {
                class317.method2050();
                return;
            }
            if (arg1.startsWith("csprofileoutputc")) {
                class317.method2044(100, false);
                return;
            }
            if (arg1.startsWith("csprofileoutputt")) {
                class317.method2044(10, true);
                return;
            }
            if (arg1.startsWith("texsize")) {
                int var30 = Integer.parseInt(arg1.substring(8));
                class9.field103.method1983(var30);
                return;
            }
            if (arg1.equals("soundstreamcount")) {
                class451.method2571("Active streams: " + class285.field3866.method3206(), 123);
                return;
            }
            if (arg1.equals("autosetup")) {
                class72.field935.method1850(2);
                class451.method2571("Complete. Toolkit now: " + class161.field2038, 121);
                return;
            }
            if (arg1.equals("errormessage")) {
                class451.method2571(class167.field2083.method1421(5), 101);
                return;
            }
            if (class476.field6436 == 10) {
                class389.method2326((byte) 118, class485.field6558);
                class223.field2890++;
                class253.field3491.method951((byte) -82, arg1.length() + 3);
                class253.field3491.method951((byte) -82, arg0 ? 1 : 0);
                class253.field3491.method951((byte) -82, arg3 ? 1 : 0);
                class253.field3491.method905(arg1, 99);
            }
            if (arg1.startsWith("fps ") && class375.field5396 != class333.field4859) {
                class549.method3086(class433.method2495(arg1.substring(4), 0), false);
                return;
            }
            if (class476.field6436 != 10) {
                class451.method2571("Unrecogonised commmand when not logged in: " + arg1, 91);
                return;
            }
        } catch (Exception var34) {
            class451.method2571("Whoops, something went wrong.", 114);
            return;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
    public static final void method2364(int arg0) {
        field5686++;
        if (arg0 != 26061) {
            return;
        }
        for (int var1 = 0; var1 < 5; var1++) {
            class676.field9596[var1] = false;
        }
        class42.field546 = 1;
        class243.field3278 = -1;
        class556.field7593 = 0;
        class227.field2966 = -1;
        class15.field128 = 0;
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V")
    public static final void method2365(int arg0) {
        int var1 = 66 % ((-arg0 - 63) / 32);
        class421.field5871.method365(-1);
        field5693++;
        class144.field1831.method365(-1);
        for (class69 var2 = (class69) class37.field371.method374((byte) 76); var2 != null; var2 = (class69) class37.field371.method372(-20740)) {
            int var19 = var2.field902;
            if (var19 < 1000) {
                var2.method175(30604);
                if (var19 == 46 || var19 == 16 || var19 == 57 || var19 == 47 || var19 == 20 || var19 == 50 || var19 == 48) {
                    class144.field1831.method378(var2, 31316);
                } else {
                    class421.field5871.method378(var2, 31316);
                }
            }
        }
        class421.field5871.method375((byte) -16, class37.field371);
        class144.field1831.method375((byte) -16, class37.field371);
        if (class179.field2242 <= 1) {
            class468.field6362 = null;
        } else if (class483.field6541 && class348.field5096.method32(81, -126) && class179.field2242 > 2) {
            class468.field6362 = (class69) class37.field371.field825.field275.field275;
        } else {
            class468.field6362 = (class69) class37.field371.field825.field275;
        }
        int var3 = -1;
        class8 var4 = (class8) class690.field9744.method374((byte) 106);
        if (var4 != null) {
            var3 = var4.method57((byte) -36);
        }
        if (!class483.field6542) {
            if (var3 == 0 && (class291.field3890 == 1 && class179.field2242 > 2 || class292.method1729(131))) {
                var3 = 2;
            }
            if (var3 == 2 && class179.field2242 > 0 && var4 != null) {
                if (class377.field5414 == null && class614.field8380 == 0) {
                    class7.method46(var4.method51(1), (byte) -52, var4.method49((byte) -31));
                } else {
                    class688.field9717 = 2;
                }
            }
            if (var3 == 0 && class179.field2242 > 0) {
                class256.method1616(-2);
            }
            if (class377.field5414 == null && class614.field8380 == 0) {
                class688.field9717 = 0;
                class50.field664 = null;
                return;
            }
            return;
        }
        if (var3 == -1) {
            int var5 = class592.field8107.method268((byte) -86);
            int var6 = class592.field8107.method269((byte) -25);
            if (var5 < class544.field7454 - 10 || var5 > class353.field5151 + class544.field7454 + 10 || var6 < class326.field4744 - 10 || (class326.field4744 + class169.field2116 + 10) < var6) {
                class477.method2671(7);
            }
        }
        if (var3 != 0) {
            return;
        }
        int var7 = class544.field7454;
        int var8 = class326.field4744;
        int var9 = class353.field5151;
        int var10 = var4.method51(1);
        int var11 = var4.method49((byte) -31);
        int var12 = -1;
        for (int var13 = 0; var13 < class179.field2242; var13++) {
            if (class565.field7842) {
                int var17 = (class179.field2242 - var13 - 1) * 16 + var8 + 33;
                if (var10 > var7 && (var7 + var9) > var10 && var11 > (var17 - 13) && var11 < var17 + 4) {
                    var12 = var13;
                }
            } else {
                int var18 = var8 - (-(class179.field2242 - var13 - 1) * 16 - 31);
                if (var10 > var7 && var10 < var7 + var9 && var18 - 13 < var11 && (var18 + 3) > var11) {
                    var12 = var13;
                }
            }
        }
        if (var12 != -1) {
            int var14 = 0;
            class70 var15 = new class70(class37.field371);
            for (class69 var16 = (class69) var15.method415((byte) -30); var16 != null; var16 = (class69) var15.method412(69)) {
                if (var12 == var14) {
                    class565.method3192(var16, var11, -87, var10);
                }
                var14++;
            }
        }
        class477.method2671(7);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILpj;)V")
    private final void method2366(int arg0, class102 arg1) {
        this.field5690 |= (arg1.field1234 << class102.field1248 * this.field5689++);
        field5692++;
        int var3 = 11 % ((arg0 + 62) / 32);
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(BI)I")
    private final int method2367(byte arg0, int arg1) {
        int var3 = -115 % ((-arg0 - 43) / 63);
        field5688++;
        return (int) (this.field5690 >> class102.field1248 * arg1) & 0xF;
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lpj;)V")
    public class401(class102 arg0) {
        this.field5690 = arg0.field1234;
        this.field5689 = 1;
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "([Lpj;)V")
    public class401(class102[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.method2366(7, arg0[var2]);
        }
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)I")
    public final int method2368(int arg0) {
        field5687++;
        if (arg0 != -24476) {
            field5696 = null;
        }
        return this.field5689;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)V")
    public static void method2369(byte arg0) {
        field5698 = null;
        field5694 = null;
        field5696 = null;
        field5697 = null;
        if (arg0 != 40) {
            field5694 = null;
        }
    }
}
