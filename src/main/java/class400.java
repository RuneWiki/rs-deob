import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class400 {

    @OriginalMember(owner = "client!vs", name = "d", descriptor = "Lhj;")
    public static class383 field5886 = new class383(8);

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "I")
    public static int field5883;

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "I")
    public static int field5884;

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "I")
    public static int field5885;

    @OriginalMember(owner = "client!vs", name = "e", descriptor = "I")
    public static int field5887;

    @OriginalMember(owner = "client!vs", name = "f", descriptor = "Lih;")
    public static class474 field5888;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IZLjava/lang/String;)V", line = 3)
    public static final void method2384(int arg0, boolean arg1, String arg2) {
        if (arg0 != 8308) {
            return;
        }
        field5883++;
        if (class371.field5567 == class339.field4941 && class118.field1535 < 2) {
            return;
        }
        if (arg2.equalsIgnoreCase("errortest")) {
            throw new RuntimeException();
        }
        try {
            if (arg2.equalsIgnoreCase("fpson")) {
                class174.field2389 = true;
                class465.method2724(-26334, "fps debug enabled");
                return;
            }
            if (arg2.equalsIgnoreCase("fpsoff")) {
                class174.field2389 = false;
                class465.method2724(-26334, "fps debug disabled");
                return;
            }
            if (arg2.equalsIgnoreCase("cls")) {
                class81.field1124 = 0;
                class251.field3614 = 0;
                return;
            }
            if (arg2.equalsIgnoreCase("cleartext")) {
                class238.field3325.method247(-14987);
                class465.method2724(arg0 - 34642, "Text coords cleared");
                return;
            }
            if (arg2.equalsIgnoreCase("gc")) {
                class411.method2452(arg0 - 8305);
                for (int var3 = 0; var3 < 10; var3++) {
                    System.gc();
                }
                Runtime var4 = Runtime.getRuntime();
                int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
                class465.method2724(arg0 ^ 0xFFFFB956, "mem=" + var5 + "k");
                return;
            }
            if (arg2.equalsIgnoreCase("compact")) {
                class411.method2452(3);
                for (int var6 = 0; var6 < 10; var6++) {
                    System.gc();
                }
                Runtime var7 = Runtime.getRuntime();
                int var8 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                class465.method2724(-26334, "Memory before cleanup=" + var8 + "k");
                class323.method1939(31641);
                class411.method2452(3);
                for (int var9 = 0; var9 < 10; var9++) {
                    System.gc();
                }
                int var10 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                class465.method2724(-26334, "Memory after cleanup=" + var10 + "k");
                return;
            }
            if (arg2.equalsIgnoreCase("pcachesize")) {
                class465.method2724(-26334, "Number of player models in cache:" + class160.method1016(arg0 ^ 0x200C));
                return;
            }
            if (arg2.equalsIgnoreCase("clientdrop")) {
                class465.method2724(-26334, "Dropped client connection");
                if (class323.field4729 == 30) {
                    class388.method2338((byte) -86);
                } else if (class323.field4729 == 25) {
                    class450.field6555 = true;
                    return;
                }
                return;
            }
            if (arg2.equalsIgnoreCase("clientjs5drop")) {
                class90.field1238.method2646(arg0 - 8181);
                class465.method2724(-26334, "Dropped client js5 net queue");
                return;
            }
            if (arg2.equalsIgnoreCase("serverjs5drop")) {
                class90.field1238.method2638(108);
                class465.method2724(-26334, "Dropped server js5 net queue");
                return;
            }
            if (arg2.equalsIgnoreCase("breakcon")) {
                class86.field1182.method327(true);
                class22.field294.method2127(124);
                class90.field1238.method2644((byte) -111);
                class465.method2724(-26334, "Breaking new connections for 5 seconds");
                return;
            }
            if (arg2.equalsIgnoreCase("rebuild")) {
                class242.method1510(10);
                class428.method2552(18583);
                class465.method2724(arg0 - 34642, "Rebuilding map");
                return;
            }
            if (arg2.equalsIgnoreCase("wm1")) {
                class208.method1284(1, -1, -1, false, 69);
                if (class262.method1618(-29489) != 1) {
                    class465.method2724(-26334, "wm1 failed");
                    return;
                }
                class465.method2724(-26334, "wm1 succeeded");
                return;
            }
            if (arg2.equalsIgnoreCase("wm2")) {
                class208.method1284(2, -1, -1, false, -128);
                if (class262.method1618(-29489) == 2) {
                    class465.method2724(-26334, "wm2 succeeded");
                    return;
                }
                class465.method2724(-26334, "wm2 failed");
                return;
            }
            if (arg2.equalsIgnoreCase("wm3")) {
                class208.method1284(3, 1024, 768, false, 38);
                if (class262.method1618(-29489) == 3) {
                    class465.method2724(-26334, "wm3 succeeded");
                    return;
                }
                class465.method2724(-26334, "wm3 failed");
                return;
            }
            if (arg2.equalsIgnoreCase("tk0")) {
                class46.method353(0, true);
                if (class293.field4174 == 0) {
                    class465.method2724(-26334, "Entered tk0");
                    class118.field1533.field6895 = 0;
                    class118.field1533.method2960(arg0 ^ 0x2039, class86.field1182);
                    class17.field241 = false;
                    return;
                }
                class465.method2724(arg0 - 34642, "Failed to enter tk0");
                return;
            }
            if (arg2.equalsIgnoreCase("tk1")) {
                class46.method353(1, true);
                if (class293.field4174 != 1) {
                    class465.method2724(-26334, "Failed to enter tk1");
                    return;
                }
                class465.method2724(arg0 ^ 0xFFFFB956, "Entered tk1");
                class118.field1533.field6895 = 1;
                class118.field1533.method2960(74, class86.field1182);
                class17.field241 = false;
                return;
            }
            if (arg2.equalsIgnoreCase("tk2")) {
                class46.method353(2, true);
                if (class293.field4174 == 2) {
                    class465.method2724(-26334, "Entered tk2");
                    class118.field1533.field6895 = 2;
                    class118.field1533.method2960(94, class86.field1182);
                    class17.field241 = false;
                    return;
                }
                class465.method2724(-26334, "Failed to enter tk2");
                return;
            }
            if (arg2.equalsIgnoreCase("tk3")) {
                class46.method353(3, true);
                if (class293.field4174 != 3) {
                    class465.method2724(-26334, "Failed to enter tk3");
                    return;
                }
                class465.method2724(-26334, "Entered tk3");
                return;
            }
            if (arg2.equalsIgnoreCase("ot")) {
                class118.field1533.field6900 = !class118.field1533.field6900;
                class118.field1533.method2960(69, class86.field1182);
                class17.field241 = false;
                class242.method1510(10);
                class465.method2724(arg0 ^ 0xFFFFB956, "ot=" + class118.field1533.field6900);
                return;
            }
            if (arg2.equalsIgnoreCase("gb")) {
                class118.field1533.field6888 = !class118.field1533.field6888;
                class118.field1533.method2960(80, class86.field1182);
                class17.field241 = false;
                class242.method1510(arg0 - 8298);
                class465.method2724(arg0 - 34642, "gb=" + class118.field1533.field6888);
                return;
            }
            if (arg2.startsWith("shadows")) {
                if (arg2.length() < 8) {
                    class465.method2724(-26334, "Invalid shadows value");
                    return;
                }
                String var11 = arg2.substring(8);
                int var12 = class216.method1332((byte) 107, var11) ? class103.method622(var11, 0) : -1;
                if (var12 >= 0 && var12 <= 2) {
                    class118.field1533.field6901 = var12;
                    class118.field1533.method2960(79, class86.field1182);
                    class17.field241 = false;
                    class242.method1510(10);
                    class465.method2724(-26334, "shadows=" + var12);
                    return;
                }
                class465.method2724(-26334, "Invalid shadows value");
                return;
            }
            if (arg2.startsWith("setba")) {
                if (arg2.length() < 6) {
                    class465.method2724(arg0 ^ 0xFFFFB956, "Invalid buildarea value");
                    return;
                }
                int var13 = class103.method622(arg2.substring(6), 0);
                if (var13 >= 0 && var13 <= class71.method482(22730, class315.field4620)) {
                    class118.field1533.field6904 = var13;
                    class118.field1533.method2960(78, class86.field1182);
                    class17.field241 = false;
                    class465.method2724(-26334, "maxbuildarea=" + class118.field1533.field6904);
                    return;
                }
                class465.method2724(-26334, "Invalid buildarea value");
                return;
            }
            if (arg2.startsWith("setparticles")) {
                if (arg2.length() < 13) {
                    class465.method2724(-26334, "Invalid particles value");
                    return;
                }
                class322.method1932(class103.method622(arg2.substring(13), 0), 255);
                class118.field1533.method2960(112, class86.field1182);
                class17.field241 = false;
                class465.method2724(-26334, "particles=" + class466.method2727(93));
                return;
            }
            if (arg2.startsWith("rect_debug")) {
                if (arg2.length() < 10) {
                    class465.method2724(-26334, "Invalid rect_debug value");
                    return;
                }
                class78.field1099 = class103.method622(arg2.substring(10).trim(), 0);
                class465.method2724(arg0 - 34642, "rect_debug=" + class78.field1099);
                return;
            }
            if (arg2.equalsIgnoreCase("qa_op_test")) {
                class27.field438 = true;
                class465.method2724(-26334, "qa_op_test=" + class27.field438);
                return;
            }
            if (arg2.equalsIgnoreCase("clipcomponents")) {
                class125.field1617 = !class125.field1617;
                class465.method2724(-26334, "clipcomponents=" + class125.field1617);
                return;
            }
            if (arg2.startsWith("bloom")) {
                boolean var14 = class481.field6937.method822();
                if (!class222.method1375(!var14, (byte) -120)) {
                    class465.method2724(-26334, "Failed to enable bloom");
                    return;
                }
                if (var14) {
                    class465.method2724(-26334, "Bloom disabled");
                    return;
                }
                class465.method2724(-26334, "Bloom enabled");
                return;
            }
            if (arg2.equalsIgnoreCase("tween")) {
                if (!class360.field5338) {
                    class360.field5338 = true;
                    class465.method2724(-26334, "Forced tweening ENABLED!");
                    return;
                }
                class360.field5338 = false;
                class465.method2724(-26334, "Forced tweening disabled.");
                return;
            }
            if (arg2.equalsIgnoreCase("shiftclick")) {
                if (!class23.field303) {
                    class465.method2724(-26334, "Shift-click ENABLED!");
                    class23.field303 = true;
                    return;
                }
                class465.method2724(arg0 - 34642, "Shift-click disabled.");
                class23.field303 = false;
                return;
            }
            if (arg2.equalsIgnoreCase("getcgcoord")) {
                class465.method2724(-26334, "x:" + (class415.field6145.field2959 >> 7) + " z:" + (class415.field6145.field2966 >> 7));
                return;
            }
            if (arg2.equalsIgnoreCase("getheight")) {
                class465.method2724(-26334, "Height: " + class311.field4527[class415.field6145.field2956].method848(class415.field6145.field2959 >> 7, class415.field6145.field2966 >> 7));
                return;
            }
            if (arg2.equalsIgnoreCase("resetminimap")) {
                class445.field6482.method1460((byte) -28);
                class445.field6482.method1457(arg0 ^ 0xFFFFDF89);
                class281.field4023.method1261((byte) -27);
                class96.field1295.method281(14240);
                class428.method2552(18583);
                class465.method2724(-26334, "Minimap reset");
                return;
            }
            if (arg2.startsWith("mc")) {
                if (!class481.field6937.method795()) {
                    class465.method2724(-26334, "Current toolkit doesn't support multiple cores");
                    return;
                }
                int var15 = Integer.parseInt(arg2.substring(3));
                if (var15 < 1) {
                    var15 = 1;
                } else if (var15 > 4) {
                    var15 = 4;
                }
                class40.field620 = var15;
                class481.field6937.method786(class40.field620);
                class481.field6937.method813(0);
                class465.method2724(-26334, "Render cores now: " + class40.field620);
                return;
            }
            if (arg2.startsWith("cachespace")) {
                class465.method2724(-26334, "I(s): " + class136.field1750.method45(0) + "/" + class136.field1750.method41(0));
                class465.method2724(-26334, "I(m): " + class65.field970.method45(0) + "/" + class65.field970.method41(arg0 ^ 0x2074));
                class465.method2724(-26334, "O(s): " + class405.field5947.field2621.method1997(-18204) + "/" + class405.field5947.field2621.method1989(arg0 - 8298));
                return;
            }
            if (arg2.equalsIgnoreCase("getcamerapos")) {
                class465.method2724(arg0 ^ 0xFFFFB956, "Pos: " + class415.field6145.field2956 + "," + ((class205.field2843 >> 7) + class455.field6637 >> 6) + "," + ((class282.field4026 >> 7) + class223.field3158 >> 6) + "," + ((class205.field2843 >> 7) + class455.field6637 & 0x3F) + "," + ((class282.field4026 >> 7) + class223.field3158 & 0x3F) + " Height: " + (class103.method620(class415.field6145.field2956, class282.field4026, (byte) 20, class205.field2843) - class432.field6338));
                class465.method2724(-26334, "Look: " + class415.field6145.field2956 + "," + (class167.field2190 + class455.field6637 >> 6) + "," + (class350.field5085 + class223.field3158 >> 6) + "," + (class167.field2190 + class455.field6637 & 0x3F) + "," + (class350.field5085 + class223.field3158 & 0x3F) + " Height: " + (class103.method620(class415.field6145.field2956, class350.field5085, (byte) 20, class167.field2190) - class348.field5043));
                return;
            }
            if (arg2.equals("showocc")) {
                class201.field2787 = !class201.field2787;
                class242.method1510(10);
                class465.method2724(arg0 ^ 0xFFFFB956, "showocc=" + class201.field2787);
                return;
            }
            if (arg2.equals("wallocc")) {
                class464.field6727 = !class464.field6727;
                class242.method1510(10);
                class465.method2724(-26334, "forcewallocc=" + class464.field6727);
                return;
            }
            if (arg2.equals("renderprofile") || arg2.equals("rp")) {
                class152.field1956 = !class152.field1956;
                class481.field6937.method762(class152.field1956);
                class20.method147((byte) -53);
                class465.method2724(-26334, "showprofiling=" + class152.field1956);
                return;
            }
            if (arg2.equals("performancetest")) {
                class465.method2724(-26334, "Java toolkit: " + class502.method3023((byte) 41, 0, class86.field1182));
                class465.method2724(-26334, "GL toolkit:   " + class502.method3023((byte) 41, 1, class86.field1182));
                return;
            }
            if (arg2.equals("nonpcs")) {
                class242.field3445 = !class242.field3445;
                class465.method2724(-26334, "nonpcs=" + class242.field3445);
                return;
            }
            if (arg2.equals("autoworld")) {
                class141.method890((byte) -125);
                class465.method2724(arg0 ^ 0xFFFFB956, "auto world selected");
                return;
            }
            if (arg2.startsWith("pc")) {
                class386.method2321(true, class195.field2759);
                class79.field1108.method947(-107, 0);
                int var16 = class79.field1108.field2018;
                int var17 = arg2.indexOf(" ", 4);
                class79.field1108.method956(true, arg2.substring(3, var17));
                class483.method2812((byte) 71, arg2.substring(var17), class79.field1108);
                class79.field1108.method966((byte) -107, class79.field1108.field2018 - var16);
                return;
            }
            if (arg2.equals("heap")) {
                class465.method2724(-26334, "Heap: " + class315.field4620 + "MB");
                return;
            }
            if (arg2.equals("savevarcs")) {
                class450.method2624(7479);
                class465.method2724(-26334, "perm varcs saved");
                return;
            }
            if (arg2.equals("scramblevarcs")) {
                for (int var18 = 0; var18 < class115.field1486.length; var18++) {
                    if (class420.field6208[var18]) {
                        class115.field1486[var18] = (int) (Math.random() * 99999.0D);
                        if (Math.random() > 0.5D) {
                            class115.field1486[var18] *= -1;
                        }
                    }
                }
                class450.method2624(7479);
                class465.method2724(-26334, "perm varcs scrambled");
                return;
            }
            if (arg2.equals("showcolmap")) {
                class110.field1447 = true;
                class428.method2552(18583);
                class465.method2724(-26334, "colmap is shown");
                return;
            }
            if (arg2.equals("hidecolmap")) {
                class110.field1447 = false;
                class428.method2552(18583);
                class465.method2724(-26334, "colmap is hidden");
                return;
            }
            if (arg2.equals("resetcache")) {
                class110.method656(false);
                class465.method2724(arg0 ^ 0xFFFFB956, "Caches reset");
                return;
            }
            if (arg2.equals("profilecpu")) {
                class465.method2724(-26334, class391.method2355(3) + "ms");
                return;
            }
            if (arg2.startsWith("cpuusage")) {
                int var19 = Integer.parseInt(arg2.substring(9));
                if (var19 >= 0 && var19 <= 4) {
                    class118.field1533.field6881 = var19;
                }
                class465.method2724(-26334, "cpuusage=" + class118.field1533.field6881);
                return;
            }
            if (arg2.startsWith("getclientvarpbit")) {
                int var20 = Integer.parseInt(arg2.substring(17));
                class465.method2724(-26334, "varpbit=" + class453.field6591.method109(var20, arg0 ^ 0x3643));
                return;
            }
            if (arg2.startsWith("getclientvarp")) {
                int var21 = Integer.parseInt(arg2.substring(14));
                class465.method2724(-26334, "varp=" + class453.field6591.method108(var21, (byte) -106));
                return;
            }
            if (arg2.startsWith("csprofileclear")) {
                class396.method2362();
                return;
            }
            if (arg2.startsWith("csprofileoutputc")) {
                class396.method2361(100, false);
                return;
            }
            if (arg2.startsWith("csprofileoutputt")) {
                class396.method2361(10, true);
                return;
            }
            if (arg2.startsWith("texsize")) {
                int var22 = Integer.parseInt(arg2.substring(8));
                class481.field6937.method792(var22);
                return;
            }
            if (arg2.equals("soundstreamcount")) {
                class465.method2724(-26334, "Active streams: " + class375.field5607.method647());
                return;
            }
            if (class323.field4729 == 30) {
                class386.method2321(true, class324.field4740);
                class225.field3179++;
                class79.field1108.method947(-35, arg2.length() + 2);
                class79.field1108.method947(-52, arg1 ? 1 : 0);
                class79.field1108.method956(true, arg2);
            }
            if (arg2.startsWith("fps ") && class371.field5567 != class339.field4941) {
                class184.method1160(class103.method622(arg2.substring(4), 0), (byte) -121);
                return;
            }
            if (class323.field4729 != 30) {
                class465.method2724(-26334, "Unrecogonised commmand when not logged in: " + arg2);
                return;
            }
        } catch (Exception var23) {
            class465.method2724(arg0 - 34642, "Whoops, something went wrong.");
            return;
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(II[I[JI)V", line = 720)
    public static final void method2385(int arg0, int arg1, int[] arg2, long[] arg3, int arg4) {
        if (arg1 != 6693) {
            method2387(true);
        }
        field5887++;
        if (arg0 >= arg4) {
            return;
        }
        int var5 = (arg0 + arg4) / 2;
        int var6 = arg0;
        long var7 = arg3[var5];
        arg3[var5] = arg3[arg4];
        arg3[arg4] = var7;
        int var9 = arg2[var5];
        arg2[var5] = arg2[arg4];
        arg2[arg4] = var9;
        int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
        for (int var11 = arg0; var11 < arg4; var11++) {
            if (((long) (var10 & var11) + var7) > arg3[var11]) {
                long var12 = arg3[var11];
                arg3[var11] = arg3[var6];
                arg3[var6] = var12;
                int var14 = arg2[var11];
                arg2[var11] = arg2[var6];
                arg2[var6++] = var14;
            }
        }
        arg3[arg4] = arg3[var6];
        arg3[var6] = var7;
        arg2[arg4] = arg2[var6];
        arg2[var6] = var9;
        method2385(arg0, 6693, arg2, arg3, var6 - 1);
        method2385(var6 + 1, 6693, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)V", line = 786)
    public static final void method2386(int arg0) {
        field5884++;
        class298.field4343.method764(class483.field6991, class166.field2174, class445.field6494);
        if (arg0 != 0) {
            method2388(88);
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(Z)V", line = 798)
    public static void method2387(boolean arg0) {
        field5886 = null;
        if (!arg0) {
            field5888 = null;
        }
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(I)V", line = 810)
    public static final void method2388(int arg0) {
        if (class364.field5476 != -1) {
            class308.method1852(122, -1, -1, class364.field5476, false);
            class364.field5476 = -1;
        }
        field5885++;
        if (arg0 != -15225) {
            field5888 = null;
        }
    }
}
