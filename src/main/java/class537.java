import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class537 {

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "Ljava/lang/String;")
    private String field7441 = "null";

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "[I")
    public static int[] field7433 = new int[3];

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "I")
    public static int field7437 = 0;

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "Ljn;")
    public static class324 field7440 = new class324(13, 0, 1, 0);

    @OriginalMember(owner = "client!hk", name = "q", descriptor = "[J")
    public static long[] field7443 = new long[32];

    @OriginalMember(owner = "client!hk", name = "s", descriptor = "Z")
    public static boolean field7445 = false;

    @OriginalMember(owner = "client!hk", name = "u", descriptor = "I")
    public static int field7447 = 0;

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "C")
    public char field7439;

    @OriginalMember(owner = "client!hk", name = "r", descriptor = "C")
    public char field7444;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
    public static int field7427;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    public static int field7428;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
    private int field7429;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
    public static int field7430;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
    public static int field7432;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
    public static int field7434;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "I")
    public static int field7435;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
    public static int field7436;

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "I")
    public static int field7438;

    @OriginalMember(owner = "client!hk", name = "t", descriptor = "I")
    public static int field7446;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "Lbaa;")
    private class130 field7431;

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "Lbaa;")
    public class130 field7442;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BI)Z", line = 4)
    public final boolean method3174(byte arg0, int arg1) {
        field7435++;
        if (arg0 != 67) {
            return true;
        } else if (this.field7442 == null) {
            return false;
        } else {
            if (this.field7431 == null) {
                this.method3183(-1);
            }
            class27 var3 = (class27) this.field7431.method812(103, (long) arg1);
            return var3 != null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(BI)Ljava/lang/String;", line = 30)
    public final String method3175(byte arg0, int arg1) {
        field7428++;
        if (this.field7442 == null) {
            return this.field7441;
        } else {
            int var3 = -48 / ((-arg0 - 12) / 53);
            class481 var4 = (class481) this.field7442.method812(125, (long) arg1);
            return var4 == null ? this.field7441 : var4.field6707;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Luq;)V", line = 50)
    public static final void method3176(class318 arg0) {
        if (arg0 == null) {
            return;
        }
        for (int var1 = 0; var1 < 2; var1++) {
            class318 var2 = null;
            for (class318 var3 = class234.field3474[var1]; var3 != null; var3 = var3.field4412) {
                if (arg0 == var3) {
                    if (var2 == null) {
                        class234.field3474[var1] = var3.field4412;
                    } else {
                        var2.field4412 = var3.field4412;
                    }
                    class569.field7870 = true;
                    return;
                }
                var2 = var3;
            }
            class318 var4 = null;
            for (class318 var5 = class333.field4710[var1]; var5 != null; var5 = var5.field4412) {
                if (arg0 == var5) {
                    if (var4 == null) {
                        class333.field4710[var1] = var5.field4412;
                    } else {
                        var4.field4412 = var5.field4412;
                    }
                    class569.field7870 = true;
                    return;
                }
                var4 = var5;
            }
            class318 var6 = null;
            for (class318 var7 = class204.field2694[var1]; var7 != null; var7 = var7.field4412) {
                if (arg0 == var7) {
                    if (var6 == null) {
                        class204.field2694[var1] = var7.field4412;
                    } else {
                        var6.field4412 = var7.field4412;
                    }
                    class569.field7870 = true;
                    return;
                }
                var6 = var7;
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V", line = 132)
    private final void method3177(int arg0) {
        field7438++;
        this.field7431 = new class130(this.field7442.method814((byte) -84));
        if (arg0 == -19765) {
            for (class481 var2 = (class481) this.field7442.method821((byte) 109); var2 != null; var2 = (class481) this.field7442.method818(37)) {
                class291 var3 = new class291(var2.field6707, (int) var2.field1079);
                this.field7431.method820(class404.method2538(arg0 + 19640, var2.field6707), (byte) -42, var3);
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IB)I", line = 154)
    public final int method3178(int arg0, byte arg1) {
        if (arg1 != -27) {
            this.field7442 = null;
        }
        field7436++;
        if (this.field7442 == null) {
            return this.field7429;
        } else {
            class27 var3 = (class27) this.field7442.method812(109, (long) arg0);
            return var3 == null ? this.field7429 : var3.field347;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Z)V", line = 175)
    public static void method3179(boolean arg0) {
        field7443 = null;
        field7440 = null;
        field7433 = null;
        if (!arg0) {
            field7445 = true;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILdc;)V", line = 187)
    public final void method3180(int arg0, class63 arg1) {
        while (true) {
            int var3 = arg1.method505((byte) -119);
            if (var3 == 0) {
                field7434++;
                if (arg0 > -22) {
                    this.method3175((byte) -15, -2);
                    return;
                }
                return;
            }
            this.method3181(var3, arg1, -44);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILdc;I)V", line = 209)
    private final void method3181(int arg0, class63 arg1, int arg2) {
        if (arg0 == 1) {
            this.field7444 = class211.method1253(64, arg1.method491(false));
        } else if (arg0 == 2) {
            this.field7439 = class211.method1253(64, arg1.method491(false));
        } else if (arg0 == 3) {
            this.field7441 = arg1.method479((byte) -49);
        } else if (arg0 == 4) {
            this.field7429 = arg1.method457(-14532);
        } else if (arg0 == 5 || arg0 == 6) {
            int var4 = arg1.method482(-772591672);
            this.field7442 = new class130(class606.method3450(var4, (byte) -25));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method457(-14532);
                class71 var7;
                if (arg0 == 5) {
                    var7 = new class481(arg1.method479((byte) -90));
                } else {
                    var7 = new class27(arg1.method457(-14532));
                }
                this.field7442.method820((long) var6, (byte) -42, var7);
            }
        }
        if (arg2 > -38) {
            this.method3178(-60, (byte) 76);
        }
        field7430++;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BLjava/lang/String;ZZ)V", line = 266)
    public static final void method3182(byte arg0, String arg1, boolean arg2, boolean arg3) {
        field7446++;
        try {
            if (arg1.equalsIgnoreCase("commands") || arg1.equalsIgnoreCase("help")) {
                class261.method1772((byte) -116, "commands - This command");
                class261.method1772((byte) -124, "cls - Clear console");
                class261.method1772((byte) -124, "displayfps - Toggle FPS and other information");
                class261.method1772((byte) -112, "renderer - Print graphics renderer information");
                class261.method1772((byte) -104, "heap - Print java memory information");
                return;
            }
            if (arg1.equalsIgnoreCase("cls")) {
                field7437 = 0;
                class489.field6846 = 0;
                return;
            }
            if (arg1.equalsIgnoreCase("displayfps")) {
                class702.field9788 = !class702.field9788;
                if (class702.field9788) {
                    class261.method1772((byte) -105, "FPS on");
                    return;
                }
                class261.method1772((byte) -99, "FPS off");
                return;
            }
            if (arg1.equals("renderer")) {
                class299 var4 = class129.field1802.method263();
                class261.method1772((byte) -97, "Vendor: " + var4.field4236);
                class261.method1772((byte) -105, "Name: " + var4.field4239);
                class261.method1772((byte) -125, "Version: " + var4.field4235);
                class261.method1772((byte) -115, "Device: " + var4.field4245);
                class261.method1772((byte) -114, "Driver Version: " + var4.field4243);
                return;
            }
            if (arg1.equals("heap")) {
                class261.method1772((byte) -101, "Heap: " + class152.field2091 + "MB");
                return;
            }
        } catch (Exception var46) {
            class261.method1772((byte) -109, class155.field2119.method978(class120.field1576, (byte) -109));
            return;
        }
        if (class341.field4815 != class172.field2390 || class290.field4163 >= 2) {
            if (arg1.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg1.equals("nativememerror")) {
                throw new OutOfMemoryError("native(MPR");
            }
            try {
                if (arg1.equalsIgnoreCase("printfps")) {
                    class261.method1772((byte) -115, "FPS: " + class494.field6926);
                    return;
                }
                if (arg1.equalsIgnoreCase("occlude")) {
                    class762.field10630 = !class762.field10630;
                    if (class762.field10630) {
                        class261.method1772((byte) -117, "Occlsion now on!");
                        return;
                    }
                    class261.method1772((byte) -100, "Occlsion now off!");
                    return;
                }
                if (arg1.equalsIgnoreCase("fpson")) {
                    class702.field9788 = true;
                    class261.method1772((byte) -111, "fps debug enabled");
                    return;
                }
                if (arg1.equalsIgnoreCase("fpsoff")) {
                    class702.field9788 = false;
                    class261.method1772((byte) -99, "fps debug disabled");
                    return;
                }
                if (arg1.equals("systemmem")) {
                    try {
                        class261.method1772((byte) -112, "System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + class372.field5248.field8060 + "Mb");
                        return;
                    } catch (Throwable var40) {
                        return;
                    }
                }
                if (arg1.equalsIgnoreCase("cleartext")) {
                    class217.field2831.method1641(-109);
                    class261.method1772((byte) -126, "Text coords cleared");
                    return;
                }
                if (arg1.equalsIgnoreCase("gc")) {
                    class17.method82((byte) 116);
                    for (int var5 = 0; var5 < 10; var5++) {
                        System.gc();
                    }
                    Runtime var6 = Runtime.getRuntime();
                    int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                    class261.method1772((byte) -112, "mem=" + var7 + "k");
                    return;
                }
                if (arg1.equalsIgnoreCase("compact")) {
                    class17.method82((byte) 123);
                    for (int var8 = 0; var8 < 10; var8++) {
                        System.gc();
                    }
                    Runtime var9 = Runtime.getRuntime();
                    int var10 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                    class261.method1772((byte) -108, "Memory before cleanup=" + var10 + "k");
                    class699.method3954(true);
                    class17.method82((byte) -10);
                    for (int var11 = 0; var11 < 10; var11++) {
                        System.gc();
                    }
                    int var12 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                    class261.method1772((byte) -121, "Memory after cleanup=" + var12 + "k");
                    return;
                }
                if (arg1.equalsIgnoreCase("unloadnatives")) {
                    class261.method1772((byte) -114, class384.method2412((byte) -75) ? "Libraries unloaded" : "Library unloading failed!");
                    return;
                }
                if (arg1.equalsIgnoreCase("clientdrop")) {
                    class261.method1772((byte) -106, "Dropped client connection");
                    if (class102.field1401 == 10) {
                        class481.method2934(7);
                    } else if (class102.field1401 == 11) {
                        class320.field4450 = true;
                        return;
                    }
                    return;
                }
                if (arg1.equalsIgnoreCase("rotateconnectmethods")) {
                    class416.field5882.method2852(443);
                    class261.method1772((byte) -114, "Rotated connection methods");
                    return;
                }
                if (arg1.equalsIgnoreCase("clientjs5drop")) {
                    class396.field5689.method1917(-30857);
                    class261.method1772((byte) -103, "Dropped client js5 net queue");
                    return;
                }
                if (arg1.equalsIgnoreCase("serverjs5drop")) {
                    class396.field5689.method1915(0);
                    class261.method1772((byte) -128, "Dropped server js5 net queue");
                    return;
                }
                if (arg1.equalsIgnoreCase("breakcon")) {
                    class159.field2227.method868(-11738);
                    class713.field9960.method2224(97);
                    class396.field5689.method1914(6);
                    class261.method1772((byte) -116, "Breaking new connections for 5 seconds");
                    return;
                }
                if (arg1.equalsIgnoreCase("rebuild")) {
                    class573.method3360(89);
                    class367.method2313(true);
                    class261.method1772((byte) -108, "Rebuilding map");
                    return;
                }
                if (arg1.equalsIgnoreCase("rebuildprofile")) {
                    class10.field87 = class97.method664((byte) -50);
                    class96.field1343 = true;
                    class573.method3360(47);
                    class367.method2313(true);
                    class261.method1772((byte) -99, "Rebuilding map (with profiling)");
                    return;
                }
                if (arg1.equalsIgnoreCase("wm1")) {
                    class372.method2330(-1, 1, -1, false, 3);
                    if (class710.method3997(3) != 1) {
                        class261.method1772((byte) -106, "wm1 failed");
                        return;
                    }
                    class261.method1772((byte) -97, "wm1 succeeded");
                    return;
                }
                if (arg1.equalsIgnoreCase("wm2")) {
                    class372.method2330(-1, 2, -1, false, 3);
                    if (class710.method3997(3) != 2) {
                        class261.method1772((byte) -107, "wm2 failed");
                        return;
                    }
                    class261.method1772((byte) -113, "wm2 succeeded");
                    return;
                }
                if (arg1.equalsIgnoreCase("wm3")) {
                    class372.method2330(768, 3, 1024, false, 3);
                    if (class710.method3997(3) != 3) {
                        class261.method1772((byte) -108, "wm3 failed");
                        return;
                    }
                    class261.method1772((byte) -103, "wm3 succeeded");
                    return;
                }
                if (arg1.equalsIgnoreCase("tk0")) {
                    class393.method2459(0, false, 1);
                    if (class332.field4707.field4789.method963(0) != 0) {
                        class261.method1772((byte) -105, "Failed to enter tk0");
                        return;
                    }
                    class261.method1772((byte) -120, "Entered tk0");
                    class332.field4707.method2158(0, class332.field4707.field4753, -15);
                    class263.method1802(-2);
                    class726.field10056 = false;
                    return;
                }
                if (arg1.equalsIgnoreCase("tk1")) {
                    class393.method2459(1, false, 1);
                    if (class332.field4707.field4789.method963(0) == 1) {
                        class261.method1772((byte) -102, "Entered tk1");
                        class332.field4707.method2158(1, class332.field4707.field4753, -15);
                        class263.method1802(-2);
                        class726.field10056 = false;
                        return;
                    }
                    class261.method1772((byte) -99, "Failed to enter tk1");
                    return;
                }
                if (arg1.equalsIgnoreCase("tk2")) {
                    class393.method2459(2, false, 1);
                    if (class332.field4707.field4789.method963(0) == 2) {
                        class261.method1772((byte) -118, "Entered tk2");
                        class332.field4707.method2158(2, class332.field4707.field4753, -15);
                        class263.method1802(-2);
                        class726.field10056 = false;
                        return;
                    }
                    class261.method1772((byte) -128, "Failed to enter tk2");
                    return;
                }
                if (arg1.equalsIgnoreCase("tk3")) {
                    class393.method2459(3, false, 1);
                    if (class332.field4707.field4789.method963(0) == 3) {
                        class261.method1772((byte) -99, "Entered tk3");
                        class332.field4707.method2158(3, class332.field4707.field4753, -15);
                        class263.method1802(-2);
                        class726.field10056 = false;
                        return;
                    }
                    class261.method1772((byte) -105, "Failed to enter tk3");
                    return;
                }
                if (arg1.equalsIgnoreCase("tk5")) {
                    class393.method2459(5, false, 1);
                    if (class332.field4707.field4789.method963(0) == 5) {
                        class261.method1772((byte) -104, "Entered tk5");
                        class332.field4707.method2158(5, class332.field4707.field4753, -15);
                        class263.method1802(-2);
                        class726.field10056 = false;
                        return;
                    }
                    class261.method1772((byte) -120, "Failed to enter tk5");
                    return;
                }
                if (arg1.startsWith("setba")) {
                    if (arg1.length() < 6) {
                        class261.method1772((byte) -107, "Invalid buildarea value");
                        return;
                    }
                    int var13 = class341.method2169(arg1.substring(6), 99);
                    if (var13 >= 0 && var13 <= class390.method2453(class152.field2091, -13076)) {
                        class332.field4707.method2158(var13, class332.field4707.field4770, -15);
                        class263.method1802(-2);
                        class726.field10056 = false;
                        class261.method1772((byte) -104, "maxbuildarea=" + class332.field4707.field4770.method4029(0));
                        return;
                    }
                    class261.method1772((byte) -105, "Invalid buildarea value");
                    return;
                }
                if (arg1.startsWith("rect_debug")) {
                    if (arg1.length() < 10) {
                        class261.method1772((byte) -99, "Invalid rect_debug value");
                        return;
                    }
                    class51.field750 = class341.method2169(arg1.substring(10).trim(), -85);
                    class261.method1772((byte) -103, "rect_debug=" + class51.field750);
                    return;
                }
                if (arg1.equalsIgnoreCase("qa_op_test")) {
                    class498.field6966 = true;
                    class261.method1772((byte) -119, "qa_op_test=" + class498.field6966);
                    return;
                }
                if (arg1.equalsIgnoreCase("clipcomponents")) {
                    class370.field5231 = !class370.field5231;
                    class261.method1772((byte) -127, "clipcomponents=" + class370.field5231);
                    return;
                }
                if (arg1.startsWith("bloom")) {
                    boolean var14 = class129.field1802.method289();
                    if (!class424.method2639(!var14, 10)) {
                        class261.method1772((byte) -106, "Failed to enable bloom");
                        return;
                    }
                    if (var14) {
                        class261.method1772((byte) -123, "Bloom disabled");
                        return;
                    }
                    class261.method1772((byte) -125, "Bloom enabled");
                    return;
                }
                if (arg1.equalsIgnoreCase("tween")) {
                    if (!class175.field2409) {
                        class175.field2409 = true;
                        class261.method1772((byte) -120, "Forced tweening ENABLED!");
                        return;
                    }
                    class175.field2409 = false;
                    class261.method1772((byte) -125, "Forced tweening disabled.");
                    return;
                }
                if (arg1.equalsIgnoreCase("shiftclick")) {
                    if (!class46.field584) {
                        class261.method1772((byte) -102, "Shift-click ENABLED!");
                        class46.field584 = true;
                        return;
                    }
                    class261.method1772((byte) -119, "Shift-click disabled.");
                    class46.field584 = false;
                    return;
                }
                if (arg1.equalsIgnoreCase("getcgcoord")) {
                    class261.method1772((byte) -97, "x:" + (class388.field5601.field4410 >> 9) + " z:" + (class388.field5601.field4418 >> 9));
                    return;
                }
                if (arg1.equalsIgnoreCase("getheight")) {
                    class261.method1772((byte) -117, "Height: " + class433.field6043[class388.field5601.field4408].method2171(class388.field5601.field4418 >> 9, class388.field5601.field4410 >> 9, 31));
                    return;
                }
                if (arg1.equalsIgnoreCase("resetminimap")) {
                    class671.field9318.method1581(0);
                    class671.field9318.method1594((byte) 122);
                    class71.field1078.method3003((byte) 25);
                    class700.field9771.method10(-57);
                    class367.method2313(true);
                    class261.method1772((byte) -126, "Minimap reset");
                    return;
                }
                if (arg1.startsWith("mc")) {
                    if (class129.field1802.method1472()) {
                        int var15 = Integer.parseInt(arg1.substring(3));
                        if (var15 < 1) {
                            var15 = 1;
                        } else if (var15 > 4) {
                            var15 = 4;
                        }
                        class81.field1160 = var15;
                        class573.method3360(125);
                        class261.method1772((byte) -108, "Render cores now: " + class81.field1160);
                        return;
                    }
                    class261.method1772((byte) -112, "Current toolkit doesn't support multiple cores");
                    return;
                }
                if (arg1.startsWith("cachespace")) {
                    class261.method1772((byte) -111, "I(s): " + class491.field6905.method3903(-250) + "/" + class491.field6905.method3907(109));
                    class261.method1772((byte) -126, "I(m): " + class717.field9986.method3903(-250) + "/" + class717.field9986.method3907(106));
                    class261.method1772((byte) -121, "O(s): " + class291.field4179.field2998.method4089((byte) -64) + "/" + class291.field4179.field2998.method4085(1));
                    return;
                }
                if (arg1.equalsIgnoreCase("getcamerapos")) {
                    class261.method1772((byte) -123, "Pos: " + class388.field5601.field4408 + "," + ((class671.field9282 >> 9) + class113.field1509 >> 6) + "," + ((class123.field1680 >> 9) + class587.field7995 >> 6) + "," + ((class671.field9282 >> 9) + class113.field1509 & 0x3F) + "," + ((class123.field1680 >> 9) + class587.field7995 & 0x3F) + " Height: " + (class737.method4102((byte) 19, class671.field9282, class123.field1680, class388.field5601.field4408) - class206.field2702));
                    class261.method1772((byte) -115, "Look: " + class388.field5601.field4408 + "," + (class409.field5827 + class113.field1509 >> 6) + "," + (class49.field734 + class587.field7995 >> 6) + "," + (class409.field5827 + class113.field1509 & 0x3F) + "," + (class587.field7995 + class49.field734 & 0x3F) + " Height: " + (class737.method4102((byte) 19, class409.field5827, class49.field734, class388.field5601.field4408) - class724.field10048));
                    return;
                }
                if (arg1.equals("renderprofile") || arg1.equals("rp")) {
                    class108.field1446 = !class108.field1446;
                    class129.field1802.method272(class108.field1446);
                    class645.method3605(-112);
                    class261.method1772((byte) -120, "showprofiling=" + class108.field1446);
                    return;
                }
                if (arg1.startsWith("performancetest")) {
                    int var16 = -1;
                    int var17 = 1000;
                    if (arg1.length() > 15) {
                        String[] var18 = class494.method2992(' ', arg1, 1);
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
                        class261.method1772((byte) -101, "Performance: " + class470.method2864(var17, var16, 2048));
                        return;
                    }
                    class261.method1772((byte) -125, "Java toolkit: " + class470.method2864(var17, 0, 2048));
                    class261.method1772((byte) -117, "SSE toolkit:  " + class470.method2864(var17, 2, 2048));
                    class261.method1772((byte) -128, "D3D toolkit:  " + class470.method2864(var17, 3, 2048));
                    class261.method1772((byte) -110, "GL toolkit:   " + class470.method2864(var17, 1, 2048));
                    class261.method1772((byte) -110, "GLX toolkit:  " + class470.method2864(var17, 5, 2048));
                    return;
                }
                if (arg1.equals("nonpcs")) {
                    class76.field1107 = !class76.field1107;
                    class261.method1772((byte) -117, "nonpcs=" + class76.field1107);
                    return;
                }
                if (arg1.equals("autoworld")) {
                    class350.method2233(5121);
                    class261.method1772((byte) -100, "auto world selected");
                    return;
                }
                if (arg1.startsWith("switchworld")) {
                    int var19 = Integer.parseInt(arg1.substring(12));
                    class137.method909(-7000, var19, class76.method568(var19, 1).field5224);
                    class261.method1772((byte) -97, "switched");
                    return;
                }
                if (arg1.equals("getworld")) {
                    class261.method1772((byte) -105, "w: " + class416.field5882.field6484);
                    return;
                }
                if (arg1.startsWith("pc")) {
                    class583 var20 = class54.method400(class213.field2800, (byte) 116, class688.field9577);
                    var20.field7963.method444(0, 128);
                    int var21 = var20.field7963.field956;
                    int var22 = arg1.indexOf(" ", 4);
                    var20.field7963.method510(arg1.substring(3, var22), (byte) 61);
                    class542.method3206(arg1.substring(var22), var20.field7963, (byte) 30);
                    var20.field7963.method487(var20.field7963.field956 - var21, (byte) -110);
                    class463.method2838(var20, (byte) 123);
                    return;
                }
                if (arg1.equals("savevarcs")) {
                    class705.method3971(42);
                    class261.method1772((byte) -103, "perm varcs saved");
                    return;
                }
                if (arg1.equals("scramblevarcs")) {
                    for (int var23 = 0; var23 < class621.field8315.length; var23++) {
                        if (class693.field9627[var23]) {
                            class621.field8315[var23] = (int) (Math.random() * 99999.0D);
                            if (Math.random() > 0.5D) {
                                class621.field8315[var23] *= -1;
                            }
                        }
                    }
                    class705.method3971(112);
                    class261.method1772((byte) -101, "perm varcs scrambled");
                    return;
                }
                if (arg1.equals("showcolmap")) {
                    class617.field8295 = true;
                    class367.method2313(true);
                    class261.method1772((byte) -126, "colmap is shown");
                    return;
                }
                if (arg1.equals("hidecolmap")) {
                    class617.field8295 = false;
                    class367.method2313(true);
                    class261.method1772((byte) -116, "colmap is hidden");
                    return;
                }
                if (arg1.equals("resetcache")) {
                    class4.method20(0);
                    class261.method1772((byte) -126, "Caches reset");
                    return;
                }
                if (arg1.equals("profilecpu")) {
                    class261.method1772((byte) -119, class726.method4054(false) + "ms");
                    return;
                }
                if (arg1.startsWith("getclientvarpbit")) {
                    int var24 = Integer.parseInt(arg1.substring(17));
                    class261.method1772((byte) -104, "varpbit=" + class124.field1712.method3172(var24, (byte) 121));
                    return;
                }
                if (arg1.startsWith("getclientvarp")) {
                    int var25 = Integer.parseInt(arg1.substring(14));
                    class261.method1772((byte) -128, "varp=" + class124.field1712.method3173(false, var25));
                    return;
                }
                if (arg1.startsWith("directlogin")) {
                    String[] var26 = class494.method2992(' ', arg1.substring(12), 1);
                    if (var26.length >= 2) {
                        int var27 = var26.length <= 2 ? 0 : Integer.parseInt(var26[2]);
                        class656.method3658(var27, var26[1], -29993, var26[0]);
                        return;
                    }
                }
                if (arg1.startsWith("csprofileclear")) {
                    class546.method3224();
                    return;
                }
                if (arg1.startsWith("csprofileoutputc")) {
                    class546.method3230(100, false);
                    return;
                }
                if (arg1.startsWith("csprofileoutputt")) {
                    class546.method3230(10, true);
                    return;
                }
                if (arg1.startsWith("texsize")) {
                    int var28 = Integer.parseInt(arg1.substring(8));
                    class129.field1802.method1398(var28);
                    return;
                }
                if (arg1.equals("soundstreamcount")) {
                    class261.method1772((byte) -123, "Active streams: " + class483.field6739.method362());
                    return;
                }
                if (arg1.equals("autosetup")) {
                    class368.method2320(2);
                    class261.method1772((byte) -107, "Complete. Toolkit now: " + class332.field4707.field4789.method963(0));
                    return;
                }
                if (arg1.equals("errormessage")) {
                    class261.method1772((byte) -114, class516.field7210.method2183(105));
                    return;
                }
                if (arg1.equals("heapdump")) {
                    if (class135.field1937.startsWith("win")) {
                        class330.method2118(false, -103, new File("C:\\Temp\\heap.dump"));
                    } else {
                        class330.method2118(false, -39, new File("/tmp/heap.dump"));
                    }
                    class261.method1772((byte) -113, "Done");
                    return;
                }
                if (arg1.equals("os")) {
                    class261.method1772((byte) -116, "Name: " + class135.field1937);
                    class261.method1772((byte) -101, "Arch: " + class135.field1925);
                    class261.method1772((byte) -105, "Ver: " + class135.field1932);
                    return;
                }
                if (arg1.startsWith("w2debug")) {
                    int var29 = Integer.parseInt(arg1.substring(8, 9));
                    class24.field309 = var29;
                    class573.method3360(64);
                    class261.method1772((byte) -102, "Toggled!");
                    return;
                }
                if (arg1.startsWith("ortho ")) {
                    int var30 = arg1.indexOf(32);
                    if (var30 < 0) {
                        class261.method1772((byte) -97, "Syntax: ortho <n>");
                        return;
                    }
                    int var31 = class341.method2169(arg1.substring(var30 + 1), 71);
                    class332.field4707.method2158(var31, class332.field4707.field4777, -15);
                    class263.method1802(-2);
                    class726.field10056 = false;
                    class110.method718(-1);
                    if (var31 != class332.field4707.field4777.method677(0)) {
                        class261.method1772((byte) -112, "Failed to change ortho mode");
                        return;
                    }
                    class261.method1772((byte) -107, "Successfully changed ortho mode");
                    return;
                }
                if (arg1.startsWith("orthozoom ")) {
                    if (class332.field4707.field4777.method677(0) == 0) {
                        class261.method1772((byte) -116, "enable ortho mode first (use 'ortho <n>')");
                        return;
                    }
                    int var32 = class341.method2169(arg1.substring(arg1.indexOf(32) + 1), 71);
                    class3.field27 = var32;
                    class261.method1772((byte) -119, "orthozoom=" + class3.field27);
                    return;
                }
                if (arg1.startsWith("orthotilesize ")) {
                    int var33 = class341.method2169(arg1.substring(arg1.indexOf(32) + 1), 23);
                    class319.field4440 = var33;
                    class726.field10065 = var33;
                    class261.method1772((byte) -108, "ortho tile size=" + var33);
                    class110.method718(-1);
                    return;
                }
                if (arg1.equals("orthocamlock")) {
                    class701.field9780 = !class701.field9780;
                    class261.method1772((byte) -113, "ortho camera lock is " + (class701.field9780 ? "on" : "off"));
                    return;
                }
                if (arg1.startsWith("setoutput ")) {
                    File var34 = new File(arg1.substring(10));
                    if (var34.exists()) {
                        var34 = new File(arg1.substring(10) + "." + class97.method664((byte) -50) + ".log");
                        if (var34.exists()) {
                            class261.method1772((byte) -119, "file already exists!");
                            return;
                        }
                    }
                    if (class186.field2534 != null) {
                        class186.field2534.close();
                        class186.field2534 = null;
                    }
                    try {
                        class186.field2534 = new FileOutputStream(var34);
                        return;
                    } catch (FileNotFoundException var43) {
                        class261.method1772((byte) -126, "Could not create " + var34.getName());
                        return;
                    } catch (SecurityException var44) {
                        class261.method1772((byte) -123, "Cannot write to " + var34.getName());
                        return;
                    }
                }
                if (arg1.equals("closeoutput")) {
                    if (class186.field2534 != null) {
                        class186.field2534.close();
                    }
                    class186.field2534 = null;
                    return;
                }
                if (arg1.startsWith("runscript ")) {
                    File var35 = new File(arg1.substring(10));
                    if (!var35.exists()) {
                        class261.method1772((byte) -121, "No such file");
                        return;
                    }
                    byte[] var36 = class138.method911(var35, false);
                    if (var36 == null) {
                        class261.method1772((byte) -98, "Failed to read file");
                        return;
                    }
                    String[] var37 = class494.method2992('\n', class431.method2667(119, "", class479.method2919(var36, (byte) 87), '\r'), 1);
                    class238.method1607(29017, var37);
                }
                if (arg1.startsWith("zoom ")) {
                    short var38 = (short) class341.method2169(arg1.substring(5), -128);
                    if (var38 > 0) {
                        class621.field8313 = var38;
                    }
                    return;
                }
                if (class102.field1401 == 10) {
                    class508.field7053++;
                    class583 var39 = class54.method400(class213.field2800, (byte) 95, class559.field7766);
                    var39.field7963.method444(arg1.length() + 3, 128);
                    var39.field7963.method444(arg2 ? 1 : 0, 128);
                    var39.field7963.method444(arg3 ? 1 : 0, 128);
                    var39.field7963.method510(arg1, (byte) 61);
                    class463.method2838(var39, (byte) 124);
                }
                if (arg1.startsWith("fps ") && class341.field4815 != class172.field2390) {
                    class474.method2890(4313, class341.method2169(arg1.substring(4), 93));
                    return;
                }
            } catch (Exception var45) {
                class261.method1772((byte) -114, class155.field2119.method978(class120.field1576, (byte) -112));
                return;
            }
        }
        if (class102.field1401 != 10) {
            class261.method1772((byte) -124, class155.field2120.method978(class120.field1576, (byte) -124) + arg1);
        }
        if (arg0 >= -27) {
            field7440 = null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)V", line = 1264)
    private final void method3183(int arg0) {
        if (arg0 != -1) {
            this.method3183(65);
        }
        field7432++;
        this.field7431 = new class130(this.field7442.method814((byte) -84));
        for (class27 var2 = (class27) this.field7442.method821((byte) 114); var2 != null; var2 = (class27) this.field7442.method818(44)) {
            class27 var3 = new class27((int) var2.field1079);
            this.field7431.method820((long) var2.field347, (byte) -42, var3);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 1302)
    public final boolean method3184(String arg0, int arg1) {
        field7427++;
        if (this.field7442 == null) {
            return false;
        }
        if (arg1 != 63) {
            this.field7429 = 120;
        }
        if (this.field7431 == null) {
            this.method3177(-19765);
        }
        for (class291 var3 = (class291) this.field7431.method812(126, class404.method2538(-103, arg0)); var3 != null; var3 = (class291) this.field7431.method815((byte) 6)) {
            if (var3.field4180.equals(arg0)) {
                return true;
            }
        }
        return false;
    }
}
