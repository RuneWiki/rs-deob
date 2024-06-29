import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class112 extends class140 {

    @OriginalMember(owner = "client!qb", name = "Vb", descriptor = "Z")
    private boolean field2560 = false;

    @OriginalMember(owner = "client!qb", name = "ac", descriptor = "I")
    private int field2565 = 0;

    @OriginalMember(owner = "client!qb", name = "nc", descriptor = "I")
    private int field2578 = 0;

    @OriginalMember(owner = "client!qb", name = "yc", descriptor = "B")
    private byte field2589 = 0;

    @OriginalMember(owner = "client!qb", name = "Cc", descriptor = "I")
    private int field2593 = 0;

    @OriginalMember(owner = "client!qb", name = "Ec", descriptor = "[I")
    private int[] field2595;

    @OriginalMember(owner = "client!qb", name = "qc", descriptor = "[I")
    private int[] field2581;

    @OriginalMember(owner = "client!qb", name = "lc", descriptor = "[I")
    private int[] field2576;

    @OriginalMember(owner = "client!qb", name = "vc", descriptor = "[I")
    private int[] field2586;

    @OriginalMember(owner = "client!qb", name = "ec", descriptor = "[I")
    private int[] field2569;

    @OriginalMember(owner = "client!qb", name = "sc", descriptor = "[I")
    private int[] field2583;

    @OriginalMember(owner = "client!qb", name = "Bc", descriptor = "[I")
    private int[] field2592;

    @OriginalMember(owner = "client!qb", name = "pc", descriptor = "[I")
    private int[] field2580;

    @OriginalMember(owner = "client!qb", name = "tc", descriptor = "[I")
    private int[] field2584;

    @OriginalMember(owner = "client!qb", name = "kc", descriptor = "[I")
    private int[] field2575;

    @OriginalMember(owner = "client!qb", name = "wc", descriptor = "[B")
    private byte[] field2587;

    @OriginalMember(owner = "client!qb", name = "hc", descriptor = "[B")
    private byte[] field2572;

    @OriginalMember(owner = "client!qb", name = "Yb", descriptor = "[B")
    private byte[] field2563;

    @OriginalMember(owner = "client!qb", name = "fc", descriptor = "[B")
    private byte[] field2570;

    @OriginalMember(owner = "client!qb", name = "oc", descriptor = "[I")
    private int[] field2579;

    @OriginalMember(owner = "client!qb", name = "cc", descriptor = "[S")
    private short[] field2567;

    @OriginalMember(owner = "client!qb", name = "xc", descriptor = "[[I")
    private int[][] field2588;

    @OriginalMember(owner = "client!qb", name = "gc", descriptor = "[[I")
    private int[][] field2571;

    @OriginalMember(owner = "client!qb", name = "Xb", descriptor = "[Lld;")
    private class80[] field2562;

    @OriginalMember(owner = "client!qb", name = "uc", descriptor = "[Ltd;")
    private class136[] field2585;

    @OriginalMember(owner = "client!qb", name = "dc", descriptor = "[Lld;")
    private class80[] field2568;

    @OriginalMember(owner = "client!qb", name = "Wb", descriptor = "S")
    public short field2561;

    @OriginalMember(owner = "client!qb", name = "mc", descriptor = "S")
    public short field2577;

    @OriginalMember(owner = "client!qb", name = "Zb", descriptor = "[I")
    private static int[] field2564 = new int[128];

    @OriginalMember(owner = "client!qb", name = "rc", descriptor = "[I")
    private static int[] field2582 = new int[10000];

    @OriginalMember(owner = "client!qb", name = "jc", descriptor = "[I")
    private static int[] field2574 = new int[10000];

    @OriginalMember(owner = "client!qb", name = "Dc", descriptor = "I")
    private static int field2594 = 0;

    @OriginalMember(owner = "client!qb", name = "bc", descriptor = "I")
    private int field2566;

    @OriginalMember(owner = "client!qb", name = "ic", descriptor = "I")
    private int field2573;

    @OriginalMember(owner = "client!qb", name = "zc", descriptor = "I")
    private int field2590;

    @OriginalMember(owner = "client!qb", name = "Ac", descriptor = "I")
    private int field2591;

    @OriginalMember(owner = "client!qb", name = "Fc", descriptor = "I")
    private int field2596;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(SS)V")
    public final void method909(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2565; ++var3) {
            if (this.field2567[var3] == arg0) {
                this.field2567[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "()Lqb;")
    public final class112 method910() {
        class112 var1 = new class112();
        if (this.field2587 != null) {
            var1.field2587 = new byte[this.field2565];
            for (int var2 = 0; var2 < this.field2565; ++var2) {
                var1.field2587[var2] = this.field2587[var2];
            }
        }
        var1.field2578 = this.field2578;
        var1.field2565 = this.field2565;
        var1.field2593 = this.field2593;
        var1.field2595 = this.field2595;
        var1.field2581 = this.field2581;
        var1.field2576 = this.field2576;
        var1.field2586 = this.field2586;
        var1.field2569 = this.field2569;
        var1.field2583 = this.field2583;
        var1.field2563 = this.field2563;
        var1.field2570 = this.field2570;
        var1.field2572 = this.field2572;
        var1.field2567 = this.field2567;
        var1.field2589 = this.field2589;
        var1.field2592 = this.field2592;
        var1.field2580 = this.field2580;
        var1.field2584 = this.field2584;
        var1.field2575 = this.field2575;
        var1.field2579 = this.field2579;
        var1.field2588 = this.field2588;
        var1.field2571 = this.field2571;
        var1.field2562 = this.field2562;
        var1.field2585 = this.field2585;
        var1.field2561 = this.field2561;
        var1.field2577 = this.field2577;
        return var1;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIZ)Lqb;")
    public final class112 method911(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg0 == arg1 && arg0 == arg2 && arg0 == arg3) {
            return this;
        } else {
            class112 var6;
            if (arg4) {
                var6 = new class112();
                var6.field2578 = this.field2578;
                var6.field2565 = this.field2565;
                var6.field2593 = this.field2593;
                var6.field2595 = this.field2595;
                var6.field2576 = this.field2576;
                var6.field2586 = this.field2586;
                var6.field2569 = this.field2569;
                var6.field2583 = this.field2583;
                var6.field2587 = this.field2587;
                var6.field2563 = this.field2563;
                var6.field2570 = this.field2570;
                var6.field2572 = this.field2572;
                var6.field2567 = this.field2567;
                var6.field2589 = this.field2589;
                var6.field2592 = this.field2592;
                var6.field2580 = this.field2580;
                var6.field2584 = this.field2584;
                var6.field2575 = this.field2575;
                var6.field2579 = this.field2579;
                var6.field2588 = this.field2588;
                var6.field2571 = this.field2571;
                var6.field2561 = this.field2561;
                var6.field2577 = this.field2577;
                var6.field2581 = new int[var6.field2578];
            } else {
                var6 = this;
            }
            int var7 = (arg0 + arg1 + arg2 + arg3) / 4;
            for (int var8 = 0; var8 < var6.field2578; ++var8) {
                int var9 = this.field2595[var8];
                int var10 = this.field2581[var8];
                int var11 = this.field2576[var8];
                int var12 = (arg1 - arg0) * (var9 + 64) / 128 + arg0;
                int var13 = (arg2 - arg3) * (var9 + 64) / 128 + arg3;
                int var14 = (var13 - var12) * (var11 + 64) / 128 + var12;
                var6.field2581[var8] = var10 + var14 - var7;
            }
            var6.method917();
            return var6;
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "()V")
    private final void method912() {
        int var10002;
        if (this.field2575 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2578; ++var3) {
                int var7 = this.field2575[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field2588 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; ++var4) {
                this.field2588[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field2578) {
                int var6 = this.field2575[var5];
                this.field2588[var6][var1[var6]++] = var5++;
            }
            this.field2575 = null;
        }
        if (this.field2579 != null) {
            int[] var8 = new int[256];
            int var9 = 0;
            for (int var10 = 0; var10 < this.field2565; ++var10) {
                int var14 = this.field2579[var10];
                var10002 = var8[var14]++;
                if (var14 > var9) {
                    var9 = var14;
                }
            }
            this.field2571 = new int[var9 + 1][];
            for (int var11 = 0; var11 <= var9; ++var11) {
                this.field2571[var11] = new int[var8[var11]];
                var8[var11] = 0;
            }
            int var12 = 0;
            while (var12 < this.field2565) {
                int var13 = this.field2579[var12];
                this.field2571[var13][var8[var13]++] = var12++;
            }
            this.field2579 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "()V")
    public final void method913() {
        for (int var1 = 0; var1 < this.field2578; ++var1) {
            this.field2576[var1] = -this.field2576[var1];
        }
        for (int var2 = 0; var2 < this.field2565; ++var2) {
            int var3 = this.field2586[var2];
            this.field2586[var2] = this.field2583[var2];
            this.field2583[var2] = var3;
        }
        this.method917();
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(II)I")
    private static final int method914(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "()V")
    private final void method915() {
        if (!this.field2560) {
            super.field3265 = 0;
            this.field2596 = 0;
            this.field2566 = 999999;
            this.field2590 = -999999;
            this.field2573 = -99999;
            this.field2591 = 99999;
            for (int var1 = 0; var1 < this.field2578; ++var1) {
                int var2 = this.field2595[var1];
                int var3 = this.field2581[var1];
                int var4 = this.field2576[var1];
                if (var2 < this.field2566) {
                    this.field2566 = var2;
                }
                if (var2 > this.field2590) {
                    this.field2590 = var2;
                }
                if (var4 < this.field2591) {
                    this.field2591 = var4;
                }
                if (var4 > this.field2573) {
                    this.field2573 = var4;
                }
                if (-var3 > super.field3265) {
                    super.field3265 = -var3;
                }
                if (var3 > this.field2596) {
                    this.field2596 = var3;
                }
            }
            this.field2560 = true;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)V")
    public final void method916(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2578; ++var4) {
            this.field2595[var4] = this.field2595[var4] * arg0 / 128;
            this.field2581[var4] = this.field2581[var4] * arg1 / 128;
            this.field2576[var4] = this.field2576[var4] * arg2 / 128;
        }
        this.method917();
    }

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "()V")
    private final void method917() {
        this.field2562 = null;
        this.field2568 = null;
        this.field2585 = null;
        this.field2560 = false;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(III)V")
    public final void method918(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2578; ++var4) {
            this.field2595[var4] += arg0;
            this.field2581[var4] += arg1;
            this.field2576[var4] += arg2;
        }
        this.method917();
    }

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "()V")
    public final void method919() {
        for (int var1 = 0; var1 < this.field2578; ++var1) {
            this.field2595[var1] = -this.field2595[var1];
            this.field2576[var1] = -this.field2576[var1];
        }
        this.method917();
    }

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "()V")
    public final void method920() {
        for (int var1 = 0; var1 < this.field2578; ++var1) {
            int var2 = this.field2595[var1];
            this.field2595[var1] = this.field2576[var1];
            this.field2576[var1] = -var2;
        }
        this.method917();
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIII)Lvb;")
    public final class145 method921(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method926();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class145 var8 = new class145();
        var8.field3381 = new int[this.field2565];
        var8.field3401 = new int[this.field2565];
        var8.field3395 = new int[this.field2565];
        for (int var9 = 0; var9 < this.field2565; ++var9) {
            byte var10;
            if (this.field2587 == null) {
                var10 = 0;
            } else {
                var10 = this.field2587[var9];
            }
            if (this.field2572 != null && this.field2572[var9] != -1) {
                if (var10 != 0) {
                    if (var10 == 1) {
                        class136 var17 = this.field2585[var9];
                        int var18 = (var17.field3131 * arg4 + var17.field3133 * arg2 + var17.field3126 * arg3) / (var7 / 2 + var7) + arg0;
                        var8.field3381[var9] = method922(var18);
                        var8.field3395[var9] = -1;
                    } else {
                        var8.field3395[var9] = -2;
                    }
                } else {
                    class80 var11;
                    if (this.field2568 != null && this.field2568[this.field2586[var9]] != null) {
                        var11 = this.field2568[this.field2586[var9]];
                    } else {
                        var11 = this.field2562[this.field2586[var9]];
                    }
                    int var12 = (var11.field1950 * arg4 + var11.field1946 * arg2 + var11.field1935 * arg3) / (var11.field1932 * var7) + arg0;
                    var8.field3381[var9] = method922(var12);
                    class80 var13;
                    if (this.field2568 != null && this.field2568[this.field2569[var9]] != null) {
                        var13 = this.field2568[this.field2569[var9]];
                    } else {
                        var13 = this.field2562[this.field2569[var9]];
                    }
                    int var14 = (var13.field1950 * arg4 + var13.field1946 * arg2 + var13.field1935 * arg3) / (var13.field1932 * var7) + arg0;
                    var8.field3401[var9] = method922(var14);
                    class80 var15;
                    if (this.field2568 != null && this.field2568[this.field2583[var9]] != null) {
                        var15 = this.field2568[this.field2583[var9]];
                    } else {
                        var15 = this.field2562[this.field2583[var9]];
                    }
                    int var16 = (var15.field1950 * arg4 + var15.field1946 * arg2 + var15.field1935 * arg3) / (var15.field1932 * var7) + arg0;
                    var8.field3395[var9] = method922(var16);
                }
            } else if (var10 != 0) {
                if (var10 == 1) {
                    class136 var26 = this.field2585[var9];
                    int var27 = (var26.field3131 * arg4 + var26.field3133 * arg2 + var26.field3126 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field3381[var9] = method914(this.field2567[var9] & 65535, var27);
                    var8.field3395[var9] = -1;
                } else {
                    var8.field3395[var9] = -2;
                }
            } else {
                int var19 = this.field2567[var9] & 65535;
                class80 var20;
                if (this.field2568 != null && this.field2568[this.field2586[var9]] != null) {
                    var20 = this.field2568[this.field2586[var9]];
                } else {
                    var20 = this.field2562[this.field2586[var9]];
                }
                int var21 = (var20.field1950 * arg4 + var20.field1946 * arg2 + var20.field1935 * arg3) / (var20.field1932 * var7) + arg0;
                var8.field3381[var9] = method914(var19, var21);
                class80 var22;
                if (this.field2568 != null && this.field2568[this.field2569[var9]] != null) {
                    var22 = this.field2568[this.field2569[var9]];
                } else {
                    var22 = this.field2562[this.field2569[var9]];
                }
                int var23 = (var22.field1950 * arg4 + var22.field1946 * arg2 + var22.field1935 * arg3) / (var22.field1932 * var7) + arg0;
                var8.field3401[var9] = method914(var19, var23);
                class80 var24;
                if (this.field2568 != null && this.field2568[this.field2583[var9]] != null) {
                    var24 = this.field2568[this.field2583[var9]];
                } else {
                    var24 = this.field2562[this.field2583[var9]];
                }
                int var25 = (var24.field1950 * arg4 + var24.field1946 * arg2 + var24.field1935 * arg3) / (var24.field1932 * var7) + arg0;
                var8.field3395[var9] = method914(var19, var25);
            }
        }
        this.method912();
        var8.field3390 = this.field2578;
        var8.field3394 = this.field2595;
        var8.field3392 = this.field2581;
        var8.field3376 = this.field2576;
        var8.field3380 = this.field2565;
        var8.field3379 = this.field2586;
        var8.field3385 = this.field2569;
        var8.field3400 = this.field2583;
        var8.field3375 = this.field2563;
        var8.field3383 = this.field2570;
        var8.field3391 = this.field2572;
        if (var8.field3391 != null) {
            var8.field3397 = this.field2567;
        } else {
            var8.field3397 = null;
        }
        var8.field3388 = this.field2589;
        var8.field3386 = this.field2593;
        var8.field3387 = this.field2592;
        var8.field3396 = this.field2580;
        var8.field3393 = this.field2584;
        var8.field3384 = this.field2588;
        var8.field3389 = this.field2571;
        return var8;
    }

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "(I)I")
    private static final int method922(int arg0) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 > 127) {
            arg0 = 127;
        }
        return field2564[arg0];
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lqb;Lqb;IIIZ)V")
    public static final void method923(class112 arg0, class112 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method915();
        arg0.method926();
        arg1.method915();
        arg1.method926();
        ++field2594;
        int var6 = 0;
        int[] var7 = arg1.field2595;
        int var8 = arg1.field2578;
        for (int var9 = 0; var9 < arg0.field2578; ++var9) {
            class80 var12 = arg0.field2562[var9];
            if (var12.field1932 != 0) {
                int var13 = arg0.field2581[var9] - arg3;
                if (var13 <= arg1.field2596) {
                    int var14 = arg0.field2595[var9] - arg2;
                    if (var14 >= arg1.field2566 && var14 <= arg1.field2590) {
                        int var15 = arg0.field2576[var9] - arg4;
                        if (var15 >= arg1.field2591 && var15 <= arg1.field2573) {
                            for (int var16 = 0; var16 < var8; ++var16) {
                                class80 var17 = arg1.field2562[var16];
                                if (var7[var16] == var14 && arg1.field2576[var16] == var15 && arg1.field2581[var16] == var13 && var17.field1932 != 0) {
                                    if (arg0.field2568 == null) {
                                        arg0.field2568 = new class80[arg0.field2578];
                                    }
                                    if (arg1.field2568 == null) {
                                        arg1.field2568 = new class80[var8];
                                    }
                                    class80 var18 = arg0.field2568[var9];
                                    if (var18 == null) {
                                        var18 = arg0.field2568[var9] = new class80(var12);
                                    }
                                    class80 var19 = arg1.field2568[var16];
                                    if (var19 == null) {
                                        var19 = arg1.field2568[var16] = new class80(var17);
                                    }
                                    var18.field1946 += var17.field1946;
                                    var18.field1935 += var17.field1935;
                                    var18.field1950 += var17.field1950;
                                    var18.field1932 += var17.field1932;
                                    var19.field1946 += var12.field1946;
                                    var19.field1935 += var12.field1935;
                                    var19.field1950 += var12.field1950;
                                    var19.field1932 += var12.field1932;
                                    ++var6;
                                    field2582[var9] = field2594;
                                    field2574[var16] = field2594;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var6 >= 3 && arg5) {
            for (int var10 = 0; var10 < arg0.field2565; ++var10) {
                if (field2582[arg0.field2586[var10]] == field2594 && field2582[arg0.field2569[var10]] == field2594 && field2582[arg0.field2583[var10]] == field2594) {
                    if (arg0.field2587 == null) {
                        arg0.field2587 = new byte[arg0.field2565];
                    }
                    arg0.field2587[var10] = 2;
                }
            }
            for (int var11 = 0; var11 < arg1.field2565; ++var11) {
                if (field2574[arg1.field2586[var11]] == field2594 && field2574[arg1.field2569[var11]] == field2594 && field2574[arg1.field2583[var11]] == field2594) {
                    if (arg1.field2587 == null) {
                        arg1.field2587 = new byte[arg1.field2565];
                    }
                    arg1.field2587[var11] = 2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lqb;I)I")
    private final int method924(class112 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2595[arg1];
        int var5 = arg0.field2581[arg1];
        int var6 = arg0.field2576[arg1];
        for (int var7 = 0; var7 < this.field2578; ++var7) {
            if (this.field2595[var7] == var4 && this.field2581[var7] == var5 && this.field2576[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2595[this.field2578] = var4;
            this.field2581[this.field2578] = var5;
            this.field2576[this.field2578] = var6;
            if (arg0.field2575 != null) {
                this.field2575[this.field2578] = arg0.field2575[arg1];
            }
            var3 = this.field2578++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lpd;II)Lqb;")
    public static final class112 method925(class108 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method867(arg1, 15, arg2);
        return var3 == null ? null : new class112(var3);
    }

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "()V")
    public final void method926() {
        if (this.field2562 == null) {
            this.field2562 = new class80[this.field2578];
            for (int var1 = 0; var1 < this.field2578; ++var1) {
                this.field2562[var1] = new class80();
            }
            for (int var2 = 0; var2 < this.field2565; ++var2) {
                int var3 = this.field2586[var2];
                int var4 = this.field2569[var2];
                int var5 = this.field2583[var2];
                int var6 = this.field2595[var4] - this.field2595[var3];
                int var7 = this.field2581[var4] - this.field2581[var3];
                int var8 = this.field2576[var4] - this.field2576[var3];
                int var9 = this.field2595[var5] - this.field2595[var3];
                int var10 = this.field2581[var5] - this.field2581[var3];
                int var11 = this.field2576[var5] - this.field2576[var3];
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
                if (this.field2587 == null) {
                    var19 = 0;
                } else {
                    var19 = this.field2587[var2];
                }
                if (var19 == 0) {
                    class80 var20 = this.field2562[var3];
                    var20.field1946 += var16;
                    var20.field1935 += var17;
                    var20.field1950 += var18;
                    ++var20.field1932;
                    class80 var21 = this.field2562[var4];
                    var21.field1946 += var16;
                    var21.field1935 += var17;
                    var21.field1950 += var18;
                    ++var21.field1932;
                    class80 var22 = this.field2562[var5];
                    var22.field1946 += var16;
                    var22.field1935 += var17;
                    var22.field1950 += var18;
                    ++var22.field1932;
                } else if (var19 == 1) {
                    if (this.field2585 == null) {
                        this.field2585 = new class136[this.field2565];
                    }
                    class136 var23 = this.field2585[var2] = new class136();
                    var23.field3133 = var16;
                    var23.field3126 = var17;
                    var23.field3131 = var18;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "()V")
    public final void method927() {
        for (int var1 = 0; var1 < this.field2578; ++var1) {
            int var2 = this.field2576[var1];
            this.field2576[var1] = this.field2595[var1];
            this.field2595[var1] = -var2;
        }
        this.method917();
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V")
    private class112() {
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "([B)V")
    private class112(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class128 var4 = new class128(arg0);
        class128 var5 = new class128(arg0);
        class128 var6 = new class128(arg0);
        class128 var7 = new class128(arg0);
        class128 var8 = new class128(arg0);
        var4.field2873 = arg0.length - 18;
        int var9 = var4.method1041(212464720);
        int var10 = var4.method1041(212464720);
        int var11 = var4.method1025(255);
        int var12 = var4.method1025(255);
        int var13 = var4.method1025(255);
        int var14 = var4.method1025(255);
        int var15 = var4.method1025(255);
        int var16 = var4.method1025(255);
        int var17 = var4.method1041(212464720);
        int var18 = var4.method1041(212464720);
        int var19 = var4.method1041(212464720);
        int var20 = var4.method1041(212464720);
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
        this.field2578 = var9;
        this.field2565 = var10;
        this.field2593 = var11;
        this.field2595 = new int[var9];
        this.field2581 = new int[var9];
        this.field2576 = new int[var9];
        this.field2586 = new int[var10];
        this.field2569 = new int[var10];
        this.field2583 = new int[var10];
        if (var11 > 0) {
            this.field2592 = new int[var11];
            this.field2580 = new int[var11];
            this.field2584 = new int[var11];
        }
        if (var16 == 1) {
            this.field2575 = new int[var9];
        }
        if (var12 == 1) {
            this.field2587 = new byte[var10];
            this.field2572 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2563 = new byte[var10];
        } else {
            this.field2589 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2570 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2579 = new int[var10];
        }
        this.field2567 = new short[var10];
        var4.field2873 = var21;
        var5.field2873 = var36;
        var6.field2873 = var38;
        var7.field2873 = var40;
        var8.field2873 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; ++var46) {
            int var59 = var4.method1025(255);
            int var60 = 0;
            if ((var59 & 1) != 0) {
                var60 = var5.method1029(11932);
            }
            int var61 = 0;
            if ((var59 & 2) != 0) {
                var61 = var6.method1029(11932);
            }
            int var62 = 0;
            if ((var59 & 4) != 0) {
                var62 = var7.method1029(11932);
            }
            this.field2595[var46] = var43 + var60;
            this.field2581[var46] = var44 + var61;
            this.field2576[var46] = var45 + var62;
            var43 = this.field2595[var46];
            var44 = this.field2581[var46];
            var45 = this.field2576[var46];
            if (var16 == 1) {
                this.field2575[var46] = var8.method1025(255);
            }
        }
        var4.field2873 = var32;
        var5.field2873 = var28;
        var6.field2873 = var26;
        var7.field2873 = var30;
        var8.field2873 = var27;
        for (int var47 = 0; var47 < var10; ++var47) {
            this.field2567[var47] = (short) var4.method1041(212464720);
            if (var12 == 1) {
                int var58 = var5.method1025(255);
                if ((var58 & 1) == 1) {
                    this.field2587[var47] = 1;
                    var3 = true;
                } else {
                    this.field2587[var47] = 0;
                }
                if ((var58 & 2) == 2) {
                    this.field2572[var47] = (byte) (var58 >> 2);
                    var2 = true;
                } else {
                    this.field2572[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field2563[var47] = var6.method1028(-115487256);
            }
            if (var14 == 1) {
                this.field2570[var47] = var7.method1028(-115487256);
            }
            if (var15 == 1) {
                this.field2579[var47] = var8.method1025(255);
            }
        }
        var4.field2873 = var25;
        var5.field2873 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; ++var52) {
            int var54 = var5.method1025(255);
            if (var54 == 1) {
                var48 = var4.method1029(11932) + var51;
                var49 = var4.method1029(11932) + var48;
                var50 = var4.method1029(11932) + var49;
                var51 = var50;
                this.field2586[var52] = var48;
                this.field2569[var52] = var49;
                this.field2583[var52] = var50;
            }
            if (var54 == 2) {
                var49 = var50;
                var50 = var4.method1029(11932) + var51;
                var51 = var50;
                this.field2586[var52] = var48;
                this.field2569[var52] = var49;
                this.field2583[var52] = var50;
            }
            if (var54 == 3) {
                var48 = var50;
                var50 = var4.method1029(11932) + var51;
                var51 = var50;
                this.field2586[var52] = var48;
                this.field2569[var52] = var49;
                this.field2583[var52] = var50;
            }
            if (var54 == 4) {
                int var57 = var48;
                var48 = var49;
                var49 = var57;
                var50 = var4.method1029(11932) + var51;
                var51 = var50;
                this.field2586[var52] = var48;
                this.field2569[var52] = var57;
                this.field2583[var52] = var50;
            }
        }
        var4.field2873 = var34;
        for (int var53 = 0; var53 < var11; ++var53) {
            this.field2592[var53] = var4.method1041(212464720);
            this.field2580[var53] = var4.method1041(212464720);
            this.field2584[var53] = var4.method1041(212464720);
        }
        if (!var2) {
            this.field2572 = null;
        }
        if (!var3) {
            this.field2587 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "([Lqb;I)V")
    public class112(class112[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        this.field2578 = 0;
        this.field2565 = 0;
        this.field2593 = 0;
        this.field2589 = -1;
        for (int var8 = 0; var8 < arg1; ++var8) {
            class112 var14 = arg0[var8];
            if (var14 != null) {
                this.field2578 += var14.field2578;
                this.field2565 += var14.field2565;
                this.field2593 += var14.field2593;
                if (var14.field2563 != null) {
                    var4 = true;
                } else {
                    if (this.field2589 == -1) {
                        this.field2589 = var14.field2589;
                    }
                    if (this.field2589 != var14.field2589) {
                        var4 = true;
                    }
                }
                var3 |= var14.field2587 != null;
                var5 |= var14.field2570 != null;
                var6 |= var14.field2579 != null;
                var7 |= var14.field2572 != null;
            }
        }
        this.field2595 = new int[this.field2578];
        this.field2581 = new int[this.field2578];
        this.field2576 = new int[this.field2578];
        this.field2575 = new int[this.field2578];
        this.field2586 = new int[this.field2565];
        this.field2569 = new int[this.field2565];
        this.field2583 = new int[this.field2565];
        if (this.field2593 > 0) {
            this.field2592 = new int[this.field2593];
            this.field2580 = new int[this.field2593];
            this.field2584 = new int[this.field2593];
        }
        if (var3) {
            this.field2587 = new byte[this.field2565];
        }
        if (var4) {
            this.field2563 = new byte[this.field2565];
        }
        if (var5) {
            this.field2570 = new byte[this.field2565];
        }
        if (var7) {
            this.field2572 = new byte[this.field2565];
        }
        if (var6) {
            this.field2579 = new int[this.field2565];
        }
        this.field2567 = new short[this.field2565];
        this.field2578 = 0;
        this.field2565 = 0;
        this.field2593 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < arg1; ++var10) {
            class112 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field2565; ++var12) {
                    if (var3 && var11.field2587 != null) {
                        this.field2587[this.field2565] = var11.field2587[var12];
                    }
                    if (var4) {
                        if (var11.field2563 != null) {
                            this.field2563[this.field2565] = var11.field2563[var12];
                        } else {
                            this.field2563[this.field2565] = var11.field2589;
                        }
                    }
                    if (var5 && var11.field2570 != null) {
                        this.field2570[this.field2565] = var11.field2570[var12];
                    }
                    if (var7) {
                        if (var11.field2572 != null && var11.field2572[var12] != -1) {
                            this.field2572[this.field2565] = (byte) (var11.field2572[var12] + var9);
                        } else {
                            this.field2572[this.field2565] = -1;
                        }
                    }
                    if (var6 && var11.field2579 != null) {
                        this.field2579[this.field2565] = var11.field2579[var12];
                    }
                    this.field2567[this.field2565] = var11.field2567[var12];
                    this.field2586[this.field2565] = this.method924(var11, var11.field2586[var12]);
                    this.field2569[this.field2565] = this.method924(var11, var11.field2569[var12]);
                    this.field2583[this.field2565] = this.method924(var11, var11.field2583[var12]);
                    ++this.field2565;
                }
                for (int var13 = 0; var13 < var11.field2593; ++var13) {
                    this.field2592[this.field2593] = this.method924(var11, var11.field2592[var13]);
                    this.field2580[this.field2593] = this.method924(var11, var11.field2580[var13]);
                    this.field2584[this.field2593] = this.method924(var11, var11.field2584[var13]);
                    ++this.field2593;
                }
                var9 += var11.field2593;
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lqb;ZZZ)V")
    public class112(class112 arg0, boolean arg1, boolean arg2, boolean arg3) {
        this.field2578 = arg0.field2578;
        this.field2565 = arg0.field2565;
        this.field2593 = arg0.field2593;
        if (arg1) {
            this.field2595 = arg0.field2595;
            this.field2581 = arg0.field2581;
            this.field2576 = arg0.field2576;
        } else {
            this.field2595 = new int[this.field2578];
            this.field2581 = new int[this.field2578];
            this.field2576 = new int[this.field2578];
            for (int var5 = 0; var5 < this.field2578; ++var5) {
                this.field2595[var5] = arg0.field2595[var5];
                this.field2581[var5] = arg0.field2581[var5];
                this.field2576[var5] = arg0.field2576[var5];
            }
        }
        if (arg2) {
            this.field2567 = arg0.field2567;
        } else {
            this.field2567 = new short[this.field2565];
            for (int var6 = 0; var6 < this.field2565; ++var6) {
                this.field2567[var6] = arg0.field2567[var6];
            }
        }
        if (arg3) {
            this.field2570 = arg0.field2570;
        } else {
            this.field2570 = new byte[this.field2565];
            if (arg0.field2570 == null) {
                for (int var7 = 0; var7 < this.field2565; ++var7) {
                    this.field2570[var7] = 0;
                }
            } else {
                for (int var8 = 0; var8 < this.field2565; ++var8) {
                    this.field2570[var8] = arg0.field2570[var8];
                }
            }
        }
        this.field2586 = arg0.field2586;
        this.field2569 = arg0.field2569;
        this.field2583 = arg0.field2583;
        this.field2587 = arg0.field2587;
        this.field2563 = arg0.field2563;
        this.field2572 = arg0.field2572;
        this.field2589 = arg0.field2589;
        this.field2592 = arg0.field2592;
        this.field2580 = arg0.field2580;
        this.field2584 = arg0.field2584;
        this.field2575 = arg0.field2575;
        this.field2579 = arg0.field2579;
        this.field2588 = arg0.field2588;
        this.field2571 = arg0.field2571;
        this.field2562 = arg0.field2562;
        this.field2585 = arg0.field2585;
        this.field2568 = arg0.field2568;
        this.field2561 = arg0.field2561;
        this.field2577 = arg0.field2577;
    }

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "()V")
    public static void method928() {
        field2582 = null;
        field2574 = null;
        field2564 = null;
    }

    static {
        int var0 = 0;
        int var1 = 248;
        while (var0 < 9) {
            field2564[var0++] = 255;
        }
        while (var0 < 16) {
            field2564[var0++] = var1;
            var1 -= 8;
        }
        while (var0 < 32) {
            field2564[var0++] = var1;
            var1 -= 4;
        }
        while (var0 < 64) {
            field2564[var0++] = var1;
            var1 -= 2;
        }
        while (var0 < 128) {
            field2564[var0++] = var1--;
        }
    }
}
