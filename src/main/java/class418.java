import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class418 extends class294 {

    @OriginalMember(owner = "client!hq", name = "ab", descriptor = "I")
    public static int field5559 = 0;

    @OriginalMember(owner = "client!hq", name = "cb", descriptor = "Z")
    public static boolean field5561 = false;

    @OriginalMember(owner = "client!hq", name = "Z", descriptor = "I")
    public static int field5558 = 0;

    @OriginalMember(owner = "client!hq", name = "bb", descriptor = "I")
    public static int field5560;

    @OriginalMember(owner = "client!hq", name = "db", descriptor = "I")
    public static int field5562;

    @OriginalMember(owner = "client!hq", name = "eb", descriptor = "I")
    public static int field5563;

    @OriginalMember(owner = "client!hq", name = "fb", descriptor = "I")
    public static int field5564;

    @OriginalMember(owner = "client!hq", name = "gb", descriptor = "I")
    public static int field5565;

    @OriginalMember(owner = "client!hq", name = "hb", descriptor = "I")
    public static int field5566;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IZIZIIZ)V", line = 10)
    public static final void method2456(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5, boolean arg6) {
        ++field5564;
        if (arg4 > arg2) {
            int var7 = (arg2 + arg4) / 2;
            int var8 = arg2;
            class311 var9 = class167.field2177[var7];
            class167.field2177[var7] = class167.field2177[arg4];
            class167.field2177[arg4] = var9;
            for (int var10 = arg2; var10 < arg4; ++var10) {
                if (~class195.method1260(var9, arg0, arg5, arg1, class167.field2177[var10], 0, arg3) >= -1) {
                    class311 var11 = class167.field2177[var10];
                    class167.field2177[var10] = class167.field2177[var8];
                    class167.field2177[var8++] = var11;
                }
            }
            class167.field2177[arg4] = class167.field2177[var8];
            class167.field2177[var8] = var9;
            method2456(arg0, arg1, arg2, arg3, var8 + -1, arg5, arg6);
            method2456(arg0, arg1, var8 + 1, arg3, arg4, arg5, true);
        }
        if (!arg6) {
            field5558 = -75;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IZLjava/lang/String;)V", line = 56)
    public static final void method2457(int arg0, boolean arg1, String arg2) {
        ++field5566;
        if (arg0 > -43) {
            method2458(-108);
        }
        if (class246.field3151 != class222.field2867 || ~class363.field4685 <= -3) {
            if (arg2.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            try {
                if (arg2.equalsIgnoreCase("fpson")) {
                    class232.field2998 = true;
                    class258.method1617("fps debug enabled", 69);
                    return;
                }
                if (arg2.equalsIgnoreCase("fpsoff")) {
                    class232.field2998 = false;
                    class258.method1617("fps debug disabled", 75);
                    return;
                }
                if (arg2.equalsIgnoreCase("cls")) {
                    class165.field2139 = 0;
                    class92.field1277 = 0;
                    return;
                }
                if (arg2.equalsIgnoreCase("cleartext")) {
                    client.field7513.method2128((byte) 88);
                    class258.method1617("Text coords cleared", 64);
                    return;
                }
                if (arg2.equalsIgnoreCase("gc")) {
                    class64.method362((byte) -127);
                    for (int var3 = 0; ~var3 > -11; ++var3) {
                        System.gc();
                    }
                    Runtime var4 = Runtime.getRuntime();
                    int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
                    class258.method1617("mem=" + var5 + "k", 105);
                    return;
                }
                if (arg2.equalsIgnoreCase("compact")) {
                    class64.method362((byte) -127);
                    for (int var6 = 0; var6 < 10; ++var6) {
                        System.gc();
                    }
                    Runtime var7 = Runtime.getRuntime();
                    int var8 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                    class258.method1617("Memory before cleanup=" + var8 + "k", 94);
                    class163.method1080(false);
                    class64.method362((byte) -128);
                    for (int var9 = 0; ~var9 > -11; ++var9) {
                        System.gc();
                    }
                    int var10 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                    class258.method1617("Memory after cleanup=" + var10 + "k", 87);
                    return;
                }
                if (arg2.equalsIgnoreCase("pcachesize")) {
                    class258.method1617("Number of player models in cache:" + class521.method3099(-2378), 73);
                    return;
                }
                if (arg2.equalsIgnoreCase("clientdrop")) {
                    class258.method1617("Dropped client connection", 92);
                    if (~class65.field821 == -31) {
                        class152.method1046((byte) -64);
                        return;
                    }
                    if (~class65.field821 == -26) {
                        class360.field4665 = true;
                    }
                    return;
                }
                if (arg2.equalsIgnoreCase("clientjs5drop")) {
                    class187.field2441.method2103(0);
                    class258.method1617("Dropped client js5 net queue", 81);
                    return;
                }
                if (arg2.equalsIgnoreCase("serverjs5drop")) {
                    class187.field2441.method2102(0);
                    class258.method1617("Dropped server js5 net queue", 78);
                    return;
                }
                if (arg2.equalsIgnoreCase("breakcon")) {
                    class172.field2221.method2623(0);
                    class286.field3643.method1007((byte) 42);
                    class187.field2441.method2098(104);
                    class258.method1617("Breaking new connections for 5 seconds", 103);
                    return;
                }
                if (arg2.equalsIgnoreCase("rebuild")) {
                    class365.method2142(125);
                    class21.method148((byte) -109);
                    class258.method1617("Rebuilding map", 81);
                    return;
                }
                if (arg2.equalsIgnoreCase("wm1")) {
                    class207.method1348(-1, 1, false, -1, 6271);
                    if (class144.method1008((byte) 109) != 1) {
                        class258.method1617("wm1 failed", 105);
                        return;
                    }
                    class258.method1617("wm1 succeeded", 89);
                    return;
                }
                if (arg2.equalsIgnoreCase("wm2")) {
                    class207.method1348(-1, 2, false, -1, 6271);
                    if (class144.method1008((byte) 109) != 2) {
                        class258.method1617("wm2 failed", 119);
                        return;
                    }
                    class258.method1617("wm2 succeeded", 79);
                    return;
                }
                if (arg2.equalsIgnoreCase("wm3")) {
                    class207.method1348(1024, 3, false, 768, 6271);
                    if (class144.method1008((byte) 109) != 3) {
                        class258.method1617("wm3 failed", 103);
                        return;
                    }
                    class258.method1617("wm3 succeeded", 101);
                    return;
                }
                if (arg2.equalsIgnoreCase("tk0")) {
                    class10.method69(0, 5537);
                    if (class520.field7690 == 0) {
                        class258.method1617("Entered tk0", 102);
                        class421.field5647.field7702 = 0;
                        class421.field5647.method643(true, class172.field2221);
                        class461.field6449 = false;
                        return;
                    }
                    class258.method1617("Failed to enter tk0", 98);
                    return;
                }
                if (arg2.equalsIgnoreCase("tk1")) {
                    class10.method69(1, 5537);
                    if (~class520.field7690 == -2) {
                        class258.method1617("Entered tk1", 112);
                        class421.field5647.field7702 = 1;
                        class421.field5647.method643(true, class172.field2221);
                        class461.field6449 = false;
                        return;
                    }
                    class258.method1617("Failed to enter tk1", 89);
                    return;
                }
                if (arg2.equalsIgnoreCase("tk2")) {
                    class10.method69(2, 5537);
                    if (~class520.field7690 != -3) {
                        class258.method1617("Failed to enter tk2", 93);
                        return;
                    }
                    class258.method1617("Entered tk2", 61);
                    class421.field5647.field7702 = 2;
                    class421.field5647.method643(true, class172.field2221);
                    class461.field6449 = false;
                    return;
                }
                if (arg2.equalsIgnoreCase("tk3")) {
                    class10.method69(3, 5537);
                    if (class520.field7690 != 3) {
                        class258.method1617("Failed to enter tk3", 74);
                        return;
                    }
                    class258.method1617("Entered tk3", 65);
                    return;
                }
                if (arg2.equalsIgnoreCase("ot")) {
                    class421.field5647.field7696 = !class421.field5647.field7696;
                    class421.field5647.method643(true, class172.field2221);
                    class461.field6449 = false;
                    class365.method2142(-19);
                    class258.method1617("ot=" + class421.field5647.field7696, 93);
                    return;
                }
                if (arg2.equalsIgnoreCase("gb")) {
                    class421.field5647.field7722 = !class421.field5647.field7722;
                    class421.field5647.method643(true, class172.field2221);
                    class461.field6449 = false;
                    class365.method2142(-85);
                    class258.method1617("gb=" + class421.field5647.field7722, 73);
                    return;
                }
                if (arg2.startsWith("shadows")) {
                    if (arg2.length() < 8) {
                        class258.method1617("Invalid shadows value", 81);
                        return;
                    }
                    String var11 = arg2.substring(8);
                    int var12 = class19.method126(var11, (byte) -60) ? class109.method716(var11, 10) : -1;
                    if (var12 >= 0 && var12 <= 2) {
                        class421.field5647.method3100(class520.field7690, var12, (byte) 108);
                        class421.field5647.method643(true, class172.field2221);
                        class461.field6449 = false;
                        class365.method2142(121);
                        class258.method1617("shadows=" + var12, 77);
                        return;
                    }
                    class258.method1617("Invalid shadows value", 121);
                    return;
                }
                if (arg2.startsWith("textures")) {
                    class421.field5647.field7697 = !class421.field5647.field7697;
                    class421.field5647.method643(true, class172.field2221);
                    class461.field6449 = false;
                    class282.method1724(false);
                    class365.method2142(-72);
                    class258.method1617("textures=" + class421.field5647.field7697, 72);
                    return;
                }
                if (arg2.startsWith("setba")) {
                    if (~arg2.length() > -7) {
                        class258.method1617("Invalid buildarea value", 70);
                        return;
                    }
                    int var13 = class109.method716(arg2.substring(6), 10);
                    if (~var13 <= -1 && var13 <= class240.method1516(class472.field6899, -127)) {
                        class421.field5647.field7701 = var13;
                        class421.field5647.method643(true, class172.field2221);
                        class461.field6449 = false;
                        class258.method1617("maxbuildarea=" + class421.field5647.field7701, 107);
                        return;
                    }
                    class258.method1617("Invalid buildarea value", 126);
                    return;
                }
                if (arg2.startsWith("setparticles")) {
                    if (~arg2.length() > -14) {
                        class258.method1617("Invalid particles value", 91);
                        return;
                    }
                    class148.method1022(-15306, class109.method716(arg2.substring(13), 10));
                    class421.field5647.method643(true, class172.field2221);
                    class461.field6449 = false;
                    class258.method1617("particles=" + class258.method1615(10), 72);
                    return;
                }
                if (arg2.startsWith("rect_debug")) {
                    if (~arg2.length() > -11) {
                        class258.method1617("Invalid rect_debug value", 69);
                        return;
                    }
                    class13.field231 = class109.method716(arg2.substring(10).trim(), 10);
                    class258.method1617("rect_debug=" + class13.field231, 127);
                    return;
                }
                if (arg2.equalsIgnoreCase("qa_op_test")) {
                    class285.field3633 = true;
                    class258.method1617("qa_op_test=" + class285.field3633, 123);
                    return;
                }
                if (arg2.equalsIgnoreCase("clipcomponents")) {
                    class126.field1730 = !class126.field1730;
                    class258.method1617("clipcomponents=" + class126.field1730, 109);
                    return;
                }
                if (arg2.startsWith("bloom")) {
                    boolean var14 = class512.field7538.method879();
                    if (class91.method628((byte) 72, !var14)) {
                        if (var14) {
                            class258.method1617("Bloom disabled", 120);
                            return;
                        }
                        class258.method1617("Bloom enabled", 125);
                        return;
                    }
                    class258.method1617("Failed to enable bloom", 72);
                    return;
                }
                if (arg2.equalsIgnoreCase("tween")) {
                    if (!class310.field4004) {
                        class310.field4004 = true;
                        class258.method1617("Forced tweening ENABLED!", 63);
                        return;
                    }
                    class310.field4004 = false;
                    class258.method1617("Forced tweening disabled.", 118);
                    return;
                }
                if (arg2.equalsIgnoreCase("shiftclick")) {
                    if (!class354.field4549) {
                        class258.method1617("Shift-click ENABLED!", 109);
                        class354.field4549 = true;
                        return;
                    }
                    class258.method1617("Shift-click disabled.", 77);
                    class354.field4549 = false;
                    return;
                }
                if (arg2.equalsIgnoreCase("getcgcoord")) {
                    class258.method1617("x:" + (class37.field573.field6239 >> 7) + " z:" + (class37.field573.field6241 >> 7), 115);
                    return;
                }
                if (arg2.equalsIgnoreCase("getheight")) {
                    class258.method1617("Height: " + class92.field1285[class37.field573.field6220].method1187(class37.field573.field6239 >> 7, class37.field573.field6241 >> 7), 121);
                    return;
                }
                if (arg2.equalsIgnoreCase("resetminimap")) {
                    class391.field5121.method1304((byte) -113);
                    class391.field5121.method1319(100);
                    class471.field6882.method1561((byte) -96);
                    class117.field1643.method1091(23665);
                    class21.method148((byte) -109);
                    class258.method1617("Minimap reset", 88);
                    return;
                }
                if (arg2.startsWith("mc")) {
                    if (!class512.field7538.method897()) {
                        class258.method1617("Current toolkit doesn't support multiple cores", 69);
                        return;
                    }
                    int var15 = Integer.parseInt(arg2.substring(3));
                    if (var15 >= 1) {
                        if (~var15 < -5) {
                            var15 = 4;
                        }
                    } else {
                        var15 = 1;
                    }
                    class388.field5098 = var15;
                    class512.field7538.method914(class388.field5098);
                    class512.field7538.method874(0);
                    class258.method1617("Render cores now: " + class388.field5098, 66);
                    return;
                }
                if (arg2.startsWith("cachespace")) {
                    class258.method1617("I(s): " + class249.field3175.method85(true) + "/" + class249.field3175.method79(39), 97);
                    class258.method1617("I(m): " + class24.field429.method85(true) + "/" + class24.field429.method79(73), 62);
                    class258.method1617("O(s): " + class89.field1238.field316.method2647(0) + "/" + class89.field1238.field316.method2642(0), 88);
                    return;
                }
                if (arg2.equalsIgnoreCase("getcamerapos")) {
                    class258.method1617("Pos: " + class37.field573.field6220 + "," + ((class299.field3885 >> 7) + class35.field545 >> 6) + "," + ((class291.field3724 >> 7) - -class336.field4299 >> 6) + "," + (63 & (class299.field3885 >> 7) + class35.field545) + "," + ((class291.field3724 >> 7) - -class336.field4299 & 63) + " Height: " + (class366.method2145(class37.field573.field6220, (byte) -128, class299.field3885, class291.field3724) + -class53.field730), 118);
                    class258.method1617("Look: " + class37.field573.field6220 + "," + (class93.field1307 + class35.field545 >> 6) + "," + (class98.field1370 + class336.field4299 >> 6) + "," + (63 & class93.field1307 + class35.field545) + "," + (63 & class98.field1370 + class336.field4299) + " Height: " + (class366.method2145(class37.field573.field6220, (byte) 25, class93.field1307, class98.field1370) - class514.field7558), 74);
                    return;
                }
                if (arg2.equals("showocc")) {
                    class345.field4391 = !class345.field4391;
                    class365.method2142(126);
                    class258.method1617("showocc=" + class345.field4391, 66);
                    return;
                }
                if (arg2.equals("wallocc")) {
                    class456.field6367 = !class456.field6367;
                    class365.method2142(127);
                    class258.method1617("forcewallocc=" + class456.field6367, 113);
                    return;
                }
                if (arg2.equals("renderprofile") || arg2.equals("rp")) {
                    class517.field7623 = !class517.field7623;
                    class512.field7538.method845(class517.field7623);
                    class36.method232(3);
                    class258.method1617("showprofiling=" + class517.field7623, 88);
                    return;
                }
                if (arg2.equals("performancetest")) {
                    class258.method1617("Java toolkit: " + class256.method1603(108, class172.field2221, 0), 90);
                    class258.method1617("GL toolkit:   " + class256.method1603(120, class172.field2221, 1), 63);
                    class258.method1617("SSE toolkit:  " + class256.method1603(125, class172.field2221, 2), 66);
                    return;
                }
                if (arg2.equals("nonpcs")) {
                    class388.field5106 = !class388.field5106;
                    class258.method1617("nonpcs=" + class388.field5106, 121);
                    return;
                }
                if (arg2.equals("autoworld")) {
                    class90.method624((byte) 125);
                    class258.method1617("auto world selected", 123);
                    return;
                }
                if (arg2.startsWith("pc")) {
                    class420.method2472((byte) -101, class120.field1674);
                    class319.field4112.method565(71, 0);
                    int var16 = class319.field4112.field1176;
                    int var17 = arg2.indexOf(" ", 4);
                    class319.field4112.method597(-128, arg2.substring(3, var17));
                    class358.method2108(-49, arg2.substring(var17), class319.field4112);
                    class319.field4112.method557(-var16 + class319.field4112.field1176, false);
                    return;
                }
                if (arg2.equals("heap")) {
                    class258.method1617("Heap: " + class472.field6899 + "MB", 81);
                    return;
                }
                if (arg2.equals("savevarcs")) {
                    class502.method2997((byte) -24);
                    class258.method1617("perm varcs saved", 82);
                    return;
                }
                if (arg2.equals("scramblevarcs")) {
                    for (int var18 = 0; ~class276.field3537.length < ~var18; ++var18) {
                        if (class346.field4415[var18]) {
                            class276.field3537[var18] = (int) (99999.0D * Math.random());
                            if (Math.random() > 0.5D) {
                                class276.field3537[var18] *= -1;
                            }
                        }
                    }
                    class502.method2997((byte) -24);
                    class258.method1617("perm varcs scrambled", 78);
                    return;
                }
                if (arg2.equals("showcolmap")) {
                    class75.field947 = true;
                    class21.method148((byte) -109);
                    class258.method1617("colmap is shown", 87);
                    return;
                }
                if (arg2.equals("hidecolmap")) {
                    class75.field947 = false;
                    class21.method148((byte) -109);
                    class258.method1617("colmap is hidden", 119);
                    return;
                }
                if (arg2.equals("resetcache")) {
                    class312.method1859(5);
                    class258.method1617("Caches reset", 113);
                    return;
                }
                if (arg2.equals("profilecpu")) {
                    class258.method1617(class439.method2597((byte) -8) + "ms", 84);
                    return;
                }
                if (arg2.startsWith("cpuusage")) {
                    int var19 = Integer.parseInt(arg2.substring(9));
                    if (var19 >= 0 && ~var19 >= -5) {
                        class421.field5647.field7730 = var19;
                    }
                    class258.method1617("cpuusage=" + class421.field5647.field7730, 61);
                    return;
                }
                if (arg2.startsWith("getclientvarpbit")) {
                    int var20 = Integer.parseInt(arg2.substring(17));
                    class258.method1617("varpbit=" + class198.field2555.method1049(var20, (byte) 72), 73);
                    return;
                }
                if (arg2.startsWith("getclientvarp")) {
                    int var21 = Integer.parseInt(arg2.substring(14));
                    class258.method1617("varp=" + class198.field2555.method1050(var21, (byte) 114), 119);
                    return;
                }
                if (arg2.startsWith("csprofileclear")) {
                    class490.method2931();
                    return;
                }
                if (arg2.startsWith("csprofileoutputc")) {
                    class490.method2923(100, false);
                    return;
                }
                if (arg2.startsWith("csprofileoutputt")) {
                    class490.method2923(10, true);
                    return;
                }
                if (arg2.startsWith("texsize")) {
                    int var22 = Integer.parseInt(arg2.substring(8));
                    class512.field7538.method820(var22);
                    return;
                }
                if (arg2.equals("soundstreamcount")) {
                    class258.method1617("Active streams: " + class18.field313.method1886(), 122);
                    return;
                }
                if (class65.field821 == 30) {
                    class420.method2472((byte) -101, class355.field4561);
                    ++class261.field3308;
                    class319.field4112.method565(63, 2 + arg2.length());
                    class319.field4112.method565(41, !arg1 ? 0 : 1);
                    class319.field4112.method597(-127, arg2);
                }
                if (arg2.startsWith("fps ") && class246.field3151 != class222.field2867) {
                    class457.method2705(-120, class109.method716(arg2.substring(4), 10));
                    return;
                }
                if (~class65.field821 != -31) {
                    class258.method1617("Unrecogonised commmand when not logged in: " + arg2, 107);
                    return;
                }
            } catch (Exception var23) {
                class258.method1617("Whoops, something went wrong.", 107);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(II)[[I", line = 789)
    public final int[][] method36(int arg0, int arg1) {
        ++field5562;
        int[][] var3 = super.field1333.method694(arg1, arg0);
        if (arg0 != 3) {
            field5561 = true;
        }
        if (super.field1333.field1423 && this.method1766((byte) 33)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg1 % super.field3813 * super.field3813;
            for (int var8 = 0; var8 < class269.field3403; ++var8) {
                int var9 = super.field3810[var8 % super.field3812 + var7];
                var6[var8] = class60.method339(255, var9) << 4;
                var5[var8] = class60.method339(var9, 65280) >> 4;
                var4[var8] = class60.method339(var9 >> 12, 4080);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hq", name = "h", descriptor = "(I)V", line = 845)
    public static final void method2458(int arg0) {
        ++field5560;
        class10.method64((byte) 123);
        class63.field810 = null;
        class243.field3126 = null;
        class91.field1263 = null;
        class521.field7736 = null;
        if (arg0 != 32436) {
            method2457(-51, false, (String) null);
        }
        class200.field2584 = null;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIIB)I", line = 868)
    public static final int method2459(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 > -16) {
            return 98;
        } else {
            ++field5565;
            int var5 = 65536 - class21.field397[arg1 * 8192 / arg3] >> 1;
            return ((-var5 + 65536) * arg0 >> 16) + (arg2 * var5 >> 16);
        }
    }
}
