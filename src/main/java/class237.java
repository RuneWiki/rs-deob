import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class237 extends class189 {

    @OriginalMember(owner = "client!dg", name = "K", descriptor = "Ljava/lang/Object;")
    private Object field3224;

    @OriginalMember(owner = "client!dg", name = "P", descriptor = "[I")
    public static int[] field3229 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!dg", name = "R", descriptor = "I")
    public static int field3231 = 0;

    @OriginalMember(owner = "client!dg", name = "Q", descriptor = "Z")
    public static boolean field3230 = false;

    @OriginalMember(owner = "client!dg", name = "O", descriptor = "Lhf;")
    public static class225 field3228 = new class225();

    @OriginalMember(owner = "client!dg", name = "A", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!dg", name = "E", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!dg", name = "H", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!dg", name = "I", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!dg", name = "L", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!dg", name = "M", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!dg", name = "N", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!dg", name = "S", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!dg", name = "J", descriptor = "[[B")
    public static byte[][] field3223;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIBILtm;Lrg;I)V")
    public static final void method1490(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, class220 arg6, class383 arg7, int arg8) {
        field3227++;
        if (arg4 != -101) {
            field3229 = null;
        }
        int var9 = arg3 * arg3 + (arg8 * arg8);
        if (var9 > arg0) {
            return;
        }
        int var10 = Math.min(arg7.field5431 / 2, arg7.field5491 / 2);
        if (var9 <= (var10 * var10)) {
            class209.method1360(arg7, (byte) -32, arg3, arg8, class276.field3746[arg5], arg2, arg1, arg6);
            return;
        }
        var10 -= 10;
        int var11;
        if (class123.field1731 == 4) {
            var11 = (int) class6.field98 & 0x3FFF;
        } else {
            var11 = (int) class6.field98 + class390.field5737 & 0x3FFF;
        }
        int var12 = class362.field5083[var11];
        int var13 = class362.field5082[var11];
        if (class123.field1731 != 4) {
            var13 = var13 * 256 / (class23.field312 + 256);
            var12 = var12 * 256 / (class23.field312 + 256);
        }
        int var14 = arg8 * var12 + (arg3 * var13) >> 15;
        int var15 = arg8 * var13 - (arg3 * var12) >> 15;
        double var16 = Math.atan2((double) var14, (double) var15);
        int var18 = (int) ((double) var10 * Math.sin(var16));
        int var19 = (int) ((double) var10 * Math.cos(var16));
        class197.field2730[arg5].method871((float) arg7.field5431 / 2.0F + (float) arg2 + (float) var18, (float) arg7.field5491 / 2.0F + (float) arg1 + (float) (-var19), 4096, (int) (-var16 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "(I)Ljava/lang/Object;")
    public final Object method1242(int arg0) {
        int var2 = -53 % ((-arg0 - 65) / 36);
        field3220++;
        return this.field3224;
    }

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "(I)I")
    public static final int method1491(int arg0) {
        field3219++;
        class190 var1 = class414.field6007;
        synchronized (class414.field6007) {
            if (arg0 != 3) {
                method1495(-8);
            }
            return class414.field6007.method1250(true);
        }
    }

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "(I)V")
    public static void method1492(int arg0) {
        field3229 = null;
        field3223 = null;
        if (arg0 == -19593) {
            field3228 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class237(Object arg0) {
        this.field3224 = arg0;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "([IILie;IIZI[IIIIIIII)I")
    public static final int method1493(int[] arg0, int arg1, class4 arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        for (int var15 = arg11; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class395.field5777[var15][var35] = 0;
                class137.field1949[var15][var35] = 99999999;
            }
        }
        field3232++;
        boolean var16;
        if (arg6 == 1) {
            var16 = class424.method2676(arg10, arg12, arg14, arg3, arg8, arg4, arg1, arg2, arg13, 92, arg9);
        } else if (arg6 == 2) {
            var16 = class261.method1605(arg8, arg3, arg2, arg10, arg12, arg4, arg9, arg14, arg13, (byte) 20, arg1);
        } else {
            var16 = class258.method1581(arg13, arg9, arg4, arg12, arg1, arg6, arg8, arg2, (byte) 77, arg14, arg3, arg10);
        }
        int var17 = arg13 - 64;
        int var18 = arg14 - 64;
        int var19 = class318.field4372;
        int var20 = class396.field5784;
        if (!var16) {
            if (!arg5) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg1 - var23; var24 <= (arg1 + var23); var24++) {
                for (int var25 = arg9 - var23; var25 <= (arg9 + var23); var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class137.field1949[var26][var27] < 100) {
                        int var28 = 0;
                        if (var24 < arg1) {
                            var28 = arg1 - var24;
                        } else if (arg8 + arg1 - 1 < var24) {
                            var28 = var24 - (arg1 + arg8 - 1);
                        }
                        int var29 = 0;
                        if (arg9 > var25) {
                            var29 = arg9 - var25;
                        } else if ((arg9 - (1 - arg12)) < var25) {
                            var29 = var25 + 1 - (arg9 + arg12);
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var30 < var21 || var21 == var30 && class137.field1949[var26][var27] < var22) {
                            var21 = var30;
                            var22 = class137.field1949[var26][var27];
                            var19 = var24;
                            var20 = var25;
                        }
                    }
                }
            }
            if (~var21 == Integer.MIN_VALUE) {
                return -1;
            }
        }
        if (arg13 == var19 && arg14 == var20) {
            return 0;
        }
        byte var31 = 0;
        class170.field2425[var31] = var19;
        int var37 = var31 + 1;
        class189.field2626[var31] = var20;
        int var32;
        int var33 = var32 = class395.field5777[var19 - var17][var20 - var18];
        while (arg13 != var19 || arg14 != var20) {
            if (var32 != var33) {
                var32 = var33;
                class170.field2425[var37] = var19;
                class189.field2626[var37++] = var20;
            }
            if ((var33 & 0x1) != 0) {
                var20++;
            } else if ((var33 & 0x4) != 0) {
                var20--;
            }
            if ((var33 & 0x2) != 0) {
                var19++;
            } else if ((var33 & 0x8) != 0) {
                var19--;
            }
            var33 = class395.field5777[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while (var37-- > 0) {
            arg7[var34] = class170.field2425[var37];
            arg0[var34++] = class189.field2626[var37];
            if (var34 >= arg7.length) {
                break;
            }
        }
        return var34;
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "(I)Z")
    public final boolean method1239(int arg0) {
        field3225++;
        if (arg0 != -1) {
            field3226 = -118;
        }
        return false;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILrg;Ljava/lang/String;)Ljava/lang/String;")
    public static final String method1494(int arg0, class383 arg1, String arg2) {
        field3222++;
        if (arg0 <= 64) {
            field3230 = false;
        }
        if (arg2.indexOf("%") == -1) {
            return arg2;
        }
        while (true) {
            int var3 = arg2.indexOf("%1");
            if (var3 == -1) {
                while (true) {
                    int var4 = arg2.indexOf("%2");
                    if (var4 == -1) {
                        while (true) {
                            int var5 = arg2.indexOf("%3");
                            if (var5 == -1) {
                                while (true) {
                                    int var6 = arg2.indexOf("%4");
                                    if (var6 == -1) {
                                        while (true) {
                                            int var7 = arg2.indexOf("%5");
                                            if (var7 == -1) {
                                                while (true) {
                                                    int var8 = arg2.indexOf("%dns");
                                                    if (var8 == -1) {
                                                        return arg2;
                                                    }
                                                    String var9 = "";
                                                    if (class236.field3213 != null) {
                                                        if (class236.field3213.field4070 == null) {
                                                            var9 = class429.method2702(19464, class236.field3213.field4069);
                                                        } else {
                                                            var9 = (String) class236.field3213.field4070;
                                                        }
                                                    }
                                                    arg2 = arg2.substring(0, var8) + var9 + arg2.substring(var8 + 4);
                                                }
                                            }
                                            arg2 = arg2.substring(0, var7) + class313.method1988((byte) 93, class276.method1693(false, 4, arg1)) + arg2.substring(var7 + 2);
                                        }
                                    }
                                    arg2 = arg2.substring(0, var6) + class313.method1988((byte) 93, class276.method1693(false, 3, arg1)) + arg2.substring(var6 + 2);
                                }
                            }
                            arg2 = arg2.substring(0, var5) + class313.method1988((byte) 93, class276.method1693(false, 2, arg1)) + arg2.substring(var5 + 2);
                        }
                    }
                    arg2 = arg2.substring(0, var4) + class313.method1988((byte) 93, class276.method1693(false, 1, arg1)) + arg2.substring(var4 + 2);
                }
            }
            arg2 = arg2.substring(0, var3) + class313.method1988((byte) 93, class276.method1693(false, 0, arg1)) + arg2.substring(var3 + 2);
        }
    }

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "(I)V")
    public static final void method1495(int arg0) {
        field3221++;
        if (arg0 != 4096) {
            method1492(125);
        }
        class240.field3335.method1249(1);
        class167.field2391.method1249(1);
    }
}
