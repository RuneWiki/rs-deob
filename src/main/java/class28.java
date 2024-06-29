import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class28 {

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
    public int field288;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "[I")
    public int[] field290;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "[I")
    public int[] field295;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public static int field292 = 0;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
    public static int field291 = 1401;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "[I")
    public static int[] field294 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "Lf;")
    public static class529 field289;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V", line = 5)
    public static void method167(int arg0) {
        field294 = null;
        field289 = null;
        if (arg0 != -684953913) {
            field294 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZILjava/lang/String;)V", line = 27)
    public static final void method168(boolean arg0, int arg1, String arg2) {
        if (arg1 != 29120) {
            field294 = null;
        }
        field293++;
        if (class447.field6662 == class125.field1890 && class402.field6053 < 2) {
            return;
        }
        if (arg2.equalsIgnoreCase("errortest")) {
            throw new RuntimeException();
        }
        try {
            if (arg2.equalsIgnoreCase("fpson")) {
                class390.field5883 = true;
                class314.method1955("fps debug enabled", arg1 ^ 0x48BB);
                return;
            }
            if (arg2.equalsIgnoreCase("fpsoff")) {
                class390.field5883 = false;
                class314.method1955("fps debug disabled", 14715);
                return;
            }
            if (arg2.equalsIgnoreCase("cls")) {
                class401.field6017 = 0;
                class463.field6856 = 0;
                return;
            }
            if (arg2.equalsIgnoreCase("cleartext")) {
                class504.field7390.method1881(2);
                class314.method1955("Text coords cleared", 14715);
                return;
            }
            if (arg2.equalsIgnoreCase("gc")) {
                class40.method241(-114);
                for (int var3 = 0; var3 < 10; var3++) {
                    System.gc();
                }
                Runtime var4 = Runtime.getRuntime();
                int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
                class314.method1955("mem=" + var5 + "k", 14715);
                return;
            }
            if (arg2.equalsIgnoreCase("compact")) {
                class40.method241(-122);
                for (int var6 = 0; var6 < 10; var6++) {
                    System.gc();
                }
                Runtime var7 = Runtime.getRuntime();
                int var8 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                class314.method1955("Memory before cleanup=" + var8 + "k", arg1 ^ 0x48BB);
                class239.method1612(-1);
                class40.method241(arg1 - 29238);
                for (int var9 = 0; var9 < 10; var9++) {
                    System.gc();
                }
                int var10 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                class314.method1955("Memory after cleanup=" + var10 + "k", arg1 ^ 0x48BB);
                return;
            }
            if (arg2.equalsIgnoreCase("pcachesize")) {
                class314.method1955("Number of player models in cache:" + class491.method2934(26679), 14715);
                return;
            }
            if (arg2.equalsIgnoreCase("clientdrop")) {
                class314.method1955("Dropped client connection", 14715);
                if (class193.field2832 == 30) {
                    class361.method2250((byte) -31);
                    return;
                }
                if (class193.field2832 == 25) {
                    class445.field6627 = true;
                }
                return;
            }
            if (arg2.equalsIgnoreCase("clientjs5drop")) {
                class62.field949.method275((byte) 108);
                class314.method1955("Dropped client js5 net queue", 14715);
                return;
            }
            if (arg2.equalsIgnoreCase("serverjs5drop")) {
                class62.field949.method278(0);
                class314.method1955("Dropped server js5 net queue", 14715);
                return;
            }
            if (arg2.equalsIgnoreCase("breakcon")) {
                class483.field7077.method2593(5000);
                class90.field1361.method2307((byte) -120);
                class62.field949.method271(23336);
                class314.method1955("Breaking new connections for 5 seconds", 14715);
                return;
            }
            if (arg2.equalsIgnoreCase("rebuild")) {
                class525.method3107(-2119782128);
                class264.method1758(20841);
                class314.method1955("Rebuilding map", 14715);
                return;
            }
            if (arg2.equalsIgnoreCase("wm1")) {
                class407.method2447(-1, false, 1, -1, (byte) -49);
                if (class14.method89(false) != 1) {
                    class314.method1955("wm1 failed", 14715);
                    return;
                }
                class314.method1955("wm1 succeeded", 14715);
                return;
            }
            if (arg2.equalsIgnoreCase("wm2")) {
                class407.method2447(-1, false, 2, -1, (byte) -49);
                if (class14.method89(false) == 2) {
                    class314.method1955("wm2 succeeded", arg1 - 14405);
                    return;
                }
                class314.method1955("wm2 failed", arg1 ^ 0x48BB);
                return;
            }
            if (arg2.equalsIgnoreCase("wm3")) {
                class407.method2447(768, false, 3, 1024, (byte) -49);
                if (class14.method89(false) != 3) {
                    class314.method1955("wm3 failed", arg1 - 14405);
                    return;
                }
                class314.method1955("wm3 succeeded", 14715);
                return;
            }
            if (arg2.equalsIgnoreCase("tk0")) {
                class14.method91((byte) 51, 0);
                if (class170.field2529 != 0) {
                    class314.method1955("Failed to enter tk0", 14715);
                    return;
                }
                class314.method1955("Entered tk0", 14715);
                class426.field6401.field994 = 0;
                class426.field6401.method2523(class483.field7077, -51);
                class526.field7788 = false;
                return;
            }
            if (arg2.equalsIgnoreCase("tk1")) {
                class14.method91((byte) 67, 1);
                if (class170.field2529 != 1) {
                    class314.method1955("Failed to enter tk1", 14715);
                    return;
                }
                class314.method1955("Entered tk1", arg1 ^ 0x48BB);
                class426.field6401.field994 = 1;
                class426.field6401.method2523(class483.field7077, -62);
                class526.field7788 = false;
                return;
            }
            if (arg2.equalsIgnoreCase("tk2")) {
                class14.method91((byte) 61, 2);
                if (class170.field2529 != 2) {
                    class314.method1955("Failed to enter tk2", arg1 - 14405);
                    return;
                }
                class314.method1955("Entered tk2", 14715);
                class426.field6401.field994 = 2;
                class426.field6401.method2523(class483.field7077, -58);
                class526.field7788 = false;
                return;
            }
            if (arg2.equalsIgnoreCase("tk3")) {
                class14.method91((byte) 62, 3);
                if (class170.field2529 != 3) {
                    class314.method1955("Failed to enter tk3", 14715);
                    return;
                }
                class314.method1955("Entered tk3", 14715);
                return;
            }
            if (arg2.equalsIgnoreCase("ot")) {
                class426.field6401.field1020 = !class426.field6401.field1020;
                class426.field6401.method2523(class483.field7077, -96);
                class526.field7788 = false;
                class525.method3107(-2119782128);
                class314.method1955("ot=" + class426.field6401.field1020, 14715);
                return;
            }
            if (arg2.equalsIgnoreCase("gb")) {
                class426.field6401.field998 = !class426.field6401.field998;
                class426.field6401.method2523(class483.field7077, arg1 ^ 0xFFFF8E59);
                class526.field7788 = false;
                class525.method3107(arg1 - 2119811248);
                class314.method1955("gb=" + class426.field6401.field998, 14715);
                return;
            }
            if (arg2.startsWith("shadows")) {
                if (arg2.length() < 8) {
                    class314.method1955("Invalid shadows value", 14715);
                    return;
                }
                String var11 = arg2.substring(8);
                int var12 = class48.method302((byte) -122, var11) ? class92.method532(var11, 10) : -1;
                if (var12 >= 0 && var12 <= 2) {
                    class426.field6401.method395(var12, class170.field2529, (byte) -61);
                    class426.field6401.method2523(class483.field7077, -25);
                    class526.field7788 = false;
                    class525.method3107(-2119782128);
                    class314.method1955("shadows=" + var12, 14715);
                    return;
                }
                class314.method1955("Invalid shadows value", arg1 - 14405);
                return;
            }
            if (arg2.startsWith("textures")) {
                class426.field6401.field989 = !class426.field6401.field989;
                class426.field6401.method2523(class483.field7077, arg1 ^ 0xFFFF8E5F);
                class526.field7788 = false;
                class411.method2475(-67);
                class525.method3107(-2119782128);
                class314.method1955("textures=" + class426.field6401.field989, 14715);
                return;
            }
            if (arg2.startsWith("setba")) {
                if (arg2.length() < 6) {
                    class314.method1955("Invalid buildarea value", arg1 ^ 0x48BB);
                    return;
                }
                int var13 = class92.method532(arg2.substring(6), arg1 ^ 0x71CA);
                if (var13 >= 0 && class184.method1270(class34.field363, 2) >= var13) {
                    class426.field6401.field1001 = var13;
                    class426.field6401.method2523(class483.field7077, -49);
                    class526.field7788 = false;
                    class314.method1955("maxbuildarea=" + class426.field6401.field1001, 14715);
                    return;
                }
                class314.method1955("Invalid buildarea value", 14715);
                return;
            }
            if (arg2.startsWith("setparticles")) {
                if (arg2.length() < 13) {
                    class314.method1955("Invalid particles value", 14715);
                    return;
                }
                class66.method388((byte) -49, class92.method532(arg2.substring(13), 10));
                class426.field6401.method2523(class483.field7077, -116);
                class526.field7788 = false;
                class314.method1955("particles=" + class107.method662((byte) -127), 14715);
                return;
            }
            if (arg2.startsWith("rect_debug")) {
                if (arg2.length() < 10) {
                    class314.method1955("Invalid rect_debug value", 14715);
                    return;
                }
                class172.field2540 = class92.method532(arg2.substring(10).trim(), 10);
                class314.method1955("rect_debug=" + class172.field2540, arg1 ^ 0x48BB);
                return;
            }
            if (arg2.equalsIgnoreCase("qa_op_test")) {
                class187.field2783 = true;
                class314.method1955("qa_op_test=" + class187.field2783, 14715);
                return;
            }
            if (arg2.equalsIgnoreCase("clipcomponents")) {
                class209.field3019 = !class209.field3019;
                class314.method1955("clipcomponents=" + class209.field3019, arg1 - 14405);
                return;
            }
            if (arg2.startsWith("bloom")) {
                boolean var14 = class348.field5015.method1025();
                if (!class427.method2560(!var14, (byte) 110)) {
                    class314.method1955("Failed to enable bloom", arg1 - 14405);
                    return;
                }
                if (!var14) {
                    class314.method1955("Bloom enabled", 14715);
                    return;
                }
                class314.method1955("Bloom disabled", 14715);
                return;
            }
            if (arg2.equalsIgnoreCase("tween")) {
                if (class307.field4418) {
                    class307.field4418 = false;
                    class314.method1955("Forced tweening disabled.", 14715);
                    return;
                }
                class307.field4418 = true;
                class314.method1955("Forced tweening ENABLED!", 14715);
                return;
            }
            if (arg2.equalsIgnoreCase("shiftclick")) {
                if (class389.field5870) {
                    class314.method1955("Shift-click disabled.", arg1 - 14405);
                    class389.field5870 = false;
                    return;
                }
                class314.method1955("Shift-click ENABLED!", 14715);
                class389.field5870 = true;
                return;
            }
            if (arg2.equalsIgnoreCase("getcgcoord")) {
                class314.method1955("x:" + (class500.field7365.field1763 >> 7) + " z:" + (class500.field7365.field1769 >> 7), 14715);
                return;
            }
            if (arg2.equalsIgnoreCase("getheight")) {
                class314.method1955("Height: " + class86.field1324[class500.field7365.field1768].method201(class500.field7365.field1763 >> 7, class500.field7365.field1769 >> 7), arg1 ^ 0x48BB);
                return;
            }
            if (arg2.equalsIgnoreCase("resetminimap")) {
                class6.field81.method2953(arg1 - 29120);
                class6.field81.method2927(arg1 - 29122);
                class57.field872.method1205((byte) -120);
                class14.field176.method543(arg1 - 29203);
                class264.method1758(arg1 ^ 0x20A9);
                class314.method1955("Minimap reset", 14715);
                return;
            }
            if (arg2.startsWith("mc")) {
                if (class348.field5015.method1079()) {
                    int var15 = Integer.parseInt(arg2.substring(3));
                    if (var15 < 1) {
                        var15 = 1;
                    } else if (var15 > 4) {
                        var15 = 4;
                    }
                    class522.field7727 = var15;
                    class348.field5015.method1043(class522.field7727);
                    class348.field5015.method1103(0);
                    class314.method1955("Render cores now: " + class522.field7727, 14715);
                    return;
                }
                class314.method1955("Current toolkit doesn't support multiple cores", 14715);
                return;
            }
            if (arg2.startsWith("cachespace")) {
                class314.method1955("I(s): " + class509.field7435.method1546(108) + "/" + class509.field7435.method1547((byte) 104), 14715);
                class314.method1955("I(m): " + class478.field7022.method1546(82) + "/" + class478.field7022.method1547((byte) 103), 14715);
                class314.method1955("O(s): " + class294.field4196.field1182.method1141(arg1 ^ 0xFFFF8E3D) + "/" + class294.field4196.field1182.method1128(3777), arg1 - 14405);
                return;
            }
            if (arg2.equalsIgnoreCase("getcamerapos")) {
                class314.method1955("Pos: " + class500.field7365.field1768 + "," + ((class24.field258 >> 7) + class68.field1038 >> 6) + "," + ((class260.field3827 >> 7) + class24.field259 >> 6) + "," + ((class24.field258 >> 7) + class68.field1038 & 0x3F) + "," + ((class260.field3827 >> 7) + class24.field259 & 0x3F) + " Height: " + (class377.method2316(class260.field3827, false, class24.field258, class500.field7365.field1768) - class291.field4175), 14715);
                class314.method1955("Look: " + class500.field7365.field1768 + "," + (class68.field1038 + class267.field3906 >> 6) + "," + (class38.field558 + class24.field259 >> 6) + "," + (class68.field1038 + class267.field3906 & 0x3F) + "," + (class38.field558 + class24.field259 & 0x3F) + " Height: " + (class377.method2316(class38.field558, false, class267.field3906, class500.field7365.field1768) - class390.field5876), 14715);
                return;
            }
            if (arg2.equals("showocc")) {
                class70.field1059 = !class70.field1059;
                class525.method3107(-2119782128);
                class314.method1955("showocc=" + class70.field1059, 14715);
                return;
            }
            if (arg2.equals("wallocc")) {
                class403.field6079 = !class403.field6079;
                class525.method3107(-2119782128);
                class314.method1955("forcewallocc=" + class403.field6079, 14715);
                return;
            }
            if (arg2.equals("renderprofile") || arg2.equals("rp")) {
                class40.field586 = !class40.field586;
                class348.field5015.method1053(class40.field586);
                class250.method1670((byte) -75);
                class314.method1955("showprofiling=" + class40.field586, 14715);
                return;
            }
            if (arg2.equals("performancetest")) {
                class314.method1955("Java toolkit: " + class308.method1940(class483.field7077, (byte) -16, 0), arg1 ^ 0x48BB);
                class314.method1955("GL toolkit:   " + class308.method1940(class483.field7077, (byte) -16, 1), 14715);
                class314.method1955("SSE toolkit:  " + class308.method1940(class483.field7077, (byte) -16, 2), arg1 - 14405);
                return;
            }
            if (arg2.equals("nonpcs")) {
                class289.field4157 = !class289.field4157;
                class314.method1955("nonpcs=" + class289.field4157, arg1 ^ 0x48BB);
                return;
            }
            if (arg2.equals("autoworld")) {
                class260.method1729(-32631);
                class314.method1955("auto world selected", 14715);
                return;
            }
            if (arg2.startsWith("pc")) {
                class291.method1861((byte) -104, class272.field3955);
                class356.field5471.method1410(0, -27645);
                int var16 = class356.field5471.field3037;
                int var17 = arg2.indexOf(" ", 4);
                class356.field5471.method1418(true, arg2.substring(3, var17));
                class30.method178(true, class356.field5471, arg2.substring(var17));
                class356.field5471.method1443(class356.field5471.field3037 - var16, -1);
                return;
            }
            if (arg2.equals("heap")) {
                class314.method1955("Heap: " + class34.field363 + "MB", 14715);
                return;
            }
            if (arg2.equals("savevarcs")) {
                class352.method2206(true);
                class314.method1955("perm varcs saved", 14715);
                return;
            }
            if (arg2.equals("scramblevarcs")) {
                for (int var18 = 0; var18 < class146.field2173.length; var18++) {
                    if (class436.field6519[var18]) {
                        class146.field2173[var18] = (int) (Math.random() * 99999.0D);
                        if (Math.random() > 0.5D) {
                            class146.field2173[var18] *= -1;
                        }
                    }
                }
                class352.method2206(true);
                class314.method1955("perm varcs scrambled", 14715);
                return;
            }
            if (arg2.equals("showcolmap")) {
                class258.field3806 = true;
                class264.method1758(20841);
                class314.method1955("colmap is shown", arg1 ^ 0x48BB);
                return;
            }
            if (arg2.equals("hidecolmap")) {
                class258.field3806 = false;
                class264.method1758(20841);
                class314.method1955("colmap is hidden", 14715);
                return;
            }
            if (arg2.equals("resetcache")) {
                class426.method2554(-56);
                class314.method1955("Caches reset", 14715);
                return;
            }
            if (arg2.equals("profilecpu")) {
                class314.method1955(class186.method1280(-27640) + "ms", 14715);
                return;
            }
            if (arg2.startsWith("cpuusage")) {
                int var19 = Integer.parseInt(arg2.substring(9));
                if (var19 >= 0 && var19 <= 4) {
                    class426.field6401.field1007 = var19;
                }
                class314.method1955("cpuusage=" + class426.field6401.field1007, arg1 ^ 0x48BB);
                return;
            }
            if (arg2.startsWith("getclientvarpbit")) {
                int var20 = Integer.parseInt(arg2.substring(17));
                class314.method1955("varpbit=" + class49.field796.method349(53, var20), 14715);
                return;
            }
            if (arg2.startsWith("getclientvarp")) {
                int var21 = Integer.parseInt(arg2.substring(14));
                class314.method1955("varp=" + class49.field796.method350(var21, (byte) -83), 14715);
                return;
            }
            if (arg2.startsWith("csprofileclear")) {
                class360.method2248();
                return;
            }
            if (arg2.startsWith("csprofileoutputc")) {
                class360.method2236(100, false);
                return;
            }
            if (arg2.startsWith("csprofileoutputt")) {
                class360.method2236(10, true);
                return;
            }
            if (arg2.startsWith("texsize")) {
                int var22 = Integer.parseInt(arg2.substring(8));
                class348.field5015.method1123(var22);
                return;
            }
            if (arg2.equals("soundstreamcount")) {
                class314.method1955("Active streams: " + class366.field5591.method1793(), arg1 - 14405);
                return;
            }
            if (class193.field2832 == 30) {
                class291.method1861((byte) -104, class418.field6279);
                class419.field6296++;
                class356.field5471.method1410(arg2.length() + 2, arg1 + -56765);
                class356.field5471.method1410(arg0 ? 1 : 0, arg1 ^ 0xFFFFE5C3);
                class356.field5471.method1418(true, arg2);
            }
            if (arg2.startsWith("fps ") && class447.field6662 != class125.field1890) {
                class265.method1764(1000, class92.method532(arg2.substring(4), 10));
                return;
            }
            if (class193.field2832 != 30) {
                class314.method1955("Unrecogonised commmand when not logged in: " + arg2, 14715);
                return;
            }
        } catch (Exception var23) {
            class314.method1955("Whoops, something went wrong.", 14715);
            return;
        }
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(I)V", line = 753)
    public class28(int arg0) {
        this.field288 = arg0;
        this.field290 = new int[this.field288];
        this.field295 = new int[this.field288];
    }
}
