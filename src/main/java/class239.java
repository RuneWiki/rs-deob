import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public class class239 extends class642 {

    @OriginalMember(owner = "client!ada", name = "E", descriptor = "I")
    private int field3138 = 0;

    @OriginalMember(owner = "client!ada", name = "I", descriptor = "I")
    private int field3142 = 1024;

    @OriginalMember(owner = "client!ada", name = "T", descriptor = "I")
    private int field3152 = 1024;

    @OriginalMember(owner = "client!ada", name = "H", descriptor = "I")
    private int field3141 = 1024;

    @OriginalMember(owner = "client!ada", name = "U", descriptor = "I")
    private int field3153 = 819;

    @OriginalMember(owner = "client!ada", name = "W", descriptor = "I")
    private int field3155 = 409;

    @OriginalMember(owner = "client!ada", name = "M", descriptor = "I")
    private int field3146 = 1024;

    @OriginalMember(owner = "client!ada", name = "P", descriptor = "I")
    private int field3148 = 0;

    @OriginalMember(owner = "client!ada", name = "X", descriptor = "I")
    private int field3156 = 2048;

    @OriginalMember(owner = "client!ada", name = "K", descriptor = "Z")
    public static boolean field3144 = false;

    @OriginalMember(owner = "client!ada", name = "V", descriptor = "[[I")
    public static int[][] field3154 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!ada", name = "D", descriptor = "Ljava/lang/String;")
    public static String field3137 = "";

    @OriginalMember(owner = "client!ada", name = "B", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!ada", name = "C", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!ada", name = "F", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!ada", name = "G", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!ada", name = "J", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!ada", name = "L", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!ada", name = "N", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!ada", name = "Q", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!ada", name = "R", descriptor = "I")
    private int field3150;

    @OriginalMember(owner = "client!ada", name = "S", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(IIIIIBIIII)V", line = 3)
    public static final void method1469(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg8 >= class175.field2455 && ~arg8 >= ~class375.field5631 && class175.field2455 <= arg6 && ~class375.field5631 <= ~arg6 && ~arg7 <= ~class175.field2455 && arg7 <= class375.field5631 && class175.field2455 <= arg9 && ~class375.field5631 <= ~arg9 && ~arg0 <= ~class323.field4704 && ~class148.field2106 <= ~arg0 && arg2 >= class323.field4704 && class148.field2106 >= arg2 && arg4 >= class323.field4704 && ~class148.field2106 <= ~arg4 && ~arg3 <= ~class323.field4704 && arg3 <= class148.field2106) {
            class315.method1956(arg2, arg7, arg3, -44, arg1, arg9, arg8, arg6, arg0, arg4);
        } else {
            class6.method36(arg4, arg3, arg0, arg9, (byte) 21, arg2, arg6, arg1, arg8, arg7);
        }
        ++field3149;
        if (arg5 >= -93) {
            method1473(93);
        }
    }

    @OriginalMember(owner = "client!ada", name = "f", descriptor = "(I)Lhd;", line = 20)
    public static final class310 method1470(int arg0) {
        ++field3143;
        try {
            if (arg0 != 2) {
                method1469(-111, 25, -20, -65, 17, (byte) 88, -105, 108, -98, 7);
            }
            return (class310) Class.forName("sba").newInstance();
        } catch (Throwable var1) {
            return new class450();
        }
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(IILmq;ILlr;)V", line = 36)
    public static final void method1471(int arg0, int arg1, class71 arg2, int arg3, class311 arg4) {
        ++field3147;
        byte var5 = -1;
        if (~(16 & arg3) != -1) {
            int var6 = arg4.method3115(29871);
            byte[] var7 = new byte[var6];
            class540 var8 = new class540(var7);
            arg4.method3155(var6, 0, var7, 0);
            class46.field715[arg0] = var8;
            arg2.method419(false, var8);
        }
        if (~(8 & arg3) != -1) {
            arg2.field1116 = arg4.method3172(32122);
            if (~arg2.field7436 == -1) {
                arg2.method2954((byte) 48, arg2.field1116);
                arg2.field1116 = -1;
            }
        }
        if ((arg3 & 16384) != 0) {
            int var9 = arg4.method3117(-76104736);
            int[] var10 = new int[var9];
            int[] var11 = new int[var9];
            int[] var12 = new int[var9];
            for (int var13 = 0; ~var9 < ~var13; ++var13) {
                int var14 = arg4.method3169(26488);
                if (~var14 == -65536) {
                    var14 = -1;
                }
                var10[var13] = var14;
                var11[var13] = arg4.method3166((byte) -85);
                var12[var13] = arg4.method3169(26488);
            }
            class30.method188(var12, var10, (byte) 100, arg2, var11);
        }
        if (~(131072 & arg3) != -1) {
            int var15 = class45.field685;
            int var16 = arg4.method3109(-2);
            int var17 = arg4.method3139(111);
            arg2.method2959(var16, -124, var17, var15);
        }
        if (~(arg3 & 256) != -1) {
            arg2.field7362 = arg4.method3145((byte) -121);
            if (~arg2.field7362.charAt(0) == -127) {
                arg2.field7362 = arg2.field7362.substring(1);
                class46.method275(arg2.method413(false, 0), 2, arg2.field7362, arg2.method417(true, true), 255, arg2.field1106, 0);
            } else if (class321.field4681 == arg2) {
                class46.method275(arg2.method413(false, 0), 2, arg2.field7362, arg2.method417(true, true), 255, arg2.field1106, 0);
            }
            arg2.field7410 = 0;
            arg2.field7416 = 0;
            arg2.field7386 = 150;
        }
        if (arg1 <= -76) {
            if (~(32 & arg3) != -1) {
                int var18 = arg4.method3169(26488);
                int var19 = arg4.method3147(-2);
                if (var18 == 65535) {
                    var18 = -1;
                }
                int var20 = arg4.method3166((byte) -126);
                arg2.method2966(-83, var20, var19, var18, false);
            }
            if ((arg3 & 64) != 0) {
                int[] var21 = new int[4];
                for (int var22 = 0; ~var22 > -5; ++var22) {
                    var21[var22] = arg4.method3172(32122);
                    if (var21[var22] == 65535) {
                        var21[var22] = -1;
                    }
                }
                int var23 = arg4.method3166((byte) -57);
                class551.method3215((byte) 63, arg2, var23, var21);
            }
            if ((4096 & arg3) != 0) {
                int var24 = arg4.method3169(26488);
                if (var24 == 65535) {
                    var24 = -1;
                }
                int var25 = arg4.method3141(4);
                int var26 = arg4.method3166((byte) -79);
                arg2.method2966(-123, var26, var25, var24, true);
            }
            if ((262144 & arg3) != 0) {
                int var27 = arg4.method3166((byte) -58);
                int[] var28 = new int[var27];
                int[] var29 = new int[var27];
                for (int var30 = 0; var30 < var27; ++var30) {
                    int var31 = arg4.method3172(32122);
                    if ((49152 & var31) != 49152) {
                        var28[var30] = var31;
                    } else {
                        int var32 = arg4.method3116(95);
                        var28[var30] = class151.method1076(var32, var31 << 16);
                    }
                    var29[var30] = arg4.method3168(65536);
                }
                arg2.method2964(0, var29, var28);
            }
            if (~(arg3 & 2048) != -1) {
                arg2.field1140 = ~arg4.method3166((byte) -120) == -2;
            }
            if ((512 & arg3) != 0) {
                var5 = arg4.method3173(68);
            }
            if ((1024 & arg3) != 0) {
                int var33 = arg4.method3169(26488);
                arg2.field7366 = arg4.method3166((byte) -58);
                arg2.field7364 = arg4.method3166((byte) -45);
                arg2.field7400 = 32767 & var33;
                arg2.field7335 = ~(32768 & var33) != -1;
                arg2.field7341 = class45.field685 + arg2.field7366 - -arg2.field7400;
            }
            if (~(arg3 & 2) != -1) {
                int var34 = arg4.method3109(-2);
                int var35 = arg4.method3139(108);
                arg2.method2959(var34, -110, var35, class45.field685);
                arg2.field7339 = class45.field685 + 300;
                arg2.field7330 = arg4.method3117(-76104736);
            }
            if ((arg3 & 128) != 0) {
                class647.field9308[arg0] = arg4.method3173(65);
            }
            if (~(65536 & arg3) != -1) {
                arg2.field7382 = arg4.method3156(6707);
                arg2.field7395 = arg4.method3156(6707);
                arg2.field7336 = arg4.method3128(32767);
                arg2.field7332 = (byte) arg4.method3166((byte) -87);
                arg2.field7337 = class45.field685 - -arg4.method3116(-120);
                arg2.field7421 = class45.field685 - -arg4.method3172(32122);
            }
            if (~(arg3 & 32768) != -1) {
                arg2.field7343 = arg4.method3156(6707);
                arg2.field7345 = arg4.method3173(36);
                arg2.field7397 = arg4.method3156(6707);
                arg2.field7350 = arg4.method3156(6707);
                arg2.field7359 = arg4.method3168(65536) - -class45.field685;
                arg2.field7411 = arg4.method3169(26488) - -class45.field685;
                arg2.field7425 = arg4.method3139(110);
                arg2.field7434 = 0;
                if (!arg2.field1108) {
                    arg2.field7343 += arg2.field7430[0];
                    arg2.field7397 += arg2.field7430[0];
                    arg2.field7345 += arg2.field7429[0];
                    arg2.field7436 = 1;
                    arg2.field7350 += arg2.field7429[0];
                } else {
                    arg2.field7436 = 0;
                    arg2.field7397 += arg2.field1132;
                    arg2.field7343 += arg2.field1132;
                    arg2.field7345 += arg2.field1135;
                    arg2.field7350 += arg2.field1135;
                }
            }
            if ((4 & arg3) != 0) {
                int var36 = arg4.method3116(-122);
                if (var36 == 65535) {
                    var36 = -1;
                }
                arg2.field7423 = var36;
            }
            if (arg2.field1108) {
                if (var5 == 127) {
                    arg2.method418(0, arg2.field1132, arg2.field1135);
                } else {
                    byte var37;
                    if (~var5 != 0) {
                        var37 = var5;
                    } else {
                        var37 = class647.field9308[arg0];
                    }
                    arg2.method421((byte) -125, arg2.field1135, arg2.field1132, var37);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ada", name = "<init>", descriptor = "()V", line = 328)
    public class239() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ada", name = "e", descriptor = "(I)V", line = 331)
    public final void method2(int arg0) {
        if (arg0 != 6276) {
            method1473(-73);
        }
        ++field3145;
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(ZI)I", line = 343)
    public static final int method1472(boolean arg0, int arg1) {
        if (arg0) {
            field3154 = null;
        }
        ++field3136;
        return 255 & arg1;
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(ILgk;B)V", line = 364)
    public final void method1(int arg0, class540 arg1, byte arg2) {
        ++field3139;
        if (arg2 < 29) {
            method1473(91);
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (arg0 != 6) {
                                    if (~arg0 != -8) {
                                        if (~arg0 == -9) {
                                            this.field3142 = arg1.method3169(26488);
                                        }
                                    } else {
                                        this.field3146 = arg1.method3169(26488);
                                    }
                                } else {
                                    this.field3148 = arg1.method3115(29871);
                                }
                            } else {
                                this.field3152 = arg1.method3169(26488);
                            }
                        } else {
                            this.field3153 = arg1.method3169(26488);
                        }
                    } else {
                        this.field3155 = arg1.method3169(26488);
                    }
                } else {
                    this.field3156 = arg1.method3169(26488);
                }
            } else {
                this.field3141 = arg1.method3169(26488);
            }
        } else {
            this.field3138 = arg1.method3115(29871);
        }
    }

    @OriginalMember(owner = "client!ada", name = "g", descriptor = "(I)V", line = 459)
    public static void method1473(int arg0) {
        field3137 = null;
        if (arg0 != 0) {
            field3144 = true;
        }
        field3154 = null;
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(ILjava/lang/String;Z)V", line = 472)
    public static final void method1474(int arg0, String arg1, boolean arg2) {
        class422.method2554(arg2, -1, -1, arg1, (byte) 124);
        int var3 = 28 % ((arg0 - 74) / 47);
        ++field3151;
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(Ljava/util/Random;II[[IZII)V", line = 482)
    private final void method1475(Random arg0, int arg1, int arg2, int[][] arg3, boolean arg4, int arg5, int arg6) {
        ++field3135;
        int var8 = this.field3142 <= 0 ? 4096 : 4096 - class339.method2095(true, arg0, this.field3142);
        int var9 = this.field3150 * this.field3146 >> 12;
        if (!arg4) {
            this.field3142 = -118;
        }
        int var10 = this.field3150 + -(~var9 < -1 ? class339.method2095(true, arg0, var9) : 0);
        if (~class338.field4909 >= ~arg6) {
            arg6 -= class338.field4909;
        }
        if (var10 <= 0) {
            if (class338.field4909 >= arg5 + arg6) {
                for (int var11 = 0; ~arg2 < ~var11; ++var11) {
                    class667.method3738(arg3[arg1 + var11], arg6, arg5, var8);
                }
            } else {
                int var12 = class338.field4909 - arg6;
                for (int var13 = 0; ~arg2 < ~var13; ++var13) {
                    int[] var14 = arg3[arg1 + var13];
                    class667.method3738(var14, arg6, var12, var8);
                    class667.method3738(var14, 0, -var12 + arg5, var8);
                }
            }
        } else if (~arg2 < -1 && ~arg5 < -1) {
            int var15 = arg5 / 2;
            int var16 = arg2 / 2;
            int var17 = var15 < var10 ? var15 : var10;
            int var18 = var16 >= var10 ? var10 : var16;
            int var19 = arg6 + var17;
            int var20 = -(var17 * 2) + arg5;
            for (int var21 = 0; ~var21 > ~arg2; ++var21) {
                int[] var22 = arg3[arg1 + var21];
                if (var18 > var21) {
                    int var23 = var8 * var21 / var18;
                    if (~this.field3148 != -1) {
                        for (int var24 = 0; ~var17 < ~var24; ++var24) {
                            int var25 = var8 * var24 / var17;
                            var22[class425.method2563(arg6 + var24, class412.field6121)] = var22[class425.method2563(-var24 + arg6 + arg5 + -1, class412.field6121)] = var23 <= var25 ? var23 : var25;
                        }
                    } else {
                        for (int var26 = 0; ~var17 < ~var26; ++var26) {
                            int var28 = var8 * var26 / var17;
                            var22[class425.method2563(class412.field6121, arg6 + var26)] = var22[class425.method2563(class412.field6121, -var26 + arg6 + arg5 + -1)] = var23 * var28 >> 12;
                        }
                    }
                    if (~class338.field4909 <= ~(var19 + var20)) {
                        class667.method3738(var22, var19, var20, var23);
                    } else {
                        int var27 = -var19 + class338.field4909;
                        class667.method3738(var22, var19, var27, var23);
                        class667.method3738(var22, 0, var20 - var27, var23);
                    }
                } else {
                    int var29 = arg2 - 1 + -var21;
                    if (~var18 < ~var29) {
                        int var30 = var8 * var29 / var18;
                        if (this.field3148 == 0) {
                            for (int var31 = 0; var17 > var31; ++var31) {
                                int var32 = var8 * var31 / var17;
                                var22[class425.method2563(arg6 + var31, class412.field6121)] = var22[class425.method2563(-var31 + arg6 + -1 + arg5, class412.field6121)] = var30 * var32 >> 12;
                            }
                        } else {
                            for (int var33 = 0; var17 > var33; ++var33) {
                                int var35 = var8 * var33 / var17;
                                var22[class425.method2563(class412.field6121, arg6 + var33)] = var22[class425.method2563(class412.field6121, arg6 - -arg5 + -var33 + -1)] = ~var35 <= ~var30 ? var30 : var35;
                            }
                        }
                        if (~(var19 + var20) >= ~class338.field4909) {
                            class667.method3738(var22, var19, var20, var30);
                        } else {
                            int var34 = -var19 + class338.field4909;
                            class667.method3738(var22, var19, var34, var30);
                            class667.method3738(var22, 0, -var34 + var20, var30);
                        }
                    } else {
                        for (int var36 = 0; var36 < var17; ++var36) {
                            var22[class425.method2563(class412.field6121, arg6 + var36)] = var22[class425.method2563(-var36 + arg6 + arg5 + -1, class412.field6121)] = var8 * var36 / var17;
                        }
                        if (~(var19 + var20) >= ~class338.field4909) {
                            class667.method3738(var22, var19, var20, var8);
                        } else {
                            int var37 = class338.field4909 - var19;
                            class667.method3738(var22, var19, var37, var8);
                            class667.method3738(var22, 0, -var37 + var20, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ada", name = "b", descriptor = "(II)[I", line = 680)
    public final int[] method3(int arg0, int arg1) {
        ++field3140;
        int[] var3 = super.field9216.method1185(arg0, arg1 ^ 103);
        if (arg1 != -9) {
            this.field3156 = -96;
        }
        if (super.field9216.field2418) {
            int[][] var4 = super.field9216.method1188(0);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class338.field4909 * this.field3141 >> 12;
            int var15 = class338.field4909 * this.field3156 >> 12;
            int var16 = class106.field1578 * this.field3155 >> 12;
            int var17 = class106.field1578 * this.field3153 >> 12;
            if (var17 <= 1) {
                return var4[arg0];
            } else {
                this.field3150 = class338.field4909 / 8 * this.field3152 >> 12;
                int var18 = class338.field4909 / var14 + 1;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field3138);
                while (true) {
                    while (true) {
                        int var22 = class339.method2095(true, var21, -var14 + var15) + var14;
                        int var23 = class339.method2095(true, var21, var17 - var16) + var16;
                        int var24 = var8 - -var22;
                        if (~class338.field4909 > ~var24) {
                            var22 = -var8 + class338.field4909;
                            var24 = class338.field4909;
                        }
                        int var30;
                        if (var11) {
                            var30 = 0;
                        } else {
                            int var25 = var9;
                            int[] var26 = var20[var9];
                            int var27 = 0;
                            int var28 = var24 - -var5;
                            if (~var28 > -1) {
                                var28 += class338.field4909;
                            }
                            if (~class338.field4909 > ~var28) {
                                var28 -= class338.field4909;
                            }
                            while (true) {
                                int[] var29 = var20[var25];
                                if (~var28 <= ~var29[0] && var28 <= var29[1]) {
                                    var30 = var26[2];
                                    if (~var9 != ~var25) {
                                        int var31 = var5 + var8;
                                        if (~var31 > -1) {
                                            var31 += class338.field4909;
                                        }
                                        if (~class338.field4909 > ~var31) {
                                            var31 -= class338.field4909;
                                        }
                                        for (int var32 = 1; ~var32 >= ~var27; ++var32) {
                                            int[] var40 = var20[(var9 + var32) % var12];
                                            var30 = Math.max(var30, var40[2]);
                                        }
                                        for (int var33 = 0; var27 >= var33; ++var33) {
                                            int[] var34 = var20[(var9 - -var33) % var12];
                                            int var35 = var34[2];
                                            if (~var30 != ~var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (~var28 < ~var31) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var28, var37);
                                                } else if (var36 == 0) {
                                                    var38 = 0;
                                                    var39 = Math.min(var28, var37);
                                                } else {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = class338.field4909;
                                                }
                                                this.method1475(var21, var35, -var35 + var30, var4, true, -var38 + var39, var38 - -var7);
                                            }
                                        }
                                    }
                                    var9 = var25;
                                    break;
                                }
                                ++var25;
                                if (var25 >= var12) {
                                    var25 = 0;
                                }
                                ++var27;
                            }
                        }
                        if (var23 + var30 > class106.field1578) {
                            var23 = -var30 + class106.field1578;
                        } else {
                            var10 = false;
                        }
                        if (~class338.field4909 == ~var24) {
                            this.method1475(var21, var30, var23, var4, true, var22, var6 + var8);
                            if (var10) {
                                return var3;
                            }
                            var10 = true;
                            int[] var41 = var19[var13++];
                            var41[2] = var23 + var30;
                            var41[1] = var24;
                            var41[0] = var8;
                            int[][] var42 = var20;
                            var20 = var19;
                            var12 = var13;
                            var19 = var42;
                            var13 = 0;
                            var7 = var6;
                            var6 = class339.method2095(true, var21, class338.field4909);
                            var8 = 0;
                            var5 = -var7 + var6;
                            int var43 = var5;
                            if (~var5 > -1) {
                                var43 = class338.field4909 + var5;
                            }
                            if (~var43 < ~class338.field4909) {
                                var43 -= class338.field4909;
                            }
                            var9 = 0;
                            while (true) {
                                int[] var44 = var20[var9];
                                if (~var43 <= ~var44[0] && ~var44[1] <= ~var43) {
                                    var11 = false;
                                    break;
                                }
                                int var10000 = ~var12;
                                ++var9;
                                if (var10000 >= ~var9) {
                                    var9 = 0;
                                }
                            }
                        } else {
                            int[] var45 = var19[var13++];
                            var45[2] = var23 + var30;
                            var45[1] = var24;
                            var45[0] = var8;
                            this.method1475(var21, var30, var23, var4, true, var22, var6 + var8);
                            var8 = var24;
                        }
                    }
                }
            }
        } else {
            return var3;
        }
    }
}
