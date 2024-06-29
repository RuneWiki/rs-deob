import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class212 extends class577 {

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "Lqm;")
    private class154 field3275;

    @OriginalMember(owner = "client!oe", name = "y", descriptor = "Lre;")
    private class626 field3283;

    @OriginalMember(owner = "client!oe", name = "u", descriptor = "Lqfa;")
    private class106 field3279;

    @OriginalMember(owner = "client!oe", name = "L", descriptor = "I")
    private int field3294;

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "I")
    private int field3274;

    @OriginalMember(owner = "client!oe", name = "C", descriptor = "I")
    private int field3286;

    @OriginalMember(owner = "client!oe", name = "E", descriptor = "I")
    private int field3288;

    @OriginalMember(owner = "client!oe", name = "z", descriptor = "[[F")
    private float[][] field3284;

    @OriginalMember(owner = "client!oe", name = "x", descriptor = "[[F")
    private float[][] field3282;

    @OriginalMember(owner = "client!oe", name = "A", descriptor = "[[F")
    private float[][] field3285;

    @OriginalMember(owner = "client!oe", name = "w", descriptor = "I")
    private int field3281;

    @OriginalMember(owner = "client!oe", name = "K", descriptor = "Lso;")
    private class494 field3293;

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "Lnga;")
    private class538 field3272;

    @OriginalMember(owner = "client!oe", name = "D", descriptor = "Ljo;")
    private class353 field3287;

    @OriginalMember(owner = "client!oe", name = "F", descriptor = "Lkda;")
    private class408 field3289;

    @OriginalMember(owner = "client!oe", name = "I", descriptor = "Lgda;")
    private class61 field3292;

    @OriginalMember(owner = "client!oe", name = "r", descriptor = "Lei;")
    private class189 field3276;

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "Lei;")
    private class189 field3273;

    @OriginalMember(owner = "client!oe", name = "H", descriptor = "Lwv;")
    public static class37 field3291 = new class37(9, 7);

    @OriginalMember(owner = "client!oe", name = "O", descriptor = "Lau;")
    public static class768 field3297 = null;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!oe", name = "s", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!oe", name = "t", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!oe", name = "v", descriptor = "I")
    private int field3280;

    @OriginalMember(owner = "client!oe", name = "G", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!oe", name = "M", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!oe", name = "N", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!oe", name = "P", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(III[[ZB)V")
    public final void method1456(int arg0, int arg1, int arg2, boolean[][] arg3, byte arg4) {
        field3290++;
        if (this.field3289 == null || this.field3294 > (arg1 + arg2) || this.field3274 < arg1 - arg2 || this.field3286 > (arg0 + arg2) || (arg0 - arg2) > this.field3288) {
            return;
        }
        if (arg4 > -90) {
            this.field3284 = null;
        }
        for (int var6 = this.field3286; var6 <= this.field3288; var6++) {
            for (int var7 = this.field3294; var7 <= this.field3274; var7++) {
                int var8 = var7 - arg1;
                int var9 = var6 - arg0;
                if (var8 > -arg2 && arg2 > var8 && var9 > -arg2 && var9 < arg2 && arg3[arg2 + var8][arg2 + var9]) {
                    this.field3279.method788(106, (int) (this.field3275.method1057(false) * 255.0F) << 24);
                    this.field3279.method754(this.field3273, null, 113, this.field3276, null);
                    this.field3279.method781(5889, 0, this.field3289, 4, this.field3281);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(SI)V")
    private final void method1457(short arg0, int arg1) {
        field3298++;
        if (this.field3279.field1514) {
            this.field3293.method2957(arg0, 1267307848);
        } else {
            this.field3293.method2965(arg0, (byte) 58);
        }
        if (arg1 != 4) {
            method1459(-49);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BILaa;IIIILmea;Lha;)V")
    public static final void method1458(byte arg0, int arg1, class511 arg2, int arg3, int arg4, int arg5, int arg6, class451 arg7, class65 arg8) {
        if (arg0 <= 6) {
            method1462(-82, null, null);
        }
        field3270++;
        class413 var9 = class53.field669.method1231(52, arg6);
        if (var9 == null || !var9.field5647 || !var9.method2504((byte) 63, class537.field7727)) {
            return;
        }
        if (var9.field5629 != null) {
            int[] var10 = new int[var9.field5629.length];
            for (int var11 = 0; var11 < (var10.length / 2); var11++) {
                int var28;
                if (class416.field5704 == 4) {
                    var28 = (int) class758.field10460 & 0x3FFF;
                } else {
                    var28 = (int) class758.field10460 + class29.field416 & 0x3FFF;
                }
                int var29 = class376.field5186[var28];
                int var30 = class376.field5188[var28];
                if (class416.field5704 != 4) {
                    var30 = var30 * 256 / (class347.field4853 + 256);
                    var29 = var29 * 256 / (class347.field4853 + 256);
                }
                var10[var11 * 2] = ((var9.field5629[var11 * 2] * 4 + arg4) * var30 + (var9.field5629[var11 * 2 + 1] * 4 + arg5) * var29 >> 14) + (arg1 + (arg7.field6290 / 2));
                var10[var11 * 2 + 1] = arg3 + (arg7.field6288 / 2) - ((arg5 - -(var9.field5629[var11 * 2 - -1] * 4)) * var30 + -((var9.field5629[var11 * 2] * 4 + arg4) * var29) >> 14);
            }
            class322.method2072(arg8, var10, var9.field5639, arg7.field6254, arg7.field6320);
            if (var9.field5643 <= 0) {
                for (int var12 = 0; var12 < (var10.length / 2 - 1); var12++) {
                    arg8.method539(var10[var12 * 2], var10[var12 * 2 + 1], var10[var12 * 2 + 2], var10[var12 * 2 + 2 + 1], var9.field5652[var9.field5627[var12] & 0xFF], 1, arg2, arg1, arg3);
                }
                arg8.method539(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field5652[var9.field5627[var9.field5627.length - 1] & 0xFF], 1, arg2, arg1, arg3);
            } else {
                for (int var13 = 0; var13 < var10.length / 2 - 1; var13++) {
                    int var21 = var10[var13 * 2];
                    int var22 = var10[var13 * 2 + 1];
                    int var23 = var10[(var13 + 1) * 2];
                    int var24 = var10[(var13 + 1) * 2 + 1];
                    if (var23 < var21) {
                        int var25 = var21;
                        var21 = var23;
                        int var26 = var22;
                        var22 = var24;
                        var23 = var25;
                        var24 = var26;
                    } else if (var21 == var23 && var24 < var22) {
                        int var27 = var22;
                        var22 = var24;
                        var24 = var27;
                    }
                    arg8.method459(var21, var22, var23, var24, var9.field5652[var9.field5627[var13] & 0xFF], 1, arg2, arg1, arg3, var9.field5643, var9.field5619, var9.field5634);
                }
                int var14 = var10[var10.length - 2];
                int var15 = var10[var10.length - 1];
                int var16 = var10[0];
                int var17 = var10[1];
                if (var16 < var14) {
                    int var19 = var14;
                    int var20 = var15;
                    var14 = var16;
                    var16 = var19;
                    var15 = var17;
                    var17 = var20;
                } else if (var14 == var16 && var17 < var15) {
                    int var18 = var15;
                    var15 = var17;
                    var17 = var18;
                }
                arg8.method459(var14, var15, var16, var17, var9.field5652[var9.field5627[var9.field5627.length - 1] & 0xFF], 1, arg2, arg1, arg3, var9.field5643, var9.field5619, var9.field5634);
            }
        }
        class241 var31 = null;
        if (var9.field5625 != -1) {
            var31 = var9.method2506(false, 102, arg8);
            if (var31 != null) {
                class554.method3296(arg1, arg7, arg4, -28909, var31, arg2, arg5, arg3);
            }
        }
        if (var9.field5646 == null) {
            return;
        }
        int var32 = 0;
        if (var31 != null) {
            var32 = var31.method1502();
        }
        class66 var33 = class718.field9945;
        class6 var34 = class460.field6446;
        if (var9.field5623 == 1) {
            var34 = class368.field5111;
            var33 = class449.field6148;
        }
        if (var9.field5623 == 2) {
            var33 = class269.field3907;
            var34 = class395.field5431;
        }
        class786.method4307(var32, var34, arg3, true, var9.field5642, arg5, arg4, arg1, arg2, arg7, var9.field5646, var33);
        return;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
    public static void method1459(int arg0) {
        if (arg0 <= 71) {
            field3296 = 31;
        }
        field3297 = null;
        field3291 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)Z")
    public static final boolean method1460(int arg0, int arg1, int arg2) {
        field3277++;
        if (arg1 != 0) {
            field3291 = null;
        }
        return (arg0 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIIII)V")
    private final void method1461(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3271++;
        long var8 = -1L;
        int var10 = (arg1 << this.field3283.field4285) + arg2;
        int var11 = (arg6 << this.field3283.field4285) + arg0;
        int var12 = this.field3283.method1918(var10, (byte) 125, var11);
        if ((arg2 & 0x7F) == 0 || (arg0 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | ((long) var11 & 0xFFFFL) << 16;
            class577 var13 = this.field3287.method2242(var8, -1);
            if (var13 != null) {
                this.method1457(((class75) var13).field853, 4);
                return;
            }
        }
        short var14 = (short) (this.field3280++);
        if (var8 != -1L) {
            this.field3287.method2241(81, var8, new class75(var14));
        }
        float var15;
        float var16;
        float var17;
        if (arg2 == 0 && arg0 == 0) {
            var15 = this.field3282[arg3][arg5];
            var16 = this.field3285[arg3][arg5];
            var17 = this.field3284[arg3][arg5];
        } else if (this.field3283.field4284 == arg2 && arg0 == 0) {
            var15 = this.field3282[arg3 + 1][arg5];
            var17 = this.field3284[arg3 + 1][arg5];
            var16 = this.field3285[arg3 + 1][arg5];
        } else if (this.field3283.field4284 == arg2 && this.field3283.field4284 == arg0) {
            var17 = this.field3284[arg3 + 1][arg5 + 1];
            var16 = this.field3285[arg3 + 1][arg5 + 1];
            var15 = this.field3282[arg3 + 1][arg5 + 1];
        } else if (arg2 == 0 && this.field3283.field4284 == arg0) {
            var16 = this.field3285[arg3][arg5 + 1];
            var15 = this.field3282[arg3][arg5 + 1];
            var17 = this.field3284[arg3][arg5 + 1];
        } else {
            float var18 = (float) arg2 / (float) this.field3283.field4284;
            float var19 = (float) arg0 / (float) this.field3283.field4284;
            float var20 = this.field3282[arg3][arg5];
            float var21 = this.field3285[arg3][arg5];
            float var22 = this.field3284[arg3][arg5];
            float var23 = this.field3282[arg3 + 1][arg5];
            float var24 = this.field3285[arg3 + 1][arg5];
            float var25 = (this.field3282[arg3 + 1][arg5 + 1] - var23) * var18 + var23;
            float var26 = (this.field3285[arg3 + 1][arg5 + 1] - var24) * var18 + var24;
            float var27 = this.field3284[arg3 + 1][arg5];
            float var28 = (this.field3282[arg3][arg5 + 1] - var20) * var18 + var20;
            float var29 = (this.field3284[arg3][arg5 + 1] - var22) * var18 + var22;
            float var30 = (this.field3285[arg3][arg5 + 1] - var21) * var18 + var21;
            float var31 = (this.field3284[arg3 + 1][arg5 + 1] - var27) * var18 + var27;
            var16 = (var26 - var30) * var19 + var30;
            var15 = (var25 - var28) * var19 + var28;
            var17 = (var31 - var29) * var19 + var29;
        }
        float var32 = (float) (this.field3275.method1059(-6131) - var10);
        float var33 = (float) (this.field3275.method1055((byte) -71) - var12);
        float var34 = (float) (this.field3275.method1058(111) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var32 * var36;
        float var38 = var34 * var36;
        float var39 = var33 * var36;
        float var40 = var35 / (float) this.field3275.method1051((byte) -121);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var17 * var38 + var15 * var37 + var16 * var39;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (arg4 != 27356) {
            method1458((byte) -82, -110, null, -22, 61, 92, 32, null, null);
        }
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field3275.method1052(false);
        int var45 = (int) ((float) ((var44 & 0xFFF6CA) >> 16) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFF24) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field3279.field1514) {
            this.field3272.method3229((float) var10, (byte) 59);
            this.field3272.method3229((float) var12, (byte) 120);
            this.field3272.method3229((float) var11, (byte) 96);
        } else {
            this.field3272.method3232((float) var10, true);
            this.field3272.method3232((float) var12, true);
            this.field3272.method3232((float) var11, true);
        }
        this.field3272.method2952(0, var45);
        this.field3272.method2952(0, var46);
        this.field3272.method2952(0, var47);
        this.field3272.method2952(0, 255);
        this.method1457(var14, arg4 - 27352);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILmea;Lmea;)V")
    public static final void method1462(int arg0, class451 arg1, class451 arg2) {
        class452.field6349++;
        field3278++;
        class312 var3 = class353.method2245(class87.field971, class27.field402, (byte) 84);
        var3.field4445.method2959(arg1.field6222, (byte) 122);
        var3.field4445.method2992((byte) 127, arg1.field6183);
        var3.field4445.method2957(arg2.field6246, 1267307848);
        var3.field4445.method2957(arg1.field6246, 1267307848);
        if (arg0 != 15157) {
            field3296 = 7;
        }
        var3.field4445.method2990(255, arg2.field6183);
        var3.field4445.method2959(arg2.field6222, (byte) 99);
        class208.method1440(var3, arg0 - 15065);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method1463(int arg0, String arg1) {
        if (arg0 != 16) {
            method1462(-119, null, null);
        }
        field3295++;
        StringBuffer var2 = new StringBuffer();
        int var3 = arg1.length();
        for (int var4 = 0; var4 < var3; var4++) {
            char var5 = arg1.charAt(var4);
            if (var5 == '%' && (var4 + 2) < var3) {
                char var6 = arg1.charAt(var4 + 1);
                boolean var7 = false;
                int var8;
                if (var6 >= '0' && var6 <= '9') {
                    var8 = var6 - '0';
                } else if (var6 >= 'a' && var6 <= 'f') {
                    var8 = var6 + 10 - 97;
                } else {
                    if (var6 < 'A' || var6 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var8 = var6 + 10 - 65;
                }
                int var9 = var8 * 16;
                char var10 = arg1.charAt(var4 + 2);
                int var11;
                if (var10 >= '0' && var10 <= '9') {
                    var11 = var10 + var9 - '0';
                } else if (var10 >= 'a' && var10 <= 'f') {
                    var11 = var10 + var9 + 10 - 97;
                } else {
                    if (var10 < 'A' || var10 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var11 = var10 + var9 + '\n' - 65;
                }
                var4 += 2;
                if (var11 != 0 && class337.method2134((byte) var11, false)) {
                    var2.append(class583.method3412((byte) var11, (byte) -124));
                }
            } else if (var5 == '+') {
                var2.append(' ');
            } else {
                var2.append(var5);
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lqfa;Lre;Lqm;[I)V")
    public class212(class106 arg0, class626 arg1, class154 arg2, int[] arg3) {
        this.field3275 = arg2;
        this.field3283 = arg1;
        this.field3279 = arg0;
        int var5 = this.field3275.method1051((byte) 127) - (arg1.field4284 >> 1);
        this.field3294 = this.field3275.method1059(-6131) - var5 >> arg1.field4285;
        this.field3274 = var5 + this.field3275.method1059(-6131) >> arg1.field4285;
        this.field3286 = this.field3275.method1058(77) - var5 >> arg1.field4285;
        this.field3288 = var5 + this.field3275.method1058(123) >> arg1.field4285;
        int var6 = this.field3274 + 1 - this.field3294;
        int var7 = this.field3288 + 1 - this.field3286;
        this.field3284 = new float[var6 + 1][var7 + 1];
        this.field3282 = new float[var6 + 1][var7 + 1];
        this.field3285 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var25 = this.field3286 + var8;
            if (var25 > 0 && this.field3283.field4290 - 1 > var25) {
                for (int var26 = 0; var26 <= var6; var26++) {
                    int var27 = this.field3294 + var26;
                    if (var27 > 0 && var27 < (this.field3283.field4289 - 1)) {
                        int var28 = arg1.method1904(var25, (byte) 89, var27 + 1) - arg1.method1904(var25, (byte) -124, var27 - 1);
                        int var29 = arg1.method1904(var25 + 1, (byte) 65, var27) - arg1.method1904(var25 - 1, (byte) -120, var27);
                        float var30 = (float) (1.0D / Math.sqrt((double) (var28 * var28 - (-var29 * var29 - 65536))));
                        this.field3282[var26][var8] = (float) var28 * var30;
                        this.field3285[var26][var8] = var30 * -256.0F;
                        this.field3284[var26][var8] = (float) var29 * var30;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field3286; var10 <= this.field3288; var10++) {
            if (var10 >= 0 && arg1.field4290 > var10) {
                for (int var21 = this.field3294; var21 <= this.field3274; var21++) {
                    if (var21 >= 0 && var21 < arg1.field4289) {
                        int var22 = arg3[var9];
                        int[] var23 = arg1.field8783[var21][var10];
                        if (var23 != null && var22 != 0) {
                            if (var22 == 1) {
                                int var24 = 0;
                                while (var23.length > var24) {
                                    if (var23[var24++] != -1 && var23[var24++] != -1 && var23[var24++] != -1) {
                                        this.field3281 += 3;
                                    }
                                }
                            } else {
                                this.field3281 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field3274 - this.field3294;
            }
        }
        if (this.field3281 > 0) {
            this.field3293 = new class494(this.field3281 * 2);
            this.field3272 = new class538(this.field3281 * 16);
            this.field3287 = new class353(class433.method2595(this.field3281, (byte) -82));
            int var11 = 0;
            int var12 = 0;
            for (int var13 = this.field3286; var13 <= this.field3288; var13++) {
                if (var13 >= 0 && arg1.field4290 > var13) {
                    int var14 = 0;
                    for (int var15 = this.field3294; var15 <= this.field3274; var15++) {
                        if (var15 >= 0 && var15 < arg1.field4289) {
                            int var16 = arg3[var12];
                            int[] var17 = arg1.field8783[var15][var13];
                            if (var17 != null && var16 != 0) {
                                if (var16 == 1) {
                                    int[] var18 = arg1.field8763[var15][var13];
                                    int[] var19 = arg1.field8773[var15][var13];
                                    int var20 = 0;
                                    label110: while (true) {
                                        while (true) {
                                            if (var20 >= var17.length) {
                                                break label110;
                                            }
                                            if (var17[var20] == -1 || var17[var20 + 1] == -1 || var17[var20 + 2] == -1) {
                                                var20 += 3;
                                            } else {
                                                this.method1461(var19[var20], var15, var18[var20], var14, 27356, var11, var13);
                                                var20++;
                                                this.method1461(var19[var20], var15, var18[var20], var14, 27356, var11, var13);
                                                var20++;
                                                this.method1461(var19[var20], var15, var18[var20], var14, 27356, var11, var13);
                                                var20++;
                                            }
                                        }
                                    }
                                } else if (var16 == 3) {
                                    this.method1461(0, var15, 0, var14, 27356, var11, var13);
                                    this.method1461(0, var15, arg1.field4284, var14, 27356, var11, var13);
                                    this.method1461(arg1.field4284, var15, 0, var14, 27356, var11, var13);
                                } else if (var16 == 2) {
                                    this.method1461(0, var15, arg1.field4284, var14, 27356, var11, var13);
                                    this.method1461(arg1.field4284, var15, arg1.field4284, var14, 27356, var11, var13);
                                    this.method1461(0, var15, 0, var14, 27356, var11, var13);
                                } else if (var16 == 5) {
                                    this.method1461(arg1.field4284, var15, arg1.field4284, var14, 27356, var11, var13);
                                    this.method1461(arg1.field4284, var15, 0, var14, 27356, var11, var13);
                                    this.method1461(0, var15, arg1.field4284, var14, 27356, var11, var13);
                                } else if (var16 == 4) {
                                    this.method1461(arg1.field4284, var15, 0, var14, 27356, var11, var13);
                                    this.method1461(0, var15, 0, var14, 27356, var11, var13);
                                    this.method1461(arg1.field4284, var15, arg1.field4284, var14, 27356, var11, var13);
                                }
                            }
                        }
                        var12++;
                        var14++;
                    }
                } else {
                    var12 += this.field3274 - this.field3294;
                }
                var11++;
            }
            this.field3289 = this.field3279.method793(this.field3293.field7050, this.field3293.field7042, 5123, 64, false);
            this.field3292 = this.field3279.method794(16, false, 0, this.field3272.field7050, this.field3272.field7042);
            this.field3276 = new class189(this.field3292, 5126, 3, 0);
            this.field3273 = new class189(this.field3292, 5121, 4, 12);
        } else {
            this.field3276 = null;
            this.field3289 = null;
            this.field3273 = null;
            this.field3292 = null;
        }
        this.field3272 = null;
        this.field3293 = null;
        this.field3287 = null;
        this.field3282 = this.field3285 = this.field3284 = null;
    }
}
