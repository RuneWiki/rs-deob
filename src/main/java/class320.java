import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class320 {

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "I")
    public static int field5018 = 0;

    @OriginalMember(owner = "client!ks", name = "k", descriptor = "[J")
    public static long[] field5025 = new long[32];

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "I")
    public static int field5017 = 0;

    @OriginalMember(owner = "client!ks", name = "B", descriptor = "[[S")
    public static short[][] field5042;

    @OriginalMember(owner = "client!ks", name = "C", descriptor = "Lnk;")
    public static class326 field5043;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "B")
    public byte field5015;

    @OriginalMember(owner = "client!ks", name = "g", descriptor = "B")
    public byte field5021;

    @OriginalMember(owner = "client!ks", name = "l", descriptor = "B")
    public byte field5026;

    @OriginalMember(owner = "client!ks", name = "o", descriptor = "B")
    public byte field5029;

    @OriginalMember(owner = "client!ks", name = "t", descriptor = "B")
    public byte field5034;

    @OriginalMember(owner = "client!ks", name = "u", descriptor = "B")
    public byte field5035;

    @OriginalMember(owner = "client!ks", name = "x", descriptor = "B")
    public byte field5038;

    @OriginalMember(owner = "client!ks", name = "j", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!ks", name = "p", descriptor = "I")
    public static int field5030;

    @OriginalMember(owner = "client!ks", name = "q", descriptor = "I")
    public static int field5031;

    @OriginalMember(owner = "client!ks", name = "r", descriptor = "I")
    public static int field5032;

    @OriginalMember(owner = "client!ks", name = "v", descriptor = "I")
    public int field5036;

    @OriginalMember(owner = "client!ks", name = "w", descriptor = "I")
    public int field5037;

    @OriginalMember(owner = "client!ks", name = "s", descriptor = "S")
    public short field5033;

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "Z")
    public boolean field5016;

    @OriginalMember(owner = "client!ks", name = "e", descriptor = "Z")
    public boolean field5019;

    @OriginalMember(owner = "client!ks", name = "f", descriptor = "Z")
    public boolean field5020;

    @OriginalMember(owner = "client!ks", name = "h", descriptor = "Z")
    public boolean field5022;

    @OriginalMember(owner = "client!ks", name = "i", descriptor = "Z")
    public boolean field5023;

    @OriginalMember(owner = "client!ks", name = "m", descriptor = "Z")
    public boolean field5027;

    @OriginalMember(owner = "client!ks", name = "n", descriptor = "Z")
    public boolean field5028;

    @OriginalMember(owner = "client!ks", name = "z", descriptor = "Z")
    public boolean field5040;

    @OriginalMember(owner = "client!ks", name = "A", descriptor = "Z")
    public boolean field5041;

    @OriginalMember(owner = "client!ks", name = "y", descriptor = "[Lya;")
    public static class220[] field5039;

    static {
        new class306("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
        field5042 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };
        field5043 = new class326(4, 7);
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lqs;Lqs;Ltd;Lqs;I)Z", line = 12)
    public static final boolean method2027(class496 arg0, class496 arg1, class374 arg2, class496 arg3, int arg4) {
        class299.field4805 = arg1;
        class509.field7398 = arg2;
        class199.field3169 = arg0;
        field5024++;
        class323.field5064 = arg3;
        if (arg4 != 8) {
            method2030(-124);
        }
        return true;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)V", line = 29)
    public static final void method2028(byte arg0) {
        field5030++;
        class62 var1 = null;
        try {
            class169 var2 = class419.field6342.method2890(false, "2", true);
            while (var2.field2692 == 0) {
                class444.method2667(-28210, 1L);
            }
            if (arg0 != -63) {
                field5043 = null;
            }
            if (var2.field2692 == 1) {
                var1 = (class62) var2.field2695;
                byte[] var3 = new byte[(int) var1.method411((byte) 108)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method412(var3.length - var4, var4, var3, true);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class327.method2065(-3, new class23(var3));
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method410((byte) 42);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Ljava/lang/String;ZBZ)V", line = 98)
    public static final void method2029(String arg0, boolean arg1, byte arg2, boolean arg3) {
        field5032++;
        if (class255.field4320 != class180.field2857 || class407.field6189 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equals("nativememerror")) {
                throw new OutOfMemoryError("native(MPR");
            }
            try {
                if (arg0.equalsIgnoreCase("fpson")) {
                    class81.field1420 = true;
                    class333.method2097(116, "fps debug enabled");
                    return;
                }
                if (arg0.equalsIgnoreCase("fpsoff")) {
                    class81.field1420 = false;
                    class333.method2097(102, "fps debug disabled");
                    return;
                }
                if (arg0.equals("systemmem")) {
                    try {
                        class333.method2097(109, "System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
                        return;
                    } catch (Throwable var27) {
                        return;
                    }
                }
                if (arg0.equalsIgnoreCase("cls")) {
                    class265.field4425 = 0;
                    class307.field4888 = 0;
                    return;
                }
                if (arg0.equalsIgnoreCase("cleartext")) {
                    class194.field3020.method566(true);
                    class333.method2097(126, "Text coords cleared");
                    return;
                }
                if (arg0.equalsIgnoreCase("gc")) {
                    class187.method1267(true);
                    for (int var4 = 0; var4 < 10; var4++) {
                        System.gc();
                    }
                    Runtime var5 = Runtime.getRuntime();
                    int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
                    class333.method2097(103, "mem=" + var6 + "k");
                    return;
                }
                if (arg0.equalsIgnoreCase("compact")) {
                    class187.method1267(true);
                    for (int var7 = 0; var7 < 10; var7++) {
                        System.gc();
                    }
                    Runtime var8 = Runtime.getRuntime();
                    int var9 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
                    class333.method2097(109, "Memory before cleanup=" + var9 + "k");
                    class199.method1318(79);
                    class187.method1267(true);
                    for (int var10 = 0; var10 < 10; var10++) {
                        System.gc();
                    }
                    int var11 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
                    class333.method2097(122, "Memory after cleanup=" + var11 + "k");
                    return;
                }
                if (arg0.equalsIgnoreCase("pcachesize")) {
                    class333.method2097(127, "Number of player models in cache:" + class42.method312(91));
                    return;
                }
                if (arg0.equalsIgnoreCase("clientdrop")) {
                    class333.method2097(123, "Dropped client connection");
                    if (class32.field515 == 9) {
                        class404.method2503((byte) -124);
                    } else if (class32.field515 == 10) {
                        class318.field5000 = true;
                        return;
                    }
                    return;
                }
                if (arg0.equalsIgnoreCase("clientjs5drop")) {
                    class78.field1366.method1564(-2);
                    class333.method2097(119, "Dropped client js5 net queue");
                    return;
                }
                if (arg0.equalsIgnoreCase("serverjs5drop")) {
                    class78.field1366.method1561(-86);
                    class333.method2097(119, "Dropped server js5 net queue");
                    return;
                }
                if (arg0.equalsIgnoreCase("breakcon")) {
                    class419.field6342.method2893(10000);
                    class463.field6886.method2797(5000);
                    class78.field1366.method1559(-29619);
                    class333.method2097(110, "Breaking new connections for 5 seconds");
                    return;
                }
                if (arg0.equalsIgnoreCase("rebuild")) {
                    class67.method434(-120);
                    class104.method714(-1);
                    class333.method2097(124, "Rebuilding map");
                    return;
                }
                if (arg0.equalsIgnoreCase("wm1")) {
                    class142.method1049(-1, 1, false, (byte) -101, -1);
                    if (class287.method1865((byte) 123) != 1) {
                        class333.method2097(114, "wm1 failed");
                        return;
                    }
                    class333.method2097(114, "wm1 succeeded");
                    return;
                }
                if (arg0.equalsIgnoreCase("wm2")) {
                    class142.method1049(-1, 2, false, (byte) -90, -1);
                    if (class287.method1865((byte) -92) != 2) {
                        class333.method2097(114, "wm2 failed");
                        return;
                    }
                    class333.method2097(119, "wm2 succeeded");
                    return;
                }
                if (arg0.equalsIgnoreCase("wm3")) {
                    class142.method1049(768, 3, false, (byte) -99, 1024);
                    if (class287.method1865((byte) -66) == 3) {
                        class333.method2097(126, "wm3 succeeded");
                        return;
                    }
                    class333.method2097(123, "wm3 failed");
                    return;
                }
                if (arg0.equalsIgnoreCase("tk0")) {
                    class86.method616(0, -6);
                    if (class511.field7485 != 0) {
                        class333.method2097(111, "Failed to enter tk0");
                        return;
                    }
                    class333.method2097(123, "Entered tk0");
                    class510.field7403.field5095 = 0;
                    class510.field7403.method1190(class419.field6342, false);
                    class40.field668 = false;
                    return;
                }
                if (arg0.equalsIgnoreCase("tk1")) {
                    class86.method616(1, -128);
                    if (class511.field7485 == 1) {
                        class333.method2097(117, "Entered tk1");
                        class510.field7403.field5095 = 1;
                        class510.field7403.method1190(class419.field6342, false);
                        class40.field668 = false;
                        return;
                    }
                    class333.method2097(121, "Failed to enter tk1");
                    return;
                }
                if (arg0.equalsIgnoreCase("tk2")) {
                    class86.method616(2, -126);
                    if (class511.field7485 != 2) {
                        class333.method2097(103, "Failed to enter tk2");
                        return;
                    }
                    class333.method2097(119, "Entered tk2");
                    class510.field7403.field5095 = 2;
                    class510.field7403.method1190(class419.field6342, false);
                    class40.field668 = false;
                    return;
                }
                if (arg0.equalsIgnoreCase("tk3")) {
                    class86.method616(3, -121);
                    if (class511.field7485 != 3) {
                        class333.method2097(111, "Failed to enter tk3");
                        return;
                    }
                    class333.method2097(115, "Entered tk3");
                    return;
                }
                if (arg0.equalsIgnoreCase("ot")) {
                    class510.field7403.field5096 = !class510.field7403.field5096;
                    class510.field7403.method1190(class419.field6342, false);
                    class40.field668 = false;
                    class67.method434(-71);
                    class333.method2097(124, "ot=" + class510.field7403.field5096);
                    return;
                }
                if (arg0.equalsIgnoreCase("gb")) {
                    class510.field7403.field5100 = !class510.field7403.field5100;
                    class510.field7403.method1190(class419.field6342, false);
                    class40.field668 = false;
                    class67.method434(-68);
                    class333.method2097(106, "gb=" + class510.field7403.field5100);
                    return;
                }
                if (arg0.startsWith("shadows")) {
                    if (arg0.length() < 8) {
                        class333.method2097(106, "Invalid shadows value");
                        return;
                    }
                    String var12 = arg0.substring(8);
                    int var13 = class516.method3051(var12, 10) ? class508.method2990(var12, 23403) : -1;
                    if (var13 >= 0 && var13 <= 2) {
                        class510.field7403.method2040(true, var13, class511.field7485);
                        class510.field7403.method1190(class419.field6342, false);
                        class40.field668 = false;
                        class67.method434(-78);
                        class333.method2097(119, "shadows=" + var13);
                        return;
                    }
                    class333.method2097(109, "Invalid shadows value");
                    return;
                }
                if (arg0.startsWith("textures")) {
                    class510.field7403.field5125 = !class510.field7403.field5125;
                    class510.field7403.method1190(class419.field6342, false);
                    class40.field668 = false;
                    class494.method2906(-5419);
                    class67.method434(-103);
                    class333.method2097(123, "textures=" + class510.field7403.field5125);
                    return;
                }
                if (arg0.startsWith("setba")) {
                    if (arg0.length() < 6) {
                        class333.method2097(110, "Invalid buildarea value");
                        return;
                    }
                    int var14 = class508.method2990(arg0.substring(6), 23403);
                    if (var14 >= 0 && class455.method2731((byte) -96, class101.field1668) >= var14) {
                        class510.field7403.field5104 = var14;
                        class510.field7403.method1190(class419.field6342, false);
                        class40.field668 = false;
                        class333.method2097(108, "maxbuildarea=" + class510.field7403.field5104);
                        return;
                    }
                    class333.method2097(112, "Invalid buildarea value");
                    return;
                }
                if (arg0.startsWith("setparticles")) {
                    if (arg0.length() < 13) {
                        class333.method2097(110, "Invalid particles value");
                        return;
                    }
                    class442.method2664(class508.method2990(arg0.substring(13), 23403), 0);
                    class510.field7403.method1190(class419.field6342, false);
                    class40.field668 = false;
                    class333.method2097(112, "particles=" + class39.method281(0));
                    return;
                }
                if (arg0.startsWith("rect_debug")) {
                    if (arg0.length() < 10) {
                        class333.method2097(110, "Invalid rect_debug value");
                        return;
                    }
                    class179.field2844 = class508.method2990(arg0.substring(10).trim(), 23403);
                    class333.method2097(114, "rect_debug=" + class179.field2844);
                    return;
                }
                if (arg0.equalsIgnoreCase("qa_op_test")) {
                    class494.field7214 = true;
                    class333.method2097(121, "qa_op_test=" + class494.field7214);
                    return;
                }
                if (arg0.equalsIgnoreCase("clipcomponents")) {
                    class290.field4724 = !class290.field4724;
                    class333.method2097(124, "clipcomponents=" + class290.field4724);
                    return;
                }
                if (arg0.startsWith("bloom")) {
                    boolean var15 = class305.field4873.method903();
                    if (!class277.method1825(!var15, (byte) 54)) {
                        class333.method2097(127, "Failed to enable bloom");
                        return;
                    }
                    if (var15) {
                        class333.method2097(108, "Bloom disabled");
                        return;
                    }
                    class333.method2097(125, "Bloom enabled");
                    return;
                }
                if (arg0.equalsIgnoreCase("tween")) {
                    if (!class230.field4004) {
                        class230.field4004 = true;
                        class333.method2097(127, "Forced tweening ENABLED!");
                        return;
                    }
                    class230.field4004 = false;
                    class333.method2097(110, "Forced tweening disabled.");
                    return;
                }
                if (arg0.equalsIgnoreCase("shiftclick")) {
                    if (!class529.field7782) {
                        class333.method2097(109, "Shift-click ENABLED!");
                        class529.field7782 = true;
                        return;
                    }
                    class333.method2097(103, "Shift-click disabled.");
                    class529.field7782 = false;
                    return;
                }
                if (arg0.equalsIgnoreCase("getcgcoord")) {
                    class333.method2097(105, "x:" + (class302.field4850.field4716 >> 7) + " z:" + (class302.field4850.field4714 >> 7));
                    return;
                }
                if (arg0.equalsIgnoreCase("getheight")) {
                    class333.method2097(119, "Height: " + class360.field5592[class302.field4850.field4720].method1516(class302.field4850.field4716 >> 7, class302.field4850.field4714 >> 7));
                    return;
                }
                if (arg0.equalsIgnoreCase("resetminimap")) {
                    class536.field7881.method2934(28963);
                    class536.field7881.method2932(0);
                    class272.field4515.method2001((byte) 0);
                    class94.field1585.method494((byte) 125);
                    class104.method714(-1);
                    class333.method2097(108, "Minimap reset");
                    return;
                }
                if (arg0.startsWith("mc")) {
                    if (!class305.field4873.method808()) {
                        class333.method2097(116, "Current toolkit doesn't support multiple cores");
                        return;
                    }
                    int var16 = Integer.parseInt(arg0.substring(3));
                    if (var16 < 1) {
                        var16 = 1;
                    } else if (var16 > 4) {
                        var16 = 4;
                    }
                    class307.field4890 = var16;
                    class305.field4873.method852(class307.field4890);
                    class305.field4873.method855(0);
                    class333.method2097(127, "Render cores now: " + class307.field4890);
                    return;
                }
                if (arg0.startsWith("cachespace")) {
                    class333.method2097(108, "I(s): " + class337.field5290.method1596(103) + "/" + class337.field5290.method1605((byte) 72));
                    class333.method2097(118, "I(m): " + class530.field7787.method1596(112) + "/" + class530.field7787.method1605((byte) 72));
                    class333.method2097(118, "O(s): " + class20.field218.field5399.method2056(14414) + "/" + class20.field218.field5399.method2060((byte) -117));
                    return;
                }
                if (arg0.equalsIgnoreCase("getcamerapos")) {
                    class333.method2097(121, "Pos: " + class302.field4850.field4720 + "," + ((class473.field7021 >> 7) + class16.field181 >> 6) + "," + ((class48.field764 >> 7) + class455.field6794 >> 6) + "," + ((class473.field7021 >> 7) + class16.field181 & 0x3F) + "," + ((class48.field764 >> 7) + class455.field6794 & 0x3F) + " Height: " + (class81.method592(class473.field7021, class48.field764, 9251, class302.field4850.field4720) - class130.field2234));
                    class333.method2097(102, "Look: " + class302.field4850.field4720 + "," + (class60.field922 + class16.field181 >> 6) + "," + (class455.field6794 + class407.field6188 >> 6) + "," + (class60.field922 + class16.field181 & 0x3F) + "," + (class455.field6794 + class407.field6188 & 0x3F) + " Height: " + (class81.method592(class60.field922, class407.field6188, 9251, class302.field4850.field4720) - class489.field7156));
                    return;
                }
                if (arg0.equals("showocc")) {
                    class205.field3245 = !class205.field3245;
                    class67.method434(-55);
                    class333.method2097(124, "showocc=" + class205.field3245);
                    return;
                }
                if (arg0.equals("wallocc")) {
                    class125.field2174 = !class125.field2174;
                    class67.method434(-99);
                    class333.method2097(109, "forcewallocc=" + class125.field2174);
                    return;
                }
                if (arg0.equals("renderprofile") || arg0.equals("rp")) {
                    class304.field4866 = !class304.field4866;
                    class305.field4873.method810(class304.field4866);
                    class213.method1399((byte) -87);
                    class333.method2097(123, "showprofiling=" + class304.field4866);
                    return;
                }
                if (arg0.equals("performancetest")) {
                    class333.method2097(113, "Java toolkit: " + class100.method691(0, false, class419.field6342));
                    class333.method2097(114, "GL toolkit:   " + class100.method691(1, false, class419.field6342));
                    class333.method2097(116, "SSE toolkit:  " + class100.method691(2, false, class419.field6342));
                    return;
                }
                if (arg0.equals("nonpcs")) {
                    class446.field6658 = !class446.field6658;
                    class333.method2097(110, "nonpcs=" + class446.field6658);
                    return;
                }
                if (arg0.equals("autoworld")) {
                    class76.method544(true);
                    class333.method2097(120, "auto world selected");
                    return;
                }
                if (arg0.startsWith("switchworld")) {
                    int var17 = Integer.parseInt(arg0.substring(12));
                    class463.method2761(var17, class313.method1987((byte) 116, var17).field4119, false);
                    class333.method2097(124, "switched");
                    return;
                }
                if (arg0.equals("getworld")) {
                    class333.method2097(104, "w: " + class244.field4183.field7139);
                    return;
                }
                if (arg0.startsWith("pc")) {
                    class265.method1775(-2, class484.field7109);
                    class261.field4357.method163(0, (byte) 49);
                    int var18 = class261.field4357.field301;
                    int var19 = arg0.indexOf(" ", 4);
                    class261.field4357.method145(arg0.substring(3, var19), (byte) 0);
                    class286.method1861(arg0.substring(var19), (byte) 53, class261.field4357);
                    class261.field4357.method140(class261.field4357.field301 - var18, true);
                    return;
                }
                if (arg0.equals("heap")) {
                    class333.method2097(110, "Heap: " + class101.field1668 + "MB");
                    return;
                }
                if (arg0.equals("savevarcs")) {
                    class249.method1687(false);
                    class333.method2097(118, "perm varcs saved");
                    return;
                }
                if (arg0.equals("scramblevarcs")) {
                    for (int var20 = 0; var20 < class77.field1320.length; var20++) {
                        if (class328.field5178[var20]) {
                            class77.field1320[var20] = (int) (Math.random() * 99999.0D);
                            if (Math.random() > 0.5D) {
                                class77.field1320[var20] *= -1;
                            }
                        }
                    }
                    class249.method1687(false);
                    class333.method2097(121, "perm varcs scrambled");
                    return;
                }
                if (arg0.equals("showcolmap")) {
                    class489.field7157 = true;
                    class104.method714(-1);
                    class333.method2097(107, "colmap is shown");
                    return;
                }
                if (arg0.equals("hidecolmap")) {
                    class489.field7157 = false;
                    class104.method714(-1);
                    class333.method2097(102, "colmap is hidden");
                    return;
                }
                if (arg0.equals("resetcache")) {
                    class416.method2565((byte) -49);
                    class333.method2097(122, "Caches reset");
                    return;
                }
                if (arg0.equals("profilecpu")) {
                    class333.method2097(115, class306.method1953(-95) + "ms");
                    return;
                }
                if (arg0.startsWith("cpuusage")) {
                    int var21 = Integer.parseInt(arg0.substring(9));
                    if (var21 >= 0 && var21 <= 4) {
                        class510.field7403.field5114 = var21;
                    }
                    class333.method2097(120, "cpuusage=" + class510.field7403.field5114);
                    return;
                }
                if (arg0.startsWith("getclientvarpbit")) {
                    int var22 = Integer.parseInt(arg0.substring(17));
                    class333.method2097(106, "varpbit=" + class327.field5160.method1886(var22, (byte) -120));
                    return;
                }
                if (arg0.startsWith("getclientvarp")) {
                    int var23 = Integer.parseInt(arg0.substring(14));
                    class333.method2097(105, "varp=" + class327.field5160.method1887(-1719, var23));
                    return;
                }
                if (arg0.startsWith("demologin")) {
                    class525.method3103(-1, false, 0);
                    return;
                }
                if (arg0.startsWith("newdemologin")) {
                    class525.method3103(-1, true, 0);
                    return;
                }
                if (arg0.startsWith("directlogin")) {
                    String[] var24 = class241.method1661(' ', -20326, arg0.substring(12));
                    if (var24.length >= 2) {
                        int var25 = var24.length > 2 ? Integer.parseInt(var24[2]) : 0;
                        class207.method1355(var24[1], (byte) -127, var24[0], var25);
                        return;
                    }
                }
                if (arg0.startsWith("csprofileclear")) {
                    class521.method3070();
                    return;
                }
                if (arg0.startsWith("csprofileoutputc")) {
                    class521.method3076(100, false);
                    return;
                }
                if (arg0.startsWith("csprofileoutputt")) {
                    class521.method3076(10, true);
                    return;
                }
                if (arg0.startsWith("texsize")) {
                    int var26 = Integer.parseInt(arg0.substring(8));
                    class305.field4873.method897(var26);
                    return;
                }
                if (arg0.equals("soundstreamcount")) {
                    class333.method2097(123, "Active streams: " + class510.field7455.method1736());
                    return;
                }
                if (class32.field515 == 9) {
                    class328.field5164++;
                    class265.method1775(-2, class110.field1940);
                    class261.field4357.method163(arg0.length() + 3, (byte) 49);
                    class261.field4357.method163(arg1 ? 1 : 0, (byte) 49);
                    class261.field4357.method163(arg3 ? 1 : 0, (byte) 49);
                    class261.field4357.method145(arg0, (byte) 0);
                }
                if (arg0.startsWith("fps ") && class255.field4320 != class180.field2857) {
                    class326.method2046(-18767, class508.method2990(arg0.substring(4), 23403));
                    return;
                }
                if (class32.field515 != 9) {
                    class333.method2097(125, "Unrecogonised commmand when not logged in: " + arg0);
                }
            } catch (Exception var28) {
                class333.method2097(122, "Whoops, something went wrong.");
            }
        }
        if (arg2 <= 95) {
            method2027(null, null, null, null, -47);
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)V", line = 893)
    public static void method2030(int arg0) {
        field5042 = null;
        field5025 = null;
        field5039 = null;
        field5043 = null;
        if (arg0 < 59) {
            method2031(false);
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Z)V", line = 916)
    public static final void method2031(boolean arg0) {
        field5031++;
        if (class266.field4460 == 0) {
            return;
        }
        try {
            if ((++class156.field2529) > 2000) {
                if (class463.field6886 != null) {
                    class463.field6886.method2804(!arg0);
                    class463.field6886 = null;
                }
                if (class398.field6086 >= 1) {
                    class266.field4460 = 0;
                    class23.field311 = -5;
                    return;
                }
                class269.field4484.field7138 = !class269.field4484.field7138;
                class156.field2529 = 0;
                class398.field6086++;
                class266.field4460 = 1;
            }
            if (class266.field4460 == 1) {
                class359.field5583 = class419.field6342.method2887(class269.field4484.method2847(13101), (byte) 112, class269.field4484.field7133);
                class266.field4460 = 2;
            }
            if (class266.field4460 == 2) {
                if (class359.field5583.field2692 == 2) {
                    throw new IOException();
                }
                if (class359.field5583.field2692 != 1) {
                    return;
                }
                class463.field6886 = new class473((Socket) class359.field5583.field2695, class419.field6342);
                class359.field5583 = null;
                class463.field6886.method2795(0, class261.field4357.field301, (byte) 14, class261.field4357.field302);
                class526.method3121((byte) -5);
                int var1 = class463.field6886.method2799((byte) 74);
                class526.method3121((byte) -5);
                if (var1 != 21) {
                    class266.field4460 = 0;
                    class23.field311 = var1;
                    class463.field6886.method2804(true);
                    class463.field6886 = null;
                    return;
                }
                class266.field4460 = 3;
            }
            if (class266.field4460 == 3) {
                if (class463.field6886.method2803((byte) -118) < 1) {
                    return;
                }
                class40.field669 = new String[class463.field6886.method2799((byte) 74)];
                class266.field4460 = 4;
            }
            if (class266.field4460 == 4) {
                if (class463.field6886.method2803((byte) -119) < class40.field669.length * 8) {
                    return;
                }
                class506.field7365.field301 = 0;
                class463.field6886.method2794(118, 0, class506.field7365.field302, class40.field669.length * 8);
                for (int var2 = 0; var2 < class40.field669.length; var2++) {
                    class40.field669[var2] = class462.method2753(class506.field7365.method117(-78), 22585);
                }
                class266.field4460 = 0;
                class23.field311 = 21;
                class463.field6886.method2804(true);
                class463.field6886 = null;
                return;
            }
        } catch (IOException var3) {
            if (class463.field6886 != null) {
                class463.field6886.method2804(!arg0);
                class463.field6886 = null;
            }
            if (class398.field6086 >= 1) {
                class23.field311 = -4;
                class266.field4460 = 0;
            } else {
                class156.field2529 = 0;
                class266.field4460 = 1;
                class269.field4484.field7138 = !class269.field4484.field7138;
                class398.field6086++;
            }
        }
        if (arg0) {
            field5018 = 108;
        }
    }
}
