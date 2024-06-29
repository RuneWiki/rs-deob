import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class326 {

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "I")
    public int field4451 = -1;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
    public static int field4449;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!wi", name = "r", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!wi", name = "v", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "Lmn;")
    private class247 field4450;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "Ljava/lang/String;")
    private String field4446;

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "Ljava/lang/String;")
    private String field4452;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "[I")
    private int[] field4444;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "[I")
    private int[] field4447;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "[I")
    private int[] field4454;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "[I")
    private int[] field4455;

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "[I")
    private int[] field4456;

    @OriginalMember(owner = "client!wi", name = "q", descriptor = "[I")
    private int[] field4460;

    @OriginalMember(owner = "client!wi", name = "t", descriptor = "[I")
    private int[] field4463;

    @OriginalMember(owner = "client!wi", name = "u", descriptor = "[I")
    private int[] field4464;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "[Ljava/lang/String;")
    private String[] field4448;

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "[Ljava/lang/String;")
    private String[] field4457;

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "[[I")
    private int[][] field4458;

    @OriginalMember(owner = "client!wi", name = "p", descriptor = "[[I")
    private int[][] field4459;

    @OriginalMember(owner = "client!wi", name = "s", descriptor = "[[I")
    private int[][] field4462;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILsi;)V")
    public final void method1890(int arg0, class391 arg1) {
        field4445++;
        if (arg0 != 0) {
            return;
        }
        while (true) {
            int var3 = arg1.method2348(arg0 - 2);
            if (var3 == 0) {
                return;
            }
            this.method1892(arg1, var3, 10);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
    public final void method1891(int arg0) {
        if (this.field4452 == null) {
            this.field4452 = this.field4446;
        }
        field4453++;
        if (arg0 < 123) {
            method1893(118, true, null);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lsi;II)V")
    private final void method1892(class391 arg0, int arg1, int arg2) {
        int var4 = 7 % ((56 - arg2) / 44);
        if (arg1 == 1) {
            this.field4446 = arg0.method2320(false);
        } else if (arg1 == 2) {
            this.field4452 = arg0.method2320(false);
        } else if (arg1 == 3) {
            int var5 = arg0.method2348(-2);
            this.field4462 = new int[var5][3];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field4462[var6][0] = arg0.method2353((byte) 82);
                this.field4462[var6][1] = arg0.method2361((byte) -56);
                this.field4462[var6][2] = arg0.method2361((byte) -56);
            }
        } else if (arg1 == 4) {
            int var23 = arg0.method2348(-2);
            this.field4459 = new int[var23][3];
            for (int var24 = 0; var24 < var23; var24++) {
                this.field4459[var24][0] = arg0.method2353((byte) 78);
                this.field4459[var24][1] = arg0.method2361((byte) -56);
                this.field4459[var24][2] = arg0.method2361((byte) -56);
            }
        } else if (arg1 == 5) {
            arg0.method2353((byte) 70);
        } else if (arg1 == 6) {
            arg0.method2348(-2);
        } else if (arg1 == 7) {
            arg0.method2348(-2);
        } else if (arg1 != 8) {
            if (arg1 == 9) {
                arg0.method2348(-2);
            } else if (arg1 == 10) {
                int var21 = arg0.method2348(-2);
                this.field4447 = new int[var21];
                for (int var22 = 0; var22 < var21; var22++) {
                    this.field4447[var22] = arg0.method2361((byte) -56);
                }
            } else if (arg1 == 12) {
                arg0.method2361((byte) -56);
            } else if (arg1 == 13) {
                int var7 = arg0.method2348(-2);
                this.field4456 = new int[var7];
                for (int var8 = 0; var8 < var7; var8++) {
                    this.field4456[var8] = arg0.method2353((byte) 90);
                }
            } else if (arg1 == 14) {
                int var19 = arg0.method2348(-2);
                this.field4458 = new int[var19][2];
                for (int var20 = 0; var20 < var19; var20++) {
                    this.field4458[var20][0] = arg0.method2348(-2);
                    this.field4458[var20][1] = arg0.method2348(-2);
                }
            } else if (arg1 == 15) {
                arg0.method2353((byte) 65);
            } else if (arg1 == 17) {
                this.field4451 = arg0.method2353((byte) 100);
            } else if (arg1 == 18) {
                int var17 = arg0.method2348(-2);
                this.field4457 = new String[var17];
                this.field4444 = new int[var17];
                this.field4463 = new int[var17];
                this.field4454 = new int[var17];
                for (int var18 = 0; var18 < var17; var18++) {
                    this.field4454[var18] = arg0.method2361((byte) -56);
                    this.field4463[var18] = arg0.method2361((byte) -56);
                    this.field4444[var18] = arg0.method2361((byte) -56);
                    this.field4457[var18] = arg0.method2347((byte) 104);
                }
            } else if (arg1 == 19) {
                int var15 = arg0.method2348(-2);
                this.field4460 = new int[var15];
                this.field4464 = new int[var15];
                this.field4455 = new int[var15];
                this.field4448 = new String[var15];
                for (int var16 = 0; var16 < var15; var16++) {
                    this.field4460[var16] = arg0.method2361((byte) -56);
                    this.field4455[var16] = arg0.method2361((byte) -56);
                    this.field4464[var16] = arg0.method2361((byte) -56);
                    this.field4448[var16] = arg0.method2347((byte) 91);
                }
            } else if (arg1 == 249) {
                int var9 = arg0.method2348(-2);
                if (this.field4450 == null) {
                    int var10 = class508.method3034(var9, true);
                    this.field4450 = new class247(var10);
                }
                for (int var11 = 0; var11 < var9; var11++) {
                    boolean var12 = arg0.method2348(-2) == 1;
                    int var13 = arg0.method2338(true);
                    class260 var14;
                    if (var12) {
                        var14 = new class450(arg0.method2347((byte) -78));
                    } else {
                        var14 = new class500(arg0.method2361((byte) -56));
                    }
                    this.field4450.method1487(-69, (long) var13, var14);
                }
            }
        }
        field4465++;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IZLjava/lang/String;)V")
    public static final void method1893(int arg0, boolean arg1, String arg2) {
        field4449++;
        if (class404.field5937 != class373.field5469 || class68.field929 >= 2) {
            if (arg2.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            try {
                if (arg2.equalsIgnoreCase("fpson")) {
                    class225.field3200 = true;
                    class156.method1040(-21411, "fps debug enabled");
                    return;
                }
                if (arg2.equalsIgnoreCase("fpsoff")) {
                    class225.field3200 = false;
                    class156.method1040(-21411, "fps debug disabled");
                    return;
                }
                if (arg2.equals("systemmem")) {
                    try {
                        class156.method1040(-21411, "System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
                        return;
                    } catch (Throwable var24) {
                        return;
                    }
                }
                if (arg2.equalsIgnoreCase("cls")) {
                    class6.field107 = 0;
                    class410.field5996 = 0;
                    return;
                }
                if (arg2.equalsIgnoreCase("cleartext")) {
                    class388.field5656.method2457(8165);
                    class156.method1040(-21411, "Text coords cleared");
                    return;
                }
                if (arg2.equalsIgnoreCase("gc")) {
                    class484.method2847(115);
                    for (int var3 = 0; var3 < 10; var3++) {
                        System.gc();
                    }
                    Runtime var4 = Runtime.getRuntime();
                    int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
                    class156.method1040(-21411, "mem=" + var5 + "k");
                    return;
                }
                if (arg2.equalsIgnoreCase("compact")) {
                    class484.method2847(118);
                    for (int var6 = 0; var6 < 10; var6++) {
                        System.gc();
                    }
                    Runtime var7 = Runtime.getRuntime();
                    int var8 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                    class156.method1040(-21411, "Memory before cleanup=" + var8 + "k");
                    class227.method1414(-4);
                    class484.method2847(120);
                    for (int var9 = 0; var9 < 10; var9++) {
                        System.gc();
                    }
                    int var10 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                    class156.method1040(-21411, "Memory after cleanup=" + var10 + "k");
                    return;
                }
                if (arg2.equalsIgnoreCase("pcachesize")) {
                    class156.method1040(-21411, "Number of player models in cache:" + class92.method684(50));
                    return;
                }
                if (arg2.equalsIgnoreCase("clientdrop")) {
                    class156.method1040(-21411, "Dropped client connection");
                    if (class492.field7178 == 30) {
                        class467.method2737(56);
                        return;
                    }
                    if (class492.field7178 == 25) {
                        class10.field151 = true;
                    }
                    return;
                }
                if (arg2.equalsIgnoreCase("clientjs5drop")) {
                    class366.field5366.method2382((byte) -79);
                    class156.method1040(-21411, "Dropped client js5 net queue");
                    return;
                }
                if (arg2.equalsIgnoreCase("serverjs5drop")) {
                    class366.field5366.method2376(-2);
                    class156.method1040(-21411, "Dropped server js5 net queue");
                    return;
                }
                if (arg2.equalsIgnoreCase("breakcon")) {
                    class202.field2840.method2956((byte) 127);
                    class33.field438.method2841((byte) -118);
                    class366.field5366.method2379(0);
                    class156.method1040(-21411, "Breaking new connections for 5 seconds");
                    return;
                }
                if (arg2.equalsIgnoreCase("rebuild")) {
                    class80.method650(3);
                    class214.method1327(5743);
                    class156.method1040(-21411, "Rebuilding map");
                    return;
                }
                if (arg2.equalsIgnoreCase("wm1")) {
                    class463.method2721(-1, -1, false, 1, (byte) 113);
                    if (class50.method445(-8) == 1) {
                        class156.method1040(-21411, "wm1 succeeded");
                        return;
                    }
                    class156.method1040(-21411, "wm1 failed");
                    return;
                }
                if (arg2.equalsIgnoreCase("wm2")) {
                    class463.method2721(-1, -1, false, 2, (byte) 113);
                    if (class50.method445(-8) == 2) {
                        class156.method1040(-21411, "wm2 succeeded");
                        return;
                    }
                    class156.method1040(-21411, "wm2 failed");
                    return;
                }
                if (arg2.equalsIgnoreCase("wm3")) {
                    class463.method2721(1024, 768, false, 3, (byte) 113);
                    if (class50.method445(-8) != 3) {
                        class156.method1040(-21411, "wm3 failed");
                        return;
                    }
                    class156.method1040(-21411, "wm3 succeeded");
                    return;
                }
                if (arg2.equalsIgnoreCase("tk0")) {
                    class455.method2675(71, 0);
                    if (class152.field2332 != 0) {
                        class156.method1040(-21411, "Failed to enter tk0");
                        return;
                    }
                    class156.method1040(-21411, "Entered tk0");
                    class20.field269.field7662 = 0;
                    class20.field269.method1715((byte) 59, class202.field2840);
                    class143.field2052 = false;
                    return;
                }
                if (arg2.equalsIgnoreCase("tk1")) {
                    class455.method2675(117, 1);
                    if (class152.field2332 != 1) {
                        class156.method1040(-21411, "Failed to enter tk1");
                        return;
                    }
                    class156.method1040(-21411, "Entered tk1");
                    class20.field269.field7662 = 1;
                    class20.field269.method1715((byte) -120, class202.field2840);
                    class143.field2052 = false;
                    return;
                }
                if (arg2.equalsIgnoreCase("tk2")) {
                    class455.method2675(100, 2);
                    if (class152.field2332 == 2) {
                        class156.method1040(-21411, "Entered tk2");
                        class20.field269.field7662 = 2;
                        class20.field269.method1715((byte) -111, class202.field2840);
                        class143.field2052 = false;
                        return;
                    }
                    class156.method1040(-21411, "Failed to enter tk2");
                    return;
                }
                if (arg2.equalsIgnoreCase("tk3")) {
                    class455.method2675(85, 3);
                    if (class152.field2332 != 3) {
                        class156.method1040(-21411, "Failed to enter tk3");
                        return;
                    }
                    class156.method1040(-21411, "Entered tk3");
                    return;
                }
                if (arg2.equalsIgnoreCase("ot")) {
                    class20.field269.field7660 = !class20.field269.field7660;
                    class20.field269.method1715((byte) 123, class202.field2840);
                    class143.field2052 = false;
                    class80.method650(3);
                    class156.method1040(-21411, "ot=" + class20.field269.field7660);
                    return;
                }
                if (arg2.equalsIgnoreCase("gb")) {
                    class20.field269.field7631 = !class20.field269.field7631;
                    class20.field269.method1715((byte) -118, class202.field2840);
                    class143.field2052 = false;
                    class80.method650(3);
                    class156.method1040(-21411, "gb=" + class20.field269.field7631);
                    return;
                }
                if (arg2.startsWith("shadows")) {
                    if (arg2.length() < 8) {
                        class156.method1040(-21411, "Invalid shadows value");
                        return;
                    }
                    String var11 = arg2.substring(8);
                    int var12 = class325.method1882(var11, false) ? class104.method765(var11, 128) : -1;
                    if (var12 >= 0 && var12 <= 2) {
                        class20.field269.method3083(var12, (byte) -118, class152.field2332);
                        class20.field269.method1715((byte) -112, class202.field2840);
                        class143.field2052 = false;
                        class80.method650(3);
                        class156.method1040(-21411, "shadows=" + var12);
                        return;
                    }
                    class156.method1040(-21411, "Invalid shadows value");
                    return;
                }
                if (arg2.startsWith("textures")) {
                    class20.field269.field7632 = !class20.field269.field7632;
                    class20.field269.method1715((byte) 46, class202.field2840);
                    class143.field2052 = false;
                    class446.method2643(-3623);
                    class80.method650(3);
                    class156.method1040(-21411, "textures=" + class20.field269.field7632);
                    return;
                }
                if (arg2.startsWith("setba")) {
                    if (arg2.length() < 6) {
                        class156.method1040(-21411, "Invalid buildarea value");
                        return;
                    }
                    int var13 = class104.method765(arg2.substring(6), 128);
                    if (var13 >= 0 && var13 <= class76.method607(class261.field3627, -20636)) {
                        class20.field269.field7669 = var13;
                        class20.field269.method1715((byte) 123, class202.field2840);
                        class143.field2052 = false;
                        class156.method1040(-21411, "maxbuildarea=" + class20.field269.field7669);
                        return;
                    }
                    class156.method1040(-21411, "Invalid buildarea value");
                    return;
                }
                if (arg2.startsWith("setparticles")) {
                    if (arg2.length() < 13) {
                        class156.method1040(-21411, "Invalid particles value");
                        return;
                    }
                    class292.method1732(2794, class104.method765(arg2.substring(13), 128));
                    class20.field269.method1715((byte) 103, class202.field2840);
                    class143.field2052 = false;
                    class156.method1040(-21411, "particles=" + class122.method861((byte) 120));
                    return;
                }
                if (arg2.startsWith("rect_debug")) {
                    if (arg2.length() < 10) {
                        class156.method1040(-21411, "Invalid rect_debug value");
                        return;
                    }
                    class278.field3812 = class104.method765(arg2.substring(10).trim(), 128);
                    class156.method1040(-21411, "rect_debug=" + class278.field3812);
                    return;
                }
                if (arg2.equalsIgnoreCase("qa_op_test")) {
                    class214.field2982 = true;
                    class156.method1040(-21411, "qa_op_test=" + class214.field2982);
                    return;
                }
                if (arg2.equalsIgnoreCase("clipcomponents")) {
                    class428.field6264 = !class428.field6264;
                    class156.method1040(-21411, "clipcomponents=" + class428.field6264);
                    return;
                }
                if (arg2.startsWith("bloom")) {
                    boolean var14 = class269.field3721.method261();
                    if (!class323.method1867(!var14, 3)) {
                        class156.method1040(-21411, "Failed to enable bloom");
                        return;
                    }
                    if (!var14) {
                        class156.method1040(-21411, "Bloom enabled");
                        return;
                    }
                    class156.method1040(-21411, "Bloom disabled");
                    return;
                }
                if (arg2.equalsIgnoreCase("tween")) {
                    if (!class299.field4102) {
                        class299.field4102 = true;
                        class156.method1040(-21411, "Forced tweening ENABLED!");
                        return;
                    }
                    class299.field4102 = false;
                    class156.method1040(-21411, "Forced tweening disabled.");
                    return;
                }
                if (arg2.equalsIgnoreCase("shiftclick")) {
                    if (!class481.field7023) {
                        class156.method1040(-21411, "Shift-click ENABLED!");
                        class481.field7023 = true;
                        return;
                    }
                    class156.method1040(-21411, "Shift-click disabled.");
                    class481.field7023 = false;
                    return;
                }
                if (arg2.equalsIgnoreCase("getcgcoord")) {
                    class156.method1040(-21411, "x:" + (class316.field4324.field1732 >> 7) + " z:" + (class316.field4324.field1735 >> 7));
                    return;
                }
                if (arg2.equalsIgnoreCase("getheight")) {
                    class156.method1040(-21411, "Height: " + class211.field2950[class316.field4324.field1738].method351(class316.field4324.field1732 >> 7, class316.field4324.field1735 >> 7));
                    return;
                }
                if (arg2.equalsIgnoreCase("resetminimap")) {
                    class364.field5334.method726(true);
                    class364.field5334.method748(0);
                    class227.field3232.method2424((byte) -103);
                    class362.field5299.method145((byte) 127);
                    class214.method1327(5743);
                    class156.method1040(-21411, "Minimap reset");
                    return;
                }
                if (arg2.startsWith("mc")) {
                    if (class269.field3721.method301()) {
                        int var15 = Integer.parseInt(arg2.substring(3));
                        if (var15 < 1) {
                            var15 = 1;
                        } else if (var15 > 4) {
                            var15 = 4;
                        }
                        class210.field2935 = var15;
                        class269.field3721.method248(class210.field2935);
                        class269.field3721.method221(0);
                        class156.method1040(-21411, "Render cores now: " + class210.field2935);
                        return;
                    }
                    class156.method1040(-21411, "Current toolkit doesn't support multiple cores");
                    return;
                }
                if (arg2.startsWith("cachespace")) {
                    class156.method1040(-21411, "I(s): " + class225.field3205.method1069(-61) + "/" + class225.field3205.method1064(43));
                    class156.method1040(-21411, "I(m): " + class89.field1301.method1069(-122) + "/" + class89.field1301.method1064(50));
                    class156.method1040(-21411, "O(s): " + class328.field4480.field7696.method3060((byte) 87) + "/" + class328.field4480.field7696.method3067(false));
                    return;
                }
                if (arg2.equalsIgnoreCase("getcamerapos")) {
                    class156.method1040(-21411, "Pos: " + class316.field4324.field1738 + "," + ((class329.field4493 >> 7) + class510.field7566 >> 6) + "," + ((class373.field5478 >> 7) + class14.field204 >> 6) + "," + ((class329.field4493 >> 7) + class510.field7566 & 0x3F) + "," + ((class373.field5478 >> 7) + class14.field204 & 0x3F) + " Height: " + (class242.method1465(107, class316.field4324.field1738, class373.field5478, class329.field4493) - class62.field766));
                    class156.method1040(-21411, "Look: " + class316.field4324.field1738 + "," + (class510.field7566 + class439.field6489 >> 6) + "," + (class458.field6723 + class14.field204 >> 6) + "," + (class439.field6489 + class510.field7566 & 0x3F) + "," + (class458.field6723 + class14.field204 & 0x3F) + " Height: " + (class242.method1465(104, class316.field4324.field1738, class458.field6723, class439.field6489) - class138.field1969));
                    return;
                }
                if (arg2.equals("showocc")) {
                    class357.field5215 = !class357.field5215;
                    class80.method650(3);
                    class156.method1040(-21411, "showocc=" + class357.field5215);
                    return;
                }
                if (arg2.equals("wallocc")) {
                    class318.field4367 = !class318.field4367;
                    class80.method650(3);
                    class156.method1040(-21411, "forcewallocc=" + class318.field4367);
                    return;
                }
                if (arg2.equals("renderprofile") || arg2.equals("rp")) {
                    class359.field5236 = !class359.field5236;
                    class269.field3721.method247(class359.field5236);
                    class353.method2117(7051);
                    class156.method1040(-21411, "showprofiling=" + class359.field5236);
                    return;
                }
                if (arg2.equals("performancetest")) {
                    class156.method1040(-21411, "Java toolkit: " + class302.method1762(class202.field2840, false, 0));
                    class156.method1040(-21411, "GL toolkit:   " + class302.method1762(class202.field2840, false, 1));
                    class156.method1040(-21411, "SSE toolkit:  " + class302.method1762(class202.field2840, false, 2));
                    return;
                }
                if (arg2.equals("nonpcs")) {
                    class64.field869 = !class64.field869;
                    class156.method1040(-21411, "nonpcs=" + class64.field869);
                    return;
                }
                if (arg2.equals("autoworld")) {
                    class472.method2782(20728);
                    class156.method1040(-21411, "auto world selected");
                    return;
                }
                if (arg2.startsWith("pc")) {
                    class491.method2878((byte) 92, class466.field6832);
                    class481.field7027.method2302(-4, 0);
                    int var16 = class481.field7027.field5719;
                    int var17 = arg2.indexOf(" ", 4);
                    class481.field7027.method2349(arg2.substring(3, var17), true);
                    class423.method2516(arg2.substring(var17), class481.field7027, (byte) 126);
                    class481.field7027.method2301(class481.field7027.field5719 - var16, -4595);
                    return;
                }
                if (arg2.equals("heap")) {
                    class156.method1040(-21411, "Heap: " + class261.field3627 + "MB");
                    return;
                }
                if (arg2.equals("savevarcs")) {
                    class207.method1285((byte) -101);
                    class156.method1040(-21411, "perm varcs saved");
                    return;
                }
                if (arg2.equals("scramblevarcs")) {
                    for (int var18 = 0; var18 < class263.field3635.length; var18++) {
                        if (class357.field5216[var18]) {
                            class263.field3635[var18] = (int) (Math.random() * 99999.0D);
                            if (Math.random() > 0.5D) {
                                class263.field3635[var18] *= -1;
                            }
                        }
                    }
                    class207.method1285((byte) -120);
                    class156.method1040(-21411, "perm varcs scrambled");
                    return;
                }
                if (arg2.equals("showcolmap")) {
                    class413.field6030 = true;
                    class214.method1327(5743);
                    class156.method1040(-21411, "colmap is shown");
                    return;
                }
                if (arg2.equals("hidecolmap")) {
                    class413.field6030 = false;
                    class214.method1327(5743);
                    class156.method1040(-21411, "colmap is hidden");
                    return;
                }
                if (arg2.equals("resetcache")) {
                    class142.method959(-21808);
                    class156.method1040(-21411, "Caches reset");
                    return;
                }
                if (arg2.equals("profilecpu")) {
                    class156.method1040(-21411, class157.method1044((byte) -49) + "ms");
                    return;
                }
                if (arg2.startsWith("cpuusage")) {
                    int var19 = Integer.parseInt(arg2.substring(9));
                    if (var19 >= 0 && var19 <= 4) {
                        class20.field269.field7635 = var19;
                    }
                    class156.method1040(-21411, "cpuusage=" + class20.field269.field7635);
                    return;
                }
                if (arg2.startsWith("getclientvarpbit")) {
                    int var20 = Integer.parseInt(arg2.substring(17));
                    class156.method1040(-21411, "varpbit=" + class421.field6166.method934(var20, -118));
                    return;
                }
                if (arg2.startsWith("getclientvarp")) {
                    int var21 = Integer.parseInt(arg2.substring(14));
                    class156.method1040(-21411, "varp=" + class421.field6166.method926(var21, -119));
                    return;
                }
                if (arg2.startsWith("csprofileclear")) {
                    class429.method2536();
                    return;
                }
                if (arg2.startsWith("csprofileoutputc")) {
                    class429.method2545(100, false);
                    return;
                }
                if (arg2.startsWith("csprofileoutputt")) {
                    class429.method2545(10, true);
                    return;
                }
                if (arg2.startsWith("texsize")) {
                    int var22 = Integer.parseInt(arg2.substring(8));
                    class269.field3721.method292(var22);
                    return;
                }
                if (arg2.equals("soundstreamcount")) {
                    class156.method1040(-21411, "Active streams: " + class361.field5267.method577());
                    return;
                }
                if (class492.field7178 == 30) {
                    class491.method2878((byte) 92, class411.field6011);
                    class296.field4063++;
                    class481.field7027.method2302(-4, arg2.length() + 2);
                    class481.field7027.method2302(-4, arg1 ? 1 : 0);
                    class481.field7027.method2349(arg2, true);
                }
                if (arg2.startsWith("fps ") && class404.field5937 != class373.field5469) {
                    class500.method2937(16222, class104.method765(arg2.substring(4), 128));
                    return;
                }
                if (class492.field7178 != 30) {
                    class156.method1040(-21411, "Unrecogonised commmand when not logged in: " + arg2);
                }
            } catch (Exception var25) {
                class156.method1040(-21411, "Whoops, something went wrong.");
            }
        }
        int var23 = -11 % ((arg0 + 32) / 43);
    }

    static {
        new class466(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
    }
}
