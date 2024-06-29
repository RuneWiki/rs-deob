import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class162 {

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public static int field2458 = 0;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILjava/lang/String;ZZ)V")
    public static final void method1175(int arg0, String arg1, boolean arg2, boolean arg3) {
        field2457++;
        if (class438.field6237 != class368.field5320 || class37.field791 >= 2) {
            if (arg1.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg1.equals("nativememerror")) {
                throw new OutOfMemoryError("native(MPR");
            }
            try {
                if (arg1.equalsIgnoreCase("fpson")) {
                    class350.field5134 = true;
                    class329.method2077(arg0 ^ 0xED591398, "fps debug enabled");
                    return;
                }
                if (arg1.equalsIgnoreCase("fpsoff")) {
                    class350.field5134 = false;
                    class329.method2077(-1, "fps debug disabled");
                    return;
                }
                if (arg1.equals("systemmem")) {
                    try {
                        class329.method2077(arg0 - 312929384, "System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
                        return;
                    } catch (Throwable var27) {
                        return;
                    }
                }
                if (arg1.equalsIgnoreCase("cls")) {
                    class490.field7070 = 0;
                    class345.field5085 = 0;
                    return;
                }
                if (arg1.equalsIgnoreCase("cleartext")) {
                    class27.field379.method901(-1);
                    class329.method2077(-1, "Text coords cleared");
                    return;
                }
                if (arg1.equalsIgnoreCase("gc")) {
                    class138.method1012(7576);
                    for (int var4 = 0; var4 < 10; var4++) {
                        System.gc();
                    }
                    Runtime var5 = Runtime.getRuntime();
                    int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
                    class329.method2077(-1, "mem=" + var6 + "k");
                    return;
                }
                if (arg1.equalsIgnoreCase("compact")) {
                    class138.method1012(arg0 ^ 0x12A6F1FF);
                    for (int var7 = 0; var7 < 10; var7++) {
                        System.gc();
                    }
                    Runtime var8 = Runtime.getRuntime();
                    int var9 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
                    class329.method2077(arg0 ^ 0xED591398, "Memory before cleanup=" + var9 + "k");
                    class174.method1221((byte) 5);
                    class138.method1012(7576);
                    for (int var10 = 0; var10 < 10; var10++) {
                        System.gc();
                    }
                    int var11 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
                    class329.method2077(-1, "Memory after cleanup=" + var11 + "k");
                    return;
                }
                if (arg1.equalsIgnoreCase("pcachesize")) {
                    class329.method2077(-1, "Number of player models in cache:" + class226.method1522(arg0 ^ -312927478));
                    return;
                }
                if (arg1.equalsIgnoreCase("clientdrop")) {
                    class329.method2077(-1, "Dropped client connection");
                    if (class37.field799 == 9) {
                        class230.method1540(513);
                    } else if (class37.field799 == 10) {
                        class161.field2455 = true;
                        return;
                    }
                    return;
                }
                if (arg1.equalsIgnoreCase("clientjs5drop")) {
                    class479.field6979.method465(arg0 - 312929508);
                    class329.method2077(arg0 ^ 0xED591398, "Dropped client js5 net queue");
                    return;
                }
                if (arg1.equalsIgnoreCase("serverjs5drop")) {
                    class479.field6979.method458(0);
                    class329.method2077(arg0 ^ 0xED591398, "Dropped server js5 net queue");
                    return;
                }
                if (arg1.equalsIgnoreCase("breakcon")) {
                    class280.field4173.method2450(1791807024);
                    class410.field5802.method1292((byte) 3);
                    class479.field6979.method464((byte) -104);
                    class329.method2077(-1, "Breaking new connections for 5 seconds");
                    return;
                }
                if (arg1.equalsIgnoreCase("rebuild")) {
                    class519.method3046(-73);
                    class322.method2064(false);
                    class329.method2077(arg0 - 312929384, "Rebuilding map");
                    return;
                }
                if (arg1.equalsIgnoreCase("wm1")) {
                    class477.method2825(-1, -1, 3, 1, false);
                    if (class360.method2235(32397) == 1) {
                        class329.method2077(-1, "wm1 succeeded");
                        return;
                    }
                    class329.method2077(-1, "wm1 failed");
                    return;
                }
                if (arg1.equalsIgnoreCase("wm2")) {
                    class477.method2825(-1, -1, arg0 ^ 0x12A6EC64, 2, false);
                    if (class360.method2235(32397) == 2) {
                        class329.method2077(-1, "wm2 succeeded");
                        return;
                    }
                    class329.method2077(arg0 ^ 0xED591398, "wm2 failed");
                    return;
                }
                if (arg1.equalsIgnoreCase("wm3")) {
                    class477.method2825(1024, 768, arg0 ^ 0x12A6EC64, 3, false);
                    if (class360.method2235(arg0 ^ 0x12A692EA) != 3) {
                        class329.method2077(arg0 - 312929384, "wm3 failed");
                        return;
                    }
                    class329.method2077(-1, "wm3 succeeded");
                    return;
                }
                if (arg1.equalsIgnoreCase("tk0")) {
                    class322.method2063(0, arg0 - 312929506);
                    if (class74.field1211 == 0) {
                        class329.method2077(-1, "Entered tk0");
                        class220.field3371.field2553 = 0;
                        class220.field3371.method1044(1, class280.field4173);
                        class132.field2068 = false;
                        return;
                    }
                    class329.method2077(-1, "Failed to enter tk0");
                    return;
                }
                if (arg1.equalsIgnoreCase("tk1")) {
                    class322.method2063(1, 36);
                    if (class74.field1211 != 1) {
                        class329.method2077(-1, "Failed to enter tk1");
                        return;
                    }
                    class329.method2077(-1, "Entered tk1");
                    class220.field3371.field2553 = 1;
                    class220.field3371.method1044(1, class280.field4173);
                    class132.field2068 = false;
                    return;
                }
                if (arg1.equalsIgnoreCase("tk2")) {
                    class322.method2063(2, -127);
                    if (class74.field1211 != 2) {
                        class329.method2077(-1, "Failed to enter tk2");
                        return;
                    }
                    class329.method2077(-1, "Entered tk2");
                    class220.field3371.field2553 = 2;
                    class220.field3371.method1044(1, class280.field4173);
                    class132.field2068 = false;
                    return;
                }
                if (arg1.equalsIgnoreCase("tk3")) {
                    class322.method2063(3, -127);
                    if (class74.field1211 != 3) {
                        class329.method2077(-1, "Failed to enter tk3");
                        return;
                    }
                    class329.method2077(arg0 - 312929384, "Entered tk3");
                    return;
                }
                if (arg1.equalsIgnoreCase("ot")) {
                    class220.field3371.field2582 = !class220.field3371.field2582;
                    class220.field3371.method1044(arg0 ^ 0x12A6EC66, class280.field4173);
                    class132.field2068 = false;
                    class519.method3046(arg0 - 312929452);
                    class329.method2077(-1, "ot=" + class220.field3371.field2582);
                    return;
                }
                if (arg1.equalsIgnoreCase("gb")) {
                    class220.field3371.field2586 = !class220.field3371.field2586;
                    class220.field3371.method1044(1, class280.field4173);
                    class132.field2068 = false;
                    class519.method3046(arg0 ^ 0xED5913D0);
                    class329.method2077(-1, "gb=" + class220.field3371.field2586);
                    return;
                }
                if (arg1.startsWith("shadows")) {
                    if (arg1.length() < 8) {
                        class329.method2077(-1, "Invalid shadows value");
                        return;
                    }
                    String var12 = arg1.substring(8);
                    int var13 = class238.method1577(var12, 10) ? class292.method1880(98, var12) : -1;
                    if (var13 >= 0 && var13 <= 2) {
                        class220.field3371.method1212(false, var13, class74.field1211);
                        class220.field3371.method1044(1, class280.field4173);
                        class132.field2068 = false;
                        class519.method3046(-101);
                        class329.method2077(-1, "shadows=" + var13);
                        return;
                    }
                    class329.method2077(-1, "Invalid shadows value");
                    return;
                }
                if (arg1.startsWith("textures")) {
                    class220.field3371.field2583 = !class220.field3371.field2583;
                    class220.field3371.method1044(1, class280.field4173);
                    class132.field2068 = false;
                    class305.method1949((byte) 51);
                    class519.method3046(arg0 ^ 0xED5913D2);
                    class329.method2077(arg0 ^ 0xED591398, "textures=" + class220.field3371.field2583);
                    return;
                }
                if (arg1.startsWith("setba")) {
                    if (arg1.length() < 6) {
                        class329.method2077(arg0 - 312929384, "Invalid buildarea value");
                        return;
                    }
                    int var14 = class292.method1880(118, arg1.substring(6));
                    if (var14 >= 0 && var14 <= class475.method2818(0, class414.field5859)) {
                        class220.field3371.field2564 = var14;
                        class220.field3371.method1044(arg0 - 312929382, class280.field4173);
                        class132.field2068 = false;
                        class329.method2077(-1, "maxbuildarea=" + class220.field3371.field2564);
                        return;
                    }
                    class329.method2077(-1, "Invalid buildarea value");
                    return;
                }
                if (arg1.startsWith("setparticles")) {
                    if (arg1.length() < 13) {
                        class329.method2077(-1, "Invalid particles value");
                        return;
                    }
                    class179.method1248(-67, class292.method1880(120, arg1.substring(13)));
                    class220.field3371.method1044(arg0 ^ 0x12A6EC66, class280.field4173);
                    class132.field2068 = false;
                    class329.method2077(arg0 ^ 0xED591398, "particles=" + class501.method2925(-97));
                    return;
                }
                if (arg1.startsWith("rect_debug")) {
                    if (arg1.length() < 10) {
                        class329.method2077(-1, "Invalid rect_debug value");
                        return;
                    }
                    class166.field2492 = class292.method1880(60, arg1.substring(10).trim());
                    class329.method2077(arg0 ^ 0xED591398, "rect_debug=" + class166.field2492);
                    return;
                }
                if (arg1.equalsIgnoreCase("qa_op_test")) {
                    class65.field1107 = true;
                    class329.method2077(arg0 ^ 0xED591398, "qa_op_test=" + class65.field1107);
                    return;
                }
                if (arg1.equalsIgnoreCase("clipcomponents")) {
                    class528.field7721 = !class528.field7721;
                    class329.method2077(-1, "clipcomponents=" + class528.field7721);
                    return;
                }
                if (arg1.startsWith("bloom")) {
                    boolean var15 = class76.field1256.method292();
                    if (!class390.method2353((byte) -70, !var15)) {
                        class329.method2077(-1, "Failed to enable bloom");
                        return;
                    }
                    if (!var15) {
                        class329.method2077(-1, "Bloom enabled");
                        return;
                    }
                    class329.method2077(arg0 - 312929384, "Bloom disabled");
                    return;
                }
                if (arg1.equalsIgnoreCase("tween")) {
                    if (!class89.field1441) {
                        class89.field1441 = true;
                        class329.method2077(-1, "Forced tweening ENABLED!");
                        return;
                    }
                    class89.field1441 = false;
                    class329.method2077(-1, "Forced tweening disabled.");
                    return;
                }
                if (arg1.equalsIgnoreCase("shiftclick")) {
                    if (!class65.field1106) {
                        class329.method2077(-1, "Shift-click ENABLED!");
                        class65.field1106 = true;
                        return;
                    }
                    class329.method2077(-1, "Shift-click disabled.");
                    class65.field1106 = false;
                    return;
                }
                if (arg1.equalsIgnoreCase("getcgcoord")) {
                    class329.method2077(-1, "x:" + (class364.field5293.field6961 >> 7) + " z:" + (class364.field5293.field6965 >> 7));
                    return;
                }
                if (arg1.equalsIgnoreCase("getheight")) {
                    class329.method2077(-1, "Height: " + class146.field2262[class364.field5293.field6956].method156(class364.field5293.field6961 >> 7, class364.field5293.field6965 >> 7));
                    return;
                }
                if (arg1.equalsIgnoreCase("resetminimap")) {
                    class96.field1527.method2044((byte) 125);
                    class96.field1527.method2034(-1);
                    class389.field5528.method2877(-67);
                    class506.field7320.method1428(36);
                    class322.method2064(false);
                    class329.method2077(arg0 ^ 0xED591398, "Minimap reset");
                    return;
                }
                if (arg1.startsWith("mc")) {
                    if (!class76.field1256.method187()) {
                        class329.method2077(-1, "Current toolkit doesn't support multiple cores");
                        return;
                    }
                    int var16 = Integer.parseInt(arg1.substring(3));
                    if (var16 < 1) {
                        var16 = 1;
                    } else if (var16 > 4) {
                        var16 = 4;
                    }
                    class327.field4806 = var16;
                    class76.field1256.method317(class327.field4806);
                    class76.field1256.method192(0);
                    class329.method2077(arg0 ^ 0xED591398, "Render cores now: " + class327.field4806);
                    return;
                }
                if (arg1.startsWith("cachespace")) {
                    class329.method2077(-1, "I(s): " + class316.field4697.method2992(-90) + "/" + class316.field4697.method2987(arg0 - 312929382));
                    class329.method2077(-1, "I(m): " + class425.field6026.method2992(arg0 ^ -312929288) + "/" + class425.field6026.method2987(1));
                    class329.method2077(arg0 ^ 0xED591398, "O(s): " + class58.field1052.field3783.method1497((byte) -31) + "/" + class58.field1052.field3783.method1496((byte) 98));
                    return;
                }
                if (arg1.equalsIgnoreCase("getcamerapos")) {
                    class329.method2077(-1, "Pos: " + class364.field5293.field6956 + "," + ((class315.field4688 >> 7) + class82.field1315 >> 6) + "," + ((class397.field5649 >> 7) + class501.field7240 >> 6) + "," + ((class315.field4688 >> 7) + class82.field1315 & 0x3F) + "," + ((class397.field5649 >> 7) + class501.field7240 & 0x3F) + " Height: " + (class224.method1515(class315.field4688, class397.field5649, class364.field5293.field6956, -631749433) - class62.field1086));
                    class329.method2077(-1, "Look: " + class364.field5293.field6956 + "," + (class82.field1315 + class133.field2083 >> 6) + "," + (class52.field964 + class501.field7240 >> 6) + "," + (class82.field1315 + class133.field2083 & 0x3F) + "," + (class52.field964 + class501.field7240 & 0x3F) + " Height: " + (class224.method1515(class133.field2083, class52.field964, class364.field5293.field6956, -631749433) - class305.field4525));
                    return;
                }
                if (arg1.equals("showocc")) {
                    class307.field4546 = !class307.field4546;
                    class519.method3046(arg0 - 312929449);
                    class329.method2077(arg0 - 312929384, "showocc=" + class307.field4546);
                    return;
                }
                if (arg1.equals("wallocc")) {
                    class476.field6938 = !class476.field6938;
                    class519.method3046(-98);
                    class329.method2077(-1, "forcewallocc=" + class476.field6938);
                    return;
                }
                if (arg1.equals("renderprofile") || arg1.equals("rp")) {
                    class523.field7651 = !class523.field7651;
                    class76.field1256.method269(class523.field7651);
                    class405.method2417(123);
                    class329.method2077(-1, "showprofiling=" + class523.field7651);
                    return;
                }
                if (arg1.equals("performancetest")) {
                    class329.method2077(-1, "Java toolkit: " + class451.method2686(class280.field4173, 0, -1));
                    class329.method2077(-1, "GL toolkit:   " + class451.method2686(class280.field4173, 1, arg0 ^ -312929384));
                    class329.method2077(-1, "SSE toolkit:  " + class451.method2686(class280.field4173, 2, -1));
                    return;
                }
                if (arg1.equals("nonpcs")) {
                    class520.field7590 = !class520.field7590;
                    class329.method2077(arg0 - 312929384, "nonpcs=" + class520.field7590);
                    return;
                }
                if (arg1.equals("autoworld")) {
                    class195.method1320(arg0 ^ 0xED590398);
                    class329.method2077(-1, "auto world selected");
                    return;
                }
                if (arg1.startsWith("switchworld")) {
                    int var17 = Integer.parseInt(arg1.substring(12));
                    class33.method307(class267.method1717(var17, -95).field3343, var17, false);
                    class329.method2077(-1, "switched");
                    return;
                }
                if (arg1.equals("getworld")) {
                    class329.method2077(-1, "w: " + class474.field6918.field4020);
                    return;
                }
                if (arg1.startsWith("pc")) {
                    class228.method1528(true, class505.field7300);
                    class276.field4124.method3048(-2034159384, 0);
                    int var18 = class276.field4124.field7558;
                    int var19 = arg1.indexOf(" ", 4);
                    class276.field4124.method3057((byte) -28, arg1.substring(3, var19));
                    class336.method2132(arg1.substring(var19), (byte) 100, class276.field4124);
                    class276.field4124.method3025(class276.field4124.field7558 - var18, 63);
                    return;
                }
                if (arg1.equals("heap")) {
                    class329.method2077(-1, "Heap: " + class414.field5859 + "MB");
                    return;
                }
                if (arg1.equals("savevarcs")) {
                    class478.method2831((byte) 93);
                    class329.method2077(-1, "perm varcs saved");
                    return;
                }
                if (arg1.equals("scramblevarcs")) {
                    for (int var20 = 0; var20 < class288.field4270.length; var20++) {
                        if (class388.field5517[var20]) {
                            class288.field4270[var20] = (int) (Math.random() * 99999.0D);
                            if (Math.random() > 0.5D) {
                                class288.field4270[var20] *= -1;
                            }
                        }
                    }
                    class478.method2831((byte) 105);
                    class329.method2077(arg0 ^ 0xED591398, "perm varcs scrambled");
                    return;
                }
                if (arg1.equals("showcolmap")) {
                    class358.field5202 = true;
                    class322.method2064(false);
                    class329.method2077(-1, "colmap is shown");
                    return;
                }
                if (arg1.equals("hidecolmap")) {
                    class358.field5202 = false;
                    class322.method2064(false);
                    class329.method2077(-1, "colmap is hidden");
                    return;
                }
                if (arg1.equals("resetcache")) {
                    class501.method2928(false);
                    class329.method2077(-1, "Caches reset");
                    return;
                }
                if (arg1.equals("profilecpu")) {
                    class329.method2077(-1, class146.method1040(-110) + "ms");
                    return;
                }
                if (arg1.startsWith("cpuusage")) {
                    int var21 = Integer.parseInt(arg1.substring(9));
                    if (var21 >= 0 && var21 <= 4) {
                        class220.field3371.field2561 = var21;
                    }
                    class329.method2077(-1, "cpuusage=" + class220.field3371.field2561);
                    return;
                }
                if (arg1.startsWith("getclientvarpbit")) {
                    int var22 = Integer.parseInt(arg1.substring(17));
                    class329.method2077(arg0 ^ 0xED591398, "varpbit=" + class84.field1335.method1958(var22, 0));
                    return;
                }
                if (arg1.startsWith("getclientvarp")) {
                    int var23 = Integer.parseInt(arg1.substring(14));
                    class329.method2077(arg0 ^ 0xED591398, "varp=" + class84.field1335.method1961(arg0 - 312935402, var23));
                    return;
                }
                if (arg1.startsWith("demologin")) {
                    class132.method969((byte) 115, 0, false);
                    return;
                }
                if (arg1.startsWith("newdemologin")) {
                    class132.method969((byte) 117, 0, true);
                    return;
                }
                if (arg1.startsWith("directlogin")) {
                    String[] var24 = class446.method2630(arg0 - 312929384, arg1.substring(12), ' ');
                    if (var24.length >= 2) {
                        int var25 = var24.length <= 2 ? 0 : Integer.parseInt(var24[2]);
                        class521.method3087(var25, -115, var24[0], var24[1]);
                        return;
                    }
                }
                if (arg1.startsWith("csprofileclear")) {
                    class281.method1807();
                    return;
                }
                if (arg1.startsWith("csprofileoutputc")) {
                    class281.method1804(100, false);
                    return;
                }
                if (arg1.startsWith("csprofileoutputt")) {
                    class281.method1804(10, true);
                    return;
                }
                if (arg1.startsWith("texsize")) {
                    int var26 = Integer.parseInt(arg1.substring(8));
                    class76.field1256.method198(var26);
                    return;
                }
                if (arg1.equals("soundstreamcount")) {
                    class329.method2077(-1, "Active streams: " + class504.field7295.method1589());
                    return;
                }
                if (arg1.equals("errormessage")) {
                    class329.method2077(arg0 ^ 0xED591398, class212.field3194.method1374((byte) -113));
                    return;
                }
                if (class37.field799 == 9) {
                    class174.field2598++;
                    class228.method1528(true, class316.field4703);
                    class276.field4124.method3048(-2034159384, arg1.length() + 3);
                    class276.field4124.method3048(-2034159384, arg2 ? 1 : 0);
                    class276.field4124.method3048(arg0 ^ 0x9467DC8F, arg3 ? 1 : 0);
                    class276.field4124.method3057((byte) -28, arg1);
                }
                if (arg1.startsWith("fps ") && class438.field6237 != class368.field5320) {
                    class327.method2071(class292.method1880(arg0 ^ 0x12A6EC23, arg1.substring(4)), (byte) -121);
                    return;
                }
                if (class37.field799 != 9) {
                    class329.method2077(arg0 - 312929384, "Unrecogonised commmand when not logged in: " + arg1);
                }
            } catch (Exception var28) {
                class329.method2077(-1, "Whoops, something went wrong.");
            }
        }
        if (arg0 != 312929383) {
            method1175(9, null, true, true);
        }
    }
}
