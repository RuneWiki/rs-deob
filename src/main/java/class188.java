import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class188 extends class276 {

    @OriginalMember(owner = "client!sk", name = "O", descriptor = "I")
    private int field3041 = 4096;

    @OriginalMember(owner = "client!sk", name = "R", descriptor = "I")
    private int field3044 = 4096;

    @OriginalMember(owner = "client!sk", name = "N", descriptor = "I")
    private int field3040 = 4096;

    @OriginalMember(owner = "client!sk", name = "T", descriptor = "[Z")
    public static boolean[] field3046 = new boolean[100];

    @OriginalMember(owner = "client!sk", name = "Y", descriptor = "Z")
    public static boolean field3051 = true;

    @OriginalMember(owner = "client!sk", name = "U", descriptor = "Lrc;")
    public static class9 field3047 = new class9(5);

    @OriginalMember(owner = "client!sk", name = "P", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!sk", name = "Q", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!sk", name = "S", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!sk", name = "V", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!sk", name = "W", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!sk", name = "X", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!sk", name = "Z", descriptor = "Lvh;")
    public static class108 field3052;

    @OriginalMember(owner = "client!sk", name = "M", descriptor = "Ldl;")
    public static class46 field3039;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILeh;B)V")
    public final void method21(int arg0, class101 arg1, byte arg2) {
        ++field3049;
        if (arg2 != -1) {
            this.field3040 = 28;
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field3040 = arg1.method677(false);
                }
            } else {
                this.field3041 = arg1.method677(false);
            }
        } else {
            this.field3044 = arg1.method677(false);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method1227(byte arg0, String arg1) {
        ++field3043;
        if (class204.field3343 >= 2) {
            if (arg1.equalsIgnoreCase("::gc")) {
                class281.method1831((byte) 101);
                for (int var2 = 0; var2 < 10; ++var2) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class97.method612("mem=" + var4 + "k", -1, 0, (String) null);
            }
            if (arg1.equalsIgnoreCase("::mm")) {
                class281.method1831((byte) 101);
                for (int var5 = 0; var5 < 10; ++var5) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() + -var6.freeMemory()) / 1024L);
                class97.method612("Memory before cleanup=" + var7 + "k", -1, 0, (String) null);
                class100.method634(-128);
                class281.method1831((byte) 101);
                for (int var8 = 0; var8 < 10; ++var8) {
                    System.gc();
                }
                int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class97.method612("Memory after cleanup=" + var9 + "k", -1, 0, (String) null);
            }
            if (arg1.equalsIgnoreCase("::pcachesize")) {
                class97.method612("Number of player models in cache:" + class171.method1151((byte) -107), -1, 0, (String) null);
            }
            if (arg1.equalsIgnoreCase("::clientdrop")) {
                class239.method1580((byte) -120);
            }
            if (arg1.equalsIgnoreCase("::clientjs5drop")) {
                class91.field1610.method313(1957862288);
            }
            if (arg1.equalsIgnoreCase("::serverjs5drop")) {
                class91.field1610.method312(23746);
            }
            if (arg1.equalsIgnoreCase("::breakcon")) {
                class127.field2238.method904((byte) 36);
                class194.field3131.method1383((byte) -42);
                class91.field1610.method324((byte) -115);
            }
            if (arg1.equalsIgnoreCase("::replacecanvas")) {
                class107.field1911 = true;
            }
            if (arg1.equalsIgnoreCase("::rebuild")) {
                class217.method1441(25, -31239);
            }
            if (arg1.equalsIgnoreCase("::fpson")) {
                class105.field1886 = true;
            }
            if (arg1.equalsIgnoreCase("::fpsoff")) {
                class105.field1886 = false;
            }
            if (arg1.startsWith("::setba")) {
                class103.field1818 = class173.method1155(arg1.substring(8), -3634);
                class28.method185(class127.field2238, 0);
                class196.field3172 = false;
            }
            if (arg1.startsWith("::setparticles")) {
                class32.method214(class173.method1155(arg1.substring(15), -3634));
                class28.method185(class127.field2238, 0);
                class196.field3172 = false;
            }
            if (arg1.startsWith("::fps ") && class225.field3780 != 0) {
                class296.method1990(2820, class173.method1155(arg1.substring(6), -3634));
            }
            if (arg1.equalsIgnoreCase("::errortest")) {
                throw new RuntimeException();
            }
            if (arg1.startsWith("::rect_debug")) {
                class161.field2674 = class173.method1155(arg1.substring(12).trim(), -3634);
                class97.method612("rect_debug=" + class161.field2674, -1, 0, (String) null);
            }
            if (arg1.equalsIgnoreCase("::qa_op_test")) {
                class285.field4510 = true;
            }
            arg1.startsWith("::hdr");
            if (arg1.equalsIgnoreCase("::tween")) {
                if (!class261.field4255) {
                    class261.field4255 = true;
                    class97.method612("Forced tweening ENABLED!", -1, 0, (String) null);
                } else {
                    class261.field4255 = false;
                    class97.method612("Forced tweening disabled.", -1, 0, (String) null);
                }
            }
            if (arg1.equalsIgnoreCase("::shiftclick")) {
                if (!class119.field2117) {
                    System.out.println("Shift-click ENABLED!");
                    class119.field2117 = true;
                } else {
                    System.out.println("Shift-click disabled.");
                    class119.field2117 = false;
                }
            }
        }
        class168.field2778.method199(236, 115);
        class168.field2778.method682(arg1.length() - 1, 22555);
        class168.field2778.method645(arg1.substring(2), (byte) 92);
        if (arg0 < 10) {
            field3046 = null;
        }
        ++class91.field1605;
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(II)[[I")
    public final int[][] method300(int arg0, int arg1) {
        if (arg1 != -1) {
            field3047 = null;
        }
        ++field3050;
        int[][] var3 = super.field4418.method835((byte) 105, arg0);
        if (super.field4418.field2164) {
            int[][] var4 = this.method1810((byte) 56, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var3[0];
            for (int var11 = 0; var11 < class53.field929; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (var12 == var14 && var13 == var14) {
                    var10[var11] = this.field3044 * var12 >> 12;
                    var8[var11] = this.field3041 * var14 >> 12;
                    var9[var11] = this.field3040 * var13 >> 12;
                } else {
                    var10[var11] = this.field3044;
                    var8[var11] = this.field3041;
                    var9[var11] = this.field3040;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Leh;B)V")
    public static final void method1228(class101 arg0, byte arg1) {
        ++field3048;
        int var2 = 0;
        if (arg1 >= -45) {
            field3051 = false;
        }
        while (~var2 > ~class276.field4420) {
            int var3 = arg0.method692(27029);
            int var4 = arg0.method677(false);
            if (~var4 == -65536) {
                var4 = -1;
            }
            if (class54.field939[var3] != null) {
                class54.field939[var3].field3981 = var4;
            }
            ++var2;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IILdl;II)V")
    public static final void method1229(int arg0, int arg1, class46 arg2, int arg3, int arg4) {
        class97.method614(32067);
        class283.method1858(arg3, arg1, arg2.field701 + arg3, arg2.field715 + arg1);
        if (arg0 != -11516) {
            method1228((class101) null, (byte) -101);
        }
        if (~class264.field4293 != -3 && class264.field4293 != 5 && class84.field1524 != null) {
            int var5 = 48 - -(class273.field4378.field1397 / 32);
            int var6 = (int) class106.field1900 + class173.field2833 & 2047;
            int var7 = -(class273.field4378.field1458 / 32) + 464;
            ((class197) class84.field1524).method1298(arg3, arg1, arg2.field701, arg2.field715, var5, var7, var6, class231.field3871 + 256, arg2.field671, arg2.field714);
            if (class255.field4167 != null) {
                for (int var8 = 0; class255.field4167.field3158 > var8; ++var8) {
                    if (class255.field4167.method1276(-1, var8)) {
                        int var9 = (((class255.field4167.field3149[var8] & 268428091) >> 14) + -class126.field2206) * 4 + -(class273.field4378.field1397 / 32) + 2;
                        int var10 = ((16383 & class255.field4167.field3149[var8]) - class255.field4162) * 4 + 2 + -(class273.field4378.field1458 / 32);
                        int var11 = class287.field4562[var6];
                        int var12 = class287.field4567[var6];
                        int var13 = var12 * 256 / (class231.field3871 - -256);
                        int var14 = var11 * 256 / (class231.field3871 + 256);
                        int var15 = var10 * var13 - -(var9 * var14) >> 16;
                        class244 var16 = class267.field4318;
                        int var17 = var10 * var14 + -(var9 * var13) >> 16;
                        if (class255.field4167.method1275(var8, (byte) -24) == 1) {
                            var16 = class112.field2018;
                        }
                        if (class255.field4167.method1275(var8, (byte) -24) == 2) {
                            var16 = class290.field4636;
                        }
                        int var18 = var16.method1614(class255.field4167.field3152[var8], 100);
                        int var19 = var15 - var18 / 2;
                        if (~var19 <= ~(-arg2.field701) && ~var19 >= ~arg2.field701 && -arg2.field715 <= var17 && ~arg2.field715 <= ~var17) {
                            int var20 = 16777215;
                            if (class255.field4167.field3142[var8] != -1) {
                                var20 = class255.field4167.field3142[var8];
                            }
                            class283.method1842(arg2.field671, arg2.field714);
                            var16.method1618(class255.field4167.field3152[var8], arg2.field701 / 2 + var19 + arg3, arg1 - (-(arg2.field715 / 2) + var17), var18, 50, var20, 0, 256, 1, 0, 0);
                            class283.method1845();
                        }
                    }
                }
            }
            for (int var21 = 0; ~var21 > ~class248.field4062; ++var21) {
                int var58 = class290.field4635[var21] * 4 + -(class273.field4378.field1397 / 32) + 2;
                int var59 = class93.field1633[var21] * 4 - -2 + -(class273.field4378.field1458 / 32);
                class206 var60 = class10.method64(64, class155.field2601[var21]);
                if (var60.field3373 != null) {
                    var60 = var60.method1375((byte) 93);
                    if (var60 == null || var60.field3393 == -1) {
                        continue;
                    }
                }
                class133.method924(arg0 + 11518, arg1, class250.field4092[var60.field3393], arg3, var58, var59, arg2);
            }
            for (int var22 = 0; ~var22 > -105; ++var22) {
                for (int var54 = 0; var54 < 104; ++var54) {
                    class60 var55 = class255.field4163[class176.field2886][var22][var54];
                    if (var55 != null) {
                        int var56 = var22 * 4 + -(class273.field4378.field1397 / 32) + 2;
                        int var57 = var54 * 4 + 2 + -(class273.field4378.field1458 / 32);
                        class133.method924(2, arg1, class28.field422[0], arg3, var56, var57, arg2);
                    }
                }
            }
            for (int var23 = 0; class187.field3037 > var23; ++var23) {
                class141 var50 = class42.field625[class292.field4668[var23]];
                if (var50 != null && var50.method536(123)) {
                    class208 var51 = var50.field2421;
                    if (var51 != null && var51.field3521 != null) {
                        var51 = var51.method1402((byte) -120);
                    }
                    if (var51 != null && var51.field3498 && var51.field3479) {
                        int var52 = var50.field1397 / 32 - class273.field4378.field1397 / 32;
                        int var53 = var50.field1458 / 32 + -(class273.field4378.field1458 / 32);
                        if (var51.field3536 == -1) {
                            class133.method924(2, arg1, class28.field422[1], arg3, var52, var53, arg2);
                        } else {
                            class133.method924(2, arg1, class250.field4092[var51.field3536], arg3, var52, var53, arg2);
                        }
                    }
                }
            }
            for (int var24 = 0; ~class157.field2624 < ~var24; ++var24) {
                class288 var40 = class105.field1874[class280.field4458[var24]];
                if (var40 != null && var40.method536(126)) {
                    int var41 = var40.field1397 / 32 + -(class273.field4378.field1397 / 32);
                    int var42 = var40.field1458 / 32 + -(class273.field4378.field1458 / 32);
                    boolean var43 = false;
                    long var44 = class103.method702(true, var40.field4601);
                    for (int var46 = 0; class228.field3837 > var46; ++var46) {
                        if (class280.field4464[var46] == var44 && ~class274.field4393[var46] != -1) {
                            var43 = true;
                            break;
                        }
                    }
                    boolean var47 = false;
                    for (int var48 = 0; ~var48 > ~class139.field2402; ++var48) {
                        if (~class182.field2972[var48].field1515 == ~var44) {
                            var47 = true;
                            break;
                        }
                    }
                    boolean var49 = false;
                    if (~class273.field4378.field4573 != -1 && var40.field4573 != 0 && ~class273.field4378.field4573 == ~var40.field4573) {
                        var49 = true;
                    }
                    if (var43) {
                        class133.method924(arg0 + 11518, arg1, class28.field422[3], arg3, var41, var42, arg2);
                    } else if (!var47) {
                        if (var49) {
                            class133.method924(2, arg1, class28.field422[4], arg3, var41, var42, arg2);
                        } else {
                            class133.method924(arg0 + 11518, arg1, class28.field422[2], arg3, var41, var42, arg2);
                        }
                    } else {
                        class133.method924(2, arg1, class28.field422[5], arg3, var41, var42, arg2);
                    }
                }
            }
            class280[] var25 = class26.field398;
            for (int var26 = 0; var26 < var25.length; ++var26) {
                class280 var29 = var25[var26];
                if (var29 != null && ~var29.field4460 != -1 && ~(class266.field4301 % 20) > -11) {
                    if (var29.field4460 == 1 && var29.field4454 >= 0 && class42.field625.length > var29.field4454) {
                        class141 var30 = class42.field625[var29.field4454];
                        if (var30 != null) {
                            int var31 = var30.field1458 / 32 + -(class273.field4378.field1458 / 32);
                            int var32 = var30.field1397 / 32 + -(class273.field4378.field1397 / 32);
                            class37.method243(arg3, var31, var29.field4450, var32, arg0 + 31339, 360000, arg1, arg2);
                        }
                    }
                    if (~var29.field4460 == -3) {
                        int var33 = (var29.field4453 - class255.field4162) * 4 + 2 + -(class273.field4378.field1458 / 32);
                        int var34 = (-class126.field2206 + var29.field4451) * 4 + 2 + -(class273.field4378.field1397 / 32);
                        int var35 = var29.field4452 * 4;
                        int var36 = var35 * var35;
                        class37.method243(arg3, var33, var29.field4450, var34, 19823, var36, arg1, arg2);
                    }
                    if (var29.field4460 == 10 && ~var29.field4454 <= -1 && ~var29.field4454 > ~class105.field1874.length) {
                        class288 var37 = class105.field1874[var29.field4454];
                        if (var37 != null) {
                            int var38 = var37.field1397 / 32 + -(class273.field4378.field1397 / 32);
                            int var39 = var37.field1458 / 32 + -(class273.field4378.field1458 / 32);
                            class37.method243(arg3, var39, var29.field4450, var38, arg0 ^ -24981, 360000, arg1, arg2);
                        }
                    }
                }
            }
            if (~class79.field1364 != -1) {
                int var27 = class79.field1364 * 4 - -2 + -(class273.field4378.field1397 / 32) + (-1 + class273.field4378.method528(125)) * 2;
                int var28 = class53.field927 * 4 + -(class273.field4378.field1458 / 32) + 2 - -((class273.field4378.method528(13) - 1) * 2);
                class133.method924(2, arg1, class246.field4044, arg3, var27, var28, arg2);
            }
            class283.method1855(arg2.field701 / 2 + arg3 + -1, arg2.field715 / 2 + arg1 + -1, 3, 3, 16777215);
        } else {
            class283.method1843(arg3, arg1, 0, arg2.field671, arg2.field714);
        }
        ++field3045;
        class239.field3937[arg4] = true;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)V")
    public static void method1230(boolean arg0) {
        field3047 = null;
        field3039 = null;
        if (arg0) {
            field3046 = null;
        }
        field3046 = null;
        field3052 = null;
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "()V")
    public class188() {
        super(1, false);
    }
}
