import jagex3.jagmisc.jagmisc;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class142 extends class128 {

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "I")
    private int field2107 = -1;

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "I")
    private int field2109 = -1;

    @OriginalMember(owner = "client!bd", name = "y", descriptor = "I")
    public int field2110;

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "I")
    public int field2108;

    @OriginalMember(owner = "client!bd", name = "D", descriptor = "I")
    public static int field2115 = -1;

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!bd", name = "A", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!bd", name = "B", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!bd", name = "C", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!bd", name = "E", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!bd", name = "F", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!bd", name = "G", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!bd", name = "H", descriptor = "[I")
    public static int[] field2119;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZLjava/lang/String;IZ)V")
    public static final void method989(boolean arg0, String arg1, int arg2, boolean arg3) {
        ++field2114;
        if (class81.field1144 != class523.field7659 || class136.field2064 >= 2) {
            if (arg1.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg1.equals("nativememerror")) {
                throw new OutOfMemoryError("native(MPR");
            }
            try {
                if (arg1.equalsIgnoreCase("fpson")) {
                    class407.field5770 = true;
                    class353.method2116("fps debug enabled", false);
                    return;
                }
                if (arg1.equalsIgnoreCase("fpsoff")) {
                    class407.field5770 = false;
                    class353.method2116("fps debug disabled", false);
                    return;
                }
                if (arg1.equals("systemmem")) {
                    try {
                        class353.method2116("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb", false);
                        return;
                    } catch (Throwable var27) {
                        return;
                    }
                }
                if (arg1.equalsIgnoreCase("cls")) {
                    class9.field110 = 0;
                    class343.field4961 = 0;
                    return;
                }
                if (arg1.equalsIgnoreCase("cleartext")) {
                    class415.field6024.method2593(false);
                    class353.method2116("Text coords cleared", false);
                    return;
                }
                if (arg1.equalsIgnoreCase("gc")) {
                    class481.method2859(1604598124);
                    for (int var4 = 0; ~var4 > -11; ++var4) {
                        System.gc();
                    }
                    Runtime var5 = Runtime.getRuntime();
                    int var6 = (int) ((var5.totalMemory() + -var5.freeMemory()) / 1024L);
                    class353.method2116("mem=" + var6 + "k", false);
                    return;
                }
                if (arg1.equalsIgnoreCase("compact")) {
                    class481.method2859(arg2 + 1604598134);
                    for (int var7 = 0; ~var7 > -11; ++var7) {
                        System.gc();
                    }
                    Runtime var8 = Runtime.getRuntime();
                    int var9 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
                    class353.method2116("Memory before cleanup=" + var9 + "k", false);
                    class139.method983((byte) -119);
                    class481.method2859(1604598124);
                    for (int var10 = 0; var10 < 10; ++var10) {
                        System.gc();
                    }
                    int var11 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
                    class353.method2116("Memory after cleanup=" + var11 + "k", false);
                    return;
                }
                if (arg1.equalsIgnoreCase("pcachesize")) {
                    class353.method2116("Number of player models in cache:" + class427.method2547((byte) 86), false);
                    return;
                }
                if (arg1.equalsIgnoreCase("clientdrop")) {
                    class353.method2116("Dropped client connection", false);
                    if (~class494.field7155 != -10) {
                        if (~class494.field7155 == -11) {
                            class66.field954 = true;
                            return;
                        }
                    } else {
                        class279.method1615((byte) 111);
                    }
                    return;
                }
                if (arg1.equalsIgnoreCase("clientjs5drop")) {
                    class503.field7364.method1282(arg2 + 104);
                    class353.method2116("Dropped client js5 net queue", false);
                    return;
                }
                if (arg1.equalsIgnoreCase("serverjs5drop")) {
                    class503.field7364.method1281((byte) 75);
                    class353.method2116("Dropped server js5 net queue", false);
                    return;
                }
                if (arg1.equalsIgnoreCase("breakcon")) {
                    class346.field4985.method1193((byte) 102);
                    class104.field1702.method174(-1);
                    class503.field7364.method1284(0);
                    class353.method2116("Breaking new connections for 5 seconds", false);
                    return;
                }
                if (arg1.equalsIgnoreCase("rebuild")) {
                    class75.method590(96);
                    class35.method258(83);
                    class353.method2116("Rebuilding map", false);
                    return;
                }
                if (arg1.equalsIgnoreCase("wm1")) {
                    class133.method964(1, false, -1, arg2 ^ 10, -1);
                    if (class75.method586((byte) 72) == 1) {
                        class353.method2116("wm1 succeeded", false);
                        return;
                    }
                    class353.method2116("wm1 failed", false);
                    return;
                }
                if (arg1.equalsIgnoreCase("wm2")) {
                    class133.method964(2, false, -1, -4, -1);
                    if (class75.method586((byte) 72) == 2) {
                        class353.method2116("wm2 succeeded", false);
                        return;
                    }
                    class353.method2116("wm2 failed", false);
                    return;
                }
                if (arg1.equalsIgnoreCase("wm3")) {
                    class133.method964(3, false, 768, -4, 1024);
                    if (~class75.method586((byte) 72) == -4) {
                        class353.method2116("wm3 succeeded", false);
                        return;
                    }
                    class353.method2116("wm3 failed", false);
                    return;
                }
                if (arg1.equalsIgnoreCase("tk0")) {
                    class54.method349(31, 0);
                    if (~class195.field2849 == -1) {
                        class353.method2116("Entered tk0", false);
                        class76.field1075.field3688 = 0;
                        class76.field1075.method1098(-9, class346.field4985);
                        class425.field6186 = false;
                        return;
                    }
                    class353.method2116("Failed to enter tk0", false);
                    return;
                }
                if (arg1.equalsIgnoreCase("tk1")) {
                    class54.method349(-128, 1);
                    if (class195.field2849 != 1) {
                        class353.method2116("Failed to enter tk1", false);
                        return;
                    }
                    class353.method2116("Entered tk1", false);
                    class76.field1075.field3688 = 1;
                    class76.field1075.method1098(-9, class346.field4985);
                    class425.field6186 = false;
                    return;
                }
                if (arg1.equalsIgnoreCase("tk2")) {
                    class54.method349(68, 2);
                    if (class195.field2849 == 2) {
                        class353.method2116("Entered tk2", false);
                        class76.field1075.field3688 = 2;
                        class76.field1075.method1098(-9, class346.field4985);
                        class425.field6186 = false;
                        return;
                    }
                    class353.method2116("Failed to enter tk2", false);
                    return;
                }
                if (arg1.equalsIgnoreCase("tk3")) {
                    class54.method349(68, 3);
                    if (class195.field2849 == 3) {
                        class353.method2116("Entered tk3", false);
                        return;
                    }
                    class353.method2116("Failed to enter tk3", false);
                    return;
                }
                if (arg1.equalsIgnoreCase("ot")) {
                    class76.field1075.field3664 = !class76.field1075.field3664;
                    class76.field1075.method1098(-9, class346.field4985);
                    class425.field6186 = false;
                    class75.method590(94);
                    class353.method2116("ot=" + class76.field1075.field3664, false);
                    return;
                }
                if (arg1.equalsIgnoreCase("gb")) {
                    class76.field1075.field3652 = !class76.field1075.field3652;
                    class76.field1075.method1098(-9, class346.field4985);
                    class425.field6186 = false;
                    class75.method590(94);
                    class353.method2116("gb=" + class76.field1075.field3652, false);
                    return;
                }
                if (arg1.startsWith("shadows")) {
                    if (arg1.length() < 8) {
                        class353.method2116("Invalid shadows value", false);
                        return;
                    }
                    String var12 = arg1.substring(8);
                    int var13 = class458.method2674(var12, -74) ? class410.method2405(-125, var12) : -1;
                    if (~var13 <= -1 && ~var13 >= -3) {
                        class76.field1075.method1596(var13, (byte) -81, class195.field2849);
                        class76.field1075.method1098(-9, class346.field4985);
                        class425.field6186 = false;
                        class75.method590(116);
                        class353.method2116("shadows=" + var13, false);
                        return;
                    }
                    class353.method2116("Invalid shadows value", false);
                    return;
                }
                if (arg1.startsWith("textures")) {
                    class76.field1075.field3677 = !class76.field1075.field3677;
                    class76.field1075.method1098(arg2 ^ 1, class346.field4985);
                    class425.field6186 = false;
                    class264.method1552(5);
                    class75.method590(121);
                    class353.method2116("textures=" + class76.field1075.field3677, false);
                    return;
                }
                if (arg1.startsWith("setba")) {
                    if (~arg1.length() > -7) {
                        class353.method2116("Invalid buildarea value", false);
                        return;
                    }
                    int var14 = class410.method2405(-126, arg1.substring(6));
                    if (~var14 <= -1 && class275.method1607(true, class20.field294) >= var14) {
                        class76.field1075.field3648 = var14;
                        class76.field1075.method1098(-9, class346.field4985);
                        class425.field6186 = false;
                        class353.method2116("maxbuildarea=" + class76.field1075.field3648, false);
                        return;
                    }
                    class353.method2116("Invalid buildarea value", false);
                    return;
                }
                if (arg1.startsWith("setparticles")) {
                    if (~arg1.length() > -14) {
                        class353.method2116("Invalid particles value", false);
                        return;
                    }
                    class407.method2389((byte) 80, class410.method2405(-126, arg1.substring(13)));
                    class76.field1075.method1098(arg2 + 1, class346.field4985);
                    class425.field6186 = false;
                    class353.method2116("particles=" + class209.method1332((byte) -47), false);
                    return;
                }
                if (arg1.startsWith("rect_debug")) {
                    if (arg1.length() < 10) {
                        class353.method2116("Invalid rect_debug value", false);
                        return;
                    }
                    class482.field6960 = class410.method2405(-117, arg1.substring(10).trim());
                    class353.method2116("rect_debug=" + class482.field6960, false);
                    return;
                }
                if (arg1.equalsIgnoreCase("qa_op_test")) {
                    class181.field2693 = true;
                    class353.method2116("qa_op_test=" + class181.field2693, false);
                    return;
                }
                if (arg1.equalsIgnoreCase("clipcomponents")) {
                    class282.field3834 = !class282.field3834;
                    class353.method2116("clipcomponents=" + class282.field3834, false);
                    return;
                }
                if (arg1.startsWith("bloom")) {
                    boolean var15 = class275.field3737.method549();
                    if (!class148.method1067(true, !var15)) {
                        class353.method2116("Failed to enable bloom", false);
                        return;
                    }
                    if (!var15) {
                        class353.method2116("Bloom enabled", false);
                        return;
                    }
                    class353.method2116("Bloom disabled", false);
                    return;
                }
                if (arg1.equalsIgnoreCase("tween")) {
                    if (class434.field6286) {
                        class434.field6286 = false;
                        class353.method2116("Forced tweening disabled.", false);
                        return;
                    }
                    class434.field6286 = true;
                    class353.method2116("Forced tweening ENABLED!", false);
                    return;
                }
                if (arg1.equalsIgnoreCase("shiftclick")) {
                    if (!class211.field3011) {
                        class353.method2116("Shift-click ENABLED!", false);
                        class211.field3011 = true;
                        return;
                    }
                    class353.method2116("Shift-click disabled.", false);
                    class211.field3011 = false;
                    return;
                }
                if (arg1.equalsIgnoreCase("getcgcoord")) {
                    class353.method2116("x:" + (class81.field1158.field6284 >> 7) + " z:" + (class81.field1158.field6287 >> 7), false);
                    return;
                }
                if (arg1.equalsIgnoreCase("getheight")) {
                    class353.method2116("Height: " + class492.field7122[class81.field1158.field6279].method85(class81.field1158.field6284 >> 7, class81.field1158.field6287 >> 7), false);
                    return;
                }
                if (arg1.equalsIgnoreCase("resetminimap")) {
                    class509.field7453.method2521((byte) -115);
                    class509.field7453.method2503(-3);
                    class10.field116.method1500((byte) 90);
                    class98.field1563.method1658(-11711);
                    class35.method258(99);
                    class353.method2116("Minimap reset", false);
                    return;
                }
                if (arg1.startsWith("mc")) {
                    if (class275.field3737.method531()) {
                        int var16 = Integer.parseInt(arg1.substring(3));
                        if (~var16 > -2) {
                            var16 = 1;
                        } else if (~var16 < -5) {
                            var16 = 4;
                        }
                        class499.field7299 = var16;
                        class275.field3737.method493(class499.field7299);
                        class275.field3737.method494(0);
                        class353.method2116("Render cores now: " + class499.field7299, false);
                        return;
                    }
                    class353.method2116("Current toolkit doesn't support multiple cores", false);
                    return;
                }
                if (arg1.startsWith("cachespace")) {
                    class353.method2116("I(s): " + class133.field2022.method2773(89) + "/" + class133.field2022.method2766(false), false);
                    class353.method2116("I(m): " + class445.field6549.method2773(-32) + "/" + class445.field6549.method2766(false), false);
                    class353.method2116("O(s): " + class534.field7872.field7618.method2323(false) + "/" + class534.field7872.field7618.method2324(-27165), false);
                    return;
                }
                if (arg1.equalsIgnoreCase("getcamerapos")) {
                    class353.method2116("Pos: " + class81.field1158.field6279 + "," + ((class118.field1848 >> 7) - -class110.field1775 >> 6) + "," + ((class108.field1747 >> 7) + class399.field5727 >> 6) + "," + ((class118.field1848 >> 7) + class110.field1775 & 63) + "," + (63 & (class108.field1747 >> 7) + class399.field5727) + " Height: " + (class123.method893(class108.field1747, class118.field1848, (byte) -13, class81.field1158.field6279) - class159.field2421), false);
                    class353.method2116("Look: " + class81.field1158.field6279 + "," + (class22.field302 + class110.field1775 >> 6) + "," + (class422.field6129 + class399.field5727 >> 6) + "," + (63 & class22.field302 - -class110.field1775) + "," + (class422.field6129 - -class399.field5727 & 63) + " Height: " + (class123.method893(class422.field6129, class22.field302, (byte) -13, class81.field1158.field6279) + -class286.field3881), false);
                    return;
                }
                if (arg1.equals("showocc")) {
                    class419.field6065 = !class419.field6065;
                    class75.method590(119);
                    class353.method2116("showocc=" + class419.field6065, false);
                    return;
                }
                if (arg1.equals("wallocc")) {
                    class143.field2122 = !class143.field2122;
                    class75.method590(97);
                    class353.method2116("forcewallocc=" + class143.field2122, false);
                    return;
                }
                if (arg1.equals("renderprofile") || arg1.equals("rp")) {
                    class250.field3417 = !class250.field3417;
                    class275.field3737.method521(class250.field3417);
                    class197.method1298(26575);
                    class353.method2116("showprofiling=" + class250.field3417, false);
                    return;
                }
                if (arg1.equals("performancetest")) {
                    class353.method2116("Java toolkit: " + class358.method2130(class346.field4985, Integer.MIN_VALUE, 0), false);
                    class353.method2116("GL toolkit:   " + class358.method2130(class346.field4985, Integer.MIN_VALUE, 1), false);
                    class353.method2116("SSE toolkit:  " + class358.method2130(class346.field4985, Integer.MIN_VALUE, 2), false);
                    return;
                }
                if (arg1.equals("nonpcs")) {
                    class4.field61 = !class4.field61;
                    class353.method2116("nonpcs=" + class4.field61, false);
                    return;
                }
                if (arg1.equals("autoworld")) {
                    class371.method2213(arg2 + 26316);
                    class353.method2116("auto world selected", false);
                    return;
                }
                if (arg1.startsWith("switchworld")) {
                    int var17 = Integer.parseInt(arg1.substring(12));
                    class193.method1273(class184.method1242(var17, 115).field6766, 40000, var17);
                    class353.method2116("switched", false);
                    return;
                }
                if (arg1.equals("getworld")) {
                    class353.method2116("w: " + class184.field2737.field609, false);
                    return;
                }
                if (arg1.startsWith("pc")) {
                    class274.method1602(14, class412.field5860);
                    class17.field275.method1891(false, 0);
                    int var18 = class17.field275.field4360;
                    int var19 = arg1.indexOf(" ", 4);
                    class17.field275.method1879(32767, arg1.substring(3, var19));
                    class416.method2455(arg1.substring(var19), 0, class17.field275);
                    class17.field275.method1851(class17.field275.field4360 - var18, 0);
                    return;
                }
                if (arg1.equals("heap")) {
                    class353.method2116("Heap: " + class20.field294 + "MB", false);
                    return;
                }
                if (arg1.equals("savevarcs")) {
                    class294.method1701((byte) -30);
                    class353.method2116("perm varcs saved", false);
                    return;
                }
                if (arg1.equals("scramblevarcs")) {
                    for (int var20 = 0; ~class451.field6614.length < ~var20; ++var20) {
                        if (class308.field4189[var20]) {
                            class451.field6614[var20] = (int) (Math.random() * 99999.0D);
                            if (Math.random() > 0.5D) {
                                class451.field6614[var20] *= -1;
                            }
                        }
                    }
                    class294.method1701((byte) 70);
                    class353.method2116("perm varcs scrambled", false);
                    return;
                }
                if (arg1.equals("showcolmap")) {
                    class157.field2398 = true;
                    class35.method258(126);
                    class353.method2116("colmap is shown", false);
                    return;
                }
                if (arg1.equals("hidecolmap")) {
                    class157.field2398 = false;
                    class35.method258(72);
                    class353.method2116("colmap is hidden", false);
                    return;
                }
                if (arg1.equals("resetcache")) {
                    class250.method1490((byte) 107);
                    class353.method2116("Caches reset", false);
                    return;
                }
                if (arg1.equals("profilecpu")) {
                    class353.method2116(class419.method2480(arg2 ^ -115) + "ms", false);
                    return;
                }
                if (arg1.startsWith("cpuusage")) {
                    int var21 = Integer.parseInt(arg1.substring(9));
                    if (var21 >= 0 && var21 <= 4) {
                        class76.field1075.field3686 = var21;
                    }
                    class353.method2116("cpuusage=" + class76.field1075.field3686, false);
                    return;
                }
                if (arg1.startsWith("getclientvarpbit")) {
                    int var22 = Integer.parseInt(arg1.substring(17));
                    class353.method2116("varpbit=" + class309.field4200.method1206(var22, (byte) 91), false);
                    return;
                }
                if (arg1.startsWith("getclientvarp")) {
                    int var23 = Integer.parseInt(arg1.substring(14));
                    class353.method2116("varp=" + class309.field4200.method1205(-123, var23), false);
                    return;
                }
                if (arg1.startsWith("demologin")) {
                    class17.method124(false, 0, (byte) 36);
                    return;
                }
                if (arg1.startsWith("newdemologin")) {
                    class17.method124(true, 0, (byte) 58);
                    return;
                }
                if (arg1.startsWith("directlogin")) {
                    String[] var24 = class139.method982(' ', (byte) 10, arg1.substring(12));
                    if (var24.length >= 2) {
                        int var25 = var24.length > 2 ? Integer.parseInt(var24[2]) : 0;
                        class532.method3155(var24[1], var25, -124, var24[0]);
                        return;
                    }
                }
                if (arg1.startsWith("csprofileclear")) {
                    class47.method314();
                    return;
                }
                if (arg1.startsWith("csprofileoutputc")) {
                    class47.method321(100, false);
                    return;
                }
                if (arg1.startsWith("csprofileoutputt")) {
                    class47.method321(10, true);
                    return;
                }
                if (arg1.startsWith("texsize")) {
                    int var26 = Integer.parseInt(arg1.substring(8));
                    class275.field3737.method504(var26);
                    return;
                }
                if (arg1.equals("soundstreamcount")) {
                    class353.method2116("Active streams: " + class290.field3924.method292(), false);
                    return;
                }
                if (arg1.equals("errormessage")) {
                    class353.method2116(class502.field7343.method2296(false), false);
                    return;
                }
                if (~class494.field7155 == -10) {
                    ++class13.field137;
                    class274.method1602(14, class355.field5139);
                    class17.field275.method1891(false, 3 + arg1.length());
                    class17.field275.method1891(false, !arg3 ? 0 : 1);
                    class17.field275.method1891(false, !arg0 ? 0 : 1);
                    class17.field275.method1879(32767, arg1);
                }
                if (arg1.startsWith("fps ") && class81.field1144 != class523.field7659) {
                    class105.method815(class410.method2405(arg2 ^ -24, arg1.substring(4)), (byte) 49);
                    return;
                }
                if (~class494.field7155 != -10) {
                    class353.method2116("Unrecogonised commmand when not logged in: " + arg1, false);
                }
            } catch (Exception var28) {
                class353.method2116("Whoops, something went wrong.", false);
            }
        }
        if (arg2 != -10) {
            field2119 = null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lpg;IIIII)V")
    public class142(class333 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field2110 = arg4;
        this.field2108 = arg5;
        int var7 = -arg3 - arg5 + super.field1978.field4613;
        super.field1978.method1977(this, true);
        OpenGL.glCopyTexImage2D(super.field1970, 0, super.field1972, arg2, var7, arg4, arg5, 0);
        this.method928(101, true);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZIZ)V")
    public final void method990(boolean arg0, int arg1, boolean arg2) {
        if (~super.field1970 == -3554) {
            super.field1978.method1977(this, true);
            OpenGL.glTexParameteri(super.field1970, 10242, arg0 ? 10497 : 33071);
            OpenGL.glTexParameteri(super.field1970, 10243, !arg2 ? 33071 : 10497);
        }
        if (arg1 == 1024) {
            ++field2106;
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lpg;IIIIZ[IZ)V")
    public class142(class333 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, boolean arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field2108 = arg4;
        this.field2110 = arg3;
        if (arg7) {
            int[] var9 = new int[arg6.length];
            for (int var10 = 0; ~arg4 < ~var10; ++var10) {
                int var11 = arg3 * var10;
                int var12 = (arg4 - 1 + -var10) * arg3;
                for (int var13 = 0; var13 < arg3; ++var13) {
                    var9[var11++] = arg6[var12++];
                }
            }
            arg6 = var9;
        }
        super.field1978.method1977(this, true);
        if (arg5 && super.field1970 != 34037) {
            class416.method2462(super.field1972, this.field2110, this.field2108, super.field1970, (byte) -45, arg6, 32993, super.field1978.field4825);
            this.method924(true, 28940);
        } else {
            OpenGL.glTexImage2Di(super.field1970, 0, super.field1972, this.field2110, this.field2108, 0, 32993, super.field1978.field4825, arg6, 0);
            this.method924(false, 28940);
        }
        this.method928(99, true);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "([IZIBIIIII)V")
    public final void method991(int[] arg0, boolean arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (~arg8 == -1) {
            arg8 = arg4;
        }
        ++field2111;
        if (arg1) {
            int[] var10 = new int[arg2 * arg4];
            for (int var11 = 0; var11 < arg2; ++var11) {
                int var12 = arg4 * var11;
                int var13 = (-var11 + arg2 + -1) * arg8 + arg5;
                for (int var14 = 0; arg4 > var14; ++var14) {
                    var10[var12++] = arg0[var13++];
                }
            }
            arg0 = var10;
        }
        super.field1978.method1977(this, true);
        if (arg4 != arg8) {
            OpenGL.glPixelStorei(3314, arg8);
        }
        OpenGL.glTexSubImage2Di(super.field1970, 0, arg6, arg7, arg4, arg2, 32993, super.field1978.field4825, arg0, arg5);
        int var15 = -86 / ((arg3 - 11) / 35);
        if (arg4 != arg8) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lpg;IIIIZ[BIZ)V")
    public class142(class333 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field2110 = arg3;
        this.field2108 = arg4;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; ~var11 > ~arg4; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (arg4 - var11 + -1) * arg3;
                for (int var14 = 0; var14 < arg3; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field1978.method1977(this, true);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && ~super.field1970 != -34038) {
            class331.method1953(-13125, arg2, arg1, arg7, arg3, arg6, arg4);
            this.method924(true, 28940);
        } else {
            OpenGL.glTexImage2Dub(super.field1970, 0, super.field1972, this.field2110, this.field2108, 0, arg7, 5121, arg6, 0);
            this.method924(false, 28940);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method928(111, true);
    }

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "(I)V")
    public static void method992(int arg0) {
        if (arg0 != -1) {
            field2119 = null;
        }
        field2119 = null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIBIII)V")
    public final void method993(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        int var8 = 109 / ((arg3 - -22) / 58);
        ++field2116;
        int var9 = -arg0 + super.field1978.field4613 + -arg4;
        super.field1978.method1977(this, true);
        OpenGL.glCopyTexSubImage2D(super.field1970, 0, arg6, this.field2108 - arg5 + -arg0, arg2, var9, arg1, arg0);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)Z")
    public static final boolean method994(int arg0, int arg1, int arg2) {
        ++field2118;
        if (arg2 != 13800) {
            return true;
        } else {
            return ~(458752 & arg1) != -1 | class124.method900(arg0, 52, arg1) || class267.method1575(arg1, arg0, -418764735);
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lpg;IIIIZ[FI)V")
    public class142(class333 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field2108 = arg4;
        this.field2110 = arg3;
        super.field1978.method1977(this, true);
        if (arg5 && ~super.field1970 != -34038) {
            class201.method1306(arg3, (byte) -61, arg4, arg1, arg6, arg2, arg7);
            this.method924(true, 28940);
        } else {
            OpenGL.glTexImage2Df(super.field1970, 0, super.field1972, this.field2110, this.field2108, 0, arg7, 5126, arg6, 0);
            this.method924(false, 28940);
        }
        this.method928(103, true);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIII)V")
    public final void method995(int arg0, int arg1, int arg2, int arg3) {
        ++field2117;
        OpenGL.glFramebufferTexture2DEXT(arg2, arg1, super.field1970, super.field1975, arg0);
        if (arg3 != -15651) {
            this.method137(true);
        }
        this.field2109 = arg2;
        this.field2107 = arg1;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)V")
    public final void method137(boolean arg0) {
        ++field2112;
        OpenGL.glFramebufferTexture2DEXT(this.field2109, this.field2107, super.field1970, 0, 0);
        this.field2107 = -1;
        this.field2109 = -1;
        if (arg0) {
            this.field2108 = -75;
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lpg;IIII)V")
    public class142(class333 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field2110 = arg3;
        this.field2108 = arg4;
        super.field1978.method1977(this, true);
        OpenGL.glTexImage2Dub(super.field1970, 0, super.field1972, arg3, arg4, 0, class332.method1958(super.field1972, (byte) 116), 5121, (byte[]) null, 0);
        this.method928(111, true);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IZIIZIIII[B)V")
    public final void method996(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, byte[] arg9) {
        if (arg5 == 0) {
            arg5 = arg2;
        }
        ++field2113;
        if (arg1) {
            this.method996(-99, true, 4, 114, true, -101, -31, 121, -33, (byte[]) null);
        }
        if (arg4) {
            int var11 = class50.method338(arg3, (byte) -41);
            int var12 = arg2 * var11;
            int var13 = arg5 * var11;
            byte[] var14 = new byte[arg6 * var12];
            for (int var15 = 0; ~arg6 < ~var15; ++var15) {
                int var16 = var12 * var15;
                int var17 = (-var15 + arg6 + -1) * var13 + arg8;
                for (int var18 = 0; var12 > var18; ++var18) {
                    var14[var16++] = arg9[var17++];
                }
            }
            arg9 = var14;
        }
        super.field1978.method1977(this, true);
        OpenGL.glPixelStorei(3317, 1);
        if (~arg2 != ~arg5) {
            OpenGL.glPixelStorei(3314, arg5);
        }
        OpenGL.glTexSubImage2Dub(super.field1970, 0, arg0, arg7, arg2, arg6, arg3, 5121, arg9, arg8);
        if (arg2 != arg5) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    static {
        new class157("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
    }
}
