import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class288 {

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "Lpaa;")
    public static class317 field3760 = new class317(8, 3);

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "J")
    public static long field3762 = 0L;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
    public static int field3764 = 0;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "Llj;")
    public static class59 field3759;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
    public static void method1780(int arg0) {
        field3760 = null;
        field3759 = null;
        if (arg0 <= 14) {
            field3759 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BLjava/lang/String;ZZ)V")
    public static final void method1781(byte arg0, String arg1, boolean arg2, boolean arg3) {
        if (arg0 < 86) {
            method1780(-40);
        }
        field3763++;
        if (class628.field9174 == class602.field8701 && class615.field8876 < 2) {
            return;
        }
        if (arg1.equalsIgnoreCase("errortest")) {
            throw new RuntimeException();
        }
        if (arg1.equals("nativememerror")) {
            throw new OutOfMemoryError("native(MPR");
        }
        try {
            if (arg1.equalsIgnoreCase("fpson")) {
                class248.field3119 = true;
                class311.method1872(-4408, "fps debug enabled");
                return;
            }
            if (arg1.equalsIgnoreCase("fpsoff")) {
                class248.field3119 = false;
                class311.method1872(-4408, "fps debug disabled");
                return;
            }
            if (arg1.equals("systemmem")) {
                try {
                    class311.method1872(-4408, "System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
                    return;
                } catch (Throwable var31) {
                    return;
                }
            }
            if (arg1.equalsIgnoreCase("cls")) {
                class486.field6792 = 0;
                class82.field1115 = 0;
                return;
            }
            if (arg1.equalsIgnoreCase("cleartext")) {
                class374.field5215.method1874(-24444);
                class311.method1872(-4408, "Text coords cleared");
                return;
            }
            if (arg1.equalsIgnoreCase("gc")) {
                class379.method2309((byte) -125);
                for (int var4 = 0; var4 < 10; var4++) {
                    System.gc();
                }
                Runtime var5 = Runtime.getRuntime();
                int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
                class311.method1872(-4408, "mem=" + var6 + "k");
                return;
            }
            if (arg1.equalsIgnoreCase("compact")) {
                class379.method2309((byte) -113);
                for (int var7 = 0; var7 < 10; var7++) {
                    System.gc();
                }
                Runtime var8 = Runtime.getRuntime();
                int var9 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
                class311.method1872(-4408, "Memory before cleanup=" + var9 + "k");
                class438.method2549((byte) -16);
                class379.method2309((byte) -114);
                for (int var10 = 0; var10 < 10; var10++) {
                    System.gc();
                }
                int var11 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
                class311.method1872(-4408, "Memory after cleanup=" + var11 + "k");
                return;
            }
            if (arg1.equalsIgnoreCase("unloadnatives")) {
                class311.method1872(-4408, class513.method2860(0) ? "Libraries unloaded" : "Library unloading failed!");
                return;
            }
            if (arg1.equalsIgnoreCase("pcachesize")) {
                class311.method1872(-4408, "Number of player models in cache:" + class221.method1419(111));
                return;
            }
            if (arg1.equalsIgnoreCase("clientdrop")) {
                class311.method1872(-4408, "Dropped client connection");
                if (class630.field9188 == 9) {
                    class2.method5((byte) 70);
                } else if (class630.field9188 == 10) {
                    class170.field2155 = true;
                    return;
                }
                return;
            }
            if (arg1.equalsIgnoreCase("clientjs5drop")) {
                class488.field6797.method744(true);
                class311.method1872(-4408, "Dropped client js5 net queue");
                return;
            }
            if (arg1.equalsIgnoreCase("serverjs5drop")) {
                class488.field6797.method751(-2);
                class311.method1872(-4408, "Dropped server js5 net queue");
                return;
            }
            if (arg1.equalsIgnoreCase("breakcon")) {
                class31.field488.method1728((byte) 120);
                class96.field1294.method3269((byte) 63);
                class488.field6797.method745((byte) 30);
                class311.method1872(-4408, "Breaking new connections for 5 seconds");
                return;
            }
            if (arg1.equalsIgnoreCase("rebuild")) {
                class633.method3662(1);
                class317.method1979((byte) 121);
                class311.method1872(-4408, "Rebuilding map");
                return;
            }
            if (arg1.equalsIgnoreCase("wm1")) {
                class459.method2662(1, false, 63, -1, -1);
                if (class207.method1324((byte) 127) == 1) {
                    class311.method1872(-4408, "wm1 succeeded");
                    return;
                }
                class311.method1872(-4408, "wm1 failed");
                return;
            }
            if (arg1.equalsIgnoreCase("wm2")) {
                class459.method2662(2, false, 79, -1, -1);
                if (class207.method1324((byte) 94) == 2) {
                    class311.method1872(-4408, "wm2 succeeded");
                    return;
                }
                class311.method1872(-4408, "wm2 failed");
                return;
            }
            if (arg1.equalsIgnoreCase("wm3")) {
                class459.method2662(3, false, 80, 1024, 768);
                if (class207.method1324((byte) 119) != 3) {
                    class311.method1872(-4408, "wm3 failed");
                    return;
                }
                class311.method1872(-4408, "wm3 succeeded");
                return;
            }
            if (arg1.equalsIgnoreCase("tk0")) {
                class293.method1796(0, (byte) -74);
                if (class428.field5845 == 0) {
                    class311.method1872(-4408, "Entered tk0");
                    class501.field6954.field7849 = 0;
                    class501.field6954.method3537(81, class31.field488);
                    class372.field5181 = false;
                    return;
                }
                class311.method1872(-4408, "Failed to enter tk0");
                return;
            }
            if (arg1.equalsIgnoreCase("tk1")) {
                class293.method1796(1, (byte) 108);
                if (class428.field5845 != 1) {
                    class311.method1872(-4408, "Failed to enter tk1");
                    return;
                }
                class311.method1872(-4408, "Entered tk1");
                class501.field6954.field7849 = 1;
                class501.field6954.method3537(114, class31.field488);
                class372.field5181 = false;
                return;
            }
            if (arg1.equalsIgnoreCase("tk2")) {
                class293.method1796(2, (byte) -69);
                if (class428.field5845 == 2) {
                    class311.method1872(-4408, "Entered tk2");
                    class501.field6954.field7849 = 2;
                    class501.field6954.method3537(58, class31.field488);
                    class372.field5181 = false;
                    return;
                }
                class311.method1872(-4408, "Failed to enter tk2");
                return;
            }
            if (arg1.equalsIgnoreCase("tk3")) {
                class293.method1796(3, (byte) 101);
                if (class428.field5845 == 3) {
                    class311.method1872(-4408, "Entered tk3");
                    class501.field6954.field7849 = 3;
                    class501.field6954.method3537(86, class31.field488);
                    class372.field5181 = false;
                    return;
                }
                class311.method1872(-4408, "Failed to enter tk3");
                return;
            }
            if (arg1.equalsIgnoreCase("tk4")) {
                class293.method1796(4, (byte) 71);
                if (class428.field5845 == 4) {
                    class311.method1872(-4408, "Entered tk4");
                    class501.field6954.field7849 = 4;
                    class501.field6954.method3537(80, class31.field488);
                    class372.field5181 = false;
                    return;
                }
                class311.method1872(-4408, "Failed to enter tk4");
                return;
            }
            if (arg1.equalsIgnoreCase("tk5")) {
                class293.method1796(5, (byte) 101);
                if (class428.field5845 != 5) {
                    class311.method1872(-4408, "Failed to enter tk5");
                    return;
                }
                class311.method1872(-4408, "Entered tk5");
                class501.field6954.field7849 = 5;
                class501.field6954.method3537(127, class31.field488);
                class372.field5181 = false;
                return;
            }
            if (arg1.equalsIgnoreCase("ot")) {
                class501.field6954.field7868 = !class501.field6954.field7868;
                class501.field6954.method3537(120, class31.field488);
                class372.field5181 = false;
                class633.method3662(1);
                class311.method1872(-4408, "ot=" + class501.field6954.field7868);
                return;
            }
            if (arg1.equalsIgnoreCase("gb")) {
                class501.field6954.field7847 = !class501.field6954.field7847;
                class501.field6954.method3537(86, class31.field488);
                class372.field5181 = false;
                class633.method3662(1);
                class311.method1872(-4408, "gb=" + class501.field6954.field7847);
                return;
            }
            if (arg1.startsWith("shadows")) {
                if (arg1.length() < 8) {
                    class311.method1872(-4408, "Invalid shadows value");
                    return;
                }
                String var12 = arg1.substring(8);
                int var13 = class111.method601(false, var12) ? class254.method1532(var12, 2) : -1;
                if (var13 >= 0 && var13 <= 2) {
                    class501.field6954.method3151(var13, 1, class428.field5845);
                    class501.field6954.method3537(52, class31.field488);
                    class372.field5181 = false;
                    class633.method3662(1);
                    class311.method1872(-4408, "shadows=" + var13);
                    return;
                }
                class311.method1872(-4408, "Invalid shadows value");
                return;
            }
            if (arg1.startsWith("textures")) {
                class501.field6954.field7880 = !class501.field6954.field7880;
                class501.field6954.method3537(76, class31.field488);
                class372.field5181 = false;
                class113.method609(0);
                class633.method3662(1);
                class311.method1872(-4408, "textures=" + class501.field6954.field7880);
                return;
            }
            if (arg1.startsWith("lighting")) {
                class501.field6954.method3155(class428.field5845, 123, !class501.field6954.method3152(70, class428.field5845));
                class501.field6954.method3537(65, class31.field488);
                class372.field5181 = false;
                class9.method37(2);
                class113.method609(0);
                class633.method3662(1);
                class311.method1872(-4408, "lighting=" + class501.field6954.method3152(-96, class428.field5845));
                return;
            }
            if (arg1.startsWith("setba")) {
                if (arg1.length() < 6) {
                    class311.method1872(-4408, "Invalid buildarea value");
                    return;
                }
                int var14 = class254.method1532(arg1.substring(6), 2);
                if (var14 >= 0 && var14 <= class88.method490((byte) 39, class282.field3697)) {
                    class501.field6954.field7865 = var14;
                    class501.field6954.method3537(48, class31.field488);
                    class372.field5181 = false;
                    class311.method1872(-4408, "maxbuildarea=" + class501.field6954.field7865);
                    return;
                }
                class311.method1872(-4408, "Invalid buildarea value");
                return;
            }
            if (arg1.startsWith("setparticles")) {
                if (arg1.length() < 13) {
                    class311.method1872(-4408, "Invalid particles value");
                    return;
                }
                class298.method1833((byte) -77, class254.method1532(arg1.substring(13), 2));
                class501.field6954.method3537(64, class31.field488);
                class372.field5181 = false;
                class311.method1872(-4408, "particles=" + class83.method474((byte) -47));
                return;
            }
            if (arg1.startsWith("rect_debug")) {
                if (arg1.length() < 10) {
                    class311.method1872(-4408, "Invalid rect_debug value");
                    return;
                }
                class3.field22 = class254.method1532(arg1.substring(10).trim(), 2);
                class311.method1872(-4408, "rect_debug=" + class3.field22);
                return;
            }
            if (arg1.equalsIgnoreCase("qa_op_test")) {
                class427.field5824 = true;
                class311.method1872(-4408, "qa_op_test=" + class427.field5824);
                return;
            }
            if (arg1.equalsIgnoreCase("clipcomponents")) {
                class617.field8887 = !class617.field8887;
                class311.method1872(-4408, "clipcomponents=" + class617.field8887);
                return;
            }
            if (arg1.startsWith("bloom")) {
                boolean var15 = class301.field3918.method912();
                if (!class503.method2814(!var15, -12070)) {
                    class311.method1872(-4408, "Failed to enable bloom");
                    return;
                }
                if (!var15) {
                    class311.method1872(-4408, "Bloom enabled");
                    return;
                }
                class311.method1872(-4408, "Bloom disabled");
                return;
            }
            if (arg1.equalsIgnoreCase("tween")) {
                if (!class551.field7667) {
                    class551.field7667 = true;
                    class311.method1872(-4408, "Forced tweening ENABLED!");
                    return;
                }
                class551.field7667 = false;
                class311.method1872(-4408, "Forced tweening disabled.");
                return;
            }
            if (arg1.equalsIgnoreCase("shiftclick")) {
                if (class592.field8560) {
                    class311.method1872(-4408, "Shift-click disabled.");
                    class592.field8560 = false;
                    return;
                }
                class311.method1872(-4408, "Shift-click ENABLED!");
                class592.field8560 = true;
                return;
            }
            if (arg1.equalsIgnoreCase("getcgcoord")) {
                class311.method1872(-4408, "x:" + (class147.field1899.field6362 >> 9) + " z:" + (class147.field1899.field6368 >> 9));
                return;
            }
            if (arg1.equalsIgnoreCase("getheight")) {
                class311.method1872(-4408, "Height: " + class501.field6947[class147.field1899.field6358].method1031(class147.field1899.field6362 >> 7, class147.field1899.field6368 >> 7));
                return;
            }
            if (arg1.equalsIgnoreCase("resetminimap")) {
                class24.field433.method2070(0);
                class24.field433.method2062(-123);
                class376.field5232.method2481(16543);
                class494.field6893.method1545(true);
                class317.method1979((byte) 126);
                class311.method1872(-4408, "Minimap reset");
                return;
            }
            if (arg1.startsWith("mc")) {
                if (class301.field3918.method937()) {
                    int var16 = Integer.parseInt(arg1.substring(3));
                    if (var16 < 1) {
                        var16 = 1;
                    } else if (var16 > 4) {
                        var16 = 4;
                    }
                    class549.field7635 = var16;
                    class301.field3918.method194(class549.field7635);
                    class301.field3918.method198(0);
                    class311.method1872(-4408, "Render cores now: " + class549.field7635);
                    return;
                }
                class311.method1872(-4408, "Current toolkit doesn't support multiple cores");
                return;
            }
            if (arg1.startsWith("cachespace")) {
                class311.method1872(-4408, "I(s): " + class610.field8774.method318(63) + "/" + class610.field8774.method312(0));
                class311.method1872(-4408, "I(m): " + class583.field8437.method318(118) + "/" + class583.field8437.method312(0));
                class311.method1872(-4408, "O(s): " + class98.field1307.field8503.method1020(-25022) + "/" + class98.field1307.field8503.method1022(true));
                return;
            }
            if (arg1.equalsIgnoreCase("getcamerapos")) {
                class311.method1872(-4408, "Pos: " + class147.field1899.field6358 + "," + ((class196.field2555 >> 9) + class525.field7310 >> 6) + "," + ((class434.field5901 >> 9) + class58.field786 >> 6) + "," + ((class196.field2555 >> 9) + class525.field7310 & 0x3F) + "," + ((class434.field5901 >> 9) + class58.field786 & 0x3F) + " Height: " + (class341.method2147(class147.field1899.field6358, class196.field2555, 0, class434.field5901) - class186.field2364));
                class311.method1872(-4408, "Look: " + class147.field1899.field6358 + "," + (class525.field7310 + class351.field4941 >> 6) + "," + (class6.field58 + class58.field786 >> 6) + "," + (class525.field7310 + class351.field4941 & 0x3F) + "," + (class6.field58 + class58.field786 & 0x3F) + " Height: " + (class341.method2147(class147.field1899.field6358, class351.field4941, 0, class6.field58) - class84.field1139));
                return;
            }
            if (arg1.equals("showocc")) {
                class501.field6948 = !class501.field6948;
                class633.method3662(1);
                class311.method1872(-4408, "showocc=" + class501.field6948);
                return;
            }
            if (arg1.equals("wallocc")) {
                class297.field3894 = !class297.field3894;
                class633.method3662(1);
                class311.method1872(-4408, "forcewallocc=" + class297.field3894);
                return;
            }
            if (arg1.equals("renderprofile") || arg1.equals("rp")) {
                class550.field7643 = !class550.field7643;
                class301.field3918.method968(class550.field7643);
                class19.method94(0);
                class311.method1872(-4408, "showprofiling=" + class550.field7643);
                return;
            }
            if (arg1.startsWith("performancetest")) {
                int var17 = -1;
                int var18 = 1000;
                if (arg1.length() > 15) {
                    String[] var19 = class455.method2637(' ', (byte) 73, arg1);
                    try {
                        if (var19.length > 1) {
                            var18 = Integer.parseInt(var19[1]);
                        }
                    } catch (Throwable var33) {
                    }
                    try {
                        if (var19.length > 2) {
                            var17 = Integer.parseInt(var19[2]);
                        }
                    } catch (Throwable var32) {
                    }
                }
                if (var17 != -1) {
                    class311.method1872(-4408, "Performance: " + class228.method1446(var18, false, class428.field5845));
                    return;
                }
                class311.method1872(-4408, "Java toolkit: " + class228.method1446(var18, false, 0));
                class311.method1872(-4408, "SSE toolkit:  " + class228.method1446(var18, false, 2));
                class311.method1872(-4408, "D3D toolkit:  " + class228.method1446(var18, false, 3));
                class311.method1872(-4408, "GL toolkit:   " + class228.method1446(var18, false, 1));
                return;
            }
            if (arg1.equals("renderer")) {
                class183 var20 = class301.field3918.method988();
                class311.method1872(-4408, "Vendor: " + var20.field2346);
                class311.method1872(-4408, "Name: " + var20.field2345);
                class311.method1872(-4408, "Version: " + var20.field2342);
                class311.method1872(-4408, "Device: " + var20.field2347);
                class311.method1872(-4408, "Driver Version: " + var20.field2348);
                return;
            }
            if (arg1.equals("nonpcs")) {
                class14.field137 = !class14.field137;
                class311.method1872(-4408, "nonpcs=" + class14.field137);
                return;
            }
            if (arg1.equals("autoworld")) {
                class15.method73(80);
                class311.method1872(-4408, "auto world selected");
                return;
            }
            if (arg1.startsWith("switchworld")) {
                int var21 = Integer.parseInt(arg1.substring(12));
                class489.method2749(var21, class613.method3502(1, var21).field3455, 3);
                class311.method1872(-4408, "switched");
                return;
            }
            if (arg1.equals("getworld")) {
                class311.method1872(-4408, "w: " + class78.field1058.field3702);
                return;
            }
            if (arg1.startsWith("pc")) {
                class118.method650(true, class102.field1344);
                class272.field3457.method3060(0, -25098);
                int var22 = class272.field3457.field7707;
                int var23 = arg1.indexOf(" ", 4);
                class272.field3457.method3040(false, arg1.substring(3, var23));
                class345.method2159(class272.field3457, 2016149504, arg1.substring(var23));
                class272.field3457.method3084((byte) -126, class272.field3457.field7707 - var22);
                return;
            }
            if (arg1.equals("heap")) {
                class311.method1872(-4408, "Heap: " + class282.field3697 + "MB");
                return;
            }
            if (arg1.equals("savevarcs")) {
                class23.method138(1);
                class311.method1872(-4408, "perm varcs saved");
                return;
            }
            if (arg1.equals("scramblevarcs")) {
                for (int var24 = 0; var24 < class121.field1528.length; var24++) {
                    if (class36.field553[var24]) {
                        class121.field1528[var24] = (int) (Math.random() * 99999.0D);
                        if (Math.random() > 0.5D) {
                            class121.field1528[var24] *= -1;
                        }
                    }
                }
                class23.method138(1);
                class311.method1872(-4408, "perm varcs scrambled");
                return;
            }
            if (arg1.equals("showcolmap")) {
                class35.field544 = true;
                class317.method1979((byte) 120);
                class311.method1872(-4408, "colmap is shown");
                return;
            }
            if (arg1.equals("hidecolmap")) {
                class35.field544 = false;
                class317.method1979((byte) 120);
                class311.method1872(-4408, "colmap is hidden");
                return;
            }
            if (arg1.equals("resetcache")) {
                class485.method2738(14);
                class311.method1872(-4408, "Caches reset");
                return;
            }
            if (arg1.equals("profilecpu")) {
                class311.method1872(-4408, class491.method2757(-77) + "ms");
                return;
            }
            if (arg1.startsWith("cpuusage")) {
                int var25 = Integer.parseInt(arg1.substring(9));
                if (var25 >= 0 && var25 <= 4) {
                    class501.field6954.field7842 = var25;
                }
                class311.method1872(-4408, "cpuusage=" + class501.field6954.field7842);
                return;
            }
            if (arg1.startsWith("getclientvarpbit")) {
                int var26 = Integer.parseInt(arg1.substring(17));
                class311.method1872(-4408, "varpbit=" + class257.field3191.method2236(2, var26));
                return;
            }
            if (arg1.startsWith("getclientvarp")) {
                int var27 = Integer.parseInt(arg1.substring(14));
                class311.method1872(-4408, "varp=" + class257.field3191.method2235(var27, 93));
                return;
            }
            if (arg1.startsWith("demologin")) {
                class103.method568(false, 0, (byte) 97);
                return;
            }
            if (arg1.startsWith("newdemologin")) {
                class103.method568(true, 0, (byte) 115);
                return;
            }
            if (arg1.startsWith("directlogin")) {
                String[] var28 = class455.method2637(' ', (byte) -92, arg1.substring(12));
                if (var28.length >= 2) {
                    int var29 = var28.length > 2 ? Integer.parseInt(var28[2]) : 0;
                    class28.method166((byte) 52, var28[0], var29, var28[1]);
                    return;
                }
            }
            if (arg1.startsWith("csprofileclear")) {
                class218.method1410();
                return;
            }
            if (arg1.startsWith("csprofileoutputc")) {
                class218.method1406(100, false);
                return;
            }
            if (arg1.startsWith("csprofileoutputt")) {
                class218.method1406(10, true);
                return;
            }
            if (arg1.startsWith("texsize")) {
                int var30 = Integer.parseInt(arg1.substring(8));
                class301.field3918.method907(var30);
                return;
            }
            if (arg1.equals("soundstreamcount")) {
                class311.method1872(-4408, "Active streams: " + class92.field1224.method248());
                return;
            }
            if (arg1.equals("autosetup")) {
                class501.field6954.method3535((byte) -112);
                class311.method1872(-4408, "Complete. Toolkit now: " + class428.field5845);
                return;
            }
            if (arg1.equals("errormessage")) {
                class311.method1872(-4408, class123.field1540.method404(-15238));
                return;
            }
            if (class630.field9188 == 9) {
                class118.method650(true, class496.field6918);
                class280.field3655++;
                class272.field3457.method3060(arg1.length() + 3, -25098);
                class272.field3457.method3060(arg3 ? 1 : 0, -25098);
                class272.field3457.method3060(arg2 ? 1 : 0, -25098);
                class272.field3457.method3040(false, arg1);
            }
            if (arg1.startsWith("fps ") && class628.field9174 != class602.field8701) {
                class168.method1002(20, class254.method1532(arg1.substring(4), 2));
                return;
            }
            if (class630.field9188 != 9) {
                class311.method1872(-4408, "Unrecogonised commmand when not logged in: " + arg1);
                return;
            }
        } catch (Exception var34) {
            class311.method1872(-4408, "Whoops, something went wrong.");
            return;
        }
    }
}
