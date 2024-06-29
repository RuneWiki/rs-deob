import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class36 extends class512 {

    @OriginalMember(owner = "client!hq", name = "K", descriptor = "[I")
    private int[] field536 = new int[3];

    @OriginalMember(owner = "client!hq", name = "P", descriptor = "I")
    private int field541 = 4096;

    @OriginalMember(owner = "client!hq", name = "R", descriptor = "I")
    private int field543 = 3216;

    @OriginalMember(owner = "client!hq", name = "U", descriptor = "I")
    private int field546 = 3216;

    @OriginalMember(owner = "client!hq", name = "O", descriptor = "Llo;")
    public static class306 field540 = new class306("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");

    @OriginalMember(owner = "client!hq", name = "G", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!hq", name = "H", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!hq", name = "I", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!hq", name = "J", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!hq", name = "L", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!hq", name = "M", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!hq", name = "N", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!hq", name = "Q", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!hq", name = "S", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!hq", name = "T", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "()V")
    public class36() {
        super(1, true);
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIIIII)V")
    public static final void method267(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field542;
        if (class182.field2877 <= -arg0 + arg1 && arg0 + arg1 <= class235.field4076 && ~class29.field460 >= ~(-arg0 + arg5) && ~(arg0 + arg5) >= ~class472.field6996) {
            class532.method3147(arg0, arg1, 3, arg3, arg6, arg2, arg5);
        } else {
            class290.method1876(arg0, arg2, arg3, 0, arg1, arg5, arg6);
        }
        if (arg4 != 26216) {
            method271(false, false);
        }
    }

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "(I)V")
    public final void method74(int arg0) {
        if (arg0 != 12388) {
            method272((class197) null, (byte) -113);
        }
        this.method269(true);
        ++field544;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(BLl;Lza;)V")
    public static final void method268(byte arg0, class196 arg1, class491 arg2) {
        ++field538;
        if (class210.field3321 != null) {
            if (~class57.field900 > -11) {
                if (!class210.field3325.method2915(class210.field3321.field5442, 122)) {
                    class57.field900 = class208.field3292.method2943(8, class210.field3321.field5442) / 10;
                    return;
                }
                class346.method2231(0);
                class57.field900 = 10;
            }
            if (~class57.field900 == -11) {
                class210.field3357 = class210.field3321.field5429 >> 6 << 6;
                class210.field3340 = class210.field3321.field5435 >> 6 << 6;
                class210.field3342 = (class210.field3321.field5439 >> 6 << 6) - (class210.field3340 - 64);
                class210.field3343 = (class210.field3321.field5432 >> 6 << 6) - (class210.field3357 - 64);
                int[] var3 = new int[3];
                int var4 = -1;
                int var5 = -1;
                if (class210.field3321.method2232(class302.field4850.field4720, (byte) 58, var3, (class302.field4850.field4716 >> 7) + class16.field181, (class302.field4850.field4714 >> 7) + class455.field6794)) {
                    var4 = var3[1] + -class210.field3357;
                    var5 = var3[2] + -class210.field3340;
                }
                if (!class222.field3823 && var4 >= 0 && ~var4 > ~class210.field3343 && ~var5 <= -1 && class210.field3342 > var5) {
                    int var6 = var5 + ((int) (Math.random() * 10.0D) - 5);
                    int var7 = var4 + -5 + (int) (Math.random() * 10.0D);
                    class471.field6970 = var6;
                    class494.field7217 = var7;
                } else if (~class302.field4848 != 0 && ~class426.field6409 != 0) {
                    class210.field3321.method2235(class426.field6409, (byte) 99, class302.field4848, var3);
                    class426.field6409 = -1;
                    class302.field4848 = -1;
                    class222.field3823 = false;
                    if (var3 != null) {
                        class471.field6970 = var3[2] - class210.field3340;
                        class494.field7217 = var3[1] + -class210.field3357;
                    }
                } else {
                    class210.field3321.method2235(16383 & class210.field3321.field5443, (byte) 99, class210.field3321.field5443 >> 14 & 16383, var3);
                    class471.field6970 = var3[2] + -class210.field3340;
                    class494.field7217 = var3[1] + -class210.field3357;
                }
                if (class210.field3321.field5437 == 37) {
                    class210.field3335 = 3.0F;
                    class210.field3339 = 3.0F;
                } else if (~class210.field3321.field5437 != -51) {
                    if (class210.field3321.field5437 != 75) {
                        if (~class210.field3321.field5437 == -101) {
                            class210.field3335 = 8.0F;
                            class210.field3339 = 8.0F;
                        } else if (class210.field3321.field5437 != 200) {
                            class210.field3335 = 8.0F;
                            class210.field3339 = 8.0F;
                        } else {
                            class210.field3335 = 16.0F;
                            class210.field3339 = 16.0F;
                        }
                    } else {
                        class210.field3335 = 6.0F;
                        class210.field3339 = 6.0F;
                    }
                } else {
                    class210.field3335 = 4.0F;
                    class210.field3339 = 4.0F;
                }
                class210.field3336 = (int) class210.field3335 >> 1;
                class210.field3331 = class382.method2410(class210.field3336, (byte) 78);
                class430.method2621((byte) 127);
                class210.method1387();
                class536.field7873 = new class411();
                class210.field3337 += -2 + (int) (5.0D * Math.random());
                if (~class210.field3337 > 7) {
                    class210.field3337 = -8;
                }
                if (~class210.field3337 < -9) {
                    class210.field3337 = 8;
                }
                class210.field3334 += (int) (5.0D * Math.random()) - 2;
                if (~class210.field3334 > 15) {
                    class210.field3334 = -16;
                }
                if (class210.field3334 > 16) {
                    class210.field3334 = 16;
                }
                class210.method1395(arg1, class210.field3337 >> 2 << 10, class210.field3334 >> 1);
                class210.field3329.method496(28167, 1024, 256);
                class210.field3328.method2006(256, (byte) -124, 256);
                class210.field3323.method786(-646, 4096);
                class189.field2953.method2901(-8192, 256);
                class57.field900 = 20;
            } else if (~class57.field900 == -21) {
                class101.method696((byte) -16, true);
                class210.method1393(arg2, class210.field3337, class210.field3334);
                class57.field900 = 60;
                class101.method696((byte) -16, true);
                class309.method1967(-7188);
            } else if (class57.field900 == 60) {
                if (!class210.field3325.method2944(-127, class210.field3321.field5442 + "_staticelements")) {
                    class210.field3333 = new class73(0);
                } else {
                    if (!class210.field3325.method2915(class210.field3321.field5442 + "_staticelements", 126)) {
                        return;
                    }
                    class210.field3333 = class194.method1295(class210.field3321.field5442 + "_staticelements", (byte) -115, class210.field3325, class347.field5452);
                }
                class210.method1376();
                class57.field900 = 70;
                class101.method696((byte) -16, true);
                class309.method1967(-7188);
            } else if (class57.field900 == 70) {
                class468.field6957 = new class514(arg2, 11, true, class270.field4495);
                class57.field900 = 73;
                class101.method696((byte) -16, true);
                class309.method1967(-7188);
            } else if (class57.field900 == 73) {
                class303.field4859 = new class514(arg2, 12, true, class270.field4495);
                class57.field900 = 76;
                class101.method696((byte) -16, true);
                class309.method1967(-7188);
            } else if (class57.field900 == 76) {
                class166.field2667 = new class514(arg2, 14, true, class270.field4495);
                class57.field900 = 79;
                class101.method696((byte) -16, true);
                class309.method1967(-7188);
            } else if (class57.field900 == 79) {
                class171.field2740 = new class514(arg2, 17, true, class270.field4495);
                class57.field900 = 82;
                class101.method696((byte) -16, true);
                class309.method1967(-7188);
            } else if (~class57.field900 == -83) {
                class23.field314 = new class514(arg2, 19, true, class270.field4495);
                class57.field900 = 85;
                class101.method696((byte) -16, true);
                class309.method1967(-7188);
            } else if (class57.field900 == 85) {
                class459.field6809 = new class514(arg2, 22, true, class270.field4495);
                class57.field900 = 88;
                class101.method696((byte) -16, true);
                class309.method1967(-7188);
            } else if (~class57.field900 == -89) {
                class182.field2881 = new class514(arg2, 26, true, class270.field4495);
                class57.field900 = 91;
                class101.method696((byte) -16, true);
                class309.method1967(-7188);
            } else {
                class261.field4363 = new class514(arg2, 30, true, class270.field4495);
                class57.field900 = 100;
                if (arg0 >= 29) {
                    class101.method696((byte) -16, true);
                    class309.method1967(-7188);
                    System.gc();
                }
            }
        }
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(Z)V")
    private final void method269(boolean arg0) {
        ++field532;
        if (!arg0) {
            this.method71(false, 33, (class23) null);
        }
        double var2 = Math.cos((double) ((float) this.field543 / 4096.0F));
        this.field536[0] = (int) (var2 * Math.sin((double) ((float) this.field546 / 4096.0F)) * 4096.0D);
        this.field536[1] = (int) (Math.cos((double) ((float) this.field546 / 4096.0F)) * var2 * 4096.0D);
        this.field536[2] = (int) (4096.0D * Math.sin((double) ((float) this.field543 / 4096.0F)));
        int var4 = this.field536[0] * this.field536[0] >> 12;
        int var5 = this.field536[1] * this.field536[1] >> 12;
        int var6 = this.field536[2] * this.field536[2] >> 12;
        int var7 = (int) (4096.0D * Math.sqrt((double) (var4 - -var5 + var6 >> 12)));
        if (~var7 != -1) {
            this.field536[0] = (this.field536[0] << 12) / var7;
            this.field536[1] = (this.field536[1] << 12) / var7;
            this.field536[2] = (this.field536[2] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IB)[I")
    public final int[] method75(int arg0, byte arg1) {
        ++field537;
        int[] var3 = super.field7494.method232(arg0, true);
        int var4 = -50 / ((43 - arg1) / 48);
        if (super.field7494.field474) {
            int var5 = class517.field7650 * this.field541 >> 12;
            int[] var6 = this.method3013(false, 0, arg0 + -1 & class270.field4492);
            int[] var7 = this.method3013(false, 0, arg0);
            int[] var8 = this.method3013(false, 0, arg0 + 1 & class270.field4492);
            for (int var9 = 0; class402.field6113 > var9; ++var9) {
                int var10 = (var8[var9] - var6[var9]) * var5 >> 12;
                int var11 = (var7[var9 + -1 & class269.field4478] + -var7[class269.field4478 & var9 + 1]) * var5 >> 12;
                int var12 = var11 >> 4;
                if (var12 < 0) {
                    var12 = -var12;
                }
                int var13 = var10 >> 4;
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                if (~var13 < -256) {
                    var13 = 255;
                }
                int var14 = 255 & class280.field4589[var12 - -((var13 + 1) * var13 >> 1)];
                int var15 = var11 * var14 >> 8;
                int var16 = var10 * var14 >> 8;
                int var17 = var14 * 4096 >> 8;
                int var18 = this.field536[0] * var15 >> 12;
                int var19 = this.field536[1] * var16 >> 12;
                int var20 = this.field536[2] * var17 >> 12;
                var3[var9] = var19 + var20 + var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hq", name = "f", descriptor = "(I)V")
    public static void method270(int arg0) {
        field540 = null;
        if (arg0 != -1) {
            field540 = null;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(ZZ)V")
    public static final void method271(boolean arg0, boolean arg1) {
        while (true) {
            if (~class506.field7365.method2152(-66, class195.field3050) <= -16) {
                int var2 = class506.field7365.method2155(15, 30390);
                if (~var2 != -32768) {
                    boolean var3 = false;
                    class505 var4 = (class505) class147.field2396.method2516((long) var2, -1);
                    if (var4 == null) {
                        class265 var5 = new class265();
                        var5.field3130 = var2;
                        var4 = new class505(var5);
                        class147.field2396.method2517(var4, (long) var2, (byte) 40);
                        class393.field6008[class353.field5506++] = var4;
                        var3 = true;
                    }
                    class265 var6 = var4.field7355;
                    class371.field5734[class86.field1471++] = var2;
                    var6.field3058 = class504.field7348;
                    if (var6.field4430 != null && var6.field4430.method2998(-1)) {
                        class265.method1766(true, var6);
                    }
                    var6.method1764(-1, class22.field239.method1085(class506.field7365.method2155(14, 30390), 537461692));
                    int var7;
                    if (!arg1) {
                        var7 = class506.field7365.method2155(5, 30390);
                        if (~var7 < -16) {
                            var7 -= 32;
                        }
                    } else {
                        var7 = class506.field7365.method2155(8, 30390);
                        if (~var7 < -128) {
                            var7 -= 256;
                        }
                    }
                    int var8 = class506.field7365.method2155(1, 30390);
                    int var9 = class506.field7365.method2155(2, 30390);
                    int var10 = class506.field7365.method2155(1, 30390);
                    if (var10 == 1) {
                        class387.field5962[class65.field961++] = var2;
                    }
                    int var11 = 14875 & 4 + class506.field7365.method2155(3, 30390) << 11;
                    int var12;
                    if (arg1) {
                        var12 = class506.field7365.method2155(8, 30390);
                        if (var12 > 127) {
                            var12 -= 256;
                        }
                    } else {
                        var12 = class506.field7365.method2155(5, 30390);
                        if (~var12 < -16) {
                            var12 -= 32;
                        }
                    }
                    var6.method1309(-13313, var6.field4430.field7416);
                    var6.field3135 = var6.field4430.field7411 << 3;
                    if (var3) {
                        var6.method1305(16383, true, var11);
                    }
                    var6.method1767(class302.field4850.field3159[0] + var7, ~var8 == -2, class302.field4850.field3158[0] + var12, -95, var6.method1143(0), var9);
                    if (var6.field4430.method2998(-1)) {
                        class465.method2768(var6.field4720, (byte) 92, (class166) null, 0, (class39) null, var6.field3159[0], var6, var6.field3158[0]);
                    }
                    continue;
                }
            }
            ++field535;
            class506.field7365.method2149(30795);
            if (arg0) {
                field540 = null;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lou;B)V")
    public static final void method272(class197 arg0, byte arg1) {
        ++field534;
        arg0.field3129 = 0;
        if (~arg0.field3078 != 0) {
            class145 var2 = class130.field2232.method634(-1271654143, arg0.field3078);
            if (var2 != null && var2.field2377 != null) {
                label402: {
                    ++arg0.field3105;
                    if (var2.field2377.length > arg0.field3128 && arg0.field3105 > var2.field2375[arg0.field3128]) {
                        ++arg0.field3128;
                        ++arg0.field3063;
                        arg0.field3105 = 1;
                        class172.method1167(arg0.field4714, arg0.field3128, arg0.field4720, arg0.field4716, class302.field4850 == arg0, var2, (byte) 106);
                    }
                    if (~arg0.field3128 <= ~var2.field2377.length) {
                        arg0.field3128 = 0;
                        arg0.field3105 = 0;
                        if (arg0.field3111) {
                            arg0.field3078 = arg0.method1308(-13076).method354((byte) -30);
                            if (~arg0.field3078 == 0) {
                                arg0.field3111 = false;
                                break label402;
                            }
                            var2 = class130.field2232.method634(-1271654143, arg0.field3078);
                        }
                        class172.method1167(arg0.field4714, arg0.field3128, arg0.field4720, arg0.field4716, class302.field4850 == arg0, var2, (byte) 43);
                    }
                    arg0.field3063 = arg0.field3128 + 1;
                    if (arg0.field3063 >= var2.field2377.length) {
                        arg0.field3063 = 0;
                    }
                }
            } else {
                arg0.field3111 = false;
                arg0.field3078 = -1;
            }
        }
        if (arg0.field3107 != -1 && class504.field7348 >= arg0.field3079) {
            class526 var3 = class30.field482.method2630((byte) 100, arg0.field3107);
            int var4 = var3.field7752;
            if (var4 != -1) {
                label404: {
                    class145 var5 = class130.field2232.method634(-1271654143, var4);
                    if (var3.field7743) {
                        if (var5.field2366 == 3) {
                            if (~arg0.field3154 < -1 && ~class504.field7348 <= ~arg0.field3138 && arg0.field3132 < class504.field7348) {
                                arg0.field3107 = -1;
                                break label404;
                            }
                        } else if (~var5.field2366 == -2 && arg0.field3154 > 0 && ~arg0.field3138 >= ~class504.field7348 && ~class504.field7348 < ~arg0.field3132) {
                            arg0.field3079 = class504.field7348 + 1;
                            break label404;
                        }
                    }
                    if (var5 != null && var5.field2377 != null) {
                        if (arg0.field3084 < 0) {
                            arg0.field3084 = 0;
                            class172.method1167(arg0.field4714, 0, arg0.field4720, arg0.field4716, class302.field4850 == arg0, var5, (byte) 103);
                        }
                        ++arg0.field3088;
                        if (arg0.field3084 < var5.field2377.length && var5.field2375[arg0.field3084] < arg0.field3088) {
                            arg0.field3088 = 1;
                            ++arg0.field3084;
                            class172.method1167(arg0.field4714, arg0.field3084, arg0.field4720, arg0.field4716, class302.field4850 == arg0, var5, (byte) 97);
                        }
                        if (~var5.field2377.length >= ~arg0.field3084) {
                            if (!var3.field7743) {
                                arg0.field3107 = -1;
                            } else {
                                arg0.field3084 -= var5.field2372;
                                ++arg0.field3089;
                                if (~var5.field2378 >= ~arg0.field3089) {
                                    arg0.field3107 = -1;
                                } else if (arg0.field3084 >= 0 && ~arg0.field3084 > ~var5.field2377.length) {
                                    class172.method1167(arg0.field4714, arg0.field3084, arg0.field4720, arg0.field4716, class302.field4850 == arg0, var5, (byte) 54);
                                } else {
                                    arg0.field3107 = -1;
                                }
                            }
                        }
                        arg0.field3113 = arg0.field3084 + 1;
                        if (~arg0.field3113 <= ~var5.field2377.length) {
                            if (!var3.field7743) {
                                arg0.field3113 = -1;
                            } else {
                                arg0.field3113 -= var5.field2372;
                                if (~var5.field2378 < ~(arg0.field3089 + 1)) {
                                    if (~arg0.field3113 > -1 || arg0.field3113 >= var5.field2377.length) {
                                        arg0.field3113 = -1;
                                    }
                                } else {
                                    arg0.field3113 = -1;
                                }
                            }
                        }
                    } else {
                        arg0.field3107 = -1;
                    }
                }
            } else {
                arg0.field3107 = -1;
            }
        }
        if (arg0.field3071 != -1 && class504.field7348 >= arg0.field3126) {
            class526 var6 = class30.field482.method2630((byte) 101, arg0.field3071);
            int var7 = var6.field7752;
            if (var7 == -1) {
                arg0.field3071 = -1;
            } else {
                label407: {
                    class145 var8 = class130.field2232.method634(-1271654143, var7);
                    if (var6.field7743) {
                        if (var8.field2366 == 3) {
                            if (arg0.field3154 > 0 && arg0.field3138 <= class504.field7348 && ~arg0.field3132 > ~class504.field7348) {
                                arg0.field3071 = -1;
                                break label407;
                            }
                        } else if (var8.field2366 == 1 && ~arg0.field3154 < -1 && class504.field7348 >= arg0.field3138 && class504.field7348 > arg0.field3132) {
                            arg0.field3126 = class504.field7348 + 1;
                            break label407;
                        }
                    }
                    if (var8 != null && var8.field2377 != null) {
                        if (~arg0.field3075 > -1) {
                            arg0.field3075 = 0;
                            class172.method1167(arg0.field4714, 0, arg0.field4720, arg0.field4716, class302.field4850 == arg0, var8, (byte) 58);
                        }
                        ++arg0.field3118;
                        if (var8.field2377.length > arg0.field3075 && var8.field2375[arg0.field3075] < arg0.field3118) {
                            arg0.field3118 = 1;
                            ++arg0.field3075;
                            class172.method1167(arg0.field4714, arg0.field3075, arg0.field4720, arg0.field4716, class302.field4850 == arg0, var8, (byte) 122);
                        }
                        if (var8.field2377.length <= arg0.field3075) {
                            if (!var6.field7743) {
                                arg0.field3071 = -1;
                            } else {
                                ++arg0.field3112;
                                arg0.field3075 -= var8.field2372;
                                if (~var8.field2378 < ~arg0.field3112) {
                                    if (arg0.field3075 >= 0 && arg0.field3075 < var8.field2377.length) {
                                        class172.method1167(arg0.field4714, arg0.field3075, arg0.field4720, arg0.field4716, class302.field4850 == arg0, var8, (byte) 91);
                                    } else {
                                        arg0.field3071 = -1;
                                    }
                                } else {
                                    arg0.field3071 = -1;
                                }
                            }
                        }
                        arg0.field3097 = arg0.field3075 - -1;
                        if (~arg0.field3097 <= ~var8.field2377.length) {
                            if (!var6.field7743) {
                                arg0.field3097 = -1;
                            } else {
                                arg0.field3097 -= var8.field2372;
                                if (~var8.field2378 < ~(arg0.field3112 + 1)) {
                                    if (arg0.field3097 < 0 || ~arg0.field3097 <= ~var8.field2377.length) {
                                        arg0.field3097 = -1;
                                    }
                                } else {
                                    arg0.field3097 = -1;
                                }
                            }
                        }
                    } else {
                        arg0.field3071 = -1;
                    }
                }
            }
        }
        if (~arg0.field3136 != 0 && arg0.field3098 <= 1) {
            class145 var9 = class130.field2232.method634(-1271654143, arg0.field3136);
            if (var9.field2366 != 3) {
                if (~var9.field2366 == -2 && arg0.field3154 > 0 && ~class504.field7348 <= ~arg0.field3138 && class504.field7348 > arg0.field3132) {
                    arg0.field3098 = 2;
                }
            } else if (arg0.field3154 > 0 && arg0.field3138 <= class504.field7348 && ~class504.field7348 < ~arg0.field3132) {
                arg0.field3136 = -1;
            }
        }
        if (arg0.field3136 != -1 && arg0.field3098 == 0) {
            class145 var10 = class130.field2232.method634(-1271654143, arg0.field3136);
            if (var10 != null && var10.field2377 != null) {
                ++arg0.field3083;
                if (~var10.field2377.length < ~arg0.field3125 && ~arg0.field3083 < ~var10.field2375[arg0.field3125]) {
                    ++arg0.field3125;
                    arg0.field3083 = 1;
                    class172.method1167(arg0.field4714, arg0.field3125, arg0.field4720, arg0.field4716, class302.field4850 == arg0, var10, (byte) 25);
                }
                if (~var10.field2377.length >= ~arg0.field3125) {
                    ++arg0.field3067;
                    arg0.field3125 -= var10.field2372;
                    if (~arg0.field3067 > ~var10.field2378) {
                        if (~arg0.field3125 <= -1 && var10.field2377.length > arg0.field3125) {
                            class172.method1167(arg0.field4714, arg0.field3125, arg0.field4720, arg0.field4716, class302.field4850 == arg0, var10, (byte) 52);
                        } else {
                            arg0.field3136 = -1;
                        }
                    } else {
                        arg0.field3136 = -1;
                    }
                }
                arg0.field3093 = arg0.field3125 + 1;
                if (arg0.field3093 >= var10.field2377.length) {
                    arg0.field3093 -= var10.field2372;
                    if (var10.field2378 <= arg0.field3067 + 1) {
                        arg0.field3093 = -1;
                    } else if (arg0.field3093 < 0 || var10.field2377.length <= arg0.field3093) {
                        arg0.field3093 = -1;
                    }
                }
                arg0.field3129 = var10.field2364;
            } else {
                arg0.field3136 = -1;
            }
        }
        if (arg0.field3098 > 0) {
            --arg0.field3098;
        }
        if (arg1 >= -56) {
            method272((class197) null, (byte) -9);
        }
        for (int var11 = 0; ~var11 > ~arg0.field3123.length; ++var11) {
            class63 var12 = arg0.field3123[var11];
            if (var12 != null) {
                if (~var12.field943 < -1) {
                    --var12.field943;
                } else {
                    class145 var13 = class130.field2232.method634(-1271654143, var12.field939);
                    if (var13 != null && var13.field2377 != null) {
                        ++var12.field940;
                        if (~var12.field942 > ~var13.field2377.length && ~var12.field940 < ~var13.field2375[var12.field942]) {
                            ++var12.field942;
                            var12.field940 = 1;
                            class172.method1167(arg0.field4714, var12.field942, arg0.field4720, arg0.field4716, class302.field4850 == arg0, var13, (byte) 80);
                        }
                        if (var12.field942 >= var13.field2377.length) {
                            ++var12.field947;
                            var12.field942 -= var13.field2372;
                            if (var13.field2378 <= var12.field947) {
                                arg0.field3123[var11] = null;
                            } else if (~var12.field942 <= -1 && ~var13.field2377.length < ~var12.field942) {
                                class172.method1167(arg0.field4714, var12.field942, arg0.field4720, arg0.field4716, class302.field4850 == arg0, var13, (byte) 102);
                            } else {
                                arg0.field3123[var11] = null;
                            }
                        }
                        var12.field945 = var12.field942 + 1;
                        if (var12.field945 >= var13.field2377.length) {
                            var12.field945 -= var13.field2372;
                            if (~(var12.field947 + 1) <= ~var13.field2378) {
                                var12.field945 = -1;
                            } else if (~var12.field945 > -1 || var13.field2377.length <= var12.field945) {
                                var12.field945 = -1;
                            }
                        }
                    } else {
                        arg0.field3123[var11] = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(ZILia;)V")
    public final void method71(boolean arg0, int arg1, class23 arg2) {
        ++field545;
        if (!arg0) {
            method268((byte) -116, (class196) null, (class491) null);
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field543 = arg2.method132(86);
                }
            } else {
                this.field546 = arg2.method132(96);
            }
        } else {
            this.field541 = arg2.method132(67);
        }
    }
}
