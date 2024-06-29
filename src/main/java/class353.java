import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class353 {

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "Lch;")
    public static class151 field4851 = new class151("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "[I")
    public static int[] field4856 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "Ljava/lang/String;")
    public static String field4857 = "";

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public static int field4850;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    public static int field4852;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "Lpt;")
    public static class362 field4854;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "Z")
    public static boolean field4855;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "[I")
    public static int[] field4853;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)V")
    public static final void method2175(int arg0, int arg1) {
        field4848++;
        class334 var2 = class352.method2172(arg0, 2, arg1 ^ 0xFF00F9);
        var2.method2099(true);
        if (arg1 != 6) {
            method2178((Throwable) null, (String) null);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZILjava/lang/String;)V")
    public static final void method2176(boolean arg0, int arg1, String arg2) {
        field4850++;
        int var3 = -112 % ((5 - arg1) / 54);
        if (class480.field6799 == class389.field5379 && class255.field3661 < 2) {
            return;
        }
        if (arg2.equalsIgnoreCase("errortest")) {
            throw new RuntimeException();
        }
        try {
            if (arg2.equalsIgnoreCase("fpson")) {
                class76.field1129 = true;
                class94.method790("fps debug enabled", -30123);
                return;
            }
            if (arg2.equalsIgnoreCase("fpsoff")) {
                class76.field1129 = false;
                class94.method790("fps debug disabled", -30123);
                return;
            }
            if (arg2.equalsIgnoreCase("cls")) {
                class75.field1079 = 0;
                class213.field3102 = 0;
                return;
            }
            if (arg2.equalsIgnoreCase("cleartext")) {
                class271.field3945.method1772((byte) 108);
                class94.method790("Text coords cleared", -30123);
                return;
            }
            if (arg2.equalsIgnoreCase("gc")) {
                class435.method2656(0);
                for (int var4 = 0; var4 < 10; var4++) {
                    System.gc();
                }
                Runtime var5 = Runtime.getRuntime();
                int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
                class94.method790("mem=" + var6 + "k", -30123);
                return;
            }
            if (arg2.equalsIgnoreCase("compact")) {
                class435.method2656(0);
                for (int var7 = 0; var7 < 10; var7++) {
                    System.gc();
                }
                Runtime var8 = Runtime.getRuntime();
                int var9 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
                class94.method790("Memory before cleanup=" + var9 + "k", -30123);
                class309.method1975(35);
                class435.method2656(0);
                for (int var10 = 0; var10 < 10; var10++) {
                    System.gc();
                }
                int var11 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
                class94.method790("Memory after cleanup=" + var11 + "k", -30123);
                return;
            }
            if (arg2.equalsIgnoreCase("pcachesize")) {
                class94.method790("Number of player models in cache:" + class201.method1398((byte) 56), -30123);
                return;
            }
            if (arg2.equalsIgnoreCase("clientdrop")) {
                class94.method790("Dropped client connection", -30123);
                if (class347.field4787 == 30) {
                    class480.method2836(-5517);
                } else if (class347.field4787 == 25) {
                    class225.field3246 = true;
                    return;
                }
                return;
            }
            if (arg2.equalsIgnoreCase("clientjs5drop")) {
                class380.field5220.method2466(0);
                class94.method790("Dropped client js5 net queue", -30123);
                return;
            }
            if (arg2.equalsIgnoreCase("serverjs5drop")) {
                class380.field5220.method2474(0);
                class94.method790("Dropped server js5 net queue", -30123);
                return;
            }
            if (arg2.equalsIgnoreCase("breakcon")) {
                class436.field6206.method594(5000);
                class394.field5440.method2091(115);
                class380.field5220.method2472(0);
                class94.method790("Breaking new connections for 5 seconds", -30123);
                return;
            }
            if (arg2.equalsIgnoreCase("rebuild")) {
                class150.method1076(127);
                class184.method1311((byte) -57);
                class94.method790("Rebuilding map", -30123);
                return;
            }
            if (arg2.equalsIgnoreCase("wm1")) {
                class241.method1677(1, -1, -1, false, true);
                if (class448.method2708(0) != 1) {
                    class94.method790("wm1 failed", -30123);
                    return;
                }
                class94.method790("wm1 succeeded", -30123);
                return;
            }
            if (arg2.equalsIgnoreCase("wm2")) {
                class241.method1677(2, -1, -1, false, true);
                if (class448.method2708(0) == 2) {
                    class94.method790("wm2 succeeded", -30123);
                    return;
                }
                class94.method790("wm2 failed", -30123);
                return;
            }
            if (arg2.equalsIgnoreCase("wm3")) {
                class241.method1677(3, 1024, 768, false, true);
                if (class448.method2708(0) == 3) {
                    class94.method790("wm3 succeeded", -30123);
                    return;
                }
                class94.method790("wm3 failed", -30123);
                return;
            }
            if (arg2.equalsIgnoreCase("tk0")) {
                class136.method1006(0, -46);
                if (class377.field5192 == 0) {
                    class94.method790("Entered tk0", -30123);
                    class211.field3082 = 0;
                    class77.method681(class436.field6206, (byte) 51);
                    class385.field5284 = false;
                    return;
                }
                class94.method790("Failed to enter tk0", -30123);
                return;
            }
            if (arg2.equalsIgnoreCase("tk1")) {
                class136.method1006(1, -126);
                if (class377.field5192 != 1) {
                    class94.method790("Failed to enter tk1", -30123);
                    return;
                }
                class94.method790("Entered tk1", -30123);
                class211.field3082 = 1;
                class77.method681(class436.field6206, (byte) 51);
                class385.field5284 = false;
                return;
            }
            if (arg2.equalsIgnoreCase("tk2")) {
                class136.method1006(2, -43);
                if (class377.field5192 != 2) {
                    class94.method790("Failed to enter tk2", -30123);
                    return;
                }
                class94.method790("Entered tk2", -30123);
                class211.field3082 = 2;
                class77.method681(class436.field6206, (byte) 51);
                class385.field5284 = false;
                return;
            }
            if (arg2.equalsIgnoreCase("tk3")) {
                class136.method1006(3, -79);
                if (class377.field5192 != 3) {
                    class94.method790("Failed to enter tk3", -30123);
                    return;
                }
                class94.method790("Entered tk3", -30123);
                return;
            }
            if (arg2.equalsIgnoreCase("ot")) {
                class130.field1777 = !class130.field1777;
                class77.method681(class436.field6206, (byte) 51);
                class385.field5284 = false;
                class150.method1076(121);
                class94.method790("ot=" + class130.field1777, -30123);
                return;
            }
            if (arg2.equalsIgnoreCase("gb")) {
                class89.field1269 = !class89.field1269;
                class77.method681(class436.field6206, (byte) 51);
                class385.field5284 = false;
                class150.method1076(118);
                class94.method790("gb=" + class89.field1269, -30123);
                return;
            }
            if (arg2.startsWith("shadows")) {
                if (arg2.length() < 8) {
                    class94.method790("Invalid shadows value", -30123);
                    return;
                }
                String var12 = arg2.substring(8);
                int var13 = class105.method839(56, var12) ? class270.method1827(var12, false) : -1;
                if (var13 >= 0 && var13 <= 2) {
                    class99.field1396 = var13;
                    class77.method681(class436.field6206, (byte) 51);
                    class385.field5284 = false;
                    class150.method1076(119);
                    class94.method790("shadows=" + var13, -30123);
                    return;
                }
                class94.method790("Invalid shadows value", -30123);
                return;
            }
            if (arg2.startsWith("setba")) {
                if (arg2.length() < 6) {
                    class94.method790("Invalid buildarea value", -30123);
                    return;
                }
                int var14 = class270.method1827(arg2.substring(6), false);
                if (var14 >= 0 && var14 <= class169.method1232(class364.field5008, -4203)) {
                    class443.field6300 = var14;
                    class77.method681(class436.field6206, (byte) 51);
                    class385.field5284 = false;
                    class94.method790("maxbuildarea=" + class443.field6300, -30123);
                    return;
                }
                class94.method790("Invalid buildarea value", -30123);
                return;
            }
            if (arg2.startsWith("setparticles")) {
                if (arg2.length() < 13) {
                    class94.method790("Invalid particles value", -30123);
                    return;
                }
                class150.method1073(class270.method1827(arg2.substring(13), false), (byte) 16);
                class77.method681(class436.field6206, (byte) 51);
                class385.field5284 = false;
                class94.method790("particles=" + class267.method1803(-121), -30123);
                return;
            }
            if (arg2.startsWith("rect_debug")) {
                if (arg2.length() < 10) {
                    class94.method790("Invalid rect_debug value", -30123);
                    return;
                }
                class419.field5821 = class270.method1827(arg2.substring(10).trim(), false);
                class94.method790("rect_debug=" + class419.field5821, -30123);
                return;
            }
            if (arg2.equalsIgnoreCase("qa_op_test")) {
                class79.field1162 = true;
                class94.method790("qa_op_test=" + class79.field1162, -30123);
                return;
            }
            if (arg2.equalsIgnoreCase("clipcomponents")) {
                class8.field63 = !class8.field63;
                class94.method790("clipcomponents=" + class8.field63, -30123);
                return;
            }
            if (arg2.startsWith("bloom")) {
                boolean var15 = class374.field5152.method379();
                if (class172.method1248(!var15, (byte) -105)) {
                    if (var15) {
                        class94.method790("Bloom disabled", -30123);
                        return;
                    }
                    class94.method790("Bloom enabled", -30123);
                    return;
                }
                class94.method790("Failed to enable bloom", -30123);
                return;
            }
            if (arg2.equalsIgnoreCase("tween")) {
                if (class439.field6230) {
                    class439.field6230 = false;
                    class94.method790("Forced tweening disabled.", -30123);
                    return;
                }
                class439.field6230 = true;
                class94.method790("Forced tweening ENABLED!", -30123);
                return;
            }
            if (arg2.equalsIgnoreCase("shiftclick")) {
                if (!class243.field3533) {
                    class94.method790("Shift-click ENABLED!", -30123);
                    class243.field3533 = true;
                    return;
                }
                class94.method790("Shift-click disabled.", -30123);
                class243.field3533 = false;
                return;
            }
            if (arg2.equalsIgnoreCase("getcgcoord")) {
                class94.method790("x:" + (class262.field3781.field4537 >> 7) + " z:" + (class262.field3781.field4530 >> 7), -30123);
                return;
            }
            if (arg2.equalsIgnoreCase("getheight")) {
                class94.method790("Height: " + class340.field4692[class262.field3781.field4531].method591(class262.field3781.field4537 >> 7, class262.field3781.field4530 >> 7), -30123);
                return;
            }
            if (arg2.equalsIgnoreCase("resetminimap")) {
                class454.field6440.method2631((byte) -128);
                class454.field6440.method2651(1);
                class449.field6390.method841(83);
                class53.field788.method2315(0);
                class184.method1311((byte) -77);
                class94.method790("Minimap reset", -30123);
                return;
            }
            if (arg2.startsWith("mc")) {
                if (class374.field5152.method432()) {
                    int var16 = Integer.parseInt(arg2.substring(3));
                    if (var16 < 1) {
                        var16 = 1;
                    } else if (var16 > 4) {
                        var16 = 4;
                    }
                    class285.field4081 = var16;
                    class374.field5152.method357(class285.field4081);
                    class374.field5152.method314(0);
                    class94.method790("Render cores now: " + class285.field4081, -30123);
                    return;
                }
                class94.method790("Current toolkit doesn't support multiple cores", -30123);
                return;
            }
            if (arg2.startsWith("cachespace")) {
                class94.method790("I(s): " + class380.field5227.method2114(-4160) + "/" + class380.field5227.method2107(81), -30123);
                class94.method790("I(m): " + class408.field5588.method2114(-4160) + "/" + class408.field5588.method2107(80), -30123);
                class94.method790("O(s): " + class373.field5128.field3466.method2854(7155) + "/" + class373.field5128.field3466.method2855(-330769982), -30123);
                return;
            }
            if (arg2.equalsIgnoreCase("getcamerapos")) {
                class94.method790("Pos: " + class262.field3781.field4531 + "," + ((class135.field1884 >> 7) + class279.field4012 >> 6) + "," + ((class184.field2784 >> 7) + class189.field2810 >> 6) + "," + ((class135.field1884 >> 7) + class279.field4012 & 0x3F) + "," + ((class184.field2784 >> 7) + class189.field2810 & 0x3F) + " Height: " + (class407.method2440(class135.field1884, -16490, class184.field2784, class262.field3781.field4531) - class303.field4302), -30123);
                class94.method790("Look: " + class262.field3781.field4531 + "," + (class27.field282 + class279.field4012 >> 6) + "," + (class481.field6810 + class189.field2810 >> 6) + "," + (class279.field4012 + class27.field282 & 0x3F) + "," + (class481.field6810 + class189.field2810 & 0x3F) + " Height: " + (class407.method2440(class27.field282, -16490, class481.field6810, class262.field3781.field4531) - class194.field2894), -30123);
                return;
            }
            if (arg2.equals("showocc")) {
                class19.field200 = !class19.field200;
                class150.method1076(125);
                class94.method790("showocc=" + class19.field200, -30123);
                return;
            }
            if (arg2.equals("renderprofile") || arg2.equals("rp")) {
                class183.field2760 = !class183.field2760;
                class374.field5152.method389(class183.field2760);
                class208.method1422(-32766);
                class94.method790("showprofiling=" + class183.field2760, -30123);
                return;
            }
            if (arg2.equals("nonpcs")) {
                class153.field2122 = !class153.field2122;
                class94.method790("nonpcs=" + class153.field2122, -30123);
                return;
            }
            if (arg2.equals("autoworld")) {
                class13.method81((byte) 81);
                class94.method790("auto world selected", -30123);
                return;
            }
            if (arg2.equals("heap")) {
                class94.method790("Heap: " + class364.field5008 + "MB", -30123);
                return;
            }
            if (arg2.equals("savevarcs")) {
                class367.method2244(4);
                class94.method790("perm varcs saved", -30123);
                return;
            }
            if (arg2.equals("scramblevarcs")) {
                for (int var17 = 0; var17 < class339.field4689.length; var17++) {
                    if (class394.field5443[var17]) {
                        class339.field4689[var17] = (int) (Math.random() * 99999.0D);
                        if (Math.random() > 0.5D) {
                            class339.field4689[var17] *= -1;
                        }
                    }
                }
                class367.method2244(4);
                class94.method790("perm varcs scrambled", -30123);
                return;
            }
            if (arg2.equals("showcolmap")) {
                class436.field6205 = true;
                class184.method1311((byte) -33);
                class94.method790("colmap is shown", -30123);
                return;
            }
            if (arg2.equals("hidecolmap")) {
                class436.field6205 = false;
                class184.method1311((byte) -86);
                class94.method790("colmap is hidden", -30123);
                return;
            }
            if (arg2.equals("resetcache")) {
                class262.method1769(-19881);
                class94.method790("Caches reset", -30123);
                return;
            }
            if (arg2.equals("profilecpu")) {
                class94.method790(class98.method808(-116) + "ms", -30123);
                return;
            }
            if (arg2.startsWith("cpuusage")) {
                int var18 = Integer.parseInt(arg2.substring(9));
                if (var18 >= 0 && var18 <= 4) {
                    class69.field1010 = var18;
                }
                class94.method790("cpuusage=" + class69.field1010, -30123);
                return;
            }
            if (class347.field4787 == 30) {
                class151.field2088++;
                class336.method2111(client.field873, 105);
                class311.field4403.method1180((byte) -110, arg2.length() + 2);
                class311.field4403.method1180((byte) -110, arg0 ? 1 : 0);
                class311.field4403.method1184((byte) -87, arg2);
            }
            if (arg2.startsWith("fps ") && class480.field6799 != class389.field5379) {
                class154.method1093(65280, class270.method1827(arg2.substring(4), false));
                return;
            }
            if (class347.field4787 != 30) {
                class94.method790("Unrecogonised commmand when not logged in: " + arg2, -30123);
                return;
            }
        } catch (Exception var19) {
            class94.method790("Whoops, something went wrong.", -30123);
            return;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
    public static void method2177(int arg0) {
        field4857 = null;
        field4856 = null;
        if (arg0 == 14389) {
            field4854 = null;
            field4851 = null;
            field4853 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lnn;")
    public static final class38 method2178(Throwable arg0, String arg1) {
        field4849++;
        class38 var2;
        if ((arg0 instanceof class38)) {
            var2 = (class38) arg0;
            var2.field475 = var2.field475 + ' ' + arg1;
        } else {
            var2 = new class38(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "([Lae;II)V")
    public static final void method2179(class172[] arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class172 var4 = arg0[var3];
            if (var4 != null && var4.field2532 == arg1 && !client.method551(var4)) {
                if (var4.field2602 == 0) {
                    method2179(arg0, var4.field2543, -100);
                    if (var4.field2541 != null) {
                        method2179(var4.field2541, var4.field2543, -79);
                    }
                    class249 var5 = (class249) class310.field4399.method1104(-128, (long) var4.field2543);
                    if (var5 != null) {
                        class189.method1327(var5.field3593, true);
                    }
                }
                if (var4.field2602 == 6 && var4.field2597 != -1) {
                    class303 var6 = class386.field5289.method1856(64, var4.field2597);
                    if (var6 != null) {
                        var4.field2585 += class385.field5283;
                        while (var6.field4283[var4.field2528] < var4.field2585) {
                            var4.field2585 -= var6.field4283[var4.field2528];
                            var4.field2528++;
                            if (var4.field2528 >= var6.field4286.length) {
                                var4.field2528 -= var6.field4304;
                                if (var4.field2528 < 0 || var4.field2528 >= var6.field4286.length) {
                                    var4.field2528 = 0;
                                }
                            }
                            var4.field2559 = var4.field2528 + 1;
                            if (var4.field2559 >= var6.field4286.length) {
                                var4.field2559 -= var6.field4304;
                                if (var4.field2559 < 0 || var6.field4286.length <= var4.field2559) {
                                    var4.field2559 = -1;
                                }
                            }
                            class184.method1314(var4, 96);
                        }
                    }
                }
            }
        }
        if (arg2 <= -61) {
            field4852++;
        }
    }
}
