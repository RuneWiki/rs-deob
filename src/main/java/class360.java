import jagex3.jagmisc.jagmisc;
import java.io.InputStream;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class360 extends InputStream {

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "I")
    public static int field5522;

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "I")
    public static int field5523;

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "I")
    public static int field5524;

    @OriginalMember(owner = "client!jq", name = "d", descriptor = "I")
    public static int field5525;

    @OriginalMember(owner = "client!jq", name = "f", descriptor = "I")
    public static int field5527;

    @OriginalMember(owner = "client!jq", name = "g", descriptor = "I")
    public static int field5528;

    @OriginalMember(owner = "client!jq", name = "h", descriptor = "I")
    public static int field5529;

    @OriginalMember(owner = "client!jq", name = "e", descriptor = "Lov;")
    public static class125 field5526;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Z)V", line = 3)
    public static void method2298(boolean arg0) {
        field5526 = null;
        if (arg0) {
            method2301(-84, null);
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(ZLjava/lang/String;ZB)V", line = 20)
    public static final void method2299(boolean arg0, String arg1, boolean arg2, byte arg3) {
        field5529++;
        if (class476.field7072 != class116.field1601 || class257.field3562 >= 2) {
            if (arg1.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg1.equals("nativememerror")) {
                throw new OutOfMemoryError("native(MPR");
            }
            try {
                if (arg1.equalsIgnoreCase("fpson")) {
                    class32.field469 = true;
                    class230.method1548("fps debug enabled", arg3 - 234);
                    return;
                }
                if (arg1.equalsIgnoreCase("fpsoff")) {
                    class32.field469 = false;
                    class230.method1548("fps debug disabled", -37);
                    return;
                }
                if (arg1.equals("systemmem")) {
                    try {
                        class230.method1548("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb", arg3 + 5);
                        return;
                    } catch (Throwable var27) {
                        return;
                    }
                }
                if (arg1.equalsIgnoreCase("cls")) {
                    class251.field3496 = 0;
                    class518.field7621 = 0;
                    return;
                }
                if (arg1.equalsIgnoreCase("cleartext")) {
                    class145.field1931.method3046(121);
                    class230.method1548("Text coords cleared", -125);
                    return;
                }
                if (arg1.equalsIgnoreCase("gc")) {
                    class18.method181(123);
                    for (int var4 = 0; var4 < 10; var4++) {
                        System.gc();
                    }
                    Runtime var5 = Runtime.getRuntime();
                    int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
                    class230.method1548("mem=" + var6 + "k", -67);
                    return;
                }
                if (arg1.equalsIgnoreCase("compact")) {
                    class18.method181(123);
                    for (int var7 = 0; var7 < 10; var7++) {
                        System.gc();
                    }
                    Runtime var8 = Runtime.getRuntime();
                    int var9 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
                    class230.method1548("Memory before cleanup=" + var9 + "k", arg3 ^ 0xFFFFFFDA);
                    class432.method2637((byte) 61);
                    class18.method181(127);
                    for (int var10 = 0; var10 < 10; var10++) {
                        System.gc();
                    }
                    int var11 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
                    class230.method1548("Memory after cleanup=" + var11 + "k", 121);
                    return;
                }
                if (arg1.equalsIgnoreCase("pcachesize")) {
                    class230.method1548("Number of player models in cache:" + class279.method1790(-114), -37);
                    return;
                }
                if (arg1.equalsIgnoreCase("clientdrop")) {
                    class230.method1548("Dropped client connection", arg3 - 149);
                    if (class435.field6596 == 9) {
                        class300.method1905(0);
                    } else if (class435.field6596 == 10) {
                        class458.field6861 = true;
                        return;
                    }
                    return;
                }
                if (arg1.equalsIgnoreCase("clientjs5drop")) {
                    class13.field258.method900(-1);
                    class230.method1548("Dropped client js5 net queue", arg3 - 3);
                    return;
                }
                if (arg1.equalsIgnoreCase("serverjs5drop")) {
                    class13.field258.method897((byte) 9);
                    class230.method1548("Dropped server js5 net queue", 127);
                    return;
                }
                if (arg1.equalsIgnoreCase("breakcon")) {
                    class312.field4572.method2993(30734);
                    class374.field5695.method1935(1452);
                    class13.field258.method896((byte) 125);
                    class230.method1548("Breaking new connections for 5 seconds", -113);
                    return;
                }
                if (arg1.equalsIgnoreCase("rebuild")) {
                    class22.method205(-120);
                    class361.method2303((byte) -4);
                    class230.method1548("Rebuilding map", 118);
                    return;
                }
                if (arg1.equalsIgnoreCase("wm1")) {
                    class310.method1945(-1, 1, -1, 0, false);
                    if (class325.method2014((byte) 74) == 1) {
                        class230.method1548("wm1 succeeded", arg3 ^ 0x1);
                        return;
                    }
                    class230.method1548("wm1 failed", 121);
                    return;
                }
                if (arg1.equalsIgnoreCase("wm2")) {
                    class310.method1945(-1, 2, -1, 0, false);
                    if (class325.method2014((byte) 116) != 2) {
                        class230.method1548("wm2 failed", 123);
                        return;
                    }
                    class230.method1548("wm2 succeeded", arg3 - 213);
                    return;
                }
                if (arg1.equalsIgnoreCase("wm3")) {
                    class310.method1945(1024, 3, 768, 0, false);
                    if (class325.method2014((byte) 54) == 3) {
                        class230.method1548("wm3 succeeded", -104);
                        return;
                    }
                    class230.method1548("wm3 failed", arg3 ^ 0xFFFFFFC9);
                    return;
                }
                if (arg1.equalsIgnoreCase("tk0")) {
                    class170.method1152(-58, 0);
                    if (class378.field5771 == 0) {
                        class230.method1548("Entered tk0", 110);
                        class203.field2716.field1177 = 0;
                        class203.field2716.method20(class312.field4572, arg3 ^ 0x74);
                        class502.field7416 = false;
                        return;
                    }
                    class230.method1548("Failed to enter tk0", 120);
                    return;
                }
                if (arg1.equalsIgnoreCase("tk1")) {
                    class170.method1152(-85, 1);
                    if (class378.field5771 != 1) {
                        class230.method1548("Failed to enter tk1", 115);
                        return;
                    }
                    class230.method1548("Entered tk1", 110);
                    class203.field2716.field1177 = 1;
                    class203.field2716.method20(class312.field4572, 1);
                    class502.field7416 = false;
                    return;
                }
                if (arg1.equalsIgnoreCase("tk2")) {
                    class170.method1152(102, 2);
                    if (class378.field5771 != 2) {
                        class230.method1548("Failed to enter tk2", -18);
                        return;
                    }
                    class230.method1548("Entered tk2", 113);
                    class203.field2716.field1177 = 2;
                    class203.field2716.method20(class312.field4572, 1);
                    class502.field7416 = false;
                    return;
                }
                if (arg1.equalsIgnoreCase("tk3")) {
                    class170.method1152(116, 3);
                    if (class378.field5771 == 3) {
                        class230.method1548("Entered tk3", -62);
                        return;
                    }
                    class230.method1548("Failed to enter tk3", 116);
                    return;
                }
                if (arg1.equalsIgnoreCase("ot")) {
                    class203.field2716.field1159 = !class203.field2716.field1159;
                    class203.field2716.method20(class312.field4572, 1);
                    class502.field7416 = false;
                    class22.method205(-117);
                    class230.method1548("ot=" + class203.field2716.field1159, 125);
                    return;
                }
                if (arg1.equalsIgnoreCase("gb")) {
                    class203.field2716.field1151 = !class203.field2716.field1151;
                    class203.field2716.method20(class312.field4572, 1);
                    class502.field7416 = false;
                    class22.method205(-32);
                    class230.method1548("gb=" + class203.field2716.field1151, 116);
                    return;
                }
                if (arg1.startsWith("shadows")) {
                    if (arg1.length() < 8) {
                        class230.method1548("Invalid shadows value", -25);
                        return;
                    }
                    String var12 = arg1.substring(8);
                    int var13 = class32.method273(var12, 99) ? class370.method2349(arg3 - 107, var12) : -1;
                    if (var13 >= 0 && var13 <= 2) {
                        class203.field2716.method547(class378.field5771, var13, 107);
                        class203.field2716.method20(class312.field4572, 1);
                        class502.field7416 = false;
                        class22.method205(arg3 - 174);
                        class230.method1548("shadows=" + var13, -64);
                        return;
                    }
                    class230.method1548("Invalid shadows value", 114);
                    return;
                }
                if (arg1.startsWith("textures")) {
                    class203.field2716.field1181 = !class203.field2716.field1181;
                    class203.field2716.method20(class312.field4572, 1);
                    class502.field7416 = false;
                    class201.method1360(false);
                    class22.method205(arg3 ^ 0xFFFFFFD5);
                    class230.method1548("textures=" + class203.field2716.field1181, -106);
                    return;
                }
                if (arg1.startsWith("setba")) {
                    if (arg1.length() < 6) {
                        class230.method1548("Invalid buildarea value", 117);
                        return;
                    }
                    int var14 = class370.method2349(10, arg1.substring(6));
                    if (var14 >= 0 && var14 <= class321.method2001(-10744, class230.field3289)) {
                        class203.field2716.field1175 = var14;
                        class203.field2716.method20(class312.field4572, arg3 ^ 0x74);
                        class502.field7416 = false;
                        class230.method1548("maxbuildarea=" + class203.field2716.field1175, -14);
                        return;
                    }
                    class230.method1548("Invalid buildarea value", -128);
                    return;
                }
                if (arg1.startsWith("setparticles")) {
                    if (arg1.length() < 13) {
                        class230.method1548("Invalid particles value", arg3 ^ 0xFFFFFFF8);
                        return;
                    }
                    class189.method1260((byte) 18, class370.method2349(10, arg1.substring(13)));
                    class203.field2716.method20(class312.field4572, 1);
                    class502.field7416 = false;
                    class230.method1548("particles=" + class294.method1880(arg3 ^ 0xFFFFDCF4), 118);
                    return;
                }
                if (arg1.startsWith("rect_debug")) {
                    if (arg1.length() < 10) {
                        class230.method1548("Invalid rect_debug value", arg3 + 7);
                        return;
                    }
                    class486.field7200 = class370.method2349(arg3 - 107, arg1.substring(10).trim());
                    class230.method1548("rect_debug=" + class486.field7200, 109);
                    return;
                }
                if (arg1.equalsIgnoreCase("qa_op_test")) {
                    class215.field3038 = true;
                    class230.method1548("qa_op_test=" + class215.field3038, -20);
                    return;
                }
                if (arg1.equalsIgnoreCase("clipcomponents")) {
                    class465.field6938 = !class465.field6938;
                    class230.method1548("clipcomponents=" + class465.field6938, 113);
                    return;
                }
                if (arg1.startsWith("bloom")) {
                    boolean var15 = class400.field6090.method823();
                    if (class45.method352(102, !var15)) {
                        if (var15) {
                            class230.method1548("Bloom disabled", 117);
                            return;
                        }
                        class230.method1548("Bloom enabled", arg3 - 231);
                        return;
                    }
                    class230.method1548("Failed to enable bloom", 113);
                    return;
                }
                if (arg1.equalsIgnoreCase("tween")) {
                    if (!class275.field3867) {
                        class275.field3867 = true;
                        class230.method1548("Forced tweening ENABLED!", 119);
                        return;
                    }
                    class275.field3867 = false;
                    class230.method1548("Forced tweening disabled.", -33);
                    return;
                }
                if (arg1.equalsIgnoreCase("shiftclick")) {
                    if (class147.field1952) {
                        class230.method1548("Shift-click disabled.", 123);
                        class147.field1952 = false;
                        return;
                    }
                    class230.method1548("Shift-click ENABLED!", arg3 + 10);
                    class147.field1952 = true;
                    return;
                }
                if (arg1.equalsIgnoreCase("getcgcoord")) {
                    class230.method1548("x:" + (class56.field800.field1867 >> 7) + " z:" + (class56.field800.field1862 >> 7), arg3 ^ 0xFFFFFFD4);
                    return;
                }
                if (arg1.equalsIgnoreCase("getheight")) {
                    class230.method1548("Height: " + class306.field4447[class56.field800.field1866].method222(class56.field800.field1867 >> 7, class56.field800.field1862 >> 7), -95);
                    return;
                }
                if (arg1.equalsIgnoreCase("resetminimap")) {
                    class266.field3709.method1276(0);
                    class266.field3709.method1269(105);
                    class244.field3413.method975((byte) 56);
                    class509.field7484.method1847(false);
                    class361.method2303((byte) -4);
                    class230.method1548("Minimap reset", 114);
                    return;
                }
                if (arg1.startsWith("mc")) {
                    if (!class400.field6090.method838()) {
                        class230.method1548("Current toolkit doesn't support multiple cores", arg3 ^ 0x19);
                        return;
                    }
                    int var16 = Integer.parseInt(arg1.substring(3));
                    if (var16 < 1) {
                        var16 = 1;
                    } else if (var16 > 4) {
                        var16 = 4;
                    }
                    class315.field4586 = var16;
                    class400.field6090.method780(class315.field4586);
                    class400.field6090.method740(0);
                    class230.method1548("Render cores now: " + class315.field4586, -102);
                    return;
                }
                if (arg1.startsWith("cachespace")) {
                    class230.method1548("I(s): " + class70.field975.method2129(arg3 + 9964) + "/" + class70.field975.method2136(arg3 ^ 0x75), -123);
                    class230.method1548("I(m): " + class81.field1184.method2129(10081) + "/" + class81.field1184.method2136(0), 112);
                    class230.method1548("O(s): " + class103.field1489.field3435.method1953(2) + "/" + class103.field1489.field3435.method1941(-25163), 122);
                    return;
                }
                if (arg1.equalsIgnoreCase("getcamerapos")) {
                    class230.method1548("Pos: " + class56.field800.field1866 + "," + ((class199.field2646 >> 7) + class331.field5162 >> 6) + "," + ((class140.field1869 >> 7) + class328.field5099 >> 6) + "," + ((class199.field2646 >> 7) + class331.field5162 & 0x3F) + "," + ((class140.field1869 >> 7) + class328.field5099 & 0x3F) + " Height: " + (class352.method2264(-110, class56.field800.field1866, class140.field1869, class199.field2646) - class26.field384), -30);
                    class230.method1548("Look: " + class56.field800.field1866 + "," + (field5524 + class331.field5162 >> 6) + "," + (class503.field7423 + class328.field5099 >> 6) + "," + (field5524 + class331.field5162 & 0x3F) + "," + (class503.field7423 + class328.field5099 & 0x3F) + " Height: " + (class352.method2264(-109, class56.field800.field1866, class503.field7423, field5524) - class354.field5477), -52);
                    return;
                }
                if (arg1.equals("showocc")) {
                    class269.field3741 = !class269.field3741;
                    class22.method205(arg3 - 209);
                    class230.method1548("showocc=" + class269.field3741, -92);
                    return;
                }
                if (arg1.equals("wallocc")) {
                    class225.field3115 = !class225.field3115;
                    class22.method205(-29);
                    class230.method1548("forcewallocc=" + class225.field3115, -71);
                    return;
                }
                if (arg1.equals("renderprofile") || arg1.equals("rp")) {
                    class14.field265 = !class14.field265;
                    class400.field6090.method843(class14.field265);
                    class295.method1883(0);
                    class230.method1548("showprofiling=" + class14.field265, -45);
                    return;
                }
                if (arg1.equals("performancetest")) {
                    class230.method1548("Java toolkit: " + class359.method2297(0, 992, class312.field4572), arg3 + 3);
                    class230.method1548("GL toolkit:   " + class359.method2297(1, 992, class312.field4572), 123);
                    class230.method1548("SSE toolkit:  " + class359.method2297(2, 992, class312.field4572), arg3 ^ 0x4);
                    return;
                }
                if (arg1.equals("nonpcs")) {
                    class429.field6521 = !class429.field6521;
                    class230.method1548("nonpcs=" + class429.field6521, -93);
                    return;
                }
                if (arg1.equals("autoworld")) {
                    class459.method2783(-4185);
                    class230.method1548("auto world selected", 119);
                    return;
                }
                if (arg1.startsWith("switchworld")) {
                    int var17 = Integer.parseInt(arg1.substring(12));
                    class289.method1852(class516.method3081(var17, -1).field6257, 93, var17);
                    class230.method1548("switched", -19);
                    return;
                }
                if (arg1.equals("getworld")) {
                    class230.method1548("w: " + class139.field1851.field2602, 112);
                    return;
                }
                if (arg1.startsWith("pc")) {
                    class424.method2582(class26.field378, -1);
                    class538.field7879.method1072((byte) 102, 0);
                    int var18 = class538.field7879.field2185;
                    int var19 = arg1.indexOf(" ", 4);
                    class538.field7879.method1071(-25643, arg1.substring(3, var19));
                    class146.method967(arg1.substring(var19), class538.field7879, 35);
                    class538.field7879.method1082(-32769, class538.field7879.field2185 - var18);
                    return;
                }
                if (arg1.equals("heap")) {
                    class230.method1548("Heap: " + class230.field3289 + "MB", arg3 ^ 0x4);
                    return;
                }
                if (arg1.equals("savevarcs")) {
                    class141.method943(0);
                    class230.method1548("perm varcs saved", -102);
                    return;
                }
                if (arg1.equals("scramblevarcs")) {
                    for (int var20 = 0; var20 < class331.field5170.length; var20++) {
                        if (class534.field7852[var20]) {
                            class331.field5170[var20] = (int) (Math.random() * 99999.0D);
                            if (Math.random() > 0.5D) {
                                class331.field5170[var20] *= -1;
                            }
                        }
                    }
                    class141.method943(0);
                    class230.method1548("perm varcs scrambled", 112);
                    return;
                }
                if (arg1.equals("showcolmap")) {
                    class353.field5456 = true;
                    class361.method2303((byte) -4);
                    class230.method1548("colmap is shown", 121);
                    return;
                }
                if (arg1.equals("hidecolmap")) {
                    class353.field5456 = false;
                    class361.method2303((byte) -4);
                    class230.method1548("colmap is hidden", -14);
                    return;
                }
                if (arg1.equals("resetcache")) {
                    class475.method2833(0);
                    class230.method1548("Caches reset", arg3 ^ 0xFFFFFFD0);
                    return;
                }
                if (arg1.equals("profilecpu")) {
                    class230.method1548(class211.method1456((byte) -26) + "ms", 121);
                    return;
                }
                if (arg1.startsWith("cpuusage")) {
                    int var21 = Integer.parseInt(arg1.substring(9));
                    if (var21 >= 0 && var21 <= 4) {
                        class203.field2716.field1170 = var21;
                    }
                    class230.method1548("cpuusage=" + class203.field2716.field1170, 124);
                    return;
                }
                if (arg1.startsWith("getclientvarpbit")) {
                    int var22 = Integer.parseInt(arg1.substring(17));
                    class230.method1548("varpbit=" + class288.field4208.method571(var22, -7128), 117);
                    return;
                }
                if (arg1.startsWith("getclientvarp")) {
                    int var23 = Integer.parseInt(arg1.substring(14));
                    class230.method1548("varp=" + class288.field4208.method574(var23, (byte) -124), arg3 - 9);
                    return;
                }
                if (arg1.startsWith("demologin")) {
                    class359.method2295(false, (byte) -62, 0);
                    return;
                }
                if (arg1.startsWith("newdemologin")) {
                    class359.method2295(true, (byte) -62, 0);
                    return;
                }
                if (arg1.startsWith("directlogin")) {
                    String[] var24 = class61.method437(arg1.substring(12), ' ', 243);
                    if (var24.length >= 2) {
                        int var25 = var24.length <= 2 ? 0 : Integer.parseInt(var24[2]);
                        class301.method1911(var24[0], 2, var25, var24[1]);
                        return;
                    }
                }
                if (arg1.startsWith("csprofileclear")) {
                    class343.method2216();
                    return;
                }
                if (arg1.startsWith("csprofileoutputc")) {
                    class343.method2215(100, false);
                    return;
                }
                if (arg1.startsWith("csprofileoutputt")) {
                    class343.method2215(10, true);
                    return;
                }
                if (arg1.startsWith("texsize")) {
                    int var26 = Integer.parseInt(arg1.substring(8));
                    class400.field6090.method794(var26);
                    return;
                }
                if (arg1.equals("soundstreamcount")) {
                    class230.method1548("Active streams: " + class31.field463.method880(), 119);
                    return;
                }
                if (arg1.equals("errormessage")) {
                    class230.method1548(class168.field2261.method1350(arg3 ^ 0x55), -89);
                    return;
                }
                if (class435.field6596 == 9) {
                    class32.field467++;
                    class424.method2582(class532.field7827, arg3 - 118);
                    class538.field7879.method1072((byte) 102, arg1.length() + 3);
                    class538.field7879.method1072((byte) 102, arg0 ? 1 : 0);
                    class538.field7879.method1072((byte) 102, arg2 ? 1 : 0);
                    class538.field7879.method1071(-25643, arg1);
                }
                if (arg1.startsWith("fps ") && class476.field7072 != class116.field1601) {
                    class439.method2660(class370.method2349(10, arg1.substring(4)), arg3 + 883);
                    return;
                }
                if (class435.field6596 != 9) {
                    class230.method1548("Unrecogonised commmand when not logged in: " + arg1, -48);
                }
            } catch (Exception var28) {
                class230.method1548("Whoops, something went wrong.", -67);
            }
        }
        if (arg3 != 117) {
            field5526 = null;
        }
    }

    @OriginalMember(owner = "client!jq", name = "read", descriptor = "()I", line = 818)
    public final int read() {
        class388.method2433(30000L, -69);
        field5527++;
        return -1;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(BJ)Ljava/lang/String;", line = 828)
    public static final String method2300(byte arg0, long arg1) {
        class229.field3263.setTime(new Date(arg1));
        field5528++;
        int var3 = class229.field3263.get(7);
        int var4 = class229.field3263.get(5);
        if (arg0 <= 59) {
            method2300((byte) 62, -86L);
        }
        int var5 = class229.field3263.get(2);
        int var6 = class229.field3263.get(1);
        int var7 = class229.field3263.get(11);
        int var8 = class229.field3263.get(12);
        int var9 = class229.field3263.get(13);
        return class511.field7510[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class535.field7864[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(ILga;)Lga;", line = 856)
    public static final class282 method2301(int arg0, class282 arg1) {
        field5525++;
        if (arg0 > -46) {
            field5524 = -14;
        }
        class282 var2 = client.method1342(arg1);
        if (var2 == null) {
            var2 = arg1.field4016;
        }
        return var2;
    }
}
