import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eia")
public class class244 {

    @OriginalMember(owner = "client!eia", name = "d", descriptor = "I")
    public static int field3170 = 0;

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "Llga;")
    public static class712 field3167 = new class712(51, -1);

    @OriginalMember(owner = "client!eia", name = "g", descriptor = "[[I")
    public static int[][] field3173 = new int[128][128];

    @OriginalMember(owner = "client!eia", name = "c", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!eia", name = "f", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!eia", name = "h", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!eia", name = "b", descriptor = "Lni;")
    public static class522 field3168;

    @OriginalMember(owner = "client!eia", name = "e", descriptor = "[Lqca;")
    public static class118[] field3171;

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(Lgv;ILbi;BI)V", line = 10)
    public static final void method1463(class83 arg0, int arg1, class481 arg2, byte arg3, int arg4) {
        field3172++;
        if ((arg1 & 0x400) != 0) {
            int var5 = arg2.method3427((byte) 51);
            arg0.field847 = arg2.method3435(true);
            arg0.field856 = arg2.method3429(-121);
            arg0.field879 = var5 & 0x7FFF;
            arg0.field788 = (var5 & 0x8000) != 0;
            arg0.field870 = class406.field5732 + arg0.field847 + arg0.field879;
        }
        byte var6 = -1;
        if ((arg1 & 0x4000) != 0) {
            int var7 = arg2.method3419((byte) -28);
            int var8 = arg2.method3408(-74);
            if (var7 == 65535) {
                var7 = -1;
            }
            int var9 = arg2.method3428((byte) -112);
            int var10 = var9 & 0x7;
            int var11 = (var9 & 0x7E) >> 3;
            if (var11 == 15) {
                var11 = -1;
            }
            arg0.method541(var11, true, var8, var10, var7, -94);
        }
        if ((arg1 & 0x2000) != 0) {
            var6 = arg2.method3383(-1498293360);
        }
        if ((arg1 & 0x40000) != 0) {
            int var12 = arg2.method3429(111);
            int[] var13 = new int[var12];
            int[] var14 = new int[var12];
            for (int var15 = 0; var15 < var12; var15++) {
                int var16 = arg2.method3427((byte) 111);
                if ((var16 & 0xC000) == 49152) {
                    int var17 = arg2.method3427((byte) -76);
                    var13[var15] = class344.method2020(var17, var16 << 16);
                } else {
                    var13[var15] = var16;
                }
                var14[var15] = arg2.method3402((byte) 127);
            }
            arg0.method547(var14, var13, true);
        }
        if ((arg1 & 0x80) != 0) {
            int var18 = arg2.method3402((byte) 127);
            int var19 = arg2.method3448(true);
            if (var18 == 65535) {
                var18 = -1;
            }
            int var20 = arg2.method3435(true);
            int var21 = var20 & 0x7;
            int var22 = var20 >> 3 & 0xF;
            if (var22 == 15) {
                var22 = -1;
            }
            arg0.method541(var22, false, var19, var21, var18, -72);
        }
        if ((arg1 & 0x200) != 0) {
            arg0.field826 = arg2.method3386((byte) -112);
            arg0.field786 = arg2.method3383(-1498293360);
            arg0.field807 = arg2.method3386((byte) -112);
            arg0.field845 = arg2.method3386((byte) -112);
            arg0.field843 = arg2.method3427((byte) 92) + class406.field5732;
            arg0.field883 = arg2.method3419((byte) -53) + class406.field5732;
            arg0.field864 = arg2.method3435(true);
            if (arg0.field1139) {
                arg0.field786 += arg0.field1158;
                arg0.field845 += arg0.field1158;
                arg0.field826 += arg0.field1124;
                arg0.field807 += arg0.field1124;
                arg0.field895 = 0;
            } else {
                arg0.field786 += arg0.field899[0];
                arg0.field845 += arg0.field899[0];
                arg0.field826 += arg0.field898[0];
                arg0.field807 += arg0.field898[0];
                arg0.field895 = 1;
            }
            arg0.field897 = 0;
        }
        if ((arg1 & 0x4) != 0) {
            arg0.field1112 = arg2.method3419((byte) 91);
            if (arg0.field895 == 0) {
                arg0.method551(arg0.field1112, -8193);
                arg0.field1112 = -1;
            }
        }
        if ((arg1 & 0x2) != 0) {
            int var23 = arg2.method3427((byte) -126);
            if (var23 == 65535) {
                var23 = -1;
            }
            arg0.field809 = var23;
        }
        if ((arg1 & 0x10000) != 0) {
            arg0.field861 = arg2.method3386((byte) -112);
            arg0.field832 = arg2.method3433(128);
            arg0.field815 = arg2.method3433(128);
            arg0.field881 = (byte) arg2.method3428((byte) 107);
            arg0.field860 = class406.field5732 + arg2.method3419((byte) 97);
            arg0.field789 = class406.field5732 + arg2.method3411(98);
        }
        if ((arg1 & 0x8) != 0) {
            int var24 = arg2.method3428((byte) 85);
            if (var24 > 0) {
                for (int var25 = 0; var25 < var24; var25++) {
                    int var26 = -1;
                    int var27 = -1;
                    int var28 = arg2.method3396(1689622712);
                    int var29 = -1;
                    if (var28 == 32767) {
                        var28 = arg2.method3396(1689622712);
                        var27 = arg2.method3396(1689622712);
                        var26 = arg2.method3396(1689622712);
                        var29 = arg2.method3396(1689622712);
                    } else if (var28 == 32766) {
                        var28 = -1;
                    } else {
                        var27 = arg2.method3396(1689622712);
                    }
                    int var30 = arg2.method3396(1689622712);
                    int var31 = arg2.method3428((byte) -105);
                    arg0.method546(var31, false, var27, var28, class406.field5732, var29, var30, var26);
                }
            }
        }
        if ((arg1 & 0x10) != 0) {
            int[] var32 = new int[4];
            for (int var33 = 0; var33 < 4; var33++) {
                var32[var33] = arg2.method3419((byte) -116);
                if (var32[var33] == 65535) {
                    var32[var33] = -1;
                }
            }
            int var34 = arg2.method3425((byte) 58);
            class136.method848(var34, arg0, var32, 0);
        }
        if ((arg1 & 0x40) != 0) {
            int var35 = arg2.method3435(true);
            byte[] var36 = new byte[var35];
            class611 var37 = new class611(var36);
            arg2.method3449(0, var35, false, var36);
            class420.field5891[arg4] = var37;
            arg0.method614(var37, (byte) 73);
        }
        if ((arg1 & 0x1000) != 0) {
            arg0.field1142 = arg2.method3435(true) == 1;
        }
        if (arg3 <= 7) {
            method1464(null, false, true, (byte) -128);
        }
        if ((arg1 & 0x8000) != 0) {
            arg0.field822 = arg2.method3403((byte) 84);
            if (arg0.field822.charAt(0) == '~') {
                arg0.field822 = arg0.field822.substring(1);
                class270.method1616((byte) -96, 2, arg0.field822, 0, arg0.method611(-1, false), arg0.method615(0, true), arg0.field1147);
            } else if (class653.field9086 == arg0) {
                class270.method1616((byte) 90, 2, arg0.field822, 0, arg0.method611(-1, false), arg0.method615(0, true), arg0.field1147);
            }
            arg0.field836 = 150;
            arg0.field853 = 0;
            arg0.field858 = 0;
        }
        if ((arg1 & 0x100) != 0) {
            int var38 = arg2.method3425((byte) -109);
            int[] var39 = new int[var38];
            int[] var40 = new int[var38];
            int[] var41 = new int[var38];
            for (int var42 = 0; var42 < var38; var42++) {
                int var43 = arg2.method3411(79);
                if (var43 == 65535) {
                    var43 = -1;
                }
                var39[var42] = var43;
                var40[var42] = arg2.method3425((byte) 124);
                var41[var42] = arg2.method3419((byte) -37);
            }
            class736.method4120(arg0, -3433, var41, var40, var39);
        }
        if ((arg1 & 0x1) != 0) {
            class422.field5906[arg4] = arg2.method3383(-1498293360);
        }
        if (!arg0.field1139) {
            return;
        }
        if (var6 == 127) {
            arg0.method612(arg0.field1158, arg0.field1124, 1470);
            return;
        }
        byte var44;
        if (var6 == -1) {
            var44 = class422.field5906[arg4];
        } else {
            var44 = var6;
        }
        class596.method3298((byte) 37, var44, arg0);
        arg0.method609(arg0.field1124, arg0.field1158, var44, -1);
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(Ljava/lang/String;ZZB)V", line = 353)
    public static final void method1464(String arg0, boolean arg1, boolean arg2, byte arg3) {
        field3169++;
        try {
            if (arg0.equalsIgnoreCase("commands") || arg0.equalsIgnoreCase("help")) {
                class392.method2288("commands - This command", 114);
                class392.method2288("cls - Clear console", arg3 ^ 0x28);
                class392.method2288("displayfps - Toggle FPS and other information", 98);
                class392.method2288("renderer - Print graphics renderer information", 93);
                class392.method2288("heap - Print java memory information", -83);
                return;
            }
            if (arg0.equalsIgnoreCase("cls")) {
                class52.field549 = 0;
                class543.field7690 = 0;
                return;
            }
            if (arg0.equalsIgnoreCase("displayfps")) {
                class518.field6978 = !class518.field6978;
                if (class518.field6978) {
                    class392.method2288("FPS on", arg3 - 72);
                    return;
                }
                class392.method2288("FPS off", -101);
                return;
            }
            if (arg0.equals("renderer")) {
                class758 var4 = class21.field142.method418();
                class392.method2288("Vendor: " + var4.field10565, -123);
                class392.method2288("Name: " + var4.field10571, arg3 ^ 0xFFFFFFC1);
                class392.method2288("Version: " + var4.field10564, 52);
                class392.method2288("Device: " + var4.field10570, -115);
                class392.method2288("Driver Version: " + var4.field10566, -82);
                return;
            }
            if (arg3 != 117) {
                field3167 = null;
            }
            if (arg0.equals("heap")) {
                class392.method2288("Heap: " + class206.field2483 + "MB", arg3 ^ 0xFFFFFFD5);
                return;
            }
        } catch (Exception var46) {
            class392.method2288(class755.field10479.method4201(class723.field10095, (byte) 25), 107);
            return;
        }
        if (class61.field673 != class200.field2376 || class596.field8304 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equals("nativememerror")) {
                throw new OutOfMemoryError("native(MPR");
            }
            try {
                if (arg0.equalsIgnoreCase("printfps")) {
                    class392.method2288("FPS: " + class573.field8071, -74);
                    return;
                }
                if (arg0.equalsIgnoreCase("occlude")) {
                    class314.field4236 = !class314.field4236;
                    if (class314.field4236) {
                        class392.method2288("Occlsion now on!", arg3 ^ 0xD);
                        return;
                    }
                    class392.method2288("Occlsion now off!", 58);
                    return;
                }
                if (arg0.equalsIgnoreCase("fpson")) {
                    class518.field6978 = true;
                    class392.method2288("fps debug enabled", -85);
                    return;
                }
                if (arg0.equalsIgnoreCase("fpsoff")) {
                    class518.field6978 = false;
                    class392.method2288("fps debug disabled", -74);
                    return;
                }
                if (arg0.equals("systemmem")) {
                    try {
                        class392.method2288("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + class353.field4715.field10203 + "Mb", 108);
                        return;
                    } catch (Throwable var40) {
                        return;
                    }
                }
                if (arg0.equalsIgnoreCase("cleartext")) {
                    class608.field8493.method112(arg3 ^ 0x12);
                    class392.method2288("Text coords cleared", 95);
                    return;
                }
                if (arg0.equalsIgnoreCase("gc")) {
                    class188.method1055(true);
                    for (int var5 = 0; var5 < 10; var5++) {
                        System.gc();
                    }
                    Runtime var6 = Runtime.getRuntime();
                    int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                    class392.method2288("mem=" + var7 + "k", arg3 - 235);
                    return;
                }
                if (arg0.equalsIgnoreCase("compact")) {
                    class188.method1055(true);
                    for (int var8 = 0; var8 < 10; var8++) {
                        System.gc();
                    }
                    Runtime var9 = Runtime.getRuntime();
                    int var10 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                    class392.method2288("Memory before cleanup=" + var10 + "k", -95);
                    class325.method1941(24);
                    class188.method1055(true);
                    for (int var11 = 0; var11 < 10; var11++) {
                        System.gc();
                    }
                    int var12 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                    class392.method2288("Memory after cleanup=" + var12 + "k", 104);
                    return;
                }
                if (arg0.equalsIgnoreCase("unloadnatives")) {
                    class392.method2288(class363.method2078(5) ? "Libraries unloaded" : "Library unloading failed!", -104);
                    return;
                }
                if (arg0.equalsIgnoreCase("clientdrop")) {
                    class392.method2288("Dropped client connection", -67);
                    if (class713.field9949 == 10) {
                        class445.method2494((byte) 104);
                    } else if (class713.field9949 == 11) {
                        class430.field6054 = true;
                        return;
                    }
                    return;
                }
                if (arg0.equalsIgnoreCase("rotateconnectmethods")) {
                    class294.field3941.method3179(0);
                    class392.method2288("Rotated connection methods", arg3 - 206);
                    return;
                }
                if (arg0.equalsIgnoreCase("clientjs5drop")) {
                    class759.field10590.method1371(-45);
                    class392.method2288("Dropped client js5 net queue", arg3 - 220);
                    return;
                }
                if (arg0.equalsIgnoreCase("serverjs5drop")) {
                    class759.field10590.method1376(arg3 ^ 0x7106);
                    class392.method2288("Dropped server js5 net queue", -84);
                    return;
                }
                if (arg0.equalsIgnoreCase("breakcon")) {
                    class287.field3823.method4129(arg3 ^ 0x75);
                    class582.field8161.method1436(-1);
                    class759.field10590.method1381(0);
                    class392.method2288("Breaking new connections for 5 seconds", -110);
                    return;
                }
                if (arg0.equalsIgnoreCase("rebuild")) {
                    class243.method1461((byte) -59);
                    class456.method2548(-109);
                    class392.method2288("Rebuilding map", 107);
                    return;
                }
                if (arg0.equalsIgnoreCase("rebuildprofile")) {
                    class238.field3115 = class538.method2963(-47);
                    class66.field736 = true;
                    class243.method1461((byte) -70);
                    class456.method2548(-115);
                    class392.method2288("Rebuilding map (with profiling)", -119);
                    return;
                }
                if (arg0.equalsIgnoreCase("wm1")) {
                    class426.method2445(1, -1, 3, -1, false);
                    if (class381.method2243((byte) 124) != 1) {
                        class392.method2288("wm1 failed", 99);
                        return;
                    }
                    class392.method2288("wm1 succeeded", 51);
                    return;
                }
                if (arg0.equalsIgnoreCase("wm2")) {
                    class426.method2445(2, -1, arg3 ^ 0x76, -1, false);
                    if (class381.method2243((byte) 107) == 2) {
                        class392.method2288("wm2 succeeded", -94);
                        return;
                    }
                    class392.method2288("wm2 failed", -86);
                    return;
                }
                if (arg0.equalsIgnoreCase("wm3")) {
                    class426.method2445(3, 1024, 3, 768, false);
                    if (class381.method2243((byte) -75) != 3) {
                        class392.method2288("wm3 failed", -108);
                        return;
                    }
                    class392.method2288("wm3 succeeded", 106);
                    return;
                }
                if (arg0.equalsIgnoreCase("tk0")) {
                    class479.method2689(0, false, 103);
                    if (class11.field68.field5503.method741((byte) 121) == 0) {
                        class392.method2288("Entered tk0", 108);
                        class11.field68.method2276((byte) -13, 0, class11.field68.field5530);
                        class355.method2054(-5964);
                        class257.field3353 = false;
                        return;
                    }
                    class392.method2288("Failed to enter tk0", -128);
                    return;
                }
                if (arg0.equalsIgnoreCase("tk1")) {
                    class479.method2689(1, false, -116);
                    if (class11.field68.field5503.method741((byte) 123) == 1) {
                        class392.method2288("Entered tk1", 110);
                        class11.field68.method2276((byte) -13, 1, class11.field68.field5530);
                        class355.method2054(arg3 - 6081);
                        class257.field3353 = false;
                        return;
                    }
                    class392.method2288("Failed to enter tk1", -104);
                    return;
                }
                if (arg0.equalsIgnoreCase("tk2")) {
                    class479.method2689(2, false, 71);
                    if (class11.field68.field5503.method741((byte) 120) != 2) {
                        class392.method2288("Failed to enter tk2", -64);
                        return;
                    }
                    class392.method2288("Entered tk2", -116);
                    class11.field68.method2276((byte) -13, 2, class11.field68.field5530);
                    class355.method2054(-5964);
                    class257.field3353 = false;
                    return;
                }
                if (arg0.equalsIgnoreCase("tk3")) {
                    class479.method2689(3, false, arg3 - 13);
                    if (class11.field68.field5503.method741((byte) 127) != 3) {
                        class392.method2288("Failed to enter tk3", 50);
                        return;
                    }
                    class392.method2288("Entered tk3", 97);
                    class11.field68.method2276((byte) -13, 3, class11.field68.field5530);
                    class355.method2054(-5964);
                    class257.field3353 = false;
                    return;
                }
                if (arg0.equalsIgnoreCase("tk5")) {
                    class479.method2689(5, false, 76);
                    if (class11.field68.field5503.method741((byte) 124) == 5) {
                        class392.method2288("Entered tk5", 111);
                        class11.field68.method2276((byte) -13, 5, class11.field68.field5530);
                        class355.method2054(arg3 - 6081);
                        class257.field3353 = false;
                        return;
                    }
                    class392.method2288("Failed to enter tk5", 88);
                    return;
                }
                if (arg0.startsWith("setba")) {
                    if (arg0.length() < 6) {
                        class392.method2288("Invalid buildarea value", -80);
                        return;
                    }
                    int var13 = class436.method2477(-102, arg0.substring(6));
                    if (var13 >= 0 && var13 <= class183.method1035(arg3 - 109, class206.field2483)) {
                        class11.field68.method2276((byte) -13, var13, class11.field68.field5508);
                        class355.method2054(-5964);
                        class257.field3353 = false;
                        class392.method2288("maxbuildarea=" + class11.field68.field5508.method2663((byte) 120), -65);
                        return;
                    }
                    class392.method2288("Invalid buildarea value", -63);
                    return;
                }
                if (arg0.startsWith("rect_debug")) {
                    if (arg0.length() < 10) {
                        class392.method2288("Invalid rect_debug value", -126);
                        return;
                    }
                    class171.field2132 = class436.method2477(64, arg0.substring(10).trim());
                    class392.method2288("rect_debug=" + class171.field2132, -119);
                    return;
                }
                if (arg0.equalsIgnoreCase("qa_op_test")) {
                    class116.field1519 = true;
                    class392.method2288("qa_op_test=" + class116.field1519, -113);
                    return;
                }
                if (arg0.equalsIgnoreCase("clipcomponents")) {
                    class256.field3322 = !class256.field3322;
                    class392.method2288("clipcomponents=" + class256.field3322, arg3 ^ 0xFFFFFFC8);
                    return;
                }
                if (arg0.startsWith("bloom")) {
                    boolean var14 = class21.field142.method377();
                    if (!class557.method3155(29089, !var14)) {
                        class392.method2288("Failed to enable bloom", 126);
                        return;
                    }
                    if (!var14) {
                        class392.method2288("Bloom enabled", 46);
                        return;
                    }
                    class392.method2288("Bloom disabled", -85);
                    return;
                }
                if (arg0.equalsIgnoreCase("tween")) {
                    if (!class686.field9625) {
                        class686.field9625 = true;
                        class392.method2288("Forced tweening ENABLED!", 123);
                        return;
                    }
                    class686.field9625 = false;
                    class392.method2288("Forced tweening disabled.", arg3 ^ 0xFFFFFFD3);
                    return;
                }
                if (arg0.equalsIgnoreCase("shiftclick")) {
                    if (class581.field8149) {
                        class392.method2288("Shift-click disabled.", arg3 - 55);
                        class581.field8149 = false;
                        return;
                    }
                    class392.method2288("Shift-click ENABLED!", arg3 ^ 0x11);
                    class581.field8149 = true;
                    return;
                }
                if (arg0.equalsIgnoreCase("getcgcoord")) {
                    class392.method2288("x:" + (class653.field9086.field2170 >> 9) + " z:" + (class653.field9086.field2165 >> 9), -102);
                    return;
                }
                if (arg0.equalsIgnoreCase("getheight")) {
                    class392.method2288("Height: " + class25.field188[class653.field9086.field2175].method1685(class653.field9086.field2165 >> 9, -12639, class653.field9086.field2170 >> 9), 88);
                    return;
                }
                if (arg0.equalsIgnoreCase("resetminimap")) {
                    class97.field1282.method2906(16);
                    class97.field1282.method2900((byte) -116);
                    class593.field8266.method1369(arg3 - 83);
                    class224.field2894.method1648(0);
                    class456.method2548(-79);
                    class392.method2288("Minimap reset", 103);
                    return;
                }
                if (arg0.startsWith("mc")) {
                    if (class21.field142.method435()) {
                        int var15 = Integer.parseInt(arg0.substring(3));
                        if (var15 < 1) {
                            var15 = 1;
                        } else if (var15 > 4) {
                            var15 = 4;
                        }
                        class658.field9183 = var15;
                        class243.method1461((byte) -47);
                        class392.method2288("Render cores now: " + class658.field9183, -93);
                        return;
                    }
                    class392.method2288("Current toolkit doesn't support multiple cores", 121);
                    return;
                }
                if (arg0.startsWith("cachespace")) {
                    class392.method2288("I(s): " + class497.field6761.method1568(1551398789) + "/" + class497.field6761.method1562(18), 53);
                    class392.method2288("I(m): " + class385.field5412.method1568(1551398789) + "/" + class385.field5412.method1562(16), -122);
                    class392.method2288("O(s): " + class761.field10628.field10383.method2417(true) + "/" + class761.field10628.field10383.method2421(-19536), arg3 - 197);
                    return;
                }
                if (arg0.equalsIgnoreCase("getcamerapos")) {
                    class392.method2288("Pos: " + class653.field9086.field2175 + "," + ((class294.field3956 >> 9) + class99.field1313 >> 6) + "," + ((class684.field9518 >> 9) + class133.field1704 >> 6) + "," + ((class294.field3956 >> 9) + class99.field1313 & 0x3F) + "," + ((class684.field9518 >> 9) + class133.field1704 & 0x3F) + " Height: " + (class86.method624(class653.field9086.field2175, class684.field9518, class294.field3956, 24111) - class262.field3429), 96);
                    class392.method2288("Look: " + class653.field9086.field2175 + "," + (class353.field4712 + class99.field1313 >> 6) + "," + (class273.field3591 + class133.field1704 >> 6) + "," + (class99.field1313 + class353.field4712 & 0x3F) + "," + (class273.field3591 + class133.field1704 & 0x3F) + " Height: " + (class86.method624(class653.field9086.field2175, class273.field3591, class353.field4712, 24111) - class461.field6379), 122);
                    return;
                }
                if (arg0.equals("renderprofile") || arg0.equals("rp")) {
                    class117.field1551 = !class117.field1551;
                    class21.field142.method369(class117.field1551);
                    class90.method642(-123);
                    class392.method2288("showprofiling=" + class117.field1551, 89);
                    return;
                }
                if (arg0.startsWith("performancetest")) {
                    int var16 = -1;
                    int var17 = 1000;
                    if (arg0.length() > 15) {
                        String[] var18 = class490.method2753(arg0, ' ', false);
                        try {
                            if (var18.length > 1) {
                                var17 = Integer.parseInt(var18[1]);
                            }
                        } catch (Throwable var42) {
                        }
                        try {
                            if (var18.length > 2) {
                                var16 = Integer.parseInt(var18[2]);
                            }
                        } catch (Throwable var41) {
                        }
                    }
                    if (var16 != -1) {
                        class392.method2288("Performance: " + class711.method3986((byte) -86, var17, var16), -64);
                        return;
                    }
                    class392.method2288("Java toolkit: " + class711.method3986((byte) -109, var17, 0), -108);
                    class392.method2288("SSE toolkit:  " + class711.method3986((byte) -128, var17, 2), arg3 ^ 0x2B);
                    class392.method2288("D3D toolkit:  " + class711.method3986((byte) -117, var17, 3), -61);
                    class392.method2288("GL toolkit:   " + class711.method3986((byte) -104, var17, 1), 126);
                    class392.method2288("GLX toolkit:  " + class711.method3986((byte) -92, var17, 5), arg3 + 10);
                    return;
                }
                if (arg0.equals("nonpcs")) {
                    class79.field1086 = !class79.field1086;
                    class392.method2288("nonpcs=" + class79.field1086, 94);
                    return;
                }
                if (arg0.equals("autoworld")) {
                    class376.method2209((byte) -86);
                    class392.method2288("auto world selected", -63);
                    return;
                }
                if (arg0.startsWith("switchworld")) {
                    int var19 = Integer.parseInt(arg0.substring(12));
                    class109.method739(-8804, var19, class539.method2965((byte) 113, var19).field9712);
                    class392.method2288("switched", arg3 - 77);
                    return;
                }
                if (arg0.equals("getworld")) {
                    class392.method2288("w: " + class294.field3941.field7967, arg3 - 196);
                    return;
                }
                if (arg0.startsWith("pc")) {
                    class103 var20 = class752.method4186(260, class295.field3975, class449.field6285);
                    var20.field1379.method3393(0, arg3 ^ 0x48);
                    int var21 = var20.field1379.field8520;
                    int var22 = arg0.indexOf(" ", 4);
                    var20.field1379.method3387(arg0.substring(3, var22), (byte) 113);
                    class705.method3975(arg3 + 10, arg0.substring(var22), var20.field1379);
                    var20.field1379.method3410((byte) 118, var20.field1379.field8520 - var21);
                    class27.method104(false, var20);
                    return;
                }
                if (arg0.equals("savevarcs")) {
                    class115.method762((byte) -80);
                    class392.method2288("perm varcs saved", 103);
                    return;
                }
                if (arg0.equals("scramblevarcs")) {
                    for (int var23 = 0; var23 < class161.field2024.length; var23++) {
                        if (class633.field8794[var23]) {
                            class161.field2024[var23] = (int) (Math.random() * 99999.0D);
                            if (Math.random() > 0.5D) {
                                class161.field2024[var23] *= -1;
                            }
                        }
                    }
                    class115.method762((byte) -118);
                    class392.method2288("perm varcs scrambled", -114);
                    return;
                }
                if (arg0.equals("showcolmap")) {
                    class178.field2181 = true;
                    class456.method2548(-119);
                    class392.method2288("colmap is shown", -67);
                    return;
                }
                if (arg0.equals("hidecolmap")) {
                    class178.field2181 = false;
                    class456.method2548(122);
                    class392.method2288("colmap is hidden", arg3 ^ 0xFFFFFFD0);
                    return;
                }
                if (arg0.equals("resetcache")) {
                    class586.method3266((byte) 114);
                    class392.method2288("Caches reset", -104);
                    return;
                }
                if (arg0.equals("profilecpu")) {
                    class392.method2288(class623.method3525(12) + "ms", arg3 - 204);
                    return;
                }
                if (arg0.startsWith("getclientvarpbit")) {
                    int var24 = Integer.parseInt(arg0.substring(17));
                    class392.method2288("varpbit=" + class386.field5455.method3554(var24, arg3 ^ 0x1CB8), 65);
                    return;
                }
                if (arg0.startsWith("getclientvarp")) {
                    int var25 = Integer.parseInt(arg0.substring(14));
                    class392.method2288("varp=" + class386.field5455.method3553(var25, arg3 ^ 0xFFFFFFF4), -83);
                    return;
                }
                if (arg0.startsWith("directlogin")) {
                    String[] var26 = class490.method2753(arg0.substring(12), ' ', false);
                    if (var26.length >= 2) {
                        int var27 = var26.length > 2 ? Integer.parseInt(var26[2]) : 0;
                        class745.method4161(var26[1], -17877, var26[0], var27);
                        return;
                    }
                }
                if (arg0.startsWith("csprofileclear")) {
                    class498.method2778();
                    return;
                }
                if (arg0.startsWith("csprofileoutputc")) {
                    class498.method2774(100, false);
                    return;
                }
                if (arg0.startsWith("csprofileoutputt")) {
                    class498.method2774(10, true);
                    return;
                }
                if (arg0.startsWith("texsize")) {
                    int var28 = Integer.parseInt(arg0.substring(8));
                    class21.field142.method390(var28);
                    return;
                }
                if (arg0.equals("soundstreamcount")) {
                    class392.method2288("Active streams: " + class143.field1851.method2545(), -93);
                    return;
                }
                if (arg0.equals("autosetup")) {
                    class543.method3085((byte) -106);
                    class392.method2288("Complete. Toolkit now: " + class11.field68.field5503.method741((byte) 123), arg3 - 52);
                    return;
                }
                if (arg0.equals("errormessage")) {
                    class392.method2288(class58.field623.method1409(0), 58);
                    return;
                }
                if (arg0.equals("heapdump")) {
                    if (class739.field10307.startsWith("win")) {
                        class431.method2465(0, new File("C:\\Temp\\heap.dump"), false);
                    } else {
                        class431.method2465(0, new File("/tmp/heap.dump"), false);
                    }
                    class392.method2288("Done", -115);
                    return;
                }
                if (arg0.equals("os")) {
                    class392.method2288("Name: " + class739.field10307, arg3 - 234);
                    class392.method2288("Arch: " + class739.field10298, -80);
                    class392.method2288("Ver: " + class739.field10284, -100);
                    return;
                }
                if (arg0.startsWith("w2debug")) {
                    int var29 = Integer.parseInt(arg0.substring(8, 9));
                    class374.field5209 = var29;
                    class243.method1461((byte) 124);
                    class392.method2288("Toggled!", 74);
                    return;
                }
                if (arg0.startsWith("ortho ")) {
                    int var30 = arg0.indexOf(32);
                    if (var30 < 0) {
                        class392.method2288("Syntax: ortho <n>", -66);
                        return;
                    }
                    int var31 = class436.method2477(84, arg0.substring(var30 + 1));
                    class11.field68.method2276((byte) -13, var31, class11.field68.field5543);
                    class355.method2054(-5964);
                    class257.field3353 = false;
                    class339.method2002(-45);
                    if (var31 != class11.field68.field5543.method1144((byte) 124)) {
                        class392.method2288("Failed to change ortho mode", -94);
                        return;
                    }
                    class392.method2288("Successfully changed ortho mode", -104);
                    return;
                }
                if (arg0.startsWith("orthozoom ")) {
                    if (class11.field68.field5543.method1144((byte) 122) == 0) {
                        class392.method2288("enable ortho mode first (use 'ortho <n>')", -114);
                        return;
                    }
                    int var32 = class436.method2477(-52, arg0.substring(arg0.indexOf(32) + 1));
                    class661.field9251 = var32;
                    class392.method2288("orthozoom=" + class661.field9251, -124);
                    return;
                }
                if (arg0.startsWith("orthotilesize ")) {
                    int var33 = class436.method2477(-54, arg0.substring(arg0.indexOf(32) + 1));
                    class13.field80 = var33;
                    class277.field3698 = var33;
                    class392.method2288("ortho tile size=" + var33, -73);
                    class339.method2002(-37);
                    return;
                }
                if (arg0.equals("orthocamlock")) {
                    class179.field2208 = !class179.field2208;
                    class392.method2288("ortho camera lock is " + (class179.field2208 ? "on" : "off"), 53);
                    return;
                }
                if (arg0.startsWith("setoutput ")) {
                    File var34 = new File(arg0.substring(10));
                    if (var34.exists()) {
                        var34 = new File(arg0.substring(10) + "." + class538.method2963(-47) + ".log");
                        if (var34.exists()) {
                            class392.method2288("file already exists!", -106);
                            return;
                        }
                    }
                    if (class568.field8003 != null) {
                        class568.field8003.close();
                        class568.field8003 = null;
                    }
                    try {
                        class568.field8003 = new FileOutputStream(var34);
                        return;
                    } catch (FileNotFoundException var43) {
                        class392.method2288("Could not create " + var34.getName(), arg3 - 15);
                        return;
                    } catch (SecurityException var44) {
                        class392.method2288("Cannot write to " + var34.getName(), 67);
                        return;
                    }
                }
                if (arg0.equals("closeoutput")) {
                    if (class568.field8003 != null) {
                        class568.field8003.close();
                    }
                    class568.field8003 = null;
                    return;
                }
                if (arg0.startsWith("runscript ")) {
                    File var35 = new File(arg0.substring(10));
                    if (!var35.exists()) {
                        class392.method2288("No such file", 45);
                        return;
                    }
                    byte[] var36 = class447.method2513(arg3 ^ 0xFFFFFFFC, var35);
                    if (var36 == null) {
                        class392.method2288("Failed to read file", arg3 ^ 0x2B);
                        return;
                    }
                    String[] var37 = class490.method2753(class753.method4189(class497.method2771(var36, true), "", (byte) -110, '\r'), '\n', false);
                    class726.method4074((byte) 91, var37);
                }
                if (arg0.startsWith("zoom ")) {
                    short var38 = (short) class436.method2477(66, arg0.substring(5));
                    if (var38 > 0) {
                        class232.field3001 = var38;
                    }
                    return;
                }
                if (class713.field9949 == 10) {
                    class546.field7714++;
                    class103 var39 = class752.method4186(260, class755.field10544, class449.field6285);
                    var39.field1379.method3393(arg0.length() + 3, arg3 ^ 0x25);
                    var39.field1379.method3393(arg2 ? 1 : 0, -61);
                    var39.field1379.method3393(arg1 ? 1 : 0, 93);
                    var39.field1379.method3387(arg0, (byte) 113);
                    class27.method104(false, var39);
                }
                if (arg0.startsWith("fps ") && class61.field673 != class200.field2376) {
                    class163.method962(class436.method2477(arg3 ^ 0x59, arg0.substring(4)), 59);
                    return;
                }
            } catch (Exception var45) {
                class392.method2288(class755.field10479.method4201(class723.field10095, (byte) 25), -117);
                return;
            }
        }
        if (class713.field9949 != 10) {
            class392.method2288(class755.field10483.method4201(class723.field10095, (byte) 25) + arg0, 71);
        }
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(I)V", line = 1341)
    public static void method1465(int arg0) {
        if (arg0 == -23308) {
            field3173 = null;
            field3168 = null;
            field3167 = null;
            field3171 = null;
        }
    }
}
