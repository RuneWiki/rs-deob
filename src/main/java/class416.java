import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public class class416 extends class441 implements class90 {

    @OriginalMember(owner = "client!vba", name = "c", descriptor = "I")
    private int field5801;

    @OriginalMember(owner = "client!vba", name = "d", descriptor = "I")
    public static int field5802 = 0;

    @OriginalMember(owner = "client!vba", name = "e", descriptor = "I")
    public static int field5803;

    @OriginalMember(owner = "client!vba", name = "f", descriptor = "I")
    public static int field5804;

    @OriginalMember(owner = "client!vba", name = "h", descriptor = "I")
    public static int field5806;

    @OriginalMember(owner = "client!vba", name = "i", descriptor = "I")
    public static int field5807;

    @OriginalMember(owner = "client!vba", name = "j", descriptor = "I")
    public static int field5808;

    @OriginalMember(owner = "client!vba", name = "k", descriptor = "I")
    public static int field5809;

    @OriginalMember(owner = "client!vba", name = "g", descriptor = "Lah;")
    public static class277 field5805;

    @OriginalMember(owner = "client!vba", name = "c", descriptor = "(I)V")
    public static void method2521(int arg0) {
        if (arg0 != 0) {
            method2523((class154) null, (byte) 55);
        }
        field5805 = null;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(I)J")
    public final long method662(int arg0) {
        ++field5803;
        if (arg0 != 28748) {
            field5805 = null;
        }
        return super.field6077.getAddress();
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(III[B)V")
    public final void method663(int arg0, int arg1, int arg2, byte[] arg3) {
        ++field5809;
        if (arg1 > -39) {
            this.field5801 = -12;
        }
        this.method2635(arg3, arg2);
        this.field5801 = arg0;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(Z)I")
    public final int method665(boolean arg0) {
        if (!arg0) {
            return -62;
        } else {
            ++field5808;
            return this.field5801;
        }
    }

    @OriginalMember(owner = "client!vba", name = "<init>", descriptor = "(Lpq;I[BI)V")
    public class416(class194 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field5801 = arg1;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(ZLjava/lang/String;ZI)V")
    public static final void method2522(boolean arg0, String arg1, boolean arg2, int arg3) {
        ++field5804;
        try {
            if (arg3 != 0) {
                return;
            }
            if (arg1.equalsIgnoreCase("commands") || arg1.equalsIgnoreCase("help")) {
                class629.method3616(false, "commands - This command");
                class629.method3616(false, "cls - Clear console");
                class629.method3616(false, "displayfps - Toggle FPS and other information");
                class629.method3616(false, "renderer - Print graphics renderer information");
                class629.method3616(false, "heap - Print java memory information");
                return;
            }
            if (arg1.equalsIgnoreCase("cls")) {
                class371.field5343 = 0;
                class534.field7390 = 0;
                return;
            }
            if (arg1.equalsIgnoreCase("displayfps")) {
                class493.field6792 = !class493.field6792;
                if (!class493.field6792) {
                    class629.method3616(false, "FPS off");
                    return;
                }
                class629.method3616(false, "FPS on");
                return;
            }
            if (arg1.equals("renderer")) {
                class260 var4 = class111.field1332.method172();
                class629.method3616(false, "Vendor: " + var4.field3811);
                class629.method3616(false, "Name: " + var4.field3814);
                class629.method3616(false, "Version: " + var4.field3813);
                class629.method3616(false, "Device: " + var4.field3815);
                class629.method3616(false, "Driver Version: " + var4.field3812);
                return;
            }
            if (arg1.equals("heap")) {
                class629.method3616(false, "Heap: " + class771.field10608 + "MB");
                return;
            }
        } catch (Exception var46) {
            class629.method3616(false, class712.field9855.method3999(class553.field7667, (byte) -49));
            return;
        }
        if (class425.field5937 != class224.field3414 || class597.field8370 >= 2) {
            if (arg1.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg1.equals("nativememerror")) {
                throw new OutOfMemoryError("native(MPR");
            }
            try {
                if (arg1.equalsIgnoreCase("printfps")) {
                    class629.method3616(false, "FPS: " + class744.field10277);
                    return;
                }
                if (arg1.equalsIgnoreCase("occlude")) {
                    class623.field8736 = !class623.field8736;
                    if (!class623.field8736) {
                        class629.method3616(false, "Occlsion now off!");
                        return;
                    }
                    class629.method3616(false, "Occlsion now on!");
                    return;
                }
                if (arg1.equalsIgnoreCase("fpson")) {
                    class493.field6792 = true;
                    class629.method3616(false, "fps debug enabled");
                    return;
                }
                if (arg1.equalsIgnoreCase("fpsoff")) {
                    class493.field6792 = false;
                    class629.method3616(false, "fps debug disabled");
                    return;
                }
                if (arg1.equals("systemmem")) {
                    try {
                        class629.method3616(false, "System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + class495.field6813.field6744 + "Mb");
                        return;
                    } catch (Throwable var40) {
                        return;
                    }
                }
                if (arg1.equalsIgnoreCase("cleartext")) {
                    class190.field2376.method3105(-121);
                    class629.method3616(false, "Text coords cleared");
                    return;
                }
                if (arg1.equalsIgnoreCase("gc")) {
                    class167.method1048((byte) -99);
                    for (int var5 = 0; var5 < 10; ++var5) {
                        System.gc();
                    }
                    Runtime var6 = Runtime.getRuntime();
                    int var7 = (int) ((var6.totalMemory() + -var6.freeMemory()) / 1024L);
                    class629.method3616(false, "mem=" + var7 + "k");
                    return;
                }
                if (arg1.equalsIgnoreCase("compact")) {
                    class167.method1048((byte) -120);
                    for (int var8 = 0; ~var8 > -11; ++var8) {
                        System.gc();
                    }
                    Runtime var9 = Runtime.getRuntime();
                    int var10 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                    class629.method3616(false, "Memory before cleanup=" + var10 + "k");
                    class601.method3477(7);
                    class167.method1048((byte) -102);
                    for (int var11 = 0; var11 < 10; ++var11) {
                        System.gc();
                    }
                    int var12 = (int) ((var9.totalMemory() + -var9.freeMemory()) / 1024L);
                    class629.method3616(false, "Memory after cleanup=" + var12 + "k");
                    return;
                }
                if (arg1.equalsIgnoreCase("unloadnatives")) {
                    class629.method3616(false, class433.method2598((byte) -94) ? "Libraries unloaded" : "Library unloading failed!");
                    return;
                }
                if (arg1.equalsIgnoreCase("clientdrop")) {
                    class629.method3616(false, "Dropped client connection");
                    if (class664.field9331 == 10) {
                        class380.method2371((byte) 114);
                        return;
                    }
                    if (class664.field9331 == 11) {
                        class669.field9377 = true;
                    }
                    return;
                }
                if (arg1.equalsIgnoreCase("rotateconnectmethods")) {
                    class735.field10134.method3452(-123);
                    class629.method3616(false, "Rotated connection methods");
                    return;
                }
                if (arg1.equalsIgnoreCase("clientjs5drop")) {
                    class68.field750.method2551((byte) 25);
                    class629.method3616(false, "Dropped client js5 net queue");
                    return;
                }
                if (arg1.equalsIgnoreCase("serverjs5drop")) {
                    class68.field750.method2550(false);
                    class629.method3616(false, "Dropped server js5 net queue");
                    return;
                }
                if (arg1.equalsIgnoreCase("breakcon")) {
                    class129.field1674.method4247(true);
                    class679.field9490.method3632(0);
                    class68.field750.method2547(false);
                    class629.method3616(false, "Breaking new connections for 5 seconds");
                    return;
                }
                if (arg1.equalsIgnoreCase("rebuild")) {
                    class351.method2213(arg3 + 3);
                    class604.method3489((byte) 56);
                    class629.method3616(false, "Rebuilding map");
                    return;
                }
                if (arg1.equalsIgnoreCase("rebuildprofile")) {
                    class288.field4220 = class683.method3903((byte) 4);
                    class452.field6306 = true;
                    class351.method2213(3);
                    class604.method3489((byte) 56);
                    class629.method3616(false, "Rebuilding map (with profiling)");
                    return;
                }
                if (arg1.equalsIgnoreCase("wm1")) {
                    class234.method1602(1, false, -1, arg3 ^ 16367, -1);
                    if (class647.method3714(arg3 ^ -110) == 1) {
                        class629.method3616(false, "wm1 succeeded");
                        return;
                    }
                    class629.method3616(false, "wm1 failed");
                    return;
                }
                if (arg1.equalsIgnoreCase("wm2")) {
                    class234.method1602(2, false, -1, 16367, -1);
                    if (~class647.method3714(arg3 ^ -126) == -3) {
                        class629.method3616(false, "wm2 succeeded");
                        return;
                    }
                    class629.method3616(false, "wm2 failed");
                    return;
                }
                if (arg1.equalsIgnoreCase("wm3")) {
                    class234.method1602(3, false, 768, arg3 ^ 16367, 1024);
                    if (~class647.method3714(-119) != -4) {
                        class629.method3616(false, "wm3 failed");
                        return;
                    }
                    class629.method3616(false, "wm3 succeeded");
                    return;
                }
                if (arg1.equalsIgnoreCase("tk0")) {
                    class532.method3154(0, false, 1);
                    if (~class688.field9602.field8517.method2604((byte) -98) == -1) {
                        class629.method3616(false, "Entered tk0");
                        class688.field9602.method3503(class688.field9602.field8510, -124, 0);
                        class266.method1738(75);
                        class106.field1247 = false;
                        return;
                    }
                    class629.method3616(false, "Failed to enter tk0");
                    return;
                }
                if (arg1.equalsIgnoreCase("tk1")) {
                    class532.method3154(1, false, 1);
                    if (~class688.field9602.field8517.method2604((byte) -98) == -2) {
                        class629.method3616(false, "Entered tk1");
                        class688.field9602.method3503(class688.field9602.field8510, -128, 1);
                        class266.method1738(-95);
                        class106.field1247 = false;
                        return;
                    }
                    class629.method3616(false, "Failed to enter tk1");
                    return;
                }
                if (arg1.equalsIgnoreCase("tk2")) {
                    class532.method3154(2, false, 1);
                    if (class688.field9602.field8517.method2604((byte) -98) != 2) {
                        class629.method3616(false, "Failed to enter tk2");
                        return;
                    }
                    class629.method3616(false, "Entered tk2");
                    class688.field9602.method3503(class688.field9602.field8510, -122, 2);
                    class266.method1738(arg3 ^ 121);
                    class106.field1247 = false;
                    return;
                }
                if (arg1.equalsIgnoreCase("tk3")) {
                    class532.method3154(3, false, 1);
                    if (class688.field9602.field8517.method2604((byte) -98) != 3) {
                        class629.method3616(false, "Failed to enter tk3");
                        return;
                    }
                    class629.method3616(false, "Entered tk3");
                    class688.field9602.method3503(class688.field9602.field8510, -128, 3);
                    class266.method1738(arg3 + -117);
                    class106.field1247 = false;
                    return;
                }
                if (arg1.equalsIgnoreCase("tk5")) {
                    class532.method3154(5, false, 1);
                    if (~class688.field9602.field8517.method2604((byte) -98) != -6) {
                        class629.method3616(false, "Failed to enter tk5");
                        return;
                    }
                    class629.method3616(false, "Entered tk5");
                    class688.field9602.method3503(class688.field9602.field8510, -123, 5);
                    class266.method1738(arg3 + -58);
                    class106.field1247 = false;
                    return;
                }
                if (arg1.startsWith("setba")) {
                    if (~arg1.length() > -7) {
                        class629.method3616(false, "Invalid buildarea value");
                        return;
                    }
                    int var13 = class157.method1014(arg1.substring(6), arg3 ^ -14534);
                    if (var13 >= 0 && ~class158.method1015(class771.field10608, (byte) -40) <= ~var13) {
                        class688.field9602.method3503(class688.field9602.field8516, -128, var13);
                        class266.method1738(arg3 + -72);
                        class106.field1247 = false;
                        class629.method3616(false, "maxbuildarea=" + class688.field9602.field8516.method1707((byte) -98));
                        return;
                    }
                    class629.method3616(false, "Invalid buildarea value");
                    return;
                }
                if (arg1.startsWith("rect_debug")) {
                    if (arg1.length() < 10) {
                        class629.method3616(false, "Invalid rect_debug value");
                        return;
                    }
                    class122.field1620 = class157.method1014(arg1.substring(10).trim(), -14534);
                    class629.method3616(false, "rect_debug=" + class122.field1620);
                    return;
                }
                if (arg1.equalsIgnoreCase("qa_op_test")) {
                    class635.field8860 = true;
                    class629.method3616(false, "qa_op_test=" + class635.field8860);
                    return;
                }
                if (arg1.equalsIgnoreCase("clipcomponents")) {
                    class746.field10295 = !class746.field10295;
                    class629.method3616(false, "clipcomponents=" + class746.field10295);
                    return;
                }
                if (arg1.startsWith("bloom")) {
                    boolean var14 = class111.field1332.method147();
                    if (!class282.method1835(!var14, (byte) 108)) {
                        class629.method3616(false, "Failed to enable bloom");
                        return;
                    }
                    if (var14) {
                        class629.method3616(false, "Bloom disabled");
                        return;
                    }
                    class629.method3616(false, "Bloom enabled");
                    return;
                }
                if (arg1.equalsIgnoreCase("tween")) {
                    if (class738.field10171) {
                        class738.field10171 = false;
                        class629.method3616(false, "Forced tweening disabled.");
                        return;
                    }
                    class738.field10171 = true;
                    class629.method3616(false, "Forced tweening ENABLED!");
                    return;
                }
                if (arg1.equalsIgnoreCase("shiftclick")) {
                    if (!class152.field1997) {
                        class629.method3616(false, "Shift-click ENABLED!");
                        class152.field1997 = true;
                        return;
                    }
                    class629.method3616(false, "Shift-click disabled.");
                    class152.field1997 = false;
                    return;
                }
                if (arg1.equalsIgnoreCase("getcgcoord")) {
                    class629.method3616(false, "x:" + (class724.field10031.field3470 >> 9) + " z:" + (class724.field10031.field3460 >> 9));
                    return;
                }
                if (arg1.equalsIgnoreCase("getheight")) {
                    class629.method3616(false, "Height: " + class661.field9303[class724.field10031.field3467].method2525(class724.field10031.field3470 >> 9, class724.field10031.field3460 >> 9, (byte) 114));
                    return;
                }
                if (arg1.equalsIgnoreCase("resetminimap")) {
                    class149.field1968.method1836(0);
                    class149.field1968.method1844((byte) 112);
                    class35.field354.method2919((byte) -62);
                    class657.field9274.method513(arg3 ^ -63);
                    class604.method3489((byte) 56);
                    class629.method3616(false, "Minimap reset");
                    return;
                }
                if (arg1.startsWith("mc")) {
                    if (!class111.field1332.method162()) {
                        class629.method3616(false, "Current toolkit doesn't support multiple cores");
                        return;
                    }
                    int var15 = Integer.parseInt(arg1.substring(3));
                    if (~var15 > -2) {
                        var15 = 1;
                    } else if (~var15 < -5) {
                        var15 = 4;
                    }
                    class295.field4321 = var15;
                    class351.method2213(arg3 + 3);
                    class629.method3616(false, "Render cores now: " + class295.field4321);
                    return;
                }
                if (arg1.startsWith("cachespace")) {
                    class629.method3616(false, "I(s): " + class35.field343.method307(-90) + "/" + class35.field343.method304(arg3 ^ 105));
                    class629.method3616(false, "I(m): " + class226.field3432.method307(-67) + "/" + class226.field3432.method304(arg3 + 41));
                    class629.method3616(false, "O(s): " + class35.field367.field7030.method2354(false) + "/" + class35.field367.field7030.method2362((byte) 31));
                    return;
                }
                if (arg1.equalsIgnoreCase("getcamerapos")) {
                    class629.method3616(false, "Pos: " + class724.field10031.field3467 + "," + ((class497.field6818 >> 9) + class444.field6151 >> 6) + "," + ((class412.field5779 >> 9) - -class236.field3535 >> 6) + "," + (63 & (class497.field6818 >> 9) + class444.field6151) + "," + (63 & (class412.field5779 >> 9) + class236.field3535) + " Height: " + (class373.method2316(class497.field6818, class724.field10031.field3467, class412.field5779, 63) - class479.field6645));
                    class629.method3616(false, "Look: " + class724.field10031.field3467 + "," + (class444.field6151 + class123.field1630 >> 6) + "," + (class754.field10395 + class236.field3535 >> 6) + "," + (63 & class123.field1630 - -class444.field6151) + "," + (63 & class754.field10395 + class236.field3535) + " Height: " + (class373.method2316(class123.field1630, class724.field10031.field3467, class754.field10395, 97) - class439.field6071));
                    return;
                }
                if (arg1.equals("renderprofile") || arg1.equals("rp")) {
                    class248.field3698 = !class248.field3698;
                    class111.field1332.method203(class248.field3698);
                    class273.method1778(false);
                    class629.method3616(false, "showprofiling=" + class248.field3698);
                    return;
                }
                if (arg1.startsWith("performancetest")) {
                    int var16 = -1;
                    int var17 = 1000;
                    if (arg1.length() > 15) {
                        String[] var18 = class24.method105(arg1, arg3 ^ 19478, ' ');
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
                        class629.method3616(false, "Performance: " + class778.method4286(var17, (byte) 97, var16));
                        return;
                    }
                    class629.method3616(false, "Java toolkit: " + class778.method4286(var17, (byte) 97, 0));
                    class629.method3616(false, "SSE toolkit:  " + class778.method4286(var17, (byte) 97, 2));
                    class629.method3616(false, "D3D toolkit:  " + class778.method4286(var17, (byte) 97, 3));
                    class629.method3616(false, "GL toolkit:   " + class778.method4286(var17, (byte) 97, 1));
                    class629.method3616(false, "GLX toolkit:  " + class778.method4286(var17, (byte) 97, 5));
                    return;
                }
                if (arg1.equals("nonpcs")) {
                    class582.field8241 = !class582.field8241;
                    class629.method3616(false, "nonpcs=" + class582.field8241);
                    return;
                }
                if (arg1.equals("autoworld")) {
                    class631.method3621((byte) 108);
                    class629.method3616(false, "auto world selected");
                    return;
                }
                if (arg1.startsWith("switchworld")) {
                    int var19 = Integer.parseInt(arg1.substring(12));
                    class535.method3180(class719.method4016(var19, arg3 ^ 2570).field1768, 113, var19);
                    class629.method3616(false, "switched");
                    return;
                }
                if (arg1.equals("getworld")) {
                    class629.method3616(false, "w: " + class735.field10134.field8306);
                    return;
                }
                if (arg1.startsWith("pc")) {
                    class116 var20 = class248.method1672(class84.field1023, class85.field1030, -20647);
                    var20.field1575.method3005(arg3 + 255, 0);
                    int var21 = var20.field1575.field6962;
                    int var22 = arg1.indexOf(" ", 4);
                    var20.field1575.method3037(0, arg1.substring(3, var22));
                    class382.method2381(var20.field1575, true, arg1.substring(var22));
                    var20.field1575.method2985((byte) -57, var20.field1575.field6962 - var21);
                    class443.method2655(arg3, var20);
                    return;
                }
                if (arg1.equals("savevarcs")) {
                    class775.method4276((byte) -21);
                    class629.method3616(false, "perm varcs saved");
                    return;
                }
                if (arg1.equals("scramblevarcs")) {
                    for (int var23 = 0; var23 < class170.field2162.length; ++var23) {
                        if (class583.field8250[var23]) {
                            class170.field2162[var23] = (int) (99999.0D * Math.random());
                            if (Math.random() > 0.5D) {
                                class170.field2162[var23] *= -1;
                            }
                        }
                    }
                    class775.method4276((byte) -21);
                    class629.method3616(false, "perm varcs scrambled");
                    return;
                }
                if (arg1.equals("showcolmap")) {
                    class91.field1065 = true;
                    class604.method3489((byte) 56);
                    class629.method3616(false, "colmap is shown");
                    return;
                }
                if (arg1.equals("hidecolmap")) {
                    class91.field1065 = false;
                    class604.method3489((byte) 56);
                    class629.method3616(false, "colmap is hidden");
                    return;
                }
                if (arg1.equals("resetcache")) {
                    class106.method750(true);
                    class629.method3616(false, "Caches reset");
                    return;
                }
                if (arg1.equals("profilecpu")) {
                    class629.method3616(false, class595.method3470(false) + "ms");
                    return;
                }
                if (arg1.startsWith("getclientvarpbit")) {
                    int var24 = Integer.parseInt(arg1.substring(17));
                    class629.method3616(false, "varpbit=" + class173.field2192.method3398(var24, 0));
                    return;
                }
                if (arg1.startsWith("getclientvarp")) {
                    int var25 = Integer.parseInt(arg1.substring(14));
                    class629.method3616(false, "varp=" + class173.field2192.method3392(var25, 125));
                    return;
                }
                if (arg1.startsWith("directlogin")) {
                    String[] var26 = class24.method105(arg1.substring(12), arg3 ^ 19478, ' ');
                    if (~var26.length <= -3) {
                        int var27 = ~var26.length < -3 ? Integer.parseInt(var26[2]) : 0;
                        class739.method4091(var26[0], 2, var26[1], var27);
                        return;
                    }
                }
                if (arg1.startsWith("csprofileclear")) {
                    class700.method3961();
                    return;
                }
                if (arg1.startsWith("csprofileoutputc")) {
                    class700.method3957(100, false);
                    return;
                }
                if (arg1.startsWith("csprofileoutputt")) {
                    class700.method3957(10, true);
                    return;
                }
                if (arg1.startsWith("texsize")) {
                    int var28 = Integer.parseInt(arg1.substring(8));
                    class111.field1332.method185(var28);
                    return;
                }
                if (arg1.equals("soundstreamcount")) {
                    class629.method3616(false, "Active streams: " + class44.field468.method2509());
                    return;
                }
                if (arg1.equals("autosetup")) {
                    class216.method1345(24722);
                    class629.method3616(false, "Complete. Toolkit now: " + class688.field9602.field8517.method2604((byte) -98));
                    return;
                }
                if (arg1.equals("errormessage")) {
                    class629.method3616(false, class274.field3958.method773((byte) -128));
                    return;
                }
                if (arg1.equals("heapdump")) {
                    if (!class768.field10562.startsWith("win")) {
                        class350.method2206(new File("/tmp/heap.dump"), 1, false);
                    } else {
                        class350.method2206(new File("C:\\Temp\\heap.dump"), 1, false);
                    }
                    class629.method3616(false, "Done");
                    return;
                }
                if (arg1.equals("os")) {
                    class629.method3616(false, "Name: " + class768.field10562);
                    class629.method3616(false, "Arch: " + class768.field10570);
                    class629.method3616(false, "Ver: " + class768.field10581);
                    return;
                }
                if (arg1.startsWith("w2debug")) {
                    int var29 = Integer.parseInt(arg1.substring(8, 9));
                    class457.field6389 = var29;
                    class351.method2213(arg3 + 3);
                    class629.method3616(false, "Toggled!");
                    return;
                }
                if (arg1.startsWith("ortho ")) {
                    int var30 = arg1.indexOf(32);
                    if (~var30 > -1) {
                        class629.method3616(false, "Syntax: ortho <n>");
                        return;
                    }
                    int var31 = class157.method1014(arg1.substring(var30 + 1), arg3 + -14534);
                    class688.field9602.method3503(class688.field9602.field8545, arg3 ^ -123, var31);
                    class266.method1738(-86);
                    class106.field1247 = false;
                    class122.method861(121);
                    if (var31 == class688.field9602.field8545.method4143((byte) -98)) {
                        class629.method3616(false, "Successfully changed ortho mode");
                        return;
                    }
                    class629.method3616(false, "Failed to change ortho mode");
                    return;
                }
                if (arg1.startsWith("orthozoom ")) {
                    if (class688.field9602.field8545.method4143((byte) -98) == 0) {
                        class629.method3616(false, "enable ortho mode first (use 'ortho <n>')");
                        return;
                    }
                    int var32 = class157.method1014(arg1.substring(1 + arg1.indexOf(32)), arg3 ^ -14534);
                    class775.field10669 = var32;
                    class629.method3616(false, "orthozoom=" + class775.field10669);
                    return;
                }
                if (arg1.startsWith("orthotilesize ")) {
                    int var33 = class157.method1014(arg1.substring(1 + arg1.indexOf(32)), -14534);
                    class49.field588 = var33;
                    class424.field5895 = var33;
                    class629.method3616(false, "ortho tile size=" + var33);
                    class122.method861(33);
                    return;
                }
                if (arg1.equals("orthocamlock")) {
                    class66.field729 = !class66.field729;
                    class629.method3616(false, "ortho camera lock is " + (!class66.field729 ? "off" : "on"));
                    return;
                }
                if (arg1.startsWith("setoutput ")) {
                    File var34 = new File(arg1.substring(10));
                    if (var34.exists()) {
                        var34 = new File(arg1.substring(10) + "." + class683.method3903((byte) 4) + ".log");
                        if (var34.exists()) {
                            class629.method3616(false, "file already exists!");
                            return;
                        }
                    }
                    if (class240.field3577 != null) {
                        class240.field3577.close();
                        class240.field3577 = null;
                    }
                    try {
                        class240.field3577 = new FileOutputStream(var34);
                        return;
                    } catch (FileNotFoundException var43) {
                        class629.method3616(false, "Could not create " + var34.getName());
                        return;
                    } catch (SecurityException var44) {
                        class629.method3616(false, "Cannot write to " + var34.getName());
                        return;
                    }
                }
                if (arg1.equals("closeoutput")) {
                    if (class240.field3577 != null) {
                        class240.field3577.close();
                    }
                    class240.field3577 = null;
                    return;
                }
                if (arg1.startsWith("runscript ")) {
                    File var35 = new File(arg1.substring(10));
                    if (!var35.exists()) {
                        class629.method3616(false, "No such file");
                        return;
                    }
                    byte[] var36 = class313.method2016(0, var35);
                    if (var36 == null) {
                        class629.method3616(false, "Failed to read file");
                        return;
                    }
                    String[] var37 = class24.method105(class68.method520(class376.method2353(var36, -21568), '\r', (byte) -11, ""), 19478, '\n');
                    class517.method3088(var37, (byte) 127);
                }
                if (arg1.startsWith("zoom ")) {
                    short var38 = (short) class157.method1014(arg1.substring(5), -14534);
                    if (var38 > 0) {
                        class183.field2294 = var38;
                    }
                    return;
                }
                if (class664.field9331 == 10) {
                    ++class654.field9129;
                    class116 var39 = class248.method1672(class84.field1023, class333.field4764, -20647);
                    var39.field1575.method3005(255, arg1.length() - -3);
                    var39.field1575.method3005(255, arg2 ? 1 : 0);
                    var39.field1575.method3005(arg3 + 255, arg0 ? 1 : 0);
                    var39.field1575.method3037(0, arg1);
                    class443.method2655(0, var39);
                }
                if (arg1.startsWith("fps ") && class425.field5937 != class224.field3414) {
                    class109.method797(0, class157.method1014(arg1.substring(4), arg3 + -14534));
                    return;
                }
            } catch (Exception var45) {
                class629.method3616(false, class712.field9855.method3999(class553.field7667, (byte) -75));
                return;
            }
        }
        if (class664.field9331 != 10) {
            class629.method3616(false, class712.field9856.method3999(class553.field7667, (byte) -61) + arg1);
        }
    }

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "(I)I")
    public final int method664(int arg0) {
        ++field5807;
        if (arg0 != -31593) {
            this.method664(-20);
        }
        return 0;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(Lbi;B)V")
    public static final void method2523(class154 arg0, byte arg1) {
        arg0.field2015 = null;
        if (arg1 != 17) {
            method2522(false, (String) null, true, 95);
        }
        ++field5806;
        if (~class708.field9828 > -21) {
            class533.field7337.method3100(arg0, true);
            ++class708.field9828;
        }
    }
}
