import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class447 {

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "J")
    public long field6549;

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "Lkd;")
    private class188 field6546;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "Lak;")
    public static class234 field6545 = new class234("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

    @OriginalMember(owner = "client!sn", name = "i", descriptor = "[C")
    public static char[] field6553 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "Lhn;")
    public static class509 field6550 = new class509(19, -2);

    @OriginalMember(owner = "client!sn", name = "j", descriptor = "I")
    public static int field6554 = 0;

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "I")
    public static int field6547;

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "I")
    public static int field6548;

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "I")
    public static int field6551;

    @OriginalMember(owner = "client!sn", name = "h", descriptor = "I")
    public static int field6552;

    @OriginalMember(owner = "client!sn", name = "k", descriptor = "I")
    public static int field6555;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2739(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class433.field6409 = arg2;
        if (arg0 != 256) {
            field6554 = -91;
        }
        class368.field5408 = arg4;
        class178.field2687 = arg3;
        class189.field3180 = arg1;
        class530.field7741 = arg6;
        field6548++;
        class366.field5394 = arg5;
    }

    @OriginalMember(owner = "client!sn", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field6551++;
        this.field6546.method1276(this.field6549, 116);
        super.finalize();
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V")
    public static void method2740(int arg0) {
        field6553 = null;
        field6550 = null;
        field6545 = null;
        if (arg0 != -2) {
            method2739(-26, 17, 80, -103, -61, -124, -50);
        }
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(I)V")
    public static final void method2741(int arg0) {
        field6555++;
        if (class390.field5846 != null) {
            return;
        }
        class390.field5846 = new int[65536];
        if (arg0 <= 99) {
            field6550 = null;
        }
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        int var3 = 0;
        for (int var4 = 0; var4 < 512; var4++) {
            float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
            float var6 = (float) (var4 & 0x7) / 8.0F + 0.0625F;
            for (int var7 = 0; var7 < 128; var7++) {
                float var8 = (float) var7 / 128.0F;
                float var9 = 0.0F;
                float var10 = 0.0F;
                float var11 = 0.0F;
                float var12 = var5 / 60.0F;
                int var13 = (int) var12;
                int var14 = var13 % 6;
                float var15 = (float) (-var13) + var12;
                float var16 = (1.0F - var6) * var8;
                float var17 = (1.0F - var6 * var15) * var8;
                float var18 = (1.0F - ((1.0F - var15) * var6)) * var8;
                if (var14 == 0) {
                    var9 = var8;
                    var10 = var18;
                    var11 = var16;
                } else if (var14 == 1) {
                    var9 = var17;
                    var11 = var16;
                    var10 = var8;
                } else if (var14 == 2) {
                    var9 = var16;
                    var11 = var18;
                    var10 = var8;
                } else if (var14 == 3) {
                    var9 = var16;
                    var10 = var17;
                    var11 = var8;
                } else if (var14 == 4) {
                    var10 = var16;
                    var11 = var8;
                    var9 = var18;
                } else if (var14 == 5) {
                    var10 = var16;
                    var11 = var17;
                    var9 = var8;
                }
                float var19 = (float) Math.pow((double) var9, var1);
                float var20 = (float) Math.pow((double) var10, var1);
                float var21 = (float) Math.pow((double) var11, var1);
                int var22 = (int) (var19 * 256.0F);
                int var23 = (int) (var20 * 256.0F);
                int var24 = (int) (var21 * 256.0F);
                int var25 = (var22 << 16) + (var23 << 8) + var24 - 16777216;
                class390.field5846[var3++] = var25;
            }
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(ZLjava/lang/String;I)V")
    public static final void method2742(boolean arg0, String arg1, int arg2) {
        field6547++;
        if (class310.field4662 != class125.field1855 || class417.field6224 >= 2) {
            if (arg1.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg1.equals("nativememerror")) {
                throw new OutOfMemoryError("native(MPR");
            }
            try {
                if (arg1.equalsIgnoreCase("fpson")) {
                    class470.field6798 = true;
                    class6.method33((byte) 15, "fps debug enabled");
                    return;
                }
                if (arg1.equalsIgnoreCase("fpsoff")) {
                    class470.field6798 = false;
                    class6.method33((byte) 15, "fps debug disabled");
                    return;
                }
                if (arg1.equals("systemmem")) {
                    try {
                        class6.method33((byte) 15, "System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
                        return;
                    } catch (Throwable var26) {
                        return;
                    }
                }
                if (arg1.equalsIgnoreCase("cls")) {
                    class291.field4388 = 0;
                    class208.field3400 = 0;
                    return;
                }
                if (arg1.equalsIgnoreCase("cleartext")) {
                    class316.field4776.method1959(0);
                    class6.method33((byte) 15, "Text coords cleared");
                    return;
                }
                if (arg1.equalsIgnoreCase("gc")) {
                    class520.method3097((byte) 26);
                    for (int var3 = 0; var3 < 10; var3++) {
                        System.gc();
                    }
                    Runtime var4 = Runtime.getRuntime();
                    int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
                    class6.method33((byte) 15, "mem=" + var5 + "k");
                    return;
                }
                if (arg1.equalsIgnoreCase("compact")) {
                    class520.method3097((byte) 115);
                    for (int var6 = 0; var6 < 10; var6++) {
                        System.gc();
                    }
                    Runtime var7 = Runtime.getRuntime();
                    int var8 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                    class6.method33((byte) 15, "Memory before cleanup=" + var8 + "k");
                    class2.method7((byte) 93);
                    class520.method3097((byte) 45);
                    for (int var9 = 0; var9 < 10; var9++) {
                        System.gc();
                    }
                    int var10 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                    class6.method33((byte) 15, "Memory after cleanup=" + var10 + "k");
                    return;
                }
                if (arg1.equalsIgnoreCase("pcachesize")) {
                    class6.method33((byte) 15, "Number of player models in cache:" + class73.method634(-81));
                    return;
                }
                if (arg1.equalsIgnoreCase("clientdrop")) {
                    class6.method33((byte) 15, "Dropped client connection");
                    if (class429.field6373 == 9) {
                        class421.method2625(73);
                    } else if (class429.field6373 == 10) {
                        class191.field3222 = true;
                        return;
                    }
                    return;
                }
                if (arg1.equalsIgnoreCase("clientjs5drop")) {
                    class322.field4831.method2010((byte) 102);
                    class6.method33((byte) 15, "Dropped client js5 net queue");
                    return;
                }
                if (arg1.equalsIgnoreCase("serverjs5drop")) {
                    class322.field4831.method2001((byte) -69);
                    class6.method33((byte) 15, "Dropped server js5 net queue");
                    return;
                }
                if (arg1.equalsIgnoreCase("breakcon")) {
                    class360.field5349.method2184(-126);
                    class162.field2413.method1972(1);
                    class322.field4831.method2009(0);
                    class6.method33((byte) 15, "Breaking new connections for 5 seconds");
                    return;
                }
                if (arg1.equalsIgnoreCase("rebuild")) {
                    class505.method3010(-69);
                    class77.method668(false);
                    class6.method33((byte) 15, "Rebuilding map");
                    return;
                }
                if (arg1.equalsIgnoreCase("wm1")) {
                    class328.method2083(1, -1, -1, false, (byte) 79);
                    if (class32.method223((byte) 117) != 1) {
                        class6.method33((byte) 15, "wm1 failed");
                        return;
                    }
                    class6.method33((byte) 15, "wm1 succeeded");
                    return;
                }
                if (arg1.equalsIgnoreCase("wm2")) {
                    class328.method2083(2, -1, -1, false, (byte) -126);
                    if (class32.method223((byte) 127) != 2) {
                        class6.method33((byte) 15, "wm2 failed");
                        return;
                    }
                    class6.method33((byte) 15, "wm2 succeeded");
                    return;
                }
                if (arg1.equalsIgnoreCase("wm3")) {
                    class328.method2083(3, 768, 1024, false, (byte) 38);
                    if (class32.method223((byte) 126) != 3) {
                        class6.method33((byte) 15, "wm3 failed");
                        return;
                    }
                    class6.method33((byte) 15, "wm3 succeeded");
                    return;
                }
                if (arg1.equalsIgnoreCase("tk0")) {
                    class185.method1229((byte) -75, 0);
                    if (class96.field1384 != 0) {
                        class6.method33((byte) 15, "Failed to enter tk0");
                        return;
                    }
                    class6.method33((byte) 15, "Entered tk0");
                    class193.field3258.field7230 = 0;
                    class193.field3258.method933((byte) 78, class360.field5349);
                    class360.field5348 = false;
                    return;
                }
                if (arg1.equalsIgnoreCase("tk1")) {
                    class185.method1229((byte) -75, 1);
                    if (class96.field1384 == 1) {
                        class6.method33((byte) 15, "Entered tk1");
                        class193.field3258.field7230 = 1;
                        class193.field3258.method933((byte) 78, class360.field5349);
                        class360.field5348 = false;
                        return;
                    }
                    class6.method33((byte) 15, "Failed to enter tk1");
                    return;
                }
                if (arg1.equalsIgnoreCase("tk2")) {
                    class185.method1229((byte) -23, 2);
                    if (class96.field1384 != 2) {
                        class6.method33((byte) 15, "Failed to enter tk2");
                        return;
                    }
                    class6.method33((byte) 15, "Entered tk2");
                    class193.field3258.field7230 = 2;
                    class193.field3258.method933((byte) 78, class360.field5349);
                    class360.field5348 = false;
                    return;
                }
                if (arg1.equalsIgnoreCase("tk3")) {
                    class185.method1229((byte) -122, 3);
                    if (class96.field1384 != 3) {
                        class6.method33((byte) 15, "Failed to enter tk3");
                        return;
                    }
                    class6.method33((byte) 15, "Entered tk3");
                    return;
                }
                if (arg1.equalsIgnoreCase("ot")) {
                    class193.field3258.field7220 = !class193.field3258.field7220;
                    class193.field3258.method933((byte) 78, class360.field5349);
                    class360.field5348 = false;
                    class505.method3010(-77);
                    class6.method33((byte) 15, "ot=" + class193.field3258.field7220);
                    return;
                }
                if (arg1.equalsIgnoreCase("gb")) {
                    class193.field3258.field7227 = !class193.field3258.field7227;
                    class193.field3258.method933((byte) 78, class360.field5349);
                    class360.field5348 = false;
                    class505.method3010(-90);
                    class6.method33((byte) 15, "gb=" + class193.field3258.field7227);
                    return;
                }
                if (arg1.startsWith("shadows")) {
                    if (arg1.length() < 8) {
                        class6.method33((byte) 15, "Invalid shadows value");
                        return;
                    }
                    String var11 = arg1.substring(8);
                    int var12 = class4.method13(-118, var11) ? class64.method555((byte) 124, var11) : -1;
                    if (var12 >= 0 && var12 <= 2) {
                        class193.field3258.method2982(class96.field1384, (byte) 16, var12);
                        class193.field3258.method933((byte) 78, class360.field5349);
                        class360.field5348 = false;
                        class505.method3010(-68);
                        class6.method33((byte) 15, "shadows=" + var12);
                        return;
                    }
                    class6.method33((byte) 15, "Invalid shadows value");
                    return;
                }
                if (arg1.startsWith("textures")) {
                    class193.field3258.field7226 = !class193.field3258.field7226;
                    class193.field3258.method933((byte) 78, class360.field5349);
                    class360.field5348 = false;
                    class191.method1342(125);
                    class505.method3010(-108);
                    class6.method33((byte) 15, "textures=" + class193.field3258.field7226);
                    return;
                }
                if (arg1.startsWith("setba")) {
                    if (arg1.length() < 6) {
                        class6.method33((byte) 15, "Invalid buildarea value");
                        return;
                    }
                    int var13 = class64.method555((byte) 124, arg1.substring(6));
                    if (var13 >= 0 && var13 <= class271.method1795(class494.field7129, 3)) {
                        class193.field3258.field7235 = var13;
                        class193.field3258.method933((byte) 78, class360.field5349);
                        class360.field5348 = false;
                        class6.method33((byte) 15, "maxbuildarea=" + class193.field3258.field7235);
                        return;
                    }
                    class6.method33((byte) 15, "Invalid buildarea value");
                    return;
                }
                if (arg1.startsWith("setparticles")) {
                    if (arg1.length() < 13) {
                        class6.method33((byte) 15, "Invalid particles value");
                        return;
                    }
                    class24.method178(class64.method555((byte) 124, arg1.substring(13)), 109);
                    class193.field3258.method933((byte) 78, class360.field5349);
                    class360.field5348 = false;
                    class6.method33((byte) 15, "particles=" + class384.method2399((byte) -126));
                    return;
                }
                if (arg1.startsWith("rect_debug")) {
                    if (arg1.length() < 10) {
                        class6.method33((byte) 15, "Invalid rect_debug value");
                        return;
                    }
                    class190.field3213 = class64.method555((byte) 124, arg1.substring(10).trim());
                    class6.method33((byte) 15, "rect_debug=" + class190.field3213);
                    return;
                }
                if (arg1.equalsIgnoreCase("qa_op_test")) {
                    class64.field780 = true;
                    class6.method33((byte) 15, "qa_op_test=" + class64.field780);
                    return;
                }
                if (arg1.equalsIgnoreCase("clipcomponents")) {
                    class24.field288 = !class24.field288;
                    class6.method33((byte) 15, "clipcomponents=" + class24.field288);
                    return;
                }
                if (arg1.startsWith("bloom")) {
                    boolean var14 = class377.field5692.method340();
                    if (class224.method1597(!var14, 73)) {
                        if (!var14) {
                            class6.method33((byte) 15, "Bloom enabled");
                            return;
                        }
                        class6.method33((byte) 15, "Bloom disabled");
                        return;
                    }
                    class6.method33((byte) 15, "Failed to enable bloom");
                    return;
                }
                if (arg1.equalsIgnoreCase("tween")) {
                    if (class55.field685) {
                        class55.field685 = false;
                        class6.method33((byte) 15, "Forced tweening disabled.");
                        return;
                    }
                    class55.field685 = true;
                    class6.method33((byte) 15, "Forced tweening ENABLED!");
                    return;
                }
                if (arg1.equalsIgnoreCase("shiftclick")) {
                    if (class34.field392) {
                        class6.method33((byte) 15, "Shift-click disabled.");
                        class34.field392 = false;
                        return;
                    }
                    class6.method33((byte) 15, "Shift-click ENABLED!");
                    class34.field392 = true;
                    return;
                }
                if (arg1.equalsIgnoreCase("getcgcoord")) {
                    class6.method33((byte) 15, "x:" + (class398.field5947.field5837 >> 7) + " z:" + (class398.field5947.field5833 >> 7));
                    return;
                }
                if (arg1.equalsIgnoreCase("getheight")) {
                    class6.method33((byte) 15, "Height: " + class491.field7059[class398.field5947.field5826].method411(class398.field5947.field5837 >> 7, class398.field5947.field5833 >> 7));
                    return;
                }
                if (arg1.equalsIgnoreCase("resetminimap")) {
                    class176.field2627.method2552((byte) -92);
                    class176.field2627.method2533(arg2 ^ 0xFFFFEF58);
                    class59.field711.method1061(81);
                    class107.field1502.method3076((byte) -106);
                    class77.method668(false);
                    class6.method33((byte) 15, "Minimap reset");
                    return;
                }
                if (arg1.startsWith("mc")) {
                    if (!class377.field5692.method307()) {
                        class6.method33((byte) 15, "Current toolkit doesn't support multiple cores");
                        return;
                    }
                    int var15 = Integer.parseInt(arg1.substring(3));
                    if (var15 < 1) {
                        var15 = 1;
                    } else if (var15 > 4) {
                        var15 = 4;
                    }
                    class421.field6276 = var15;
                    class377.field5692.method334(class421.field6276);
                    class377.field5692.method318(0);
                    class6.method33((byte) 15, "Render cores now: " + class421.field6276);
                    return;
                }
                if (arg1.startsWith("cachespace")) {
                    class6.method33((byte) 15, "I(s): " + class372.field5543.method83(arg2 ^ 0x6FD6) + "/" + class372.field5543.method86(-22131));
                    class6.method33((byte) 15, "I(m): " + class100.field1426.method83(24871) + "/" + class100.field1426.method86(arg2 ^ 0xFFFFA77C));
                    class6.method33((byte) 15, "O(s): " + class390.field5847.field587.method663(17894) + "/" + class390.field5847.field587.method659(false));
                    return;
                }
                if (arg1.equalsIgnoreCase("getcamerapos")) {
                    class6.method33((byte) 15, "Pos: " + class398.field5947.field5826 + "," + ((class412.field6180 >> 7) + class390.field5842 >> 6) + "," + ((class71.field1024 >> 7) + class176.field2613 >> 6) + "," + ((class412.field6180 >> 7) + class390.field5842 & 0x3F) + "," + ((class71.field1024 >> 7) + class176.field2613 & 0x3F) + " Height: " + (class172.method1153(class398.field5947.field5826, -4, class412.field6180, class71.field1024) - class473.field6831));
                    class6.method33((byte) 15, "Look: " + class398.field5947.field5826 + "," + (class121.field1828 + class390.field5842 >> 6) + "," + (class299.field4545 + class176.field2613 >> 6) + "," + (class121.field1828 + class390.field5842 & 0x3F) + "," + (class299.field4545 + class176.field2613 & 0x3F) + " Height: " + (class172.method1153(class398.field5947.field5826, arg2 ^ 0xFFFFF10D, class121.field1828, class299.field4545) - class398.field5952));
                    return;
                }
                if (arg1.equals("showocc")) {
                    class308.field4644 = !class308.field4644;
                    class505.method3010(arg2 ^ 0xFFFFF159);
                    class6.method33((byte) 15, "showocc=" + class308.field4644);
                    return;
                }
                if (arg1.equals("wallocc")) {
                    class182.field2720 = !class182.field2720;
                    class505.method3010(-103);
                    class6.method33((byte) 15, "forcewallocc=" + class182.field2720);
                    return;
                }
                if (arg1.equals("renderprofile") || arg1.equals("rp")) {
                    class23.field285 = !class23.field285;
                    class377.field5692.method329(class23.field285);
                    class94.method751(8589);
                    class6.method33((byte) 15, "showprofiling=" + class23.field285);
                    return;
                }
                if (arg1.equals("performancetest")) {
                    class6.method33((byte) 15, "Java toolkit: " + class80.method679((byte) 2, class360.field5349, 0));
                    class6.method33((byte) 15, "GL toolkit:   " + class80.method679((byte) 2, class360.field5349, 1));
                    class6.method33((byte) 15, "SSE toolkit:  " + class80.method679((byte) 2, class360.field5349, 2));
                    return;
                }
                if (arg1.equals("nonpcs")) {
                    class347.field5127 = !class347.field5127;
                    class6.method33((byte) 15, "nonpcs=" + class347.field5127);
                    return;
                }
                if (arg1.equals("autoworld")) {
                    class310.method1983((byte) -122);
                    class6.method33((byte) 15, "auto world selected");
                    return;
                }
                if (arg1.startsWith("switchworld")) {
                    int var16 = Integer.parseInt(arg1.substring(12));
                    class145.method1030(-1008, class160.method1093((byte) -106, var16).field6535, var16);
                    class6.method33((byte) 15, "switched");
                    return;
                }
                if (arg1.startsWith("pc")) {
                    class74.method640(arg2 ^ 0xFFFF82B4, class450.field6581);
                    class71.field1020.method1545(0, -72);
                    int var17 = class71.field1020.field3556;
                    int var18 = arg1.indexOf(" ", 4);
                    class71.field1020.method1534(arg1.substring(3, var18), false);
                    class296.method1926(class71.field1020, (byte) -16, arg1.substring(var18));
                    class71.field1020.method1513(class71.field1020.field3556 - var17, (byte) 107);
                    return;
                }
                if (arg1.equals("heap")) {
                    class6.method33((byte) 15, "Heap: " + class494.field7129 + "MB");
                    return;
                }
                if (arg1.equals("savevarcs")) {
                    class160.method1094(arg2 ^ 0xFFFFF143);
                    class6.method33((byte) 15, "perm varcs saved");
                    return;
                }
                if (arg1.equals("scramblevarcs")) {
                    for (int var19 = 0; var19 < class505.field7385.length; var19++) {
                        if (class256.field3922[var19]) {
                            class505.field7385[var19] = (int) (Math.random() * 99999.0D);
                            if (Math.random() > 0.5D) {
                                class505.field7385[var19] *= -1;
                            }
                        }
                    }
                    class160.method1094(-44);
                    class6.method33((byte) 15, "perm varcs scrambled");
                    return;
                }
                if (arg1.equals("showcolmap")) {
                    class155.field2296 = true;
                    class77.method668(false);
                    class6.method33((byte) 15, "colmap is shown");
                    return;
                }
                if (arg1.equals("hidecolmap")) {
                    class155.field2296 = false;
                    class77.method668(false);
                    class6.method33((byte) 15, "colmap is hidden");
                    return;
                }
                if (arg1.equals("resetcache")) {
                    class123.method912(true);
                    class6.method33((byte) 15, "Caches reset");
                    return;
                }
                if (arg1.equals("profilecpu")) {
                    class6.method33((byte) 15, class96.method783((byte) 99) + "ms");
                    return;
                }
                if (arg1.startsWith("cpuusage")) {
                    int var20 = Integer.parseInt(arg1.substring(9));
                    if (var20 >= 0 && var20 <= 4) {
                        class193.field3258.field7243 = var20;
                    }
                    class6.method33((byte) 15, "cpuusage=" + class193.field3258.field7243);
                    return;
                }
                if (arg1.startsWith("getclientvarpbit")) {
                    int var21 = Integer.parseInt(arg1.substring(17));
                    class6.method33((byte) 15, "varpbit=" + class195.field3271.method925(var21, false));
                    return;
                }
                if (arg1.startsWith("getclientvarp")) {
                    int var22 = Integer.parseInt(arg1.substring(14));
                    class6.method33((byte) 15, "varp=" + class195.field3271.method924(var22, arg2 ^ 0xEB5));
                    return;
                }
                if (arg1.startsWith("demologin")) {
                    class64.method552(false, 0, 8191);
                    return;
                }
                if (arg1.startsWith("newdemologin")) {
                    class64.method552(true, 0, 8191);
                    return;
                }
                if (arg1.startsWith("directlogin")) {
                    String[] var23 = class23.method170(16943, ' ', arg1.substring(12));
                    if (var23.length >= 2) {
                        int var24 = var23.length > 2 ? Integer.parseInt(var23[2]) : 0;
                        class204.method1420(var23[1], var24, true, var23[0]);
                        return;
                    }
                }
                if (arg1.startsWith("csprofileclear")) {
                    class192.method1351();
                    return;
                }
                if (arg1.startsWith("csprofileoutputc")) {
                    class192.method1355(100, false);
                    return;
                }
                if (arg1.startsWith("csprofileoutputt")) {
                    class192.method1355(10, true);
                    return;
                }
                if (arg1.startsWith("texsize")) {
                    int var25 = Integer.parseInt(arg1.substring(8));
                    class377.field5692.method290(var25);
                    return;
                }
                if (arg1.equals("soundstreamcount")) {
                    class6.method33((byte) 15, "Active streams: " + class359.field5328.method383());
                    return;
                }
                if (class429.field6373 == 9) {
                    class74.method640(-29627, class287.field4342);
                    class62.field758++;
                    class71.field1020.method1545(arg1.length() + 2, -116);
                    class71.field1020.method1545(arg0 ? 1 : 0, -57);
                    class71.field1020.method1534(arg1, false);
                }
                if (arg1.startsWith("fps ") && class310.field4662 != class125.field1855) {
                    class26.method184(class64.method555((byte) 124, arg1.substring(4)), (byte) -103);
                    return;
                }
                if (class429.field6373 != 9) {
                    class6.method33((byte) 15, "Unrecogonised commmand when not logged in: " + arg1);
                }
            } catch (Exception var27) {
                class6.method33((byte) 15, "Whoops, something went wrong.");
            }
        }
        if (arg2 != 3825) {
            method2741(-95);
        }
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lkd;JI)V")
    public class447(class188 arg0, long arg1, int arg2) {
        this.field6549 = arg1;
        this.field6546 = arg0;
    }
}
