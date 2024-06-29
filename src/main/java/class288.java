import jagex3.jagmisc.jagmisc;
import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class288 {

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "S")
    public short field3643;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "B")
    public byte field3640;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "Lad;")
    public class393 field3645;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "B")
    public byte field3644;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "Ldr;")
    public static class675 field3642 = new class675(7, -2);

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "Lcga;")
    public static class449 field3648 = new class449(32, 3);

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILqf;I)V")
    public static final void method1729(int arg0, class638 arg1, int arg2) {
        field3641++;
        boolean var3 = arg1.method3578(arg2 ^ 0x8, 1) == 1;
        if (var3) {
            class311.field3919[class262.field3314++] = arg0;
        }
        int var4 = arg1.method3578(8, 2);
        class365 var5 = class132.field1601[arg0];
        if (var4 == 0) {
            if (var3) {
                var5.field4718 = false;
            } else if (class350.field4523 == arg0) {
                throw new RuntimeException("s:lr");
            } else {
                class240 var6 = class232.field3014[arg0] = new class240();
                var6.field3106 = (var5.field511[0] + class522.field6612 >> 6) + (class227.field2938 + var5.field508[0] >> 6 << 14) + (var5.field8010 << 28);
                if (var5.field4713 == -1) {
                    var6.field3107 = var5.field477.method2388(-69);
                } else {
                    var6.field3107 = var5.field4713;
                }
                var6.field3113 = var5.field491;
                var6.field3110 = var5.field4697;
                if (var5.field4716 > 0) {
                    class518.method2809(arg2 ^ 0xFFFFFF91, var5);
                }
                class132.field1601[arg0] = null;
                if (arg1.method3578(8, 1) != 0) {
                    class78.method607(arg1, 255, arg0);
                }
            }
        } else if (var4 == 1) {
            int var7 = arg1.method3578(arg2 + 8, 3);
            int var8 = var5.field508[0];
            int var9 = var5.field511[0];
            if (var7 == 0) {
                var8--;
                var9--;
            } else if (var7 == 1) {
                var9--;
            } else if (var7 == 2) {
                var9--;
                var8++;
            } else if (var7 == 3) {
                var8--;
            } else if (var7 == 4) {
                var8++;
            } else if (var7 == 5) {
                var8--;
                var9++;
            } else if (var7 == 6) {
                var9++;
            } else if (var7 == 7) {
                var9++;
                var8++;
            }
            if (var3) {
                var5.field4718 = true;
                var5.field4688 = var9;
                var5.field4698 = var8;
            } else {
                var5.method2121(var9, true, class183.field2154[arg0], var8);
            }
        } else if (var4 == 2) {
            int var10 = arg1.method3578(arg2 ^ 0x8, 4);
            int var11 = var5.field508[0];
            int var12 = var5.field511[0];
            if (var10 == 0) {
                var12 -= 2;
                var11 -= 2;
            } else if (var10 == 1) {
                var12 -= 2;
                var11--;
            } else if (var10 == 2) {
                var12 -= 2;
            } else if (var10 == 3) {
                var12 -= 2;
                var11++;
            } else if (var10 == 4) {
                var12 -= 2;
                var11 += 2;
            } else if (var10 == 5) {
                var12--;
                var11 -= 2;
            } else if (var10 == 6) {
                var12--;
                var11 += 2;
            } else if (var10 == 7) {
                var11 -= 2;
            } else if (var10 == 8) {
                var11 += 2;
            } else if (var10 == 9) {
                var12++;
                var11 -= 2;
            } else if (var10 == 10) {
                var12++;
                var11 += 2;
            } else if (var10 == 11) {
                var11 -= 2;
                var12 += 2;
            } else if (var10 == 12) {
                var12 += 2;
                var11--;
            } else if (var10 == 13) {
                var12 += 2;
            } else if (var10 == 14) {
                var11++;
                var12 += 2;
            } else if (var10 == 15) {
                var11 += 2;
                var12 += 2;
            }
            if (var3) {
                var5.field4718 = true;
                var5.field4688 = var12;
                var5.field4698 = var11;
            } else {
                var5.method2121(var12, true, class183.field2154[arg0], var11);
            }
        } else {
            int var13 = arg1.method3578(arg2 ^ 0x8, 1);
            if (var13 == 0) {
                int var14 = arg1.method3578(8, 12);
                int var15 = var14 >> 10;
                int var16 = var14 >> 5 & 0x1F;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var14 & 0x1F;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var5.field508[0] + var16;
                int var19 = var5.field511[0] + var17;
                if (var3) {
                    var5.field4688 = var19;
                    var5.field4718 = true;
                    var5.field4698 = var18;
                } else {
                    var5.method2121(var19, true, class183.field2154[arg0], var18);
                }
                var5.field8010 = (byte) (var5.field8010 + var15 & 0x3);
                if (class350.field4523 == arg0) {
                    class675.field9219 = var5.field8010;
                }
            } else {
                int var20 = arg1.method3578(8, 30);
                int var21 = var20 >> 28;
                int var22 = (var20 & 0xFFFC91D) >> 14;
                int var23 = var20 & 0x3FFF;
                int var24 = (var5.field508[0] + class227.field2938 + var22 & 0x3FFF) - class227.field2938;
                int var25 = (class522.field6612 + var23 + var5.field511[arg2] & 0x3FFF) - class522.field6612;
                if (var3) {
                    var5.field4718 = true;
                    var5.field4698 = var24;
                    var5.field4688 = var25;
                } else {
                    var5.method2121(var25, true, class183.field2154[arg0], var24);
                }
                var5.field8010 = (byte) (var5.field8010 + var21 & 0x3);
                if (class350.field4523 == arg0) {
                    class675.field9219 = var5.field8010;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZZLjava/lang/String;Z)V")
    public static final void method1730(boolean arg0, boolean arg1, String arg2, boolean arg3) {
        field3646++;
        if (arg1) {
            method1733(8);
        }
        if (class257.field3292 == class255.field3277 && class146.field1745 < 2) {
            return;
        }
        if (arg2.equalsIgnoreCase("errortest")) {
            throw new RuntimeException();
        }
        if (arg2.equals("nativememerror")) {
            throw new OutOfMemoryError("native(MPR");
        }
        try {
            if (arg2.equalsIgnoreCase("fpson")) {
                class684.field9354 = true;
                class8.method28(-1, "fps debug enabled");
                return;
            }
            if (arg2.equalsIgnoreCase("fpsoff")) {
                class684.field9354 = false;
                class8.method28(-1, "fps debug disabled");
                return;
            }
            if (arg2.equals("systemmem")) {
                try {
                    class8.method28(-1, "System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
                    return;
                } catch (Throwable var33) {
                    return;
                }
            }
            if (arg2.equalsIgnoreCase("cls")) {
                class209.field2475 = 0;
                class15.field148 = 0;
                return;
            }
            if (arg2.equalsIgnoreCase("cleartext")) {
                class67.field803.method1716(3);
                class8.method28(-1, "Text coords cleared");
                return;
            }
            if (arg2.equalsIgnoreCase("gc")) {
                class396.method2245((byte) -1);
                for (int var4 = 0; var4 < 10; var4++) {
                    System.gc();
                }
                Runtime var5 = Runtime.getRuntime();
                int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
                class8.method28(-1, "mem=" + var6 + "k");
                return;
            }
            if (arg2.equalsIgnoreCase("compact")) {
                class396.method2245((byte) -1);
                for (int var7 = 0; var7 < 10; var7++) {
                    System.gc();
                }
                Runtime var8 = Runtime.getRuntime();
                int var9 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
                class8.method28(-1, "Memory before cleanup=" + var9 + "k");
                class250.method1500(1);
                class396.method2245((byte) -1);
                for (int var10 = 0; var10 < 10; var10++) {
                    System.gc();
                }
                int var11 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
                class8.method28(-1, "Memory after cleanup=" + var11 + "k");
                return;
            }
            if (arg2.equalsIgnoreCase("unloadnatives")) {
                class8.method28(-1, class251.method1512(true) ? "Libraries unloaded" : "Library unloading failed!");
                return;
            }
            if (arg2.equalsIgnoreCase("pcachesize")) {
                class8.method28(-1, "Number of player models in cache:" + class420.method2331((byte) 86));
                return;
            }
            if (arg2.equalsIgnoreCase("clientdrop")) {
                class8.method28(-1, "Dropped client connection");
                if (class470.field5804 == 10) {
                    class675.method3744((byte) 74);
                    return;
                }
                if (class470.field5804 == 11) {
                    class384.field4931 = true;
                }
                return;
            }
            if (arg2.equalsIgnoreCase("rotateconnectmethods")) {
                class360.field4628.method1410(35714);
                class8.method28(-1, "Rotated connection methods");
                return;
            }
            if (arg2.equalsIgnoreCase("clientjs5drop")) {
                class167.field1965.method695((byte) 0);
                class8.method28(-1, "Dropped client js5 net queue");
                return;
            }
            if (arg2.equalsIgnoreCase("serverjs5drop")) {
                class167.field1965.method691((byte) 125);
                class8.method28(-1, "Dropped server js5 net queue");
                return;
            }
            if (arg2.equalsIgnoreCase("breakcon")) {
                class386.field4955.method2602(-4);
                class335.field4139.method2518(0);
                class167.field1965.method699(200);
                class8.method28(-1, "Breaking new connections for 5 seconds");
                return;
            }
            if (arg2.equalsIgnoreCase("rebuild")) {
                class303.method1800(-28818);
                class580.method3209(-45);
                class8.method28(-1, "Rebuilding map");
                return;
            }
            if (arg2.equalsIgnoreCase("wm1")) {
                class645.method3607(false, 1, -1, -1, (byte) -125);
                if (class207.method1211(3) == 1) {
                    class8.method28(-1, "wm1 succeeded");
                    return;
                }
                class8.method28(-1, "wm1 failed");
                return;
            }
            if (arg2.equalsIgnoreCase("wm2")) {
                class645.method3607(false, 2, -1, -1, (byte) -127);
                if (class207.method1211(3) != 2) {
                    class8.method28(-1, "wm2 failed");
                    return;
                }
                class8.method28(-1, "wm2 succeeded");
                return;
            }
            if (arg2.equalsIgnoreCase("wm3")) {
                class645.method3607(false, 3, 1024, 768, (byte) -128);
                if (class207.method1211(3) == 3) {
                    class8.method28(-1, "wm3 succeeded");
                    return;
                }
                class8.method28(-1, "wm3 failed");
                return;
            }
            if (arg2.equalsIgnoreCase("tk0")) {
                class364.method2114(0, 97);
                if (class628.field8526 == 0) {
                    class8.method28(-1, "Entered tk0");
                    class611.field8310.field8688 = 0;
                    class611.field8310.method2749(class386.field4955, -92);
                    class528.field6662 = false;
                    return;
                }
                class8.method28(-1, "Failed to enter tk0");
                return;
            }
            if (arg2.equalsIgnoreCase("tk1")) {
                class364.method2114(1, 123);
                if (class628.field8526 == 1) {
                    class8.method28(-1, "Entered tk1");
                    class611.field8310.field8688 = 1;
                    class611.field8310.method2749(class386.field4955, -66);
                    class528.field6662 = false;
                    return;
                }
                class8.method28(-1, "Failed to enter tk1");
                return;
            }
            if (arg2.equalsIgnoreCase("tk2")) {
                class364.method2114(2, 121);
                if (class628.field8526 != 2) {
                    class8.method28(-1, "Failed to enter tk2");
                    return;
                }
                class8.method28(-1, "Entered tk2");
                class611.field8310.field8688 = 2;
                class611.field8310.method2749(class386.field4955, -75);
                class528.field6662 = false;
                return;
            }
            if (arg2.equalsIgnoreCase("tk3")) {
                class364.method2114(3, 114);
                if (class628.field8526 != 3) {
                    class8.method28(-1, "Failed to enter tk3");
                    return;
                }
                class8.method28(-1, "Entered tk3");
                class611.field8310.field8688 = 3;
                class611.field8310.method2749(class386.field4955, -103);
                class528.field6662 = false;
                return;
            }
            if (arg2.equalsIgnoreCase("tk4")) {
                class364.method2114(4, 110);
                if (class628.field8526 != 4) {
                    class8.method28(-1, "Failed to enter tk4");
                    return;
                }
                class8.method28(-1, "Entered tk4");
                class611.field8310.field8688 = 4;
                class611.field8310.method2749(class386.field4955, -96);
                class528.field6662 = false;
                return;
            }
            if (arg2.equalsIgnoreCase("tk5")) {
                class364.method2114(5, 106);
                if (class628.field8526 == 5) {
                    class8.method28(-1, "Entered tk5");
                    class611.field8310.field8688 = 5;
                    class611.field8310.method2749(class386.field4955, -73);
                    class528.field6662 = false;
                    return;
                }
                class8.method28(-1, "Failed to enter tk5");
                return;
            }
            if (arg2.equalsIgnoreCase("ot")) {
                class611.field8310.field8709 = !class611.field8310.field8709;
                class611.field8310.method2749(class386.field4955, -69);
                class528.field6662 = false;
                class303.method1800(-28818);
                class8.method28(-1, "ot=" + class611.field8310.field8709);
                return;
            }
            if (arg2.equalsIgnoreCase("gb")) {
                class611.field8310.field8717 = !class611.field8310.field8717;
                class611.field8310.method2749(class386.field4955, -78);
                class528.field6662 = false;
                class303.method1800(-28818);
                class8.method28(-1, "gb=" + class611.field8310.field8717);
                return;
            }
            if (arg2.startsWith("shadows")) {
                if (arg2.length() < 8) {
                    class8.method28(-1, "Invalid shadows value");
                    return;
                }
                String var12 = arg2.substring(8);
                int var13 = class485.method2639(var12, true) ? class504.method2750(var12, 10) : -1;
                if (var13 >= 0 && var13 <= 2) {
                    class611.field8310.method3594(75, var13, class628.field8526);
                    class611.field8310.method2749(class386.field4955, -119);
                    class528.field6662 = false;
                    class303.method1800(-28818);
                    class8.method28(-1, "shadows=" + var13);
                    return;
                }
                class8.method28(-1, "Invalid shadows value");
                return;
            }
            if (arg2.startsWith("textures")) {
                class611.field8310.field8685 = !class611.field8310.field8685;
                class611.field8310.method2749(class386.field4955, -102);
                class528.field6662 = false;
                class305.method1816((byte) 2);
                class303.method1800(-28818);
                class8.method28(-1, "textures=" + class611.field8310.field8685);
                return;
            }
            if (arg2.startsWith("lighting")) {
                class611.field8310.method3597(class628.field8526, !class611.field8310.method3593(class628.field8526, (byte) -72), false);
                class611.field8310.method2749(class386.field4955, -77);
                class528.field6662 = false;
                class532.method2871(true);
                class305.method1816((byte) 2);
                class303.method1800(-28818);
                class8.method28(-1, "lighting=" + class611.field8310.method3593(class628.field8526, (byte) -124));
                return;
            }
            if (arg2.startsWith("setba")) {
                if (arg2.length() < 6) {
                    class8.method28(-1, "Invalid buildarea value");
                    return;
                }
                int var14 = class504.method2750(arg2.substring(6), 10);
                if (var14 >= 0 && class530.method2860(class357.field4610, 5890) >= var14) {
                    class611.field8310.field8696 = var14;
                    class611.field8310.method2749(class386.field4955, -102);
                    class528.field6662 = false;
                    class8.method28(-1, "maxbuildarea=" + class611.field8310.field8696);
                    return;
                }
                class8.method28(-1, "Invalid buildarea value");
                return;
            }
            if (arg2.startsWith("setparticles")) {
                if (arg2.length() < 13) {
                    class8.method28(-1, "Invalid particles value");
                    return;
                }
                class242.method1451(class504.method2750(arg2.substring(13), 10), true);
                class611.field8310.method2749(class386.field4955, -95);
                class528.field6662 = false;
                class8.method28(-1, "particles=" + class595.method3289(-24064));
                return;
            }
            if (arg2.startsWith("rect_debug")) {
                if (arg2.length() < 10) {
                    class8.method28(-1, "Invalid rect_debug value");
                    return;
                }
                class252.field3241 = class504.method2750(arg2.substring(10).trim(), 10);
                class8.method28(-1, "rect_debug=" + class252.field3241);
                return;
            }
            if (arg2.equalsIgnoreCase("qa_op_test")) {
                class373.field4819 = true;
                class8.method28(-1, "qa_op_test=" + class373.field4819);
                return;
            }
            if (arg2.equalsIgnoreCase("clipcomponents")) {
                class491.field6128 = !class491.field6128;
                class8.method28(-1, "clipcomponents=" + class491.field6128);
                return;
            }
            if (arg2.startsWith("bloom")) {
                boolean var15 = class309.field3898.method393();
                if (class27.method164(!var15, 0)) {
                    if (!var15) {
                        class8.method28(-1, "Bloom enabled");
                        return;
                    }
                    class8.method28(-1, "Bloom disabled");
                    return;
                }
                class8.method28(-1, "Failed to enable bloom");
                return;
            }
            if (arg2.equalsIgnoreCase("tween")) {
                if (!class493.field6139) {
                    class493.field6139 = true;
                    class8.method28(-1, "Forced tweening ENABLED!");
                    return;
                }
                class493.field6139 = false;
                class8.method28(-1, "Forced tweening disabled.");
                return;
            }
            if (arg2.equalsIgnoreCase("shiftclick")) {
                if (class272.field3438) {
                    class8.method28(-1, "Shift-click disabled.");
                    class272.field3438 = false;
                    return;
                }
                class8.method28(-1, "Shift-click ENABLED!");
                class272.field3438 = true;
                return;
            }
            if (arg2.equalsIgnoreCase("getcgcoord")) {
                class8.method28(-1, "x:" + (class67.field815.field8018 >> 9) + " z:" + (class67.field815.field8011 >> 9));
                return;
            }
            if (arg2.equalsIgnoreCase("getheight")) {
                class8.method28(-1, "Height: " + class299.field3801[class67.field815.field8010].method201(class67.field815.field8018 >> 7, class67.field815.field8011 >> 7));
                return;
            }
            if (arg2.equalsIgnoreCase("resetminimap")) {
                class136.field1656.method1650(10027);
                class136.field1656.method1664(false);
                class93.field1189.method1000(126);
                class530.field6699.method96((byte) -16);
                class580.method3209(-54);
                class8.method28(-1, "Minimap reset");
                return;
            }
            if (arg2.startsWith("mc")) {
                if (!class309.field3898.method477()) {
                    class8.method28(-1, "Current toolkit doesn't support multiple cores");
                    return;
                }
                int var16 = Integer.parseInt(arg2.substring(3));
                if (var16 < 1) {
                    var16 = 1;
                } else if (var16 > 4) {
                    var16 = 4;
                }
                class201.field2346 = var16;
                class309.field3898.method413(class201.field2346);
                class309.field3898.method494(0);
                class8.method28(-1, "Render cores now: " + class201.field2346);
                return;
            }
            if (arg2.startsWith("cachespace")) {
                class8.method28(-1, "I(s): " + class162.field1917.method1225(95) + "/" + class162.field1917.method1227(-95));
                class8.method28(-1, "I(m): " + class185.field2189.method1225(71) + "/" + class185.field2189.method1227(-117));
                class8.method28(-1, "O(s): " + class504.field6287.field3460.method2288((byte) -128) + "/" + class504.field6287.field3460.method2289((byte) 71));
                return;
            }
            if (arg2.equalsIgnoreCase("getcamerapos")) {
                class8.method28(-1, "Pos: " + class67.field815.field8010 + "," + ((class238.field3071 >> 9) + class227.field2938 >> 6) + "," + ((class710.field9924 >> 9) + class522.field6612 >> 6) + "," + ((class238.field3071 >> 9) + class227.field2938 & 0x3F) + "," + ((class710.field9924 >> 9) + class522.field6612 & 0x3F) + " Height: " + (class514.method2798(class710.field9924, class238.field3071, class67.field815.field8010, (byte) 120) - class455.field5688));
                class8.method28(-1, "Look: " + class67.field815.field8010 + "," + (class92.field1186 + class227.field2938 >> 6) + "," + (class522.field6612 + class102.field1309 >> 6) + "," + (class92.field1186 + class227.field2938 & 0x3F) + "," + (class522.field6612 + class102.field1309 & 0x3F) + " Height: " + (class514.method2798(class102.field1309, class92.field1186, class67.field815.field8010, (byte) 106) - class19.field201));
                return;
            }
            if (arg2.equals("showocc")) {
                class78.field1020 = !class78.field1020;
                class303.method1800(-28818);
                class8.method28(-1, "showocc=" + class78.field1020);
                return;
            }
            if (arg2.equals("wallocc")) {
                class136.field1660 = !class136.field1660;
                class303.method1800(-28818);
                class8.method28(-1, "forcewallocc=" + class136.field1660);
                return;
            }
            if (arg2.equals("renderprofile") || arg2.equals("rp")) {
                class678.field9236 = !class678.field9236;
                class309.field3898.method388(class678.field9236);
                class675.method3743(1937021704);
                class8.method28(-1, "showprofiling=" + class678.field9236);
                return;
            }
            if (arg2.startsWith("performancetest")) {
                int var17 = -1;
                int var18 = 1000;
                if (arg2.length() > 15) {
                    String[] var19 = class112.method774(' ', 1, arg2);
                    try {
                        if (var19.length > 1) {
                            var18 = Integer.parseInt(var19[1]);
                        }
                    } catch (Throwable var35) {
                    }
                    try {
                        if (var19.length > 2) {
                            var17 = Integer.parseInt(var19[2]);
                        }
                    } catch (Throwable var34) {
                    }
                }
                if (var17 != -1) {
                    class8.method28(-1, "Performance: " + class179.method1064(var18, class628.field8526, (byte) -71));
                    return;
                }
                class8.method28(-1, "Java toolkit: " + class179.method1064(var18, 0, (byte) -71));
                class8.method28(-1, "SSE toolkit:  " + class179.method1064(var18, 2, (byte) -71));
                class8.method28(-1, "D3D toolkit:  " + class179.method1064(var18, 3, (byte) -71));
                class8.method28(-1, "GL toolkit:   " + class179.method1064(var18, 1, (byte) -71));
                class8.method28(-1, "GLX toolkit:  " + class179.method1064(var18, 5, (byte) -71));
                return;
            }
            if (arg2.equals("renderer")) {
                class379 var20 = class309.field3898.method317();
                class8.method28(-1, "Vendor: " + var20.field4869);
                class8.method28(-1, "Name: " + var20.field4866);
                class8.method28(-1, "Version: " + var20.field4865);
                class8.method28(-1, "Device: " + var20.field4867);
                class8.method28(-1, "Driver Version: " + var20.field4864);
                return;
            }
            if (arg2.equals("nonpcs")) {
                class363.field4646 = !class363.field4646;
                class8.method28(-1, "nonpcs=" + class363.field4646);
                return;
            }
            if (arg2.equals("autoworld")) {
                class234.method1415((byte) -48);
                class8.method28(-1, "auto world selected");
                return;
            }
            if (arg2.startsWith("switchworld")) {
                int var21 = Integer.parseInt(arg2.substring(12));
                class645.method3609(var21, class276.method1672(true, var21).field3869, -96);
                class8.method28(-1, "switched");
                return;
            }
            if (arg2.equals("getworld")) {
                class8.method28(-1, "w: " + class360.field4628.field3030);
                return;
            }
            if (arg2.startsWith("pc")) {
                class124 var22 = class336.method1924(class269.field3415, class636.field8620, (byte) 114);
                var22.field1516.method3090(0, 3);
                int var23 = var22.field1516.field7313;
                int var24 = arg2.indexOf(" ", 4);
                var22.field1516.method3050(false, arg2.substring(3, var24));
                class561.method2980((byte) -7, arg2.substring(var24), var22.field1516);
                var22.field1516.method3036((byte) -118, var22.field1516.field7313 - var23);
                class197.method1156((byte) 86, var22);
                return;
            }
            if (arg2.equals("heap")) {
                class8.method28(-1, "Heap: " + class357.field4610 + "MB");
                return;
            }
            if (arg2.equals("savevarcs")) {
                class81.method616(10522);
                class8.method28(-1, "perm varcs saved");
                return;
            }
            if (arg2.equals("scramblevarcs")) {
                for (int var25 = 0; var25 < class500.field6238.length; var25++) {
                    if (class656.field8925[var25]) {
                        class500.field6238[var25] = (int) (Math.random() * 99999.0D);
                        if (Math.random() > 0.5D) {
                            class500.field6238[var25] *= -1;
                        }
                    }
                }
                class81.method616(10522);
                class8.method28(-1, "perm varcs scrambled");
                return;
            }
            if (arg2.equals("showcolmap")) {
                class257.field3288 = true;
                class580.method3209(-96);
                class8.method28(-1, "colmap is shown");
                return;
            }
            if (arg2.equals("hidecolmap")) {
                class257.field3288 = false;
                class580.method3209(-46);
                class8.method28(-1, "colmap is hidden");
                return;
            }
            if (arg2.equals("resetcache")) {
                class373.method2160(!arg1);
                class8.method28(-1, "Caches reset");
                return;
            }
            if (arg2.equals("profilecpu")) {
                class8.method28(-1, class141.method889(-41) + "ms");
                return;
            }
            if (arg2.startsWith("cpuusage")) {
                int var26 = Integer.parseInt(arg2.substring(9));
                if (var26 >= 0 && var26 <= 4) {
                    class611.field8310.field8677 = var26;
                }
                class8.method28(-1, "cpuusage=" + class611.field8310.field8677);
                return;
            }
            if (arg2.startsWith("getclientvarpbit")) {
                int var27 = Integer.parseInt(arg2.substring(17));
                class8.method28(-1, "varpbit=" + class327.field4084.method303((byte) 94, var27));
                return;
            }
            if (arg2.startsWith("getclientvarp")) {
                int var28 = Integer.parseInt(arg2.substring(14));
                class8.method28(-1, "varp=" + class327.field4084.method304(var28, false));
                return;
            }
            if (arg2.startsWith("demologin")) {
                class32.method219(27599, 0, false);
                return;
            }
            if (arg2.startsWith("newdemologin")) {
                class32.method219(27599, 0, true);
                return;
            }
            if (arg2.startsWith("directlogin")) {
                String[] var29 = class112.method774(' ', 1, arg2.substring(12));
                if (var29.length >= 2) {
                    int var30 = var29.length > 2 ? Integer.parseInt(var29[2]) : 0;
                    class704.method3885(var29[1], var29[0], (byte) -30, var30);
                    return;
                }
            }
            if (arg2.startsWith("csprofileclear")) {
                class620.method3459();
                return;
            }
            if (arg2.startsWith("csprofileoutputc")) {
                class620.method3453(100, false);
                return;
            }
            if (arg2.startsWith("csprofileoutputt")) {
                class620.method3453(10, true);
                return;
            }
            if (arg2.startsWith("texsize")) {
                int var31 = Integer.parseInt(arg2.substring(8));
                class309.field3898.method444(var31);
                return;
            }
            if (arg2.equals("soundstreamcount")) {
                class8.method28(-1, "Active streams: " + class314.field3941.method1488());
                return;
            }
            if (arg2.equals("autosetup")) {
                class611.field8310.method2733((byte) 121);
                class8.method28(-1, "Complete. Toolkit now: " + class628.field8526);
                return;
            }
            if (arg2.equals("errormessage")) {
                class8.method28(-1, class455.field5687.method1204(992));
                return;
            }
            if (class470.field5804 == 10) {
                class492.field6135++;
                class124 var32 = class336.method1924(class367.field4753, class636.field8620, (byte) -122);
                var32.field1516.method3090(arg2.length() + 3, 3);
                var32.field1516.method3090(arg0 ? 1 : 0, 3);
                var32.field1516.method3090(arg3 ? 1 : 0, 3);
                var32.field1516.method3050(false, arg2);
                class197.method1156((byte) 95, var32);
            }
            if (arg2.startsWith("fps ") && class257.field3292 != class255.field3277) {
                class391.method2225(class504.method2750(arg2.substring(4), 10), -123);
                return;
            }
            if (class470.field5804 != 10) {
                class8.method28(-1, "Unrecogonised commmand when not logged in: " + arg2);
                return;
            }
        } catch (Exception var36) {
            class8.method28(-1, "Whoops, something went wrong.");
            return;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIILjava/lang/Class;)V")
    public static final void method1731(int arg0, int arg1, int arg2, Class arg3) {
        class565 var4 = class407.field5237[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class436 var5 = var4.field7074; var5 != null; var5 = var5.field5485) {
            class597 var6 = var5.field5486;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field8017 == arg1 && var6.field8014 == arg2) {
                class572.method3034(var6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)V")
    public static final void method1732(int arg0, int arg1) {
        if (!class611.field8310.field8692) {
            arg0 = -1;
        }
        field3647++;
        if (arg1 != -16340) {
            field3648 = null;
        }
        if (class211.field2496 == arg0) {
            return;
        }
        if (arg0 != -1) {
            class244 var2 = class151.field1801.method3557(arg0, 2017);
            class495 var3 = var2.method1465(false);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class386.field4955.method2605(var3.method2686(), (byte) -116, class472.field5828, new Point(var2.field3152, var2.field3155), var3.method2694(), var3.method2697());
                class211.field2496 = arg0;
            }
        }
        if (arg0 == -1 && class211.field2496 != -1) {
            class386.field4955.method2605(null, (byte) -112, class472.field5828, new Point(), -1, -1);
            class211.field2496 = -1;
        }
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lad;III)V")
    public class288(class393 arg0, int arg1, int arg2, int arg3) {
        this.field3643 = (short) arg1;
        this.field3640 = (byte) arg2;
        this.field3645 = arg0;
        this.field3644 = (byte) arg3;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
    public static void method1733(int arg0) {
        field3648 = null;
        field3642 = null;
        if (arg0 <= 0) {
            method1729(-101, null, 37);
        }
    }
}
