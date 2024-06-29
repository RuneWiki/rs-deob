import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class205 extends class445 {

    @OriginalMember(owner = "client!jg", name = "x", descriptor = "I")
    public int field2775 = -1;

    @OriginalMember(owner = "client!jg", name = "s", descriptor = "Z")
    public boolean field2770 = false;

    @OriginalMember(owner = "client!jg", name = "t", descriptor = "Lh;")
    public static class434 field2771 = new class434(10, -1);

    @OriginalMember(owner = "client!jg", name = "F", descriptor = "Lgd;")
    public static class206 field2782 = new class206(" ", ": ", " ", " ");

    @OriginalMember(owner = "client!jg", name = "H", descriptor = "I")
    public static int field2784 = 100;

    @OriginalMember(owner = "client!jg", name = "I", descriptor = "[I")
    public static int[] field2785 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!jg", name = "u", descriptor = "I")
    public int field2772;

    @OriginalMember(owner = "client!jg", name = "v", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!jg", name = "w", descriptor = "I")
    public int field2774;

    @OriginalMember(owner = "client!jg", name = "y", descriptor = "I")
    public int field2776;

    @OriginalMember(owner = "client!jg", name = "z", descriptor = "I")
    public int field2777;

    @OriginalMember(owner = "client!jg", name = "B", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!jg", name = "C", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!jg", name = "D", descriptor = "I")
    public int field2780;

    @OriginalMember(owner = "client!jg", name = "G", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!jg", name = "E", descriptor = "Z")
    public static boolean field2781;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(B)V", line = 6)
    public static final void method1169(byte arg0) {
        field2779++;
        if (arg0 == -98) {
            class274.field3632.method495(arg0 - 16);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "([BI)[B", line = 17)
    public static final byte[] method1170(byte[] arg0, int arg1) {
        field2773++;
        class32 var2 = new class32(arg0);
        int var3 = var2.method201((byte) -113);
        if (arg1 != 13112) {
            return null;
        }
        int var4 = var2.method222(arg1 - 12088);
        if (var4 < 0 || !(client.field2462 == 0 || client.field2462 >= var4)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method185(var5, 0, var4, true);
            return var5;
        } else {
            int var6 = var2.method222(1024);
            if (var6 < 0 || !(client.field2462 == 0 || client.field2462 >= var6)) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class430.method2547(var7, var6, arg0, var4, 9);
            } else {
                class142.field2055.method2647(var7, 66, var2);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(B)V", line = 73)
    public static void method1171(byte arg0) {
        if (arg0 <= 116) {
            method1171((byte) -109);
        }
        field2771 = null;
        field2782 = null;
        field2785 = null;
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(I)V", line = 818)
    public class205(int arg0) {
        this.field2775 = arg0;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Ljava/lang/String;ZZ)V", line = 95)
    public static final void method1172(String arg0, boolean arg1, boolean arg2) {
        if (arg2) {
            method1172((String) null, false, true);
        }
        field2783++;
        if (class377.field5197 == class278.field3682 && class348.field4799 < 2) {
            return;
        }
        if (arg0.equalsIgnoreCase("errortest")) {
            throw new RuntimeException();
        }
        try {
            if (arg0.equalsIgnoreCase("fpson")) {
                class165.field2286 = true;
                class279.method1574("fps debug enabled", 4);
                return;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                class165.field2286 = false;
                class279.method1574("fps debug disabled", -96);
                return;
            }
            if (arg0.equalsIgnoreCase("cls")) {
                class390.field5423 = 0;
                class11.field130 = 0;
                return;
            }
            if (arg0.equalsIgnoreCase("cleartext")) {
                class367.field5048.method2765(-15597);
                class279.method1574("Text coords cleared", 122);
                return;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                class193.method1101((byte) 114);
                for (int var3 = 0; var3 < 10; var3++) {
                    System.gc();
                }
                Runtime var4 = Runtime.getRuntime();
                int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
                class279.method1574("mem=" + var5 + "k", 126);
                return;
            }
            if (arg0.equalsIgnoreCase("compact")) {
                class193.method1101((byte) 122);
                for (int var6 = 0; var6 < 10; var6++) {
                    System.gc();
                }
                Runtime var7 = Runtime.getRuntime();
                int var8 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                class279.method1574("Memory before cleanup=" + var8 + "k", 123);
                class67.method449(2);
                class193.method1101((byte) 109);
                for (int var9 = 0; var9 < 10; var9++) {
                    System.gc();
                }
                int var10 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                class279.method1574("Memory after cleanup=" + var10 + "k", 119);
                return;
            }
            if (arg0.equalsIgnoreCase("pcachesize")) {
                class279.method1574("Number of player models in cache:" + class221.method1252(-32119), 106);
                return;
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                class279.method1574("Dropped client connection", -35);
                if (class18.field258 == 30) {
                    class412.method2474((byte) 114);
                    return;
                }
                if (class18.field258 == 25) {
                    class330.field4382 = true;
                }
                return;
            }
            if (arg0.equalsIgnoreCase("clientjs5drop")) {
                class477.field6599.method1376(4);
                class279.method1574("Dropped client js5 net queue", -61);
                return;
            }
            if (arg0.equalsIgnoreCase("serverjs5drop")) {
                class477.field6599.method1366(0);
                class279.method1574("Dropped server js5 net queue", 110);
                return;
            }
            if (arg0.equalsIgnoreCase("breakcon")) {
                class251.field3359.method1342((byte) -43);
                class280.field3743.method2312(5000);
                class477.field6599.method1364(-2065);
                class279.method1574("Breaking new connections for 5 seconds", 115);
                return;
            }
            if (arg0.equalsIgnoreCase("rebuild")) {
                class18.method119(true);
                class321.method1777(-128);
                class279.method1574("Rebuilding map", 106);
                return;
            }
            if (arg0.equalsIgnoreCase("wm1")) {
                class96.method597(-1, 1, (byte) 62, false, -1);
                if (class6.method41((byte) -121) == 1) {
                    class279.method1574("wm1 succeeded", 122);
                    return;
                }
                class279.method1574("wm1 failed", 125);
                return;
            }
            if (arg0.equalsIgnoreCase("wm2")) {
                class96.method597(-1, 2, (byte) 127, false, -1);
                if (class6.method41((byte) -121) == 2) {
                    class279.method1574("wm2 succeeded", -122);
                    return;
                }
                class279.method1574("wm2 failed", 111);
                return;
            }
            if (arg0.equalsIgnoreCase("wm3")) {
                class96.method597(768, 3, (byte) 49, false, 1024);
                if (class6.method41((byte) -121) == 3) {
                    class279.method1574("wm3 succeeded", -18);
                    return;
                }
                class279.method1574("wm3 failed", -1);
                return;
            }
            if (arg0.equalsIgnoreCase("tk0")) {
                class107.method664(0, (byte) 127);
                if (class222.field2958 == 0) {
                    class279.method1574("Entered tk0", -30);
                    class488.field6789.field6663 = 0;
                    class488.field6789.method2417(73, class251.field3359);
                    class464.field6399 = false;
                    return;
                }
                class279.method1574("Failed to enter tk0", 120);
                return;
            }
            if (arg0.equalsIgnoreCase("tk1")) {
                class107.method664(1, (byte) 125);
                if (class222.field2958 != 1) {
                    class279.method1574("Failed to enter tk1", 15);
                    return;
                }
                class279.method1574("Entered tk1", 20);
                class488.field6789.field6663 = 1;
                class488.field6789.method2417(116, class251.field3359);
                class464.field6399 = false;
                return;
            }
            if (arg0.equalsIgnoreCase("tk2")) {
                class107.method664(2, (byte) 125);
                if (class222.field2958 != 2) {
                    class279.method1574("Failed to enter tk2", 114);
                    return;
                }
                class279.method1574("Entered tk2", -119);
                class488.field6789.field6663 = 2;
                class488.field6789.method2417(115, class251.field3359);
                class464.field6399 = false;
                return;
            }
            if (arg0.equalsIgnoreCase("tk3")) {
                class107.method664(3, (byte) 124);
                if (class222.field2958 == 3) {
                    class279.method1574("Entered tk3", -49);
                    return;
                }
                class279.method1574("Failed to enter tk3", -23);
                return;
            }
            if (arg0.equalsIgnoreCase("ot")) {
                class488.field6789.field6676 = !class488.field6789.field6676;
                class488.field6789.method2417(37, class251.field3359);
                class464.field6399 = false;
                class18.method119(true);
                class279.method1574("ot=" + class488.field6789.field6676, 103);
                return;
            }
            if (arg0.equalsIgnoreCase("gb")) {
                class488.field6789.field6680 = !class488.field6789.field6680;
                class488.field6789.method2417(122, class251.field3359);
                class464.field6399 = false;
                class18.method119(!arg2);
                class279.method1574("gb=" + class488.field6789.field6680, 22);
                return;
            }
            if (arg0.startsWith("shadows")) {
                if (arg0.length() < 8) {
                    class279.method1574("Invalid shadows value", 127);
                    return;
                }
                String var11 = arg0.substring(8);
                int var12 = class59.method419(arg2, var11) ? class455.method2673(116, var11) : -1;
                if (var12 >= 0 && var12 <= 2) {
                    class488.field6789.field6682 = var12;
                    class488.field6789.method2417(70, class251.field3359);
                    class464.field6399 = false;
                    class18.method119(!arg2);
                    class279.method1574("shadows=" + var12, -82);
                    return;
                }
                class279.method1574("Invalid shadows value", 5);
                return;
            }
            if (arg0.startsWith("setba")) {
                if (arg0.length() < 6) {
                    class279.method1574("Invalid buildarea value", -77);
                    return;
                }
                int var13 = class455.method2673(119, arg0.substring(6));
                if (var13 >= 0 && var13 <= class19.method120(class428.field5792, true)) {
                    class488.field6789.field6674 = var13;
                    class488.field6789.method2417(124, class251.field3359);
                    class464.field6399 = false;
                    class279.method1574("maxbuildarea=" + class488.field6789.field6674, 21);
                    return;
                }
                class279.method1574("Invalid buildarea value", -126);
                return;
            }
            if (arg0.startsWith("setparticles")) {
                if (arg0.length() < 13) {
                    class279.method1574("Invalid particles value", -60);
                    return;
                }
                class146.method869(class455.method2673(127, arg0.substring(13)), !arg2);
                class488.field6789.method2417(56, class251.field3359);
                class464.field6399 = false;
                class279.method1574("particles=" + class216.method1223(8173), -95);
                return;
            }
            if (arg0.startsWith("rect_debug")) {
                if (arg0.length() < 10) {
                    class279.method1574("Invalid rect_debug value", 11);
                    return;
                }
                class318.field4197 = class455.method2673(106, arg0.substring(10).trim());
                class279.method1574("rect_debug=" + class318.field4197, 120);
                return;
            }
            if (arg0.equalsIgnoreCase("qa_op_test")) {
                class200.field2704 = true;
                class279.method1574("qa_op_test=" + class200.field2704, 126);
                return;
            }
            if (arg0.equalsIgnoreCase("clipcomponents")) {
                class236.field3120 = !class236.field3120;
                class279.method1574("clipcomponents=" + class236.field3120, -111);
                return;
            }
            if (arg0.startsWith("bloom")) {
                boolean var14 = class98.field1432.method2109();
                if (class367.method2242(!var14, -5)) {
                    if (!var14) {
                        class279.method1574("Bloom enabled", 117);
                        return;
                    }
                    class279.method1574("Bloom disabled", -37);
                    return;
                }
                class279.method1574("Failed to enable bloom", -87);
                return;
            }
            if (arg0.equalsIgnoreCase("tween")) {
                if (!class293.field3917) {
                    class293.field3917 = true;
                    class279.method1574("Forced tweening ENABLED!", -33);
                    return;
                }
                class293.field3917 = false;
                class279.method1574("Forced tweening disabled.", 124);
                return;
            }
            if (arg0.equalsIgnoreCase("shiftclick")) {
                if (class266.field3517) {
                    class279.method1574("Shift-click disabled.", -20);
                    class266.field3517 = false;
                    return;
                }
                class279.method1574("Shift-click ENABLED!", 102);
                class266.field3517 = true;
                return;
            }
            if (arg0.equalsIgnoreCase("getcgcoord")) {
                class279.method1574("x:" + (class233.field3103.field6501 >> 7) + " z:" + (class233.field3103.field6507 >> 7), -86);
                return;
            }
            if (arg0.equalsIgnoreCase("getheight")) {
                class279.method1574("Height: " + class221.field2945[class233.field3103.field6502].method371(class233.field3103.field6501 >> 7, class233.field3103.field6507 >> 7), 120);
                return;
            }
            if (arg0.equalsIgnoreCase("resetminimap")) {
                class473.field6525.method703((byte) 79);
                class473.field6525.method681(false);
                class171.field2351.method2197((byte) -52);
                class464.field6319.method2711(2);
                class321.method1777(-128);
                class279.method1574("Minimap reset", -106);
                return;
            }
            if (arg0.startsWith("mc")) {
                if (class98.field1432.method2080()) {
                    int var15 = Integer.parseInt(arg0.substring(3));
                    if (var15 < 1) {
                        var15 = 1;
                    } else if (var15 > 4) {
                        var15 = 4;
                    }
                    class195.field2636 = var15;
                    class98.field1432.method2062(class195.field2636);
                    class98.field1432.method2041(0);
                    class279.method1574("Render cores now: " + class195.field2636, -49);
                    return;
                }
                class279.method1574("Current toolkit doesn't support multiple cores", 109);
                return;
            }
            if (arg0.startsWith("cachespace")) {
                class279.method1574("I(s): " + class280.field3734.method497(0) + "/" + class280.field3734.method501((byte) 52), 23);
                class279.method1574("I(m): " + class471.field6493.method497(0) + "/" + class471.field6493.method501((byte) 52), 114);
                class279.method1574("O(s): " + class175.field2385.field3675.method1122(-121) + "/" + class175.field2385.field3675.method1127(-19585), 112);
                return;
            }
            if (arg0.equalsIgnoreCase("getcamerapos")) {
                class279.method1574("Pos: " + class233.field3103.field6502 + "," + ((class197.field2680 >> 7) + class162.field2260 >> 6) + "," + ((class412.field5637 >> 7) + class266.field3511 >> 6) + "," + ((class197.field2680 >> 7) + class162.field2260 & 0x3F) + "," + ((class412.field5637 >> 7) + class266.field3511 & 0x3F) + " Height: " + (class247.method1385(-106, class197.field2680, class412.field5637, class233.field3103.field6502) - class195.field2638), -62);
                class279.method1574("Look: " + class233.field3103.field6502 + "," + (class162.field2260 + class153.field2148 >> 6) + "," + (class40.field576 + class266.field3511 >> 6) + "," + (class153.field2148 + class162.field2260 & 0x3F) + "," + (class40.field576 + class266.field3511 & 0x3F) + " Height: " + (class247.method1385(52, class153.field2148, class40.field576, class233.field3103.field6502) - class252.field3361), 116);
                return;
            }
            if (arg0.equals("showocc")) {
                class130.field1907 = !class130.field1907;
                class18.method119(true);
                class279.method1574("showocc=" + class130.field1907, -60);
                return;
            }
            if (arg0.equals("wallocc")) {
                class431.field5876 = !class431.field5876;
                class18.method119(true);
                class279.method1574("forcewallocc=" + class431.field5876, -19);
                return;
            }
            if (arg0.equals("renderprofile") || arg0.equals("rp")) {
                class417.field5672 = !class417.field5672;
                class98.field1432.method2023(class417.field5672);
                class372.method2289(6352);
                class279.method1574("showprofiling=" + class417.field5672, -43);
                return;
            }
            if (arg0.equals("nonpcs")) {
                class68.field931 = !class68.field931;
                class279.method1574("nonpcs=" + class68.field931, 18);
                return;
            }
            if (arg0.equals("autoworld")) {
                class490.method2853(-1);
                class279.method1574("auto world selected", -126);
                return;
            }
            if (arg0.equals("heap")) {
                class279.method1574("Heap: " + class428.field5792 + "MB", -47);
                return;
            }
            if (arg0.equals("savevarcs")) {
                class342.method1940(false);
                class279.method1574("perm varcs saved", 19);
                return;
            }
            if (arg0.equals("scramblevarcs")) {
                for (int var16 = 0; var16 < class311.field4102.length; var16++) {
                    if (class387.field5359[var16]) {
                        class311.field4102[var16] = (int) (Math.random() * 99999.0D);
                        if (Math.random() > 0.5D) {
                            class311.field4102[var16] *= -1;
                        }
                    }
                }
                class342.method1940(arg2);
                class279.method1574("perm varcs scrambled", -13);
                return;
            }
            if (arg0.equals("showcolmap")) {
                class472.field6516 = true;
                class321.method1777(-128);
                class279.method1574("colmap is shown", -9);
                return;
            }
            if (arg0.equals("hidecolmap")) {
                class472.field6516 = false;
                class321.method1777(-128);
                class279.method1574("colmap is hidden", 116);
                return;
            }
            if (arg0.equals("resetcache")) {
                class412.method2470(0);
                class279.method1574("Caches reset", -73);
                return;
            }
            if (arg0.equals("profilecpu")) {
                class279.method1574(class80.method523((byte) -103) + "ms", 127);
                return;
            }
            if (arg0.startsWith("cpuusage")) {
                int var17 = Integer.parseInt(arg0.substring(9));
                if (var17 >= 0 && var17 <= 4) {
                    class488.field6789.field6669 = var17;
                }
                class279.method1574("cpuusage=" + class488.field6789.field6669, 103);
                return;
            }
            if (arg0.startsWith("getclientvarpbit")) {
                int var18 = Integer.parseInt(arg0.substring(17));
                class279.method1574("varpbit=" + class38.field562.method1455((byte) -35, var18), -75);
                return;
            }
            if (arg0.startsWith("getclientvarp")) {
                int var19 = Integer.parseInt(arg0.substring(14));
                class279.method1574("varp=" + class38.field562.method1454(1633, var19), 104);
                return;
            }
            if (class18.field258 == 30) {
                class437.field5927++;
                class491.method2861(class134.field1962, 1);
                class203.field2751.method228(arg0.length() + 2, 32);
                class203.field2751.method228(arg1 ? 1 : 0, 32);
                class203.field2751.method208(arg0, -122);
            }
            if (arg0.startsWith("fps ") && class377.field5197 != class278.field3682) {
                class424.method2507(class455.method2673(101, arg0.substring(4)), (byte) 111);
                return;
            }
            if (class18.field258 != 30) {
                class279.method1574("Unrecogonised commmand when not logged in: " + arg0, 1);
                return;
            }
        } catch (Exception var20) {
            class279.method1574("Whoops, something went wrong.", -82);
            return;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BZ)V", line = 765)
    public static final void method1173(byte arg0, boolean arg1) {
        if (arg0 >= -52) {
            method1172((String) null, true, true);
        }
        field2778++;
        class183.method1073(-1);
        if (class18.field258 != 30 && class18.field258 != 25) {
            return;
        }
        class281.field3784++;
        if (class281.field3784 < 50 && !arg1) {
            return;
        }
        class281.field3784 = 0;
        if (!class330.field4382 && class280.field3743 != null) {
            class251.field3353++;
            class491.method2861(class272.field3616, 1);
            try {
                class280.field3743.method2308(false, 0, class203.field2751.field456, class203.field2751.field472);
                class203.field2751.field456 = 0;
            } catch (IOException var2) {
                class330.field4382 = true;
            }
        }
        class183.method1073(-1);
    }
}
