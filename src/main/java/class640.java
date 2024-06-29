import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public class class640 extends class605 {

    @OriginalMember(owner = "client!fw", name = "H", descriptor = "[B")
    public byte[] field8903;

    @OriginalMember(owner = "client!fw", name = "I", descriptor = "[I")
    public static int[] field8904 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!fw", name = "w", descriptor = "I")
    public static int field8894;

    @OriginalMember(owner = "client!fw", name = "x", descriptor = "I")
    public static int field8895;

    @OriginalMember(owner = "client!fw", name = "y", descriptor = "I")
    public static int field8896;

    @OriginalMember(owner = "client!fw", name = "z", descriptor = "I")
    public static int field8897;

    @OriginalMember(owner = "client!fw", name = "A", descriptor = "I")
    public static int field8898;

    @OriginalMember(owner = "client!fw", name = "B", descriptor = "I")
    public int field8899;

    @OriginalMember(owner = "client!fw", name = "D", descriptor = "I")
    public int field8900;

    @OriginalMember(owner = "client!fw", name = "E", descriptor = "I")
    public static int field8901;

    @OriginalMember(owner = "client!fw", name = "G", descriptor = "I")
    public static int field8902;

    @OriginalMember(owner = "client!fw", name = "J", descriptor = "I")
    public int field8905;

    @OriginalMember(owner = "client!fw", name = "K", descriptor = "I")
    public static int field8906;

    @OriginalMember(owner = "client!fw", name = "L", descriptor = "I")
    public int field8907;

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(Ltc;Loa;B)V", line = 12)
    public static final void method3525(class477 arg0, class43 arg1, byte arg2) {
        if (arg2 != -47) {
            field8904 = null;
        }
        field8897++;
        boolean var3 = class232.field3109.method1296(arg1, arg0.field6239, arg0.field6370 | 0xFF000000, arg0.field6237, arg0.field6360, arg0.field6321, arg0.field6242 ? class233.field3130.field2469 : null, -53) == null;
        if (var3) {
            class451.field5885.method2087(new class186(arg0.field6321, arg0.field6237, arg0.field6360, arg0.field6370 | 0xFF000000, arg0.field6239, arg0.field6242), 81);
            class386.method2199(arg0, false);
        }
    }

    @OriginalMember(owner = "client!fw", name = "h", descriptor = "(I)V", line = 31)
    public final void method3526(int arg0) {
        field8895++;
        int var2 = -1;
        int var3 = this.field8903.length - 8;
        while (var2 < var3) {
            var2++;
            this.field8903[var2] = 0;
            var2++;
            this.field8903[var2] = 0;
            var2++;
            this.field8903[var2] = 0;
            var2++;
            this.field8903[var2] = 0;
            var2++;
            this.field8903[var2] = 0;
            var2++;
            this.field8903[var2] = 0;
            var2++;
            this.field8903[var2] = 0;
            var2++;
            this.field8903[var2] = 0;
        }
        while (var2 < (this.field8903.length - 1)) {
            var2++;
            this.field8903[var2] = 0;
        }
        if (arg0 != -32765) {
            field8894 = -30;
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(III)Z", line = 62)
    public final boolean method3527(int arg0, int arg1, int arg2) {
        if (arg0 < 56) {
            return true;
        } else {
            field8902++;
            return (arg1 * arg2) <= this.field8903.length;
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(Ljava/lang/String;ZIZ)V", line = 74)
    public static final void method3528(String arg0, boolean arg1, int arg2, boolean arg3) {
        if (arg2 != -4) {
            return;
        }
        field8901++;
        if (class555.field7261 == class119.field1536 && class54.field741 < 2) {
            return;
        }
        if (arg0.equalsIgnoreCase("errortest")) {
            throw new RuntimeException();
        }
        if (arg0.equals("nativememerror")) {
            throw new OutOfMemoryError("native(MPR");
        }
        try {
            if (arg0.equalsIgnoreCase("fpson")) {
                class144.field1889 = true;
                class697.method3800("fps debug enabled", arg2 ^ 0xFFFFFFFD);
                return;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                class144.field1889 = false;
                class697.method3800("fps debug disabled", arg2 + 5);
                return;
            }
            if (arg0.equals("systemmem")) {
                try {
                    class697.method3800("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb", 1);
                    return;
                } catch (Throwable var33) {
                    return;
                }
            }
            if (arg0.equalsIgnoreCase("cls")) {
                class5.field36 = 0;
                class377.field4834 = 0;
                return;
            }
            if (arg0.equalsIgnoreCase("cleartext")) {
                class686.field9407.method2100((byte) -62);
                class697.method3800("Text coords cleared", arg2 + 5);
                return;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                class351.method2013(-17408);
                for (int var4 = 0; var4 < 10; var4++) {
                    System.gc();
                }
                Runtime var5 = Runtime.getRuntime();
                int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
                class697.method3800("mem=" + var6 + "k", 1);
                return;
            }
            if (arg0.equalsIgnoreCase("compact")) {
                class351.method2013(arg2 ^ 0x43FC);
                for (int var7 = 0; var7 < 10; var7++) {
                    System.gc();
                }
                Runtime var8 = Runtime.getRuntime();
                int var9 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
                class697.method3800("Memory before cleanup=" + var9 + "k", 1);
                class483.method2664(true);
                class351.method2013(arg2 - 17404);
                for (int var10 = 0; var10 < 10; var10++) {
                    System.gc();
                }
                int var11 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
                class697.method3800("Memory after cleanup=" + var11 + "k", 1);
                return;
            }
            if (arg0.equalsIgnoreCase("unloadnatives")) {
                class697.method3800(class323.method1868((byte) 2) ? "Libraries unloaded" : "Library unloading failed!", 1);
                return;
            }
            if (arg0.equalsIgnoreCase("pcachesize")) {
                class697.method3800("Number of player models in cache:" + class242.method1523((byte) -123), 1);
                return;
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                class697.method3800("Dropped client connection", arg2 + 5);
                if (class566.field7391 == 10) {
                    class119.method898((byte) 115);
                    return;
                }
                if (class566.field7391 == 11) {
                    class185.field2364 = true;
                }
                return;
            }
            if (arg0.equalsIgnoreCase("rotateconnectmethods")) {
                class423.field5473.method1638(128);
                class697.method3800("Rotated connection methods", 1);
                return;
            }
            if (arg0.equalsIgnoreCase("clientjs5drop")) {
                class448.field5870.method3598((byte) -26);
                class697.method3800("Dropped client js5 net queue", 1);
                return;
            }
            if (arg0.equalsIgnoreCase("serverjs5drop")) {
                class448.field5870.method3593((byte) -112);
                class697.method3800("Dropped server js5 net queue", arg2 ^ 0xFFFFFFFD);
                return;
            }
            if (arg0.equalsIgnoreCase("breakcon")) {
                class688.field9413.method1044(0);
                class2.field15.method276(arg2 + 4);
                class448.field5870.method3587((byte) -63);
                class697.method3800("Breaking new connections for 5 seconds", 1);
                return;
            }
            if (arg0.equalsIgnoreCase("rebuild")) {
                class469.method2607((byte) -117);
                class107.method830(122);
                class697.method3800("Rebuilding map", 1);
                return;
            }
            if (arg0.equalsIgnoreCase("wm1")) {
                class658.method3617(1, -1, -1, false, 11015);
                if (class62.method528(2) != 1) {
                    class697.method3800("wm1 failed", 1);
                    return;
                }
                class697.method3800("wm1 succeeded", 1);
                return;
            }
            if (arg0.equalsIgnoreCase("wm2")) {
                class658.method3617(2, -1, -1, false, 11015);
                if (class62.method528(arg2 ^ 0xFFFFFFFE) == 2) {
                    class697.method3800("wm2 succeeded", 1);
                    return;
                }
                class697.method3800("wm2 failed", arg2 + 5);
                return;
            }
            if (arg0.equalsIgnoreCase("wm3")) {
                class658.method3617(3, 1024, 768, false, 11015);
                if (class62.method528(2) == 3) {
                    class697.method3800("wm3 succeeded", arg2 ^ 0xFFFFFFFD);
                    return;
                }
                class697.method3800("wm3 failed", 1);
                return;
            }
            if (arg0.equalsIgnoreCase("tk0")) {
                class11.method58(0, -90);
                if (class364.field4697 != 0) {
                    class697.method3800("Failed to enter tk0", 1);
                    return;
                }
                class697.method3800("Entered tk0", 1);
                class260.field3509.field1275 = 0;
                class260.field3509.method1574(class688.field9413, false);
                class249.field3389 = false;
                return;
            }
            if (arg0.equalsIgnoreCase("tk1")) {
                class11.method58(1, -103);
                if (class364.field4697 == 1) {
                    class697.method3800("Entered tk1", 1);
                    class260.field3509.field1275 = 1;
                    class260.field3509.method1574(class688.field9413, false);
                    class249.field3389 = false;
                    return;
                }
                class697.method3800("Failed to enter tk1", 1);
                return;
            }
            if (arg0.equalsIgnoreCase("tk2")) {
                class11.method58(2, -113);
                if (class364.field4697 != 2) {
                    class697.method3800("Failed to enter tk2", 1);
                    return;
                }
                class697.method3800("Entered tk2", 1);
                class260.field3509.field1275 = 2;
                class260.field3509.method1574(class688.field9413, false);
                class249.field3389 = false;
                return;
            }
            if (arg0.equalsIgnoreCase("tk3")) {
                class11.method58(3, arg2 ^ 0x74);
                if (class364.field4697 != 3) {
                    class697.method3800("Failed to enter tk3", 1);
                    return;
                }
                class697.method3800("Entered tk3", 1);
                class260.field3509.field1275 = 3;
                class260.field3509.method1574(class688.field9413, false);
                class249.field3389 = false;
                return;
            }
            if (arg0.equalsIgnoreCase("tk4")) {
                class11.method58(4, arg2 - 110);
                if (class364.field4697 != 4) {
                    class697.method3800("Failed to enter tk4", 1);
                    return;
                }
                class697.method3800("Entered tk4", 1);
                class260.field3509.field1275 = 4;
                class260.field3509.method1574(class688.field9413, false);
                class249.field3389 = false;
                return;
            }
            if (arg0.equalsIgnoreCase("tk5")) {
                class11.method58(5, -118);
                if (class364.field4697 != 5) {
                    class697.method3800("Failed to enter tk5", 1);
                    return;
                }
                class697.method3800("Entered tk5", arg2 ^ 0xFFFFFFFD);
                class260.field3509.field1275 = 5;
                class260.field3509.method1574(class688.field9413, false);
                class249.field3389 = false;
                return;
            }
            if (arg0.equalsIgnoreCase("ot")) {
                class260.field3509.field1304 = !class260.field3509.field1304;
                class260.field3509.method1574(class688.field9413, false);
                class249.field3389 = false;
                class469.method2607((byte) 74);
                class697.method3800("ot=" + class260.field3509.field1304, 1);
                return;
            }
            if (arg0.equalsIgnoreCase("gb")) {
                class260.field3509.field1268 = !class260.field3509.field1268;
                class260.field3509.method1574(class688.field9413, false);
                class249.field3389 = false;
                class469.method2607((byte) 114);
                class697.method3800("gb=" + class260.field3509.field1268, 1);
                return;
            }
            if (arg0.startsWith("shadows")) {
                if (arg0.length() < 8) {
                    class697.method3800("Invalid shadows value", 1);
                    return;
                }
                String var12 = arg0.substring(8);
                int var13 = class594.method3226(arg2 - 81, var12) ? class703.method3845((byte) -94, var12) : -1;
                if (var13 >= 0 && var13 <= 2) {
                    class260.field3509.method735(var13, class364.field4697, -92);
                    class260.field3509.method1574(class688.field9413, false);
                    class249.field3389 = false;
                    class469.method2607((byte) -127);
                    class697.method3800("shadows=" + var13, arg2 + 5);
                    return;
                }
                class697.method3800("Invalid shadows value", 1);
                return;
            }
            if (arg0.startsWith("textures")) {
                class260.field3509.field1286 = !class260.field3509.field1286;
                class260.field3509.method1574(class688.field9413, false);
                class249.field3389 = false;
                class24.method129(28260);
                class469.method2607((byte) -114);
                class697.method3800("textures=" + class260.field3509.field1286, arg2 ^ 0xFFFFFFFD);
                return;
            }
            if (arg0.startsWith("lighting")) {
                class260.field3509.method737(class364.field4697, 122, !class260.field3509.method734((byte) 86, class364.field4697));
                class260.field3509.method1574(class688.field9413, false);
                class249.field3389 = false;
                class693.method3772((byte) 47);
                class24.method129(28260);
                class469.method2607((byte) 87);
                class697.method3800("lighting=" + class260.field3509.method734((byte) 86, class364.field4697), 1);
                return;
            }
            if (arg0.startsWith("setba")) {
                if (arg0.length() < 6) {
                    class697.method3800("Invalid buildarea value", arg2 ^ 0xFFFFFFFD);
                    return;
                }
                int var14 = class703.method3845((byte) -94, arg0.substring(6));
                if (var14 >= 0 && class181.method1203(class331.field4308, 0) >= var14) {
                    class260.field3509.field1296 = var14;
                    class260.field3509.method1574(class688.field9413, false);
                    class249.field3389 = false;
                    class697.method3800("maxbuildarea=" + class260.field3509.field1296, 1);
                    return;
                }
                class697.method3800("Invalid buildarea value", 1);
                return;
            }
            if (arg0.startsWith("setparticles")) {
                if (arg0.length() < 13) {
                    class697.method3800("Invalid particles value", 1);
                    return;
                }
                class635.method3509(class703.method3845((byte) -94, arg0.substring(13)), -101);
                class260.field3509.method1574(class688.field9413, false);
                class249.field3389 = false;
                class697.method3800("particles=" + class26.method151(1818702860), 1);
                return;
            }
            if (arg0.startsWith("rect_debug")) {
                if (arg0.length() < 10) {
                    class697.method3800("Invalid rect_debug value", 1);
                    return;
                }
                class15.field176 = class703.method3845((byte) -94, arg0.substring(10).trim());
                class697.method3800("rect_debug=" + class15.field176, arg2 + 5);
                return;
            }
            if (arg0.equalsIgnoreCase("qa_op_test")) {
                class100.field1336 = true;
                class697.method3800("qa_op_test=" + class100.field1336, 1);
                return;
            }
            if (arg0.equalsIgnoreCase("clipcomponents")) {
                class560.field7312 = !class560.field7312;
                class697.method3800("clipcomponents=" + class560.field7312, 1);
                return;
            }
            if (arg0.startsWith("bloom")) {
                boolean var15 = class520.field6799.method211();
                if (class47.method431(!var15, 117)) {
                    if (!var15) {
                        class697.method3800("Bloom enabled", 1);
                        return;
                    }
                    class697.method3800("Bloom disabled", 1);
                    return;
                }
                class697.method3800("Failed to enable bloom", 1);
                return;
            }
            if (arg0.equalsIgnoreCase("tween")) {
                if (class673.field9330) {
                    class673.field9330 = false;
                    class697.method3800("Forced tweening disabled.", 1);
                    return;
                }
                class673.field9330 = true;
                class697.method3800("Forced tweening ENABLED!", 1);
                return;
            }
            if (arg0.equalsIgnoreCase("shiftclick")) {
                if (class465.field6070) {
                    class697.method3800("Shift-click disabled.", 1);
                    class465.field6070 = false;
                    return;
                }
                class697.method3800("Shift-click ENABLED!", arg2 ^ 0xFFFFFFFD);
                class465.field6070 = true;
                return;
            }
            if (arg0.equalsIgnoreCase("getcgcoord")) {
                class697.method3800("x:" + (class233.field3130.field506 >> 9) + " z:" + (class233.field3130.field503 >> 9), 1);
                return;
            }
            if (arg0.equalsIgnoreCase("getheight")) {
                class697.method3800("Height: " + class392.field4997[class233.field3130.field508].method668(class233.field3130.field506 >> 7, class233.field3130.field503 >> 7), 1);
                return;
            }
            if (arg0.equalsIgnoreCase("resetminimap")) {
                class90.field1186.method3367(0);
                class90.field1186.method3337(0);
                class414.field5331.method2892(-111);
                class650.field9060.method2290(arg2 + 5);
                class107.method830(121);
                class697.method3800("Minimap reset", 1);
                return;
            }
            if (arg0.startsWith("mc")) {
                if (!class520.field6799.method334()) {
                    class697.method3800("Current toolkit doesn't support multiple cores", 1);
                    return;
                }
                int var16 = Integer.parseInt(arg0.substring(3));
                if (var16 < 1) {
                    var16 = 1;
                } else if (var16 > 4) {
                    var16 = 4;
                }
                class695.field9491 = var16;
                class520.field6799.method359(class695.field9491);
                class520.field6799.method373(0);
                class697.method3800("Render cores now: " + class695.field9491, 1);
                return;
            }
            if (arg0.startsWith("cachespace")) {
                class697.method3800("I(s): " + class287.field3710.method3652(23) + "/" + class287.field3710.method3660(1), 1);
                class697.method3800("I(m): " + class152.field1941.method3652(23) + "/" + class152.field1941.method3660(1), 1);
                class697.method3800("O(s): " + class232.field3109.field2576.method473((byte) 70) + "/" + class232.field3109.field2576.method477(arg2 + 1517967789), 1);
                return;
            }
            if (arg0.equalsIgnoreCase("getcamerapos")) {
                class697.method3800("Pos: " + class233.field3130.field508 + "," + ((class499.field6555 >> 9) + class100.field1326 >> 6) + "," + ((class549.field7132 >> 9) + class186.field2376 >> 6) + "," + ((class499.field6555 >> 9) + class100.field1326 & 0x3F) + "," + ((class549.field7132 >> 9) + class186.field2376 & 0x3F) + " Height: " + (class332.method1916(1218445319, class549.field7132, class233.field3130.field508, class499.field6555) - class655.field9120), 1);
                class697.method3800("Look: " + class233.field3130.field508 + "," + (class421.field5441 + class100.field1326 >> 6) + "," + (class688.field9415 + class186.field2376 >> 6) + "," + (class421.field5441 + class100.field1326 & 0x3F) + "," + (class688.field9415 + class186.field2376 & 0x3F) + " Height: " + (class332.method1916(1218445319, class688.field9415, class233.field3130.field508, class421.field5441) - class65.field884), 1);
                return;
            }
            if (arg0.equals("showocc")) {
                class63.field859 = !class63.field859;
                class469.method2607((byte) -121);
                class697.method3800("showocc=" + class63.field859, 1);
                return;
            }
            if (arg0.equals("wallocc")) {
                class166.field2083 = !class166.field2083;
                class469.method2607((byte) -128);
                class697.method3800("forcewallocc=" + class166.field2083, 1);
                return;
            }
            if (arg0.equals("renderprofile") || arg0.equals("rp")) {
                class62.field845 = !class62.field845;
                class520.field6799.method167(class62.field845);
                class447.method2528((byte) -13);
                class697.method3800("showprofiling=" + class62.field845, arg2 + 5);
                return;
            }
            if (arg0.startsWith("performancetest")) {
                int var17 = -1;
                int var18 = 1000;
                if (arg0.length() > 15) {
                    String[] var19 = class420.method2420(' ', arg2 - 81, arg0);
                    try {
                        if (var19.length > 1) {
                            var18 = Integer.parseInt(var19[1]);
                        }
                    } catch (Throwable var35) {
                    }
                    try {
                        if (var19.length > 2) {
                            var17 = Integer.parseInt(var19[2]);
                        }
                    } catch (Throwable var34) {
                    }
                }
                if (var17 == -1) {
                    class697.method3800("Java toolkit: " + class441.method2498((byte) 31, var18, 0), arg2 ^ 0xFFFFFFFD);
                    class697.method3800("SSE toolkit:  " + class441.method2498((byte) 31, var18, 2), 1);
                    class697.method3800("D3D toolkit:  " + class441.method2498((byte) 31, var18, 3), arg2 ^ 0xFFFFFFFD);
                    class697.method3800("GL toolkit:   " + class441.method2498((byte) 31, var18, 1), 1);
                    class697.method3800("GLX toolkit:  " + class441.method2498((byte) 31, var18, 5), 1);
                    return;
                }
                class697.method3800("Performance: " + class441.method2498((byte) 31, var18, class364.field4697), arg2 + 5);
                return;
            }
            if (arg0.equals("renderer")) {
                class463 var20 = class520.field6799.method189();
                class697.method3800("Vendor: " + var20.field6056, 1);
                class697.method3800("Name: " + var20.field6063, 1);
                class697.method3800("Version: " + var20.field6055, arg2 ^ 0xFFFFFFFD);
                class697.method3800("Device: " + var20.field6061, arg2 ^ 0xFFFFFFFD);
                class697.method3800("Driver Version: " + var20.field6062, 1);
                return;
            }
            if (arg0.equals("nonpcs")) {
                class294.field3806 = !class294.field3806;
                class697.method3800("nonpcs=" + class294.field3806, 1);
                return;
            }
            if (arg0.equals("autoworld")) {
                class597.method3246(arg2 ^ 0xFFFFFF84);
                class697.method3800("auto world selected", 1);
                return;
            }
            if (arg0.startsWith("switchworld")) {
                int var21 = Integer.parseInt(arg0.substring(12));
                class39.method309(class541.method2873(-64, var21).field1817, 6693, var21);
                class697.method3800("switched", arg2 + 5);
                return;
            }
            if (arg0.equals("getworld")) {
                class697.method3800("w: " + class423.field5473.field3554, 1);
                return;
            }
            if (arg0.startsWith("pc")) {
                class11 var22 = class130.method931(class649.field9035, (byte) 54, class222.field2905);
                var22.field114.method2352(true, 0);
                int var23 = var22.field114.field5367;
                int var24 = arg0.indexOf(" ", 4);
                var22.field114.method2374(arg0.substring(3, var24), arg2 - 120);
                class631.method3499(105, arg0.substring(var24), var22.field114);
                var22.field114.method2357(var22.field114.field5367 - var23, false);
                class100.method760(var22, -111);
                return;
            }
            if (arg0.equals("heap")) {
                class697.method3800("Heap: " + class331.field4308 + "MB", 1);
                return;
            }
            if (arg0.equals("savevarcs")) {
                class136.method990(0);
                class697.method3800("perm varcs saved", arg2 ^ 0xFFFFFFFD);
                return;
            }
            if (arg0.equals("scramblevarcs")) {
                for (int var25 = 0; var25 < class311.field4040.length; var25++) {
                    if (class564.field7369[var25]) {
                        class311.field4040[var25] = (int) (Math.random() * 99999.0D);
                        if (Math.random() > 0.5D) {
                            class311.field4040[var25] *= -1;
                        }
                    }
                }
                class136.method990(arg2 + 4);
                class697.method3800("perm varcs scrambled", 1);
                return;
            }
            if (arg0.equals("showcolmap")) {
                class366.field4726 = true;
                class107.method830(102);
                class697.method3800("colmap is shown", 1);
                return;
            }
            if (arg0.equals("hidecolmap")) {
                class366.field4726 = false;
                class107.method830(110);
                class697.method3800("colmap is hidden", 1);
                return;
            }
            if (arg0.equals("resetcache")) {
                class705.method3852(0);
                class697.method3800("Caches reset", 1);
                return;
            }
            if (arg0.equals("profilecpu")) {
                class697.method3800(class328.method1894(true) + "ms", arg2 ^ 0xFFFFFFFD);
                return;
            }
            if (arg0.startsWith("cpuusage")) {
                int var26 = Integer.parseInt(arg0.substring(9));
                if (var26 >= 0 && var26 <= 4) {
                    class260.field3509.field1306 = var26;
                }
                class697.method3800("cpuusage=" + class260.field3509.field1306, 1);
                return;
            }
            if (arg0.startsWith("getclientvarpbit")) {
                int var27 = Integer.parseInt(arg0.substring(17));
                class697.method3800("varpbit=" + class397.field5054.method15(var27, arg2 + 8), 1);
                return;
            }
            if (arg0.startsWith("getclientvarp")) {
                int var28 = Integer.parseInt(arg0.substring(14));
                class697.method3800("varp=" + class397.field5054.method14(arg2 ^ 0xFFFFFFFC, var28), 1);
                return;
            }
            if (arg0.startsWith("demologin")) {
                class483.method2665(0, 3, false);
                return;
            }
            if (arg0.startsWith("newdemologin")) {
                class483.method2665(0, 3, true);
                return;
            }
            if (arg0.startsWith("directlogin")) {
                String[] var29 = class420.method2420(' ', 62, arg0.substring(12));
                if (var29.length >= 2) {
                    int var30 = var29.length > 2 ? Integer.parseInt(var29[2]) : 0;
                    class700.method3832(var29[0], 51, var29[1], var30);
                    return;
                }
            }
            if (arg0.startsWith("csprofileclear")) {
                class709.method3889();
                return;
            }
            if (arg0.startsWith("csprofileoutputc")) {
                class709.method3891(100, false);
                return;
            }
            if (arg0.startsWith("csprofileoutputt")) {
                class709.method3891(10, true);
                return;
            }
            if (arg0.startsWith("texsize")) {
                int var31 = Integer.parseInt(arg0.substring(8));
                class520.field6799.method348(var31);
                return;
            }
            if (arg0.equals("soundstreamcount")) {
                class697.method3800("Active streams: " + class690.field9426.method2242(), 1);
                return;
            }
            if (arg0.equals("autosetup")) {
                class260.field3509.method1586(3);
                class697.method3800("Complete. Toolkit now: " + class364.field4697, arg2 + 5);
                return;
            }
            if (arg0.equals("errormessage")) {
                class697.method3800(class381.field4890.method711((byte) -16), arg2 ^ 0xFFFFFFFD);
                return;
            }
            if (class566.field7391 == 10) {
                class315.field4077++;
                class11 var32 = class130.method931(class649.field9035, (byte) 54, class694.field9490);
                var32.field114.method2352(true, arg0.length() + 3);
                var32.field114.method2352(true, arg1 ? 1 : 0);
                var32.field114.method2352(true, arg3 ? 1 : 0);
                var32.field114.method2374(arg0, arg2 - 96);
                class100.method760(var32, 88);
            }
            if (arg0.startsWith("fps ") && class555.field7261 != class119.field1536) {
                class622.method3418(arg2 - 13630, class703.method3845((byte) -94, arg0.substring(4)));
                return;
            }
            if (class566.field7391 != 10) {
                class697.method3800("Unrecogonised commmand when not logged in: " + arg0, 1);
                return;
            }
        } catch (Exception var36) {
            class697.method3800("Whoops, something went wrong.", arg2 ^ 0xFFFFFFFD);
            return;
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(IIIIIIZ)V", line = 1000)
    public final void method3529(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field8896++;
        int var8 = 0;
        if (arg0 != arg1) {
            var8 = (arg5 - arg4 << 16) / (arg1 - arg0);
        }
        int var9 = 0;
        if (arg1 != arg3) {
            var9 = (arg2 - arg5 << 16) / (arg3 - arg1);
        }
        if (arg6) {
            return;
        }
        int var10 = 0;
        if (arg0 != arg3) {
            var10 = (arg4 - arg2 << 16) / (arg0 - arg3);
        }
        if (arg0 <= arg1 && arg0 <= arg3) {
            if (arg1 >= arg3) {
                int var11;
                int var12 = var11 = arg4 << 16;
                if (arg0 < 0) {
                    var12 -= arg0 * var10;
                    var11 -= arg0 * var8;
                    arg0 = 0;
                }
                int var13 = arg2 << 16;
                if (arg3 < 0) {
                    var13 -= arg3 * var9;
                    arg3 = 0;
                }
                if (arg0 != arg3 && var10 < var8 || arg0 == arg3 && var9 > var8) {
                    int var14 = arg1 - arg3;
                    int var15 = arg3 - arg0;
                    int var16 = this.field8907 * arg0;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class584.method3193(0, var13 >> 16, -9723, var11 >> 16, this.field8903, var16);
                                var13 += var9;
                                var11 += var8;
                                var16 += this.field8907;
                            }
                        }
                        class584.method3193(0, var12 >> 16, -9723, var11 >> 16, this.field8903, var16);
                        var12 += var10;
                        var16 += this.field8907;
                        var11 += var8;
                    }
                } else {
                    int var17 = arg1 - arg3;
                    int var18 = arg3 - arg0;
                    int var19 = this.field8907 * arg0;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class584.method3193(0, var11 >> 16, -9723, var13 >> 16, this.field8903, var19);
                                var19 += this.field8907;
                                var13 += var9;
                                var11 += var8;
                            }
                        }
                        class584.method3193(0, var11 >> 16, -9723, var12 >> 16, this.field8903, var19);
                        var19 += this.field8907;
                        var11 += var8;
                        var12 += var10;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg4 << 16;
                if (arg0 < 0) {
                    var21 -= arg0 * var10;
                    var20 -= arg0 * var8;
                    arg0 = 0;
                }
                int var22 = arg5 << 16;
                if (arg1 < 0) {
                    var22 -= arg1 * var9;
                    arg1 = 0;
                }
                if (arg0 != arg1 && var8 > var10 || arg0 == arg1 && var9 < var10) {
                    int var23 = arg3 - arg1;
                    int var24 = arg1 - arg0;
                    int var25 = this.field8907 * arg0;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class584.method3193(0, var21 >> 16, -9723, var22 >> 16, this.field8903, var25);
                                var22 += var9;
                                var25 += this.field8907;
                                var21 += var10;
                            }
                        }
                        class584.method3193(0, var21 >> 16, -9723, var20 >> 16, this.field8903, var25);
                        var21 += var10;
                        var25 += this.field8907;
                        var20 += var8;
                    }
                } else {
                    int var26 = arg3 - arg1;
                    int var27 = arg1 - arg0;
                    int var28 = this.field8907 * arg0;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class584.method3193(0, var22 >> 16, -9723, var21 >> 16, this.field8903, var28);
                                var28 += this.field8907;
                                var21 += var10;
                                var22 += var9;
                            }
                        }
                        class584.method3193(0, var20 >> 16, -9723, var21 >> 16, this.field8903, var28);
                        var20 += var8;
                        var28 += this.field8907;
                        var21 += var10;
                    }
                }
            }
        } else if (arg3 < arg1) {
            if (arg1 > arg0) {
                int var29;
                int var30 = var29 = arg2 << 16;
                if (arg3 < 0) {
                    var29 -= arg3 * var10;
                    var30 -= arg3 * var9;
                    arg3 = 0;
                }
                int var31 = arg4 << 16;
                if (arg0 < 0) {
                    var31 -= arg0 * var8;
                    arg0 = 0;
                }
                if (var10 <= var9) {
                    int var32 = arg1 - arg0;
                    int var33 = arg0 - arg3;
                    int var34 = this.field8907 * arg3;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class584.method3193(0, var31 >> 16, -9723, var30 >> 16, this.field8903, var34);
                                var34 += this.field8907;
                                var31 += var8;
                                var30 += var9;
                            }
                        }
                        class584.method3193(0, var29 >> 16, -9723, var30 >> 16, this.field8903, var34);
                        var34 += this.field8907;
                        var29 += var10;
                        var30 += var9;
                    }
                } else {
                    int var35 = arg1 - arg0;
                    int var36 = arg0 - arg3;
                    int var37 = this.field8907 * arg3;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class584.method3193(0, var30 >> 16, -9723, var31 >> 16, this.field8903, var37);
                                var37 += this.field8907;
                                var30 += var9;
                                var31 += var8;
                            }
                        }
                        class584.method3193(0, var30 >> 16, -9723, var29 >> 16, this.field8903, var37);
                        var29 += var10;
                        var30 += var9;
                        var37 += this.field8907;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg2 << 16;
                int var40 = arg5 << 16;
                if (arg3 < 0) {
                    var39 -= arg3 * var9;
                    var38 -= arg3 * var10;
                    arg3 = 0;
                }
                if (arg1 < 0) {
                    var40 -= arg1 * var8;
                    arg1 = 0;
                }
                if (var9 < var10) {
                    int var41 = arg0 - arg1;
                    int var42 = arg1 - arg3;
                    int var43 = this.field8907 * arg3;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class584.method3193(0, var40 >> 16, -9723, var38 >> 16, this.field8903, var43);
                                var40 += var8;
                                var38 += var10;
                                var43 += this.field8907;
                            }
                        }
                        class584.method3193(0, var39 >> 16, -9723, var38 >> 16, this.field8903, var43);
                        var38 += var10;
                        var39 += var9;
                        var43 += this.field8907;
                    }
                } else {
                    int var44 = arg0 - arg1;
                    int var45 = arg1 - arg3;
                    int var46 = this.field8907 * arg3;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class584.method3193(0, var38 >> 16, -9723, var40 >> 16, this.field8903, var46);
                                var46 += this.field8907;
                                var40 += var8;
                                var38 += var10;
                            }
                        }
                        class584.method3193(0, var38 >> 16, -9723, var39 >> 16, this.field8903, var46);
                        var39 += var9;
                        var46 += this.field8907;
                        var38 += var10;
                    }
                }
            }
        } else if (arg0 > arg3) {
            int var47;
            int var48 = var47 = arg5 << 16;
            if (arg1 < 0) {
                var48 -= arg1 * var8;
                var47 -= arg1 * var9;
                arg1 = 0;
            }
            int var49 = arg2 << 16;
            if (arg3 < 0) {
                var49 -= arg3 * var10;
                arg3 = 0;
            }
            if (arg1 != arg3 && var9 > var8 || arg1 == arg3 && var8 > var10) {
                int var50 = arg0 - arg3;
                int var51 = arg3 - arg1;
                int var52 = this.field8907 * arg1;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class584.method3193(0, var48 >> 16, -9723, var49 >> 16, this.field8903, var52);
                            var48 += var8;
                            var52 += this.field8907;
                            var49 += var10;
                        }
                    }
                    class584.method3193(0, var48 >> 16, -9723, var47 >> 16, this.field8903, var52);
                    var47 += var9;
                    var52 += this.field8907;
                    var48 += var8;
                }
            } else {
                int var53 = arg0 - arg3;
                int var54 = arg3 - arg1;
                int var55 = this.field8907 * arg1;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class584.method3193(0, var49 >> 16, -9723, var48 >> 16, this.field8903, var55);
                            var49 += var10;
                            var48 += var8;
                            var55 += this.field8907;
                        }
                    }
                    class584.method3193(0, var47 >> 16, -9723, var48 >> 16, this.field8903, var55);
                    var48 += var8;
                    var47 += var9;
                    var55 += this.field8907;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg5 << 16;
            int var58 = arg4 << 16;
            if (arg1 < 0) {
                var57 -= arg1 * var8;
                var56 -= arg1 * var9;
                arg1 = 0;
            }
            if (arg0 < 0) {
                var58 -= arg0 * var10;
                arg0 = 0;
            }
            if (var8 < var9) {
                int var59 = arg3 - arg0;
                int var60 = arg0 - arg1;
                int var61 = this.field8907 * arg1;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class584.method3193(0, var58 >> 16, -9723, var56 >> 16, this.field8903, var61);
                            var58 += var10;
                            var56 += var9;
                            var61 += this.field8907;
                        }
                    }
                    class584.method3193(0, var57 >> 16, -9723, var56 >> 16, this.field8903, var61);
                    var56 += var9;
                    var61 += this.field8907;
                    var57 += var8;
                }
            } else {
                int var62 = arg3 - arg0;
                int var63 = arg0 - arg1;
                int var64 = this.field8907 * arg1;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class584.method3193(0, var56 >> 16, -9723, var58 >> 16, this.field8903, var64);
                            var56 += var9;
                            var64 += this.field8907;
                            var58 += var10;
                        }
                    }
                    class584.method3193(0, var56 >> 16, -9723, var57 >> 16, this.field8903, var64);
                    var64 += this.field8907;
                    var56 += var9;
                    var57 += var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(IIIII)V", line = 1440)
    public final void method3530(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field8900 = arg2 - arg1;
        if (arg0 != 4) {
            method3528(null, false, -71, true);
        }
        field8906++;
        this.field8905 = arg4;
        this.field8899 = arg1;
        this.field8907 = arg3 - arg4;
    }

    @OriginalMember(owner = "client!fw", name = "i", descriptor = "(I)V", line = 1458)
    public static void method3531(int arg0) {
        if (arg0 <= 13) {
            field8904 = null;
        }
        field8904 = null;
    }

    @OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(Lfc;II)V", line = 1469)
    public class640(class575 arg0, int arg1, int arg2) {
        this.field8903 = new byte[arg1 * arg2];
    }
}
