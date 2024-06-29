import jagex3.jagmisc.jagmisc;
import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class155 extends class453 implements class30 {

    @OriginalMember(owner = "client!ue", name = "x", descriptor = "I")
    private int field2201;

    @OriginalMember(owner = "client!ue", name = "z", descriptor = "[I")
    public static int[] field2203 = new int[256];

    @OriginalMember(owner = "client!ue", name = "B", descriptor = "Lsl;")
    public static class318 field2204;

    @OriginalMember(owner = "client!ue", name = "C", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!ue", name = "s", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!ue", name = "t", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!ue", name = "u", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!ue", name = "v", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!ue", name = "w", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!ue", name = "y", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!ue", name = "E", descriptor = "Ll;")
    public static class16 field2206;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
    public static void method1099(byte arg0) {
        field2203 = null;
        field2206 = null;
        if (arg0 <= 119) {
            field2204 = null;
        }
        field2204 = null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BII[B)V")
    public final void method240(byte arg0, int arg1, int arg2, byte[] arg3) {
        ++field2193;
        this.method2731(51, arg1, arg3);
        this.field2201 = arg2;
        int var5 = 53 % ((arg0 - 12) / 38);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
    public static final void method1100(String arg0, boolean arg1, int arg2) {
        ++field2200;
        if (class365.field5281 != class297.field4260 || class365.field5273 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equals("nativememerror")) {
                throw new OutOfMemoryError("native(MPR");
            }
            try {
                if (arg0.equalsIgnoreCase("fpson")) {
                    class49.field547 = true;
                    class293.method1856(126, "fps debug enabled");
                    return;
                }
                if (arg0.equalsIgnoreCase("fpsoff")) {
                    class49.field547 = false;
                    class293.method1856(arg2 + 121, "fps debug disabled");
                    return;
                }
                if (arg0.equals("systemmem")) {
                    try {
                        class293.method1856(121, "System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
                        return;
                    } catch (Throwable var23) {
                        return;
                    }
                }
                if (arg0.equalsIgnoreCase("cls")) {
                    class209.field3033 = 0;
                    class7.field88 = 0;
                    return;
                }
                if (arg0.equalsIgnoreCase("cleartext")) {
                    class24.field272.method2953(45);
                    class293.method1856(122, "Text coords cleared");
                    return;
                }
                if (arg0.equalsIgnoreCase("gc")) {
                    class436.method2641(arg2 ^ 20377);
                    for (int var3 = 0; var3 < 10; ++var3) {
                        System.gc();
                    }
                    Runtime var4 = Runtime.getRuntime();
                    int var5 = (int) ((var4.totalMemory() + -var4.freeMemory()) / 1024L);
                    class293.method1856(123, "mem=" + var5 + "k");
                    return;
                }
                if (arg0.equalsIgnoreCase("compact")) {
                    class436.method2641(20378);
                    for (int var6 = 0; ~var6 > -11; ++var6) {
                        System.gc();
                    }
                    Runtime var7 = Runtime.getRuntime();
                    int var8 = (int) ((var7.totalMemory() + -var7.freeMemory()) / 1024L);
                    class293.method1856(arg2 ^ 121, "Memory before cleanup=" + var8 + "k");
                    class74.method698((byte) 113);
                    class436.method2641(20378);
                    for (int var9 = 0; var9 < 10; ++var9) {
                        System.gc();
                    }
                    int var10 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                    class293.method1856(125, "Memory after cleanup=" + var10 + "k");
                    return;
                }
                if (arg0.equalsIgnoreCase("pcachesize")) {
                    class293.method1856(125, "Number of player models in cache:" + class51.method507((byte) -29));
                    return;
                }
                if (arg0.equalsIgnoreCase("clientdrop")) {
                    class293.method1856(124, "Dropped client connection");
                    if (class113.field1589 == 30) {
                        class290.method1832((byte) 111);
                        return;
                    }
                    if (~class113.field1589 == -26) {
                        class450.field6642 = true;
                    }
                    return;
                }
                if (arg0.equalsIgnoreCase("clientjs5drop")) {
                    class405.field6029.method1431(228742352);
                    class293.method1856(127, "Dropped client js5 net queue");
                    return;
                }
                if (arg0.equalsIgnoreCase("serverjs5drop")) {
                    class405.field6029.method1424((byte) -81);
                    class293.method1856(arg2 + 120, "Dropped server js5 net queue");
                    return;
                }
                if (arg0.equalsIgnoreCase("breakcon")) {
                    class498.field7404.method2576((byte) 62);
                    class383.field5635.method640(0);
                    class405.field6029.method1423((byte) -113);
                    class293.method1856(122, "Breaking new connections for 5 seconds");
                    return;
                }
                if (arg0.equalsIgnoreCase("rebuild")) {
                    class121.method956(true);
                    class489.method2941(-114);
                    class293.method1856(arg2 ^ 121, "Rebuilding map");
                    return;
                }
                if (arg0.equalsIgnoreCase("wm1")) {
                    class76.method711(1, -1, -1, false, false);
                    if (~class114.method920((byte) -123) != -2) {
                        class293.method1856(124, "wm1 failed");
                        return;
                    }
                    class293.method1856(123, "wm1 succeeded");
                    return;
                }
                if (arg0.equalsIgnoreCase("wm2")) {
                    class76.method711(2, -1, -1, false, false);
                    if (~class114.method920((byte) -123) != -3) {
                        class293.method1856(121, "wm2 failed");
                        return;
                    }
                    class293.method1856(arg2 + 122, "wm2 succeeded");
                    return;
                }
                if (arg0.equalsIgnoreCase("wm3")) {
                    class76.method711(3, 768, 1024, false, false);
                    if (class114.method920((byte) -123) != 3) {
                        class293.method1856(124, "wm3 failed");
                        return;
                    }
                    class293.method1856(125, "wm3 succeeded");
                    return;
                }
                if (arg0.equalsIgnoreCase("tk0")) {
                    class88.method780(0, (byte) 88);
                    if (class65.field802 == 0) {
                        class293.method1856(126, "Entered tk0");
                        class478.field7044.field3345 = 0;
                        class478.field7044.method2067(class498.field7404, (byte) -114);
                        class247.field3663 = false;
                        return;
                    }
                    class293.method1856(121, "Failed to enter tk0");
                    return;
                }
                if (arg0.equalsIgnoreCase("tk1")) {
                    class88.method780(1, (byte) 91);
                    if (class65.field802 != 1) {
                        class293.method1856(121, "Failed to enter tk1");
                        return;
                    }
                    class293.method1856(127, "Entered tk1");
                    class478.field7044.field3345 = 1;
                    class478.field7044.method2067(class498.field7404, (byte) 117);
                    class247.field3663 = false;
                    return;
                }
                if (arg0.equalsIgnoreCase("tk2")) {
                    class88.method780(2, (byte) 117);
                    if (class65.field802 == 2) {
                        class293.method1856(127, "Entered tk2");
                        class478.field7044.field3345 = 2;
                        class478.field7044.method2067(class498.field7404, (byte) -112);
                        class247.field3663 = false;
                        return;
                    }
                    class293.method1856(arg2 + 123, "Failed to enter tk2");
                    return;
                }
                if (arg0.equalsIgnoreCase("tk3")) {
                    class88.method780(3, (byte) 69);
                    if (~class65.field802 == -4) {
                        class293.method1856(123, "Entered tk3");
                        return;
                    }
                    class293.method1856(122, "Failed to enter tk3");
                    return;
                }
                if (arg0.equalsIgnoreCase("ot")) {
                    class478.field7044.field3320 = !class478.field7044.field3320;
                    class478.field7044.method2067(class498.field7404, (byte) 46);
                    class247.field3663 = false;
                    class121.method956(true);
                    class293.method1856(121, "ot=" + class478.field7044.field3320);
                    return;
                }
                if (arg0.equalsIgnoreCase("gb")) {
                    class478.field7044.field3314 = !class478.field7044.field3314;
                    class478.field7044.method2067(class498.field7404, (byte) -107);
                    class247.field3663 = false;
                    class121.method956(true);
                    class293.method1856(127, "gb=" + class478.field7044.field3314);
                    return;
                }
                if (arg0.startsWith("shadows")) {
                    if (~arg0.length() > -9) {
                        class293.method1856(127, "Invalid shadows value");
                        return;
                    }
                    String var11 = arg0.substring(8);
                    int var12 = !class242.method1599(var11, 59) ? -1 : class56.method521(var11, 10);
                    if (var12 >= 0 && var12 <= 2) {
                        class478.field7044.method1538(class65.field802, ~arg2, var12);
                        class478.field7044.method2067(class498.field7404, (byte) 105);
                        class247.field3663 = false;
                        class121.method956(true);
                        class293.method1856(arg2 ^ 121, "shadows=" + var12);
                        return;
                    }
                    class293.method1856(127, "Invalid shadows value");
                    return;
                }
                if (arg0.startsWith("textures")) {
                    class478.field7044.field3356 = !class478.field7044.field3356;
                    class478.field7044.method2067(class498.field7404, (byte) -97);
                    class247.field3663 = false;
                    class4.method36(arg2 + -10);
                    class121.method956(true);
                    class293.method1856(123, "textures=" + class478.field7044.field3356);
                    return;
                }
                if (arg0.startsWith("setba")) {
                    if (~arg0.length() > -7) {
                        class293.method1856(123, "Invalid buildarea value");
                        return;
                    }
                    int var13 = class56.method521(arg0.substring(6), 10);
                    if (var13 >= 0 && ~var13 >= ~client.method1378(class352.field4882, (byte) -91)) {
                        class478.field7044.field3328 = var13;
                        class478.field7044.method2067(class498.field7404, (byte) 63);
                        class247.field3663 = false;
                        class293.method1856(125, "maxbuildarea=" + class478.field7044.field3328);
                        return;
                    }
                    class293.method1856(121, "Invalid buildarea value");
                    return;
                }
                if (arg0.startsWith("setparticles")) {
                    if (~arg0.length() > -14) {
                        class293.method1856(arg2 + 118, "Invalid particles value");
                        return;
                    }
                    class86.method766(class56.method521(arg0.substring(13), 10), arg2 + 9057);
                    class478.field7044.method2067(class498.field7404, (byte) 127);
                    class247.field3663 = false;
                    class293.method1856(arg2 ^ 126, "particles=" + class176.method1234(8458));
                    return;
                }
                if (arg0.startsWith("rect_debug")) {
                    if (arg0.length() < 10) {
                        class293.method1856(121, "Invalid rect_debug value");
                        return;
                    }
                    class240.field3548 = class56.method521(arg0.substring(10).trim(), 10);
                    class293.method1856(123, "rect_debug=" + class240.field3548);
                    return;
                }
                if (arg0.equalsIgnoreCase("qa_op_test")) {
                    class407.field6069 = true;
                    class293.method1856(123, "qa_op_test=" + class407.field6069);
                    return;
                }
                if (arg0.equalsIgnoreCase("clipcomponents")) {
                    class522.field7670 = !class522.field7670;
                    class293.method1856(arg2 + 120, "clipcomponents=" + class522.field7670);
                    return;
                }
                if (arg0.startsWith("bloom")) {
                    boolean var14 = class225.field3300.method378();
                    if (class128.method994(-14734, !var14)) {
                        if (!var14) {
                            class293.method1856(122, "Bloom enabled");
                            return;
                        }
                        class293.method1856(121, "Bloom disabled");
                        return;
                    }
                    class293.method1856(arg2 ^ 124, "Failed to enable bloom");
                    return;
                }
                if (arg0.equalsIgnoreCase("tween")) {
                    if (class447.field6599) {
                        class447.field6599 = false;
                        class293.method1856(122, "Forced tweening disabled.");
                        return;
                    }
                    class447.field6599 = true;
                    class293.method1856(127, "Forced tweening ENABLED!");
                    return;
                }
                if (arg0.equalsIgnoreCase("shiftclick")) {
                    if (!class223.field3272) {
                        class293.method1856(124, "Shift-click ENABLED!");
                        class223.field3272 = true;
                        return;
                    }
                    class293.method1856(123, "Shift-click disabled.");
                    class223.field3272 = false;
                    return;
                }
                if (arg0.equalsIgnoreCase("getcgcoord")) {
                    class293.method1856(122, "x:" + (class435.field6375.field6335 >> 7) + " z:" + (class435.field6375.field6334 >> 7));
                    return;
                }
                if (arg0.equalsIgnoreCase("getheight")) {
                    class293.method1856(126, "Height: " + class131.field1899[class435.field6375.field6328].method430(class435.field6375.field6335 >> 7, class435.field6375.field6334 >> 7));
                    return;
                }
                if (arg0.equalsIgnoreCase("resetminimap")) {
                    class240.field3533.method2361((byte) 125);
                    class240.field3533.method2377(0);
                    class504.field7479.method2004(34);
                    class175.field2483.method840(-128);
                    class489.method2941(-128);
                    class293.method1856(arg2 ^ 124, "Minimap reset");
                    return;
                }
                if (arg0.startsWith("mc")) {
                    if (!class225.field3300.method326()) {
                        class293.method1856(122, "Current toolkit doesn't support multiple cores");
                        return;
                    }
                    int var15 = Integer.parseInt(arg0.substring(3));
                    if (~var15 > -2) {
                        var15 = 1;
                    } else if (var15 > 4) {
                        var15 = 4;
                    }
                    class176.field2498 = var15;
                    class225.field3300.method353(class176.field2498);
                    class225.field3300.method340(0);
                    class293.method1856(126, "Render cores now: " + class176.field2498);
                    return;
                }
                if (arg0.startsWith("cachespace")) {
                    class293.method1856(arg2 ^ 120, "I(s): " + class380.field5611.method1109((byte) -61) + "/" + class380.field5611.method1113((byte) 58));
                    class293.method1856(122, "I(m): " + class93.field1272.method1109((byte) -125) + "/" + class93.field1272.method1113((byte) 58));
                    class293.method1856(123, "O(s): " + class270.field3995.field24.method929(98) + "/" + class270.field3995.field24.method939((byte) -106));
                    return;
                }
                if (arg0.equalsIgnoreCase("getcamerapos")) {
                    class293.method1856(126, "Pos: " + class435.field6375.field6328 + "," + ((class161.field2268 >> 7) + class340.field4713 >> 6) + "," + ((class486.field7138 >> 7) + class476.field7013 >> 6) + "," + ((class161.field2268 >> 7) + class340.field4713 & 63) + "," + (63 & (class486.field7138 >> 7) - -class476.field7013) + " Height: " + (class66.method643(class161.field2268, arg2 ^ 87, class435.field6375.field6328, class486.field7138) - class487.field7162));
                    class293.method1856(122, "Look: " + class435.field6375.field6328 + "," + (class462.field6791 + class340.field4713 >> 6) + "," + (class346.field4805 - -class476.field7013 >> 6) + "," + (class462.field6791 + class340.field4713 & 63) + "," + (class476.field7013 + class346.field4805 & 63) + " Height: " + (class66.method643(class462.field6791, arg2 ^ -48, class435.field6375.field6328, class346.field4805) + -class172.field2447));
                    return;
                }
                if (arg0.equals("showocc")) {
                    class104.field1461 = !class104.field1461;
                    class121.method956(true);
                    class293.method1856(127, "showocc=" + class104.field1461);
                    return;
                }
                if (arg0.equals("wallocc")) {
                    class429.field6316 = !class429.field6316;
                    class121.method956(true);
                    class293.method1856(126, "forcewallocc=" + class429.field6316);
                    return;
                }
                if (arg0.equals("renderprofile") || arg0.equals("rp")) {
                    class433.field6360 = !class433.field6360;
                    class225.field3300.method315(class433.field6360);
                    class206.method1436(-81);
                    class293.method1856(123, "showprofiling=" + class433.field6360);
                    return;
                }
                if (arg0.equals("performancetest")) {
                    class293.method1856(122, "Java toolkit: " + class305.method1897(class498.field7404, 0, 48));
                    class293.method1856(121, "GL toolkit:   " + class305.method1897(class498.field7404, 1, 115));
                    class293.method1856(127, "SSE toolkit:  " + class305.method1897(class498.field7404, 2, arg2 + -90));
                    return;
                }
                if (arg0.equals("nonpcs")) {
                    class275.field4056 = !class275.field4056;
                    class293.method1856(arg2 + 120, "nonpcs=" + class275.field4056);
                    return;
                }
                if (arg0.equals("autoworld")) {
                    class424.method2597((byte) -105);
                    class293.method1856(127, "auto world selected");
                    return;
                }
                if (arg0.startsWith("pc")) {
                    class32.method258(-103, class268.field3953);
                    class472.field6970.method638(255, 0);
                    int var16 = class472.field6970.field827;
                    int var17 = arg0.indexOf(" ", 4);
                    class472.field6970.method605(59, arg0.substring(3, var17));
                    class131.method1006(arg0.substring(var17), 0, class472.field6970);
                    class472.field6970.method632(-1591647264, -var16 + class472.field6970.field827);
                    return;
                }
                if (arg0.equals("heap")) {
                    class293.method1856(arg2 + 121, "Heap: " + class352.field4882 + "MB");
                    return;
                }
                if (arg0.equals("savevarcs")) {
                    class393.method2406(-22125);
                    class293.method1856(126, "perm varcs saved");
                    return;
                }
                if (arg0.equals("scramblevarcs")) {
                    for (int var18 = 0; ~var18 > ~class290.field4169.length; ++var18) {
                        if (class450.field6635[var18]) {
                            class290.field4169[var18] = (int) (99999.0D * Math.random());
                            if (Math.random() > 0.5D) {
                                class290.field4169[var18] *= -1;
                            }
                        }
                    }
                    class393.method2406(-22125);
                    class293.method1856(arg2 + 122, "perm varcs scrambled");
                    return;
                }
                if (arg0.equals("showcolmap")) {
                    class264.field3893 = true;
                    class489.method2941(arg2 ^ -112);
                    class293.method1856(124, "colmap is shown");
                    return;
                }
                if (arg0.equals("hidecolmap")) {
                    class264.field3893 = false;
                    class489.method2941(-108);
                    class293.method1856(127, "colmap is hidden");
                    return;
                }
                if (arg0.equals("resetcache")) {
                    class180.method1264((byte) 108);
                    class293.method1856(124, "Caches reset");
                    return;
                }
                if (arg0.equals("profilecpu")) {
                    class293.method1856(126, class165.method1167(115) + "ms");
                    return;
                }
                if (arg0.startsWith("cpuusage")) {
                    int var19 = Integer.parseInt(arg0.substring(9));
                    if (var19 >= 0 && ~var19 >= -5) {
                        class478.field7044.field3331 = var19;
                    }
                    class293.method1856(127, "cpuusage=" + class478.field7044.field3331);
                    return;
                }
                if (arg0.startsWith("getclientvarpbit")) {
                    int var20 = Integer.parseInt(arg0.substring(17));
                    class293.method1856(127, "varpbit=" + class253.field3739.method2543((byte) 45, var20));
                    return;
                }
                if (arg0.startsWith("getclientvarp")) {
                    int var21 = Integer.parseInt(arg0.substring(14));
                    class293.method1856(124, "varp=" + class253.field3739.method2544(var21, 0));
                    return;
                }
                if (arg0.startsWith("csprofileclear")) {
                    class41.method408();
                    return;
                }
                if (arg0.startsWith("csprofileoutputc")) {
                    class41.method410(100, false);
                    return;
                }
                if (arg0.startsWith("csprofileoutputt")) {
                    class41.method410(10, true);
                    return;
                }
                if (arg0.startsWith("texsize")) {
                    int var22 = Integer.parseInt(arg0.substring(8));
                    class225.field3300.method387(var22);
                    return;
                }
                if (arg0.equals("soundstreamcount")) {
                    class293.method1856(126, "Active streams: " + class273.field4030.method1240());
                    return;
                }
                if (~class113.field1589 == -31) {
                    ++class458.field6718;
                    class32.method258(-101, class9.field114);
                    class472.field6970.method638(255, 2 + arg0.length());
                    class472.field6970.method638(255, !arg1 ? 0 : 1);
                    class472.field6970.method605(113, arg0);
                }
                if (arg0.startsWith("fps ") && class365.field5281 != class297.field4260) {
                    class66.method644(class56.method521(arg0.substring(4), 10), (byte) -112);
                    return;
                }
                if (class113.field1589 != 30) {
                    class293.method1856(123, "Unrecogonised commmand when not logged in: " + arg0);
                }
            } catch (Exception var24) {
                class293.method1856(123, "Whoops, something went wrong.");
            }
        }
        if (arg2 != 3) {
            method1100((String) null, true, 49);
        }
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)Z")
    public static final boolean method1101(int arg0) {
        ++field2199;
        if (arg0 < 79) {
            field2206 = null;
        }
        if (class436.field6386) {
            try {
                class505.method3017(class498.field7404.field6180, "showVideoAd", 111);
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(B)V")
    public final void method1102(byte arg0) {
        ++field2196;
        if (arg0 <= 113) {
            this.field2201 = -53;
        }
        super.field6661.method2227(this, -116);
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)J")
    public final long method239(int arg0) {
        if (arg0 != 12786) {
            field2204 = null;
        }
        ++field2195;
        return 0L;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIII)I")
    public static final int method1103(int arg0, int arg1, int arg2, int arg3) {
        ++field2198;
        int var4 = arg0 & 3;
        if (var4 == 0) {
            return arg3;
        } else if (~var4 == -2) {
            return arg1;
        } else if (~var4 == -3) {
            return -arg3 + 1023;
        } else {
            if (arg2 != -32457) {
                field2203 = null;
            }
            return 1023 - arg1;
        }
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Lfd;I[BIZ)V")
    public class155(class365 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field2201 = arg1;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(IIII)V")
    public static final void method1104(int arg0, int arg1, int arg2, int arg3) {
        ++field2197;
        if (arg3 != -32509) {
            field2205 = -18;
        }
        class215 var4 = class171.method1208(arg0, (byte) 119, 11);
        var4.method1465(-25852);
        var4.field3081 = arg2;
        var4.field3082 = arg1;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)I")
    public final int method238(boolean arg0) {
        ++field2194;
        if (!arg0) {
            this.method239(117);
        }
        return this.field2201;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)I")
    public final int method237(int arg0) {
        int var2 = 79 / ((17 - arg0) / 39);
        ++field2202;
        return super.field6664;
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Lfd;ILjaggl/memory/NativeBuffer;IZ)V")
    public class155(class365 arg0, int arg1, NativeBuffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field2201 = arg1;
    }

    static {
        for (int var0 = 0; var0 < 256; ++var0) {
            int var1 = var0;
            for (int var2 = 0; ~var2 > -9; ++var2) {
                if ((1 & var1) != 1) {
                    var1 >>>= 1;
                } else {
                    var1 = var1 >>> 1 ^ -306674912;
                }
            }
            field2203[var0] = var1;
        }
        field2204 = new class318(23, 3);
        field2205 = 2;
    }
}
