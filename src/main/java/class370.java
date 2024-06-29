import jagex3.jagmisc.jagmisc;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class370 extends class238 implements class52 {

    @OriginalMember(owner = "client!tp", name = "e", descriptor = "I")
    private int field5600;

    @OriginalMember(owner = "client!tp", name = "h", descriptor = "Lpi;")
    public static class342 field5603 = new class342("Discard", "Ablegen", "Jeter", "Descartar");

    @OriginalMember(owner = "client!tp", name = "n", descriptor = "Ljava/lang/String;")
    public static String field5609 = "";

    @OriginalMember(owner = "client!tp", name = "j", descriptor = "Lef;")
    public static class335 field5605 = new class335(13, 0, 1, 0);

    @OriginalMember(owner = "client!tp", name = "o", descriptor = "Lrn;")
    public static class174 field5610 = new class174(40, 3);

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "I")
    public static int field5598;

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "I")
    public static int field5599;

    @OriginalMember(owner = "client!tp", name = "f", descriptor = "I")
    public static int field5601;

    @OriginalMember(owner = "client!tp", name = "g", descriptor = "I")
    public static int field5602;

    @OriginalMember(owner = "client!tp", name = "i", descriptor = "I")
    public static int field5604;

    @OriginalMember(owner = "client!tp", name = "k", descriptor = "I")
    public static int field5606;

    @OriginalMember(owner = "client!tp", name = "l", descriptor = "I")
    public static int field5607;

    @OriginalMember(owner = "client!tp", name = "m", descriptor = "I")
    public static int field5608;

    @OriginalMember(owner = "client!tp", name = "p", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field5611;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Z)J", line = 3)
    public final long method468(boolean arg0) {
        ++field5598;
        if (!arg0) {
            method2315(27, 98);
        }
        return super.field3435.method2628();
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(II)Z", line = 16)
    public static final boolean method2315(int arg0, int arg1) {
        ++field5606;
        if (arg1 <= 31) {
            return false;
        } else {
            return arg0 >= 4 && arg0 <= 8;
        }
    }

    @OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(Lvj;I[BI)V", line = 30)
    public class370(class303 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field5600 = arg1;
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(B)I", line = 38)
    public final int method469(byte arg0) {
        int var2 = -72 / ((24 - arg0) / 59);
        ++field5599;
        return 0;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)Z", line = 48)
    public static final boolean method2316(int arg0) {
        if (arg0 < 10) {
            return false;
        } else {
            ++field5601;
            return class307.field4694;
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(ZLjava/lang/String;Z)V", line = 60)
    public static final void method2317(boolean arg0, String arg1, boolean arg2) {
        ++field5608;
        if (class446.field6661 != class423.field6322 || ~class75.field1260 <= -3) {
            if (arg1.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            try {
                if (arg1.equalsIgnoreCase("fpson")) {
                    class109.field1828 = true;
                    class343.method2185("fps debug enabled", -61);
                    return;
                }
                if (arg1.equalsIgnoreCase("fpsoff")) {
                    class109.field1828 = false;
                    class343.method2185("fps debug disabled", -114);
                    return;
                }
                if (arg1.equals("systemmem")) {
                    try {
                        class343.method2185("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb", -39);
                        return;
                    } catch (Throwable var23) {
                        return;
                    }
                }
                if (arg1.equalsIgnoreCase("cls")) {
                    class377.field5710 = 0;
                    class347.field5195 = 0;
                    return;
                }
                if (arg1.equalsIgnoreCase("cleartext")) {
                    class343.field5157.method1637(25831);
                    class343.method2185("Text coords cleared", -44);
                    return;
                }
                if (arg1.equalsIgnoreCase("gc")) {
                    class213.method1425(0);
                    for (int var3 = 0; var3 < 10; ++var3) {
                        System.gc();
                    }
                    Runtime var4 = Runtime.getRuntime();
                    int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
                    class343.method2185("mem=" + var5 + "k", -107);
                    return;
                }
                if (arg1.equalsIgnoreCase("compact")) {
                    class213.method1425(0);
                    for (int var6 = 0; var6 < 10; ++var6) {
                        System.gc();
                    }
                    Runtime var7 = Runtime.getRuntime();
                    int var8 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                    class343.method2185("Memory before cleanup=" + var8 + "k", -86);
                    class86.method668(48);
                    class213.method1425(0);
                    for (int var9 = 0; ~var9 > -11; ++var9) {
                        System.gc();
                    }
                    int var10 = (int) ((var7.totalMemory() + -var7.freeMemory()) / 1024L);
                    class343.method2185("Memory after cleanup=" + var10 + "k", -118);
                    return;
                }
                if (arg1.equalsIgnoreCase("pcachesize")) {
                    class343.method2185("Number of player models in cache:" + class285.method1811((byte) 9), -98);
                    return;
                }
                if (arg1.equalsIgnoreCase("clientdrop")) {
                    class343.method2185("Dropped client connection", -37);
                    if (~class281.field4023 == -31) {
                        class149.method1144(2);
                        return;
                    }
                    if (~class281.field4023 == -26) {
                        class83.field1448 = true;
                    }
                    return;
                }
                if (arg1.equalsIgnoreCase("clientjs5drop")) {
                    class405.field6072.method776((byte) -66);
                    class343.method2185("Dropped client js5 net queue", -84);
                    return;
                }
                if (arg1.equalsIgnoreCase("serverjs5drop")) {
                    class405.field6072.method777(8192);
                    class343.method2185("Dropped server js5 net queue", -71);
                    return;
                }
                if (arg1.equalsIgnoreCase("breakcon")) {
                    class368.field5553.method1857(5000);
                    class116.field1927.method1301(16180);
                    class405.field6072.method779(true);
                    class343.method2185("Breaking new connections for 5 seconds", -93);
                    return;
                }
                if (arg1.equalsIgnoreCase("rebuild")) {
                    class347.method2206(-68);
                    class427.method2563((byte) -64);
                    class343.method2185("Rebuilding map", -69);
                    return;
                }
                if (arg1.equalsIgnoreCase("wm1")) {
                    class228.method1489(1, false, -1, -1, false);
                    if (class8.method43(false) == 1) {
                        class343.method2185("wm1 succeeded", -104);
                        return;
                    }
                    class343.method2185("wm1 failed", -76);
                    return;
                }
                if (arg1.equalsIgnoreCase("wm2")) {
                    class228.method1489(2, false, -1, -1, false);
                    if (class8.method43(false) != 2) {
                        class343.method2185("wm2 failed", -107);
                        return;
                    }
                    class343.method2185("wm2 succeeded", -79);
                    return;
                }
                if (arg1.equalsIgnoreCase("wm3")) {
                    class228.method1489(3, false, 768, 1024, false);
                    if (~class8.method43(!arg0) != -4) {
                        class343.method2185("wm3 failed", -92);
                        return;
                    }
                    class343.method2185("wm3 succeeded", -127);
                    return;
                }
                if (arg1.equalsIgnoreCase("tk0")) {
                    class388.method2394(25, 0);
                    if (class169.field2624 != 0) {
                        class343.method2185("Failed to enter tk0", -98);
                        return;
                    }
                    class343.method2185("Entered tk0", -110);
                    class443.field6623.field604 = 0;
                    class443.field6623.method2844(class368.field5553, 25133);
                    class72.field1247 = false;
                    return;
                }
                if (arg1.equalsIgnoreCase("tk1")) {
                    class388.method2394(25, 1);
                    if (~class169.field2624 != -2) {
                        class343.method2185("Failed to enter tk1", -76);
                        return;
                    }
                    class343.method2185("Entered tk1", -127);
                    class443.field6623.field604 = 1;
                    class443.field6623.method2844(class368.field5553, 25133);
                    class72.field1247 = false;
                    return;
                }
                if (arg1.equalsIgnoreCase("tk2")) {
                    class388.method2394(25, 2);
                    if (~class169.field2624 == -3) {
                        class343.method2185("Entered tk2", -102);
                        class443.field6623.field604 = 2;
                        class443.field6623.method2844(class368.field5553, 25133);
                        class72.field1247 = false;
                        return;
                    }
                    class343.method2185("Failed to enter tk2", -50);
                    return;
                }
                if (arg1.equalsIgnoreCase("tk3")) {
                    class388.method2394(25, 3);
                    if (~class169.field2624 != -4) {
                        class343.method2185("Failed to enter tk3", -121);
                        return;
                    }
                    class343.method2185("Entered tk3", -117);
                    return;
                }
                if (arg1.equalsIgnoreCase("ot")) {
                    class443.field6623.field632 = !class443.field6623.field632;
                    class443.field6623.method2844(class368.field5553, 25133);
                    class72.field1247 = false;
                    class347.method2206(-67);
                    class343.method2185("ot=" + class443.field6623.field632, -61);
                    return;
                }
                if (arg1.equalsIgnoreCase("gb")) {
                    class443.field6623.field596 = !class443.field6623.field596;
                    class443.field6623.method2844(class368.field5553, 25133);
                    class72.field1247 = false;
                    class347.method2206(-87);
                    class343.method2185("gb=" + class443.field6623.field596, -57);
                    return;
                }
                if (arg1.startsWith("shadows")) {
                    if (arg1.length() < 8) {
                        class343.method2185("Invalid shadows value", -69);
                        return;
                    }
                    String var11 = arg1.substring(8);
                    int var12 = class259.method1675((byte) 4, var11) ? class463.method2758(-88, var11) : -1;
                    if (var12 >= 0 && var12 <= 2) {
                        class443.field6623.method334((byte) 126, var12, class169.field2624);
                        class443.field6623.method2844(class368.field5553, 25133);
                        class72.field1247 = false;
                        class347.method2206(-108);
                        class343.method2185("shadows=" + var12, -31);
                        return;
                    }
                    class343.method2185("Invalid shadows value", -117);
                    return;
                }
                if (arg1.startsWith("textures")) {
                    class443.field6623.field616 = !class443.field6623.field616;
                    class443.field6623.method2844(class368.field5553, 25133);
                    class72.field1247 = false;
                    class497.method2981(30);
                    class347.method2206(-55);
                    class343.method2185("textures=" + class443.field6623.field616, -107);
                    return;
                }
                if (arg1.startsWith("setba")) {
                    if (~arg1.length() > -7) {
                        class343.method2185("Invalid buildarea value", -74);
                        return;
                    }
                    int var13 = class463.method2758(-80, arg1.substring(6));
                    if (~var13 <= -1 && ~class87.method684(class457.field6854, 99) <= ~var13) {
                        class443.field6623.field615 = var13;
                        class443.field6623.method2844(class368.field5553, 25133);
                        class72.field1247 = false;
                        class343.method2185("maxbuildarea=" + class443.field6623.field615, -122);
                        return;
                    }
                    class343.method2185("Invalid buildarea value", -40);
                    return;
                }
                if (arg1.startsWith("setparticles")) {
                    if (~arg1.length() > -14) {
                        class343.method2185("Invalid particles value", -103);
                        return;
                    }
                    class156.method1174(93, class463.method2758(-114, arg1.substring(13)));
                    class443.field6623.method2844(class368.field5553, 25133);
                    class72.field1247 = false;
                    class343.method2185("particles=" + class389.method2398(1006), -84);
                    return;
                }
                if (arg1.startsWith("rect_debug")) {
                    if (~arg1.length() > -11) {
                        class343.method2185("Invalid rect_debug value", -100);
                        return;
                    }
                    class506.field7461 = class463.method2758(-89, arg1.substring(10).trim());
                    class343.method2185("rect_debug=" + class506.field7461, -49);
                    return;
                }
                if (arg1.equalsIgnoreCase("qa_op_test")) {
                    class210.field3027 = true;
                    class343.method2185("qa_op_test=" + class210.field3027, -96);
                    return;
                }
                if (arg1.equalsIgnoreCase("clipcomponents")) {
                    class96.field1612 = !class96.field1612;
                    class343.method2185("clipcomponents=" + class96.field1612, -79);
                    return;
                }
                if (arg1.startsWith("bloom")) {
                    boolean var14 = class4.field109.method264();
                    if (class298.method1887((byte) 123, !var14)) {
                        if (!var14) {
                            class343.method2185("Bloom enabled", -111);
                            return;
                        }
                        class343.method2185("Bloom disabled", -57);
                        return;
                    }
                    class343.method2185("Failed to enable bloom", -36);
                    return;
                }
                if (arg1.equalsIgnoreCase("tween")) {
                    if (!class21.field428) {
                        class21.field428 = true;
                        class343.method2185("Forced tweening ENABLED!", -112);
                        return;
                    }
                    class21.field428 = false;
                    class343.method2185("Forced tweening disabled.", -57);
                    return;
                }
                if (arg1.equalsIgnoreCase("shiftclick")) {
                    if (!class420.field6277) {
                        class343.method2185("Shift-click ENABLED!", -127);
                        class420.field6277 = true;
                        return;
                    }
                    class343.method2185("Shift-click disabled.", -87);
                    class420.field6277 = false;
                    return;
                }
                if (arg1.equalsIgnoreCase("getcgcoord")) {
                    class343.method2185("x:" + (class139.field2224.field6228 >> 7) + " z:" + (class139.field2224.field6233 >> 7), -74);
                    return;
                }
                if (arg1.equalsIgnoreCase("getheight")) {
                    class343.method2185("Height: " + class88.field1546[class139.field2224.field6232].method376(class139.field2224.field6228 >> 7, class139.field2224.field6233 >> 7), -111);
                    return;
                }
                if (arg1.equalsIgnoreCase("resetminimap")) {
                    class151.field2407.method121((byte) -38);
                    class151.field2407.method132((byte) -1);
                    class397.field5996.method1189(34);
                    class160.field2479.method1810(123);
                    class427.method2563((byte) -64);
                    class343.method2185("Minimap reset", -36);
                    return;
                }
                if (arg1.startsWith("mc")) {
                    if (class4.field109.method299()) {
                        int var15 = Integer.parseInt(arg1.substring(3));
                        if (var15 < 1) {
                            var15 = 1;
                        } else if (var15 > 4) {
                            var15 = 4;
                        }
                        class406.field6097 = var15;
                        class4.field109.method256(class406.field6097);
                        class4.field109.method277(0);
                        class343.method2185("Render cores now: " + class406.field6097, -109);
                        return;
                    }
                    class343.method2185("Current toolkit doesn't support multiple cores", -43);
                    return;
                }
                if (arg1.startsWith("cachespace")) {
                    class343.method2185("I(s): " + class272.field3928.method490(true) + "/" + class272.field3928.method487(false), -46);
                    class343.method2185("I(m): " + class283.field4047.method490(true) + "/" + class283.field4047.method487(false), -81);
                    class343.method2185("O(s): " + class367.field5550.field2818.method3115(true) + "/" + class367.field5550.field2818.method3122(true), -122);
                    return;
                }
                if (arg1.equalsIgnoreCase("getcamerapos")) {
                    class343.method2185("Pos: " + class139.field2224.field6232 + "," + ((class40.field732 >> 7) + class200.field2931 >> 6) + "," + ((class405.field6075 >> 7) + class403.field6059 >> 6) + "," + (63 & (class40.field732 >> 7) - -class200.field2931) + "," + (63 & (class405.field6075 >> 7) + class403.field6059) + " Height: " + (class343.method2188(class139.field2224.field6232, class40.field732, (byte) -102, class405.field6075) + -class222.field3184), -37);
                    class343.method2185("Look: " + class139.field2224.field6232 + "," + (class420.field6283 + class200.field2931 >> 6) + "," + (class403.field6059 + class184.field2758 >> 6) + "," + (63 & class420.field6283 + class200.field2931) + "," + (63 & class403.field6059 + class184.field2758) + " Height: " + (class343.method2188(class139.field2224.field6232, class420.field6283, (byte) -102, class184.field2758) + -class152.field2416), -116);
                    return;
                }
                if (arg1.equals("showocc")) {
                    class118.field1945 = !class118.field1945;
                    class347.method2206(-96);
                    class343.method2185("showocc=" + class118.field1945, -62);
                    return;
                }
                if (arg1.equals("wallocc")) {
                    class343.field5161 = !class343.field5161;
                    class347.method2206(-107);
                    class343.method2185("forcewallocc=" + class343.field5161, -69);
                    return;
                }
                if (arg1.equals("renderprofile") || arg1.equals("rp")) {
                    class158.field2468 = !class158.field2468;
                    class4.field109.method211(class158.field2468);
                    class69.method568((byte) 68);
                    class343.method2185("showprofiling=" + class158.field2468, -125);
                    return;
                }
                if (arg1.equals("performancetest")) {
                    class343.method2185("Java toolkit: " + class304.method1995(-1, class368.field5553, 0), -101);
                    class343.method2185("GL toolkit:   " + class304.method1995(-1, class368.field5553, 1), -77);
                    class343.method2185("SSE toolkit:  " + class304.method1995(-1, class368.field5553, 2), -119);
                    return;
                }
                if (arg1.equals("nonpcs")) {
                    class267.field3844 = !class267.field3844;
                    class343.method2185("nonpcs=" + class267.field3844, -86);
                    return;
                }
                if (arg1.equals("autoworld")) {
                    class435.method2594(false);
                    class343.method2185("auto world selected", -73);
                    return;
                }
                if (arg1.startsWith("pc")) {
                    class28.method321(class180.field2728, -5001);
                    class410.field6141.method1109(!arg0, 0);
                    int var16 = class410.field6141.field2289;
                    int var17 = arg1.indexOf(" ", 4);
                    class410.field6141.method1089((byte) -89, arg1.substring(3, var17));
                    class304.method1993(arg1.substring(var17), -122, class410.field6141);
                    class410.field6141.method1110(class410.field6141.field2289 - var16, !arg0);
                    return;
                }
                if (arg1.equals("heap")) {
                    class343.method2185("Heap: " + class457.field6854 + "MB", -61);
                    return;
                }
                if (arg1.equals("savevarcs")) {
                    class33.method349(arg0);
                    class343.method2185("perm varcs saved", -124);
                    return;
                }
                if (arg1.equals("scramblevarcs")) {
                    for (int var18 = 0; ~class170.field2629.length < ~var18; ++var18) {
                        if (class255.field3672[var18]) {
                            class170.field2629[var18] = (int) (Math.random() * 99999.0D);
                            if (Math.random() > 0.5D) {
                                class170.field2629[var18] *= -1;
                            }
                        }
                    }
                    class33.method349(true);
                    class343.method2185("perm varcs scrambled", -93);
                    return;
                }
                if (arg1.equals("showcolmap")) {
                    class245.field3528 = true;
                    class427.method2563((byte) -64);
                    class343.method2185("colmap is shown", -64);
                    return;
                }
                if (arg1.equals("hidecolmap")) {
                    class245.field3528 = false;
                    class427.method2563((byte) -64);
                    class343.method2185("colmap is hidden", -38);
                    return;
                }
                if (arg1.equals("resetcache")) {
                    class385.method2384((byte) -107);
                    class343.method2185("Caches reset", -122);
                    return;
                }
                if (arg1.equals("profilecpu")) {
                    class343.method2185(class308.method2018(!arg0) + "ms", -105);
                    return;
                }
                if (arg1.startsWith("cpuusage")) {
                    int var19 = Integer.parseInt(arg1.substring(9));
                    if (~var19 <= -1 && ~var19 >= -5) {
                        class443.field6623.field626 = var19;
                    }
                    class343.method2185("cpuusage=" + class443.field6623.field626, -109);
                    return;
                }
                if (arg1.startsWith("getclientvarpbit")) {
                    int var20 = Integer.parseInt(arg1.substring(17));
                    class343.method2185("varpbit=" + class335.field5059.method981(-115, var20), -100);
                    return;
                }
                if (arg1.startsWith("getclientvarp")) {
                    int var21 = Integer.parseInt(arg1.substring(14));
                    class343.method2185("varp=" + class335.field5059.method980(var21, 17281), -89);
                    return;
                }
                if (arg1.startsWith("csprofileclear")) {
                    class437.method2615();
                    return;
                }
                if (arg1.startsWith("csprofileoutputc")) {
                    class437.method2603(100, false);
                    return;
                }
                if (arg1.startsWith("csprofileoutputt")) {
                    class437.method2603(10, true);
                    return;
                }
                if (arg1.startsWith("texsize")) {
                    int var22 = Integer.parseInt(arg1.substring(8));
                    class4.field109.method245(var22);
                    return;
                }
                if (arg1.equals("soundstreamcount")) {
                    class343.method2185("Active streams: " + class45.field837.method2036(), -49);
                    return;
                }
                if (class281.field4023 == 30) {
                    ++class56.field976;
                    class28.method321(class100.field1642, -5001);
                    class410.field6141.method1109(false, arg1.length() - -2);
                    class410.field6141.method1109(false, !arg2 ? 0 : 1);
                    class410.field6141.method1089((byte) -89, arg1);
                }
                if (arg1.startsWith("fps ") && class446.field6661 != class423.field6322) {
                    class163.method1208(class463.method2758(-98, arg1.substring(4)), 85);
                    return;
                }
                if (class281.field4023 != 30) {
                    class343.method2185("Unrecogonised commmand when not logged in: " + arg1, -117);
                }
            } catch (Exception var24) {
                class343.method2185("Whoops, something went wrong.", -35);
            }
        }
        if (!arg0) {
            field5611 = null;
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(BI)I", line = 793)
    public static final int method2318(byte arg0, int arg1) {
        ++field5602;
        if (arg0 != -89) {
            field5603 = null;
        }
        if (~arg1 == -6407) {
            return 1;
        } else if (~arg1 != -6410) {
            if (~arg1 == -32842) {
                return 1;
            } else if (arg1 != 6410) {
                if (arg1 == 6407) {
                    return 3;
                } else if (~arg1 == -6409) {
                    return 4;
                } else {
                    throw new IllegalArgumentException("");
                }
            } else {
                return 2;
            }
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(B)I", line = 832)
    public final int method467(byte arg0) {
        if (arg0 != -46) {
            method2319(19);
        }
        ++field5607;
        return this.field5600;
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(I)V", line = 846)
    public static void method2319(int arg0) {
        field5603 = null;
        field5610 = null;
        field5605 = null;
        field5611 = null;
        if (arg0 != 2) {
            field5603 = null;
        }
        field5609 = null;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(II[BI)V", line = 862)
    public final void method466(int arg0, int arg1, byte[] arg2, int arg3) {
        ++field5604;
        if (arg1 == 19971) {
            this.method1557(arg2, arg3);
            this.field5600 = arg0;
        }
    }
}
