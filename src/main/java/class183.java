import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class183 extends class239 {

    @OriginalMember(owner = "client!eb", name = "C", descriptor = "Z")
    public static boolean field2654 = false;

    @OriginalMember(owner = "client!eb", name = "P", descriptor = "Lcs;")
    public static class351 field2656 = new class351(37, -1);

    @OriginalMember(owner = "client!eb", name = "O", descriptor = "B")
    public byte field2655;

    @OriginalMember(owner = "client!eb", name = "Q", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!eb", name = "R", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!eb", name = "S", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!eb", name = "T", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!eb", name = "U", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!eb", name = "V", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!eb", name = "X", descriptor = "I")
    public int field2664;

    @OriginalMember(owner = "client!eb", name = "Y", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!eb", name = "Z", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!eb", name = "ab", descriptor = "Lfc;")
    public static class343 field2667;

    @OriginalMember(owner = "client!eb", name = "W", descriptor = "Llk;")
    public class425 field2663;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "(I)V")
    public static final void method1199(int arg0) {
        ++field2662;
        if (arg0 != 1744) {
            method1201((byte) -94, -17);
        }
        for (int var1 = 0; class231.field3256.length > var1; ++var1) {
            for (int var2 = 0; ~var2 > ~class231.field3256[var1].length; ++var2) {
                class231.field3256[var1][var2] = class335.field4590;
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "(I)[B")
    public final byte[] method414(int arg0) {
        if (arg0 != 0) {
            return null;
        } else {
            ++field2657;
            if (!super.field3373 && ~(this.field2663.field5886.length + -this.field2655) >= ~this.field2663.field5830) {
                return this.field2663.field5886;
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
    public static final void method1200(String arg0, boolean arg1, int arg2) {
        ++field2666;
        if (class96.field1373 != class396.field5558 || class159.field2292 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            try {
                if (arg0.equalsIgnoreCase("fpson")) {
                    class321.field4385 = true;
                    class109.method680("fps debug enabled", 12245);
                    return;
                }
                if (arg0.equalsIgnoreCase("fpsoff")) {
                    class321.field4385 = false;
                    class109.method680("fps debug disabled", 12245);
                    return;
                }
                if (arg0.equalsIgnoreCase("cls")) {
                    class240.field3381 = 0;
                    class389.field5490 = 0;
                    return;
                }
                if (arg0.equalsIgnoreCase("cleartext")) {
                    class261.field3644.method2819((byte) 4);
                    class109.method680("Text coords cleared", 12245);
                    return;
                }
                if (arg0.equalsIgnoreCase("gc")) {
                    class478.method2811(false);
                    for (int var3 = 0; var3 < 10; ++var3) {
                        System.gc();
                    }
                    Runtime var4 = Runtime.getRuntime();
                    int var5 = (int) ((var4.totalMemory() + -var4.freeMemory()) / 1024L);
                    class109.method680("mem=" + var5 + "k", 12245);
                    return;
                }
                if (arg0.equalsIgnoreCase("compact")) {
                    class478.method2811(false);
                    for (int var6 = 0; ~var6 > -11; ++var6) {
                        System.gc();
                    }
                    Runtime var7 = Runtime.getRuntime();
                    int var8 = (int) ((var7.totalMemory() + -var7.freeMemory()) / 1024L);
                    class109.method680("Memory before cleanup=" + var8 + "k", 12245);
                    class446.method2600((byte) 121);
                    class478.method2811(false);
                    for (int var9 = 0; var9 < 10; ++var9) {
                        System.gc();
                    }
                    int var10 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                    class109.method680("Memory after cleanup=" + var10 + "k", 12245);
                    return;
                }
                if (arg0.equalsIgnoreCase("pcachesize")) {
                    class109.method680("Number of player models in cache:" + class262.method1626(arg2 + 119), 12245);
                    return;
                }
                if (arg0.equalsIgnoreCase("clientdrop")) {
                    class109.method680("Dropped client connection", 12245);
                    if (class478.field6764 != 30) {
                        if (class478.field6764 == 25) {
                            class182.field2650 = true;
                            return;
                        }
                    } else {
                        class282.method1754((byte) 125);
                    }
                    return;
                }
                if (arg0.equalsIgnoreCase("clientjs5drop")) {
                    class374.field5299.method2767(false);
                    class109.method680("Dropped client js5 net queue", arg2 + 12246);
                    return;
                }
                if (arg0.equalsIgnoreCase("serverjs5drop")) {
                    class374.field5299.method2765(arg2 + 5);
                    class109.method680("Dropped server js5 net queue", 12245);
                    return;
                }
                if (arg0.equalsIgnoreCase("breakcon")) {
                    class343.field4703.method129(-26348);
                    class237.field3339.method2633((byte) 93);
                    class374.field5299.method2766((byte) 103);
                    class109.method680("Breaking new connections for 5 seconds", 12245);
                    return;
                }
                if (arg0.equalsIgnoreCase("rebuild")) {
                    class139.method846((byte) 78);
                    class15.method152(106);
                    class109.method680("Rebuilding map", arg2 ^ -12246);
                    return;
                }
                if (arg0.equalsIgnoreCase("wm1")) {
                    class356.method2139(-1, 1, (byte) 121, false, -1);
                    if (class18.method156((byte) -98) != 1) {
                        class109.method680("wm1 failed", 12245);
                        return;
                    }
                    class109.method680("wm1 succeeded", 12245);
                    return;
                }
                if (arg0.equalsIgnoreCase("wm2")) {
                    class356.method2139(-1, 2, (byte) 119, false, -1);
                    if (~class18.method156((byte) 127) == -3) {
                        class109.method680("wm2 succeeded", 12245);
                        return;
                    }
                    class109.method680("wm2 failed", 12245);
                    return;
                }
                if (arg0.equalsIgnoreCase("wm3")) {
                    class356.method2139(768, 3, (byte) 127, false, 1024);
                    if (class18.method156((byte) -97) != 3) {
                        class109.method680("wm3 failed", arg2 + 12246);
                        return;
                    }
                    class109.method680("wm3 succeeded", 12245);
                    return;
                }
                if (arg0.equalsIgnoreCase("tk0")) {
                    class336.method2003(5, 0);
                    if (~class221.field3118 == -1) {
                        class109.method680("Entered tk0", arg2 ^ -12246);
                        class47.field768 = 0;
                        class155.method941(arg2 + 17202, class343.field4703);
                        class443.field6118 = false;
                        return;
                    }
                    class109.method680("Failed to enter tk0", 12245);
                    return;
                }
                if (arg0.equalsIgnoreCase("tk1")) {
                    class336.method2003(5, 1);
                    if (class221.field3118 == 1) {
                        class109.method680("Entered tk1", 12245);
                        class47.field768 = 1;
                        class155.method941(17201, class343.field4703);
                        class443.field6118 = false;
                        return;
                    }
                    class109.method680("Failed to enter tk1", 12245);
                    return;
                }
                if (arg0.equalsIgnoreCase("tk2")) {
                    class336.method2003(5, 2);
                    if (~class221.field3118 != -3) {
                        class109.method680("Failed to enter tk2", 12245);
                        return;
                    }
                    class109.method680("Entered tk2", 12245);
                    class47.field768 = 2;
                    class155.method941(17201, class343.field4703);
                    class443.field6118 = false;
                    return;
                }
                if (arg0.equalsIgnoreCase("tk3")) {
                    class336.method2003(5, 3);
                    if (~class221.field3118 != -4) {
                        class109.method680("Failed to enter tk3", arg2 ^ -12246);
                        return;
                    }
                    class109.method680("Entered tk3", 12245);
                    return;
                }
                if (arg0.equalsIgnoreCase("ot")) {
                    class164.field2424 = !class164.field2424;
                    class155.method941(17201, class343.field4703);
                    class443.field6118 = false;
                    class139.method846((byte) 74);
                    class109.method680("ot=" + class164.field2424, 12245);
                    return;
                }
                if (arg0.equalsIgnoreCase("gb")) {
                    class255.field3580 = !class255.field3580;
                    class155.method941(17201, class343.field4703);
                    class443.field6118 = false;
                    class139.method846((byte) 66);
                    class109.method680("gb=" + class255.field3580, 12245);
                    return;
                }
                if (arg0.startsWith("shadows")) {
                    if (arg0.length() < 8) {
                        class109.method680("Invalid shadows value", 12245);
                        return;
                    }
                    String var11 = arg0.substring(8);
                    int var12 = class363.method2207(var11, -56) ? class168.method1039(var11, false) : -1;
                    if (~var12 <= -1 && var12 <= 2) {
                        class47.field761 = var12;
                        class155.method941(17201, class343.field4703);
                        class443.field6118 = false;
                        class139.method846((byte) 88);
                        class109.method680("shadows=" + var12, arg2 + 12246);
                        return;
                    }
                    class109.method680("Invalid shadows value", 12245);
                    return;
                }
                if (arg0.startsWith("setba")) {
                    if (arg0.length() < 6) {
                        class109.method680("Invalid buildarea value", arg2 + 12246);
                        return;
                    }
                    int var13 = class168.method1039(arg0.substring(6), false);
                    if (~var13 <= -1 && ~var13 >= ~class421.method2445(class154.field2227, (byte) 45)) {
                        class222.field3135 = var13;
                        class155.method941(17201, class343.field4703);
                        class443.field6118 = false;
                        class109.method680("maxbuildarea=" + class222.field3135, arg2 ^ -12246);
                        return;
                    }
                    class109.method680("Invalid buildarea value", 12245);
                    return;
                }
                if (arg0.startsWith("setparticles")) {
                    if (~arg0.length() > -14) {
                        class109.method680("Invalid particles value", 12245);
                        return;
                    }
                    class42.method351(class168.method1039(arg0.substring(13), false), (byte) -98);
                    class155.method941(17201, class343.field4703);
                    class443.field6118 = false;
                    class109.method680("particles=" + class344.method2059(arg2 + -22510), 12245);
                    return;
                }
                if (arg0.startsWith("rect_debug")) {
                    if (arg0.length() < 10) {
                        class109.method680("Invalid rect_debug value", 12245);
                        return;
                    }
                    class365.field5208 = class168.method1039(arg0.substring(10).trim(), false);
                    class109.method680("rect_debug=" + class365.field5208, 12245);
                    return;
                }
                if (arg0.equalsIgnoreCase("qa_op_test")) {
                    class443.field6112 = true;
                    class109.method680("qa_op_test=" + class443.field6112, arg2 ^ -12246);
                    return;
                }
                if (arg0.equalsIgnoreCase("clipcomponents")) {
                    class244.field3449 = !class244.field3449;
                    class109.method680("clipcomponents=" + class244.field3449, 12245);
                    return;
                }
                if (arg0.startsWith("bloom")) {
                    boolean var14 = class338.field4636.method1096();
                    if (!class198.method1262(false, !var14)) {
                        class109.method680("Failed to enable bloom", 12245);
                        return;
                    }
                    if (!var14) {
                        class109.method680("Bloom enabled", 12245);
                        return;
                    }
                    class109.method680("Bloom disabled", 12245);
                    return;
                }
                if (arg0.equalsIgnoreCase("tween")) {
                    if (!class399.field5582) {
                        class399.field5582 = true;
                        class109.method680("Forced tweening ENABLED!", 12245);
                        return;
                    }
                    class399.field5582 = false;
                    class109.method680("Forced tweening disabled.", 12245);
                    return;
                }
                if (arg0.equalsIgnoreCase("shiftclick")) {
                    if (!class228.field3215) {
                        class109.method680("Shift-click ENABLED!", 12245);
                        class228.field3215 = true;
                        return;
                    }
                    class109.method680("Shift-click disabled.", 12245);
                    class228.field3215 = false;
                    return;
                }
                if (arg0.equalsIgnoreCase("getcgcoord")) {
                    class109.method680("x:" + (class2.field21.field6765 >> 7) + " z:" + (class2.field21.field6746 >> 7), 12245);
                    return;
                }
                if (arg0.equalsIgnoreCase("getheight")) {
                    class109.method680("Height: " + class317.field4306[class2.field21.field6766].method710(class2.field21.field6765 >> 7, class2.field21.field6746 >> 7), 12245);
                    return;
                }
                if (arg0.equalsIgnoreCase("resetminimap")) {
                    class120.field1685.method2033((byte) -55);
                    class120.field1685.method2041(arg2 + -2);
                    class425.field5861.method380(48);
                    class292.field4009.method83(118);
                    class15.method152(124);
                    class109.method680("Minimap reset", 12245);
                    return;
                }
                if (arg0.startsWith("mc")) {
                    if (class338.field4636.method1086()) {
                        int var15 = Integer.parseInt(arg0.substring(3));
                        if (var15 >= 1) {
                            if (var15 > 4) {
                                var15 = 4;
                            }
                        } else {
                            var15 = 1;
                        }
                        class459.field6468 = var15;
                        class338.field4636.method1104(class459.field6468);
                        class338.field4636.method1087(0);
                        class109.method680("Render cores now: " + class459.field6468, 12245);
                        return;
                    }
                    class109.method680("Current toolkit doesn't support multiple cores", 12245);
                    return;
                }
                if (arg0.startsWith("cachespace")) {
                    class109.method680("I(s): " + class460.field6479.method655(false) + "/" + class460.field6479.method661(arg2 + 19228), 12245);
                    class109.method680("I(m): " + class9.field184.method655(false) + "/" + class9.field184.method661(19227), 12245);
                    class109.method680("O(s): " + class58.field918.field703.method1394(1) + "/" + class58.field918.field703.method1393(0), 12245);
                    return;
                }
                if (arg0.equalsIgnoreCase("getcamerapos")) {
                    class109.method680("Pos: " + class2.field21.field6766 + "," + ((class436.field5982 >> 7) + class153.field2204 >> 6) + "," + ((class106.field1525 >> 7) + class325.field4472 >> 6) + "," + ((class436.field5982 >> 7) + class153.field2204 & 63) + "," + ((class106.field1525 >> 7) + class325.field4472 & 63) + " Height: " + (class418.method2441(class106.field1525, class2.field21.field6766, class436.field5982, -16778) - field2665), 12245);
                    class109.method680("Look: " + class2.field21.field6766 + "," + (class175.field2569 - -class153.field2204 >> 6) + "," + (class325.field4472 + class294.field4057 >> 6) + "," + (63 & class175.field2569 - -class153.field2204) + "," + (63 & class325.field4472 + class294.field4057) + " Height: " + (class418.method2441(class294.field4057, class2.field21.field6766, class175.field2569, -16778) + -class7.field124), 12245);
                    return;
                }
                if (arg0.equals("showocc")) {
                    field2654 = !field2654;
                    class139.method846((byte) 93);
                    class109.method680("showocc=" + field2654, 12245);
                    return;
                }
                if (arg0.equals("renderprofile") || arg0.equals("rp")) {
                    class243.field3446 = !class243.field3446;
                    class338.field4636.method1100(class243.field3446);
                    class70.method492(6);
                    class109.method680("showprofiling=" + class243.field3446, 12245);
                    return;
                }
                if (arg0.equals("nonpcs")) {
                    class80.field1209 = !class80.field1209;
                    class109.method680("nonpcs=" + class80.field1209, 12245);
                    return;
                }
                if (arg0.equals("autoworld")) {
                    class157.method953(-87);
                    class109.method680("auto world selected", 12245);
                    return;
                }
                if (arg0.equals("heap")) {
                    class109.method680("Heap: " + class154.field2227 + "MB", arg2 ^ -12246);
                    return;
                }
                if (arg0.equals("savevarcs")) {
                    class10.method99(126);
                    class109.method680("perm varcs saved", 12245);
                    return;
                }
                if (arg0.equals("scramblevarcs")) {
                    for (int var16 = 0; class64.field975.length > var16; ++var16) {
                        if (class2.field19[var16]) {
                            class64.field975[var16] = (int) (99999.0D * Math.random());
                            if (Math.random() > 0.5D) {
                                class64.field975[var16] *= -1;
                            }
                        }
                    }
                    class10.method99(arg2 + 125);
                    class109.method680("perm varcs scrambled", 12245);
                    return;
                }
                if (arg0.equals("showcolmap")) {
                    class467.field6548 = true;
                    class15.method152(120);
                    class109.method680("colmap is shown", 12245);
                    return;
                }
                if (arg0.equals("hidecolmap")) {
                    class467.field6548 = false;
                    class15.method152(119);
                    class109.method680("colmap is hidden", 12245);
                    return;
                }
                if (arg0.equals("resetcache")) {
                    class441.method2559(true);
                    class109.method680("Caches reset", arg2 ^ -12246);
                    return;
                }
                if (arg0.equals("profilecpu")) {
                    class109.method680(class245.method1526(13712) + "ms", 12245);
                    return;
                }
                if (arg0.startsWith("cpuusage")) {
                    int var17 = Integer.parseInt(arg0.substring(9));
                    if (var17 >= 0 && var17 <= 4) {
                        class205.field2933 = var17;
                    }
                    class109.method680("cpuusage=" + class205.field2933, arg2 + 12246);
                    return;
                }
                if (~class478.field6764 == -31) {
                    ++class215.field3053;
                    class131.method793(class222.field3123, -46);
                    class366.field5214.method2470((byte) -74, arg0.length() - -2);
                    class366.field5214.method2470((byte) -74, arg1 ? 1 : 0);
                    class366.field5214.method2493((byte) -121, arg0);
                }
                if (arg0.startsWith("fps ") && class96.field1373 != class396.field5558) {
                    class376.method2246(false, class168.method1039(arg0.substring(4), false));
                    return;
                }
                if (class478.field6764 != 30) {
                    class109.method680("Unrecogonised commmand when not logged in: " + arg0, 12245);
                }
            } catch (Exception var18) {
                class109.method680("Whoops, something went wrong.", arg2 + 12246);
            }
        }
        if (arg2 != -1) {
            method1200((String) null, true, -21);
        }
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(B)I")
    public final int method417(byte arg0) {
        ++field2660;
        if (this.field2663 == null) {
            return 0;
        } else {
            int var2 = -82 / ((arg0 - -9) / 56);
            return this.field2663.field5830 * 100 / (this.field2663.field5886.length - this.field2655);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BI)V")
    public static final void method1201(byte arg0, int arg1) {
        if (arg0 > -85) {
            field2665 = 121;
        }
        class266.field3706 = -1;
        ++field2658;
        class192.field2753 = arg1;
        class84.field1265 = -1;
        class330.method1970(8142);
    }

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "(I)V")
    public static void method1202(int arg0) {
        field2656 = null;
        if (arg0 != 4) {
            field2665 = 27;
        }
        field2667 = null;
    }

    static {
        new class112("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
    }
}
