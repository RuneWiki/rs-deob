import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class144 extends class103 {

    @OriginalMember(owner = "client!wd", name = "qb", descriptor = "I")
    private int field3409 = 0;

    @OriginalMember(owner = "client!wd", name = "Fb", descriptor = "I")
    private int field3424 = 0;

    @OriginalMember(owner = "client!wd", name = "Cb", descriptor = "Z")
    private boolean field3421 = false;

    @OriginalMember(owner = "client!wd", name = "Gb", descriptor = "I")
    private int field3425 = 0;

    @OriginalMember(owner = "client!wd", name = "Mb", descriptor = "B")
    private byte field3431 = 0;

    @OriginalMember(owner = "client!wd", name = "Ib", descriptor = "[I")
    private int[] field3427;

    @OriginalMember(owner = "client!wd", name = "Pb", descriptor = "[I")
    private int[] field3434;

    @OriginalMember(owner = "client!wd", name = "hb", descriptor = "[I")
    private int[] field3400;

    @OriginalMember(owner = "client!wd", name = "Nb", descriptor = "[I")
    private int[] field3432;

    @OriginalMember(owner = "client!wd", name = "jb", descriptor = "[I")
    private int[] field3402;

    @OriginalMember(owner = "client!wd", name = "lb", descriptor = "[I")
    private int[] field3404;

    @OriginalMember(owner = "client!wd", name = "fb", descriptor = "[I")
    private int[] field3398;

    @OriginalMember(owner = "client!wd", name = "ub", descriptor = "[I")
    private int[] field3413;

    @OriginalMember(owner = "client!wd", name = "rb", descriptor = "[I")
    private int[] field3410;

    @OriginalMember(owner = "client!wd", name = "zb", descriptor = "[I")
    private int[] field3418;

    @OriginalMember(owner = "client!wd", name = "gb", descriptor = "[B")
    private byte[] field3399;

    @OriginalMember(owner = "client!wd", name = "xb", descriptor = "[B")
    private byte[] field3416;

    @OriginalMember(owner = "client!wd", name = "Eb", descriptor = "[B")
    private byte[] field3423;

    @OriginalMember(owner = "client!wd", name = "kb", descriptor = "[B")
    private byte[] field3403;

    @OriginalMember(owner = "client!wd", name = "ib", descriptor = "[I")
    private int[] field3401;

    @OriginalMember(owner = "client!wd", name = "wb", descriptor = "[S")
    private short[] field3415;

    @OriginalMember(owner = "client!wd", name = "Ab", descriptor = "[[I")
    private int[][] field3419;

    @OriginalMember(owner = "client!wd", name = "tb", descriptor = "[[I")
    private int[][] field3412;

    @OriginalMember(owner = "client!wd", name = "yb", descriptor = "[Lg;")
    private class43[] field3417;

    @OriginalMember(owner = "client!wd", name = "Bb", descriptor = "[Ldf;")
    private class28[] field3420;

    @OriginalMember(owner = "client!wd", name = "Db", descriptor = "[Lg;")
    private class43[] field3422;

    @OriginalMember(owner = "client!wd", name = "Kb", descriptor = "S")
    public short field3429;

    @OriginalMember(owner = "client!wd", name = "mb", descriptor = "S")
    public short field3405;

    @OriginalMember(owner = "client!wd", name = "nb", descriptor = "[I")
    private static int[] field3406 = new int[10000];

    @OriginalMember(owner = "client!wd", name = "vb", descriptor = "[I")
    private static int[] field3414 = new int[128];

    @OriginalMember(owner = "client!wd", name = "Lb", descriptor = "I")
    private static int field3430 = 0;

    @OriginalMember(owner = "client!wd", name = "Jb", descriptor = "[I")
    private static int[] field3428 = new int[10000];

    @OriginalMember(owner = "client!wd", name = "ob", descriptor = "I")
    private int field3407;

    @OriginalMember(owner = "client!wd", name = "pb", descriptor = "I")
    private int field3408;

    @OriginalMember(owner = "client!wd", name = "sb", descriptor = "I")
    private int field3411;

    @OriginalMember(owner = "client!wd", name = "Hb", descriptor = "I")
    private int field3426;

    @OriginalMember(owner = "client!wd", name = "Ob", descriptor = "I")
    private int field3433;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "(I)I")
    private static final int method1107(int arg0) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 > 127) {
            arg0 = 127;
        }
        return field3414[arg0];
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(III)V")
    public final void method1108(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3425; ++var4) {
            this.field3427[var4] = this.field3427[var4] * arg0 / 128;
            this.field3434[var4] = this.field3434[var4] * arg1 / 128;
            this.field3400[var4] = this.field3400[var4] * arg2 / 128;
        }
        this.method1119();
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "()Lwd;")
    public final class144 method1109() {
        class144 var1 = new class144();
        if (this.field3399 != null) {
            var1.field3399 = new byte[this.field3409];
            for (int var2 = 0; var2 < this.field3409; ++var2) {
                var1.field3399[var2] = this.field3399[var2];
            }
        }
        var1.field3425 = this.field3425;
        var1.field3409 = this.field3409;
        var1.field3424 = this.field3424;
        var1.field3427 = this.field3427;
        var1.field3434 = this.field3434;
        var1.field3400 = this.field3400;
        var1.field3432 = this.field3432;
        var1.field3402 = this.field3402;
        var1.field3404 = this.field3404;
        var1.field3423 = this.field3423;
        var1.field3403 = this.field3403;
        var1.field3416 = this.field3416;
        var1.field3415 = this.field3415;
        var1.field3431 = this.field3431;
        var1.field3398 = this.field3398;
        var1.field3413 = this.field3413;
        var1.field3410 = this.field3410;
        var1.field3418 = this.field3418;
        var1.field3401 = this.field3401;
        var1.field3419 = this.field3419;
        var1.field3412 = this.field3412;
        var1.field3417 = this.field3417;
        var1.field3420 = this.field3420;
        var1.field3429 = this.field3429;
        var1.field3405 = this.field3405;
        return var1;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "()V")
    public final void method1110() {
        if (this.field3417 == null) {
            this.field3417 = new class43[this.field3425];
            for (int var1 = 0; var1 < this.field3425; ++var1) {
                this.field3417[var1] = new class43();
            }
            for (int var2 = 0; var2 < this.field3409; ++var2) {
                int var3 = this.field3432[var2];
                int var4 = this.field3402[var2];
                int var5 = this.field3404[var2];
                int var6 = this.field3427[var4] - this.field3427[var3];
                int var7 = this.field3434[var4] - this.field3434[var3];
                int var8 = this.field3400[var4] - this.field3400[var3];
                int var9 = this.field3427[var5] - this.field3427[var3];
                int var10 = this.field3434[var5] - this.field3434[var3];
                int var11 = this.field3400[var5] - this.field3400[var3];
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
                if (this.field3399 == null) {
                    var19 = 0;
                } else {
                    var19 = this.field3399[var2];
                }
                if (var19 == 0) {
                    class43 var20 = this.field3417[var3];
                    var20.field937 += var16;
                    var20.field934 += var17;
                    var20.field935 += var18;
                    ++var20.field932;
                    class43 var21 = this.field3417[var4];
                    var21.field937 += var16;
                    var21.field934 += var17;
                    var21.field935 += var18;
                    ++var21.field932;
                    class43 var22 = this.field3417[var5];
                    var22.field937 += var16;
                    var22.field934 += var17;
                    var22.field935 += var18;
                    ++var22.field932;
                } else if (var19 == 1) {
                    if (this.field3420 == null) {
                        this.field3420 = new class28[this.field3409];
                    }
                    class28 var23 = this.field3420[var2] = new class28();
                    var23.field623 = var16;
                    var23.field635 = var17;
                    var23.field619 = var18;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lnb;II)Lwd;")
    public static final class144 method1111(class88 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method668(arg1, -214, arg2);
        return var3 == null ? null : new class144(var3);
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "()V")
    private final void method1112() {
        int var10002;
        if (this.field3418 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field3425; ++var3) {
                int var7 = this.field3418[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field3419 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; ++var4) {
                this.field3419[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field3425) {
                int var6 = this.field3418[var5];
                this.field3419[var6][var1[var6]++] = var5++;
            }
            this.field3418 = null;
        }
        if (this.field3401 != null) {
            int[] var8 = new int[256];
            int var9 = 0;
            for (int var10 = 0; var10 < this.field3409; ++var10) {
                int var14 = this.field3401[var10];
                var10002 = var8[var14]++;
                if (var14 > var9) {
                    var9 = var14;
                }
            }
            this.field3412 = new int[var9 + 1][];
            for (int var11 = 0; var11 <= var9; ++var11) {
                this.field3412[var11] = new int[var8[var11]];
                var8[var11] = 0;
            }
            int var12 = 0;
            while (var12 < this.field3409) {
                int var13 = this.field3401[var12];
                this.field3412[var13][var8[var13]++] = var12++;
            }
            this.field3401 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIII)Lbf;")
    public final class14 method1113(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1110();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class14 var8 = new class14();
        var8.field307 = new int[this.field3409];
        var8.field313 = new int[this.field3409];
        var8.field304 = new int[this.field3409];
        for (int var9 = 0; var9 < this.field3409; ++var9) {
            byte var10;
            if (this.field3399 == null) {
                var10 = 0;
            } else {
                var10 = this.field3399[var9];
            }
            if (this.field3416 != null && this.field3416[var9] != -1) {
                if (var10 != 0) {
                    if (var10 == 1) {
                        class28 var17 = this.field3420[var9];
                        int var18 = (var17.field619 * arg4 + var17.field635 * arg3 + var17.field623 * arg2) / (var7 / 2 + var7) + arg0;
                        var8.field307[var9] = method1107(var18);
                        var8.field304[var9] = -1;
                    } else {
                        var8.field304[var9] = -2;
                    }
                } else {
                    class43 var11;
                    if (this.field3422 != null && this.field3422[this.field3432[var9]] != null) {
                        var11 = this.field3422[this.field3432[var9]];
                    } else {
                        var11 = this.field3417[this.field3432[var9]];
                    }
                    int var12 = (var11.field935 * arg4 + var11.field937 * arg2 + var11.field934 * arg3) / (var11.field932 * var7) + arg0;
                    var8.field307[var9] = method1107(var12);
                    class43 var13;
                    if (this.field3422 != null && this.field3422[this.field3402[var9]] != null) {
                        var13 = this.field3422[this.field3402[var9]];
                    } else {
                        var13 = this.field3417[this.field3402[var9]];
                    }
                    int var14 = (var13.field935 * arg4 + var13.field937 * arg2 + var13.field934 * arg3) / (var13.field932 * var7) + arg0;
                    var8.field313[var9] = method1107(var14);
                    class43 var15;
                    if (this.field3422 != null && this.field3422[this.field3404[var9]] != null) {
                        var15 = this.field3422[this.field3404[var9]];
                    } else {
                        var15 = this.field3417[this.field3404[var9]];
                    }
                    int var16 = (var15.field935 * arg4 + var15.field937 * arg2 + var15.field934 * arg3) / (var15.field932 * var7) + arg0;
                    var8.field304[var9] = method1107(var16);
                }
            } else if (var10 != 0) {
                if (var10 == 1) {
                    class28 var26 = this.field3420[var9];
                    int var27 = (var26.field619 * arg4 + var26.field635 * arg3 + var26.field623 * arg2) / (var7 / 2 + var7) + arg0;
                    var8.field307[var9] = method1121(this.field3415[var9] & 65535, var27);
                    var8.field304[var9] = -1;
                } else {
                    var8.field304[var9] = -2;
                }
            } else {
                int var19 = this.field3415[var9] & 65535;
                class43 var20;
                if (this.field3422 != null && this.field3422[this.field3432[var9]] != null) {
                    var20 = this.field3422[this.field3432[var9]];
                } else {
                    var20 = this.field3417[this.field3432[var9]];
                }
                int var21 = (var20.field935 * arg4 + var20.field937 * arg2 + var20.field934 * arg3) / (var20.field932 * var7) + arg0;
                var8.field307[var9] = method1121(var19, var21);
                class43 var22;
                if (this.field3422 != null && this.field3422[this.field3402[var9]] != null) {
                    var22 = this.field3422[this.field3402[var9]];
                } else {
                    var22 = this.field3417[this.field3402[var9]];
                }
                int var23 = (var22.field935 * arg4 + var22.field937 * arg2 + var22.field934 * arg3) / (var22.field932 * var7) + arg0;
                var8.field313[var9] = method1121(var19, var23);
                class43 var24;
                if (this.field3422 != null && this.field3422[this.field3404[var9]] != null) {
                    var24 = this.field3422[this.field3404[var9]];
                } else {
                    var24 = this.field3417[this.field3404[var9]];
                }
                int var25 = (var24.field935 * arg4 + var24.field937 * arg2 + var24.field934 * arg3) / (var24.field932 * var7) + arg0;
                var8.field304[var9] = method1121(var19, var25);
            }
        }
        this.method1112();
        var8.field310 = this.field3425;
        var8.field317 = this.field3427;
        var8.field323 = this.field3434;
        var8.field309 = this.field3400;
        var8.field305 = this.field3409;
        var8.field322 = this.field3432;
        var8.field316 = this.field3402;
        var8.field303 = this.field3404;
        var8.field302 = this.field3423;
        var8.field314 = this.field3403;
        var8.field324 = this.field3416;
        if (var8.field324 != null) {
            var8.field319 = this.field3415;
        } else {
            var8.field319 = null;
        }
        var8.field315 = this.field3431;
        var8.field299 = this.field3424;
        var8.field311 = this.field3398;
        var8.field301 = this.field3413;
        var8.field318 = this.field3410;
        var8.field327 = this.field3419;
        var8.field321 = this.field3412;
        return var8;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(SS)V")
    public final void method1114(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field3409; ++var3) {
            if (this.field3415[var3] == arg0) {
                this.field3415[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIZ)Lwd;")
    public final class144 method1115(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg0 == arg1 && arg0 == arg2 && arg0 == arg3) {
            return this;
        } else {
            class144 var6;
            if (arg4) {
                var6 = new class144();
                var6.field3425 = this.field3425;
                var6.field3409 = this.field3409;
                var6.field3424 = this.field3424;
                var6.field3427 = this.field3427;
                var6.field3400 = this.field3400;
                var6.field3432 = this.field3432;
                var6.field3402 = this.field3402;
                var6.field3404 = this.field3404;
                var6.field3399 = this.field3399;
                var6.field3423 = this.field3423;
                var6.field3403 = this.field3403;
                var6.field3416 = this.field3416;
                var6.field3415 = this.field3415;
                var6.field3431 = this.field3431;
                var6.field3398 = this.field3398;
                var6.field3413 = this.field3413;
                var6.field3410 = this.field3410;
                var6.field3418 = this.field3418;
                var6.field3401 = this.field3401;
                var6.field3419 = this.field3419;
                var6.field3412 = this.field3412;
                var6.field3429 = this.field3429;
                var6.field3405 = this.field3405;
                var6.field3434 = new int[var6.field3425];
            } else {
                var6 = this;
            }
            int var7 = (arg0 + arg1 + arg2 + arg3) / 4;
            for (int var8 = 0; var8 < var6.field3425; ++var8) {
                int var9 = this.field3427[var8];
                int var10 = this.field3434[var8];
                int var11 = this.field3400[var8];
                int var12 = (arg1 - arg0) * (var9 + 64) / 128 + arg0;
                int var13 = (arg2 - arg3) * (var9 + 64) / 128 + arg3;
                int var14 = (var13 - var12) * (var11 + 64) / 128 + var12;
                var6.field3434[var8] = var10 + var14 - var7;
            }
            var6.method1119();
            return var6;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lwd;I)I")
    private final int method1116(class144 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field3427[arg1];
        int var5 = arg0.field3434[arg1];
        int var6 = arg0.field3400[arg1];
        for (int var7 = 0; var7 < this.field3425; ++var7) {
            if (this.field3427[var7] == var4 && this.field3434[var7] == var5 && this.field3400[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field3427[this.field3425] = var4;
            this.field3434[this.field3425] = var5;
            this.field3400[this.field3425] = var6;
            if (arg0.field3418 != null) {
                this.field3418[this.field3425] = arg0.field3418[arg1];
            }
            var3 = this.field3425++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "()V")
    public final void method1117() {
        for (int var1 = 0; var1 < this.field3425; ++var1) {
            int var2 = this.field3400[var1];
            this.field3400[var1] = this.field3427[var1];
            this.field3427[var1] = -var2;
        }
        this.method1119();
    }

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "()V")
    public final void method1118() {
        for (int var1 = 0; var1 < this.field3425; ++var1) {
            this.field3427[var1] = -this.field3427[var1];
            this.field3400[var1] = -this.field3400[var1];
        }
        this.method1119();
    }

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "()V")
    private final void method1119() {
        this.field3417 = null;
        this.field3422 = null;
        this.field3420 = null;
        this.field3421 = false;
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(III)V")
    public final void method1120(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3425; ++var4) {
            this.field3427[var4] += arg0;
            this.field3434[var4] += arg1;
            this.field3400[var4] += arg2;
        }
        this.method1119();
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(II)I")
    private static final int method1121(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "()V")
    private final void method1122() {
        if (!this.field3421) {
            super.field2395 = 0;
            this.field3407 = 0;
            this.field3411 = 999999;
            this.field3426 = -999999;
            this.field3433 = -99999;
            this.field3408 = 99999;
            for (int var1 = 0; var1 < this.field3425; ++var1) {
                int var2 = this.field3427[var1];
                int var3 = this.field3434[var1];
                int var4 = this.field3400[var1];
                if (var2 < this.field3411) {
                    this.field3411 = var2;
                }
                if (var2 > this.field3426) {
                    this.field3426 = var2;
                }
                if (var4 < this.field3408) {
                    this.field3408 = var4;
                }
                if (var4 > this.field3433) {
                    this.field3433 = var4;
                }
                if (-var3 > super.field2395) {
                    super.field2395 = -var3;
                }
                if (var3 > this.field3407) {
                    this.field3407 = var3;
                }
            }
            this.field3421 = true;
        }
    }

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "()V")
    public final void method1123() {
        for (int var1 = 0; var1 < this.field3425; ++var1) {
            this.field3400[var1] = -this.field3400[var1];
        }
        for (int var2 = 0; var2 < this.field3409; ++var2) {
            int var3 = this.field3432[var2];
            this.field3432[var2] = this.field3404[var2];
            this.field3404[var2] = var3;
        }
        this.method1119();
    }

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "()V")
    public final void method1124() {
        for (int var1 = 0; var1 < this.field3425; ++var1) {
            int var2 = this.field3427[var1];
            this.field3427[var1] = this.field3400[var1];
            this.field3400[var1] = -var2;
        }
        this.method1119();
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lwd;Lwd;IIIZ)V")
    public static final void method1125(class144 arg0, class144 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method1122();
        arg0.method1110();
        arg1.method1122();
        arg1.method1110();
        ++field3430;
        int var6 = 0;
        int[] var7 = arg1.field3427;
        int var8 = arg1.field3425;
        for (int var9 = 0; var9 < arg0.field3425; ++var9) {
            class43 var12 = arg0.field3417[var9];
            if (var12.field932 != 0) {
                int var13 = arg0.field3434[var9] - arg3;
                if (var13 <= arg1.field3407) {
                    int var14 = arg0.field3427[var9] - arg2;
                    if (var14 >= arg1.field3411 && var14 <= arg1.field3426) {
                        int var15 = arg0.field3400[var9] - arg4;
                        if (var15 >= arg1.field3408 && var15 <= arg1.field3433) {
                            for (int var16 = 0; var16 < var8; ++var16) {
                                class43 var17 = arg1.field3417[var16];
                                if (var7[var16] == var14 && arg1.field3400[var16] == var15 && arg1.field3434[var16] == var13 && var17.field932 != 0) {
                                    if (arg0.field3422 == null) {
                                        arg0.field3422 = new class43[arg0.field3425];
                                    }
                                    if (arg1.field3422 == null) {
                                        arg1.field3422 = new class43[var8];
                                    }
                                    class43 var18 = arg0.field3422[var9];
                                    if (var18 == null) {
                                        var18 = arg0.field3422[var9] = new class43(var12);
                                    }
                                    class43 var19 = arg1.field3422[var16];
                                    if (var19 == null) {
                                        var19 = arg1.field3422[var16] = new class43(var17);
                                    }
                                    var18.field937 += var17.field937;
                                    var18.field934 += var17.field934;
                                    var18.field935 += var17.field935;
                                    var18.field932 += var17.field932;
                                    var19.field937 += var12.field937;
                                    var19.field934 += var12.field934;
                                    var19.field935 += var12.field935;
                                    var19.field932 += var12.field932;
                                    ++var6;
                                    field3428[var9] = field3430;
                                    field3406[var16] = field3430;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var6 >= 3 && arg5) {
            for (int var10 = 0; var10 < arg0.field3409; ++var10) {
                if (field3428[arg0.field3432[var10]] == field3430 && field3428[arg0.field3402[var10]] == field3430 && field3428[arg0.field3404[var10]] == field3430) {
                    if (arg0.field3399 == null) {
                        arg0.field3399 = new byte[arg0.field3409];
                    }
                    arg0.field3399[var10] = 2;
                }
            }
            for (int var11 = 0; var11 < arg1.field3409; ++var11) {
                if (field3406[arg1.field3432[var11]] == field3430 && field3406[arg1.field3402[var11]] == field3430 && field3406[arg1.field3404[var11]] == field3430) {
                    if (arg1.field3399 == null) {
                        arg1.field3399 = new byte[arg1.field3409];
                    }
                    arg1.field3399[var11] = 2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "()V")
    public static void method1126() {
        field3428 = null;
        field3406 = null;
        field3414 = null;
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V")
    private class144() {
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "([B)V")
    private class144(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class109 var4 = new class109(arg0);
        class109 var5 = new class109(arg0);
        class109 var6 = new class109(arg0);
        class109 var7 = new class109(arg0);
        class109 var8 = new class109(arg0);
        var4.field2583 = arg0.length - 18;
        int var9 = var4.method835(2);
        int var10 = var4.method835(2);
        int var11 = var4.method838(255);
        int var12 = var4.method838(255);
        int var13 = var4.method838(255);
        int var14 = var4.method838(255);
        int var15 = var4.method838(255);
        int var16 = var4.method838(255);
        int var17 = var4.method835(2);
        int var18 = var4.method835(2);
        int var19 = var4.method835(2);
        int var20 = var4.method835(2);
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
        this.field3425 = var9;
        this.field3409 = var10;
        this.field3424 = var11;
        this.field3427 = new int[var9];
        this.field3434 = new int[var9];
        this.field3400 = new int[var9];
        this.field3432 = new int[var10];
        this.field3402 = new int[var10];
        this.field3404 = new int[var10];
        if (var11 > 0) {
            this.field3398 = new int[var11];
            this.field3413 = new int[var11];
            this.field3410 = new int[var11];
        }
        if (var16 == 1) {
            this.field3418 = new int[var9];
        }
        if (var12 == 1) {
            this.field3399 = new byte[var10];
            this.field3416 = new byte[var10];
        }
        if (var13 == 255) {
            this.field3423 = new byte[var10];
        } else {
            this.field3431 = (byte) var13;
        }
        if (var14 == 1) {
            this.field3403 = new byte[var10];
        }
        if (var15 == 1) {
            this.field3401 = new int[var10];
        }
        this.field3415 = new short[var10];
        var4.field2583 = var21;
        var5.field2583 = var36;
        var6.field2583 = var38;
        var7.field2583 = var40;
        var8.field2583 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; ++var46) {
            int var59 = var4.method838(255);
            int var60 = 0;
            if ((var59 & 1) != 0) {
                var60 = var5.method830(true);
            }
            int var61 = 0;
            if ((var59 & 2) != 0) {
                var61 = var6.method830(true);
            }
            int var62 = 0;
            if ((var59 & 4) != 0) {
                var62 = var7.method830(true);
            }
            this.field3427[var46] = var43 + var60;
            this.field3434[var46] = var44 + var61;
            this.field3400[var46] = var45 + var62;
            var43 = this.field3427[var46];
            var44 = this.field3434[var46];
            var45 = this.field3400[var46];
            if (var16 == 1) {
                this.field3418[var46] = var8.method838(255);
            }
        }
        var4.field2583 = var32;
        var5.field2583 = var28;
        var6.field2583 = var26;
        var7.field2583 = var30;
        var8.field2583 = var27;
        for (int var47 = 0; var47 < var10; ++var47) {
            this.field3415[var47] = (short) var4.method835(2);
            if (var12 == 1) {
                int var58 = var5.method838(255);
                if ((var58 & 1) == 1) {
                    this.field3399[var47] = 1;
                    var3 = true;
                } else {
                    this.field3399[var47] = 0;
                }
                if ((var58 & 2) == 2) {
                    this.field3416[var47] = (byte) (var58 >> 2);
                    var2 = true;
                } else {
                    this.field3416[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field3423[var47] = var6.method816(115);
            }
            if (var14 == 1) {
                this.field3403[var47] = var7.method816(114);
            }
            if (var15 == 1) {
                this.field3401[var47] = var8.method838(255);
            }
        }
        var4.field2583 = var25;
        var5.field2583 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; ++var52) {
            int var54 = var5.method838(255);
            if (var54 == 1) {
                var48 = var4.method830(true) + var51;
                var49 = var4.method830(true) + var48;
                var50 = var4.method830(true) + var49;
                var51 = var50;
                this.field3432[var52] = var48;
                this.field3402[var52] = var49;
                this.field3404[var52] = var50;
            }
            if (var54 == 2) {
                var49 = var50;
                var50 = var4.method830(true) + var51;
                var51 = var50;
                this.field3432[var52] = var48;
                this.field3402[var52] = var49;
                this.field3404[var52] = var50;
            }
            if (var54 == 3) {
                var48 = var50;
                var50 = var4.method830(true) + var51;
                var51 = var50;
                this.field3432[var52] = var48;
                this.field3402[var52] = var49;
                this.field3404[var52] = var50;
            }
            if (var54 == 4) {
                int var57 = var48;
                var48 = var49;
                var49 = var57;
                var50 = var4.method830(true) + var51;
                var51 = var50;
                this.field3432[var52] = var48;
                this.field3402[var52] = var57;
                this.field3404[var52] = var50;
            }
        }
        var4.field2583 = var34;
        for (int var53 = 0; var53 < var11; ++var53) {
            this.field3398[var53] = var4.method835(2);
            this.field3413[var53] = var4.method835(2);
            this.field3410[var53] = var4.method835(2);
        }
        if (!var2) {
            this.field3416 = null;
        }
        if (!var3) {
            this.field3399 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "([Lwd;I)V")
    public class144(class144[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        this.field3425 = 0;
        this.field3409 = 0;
        this.field3424 = 0;
        this.field3431 = -1;
        for (int var8 = 0; var8 < arg1; ++var8) {
            class144 var14 = arg0[var8];
            if (var14 != null) {
                this.field3425 += var14.field3425;
                this.field3409 += var14.field3409;
                this.field3424 += var14.field3424;
                if (var14.field3423 != null) {
                    var4 = true;
                } else {
                    if (this.field3431 == -1) {
                        this.field3431 = var14.field3431;
                    }
                    if (this.field3431 != var14.field3431) {
                        var4 = true;
                    }
                }
                var3 |= var14.field3399 != null;
                var5 |= var14.field3403 != null;
                var6 |= var14.field3401 != null;
                var7 |= var14.field3416 != null;
            }
        }
        this.field3427 = new int[this.field3425];
        this.field3434 = new int[this.field3425];
        this.field3400 = new int[this.field3425];
        this.field3418 = new int[this.field3425];
        this.field3432 = new int[this.field3409];
        this.field3402 = new int[this.field3409];
        this.field3404 = new int[this.field3409];
        if (this.field3424 > 0) {
            this.field3398 = new int[this.field3424];
            this.field3413 = new int[this.field3424];
            this.field3410 = new int[this.field3424];
        }
        if (var3) {
            this.field3399 = new byte[this.field3409];
        }
        if (var4) {
            this.field3423 = new byte[this.field3409];
        }
        if (var5) {
            this.field3403 = new byte[this.field3409];
        }
        if (var7) {
            this.field3416 = new byte[this.field3409];
        }
        if (var6) {
            this.field3401 = new int[this.field3409];
        }
        this.field3415 = new short[this.field3409];
        this.field3425 = 0;
        this.field3409 = 0;
        this.field3424 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < arg1; ++var10) {
            class144 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field3409; ++var12) {
                    if (var3 && var11.field3399 != null) {
                        this.field3399[this.field3409] = var11.field3399[var12];
                    }
                    if (var4) {
                        if (var11.field3423 != null) {
                            this.field3423[this.field3409] = var11.field3423[var12];
                        } else {
                            this.field3423[this.field3409] = var11.field3431;
                        }
                    }
                    if (var5 && var11.field3403 != null) {
                        this.field3403[this.field3409] = var11.field3403[var12];
                    }
                    if (var7) {
                        if (var11.field3416 != null && var11.field3416[var12] != -1) {
                            this.field3416[this.field3409] = (byte) (var11.field3416[var12] + var9);
                        } else {
                            this.field3416[this.field3409] = -1;
                        }
                    }
                    if (var6 && var11.field3401 != null) {
                        this.field3401[this.field3409] = var11.field3401[var12];
                    }
                    this.field3415[this.field3409] = var11.field3415[var12];
                    this.field3432[this.field3409] = this.method1116(var11, var11.field3432[var12]);
                    this.field3402[this.field3409] = this.method1116(var11, var11.field3402[var12]);
                    this.field3404[this.field3409] = this.method1116(var11, var11.field3404[var12]);
                    ++this.field3409;
                }
                for (int var13 = 0; var13 < var11.field3424; ++var13) {
                    this.field3398[this.field3424] = this.method1116(var11, var11.field3398[var13]);
                    this.field3413[this.field3424] = this.method1116(var11, var11.field3413[var13]);
                    this.field3410[this.field3424] = this.method1116(var11, var11.field3410[var13]);
                    ++this.field3424;
                }
                var9 += var11.field3424;
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lwd;ZZZ)V")
    public class144(class144 arg0, boolean arg1, boolean arg2, boolean arg3) {
        this.field3425 = arg0.field3425;
        this.field3409 = arg0.field3409;
        this.field3424 = arg0.field3424;
        if (arg1) {
            this.field3427 = arg0.field3427;
            this.field3434 = arg0.field3434;
            this.field3400 = arg0.field3400;
        } else {
            this.field3427 = new int[this.field3425];
            this.field3434 = new int[this.field3425];
            this.field3400 = new int[this.field3425];
            for (int var5 = 0; var5 < this.field3425; ++var5) {
                this.field3427[var5] = arg0.field3427[var5];
                this.field3434[var5] = arg0.field3434[var5];
                this.field3400[var5] = arg0.field3400[var5];
            }
        }
        if (arg2) {
            this.field3415 = arg0.field3415;
        } else {
            this.field3415 = new short[this.field3409];
            for (int var6 = 0; var6 < this.field3409; ++var6) {
                this.field3415[var6] = arg0.field3415[var6];
            }
        }
        if (arg3) {
            this.field3403 = arg0.field3403;
        } else {
            this.field3403 = new byte[this.field3409];
            if (arg0.field3403 == null) {
                for (int var7 = 0; var7 < this.field3409; ++var7) {
                    this.field3403[var7] = 0;
                }
            } else {
                for (int var8 = 0; var8 < this.field3409; ++var8) {
                    this.field3403[var8] = arg0.field3403[var8];
                }
            }
        }
        this.field3432 = arg0.field3432;
        this.field3402 = arg0.field3402;
        this.field3404 = arg0.field3404;
        this.field3399 = arg0.field3399;
        this.field3423 = arg0.field3423;
        this.field3416 = arg0.field3416;
        this.field3431 = arg0.field3431;
        this.field3398 = arg0.field3398;
        this.field3413 = arg0.field3413;
        this.field3410 = arg0.field3410;
        this.field3418 = arg0.field3418;
        this.field3401 = arg0.field3401;
        this.field3419 = arg0.field3419;
        this.field3412 = arg0.field3412;
        this.field3417 = arg0.field3417;
        this.field3420 = arg0.field3420;
        this.field3422 = arg0.field3422;
        this.field3429 = arg0.field3429;
        this.field3405 = arg0.field3405;
    }

    static {
        int var0 = 0;
        int var1 = 248;
        while (var0 < 9) {
            field3414[var0++] = 255;
        }
        while (var0 < 16) {
            field3414[var0++] = var1;
            var1 -= 8;
        }
        while (var0 < 32) {
            field3414[var0++] = var1;
            var1 -= 4;
        }
        while (var0 < 64) {
            field3414[var0++] = var1;
            var1 -= 2;
        }
        while (var0 < 128) {
            field3414[var0++] = var1--;
        }
    }
}
