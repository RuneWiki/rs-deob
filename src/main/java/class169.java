import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class169 extends class92 {

    @OriginalMember(owner = "client!sf", name = "eb", descriptor = "I")
    public int field3348 = 0;

    @OriginalMember(owner = "client!sf", name = "Kb", descriptor = "I")
    public int field3380 = 0;

    @OriginalMember(owner = "client!sf", name = "cb", descriptor = "B")
    public byte field3346 = 0;

    @OriginalMember(owner = "client!sf", name = "hb", descriptor = "Z")
    private boolean field3351 = false;

    @OriginalMember(owner = "client!sf", name = "Fb", descriptor = "I")
    public int field3375;

    @OriginalMember(owner = "client!sf", name = "mb", descriptor = "[I")
    public int[] field3356;

    @OriginalMember(owner = "client!sf", name = "Rb", descriptor = "[I")
    public int[] field3387;

    @OriginalMember(owner = "client!sf", name = "wb", descriptor = "[I")
    public int[] field3366;

    @OriginalMember(owner = "client!sf", name = "gb", descriptor = "[I")
    private int[] field3350;

    @OriginalMember(owner = "client!sf", name = "Z", descriptor = "[I")
    public int[] field3343;

    @OriginalMember(owner = "client!sf", name = "Eb", descriptor = "[I")
    public int[] field3374;

    @OriginalMember(owner = "client!sf", name = "Hb", descriptor = "[I")
    public int[] field3377;

    @OriginalMember(owner = "client!sf", name = "Lb", descriptor = "[B")
    public byte[] field3381;

    @OriginalMember(owner = "client!sf", name = "Nb", descriptor = "[B")
    public byte[] field3383;

    @OriginalMember(owner = "client!sf", name = "Qb", descriptor = "[B")
    public byte[] field3386;

    @OriginalMember(owner = "client!sf", name = "rb", descriptor = "[I")
    private int[] field3361;

    @OriginalMember(owner = "client!sf", name = "Gb", descriptor = "[S")
    public short[] field3376;

    @OriginalMember(owner = "client!sf", name = "vb", descriptor = "[B")
    public byte[] field3365;

    @OriginalMember(owner = "client!sf", name = "Sb", descriptor = "[S")
    public short[] field3388;

    @OriginalMember(owner = "client!sf", name = "kb", descriptor = "[B")
    public byte[] field3354;

    @OriginalMember(owner = "client!sf", name = "tb", descriptor = "[S")
    public short[] field3363;

    @OriginalMember(owner = "client!sf", name = "Cb", descriptor = "[S")
    public short[] field3372;

    @OriginalMember(owner = "client!sf", name = "Ob", descriptor = "[S")
    public short[] field3384;

    @OriginalMember(owner = "client!sf", name = "Y", descriptor = "[S")
    private short[] field3342;

    @OriginalMember(owner = "client!sf", name = "Bb", descriptor = "[S")
    private short[] field3371;

    @OriginalMember(owner = "client!sf", name = "ub", descriptor = "[S")
    private short[] field3364;

    @OriginalMember(owner = "client!sf", name = "qb", descriptor = "[B")
    private byte[] field3360;

    @OriginalMember(owner = "client!sf", name = "Mb", descriptor = "[B")
    private byte[] field3382;

    @OriginalMember(owner = "client!sf", name = "X", descriptor = "[B")
    private byte[] field3341;

    @OriginalMember(owner = "client!sf", name = "db", descriptor = "[B")
    private byte[] field3347;

    @OriginalMember(owner = "client!sf", name = "lb", descriptor = "[B")
    private byte[] field3355;

    @OriginalMember(owner = "client!sf", name = "Ab", descriptor = "[[I")
    public int[][] field3370;

    @OriginalMember(owner = "client!sf", name = "Pb", descriptor = "[[I")
    public int[][] field3385;

    @OriginalMember(owner = "client!sf", name = "yb", descriptor = "[Lue;")
    public class186[] field3368;

    @OriginalMember(owner = "client!sf", name = "zb", descriptor = "[Lld;")
    public class104[] field3369;

    @OriginalMember(owner = "client!sf", name = "bb", descriptor = "[Lue;")
    public class186[] field3345;

    @OriginalMember(owner = "client!sf", name = "Db", descriptor = "S")
    public short field3373;

    @OriginalMember(owner = "client!sf", name = "nb", descriptor = "S")
    public short field3357;

    @OriginalMember(owner = "client!sf", name = "ab", descriptor = "[I")
    private static int[] field3344 = class135.field2798;

    @OriginalMember(owner = "client!sf", name = "ob", descriptor = "[I")
    private static int[] field3358 = class135.field2797;

    @OriginalMember(owner = "client!sf", name = "Ib", descriptor = "[I")
    private static int[] field3378 = new int[10000];

    @OriginalMember(owner = "client!sf", name = "sb", descriptor = "I")
    private static int field3362 = 0;

    @OriginalMember(owner = "client!sf", name = "Jb", descriptor = "[I")
    private static int[] field3379 = new int[10000];

    @OriginalMember(owner = "client!sf", name = "fb", descriptor = "S")
    private short field3349;

    @OriginalMember(owner = "client!sf", name = "ib", descriptor = "S")
    private short field3352;

    @OriginalMember(owner = "client!sf", name = "jb", descriptor = "S")
    private short field3353;

    @OriginalMember(owner = "client!sf", name = "pb", descriptor = "S")
    private short field3359;

    @OriginalMember(owner = "client!sf", name = "xb", descriptor = "S")
    private short field3367;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "()V")
    public final void method1057() {
        int var10002;
        if (this.field3350 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field3380; ++var3) {
                int var7 = this.field3350[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field3370 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; ++var4) {
                this.field3370[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field3380) {
                int var6 = this.field3350[var5];
                this.field3370[var6][var1[var6]++] = var5++;
            }
            this.field3350 = null;
        }
        if (this.field3361 != null) {
            int[] var8 = new int[256];
            int var9 = 0;
            for (int var10 = 0; var10 < this.field3348; ++var10) {
                int var14 = this.field3361[var10];
                var10002 = var8[var14]++;
                if (var14 > var9) {
                    var9 = var14;
                }
            }
            this.field3385 = new int[var9 + 1][];
            for (int var11 = 0; var11 <= var9; ++var11) {
                this.field3385[var11] = new int[var8[var11]];
                var8[var11] = 0;
            }
            int var12 = 0;
            while (var12 < this.field3348) {
                int var13 = this.field3361[var12];
                this.field3385[var13][var8[var13]++] = var12++;
            }
            this.field3361 = null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(IIIII)Lgg;")
    public final class63 method1058(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class63(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(SS)V")
    public final void method1059(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field3348; ++var3) {
            if (this.field3388[var3] == arg0) {
                this.field3388[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(III)V")
    public final void method1060(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3380; ++var4) {
            this.field3356[var4] += arg0;
            this.field3387[var4] += arg1;
            this.field3366[var4] += arg2;
        }
        this.method1074();
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "()V")
    public final void method1061() {
        if (this.field3368 == null) {
            this.field3368 = new class186[this.field3380];
            for (int var1 = 0; var1 < this.field3380; ++var1) {
                this.field3368[var1] = new class186();
            }
            for (int var2 = 0; var2 < this.field3348; ++var2) {
                int var3 = this.field3343[var2];
                int var4 = this.field3374[var2];
                int var5 = this.field3377[var2];
                int var6 = this.field3356[var4] - this.field3356[var3];
                int var7 = this.field3387[var4] - this.field3387[var3];
                int var8 = this.field3366[var4] - this.field3366[var3];
                int var9 = this.field3356[var5] - this.field3356[var3];
                int var10 = this.field3387[var5] - this.field3387[var3];
                int var11 = this.field3366[var5] - this.field3366[var3];
                int var12 = var7 * var11 - var8 * var10;
                int var13 = var8 * var9 - var6 * var11;
                int var14;
                for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 1) {
                    var12 >>= 1;
                    var13 >>= 1;
                }
                int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
                if (var15 <= 0) {
                    var15 = 1;
                }
                int var16 = var12 * 256 / var15;
                int var17 = var13 * 256 / var15;
                int var18 = var14 * 256 / var15;
                byte var19;
                if (this.field3381 == null) {
                    var19 = 0;
                } else {
                    var19 = this.field3381[var2];
                }
                if (var19 == 0) {
                    class186 var20 = this.field3368[var3];
                    var20.field3656 += var16;
                    var20.field3663 += var17;
                    var20.field3659 += var18;
                    ++var20.field3661;
                    class186 var21 = this.field3368[var4];
                    var21.field3656 += var16;
                    var21.field3663 += var17;
                    var21.field3659 += var18;
                    ++var21.field3661;
                    class186 var22 = this.field3368[var5];
                    var22.field3656 += var16;
                    var22.field3663 += var17;
                    var22.field3659 += var18;
                    ++var22.field3661;
                } else if (var19 == 1) {
                    if (this.field3369 == null) {
                        this.field3369 = new class104[this.field3348];
                    }
                    class104 var23 = this.field3369[var2] = new class104();
                    var23.field1973 = var16;
                    var23.field1985 = var17;
                    var23.field1987 = var18;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "(I)V")
    public final void method1062(int arg0) {
        int var2 = field3358[arg0];
        int var3 = field3344[arg0];
        for (int var4 = 0; var4 < this.field3380; ++var4) {
            int var5 = this.field3366[var4] * var2 + this.field3356[var4] * var3 >> 16;
            this.field3366[var4] = this.field3366[var4] * var3 - this.field3356[var4] * var2 >> 16;
            this.field3356[var4] = var5;
        }
        this.method1074();
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "([[IIIIZI)Lsf;")
    public final class169 method1063(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1073();
        int var7 = this.field3353 + arg1;
        int var8 = this.field3349 + arg1;
        int var9 = this.field3359 + arg3;
        int var10 = this.field3367 + arg3;
        if (var7 >= 0 && var8 + 128 >> 7 < arg0.length && var9 >= 0 && var10 + 128 >> 7 < arg0[0].length) {
            int var11 = var7 >> 7;
            int var12 = var8 + 127 >> 7;
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            if (arg0[var11][var13] == arg2 && arg0[var12][var13] == arg2 && arg0[var11][var14] == arg2 && arg0[var12][var14] == arg2) {
                return this;
            } else {
                class169 var15;
                if (arg4) {
                    var15 = new class169();
                    var15.field3380 = this.field3380;
                    var15.field3348 = this.field3348;
                    var15.field3375 = this.field3375;
                    var15.field3356 = this.field3356;
                    var15.field3366 = this.field3366;
                    var15.field3343 = this.field3343;
                    var15.field3374 = this.field3374;
                    var15.field3377 = this.field3377;
                    var15.field3381 = this.field3381;
                    var15.field3383 = this.field3383;
                    var15.field3386 = this.field3386;
                    var15.field3365 = this.field3365;
                    var15.field3388 = this.field3388;
                    var15.field3376 = this.field3376;
                    var15.field3346 = this.field3346;
                    var15.field3354 = this.field3354;
                    var15.field3363 = this.field3363;
                    var15.field3372 = this.field3372;
                    var15.field3384 = this.field3384;
                    var15.field3342 = this.field3342;
                    var15.field3371 = this.field3371;
                    var15.field3364 = this.field3364;
                    var15.field3360 = this.field3360;
                    var15.field3382 = this.field3382;
                    var15.field3341 = this.field3341;
                    var15.field3347 = this.field3347;
                    var15.field3355 = this.field3355;
                    var15.field3350 = this.field3350;
                    var15.field3361 = this.field3361;
                    var15.field3370 = this.field3370;
                    var15.field3385 = this.field3385;
                    var15.field3373 = this.field3373;
                    var15.field3357 = this.field3357;
                    var15.field3387 = new int[var15.field3380];
                } else {
                    var15 = this;
                }
                if (arg5 == 0) {
                    for (int var16 = 0; var16 < var15.field3380; ++var16) {
                        int var17 = this.field3356[var16] + arg1;
                        int var18 = this.field3366[var16] + arg3;
                        int var19 = var17 & 127;
                        int var20 = var18 & 127;
                        int var21 = var17 >> 7;
                        int var22 = var18 >> 7;
                        int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                        int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                        int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                        var15.field3387[var16] = this.field3387[var16] + var25 - arg2;
                    }
                } else {
                    for (int var26 = 0; var26 < var15.field3380; ++var26) {
                        int var27 = (this.field3387[var26] << 16) / super.field1819;
                        if (var27 < arg5) {
                            int var28 = this.field3356[var26] + arg1;
                            int var29 = this.field3366[var26] + arg3;
                            int var30 = var28 & 127;
                            int var31 = var29 & 127;
                            int var32 = var28 >> 7;
                            int var33 = var29 >> 7;
                            int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                            int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                            int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                            var15.field3387[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field3387[var26];
                        } else {
                            var15.field3387[var26] = this.field3387[var26];
                        }
                    }
                }
                var15.method1074();
                return var15;
            }
        } else {
            return this;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lsf;Lsf;IIIZ)V")
    public static final void method1064(class169 arg0, class169 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method1073();
        arg0.method1061();
        arg1.method1073();
        arg1.method1061();
        ++field3362;
        int var6 = 0;
        int[] var7 = arg1.field3356;
        int var8 = arg1.field3380;
        for (int var9 = 0; var9 < arg0.field3380; ++var9) {
            class186 var12 = arg0.field3368[var9];
            if (var12.field3661 != 0) {
                int var13 = arg0.field3387[var9] - arg3;
                if (var13 >= arg1.field1819 && var13 <= arg1.field3352) {
                    int var14 = arg0.field3356[var9] - arg2;
                    if (var14 >= arg1.field3353 && var14 <= arg1.field3349) {
                        int var15 = arg0.field3366[var9] - arg4;
                        if (var15 >= arg1.field3359 && var15 <= arg1.field3367) {
                            for (int var16 = 0; var16 < var8; ++var16) {
                                class186 var17 = arg1.field3368[var16];
                                if (var7[var16] == var14 && arg1.field3366[var16] == var15 && arg1.field3387[var16] == var13 && var17.field3661 != 0) {
                                    if (arg0.field3345 == null) {
                                        arg0.field3345 = new class186[arg0.field3380];
                                    }
                                    if (arg1.field3345 == null) {
                                        arg1.field3345 = new class186[var8];
                                    }
                                    class186 var18 = arg0.field3345[var9];
                                    if (var18 == null) {
                                        var18 = arg0.field3345[var9] = new class186(var12);
                                    }
                                    class186 var19 = arg1.field3345[var16];
                                    if (var19 == null) {
                                        var19 = arg1.field3345[var16] = new class186(var17);
                                    }
                                    var18.field3656 += var17.field3656;
                                    var18.field3663 += var17.field3663;
                                    var18.field3659 += var17.field3659;
                                    var18.field3661 += var17.field3661;
                                    var19.field3656 += var12.field3656;
                                    var19.field3663 += var12.field3663;
                                    var19.field3659 += var12.field3659;
                                    var19.field3661 += var12.field3661;
                                    ++var6;
                                    field3379[var9] = field3362;
                                    field3378[var16] = field3362;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var6 >= 3 && arg5) {
            for (int var10 = 0; var10 < arg0.field3348; ++var10) {
                if (field3379[arg0.field3343[var10]] == field3362 && field3379[arg0.field3374[var10]] == field3362 && field3379[arg0.field3377[var10]] == field3362) {
                    if (arg0.field3381 == null) {
                        arg0.field3381 = new byte[arg0.field3348];
                    }
                    arg0.field3381[var10] = 2;
                }
            }
            for (int var11 = 0; var11 < arg1.field3348; ++var11) {
                if (field3378[arg1.field3343[var11]] == field3362 && field3378[arg1.field3374[var11]] == field3362 && field3378[arg1.field3377[var11]] == field3362) {
                    if (arg1.field3381 == null) {
                        arg1.field3381 = new byte[arg1.field3348];
                    }
                    arg1.field3381[var11] = 2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "()V")
    public static void method1065() {
        field3379 = null;
        field3378 = null;
        field3358 = null;
        field3344 = null;
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "()V")
    public final void method1066() {
        for (int var1 = 0; var1 < this.field3380; ++var1) {
            this.field3366[var1] = -this.field3366[var1];
        }
        for (int var2 = 0; var2 < this.field3348; ++var2) {
            int var3 = this.field3343[var2];
            this.field3343[var2] = this.field3377[var2];
            this.field3377[var2] = var3;
        }
        this.method1074();
    }

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "()Lsf;")
    public final class169 method1067() {
        class169 var1 = new class169();
        if (this.field3381 != null) {
            var1.field3381 = new byte[this.field3348];
            for (int var2 = 0; var2 < this.field3348; ++var2) {
                var1.field3381[var2] = this.field3381[var2];
            }
        }
        var1.field3380 = this.field3380;
        var1.field3348 = this.field3348;
        var1.field3375 = this.field3375;
        var1.field3356 = this.field3356;
        var1.field3387 = this.field3387;
        var1.field3366 = this.field3366;
        var1.field3343 = this.field3343;
        var1.field3374 = this.field3374;
        var1.field3377 = this.field3377;
        var1.field3383 = this.field3383;
        var1.field3386 = this.field3386;
        var1.field3365 = this.field3365;
        var1.field3388 = this.field3388;
        var1.field3376 = this.field3376;
        var1.field3346 = this.field3346;
        var1.field3354 = this.field3354;
        var1.field3363 = this.field3363;
        var1.field3372 = this.field3372;
        var1.field3384 = this.field3384;
        var1.field3342 = this.field3342;
        var1.field3371 = this.field3371;
        var1.field3364 = this.field3364;
        var1.field3360 = this.field3360;
        var1.field3382 = this.field3382;
        var1.field3341 = this.field3341;
        var1.field3347 = this.field3347;
        var1.field3355 = this.field3355;
        var1.field3350 = this.field3350;
        var1.field3361 = this.field3361;
        var1.field3370 = this.field3370;
        var1.field3385 = this.field3385;
        var1.field3368 = this.field3368;
        var1.field3369 = this.field3369;
        var1.field3373 = this.field3373;
        var1.field3357 = this.field3357;
        return var1;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lsf;I)I")
    private final int method1068(class169 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field3356[arg1];
        int var5 = arg0.field3387[arg1];
        int var6 = arg0.field3366[arg1];
        for (int var7 = 0; var7 < this.field3380; ++var7) {
            if (this.field3356[var7] == var4 && this.field3387[var7] == var5 && this.field3366[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field3356[this.field3380] = var4;
            this.field3387[this.field3380] = var5;
            this.field3366[this.field3380] = var6;
            if (arg0.field3350 != null) {
                this.field3350[this.field3380] = arg0.field3350[arg1];
            }
            var3 = this.field3380++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(SS)V")
    public final void method1069(short arg0, short arg1) {
        if (this.field3376 != null) {
            for (int var3 = 0; var3 < this.field3348; ++var3) {
                if (this.field3376[var3] == arg0) {
                    this.field3376[var3] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "()V")
    public final void method1070() {
        for (int var1 = 0; var1 < this.field3380; ++var1) {
            int var2 = this.field3356[var1];
            this.field3356[var1] = this.field3366[var1];
            this.field3366[var1] = -var2;
        }
        this.method1074();
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "([B)V")
    private final void method1071(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class89 var4 = new class89(arg0);
        class89 var5 = new class89(arg0);
        class89 var6 = new class89(arg0);
        class89 var7 = new class89(arg0);
        class89 var8 = new class89(arg0);
        var4.field1727 = arg0.length - 18;
        int var9 = var4.method555(-1113627096);
        int var10 = var4.method555(-1113627096);
        int var11 = var4.method538((byte) 92);
        int var12 = var4.method538((byte) -57);
        int var13 = var4.method538((byte) -48);
        int var14 = var4.method538((byte) -119);
        int var15 = var4.method538((byte) -104);
        int var16 = var4.method538((byte) -71);
        int var17 = var4.method555(-1113627096);
        int var18 = var4.method555(-1113627096);
        int var19 = var4.method555(-1113627096);
        int var20 = var4.method555(-1113627096);
        byte var21 = 0;
        int var23 = var9 + var21;
        int var25 = var10 + var23;
        int var26 = var25;
        if (var13 == 255) {
            var25 += var10;
        }
        int var27 = var25;
        if (var15 == 1) {
            var25 += var10;
        }
        int var28 = var25;
        if (var12 == 1) {
            var25 += var10;
        }
        int var29 = var25;
        if (var16 == 1) {
            var25 += var9;
        }
        int var30 = var25;
        if (var14 == 1) {
            var25 += var10;
        }
        int var32 = var20 + var25;
        int var34 = var10 * 2 + var32;
        int var36 = var11 * 6 + var34;
        int var38 = var17 + var36;
        int var40 = var18 + var38;
        int var10000 = var19 + var40;
        this.field3380 = var9;
        this.field3348 = var10;
        this.field3375 = var11;
        this.field3356 = new int[var9];
        this.field3387 = new int[var9];
        this.field3366 = new int[var9];
        this.field3343 = new int[var10];
        this.field3374 = new int[var10];
        this.field3377 = new int[var10];
        if (var11 > 0) {
            this.field3354 = new byte[var11];
            this.field3363 = new short[var11];
            this.field3372 = new short[var11];
            this.field3384 = new short[var11];
        }
        if (var16 == 1) {
            this.field3350 = new int[var9];
        }
        if (var12 == 1) {
            this.field3381 = new byte[var10];
            this.field3365 = new byte[var10];
            this.field3376 = new short[var10];
        }
        if (var13 == 255) {
            this.field3383 = new byte[var10];
        } else {
            this.field3346 = (byte) var13;
        }
        if (var14 == 1) {
            this.field3386 = new byte[var10];
        }
        if (var15 == 1) {
            this.field3361 = new int[var10];
        }
        this.field3388 = new short[var10];
        var4.field1727 = var21;
        var5.field1727 = var36;
        var6.field1727 = var38;
        var7.field1727 = var40;
        var8.field1727 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; ++var46) {
            int var62 = var4.method538((byte) -36);
            int var63 = 0;
            if ((var62 & 1) != 0) {
                var63 = var5.method566(127);
            }
            int var64 = 0;
            if ((var62 & 2) != 0) {
                var64 = var6.method566(124);
            }
            int var65 = 0;
            if ((var62 & 4) != 0) {
                var65 = var7.method566(124);
            }
            this.field3356[var46] = var43 + var63;
            this.field3387[var46] = var44 + var64;
            this.field3366[var46] = var45 + var65;
            var43 = this.field3356[var46];
            var44 = this.field3387[var46];
            var45 = this.field3366[var46];
            if (var16 == 1) {
                this.field3350[var46] = var8.method538((byte) -86);
            }
        }
        var4.field1727 = var32;
        var5.field1727 = var28;
        var6.field1727 = var26;
        var7.field1727 = var30;
        var8.field1727 = var27;
        for (int var47 = 0; var47 < var10; ++var47) {
            this.field3388[var47] = (short) var4.method555(-1113627096);
            if (var12 == 1) {
                int var61 = var5.method538((byte) 120);
                if ((var61 & 1) == 1) {
                    this.field3381[var47] = 1;
                    var2 = true;
                } else {
                    this.field3381[var47] = 0;
                }
                if ((var61 & 2) == 2) {
                    this.field3365[var47] = (byte) (var61 >> 2);
                    this.field3376[var47] = this.field3388[var47];
                    this.field3388[var47] = 127;
                    if (this.field3376[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field3365[var47] = -1;
                    this.field3376[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field3383[var47] = var6.method577((byte) 30);
            }
            if (var14 == 1) {
                this.field3386[var47] = var7.method577((byte) 30);
            }
            if (var15 == 1) {
                this.field3361[var47] = var8.method538((byte) -107);
            }
        }
        var4.field1727 = var25;
        var5.field1727 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; ++var52) {
            int var57 = var5.method538((byte) 122);
            if (var57 == 1) {
                var48 = var4.method566(118) + var51;
                var49 = var4.method566(127) + var48;
                var50 = var4.method566(118) + var49;
                var51 = var50;
                this.field3343[var52] = var48;
                this.field3374[var52] = var49;
                this.field3377[var52] = var50;
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method566(117) + var51;
                var51 = var50;
                this.field3343[var52] = var48;
                this.field3374[var52] = var49;
                this.field3377[var52] = var50;
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method566(120) + var51;
                var51 = var50;
                this.field3343[var52] = var48;
                this.field3374[var52] = var49;
                this.field3377[var52] = var50;
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method566(118) + var51;
                var51 = var50;
                this.field3343[var52] = var48;
                this.field3374[var52] = var60;
                this.field3377[var52] = var50;
            }
        }
        var4.field1727 = var34;
        for (int var53 = 0; var53 < var11; ++var53) {
            this.field3354[var53] = 0;
            this.field3363[var53] = (short) var4.method555(-1113627096);
            this.field3372[var53] = (short) var4.method555(-1113627096);
            this.field3384[var53] = (short) var4.method555(-1113627096);
        }
        if (this.field3365 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; ++var55) {
                int var56 = this.field3365[var55] & 255;
                if (var56 != 255) {
                    if ((this.field3363[var56] & 65535) == this.field3343[var55] && (this.field3372[var56] & 65535) == this.field3374[var55] && (this.field3384[var56] & 65535) == this.field3377[var55]) {
                        this.field3365[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field3365 = null;
            }
        }
        if (!var3) {
            this.field3376 = null;
        }
        if (!var2) {
            this.field3381 = null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(III)V")
    public final void method1072(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3380; ++var4) {
            this.field3356[var4] = this.field3356[var4] * arg0 / 128;
            this.field3387[var4] = this.field3387[var4] * arg1 / 128;
            this.field3366[var4] = this.field3366[var4] * arg2 / 128;
        }
        this.method1074();
    }

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "()V")
    private final void method1073() {
        if (!this.field3351) {
            this.field3351 = true;
            int var1 = 32767;
            int var2 = 32767;
            int var3 = 32767;
            int var4 = -32768;
            int var5 = -32768;
            int var6 = -32768;
            for (int var7 = 0; var7 < this.field3380; ++var7) {
                int var8 = this.field3356[var7];
                int var9 = this.field3387[var7];
                int var10 = this.field3366[var7];
                if (var8 < var1) {
                    var1 = var8;
                }
                if (var8 > var4) {
                    var4 = var8;
                }
                if (var9 < var2) {
                    var2 = var9;
                }
                if (var9 > var5) {
                    var5 = var9;
                }
                if (var10 < var3) {
                    var3 = var10;
                }
                if (var10 > var6) {
                    var6 = var10;
                }
            }
            this.field3353 = (short) var1;
            this.field3349 = (short) var4;
            super.field1819 = (short) var2;
            this.field3352 = (short) var5;
            this.field3359 = (short) var3;
            this.field3367 = (short) var6;
        }
    }

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "()V")
    private final void method1074() {
        this.field3368 = null;
        this.field3345 = null;
        this.field3369 = null;
        this.field3351 = false;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIIZZ)Lw;")
    public final class199 method1075(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        return new class63(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lga;II)Lsf;")
    public static final class169 method1076(class58 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method367(arg1, arg2, (byte) -34);
        return var3 == null ? null : new class169(var3);
    }

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "()V")
    public final void method1077() {
        for (int var1 = 0; var1 < this.field3380; ++var1) {
            this.field3356[var1] = -this.field3356[var1];
            this.field3366[var1] = -this.field3366[var1];
        }
        this.method1074();
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "([B)V")
    private final void method1078(byte[] arg0) {
        class89 var2 = new class89(arg0);
        class89 var3 = new class89(arg0);
        class89 var4 = new class89(arg0);
        class89 var5 = new class89(arg0);
        class89 var6 = new class89(arg0);
        class89 var7 = new class89(arg0);
        class89 var8 = new class89(arg0);
        var2.field1727 = arg0.length - 23;
        int var9 = var2.method555(-1113627096);
        int var10 = var2.method555(-1113627096);
        int var11 = var2.method538((byte) -85);
        int var12 = var2.method538((byte) 101);
        int var13 = var2.method538((byte) -34);
        int var14 = var2.method538((byte) -100);
        int var15 = var2.method538((byte) 85);
        int var16 = var2.method538((byte) 88);
        int var17 = var2.method538((byte) -90);
        int var18 = var2.method555(-1113627096);
        int var19 = var2.method555(-1113627096);
        int var20 = var2.method555(-1113627096);
        int var21 = var2.method555(-1113627096);
        int var22 = var2.method555(-1113627096);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field3354 = new byte[var11];
            var2.field1727 = 0;
            for (int var26 = 0; var26 < var11; ++var26) {
                byte var27 = this.field3354[var26] = var2.method577((byte) 30);
                if (var27 == 0) {
                    ++var23;
                }
                if (var27 >= 1 && var27 <= 3) {
                    ++var24;
                }
                if (var27 == 2) {
                    ++var25;
                }
            }
        }
        int var30 = var9 + var11;
        int var31 = var30;
        if (var12 == 1) {
            var30 += var10;
        }
        int var33 = var10 + var30;
        int var34 = var33;
        if (var13 == 255) {
            var33 += var10;
        }
        int var35 = var33;
        if (var15 == 1) {
            var33 += var10;
        }
        int var36 = var33;
        if (var17 == 1) {
            var33 += var9;
        }
        int var37 = var33;
        if (var14 == 1) {
            var33 += var10;
        }
        int var39 = var21 + var33;
        int var40 = var39;
        if (var16 == 1) {
            var39 += var10 * 2;
        }
        int var42 = var22 + var39;
        int var44 = var10 * 2 + var42;
        int var46 = var18 + var44;
        int var48 = var19 + var46;
        int var50 = var20 + var48;
        int var52 = var23 * 6 + var50;
        int var54 = var24 * 6 + var52;
        int var56 = var24 * 6 + var54;
        int var58 = var24 + var56;
        int var60 = var24 + var58;
        int var62 = var25 * 2 + var24 + var60;
        this.field3380 = var9;
        this.field3348 = var10;
        this.field3375 = var11;
        this.field3356 = new int[var9];
        this.field3387 = new int[var9];
        this.field3366 = new int[var9];
        this.field3343 = new int[var10];
        this.field3374 = new int[var10];
        this.field3377 = new int[var10];
        if (var17 == 1) {
            this.field3350 = new int[var9];
        }
        if (var12 == 1) {
            this.field3381 = new byte[var10];
        }
        if (var13 == 255) {
            this.field3383 = new byte[var10];
        } else {
            this.field3346 = (byte) var13;
        }
        if (var14 == 1) {
            this.field3386 = new byte[var10];
        }
        if (var15 == 1) {
            this.field3361 = new int[var10];
        }
        if (var16 == 1) {
            this.field3376 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field3365 = new byte[var10];
        }
        this.field3388 = new short[var10];
        if (var11 > 0) {
            this.field3363 = new short[var11];
            this.field3372 = new short[var11];
            this.field3384 = new short[var11];
            if (var24 > 0) {
                this.field3342 = new short[var24];
                this.field3371 = new short[var24];
                this.field3364 = new short[var24];
                this.field3360 = new byte[var24];
                this.field3382 = new byte[var24];
                this.field3341 = new byte[var24];
            }
            if (var25 > 0) {
                this.field3347 = new byte[var25];
                this.field3355 = new byte[var25];
            }
        }
        var2.field1727 = var11;
        var3.field1727 = var44;
        var4.field1727 = var46;
        var5.field1727 = var48;
        var6.field1727 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; ++var67) {
            int var81 = var2.method538((byte) 76);
            int var82 = 0;
            if ((var81 & 1) != 0) {
                var82 = var3.method566(121);
            }
            int var83 = 0;
            if ((var81 & 2) != 0) {
                var83 = var4.method566(120);
            }
            int var84 = 0;
            if ((var81 & 4) != 0) {
                var84 = var5.method566(117);
            }
            this.field3356[var67] = var64 + var82;
            this.field3387[var67] = var65 + var83;
            this.field3366[var67] = var66 + var84;
            var64 = this.field3356[var67];
            var65 = this.field3387[var67];
            var66 = this.field3366[var67];
            if (var17 == 1) {
                this.field3350[var67] = var6.method538((byte) 98);
            }
        }
        var2.field1727 = var42;
        var3.field1727 = var31;
        var4.field1727 = var34;
        var5.field1727 = var37;
        var6.field1727 = var35;
        var7.field1727 = var40;
        var8.field1727 = var39;
        for (int var68 = 0; var68 < var10; ++var68) {
            this.field3388[var68] = (short) var2.method555(-1113627096);
            if (var12 == 1) {
                this.field3381[var68] = var3.method577((byte) 30);
            }
            if (var13 == 255) {
                this.field3383[var68] = var4.method577((byte) 30);
            }
            if (var14 == 1) {
                this.field3386[var68] = var5.method577((byte) 30);
            }
            if (var15 == 1) {
                this.field3361[var68] = var6.method538((byte) -64);
            }
            if (var16 == 1) {
                this.field3376[var68] = (short) (var7.method555(-1113627096) - 1);
            }
            if (this.field3365 != null) {
                if (this.field3376[var68] != -1) {
                    this.field3365[var68] = (byte) (var8.method538((byte) -121) - 1);
                } else {
                    this.field3365[var68] = -1;
                }
            }
        }
        var2.field1727 = var33;
        var3.field1727 = var30;
        int var69 = 0;
        int var70 = 0;
        int var71 = 0;
        int var72 = 0;
        for (int var73 = 0; var73 < var10; ++var73) {
            int var77 = var3.method538((byte) -104);
            if (var77 == 1) {
                var69 = var2.method566(122) + var72;
                var70 = var2.method566(121) + var69;
                var71 = var2.method566(127) + var70;
                var72 = var71;
                this.field3343[var73] = var69;
                this.field3374[var73] = var70;
                this.field3377[var73] = var71;
            }
            if (var77 == 2) {
                var70 = var71;
                var71 = var2.method566(118) + var72;
                var72 = var71;
                this.field3343[var73] = var69;
                this.field3374[var73] = var70;
                this.field3377[var73] = var71;
            }
            if (var77 == 3) {
                var69 = var71;
                var71 = var2.method566(127) + var72;
                var72 = var71;
                this.field3343[var73] = var69;
                this.field3374[var73] = var70;
                this.field3377[var73] = var71;
            }
            if (var77 == 4) {
                int var80 = var69;
                var69 = var70;
                var70 = var80;
                var71 = var2.method566(124) + var72;
                var72 = var71;
                this.field3343[var73] = var69;
                this.field3374[var73] = var80;
                this.field3377[var73] = var71;
            }
        }
        var2.field1727 = var50;
        var3.field1727 = var52;
        var4.field1727 = var54;
        var5.field1727 = var56;
        var6.field1727 = var58;
        var7.field1727 = var60;
        for (int var74 = 0; var74 < var11; ++var74) {
            int var76 = this.field3354[var74] & 255;
            if (var76 == 0) {
                this.field3363[var74] = (short) var2.method555(-1113627096);
                this.field3372[var74] = (short) var2.method555(-1113627096);
                this.field3384[var74] = (short) var2.method555(-1113627096);
            }
            if (var76 == 1) {
                this.field3363[var74] = (short) var3.method555(-1113627096);
                this.field3372[var74] = (short) var3.method555(-1113627096);
                this.field3384[var74] = (short) var3.method555(-1113627096);
                this.field3342[var74] = (short) var4.method555(-1113627096);
                this.field3371[var74] = (short) var4.method555(-1113627096);
                this.field3364[var74] = (short) var4.method555(-1113627096);
                this.field3360[var74] = var5.method577((byte) 30);
                this.field3382[var74] = var6.method577((byte) 30);
                this.field3341[var74] = var7.method577((byte) 30);
            }
            if (var76 == 2) {
                this.field3363[var74] = (short) var3.method555(-1113627096);
                this.field3372[var74] = (short) var3.method555(-1113627096);
                this.field3384[var74] = (short) var3.method555(-1113627096);
                this.field3342[var74] = (short) var4.method555(-1113627096);
                this.field3371[var74] = (short) var4.method555(-1113627096);
                this.field3364[var74] = (short) var4.method555(-1113627096);
                this.field3360[var74] = var5.method577((byte) 30);
                this.field3382[var74] = var6.method577((byte) 30);
                this.field3341[var74] = var7.method577((byte) 30);
                this.field3347[var74] = var7.method577((byte) 30);
                this.field3355[var74] = var7.method577((byte) 30);
            }
            if (var76 == 3) {
                this.field3363[var74] = (short) var3.method555(-1113627096);
                this.field3372[var74] = (short) var3.method555(-1113627096);
                this.field3384[var74] = (short) var3.method555(-1113627096);
                this.field3342[var74] = (short) var4.method555(-1113627096);
                this.field3371[var74] = (short) var4.method555(-1113627096);
                this.field3364[var74] = (short) var4.method555(-1113627096);
                this.field3360[var74] = var5.method577((byte) 30);
                this.field3382[var74] = var6.method577((byte) 30);
                this.field3341[var74] = var7.method577((byte) 30);
            }
        }
        var2.field1727 = var62;
        int var75 = var2.method538((byte) -109);
        if (var75 != 0) {
            new class198();
            var2.method555(-1113627096);
            var2.method555(-1113627096);
            var2.method555(-1113627096);
            var2.method545(-7436);
        }
    }

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "()V")
    public final void method1079() {
        for (int var1 = 0; var1 < this.field3380; ++var1) {
            int var2 = this.field3366[var1];
            this.field3366[var1] = this.field3356[var1];
            this.field3356[var1] = -var2;
        }
        this.method1074();
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
    private class169() {
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "([B)V")
    private class169(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1078(arg0);
        } else {
            this.method1071(arg0);
        }
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "([Lsf;I)V")
    public class169(class169[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field3380 = 0;
        this.field3348 = 0;
        this.field3375 = 0;
        this.field3346 = -1;
        for (int var9 = 0; var9 < arg1; ++var9) {
            class169 var15 = arg0[var9];
            if (var15 != null) {
                this.field3380 += var15.field3380;
                this.field3348 += var15.field3348;
                this.field3375 += var15.field3375;
                if (var15.field3383 != null) {
                    var4 = true;
                } else {
                    if (this.field3346 == -1) {
                        this.field3346 = var15.field3346;
                    }
                    if (this.field3346 != var15.field3346) {
                        var4 = true;
                    }
                }
                var3 |= var15.field3381 != null;
                var5 |= var15.field3386 != null;
                var6 |= var15.field3361 != null;
                var7 |= var15.field3376 != null;
                var8 |= var15.field3365 != null;
            }
        }
        this.field3356 = new int[this.field3380];
        this.field3387 = new int[this.field3380];
        this.field3366 = new int[this.field3380];
        this.field3350 = new int[this.field3380];
        this.field3343 = new int[this.field3348];
        this.field3374 = new int[this.field3348];
        this.field3377 = new int[this.field3348];
        if (var3) {
            this.field3381 = new byte[this.field3348];
        }
        if (var4) {
            this.field3383 = new byte[this.field3348];
        }
        if (var5) {
            this.field3386 = new byte[this.field3348];
        }
        if (var6) {
            this.field3361 = new int[this.field3348];
        }
        if (var7) {
            this.field3376 = new short[this.field3348];
        }
        if (var8) {
            this.field3365 = new byte[this.field3348];
        }
        this.field3388 = new short[this.field3348];
        if (this.field3375 > 0) {
            this.field3354 = new byte[this.field3375];
            this.field3363 = new short[this.field3375];
            this.field3372 = new short[this.field3375];
            this.field3384 = new short[this.field3375];
            this.field3342 = new short[this.field3375];
            this.field3371 = new short[this.field3375];
            this.field3364 = new short[this.field3375];
            this.field3360 = new byte[this.field3375];
            this.field3382 = new byte[this.field3375];
            this.field3341 = new byte[this.field3375];
            this.field3347 = new byte[this.field3375];
            this.field3355 = new byte[this.field3375];
        }
        this.field3380 = 0;
        this.field3348 = 0;
        this.field3375 = 0;
        for (int var10 = 0; var10 < arg1; ++var10) {
            class169 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field3348; ++var12) {
                    if (var3 && var11.field3381 != null) {
                        this.field3381[this.field3348] = var11.field3381[var12];
                    }
                    if (var4) {
                        if (var11.field3383 != null) {
                            this.field3383[this.field3348] = var11.field3383[var12];
                        } else {
                            this.field3383[this.field3348] = var11.field3346;
                        }
                    }
                    if (var5 && var11.field3386 != null) {
                        this.field3386[this.field3348] = var11.field3386[var12];
                    }
                    if (var6 && var11.field3361 != null) {
                        this.field3361[this.field3348] = var11.field3361[var12];
                    }
                    if (var7) {
                        if (var11.field3376 != null) {
                            this.field3376[this.field3348] = var11.field3376[var12];
                        } else {
                            this.field3376[this.field3348] = -1;
                        }
                    }
                    if (var8) {
                        if (var11.field3365 != null && var11.field3365[var12] != -1) {
                            this.field3365[this.field3348] = (byte) (var11.field3365[var12] + this.field3375);
                        } else {
                            this.field3365[this.field3348] = -1;
                        }
                    }
                    this.field3388[this.field3348] = var11.field3388[var12];
                    this.field3343[this.field3348] = this.method1068(var11, var11.field3343[var12]);
                    this.field3374[this.field3348] = this.method1068(var11, var11.field3374[var12]);
                    this.field3377[this.field3348] = this.method1068(var11, var11.field3377[var12]);
                    ++this.field3348;
                }
                for (int var13 = 0; var13 < var11.field3375; ++var13) {
                    byte var14 = this.field3354[this.field3375] = var11.field3354[var13];
                    if (var14 == 0) {
                        this.field3363[this.field3375] = (short) this.method1068(var11, var11.field3363[var13]);
                        this.field3372[this.field3375] = (short) this.method1068(var11, var11.field3372[var13]);
                        this.field3384[this.field3375] = (short) this.method1068(var11, var11.field3384[var13]);
                    }
                    if (var14 >= 1 && var14 <= 3) {
                        this.field3363[this.field3375] = var11.field3363[var13];
                        this.field3372[this.field3375] = var11.field3372[var13];
                        this.field3384[this.field3375] = var11.field3384[var13];
                        this.field3342[this.field3375] = var11.field3342[var13];
                        this.field3371[this.field3375] = var11.field3371[var13];
                        this.field3364[this.field3375] = var11.field3364[var13];
                        this.field3360[this.field3375] = var11.field3360[var13];
                        this.field3382[this.field3375] = var11.field3382[var13];
                        this.field3341[this.field3375] = var11.field3341[var13];
                    }
                    if (var14 == 2) {
                        this.field3347[this.field3375] = var11.field3347[var13];
                        this.field3355[this.field3375] = var11.field3355[var13];
                    }
                    ++this.field3375;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lsf;ZZZZ)V")
    public class169(class169 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field3380 = arg0.field3380;
        this.field3348 = arg0.field3348;
        this.field3375 = arg0.field3375;
        if (arg1) {
            this.field3356 = arg0.field3356;
            this.field3387 = arg0.field3387;
            this.field3366 = arg0.field3366;
        } else {
            this.field3356 = new int[this.field3380];
            this.field3387 = new int[this.field3380];
            this.field3366 = new int[this.field3380];
            for (int var6 = 0; var6 < this.field3380; ++var6) {
                this.field3356[var6] = arg0.field3356[var6];
                this.field3387[var6] = arg0.field3387[var6];
                this.field3366[var6] = arg0.field3366[var6];
            }
        }
        if (arg2) {
            this.field3388 = arg0.field3388;
        } else {
            this.field3388 = new short[this.field3348];
            for (int var7 = 0; var7 < this.field3348; ++var7) {
                this.field3388[var7] = arg0.field3388[var7];
            }
        }
        if (!arg3 && arg0.field3376 != null) {
            this.field3376 = new short[this.field3348];
            for (int var8 = 0; var8 < this.field3348; ++var8) {
                this.field3376[var8] = arg0.field3376[var8];
            }
        } else {
            this.field3376 = arg0.field3376;
        }
        if (arg4) {
            this.field3386 = arg0.field3386;
        } else {
            this.field3386 = new byte[this.field3348];
            if (arg0.field3386 == null) {
                for (int var9 = 0; var9 < this.field3348; ++var9) {
                    this.field3386[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field3348; ++var10) {
                    this.field3386[var10] = arg0.field3386[var10];
                }
            }
        }
        this.field3343 = arg0.field3343;
        this.field3374 = arg0.field3374;
        this.field3377 = arg0.field3377;
        this.field3381 = arg0.field3381;
        this.field3383 = arg0.field3383;
        this.field3365 = arg0.field3365;
        this.field3346 = arg0.field3346;
        this.field3354 = arg0.field3354;
        this.field3363 = arg0.field3363;
        this.field3372 = arg0.field3372;
        this.field3384 = arg0.field3384;
        this.field3342 = arg0.field3342;
        this.field3371 = arg0.field3371;
        this.field3364 = arg0.field3364;
        this.field3360 = arg0.field3360;
        this.field3382 = arg0.field3382;
        this.field3341 = arg0.field3341;
        this.field3347 = arg0.field3347;
        this.field3355 = arg0.field3355;
        this.field3350 = arg0.field3350;
        this.field3361 = arg0.field3361;
        this.field3370 = arg0.field3370;
        this.field3385 = arg0.field3385;
        this.field3368 = arg0.field3368;
        this.field3369 = arg0.field3369;
        this.field3345 = arg0.field3345;
        this.field3373 = arg0.field3373;
        this.field3357 = arg0.field3357;
    }
}
