import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class433 extends class729 {

    @OriginalMember(owner = "client!dg", name = "N", descriptor = "I")
    public static int field5718 = 999999;

    @OriginalMember(owner = "client!dg", name = "J", descriptor = "[Ljava/lang/String;")
    public static String[] field5714 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!dg", name = "F", descriptor = "I")
    public static int field5710;

    @OriginalMember(owner = "client!dg", name = "G", descriptor = "I")
    public static int field5711;

    @OriginalMember(owner = "client!dg", name = "H", descriptor = "I")
    public static int field5712;

    @OriginalMember(owner = "client!dg", name = "I", descriptor = "I")
    public static int field5713;

    @OriginalMember(owner = "client!dg", name = "K", descriptor = "I")
    public static int field5715;

    @OriginalMember(owner = "client!dg", name = "L", descriptor = "Ltf;")
    public static class312 field5716;

    @OriginalMember(owner = "client!dg", name = "M", descriptor = "[B")
    private byte[] field5717;

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V", line = 3)
    public class433() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "(I)V", line = 7)
    public static void method2562(int arg0) {
        field5714 = null;
        field5716 = null;
        if (arg0 != 0) {
            field5714 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "(I)V", line = 18)
    public static final void method2563(int arg0) {
        class687.field9376 = -1;
        if (arg0 != -24708) {
            field5716 = null;
        }
        class754.field10460 = -1;
        field5710++;
        class13.field218 = 0;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIII)[B", line = 32)
    public final byte[] method2564(int arg0, int arg1, int arg2, int arg3) {
        field5713++;
        this.field5717 = new byte[arg3 * 2 * arg2 * arg0];
        if (arg1 != 0) {
            method2563(25);
        }
        this.method3433((byte) 18, arg3, arg0, arg2);
        return this.field5717;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IZ)V", line = 47)
    public static final void method2565(int arg0, boolean arg1) {
        field5715++;
        class714 var2 = class350.method2072((long) arg0, 7, (byte) 115);
        var2.method4044((byte) -128);
        if (!arg1) {
            field5718 = -72;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZIZLjava/lang/String;)V", line = 62)
    public static final void method2566(boolean arg0, int arg1, boolean arg2, String arg3) {
        field5711++;
        if (arg1 >= -51) {
            method2563(79);
        }
        try {
            label683: {
                if (!arg3.equalsIgnoreCase("commands") && !arg3.equalsIgnoreCase("help")) {
                    if (arg3.equalsIgnoreCase("cls")) {
                        class259.field3066 = 0;
                        class531.field7487 = 0;
                        return;
                    }
                    if (arg3.equalsIgnoreCase("displayfps")) {
                        class23.field368 = !class23.field368;
                        if (class23.field368) {
                            class793.method4374(0, "FPS on");
                            return;
                        }
                        class793.method4374(0, "FPS off");
                        return;
                    }
                    if (!arg3.equals("renderer")) {
                        if (arg3.equals("heap")) {
                            class793.method4374(0, "Heap: " + class730.field10230 + "MB");
                            return;
                        }
                        break label683;
                    }
                    class22 var4 = class363.field4526.method60();
                    class793.method4374(0, "Vendor: " + var4.field355);
                    class793.method4374(0, "Name: " + var4.field356);
                    class793.method4374(0, "Version: " + var4.field357);
                    class793.method4374(0, "Device: " + var4.field351);
                    class793.method4374(0, "Driver Version: " + var4.field353);
                    return;
                }
                class793.method4374(0, "commands - This command");
                class793.method4374(0, "cls - Clear console");
                class793.method4374(0, "displayfps - Toggle FPS and other information");
                class793.method4374(0, "renderer - Print graphics renderer information");
                class793.method4374(0, "heap - Print java memory information");
                return;
            }
        } catch (Exception var49) {
            class793.method4374(0, class637.field8677.method3584(class770.field10592, true));
            return;
        }
        if (class737.field10285 != class446.field6003 || class637.field8741 >= 2) {
            if (arg3.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg3.equals("nativememerror")) {
                throw new OutOfMemoryError("native(MPR");
            }
            try {
                if (arg3.equalsIgnoreCase("printfps")) {
                    class793.method4374(0, "FPS: " + class496.field6902);
                    return;
                }
                if (arg3.equalsIgnoreCase("occlude")) {
                    class775.field10694 = !class775.field10694;
                    if (!class775.field10694) {
                        class793.method4374(0, "Occlsion now off!");
                        return;
                    }
                    class793.method4374(0, "Occlsion now on!");
                    return;
                }
                if (arg3.equalsIgnoreCase("fpson")) {
                    class23.field368 = true;
                    class793.method4374(0, "fps debug enabled");
                    return;
                }
                if (arg3.equalsIgnoreCase("fpsoff")) {
                    class23.field368 = false;
                    class793.method4374(0, "fps debug disabled");
                    return;
                }
                if (arg3.equals("systemmem")) {
                    try {
                        class793.method4374(0, "System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + class174.field2151.field1067 + "Mb");
                        return;
                    } catch (Throwable var43) {
                        return;
                    }
                }
                if (arg3.equalsIgnoreCase("cleartext")) {
                    class196.field2343.method2442((byte) -102);
                    class793.method4374(0, "Text coords cleared");
                    return;
                }
                if (arg3.equalsIgnoreCase("gc")) {
                    class47.method422(false);
                    for (int var5 = 0; var5 < 10; var5++) {
                        System.gc();
                    }
                    Runtime var6 = Runtime.getRuntime();
                    int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                    class793.method4374(0, "mem=" + var7 + "k");
                    return;
                }
                if (arg3.equalsIgnoreCase("compact")) {
                    class47.method422(false);
                    for (int var8 = 0; var8 < 10; var8++) {
                        System.gc();
                    }
                    Runtime var9 = Runtime.getRuntime();
                    int var10 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                    class793.method4374(0, "Memory before cleanup=" + var10 + "k");
                    class85.method787(1);
                    class47.method422(false);
                    for (int var11 = 0; var11 < 10; var11++) {
                        System.gc();
                    }
                    int var12 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                    class793.method4374(0, "Memory after cleanup=" + var12 + "k");
                    return;
                }
                if (arg3.equalsIgnoreCase("unloadnatives")) {
                    class793.method4374(0, class729.method4121(-10020) ? "Libraries unloaded" : "Library unloading failed!");
                    return;
                }
                if (arg3.equalsIgnoreCase("clientdrop")) {
                    class793.method4374(0, "Dropped client connection");
                    if (class289.field3493 == 10) {
                        class415.method2481(29116);
                    } else if (class289.field3493 == 11) {
                        class455.field6415 = true;
                        return;
                    }
                    return;
                }
                if (arg3.equalsIgnoreCase("rotateconnectmethods")) {
                    class55.field743.method2073((byte) 35);
                    class793.method4374(0, "Rotated connection methods");
                    return;
                }
                if (arg3.equalsIgnoreCase("clientjs5drop")) {
                    class182.field2224.method4257(-1);
                    class793.method4374(0, "Dropped client js5 net queue");
                    return;
                }
                if (arg3.equalsIgnoreCase("serverjs5drop")) {
                    class182.field2224.method4256((byte) -49);
                    class793.method4374(0, "Dropped server js5 net queue");
                    return;
                }
                if (arg3.equalsIgnoreCase("breakcon")) {
                    class521.field7389.method3789(false);
                    class436.field5748.method771((byte) -24);
                    class182.field2224.method4265(-22301);
                    class793.method4374(0, "Breaking new connections for 5 seconds");
                    return;
                }
                if (arg3.equalsIgnoreCase("rebuild")) {
                    class520.method3115(true);
                    class149.method1075((byte) -107);
                    class793.method4374(0, "Rebuilding map");
                    return;
                }
                if (arg3.equalsIgnoreCase("rebuildprofile")) {
                    class291.field3501 = class349.method2069(true);
                    class219.field2574 = true;
                    class520.method3115(true);
                    class149.method1075((byte) 127);
                    class793.method4374(0, "Rebuilding map (with profiling)");
                    return;
                }
                if (arg3.equalsIgnoreCase("wm1")) {
                    class121.method947(1, -1, -1, 1, false);
                    if (class397.method2331(3) != 1) {
                        class793.method4374(0, "wm1 failed");
                        return;
                    }
                    class793.method4374(0, "wm1 succeeded");
                    return;
                }
                if (arg3.equalsIgnoreCase("wm2")) {
                    class121.method947(2, -1, -1, 1, false);
                    if (class397.method2331(3) == 2) {
                        class793.method4374(0, "wm2 succeeded");
                        return;
                    }
                    class793.method4374(0, "wm2 failed");
                    return;
                }
                if (arg3.equalsIgnoreCase("wm3")) {
                    class121.method947(3, 768, 1024, 1, false);
                    if (class397.method2331(3) != 3) {
                        class793.method4374(0, "wm3 failed");
                        return;
                    }
                    class793.method4374(0, "wm3 succeeded");
                    return;
                }
                if (arg3.equalsIgnoreCase("tk0")) {
                    class677.method3810(true, 0, false);
                    if (class118.field1503.field10665.method1903(0) != 0) {
                        class793.method4374(0, "Failed to enter tk0");
                        return;
                    }
                    class793.method4374(0, "Entered tk0");
                    class118.field1503.method4295(class118.field1503.field10653, 0, false);
                    class14.method194(true);
                    class319.field3945 = false;
                    return;
                }
                if (arg3.equalsIgnoreCase("tk1")) {
                    class677.method3810(true, 1, false);
                    if (class118.field1503.field10665.method1903(0) != 1) {
                        class793.method4374(0, "Failed to enter tk1");
                        return;
                    }
                    class793.method4374(0, "Entered tk1");
                    class118.field1503.method4295(class118.field1503.field10653, 1, false);
                    class14.method194(true);
                    class319.field3945 = false;
                    return;
                }
                if (arg3.equalsIgnoreCase("tk2")) {
                    class677.method3810(true, 2, false);
                    if (class118.field1503.field10665.method1903(0) == 2) {
                        class793.method4374(0, "Entered tk2");
                        class118.field1503.method4295(class118.field1503.field10653, 2, false);
                        class14.method194(true);
                        class319.field3945 = false;
                        return;
                    }
                    class793.method4374(0, "Failed to enter tk2");
                    return;
                }
                if (arg3.equalsIgnoreCase("tk3")) {
                    class677.method3810(true, 3, false);
                    if (class118.field1503.field10665.method1903(0) != 3) {
                        class793.method4374(0, "Failed to enter tk3");
                        return;
                    }
                    class793.method4374(0, "Entered tk3");
                    class118.field1503.method4295(class118.field1503.field10653, 3, false);
                    class14.method194(true);
                    class319.field3945 = false;
                    return;
                }
                if (arg3.equalsIgnoreCase("tk5")) {
                    class677.method3810(true, 5, false);
                    if (class118.field1503.field10665.method1903(0) == 5) {
                        class793.method4374(0, "Entered tk5");
                        class118.field1503.method4295(class118.field1503.field10653, 5, false);
                        class14.method194(true);
                        class319.field3945 = false;
                        return;
                    }
                    class793.method4374(0, "Failed to enter tk5");
                    return;
                }
                if (arg3.startsWith("setba")) {
                    if (arg3.length() < 6) {
                        class793.method4374(0, "Invalid buildarea value");
                        return;
                    }
                    int var13 = class445.method2623(0, arg3.substring(6));
                    if (var13 >= 0 && class63.method540(127, class730.field10230) >= var13) {
                        class118.field1503.method4295(class118.field1503.field10658, var13, false);
                        class14.method194(true);
                        class319.field3945 = false;
                        class793.method4374(0, "maxbuildarea=" + class118.field1503.field10658.method1368(0));
                        return;
                    }
                    class793.method4374(0, "Invalid buildarea value");
                    return;
                }
                if (arg3.startsWith("rect_debug")) {
                    if (arg3.length() < 10) {
                        class793.method4374(0, "Invalid rect_debug value");
                        return;
                    }
                    class710.field9966 = class445.method2623(0, arg3.substring(10).trim());
                    class793.method4374(0, "rect_debug=" + class710.field9966);
                    return;
                }
                if (arg3.equalsIgnoreCase("qa_op_test")) {
                    class687.field9373 = true;
                    class793.method4374(0, "qa_op_test=" + class687.field9373);
                    return;
                }
                if (arg3.equalsIgnoreCase("clipcomponents")) {
                    class438.field5771 = !class438.field5771;
                    class793.method4374(0, "clipcomponents=" + class438.field5771);
                    return;
                }
                if (arg3.startsWith("bloom")) {
                    boolean var14 = class363.field4526.method54();
                    if (!class580.method3342((byte) -125, !var14)) {
                        class793.method4374(0, "Failed to enable bloom");
                        return;
                    }
                    if (!var14) {
                        class793.method4374(0, "Bloom enabled");
                        return;
                    }
                    class793.method4374(0, "Bloom disabled");
                    return;
                }
                if (arg3.equalsIgnoreCase("tween")) {
                    if (class688.field9381) {
                        class688.field9381 = false;
                        class793.method4374(0, "Forced tweening disabled.");
                        return;
                    }
                    class688.field9381 = true;
                    class793.method4374(0, "Forced tweening ENABLED!");
                    return;
                }
                if (arg3.equalsIgnoreCase("shiftclick")) {
                    if (class45.field603) {
                        class793.method4374(0, "Shift-click disabled.");
                        class45.field603 = false;
                        return;
                    }
                    class793.method4374(0, "Shift-click ENABLED!");
                    class45.field603 = true;
                    return;
                }
                if (arg3.equalsIgnoreCase("getcgcoord")) {
                    class793.method4374(0, "x:" + (class300.field3596.field823 >> 9) + " z:" + (class300.field3596.field813 >> 9));
                    return;
                }
                if (arg3.equalsIgnoreCase("getheight")) {
                    class793.method4374(0, "Height: " + class621.field8523[class300.field3596.field808].method1728(class300.field3596.field813 >> 9, (byte) -99, class300.field3596.field823 >> 9));
                    return;
                }
                if (arg3.equalsIgnoreCase("resetminimap")) {
                    class208.field2470.method426(-1);
                    class208.field2470.method429(-31);
                    class495.field6886.method1703((byte) -123);
                    class2.field33.method4137((byte) -31);
                    class149.method1075((byte) 78);
                    class793.method4374(0, "Minimap reset");
                    return;
                }
                if (arg3.startsWith("mc")) {
                    if (class363.field4526.method639()) {
                        int var15 = Integer.parseInt(arg3.substring(3));
                        if (var15 < 1) {
                            var15 = 1;
                        } else if (var15 > 4) {
                            var15 = 4;
                        }
                        client.field3930 = var15;
                        class520.method3115(true);
                        class793.method4374(0, "Render cores now: " + client.field3930);
                        return;
                    }
                    class793.method4374(0, "Current toolkit doesn't support multiple cores");
                    return;
                }
                if (arg3.startsWith("cachespace")) {
                    class793.method4374(0, "I(s): " + class396.field5130.method1685((byte) -44) + "/" + class396.field5130.method1689(-116));
                    class793.method4374(0, "I(m): " + class502.field7098.method1685((byte) -53) + "/" + class502.field7098.method1689(-100));
                    class793.method4374(0, "O(s): " + class121.field1555.field6799.method1982(true) + "/" + class121.field1555.field6799.method1977((byte) -48));
                    return;
                }
                if (arg3.equalsIgnoreCase("getcamerapos")) {
                    class793.method4374(0, "Pos: " + class300.field3596.field808 + "," + ((class599.field8107 >> 9) + class632.field8626 >> 6) + "," + ((class350.field4366 >> 9) + class620.field8435 >> 6) + "," + ((class599.field8107 >> 9) + class632.field8626 & 0x3F) + "," + ((class350.field4366 >> 9) + class620.field8435 & 0x3F) + " Height: " + (class483.method2867(class300.field3596.field808, (byte) -108, class350.field4366, class599.field8107) - class303.field3622));
                    class793.method4374(0, "Look: " + class300.field3596.field808 + "," + (class99.field1298 + class632.field8626 >> 6) + "," + (class540.field7598 + class620.field8435 >> 6) + "," + (class99.field1298 + class632.field8626 & 0x3F) + "," + (class540.field7598 + class620.field8435 & 0x3F) + " Height: " + (class483.method2867(class300.field3596.field808, (byte) -127, class540.field7598, class99.field1298) - class320.field3968));
                    return;
                }
                if (arg3.equals("renderprofile") || arg3.equals("rp")) {
                    class438.field5769 = !class438.field5769;
                    class363.field4526.method31(class438.field5769);
                    class686.method3840((byte) -126);
                    class793.method4374(0, "showprofiling=" + class438.field5769);
                    return;
                }
                if (arg3.startsWith("performancetest")) {
                    int var16 = -1;
                    int var17 = 1000;
                    if (arg3.length() > 15) {
                        String[] var18 = class708.method4017(' ', (byte) 32, arg3);
                        try {
                            if (var18.length > 1) {
                                var17 = Integer.parseInt(var18[1]);
                            }
                        } catch (Throwable var45) {
                        }
                        try {
                            if (var18.length > 2) {
                                var16 = Integer.parseInt(var18[2]);
                            }
                        } catch (Throwable var44) {
                        }
                    }
                    if (var16 == -1) {
                        class793.method4374(0, "Java toolkit: " + class138.method1011(var17, 0, -128));
                        class793.method4374(0, "SSE toolkit:  " + class138.method1011(var17, 2, -128));
                        class793.method4374(0, "D3D toolkit:  " + class138.method1011(var17, 3, -128));
                        class793.method4374(0, "GL toolkit:   " + class138.method1011(var17, 1, -128));
                        class793.method4374(0, "GLX toolkit:  " + class138.method1011(var17, 5, -128));
                        return;
                    }
                    class793.method4374(0, "Performance: " + class138.method1011(var17, var16, -128));
                    return;
                }
                if (arg3.equals("nonpcs")) {
                    class512.field7236 = !class512.field7236;
                    class793.method4374(0, "nonpcs=" + class512.field7236);
                    return;
                }
                if (arg3.equals("autoworld")) {
                    class546.method3215(87);
                    class793.method4374(0, "auto world selected");
                    return;
                }
                if (arg3.startsWith("switchworld")) {
                    int var19 = Integer.parseInt(arg3.substring(12));
                    class243.method1466(var19, (byte) 89, class419.method2504(var19, 4014).field8619);
                    class793.method4374(0, "switched");
                    return;
                }
                if (arg3.equals("getworld")) {
                    class793.method4374(0, "w: " + class55.field743.field4365);
                    return;
                }
                if (arg3.startsWith("pc")) {
                    class336 var20 = class512.method3076(class455.field6411, class591.field8030, (byte) 82);
                    var20.field4150.method2353(110, 0);
                    int var21 = var20.field4150.field5262;
                    int var22 = arg3.indexOf(" ", 4);
                    var20.field4150.method2388(255, arg3.substring(3, var22));
                    class123.method959((byte) -101, var20.field4150, arg3.substring(var22));
                    var20.field4150.method2366(-1, var20.field4150.field5262 - var21);
                    class578.method3334(4, var20);
                    return;
                }
                if (arg3.equals("savevarcs")) {
                    class786.method4352(true);
                    class793.method4374(0, "perm varcs saved");
                    return;
                }
                if (arg3.equals("scramblevarcs")) {
                    for (int var23 = 0; var23 < class480.field6716.length; var23++) {
                        if (class307.field3801[var23]) {
                            class480.field6716[var23] = (int) (Math.random() * 99999.0D);
                            if (Math.random() > 0.5D) {
                                class480.field6716[var23] *= -1;
                            }
                        }
                    }
                    class786.method4352(true);
                    class793.method4374(0, "perm varcs scrambled");
                    return;
                }
                if (arg3.equals("showcolmap")) {
                    class207.field2460 = true;
                    class149.method1075((byte) -85);
                    class793.method4374(0, "colmap is shown");
                    return;
                }
                if (arg3.equals("hidecolmap")) {
                    class207.field2460 = false;
                    class149.method1075((byte) 77);
                    class793.method4374(0, "colmap is hidden");
                    return;
                }
                if (arg3.equals("resetcache")) {
                    class276.method1611(113);
                    class793.method4374(0, "Caches reset");
                    return;
                }
                if (arg3.equals("profilecpu")) {
                    class793.method4374(0, class531.method3162(8306) + "ms");
                    return;
                }
                if (arg3.startsWith("getclientvarpbit")) {
                    int var24 = Integer.parseInt(arg3.substring(17));
                    class793.method4374(0, "varpbit=" + class2.field30.method336(var24, (byte) -91));
                    return;
                }
                if (arg3.startsWith("getclientvarp")) {
                    int var25 = Integer.parseInt(arg3.substring(14));
                    class793.method4374(0, "varp=" + class2.field30.method337(-35, var25));
                    return;
                }
                if (arg3.startsWith("directlogin")) {
                    String[] var26 = class708.method4017(' ', (byte) 32, arg3.substring(12));
                    if (var26.length >= 2) {
                        int var27 = var26.length <= 2 ? 0 : Integer.parseInt(var26[2]);
                        class297.method1738(var26[1], 320, var27, var26[0]);
                        return;
                    }
                }
                if (arg3.startsWith("snlogin ")) {
                    String[] var28 = class708.method4017(' ', (byte) 32, arg3.substring(8));
                    int var29 = Integer.parseInt(var28[0]);
                    int var30 = var28.length == 2 ? Integer.parseInt(var28[1]) : 0;
                    class140.method1021(var29, 22303, var30);
                    return;
                }
                if (arg3.startsWith("csprofileclear")) {
                    class142.method1041();
                    return;
                }
                if (arg3.startsWith("csprofileoutputc")) {
                    class142.method1032(100, false);
                    return;
                }
                if (arg3.startsWith("csprofileoutputt")) {
                    class142.method1032(10, true);
                    return;
                }
                if (arg3.startsWith("texsize")) {
                    int var31 = Integer.parseInt(arg3.substring(8));
                    class363.field4526.method589(var31);
                    return;
                }
                if (arg3.equals("soundstreamcount")) {
                    class793.method4374(0, "Active streams: " + class783.field10811.method3260());
                    return;
                }
                if (arg3.equals("autosetup")) {
                    class55.method486(-21201);
                    class793.method4374(0, "Complete. Toolkit now: " + class118.field1503.field10665.method1903(0));
                    return;
                }
                if (arg3.equals("errormessage")) {
                    class793.method4374(0, class90.field1195.method1874(0));
                    return;
                }
                if (arg3.equals("heapdump")) {
                    if (class675.field9263.startsWith("win")) {
                        class670.method3759(true, false, new File("C:\\Temp\\heap.dump"));
                    } else {
                        class670.method3759(true, false, new File("/tmp/heap.dump"));
                    }
                    class793.method4374(0, "Done");
                    return;
                }
                if (arg3.equals("os")) {
                    class793.method4374(0, "Name: " + class675.field9263);
                    class793.method4374(0, "Arch: " + class675.field9261);
                    class793.method4374(0, "Ver: " + class675.field9253);
                    return;
                }
                if (arg3.startsWith("w2debug")) {
                    int var32 = Integer.parseInt(arg3.substring(8, 9));
                    class137.field1717 = var32;
                    class520.method3115(true);
                    class793.method4374(0, "Toggled!");
                    return;
                }
                if (arg3.startsWith("ortho ")) {
                    int var33 = arg3.indexOf(32);
                    if (var33 < 0) {
                        class793.method4374(0, "Syntax: ortho <n>");
                        return;
                    }
                    int var34 = class445.method2623(0, arg3.substring(var33 + 1));
                    class118.field1503.method4295(class118.field1503.field10673, var34, false);
                    class14.method194(true);
                    class319.field3945 = false;
                    class438.method2584(13827);
                    if (class118.field1503.field10673.method2087(0) != var34) {
                        class793.method4374(0, "Failed to change ortho mode");
                        return;
                    }
                    class793.method4374(0, "Successfully changed ortho mode");
                    return;
                }
                if (arg3.startsWith("orthozoom ")) {
                    if (class118.field1503.field10673.method2087(0) == 0) {
                        class793.method4374(0, "enable ortho mode first (use 'ortho <n>')");
                        return;
                    }
                    int var35 = class445.method2623(0, arg3.substring(arg3.indexOf(32) + 1));
                    class621.field8527 = var35;
                    class793.method4374(0, "orthozoom=" + class621.field8527);
                    return;
                }
                if (arg3.startsWith("orthotilesize ")) {
                    int var36 = class445.method2623(0, arg3.substring(arg3.indexOf(32) + 1));
                    class507.field7209 = var36;
                    class248.field2925 = var36;
                    class793.method4374(0, "ortho tile size=" + var36);
                    class438.method2584(13827);
                    return;
                }
                if (arg3.equals("orthocamlock")) {
                    class96.field1252 = !class96.field1252;
                    class793.method4374(0, "ortho camera lock is " + (class96.field1252 ? "on" : "off"));
                    return;
                }
                if (arg3.startsWith("setoutput ")) {
                    File var37 = new File(arg3.substring(10));
                    if (var37.exists()) {
                        var37 = new File(arg3.substring(10) + "." + class349.method2069(true) + ".log");
                        if (var37.exists()) {
                            class793.method4374(0, "file already exists!");
                            return;
                        }
                    }
                    if (class612.field8225 != null) {
                        class612.field8225.close();
                        class612.field8225 = null;
                    }
                    try {
                        class612.field8225 = new FileOutputStream(var37);
                        return;
                    } catch (FileNotFoundException var46) {
                        class793.method4374(0, "Could not create " + var37.getName());
                        return;
                    } catch (SecurityException var47) {
                        class793.method4374(0, "Cannot write to " + var37.getName());
                        return;
                    }
                }
                if (arg3.equals("closeoutput")) {
                    if (class612.field8225 != null) {
                        class612.field8225.close();
                    }
                    class612.field8225 = null;
                    return;
                }
                if (arg3.startsWith("runscript ")) {
                    File var38 = new File(arg3.substring(10));
                    if (!var38.exists()) {
                        class793.method4374(0, "No such file");
                        return;
                    }
                    byte[] var39 = class186.method1238(var38, (byte) -73);
                    if (var39 == null) {
                        class793.method4374(0, "Failed to read file");
                        return;
                    }
                    String[] var40 = class708.method4017('\n', (byte) 32, class473.method2819('\r', class421.method2515((byte) -125, var39), "", -91));
                    class716.method4050(0, var40);
                }
                if (arg3.startsWith("zoom ")) {
                    short var41 = (short) class445.method2623(0, arg3.substring(5));
                    if (var41 > 0) {
                        class380.field4821 = var41;
                    }
                    return;
                }
                if (class289.field3493 == 10) {
                    class370.field4615++;
                    class336 var42 = class512.method3076(class700.field9647, class591.field8030, (byte) 69);
                    var42.field4150.method2353(116, arg3.length() + 3);
                    var42.field4150.method2353(82, arg2 ? 1 : 0);
                    var42.field4150.method2353(95, arg0 ? 1 : 0);
                    var42.field4150.method2388(255, arg3);
                    class578.method3334(4, var42);
                }
                if (arg3.startsWith("fps ") && class737.field10285 != class446.field6003) {
                    class447.method2637(class445.method2623(0, arg3.substring(4)), (byte) 58);
                    return;
                }
            } catch (Exception var48) {
                class793.method4374(0, class637.field8677.method3584(class770.field10592, true));
                return;
            }
        }
        if (class289.field3493 != 10) {
            class793.method4374(0, class637.field8678.method3584(class770.field10592, true) + arg3);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IBI)V", line = 1070)
    public final void method792(int arg0, byte arg1, int arg2) {
        int var4 = -1 / ((-arg0 - 7) / 36);
        field5712++;
        int var5 = arg2 * 2;
        byte var6 = (byte) ((arg1 >> 1 & 0x7F) + 127);
        int var10001 = var5;
        int var7 = var5 + 1;
        this.field5717[var10001] = var6;
        this.field5717[var7] = var6;
    }
}
