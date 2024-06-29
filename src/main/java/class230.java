import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class230 {

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    public static int field3566 = 0;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
    public static int field3567 = 0;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "Los;")
    public static class309 field3565 = new class309("shake:", "schütteln:", "tremblement:", "tremor:");

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
    public static int field3568 = 4;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "Z")
    public static boolean field3569 = true;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "Lph;")
    public static class459 field3570;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ljava/lang/String;ZZI)V", line = 4)
    public static final void method1518(String arg0, boolean arg1, boolean arg2, int arg3) {
        field3563++;
        if (class9.field137 != class522.field7582 || class239.field3706 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equals("nativememerror")) {
                throw new OutOfMemoryError("native(MPR");
            }
            try {
                if (arg0.equalsIgnoreCase("fpson")) {
                    class1.field32 = true;
                    class113.method944((byte) -55, "fps debug enabled");
                    return;
                }
                if (arg0.equalsIgnoreCase("fpsoff")) {
                    class1.field32 = false;
                    class113.method944((byte) -69, "fps debug disabled");
                    return;
                }
                if (arg0.equals("systemmem")) {
                    try {
                        class113.method944((byte) 106, "System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
                        return;
                    } catch (Throwable var27) {
                        return;
                    }
                }
                if (arg0.equalsIgnoreCase("cls")) {
                    class433.field6450 = 0;
                    class103.field1955 = 0;
                    return;
                }
                if (arg0.equalsIgnoreCase("cleartext")) {
                    class4.field81.method538(false);
                    class113.method944((byte) -84, "Text coords cleared");
                    return;
                }
                if (arg0.equalsIgnoreCase("gc")) {
                    class452.method2700((byte) 56);
                    for (int var4 = 0; var4 < 10; var4++) {
                        System.gc();
                    }
                    Runtime var5 = Runtime.getRuntime();
                    int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
                    class113.method944((byte) -83, "mem=" + var6 + "k");
                    return;
                }
                if (arg0.equalsIgnoreCase("compact")) {
                    class452.method2700((byte) 116);
                    for (int var7 = 0; var7 < 10; var7++) {
                        System.gc();
                    }
                    Runtime var8 = Runtime.getRuntime();
                    int var9 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
                    class113.method944((byte) 125, "Memory before cleanup=" + var9 + "k");
                    class496.method2997((byte) -57);
                    class452.method2700((byte) 102);
                    for (int var10 = 0; var10 < 10; var10++) {
                        System.gc();
                    }
                    int var11 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
                    class113.method944((byte) 93, "Memory after cleanup=" + var11 + "k");
                    return;
                }
                if (arg0.equalsIgnoreCase("pcachesize")) {
                    class113.method944((byte) -102, "Number of player models in cache:" + class330.method2086(true));
                    return;
                }
                if (arg0.equalsIgnoreCase("clientdrop")) {
                    class113.method944((byte) -68, "Dropped client connection");
                    if (class466.field6932 == 9) {
                        class479.method2856((byte) -100);
                    } else if (class466.field6932 == 10) {
                        class270.field4095 = true;
                        return;
                    }
                    return;
                }
                if (arg0.equalsIgnoreCase("clientjs5drop")) {
                    class450.field6699.method1737((byte) 95);
                    class113.method944((byte) 119, "Dropped client js5 net queue");
                    return;
                }
                if (arg0.equalsIgnoreCase("serverjs5drop")) {
                    class450.field6699.method1729(-14769);
                    class113.method944((byte) -105, "Dropped server js5 net queue");
                    return;
                }
                if (arg0.equalsIgnoreCase("breakcon")) {
                    class497.field7305.method2867(arg3 + 35805);
                    class216.field3417.method2323((byte) 6);
                    class450.field6699.method1731(-79);
                    class113.method944((byte) -108, "Breaking new connections for 5 seconds");
                    return;
                }
                if (arg0.equalsIgnoreCase("rebuild")) {
                    class488.method2957((byte) 86);
                    class312.method1984(-1);
                    class113.method944((byte) -122, "Rebuilding map");
                    return;
                }
                if (arg0.equalsIgnoreCase("wm1")) {
                    class56.method509(-1, true, 1, -1, false);
                    if (class13.method86(3) != 1) {
                        class113.method944((byte) -78, "wm1 failed");
                        return;
                    }
                    class113.method944((byte) 85, "wm1 succeeded");
                    return;
                }
                if (arg0.equalsIgnoreCase("wm2")) {
                    class56.method509(-1, true, 2, -1, false);
                    if (class13.method86(3) != 2) {
                        class113.method944((byte) 122, "wm2 failed");
                        return;
                    }
                    class113.method944((byte) -55, "wm2 succeeded");
                    return;
                }
                if (arg0.equalsIgnoreCase("wm3")) {
                    class56.method509(1024, true, 3, 768, false);
                    if (class13.method86(3) != 3) {
                        class113.method944((byte) 125, "wm3 failed");
                        return;
                    }
                    class113.method944((byte) -85, "wm3 succeeded");
                    return;
                }
                if (arg0.equalsIgnoreCase("tk0")) {
                    class304.method1944(false, 0);
                    if (class133.field2236 == 0) {
                        class113.method944((byte) -106, "Entered tk0");
                        class186.field2990.field2537 = 0;
                        class186.field2990.method1787((byte) 106, class497.field7305);
                        class1.field46 = false;
                        return;
                    }
                    class113.method944((byte) -104, "Failed to enter tk0");
                    return;
                }
                if (arg0.equalsIgnoreCase("tk1")) {
                    class304.method1944(false, 1);
                    if (class133.field2236 != 1) {
                        class113.method944((byte) -116, "Failed to enter tk1");
                        return;
                    }
                    class113.method944((byte) -63, "Entered tk1");
                    class186.field2990.field2537 = 1;
                    class186.field2990.method1787((byte) 88, class497.field7305);
                    class1.field46 = false;
                    return;
                }
                if (arg0.equalsIgnoreCase("tk2")) {
                    class304.method1944(false, 2);
                    if (class133.field2236 == 2) {
                        class113.method944((byte) 88, "Entered tk2");
                        class186.field2990.field2537 = 2;
                        class186.field2990.method1787((byte) 60, class497.field7305);
                        class1.field46 = false;
                        return;
                    }
                    class113.method944((byte) -57, "Failed to enter tk2");
                    return;
                }
                if (arg0.equalsIgnoreCase("tk3")) {
                    class304.method1944(false, 3);
                    if (class133.field2236 == 3) {
                        class113.method944((byte) 74, "Entered tk3");
                        return;
                    }
                    class113.method944((byte) 105, "Failed to enter tk3");
                    return;
                }
                if (arg0.equalsIgnoreCase("ot")) {
                    class186.field2990.field2541 = !class186.field2990.field2541;
                    class186.field2990.method1787((byte) 126, class497.field7305);
                    class1.field46 = false;
                    class488.method2957((byte) 111);
                    class113.method944((byte) 72, "ot=" + class186.field2990.field2541);
                    return;
                }
                if (arg0.equalsIgnoreCase("gb")) {
                    class186.field2990.field2557 = !class186.field2990.field2557;
                    class186.field2990.method1787((byte) 95, class497.field7305);
                    class1.field46 = false;
                    class488.method2957((byte) 92);
                    class113.method944((byte) 102, "gb=" + class186.field2990.field2557);
                    return;
                }
                if (arg0.startsWith("shadows")) {
                    if (arg0.length() < 8) {
                        class113.method944((byte) -58, "Invalid shadows value");
                        return;
                    }
                    String var12 = arg0.substring(8);
                    int var13 = class257.method1657(var12, true) ? class19.method129(-104, var12) : -1;
                    if (var13 >= 0 && var13 <= 2) {
                        class186.field2990.method1131(class133.field2236, false, var13);
                        class186.field2990.method1787((byte) 113, class497.field7305);
                        class1.field46 = false;
                        class488.method2957((byte) 112);
                        class113.method944((byte) 95, "shadows=" + var13);
                        return;
                    }
                    class113.method944((byte) -75, "Invalid shadows value");
                    return;
                }
                if (arg0.startsWith("textures")) {
                    class186.field2990.field2531 = !class186.field2990.field2531;
                    class186.field2990.method1787((byte) 70, class497.field7305);
                    class1.field46 = false;
                    class256.method1648(87);
                    class488.method2957((byte) 87);
                    class113.method944((byte) 89, "textures=" + class186.field2990.field2531);
                    return;
                }
                if (arg0.startsWith("setba")) {
                    if (arg0.length() < 6) {
                        class113.method944((byte) 113, "Invalid buildarea value");
                        return;
                    }
                    int var14 = class19.method129(-73, arg0.substring(6));
                    if (var14 >= 0 && class469.method2803(32, class370.field5418) >= var14) {
                        class186.field2990.field2545 = var14;
                        class186.field2990.method1787((byte) 63, class497.field7305);
                        class1.field46 = false;
                        class113.method944((byte) -115, "maxbuildarea=" + class186.field2990.field2545);
                        return;
                    }
                    class113.method944((byte) 106, "Invalid buildarea value");
                    return;
                }
                if (arg0.startsWith("setparticles")) {
                    if (arg0.length() < 13) {
                        class113.method944((byte) 96, "Invalid particles value");
                        return;
                    }
                    class79.method706(class19.method129(arg3 ^ 0x7811, arg0.substring(13)), arg3 ^ 0xFFFF87AA);
                    class186.field2990.method1787((byte) 68, class497.field7305);
                    class1.field46 = false;
                    class113.method944((byte) -84, "particles=" + class358.method2207(0));
                    return;
                }
                if (arg0.startsWith("rect_debug")) {
                    if (arg0.length() < 10) {
                        class113.method944((byte) -58, "Invalid rect_debug value");
                        return;
                    }
                    class47.field974 = class19.method129(-80, arg0.substring(10).trim());
                    class113.method944((byte) 119, "rect_debug=" + class47.field974);
                    return;
                }
                if (arg0.equalsIgnoreCase("qa_op_test")) {
                    class321.field4902 = true;
                    class113.method944((byte) -127, "qa_op_test=" + class321.field4902);
                    return;
                }
                if (arg0.equalsIgnoreCase("clipcomponents")) {
                    class46.field967 = !class46.field967;
                    class113.method944((byte) -107, "clipcomponents=" + class46.field967);
                    return;
                }
                if (arg0.startsWith("bloom")) {
                    boolean var15 = class262.field4006.method334();
                    if (class27.method193(0, !var15)) {
                        if (var15) {
                            class113.method944((byte) 103, "Bloom disabled");
                            return;
                        }
                        class113.method944((byte) -99, "Bloom enabled");
                        return;
                    }
                    class113.method944((byte) 75, "Failed to enable bloom");
                    return;
                }
                if (arg0.equalsIgnoreCase("tween")) {
                    if (class424.field6376) {
                        class424.field6376 = false;
                        class113.method944((byte) 127, "Forced tweening disabled.");
                        return;
                    }
                    class424.field6376 = true;
                    class113.method944((byte) 100, "Forced tweening ENABLED!");
                    return;
                }
                if (arg0.equalsIgnoreCase("shiftclick")) {
                    if (class479.field7063) {
                        class113.method944((byte) -57, "Shift-click disabled.");
                        class479.field7063 = false;
                        return;
                    }
                    class113.method944((byte) -55, "Shift-click ENABLED!");
                    class479.field7063 = true;
                    return;
                }
                if (arg0.equalsIgnoreCase("getcgcoord")) {
                    class113.method944((byte) -95, "x:" + (class15.field266.field6073 >> 7) + " z:" + (class15.field266.field6078 >> 7));
                    return;
                }
                if (arg0.equalsIgnoreCase("getheight")) {
                    class113.method944((byte) 83, "Height: " + class520.field7560[class15.field266.field6084].method177(class15.field266.field6073 >> 7, class15.field266.field6078 >> 7));
                    return;
                }
                if (arg0.equalsIgnoreCase("resetminimap")) {
                    class455.field6758.method2755(27598);
                    class455.field6758.method2742(arg3 ^ 0xFFFF87AB);
                    class160.field2586.method2131((byte) 110);
                    class309.field4682.method1248(true);
                    class312.method1984(-1);
                    class113.method944((byte) -110, "Minimap reset");
                    return;
                }
                if (arg0.startsWith("mc")) {
                    if (!class262.field4006.method351()) {
                        class113.method944((byte) -72, "Current toolkit doesn't support multiple cores");
                        return;
                    }
                    int var16 = Integer.parseInt(arg0.substring(3));
                    if (var16 < 1) {
                        var16 = 1;
                    } else if (var16 > 4) {
                        var16 = 4;
                    }
                    class327.field4949 = var16;
                    class262.field4006.method358(class327.field4949);
                    class262.field4006.method316(0);
                    class113.method944((byte) -54, "Render cores now: " + class327.field4949);
                    return;
                }
                if (arg0.startsWith("cachespace")) {
                    class113.method944((byte) -89, "I(s): " + class479.field7061.method2470(-11020) + "/" + class479.field7061.method2481(arg3 ^ 0xFFFF8754));
                    class113.method944((byte) 79, "I(m): " + class50.field1009.method2470(-11020) + "/" + class50.field1009.method2481(255));
                    class113.method944((byte) -72, "O(s): " + class135.field2271.field3900.method2028(true) + "/" + class135.field2271.field3900.method2025(-40));
                    return;
                }
                if (arg0.equalsIgnoreCase("getcamerapos")) {
                    class113.method944((byte) -118, "Pos: " + class15.field266.field6084 + "," + ((class509.field7427 >> 7) + class496.field7292 >> 6) + "," + ((class432.field6435 >> 7) + class212.field3378 >> 6) + "," + ((class509.field7427 >> 7) + class496.field7292 & 0x3F) + "," + ((class432.field6435 >> 7) + class212.field3378 & 0x3F) + " Height: " + (class483.method2899(class15.field266.field6084, class509.field7427, class432.field6435, false) - class428.field6406));
                    class113.method944((byte) 69, "Look: " + class15.field266.field6084 + "," + (class457.field6778 + class496.field7292 >> 6) + "," + (class522.field7579 + class212.field3378 >> 6) + "," + (class496.field7292 + class457.field6778 & 0x3F) + "," + (class522.field7579 + class212.field3378 & 0x3F) + " Height: " + (class483.method2899(class15.field266.field6084, class457.field6778, class522.field7579, false) - class102.field1944));
                    return;
                }
                if (arg0.equals("showocc")) {
                    class198.field3186 = !class198.field3186;
                    class488.method2957((byte) 105);
                    class113.method944((byte) -86, "showocc=" + class198.field3186);
                    return;
                }
                if (arg0.equals("wallocc")) {
                    class123.field2141 = !class123.field2141;
                    class488.method2957((byte) 117);
                    class113.method944((byte) 114, "forcewallocc=" + class123.field2141);
                    return;
                }
                if (arg0.equals("renderprofile") || arg0.equals("rp")) {
                    class307.field4661 = !class307.field4661;
                    class262.field4006.method279(class307.field4661);
                    class298.method1922(-21237);
                    class113.method944((byte) 74, "showprofiling=" + class307.field4661);
                    return;
                }
                if (arg0.equals("performancetest")) {
                    class113.method944((byte) 111, "Java toolkit: " + class328.method2074((byte) 116, 0, class497.field7305));
                    class113.method944((byte) 76, "GL toolkit:   " + class328.method2074((byte) 96, 1, class497.field7305));
                    class113.method944((byte) 97, "SSE toolkit:  " + class328.method2074((byte) 87, 2, class497.field7305));
                    return;
                }
                if (arg0.equals("nonpcs")) {
                    class460.field6852 = !class460.field6852;
                    class113.method944((byte) 75, "nonpcs=" + class460.field6852);
                    return;
                }
                if (arg0.equals("autoworld")) {
                    class71.method612(arg3 + 31539);
                    class113.method944((byte) -70, "auto world selected");
                    return;
                }
                if (arg0.startsWith("switchworld")) {
                    int var17 = Integer.parseInt(arg0.substring(12));
                    class320.method2053(class327.method2073(var17, (byte) 104).field3912, -8983, var17);
                    class113.method944((byte) 94, "switched");
                    return;
                }
                if (arg0.equals("getworld")) {
                    class113.method944((byte) 103, "w: " + class444.field6606.field3818);
                    return;
                }
                if (arg0.startsWith("pc")) {
                    class459.method2765(class352.field5196, (byte) 87);
                    class335.field5062.method1814(0, true);
                    int var18 = class335.field5062.field4399;
                    int var19 = arg0.indexOf(" ", 4);
                    class335.field5062.method1821(arg0.substring(3, var19), arg3 ^ 0xFFFF87EF);
                    class396.method2460(false, class335.field5062, arg0.substring(var19));
                    class335.field5062.method1828(false, class335.field5062.field4399 - var18);
                    return;
                }
                if (arg0.equals("heap")) {
                    class113.method944((byte) 106, "Heap: " + class370.field5418 + "MB");
                    return;
                }
                if (arg0.equals("savevarcs")) {
                    class177.method1213(1);
                    class113.method944((byte) -72, "perm varcs saved");
                    return;
                }
                if (arg0.equals("scramblevarcs")) {
                    for (int var20 = 0; var20 < class81.field1675.length; var20++) {
                        if (class68.field1377[var20]) {
                            class81.field1675[var20] = (int) (Math.random() * 99999.0D);
                            if (Math.random() > 0.5D) {
                                class81.field1675[var20] *= -1;
                            }
                        }
                    }
                    class177.method1213(arg3 ^ 0xFFFF87AA);
                    class113.method944((byte) 100, "perm varcs scrambled");
                    return;
                }
                if (arg0.equals("showcolmap")) {
                    class105.field1965 = true;
                    class312.method1984(arg3 ^ 0x7854);
                    class113.method944((byte) 123, "colmap is shown");
                    return;
                }
                if (arg0.equals("hidecolmap")) {
                    class105.field1965 = false;
                    class312.method1984(-1);
                    class113.method944((byte) 74, "colmap is hidden");
                    return;
                }
                if (arg0.equals("resetcache")) {
                    class170.method1191(32427);
                    class113.method944((byte) 86, "Caches reset");
                    return;
                }
                if (arg0.equals("profilecpu")) {
                    class113.method944((byte) 120, class233.method1535(-111) + "ms");
                    return;
                }
                if (arg0.startsWith("cpuusage")) {
                    int var21 = Integer.parseInt(arg0.substring(9));
                    if (var21 >= 0 && var21 <= 4) {
                        class186.field2990.field2554 = var21;
                    }
                    class113.method944((byte) 71, "cpuusage=" + class186.field2990.field2554);
                    return;
                }
                if (arg0.startsWith("getclientvarpbit")) {
                    int var22 = Integer.parseInt(arg0.substring(17));
                    class113.method944((byte) -118, "varpbit=" + class402.field6080.method90(var22, (byte) 119));
                    return;
                }
                if (arg0.startsWith("getclientvarp")) {
                    int var23 = Integer.parseInt(arg0.substring(14));
                    class113.method944((byte) 86, "varp=" + class402.field6080.method92(var23, arg3 ^ 0xCA8));
                    return;
                }
                if (arg0.startsWith("demologin")) {
                    class95.method856(0, false, 111);
                    return;
                }
                if (arg0.startsWith("newdemologin")) {
                    class95.method856(0, true, 29);
                    return;
                }
                if (arg0.startsWith("directlogin")) {
                    String[] var24 = class266.method1697(0, ' ', arg0.substring(12));
                    if (var24.length >= 2) {
                        int var25 = var24.length > 2 ? Integer.parseInt(var24[2]) : 0;
                        class424.method2580(var24[0], (byte) -71, var24[1], var25);
                        return;
                    }
                }
                if (arg0.startsWith("csprofileclear")) {
                    class495.method2988();
                    return;
                }
                if (arg0.startsWith("csprofileoutputc")) {
                    class495.method2993(100, false);
                    return;
                }
                if (arg0.startsWith("csprofileoutputt")) {
                    class495.method2993(10, true);
                    return;
                }
                if (arg0.startsWith("texsize")) {
                    int var26 = Integer.parseInt(arg0.substring(8));
                    class262.field4006.method413(var26);
                    return;
                }
                if (arg0.equals("soundstreamcount")) {
                    class113.method944((byte) 70, "Active streams: " + class288.field4357.method2155());
                    return;
                }
                if (class466.field6932 == 9) {
                    class95.field1859++;
                    class459.method2765(client.field3216, (byte) 87);
                    class335.field5062.method1814(arg0.length() + 3, true);
                    class335.field5062.method1814(arg1 ? 1 : 0, true);
                    class335.field5062.method1814(arg2 ? 1 : 0, true);
                    class335.field5062.method1821(arg0, arg3 + 30915);
                }
                if (arg0.startsWith("fps ") && class9.field137 != class522.field7582) {
                    class150.method1100(-124, class19.method129(-55, arg0.substring(4)));
                    return;
                }
                if (class466.field6932 != 9) {
                    class113.method944((byte) 89, "Unrecogonised commmand when not logged in: " + arg0);
                }
            } catch (Exception var28) {
                class113.method944((byte) 85, "Whoops, something went wrong.");
            }
        }
        if (arg3 != -30805) {
            method1521((byte) -113);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIII)V", line = 796)
    public static final void method1519(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class281.field4248 != null) {
            class281.field4248[arg0][arg1] = arg2 | 0xFF000000;
        }
        if (class283.field4264 != null) {
            class283.field4264[arg0][arg1] = (short) arg3;
        }
        if (class214.field3393 != null) {
            class214.field3393[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(BD)V", line = 810)
    public static final void method1520(byte arg0, double arg1) {
        if (arg0 > -102) {
            return;
        }
        field3564++;
        if (class469.field6948 == arg1) {
            return;
        }
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
            class517.field7506[var3] = var4 > 255 ? 255 : var4;
        }
        class469.field6948 = arg1;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V", line = 839)
    public static void method1521(byte arg0) {
        field3565 = null;
        field3570 = null;
        if (arg0 >= -105) {
            method1521((byte) 41);
        }
    }
}
