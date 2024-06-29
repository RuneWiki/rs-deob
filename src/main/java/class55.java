import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class55 extends class270 {

    @OriginalMember(owner = "client!va", name = "G", descriptor = "I")
    private int field881 = 409;

    @OriginalMember(owner = "client!va", name = "K", descriptor = "I")
    private int field885 = 4096;

    @OriginalMember(owner = "client!va", name = "O", descriptor = "[I")
    private int[] field889 = new int[3];

    @OriginalMember(owner = "client!va", name = "P", descriptor = "I")
    private int field890 = 4096;

    @OriginalMember(owner = "client!va", name = "Q", descriptor = "I")
    private int field891 = 4096;

    @OriginalMember(owner = "client!va", name = "J", descriptor = "I")
    public static int field884 = 0;

    @OriginalMember(owner = "client!va", name = "R", descriptor = "[Ljava/lang/String;")
    public static String[] field892 = new String[8];

    @OriginalMember(owner = "client!va", name = "H", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!va", name = "I", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!va", name = "L", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!va", name = "M", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!va", name = "N", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!va", name = "S", descriptor = "Ljava/lang/String;")
    public static String field893;

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V", line = 176)
    public class55() {
        super(1, false);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ZI)[[I", line = 13)
    public final int[][] method123(boolean arg0, int arg1) {
        ++field887;
        int[][] var3 = super.field4046.method244(arg1, 121);
        if (!arg0) {
            method434((byte) -46);
        }
        if (super.field4046.field488) {
            int[][] var4 = this.method1930(arg1, 0, (byte) -75);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class161.field2445 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field889[0] + var12;
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (~this.field881 > ~var13) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field889[1] + var14;
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (~var15 < ~this.field881) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = var16 - this.field889[2];
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (~var17 < ~this.field881) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field890 * var12 >> 12;
                            var9[var11] = this.field891 * var14 >> 12;
                            var10[var11] = this.field885 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BLec;I)V", line = 109)
    public final void method78(byte arg0, class37 arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (~arg2 == -5) {
                            int var5 = arg1.method295(true);
                            this.field889[0] = class35.method254(var5, 16711680) << 4;
                            this.field889[1] = class35.method254(var5 >> 4, 4080);
                            this.field889[2] = class35.method254(0, var5 >> 12);
                        }
                    } else {
                        this.field890 = arg1.method320((byte) -87);
                    }
                } else {
                    this.field891 = arg1.method320((byte) -87);
                }
            } else {
                this.field885 = arg1.method320((byte) -87);
            }
        } else {
            this.field881 = arg1.method320((byte) -87);
        }
        if (arg0 != 108) {
            this.field890 = 69;
        }
        ++field888;
    }

    @OriginalMember(owner = "client!va", name = "e", descriptor = "(B)V", line = 180)
    public static final void method434(byte arg0) {
        ++field883;
        if (class157.field2389 != null) {
            class157.field2389.method2255(false);
        }
        if (arg0 > 41) {
            if (class91.field1446 != null) {
                class91.field1446.method2255(false);
            }
            class292.method2040(2, 22050, -114, class59.field946);
            class157.field2389 = class78.method609(22050, class188.field2783, 0, true, class33.field475);
            class157.field2389.method2253(class255.field3690, (byte) -22);
            class91.field1446 = class78.method609(2048, class188.field2783, 1, true, class33.field475);
            class91.field1446.method2253(class220.field3275, (byte) -22);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ILjava/lang/String;Z)V", line = 201)
    public static final void method435(int arg0, String arg1, boolean arg2) {
        if (arg0 != 1) {
            method438(-117);
        }
        ++field886;
        if (~class360.field5124 != -1 || ~class289.field4315 <= -3) {
            try {
                if (arg1.equalsIgnoreCase("fpson")) {
                    class153.field2337 = true;
                }
                if (arg1.equalsIgnoreCase("fpsoff")) {
                    class153.field2337 = false;
                }
                if (arg1.equalsIgnoreCase("cleartext")) {
                    class61.field981.method2494(0);
                }
                if (arg1.equalsIgnoreCase("gc")) {
                    class444.method2772(124);
                    for (int var3 = 0; var3 < 10; ++var3) {
                        System.gc();
                    }
                    Runtime var4 = Runtime.getRuntime();
                    int var5 = (int) ((var4.totalMemory() + -var4.freeMemory()) / 1024L);
                    class319.method2135("mem=" + var5 + "k", (byte) -86);
                }
                if (arg1.equalsIgnoreCase("compact")) {
                    class444.method2772(120);
                    for (int var6 = 0; var6 < 10; ++var6) {
                        System.gc();
                    }
                    Runtime var7 = Runtime.getRuntime();
                    int var8 = (int) ((var7.totalMemory() + -var7.freeMemory()) / 1024L);
                    class319.method2135("Memory before cleanup=" + var8 + "k", (byte) -119);
                    class371.method2360(2857);
                    class444.method2772(122);
                    for (int var9 = 0; var9 < 10; ++var9) {
                        System.gc();
                    }
                    int var10 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                    class319.method2135("Memory after cleanup=" + var10 + "k", (byte) 61);
                }
                if (arg1.equalsIgnoreCase("pcachesize")) {
                    class319.method2135("Number of player models in cache:" + class254.method1835(arg0 ^ -64), (byte) -99);
                }
                if (arg1.equalsIgnoreCase("clientdrop")) {
                    class44.method355((byte) 118);
                }
                if (arg1.equalsIgnoreCase("clientjs5drop")) {
                    class123.field1951.method2568(30000);
                }
                if (arg1.equalsIgnoreCase("serverjs5drop")) {
                    class123.field1951.method2566((byte) -13);
                }
                if (arg1.equalsIgnoreCase("breakcon")) {
                    class188.field2783.method1390(69);
                    class124.field2028.method1657((byte) 64);
                    class123.field1951.method2561(false);
                }
                if (arg1.equalsIgnoreCase("rebuild")) {
                    class64.method493(118);
                    class105.method934((byte) -13);
                }
                if (arg1.equalsIgnoreCase("wm1")) {
                    class211.method1616(false, -1, 1, arg0 + -119, -1);
                }
                if (arg1.equalsIgnoreCase("wm2")) {
                    class211.method1616(false, -1, 2, -114, -1);
                }
                if (arg1.equalsIgnoreCase("::wm3")) {
                    class211.method1616(false, 1024, 3, -39, 768);
                }
                if (arg1.equalsIgnoreCase("tk0")) {
                    class322.method2145(0, false);
                    class230.field3364 = 0;
                    class119.method1002(0, class188.field2783);
                    class196.field2870 = false;
                }
                if (arg1.equalsIgnoreCase("tk1")) {
                    class322.method2145(1, false);
                    class230.field3364 = 1;
                    class119.method1002(0, class188.field2783);
                    class196.field2870 = false;
                }
                if (arg1.equalsIgnoreCase("tk2")) {
                    class322.method2145(2, false);
                    class230.field3364 = 2;
                    class119.method1002(0, class188.field2783);
                    class196.field2870 = false;
                }
                if (arg1.equalsIgnoreCase("tk3")) {
                    class322.method2145(3, false);
                }
                if (arg1.equalsIgnoreCase("ot")) {
                    class280.field4196 = !class280.field4196;
                    class119.method1002(arg0 ^ 1, class188.field2783);
                    class196.field2870 = false;
                    class64.method493(arg0 + 126);
                }
                if (arg1.equalsIgnoreCase("gb")) {
                    class33.field476 = !class33.field476;
                    class119.method1002(0, class188.field2783);
                    class196.field2870 = false;
                    class64.method493(arg0 + 123);
                }
                if (arg1.startsWith("shadows ")) {
                    class238.field3438 = class36.method259(arg1.substring(8), (byte) 126);
                    class119.method1002(0, class188.field2783);
                    class196.field2870 = false;
                    class64.method493(123);
                }
                if (arg1.startsWith("setba")) {
                    class436.field6356 = class36.method259(arg1.substring(6), (byte) 117);
                    class119.method1002(0, class188.field2783);
                    class196.field2870 = false;
                }
                if (arg1.startsWith("setparticles")) {
                    class447.method2796(class36.method259(arg1.substring(13), (byte) 111), -106);
                    class119.method1002(0, class188.field2783);
                    class196.field2870 = false;
                }
                if (arg1.startsWith("fps ") && class360.field5124 != 0) {
                    class273.method1954(arg0 + 27949, class36.method259(arg1.substring(4), (byte) 112));
                }
                if (arg1.equalsIgnoreCase("errortest")) {
                    throw new RuntimeException();
                }
                if (arg1.startsWith("rect_debug")) {
                    class447.field6525 = class36.method259(arg1.substring(10).trim(), (byte) 109);
                    class319.method2135("rect_debug=" + class447.field6525, (byte) 97);
                }
                if (arg1.equalsIgnoreCase("qa_op_test")) {
                    class342.field4850 = true;
                }
                if (arg1.equalsIgnoreCase("clipcomponents")) {
                    class46.field754 = !class46.field754;
                    class319.method2135("clipcomponents=" + class46.field754, (byte) 86);
                }
                if (arg1.startsWith("bloom")) {
                    boolean var11 = class73.field1235.method743();
                    if (!class378.method2399((byte) -84, !var11)) {
                        class319.method2135("Failed to enable bloom", (byte) -117);
                    } else if (!var11) {
                        class319.method2135("Bloom enabled", (byte) 87);
                    } else {
                        class319.method2135("Bloom disabled", (byte) 70);
                    }
                }
                if (arg1.equalsIgnoreCase("tween")) {
                    if (!class221.field3301) {
                        class221.field3301 = true;
                        class319.method2135("Forced tweening ENABLED!", (byte) 88);
                    } else {
                        class221.field3301 = false;
                        class319.method2135("Forced tweening disabled.", (byte) 60);
                    }
                }
                if (arg1.equalsIgnoreCase("shiftclick")) {
                    if (!class41.field635) {
                        class319.method2135("Shift-click ENABLED!", (byte) -96);
                        class41.field635 = true;
                    } else {
                        class319.method2135("Shift-click disabled.", (byte) 68);
                        class41.field635 = false;
                    }
                }
                if (arg1.equalsIgnoreCase("getcgcoord")) {
                    class319.method2135("x:" + (class86.field1394.field6520 >> 7) + " z:" + (class86.field1394.field6519 >> 7), (byte) 48);
                }
                if (arg1.equalsIgnoreCase("getheight")) {
                    class319.method2135("Height: " + class50.field816[class367.field5213].method794(class86.field1394.field6520 >> 7, class86.field1394.field6519 >> 7), (byte) -111);
                }
                if (arg1.equalsIgnoreCase("resetminimap")) {
                    class100.field1561.method1339(0);
                    class100.field1561.method1343(-124);
                    class402.method2551(arg0 + 33);
                    class105.method934((byte) -105);
                }
                if (arg1.startsWith("mc")) {
                    if (class73.field1235.method683()) {
                        int var12 = Integer.parseInt(arg1.substring(3));
                        if (~var12 <= -2) {
                            if (~var12 < -5) {
                                var12 = 4;
                            }
                        } else {
                            var12 = 1;
                        }
                        class150.field2300 = var12;
                        class73.field1235.method732(class150.field2300);
                        class73.field1235.method758(0);
                        class319.method2135("Render cores now: " + class150.field2300, (byte) -88);
                    } else {
                        class319.method2135("Current toolkit doesn't support multiple cores", (byte) -89);
                    }
                }
                if (arg1.startsWith("cachespace")) {
                    class319.method2135("I(s): " + class199.field2904.method115(14) + "/" + class199.field2904.method105(88), (byte) 96);
                    class319.method2135("I(m): " + class450.field6534.method115(arg0 + 97) + "/" + class450.field6534.method105(arg0 + 125), (byte) 54);
                    class319.method2135("O(s): " + class417.field6046.method611(false) + "/" + class417.field6046.method618((byte) -121), (byte) 110);
                }
                if (arg1.equalsIgnoreCase("getcamerapos")) {
                    class319.method2135("Pos: " + class367.field5213 + "," + ((class265.field3985 >> 7) + class379.field5384 >> 6) + "," + ((class286.field4288 >> 7) - -class294.field4362 >> 6) + "," + (63 & (class265.field3985 >> 7) + class379.field5384) + "," + ((class286.field4288 >> 7) + class294.field4362 & 63) + " Height: " + (class109.method957(class286.field4288, class265.field3985, class367.field5213, arg0 + 20662) + -class437.field6364), (byte) 57);
                    class319.method2135("Look: " + class367.field5213 + "," + (class64.field1040 + class379.field5384 >> 6) + "," + (class288.field4300 - -class294.field4362 >> 6) + "," + (class64.field1040 + class379.field5384 & 63) + "," + (class294.field4362 + class288.field4300 & 63) + " Height: " + (class109.method957(class288.field4300, class64.field1040, class367.field5213, 20663) + -class364.field5183), (byte) 104);
                }
                if (arg1.equals("showocc")) {
                    class260.field3916 = !class260.field3916;
                    class64.method493(arg0 ^ 119);
                }
                if (arg1.equals("renderprofile") || arg1.equals("rp")) {
                    class399.field5871 = !class399.field5871;
                    class73.field1235.method731(class399.field5871);
                    class248.method1791(40);
                }
                if (arg1.equals("nonpcs")) {
                    class279.field4189 = !class279.field4189;
                }
                if (arg1.equals("autoworld")) {
                    class367.method2344((byte) -110);
                }
                if (arg1.equals("heap")) {
                    class319.method2135("Heap: " + class75.field1288 + "MB", (byte) 127);
                }
                if (arg1.equals("savevarcs")) {
                    class239.method1740((byte) 115);
                }
                if (arg1.equals("scramblevarcs")) {
                    for (int var13 = 0; ~class27.field401.length < ~var13; ++var13) {
                        if (class102.field1590[var13]) {
                            class27.field401[var13] = (int) (Math.random() * 99999.0D);
                            if (Math.random() > 0.5D) {
                                class27.field401[var13] *= -1;
                            }
                        }
                    }
                    class239.method1740((byte) 94);
                }
                if (arg1.equals("showcolmap")) {
                    class388.field5557 = true;
                    class105.method934((byte) -126);
                }
                if (arg1.equals("hidecolmap")) {
                    class388.field5557 = false;
                    class105.method934((byte) -39);
                }
                if (arg1.equals("resetcache")) {
                    class403.method2556(0);
                }
                if (arg1.equals("profilecpu")) {
                    class319.method2135(class110.method963((byte) -1) + "ms", (byte) 99);
                }
                if (~class240.field3463 == -31) {
                    ++class26.field381;
                    class13.field216.method2781(false, 8);
                    class13.field216.method267(2 + arg1.length(), false);
                    class13.field216.method267(arg2 ? 1 : 0, false);
                    class13.field216.method265((byte) -77, arg1);
                    return;
                }
            } catch (Exception var14) {
                class319.method2135("Whoops, something went wrong.", (byte) 73);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(II)I", line = 615)
    public static final int method436(int arg0, int arg1) {
        return class28.field412 != null ? class28.field412[arg0][arg1] >>> 21 & 2040 : 0;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ILdp;Ldp;Ldp;Ldp;)V", line = 631)
    public static final void method437(int arg0, class174 arg1, class174 arg2, class174 arg3, class174 arg4) {
        class311.field4535 = arg1;
        ++field882;
        class382.field5453 = arg2;
        class74.field1280 = arg4;
        if (arg0 != -18856) {
            method435(121, (String) null, true);
        }
        class59.field940 = arg3;
        class45.field710 = new class258[class311.field4535.method1325(-101)][];
        class297.field4392 = new boolean[class311.field4535.method1325(arg0 + 18784)];
    }

    @OriginalMember(owner = "client!va", name = "f", descriptor = "(I)V", line = 647)
    public static void method438(int arg0) {
        field893 = null;
        if (arg0 != 10) {
            field884 = 83;
        }
        field892 = null;
    }
}
