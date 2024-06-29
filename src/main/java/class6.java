import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class6 extends class115 {

    @OriginalMember(owner = "client!to", name = "N", descriptor = "[I")
    public static int[] field67 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!to", name = "U", descriptor = "I")
    public static int field74 = 1;

    @OriginalMember(owner = "client!to", name = "R", descriptor = "I")
    public static int field71 = 0;

    @OriginalMember(owner = "client!to", name = "K", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!to", name = "L", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!to", name = "O", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!to", name = "P", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!to", name = "S", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!to", name = "T", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!to", name = "V", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!to", name = "W", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!to", name = "X", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!to", name = "Y", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!to", name = "J", descriptor = "Lra;")
    public static class57 field64;

    @OriginalMember(owner = "client!to", name = "Q", descriptor = "Lra;")
    public static class57 field70;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(II[Ljf;)V")
    public static final void method55(int arg0, int arg1, class119[] arg2) {
        ++field68;
        for (int var3 = arg1; ~var3 > ~arg2.length; ++var3) {
            class119 var4 = arg2[var3];
            if (var4 != null && var4.field1529 == arg0 && (!var4.field1475 || !client.method1074(var4))) {
                if (var4.field1535 == 0) {
                    if (!var4.field1475 && client.method1074(var4) && class193.field2639 != var4) {
                        continue;
                    }
                    method55(var4.field1424, arg1, arg2);
                    if (var4.field1460 != null) {
                        method55(var4.field1424, 0, var4.field1460);
                    }
                    class201 var5 = (class201) class396.field5783.method1204((byte) -68, (long) var4.field1424);
                    if (var5 != null) {
                        class153.method917(~arg1, var5.field2776);
                    }
                }
                if (~var4.field1535 == -7) {
                    if (~var4.field1441 != 0 || ~var4.field1539 != 0) {
                        boolean var6 = class366.method2317(2, var4);
                        int var7;
                        if (!var6) {
                            var7 = var4.field1441;
                        } else {
                            var7 = var4.field1539;
                        }
                        if (var7 != -1) {
                            class182 var8 = class437.method2717(var7, (byte) -103);
                            if (var8 != null) {
                                var4.field1447 += class245.field3329;
                                while (var8.field2513[var4.field1561] < var4.field1447) {
                                    var4.field1447 -= var8.field2513[var4.field1561];
                                    ++var4.field1561;
                                    if (~var8.field2493.length >= ~var4.field1561) {
                                        var4.field1561 -= var8.field2510;
                                        if (~var4.field1561 > -1 || ~var4.field1561 <= ~var8.field2493.length) {
                                            var4.field1561 = 0;
                                        }
                                    }
                                    var4.field1470 = var4.field1561 + 1;
                                    if (var4.field1470 >= var8.field2493.length) {
                                        var4.field1470 -= var8.field2510;
                                        if (~var4.field1470 > -1 || ~var8.field2493.length >= ~var4.field1470) {
                                            var4.field1470 = -1;
                                        }
                                    }
                                    class101.method543((byte) -104, var4);
                                }
                            }
                        }
                    }
                    if (var4.field1576 != 0 && !var4.field1475) {
                        int var9 = var4.field1576 >> 16;
                        int var10 = var4.field1576 << 16 >> 16;
                        int var11 = class245.field3329 * var9;
                        var4.field1439 = var4.field1439 + var11 & 16383;
                        int var12 = class245.field3329 * var10;
                        var4.field1522 = var4.field1522 + var12 & 16383;
                        class101.method543((byte) -85, var4);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Z)V")
    public static void method56(boolean arg0) {
        field64 = null;
        if (arg0) {
            field67 = null;
            field70 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "()V")
    public class6() {
        super(0, true);
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(II)[I")
    public final int[] method57(int arg0, int arg1) {
        ++field77;
        int[] var3 = super.field1340.method14(66, arg0);
        if (super.field1340.field35) {
            class408.method2569(var3, 0, class218.field2979, class193.field2634[arg0]);
        }
        if (arg1 != 0) {
            method62((byte) 76);
        }
        return var3;
    }

    @OriginalMember(owner = "client!to", name = "h", descriptor = "(I)V")
    public static final void method58(int arg0) {
        ++field66;
        class114.field1320 = true;
        if (arg0 > -97) {
            field74 = 120;
        }
    }

    @OriginalMember(owner = "client!to", name = "c", descriptor = "(II)I")
    public static final int method59(int arg0, int arg1) {
        ++field75;
        double var2 = (double) (255 & arg0 >> 16) / 256.0D;
        double var4 = (double) (255 & arg0 >> 8) / 256.0D;
        double var6 = (double) (255 & arg0) / 256.0D;
        double var8 = var2;
        if (var4 < var2) {
            var8 = var4;
        }
        if (arg1 != -27643) {
            field64 = null;
        }
        if (var8 > var6) {
            var8 = var6;
        }
        double var10 = var2;
        if (var2 < var4) {
            var10 = var4;
        }
        if (var6 > var10) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (-var8 + var10) / (var8 + var10);
            }
            if (var2 != var10) {
                if (var4 == var10) {
                    var12 = (-var2 + var6) / (var10 - var8) + 2.0D;
                } else if (var6 == var10) {
                    var12 = (-var4 + var2) / (-var8 + var10) + 4.0D;
                }
            } else {
                var12 = (-var6 + var4) / (var10 - var8);
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (-var10 + 2.0D - var8);
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        int var22 = (int) (var16 * 256.0D);
        if (var21 >= 0) {
            if (~var21 < -256) {
                var21 = 255;
            }
        } else {
            var21 = 0;
        }
        if (var22 < 0) {
            var22 = 0;
        } else if (~var22 < -256) {
            var22 = 255;
        }
        if (var22 > 243) {
            var21 >>= 4;
        } else if (~var22 >= -218) {
            if (var22 > 192) {
                var21 >>= 2;
            } else if (~var22 < -180) {
                var21 >>= 1;
            }
        } else {
            var21 >>= 3;
        }
        return (var22 >> 1) + ((var20 & 255) >> 2 << 10) + (var21 >> 5 << 7);
    }

    @OriginalMember(owner = "client!to", name = "e", descriptor = "(B)V")
    public static final void method60(byte arg0) {
        if (class330.field4719 != null) {
            class330.field4719.method1503(false);
            class330.field4719 = null;
        }
        ++field76;
        class308.method1926((byte) -91);
        class56.method322();
        for (int var1 = 0; ~var1 > -5; ++var1) {
            class54.field613[var1].method240((byte) -103);
        }
        class193.method1236(4079, false);
        System.gc();
        class195.method1239(false, 2);
        class423.field6072 = -1;
        class343.field5049 = false;
        class81.method452(true, 0);
        class40.field427 = 0;
        class150.field2108 = false;
        class426.field6175 = 0;
        class217.field2975 = 0;
        class367.field5357 = 0;
        for (int var2 = 0; class286.field4039.length > var2; ++var2) {
            class286.field4039[var2] = null;
        }
        class426.field6168 = 0;
        class148.field2082 = 0;
        for (int var3 = 0; ~var3 > -2049; ++var3) {
            class375.field5473[var3] = null;
            class138.field1965[var3] = null;
        }
        for (int var4 = 0; ~var4 > -32769; ++var4) {
            class81.field917[var4] = null;
        }
        if (arg0 > -67) {
            method60((byte) 83);
        }
        class319.field4527.method1206(-48);
        class113.method623(false);
        class164.field2292 = 0;
        class54.method317((byte) 8);
        class105.method569(2659);
        class433.method2695(0);
        class77.method435((byte) 14, true);
        try {
            class250.method1569("loggedout", class323.field4554.field5559, 18050);
        } catch (Throwable var5) {
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(BLen;)V")
    public static final void method61(byte arg0, class174 arg1) {
        ++field73;
        arg1.method968(0, 0, class38.field389, 350);
        arg1.method995(0, 0, class38.field389, 350, class192.field2627 << 24 | 3351159, 1);
        int var2 = 0;
        if (arg0 == -22) {
            while (var2 < 100) {
                int var4 = class356.field5206[var2];
                int var5 = class48.field560[var2];
                arg1.method995(var4, var5, 2, 2, class447.field6515[var2] << 24 | 16777215, 1);
                ++var2;
            }
            for (int var3 = 0; ~class133.field1857.length < ~var3; ++var3) {
                class2.field20.method1245(-16777216, -class315.field4487 + 350 + -class1.field1.field3906 + -2 + -(class7.field89 * var3), class133.field1857[var3], true, -1, 10);
            }
            arg1.method1146(-1, (byte) 60, 350 - class315.field4487, class38.field389, 0);
            class287.field4059.method1245(-16777216, -class268.field3775.field3906 + 349, "--> " + class400.field5813 + "*", true, -1, 10);
        }
    }

    @OriginalMember(owner = "client!to", name = "f", descriptor = "(B)V")
    public static final void method62(byte arg0) {
        ++field78;
        class151.method903(class218.field2991, (long) class221.field3033, 0);
        if (arg0 > 116) {
            if (~class424.field6086 != 0) {
                class153.method917(-1, class424.field6086);
            }
            for (int var1 = 0; ~var1 > ~class262.field3646; ++var1) {
                if (class266.field3723[var1]) {
                    class270.field3817[var1] = true;
                }
                class350.field5115[var1] = class266.field3723[var1];
                class266.field3723[var1] = false;
            }
            class216.field2933 = class221.field3033;
            if (class218.field2991.method996()) {
                class269.field3789 = true;
            }
            class66.field753 = null;
            if (~class424.field6086 != 0) {
                class262.field3646 = 0;
                class334.method2152(-111);
            }
            class218.field2991.method957();
            class326.method2009(class225.field3076, (byte) -37);
            class245.field3329 = 0;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IZLjava/lang/String;)V")
    public static final void method63(int arg0, boolean arg1, String arg2) {
        if (arg0 != -11) {
            field74 = -8;
        }
        ++field69;
        if (~class213.field2908 != -1 || class56.field642 >= 2) {
            try {
                if (arg2.equalsIgnoreCase("fpson")) {
                    class101.field1139 = true;
                }
                if (arg2.equalsIgnoreCase("fpsoff")) {
                    class101.field1139 = false;
                }
                if (arg2.equalsIgnoreCase("cleartext")) {
                    class247.field3356.method1610(true);
                }
                if (arg2.equalsIgnoreCase("gc")) {
                    class43.method275((byte) -119);
                    for (int var3 = 0; ~var3 > -11; ++var3) {
                        System.gc();
                    }
                    Runtime var4 = Runtime.getRuntime();
                    int var5 = (int) ((var4.totalMemory() + -var4.freeMemory()) / 1024L);
                    class400.method2531("mem=" + var5 + "k", (byte) 90);
                }
                if (arg2.equalsIgnoreCase("compact")) {
                    class43.method275((byte) -119);
                    for (int var6 = 0; var6 < 10; ++var6) {
                        System.gc();
                    }
                    Runtime var7 = Runtime.getRuntime();
                    int var8 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                    class400.method2531("Memory before cleanup=" + var8 + "k", (byte) 84);
                    class236.method1507(true);
                    class43.method275((byte) -119);
                    for (int var9 = 0; ~var9 > -11; ++var9) {
                        System.gc();
                    }
                    int var10 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                    class400.method2531("Memory after cleanup=" + var10 + "k", (byte) 83);
                }
                if (arg2.equalsIgnoreCase("pcachesize")) {
                    class400.method2531("Number of player models in cache:" + class386.method2468(24484), (byte) 68);
                }
                if (arg2.equalsIgnoreCase("clientdrop")) {
                    class450.method2801(true);
                }
                if (arg2.equalsIgnoreCase("clientjs5drop")) {
                    class355.field5204.method1419((byte) -79);
                }
                if (arg2.equalsIgnoreCase("serverjs5drop")) {
                    class355.field5204.method1408(true);
                }
                if (arg2.equalsIgnoreCase("breakcon")) {
                    class323.field4554.method2399(false);
                    class330.field4719.method1505(-117);
                    class355.field5204.method1418(false);
                }
                if (arg2.equalsIgnoreCase("rebuild")) {
                    class115.method632(arg0 ^ 41);
                    class418.method2599((byte) 118);
                }
                if (arg2.equalsIgnoreCase("wm1")) {
                    class175.method1158(-1, -1, -1, 1, false);
                }
                if (arg2.equalsIgnoreCase("wm2")) {
                    class175.method1158(-1, arg0 ^ 10, -1, 2, false);
                }
                if (arg2.equalsIgnoreCase("::wm3")) {
                    class175.method1158(1024, -1, 768, 3, false);
                }
                if (arg2.equalsIgnoreCase("tk0")) {
                    client.method1065((byte) -77, 0);
                    class264.field3709 = 0;
                    class193.method1232(27875, class323.field4554);
                    class174.field2418 = false;
                }
                if (arg2.equalsIgnoreCase("tk1")) {
                    client.method1065((byte) -77, 1);
                    class264.field3709 = 1;
                    class193.method1232(27875, class323.field4554);
                    class174.field2418 = false;
                }
                if (arg2.equalsIgnoreCase("tk2")) {
                    client.method1065((byte) -77, 2);
                    class264.field3709 = 2;
                    class193.method1232(27875, class323.field4554);
                    class174.field2418 = false;
                }
                if (arg2.equalsIgnoreCase("tk3")) {
                    client.method1065((byte) -77, 3);
                }
                if (arg2.equalsIgnoreCase("ot")) {
                    class420.field6046 = !class420.field6046;
                    class193.method1232(27875, class323.field4554);
                    class174.field2418 = false;
                    class115.method632(arg0 + -61);
                }
                if (arg2.equalsIgnoreCase("gb")) {
                    class436.field6388 = !class436.field6388;
                    class193.method1232(arg0 + 27886, class323.field4554);
                    class174.field2418 = false;
                    class115.method632(-59);
                }
                if (arg2.startsWith("shadows ")) {
                    class341.field5022 = class99.method531(arg2.substring(8), (byte) 127);
                    class193.method1232(arg0 + 27886, class323.field4554);
                    class174.field2418 = false;
                    class115.method632(arg0 + 138);
                }
                if (arg2.startsWith("setba")) {
                    class169.field2373 = class99.method531(arg2.substring(6), (byte) 116);
                    class193.method1232(27875, class323.field4554);
                    class174.field2418 = false;
                }
                if (arg2.startsWith("setparticles")) {
                    class119.method680(class99.method531(arg2.substring(13), (byte) -24), arg0 ^ -9);
                    class193.method1232(27875, class323.field4554);
                    class174.field2418 = false;
                }
                if (arg2.startsWith("fps ") && class213.field2908 != 0) {
                    class433.method2680(83, class99.method531(arg2.substring(4), (byte) 123));
                }
                if (arg2.equalsIgnoreCase("errortest")) {
                    throw new RuntimeException();
                }
                if (arg2.startsWith("rect_debug")) {
                    class19.field195 = class99.method531(arg2.substring(10).trim(), (byte) -33);
                    class400.method2531("rect_debug=" + class19.field195, (byte) -85);
                }
                if (arg2.equalsIgnoreCase("qa_op_test")) {
                    class267.field3764 = true;
                }
                if (arg2.equalsIgnoreCase("clipcomponents")) {
                    class308.field4408 = !class308.field4408;
                    class400.method2531("clipcomponents=" + class308.field4408, (byte) -82);
                }
                if (arg2.startsWith("bloom")) {
                    boolean var11 = class218.field2991.method925();
                    if (class262.method1644(arg0 + 13, !var11)) {
                        if (var11) {
                            class400.method2531("Bloom disabled", (byte) 43);
                        } else {
                            class400.method2531("Bloom enabled", (byte) 42);
                        }
                    } else {
                        class400.method2531("Failed to enable bloom", (byte) -51);
                    }
                }
                if (arg2.equalsIgnoreCase("tween")) {
                    if (!class98.field1105) {
                        class98.field1105 = true;
                        class400.method2531("Forced tweening ENABLED!", (byte) -125);
                    } else {
                        class98.field1105 = false;
                        class400.method2531("Forced tweening disabled.", (byte) 108);
                    }
                }
                if (arg2.equalsIgnoreCase("shiftclick")) {
                    if (!class406.field5900) {
                        class400.method2531("Shift-click ENABLED!", (byte) -57);
                        class406.field5900 = true;
                    } else {
                        class400.method2531("Shift-click disabled.", (byte) 54);
                        class406.field5900 = false;
                    }
                }
                if (arg2.equalsIgnoreCase("getcgcoord")) {
                    class400.method2531("x:" + (class390.field5715.field1304 >> 7) + " z:" + (class390.field5715.field1311 >> 7), (byte) -56);
                }
                if (arg2.equalsIgnoreCase("getheight")) {
                    class400.method2531("Height: " + class132.field1814[class410.field5931].method1990(class390.field5715.field1304 >> 7, class390.field5715.field1311 >> 7), (byte) -104);
                }
                if (arg2.equalsIgnoreCase("resetminimap")) {
                    class92.field1012.method349(104);
                    class92.field1012.method338(-110);
                    class424.method2626((byte) 23);
                    class418.method2599((byte) 118);
                }
                if (arg2.startsWith("mc")) {
                    if (class218.field2991.method940()) {
                        int var12 = Integer.parseInt(arg2.substring(3));
                        if (~var12 > -2) {
                            var12 = 1;
                        } else if (~var12 < -5) {
                            var12 = 4;
                        }
                        class404.field5887 = var12;
                        class218.field2991.method952(class404.field5887);
                        class218.field2991.method985(0);
                        class400.method2531("Render cores now: " + class404.field5887, (byte) -63);
                    } else {
                        class400.method2531("Current toolkit doesn't support multiple cores", (byte) 91);
                    }
                }
                if (arg2.startsWith("cachespace")) {
                    class400.method2531("I(s): " + class412.field5955.method2041(0) + "/" + class412.field5955.method2047(67), (byte) 88);
                    class400.method2531("I(m): " + class396.field5782.method2041(arg0 + 11) + "/" + class396.field5782.method2047(84), (byte) -113);
                    class400.method2531("O(s): " + class134.field1864.method883(1001) + "/" + class134.field1864.method882(true), (byte) 89);
                }
                if (arg2.equalsIgnoreCase("getcamerapos")) {
                    class400.method2531("Pos: " + class410.field5931 + "," + ((class272.field3853 >> 7) + class40.field427 >> 6) + "," + ((class272.field3852 >> 7) + class217.field2975 >> 6) + "," + (63 & (class272.field3853 >> 7) + class40.field427) + "," + (63 & (class272.field3852 >> 7) - -class217.field2975) + " Height: " + (class372.method2335(class272.field3852, class410.field5931, (byte) 61, class272.field3853) + -class164.field2289), (byte) -49);
                    class400.method2531("Look: " + class410.field5931 + "," + (class40.field427 + class188.field2548 >> 6) + "," + (class269.field3784 + class217.field2975 >> 6) + "," + (63 & class188.field2548 - -class40.field427) + "," + (class269.field3784 + class217.field2975 & 63) + " Height: " + (class372.method2335(class269.field3784, class410.field5931, (byte) 50, class188.field2548) + -class41.field465), (byte) -78);
                }
                if (arg2.equals("showocc")) {
                    class267.field3755 = !class267.field3755;
                    class115.method632(-102);
                }
                if (arg2.equals("renderprofile") || arg2.equals("rp")) {
                    class159.field2265 = !class159.field2265;
                    class218.field2991.method945(class159.field2265);
                    class331.method2045((byte) 125);
                }
                if (arg2.equals("nonpcs")) {
                    class400.field5815 = !class400.field5815;
                }
                if (arg2.equals("autoworld")) {
                    class344.method2206((byte) -114);
                }
                if (arg2.equals("heap")) {
                    class400.method2531("Heap: " + class343.field5053 + "MB", (byte) 72);
                }
                if (arg2.equals("savevarcs")) {
                    class308.method1927((byte) -92);
                }
                if (arg2.equals("scramblevarcs")) {
                    for (int var13 = 0; ~class160.field2272.length < ~var13; ++var13) {
                        if (class148.field2087[var13]) {
                            class160.field2272[var13] = (int) (99999.0D * Math.random());
                            if (Math.random() > 0.5D) {
                                class160.field2272[var13] *= -1;
                            }
                        }
                    }
                    class308.method1927((byte) -101);
                }
                if (arg2.equals("showcolmap")) {
                    class56.field643 = true;
                    class418.method2599((byte) 118);
                }
                if (arg2.equals("hidecolmap")) {
                    class56.field643 = false;
                    class418.method2599((byte) 118);
                }
                if (arg2.equals("resetcache")) {
                    class308.method1926((byte) -125);
                }
                if (arg2.equals("profilecpu")) {
                    class400.method2531(class262.method1649((byte) -1) + "ms", (byte) 126);
                }
                if (class105.field1191 == 30) {
                    class169.field2360.method809(134, -28022);
                    ++class148.field2075;
                    class169.field2360.method1396(21375, arg2.length() - -2);
                    class169.field2360.method1396(arg0 + 21386, arg1 ? 1 : 0);
                    class169.field2360.method1359((byte) 0, arg2);
                    return;
                }
            } catch (Exception var14) {
                class400.method2531("Whoops, something went wrong.", (byte) -110);
                return;
            }
        }
    }
}
