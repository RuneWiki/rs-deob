import jagex3.jagmisc.jagmisc;
import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class567 extends class335 {

    @OriginalMember(owner = "client!us", name = "M", descriptor = "Z")
    private boolean field7728 = true;

    @OriginalMember(owner = "client!us", name = "D", descriptor = "Z")
    private boolean field7719 = true;

    @OriginalMember(owner = "client!us", name = "F", descriptor = "I")
    public static int field7721 = -2;

    @OriginalMember(owner = "client!us", name = "L", descriptor = "[[Z")
    public static boolean[][] field7727 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!us", name = "B", descriptor = "I")
    public static int field7717;

    @OriginalMember(owner = "client!us", name = "C", descriptor = "I")
    public static int field7718;

    @OriginalMember(owner = "client!us", name = "E", descriptor = "I")
    public static int field7720;

    @OriginalMember(owner = "client!us", name = "G", descriptor = "I")
    public static int field7722;

    @OriginalMember(owner = "client!us", name = "H", descriptor = "I")
    public static int field7723;

    @OriginalMember(owner = "client!us", name = "I", descriptor = "I")
    public static int field7724;

    @OriginalMember(owner = "client!us", name = "J", descriptor = "Lgb;")
    public static class159 field7725;

    @OriginalMember(owner = "client!us", name = "K", descriptor = "Lga;")
    public static class332 field7726;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(ILio;I)V")
    public final void method2(int arg0, class157 arg1, int arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    super.field4537 = arg1.method930(255) == 1;
                }
            } else {
                this.field7728 = ~arg1.method930(arg2 + 321) == -2;
            }
        } else {
            this.field7719 = arg1.method930(255) == 1;
        }
        if (arg2 == -66) {
            ++field7722;
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method1(int arg0, boolean arg1) {
        ++field7723;
        int[][] var3 = super.field4527.method669(arg0, (byte) 2);
        if (super.field4527.field1468) {
            int[][] var4 = this.method1968(!this.field7728 ? arg0 : -arg0 + class326.field4386, 3, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (!this.field7719) {
                for (int var11 = 0; var11 < class649.field8968; ++var11) {
                    var8[var11] = var5[var11];
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                }
            } else {
                for (int var12 = 0; class649.field8968 > var12; ++var12) {
                    var8[var12] = var5[-var12 + class29.field413];
                    var9[var12] = var6[-var12 + class29.field413];
                    var10[var12] = var7[-var12 + class29.field413];
                }
            }
        }
        if (arg1) {
            this.method1(-11, true);
        }
        return var3;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(ILga;I)Lf;")
    public static final class532 method3141(int arg0, class332 arg1, int arg2) {
        ++field7720;
        int var3 = -3 % ((62 - arg0) / 39);
        class532 var4 = (class532) class481.field6687.method2176(-128, (long) arg2);
        if (var4 == null) {
            if (!class637.field8806) {
                var4 = class499.method2829(78, arg1.method1946(0, arg2));
            } else {
                var4 = class146.field1963.method1139(class92.method508(arg1, arg2), true);
            }
            class481.field6687.method2174(var4, (long) arg2, (byte) -17);
        }
        return var4;
    }

    @OriginalMember(owner = "client!us", name = "<init>", descriptor = "()V")
    public class567() {
        super(1, false);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(ZI)[I")
    public final int[] method3(boolean arg0, int arg1) {
        ++field7724;
        if (!arg0) {
            field7721 = 115;
        }
        int[] var3 = super.field4525.method2344(-2, arg1);
        if (super.field4525.field5435) {
            int[] var4 = this.method1969(0, this.field7728 ? -arg1 + class326.field4386 : arg1, -106);
            if (this.field7719) {
                for (int var5 = 0; class649.field8968 > var5; ++var5) {
                    var3[var5] = var4[class29.field413 - var5];
                }
            } else {
                class2.method10(var4, 0, var3, 0, class649.field8968);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)V")
    public static final void method3142(String arg0, String arg1, int arg2, int arg3) {
        ++field7717;
        class149.field2037 = arg3;
        class378.field5005 = 2;
        if (arg2 != -11) {
            field7727 = null;
        }
        class32.method195(false, arg2 ^ -11710, arg1, arg0);
    }

    @OriginalMember(owner = "client!us", name = "d", descriptor = "(I)V")
    public static void method3143(int arg0) {
        field7726 = null;
        field7727 = null;
        if (arg0 >= -46) {
            method3143(28);
        }
        field7725 = null;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Ljava/lang/String;IZZ)V")
    public static final void method3144(String arg0, int arg1, boolean arg2, boolean arg3) {
        ++field7718;
        try {
            if (arg0.equalsIgnoreCase("commands") || arg0.equalsIgnoreCase("help")) {
                class592.method3278((byte) -59, "commands - This command");
                class592.method3278((byte) -59, "cls - Clear console");
                class592.method3278((byte) -59, "displayfps - Toggle FPS and other information");
                class592.method3278((byte) -59, "renderer - Print graphics renderer information");
                class592.method3278((byte) -59, "heap - Print java memory information");
                return;
            }
            if (arg0.equalsIgnoreCase("cls")) {
                class627.field8682 = 0;
                class410.field5398 = 0;
                return;
            }
            if (arg0.equalsIgnoreCase("displayfps")) {
                class559.field7627 = !class559.field7627;
                if (!class559.field7627) {
                    class592.method3278((byte) -59, "FPS off");
                    return;
                }
                class592.method3278((byte) -59, "FPS on");
                return;
            }
            if (arg0.equals("renderer")) {
                class102 var4 = class146.field1963.method1141();
                class592.method3278((byte) -59, "Vendor: " + var4.field1218);
                class592.method3278((byte) -59, "Name: " + var4.field1221);
                class592.method3278((byte) -59, "Version: " + var4.field1220);
                class592.method3278((byte) -59, "Device: " + var4.field1217);
                class592.method3278((byte) -59, "Driver Version: " + var4.field1222);
                return;
            }
            if (arg0.equals("heap")) {
                class592.method3278((byte) -59, "Heap: " + client.field9616 + "MB");
                return;
            }
            if (arg1 != 100) {
                method3143(93);
            }
        } catch (Exception var36) {
            class592.method3278((byte) -59, class371.field4881.method2141(class422.field5539, true));
            return;
        }
        if (class480.field6673 != class180.field2522 || ~class121.field1585 <= -3) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equals("nativememerror")) {
                throw new OutOfMemoryError("native(MPR");
            }
            try {
                if (arg0.equalsIgnoreCase("printfps")) {
                    class592.method3278((byte) -59, "FPS: " + class91.field1119);
                    return;
                }
                if (arg0.equalsIgnoreCase("occlude")) {
                    class611.field8479 = !class611.field8479;
                    if (class611.field8479) {
                        class592.method3278((byte) -59, "Occlsion now on!");
                        return;
                    }
                    class592.method3278((byte) -59, "Occlsion now off!");
                    return;
                }
                if (arg0.equalsIgnoreCase("fpson")) {
                    class559.field7627 = true;
                    class592.method3278((byte) -59, "fps debug enabled");
                    return;
                }
                if (arg0.equalsIgnoreCase("fpsoff")) {
                    class559.field7627 = false;
                    class592.method3278((byte) -59, "fps debug disabled");
                    return;
                }
                if (arg0.equals("systemmem")) {
                    try {
                        class592.method3278((byte) -59, "System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
                        return;
                    } catch (Throwable var32) {
                        return;
                    }
                }
                if (arg0.equalsIgnoreCase("cleartext")) {
                    class110.field1298.method1306((byte) -128);
                    class592.method3278((byte) -59, "Text coords cleared");
                    return;
                }
                if (arg0.equalsIgnoreCase("gc")) {
                    class119.method694(-127);
                    for (int var5 = 0; ~var5 > -11; ++var5) {
                        System.gc();
                    }
                    Runtime var6 = Runtime.getRuntime();
                    int var7 = (int) ((var6.totalMemory() + -var6.freeMemory()) / 1024L);
                    class592.method3278((byte) -59, "mem=" + var7 + "k");
                    return;
                }
                if (arg0.equalsIgnoreCase("compact")) {
                    class119.method694(arg1 ^ -28);
                    for (int var8 = 0; ~var8 > -11; ++var8) {
                        System.gc();
                    }
                    Runtime var9 = Runtime.getRuntime();
                    int var10 = (int) ((var9.totalMemory() + -var9.freeMemory()) / 1024L);
                    class592.method3278((byte) -59, "Memory before cleanup=" + var10 + "k");
                    class616.method3405(-99);
                    class119.method694(arg1 + -228);
                    for (int var11 = 0; var11 < 10; ++var11) {
                        System.gc();
                    }
                    int var12 = (int) ((var9.totalMemory() + -var9.freeMemory()) / 1024L);
                    class592.method3278((byte) -59, "Memory after cleanup=" + var12 + "k");
                    return;
                }
                if (arg0.equalsIgnoreCase("unloadnatives")) {
                    class592.method3278((byte) -59, class591.method3269((byte) -42) ? "Libraries unloaded" : "Library unloading failed!");
                    return;
                }
                if (arg0.equalsIgnoreCase("clientdrop")) {
                    class592.method3278((byte) -59, "Dropped client connection");
                    if (~class576.field7861 != -11) {
                        if (class576.field7861 == 11) {
                            class447.field5920 = true;
                            return;
                        }
                    } else {
                        class284.method1685(0);
                    }
                    return;
                }
                if (arg0.equalsIgnoreCase("rotateconnectmethods")) {
                    class540.field7409.method1694(5);
                    class592.method3278((byte) -59, "Rotated connection methods");
                    return;
                }
                if (arg0.equalsIgnoreCase("clientjs5drop")) {
                    field7725.method983(24313);
                    class592.method3278((byte) -59, "Dropped client js5 net queue");
                    return;
                }
                if (arg0.equalsIgnoreCase("serverjs5drop")) {
                    field7725.method990((byte) -115);
                    class592.method3278((byte) -59, "Dropped server js5 net queue");
                    return;
                }
                if (arg0.equalsIgnoreCase("breakcon")) {
                    class312.field4206.method2231(104);
                    class163.field2346.method1161((byte) -46);
                    field7725.method987(122);
                    class592.method3278((byte) -59, "Breaking new connections for 5 seconds");
                    return;
                }
                if (arg0.equalsIgnoreCase("rebuild")) {
                    class446.method2514(false);
                    class349.method2071(arg1 ^ -31400);
                    class592.method3278((byte) -59, "Rebuilding map");
                    return;
                }
                if (arg0.equalsIgnoreCase("rebuildprofile")) {
                    class94.field1135 = class529.method2982((byte) -69);
                    class624.field8640 = true;
                    class446.method2514(false);
                    class349.method2071(-31428);
                    class592.method3278((byte) -59, "Rebuilding map (with profiling)");
                    return;
                }
                if (arg0.equalsIgnoreCase("wm1")) {
                    class152.method892(1, false, -1, -1, 3);
                    if (class702.method3945((byte) -109) != 1) {
                        class592.method3278((byte) -59, "wm1 failed");
                        return;
                    }
                    class592.method3278((byte) -59, "wm1 succeeded");
                    return;
                }
                if (arg0.equalsIgnoreCase("wm2")) {
                    class152.method892(2, false, -1, -1, 3);
                    if (~class702.method3945((byte) -112) == -3) {
                        class592.method3278((byte) -59, "wm2 succeeded");
                        return;
                    }
                    class592.method3278((byte) -59, "wm2 failed");
                    return;
                }
                if (arg0.equalsIgnoreCase("wm3")) {
                    class152.method892(3, false, 768, 1024, arg1 ^ 103);
                    if (~class702.method3945((byte) -103) == -4) {
                        class592.method3278((byte) -59, "wm3 succeeded");
                        return;
                    }
                    class592.method3278((byte) -59, "wm3 failed");
                    return;
                }
                if (arg0.equalsIgnoreCase("tk0")) {
                    class174.method1190(0, 0);
                    if (~class618.field8566 != -1) {
                        class592.method3278((byte) -59, "Failed to enter tk0");
                        return;
                    }
                    class592.method3278((byte) -59, "Entered tk0");
                    class602.field8408.field4344 = 0;
                    class602.field8408.method3557(class312.field4206, -2);
                    class375.field4974 = false;
                    return;
                }
                if (arg0.equalsIgnoreCase("tk1")) {
                    class174.method1190(0, 1);
                    if (~class618.field8566 != -2) {
                        class592.method3278((byte) -59, "Failed to enter tk1");
                        return;
                    }
                    class592.method3278((byte) -59, "Entered tk1");
                    class602.field8408.field4344 = 1;
                    class602.field8408.method3557(class312.field4206, arg1 ^ -102);
                    class375.field4974 = false;
                    return;
                }
                if (arg0.equalsIgnoreCase("tk2")) {
                    class174.method1190(0, 2);
                    if (~class618.field8566 == -3) {
                        class592.method3278((byte) -59, "Entered tk2");
                        class602.field8408.field4344 = 2;
                        class602.field8408.method3557(class312.field4206, arg1 + -102);
                        class375.field4974 = false;
                        return;
                    }
                    class592.method3278((byte) -59, "Failed to enter tk2");
                    return;
                }
                if (arg0.equalsIgnoreCase("tk3")) {
                    class174.method1190(0, 3);
                    if (~class618.field8566 != -4) {
                        class592.method3278((byte) -59, "Failed to enter tk3");
                        return;
                    }
                    class592.method3278((byte) -59, "Entered tk3");
                    class602.field8408.field4344 = 3;
                    class602.field8408.method3557(class312.field4206, -2);
                    class375.field4974 = false;
                    return;
                }
                if (arg0.equalsIgnoreCase("tk5")) {
                    class174.method1190(0, 5);
                    if (class618.field8566 == 5) {
                        class592.method3278((byte) -59, "Entered tk5");
                        class602.field8408.field4344 = 5;
                        class602.field8408.method3557(class312.field4206, arg1 + -102);
                        class375.field4974 = false;
                        return;
                    }
                    class592.method3278((byte) -59, "Failed to enter tk5");
                    return;
                }
                if (arg0.equalsIgnoreCase("ot")) {
                    class602.field8408.field4340 = !class602.field8408.field4340;
                    class602.field8408.method3557(class312.field4206, -2);
                    class375.field4974 = false;
                    class446.method2514(false);
                    class592.method3278((byte) -59, "ot=" + class602.field8408.field4340);
                    return;
                }
                if (arg0.equalsIgnoreCase("gb")) {
                    class602.field8408.field4319 = !class602.field8408.field4319;
                    class602.field8408.method3557(class312.field4206, -2);
                    class375.field4974 = false;
                    class446.method2514(false);
                    class592.method3278((byte) -59, "gb=" + class602.field8408.field4319);
                    return;
                }
                if (arg0.startsWith("shadows")) {
                    if (~arg0.length() > -9) {
                        class592.method3278((byte) -59, "Invalid shadows value");
                        return;
                    }
                    String var13 = arg0.substring(8);
                    int var14 = !class15.method100(var13, (byte) -76) ? -1 : class289.method1717(var13, -118);
                    if (~var14 <= -1 && ~var14 >= -3) {
                        class602.field8408.method1864((byte) 114, var14, class618.field8566);
                        class602.field8408.method3557(class312.field4206, -2);
                        class375.field4974 = false;
                        class446.method2514(false);
                        class592.method3278((byte) -59, "shadows=" + var14);
                        return;
                    }
                    class592.method3278((byte) -59, "Invalid shadows value");
                    return;
                }
                if (arg0.startsWith("textures")) {
                    class602.field8408.field4311 = !class602.field8408.field4311;
                    class602.field8408.method3557(class312.field4206, -2);
                    class375.field4974 = false;
                    class595.method3305((byte) 91);
                    class446.method2514(false);
                    class592.method3278((byte) -59, "textures=" + class602.field8408.field4311);
                    return;
                }
                if (arg0.startsWith("lighting")) {
                    class602.field8408.method1866(-24426, !class602.field8408.method1868(class618.field8566, arg1 ^ 101), class618.field8566);
                    class602.field8408.method3557(class312.field4206, -2);
                    class375.field4974 = false;
                    class382.method2189(true);
                    class595.method3305((byte) 91);
                    class446.method2514(false);
                    class592.method3278((byte) -59, "lighting=" + class602.field8408.method1868(class618.field8566, 1));
                    return;
                }
                if (arg0.startsWith("setba")) {
                    if (~arg0.length() > -7) {
                        class592.method3278((byte) -59, "Invalid buildarea value");
                        return;
                    }
                    int var15 = class289.method1717(arg0.substring(6), -110);
                    if (~var15 <= -1 && var15 <= class299.method1759(client.field9616, (byte) 88)) {
                        class602.field8408.field4317 = var15;
                        class602.field8408.method3557(class312.field4206, -2);
                        class375.field4974 = false;
                        class592.method3278((byte) -59, "maxbuildarea=" + class602.field8408.field4317);
                        return;
                    }
                    class592.method3278((byte) -59, "Invalid buildarea value");
                    return;
                }
                if (arg0.startsWith("rect_debug")) {
                    if (~arg0.length() > -11) {
                        class592.method3278((byte) -59, "Invalid rect_debug value");
                        return;
                    }
                    class220.field2869 = class289.method1717(arg0.substring(10).trim(), -106);
                    class592.method3278((byte) -59, "rect_debug=" + class220.field2869);
                    return;
                }
                if (arg0.equalsIgnoreCase("qa_op_test")) {
                    class452.field5967 = true;
                    class592.method3278((byte) -59, "qa_op_test=" + class452.field5967);
                    return;
                }
                if (arg0.equalsIgnoreCase("clipcomponents")) {
                    class650.field8973 = !class650.field8973;
                    class592.method3278((byte) -59, "clipcomponents=" + class650.field8973);
                    return;
                }
                if (arg0.startsWith("bloom")) {
                    boolean var16 = class146.field1963.method1098();
                    if (class516.method2928(!var16, 0)) {
                        if (var16) {
                            class592.method3278((byte) -59, "Bloom disabled");
                            return;
                        }
                        class592.method3278((byte) -59, "Bloom enabled");
                        return;
                    }
                    class592.method3278((byte) -59, "Failed to enable bloom");
                    return;
                }
                if (arg0.equalsIgnoreCase("tween")) {
                    if (class654.field9307) {
                        class654.field9307 = false;
                        class592.method3278((byte) -59, "Forced tweening disabled.");
                        return;
                    }
                    class654.field9307 = true;
                    class592.method3278((byte) -59, "Forced tweening ENABLED!");
                    return;
                }
                if (arg0.equalsIgnoreCase("shiftclick")) {
                    if (!class482.field6723) {
                        class592.method3278((byte) -59, "Shift-click ENABLED!");
                        class482.field6723 = true;
                        return;
                    }
                    class592.method3278((byte) -59, "Shift-click disabled.");
                    class482.field6723 = false;
                    return;
                }
                if (arg0.equalsIgnoreCase("getcgcoord")) {
                    class592.method3278((byte) -59, "x:" + (class408.field5369.field398 >> 9) + " z:" + (class408.field5369.field397 >> 9));
                    return;
                }
                if (arg0.equalsIgnoreCase("getheight")) {
                    class592.method3278((byte) -59, "Height: " + class246.field3214[class408.field5369.field385].method1611(class408.field5369.field398 >> 9, true, class408.field5369.field397 >> 9));
                    return;
                }
                if (arg0.equalsIgnoreCase("resetminimap")) {
                    class390.field5228.method1958(-29002);
                    class390.field5228.method1951(67);
                    class291.field3852.method1014(64);
                    class506.field6989.method2152((byte) -107);
                    class349.method2071(-31428);
                    class592.method3278((byte) -59, "Minimap reset");
                    return;
                }
                if (arg0.startsWith("mc")) {
                    if (class146.field1963.method1099()) {
                        int var17 = Integer.parseInt(arg0.substring(3));
                        if (var17 < 1) {
                            var17 = 1;
                        } else if (var17 > 4) {
                            var17 = 4;
                        }
                        class233.field3104 = var17;
                        class446.method2514(false);
                        class592.method3278((byte) -59, "Render cores now: " + class233.field3104);
                        return;
                    }
                    class592.method3278((byte) -59, "Current toolkit doesn't support multiple cores");
                    return;
                }
                if (arg0.startsWith("cachespace")) {
                    class592.method3278((byte) -59, "I(s): " + class206.field2757.method2178((byte) -62) + "/" + class206.field2757.method2181(true));
                    class592.method3278((byte) -59, "I(m): " + class315.field4217.method2178((byte) -83) + "/" + class315.field4217.method2181(true));
                    class592.method3278((byte) -59, "O(s): " + class87.field1058.field2919.method2251(0) + "/" + class87.field1058.field2919.method2245(0));
                    return;
                }
                if (arg0.equalsIgnoreCase("getcamerapos")) {
                    class592.method3278((byte) -59, "Pos: " + class408.field5369.field385 + "," + ((class82.field946 >> 9) + class125.field1745 >> 6) + "," + ((class147.field1980 >> 9) - -class4.field23 >> 6) + "," + ((class82.field946 >> 9) + class125.field1745 & 63) + "," + (63 & (class147.field1980 >> 9) + class4.field23) + " Height: " + (class180.method1211(class408.field5369.field385, true, class82.field946, class147.field1980) + -class148.field1986));
                    class592.method3278((byte) -59, "Look: " + class408.field5369.field385 + "," + (class155.field2184 + class125.field1745 >> 6) + "," + (class420.field5514 - -class4.field23 >> 6) + "," + (63 & class155.field2184 + class125.field1745) + "," + (63 & class420.field5514 + class4.field23) + " Height: " + (class180.method1211(class408.field5369.field385, true, class155.field2184, class420.field5514) + -class152.field2090));
                    return;
                }
                if (arg0.equals("renderprofile") || arg0.equals("rp")) {
                    class619.field8595 = !class619.field8595;
                    class146.field1963.method1093(class619.field8595);
                    class284.method1681(-23711);
                    class592.method3278((byte) -59, "showprofiling=" + class619.field8595);
                    return;
                }
                if (arg0.startsWith("performancetest")) {
                    int var18 = -1;
                    int var19 = 1000;
                    if (arg0.length() > 15) {
                        String[] var20 = class87.method475(' ', arg0, false);
                        try {
                            if (~var20.length < -2) {
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
                    if (~var18 == 0) {
                        class592.method3278((byte) -59, "Java toolkit: " + class87.method479(0, arg1 + -100, var19));
                        class592.method3278((byte) -59, "SSE toolkit:  " + class87.method479(2, arg1 ^ 100, var19));
                        class592.method3278((byte) -59, "D3D toolkit:  " + class87.method479(3, 0, var19));
                        class592.method3278((byte) -59, "GL toolkit:   " + class87.method479(1, 0, var19));
                        class592.method3278((byte) -59, "GLX toolkit:  " + class87.method479(5, arg1 + -100, var19));
                        return;
                    }
                    class592.method3278((byte) -59, "Performance: " + class87.method479(class618.field8566, 0, var19));
                    return;
                }
                if (arg0.equals("nonpcs")) {
                    class248.field3218 = !class248.field3218;
                    class592.method3278((byte) -59, "nonpcs=" + class248.field3218);
                    return;
                }
                if (arg0.equals("autoworld")) {
                    class361.method2115(1);
                    class592.method3278((byte) -59, "auto world selected");
                    return;
                }
                if (arg0.startsWith("switchworld")) {
                    int var21 = Integer.parseInt(arg0.substring(12));
                    class647.method3594(class393.method2264(var21, arg1 ^ -29).field3678, var21, 40000);
                    class592.method3278((byte) -59, "switched");
                    return;
                }
                if (arg0.equals("getworld")) {
                    class592.method3278((byte) -59, "w: " + class540.field7409.field3769);
                    return;
                }
                if (arg0.startsWith("pc")) {
                    class229 var22 = class97.method550(class71.field841, false, class158.field2266);
                    var22.field2971.method915(arg1 + -32014, 0);
                    int var23 = var22.field2971.field2219;
                    int var24 = arg0.indexOf(" ", 4);
                    var22.field2971.method936(arg0.substring(3, var24), -106);
                    class699.method3935(arg0.substring(var24), true, var22.field2971);
                    var22.field2971.method948(-9911, -var23 + var22.field2971.field2219);
                    class307.method1805(var22, -14704);
                    return;
                }
                if (arg0.equals("savevarcs")) {
                    class326.method1900(false);
                    class592.method3278((byte) -59, "perm varcs saved");
                    return;
                }
                if (arg0.equals("scramblevarcs")) {
                    for (int var25 = 0; ~class235.field3125.length < ~var25; ++var25) {
                        if (class516.field7179[var25]) {
                            class235.field3125[var25] = (int) (99999.0D * Math.random());
                            if (Math.random() > 0.5D) {
                                class235.field3125[var25] *= -1;
                            }
                        }
                    }
                    class326.method1900(false);
                    class592.method3278((byte) -59, "perm varcs scrambled");
                    return;
                }
                if (arg0.equals("showcolmap")) {
                    class151.field2068 = true;
                    class349.method2071(-31428);
                    class592.method3278((byte) -59, "colmap is shown");
                    return;
                }
                if (arg0.equals("hidecolmap")) {
                    class151.field2068 = false;
                    class349.method2071(-31428);
                    class592.method3278((byte) -59, "colmap is hidden");
                    return;
                }
                if (arg0.equals("resetcache")) {
                    class80.method430((byte) -126);
                    class592.method3278((byte) -59, "Caches reset");
                    return;
                }
                if (arg0.equals("profilecpu")) {
                    class592.method3278((byte) -59, class485.method2785((byte) 81) + "ms");
                    return;
                }
                if (arg0.startsWith("getclientvarpbit")) {
                    int var26 = Integer.parseInt(arg0.substring(17));
                    class592.method3278((byte) -59, "varpbit=" + class564.field7696.method90(var26, arg1 + 27058));
                    return;
                }
                if (arg0.startsWith("getclientvarp")) {
                    int var27 = Integer.parseInt(arg0.substring(14));
                    class592.method3278((byte) -59, "varp=" + class564.field7696.method93((byte) 104, var27));
                    return;
                }
                if (arg0.startsWith("demologin")) {
                    class509.method2888(0, -52, false);
                    return;
                }
                if (arg0.startsWith("newdemologin")) {
                    class509.method2888(0, -57, true);
                    return;
                }
                if (arg0.startsWith("directlogin")) {
                    String[] var28 = class87.method475(' ', arg0.substring(12), false);
                    if (var28.length >= 2) {
                        int var29 = var28.length <= 2 ? 0 : Integer.parseInt(var28[2]);
                        method3142(var28[1], var28[0], -11, var29);
                        return;
                    }
                }
                if (arg0.startsWith("csprofileclear")) {
                    class656.method3740();
                    return;
                }
                if (arg0.startsWith("csprofileoutputc")) {
                    class656.method3744(100, false);
                    return;
                }
                if (arg0.startsWith("csprofileoutputt")) {
                    class656.method3744(10, true);
                    return;
                }
                if (arg0.startsWith("texsize")) {
                    int var30 = Integer.parseInt(arg0.substring(8));
                    class146.field1963.method1109(var30);
                    return;
                }
                if (arg0.equals("soundstreamcount")) {
                    class592.method3278((byte) -59, "Active streams: " + class126.field1759.method1343());
                    return;
                }
                if (arg0.equals("autosetup")) {
                    class602.field8408.method3564(-24027);
                    class592.method3278((byte) -59, "Complete. Toolkit now: " + class618.field8566);
                    return;
                }
                if (arg0.equals("errormessage")) {
                    class592.method3278((byte) -59, class386.field5153.method2606(0));
                    return;
                }
                if (arg0.equals("heapdump")) {
                    if (class388.field5196.startsWith("win")) {
                        class274.method1651(new File("C:\\Temp\\heap.dump"), false, (byte) 111);
                    } else {
                        class274.method1651(new File("/tmp/heap.dump"), false, (byte) 110);
                    }
                    class592.method3278((byte) -59, "Done");
                    return;
                }
                if (arg0.equals("os")) {
                    class592.method3278((byte) -59, "Name: " + class388.field5196);
                    class592.method3278((byte) -59, "Arch: " + class388.field5177);
                    class592.method3278((byte) -59, "Ver: " + class388.field5184);
                    return;
                }
                if (arg0.equals("w2debug")) {
                    class303.field4023 = !class303.field4023;
                    class446.method2514(false);
                    class592.method3278((byte) -59, "Toggled!");
                    return;
                }
                if (~class576.field7861 == -11) {
                    ++class505.field6957;
                    class229 var31 = class97.method550(class71.field841, false, class50.field582);
                    var31.field2971.method915(-31914, 3 + arg0.length());
                    var31.field2971.method915(arg1 ^ -31950, !arg2 ? 0 : 1);
                    var31.field2971.method915(-31914, !arg3 ? 0 : 1);
                    var31.field2971.method936(arg0, -37);
                    class307.method1805(var31, arg1 + -14804);
                }
                if (arg0.startsWith("fps ") && class480.field6673 != class180.field2522) {
                    class75.method409(false, class289.method1717(arg0.substring(4), -102));
                    return;
                }
            } catch (Exception var35) {
                class592.method3278((byte) -59, class371.field4881.method2141(class422.field5539, true));
                return;
            }
        }
        if (class576.field7861 != 10) {
            class592.method3278((byte) -59, class371.field4882.method2141(class422.field5539, true) + arg0);
        }
    }
}
