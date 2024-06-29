import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class497 extends class209 {

    @OriginalMember(owner = "client!ip", name = "z", descriptor = "I")
    public static int field6888 = -1;

    @OriginalMember(owner = "client!ip", name = "v", descriptor = "I")
    public static int field6884;

    @OriginalMember(owner = "client!ip", name = "w", descriptor = "I")
    public static int field6885;

    @OriginalMember(owner = "client!ip", name = "y", descriptor = "I")
    public static int field6887;

    @OriginalMember(owner = "client!ip", name = "A", descriptor = "I")
    public static int field6889;

    @OriginalMember(owner = "client!ip", name = "B", descriptor = "I")
    public static int field6890;

    @OriginalMember(owner = "client!ip", name = "C", descriptor = "I")
    public static int field6891;

    @OriginalMember(owner = "client!ip", name = "D", descriptor = "I")
    public static int field6892;

    @OriginalMember(owner = "client!ip", name = "u", descriptor = "Ljs;")
    public static class216 field6883;

    @OriginalMember(owner = "client!ip", name = "x", descriptor = "[[[Lht;")
    public static class409[][][] field6886;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIIIIZ)V", line = 4)
    public static final void method2849(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field6889++;
        long var6 = (long) (arg1 | (arg5 ? Integer.MIN_VALUE : 0));
        class32 var8 = (class32) class306.field4038.method182(var6, (byte) 101);
        if (var8 == null) {
            var8 = new class32();
            class306.field4038.method173(var6, var8, (byte) 120);
        }
        if (var8.field527.length <= arg4) {
            int[] var9 = new int[arg4 + 1];
            int[] var10 = new int[arg4 + 1];
            for (int var11 = 0; var11 < var8.field527.length; var11++) {
                var9[var11] = var8.field527[var11];
                var10[var11] = var8.field524[var11];
            }
            for (int var12 = var8.field527.length; var12 < arg4; var12++) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field527 = var9;
            var8.field524 = var10;
        }
        var8.field527[arg4] = arg0;
        var8.field524[arg4] = arg3;
        if (arg2 > -69) {
            method2853(24, 93);
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Ljava/lang/String;IZ)V", line = 63)
    public static final void method2850(String arg0, int arg1, boolean arg2) {
        field6890++;
        if (arg1 != 29685) {
            method2852(38, null);
        }
        if (class281.field3698 == class168.field2433 && class196.field2745 < 2) {
            return;
        }
        if (arg0.equalsIgnoreCase("errortest")) {
            throw new RuntimeException();
        }
        try {
            if (arg0.equalsIgnoreCase("fpson")) {
                class290.field3801 = true;
                class176.method1181("fps debug enabled", false);
                return;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                class290.field3801 = false;
                class176.method1181("fps debug disabled", false);
                return;
            }
            if (arg0.equalsIgnoreCase("cls")) {
                class53.field834 = 0;
                class141.field2042 = 0;
                return;
            }
            if (arg0.equalsIgnoreCase("cleartext")) {
                class321.field4209.method1775((byte) 127);
                class176.method1181("Text coords cleared", false);
                return;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                class370.method2141(78);
                for (int var3 = 0; var3 < 10; var3++) {
                    System.gc();
                }
                Runtime var4 = Runtime.getRuntime();
                int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
                class176.method1181("mem=" + var5 + "k", false);
                return;
            }
            if (arg0.equalsIgnoreCase("compact")) {
                class370.method2141(109);
                for (int var6 = 0; var6 < 10; var6++) {
                    System.gc();
                }
                Runtime var7 = Runtime.getRuntime();
                int var8 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                class176.method1181("Memory before cleanup=" + var8 + "k", false);
                class195.method1248((byte) -97);
                class370.method2141(arg1 ^ 0x7391);
                for (int var9 = 0; var9 < 10; var9++) {
                    System.gc();
                }
                int var10 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                class176.method1181("Memory after cleanup=" + var10 + "k", false);
                return;
            }
            if (arg0.equalsIgnoreCase("pcachesize")) {
                class176.method1181("Number of player models in cache:" + class23.method207(-119), false);
                return;
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                class176.method1181("Dropped client connection", false);
                if (class454.field6161 == 30) {
                    class467.method2651((byte) -48);
                } else if (class454.field6161 == 25) {
                    class407.field5593 = true;
                    return;
                }
                return;
            }
            if (arg0.equalsIgnoreCase("clientjs5drop")) {
                class287.field3760.method1548(-2);
                class176.method1181("Dropped client js5 net queue", false);
                return;
            }
            if (arg0.equalsIgnoreCase("serverjs5drop")) {
                class287.field3760.method1556(false);
                class176.method1181("Dropped server js5 net queue", false);
                return;
            }
            if (arg0.equalsIgnoreCase("breakcon")) {
                class389.field5281.method1361(3);
                class304.field4004.method1883((byte) -29);
                class287.field3760.method1551((byte) 43);
                class176.method1181("Breaking new connections for 5 seconds", false);
                return;
            }
            if (arg0.equalsIgnoreCase("rebuild")) {
                class228.method1426((byte) 127);
                class54.method398((byte) 21);
                class176.method1181("Rebuilding map", false);
                return;
            }
            if (arg0.equalsIgnoreCase("wm1")) {
                class412.method2388(-27, false, -1, -1, 1);
                if (class170.method1136((byte) 119) == 1) {
                    class176.method1181("wm1 succeeded", false);
                    return;
                }
                class176.method1181("wm1 failed", false);
                return;
            }
            if (arg0.equalsIgnoreCase("wm2")) {
                class412.method2388(arg1 - 29584, false, -1, -1, 2);
                if (class170.method1136((byte) 95) != 2) {
                    class176.method1181("wm2 failed", false);
                    return;
                }
                class176.method1181("wm2 succeeded", false);
                return;
            }
            if (arg0.equalsIgnoreCase("wm3")) {
                class412.method2388(arg1 ^ 0x739B, false, 768, 1024, 3);
                if (class170.method1136((byte) 75) == 3) {
                    class176.method1181("wm3 succeeded", false);
                    return;
                }
                class176.method1181("wm3 failed", false);
                return;
            }
            if (arg0.equalsIgnoreCase("tk0")) {
                class258.method1562(0, (byte) 82);
                if (class166.field2414 == 0) {
                    class176.method1181("Entered tk0", false);
                    class154.field2244.field7743 = 0;
                    class154.field2244.method1852(class389.field5281, (byte) -37);
                    class121.field1774 = false;
                    return;
                }
                class176.method1181("Failed to enter tk0", false);
                return;
            }
            if (arg0.equalsIgnoreCase("tk1")) {
                class258.method1562(1, (byte) 87);
                if (class166.field2414 == 1) {
                    class176.method1181("Entered tk1", false);
                    class154.field2244.field7743 = 1;
                    class154.field2244.method1852(class389.field5281, (byte) -89);
                    class121.field1774 = false;
                    return;
                }
                class176.method1181("Failed to enter tk1", false);
                return;
            }
            if (arg0.equalsIgnoreCase("tk2")) {
                class258.method1562(2, (byte) 117);
                if (class166.field2414 != 2) {
                    class176.method1181("Failed to enter tk2", false);
                    return;
                }
                class176.method1181("Entered tk2", false);
                class154.field2244.field7743 = 2;
                class154.field2244.method1852(class389.field5281, (byte) 127);
                class121.field1774 = false;
                return;
            }
            if (arg0.equalsIgnoreCase("tk3")) {
                class258.method1562(3, (byte) 117);
                if (class166.field2414 == 3) {
                    class176.method1181("Entered tk3", false);
                    return;
                }
                class176.method1181("Failed to enter tk3", false);
                return;
            }
            if (arg0.equalsIgnoreCase("ot")) {
                class154.field2244.field7745 = !class154.field2244.field7745;
                class154.field2244.method1852(class389.field5281, (byte) 118);
                class121.field1774 = false;
                class228.method1426((byte) 127);
                class176.method1181("ot=" + class154.field2244.field7745, false);
                return;
            }
            if (arg0.equalsIgnoreCase("gb")) {
                class154.field2244.field7744 = !class154.field2244.field7744;
                class154.field2244.method1852(class389.field5281, (byte) -63);
                class121.field1774 = false;
                class228.method1426((byte) 127);
                class176.method1181("gb=" + class154.field2244.field7744, false);
                return;
            }
            if (arg0.startsWith("shadows")) {
                if (arg0.length() < 8) {
                    class176.method1181("Invalid shadows value", false);
                    return;
                }
                String var11 = arg0.substring(8);
                int var12 = class80.method495(var11, (byte) 110) ? class300.method1752(true, var11) : -1;
                if (var12 >= 0 && var12 <= 2) {
                    class154.field2244.method3087(var12, 2, class166.field2414);
                    class154.field2244.method1852(class389.field5281, (byte) 22);
                    class121.field1774 = false;
                    class228.method1426((byte) 127);
                    class176.method1181("shadows=" + var12, false);
                    return;
                }
                class176.method1181("Invalid shadows value", false);
                return;
            }
            if (arg0.startsWith("textures")) {
                class154.field2244.field7754 = !class154.field2244.field7754;
                class154.field2244.method1852(class389.field5281, (byte) -20);
                class121.field1774 = false;
                class72.method471(30);
                class228.method1426((byte) 127);
                class176.method1181("textures=" + class154.field2244.field7754, false);
                return;
            }
            if (arg0.startsWith("setba")) {
                if (arg0.length() < 6) {
                    class176.method1181("Invalid buildarea value", false);
                    return;
                }
                int var13 = class300.method1752(true, arg0.substring(6));
                if (var13 >= 0 && class425.method2445(arg1 ^ 0x7395, class199.field2765) >= var13) {
                    class154.field2244.field7768 = var13;
                    class154.field2244.method1852(class389.field5281, (byte) -25);
                    class121.field1774 = false;
                    class176.method1181("maxbuildarea=" + class154.field2244.field7768, false);
                    return;
                }
                class176.method1181("Invalid buildarea value", false);
                return;
            }
            if (arg0.startsWith("setparticles")) {
                if (arg0.length() < 13) {
                    class176.method1181("Invalid particles value", false);
                    return;
                }
                class201.method1285(-3, class300.method1752(true, arg0.substring(13)));
                class154.field2244.method1852(class389.field5281, (byte) 127);
                class121.field1774 = false;
                class176.method1181("particles=" + class518.method3047((byte) 32), false);
                return;
            }
            if (arg0.startsWith("rect_debug")) {
                if (arg0.length() < 10) {
                    class176.method1181("Invalid rect_debug value", false);
                    return;
                }
                class67.field1030 = class300.method1752(true, arg0.substring(10).trim());
                class176.method1181("rect_debug=" + class67.field1030, false);
                return;
            }
            if (arg0.equalsIgnoreCase("qa_op_test")) {
                class299.field3964 = true;
                class176.method1181("qa_op_test=" + class299.field3964, false);
                return;
            }
            if (arg0.equalsIgnoreCase("clipcomponents")) {
                class4.field113 = !class4.field113;
                class176.method1181("clipcomponents=" + class4.field113, false);
                return;
            }
            if (arg0.startsWith("bloom")) {
                boolean var14 = class370.field4984.method581();
                if (!class362.method2105(true, !var14)) {
                    class176.method1181("Failed to enable bloom", false);
                    return;
                }
                if (var14) {
                    class176.method1181("Bloom disabled", false);
                    return;
                }
                class176.method1181("Bloom enabled", false);
                return;
            }
            if (arg0.equalsIgnoreCase("tween")) {
                if (!class89.field1364) {
                    class89.field1364 = true;
                    class176.method1181("Forced tweening ENABLED!", false);
                    return;
                }
                class89.field1364 = false;
                class176.method1181("Forced tweening disabled.", false);
                return;
            }
            if (arg0.equalsIgnoreCase("shiftclick")) {
                if (class39.field597) {
                    class176.method1181("Shift-click disabled.", false);
                    class39.field597 = false;
                    return;
                }
                class176.method1181("Shift-click ENABLED!", false);
                class39.field597 = true;
                return;
            }
            if (arg0.equalsIgnoreCase("getcgcoord")) {
                class176.method1181("x:" + (class385.field5232.field584 >> 7) + " z:" + (class385.field5232.field574 >> 7), false);
                return;
            }
            if (arg0.equalsIgnoreCase("getheight")) {
                class176.method1181("Height: " + class141.field2049[class385.field5232.field573].method272(class385.field5232.field584 >> 7, class385.field5232.field574 >> 7), false);
                return;
            }
            if (arg0.equalsIgnoreCase("resetminimap")) {
                class71.field1082.method2700((byte) 58);
                class71.field1082.method2718(100);
                class466.field6434.method377(true);
                class267.field3522.method1013(87);
                class54.method398((byte) 21);
                class176.method1181("Minimap reset", false);
                return;
            }
            if (arg0.startsWith("mc")) {
                if (!class370.field4984.method567()) {
                    class176.method1181("Current toolkit doesn't support multiple cores", false);
                    return;
                }
                int var15 = Integer.parseInt(arg0.substring(3));
                if (var15 < 1) {
                    var15 = 1;
                } else if (var15 > 4) {
                    var15 = 4;
                }
                class22.field391 = var15;
                class370.field4984.method535(class22.field391);
                class370.field4984.method625(0);
                class176.method1181("Render cores now: " + class22.field391, false);
                return;
            }
            if (arg0.startsWith("cachespace")) {
                class176.method1181("I(s): " + class93.field1409.method1457((byte) 22) + "/" + class93.field1409.method1465((byte) 55), false);
                class176.method1181("I(m): " + class347.field4676.method1457((byte) 22) + "/" + class347.field4676.method1465((byte) 5), false);
                class176.method1181("O(s): " + class127.field1852.field5721.method2026((byte) 112) + "/" + class127.field1852.field5721.method2030((byte) 94), false);
                return;
            }
            if (arg0.equalsIgnoreCase("getcamerapos")) {
                class176.method1181("Pos: " + class385.field5232.field573 + "," + ((class430.field5888 >> 7) + class401.field5382 >> 6) + "," + ((class168.field2438 >> 7) + class421.field5762 >> 6) + "," + ((class430.field5888 >> 7) + class401.field5382 & 0x3F) + "," + ((class168.field2438 >> 7) + class421.field5762 & 0x3F) + " Height: " + (class210.method1330(class385.field5232.field573, (byte) -96, class430.field5888, class168.field2438) - class365.field4937), false);
                class176.method1181("Look: " + class385.field5232.field573 + "," + (class31.field511 + class401.field5382 >> 6) + "," + (class315.field4134 + class421.field5762 >> 6) + "," + (class401.field5382 + class31.field511 & 0x3F) + "," + (class315.field4134 + class421.field5762 & 0x3F) + " Height: " + (class210.method1330(class385.field5232.field573, (byte) -122, class31.field511, class315.field4134) - class40.field606), false);
                return;
            }
            if (arg0.equals("showocc")) {
                class57.field885 = !class57.field885;
                class228.method1426((byte) 127);
                class176.method1181("showocc=" + class57.field885, false);
                return;
            }
            if (arg0.equals("wallocc")) {
                class83.field1240 = !class83.field1240;
                class228.method1426((byte) 127);
                class176.method1181("forcewallocc=" + class83.field1240, false);
                return;
            }
            if (arg0.equals("renderprofile") || arg0.equals("rp")) {
                class140.field2039 = !class140.field2039;
                class370.field4984.method532(class140.field2039);
                class471.method2678(arg1 ^ 0xFFFF8C73);
                class176.method1181("showprofiling=" + class140.field2039, false);
                return;
            }
            if (arg0.equals("performancetest")) {
                class176.method1181("Java toolkit: " + class355.method2074(false, 0, class389.field5281), false);
                class176.method1181("GL toolkit:   " + class355.method2074(false, 1, class389.field5281), false);
                class176.method1181("SSE toolkit:  " + class355.method2074(false, 2, class389.field5281), false);
                return;
            }
            if (arg0.equals("nonpcs")) {
                class42.field631 = !class42.field631;
                class176.method1181("nonpcs=" + class42.field631, false);
                return;
            }
            if (arg0.equals("autoworld")) {
                class481.method2764(0);
                class176.method1181("auto world selected", false);
                return;
            }
            if (arg0.startsWith("pc")) {
                class118.method822(126, class267.field3516);
                class193.field2708.method2200(arg1 ^ 0x73F2, 0);
                int var16 = class193.field2708.field5173;
                int var17 = arg0.indexOf(" ", 4);
                class193.field2708.method2216(arg0.substring(3, var17), -128);
                class423.method2439(arg0.substring(var17), -3097, class193.field2708);
                class193.field2708.method2210(class193.field2708.field5173 - var16, (byte) 97);
                return;
            }
            if (arg0.equals("heap")) {
                class176.method1181("Heap: " + class199.field2765 + "MB", false);
                return;
            }
            if (arg0.equals("savevarcs")) {
                class519.method3060((byte) -123);
                class176.method1181("perm varcs saved", false);
                return;
            }
            if (arg0.equals("scramblevarcs")) {
                for (int var18 = 0; var18 < class98.field1478.length; var18++) {
                    if (class131.field1900[var18]) {
                        class98.field1478[var18] = (int) (Math.random() * 99999.0D);
                        if (Math.random() > 0.5D) {
                            class98.field1478[var18] *= -1;
                        }
                    }
                }
                class519.method3060((byte) -112);
                class176.method1181("perm varcs scrambled", false);
                return;
            }
            if (arg0.equals("showcolmap")) {
                class441.field6048 = true;
                class54.method398((byte) 21);
                class176.method1181("colmap is shown", false);
                return;
            }
            if (arg0.equals("hidecolmap")) {
                class441.field6048 = false;
                class54.method398((byte) 21);
                class176.method1181("colmap is hidden", false);
                return;
            }
            if (arg0.equals("resetcache")) {
                class129.method924(-10808);
                class176.method1181("Caches reset", false);
                return;
            }
            if (arg0.equals("profilecpu")) {
                class176.method1181(class427.method2462(0) + "ms", false);
                return;
            }
            if (arg0.startsWith("cpuusage")) {
                int var19 = Integer.parseInt(arg0.substring(9));
                if (var19 >= 0 && var19 <= 4) {
                    class154.field2244.field7761 = var19;
                }
                class176.method1181("cpuusage=" + class154.field2244.field7761, false);
                return;
            }
            if (arg0.startsWith("getclientvarpbit")) {
                int var20 = Integer.parseInt(arg0.substring(17));
                class176.method1181("varpbit=" + class301.field3980.method1395(var20, (byte) 113), false);
                return;
            }
            if (arg0.startsWith("getclientvarp")) {
                int var21 = Integer.parseInt(arg0.substring(14));
                class176.method1181("varp=" + class301.field3980.method1394(arg1 - 29579, var21), false);
                return;
            }
            if (arg0.startsWith("csprofileclear")) {
                class122.method895();
                return;
            }
            if (arg0.startsWith("csprofileoutputc")) {
                class122.method889(100, false);
                return;
            }
            if (arg0.startsWith("csprofileoutputt")) {
                class122.method889(10, true);
                return;
            }
            if (arg0.startsWith("texsize")) {
                int var22 = Integer.parseInt(arg0.substring(8));
                class370.field4984.method593(var22);
                return;
            }
            if (arg0.equals("soundstreamcount")) {
                class176.method1181("Active streams: " + class318.field4175.method3067(), false);
                return;
            }
            if (class454.field6161 == 30) {
                class118.method822(127, class265.field3505);
                class250.field3325++;
                class193.field2708.method2200(arg1 - 29678, arg0.length() + 2);
                class193.field2708.method2200(arg1 ^ 0x73F2, arg2 ? 1 : 0);
                class193.field2708.method2216(arg0, arg1 ^ 0xFFFF8C75);
            }
            if (arg0.startsWith("fps ") && class281.field3698 != class168.field2433) {
                class176.method1179((byte) 103, class300.method1752(true, arg0.substring(4)));
                return;
            }
            if (class454.field6161 != 30) {
                class176.method1181("Unrecogonised commmand when not logged in: " + arg0, false);
                return;
            }
        } catch (Exception var23) {
            class176.method1181("Whoops, something went wrong.", false);
            return;
        }
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(B)V", line = 812)
    public static void method2851(byte arg0) {
        field6886 = null;
        field6883 = null;
        if (arg0 != -20) {
            field6892 = 22;
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(I[[[Lht;)V", line = 830)
    public static final void method2852(int arg0, class409[][][] arg1) {
        field6885++;
        int var2 = 0;
        int var3 = -9 % ((-arg0 - 41) / 62);
        while (var2 < arg1.length) {
            class409[][] var4 = arg1[var2];
            for (int var5 = 0; var5 < var4.length; var5++) {
                for (int var6 = 0; var6 < var4[var5].length; var6++) {
                    class409 var7 = var4[var5][var6];
                    if (var7 != null) {
                        if (var7.field5618 instanceof class338) {
                            ((class338) var7.field5618).method342(110);
                        }
                        if (var7.field5625 instanceof class338) {
                            ((class338) var7.field5625).method342(-9);
                        }
                        if (var7.field5628 instanceof class338) {
                            ((class338) var7.field5628).method342(-89);
                        }
                        if (var7.field5627 instanceof class338) {
                            ((class338) var7.field5627).method342(124);
                        }
                        if (var7.field5607 instanceof class338) {
                            ((class338) var7.field5607).method342(110);
                        }
                        for (class165 var8 = var7.field5630; var8 != null; var8 = var8.field2400) {
                            class37 var9 = var8.field2402;
                            if (var9 instanceof class338) {
                                ((class338) var9).method342(111);
                            }
                        }
                    }
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(II)V", line = 904)
    public static final void method2853(int arg0, int arg1) {
        class236 var2 = class388.field5270;
        synchronized (class388.field5270) {
            class388.field5270.method1461(arg0 - 1808474380, arg1);
        }
        field6887++;
        if (arg0 != 1808474375) {
            method2851((byte) 34);
        }
        class236 var3 = class165.field2408;
        synchronized (class165.field2408) {
            class165.field2408.method1461(-5, arg1);
        }
    }
}
