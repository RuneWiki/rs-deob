import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public abstract class class321 extends class324 {

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "I")
    public int field4640;

    @OriginalMember(owner = "client!oj", name = "w", descriptor = "I")
    private int field4650;

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "I")
    public int field4638;

    @OriginalMember(owner = "client!oj", name = "p", descriptor = "F")
    public float field4643;

    @OriginalMember(owner = "client!oj", name = "y", descriptor = "I")
    private int field4652;

    @OriginalMember(owner = "client!oj", name = "s", descriptor = "I")
    public int field4646;

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!oj", name = "n", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!oj", name = "o", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!oj", name = "q", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!oj", name = "r", descriptor = "I")
    public static int field4645;

    @OriginalMember(owner = "client!oj", name = "t", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!oj", name = "u", descriptor = "I")
    public static int field4648;

    @OriginalMember(owner = "client!oj", name = "v", descriptor = "Lkea;")
    public static class203 field4649;

    @OriginalMember(owner = "client!oj", name = "x", descriptor = "Lmca;")
    public static class28 field4651;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)F", line = 3)
    public final float method2091(int arg0) {
        field4641++;
        if (arg0 != -918913433) {
            method2096(null, 111, false, false);
        }
        return this.field4643;
    }

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "(I)V", line = 16)
    public static void method2092(int arg0) {
        field4651 = null;
        if (arg0 != -3809) {
            method2096(null, -57, false, false);
        }
        field4649 = null;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)I", line = 32)
    public final int method2093(byte arg0) {
        field4645++;
        int var2 = 115 % ((arg0 + 8) / 58);
        return this.field4640;
    }

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "(I)I", line = 42)
    public final int method2094(int arg0) {
        if (arg0 == 0) {
            field4637++;
            return this.field4652;
        } else {
            return 101;
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(Z)I", line = 59)
    public final int method2095(boolean arg0) {
        if (!arg0) {
            field4649 = null;
        }
        field4648++;
        return this.field4638;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Ljava/lang/String;IZZ)V", line = 74)
    public static final void method2096(String arg0, int arg1, boolean arg2, boolean arg3) {
        field4647++;
        if (arg1 != 1) {
            method2092(19);
        }
        if (class646.field9321 == class197.field2667 && class315.field4597 < 2) {
            return;
        }
        if (arg0.equalsIgnoreCase("errortest")) {
            throw new RuntimeException();
        }
        if (arg0.equals("nativememerror")) {
            throw new OutOfMemoryError("native(MPR");
        }
        try {
            if (arg0.equalsIgnoreCase("fpson")) {
                class517.field7528 = true;
                class348.method2221(30742, "fps debug enabled");
                return;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                class517.field7528 = false;
                class348.method2221(arg1 ^ 0x7817, "fps debug disabled");
                return;
            }
            if (arg0.equals("systemmem")) {
                try {
                    class348.method2221(arg1 + 30741, "System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
                    return;
                } catch (Throwable var31) {
                    return;
                }
            }
            if (arg0.equalsIgnoreCase("cls")) {
                class392.field6007 = 0;
                class429.field6362 = 0;
                return;
            }
            if (arg0.equalsIgnoreCase("cleartext")) {
                class101.field1200.method3295((byte) -42);
                class348.method2221(30742, "Text coords cleared");
                return;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                class66.method456(-111);
                for (int var4 = 0; var4 < 10; var4++) {
                    System.gc();
                }
                Runtime var5 = Runtime.getRuntime();
                int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
                class348.method2221(30742, "mem=" + var6 + "k");
                return;
            }
            if (arg0.equalsIgnoreCase("compact")) {
                class66.method456(-123);
                for (int var7 = 0; var7 < 10; var7++) {
                    System.gc();
                }
                Runtime var8 = Runtime.getRuntime();
                int var9 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
                class348.method2221(30742, "Memory before cleanup=" + var9 + "k");
                class301.method1998(16384);
                class66.method456(-111);
                for (int var10 = 0; var10 < 10; var10++) {
                    System.gc();
                }
                int var11 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
                class348.method2221(30742, "Memory after cleanup=" + var11 + "k");
                return;
            }
            if (arg0.equalsIgnoreCase("unloadnatives")) {
                class348.method2221(30742, class320.method2085(0) ? "Libraries unloaded" : "Library unloading failed!");
                return;
            }
            if (arg0.equalsIgnoreCase("pcachesize")) {
                class348.method2221(30742, "Number of player models in cache:" + class142.method858(102));
                return;
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                class348.method2221(30742, "Dropped client connection");
                if (class133.field1673 == 9) {
                    class195.method1245(arg1 ^ 0xFFFF8391);
                    return;
                }
                if (class133.field1673 == 10) {
                    class248.field3523 = true;
                }
                return;
            }
            if (arg0.equalsIgnoreCase("rotateconnectmethods")) {
                class461.field6876.method797((byte) -78);
                class348.method2221(30742, "Rotated connection methods");
                return;
            }
            if (arg0.equalsIgnoreCase("clientjs5drop")) {
                class564.field8033.method2763(9);
                class348.method2221(30742, "Dropped client js5 net queue");
                return;
            }
            if (arg0.equalsIgnoreCase("serverjs5drop")) {
                class564.field8033.method2772((byte) 124);
                class348.method2221(arg1 ^ 0x7817, "Dropped server js5 net queue");
                return;
            }
            if (arg0.equalsIgnoreCase("breakcon")) {
                class20.field197.method3176((byte) 109);
                class170.field2077.method1842(arg1 ^ 0xFFFFBBDB);
                class564.field8033.method2762(arg1 - 1);
                class348.method2221(arg1 + 30741, "Breaking new connections for 5 seconds");
                return;
            }
            if (arg0.equalsIgnoreCase("rebuild")) {
                class251.method1656(true);
                class635.method3622((byte) -80);
                class348.method2221(30742, "Rebuilding map");
                return;
            }
            if (arg0.equalsIgnoreCase("wm1")) {
                class225.method1465(-1, 1, false, -90, -1);
                if (class562.method3250(arg1 ^ 0xFFFF82BD) != 1) {
                    class348.method2221(30742, "wm1 failed");
                    return;
                }
                class348.method2221(30742, "wm1 succeeded");
                return;
            }
            if (arg0.equalsIgnoreCase("wm2")) {
                class225.method1465(-1, 2, false, -120, -1);
                if (class562.method3250(-32068) != 2) {
                    class348.method2221(30742, "wm2 failed");
                    return;
                }
                class348.method2221(30742, "wm2 succeeded");
                return;
            }
            if (arg0.equalsIgnoreCase("wm3")) {
                class225.method1465(1024, 3, false, -119, 768);
                if (class562.method3250(-32068) != 3) {
                    class348.method2221(arg1 + 30741, "wm3 failed");
                    return;
                }
                class348.method2221(30742, "wm3 succeeded");
                return;
            }
            if (arg0.equalsIgnoreCase("tk0")) {
                class418.method2644(0, (byte) 80);
                if (class81.field908 != 0) {
                    class348.method2221(30742, "Failed to enter tk0");
                    return;
                }
                class348.method2221(30742, "Entered tk0");
                class595.field8694.field6558 = 0;
                class595.field8694.method2440(class20.field197, -122);
                class90.field1036 = false;
                return;
            }
            if (arg0.equalsIgnoreCase("tk1")) {
                class418.method2644(1, (byte) 80);
                if (class81.field908 != 1) {
                    class348.method2221(30742, "Failed to enter tk1");
                    return;
                }
                class348.method2221(30742, "Entered tk1");
                class595.field8694.field6558 = 1;
                class595.field8694.method2440(class20.field197, -103);
                class90.field1036 = false;
                return;
            }
            if (arg0.equalsIgnoreCase("tk2")) {
                class418.method2644(2, (byte) 80);
                if (class81.field908 == 2) {
                    class348.method2221(arg1 + 30741, "Entered tk2");
                    class595.field8694.field6558 = 2;
                    class595.field8694.method2440(class20.field197, arg1 ^ 0xFFFFFF8C);
                    class90.field1036 = false;
                    return;
                }
                class348.method2221(30742, "Failed to enter tk2");
                return;
            }
            if (arg0.equalsIgnoreCase("tk3")) {
                class418.method2644(3, (byte) 80);
                if (class81.field908 == 3) {
                    class348.method2221(30742, "Entered tk3");
                    class595.field8694.field6558 = 3;
                    class595.field8694.method2440(class20.field197, arg1 ^ 0xFFFFFF95);
                    class90.field1036 = false;
                    return;
                }
                class348.method2221(30742, "Failed to enter tk3");
                return;
            }
            if (arg0.equalsIgnoreCase("tk4")) {
                class418.method2644(4, (byte) 80);
                if (class81.field908 == 4) {
                    class348.method2221(arg1 ^ 0x7817, "Entered tk4");
                    class595.field8694.field6558 = 4;
                    class595.field8694.method2440(class20.field197, -113);
                    class90.field1036 = false;
                    return;
                }
                class348.method2221(30742, "Failed to enter tk4");
                return;
            }
            if (arg0.equalsIgnoreCase("tk5")) {
                class418.method2644(5, (byte) 80);
                if (class81.field908 == 5) {
                    class348.method2221(30742, "Entered tk5");
                    class595.field8694.field6558 = 5;
                    class595.field8694.method2440(class20.field197, -127);
                    class90.field1036 = false;
                    return;
                }
                class348.method2221(30742, "Failed to enter tk5");
                return;
            }
            if (arg0.equalsIgnoreCase("ot")) {
                class595.field8694.field6528 = !class595.field8694.field6528;
                class595.field8694.method2440(class20.field197, arg1 ^ 0xFFFFFF8E);
                class90.field1036 = false;
                class251.method1656(true);
                class348.method2221(30742, "ot=" + class595.field8694.field6528);
                return;
            }
            if (arg0.equalsIgnoreCase("gb")) {
                class595.field8694.field6535 = !class595.field8694.field6535;
                class595.field8694.method2440(class20.field197, -112);
                class90.field1036 = false;
                class251.method1656(true);
                class348.method2221(30742, "gb=" + class595.field8694.field6535);
                return;
            }
            if (arg0.startsWith("shadows")) {
                if (arg0.length() < 8) {
                    class348.method2221(30742, "Invalid shadows value");
                    return;
                }
                String var12 = arg0.substring(8);
                int var13 = class162.method942(23050, var12) ? class575.method3340((byte) -40, var12) : -1;
                if (var13 >= 0 && var13 <= 2) {
                    class595.field8694.method2737(var13, (byte) -99, class81.field908);
                    class595.field8694.method2440(class20.field197, arg1 ^ 0xFFFFFF80);
                    class90.field1036 = false;
                    class251.method1656(true);
                    class348.method2221(30742, "shadows=" + var13);
                    return;
                }
                class348.method2221(30742, "Invalid shadows value");
                return;
            }
            if (arg0.startsWith("textures")) {
                class595.field8694.field6539 = !class595.field8694.field6539;
                class595.field8694.method2440(class20.field197, arg1 ^ 0xFFFFFF91);
                class90.field1036 = false;
                class170.method982(17526);
                class251.method1656(true);
                class348.method2221(30742, "textures=" + class595.field8694.field6539);
                return;
            }
            if (arg0.startsWith("lighting")) {
                class595.field8694.method2738(!class595.field8694.method2732(class81.field908, (byte) -120), class81.field908, (byte) 30);
                class595.field8694.method2440(class20.field197, arg1 - 111);
                class90.field1036 = false;
                class329.method2148((byte) 36);
                class170.method982(17526);
                class251.method1656(true);
                class348.method2221(arg1 ^ 0x7817, "lighting=" + class595.field8694.method2732(class81.field908, (byte) -120));
                return;
            }
            if (arg0.startsWith("setba")) {
                if (arg0.length() < 6) {
                    class348.method2221(arg1 ^ 0x7817, "Invalid buildarea value");
                    return;
                }
                int var14 = class575.method3340((byte) -67, arg0.substring(6));
                if (var14 >= 0 && class41.method222(true, class362.field5189) >= var14) {
                    class595.field8694.field6537 = var14;
                    class595.field8694.method2440(class20.field197, -103);
                    class90.field1036 = false;
                    class348.method2221(30742, "maxbuildarea=" + class595.field8694.field6537);
                    return;
                }
                class348.method2221(30742, "Invalid buildarea value");
                return;
            }
            if (arg0.startsWith("setparticles")) {
                if (arg0.length() < 13) {
                    class348.method2221(arg1 + 30741, "Invalid particles value");
                    return;
                }
                class62.method441(class575.method3340((byte) -67, arg0.substring(13)), (byte) 2);
                class595.field8694.method2440(class20.field197, -128);
                class90.field1036 = false;
                class348.method2221(arg1 + 30741, "particles=" + class229.method1481(-83));
                return;
            }
            if (arg0.startsWith("rect_debug")) {
                if (arg0.length() < 10) {
                    class348.method2221(arg1 + 30741, "Invalid rect_debug value");
                    return;
                }
                class344.field4923 = class575.method3340((byte) 121, arg0.substring(10).trim());
                class348.method2221(30742, "rect_debug=" + class344.field4923);
                return;
            }
            if (arg0.equalsIgnoreCase("qa_op_test")) {
                class541.field7761 = true;
                class348.method2221(arg1 + 30741, "qa_op_test=" + class541.field7761);
                return;
            }
            if (arg0.equalsIgnoreCase("clipcomponents")) {
                class247.field3509 = !class247.field3509;
                class348.method2221(30742, "clipcomponents=" + class247.field3509);
                return;
            }
            if (arg0.startsWith("bloom")) {
                boolean var15 = class413.field6264.method359();
                if (!class101.method623(arg1 + 684, !var15)) {
                    class348.method2221(30742, "Failed to enable bloom");
                    return;
                }
                if (var15) {
                    class348.method2221(30742, "Bloom disabled");
                    return;
                }
                class348.method2221(arg1 ^ 0x7817, "Bloom enabled");
                return;
            }
            if (arg0.equalsIgnoreCase("tween")) {
                if (!class233.field3267) {
                    class233.field3267 = true;
                    class348.method2221(30742, "Forced tweening ENABLED!");
                    return;
                }
                class233.field3267 = false;
                class348.method2221(arg1 + 30741, "Forced tweening disabled.");
                return;
            }
            if (arg0.equalsIgnoreCase("shiftclick")) {
                if (class565.field8057) {
                    class348.method2221(arg1 ^ 0x7817, "Shift-click disabled.");
                    class565.field8057 = false;
                    return;
                }
                class348.method2221(30742, "Shift-click ENABLED!");
                class565.field8057 = true;
                return;
            }
            if (arg0.equalsIgnoreCase("getcgcoord")) {
                class348.method2221(30742, "x:" + (class439.field6548.field1764 >> 9) + " z:" + (class439.field6548.field1768 >> 9));
                return;
            }
            if (arg0.equalsIgnoreCase("getheight")) {
                class348.method2221(30742, "Height: " + class435.field6449[class439.field6548.field1757].method259(class439.field6548.field1764 >> 7, class439.field6548.field1768 >> 7));
                return;
            }
            if (arg0.equalsIgnoreCase("resetminimap")) {
                class319.field4621.method1299(0);
                class319.field4621.method1293(-23829);
                class601.field8769.method109(-19841);
                class59.field680.method1020((byte) 1);
                class635.method3622((byte) -19);
                class348.method2221(30742, "Minimap reset");
                return;
            }
            if (arg0.startsWith("mc")) {
                if (!class413.field6264.method334()) {
                    class348.method2221(30742, "Current toolkit doesn't support multiple cores");
                    return;
                }
                int var16 = Integer.parseInt(arg0.substring(3));
                if (var16 < 1) {
                    var16 = 1;
                } else if (var16 > 4) {
                    var16 = 4;
                }
                class629.field9081 = var16;
                class413.field6264.method348(class629.field9081);
                class413.field6264.method345(0);
                class348.method2221(30742, "Render cores now: " + class629.field9081);
                return;
            }
            if (arg0.startsWith("cachespace")) {
                class348.method2221(30742, "I(s): " + class95.field1124.method1799(true) + "/" + class95.field1124.method1796((byte) 121));
                class348.method2221(arg1 ^ 0x7817, "I(m): " + class460.field6862.method1799(true) + "/" + class460.field6862.method1796((byte) 119));
                class348.method2221(30742, "O(s): " + class622.field8999.field46.method1170(1) + "/" + class622.field8999.field46.method1168(124));
                return;
            }
            if (arg0.equalsIgnoreCase("getcamerapos")) {
                class348.method2221(arg1 + 30741, "Pos: " + class439.field6548.field1757 + "," + ((class337.field4821 >> 9) + class287.field3980 >> 6) + "," + ((class207.field2781 >> 9) + class250.field3549 >> 6) + "," + ((class337.field4821 >> 9) + class287.field3980 & 0x3F) + "," + ((class207.field2781 >> 9) + class250.field3549 & 0x3F) + " Height: " + (class399.method2547(class207.field2781, class337.field4821, (byte) 94, class439.field6548.field1757) + -class100.field1192));
                class348.method2221(30742, "Look: " + class439.field6548.field1757 + "," + (class67.field743 + class287.field3980 >> 6) + "," + (class250.field3549 + class100.field1195 >> 6) + "," + (class67.field743 + class287.field3980 & 0x3F) + "," + (class250.field3549 + class100.field1195 & 0x3F) + " Height: " + (class399.method2547(class100.field1195, class67.field743, (byte) 101, class439.field6548.field1757) - class108.field1313));
                return;
            }
            if (arg0.equals("showocc")) {
                class409.field6172 = !class409.field6172;
                class251.method1656(true);
                class348.method2221(30742, "showocc=" + class409.field6172);
                return;
            }
            if (arg0.equals("wallocc")) {
                class218.field2991 = !class218.field2991;
                class251.method1656(true);
                class348.method2221(30742, "forcewallocc=" + class218.field2991);
                return;
            }
            if (arg0.equals("renderprofile") || arg0.equals("rp")) {
                class99.field1160 = !class99.field1160;
                class413.field6264.method402(class99.field1160);
                class156.method906(arg1 - 1);
                class348.method2221(30742, "showprofiling=" + class99.field1160);
                return;
            }
            if (arg0.startsWith("performancetest")) {
                int var17 = -1;
                int var18 = 1000;
                if (arg0.length() > 15) {
                    String[] var19 = class293.method1890(' ', (byte) -1, arg0);
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
                    class348.method2221(30742, "Performance: " + class45.method234(class81.field908, true, var18));
                    return;
                }
                class348.method2221(30742, "Java toolkit: " + class45.method234(0, true, var18));
                class348.method2221(30742, "SSE toolkit:  " + class45.method234(2, true, var18));
                class348.method2221(30742, "D3D toolkit:  " + class45.method234(3, true, var18));
                class348.method2221(30742, "GL toolkit:   " + class45.method234(1, true, var18));
                return;
            }
            if (arg0.equals("renderer")) {
                class479 var20 = class413.field6264.method330();
                class348.method2221(30742, "Vendor: " + var20.field7050);
                class348.method2221(30742, "Name: " + var20.field7052);
                class348.method2221(30742, "Version: " + var20.field7048);
                class348.method2221(arg1 + 30741, "Device: " + var20.field7047);
                class348.method2221(30742, "Driver Version: " + var20.field7044);
                return;
            }
            if (arg0.equals("nonpcs")) {
                class592.field8494 = !class592.field8494;
                class348.method2221(30742, "nonpcs=" + class592.field8494);
                return;
            }
            if (arg0.equals("autoworld")) {
                class566.method3281(arg1 ^ 0x8CDE8C62);
                class348.method2221(arg1 ^ 0x7817, "auto world selected");
                return;
            }
            if (arg0.startsWith("switchworld")) {
                int var21 = Integer.parseInt(arg0.substring(12));
                class371.method2391(false, class18.method120(false, var21).field7471, var21);
                class348.method2221(30742, "switched");
                return;
            }
            if (arg0.equals("getworld")) {
                class348.method2221(30742, "w: " + class461.field6876.field1603);
                return;
            }
            if (arg0.startsWith("pc")) {
                class308.method2044(class285.field3939, -7434);
                class468.field6960.method1205((byte) -69, 0);
                int var22 = class468.field6960.field2610;
                int var23 = arg0.indexOf(" ", 4);
                class468.field6960.method1237(1049279824, arg0.substring(3, var23));
                class251.method1653(arg0.substring(var23), 121, class468.field6960);
                class468.field6960.method1188(class468.field6960.field2610 - var22, -100);
                return;
            }
            if (arg0.equals("heap")) {
                class348.method2221(arg1 ^ 0x7817, "Heap: " + class362.field5189 + "MB");
                return;
            }
            if (arg0.equals("savevarcs")) {
                class110.method681((byte) 116);
                class348.method2221(30742, "perm varcs saved");
                return;
            }
            if (arg0.equals("scramblevarcs")) {
                for (int var24 = 0; var24 < class285.field3942.length; var24++) {
                    if (class144.field1760[var24]) {
                        class285.field3942[var24] = (int) (Math.random() * 99999.0D);
                        if (Math.random() > 0.5D) {
                            class285.field3942[var24] *= -1;
                        }
                    }
                }
                class110.method681((byte) -109);
                class348.method2221(30742, "perm varcs scrambled");
                return;
            }
            if (arg0.equals("showcolmap")) {
                class390.field5969 = true;
                class635.method3622((byte) -19);
                class348.method2221(30742, "colmap is shown");
                return;
            }
            if (arg0.equals("hidecolmap")) {
                class390.field5969 = false;
                class635.method3622((byte) -78);
                class348.method2221(30742, "colmap is hidden");
                return;
            }
            if (arg0.equals("resetcache")) {
                class457.method2821((byte) -124);
                class348.method2221(30742, "Caches reset");
                return;
            }
            if (arg0.equals("profilecpu")) {
                class348.method2221(30742, class333.method2165((byte) 46) + "ms");
                return;
            }
            if (arg0.startsWith("cpuusage")) {
                int var25 = Integer.parseInt(arg0.substring(9));
                if (var25 >= 0 && var25 <= 4) {
                    class595.field8694.field6557 = var25;
                }
                class348.method2221(30742, "cpuusage=" + class595.field8694.field6557);
                return;
            }
            if (arg0.startsWith("getclientvarpbit")) {
                int var26 = Integer.parseInt(arg0.substring(17));
                class348.method2221(30742, "varpbit=" + class23.field243.method3195(var26, true));
                return;
            }
            if (arg0.startsWith("getclientvarp")) {
                int var27 = Integer.parseInt(arg0.substring(14));
                class348.method2221(30742, "varp=" + class23.field243.method3196(var27, 0));
                return;
            }
            if (arg0.startsWith("demologin")) {
                class356.method2240(true, false, 0);
                return;
            }
            if (arg0.startsWith("newdemologin")) {
                class356.method2240(true, true, 0);
                return;
            }
            if (arg0.startsWith("directlogin")) {
                String[] var28 = class293.method1890(' ', (byte) -1, arg0.substring(12));
                if (var28.length >= 2) {
                    int var29 = var28.length <= 2 ? 0 : Integer.parseInt(var28[2]);
                    class570.method3313(var29, -202020063, var28[1], var28[0]);
                    return;
                }
            }
            if (arg0.startsWith("csprofileclear")) {
                class604.method3511();
                return;
            }
            if (arg0.startsWith("csprofileoutputc")) {
                class604.method3518(100, false);
                return;
            }
            if (arg0.startsWith("csprofileoutputt")) {
                class604.method3518(10, true);
                return;
            }
            if (arg0.startsWith("texsize")) {
                int var30 = Integer.parseInt(arg0.substring(8));
                class413.field6264.method380(var30);
                return;
            }
            if (arg0.equals("soundstreamcount")) {
                class348.method2221(arg1 + 30741, "Active streams: " + class44.field469.method937());
                return;
            }
            if (arg0.equals("autosetup")) {
                class595.field8694.method2434((byte) 92);
                class348.method2221(30742, "Complete. Toolkit now: " + class81.field908);
                return;
            }
            if (arg0.equals("errormessage")) {
                class348.method2221(30742, class254.field3624.method668((byte) -41));
                return;
            }
            if (class133.field1673 == 9) {
                class491.field7159++;
                class308.method2044(class629.field9075, arg1 ^ 0xFFFFE2F7);
                class468.field6960.method1205((byte) -69, arg0.length() + 3);
                class468.field6960.method1205((byte) -69, arg2 ? 1 : 0);
                class468.field6960.method1205((byte) -69, arg3 ? 1 : 0);
                class468.field6960.method1237(1049279824, arg0);
            }
            if (arg0.startsWith("fps ") && class646.field9321 != class197.field2667) {
                class342.method2203(67, class575.method3340((byte) 98, arg0.substring(4)));
                return;
            }
            if (class133.field1673 != 9) {
                class348.method2221(30742, "Unrecogonised commmand when not logged in: " + arg0);
                return;
            }
        } catch (Exception var34) {
            class348.method2221(arg1 + 30741, "Whoops, something went wrong.");
            return;
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(B)I", line = 993)
    public final int method2097(byte arg0) {
        if (arg0 > -77) {
            method2092(-40);
        }
        field4642++;
        return this.field4646;
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(IIIIIF)V", line = 1005)
    public class321(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field4640 = arg0;
        this.field4650 = arg4;
        this.field4638 = arg2;
        this.field4643 = arg5;
        this.field4652 = arg3;
        this.field4646 = arg1;
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(B)I", line = 1018)
    public final int method2098(byte arg0) {
        field4639++;
        if (arg0 != 89) {
            this.field4640 = -92;
        }
        return this.field4650;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(FI)V")
    public abstract void method1756(float arg0, int arg1);

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZIII)V")
    public abstract void method1755(boolean arg0, int arg1, int arg2, int arg3);
}
