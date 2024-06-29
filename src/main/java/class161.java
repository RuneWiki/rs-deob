import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class161 extends class417 {

    @OriginalMember(owner = "client!ov", name = "i", descriptor = "Lsb;")
    private class244 field2373;

    @OriginalMember(owner = "client!ov", name = "s", descriptor = "Lnm;")
    private class405 field2383;

    @OriginalMember(owner = "client!ov", name = "r", descriptor = "Lte;")
    private class527 field2382;

    @OriginalMember(owner = "client!ov", name = "l", descriptor = "I")
    private int field2376;

    @OriginalMember(owner = "client!ov", name = "n", descriptor = "I")
    private int field2378;

    @OriginalMember(owner = "client!ov", name = "B", descriptor = "I")
    private int field2392;

    @OriginalMember(owner = "client!ov", name = "H", descriptor = "I")
    private int field2397;

    @OriginalMember(owner = "client!ov", name = "A", descriptor = "[[F")
    private float[][] field2391;

    @OriginalMember(owner = "client!ov", name = "w", descriptor = "[[F")
    private float[][] field2387;

    @OriginalMember(owner = "client!ov", name = "o", descriptor = "[[F")
    private float[][] field2379;

    @OriginalMember(owner = "client!ov", name = "m", descriptor = "Lmj;")
    private class562 field2377;

    @OriginalMember(owner = "client!ov", name = "t", descriptor = "Lsp;")
    private class544 field2384;

    @OriginalMember(owner = "client!ov", name = "j", descriptor = "Lmaa;")
    private class403 field2374;

    @OriginalMember(owner = "client!ov", name = "v", descriptor = "Lmaa;")
    private class403 field2386;

    @OriginalMember(owner = "client!ov", name = "I", descriptor = "Lgw;")
    private class148 field2398;

    @OriginalMember(owner = "client!ov", name = "z", descriptor = "Leo;")
    private class247 field2390;

    @OriginalMember(owner = "client!ov", name = "E", descriptor = "Llb;")
    private class465 field2394;

    @OriginalMember(owner = "client!ov", name = "k", descriptor = "I")
    public static int field2375 = 0;

    @OriginalMember(owner = "client!ov", name = "q", descriptor = "Lada;")
    public static class144 field2381 = new class144(12, 8);

    @OriginalMember(owner = "client!ov", name = "p", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!ov", name = "u", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!ov", name = "x", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!ov", name = "y", descriptor = "I")
    private int field2389;

    @OriginalMember(owner = "client!ov", name = "D", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!ov", name = "F", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!ov", name = "G", descriptor = "I")
    private int field2396;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIIIIII)V")
    private final void method1151(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2395++;
        long var8 = -1L;
        int var10 = arg1 + (arg5 << this.field2373.field2695);
        int var11 = arg0 + (arg2 << this.field2373.field2695);
        int var12 = this.field2373.method1233(var10, var11);
        if ((arg1 & 0x7F) == 0 || (arg0 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | ((long) var11 & 0xFFFFL) << 16;
            class417 var13 = this.field2394.method2799(var8, true);
            if (var13 != null) {
                this.method1153((byte) 29, ((class207) var13).field3076);
                return;
            }
        }
        short var14 = (short) (this.field2396++);
        if (var8 != -1L) {
            this.field2394.method2797(-4234, new class207(var14), var8);
        }
        float var15;
        float var16;
        float var17;
        if (arg1 == 0 && arg0 == 0) {
            var15 = this.field2391[arg3][arg6];
            var16 = this.field2379[arg3][arg6];
            var17 = this.field2387[arg3][arg6];
        } else if (this.field2373.field2694 == arg1 && arg0 == 0) {
            var15 = this.field2391[arg3 + 1][arg6];
            var16 = this.field2379[arg3 + 1][arg6];
            var17 = this.field2387[arg3 + 1][arg6];
        } else if (this.field2373.field2694 == arg1 && this.field2373.field2694 == arg0) {
            var17 = this.field2387[arg3 + 1][arg6 + 1];
            var15 = this.field2391[arg3 + 1][arg6 + 1];
            var16 = this.field2379[arg3 + 1][arg6 + 1];
        } else if (arg1 == 0 && this.field2373.field2694 == arg0) {
            var15 = this.field2391[arg3][arg6 + 1];
            var16 = this.field2379[arg3][arg6 + 1];
            var17 = this.field2387[arg3][arg6 + 1];
        } else {
            float var18 = (float) arg1 / (float) this.field2373.field2694;
            float var19 = (float) arg0 / (float) this.field2373.field2694;
            float var20 = this.field2379[arg3][arg6];
            float var21 = this.field2391[arg3][arg6];
            float var22 = this.field2387[arg3][arg6];
            float var23 = this.field2379[arg3 + 1][arg6];
            float var24 = this.field2391[arg3 + 1][arg6];
            float var25 = (this.field2391[arg3][arg6 + 1] - var21) * var18 + var21;
            float var26 = (this.field2391[arg3 + 1][arg6 + 1] - var24) * var18 + var24;
            float var27 = this.field2387[arg3 + 1][arg6];
            float var28 = (this.field2387[arg3][arg6 + 1] - var22) * var18 + var22;
            float var29 = (this.field2379[arg3 + 1][arg6 + 1] - var23) * var18 + var23;
            float var30 = (this.field2379[arg3][arg6 + 1] - var20) * var18 + var20;
            var16 = (var29 - var30) * var19 + var30;
            float var31 = (this.field2387[arg3 + 1][arg6 + 1] - var27) * var18 + var27;
            var15 = (var26 - var25) * var19 + var25;
            var17 = (var31 - var28) * var19 + var28;
        }
        float var32 = (float) (this.field2383.method2388((byte) 66) - var10);
        float var33 = (float) (this.field2383.method2383(2039035457) - var12);
        float var34 = (float) (this.field2383.method2389(-10161) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var33 * var36;
        float var38 = var32 * var36;
        float var39 = var34 * var36;
        float var40 = var35 / (float) this.field2383.method2390(6042);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var17 * var39 + var15 * var37 + var16 * var38;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field2383.method2384(630);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (arg4 <= 93) {
            method1152(-114);
        }
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field2382.field7842) {
            this.field2390.method1564(0, (float) var10);
            this.field2390.method1564(0, (float) var12);
            this.field2390.method1564(0, (float) var11);
        } else {
            this.field2390.method1563(true, (float) var10);
            this.field2390.method1563(true, (float) var12);
            this.field2390.method1563(true, (float) var11);
        }
        this.field2390.method1049(-1, var45);
        this.field2390.method1049(-1, var46);
        this.field2390.method1049(-1, var47);
        this.field2390.method1049(-1, 255);
        this.method1153((byte) 29, var14);
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)V")
    public static void method1152(int arg0) {
        field2381 = null;
        if (arg0 != -1) {
            field2385 = 44;
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(BS)V")
    private final void method1153(byte arg0, short arg1) {
        field2380++;
        if (this.field2382.field7842) {
            this.field2398.method1027(255, arg1);
        } else {
            this.field2398.method1057(arg1, (byte) 85);
        }
        this.field2389++;
        if (arg0 != 29) {
            this.field2392 = 32;
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(I[[ZBII)V")
    public final void method1154(int arg0, boolean[][] arg1, byte arg2, int arg3, int arg4) {
        int var6 = -97 % ((arg2 - 44) / 52);
        field2388++;
        if (this.field2377 == null || (arg0 + arg4) < this.field2376 || (arg4 - arg0) > this.field2378 || (arg0 + arg3) < this.field2392 || arg3 - arg0 > this.field2397) {
            return;
        }
        for (int var7 = this.field2392; var7 <= this.field2397; var7++) {
            for (int var8 = this.field2376; var8 <= this.field2378; var8++) {
                int var9 = var8 - arg4;
                int var10 = var7 - arg3;
                if (var9 > (-arg0) && var9 < arg0 && -arg0 < var10 && var10 < arg0 && arg1[arg0 + var9][arg0 + var10]) {
                    this.field2382.method3115(true, (int) (this.field2383.method2382(0) * 255.0F) << 24);
                    this.field2382.method3164(null, (byte) -82, this.field2386, null, this.field2374);
                    this.field2382.method3170(0, 23, 4, this.field2389, this.field2377);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Lte;Lsb;Lnm;[I)V")
    public class161(class527 arg0, class244 arg1, class405 arg2, int[] arg3) {
        this.field2373 = arg1;
        this.field2383 = arg2;
        this.field2382 = arg0;
        int var5 = this.field2383.method2390(6042) - (arg1.field2694 >> 1);
        this.field2376 = this.field2383.method2388((byte) -104) - var5 >> arg1.field2695;
        this.field2378 = this.field2383.method2388((byte) -91) + var5 >> arg1.field2695;
        this.field2392 = this.field2383.method2389(-10161) - var5 >> arg1.field2695;
        this.field2397 = this.field2383.method2389(-10161) + var5 >> arg1.field2695;
        int var6 = this.field2378 - (this.field2376 - 1);
        int var7 = this.field2397 - (this.field2392 - 1);
        this.field2391 = new float[var6 + 1][var7 + 1];
        this.field2387 = new float[var6 + 1][var7 + 1];
        this.field2379 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var24 = this.field2392 + var8;
            if (var24 > 0 && this.field2373.field2693 - 1 > var24) {
                for (int var25 = 0; var25 <= var6; var25++) {
                    int var26 = this.field2376 + var25;
                    if (var26 > 0 && var26 < (this.field2373.field2697 - 1)) {
                        int var27 = arg1.method1239(var26 + 1, var24) - arg1.method1239(var26 - 1, var24);
                        int var28 = arg1.method1239(var26, var24 + 1) - arg1.method1239(var26, var24 - 1);
                        float var29 = (float) (1.0D / Math.sqrt((double) (var27 * var27 + (var28 * var28) + 65536)));
                        this.field2379[var25][var8] = (float) var27 * var29;
                        this.field2391[var25][var8] = var29 * -256.0F;
                        this.field2387[var25][var8] = (float) var28 * var29;
                    }
                }
            }
        }
        int var9 = 0;
        int var10 = 0;
        for (int var11 = this.field2392; var11 <= this.field2397; var11++) {
            if (var11 >= 0 && var11 < arg1.field2693) {
                for (int var21 = this.field2376; var21 <= this.field2378; var21++) {
                    if (var21 >= 0 && arg1.field2697 > var21) {
                        int var22 = arg3[var10];
                        int[] var23 = arg1.field3512[var21][var11];
                        if (var23 != null && var22 != 0) {
                            if (var22 == 1) {
                                var9 += var23.length;
                            } else {
                                var9 += 3;
                            }
                        }
                    }
                    var10++;
                }
            } else {
                var10 += this.field2378 - this.field2376;
            }
        }
        if (var9 <= 0) {
            this.field2377 = null;
            this.field2384 = null;
            this.field2374 = null;
            this.field2386 = null;
        } else {
            this.field2398 = new class148(var9 * 2);
            this.field2390 = new class247(var9 * 16);
            this.field2394 = new class465(class322.method1938(var9, 101));
            int var12 = 0;
            int var13 = 0;
            for (int var14 = this.field2392; var14 <= this.field2397; var14++) {
                if (var14 >= 0 && var14 < arg1.field2693) {
                    int var15 = 0;
                    for (int var16 = this.field2376; var16 <= this.field2378; var16++) {
                        if (var16 >= 0 && var16 < arg1.field2697) {
                            int var17 = arg3[var13];
                            int[] var18 = arg1.field3512[var16][var14];
                            int[] var19 = arg1.field3484[var16][var14];
                            if (var18 != null && var17 != 0) {
                                if (var17 == 1) {
                                    for (int var20 = 0; var20 < var18.length; var20++) {
                                        this.method1151(var19[var20], var18[var20], var14, var15, 99, var16, var12);
                                    }
                                } else if (var17 == 3) {
                                    this.method1151(0, 0, var14, var15, 95, var16, var12);
                                    this.method1151(0, arg1.field2694, var14, var15, 99, var16, var12);
                                    this.method1151(arg1.field2694, 0, var14, var15, 107, var16, var12);
                                } else if (var17 == 2) {
                                    this.method1151(0, arg1.field2694, var14, var15, 103, var16, var12);
                                    this.method1151(arg1.field2694, arg1.field2694, var14, var15, 96, var16, var12);
                                    this.method1151(0, 0, var14, var15, 106, var16, var12);
                                } else if (var17 == 5) {
                                    this.method1151(arg1.field2694, arg1.field2694, var14, var15, 98, var16, var12);
                                    this.method1151(arg1.field2694, 0, var14, var15, 110, var16, var12);
                                    this.method1151(0, arg1.field2694, var14, var15, 127, var16, var12);
                                } else if (var17 == 4) {
                                    this.method1151(arg1.field2694, 0, var14, var15, 103, var16, var12);
                                    this.method1151(0, 0, var14, var15, 98, var16, var12);
                                    this.method1151(arg1.field2694, arg1.field2694, var14, var15, 109, var16, var12);
                                }
                            }
                        }
                        var13++;
                        var15++;
                    }
                } else {
                    var13 += this.field2378 - this.field2376;
                }
                var12++;
            }
            this.field2377 = this.field2382.method3138(this.field2398.field2146, this.field2398.field2177, (byte) 69, 5123, false);
            this.field2384 = this.field2382.method3180(this.field2390.field2146, false, (byte) 123, this.field2390.field2177, 16);
            this.field2386 = new class403(this.field2384, 5126, 3, 0);
            this.field2374 = new class403(this.field2384, 5121, 4, 12);
        }
        this.field2398 = null;
        this.field2394 = null;
        this.field2379 = this.field2391 = this.field2387 = null;
        this.field2390 = null;
    }

    @OriginalMember(owner = "client!ov", name = "c", descriptor = "(II)V")
    public static final void method1155(int arg0, int arg1) {
        field2393++;
        class221 var2 = class65.method413(arg0, arg1, (byte) 100);
        var2.method1432(0);
    }
}
