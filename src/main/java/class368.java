import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class368 {

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "Lwfa;")
    private class388 field5377 = new class388();

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "Lak;")
    private class498 field5384 = new class498();

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "I")
    private int field5383;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "I")
    private int field5386;

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "Lqp;")
    private class715 field5387;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
    public static int field5378 = 0;

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "[S")
    public static short[] field5382 = new short[256];

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "I")
    public static int field5375;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
    public static int field5376;

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "I")
    public static int field5379;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "I")
    public static int field5380;

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "I")
    public static int field5381;

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "I")
    public static int field5385;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Z)V")
    public static void method2309(boolean arg0) {
        field5382 = null;
        if (!arg0) {
            field5382 = null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V")
    public final void method2310(int arg0) {
        this.field5384.method3031(arg0 ^ 0xFFFFF702);
        field5375++;
        this.field5387.method4013(-3);
        this.field5377 = new class388();
        if (arg0 != -19316) {
            this.field5377 = null;
        }
        this.field5386 = this.field5383;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(JB)Lwfa;")
    public final class388 method2311(long arg0, byte arg1) {
        field5380++;
        if (arg1 > -108) {
            this.method2311(107L, (byte) -77);
        }
        class388 var4 = (class388) this.field5387.method4020(arg0, (byte) -102);
        if (var4 != null) {
            this.field5384.method3029(0, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(BIII)I")
    public static final int method2312(byte arg0, int arg1, int arg2, int arg3) {
        field5379++;
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            if (arg0 <= 42) {
                field5382 = null;
            }
            return 7 - arg2;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(JLwfa;B)V")
    public final void method2313(long arg0, class388 arg1, byte arg2) {
        field5381++;
        if (this.field5386 == 0) {
            class388 var5 = this.field5384.method3030(-40);
            var5.method2656((byte) 119);
            var5.method2381(15735);
            if (this.field5377 == var5) {
                class388 var6 = this.field5384.method3030(110);
                var6.method2656((byte) 119);
                var6.method2381(15735);
            }
        } else {
            this.field5386--;
        }
        if (arg2 != -38) {
            this.field5384 = null;
        }
        this.field5387.method4022(arg1, -128, arg0);
        this.field5384.method3029(0, arg1);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)I")
    public static int method2314(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(JI)V")
    public final void method2315(long arg0, int arg1) {
        field5376++;
        if (arg1 != 16880) {
            return;
        }
        class388 var4 = (class388) this.field5387.method4020(arg0, (byte) -100);
        if (var4 != null) {
            var4.method2656((byte) 122);
            var4.method2381(15735);
            this.field5386++;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZLjava/lang/String;ZI)V")
    public static final void method2316(boolean arg0, String arg1, boolean arg2, int arg3) {
        field5385++;
        try {
            if (arg1.equalsIgnoreCase("commands") || arg1.equalsIgnoreCase("help")) {
                class646.method3726("commands - This command", -122);
                class646.method3726("cls - Clear console", -92);
                class646.method3726("displayfps - Toggle FPS and other information", arg3 - 118);
                class646.method3726("renderer - Print graphics renderer information", arg3 - 126);
                class646.method3726("heap - Print java memory information", -123);
                return;
            }
            if (arg1.equalsIgnoreCase("cls")) {
                class379.field5507 = 0;
                class319.field4347 = 0;
                return;
            }
            if (arg1.equalsIgnoreCase("displayfps")) {
                class372.field5403 = !class372.field5403;
                if (class372.field5403) {
                    class646.method3726("FPS on", arg3 - 136);
                    return;
                }
                class646.method3726("FPS off", -92);
                return;
            }
            if (arg1.equals("renderer")) {
                class729 var4 = class211.field3164.method1229();
                class646.method3726("Vendor: " + var4.field10230, arg3 ^ 0xFFFFFF9B);
                class646.method3726("Name: " + var4.field10238, -118);
                class646.method3726("Version: " + var4.field10236, -106);
                class646.method3726("Device: " + var4.field10233, -104);
                class646.method3726("Driver Version: " + var4.field10235, -98);
                return;
            }
            if (arg1.equals("heap")) {
                class646.method3726("Heap: " + class597.field8492 + "MB", -96);
                return;
            }
        } catch (Exception var46) {
            class646.method3726(class608.field8622.method3543(-24350, class45.field748), -107);
            return;
        }
        if (class536.field7793 != class25.field223 || class598.field8507 >= 2) {
            if (arg1.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg1.equals("nativememerror")) {
                throw new OutOfMemoryError("native(MPR");
            }
            try {
                if (arg1.equalsIgnoreCase("printfps")) {
                    class646.method3726("FPS: " + class162.field2322, -96);
                    return;
                }
                if (arg1.equalsIgnoreCase("occlude")) {
                    class522.field7591 = !class522.field7591;
                    if (!class522.field7591) {
                        class646.method3726("Occlsion now off!", -96);
                        return;
                    }
                    class646.method3726("Occlsion now on!", -118);
                    return;
                }
                if (arg1.equalsIgnoreCase("fpson")) {
                    class372.field5403 = true;
                    class646.method3726("fps debug enabled", -102);
                    return;
                }
                if (arg1.equalsIgnoreCase("fpsoff")) {
                    class372.field5403 = false;
                    class646.method3726("fps debug disabled", arg3 ^ 0xFFFFFFA8);
                    return;
                }
                if (arg1.equals("systemmem")) {
                    try {
                        class646.method3726("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb", arg3 - 119);
                        return;
                    } catch (Throwable var40) {
                        return;
                    }
                }
                if (arg1.equalsIgnoreCase("cleartext")) {
                    class562.field8147.method1525((byte) -104);
                    class646.method3726("Text coords cleared", arg3 - 127);
                    return;
                }
                if (arg1.equalsIgnoreCase("gc")) {
                    class700.method3933(0);
                    for (int var5 = 0; var5 < 10; var5++) {
                        System.gc();
                    }
                    Runtime var6 = Runtime.getRuntime();
                    int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                    class646.method3726("mem=" + var7 + "k", -111);
                    return;
                }
                if (arg1.equalsIgnoreCase("compact")) {
                    class700.method3933(arg3 ^ 0xA);
                    for (int var8 = 0; var8 < 10; var8++) {
                        System.gc();
                    }
                    Runtime var9 = Runtime.getRuntime();
                    int var10 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                    class646.method3726("Memory before cleanup=" + var10 + "k", -104);
                    class378.method2347(true);
                    class700.method3933(0);
                    for (int var11 = 0; var11 < 10; var11++) {
                        System.gc();
                    }
                    int var12 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                    class646.method3726("Memory after cleanup=" + var12 + "k", arg3 - 115);
                    return;
                }
                if (arg1.equalsIgnoreCase("unloadnatives")) {
                    class646.method3726(class641.method3703((byte) 48) ? "Libraries unloaded" : "Library unloading failed!", arg3 ^ 0xFFFFFF9A);
                    return;
                }
                if (arg1.equalsIgnoreCase("clientdrop")) {
                    class646.method3726("Dropped client connection", arg3 - 125);
                    if (class369.field5392 == 10) {
                        class125.method878(true);
                        return;
                    }
                    if (class369.field5392 == 11) {
                        class298.field4067 = true;
                    }
                    return;
                }
                if (arg1.equalsIgnoreCase("rotateconnectmethods")) {
                    class214.field3215.method3150((byte) -15);
                    class646.method3726("Rotated connection methods", -95);
                    return;
                }
                if (arg1.equalsIgnoreCase("clientjs5drop")) {
                    class488.field7032.method3869(arg3 ^ 0x2F);
                    class646.method3726("Dropped client js5 net queue", -94);
                    return;
                }
                if (arg1.equalsIgnoreCase("serverjs5drop")) {
                    class488.field7032.method3868(84);
                    class646.method3726("Dropped server js5 net queue", -106);
                    return;
                }
                if (arg1.equalsIgnoreCase("breakcon")) {
                    class345.field4749.method1869(arg3 + 4990);
                    class325.field4415.method1576(true);
                    class488.field7032.method3876(116);
                    class646.method3726("Breaking new connections for 5 seconds", -101);
                    return;
                }
                if (arg1.equalsIgnoreCase("rebuild")) {
                    class443.method2708(-381264440);
                    class40.method423((byte) 102);
                    class646.method3726("Rebuilding map", arg3 ^ 0xFFFFFF99);
                    return;
                }
                if (arg1.equalsIgnoreCase("rebuildprofile")) {
                    class314.field4254 = class465.method2818(arg3 ^ 0xF5);
                    class42.field709 = true;
                    class443.method2708(-381264440);
                    class40.method423((byte) 102);
                    class646.method3726("Rebuilding map (with profiling)", -103);
                    return;
                }
                if (arg1.equalsIgnoreCase("wm1")) {
                    class301.method1886(-1, false, (byte) 107, -1, 1);
                    if (class184.method1305(arg3 - 9) == 1) {
                        class646.method3726("wm1 succeeded", arg3 ^ 0xFFFFFF8D);
                        return;
                    }
                    class646.method3726("wm1 failed", arg3 - 117);
                    return;
                }
                if (arg1.equalsIgnoreCase("wm2")) {
                    class301.method1886(-1, false, (byte) 61, -1, 2);
                    if (class184.method1305(arg3 - 9) == 2) {
                        class646.method3726("wm2 succeeded", arg3 - 109);
                        return;
                    }
                    class646.method3726("wm2 failed", -94);
                    return;
                }
                if (arg1.equalsIgnoreCase("wm3")) {
                    class301.method1886(1024, false, (byte) 99, 768, 3);
                    if (class184.method1305(1) == 3) {
                        class646.method3726("wm3 succeeded", -121);
                        return;
                    }
                    class646.method3726("wm3 failed", -92);
                    return;
                }
                if (arg1.equalsIgnoreCase("tk0")) {
                    class403.method2449(false, 0, -104);
                    if (class243.field3580.field7975.method3775(false) != 0) {
                        class646.method3726("Failed to enter tk0", -115);
                        return;
                    }
                    class646.method3726("Entered tk0", -98);
                    class243.field3580.method3301(0, 24, class243.field3580.field8019);
                    class23.method102((byte) -74);
                    class713.field10057 = false;
                    return;
                }
                if (arg1.equalsIgnoreCase("tk1")) {
                    class403.method2449(false, 1, -123);
                    if (class243.field3580.field7975.method3775(false) == 1) {
                        class646.method3726("Entered tk1", arg3 - 105);
                        class243.field3580.method3301(1, 24, class243.field3580.field8019);
                        class23.method102((byte) -74);
                        class713.field10057 = false;
                        return;
                    }
                    class646.method3726("Failed to enter tk1", -125);
                    return;
                }
                if (arg1.equalsIgnoreCase("tk2")) {
                    class403.method2449(false, 2, -19);
                    if (class243.field3580.field7975.method3775(false) == 2) {
                        class646.method3726("Entered tk2", -103);
                        class243.field3580.method3301(2, arg3 ^ 0x12, class243.field3580.field8019);
                        class23.method102((byte) -74);
                        class713.field10057 = false;
                        return;
                    }
                    class646.method3726("Failed to enter tk2", arg3 - 119);
                    return;
                }
                if (arg1.equalsIgnoreCase("tk3")) {
                    class403.method2449(false, 3, arg3 ^ 0xFFFFFFDA);
                    if (class243.field3580.field7975.method3775(false) != 3) {
                        class646.method3726("Failed to enter tk3", -128);
                        return;
                    }
                    class646.method3726("Entered tk3", arg3 - 136);
                    class243.field3580.method3301(3, 24, class243.field3580.field8019);
                    class23.method102((byte) -74);
                    class713.field10057 = false;
                    return;
                }
                if (arg1.equalsIgnoreCase("tk5")) {
                    class403.method2449(false, 5, arg3 ^ 0xFFFFFFCD);
                    if (class243.field3580.field7975.method3775(false) != 5) {
                        class646.method3726("Failed to enter tk5", -102);
                        return;
                    }
                    class646.method3726("Entered tk5", -105);
                    class243.field3580.method3301(5, 24, class243.field3580.field8019);
                    class23.method102((byte) -74);
                    class713.field10057 = false;
                    return;
                }
                if (arg1.startsWith("setba")) {
                    if (arg1.length() < 6) {
                        class646.method3726("Invalid buildarea value", -107);
                        return;
                    }
                    int var13 = class321.method1993(arg1.substring(6), (byte) 119);
                    if (var13 >= 0 && class169.method1210((byte) -128, class597.field8492) >= var13) {
                        class243.field3580.method3301(var13, arg3 + 14, class243.field3580.field7974);
                        class23.method102((byte) -74);
                        class713.field10057 = false;
                        class646.method3726("maxbuildarea=" + class243.field3580.field7974.method1117(false), -118);
                        return;
                    }
                    class646.method3726("Invalid buildarea value", -107);
                    return;
                }
                if (arg1.startsWith("rect_debug")) {
                    if (arg1.length() < 10) {
                        class646.method3726("Invalid rect_debug value", arg3 - 110);
                        return;
                    }
                    class171.field2403 = class321.method1993(arg1.substring(10).trim(), (byte) 65);
                    class646.method3726("rect_debug=" + class171.field2403, arg3 - 108);
                    return;
                }
                if (arg1.equalsIgnoreCase("qa_op_test")) {
                    class284.field3960 = true;
                    class646.method3726("qa_op_test=" + class284.field3960, -100);
                    return;
                }
                if (arg1.equalsIgnoreCase("clipcomponents")) {
                    class247.field3605 = !class247.field3605;
                    class646.method3726("clipcomponents=" + class247.field3605, arg3 ^ 0xFFFFFF82);
                    return;
                }
                if (arg1.startsWith("bloom")) {
                    boolean var14 = class211.field3164.method1242();
                    if (class202.method1436(arg3 - 106, !var14)) {
                        if (!var14) {
                            class646.method3726("Bloom enabled", -126);
                            return;
                        }
                        class646.method3726("Bloom disabled", -117);
                        return;
                    }
                    class646.method3726("Failed to enable bloom", -110);
                    return;
                }
                if (arg1.equalsIgnoreCase("tween")) {
                    if (!class316.field4266) {
                        class316.field4266 = true;
                        class646.method3726("Forced tweening ENABLED!", arg3 - 103);
                        return;
                    }
                    class316.field4266 = false;
                    class646.method3726("Forced tweening disabled.", -99);
                    return;
                }
                if (arg1.equalsIgnoreCase("shiftclick")) {
                    if (class235.field3514) {
                        class646.method3726("Shift-click disabled.", -101);
                        class235.field3514 = false;
                        return;
                    }
                    class646.method3726("Shift-click ENABLED!", arg3 ^ 0xFFFFFFA8);
                    class235.field3514 = true;
                    return;
                }
                if (arg1.equalsIgnoreCase("getcgcoord")) {
                    class646.method3726("x:" + (class108.field1536.field3923 >> 9) + " z:" + (class108.field1536.field3916 >> 9), arg3 - 138);
                    return;
                }
                if (arg1.equalsIgnoreCase("getheight")) {
                    class646.method3726("Height: " + class95.field1372[class108.field1536.field3920].method2087(86, class108.field1536.field3923 >> 9, class108.field1536.field3916 >> 9), -96);
                    return;
                }
                if (arg1.equalsIgnoreCase("resetminimap")) {
                    class603.field8548.method2608(27491);
                    class603.field8548.method2589(0);
                    class258.field3697.method4088((byte) 126);
                    class386.field5581.method2686(-14237);
                    class40.method423((byte) 102);
                    class646.method3726("Minimap reset", -97);
                    return;
                }
                if (arg1.startsWith("mc")) {
                    if (class211.field3164.method343()) {
                        int var15 = Integer.parseInt(arg1.substring(3));
                        if (var15 < 1) {
                            var15 = 1;
                        } else if (var15 > 4) {
                            var15 = 4;
                        }
                        class598.field8503 = var15;
                        class443.method2708(arg3 - 381264450);
                        class646.method3726("Render cores now: " + class598.field8503, -118);
                        return;
                    }
                    class646.method3726("Current toolkit doesn't support multiple cores", -95);
                    return;
                }
                if (arg1.startsWith("cachespace")) {
                    class646.method3726("I(s): " + class172.field2412.method2215((byte) 123) + "/" + class172.field2412.method2212(1), -95);
                    class646.method3726("I(m): " + class207.field3137.method2215((byte) -105) + "/" + class207.field3137.method2212(1), -127);
                    class646.method3726("O(s): " + class425.field6147.field10401.method171(false) + "/" + class425.field6147.field10401.method173(arg3 ^ 0x72), arg3 - 117);
                    return;
                }
                if (arg1.equalsIgnoreCase("getcamerapos")) {
                    class646.method3726("Pos: " + class108.field1536.field3920 + "," + ((class518.field7473 >> 9) + class41.field693 >> 6) + "," + ((class123.field1698 >> 9) + class71.field1085 >> 6) + "," + ((class518.field7473 >> 9) + class41.field693 & 0x3F) + "," + ((class123.field1698 >> 9) + class71.field1085 & 0x3F) + " Height: " + (class530.method3211(class123.field1698, arg3 - 8, class518.field7473, class108.field1536.field3920) - class564.field8174), -113);
                    class646.method3726("Look: " + class108.field1536.field3920 + "," + (class572.field8256 + class41.field693 >> 6) + "," + (class80.field1148 + class71.field1085 >> 6) + "," + (class572.field8256 + class41.field693 & 0x3F) + "," + (class80.field1148 + class71.field1085 & 0x3F) + " Height: " + (class530.method3211(class80.field1148, 2, class572.field8256, class108.field1536.field3920) - class647.field9332), arg3 ^ 0xFFFFFF98);
                    return;
                }
                if (arg1.equals("renderprofile") || arg1.equals("rp")) {
                    class438.field6255 = !class438.field6255;
                    class211.field3164.method1230(class438.field6255);
                    class604.method3516(arg3 - 44);
                    class646.method3726("showprofiling=" + class438.field6255, -104);
                    return;
                }
                if (arg1.startsWith("performancetest")) {
                    int var16 = -1;
                    int var17 = 1000;
                    if (arg1.length() > 15) {
                        String[] var18 = class330.method2035(' ', arg1, (byte) 11);
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
                    if (var16 == -1) {
                        class646.method3726("Java toolkit: " + class472.method2842(var17, 0, 500), -108);
                        class646.method3726("SSE toolkit:  " + class472.method2842(var17, 2, 500), -91);
                        class646.method3726("D3D toolkit:  " + class472.method2842(var17, 3, 500), -119);
                        class646.method3726("GL toolkit:   " + class472.method2842(var17, 1, 500), -101);
                        class646.method3726("GLX toolkit:  " + class472.method2842(var17, 5, 500), -93);
                        return;
                    }
                    class646.method3726("Performance: " + class472.method2842(var17, class243.field3580.field7975.method3775(false), 500), -121);
                    return;
                }
                if (arg1.equals("nonpcs")) {
                    class386.field5578 = !class386.field5578;
                    class646.method3726("nonpcs=" + class386.field5578, -115);
                    return;
                }
                if (arg1.equals("autoworld")) {
                    class181.method1283(true);
                    class646.method3726("auto world selected", -111);
                    return;
                }
                if (arg1.startsWith("switchworld")) {
                    int var19 = Integer.parseInt(arg1.substring(12));
                    class51.method473(50000, var19, class613.method3569(32767, var19).field8412);
                    class646.method3726("switched", -107);
                    return;
                }
                if (arg1.equals("getworld")) {
                    class646.method3726("w: " + class214.field3215.field7472, arg3 - 115);
                    return;
                }
                if (arg1.startsWith("pc")) {
                    class88 var20 = class448.method2741((byte) 119, class360.field5277, class583.field8319);
                    var20.field1260.method2881(0, (byte) 114);
                    int var21 = var20.field1260.field6864;
                    int var22 = arg1.indexOf(" ", 4);
                    var20.field1260.method2902(arg1.substring(3, var22), false);
                    class756.method4199(var20.field1260, arg1.substring(var22), -1);
                    var20.field1260.method2879(var20.field1260.field6864 - var21, arg3 ^ 0xFFFFFFF5);
                    class523.method3183(var20, (byte) 31);
                    return;
                }
                if (arg1.equals("savevarcs")) {
                    class424.method2627(false);
                    class646.method3726("perm varcs saved", -119);
                    return;
                }
                if (arg1.equals("scramblevarcs")) {
                    for (int var23 = 0; var23 < class541.field7855.length; var23++) {
                        if (class525.field7633[var23]) {
                            class541.field7855[var23] = (int) (Math.random() * 99999.0D);
                            if (Math.random() > 0.5D) {
                                class541.field7855[var23] *= -1;
                            }
                        }
                    }
                    class424.method2627(false);
                    class646.method3726("perm varcs scrambled", -112);
                    return;
                }
                if (arg1.equals("showcolmap")) {
                    class91.field1297 = true;
                    class40.method423((byte) 102);
                    class646.method3726("colmap is shown", -102);
                    return;
                }
                if (arg1.equals("hidecolmap")) {
                    class91.field1297 = false;
                    class40.method423((byte) 102);
                    class646.method3726("colmap is hidden", -109);
                    return;
                }
                if (arg1.equals("resetcache")) {
                    class648.method3743(12245);
                    class646.method3726("Caches reset", -122);
                    return;
                }
                if (arg1.equals("profilecpu")) {
                    class646.method3726(class350.method2239(100) + "ms", arg3 ^ 0xFFFFFF93);
                    return;
                }
                if (arg1.startsWith("getclientvarpbit")) {
                    int var24 = Integer.parseInt(arg1.substring(17));
                    class646.method3726("varpbit=" + class226.field3372.method2(var24, 0), -124);
                    return;
                }
                if (arg1.startsWith("getclientvarp")) {
                    int var25 = Integer.parseInt(arg1.substring(14));
                    class646.method3726("varp=" + class226.field3372.method3(var25, (byte) -43), -108);
                    return;
                }
                if (arg1.startsWith("directlogin")) {
                    String[] var26 = class330.method2035(' ', arg1.substring(12), (byte) 106);
                    if (var26.length >= 2) {
                        int var27 = var26.length <= 2 ? 0 : Integer.parseInt(var26[2]);
                        class700.method3929(var27, -25696, var26[1], var26[0]);
                        return;
                    }
                }
                if (arg1.startsWith("csprofileclear")) {
                    class529.method3209();
                    return;
                }
                if (arg1.startsWith("csprofileoutputc")) {
                    class529.method3196(100, false);
                    return;
                }
                if (arg1.startsWith("csprofileoutputt")) {
                    class529.method3196(10, true);
                    return;
                }
                if (arg1.startsWith("texsize")) {
                    int var28 = Integer.parseInt(arg1.substring(8));
                    class211.field3164.method279(var28);
                    return;
                }
                if (arg1.equals("soundstreamcount")) {
                    class646.method3726("Active streams: " + class593.field8429.method3654(), -100);
                    return;
                }
                if (arg1.equals("autosetup")) {
                    class757.method4208(-1);
                    class646.method3726("Complete. Toolkit now: " + class243.field3580.field7975.method3775(false), -120);
                    return;
                }
                if (arg1.equals("errormessage")) {
                    class646.method3726(class660.field9437.method1556(9), -124);
                    return;
                }
                if (arg1.equals("heapdump")) {
                    if (class300.field4089.startsWith("win")) {
                        class627.method3610(new File("C:\\Temp\\heap.dump"), arg3 + 66, false);
                    } else {
                        class627.method3610(new File("/tmp/heap.dump"), 107, false);
                    }
                    class646.method3726("Done", -102);
                    return;
                }
                if (arg1.equals("os")) {
                    class646.method3726("Name: " + class300.field4089, -97);
                    class646.method3726("Arch: " + class300.field4103, -124);
                    class646.method3726("Ver: " + class300.field4091, -117);
                    return;
                }
                if (arg1.startsWith("w2debug")) {
                    int var29 = Integer.parseInt(arg1.substring(8, 9));
                    class612.field8753 = var29;
                    class443.method2708(arg3 ^ 0xE9465DC2);
                    class646.method3726("Toggled!", -124);
                    return;
                }
                if (arg1.startsWith("ortho ")) {
                    int var30 = arg1.indexOf(32);
                    if (var30 < 0) {
                        class646.method3726("Syntax: ortho <n>", -126);
                        return;
                    }
                    int var31 = class321.method1993(arg1.substring(var30 + 1), (byte) 59);
                    class243.field3580.method3301(var31, 24, class243.field3580.field7979);
                    class23.method102((byte) -74);
                    class713.field10057 = false;
                    class50.method468(-92);
                    if (var31 != class243.field3580.field7979.method3835(false)) {
                        class646.method3726("Failed to change ortho mode", -126);
                        return;
                    }
                    class646.method3726("Successfully changed ortho mode", -126);
                    return;
                }
                if (arg1.startsWith("orthozoom ")) {
                    if (class243.field3580.field7979.method3835(false) == 0) {
                        class646.method3726("enable ortho mode first (use 'ortho <n>')", -102);
                        return;
                    }
                    int var32 = class321.method1993(arg1.substring(arg1.indexOf(32) + 1), (byte) 82);
                    class680.field9669 = var32;
                    class646.method3726("orthozoom=" + class680.field9669, -113);
                    return;
                }
                if (arg1.startsWith("orthotilesize ")) {
                    int var33 = class321.method1993(arg1.substring(arg1.indexOf(32) + 1), (byte) 111);
                    class413.field5881 = var33;
                    class310.field4180 = var33;
                    class646.method3726("ortho tile size=" + var33, -96);
                    class50.method468(arg3 ^ 0xFFFFFF9A);
                    return;
                }
                if (arg1.equals("orthocamlock")) {
                    class223.field3285 = !class223.field3285;
                    class646.method3726("ortho camera lock is " + (class223.field3285 ? "on" : "off"), -105);
                    return;
                }
                if (arg1.startsWith("setoutput ")) {
                    File var34 = new File(arg1.substring(10));
                    if (var34.exists()) {
                        var34 = new File(arg1.substring(10) + "." + class465.method2818(arg3 + 245) + ".log");
                        if (var34.exists()) {
                            class646.method3726("file already exists!", arg3 ^ 0xFFFFFF90);
                            return;
                        }
                    }
                    if (class670.field9546 != null) {
                        class670.field9546.close();
                        class670.field9546 = null;
                    }
                    try {
                        class670.field9546 = new FileOutputStream(var34);
                        return;
                    } catch (FileNotFoundException var43) {
                        class646.method3726("Could not create " + var34.getName(), -114);
                        return;
                    } catch (SecurityException var44) {
                        class646.method3726("Cannot write to " + var34.getName(), -123);
                        return;
                    }
                }
                if (arg1.equals("closeoutput")) {
                    if (class670.field9546 != null) {
                        class670.field9546.close();
                    }
                    class670.field9546 = null;
                    return;
                }
                if (arg1.startsWith("runscript ")) {
                    File var35 = new File(arg1.substring(10));
                    if (!var35.exists()) {
                        class646.method3726("No such file", arg3 ^ 0xFFFFFF8D);
                        return;
                    }
                    byte[] var36 = class321.method1994(var35, (byte) 101);
                    if (var36 == null) {
                        class646.method3726("Failed to read file", -109);
                        return;
                    }
                    String[] var37 = class330.method2035('\n', class633.method3628(true, class126.method882(var36, (byte) -73), "", '\r'), (byte) 109);
                    class386.method2377((byte) -105, var37);
                }
                if (arg1.startsWith("zoom ")) {
                    short var38 = (short) class321.method1993(arg1.substring(5), (byte) 111);
                    if (var38 > 0) {
                        class121.field1645 = var38;
                    }
                    return;
                }
                if (class369.field5392 == 10) {
                    class152.field2214++;
                    class88 var39 = class448.method2741((byte) 63, class596.field8477, class583.field8319);
                    var39.field1260.method2881(arg1.length() + 3, (byte) 112);
                    var39.field1260.method2881(arg2 ? 1 : 0, (byte) 118);
                    var39.field1260.method2881(arg0 ? 1 : 0, (byte) 123);
                    var39.field1260.method2902(arg1, false);
                    class523.method3183(var39, (byte) 31);
                }
                if (arg1.startsWith("fps ") && class536.field7793 != class25.field223) {
                    class82.method661(65535, class321.method1993(arg1.substring(4), (byte) 116));
                    return;
                }
            } catch (Exception var45) {
                class646.method3726(class608.field8622.method3543(-24350, class45.field748), -91);
                return;
            }
        }
        if (class369.field5392 != arg3) {
            class646.method3726(class608.field8623.method3543(-24350, class45.field748) + arg1, -126);
        }
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(I)V")
    public class368(int arg0) {
        this.field5383 = arg0;
        this.field5386 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field5387 = new class715(var2);
    }
}
