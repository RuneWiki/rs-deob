import jagex3.jagmisc.jagmisc;
import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class483 {

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "Lqj;")
    private class548 field6417;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
    public int field6416;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "F")
    public static float field6415;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    public static int field6414;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
    public static int field6418;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
    public static int field6419;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "I")
    public static int field6420;

    @OriginalMember(owner = "client!bj", name = "finalize", descriptor = "()V", line = 9)
    protected final void finalize() throws Throwable {
        this.field6417.method2946(this.field6416, (byte) 109);
        field6414++;
        super.finalize();
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIIIII)V", line = 20)
    public static final void method2625(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class600.method3293(true, arg3);
        field6418++;
        int var7 = 0;
        int var8 = arg3 - arg5;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg3;
        int var10 = -arg3;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        if (class289.field3595 <= arg1 && class159.field2063 >= arg1) {
            int[] var14 = class550.field7650[arg1];
            int var15 = class605.method3315(arg2 - arg3, arg0 ^ 0xFFFFAE4D, class263.field3294, class314.field4052);
            int var16 = class605.method3315(arg2 + arg3, 4095, class263.field3294, class314.field4052);
            int var17 = class605.method3315(arg2 - var8, 4095, class263.field3294, class314.field4052);
            int var18 = class605.method3315(arg2 + var8, 4095, class263.field3294, class314.field4052);
            class57.method362(var15, var14, arg4, var17, 38);
            class57.method362(var17, var14, arg6, var18, -104);
            class57.method362(var18, var14, arg4, var16, -125);
        }
        int var19 = -1;
        while (var9 > var7) {
            var13 += 2;
            var19 += 2;
            var10 += var13;
            var12 += var19;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                var12 -= var11 << 1;
                class469.field5963[var11] = var7;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg1 - var9;
                int var21 = arg1 + var9;
                if (class289.field3595 <= var21 && class159.field2063 >= var20) {
                    if (var8 <= var9) {
                        int var22 = class605.method3315(arg2 + var7, arg0 ^ 0xFFFFAE4D, class263.field3294, class314.field4052);
                        int var23 = class605.method3315(arg2 - var7, 4095, class263.field3294, class314.field4052);
                        if (class159.field2063 >= var21) {
                            class57.method362(var23, class550.field7650[var21], arg4, var22, 13);
                        }
                        if (var20 >= class289.field3595) {
                            class57.method362(var23, class550.field7650[var20], arg4, var22, -106);
                        }
                    } else {
                        int var24 = class469.field5963[var9];
                        int var25 = class605.method3315(arg2 + var7, 4095, class263.field3294, class314.field4052);
                        int var26 = class605.method3315(arg2 - var7, arg0 ^ 0xFFFFAE4D, class263.field3294, class314.field4052);
                        int var27 = class605.method3315(arg2 + var24, 4095, class263.field3294, class314.field4052);
                        int var28 = class605.method3315(arg2 - var24, 4095, class263.field3294, class314.field4052);
                        if (class159.field2063 >= var21) {
                            int[] var29 = class550.field7650[var21];
                            class57.method362(var26, var29, arg4, var28, 122);
                            class57.method362(var28, var29, arg6, var27, arg0 ^ 0x5E35);
                            class57.method362(var27, var29, arg4, var25, -116);
                        }
                        if (var20 >= class289.field3595) {
                            int[] var30 = class550.field7650[var20];
                            class57.method362(var26, var30, arg4, var28, arg0 + 24034);
                            class57.method362(var28, var30, arg6, var27, arg0 ^ 0x5E3E);
                            class57.method362(var27, var30, arg4, var25, 27);
                        }
                    }
                }
            }
            int var31 = arg1 - var7;
            int var32 = arg1 + var7;
            if (var32 >= class289.field3595 && class159.field2063 >= var31) {
                int var33 = arg2 + var9;
                int var34 = arg2 - var9;
                if (class263.field3294 <= var33 && var34 <= class314.field4052) {
                    int var35 = class605.method3315(var33, arg0 ^ 0xFFFFAE4D, class263.field3294, class314.field4052);
                    int var36 = class605.method3315(var34, 4095, class263.field3294, class314.field4052);
                    if (var7 >= var8) {
                        if (var32 <= class159.field2063) {
                            class57.method362(var36, class550.field7650[var32], arg4, var35, -113);
                        }
                        if (class289.field3595 <= var31) {
                            class57.method362(var36, class550.field7650[var31], arg4, var35, -109);
                        }
                    } else {
                        int var37 = var7 > var11 ? class469.field5963[var7] : var11;
                        int var38 = class605.method3315(arg2 + var37, 4095, class263.field3294, class314.field4052);
                        int var39 = class605.method3315(arg2 - var37, 4095, class263.field3294, class314.field4052);
                        if (var32 <= class159.field2063) {
                            int[] var40 = class550.field7650[var32];
                            class57.method362(var36, var40, arg4, var39, 25);
                            class57.method362(var39, var40, arg6, var38, -128);
                            class57.method362(var38, var40, arg4, var35, arg0 ^ 0xFFFFA1F6);
                        }
                        if (class289.field3595 <= var31) {
                            int[] var41 = class550.field7650[var31];
                            class57.method362(var36, var41, arg4, var39, arg0 ^ 0xFFFFA196);
                            class57.method362(var39, var41, arg6, var38, 58);
                            class57.method362(var38, var41, arg4, var35, -128);
                        }
                    }
                }
            }
        }
        if (arg0 != -24142) {
            method2626(-37, false, null, true);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IZLjava/lang/String;Z)V", line = 206)
    public static final void method2626(int arg0, boolean arg1, String arg2, boolean arg3) {
        field6419++;
        try {
            if (arg2.equalsIgnoreCase("commands") || arg2.equalsIgnoreCase("help")) {
                class193.method1171(arg0 + 4, "commands - This command");
                class193.method1171(4, "cls - Clear console");
                class193.method1171(4, "displayfps - Toggle FPS and other information");
                class193.method1171(arg0 ^ 0x4, "renderer - Print graphics renderer information");
                class193.method1171(4, "heap - Print java memory information");
                return;
            }
            if (arg0 != 0) {
                return;
            }
            if (arg2.equalsIgnoreCase("cls")) {
                class684.field9604 = 0;
                class542.field7250 = 0;
                return;
            }
            if (arg2.equalsIgnoreCase("displayfps")) {
                class605.field8512 = !class605.field8512;
                if (class605.field8512) {
                    class193.method1171(4, "FPS on");
                    return;
                }
                class193.method1171(arg0 + 4, "FPS off");
                return;
            }
            if (arg2.equals("renderer")) {
                class226 var4 = class32.field452.method1001();
                class193.method1171(4, "Vendor: " + var4.field2823);
                class193.method1171(arg0 ^ 0x4, "Name: " + var4.field2822);
                class193.method1171(4, "Version: " + var4.field2821);
                class193.method1171(arg0 + 4, "Device: " + var4.field2824);
                class193.method1171(4, "Driver Version: " + var4.field2826);
                return;
            }
            if (arg2.equals("heap")) {
                class193.method1171(4, "Heap: " + class380.field4801 + "MB");
                return;
            }
        } catch (Exception var36) {
            class193.method1171(4, class83.field1110.method476((byte) 100, class250.field3068));
            return;
        }
        if (class591.field8310 != class1.field9 || class199.field2531 >= 2) {
            if (arg2.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg2.equals("nativememerror")) {
                throw new OutOfMemoryError("native(MPR");
            }
            try {
                if (arg2.equalsIgnoreCase("printfps")) {
                    class193.method1171(4, "FPS: " + class493.field6520);
                    return;
                }
                if (arg2.equalsIgnoreCase("occlude")) {
                    class68.field926 = !class68.field926;
                    if (class68.field926) {
                        class193.method1171(arg0 ^ 0x4, "Occlsion now on!");
                        return;
                    }
                    class193.method1171(4, "Occlsion now off!");
                    return;
                }
                if (arg2.equalsIgnoreCase("fpson")) {
                    class605.field8512 = true;
                    class193.method1171(4, "fps debug enabled");
                    return;
                }
                if (arg2.equalsIgnoreCase("fpsoff")) {
                    class605.field8512 = false;
                    class193.method1171(4, "fps debug disabled");
                    return;
                }
                if (arg2.equals("systemmem")) {
                    try {
                        class193.method1171(arg0 ^ 0x4, "System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
                        return;
                    } catch (Throwable var32) {
                        return;
                    }
                }
                if (arg2.equalsIgnoreCase("cleartext")) {
                    class580.field8120.method799(128);
                    class193.method1171(arg0 ^ 0x4, "Text coords cleared");
                    return;
                }
                if (arg2.equalsIgnoreCase("gc")) {
                    class394.method2113(arg0 + 4096);
                    for (int var5 = 0; var5 < 10; var5++) {
                        System.gc();
                    }
                    Runtime var6 = Runtime.getRuntime();
                    int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                    class193.method1171(4, "mem=" + var7 + "k");
                    return;
                }
                if (arg2.equalsIgnoreCase("compact")) {
                    class394.method2113(arg0 ^ 0x1000);
                    for (int var8 = 0; var8 < 10; var8++) {
                        System.gc();
                    }
                    Runtime var9 = Runtime.getRuntime();
                    int var10 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                    class193.method1171(4, "Memory before cleanup=" + var10 + "k");
                    class233.method1405((byte) 95);
                    class394.method2113(4096);
                    for (int var11 = 0; var11 < 10; var11++) {
                        System.gc();
                    }
                    int var12 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                    class193.method1171(4, "Memory after cleanup=" + var12 + "k");
                    return;
                }
                if (arg2.equalsIgnoreCase("unloadnatives")) {
                    class193.method1171(4, class310.method1795(112) ? "Libraries unloaded" : "Library unloading failed!");
                    return;
                }
                if (arg2.equalsIgnoreCase("clientdrop")) {
                    class193.method1171(4, "Dropped client connection");
                    if (class504.field6675 == 10) {
                        class695.method3919(7);
                        return;
                    }
                    if (class504.field6675 == 11) {
                        class579.field8113 = true;
                    }
                    return;
                }
                if (arg2.equalsIgnoreCase("rotateconnectmethods")) {
                    class131.field1628.method1667(0);
                    class193.method1171(arg0 ^ 0x4, "Rotated connection methods");
                    return;
                }
                if (arg2.equalsIgnoreCase("clientjs5drop")) {
                    class323.field4157.method2291((byte) 118);
                    class193.method1171(4, "Dropped client js5 net queue");
                    return;
                }
                if (arg2.equalsIgnoreCase("serverjs5drop")) {
                    class323.field4157.method2292(arg0 + 4);
                    class193.method1171(4, "Dropped server js5 net queue");
                    return;
                }
                if (arg2.equalsIgnoreCase("breakcon")) {
                    class590.field8289.method3627(arg0 ^ 0x1388);
                    class446.field5686.method1229(0);
                    class323.field4157.method2300((byte) -31);
                    class193.method1171(4, "Breaking new connections for 5 seconds");
                    return;
                }
                if (arg2.equalsIgnoreCase("rebuild")) {
                    class626.method3443((byte) 84);
                    class687.method3870((byte) -98);
                    class193.method1171(arg0 + 4, "Rebuilding map");
                    return;
                }
                if (arg2.equalsIgnoreCase("rebuildprofile")) {
                    class559.field7751 = class571.method3150(91);
                    class468.field5952 = true;
                    class626.method3443((byte) -13);
                    class687.method3870((byte) -72);
                    class193.method1171(4, "Rebuilding map (with profiling)");
                    return;
                }
                if (arg2.equalsIgnoreCase("wm1")) {
                    class220.method1301(false, (byte) 126, -1, -1, 1);
                    if (class193.method1167(23) != 1) {
                        class193.method1171(4, "wm1 failed");
                        return;
                    }
                    class193.method1171(4, "wm1 succeeded");
                    return;
                }
                if (arg2.equalsIgnoreCase("wm2")) {
                    class220.method1301(false, (byte) 126, -1, -1, 2);
                    if (class193.method1167(69) != 2) {
                        class193.method1171(4, "wm2 failed");
                        return;
                    }
                    class193.method1171(4, "wm2 succeeded");
                    return;
                }
                if (arg2.equalsIgnoreCase("wm3")) {
                    class220.method1301(false, (byte) 126, 1024, 768, 3);
                    if (class193.method1167(-15) == 3) {
                        class193.method1171(4, "wm3 succeeded");
                        return;
                    }
                    class193.method1171(arg0 + 4, "wm3 failed");
                    return;
                }
                if (arg2.equalsIgnoreCase("tk0")) {
                    class393.method2111(0, true);
                    if (class651.field9191 == 0) {
                        class193.method1171(4, "Entered tk0");
                        class301.field3698.field6632 = 0;
                        class301.field3698.method138(class590.field8289, (byte) 87);
                        class206.field2617 = false;
                        return;
                    }
                    class193.method1171(4, "Failed to enter tk0");
                    return;
                }
                if (arg2.equalsIgnoreCase("tk1")) {
                    class393.method2111(1, true);
                    if (class651.field9191 == 1) {
                        class193.method1171(4, "Entered tk1");
                        class301.field3698.field6632 = 1;
                        class301.field3698.method138(class590.field8289, (byte) 87);
                        class206.field2617 = false;
                        return;
                    }
                    class193.method1171(4, "Failed to enter tk1");
                    return;
                }
                if (arg2.equalsIgnoreCase("tk2")) {
                    class393.method2111(2, true);
                    if (class651.field9191 == 2) {
                        class193.method1171(arg0 + 4, "Entered tk2");
                        class301.field3698.field6632 = 2;
                        class301.field3698.method138(class590.field8289, (byte) 34);
                        class206.field2617 = false;
                        return;
                    }
                    class193.method1171(4, "Failed to enter tk2");
                    return;
                }
                if (arg2.equalsIgnoreCase("tk3")) {
                    class393.method2111(3, true);
                    if (class651.field9191 != 3) {
                        class193.method1171(4, "Failed to enter tk3");
                        return;
                    }
                    class193.method1171(arg0 + 4, "Entered tk3");
                    class301.field3698.field6632 = 3;
                    class301.field3698.method138(class590.field8289, (byte) 52);
                    class206.field2617 = false;
                    return;
                }
                if (arg2.equalsIgnoreCase("tk5")) {
                    class393.method2111(5, true);
                    if (class651.field9191 != 5) {
                        class193.method1171(4, "Failed to enter tk5");
                        return;
                    }
                    class193.method1171(4, "Entered tk5");
                    class301.field3698.field6632 = 5;
                    class301.field3698.method138(class590.field8289, (byte) 94);
                    class206.field2617 = false;
                    return;
                }
                if (arg2.equalsIgnoreCase("ot")) {
                    class301.field3698.field6621 = !class301.field3698.field6621;
                    class301.field3698.method138(class590.field8289, (byte) 80);
                    class206.field2617 = false;
                    class626.method3443((byte) -108);
                    class193.method1171(arg0 + 4, "ot=" + class301.field3698.field6621);
                    return;
                }
                if (arg2.equalsIgnoreCase("gb")) {
                    class301.field3698.field6636 = !class301.field3698.field6636;
                    class301.field3698.method138(class590.field8289, (byte) 81);
                    class206.field2617 = false;
                    class626.method3443((byte) 126);
                    class193.method1171(arg0 ^ 0x4, "gb=" + class301.field3698.field6636);
                    return;
                }
                if (arg2.startsWith("shadows")) {
                    if (arg2.length() < 8) {
                        class193.method1171(4, "Invalid shadows value");
                        return;
                    }
                    String var13 = arg2.substring(8);
                    int var14 = class537.method2912((byte) 122, var13) ? class557.method3065(arg0 ^ 0x80, var13) : -1;
                    if (var14 >= 0 && var14 <= 2) {
                        class301.field3698.method2699(var14, 2, class651.field9191);
                        class301.field3698.method138(class590.field8289, (byte) 121);
                        class206.field2617 = false;
                        class626.method3443((byte) -119);
                        class193.method1171(4, "shadows=" + var14);
                        return;
                    }
                    class193.method1171(4, "Invalid shadows value");
                    return;
                }
                if (arg2.startsWith("textures")) {
                    class301.field3698.field6604 = !class301.field3698.field6604;
                    class301.field3698.method138(class590.field8289, (byte) 97);
                    class206.field2617 = false;
                    class309.method1785((byte) 85);
                    class626.method3443((byte) 23);
                    class193.method1171(4, "textures=" + class301.field3698.field6604);
                    return;
                }
                if (arg2.startsWith("lighting")) {
                    class301.field3698.method2704((byte) -98, !class301.field3698.method2700(arg0 ^ 0xFFFFFFA3, class651.field9191), class651.field9191);
                    class301.field3698.method138(class590.field8289, (byte) 127);
                    class206.field2617 = false;
                    class19.method122(125);
                    class309.method1785((byte) 85);
                    class626.method3443((byte) -120);
                    class193.method1171(4, "lighting=" + class301.field3698.method2700(-79, class651.field9191));
                    return;
                }
                if (arg2.startsWith("setba")) {
                    if (arg2.length() < 6) {
                        class193.method1171(4, "Invalid buildarea value");
                        return;
                    }
                    int var15 = class557.method3065(128, arg2.substring(6));
                    if (var15 >= 0 && class557.method3066(-62, class380.field4801) >= var15) {
                        class301.field3698.field6606 = var15;
                        class301.field3698.method138(class590.field8289, (byte) 40);
                        class206.field2617 = false;
                        class193.method1171(arg0 ^ 0x4, "maxbuildarea=" + class301.field3698.field6606);
                        return;
                    }
                    class193.method1171(4, "Invalid buildarea value");
                    return;
                }
                if (arg2.startsWith("rect_debug")) {
                    if (arg2.length() < 10) {
                        class193.method1171(arg0 ^ 0x4, "Invalid rect_debug value");
                        return;
                    }
                    class273.field3449 = class557.method3065(128, arg2.substring(10).trim());
                    class193.method1171(arg0 + 4, "rect_debug=" + class273.field3449);
                    return;
                }
                if (arg2.equalsIgnoreCase("qa_op_test")) {
                    class253.field3101 = true;
                    class193.method1171(arg0 + 4, "qa_op_test=" + class253.field3101);
                    return;
                }
                if (arg2.equalsIgnoreCase("clipcomponents")) {
                    class344.field4419 = !class344.field4419;
                    class193.method1171(4, "clipcomponents=" + class344.field4419);
                    return;
                }
                if (arg2.startsWith("bloom")) {
                    boolean var16 = class32.field452.method1006();
                    if (class700.method3932(arg0 + 93, !var16)) {
                        if (!var16) {
                            class193.method1171(4, "Bloom enabled");
                            return;
                        }
                        class193.method1171(4, "Bloom disabled");
                        return;
                    }
                    class193.method1171(4, "Failed to enable bloom");
                    return;
                }
                if (arg2.equalsIgnoreCase("tween")) {
                    if (class426.field5349) {
                        class426.field5349 = false;
                        class193.method1171(4, "Forced tweening disabled.");
                        return;
                    }
                    class426.field5349 = true;
                    class193.method1171(arg0 ^ 0x4, "Forced tweening ENABLED!");
                    return;
                }
                if (arg2.equalsIgnoreCase("shiftclick")) {
                    if (class267.field3381) {
                        class193.method1171(arg0 + 4, "Shift-click disabled.");
                        class267.field3381 = false;
                        return;
                    }
                    class193.method1171(4, "Shift-click ENABLED!");
                    class267.field3381 = true;
                    return;
                }
                if (arg2.equalsIgnoreCase("getcgcoord")) {
                    class193.method1171(4, "x:" + (class376.field4748.field6461 >> 9) + " z:" + (class376.field4748.field6464 >> 9));
                    return;
                }
                if (arg2.equalsIgnoreCase("getheight")) {
                    class193.method1171(4, "Height: " + class491.field6485[class376.field4748.field6470].method1562(class376.field4748.field6464 >> 9, (byte) 51, class376.field4748.field6461 >> 9));
                    return;
                }
                if (arg2.equalsIgnoreCase("resetminimap")) {
                    class631.field8846.method3361((byte) 55);
                    class631.field8846.method3355(arg0 ^ 0xFFFF9394);
                    class48.field671.method3752(-87);
                    class556.field7727.method3776((byte) 126);
                    class687.method3870((byte) -84);
                    class193.method1171(4, "Minimap reset");
                    return;
                }
                if (arg2.startsWith("mc")) {
                    if (class32.field452.method1085()) {
                        int var17 = Integer.parseInt(arg2.substring(3));
                        if (var17 < 1) {
                            var17 = 1;
                        } else if (var17 > 4) {
                            var17 = 4;
                        }
                        class271.field3428 = var17;
                        class626.method3443((byte) 100);
                        class193.method1171(4, "Render cores now: " + class271.field3428);
                        return;
                    }
                    class193.method1171(4, "Current toolkit doesn't support multiple cores");
                    return;
                }
                if (arg2.startsWith("cachespace")) {
                    class193.method1171(4, "I(s): " + class472.field5995.method2413(72) + "/" + class472.field5995.method2408(-127));
                    class193.method1171(arg0 + 4, "I(m): " + class84.field1187.method2413(122) + "/" + class84.field1187.method2408(arg0 + -122));
                    class193.method1171(4, "O(s): " + class633.field8881.field989.method586((byte) 80) + "/" + class633.field8881.field989.method583((byte) 86));
                    return;
                }
                if (arg2.equalsIgnoreCase("getcamerapos")) {
                    class193.method1171(4, "Pos: " + class376.field4748.field6470 + "," + ((class20.field292 >> 9) + class145.field1879 >> 6) + "," + ((class276.field3464 >> 9) + class630.field8817 >> 6) + "," + ((class20.field292 >> 9) + class145.field1879 & 0x3F) + "," + ((class276.field3464 >> 9) + class630.field8817 & 0x3F) + " Height: " + (class467.method2469(class20.field292, class376.field4748.field6470, -20214, class276.field3464) - class571.field7982));
                    class193.method1171(arg0 ^ 0x4, "Look: " + class376.field4748.field6470 + "," + (class257.field3130 + class145.field1879 >> 6) + "," + (class72.field971 + class630.field8817 >> 6) + "," + (class257.field3130 + class145.field1879 & 0x3F) + "," + (class72.field971 + class630.field8817 & 0x3F) + " Height: " + (class467.method2469(class257.field3130, class376.field4748.field6470, arg0 - 20214, class72.field971) - class133.field1726));
                    return;
                }
                if (arg2.equals("renderprofile") || arg2.equals("rp")) {
                    class610.field8558 = !class610.field8558;
                    class32.field452.method1038(class610.field8558);
                    class175.method1101(0);
                    class193.method1171(4, "showprofiling=" + class610.field8558);
                    return;
                }
                if (arg2.startsWith("performancetest")) {
                    int var18 = -1;
                    int var19 = 1000;
                    if (arg2.length() > 15) {
                        String[] var20 = class475.method2512(-120, arg2, ' ');
                        try {
                            if (var20.length > 1) {
                                var19 = Integer.parseInt(var20[1]);
                            }
                        } catch (Throwable var34) {
                        }
                        try {
                            if (var20.length > 2) {
                                var18 = Integer.parseInt(var20[2]);
                            }
                        } catch (Throwable var33) {
                        }
                    }
                    if (var18 != -1) {
                        class193.method1171(4, "Performance: " + class3.method33(class651.field9191, (byte) -116, var19));
                        return;
                    }
                    class193.method1171(arg0 + 4, "Java toolkit: " + class3.method33(0, (byte) -107, var19));
                    class193.method1171(4, "SSE toolkit:  " + class3.method33(2, (byte) -125, var19));
                    class193.method1171(4, "D3D toolkit:  " + class3.method33(3, (byte) -118, var19));
                    class193.method1171(4, "GL toolkit:   " + class3.method33(1, (byte) -123, var19));
                    class193.method1171(4, "GLX toolkit:  " + class3.method33(5, (byte) -121, var19));
                    return;
                }
                if (arg2.equals("nonpcs")) {
                    class380.field4803 = !class380.field4803;
                    class193.method1171(arg0 + 4, "nonpcs=" + class380.field4803);
                    return;
                }
                if (arg2.equals("autoworld")) {
                    class13.method105((byte) -88);
                    class193.method1171(arg0 + 4, "auto world selected");
                    return;
                }
                if (arg2.startsWith("switchworld")) {
                    int var21 = Integer.parseInt(arg2.substring(12));
                    class168.method962(var21, class537.method2915(var21, true).field7178, 55);
                    class193.method1171(4, "switched");
                    return;
                }
                if (arg2.equals("getworld")) {
                    class193.method1171(4, "w: " + class131.field1628.field3685);
                    return;
                }
                if (arg2.startsWith("pc")) {
                    class704 var22 = class314.method1820(class279.field3505, class400.field5014, (byte) 119);
                    var22.field9929.method3509(0, (byte) -128);
                    int var23 = var22.field9929.field8812;
                    int var24 = arg2.indexOf(" ", 4);
                    var22.field9929.method3489(arg2.substring(3, var24), -72);
                    class57.method358(-1, arg2.substring(var24), var22.field9929);
                    var22.field9929.method3487(var22.field9929.field8812 - var23, 2105852);
                    class122.method654(var22, (byte) -36);
                    return;
                }
                if (arg2.equals("savevarcs")) {
                    class469.method2484(false);
                    class193.method1171(arg0 ^ 0x4, "perm varcs saved");
                    return;
                }
                if (arg2.equals("scramblevarcs")) {
                    for (int var25 = 0; var25 < class412.field5150.length; var25++) {
                        if (class287.field3574[var25]) {
                            class412.field5150[var25] = (int) (Math.random() * 99999.0D);
                            if (Math.random() > 0.5D) {
                                class412.field5150[var25] *= -1;
                            }
                        }
                    }
                    class469.method2484(false);
                    class193.method1171(4, "perm varcs scrambled");
                    return;
                }
                if (arg2.equals("showcolmap")) {
                    class683.field9601 = true;
                    class687.method3870((byte) -111);
                    class193.method1171(4, "colmap is shown");
                    return;
                }
                if (arg2.equals("hidecolmap")) {
                    class683.field9601 = false;
                    class687.method3870((byte) -90);
                    class193.method1171(4, "colmap is hidden");
                    return;
                }
                if (arg2.equals("resetcache")) {
                    class111.method623(0);
                    class193.method1171(arg0 + 4, "Caches reset");
                    return;
                }
                if (arg2.equals("profilecpu")) {
                    class193.method1171(4, class393.method2109(-113) + "ms");
                    return;
                }
                if (arg2.startsWith("getclientvarpbit")) {
                    int var26 = Integer.parseInt(arg2.substring(17));
                    class193.method1171(4, "varpbit=" + class684.field9606.method465(arg0 ^ 0x78, var26));
                    return;
                }
                if (arg2.startsWith("getclientvarp")) {
                    int var27 = Integer.parseInt(arg2.substring(14));
                    class193.method1171(4, "varp=" + class684.field9606.method466(var27, 48));
                    return;
                }
                if (arg2.startsWith("demologin")) {
                    class148.method860(false, 0, arg0 ^ 0x3);
                    return;
                }
                if (arg2.startsWith("newdemologin")) {
                    class148.method860(true, 0, 3);
                    return;
                }
                if (arg2.startsWith("directlogin")) {
                    String[] var28 = class475.method2512(-91, arg2.substring(12), ' ');
                    if (var28.length >= 2) {
                        int var29 = var28.length > 2 ? Integer.parseInt(var28[2]) : 0;
                        class642.method3586(var28[1], var28[0], -120, var29);
                        return;
                    }
                }
                if (arg2.startsWith("csprofileclear")) {
                    class197.method1197();
                    return;
                }
                if (arg2.startsWith("csprofileoutputc")) {
                    class197.method1199(100, false);
                    return;
                }
                if (arg2.startsWith("csprofileoutputt")) {
                    class197.method1199(10, true);
                    return;
                }
                if (arg2.startsWith("texsize")) {
                    int var30 = Integer.parseInt(arg2.substring(8));
                    class32.field452.method1041(var30);
                    return;
                }
                if (arg2.equals("soundstreamcount")) {
                    class193.method1171(4, "Active streams: " + class480.field6387.method1297());
                    return;
                }
                if (arg2.equals("autosetup")) {
                    class301.field3698.method137((byte) 103);
                    class193.method1171(4, "Complete. Toolkit now: " + class651.field9191);
                    return;
                }
                if (arg2.equals("errormessage")) {
                    class193.method1171(4, class520.field7094.method3703((byte) -30));
                    return;
                }
                if (arg2.equals("heapdump")) {
                    if (class648.field9143.startsWith("win")) {
                        class392.method2106(-4496, false, new File("C:\\Temp\\heap.dump"));
                    } else {
                        class392.method2106(-4496, false, new File("/tmp/heap.dump"));
                    }
                    class193.method1171(arg0 ^ 0x4, "Done");
                    return;
                }
                if (arg2.equals("os")) {
                    class193.method1171(4, "Name: " + class648.field9143);
                    class193.method1171(4, "Arch: " + class648.field9135);
                    class193.method1171(4, "Ver: " + class648.field9136);
                    return;
                }
                if (arg2.equals("w2debug")) {
                    class413.field5172 = !class413.field5172;
                    class626.method3443((byte) 67);
                    class193.method1171(arg0 ^ 0x4, "Toggled!");
                    return;
                }
                if (class504.field6675 == 10) {
                    class22.field336++;
                    class704 var31 = class314.method1820(class549.field7641, class400.field5014, (byte) -98);
                    var31.field9929.method3509(arg2.length() + 3, (byte) -125);
                    var31.field9929.method3509(arg3 ? 1 : 0, (byte) -124);
                    var31.field9929.method3509(arg1 ? 1 : 0, (byte) -117);
                    var31.field9929.method3489(arg2, -20);
                    class122.method654(var31, (byte) -36);
                }
                if (arg2.startsWith("fps ") && class591.field8310 != class1.field9) {
                    class637.method3570(class557.method3065(128, arg2.substring(4)), -45);
                    return;
                }
            } catch (Exception var35) {
                class193.method1171(4, class83.field1110.method476((byte) 124, class250.field3068));
                return;
            }
        }
        if (class504.field6675 != 10) {
            class193.method1171(arg0 + 4, class83.field1111.method476((byte) -27, class250.field3068) + arg2);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ZII)Z", line = 1145)
    public static final boolean method2627(boolean arg0, int arg1, int arg2) {
        field6420++;
        if (arg0) {
            field6415 = -1.7512002F;
        }
        boolean var3 = (arg1 & 0x37) == 0 ? class638.method3573(3, arg2, arg1) : class124.method661(arg1, arg2, -124);
        return var3 | (arg2 & 0x10000) != 0 | class177.method1122(arg1, -545, arg2);
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Lqj;II)V", line = 1161)
    public class483(class548 arg0, int arg1, int arg2) {
        this.field6417 = arg0;
        this.field6416 = arg2;
    }
}
