import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class197 extends class220 {

    @OriginalMember(owner = "client!qn", name = "Q", descriptor = "I")
    private int field2810 = 4096;

    @OriginalMember(owner = "client!qn", name = "R", descriptor = "Ljava/lang/String;")
    public static String field2811 = "Loading textures - ";

    @OriginalMember(owner = "client!qn", name = "T", descriptor = "I")
    public static int field2813 = -60;

    @OriginalMember(owner = "client!qn", name = "Z", descriptor = "Lwe;")
    public static class24 field2819 = new class24(30);

    @OriginalMember(owner = "client!qn", name = "bb", descriptor = "Ljava/lang/String;")
    public static String field2821 = "Discard";

    @OriginalMember(owner = "client!qn", name = "cb", descriptor = "Lwe;")
    public static class24 field2822 = new class24(5);

    @OriginalMember(owner = "client!qn", name = "db", descriptor = "Ljava/lang/String;")
    public static String field2823 = "wave2:";

    @OriginalMember(owner = "client!qn", name = "P", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!qn", name = "S", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!qn", name = "U", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!qn", name = "V", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!qn", name = "W", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!qn", name = "X", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!qn", name = "Y", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!qn", name = "ab", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!qn", name = "eb", descriptor = "I")
    public static int field2824;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qn", name = "gb", descriptor = "Ljava/lang/Class;")
    public static Class field2826;

    @OriginalMember(owner = "client!qn", name = "fb", descriptor = "[Lqa;")
    public static class243[] field2825;

    // $FF: synthetic method
    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1236(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "(I)V", line = 6)
    public static final void method1229(int arg0) {
        class320.field4573 = null;
        class50.field697 = null;
        class280.field4124 = null;
        class311.field4456 = null;
        ++field2815;
        class152.field1983 = null;
        class384.field5747 = null;
        field2825 = null;
        int var1 = -127 % ((63 - arg0) / 55);
        class318.field4547 = null;
        class188.field2553 = null;
        class115.field1563 = null;
        class30.field518 = null;
        class420.field6263 = null;
        class407.field6100 = null;
        class193.field2718 = null;
        class232.field3275 = null;
        class246.field3425 = null;
        class328.field4712 = null;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IBLil;)V", line = 36)
    public final void method2(int arg0, byte arg1, class265 arg2) {
        ++field2817;
        if (arg1 != -49) {
            method1232(65);
        }
        if (~arg0 == -1) {
            this.field2810 = arg2.method1685(8104);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lal;I)V", line = 49)
    public static final void method1230(class370 arg0, int arg1) {
        ++field2818;
        if (class343.field5032 != null) {
            class351 var2 = null;
            if (~arg0.field5505 == -1) {
                var2 = (class351) class87.method539(arg0.field5507, arg0.field5498, arg0.field5490);
            }
            if (~arg0.field5505 == -2) {
                var2 = (class351) class117.method822(arg0.field5507, arg0.field5498, arg0.field5490);
            }
            if (arg0.field5505 == 2) {
                var2 = (class351) class312.method1947(arg0.field5507, arg0.field5498, arg0.field5490, field2826 != null ? field2826 : (field2826 = method1236("im")));
            }
            if (arg1 != 0) {
                method1234((byte) -70);
            }
            if (~arg0.field5505 == -4) {
                var2 = (class351) class135.method910(arg0.field5507, arg0.field5498, arg0.field5490);
            }
            if (var2 == null) {
                arg0.field5491 = 0;
                arg0.field5493 = -1;
                arg0.field5497 = 0;
            } else {
                arg0.field5493 = var2.method150((byte) -118);
                arg0.field5497 = var2.method160(-22056);
                arg0.field5491 = var2.method148((byte) -68);
            }
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lvp;I)I", line = 94)
    public static final int method1231(class194 arg0, int arg1) {
        if (arg1 != 10) {
            field2823 = null;
        }
        ++field2809;
        int var2 = arg0.field2773;
        class183 var3 = arg0.method140(118);
        if (!arg0.field236) {
            if (~arg0.field229 != ~var3.field2460 && ~arg0.field229 != ~var3.field2444 && ~arg0.field229 != ~var3.field2441 && ~arg0.field229 != ~var3.field2469) {
                if (arg0.field229 == var3.field2458 || ~arg0.field229 == ~var3.field2471 || ~arg0.field229 == ~var3.field2461 || ~arg0.field229 == ~var3.field2470) {
                    var2 = arg0.field2784;
                }
            } else {
                var2 = arg0.field2781;
            }
        } else {
            var2 = arg0.field2766;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "()V", line = 181)
    public class197() {
        super(1, true);
    }

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "(II)[I", line = 125)
    public final int[] method43(int arg0, int arg1) {
        ++field2816;
        int[] var3 = super.field3125.method2005(arg1, (byte) 85);
        if (arg0 != -11543) {
            this.method2(122, (byte) -82, (class265) null);
        }
        if (super.field3125.field4676) {
            int[] var4 = this.method1366(0, (byte) -40, arg1 + -1 & class315.field4510);
            int[] var5 = this.method1366(0, (byte) -40, arg1);
            int[] var6 = this.method1366(0, (byte) -40, class315.field4510 & arg1 + 1);
            for (int var7 = 0; ~var7 > ~class344.field5043; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field2810;
                int var9 = (var5[class392.field5887 & var7 - -1] + -var5[class392.field5887 & var7 - 1]) * this.field2810;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var13 + 4096 + var12) / 4096.0F)));
                int var15 = ~var14 != -1 ? 16777216 / var14 : 0;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "(I)V", line = 184)
    public static void method1232(int arg0) {
        field2821 = null;
        field2822 = null;
        field2819 = null;
        field2825 = null;
        field2811 = null;
        field2823 = null;
        int var1 = 60 % ((-22 - arg0) / 45);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IZLjava/lang/String;)V", line = 203)
    public static final void method1233(int arg0, boolean arg1, String arg2) {
        if (arg0 <= 0) {
            method1233(121, true, (String) null);
        }
        ++field2812;
        if (class59.field849 != 0 || ~class227.field3206 <= -3) {
            if (arg2.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            try {
                if (arg2.equalsIgnoreCase("fpson")) {
                    class423.field6298 = true;
                }
                if (arg2.equalsIgnoreCase("fpsoff")) {
                    class423.field6298 = false;
                }
                if (arg2.equalsIgnoreCase("cls")) {
                    class452.field6588 = 0;
                    class208.field2988 = 0;
                }
                if (arg2.equalsIgnoreCase("cleartext")) {
                    class376.field5683.method977(0);
                }
                if (arg2.equalsIgnoreCase("gc")) {
                    class199.method1245((byte) -90);
                    for (int var3 = 0; var3 < 10; ++var3) {
                        System.gc();
                    }
                    Runtime var4 = Runtime.getRuntime();
                    int var5 = (int) ((var4.totalMemory() + -var4.freeMemory()) / 1024L);
                    class319.method1979(-124, "mem=" + var5 + "k");
                }
                if (arg2.equalsIgnoreCase("compact")) {
                    class199.method1245((byte) 52);
                    for (int var6 = 0; ~var6 > -11; ++var6) {
                        System.gc();
                    }
                    Runtime var7 = Runtime.getRuntime();
                    int var8 = (int) ((var7.totalMemory() + -var7.freeMemory()) / 1024L);
                    class319.method1979(-61, "Memory before cleanup=" + var8 + "k");
                    class361.method2373(125);
                    class199.method1245((byte) -74);
                    for (int var9 = 0; var9 < 10; ++var9) {
                        System.gc();
                    }
                    int var10 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                    class319.method1979(-60, "Memory after cleanup=" + var10 + "k");
                }
                if (arg2.equalsIgnoreCase("pcachesize")) {
                    class319.method1979(-77, "Number of player models in cache:" + class393.method2570(-32251));
                }
                if (arg2.equalsIgnoreCase("clientdrop")) {
                    class120.method837(true);
                }
                if (arg2.equalsIgnoreCase("clientjs5drop")) {
                    class97.field1331.method2208((byte) -120);
                }
                if (arg2.equalsIgnoreCase("serverjs5drop")) {
                    class97.field1331.method2207(-32);
                }
                if (arg2.equalsIgnoreCase("breakcon")) {
                    class361.field5285.method29(10);
                    class159.field2079.method246(123);
                    class97.field1331.method2199(-65);
                }
                if (arg2.equalsIgnoreCase("rebuild")) {
                    class300.method1898(1);
                    class122.method842((byte) 50);
                }
                if (arg2.equalsIgnoreCase("wm1")) {
                    class66.method430(1, -1, -1, false, true);
                }
                if (arg2.equalsIgnoreCase("wm2")) {
                    class66.method430(2, -1, -1, false, true);
                }
                if (arg2.equalsIgnoreCase("::wm3")) {
                    class66.method430(3, 1024, 768, false, true);
                }
                if (arg2.equalsIgnoreCase("tk0")) {
                    class22.method189(0, -56);
                    class215.field3082 = 0;
                    class423.method2724(class361.field5285, (byte) -7);
                    class153.field2013 = false;
                }
                if (arg2.equalsIgnoreCase("tk1")) {
                    class22.method189(1, 116);
                    class215.field3082 = 1;
                    class423.method2724(class361.field5285, (byte) -7);
                    class153.field2013 = false;
                }
                if (arg2.equalsIgnoreCase("tk2")) {
                    class22.method189(2, -116);
                    class215.field3082 = 2;
                    class423.method2724(class361.field5285, (byte) -7);
                    class153.field2013 = false;
                }
                if (arg2.equalsIgnoreCase("tk3")) {
                    class22.method189(3, -82);
                }
                if (arg2.equalsIgnoreCase("ot")) {
                    class261.field3804 = !class261.field3804;
                    class423.method2724(class361.field5285, (byte) -7);
                    class153.field2013 = false;
                    class300.method1898(1);
                }
                if (arg2.equalsIgnoreCase("gb")) {
                    class363.field5313 = !class363.field5313;
                    class423.method2724(class361.field5285, (byte) -7);
                    class153.field2013 = false;
                    class300.method1898(1);
                }
                if (arg2.startsWith("shadows ")) {
                    class176.field2300 = class15.method105(arg2.substring(8), (byte) 20);
                    class423.method2724(class361.field5285, (byte) -7);
                    class153.field2013 = false;
                    class300.method1898(1);
                }
                if (arg2.startsWith("setba")) {
                    class445.field6478 = class15.method105(arg2.substring(6), (byte) 20);
                    class423.method2724(class361.field5285, (byte) -7);
                    class153.field2013 = false;
                }
                if (arg2.startsWith("setparticles")) {
                    class313.method1956(class15.method105(arg2.substring(13), (byte) 20), 0);
                    class423.method2724(class361.field5285, (byte) -7);
                    class153.field2013 = false;
                }
                if (arg2.startsWith("fps ") && ~class59.field849 != -1) {
                    class200.method1258(class15.method105(arg2.substring(4), (byte) 20), (byte) 125);
                }
                if (arg2.startsWith("rect_debug")) {
                    class224.field3171 = class15.method105(arg2.substring(10).trim(), (byte) 20);
                    class319.method1979(-59, "rect_debug=" + class224.field3171);
                }
                if (arg2.equalsIgnoreCase("qa_op_test")) {
                    class381.field5720 = true;
                }
                if (arg2.equalsIgnoreCase("clipcomponents")) {
                    class226.field3188 = !class226.field3188;
                    class319.method1979(-41, "clipcomponents=" + class226.field3188);
                }
                if (arg2.startsWith("bloom")) {
                    boolean var11 = class35.field574.method2051();
                    if (class97.method633(!var11, 47)) {
                        if (var11) {
                            class319.method1979(-58, "Bloom disabled");
                        } else {
                            class319.method1979(-127, "Bloom enabled");
                        }
                    } else {
                        class319.method1979(-49, "Failed to enable bloom");
                    }
                }
                if (arg2.equalsIgnoreCase("tween")) {
                    if (!class408.field6114) {
                        class408.field6114 = true;
                        class319.method1979(-100, "Forced tweening ENABLED!");
                    } else {
                        class408.field6114 = false;
                        class319.method1979(-114, "Forced tweening disabled.");
                    }
                }
                if (arg2.equalsIgnoreCase("shiftclick")) {
                    if (class91.field1254) {
                        class319.method1979(-77, "Shift-click disabled.");
                        class91.field1254 = false;
                    } else {
                        class319.method1979(-73, "Shift-click ENABLED!");
                        class91.field1254 = true;
                    }
                }
                if (arg2.equalsIgnoreCase("getcgcoord")) {
                    class319.method1979(-50, "x:" + (class100.field1350.field5284 >> 7) + " z:" + (class100.field1350.field5298 >> 7));
                }
                if (arg2.equalsIgnoreCase("getheight")) {
                    class319.method1979(-75, "Height: " + class88.field1226[class193.field2688].method781(class100.field1350.field5284 >> 7, class100.field1350.field5298 >> 7));
                }
                if (arg2.equalsIgnoreCase("resetminimap")) {
                    class247.field3446.method1481(true);
                    class247.field3446.method1464(false);
                    class436.method2757(-60);
                    class122.method842((byte) 50);
                }
                if (arg2.startsWith("mc")) {
                    if (class35.field574.method2146()) {
                        int var12 = Integer.parseInt(arg2.substring(3));
                        if (var12 < 1) {
                            var12 = 1;
                        } else if (var12 > 4) {
                            var12 = 4;
                        }
                        class169.field2227 = var12;
                        class35.field574.method2133(class169.field2227);
                        class35.field574.method2161(0);
                        class319.method1979(-75, "Render cores now: " + class169.field2227);
                    } else {
                        class319.method1979(-98, "Current toolkit doesn't support multiple cores");
                    }
                }
                if (arg2.startsWith("cachespace")) {
                    class319.method1979(-77, "I(s): " + class129.field1717.method210(-1) + "/" + class129.field1717.method214(112));
                    class319.method1979(-67, "I(m): " + class237.field3325.method210(-1) + "/" + class237.field3325.method214(124));
                    class319.method1979(-82, "O(s): " + class114.field1551.method1634(14361) + "/" + class114.field1551.method1631(6798));
                }
                if (arg2.equalsIgnoreCase("getcamerapos")) {
                    class319.method1979(-52, "Pos: " + class193.field2688 + "," + ((class237.field3326 >> 7) - -class184.field2482 >> 6) + "," + ((class7.field71 >> 7) + class38.field620 >> 6) + "," + (63 & (class237.field3326 >> 7) + class184.field2482) + "," + ((class7.field71 >> 7) - -class38.field620 & 63) + " Height: " + (class139.method935(class7.field71, -115, class237.field3326, class193.field2688) - class130.field1745));
                    class319.method1979(-69, "Look: " + class193.field2688 + "," + (class387.field5781 + class184.field2482 >> 6) + "," + (class38.field620 + class235.field3309 >> 6) + "," + (class387.field5781 + class184.field2482 & 63) + "," + (class38.field620 + class235.field3309 & 63) + " Height: " + (class139.method935(class235.field3309, 120, class387.field5781, class193.field2688) + -class79.field1082));
                }
                if (arg2.equals("showocc")) {
                    class232.field3276 = !class232.field3276;
                    class300.method1898(1);
                }
                if (arg2.equals("renderprofile") || arg2.equals("rp")) {
                    class51.field756 = !class51.field756;
                    class35.field574.method2077(class51.field756);
                    class345.method2300(true);
                }
                if (arg2.equals("nonpcs")) {
                    class409.field6126 = !class409.field6126;
                }
                if (arg2.equals("autoworld")) {
                    class347.method2312(-23144);
                }
                if (arg2.equals("heap")) {
                    class319.method1979(-98, "Heap: " + class160.field2099 + "MB");
                }
                if (arg2.equals("savevarcs")) {
                    class153.method993(6);
                }
                if (arg2.equals("scramblevarcs")) {
                    for (int var13 = 0; ~var13 > ~class320.field4575.length; ++var13) {
                        if (class87.field1215[var13]) {
                            class320.field4575[var13] = (int) (99999.0D * Math.random());
                            if (Math.random() > 0.5D) {
                                class320.field4575[var13] *= -1;
                            }
                        }
                    }
                    class153.method993(6);
                }
                if (arg2.equals("showcolmap")) {
                    class170.field2245 = true;
                    class122.method842((byte) 50);
                }
                if (arg2.equals("hidecolmap")) {
                    class170.field2245 = false;
                    class122.method842((byte) 50);
                }
                if (arg2.equals("resetcache")) {
                    class215.method1350(8110);
                }
                if (arg2.equals("profilecpu")) {
                    class319.method1979(-121, class318.method1978(-65536) + "ms");
                }
                if (~class137.field1815 == -31) {
                    class232.field3279.method756(0, 171);
                    ++class302.field4330;
                    class232.field3279.method1707(-111, 2 + arg2.length());
                    class232.field3279.method1707(-113, arg1 ? 1 : 0);
                    class232.field3279.method1662(arg2, (byte) 46);
                    return;
                }
            } catch (Exception var14) {
                class319.method1979(-108, "Whoops, something went wrong.");
                return;
            }
        }
    }

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "(B)V", line = 622)
    public static final void method1234(byte arg0) {
        if (~class2.field13.toLowerCase().indexOf("microsoft") != 0) {
            class447.field6519[189] = 26;
            class447.field6519[219] = 42;
            class447.field6519[220] = 74;
            class447.field6519[190] = 72;
            class447.field6519[223] = 28;
            class447.field6519[221] = 43;
            class447.field6519[222] = 59;
            class447.field6519[187] = 27;
            class447.field6519[186] = 57;
            class447.field6519[191] = 73;
            class447.field6519[188] = 71;
            class447.field6519[192] = 58;
        } else {
            class447.field6519[47] = 73;
            class447.field6519[44] = 71;
            class447.field6519[46] = 72;
            if (class2.field33 != null) {
                class447.field6519[520] = 59;
                class447.field6519[192] = 28;
                class447.field6519[222] = 58;
            } else {
                class447.field6519[222] = 59;
                class447.field6519[192] = 58;
            }
            class447.field6519[61] = 27;
            class447.field6519[92] = 74;
            class447.field6519[91] = 42;
            class447.field6519[59] = 57;
            class447.field6519[93] = 43;
            class447.field6519[45] = 26;
        }
        if (arg0 < -64) {
            ++field2814;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(BIIIII)V", line = 681)
    public static final void method1235(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var9 = arg3 + 1;
        class370.method2440(arg2, class227.field3201[arg3], arg4, arg1, 102);
        ++field2820;
        int var10 = arg5 - 1;
        class370.method2440(arg2, class227.field3201[arg5], arg4, arg1, 90);
        for (int var6 = var9; var10 >= var6; ++var6) {
            int[] var8 = class227.field3201[var6];
            var8[arg1] = var8[arg2] = arg4;
        }
        int var7 = 9 / ((51 - arg0) / 60);
    }
}
