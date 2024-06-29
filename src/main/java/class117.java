import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class117 extends class436 implements class237 {

    @OriginalMember(owner = "client!er", name = "cb", descriptor = "Z")
    private boolean field2149;

    @OriginalMember(owner = "client!er", name = "P", descriptor = "S")
    private short field2136;

    @OriginalMember(owner = "client!er", name = "lb", descriptor = "B")
    private byte field2158;

    @OriginalMember(owner = "client!er", name = "Q", descriptor = "Z")
    private boolean field2137;

    @OriginalMember(owner = "client!er", name = "S", descriptor = "Z")
    private boolean field2139;

    @OriginalMember(owner = "client!er", name = "K", descriptor = "Z")
    private boolean field2131;

    @OriginalMember(owner = "client!er", name = "db", descriptor = "Lr;")
    private class196 field2150;

    @OriginalMember(owner = "client!er", name = "W", descriptor = "Lka;")
    private class499 field2143;

    @OriginalMember(owner = "client!er", name = "H", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!er", name = "I", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!er", name = "J", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!er", name = "L", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!er", name = "M", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!er", name = "N", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!er", name = "O", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!er", name = "R", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!er", name = "T", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!er", name = "U", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!er", name = "V", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!er", name = "X", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!er", name = "Y", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!er", name = "Z", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!er", name = "ab", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!er", name = "eb", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!er", name = "fb", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!er", name = "hb", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!er", name = "ib", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!er", name = "jb", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!er", name = "kb", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!er", name = "gb", descriptor = "Lhu;")
    public static class143 field2153;

    @OriginalMember(owner = "client!er", name = "bb", descriptor = "Ldg;")
    private class435 field2148;

    @OriginalMember(owner = "client!er", name = "i", descriptor = "(I)Z")
    public final boolean method904(int arg0) {
        if (arg0 != 0) {
            this.field2149 = false;
        }
        ++field2133;
        return this.field2139;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ZLha;IZ)Lcb;")
    private final class548 method1031(boolean arg0, class66 arg1, int arg2, boolean arg3) {
        ++field2152;
        class445 var5 = class414.field5670.method2319(this.field2136 & 65535, arg3);
        if (arg3) {
            this.field2131 = true;
        }
        class296 var6;
        class296 var7;
        if (!this.field2137) {
            var6 = class142.field2418[super.field7404];
            if (~super.field7404 > -4) {
                var7 = class142.field2418[super.field7404 - -1];
            } else {
                var7 = null;
            }
        } else {
            var7 = class142.field2418[0];
            var6 = class178.field2805[super.field7404];
        }
        return var5.method2579(4, 22, super.field7398, arg2, arg0, arg1, super.field7405, this.field2158, var7, var6, (class326) null, super.field7396);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Lha;III)Z")
    public final boolean method908(class66 arg0, int arg1, int arg2, int arg3) {
        ++field2130;
        class499 var5 = this.method1038(arg2, arg0, (byte) 0);
        if (var5 != null) {
            class650 var6 = arg0.method533();
            var6.method1868(super.field7396, super.field7405, super.field7398);
            return !class507.field6967 ? var5.method290(arg1, arg3, var6, false, 0) : var5.method286(arg1, arg3, var6, false, 0, class90.field1369);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Z)I")
    public final int method1032(boolean arg0) {
        if (arg0) {
            this.field2131 = true;
        }
        ++field2142;
        return 65535 & this.field2136;
    }

    @OriginalMember(owner = "client!er", name = "c", descriptor = "(I)I")
    public final int method1033(int arg0) {
        ++field2145;
        if (arg0 >= -12) {
            this.field2131 = true;
        }
        return this.field2158;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(I)I")
    public final int method1034(int arg0) {
        ++field2151;
        return arg0 >= -125 ? 91 : 22;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Lha;Lcn;IIBZI)V")
    public final void method903(class66 arg0, class543 arg1, int arg2, int arg3, byte arg4, boolean arg5, int arg6) {
        ++field2157;
        if (arg1 instanceof class117) {
            class117 var8 = (class117) arg1;
            if (this.field2143 != null && var8.field2143 != null) {
                this.field2143.method281(var8.field2143, arg2, arg6, arg3, arg5);
            }
        }
        if (arg4 <= 41) {
            this.method910(true);
        }
    }

    @OriginalMember(owner = "client!er", name = "j", descriptor = "(I)Z")
    public final boolean method902(int arg0) {
        if (arg0 != 0) {
            this.field2148 = null;
        }
        ++field2129;
        if (this.field2143 == null) {
            return true;
        } else {
            return !this.field2143.method326();
        }
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(Lha;B)Ldg;")
    public final class435 method894(class66 arg0, byte arg1) {
        ++field2141;
        if (this.field2148 == null) {
            this.field2148 = class538.method3042(super.field7398, super.field7396, (byte) -47, this.method1038(0, arg0, (byte) 0), super.field7405);
        }
        if (arg1 >= -38) {
            field2153 = null;
        }
        return this.field2148;
    }

    @OriginalMember(owner = "client!er", name = "h", descriptor = "(I)I")
    public final int method900(int arg0) {
        ++field2135;
        if (arg0 != 0) {
            this.method904(-106);
        }
        return this.field2143 == null ? 0 : this.field2143.method298();
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(BLha;)Lhga;")
    public final class186 method898(byte arg0, class66 arg1) {
        ++field2134;
        if (this.field2143 == null) {
            return null;
        } else {
            if (arg0 < 123) {
                this.field2137 = true;
            }
            class650 var3 = arg1.method533();
            var3.method1868(super.field7396, super.field7405, super.field7398);
            class186 var4 = class174.method1320(1, this.field2149, 17832);
            if (!class507.field6967) {
                this.field2143.method301(var3, var4.field2877[0], 0);
            } else {
                this.field2143.method310(var3, var4.field2877[0], class90.field1369, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(BLha;)V")
    public final void method901(byte arg0, class66 arg1) {
        if (arg0 >= 114) {
            ++field2140;
        }
    }

    @OriginalMember(owner = "client!er", name = "g", descriptor = "(I)I")
    public final int method907(int arg0) {
        if (arg0 != -20425) {
            this.method902(115);
        }
        ++field2156;
        return this.field2143 == null ? 0 : this.field2143.method276();
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(BLjava/lang/String;ZZ)V")
    public static final void method1035(byte arg0, String arg1, boolean arg2, boolean arg3) {
        ++field2155;
        try {
            if (arg1.equalsIgnoreCase("commands") || arg1.equalsIgnoreCase("help")) {
                class652.method3663(57, "commands - This command");
                class652.method3663(-114, "cls - Clear console");
                class652.method3663(5, "displayfps - Toggle FPS and other information");
                class652.method3663(86, "renderer - Print graphics renderer information");
                class652.method3663(-110, "heap - Print java memory information");
                return;
            }
            if (arg1.equalsIgnoreCase("cls")) {
                class362.field4935 = 0;
                class476.field6433 = 0;
                return;
            }
            if (arg1.equalsIgnoreCase("displayfps")) {
                class236.field3391 = !class236.field3391;
                if (class236.field3391) {
                    class652.method3663(-106, "FPS on");
                    return;
                }
                class652.method3663(-126, "FPS off");
                return;
            }
            if (arg1.equals("renderer")) {
                class100 var4 = class95.field1472.method586();
                class652.method3663(-95, "Vendor: " + var4.field1620);
                class652.method3663(-115, "Name: " + var4.field1618);
                class652.method3663(-126, "Version: " + var4.field1624);
                class652.method3663(55, "Device: " + var4.field1623);
                class652.method3663(-111, "Driver Version: " + var4.field1619);
                return;
            }
            if (arg1.equals("heap")) {
                class652.method3663(107, "Heap: " + class455.field6207 + "MB");
                return;
            }
        } catch (Exception var47) {
            class652.method3663(3, class641.field8818.method3566((byte) -73, class464.field6309));
            return;
        }
        if (class556.field7850 != class517.field7028 || class407.field5593 >= 2) {
            if (arg1.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg1.equals("nativememerror")) {
                throw new OutOfMemoryError("native(MPR");
            }
            try {
                if (arg1.equalsIgnoreCase("printfps")) {
                    class652.method3663(-124, "FPS: " + class698.field9637);
                    return;
                }
                if (arg1.equalsIgnoreCase("occlude")) {
                    class378.field5160 = !class378.field5160;
                    if (!class378.field5160) {
                        class652.method3663(58, "Occlsion now off!");
                        return;
                    }
                    class652.method3663(21, "Occlsion now on!");
                    return;
                }
                if (arg1.equalsIgnoreCase("fpson")) {
                    class236.field3391 = true;
                    class652.method3663(-123, "fps debug enabled");
                    return;
                }
                if (arg1.equalsIgnoreCase("fpsoff")) {
                    class236.field3391 = false;
                    class652.method3663(20, "fps debug disabled");
                    return;
                }
                if (arg1.equals("systemmem")) {
                    try {
                        class652.method3663(-119, "System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + class682.field9503.field9139 + "Mb");
                        return;
                    } catch (Throwable var41) {
                        return;
                    }
                }
                if (arg1.equalsIgnoreCase("cleartext")) {
                    class236.field3389.method1598((byte) 47);
                    class652.method3663(16, "Text coords cleared");
                    return;
                }
                if (arg1.equalsIgnoreCase("gc")) {
                    class189.method1389(13534);
                    for (int var5 = 0; ~var5 > -11; ++var5) {
                        System.gc();
                    }
                    Runtime var6 = Runtime.getRuntime();
                    int var7 = (int) ((var6.totalMemory() + -var6.freeMemory()) / 1024L);
                    class652.method3663(-122, "mem=" + var7 + "k");
                    return;
                }
                if (arg1.equalsIgnoreCase("compact")) {
                    class189.method1389(13534);
                    for (int var8 = 0; var8 < 10; ++var8) {
                        System.gc();
                    }
                    Runtime var9 = Runtime.getRuntime();
                    int var10 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                    class652.method3663(101, "Memory before cleanup=" + var10 + "k");
                    class558.method3206(-67);
                    class189.method1389(13534);
                    for (int var11 = 0; var11 < 10; ++var11) {
                        System.gc();
                    }
                    int var12 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                    class652.method3663(-96, "Memory after cleanup=" + var12 + "k");
                    return;
                }
                if (arg1.equalsIgnoreCase("unloadnatives")) {
                    class652.method3663(78, class453.method2620(-13) ? "Libraries unloaded" : "Library unloading failed!");
                    return;
                }
                if (arg1.equalsIgnoreCase("clientdrop")) {
                    class652.method3663(-104, "Dropped client connection");
                    if (class753.field10398 == 10) {
                        class614.method3477((byte) 19);
                        return;
                    }
                    if (~class753.field10398 == -12) {
                        class568.field8080 = true;
                    }
                    return;
                }
                if (arg1.equalsIgnoreCase("rotateconnectmethods")) {
                    class178.field2812.method4171(-77);
                    class652.method3663(-101, "Rotated connection methods");
                    return;
                }
                if (arg1.equalsIgnoreCase("clientjs5drop")) {
                    class336.field4527.method7(-87);
                    class652.method3663(-125, "Dropped client js5 net queue");
                    return;
                }
                if (arg1.equalsIgnoreCase("serverjs5drop")) {
                    class336.field4527.method5((byte) 40);
                    class652.method3663(114, "Dropped server js5 net queue");
                    return;
                }
                if (arg1.equalsIgnoreCase("breakcon")) {
                    class630.field8751.method4112((byte) -46);
                    class193.field2948.method916(38);
                    class336.field4527.method9(56);
                    class652.method3663(125, "Breaking new connections for 5 seconds");
                    return;
                }
                if (arg1.equalsIgnoreCase("rebuild")) {
                    class234.method1579(-97);
                    class420.method2468((byte) 8);
                    class652.method3663(17, "Rebuilding map");
                    return;
                }
                if (arg1.equalsIgnoreCase("rebuildprofile")) {
                    class254.field3577 = class197.method1423(1);
                    class109.field1711 = true;
                    class234.method1579(-97);
                    class420.method2468((byte) 8);
                    class652.method3663(-105, "Rebuilding map (with profiling)");
                    return;
                }
                if (arg1.equalsIgnoreCase("wm1")) {
                    class66.method513(-1, 125, 1, -1, false);
                    if (class586.method3369(2) == 1) {
                        class652.method3663(-99, "wm1 succeeded");
                        return;
                    }
                    class652.method3663(48, "wm1 failed");
                    return;
                }
                if (arg1.equalsIgnoreCase("wm2")) {
                    class66.method513(-1, 126, 2, -1, false);
                    if (class586.method3369(2) != 2) {
                        class652.method3663(-117, "wm2 failed");
                        return;
                    }
                    class652.method3663(-9, "wm2 succeeded");
                    return;
                }
                if (arg1.equalsIgnoreCase("wm3")) {
                    class66.method513(768, 126, 3, 1024, false);
                    if (~class586.method3369(2) == -4) {
                        class652.method3663(-100, "wm3 succeeded");
                        return;
                    }
                    class652.method3663(-122, "wm3 failed");
                    return;
                }
                if (arg1.equalsIgnoreCase("tk0")) {
                    class624.method3517(false, 0, 0);
                    if (class111.field1911.field6725.method3784((byte) 109) == 0) {
                        class652.method3663(-116, "Entered tk0");
                        class111.field1911.method2823(true, class111.field1911.field6753, 0);
                        class307.method1957(0);
                        class613.field8533 = false;
                        return;
                    }
                    class652.method3663(-115, "Failed to enter tk0");
                    return;
                }
                if (arg1.equalsIgnoreCase("tk1")) {
                    class624.method3517(false, 0, 1);
                    if (~class111.field1911.field6725.method3784((byte) 121) != -2) {
                        class652.method3663(-117, "Failed to enter tk1");
                        return;
                    }
                    class652.method3663(64, "Entered tk1");
                    class111.field1911.method2823(true, class111.field1911.field6753, 1);
                    class307.method1957(0);
                    class613.field8533 = false;
                    return;
                }
                if (arg1.equalsIgnoreCase("tk2")) {
                    class624.method3517(false, 0, 2);
                    if (~class111.field1911.field6725.method3784((byte) 56) != -3) {
                        class652.method3663(-1, "Failed to enter tk2");
                        return;
                    }
                    class652.method3663(-116, "Entered tk2");
                    class111.field1911.method2823(true, class111.field1911.field6753, 2);
                    class307.method1957(0);
                    class613.field8533 = false;
                    return;
                }
                if (arg1.equalsIgnoreCase("tk3")) {
                    class624.method3517(false, 0, 3);
                    if (~class111.field1911.field6725.method3784((byte) 110) == -4) {
                        class652.method3663(-112, "Entered tk3");
                        class111.field1911.method2823(true, class111.field1911.field6753, 3);
                        class307.method1957(0);
                        class613.field8533 = false;
                        return;
                    }
                    class652.method3663(-120, "Failed to enter tk3");
                    return;
                }
                if (arg1.equalsIgnoreCase("tk5")) {
                    class624.method3517(false, 0, 5);
                    if (class111.field1911.field6725.method3784((byte) 51) == 5) {
                        class652.method3663(34, "Entered tk5");
                        class111.field1911.method2823(true, class111.field1911.field6753, 5);
                        class307.method1957(0);
                        class613.field8533 = false;
                        return;
                    }
                    class652.method3663(-95, "Failed to enter tk5");
                    return;
                }
                if (arg1.startsWith("setba")) {
                    if (arg1.length() < 6) {
                        class652.method3663(-125, "Invalid buildarea value");
                        return;
                    }
                    int var13 = class287.method1832(-116, arg1.substring(6));
                    if (~var13 <= -1 && ~class455.method2627(-89, class455.field6207) <= ~var13) {
                        class111.field1911.method2823(true, class111.field1911.field6764, var13);
                        class307.method1957(0);
                        class613.field8533 = false;
                        class652.method3663(-4, "maxbuildarea=" + class111.field1911.field6764.method2439((byte) 87));
                        return;
                    }
                    class652.method3663(87, "Invalid buildarea value");
                    return;
                }
                if (arg1.startsWith("rect_debug")) {
                    if (~arg1.length() > -11) {
                        class652.method3663(-112, "Invalid rect_debug value");
                        return;
                    }
                    class652.field9029 = class287.method1832(-101, arg1.substring(10).trim());
                    class652.method3663(-9, "rect_debug=" + class652.field9029);
                    return;
                }
                if (arg1.equalsIgnoreCase("qa_op_test")) {
                    class178.field2814 = true;
                    class652.method3663(-128, "qa_op_test=" + class178.field2814);
                    return;
                }
                if (arg1.equalsIgnoreCase("clipcomponents")) {
                    class358.field4901 = !class358.field4901;
                    class652.method3663(-120, "clipcomponents=" + class358.field4901);
                    return;
                }
                if (arg1.startsWith("bloom")) {
                    boolean var14 = class95.field1472.method577();
                    if (!class313.method1986(!var14, (byte) -92)) {
                        class652.method3663(49, "Failed to enable bloom");
                        return;
                    }
                    if (!var14) {
                        class652.method3663(-115, "Bloom enabled");
                        return;
                    }
                    class652.method3663(54, "Bloom disabled");
                    return;
                }
                if (arg1.equalsIgnoreCase("tween")) {
                    if (class499.field6821) {
                        class499.field6821 = false;
                        class652.method3663(30, "Forced tweening disabled.");
                        return;
                    }
                    class499.field6821 = true;
                    class652.method3663(0, "Forced tweening ENABLED!");
                    return;
                }
                if (arg1.equalsIgnoreCase("shiftclick")) {
                    if (class318.field4334) {
                        class652.method3663(-119, "Shift-click disabled.");
                        class318.field4334 = false;
                        return;
                    }
                    class652.method3663(2, "Shift-click ENABLED!");
                    class318.field4334 = true;
                    return;
                }
                if (arg1.equalsIgnoreCase("getcgcoord")) {
                    class652.method3663(72, "x:" + (class235.field3379.field7396 >> 9) + " z:" + (class235.field3379.field7398 >> 9));
                    return;
                }
                if (arg1.equalsIgnoreCase("getheight")) {
                    class652.method3663(-128, "Height: " + class745.field10286[class235.field3379.field7391].method1897((byte) -34, class235.field3379.field7398 >> 9, class235.field3379.field7396 >> 9));
                    return;
                }
                if (arg1.equalsIgnoreCase("resetminimap")) {
                    class346.field4664.method3749((byte) -73);
                    class346.field4664.method3748(0);
                    class636.field8785.method2118(34);
                    class430.field5863.method4032(-105);
                    class420.method2468((byte) 8);
                    class652.method3663(6, "Minimap reset");
                    return;
                }
                if (arg1.startsWith("mc")) {
                    if (class95.field1472.method566()) {
                        int var15 = Integer.parseInt(arg1.substring(3));
                        if (var15 < 1) {
                            var15 = 1;
                        } else if (~var15 < -5) {
                            var15 = 4;
                        }
                        class265.field3740 = var15;
                        class234.method1579(-97);
                        class652.method3663(-108, "Render cores now: " + class265.field3740);
                        return;
                    }
                    class652.method3663(-103, "Current toolkit doesn't support multiple cores");
                    return;
                }
                if (arg1.startsWith("cachespace")) {
                    class652.method3663(49, "I(s): " + class80.field1115.method269(false) + "/" + class80.field1115.method264((byte) 119));
                    class652.method3663(-112, "I(m): " + class281.field3898.method269(false) + "/" + class281.field3898.method264((byte) 126));
                    class652.method3663(10, "O(s): " + class143.field2427.field2981.method4145((byte) 8) + "/" + class143.field2427.field2981.method4148(-118));
                    return;
                }
                if (arg1.equalsIgnoreCase("getcamerapos")) {
                    class652.method3663(13, "Pos: " + class235.field3379.field7391 + "," + ((class733.field10131 >> 9) + class217.field3198 >> 6) + "," + ((class450.field6172 >> 9) + class400.field5510 >> 6) + "," + (63 & (class733.field10131 >> 9) + class217.field3198) + "," + ((class450.field6172 >> 9) + class400.field5510 & 63) + " Height: " + (class309.method1973(15356, class733.field10131, class450.field6172, class235.field3379.field7391) - class605.field8452));
                    class652.method3663(54, "Look: " + class235.field3379.field7391 + "," + (class619.field8609 + class217.field3198 >> 6) + "," + (class400.field5510 + class326.field4453 >> 6) + "," + (63 & class619.field8609 + class217.field3198) + "," + (class400.field5510 + class326.field4453 & 63) + " Height: " + (class309.method1973(15356, class619.field8609, class326.field4453, class235.field3379.field7391) - class518.field7039));
                    return;
                }
                if (arg1.equals("renderprofile") || arg1.equals("rp")) {
                    class593.field8334 = !class593.field8334;
                    class95.field1472.method486(class593.field8334);
                    class388.method2359(128);
                    class652.method3663(75, "showprofiling=" + class593.field8334);
                    return;
                }
                if (arg1.startsWith("performancetest")) {
                    int var16 = -1;
                    int var17 = 1000;
                    if (arg1.length() > 15) {
                        String[] var18 = class478.method2738(arg1, ' ', 14388);
                        try {
                            if (var18.length > 1) {
                                var17 = Integer.parseInt(var18[1]);
                            }
                        } catch (Throwable var43) {
                        }
                        try {
                            if (var18.length > 2) {
                                var16 = Integer.parseInt(var18[2]);
                            }
                        } catch (Throwable var42) {
                        }
                    }
                    if (~var16 != 0) {
                        class652.method3663(14, "Performance: " + class591.method3384(var16, var17, 7762));
                        return;
                    }
                    class652.method3663(109, "Java toolkit: " + class591.method3384(0, var17, 7762));
                    class652.method3663(117, "SSE toolkit:  " + class591.method3384(2, var17, 7762));
                    class652.method3663(67, "D3D toolkit:  " + class591.method3384(3, var17, 7762));
                    class652.method3663(83, "GL toolkit:   " + class591.method3384(1, var17, 7762));
                    class652.method3663(-105, "GLX toolkit:  " + class591.method3384(5, var17, 7762));
                    return;
                }
                if (arg1.equals("nonpcs")) {
                    class694.field9612 = !class694.field9612;
                    class652.method3663(-114, "nonpcs=" + class694.field9612);
                    return;
                }
                if (arg1.equals("autoworld")) {
                    class404.method2415((byte) -99);
                    class652.method3663(75, "auto world selected");
                    return;
                }
                if (arg1.startsWith("switchworld")) {
                    int var19 = Integer.parseInt(arg1.substring(12));
                    class682.method3844(-49, class324.method2062(var19, (byte) -128).field10099, var19);
                    class652.method3663(-128, "switched");
                    return;
                }
                if (arg1.equals("getworld")) {
                    class652.method3663(13, "w: " + class178.field2812.field10374);
                    return;
                }
                if (arg1.startsWith("pc")) {
                    class537 var20 = class476.method2729(class357.field4896, (byte) -46, class551.field7498);
                    var20.field7295.method754(0, 54);
                    int var21 = var20.field7295.field1442;
                    int var22 = arg1.indexOf(" ", 4);
                    var20.field7295.method783((byte) -120, arg1.substring(3, var22));
                    class200.method1445(var20.field7295, arg1.substring(var22), -86);
                    var20.field7295.method778(var20.field7295.field1442 - var21, -1123171672);
                    class173.method1314(false, var20);
                    return;
                }
                if (arg1.equals("savevarcs")) {
                    class551.method3138((byte) -71);
                    class652.method3663(19, "perm varcs saved");
                    return;
                }
                if (arg1.equals("scramblevarcs")) {
                    for (int var23 = 0; ~class46.field724.length < ~var23; ++var23) {
                        if (class617.field8593[var23]) {
                            class46.field724[var23] = (int) (99999.0D * Math.random());
                            if (Math.random() > 0.5D) {
                                class46.field724[var23] *= -1;
                            }
                        }
                    }
                    class551.method3138((byte) -111);
                    class652.method3663(-125, "perm varcs scrambled");
                    return;
                }
                if (arg1.equals("showcolmap")) {
                    class483.field6511 = true;
                    class420.method2468((byte) 8);
                    class652.method3663(49, "colmap is shown");
                    return;
                }
                if (arg1.equals("hidecolmap")) {
                    class483.field6511 = false;
                    class420.method2468((byte) 8);
                    class652.method3663(-97, "colmap is hidden");
                    return;
                }
                if (arg1.equals("resetcache")) {
                    class338.method2113(63);
                    class652.method3663(-100, "Caches reset");
                    return;
                }
                if (arg1.equals("profilecpu")) {
                    class652.method3663(-106, class676.method3817(10000) + "ms");
                    return;
                }
                if (arg1.startsWith("getclientvarpbit")) {
                    int var24 = Integer.parseInt(arg1.substring(17));
                    class652.method3663(-104, "varpbit=" + class694.field9613.method138(19129, var24));
                    return;
                }
                if (arg1.startsWith("getclientvarp")) {
                    int var25 = Integer.parseInt(arg1.substring(14));
                    class652.method3663(12, "varp=" + class694.field9613.method146(128, var25));
                    return;
                }
                if (arg1.startsWith("directlogin")) {
                    String[] var26 = class478.method2738(arg1.substring(12), ' ', 14388);
                    if (~var26.length <= -3) {
                        int var27 = var26.length > 2 ? Integer.parseInt(var26[2]) : 0;
                        class784.method4282(var26[1], var27, 19046, var26[0]);
                        return;
                    }
                }
                if (arg1.startsWith("csprofileclear")) {
                    class76.method649();
                    return;
                }
                if (arg1.startsWith("csprofileoutputc")) {
                    class76.method655(100, false);
                    return;
                }
                if (arg1.startsWith("csprofileoutputt")) {
                    class76.method655(10, true);
                    return;
                }
                if (arg1.startsWith("texsize")) {
                    int var28 = Integer.parseInt(arg1.substring(8));
                    class95.field1472.method473(var28);
                    return;
                }
                if (arg1.equals("soundstreamcount")) {
                    class652.method3663(94, "Active streams: " + class456.field6213.method360());
                    return;
                }
                if (arg1.equals("autosetup")) {
                    class263.method1718(-24290);
                    class652.method3663(-100, "Complete. Toolkit now: " + class111.field1911.field6725.method3784((byte) 124));
                    return;
                }
                if (arg1.equals("errormessage")) {
                    class652.method3663(26, class594.field8348.method2008((byte) -68));
                    return;
                }
                if (arg1.equals("heapdump")) {
                    if (!class742.field10234.startsWith("win")) {
                        class660.method3713(new File("/tmp/heap.dump"), 3, false);
                    } else {
                        class660.method3713(new File("C:\\Temp\\heap.dump"), 3, false);
                    }
                    class652.method3663(-96, "Done");
                    return;
                }
                if (arg1.equals("os")) {
                    class652.method3663(-107, "Name: " + class742.field10234);
                    class652.method3663(50, "Arch: " + class742.field10256);
                    class652.method3663(86, "Ver: " + class742.field10244);
                    return;
                }
                if (arg1.startsWith("w2debug")) {
                    int var29 = Integer.parseInt(arg1.substring(8, 9));
                    class692.field9597 = var29;
                    class234.method1579(-97);
                    class652.method3663(-119, "Toggled!");
                    return;
                }
                if (arg1.startsWith("ortho ")) {
                    int var30 = arg1.indexOf(32);
                    if (~var30 > -1) {
                        class652.method3663(86, "Syntax: ortho <n>");
                        return;
                    }
                    int var31 = class287.method1832(-117, arg1.substring(var30 + 1));
                    class111.field1911.method2823(true, class111.field1911.field6741, var31);
                    class307.method1957(0);
                    class613.field8533 = false;
                    class185.method1374(127);
                    if (~class111.field1911.field6741.method4322((byte) 61) != ~var31) {
                        class652.method3663(-106, "Failed to change ortho mode");
                        return;
                    }
                    class652.method3663(13, "Successfully changed ortho mode");
                    return;
                }
                if (arg1.startsWith("orthozoom ")) {
                    if (~class111.field1911.field6741.method4322((byte) 68) == -1) {
                        class652.method3663(-97, "enable ortho mode first (use 'ortho <n>')");
                        return;
                    }
                    int var32 = class287.method1832(-120, arg1.substring(arg1.indexOf(32) + 1));
                    class90.field1367 = var32;
                    class652.method3663(-106, "orthozoom=" + class90.field1367);
                    return;
                }
                if (arg1.startsWith("orthotilesize ")) {
                    int var33 = class287.method1832(-125, arg1.substring(arg1.indexOf(32) - -1));
                    class484.field6552 = var33;
                    class163.field2593 = var33;
                    class652.method3663(61, "ortho tile size=" + var33);
                    class185.method1374(95);
                    return;
                }
                if (arg1.equals("orthocamlock")) {
                    class482.field6510 = !class482.field6510;
                    class652.method3663(-124, "ortho camera lock is " + (class482.field6510 ? "on" : "off"));
                    return;
                }
                if (arg1.startsWith("setoutput ")) {
                    File var34 = new File(arg1.substring(10));
                    if (var34.exists()) {
                        var34 = new File(arg1.substring(10) + "." + class197.method1423(1) + ".log");
                        if (var34.exists()) {
                            class652.method3663(31, "file already exists!");
                            return;
                        }
                    }
                    if (class551.field7632 != null) {
                        class551.field7632.close();
                        class551.field7632 = null;
                    }
                    try {
                        class551.field7632 = new FileOutputStream(var34);
                        return;
                    } catch (FileNotFoundException var44) {
                        class652.method3663(36, "Could not create " + var34.getName());
                        return;
                    } catch (SecurityException var45) {
                        class652.method3663(-107, "Cannot write to " + var34.getName());
                        return;
                    }
                }
                if (arg1.equals("closeoutput")) {
                    if (class551.field7632 != null) {
                        class551.field7632.close();
                    }
                    class551.field7632 = null;
                    return;
                }
                if (arg1.startsWith("runscript ")) {
                    File var35 = new File(arg1.substring(10));
                    if (!var35.exists()) {
                        class652.method3663(78, "No such file");
                        return;
                    }
                    byte[] var36 = class390.method2366(var35, 22946);
                    if (var36 == null) {
                        class652.method3663(-110, "Failed to read file");
                        return;
                    }
                    String[] var37 = class478.method2738(class121.method1058("", -20817, '\r', class634.method3550(false, var36)), '\n', 14388);
                    class520.method2958(-107, var37);
                }
                if (arg1.startsWith("zoom ")) {
                    short var38 = (short) class287.method1832(-103, arg1.substring(5));
                    if (~var38 < -1) {
                        class274.field3817 = var38;
                    }
                    return;
                }
                if (~class753.field10398 == -11) {
                    ++class450.field6162;
                    class537 var39 = class476.method2729(class769.field10603, (byte) -46, class551.field7498);
                    var39.field7295.method754(3 + arg1.length(), 44);
                    var39.field7295.method754(arg3 ? 1 : 0, 71);
                    var39.field7295.method754(arg2 ? 1 : 0, 73);
                    var39.field7295.method783((byte) 79, arg1);
                    class173.method1314(false, var39);
                }
                if (arg1.startsWith("fps ") && class556.field7850 != class517.field7028) {
                    class132.method1107(class287.method1832(-115, arg1.substring(4)), 87);
                    return;
                }
            } catch (Exception var46) {
                class652.method3663(22, class641.field8818.method3566((byte) 99, class464.field6309));
                return;
            }
        }
        int var40 = 59 % ((35 - arg0) / 34);
        if (~class753.field10398 != -11) {
            class652.method3663(-128, class641.field8819.method3566((byte) -95, class464.field6309) + arg1);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(B)Z")
    public final boolean method1036(byte arg0) {
        if (arg0 >= -44) {
            this.field2150 = null;
        }
        ++field2144;
        return this.field2131;
    }

    @OriginalMember(owner = "client!er", name = "d", descriptor = "(I)V")
    public final void method905(int arg0) {
        if (arg0 != -16665) {
            this.field2137 = true;
        }
        this.field2139 = false;
        ++field2154;
        if (this.field2143 != null) {
            this.field2143.method303(-65537 & this.field2143.method300());
        }
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(I)V")
    public final void method1037(int arg0) {
        if (arg0 != -1114) {
            this.field2149 = false;
        }
        ++field2132;
        if (this.field2143 != null) {
            this.field2143.method294();
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ILha;B)Lka;")
    private final class499 method1038(int arg0, class66 arg1, byte arg2) {
        ++field2146;
        if (this.field2143 != null && arg1.method482(this.field2143.method300(), arg0) == 0) {
            return this.field2143;
        } else if (arg2 != 0) {
            return null;
        } else {
            class548 var4 = this.method1031(false, arg1, arg0, false);
            return var4 == null ? null : var4.field7450;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Lha;I)V")
    public final void method1039(class66 arg0, int arg1) {
        ++field2147;
        Object var3 = null;
        if (arg1 >= 81) {
            class196 var5;
            if (this.field2150 == null && this.field2131) {
                class548 var4 = this.method1031(true, arg0, 262144, false);
                var5 = var4 == null ? null : var4.field7448;
            } else {
                var5 = this.field2150;
                this.field2150 = null;
            }
            if (var5 != null) {
                class622.method3511(var5, super.field7404, super.field7396, super.field7398, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Lha;B)V")
    public final void method1040(class66 arg0, byte arg1) {
        ++field2138;
        Object var3 = null;
        if (arg1 != 55) {
            this.field2136 = -118;
        }
        class196 var5;
        if (this.field2150 == null && this.field2131) {
            class548 var4 = this.method1031(true, arg0, 262144, false);
            var5 = var4 != null ? var4.field7448 : null;
        } else {
            var5 = this.field2150;
            this.field2150 = null;
        }
        if (var5 != null) {
            class335.method2099(var5, super.field7404, super.field7396, super.field7398, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!er", name = "m", descriptor = "(I)V")
    public static void method1041(int arg0) {
        field2153 = null;
        if (arg0 != -3442) {
            field2153 = null;
        }
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(Z)Z")
    public final boolean method910(boolean arg0) {
        if (arg0) {
            this.method905(-101);
        }
        ++field2128;
        return this.field2143 != null ? this.field2143.method327() : false;
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lha;Lij;IIIIIZIZ)V")
    public class117(class66 arg0, class445 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, boolean arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field6075);
        this.field2149 = arg1.field6050 != 0 && !arg7;
        this.field2136 = (short) arg1.field6104;
        super.field7398 = arg6;
        this.field2158 = (byte) arg8;
        super.field7396 = arg4;
        this.field2137 = arg7;
        this.field2139 = arg9;
        this.field2131 = arg0.method479() && arg1.field6125 && !this.field2137 && ~class111.field1911.field6717.method3695((byte) 57) != -1;
        int var11 = 2048;
        if (this.field2139) {
            var11 |= 65536;
        }
        class548 var12 = this.method1031(this.field2131, arg0, var11, false);
        if (var12 != null) {
            this.field2150 = var12.field7448;
            this.field2143 = var12.field7450;
            if (this.field2139) {
                this.field2143 = this.field2143.method324((byte) 0, var11, false);
                return;
            }
        }
    }
}
