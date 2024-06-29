import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public abstract class class481 extends class352 {

    @OriginalMember(owner = "client!es", name = "j", descriptor = "Z")
    public boolean field7059 = false;

    @OriginalMember(owner = "client!es", name = "g", descriptor = "Z")
    public boolean field7056 = false;

    @OriginalMember(owner = "client!es", name = "c", descriptor = "I")
    public int field7052;

    @OriginalMember(owner = "client!es", name = "l", descriptor = "I")
    public int field7061;

    @OriginalMember(owner = "client!es", name = "i", descriptor = "I")
    public int field7058;

    @OriginalMember(owner = "client!es", name = "d", descriptor = "S")
    public short field7053;

    @OriginalMember(owner = "client!es", name = "h", descriptor = "Lpu;")
    public static class179 field7057 = new class179("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

    @OriginalMember(owner = "client!es", name = "e", descriptor = "I")
    public static int field7054;

    @OriginalMember(owner = "client!es", name = "f", descriptor = "I")
    public static int field7055;

    @OriginalMember(owner = "client!es", name = "k", descriptor = "I")
    public static int field7060;

    @OriginalMember(owner = "client!es", name = "m", descriptor = "I")
    public static int field7062;

    @OriginalMember(owner = "client!es", name = "n", descriptor = "I")
    public static int field7063;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Lid;)V")
    public static final void method2900(class181 arg0) {
        if (class16.field172 >= 65535) {
            return;
        }
        class344 var1 = arg0.field2775;
        class356.field5270[class16.field172] = arg0;
        class354.field5239[class16.field172] = false;
        class16.field172++;
        int var2 = arg0.field2764;
        if (arg0.field2776) {
            var2 = 0;
        }
        int var3 = arg0.field2764;
        if (arg0.field2777) {
            var3 = class183.field2802 - 1;
        }
        for (int var4 = var2; var4 <= var3; var4++) {
            int var5 = 0;
            int var6 = var1.method2216(-1) + class74.field1258 - var1.method2218(921) >> class295.field4543;
            if (var6 < 0) {
                var5 -= var6;
                var6 = 0;
            }
            int var7 = var1.method2216(-1) + var1.method2218(921) - class74.field1258 >> class295.field4543;
            if (var7 >= class443.field6603) {
                var7 = class443.field6603 - 1;
            }
            for (int var8 = var6; var8 <= var7; var8++) {
                short var9 = arg0.field2769[var5++];
                int var10 = (var1.method2214((byte) 127) + class74.field1258 - var1.method2218(921) >> class295.field4543) + (var9 >>> 8);
                int var11 = (var9 & 0xFF) + var10 - 1;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 >= class474.field6947) {
                    var11 = class474.field6947 - 1;
                }
                for (int var12 = var10; var12 <= var11; var12++) {
                    long var13 = class424.field6221[var4][var12][var8];
                    if ((var13 & 0xFFFFL) == 0L) {
                        class424.field6221[var4][var12][var8] = var13 | (long) class16.field172;
                    } else if ((var13 & 0xFFFF0000L) == 0L) {
                        class424.field6221[var4][var12][var8] = var13 | (long) class16.field172 << 16;
                    } else if ((var13 & 0xFFFF00000000L) == 0L) {
                        class424.field6221[var4][var12][var8] = var13 | (long) class16.field172 << 32;
                    } else if ((var13 & 0xFFFF000000000000L) == 0L) {
                        class424.field6221[var4][var12][var8] = var13 | (long) class16.field172 << 48;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!es", name = "e", descriptor = "(I)Lvo;")
    public static final class358 method2901(int arg0) {
        field7055++;
        if (arg0 != 0) {
            method2906(94, null, -75, (byte) 81, -59, 91);
        }
        try {
            return (class358) Class.forName("rq").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!es", name = "d", descriptor = "(B)V")
    public static void method2902(byte arg0) {
        int var1 = 71 / ((-arg0 - 54) / 58);
        field7057 = null;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lfw;")
    public static final class341 method2903(Throwable arg0, String arg1) {
        field7062++;
        class341 var2;
        if ((arg0 instanceof class341)) {
            var2 = (class341) arg0;
            var2.field5091 = var2.field5091 + ' ' + arg1;
        } else {
            var2 = new class341(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(ZBLjava/lang/String;Z)V")
    public static final void method2904(boolean arg0, byte arg1, String arg2, boolean arg3) {
        if (arg1 != 6) {
            method2906(-99, null, 21, (byte) -27, -74, -78);
        }
        field7063++;
        if (class62.field991 == class287.field4471 && class224.field3421 < 2) {
            return;
        }
        if (arg2.equalsIgnoreCase("errortest")) {
            throw new RuntimeException();
        }
        if (arg2.equals("nativememerror")) {
            throw new OutOfMemoryError("native(MPR");
        }
        try {
            if (arg2.equalsIgnoreCase("fpson")) {
                class191.field2931 = true;
                class442.method2733("fps debug enabled", 8);
                return;
            }
            if (arg2.equalsIgnoreCase("fpsoff")) {
                class191.field2931 = false;
                class442.method2733("fps debug disabled", arg1 ^ 0xE);
                return;
            }
            if (arg2.equals("systemmem")) {
                try {
                    class442.method2733("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb", 8);
                    return;
                } catch (Throwable var27) {
                    return;
                }
            }
            if (arg2.equalsIgnoreCase("cls")) {
                class182.field2784 = 0;
                class193.field2966 = 0;
                return;
            }
            if (arg2.equalsIgnoreCase("cleartext")) {
                class470.field6904.method1079(true);
                class442.method2733("Text coords cleared", 8);
                return;
            }
            if (arg2.equalsIgnoreCase("gc")) {
                class52.method341(118);
                for (int var4 = 0; var4 < 10; var4++) {
                    System.gc();
                }
                Runtime var5 = Runtime.getRuntime();
                int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
                class442.method2733("mem=" + var6 + "k", arg1 + 2);
                return;
            }
            if (arg2.equalsIgnoreCase("compact")) {
                class52.method341(68);
                for (int var7 = 0; var7 < 10; var7++) {
                    System.gc();
                }
                Runtime var8 = Runtime.getRuntime();
                int var9 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
                class442.method2733("Memory before cleanup=" + var9 + "k", arg1 + 2);
                class474.method2869(31681);
                class52.method341(arg1 ^ 0xFFFFFFA2);
                for (int var10 = 0; var10 < 10; var10++) {
                    System.gc();
                }
                int var11 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
                class442.method2733("Memory after cleanup=" + var11 + "k", 8);
                return;
            }
            if (arg2.equalsIgnoreCase("pcachesize")) {
                class442.method2733("Number of player models in cache:" + class386.method2455(-125), arg1 ^ 0xE);
                return;
            }
            if (arg2.equalsIgnoreCase("clientdrop")) {
                class442.method2733("Dropped client connection", 8);
                if (class460.field6813 == 9) {
                    class176.method1248((byte) 126);
                } else if (class460.field6813 == 10) {
                    class295.field4544 = true;
                    return;
                }
                return;
            }
            if (arg2.equalsIgnoreCase("clientjs5drop")) {
                class201.field3108.method2522(1568);
                class442.method2733("Dropped client js5 net queue", 8);
                return;
            }
            if (arg2.equalsIgnoreCase("serverjs5drop")) {
                class201.field3108.method2532(116);
                class442.method2733("Dropped server js5 net queue", 8);
                return;
            }
            if (arg2.equalsIgnoreCase("breakcon")) {
                class122.field1844.method467(true);
                class541.field7922.method2156(-14524);
                class201.field3108.method2534(false);
                class442.method2733("Breaking new connections for 5 seconds", 8);
                return;
            }
            if (arg2.equalsIgnoreCase("rebuild")) {
                class8.method39(false);
                class236.method1604(-20769);
                class442.method2733("Rebuilding map", 8);
                return;
            }
            if (arg2.equalsIgnoreCase("wm1")) {
                class33.method196(1, false, 51, -1, -1);
                if (class159.method1145((byte) 121) == 1) {
                    class442.method2733("wm1 succeeded", 8);
                    return;
                }
                class442.method2733("wm1 failed", 8);
                return;
            }
            if (arg2.equalsIgnoreCase("wm2")) {
                class33.method196(2, false, 51, -1, -1);
                if (class159.method1145((byte) 121) != 2) {
                    class442.method2733("wm2 failed", 8);
                    return;
                }
                class442.method2733("wm2 succeeded", 8);
                return;
            }
            if (arg2.equalsIgnoreCase("wm3")) {
                class33.method196(3, false, 51, 1024, 768);
                if (class159.method1145((byte) 121) != 3) {
                    class442.method2733("wm3 failed", arg1 + 2);
                    return;
                }
                class442.method2733("wm3 succeeded", 8);
                return;
            }
            if (arg2.equalsIgnoreCase("tk0")) {
                class155.method1127(0, -30);
                if (class108.field1631 == 0) {
                    class442.method2733("Entered tk0", 8);
                    class40.field667.field4204 = 0;
                    class40.field667.method422(class122.field1844, 1);
                    class129.field1923 = false;
                    return;
                }
                class442.method2733("Failed to enter tk0", 8);
                return;
            }
            if (arg2.equalsIgnoreCase("tk1")) {
                class155.method1127(1, 1);
                if (class108.field1631 == 1) {
                    class442.method2733("Entered tk1", arg1 + 2);
                    class40.field667.field4204 = 1;
                    class40.field667.method422(class122.field1844, 1);
                    class129.field1923 = false;
                    return;
                }
                class442.method2733("Failed to enter tk1", 8);
                return;
            }
            if (arg2.equalsIgnoreCase("tk2")) {
                class155.method1127(2, -48);
                if (class108.field1631 != 2) {
                    class442.method2733("Failed to enter tk2", 8);
                    return;
                }
                class442.method2733("Entered tk2", 8);
                class40.field667.field4204 = 2;
                class40.field667.method422(class122.field1844, 1);
                class129.field1923 = false;
                return;
            }
            if (arg2.equalsIgnoreCase("tk3")) {
                class155.method1127(3, -118);
                if (class108.field1631 == 3) {
                    class442.method2733("Entered tk3", 8);
                    return;
                }
                class442.method2733("Failed to enter tk3", 8);
                return;
            }
            if (arg2.equalsIgnoreCase("ot")) {
                class40.field667.field4216 = !class40.field667.field4216;
                class40.field667.method422(class122.field1844, 1);
                class129.field1923 = false;
                class8.method39(false);
                class442.method2733("ot=" + class40.field667.field4216, 8);
                return;
            }
            if (arg2.equalsIgnoreCase("gb")) {
                class40.field667.field4198 = !class40.field667.field4198;
                class40.field667.method422(class122.field1844, 1);
                class129.field1923 = false;
                class8.method39(false);
                class442.method2733("gb=" + class40.field667.field4198, 8);
                return;
            }
            if (arg2.startsWith("shadows")) {
                if (arg2.length() < 8) {
                    class442.method2733("Invalid shadows value", 8);
                    return;
                }
                String var12 = arg2.substring(8);
                int var13 = class235.method1601(var12, arg1 ^ 0x51F5) ? class453.method2777(var12, arg1 + 4) : -1;
                if (var13 >= 0 && var13 <= 2) {
                    class40.field667.method1837(class108.field1631, var13, false);
                    class40.field667.method422(class122.field1844, arg1 - 5);
                    class129.field1923 = false;
                    class8.method39(false);
                    class442.method2733("shadows=" + var13, 8);
                    return;
                }
                class442.method2733("Invalid shadows value", 8);
                return;
            }
            if (arg2.startsWith("textures")) {
                class40.field667.field4217 = !class40.field667.field4217;
                class40.field667.method422(class122.field1844, 1);
                class129.field1923 = false;
                class499.method2979(32);
                class8.method39(false);
                class442.method2733("textures=" + class40.field667.field4217, 8);
                return;
            }
            if (arg2.startsWith("setba")) {
                if (arg2.length() < 6) {
                    class442.method2733("Invalid buildarea value", arg1 ^ 0xE);
                    return;
                }
                int var14 = class453.method2777(arg2.substring(6), 10);
                if (var14 >= 0 && var14 <= class463.method2837(class360.field5314, (byte) 89)) {
                    class40.field667.field4193 = var14;
                    class40.field667.method422(class122.field1844, 1);
                    class129.field1923 = false;
                    class442.method2733("maxbuildarea=" + class40.field667.field4193, 8);
                    return;
                }
                class442.method2733("Invalid buildarea value", arg1 ^ 0xE);
                return;
            }
            if (arg2.startsWith("setparticles")) {
                if (arg2.length() < 13) {
                    class442.method2733("Invalid particles value", 8);
                    return;
                }
                class486.method2941(arg1 ^ 0xFFFFFF97, class453.method2777(arg2.substring(13), 10));
                class40.field667.method422(class122.field1844, arg1 - 5);
                class129.field1923 = false;
                class442.method2733("particles=" + class463.method2835((byte) 107), 8);
                return;
            }
            if (arg2.startsWith("rect_debug")) {
                if (arg2.length() < 10) {
                    class442.method2733("Invalid rect_debug value", 8);
                    return;
                }
                class490.field7148 = class453.method2777(arg2.substring(10).trim(), 10);
                class442.method2733("rect_debug=" + class490.field7148, arg1 + 2);
                return;
            }
            if (arg2.equalsIgnoreCase("qa_op_test")) {
                class267.field4246 = true;
                class442.method2733("qa_op_test=" + class267.field4246, 8);
                return;
            }
            if (arg2.equalsIgnoreCase("clipcomponents")) {
                class431.field6386 = !class431.field6386;
                class442.method2733("clipcomponents=" + class431.field6386, 8);
                return;
            }
            if (arg2.startsWith("bloom")) {
                boolean var15 = class376.field5542.method544();
                if (class223.method1544((byte) -17, !var15)) {
                    if (!var15) {
                        class442.method2733("Bloom enabled", arg1 + 2);
                        return;
                    }
                    class442.method2733("Bloom disabled", arg1 + 2);
                    return;
                }
                class442.method2733("Failed to enable bloom", 8);
                return;
            }
            if (arg2.equalsIgnoreCase("tween")) {
                if (!class29.field324) {
                    class29.field324 = true;
                    class442.method2733("Forced tweening ENABLED!", 8);
                    return;
                }
                class29.field324 = false;
                class442.method2733("Forced tweening disabled.", arg1 + 2);
                return;
            }
            if (arg2.equalsIgnoreCase("shiftclick")) {
                if (!class76.field1289) {
                    class442.method2733("Shift-click ENABLED!", 8);
                    class76.field1289 = true;
                    return;
                }
                class442.method2733("Shift-click disabled.", 8);
                class76.field1289 = false;
                return;
            }
            if (arg2.equalsIgnoreCase("getcgcoord")) {
                class442.method2733("x:" + (class116.field1781.field1275 >> 7) + " z:" + (class116.field1781.field1279 >> 7), arg1 + 2);
                return;
            }
            if (arg2.equalsIgnoreCase("getheight")) {
                class442.method2733("Height: " + class407.field6024[class116.field1781.field1274].method56(class116.field1781.field1275 >> 7, class116.field1781.field1279 >> 7), 8);
                return;
            }
            if (arg2.equalsIgnoreCase("resetminimap")) {
                class510.field7431.method727((byte) -82);
                class510.field7431.method728((byte) -85);
                class384.field5647.method771(false);
                class455.field6765.method2183((byte) 126);
                class236.method1604(-20769);
                class442.method2733("Minimap reset", 8);
                return;
            }
            if (arg2.startsWith("mc")) {
                if (class376.field5542.method560()) {
                    int var16 = Integer.parseInt(arg2.substring(3));
                    if (var16 < 1) {
                        var16 = 1;
                    } else if (var16 > 4) {
                        var16 = 4;
                    }
                    class81.field1331 = var16;
                    class376.field5542.method504(class81.field1331);
                    class376.field5542.method549(0);
                    class442.method2733("Render cores now: " + class81.field1331, 8);
                    return;
                }
                class442.method2733("Current toolkit doesn't support multiple cores", 8);
                return;
            }
            if (arg2.startsWith("cachespace")) {
                class442.method2733("I(s): " + class249.field3884.method1640(arg1 + 21321) + "/" + class249.field3884.method1633((byte) 104), arg1 + 2);
                class442.method2733("I(m): " + class190.field2910.method1640(21327) + "/" + class190.field2910.method1633((byte) 114), 8);
                class442.method2733("O(s): " + class300.field4608.field4792.method1491(1) + "/" + class300.field4608.field4792.method1492(-102), 8);
                return;
            }
            if (arg2.equalsIgnoreCase("getcamerapos")) {
                class442.method2733("Pos: " + class116.field1781.field1274 + "," + ((class128.field1917 >> 7) + class422.field6201 >> 6) + "," + ((class406.field5999 >> 7) + class23.field273 >> 6) + "," + ((class128.field1917 >> 7) + class422.field6201 & 0x3F) + "," + ((class406.field5999 >> 7) + class23.field273 & 0x3F) + " Height: " + (class416.method2605(class406.field5999, class128.field1917, (byte) 115, class116.field1781.field1274) - class505.field7344), 8);
                class442.method2733("Look: " + class116.field1781.field1274 + "," + (class30.field340 + class422.field6201 >> 6) + "," + (class38.field638 + class23.field273 >> 6) + "," + (class422.field6201 + class30.field340 & 0x3F) + "," + (class38.field638 + class23.field273 & 0x3F) + " Height: " + (class416.method2605(class38.field638, class30.field340, (byte) -10, class116.field1781.field1274) - class310.field4730), 8);
                return;
            }
            if (arg2.equals("showocc")) {
                class156.field2404 = !class156.field2404;
                class8.method39(false);
                class442.method2733("showocc=" + class156.field2404, arg1 ^ 0xE);
                return;
            }
            if (arg2.equals("wallocc")) {
                class256.field4121 = !class256.field4121;
                class8.method39(false);
                class442.method2733("forcewallocc=" + class256.field4121, 8);
                return;
            }
            if (arg2.equals("renderprofile") || arg2.equals("rp")) {
                class118.field1821 = !class118.field1821;
                class376.field5542.method597(class118.field1821);
                class450.method2762((byte) 92);
                class442.method2733("showprofiling=" + class118.field1821, 8);
                return;
            }
            if (arg2.equals("performancetest")) {
                class442.method2733("Java toolkit: " + class8.method40(0, class122.field1844, (byte) -126), 8);
                class442.method2733("GL toolkit:   " + class8.method40(1, class122.field1844, (byte) -55), 8);
                class442.method2733("SSE toolkit:  " + class8.method40(2, class122.field1844, (byte) -79), 8);
                return;
            }
            if (arg2.equals("nonpcs")) {
                class341.field5092 = !class341.field5092;
                class442.method2733("nonpcs=" + class341.field5092, 8);
                return;
            }
            if (arg2.equals("autoworld")) {
                class511.method3037(-117);
                class442.method2733("auto world selected", 8);
                return;
            }
            if (arg2.startsWith("switchworld")) {
                int var17 = Integer.parseInt(arg2.substring(12));
                class13.method75(class500.method2987(var17, (byte) 101).field6223, var17, -122);
                class442.method2733("switched", 8);
                return;
            }
            if (arg2.equals("getworld")) {
                class442.method2733("w: " + class317.field4836.field5143, 8);
                return;
            }
            if (arg2.startsWith("pc")) {
                class110.method857(4095, class153.field2351);
                class312.field4752.method1381(0, (byte) 123);
                int var18 = class312.field4752.field2982;
                int var19 = arg2.indexOf(" ", 4);
                class312.field4752.method1343(arg2.substring(3, var19), (byte) -14);
                class7.method35(class312.field4752, 0, arg2.substring(var19));
                class312.field4752.method1354(class312.field4752.field2982 - var18, true);
                return;
            }
            if (arg2.equals("heap")) {
                class442.method2733("Heap: " + class360.field5314 + "MB", 8);
                return;
            }
            if (arg2.equals("savevarcs")) {
                class457.method2799(-30772);
                class442.method2733("perm varcs saved", 8);
                return;
            }
            if (arg2.equals("scramblevarcs")) {
                for (int var20 = 0; var20 < class395.field5835.length; var20++) {
                    if (class541.field7914[var20]) {
                        class395.field5835[var20] = (int) (Math.random() * 99999.0D);
                        if (Math.random() > 0.5D) {
                            class395.field5835[var20] *= -1;
                        }
                    }
                }
                class457.method2799(-30772);
                class442.method2733("perm varcs scrambled", 8);
                return;
            }
            if (arg2.equals("showcolmap")) {
                class508.field7383 = true;
                class236.method1604(-20769);
                class442.method2733("colmap is shown", arg1 + 2);
                return;
            }
            if (arg2.equals("hidecolmap")) {
                class508.field7383 = false;
                class236.method1604(-20769);
                class442.method2733("colmap is hidden", 8);
                return;
            }
            if (arg2.equals("resetcache")) {
                class64.method433(-86);
                class442.method2733("Caches reset", 8);
                return;
            }
            if (arg2.equals("profilecpu")) {
                class442.method2733(class293.method1961(0) + "ms", arg1 + 2);
                return;
            }
            if (arg2.startsWith("cpuusage")) {
                int var21 = Integer.parseInt(arg2.substring(9));
                if (var21 >= 0 && var21 <= 4) {
                    class40.field667.field4183 = var21;
                }
                class442.method2733("cpuusage=" + class40.field667.field4183, arg1 ^ 0xE);
                return;
            }
            if (arg2.startsWith("getclientvarpbit")) {
                int var22 = Integer.parseInt(arg2.substring(17));
                class442.method2733("varpbit=" + class288.field4476.method2111(var22, arg1 ^ 0x57), arg1 ^ 0xE);
                return;
            }
            if (arg2.startsWith("getclientvarp")) {
                int var23 = Integer.parseInt(arg2.substring(14));
                class442.method2733("varp=" + class288.field4476.method2110((byte) -69, var23), 8);
                return;
            }
            if (arg2.startsWith("demologin")) {
                class166.method1188(false, 0, (byte) -5);
                return;
            }
            if (arg2.startsWith("newdemologin")) {
                class166.method1188(true, 0, (byte) -5);
                return;
            }
            if (arg2.startsWith("directlogin")) {
                String[] var24 = class454.method2784(' ', arg1 ^ 0x7, arg2.substring(12));
                if (var24.length >= 2) {
                    int var25 = var24.length <= 2 ? 0 : Integer.parseInt(var24[2]);
                    class227.method1551(var24[1], (byte) -110, var24[0], var25);
                    return;
                }
            }
            if (arg2.startsWith("csprofileclear")) {
                class152.method1093();
                return;
            }
            if (arg2.startsWith("csprofileoutputc")) {
                class152.method1100(100, false);
                return;
            }
            if (arg2.startsWith("csprofileoutputt")) {
                class152.method1100(10, true);
                return;
            }
            if (arg2.startsWith("texsize")) {
                int var26 = Integer.parseInt(arg2.substring(8));
                class376.field5542.method595(var26);
                return;
            }
            if (arg2.equals("soundstreamcount")) {
                class442.method2733("Active streams: " + class503.field7313.method1801(), arg1 + 2);
                return;
            }
            if (arg2.equals("errormessage")) {
                class442.method2733(class281.field4379.method1657((byte) -92), arg1 + 2);
                return;
            }
            if (class460.field6813 == 9) {
                class110.method857(arg1 ^ 0xFF9, class183.field2806);
                class301.field4619++;
                class312.field4752.method1381(arg2.length() + 3, (byte) 79);
                class312.field4752.method1381(arg0 ? 1 : 0, (byte) 127);
                class312.field4752.method1381(arg3 ? 1 : 0, (byte) 120);
                class312.field4752.method1343(arg2, (byte) -14);
            }
            if (arg2.startsWith("fps ") && class62.field991 != class287.field4471) {
                class335.method2178((byte) -123, class453.method2777(arg2.substring(4), 10));
                return;
            }
            if (class460.field6813 != 9) {
                class442.method2733("Unrecogonised commmand when not logged in: " + arg2, 8);
                return;
            }
        } catch (Exception var28) {
            class442.method2733("Whoops, something went wrong.", 8);
            return;
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Z)V")
    public static final void method2905(boolean arg0) {
        field7054++;
        int var1 = 0;
        int var2 = 0;
        if (arg0) {
            method2903(null, null);
        }
        while (class338.field5076 > var2) {
            for (int var3 = 0; var3 < class250.field4077; var3++) {
                if (class5.method25(var3, true, 31386, class348.field5192, var2, var1)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(I[[[BIBII)V")
    public static final void method2906(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        class532.field7772++;
        class256.field4118 = 0;
        for (int var6 = class251.field4091; var6 < class183.field2802; var6++) {
            class281[][] var17 = class348.field5192[var6];
            for (int var18 = class83.field1368; var18 < class324.field4921; var18++) {
                for (int var19 = class7.field84; var19 < class20.field230; var19++) {
                    class281 var20 = var17[var18][var19];
                    if (var20 != null) {
                        if (class390.field5715[var18 + class16.field166 - class144.field2126][var19 + class16.field166 - class29.field323] && arg1 == null || var6 < arg2 || arg1[var6][var18][var19] != arg3) {
                            var20.field4370 = true;
                            var20.field4393 = true;
                            if (var20.field4381 == null) {
                                var20.field4391 = false;
                            } else {
                                var20.field4391 = true;
                            }
                            class256.field4118++;
                        } else {
                            var20.field4370 = false;
                            var20.field4393 = false;
                            var20.field4375 = 0;
                            if (var18 >= class144.field2126 - 16 && var18 <= class144.field2126 + 16 && var19 >= class29.field323 - 16 && var19 <= class29.field323 + 16 && (var20.field4380 != null || var20.field4390 != null || var20.field4376 != null || var20.field4389 != null || var20.field4371 != null || var20.field4381 != null)) {
                                class33.field398.method276(-1, var20);
                            }
                        }
                    }
                }
            }
        }
        boolean var7 = class407.field6024 == class288.field4475;
        for (int var8 = class251.field4091; var8 < class183.field2802; var8++) {
            float var9 = var7 ? 251.5F : 201.5F - (float) var8 * 50.0F - 0.5F;
            if (class319.field4840.method522() && var8 >= arg2 && arg1 != null) {
                int var10 = class390.field5715.length;
                if (class390.field5715.length + class83.field1368 > class474.field6947) {
                    var10 -= class390.field5715.length + class83.field1368 - class474.field6947;
                }
                int var11 = class390.field5715[0].length;
                if (class390.field5715[0].length + class7.field84 > class443.field6603) {
                    var11 -= class390.field5715[0].length + class7.field84 - class443.field6603;
                }
                int var12 = class321.field4872;
                while (true) {
                    if (var12 >= var10) {
                        class33.field398.method268(class407.field6024[var8], -1, var8, true, var9);
                        break;
                    }
                    int var13 = class83.field1368 + var12 - class321.field4872;
                    for (int var14 = class384.field5661; var14 < var11; var14++) {
                        class63.field999[var12][var14] = false;
                        if (class390.field5715[var12][var14]) {
                            int var15 = class7.field84 + var14 - class384.field5661;
                            for (int var16 = var8; var16 >= 0; var16--) {
                                if (class348.field5192[var16][var13][var15] != null && class348.field5192[var16][var13][var15].field4373 == var8) {
                                    class63.field999[var12][var14] = class348.field5192[var16][var13][var15].field4370;
                                    break;
                                }
                            }
                        }
                    }
                    var12++;
                }
            } else {
                class33.field398.method268(class407.field6024[var8], -1, var8, false, var9);
            }
            class33.field398.method269(91);
        }
        if (!class432.method2688(true)) {
            class432.method2688(false);
        }
    }

    @OriginalMember(owner = "client!es", name = "<init>", descriptor = "(IIIIZZ)V")
    public class481(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        this.field7052 = arg1;
        this.field7059 = arg4;
        this.field7061 = arg2;
        this.field7058 = arg0;
        this.field7053 = (short) arg3;
        this.field7056 = arg5;
    }

    static {
        new class179("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
    }
}
