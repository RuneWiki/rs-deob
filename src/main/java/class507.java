import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class507 extends class18 {

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "Lui;")
    public static class375 field7542 = new class375("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "I")
    public static int field7547 = 0;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "[[Z")
    public static boolean[][] field7545 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    public int field7543;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
    public int field7544;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
    public static int field7546;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "I")
    public int field7550;

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "I")
    public static int field7551;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "Lqv;")
    public class49 field7548;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "[Lmn;")
    public class159[] field7549;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/lang/String;IZ)V", line = 4)
    public static final void method3024(String arg0, int arg1, boolean arg2) {
        field7551++;
        if (arg1 != -31 || class74.field999 == class140.field2031 && class528.field7809 < 2) {
            return;
        }
        if (arg0.equalsIgnoreCase("errortest")) {
            throw new RuntimeException();
        }
        try {
            if (arg0.equalsIgnoreCase("fpson")) {
                class430.field6388 = true;
                class290.method1872("fps debug enabled", (byte) -50);
                return;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                class430.field6388 = false;
                class290.method1872("fps debug disabled", (byte) -121);
                return;
            }
            if (arg0.equalsIgnoreCase("cls")) {
                class52.field703 = 0;
                class74.field993 = 0;
                return;
            }
            if (arg0.equalsIgnoreCase("cleartext")) {
                class226.field3255.method2362((byte) 81);
                class290.method1872("Text coords cleared", (byte) -104);
                return;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                class256.method1662(4096);
                for (int var3 = 0; var3 < 10; var3++) {
                    System.gc();
                }
                Runtime var4 = Runtime.getRuntime();
                int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
                class290.method1872("mem=" + var5 + "k", (byte) -106);
                return;
            }
            if (arg0.equalsIgnoreCase("compact")) {
                class256.method1662(4096);
                for (int var6 = 0; var6 < 10; var6++) {
                    System.gc();
                }
                Runtime var7 = Runtime.getRuntime();
                int var8 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                class290.method1872("Memory before cleanup=" + var8 + "k", (byte) 100);
                class217.method1474((byte) 69);
                class256.method1662(arg1 ^ 0xFFFFEFE1);
                for (int var9 = 0; var9 < 10; var9++) {
                    System.gc();
                }
                int var10 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                class290.method1872("Memory after cleanup=" + var10 + "k", (byte) 126);
                return;
            }
            if (arg0.equalsIgnoreCase("pcachesize")) {
                class290.method1872("Number of player models in cache:" + class496.method2945(arg1 + 148), (byte) 124);
                return;
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                class290.method1872("Dropped client connection", (byte) -123);
                if (class144.field2077 == 30) {
                    class496.method2955(40);
                } else if (class144.field2077 == 25) {
                    class516.field7661 = true;
                    return;
                }
                return;
            }
            if (arg0.equalsIgnoreCase("clientjs5drop")) {
                class514.field7617.method2241(-24623);
                class290.method1872("Dropped client js5 net queue", (byte) -120);
                return;
            }
            if (arg0.equalsIgnoreCase("serverjs5drop")) {
                class514.field7617.method2244(arg1 ^ 0xFFFF8AEE);
                class290.method1872("Dropped server js5 net queue", (byte) -35);
                return;
            }
            if (arg0.equalsIgnoreCase("breakcon")) {
                class419.field6254.method2802((byte) -93);
                class81.field1092.method2990((byte) -74);
                class514.field7617.method2245(true);
                class290.method1872("Breaking new connections for 5 seconds", (byte) -65);
                return;
            }
            if (arg0.equalsIgnoreCase("rebuild")) {
                class349.method2220(82);
                class413.method2508(false);
                class290.method1872("Rebuilding map", (byte) -19);
                return;
            }
            if (arg0.equalsIgnoreCase("wm1")) {
                class41.method326(-1, arg1 + 141, -1, 1, false);
                if (class320.method2074(-32190) == 1) {
                    class290.method1872("wm1 succeeded", (byte) 99);
                    return;
                }
                class290.method1872("wm1 failed", (byte) -28);
                return;
            }
            if (arg0.equalsIgnoreCase("wm2")) {
                class41.method326(-1, -65, -1, 2, false);
                if (class320.method2074(-32190) != 2) {
                    class290.method1872("wm2 failed", (byte) -51);
                    return;
                }
                class290.method1872("wm2 succeeded", (byte) 107);
                return;
            }
            if (arg0.equalsIgnoreCase("wm3")) {
                class41.method326(1024, -128, 768, 3, false);
                if (class320.method2074(arg1 ^ 0x7DA3) == 3) {
                    class290.method1872("wm3 succeeded", (byte) -68);
                    return;
                }
                class290.method1872("wm3 failed", (byte) 121);
                return;
            }
            if (arg0.equalsIgnoreCase("tk0")) {
                class310.method1995(true, 0);
                if (class441.field6563 == 0) {
                    class290.method1872("Entered tk0", (byte) 117);
                    class96.field1399.field5239 = 0;
                    class96.field1399.method1731(true, class419.field6254);
                    class406.field6129 = false;
                    return;
                }
                class290.method1872("Failed to enter tk0", (byte) 120);
                return;
            }
            if (arg0.equalsIgnoreCase("tk1")) {
                class310.method1995(true, 1);
                if (class441.field6563 == 1) {
                    class290.method1872("Entered tk1", (byte) 98);
                    class96.field1399.field5239 = 1;
                    class96.field1399.method1731(true, class419.field6254);
                    class406.field6129 = false;
                    return;
                }
                class290.method1872("Failed to enter tk1", (byte) -112);
                return;
            }
            if (arg0.equalsIgnoreCase("tk2")) {
                class310.method1995(true, 2);
                if (class441.field6563 == 2) {
                    class290.method1872("Entered tk2", (byte) -49);
                    class96.field1399.field5239 = 2;
                    class96.field1399.method1731(true, class419.field6254);
                    class406.field6129 = false;
                    return;
                }
                class290.method1872("Failed to enter tk2", (byte) -15);
                return;
            }
            if (arg0.equalsIgnoreCase("tk3")) {
                class310.method1995(true, 3);
                if (class441.field6563 == 3) {
                    class290.method1872("Entered tk3", (byte) 94);
                    return;
                }
                class290.method1872("Failed to enter tk3", (byte) -72);
                return;
            }
            if (arg0.equalsIgnoreCase("ot")) {
                class96.field1399.field5235 = !class96.field1399.field5235;
                class96.field1399.method1731(true, class419.field6254);
                class406.field6129 = false;
                class349.method2220(91);
                class290.method1872("ot=" + class96.field1399.field5235, (byte) -47);
                return;
            }
            if (arg0.equalsIgnoreCase("gb")) {
                class96.field1399.field5210 = !class96.field1399.field5210;
                class96.field1399.method1731(true, class419.field6254);
                class406.field6129 = false;
                class349.method2220(122);
                class290.method1872("gb=" + class96.field1399.field5210, (byte) 101);
                return;
            }
            if (arg0.startsWith("shadows")) {
                if (arg0.length() < 8) {
                    class290.method1872("Invalid shadows value", (byte) -113);
                    return;
                }
                String var11 = arg0.substring(8);
                int var12 = class301.method1939((byte) -91, var11) ? class188.method1320(var11, -111) : -1;
                if (var12 >= 0 && var12 <= 2) {
                    class96.field1399.method2166(var12, -102, class441.field6563);
                    class96.field1399.method1731(true, class419.field6254);
                    class406.field6129 = false;
                    class349.method2220(112);
                    class290.method1872("shadows=" + var12, (byte) 101);
                    return;
                }
                class290.method1872("Invalid shadows value", (byte) -18);
                return;
            }
            if (arg0.startsWith("textures")) {
                class96.field1399.field5209 = !class96.field1399.field5209;
                class96.field1399.method1731(true, class419.field6254);
                class406.field6129 = false;
                class67.method446((byte) -83);
                class349.method2220(87);
                class290.method1872("textures=" + class96.field1399.field5209, (byte) -124);
                return;
            }
            if (arg0.startsWith("setba")) {
                if (arg0.length() < 6) {
                    class290.method1872("Invalid buildarea value", (byte) 94);
                    return;
                }
                int var13 = class188.method1320(arg0.substring(6), 11);
                if (var13 >= 0 && var13 <= class237.method1602(arg1 - 73, class455.field6684)) {
                    class96.field1399.field5219 = var13;
                    class96.field1399.method1731(true, class419.field6254);
                    class406.field6129 = false;
                    class290.method1872("maxbuildarea=" + class96.field1399.field5219, (byte) 103);
                    return;
                }
                class290.method1872("Invalid buildarea value", (byte) -42);
                return;
            }
            if (arg0.startsWith("setparticles")) {
                if (arg0.length() < 13) {
                    class290.method1872("Invalid particles value", (byte) 100);
                    return;
                }
                class466.method2784(class188.method1320(arg0.substring(13), arg1 - 91), (byte) -100);
                class96.field1399.method1731(true, class419.field6254);
                class406.field6129 = false;
                class290.method1872("particles=" + class453.method2728(2), (byte) -40);
                return;
            }
            if (arg0.startsWith("rect_debug")) {
                if (arg0.length() < 10) {
                    class290.method1872("Invalid rect_debug value", (byte) 116);
                    return;
                }
                class103.field1467 = class188.method1320(arg0.substring(10).trim(), -128);
                class290.method1872("rect_debug=" + class103.field1467, (byte) -80);
                return;
            }
            if (arg0.equalsIgnoreCase("qa_op_test")) {
                class197.field2788 = true;
                class290.method1872("qa_op_test=" + class197.field2788, (byte) -29);
                return;
            }
            if (arg0.equalsIgnoreCase("clipcomponents")) {
                class377.field5750 = !class377.field5750;
                class290.method1872("clipcomponents=" + class377.field5750, (byte) -117);
                return;
            }
            if (arg0.startsWith("bloom")) {
                boolean var14 = class337.field5242.method1146();
                if (!class269.method1717(false, !var14)) {
                    class290.method1872("Failed to enable bloom", (byte) -31);
                    return;
                }
                if (var14) {
                    class290.method1872("Bloom disabled", (byte) -84);
                    return;
                }
                class290.method1872("Bloom enabled", (byte) 94);
                return;
            }
            if (arg0.equalsIgnoreCase("tween")) {
                if (!class58.field786) {
                    class58.field786 = true;
                    class290.method1872("Forced tweening ENABLED!", (byte) -19);
                    return;
                }
                class58.field786 = false;
                class290.method1872("Forced tweening disabled.", (byte) 106);
                return;
            }
            if (arg0.equalsIgnoreCase("shiftclick")) {
                if (!class99.field1426) {
                    class290.method1872("Shift-click ENABLED!", (byte) -121);
                    class99.field1426 = true;
                    return;
                }
                class290.method1872("Shift-click disabled.", (byte) 106);
                class99.field1426 = false;
                return;
            }
            if (arg0.equalsIgnoreCase("getcgcoord")) {
                class290.method1872("x:" + (class339.field5365.field2217 >> 7) + " z:" + (class339.field5365.field2215 >> 7), (byte) 111);
                return;
            }
            if (arg0.equalsIgnoreCase("getheight")) {
                class290.method1872("Height: " + class455.field6683[class339.field5365.field2210].method849(class339.field5365.field2217 >> 7, class339.field5365.field2215 >> 7), (byte) 106);
                return;
            }
            if (arg0.equalsIgnoreCase("resetminimap")) {
                class113.field1576.method2640(119);
                class113.field1576.method2625(-1);
                class471.field6878.method322(arg1 + 156);
                class237.field3377.method355(true);
                class413.method2508(false);
                class290.method1872("Minimap reset", (byte) -43);
                return;
            }
            if (arg0.startsWith("mc")) {
                if (!class337.field5242.method1094()) {
                    class290.method1872("Current toolkit doesn't support multiple cores", (byte) 117);
                    return;
                }
                int var15 = Integer.parseInt(arg0.substring(3));
                if (var15 < 1) {
                    var15 = 1;
                } else if (var15 > 4) {
                    var15 = 4;
                }
                class505.field7541 = var15;
                class337.field5242.method1072(class505.field7541);
                class337.field5242.method1105(0);
                class290.method1872("Render cores now: " + class505.field7541, (byte) -21);
                return;
            }
            if (arg0.startsWith("cachespace")) {
                class290.method1872("I(s): " + class14.field242.method1021(1893) + "/" + class14.field242.method1020(arg1 ^ 0x79), (byte) -72);
                class290.method1872("I(m): " + class411.field6185.method1021(arg1 ^ 0xFFFFF884) + "/" + class411.field6185.method1020(-92), (byte) 101);
                class290.method1872("O(s): " + class84.field1154.field6063.method22(false) + "/" + class84.field1154.field6063.method18(arg1 - 32210), (byte) 115);
                return;
            }
            if (arg0.equalsIgnoreCase("getcamerapos")) {
                class290.method1872("Pos: " + class339.field5365.field2210 + "," + ((class34.field539 >> 7) + class82.field1105 >> 6) + "," + ((class301.field4447 >> 7) + class437.field6477 >> 6) + "," + ((class34.field539 >> 7) + class82.field1105 & 0x3F) + "," + ((class301.field4447 >> 7) + class437.field6477 & 0x3F) + " Height: " + (class500.method2985(class34.field539, 5293, class339.field5365.field2210, class301.field4447) - class154.field2246), (byte) 106);
                class290.method1872("Look: " + class339.field5365.field2210 + "," + (class82.field1105 + class467.field6804 >> 6) + "," + (class437.field6477 + class173.field2489 >> 6) + "," + (class82.field1105 + class467.field6804 & 0x3F) + "," + (class437.field6477 + class173.field2489 & 0x3F) + " Height: " + (class500.method2985(class467.field6804, 5293, class339.field5365.field2210, class173.field2489) - class83.field1117), (byte) 98);
                return;
            }
            if (arg0.equals("showocc")) {
                class391.field5944 = !class391.field5944;
                class349.method2220(arg1 + 131);
                class290.method1872("showocc=" + class391.field5944, (byte) -17);
                return;
            }
            if (arg0.equals("wallocc")) {
                class441.field6559 = !class441.field6559;
                class349.method2220(96);
                class290.method1872("forcewallocc=" + class441.field6559, (byte) -92);
                return;
            }
            if (arg0.equals("renderprofile") || arg0.equals("rp")) {
                class113.field1578 = !class113.field1578;
                class337.field5242.method1114(class113.field1578);
                class296.method1906(0);
                class290.method1872("showprofiling=" + class113.field1578, (byte) -52);
                return;
            }
            if (arg0.equals("performancetest")) {
                class290.method1872("Java toolkit: " + class92.method645(arg1 + 30, class419.field6254, 0), (byte) 109);
                class290.method1872("GL toolkit:   " + class92.method645(arg1 ^ 0x1E, class419.field6254, 1), (byte) -92);
                class290.method1872("SSE toolkit:  " + class92.method645(arg1 ^ 0x1E, class419.field6254, 2), (byte) -63);
                return;
            }
            if (arg0.equals("nonpcs")) {
                class206.field2920 = !class206.field2920;
                class290.method1872("nonpcs=" + class206.field2920, (byte) -35);
                return;
            }
            if (arg0.equals("autoworld")) {
                class511.method3044((byte) 46);
                class290.method1872("auto world selected", (byte) -31);
                return;
            }
            if (arg0.startsWith("pc")) {
                class179.method1287(false, class247.field3444);
                class75.field1006.method625(0, false);
                int var16 = class75.field1006.field1292;
                int var17 = arg0.indexOf(" ", 4);
                class75.field1006.method603(113, arg0.substring(3, var17));
                class327.method2114((byte) 58, arg0.substring(var17), class75.field1006);
                class75.field1006.method596(class75.field1006.field1292 - var16, false);
                return;
            }
            if (arg0.equals("heap")) {
                class290.method1872("Heap: " + class455.field6684 + "MB", (byte) -55);
                return;
            }
            if (arg0.equals("savevarcs")) {
                class74.method492(49);
                class290.method1872("perm varcs saved", (byte) -67);
                return;
            }
            if (arg0.equals("scramblevarcs")) {
                for (int var18 = 0; var18 < class129.field1815.length; var18++) {
                    if (class397.field6038[var18]) {
                        class129.field1815[var18] = (int) (Math.random() * 99999.0D);
                        if (Math.random() > 0.5D) {
                            class129.field1815[var18] *= -1;
                        }
                    }
                }
                class74.method492(24);
                class290.method1872("perm varcs scrambled", (byte) 124);
                return;
            }
            if (arg0.equals("showcolmap")) {
                class335.field5163 = true;
                class413.method2508(false);
                class290.method1872("colmap is shown", (byte) 119);
                return;
            }
            if (arg0.equals("hidecolmap")) {
                class335.field5163 = false;
                class413.method2508(false);
                class290.method1872("colmap is hidden", (byte) 92);
                return;
            }
            if (arg0.equals("resetcache")) {
                class220.method1494((byte) -127);
                class290.method1872("Caches reset", (byte) -96);
                return;
            }
            if (arg0.equals("profilecpu")) {
                class290.method1872(class498.method2963((byte) 55) + "ms", (byte) 113);
                return;
            }
            if (arg0.startsWith("cpuusage")) {
                int var19 = Integer.parseInt(arg0.substring(9));
                if (var19 >= 0 && var19 <= 4) {
                    class96.field1399.field5204 = var19;
                }
                class290.method1872("cpuusage=" + class96.field1399.field5204, (byte) -37);
                return;
            }
            if (arg0.startsWith("getclientvarpbit")) {
                int var20 = Integer.parseInt(arg0.substring(17));
                class290.method1872("varpbit=" + class36.field583.method1187(68, var20), (byte) 105);
                return;
            }
            if (arg0.startsWith("getclientvarp")) {
                int var21 = Integer.parseInt(arg0.substring(14));
                class290.method1872("varp=" + class36.field583.method1193(var21, false), (byte) -68);
                return;
            }
            if (arg0.startsWith("csprofileclear")) {
                class291.method1881();
                return;
            }
            if (arg0.startsWith("csprofileoutputc")) {
                class291.method1887(100, false);
                return;
            }
            if (arg0.startsWith("csprofileoutputt")) {
                class291.method1887(10, true);
                return;
            }
            if (arg0.startsWith("texsize")) {
                int var22 = Integer.parseInt(arg0.substring(8));
                class337.field5242.method1045(var22);
                return;
            }
            if (arg0.equals("soundstreamcount")) {
                class290.method1872("Active streams: " + class325.field4996.method1278(), (byte) 117);
                return;
            }
            if (class144.field2077 == 30) {
                class413.field6206++;
                class179.method1287(false, class398.field6058);
                class75.field1006.method625(arg0.length() + 2, false);
                class75.field1006.method625(arg2 ? 1 : 0, false);
                class75.field1006.method603(-127, arg0);
            }
            if (arg0.startsWith("fps ") && class74.field999 != class140.field2031) {
                class517.method3076(class188.method1320(arg0.substring(4), -111), arg1 ^ 0xFFFFFC09);
                return;
            }
            if (class144.field2077 != 30) {
                class290.method1872("Unrecogonised commmand when not logged in: " + arg0, (byte) 93);
                return;
            }
        } catch (Exception var23) {
            class290.method1872("Whoops, something went wrong.", (byte) 97);
            return;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Z)V", line = 732)
    public static void method3025(boolean arg0) {
        if (arg0) {
            field7545 = null;
            field7542 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IILqa;I)Z", line = 750)
    public final boolean method3026(int arg0, int arg1, class496 arg2, int arg3) {
        field7546++;
        if (this.field7549 != null) {
            for (int var5 = 0; var5 < this.field7549.length; var5++) {
                if (this.field7549[var5].method1033(arg3, arg1) && this.field7548.method56(arg3, 3, arg1, arg2)) {
                    return true;
                }
            }
        }
        int var6 = -13 % ((81 - arg0) / 43);
        return false;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(III)V", line = 778)
    public static final void method3027(int arg0, int arg1, int arg2) {
        class420 var3 = class380.field5802[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field6277 != null) {
            var3.field6277 = null;
        }
        if (var3.field6283 != null) {
            var3.field6283 = null;
        }
    }
}
