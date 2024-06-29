import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class270 extends class435 {

    @OriginalMember(owner = "client!br", name = "r", descriptor = "Lur;")
    private class377 field3596;

    @OriginalMember(owner = "client!br", name = "E", descriptor = "Lbn;")
    private class309 field3609;

    @OriginalMember(owner = "client!br", name = "L", descriptor = "Lsp;")
    private class452 field3615;

    @OriginalMember(owner = "client!br", name = "q", descriptor = "I")
    private int field3595;

    @OriginalMember(owner = "client!br", name = "m", descriptor = "I")
    private int field3591;

    @OriginalMember(owner = "client!br", name = "y", descriptor = "I")
    private int field3603;

    @OriginalMember(owner = "client!br", name = "K", descriptor = "I")
    private int field3614;

    @OriginalMember(owner = "client!br", name = "B", descriptor = "[[F")
    private float[][] field3606;

    @OriginalMember(owner = "client!br", name = "l", descriptor = "[[F")
    private float[][] field3590;

    @OriginalMember(owner = "client!br", name = "v", descriptor = "[[F")
    private float[][] field3600;

    @OriginalMember(owner = "client!br", name = "u", descriptor = "Lfe;")
    private class404 field3599;

    @OriginalMember(owner = "client!br", name = "H", descriptor = "Ltp;")
    private class374 field3612;

    @OriginalMember(owner = "client!br", name = "D", descriptor = "Ltp;")
    private class374 field3608;

    @OriginalMember(owner = "client!br", name = "t", descriptor = "Lse;")
    private class170 field3598;

    @OriginalMember(owner = "client!br", name = "J", descriptor = "Lug;")
    private class396 field3613;

    @OriginalMember(owner = "client!br", name = "p", descriptor = "Luo;")
    private class408 field3594;

    @OriginalMember(owner = "client!br", name = "x", descriptor = "Lqh;")
    private class50 field3602;

    @OriginalMember(owner = "client!br", name = "M", descriptor = "I")
    public static int field3616 = 0;

    @OriginalMember(owner = "client!br", name = "s", descriptor = "Lho;")
    public static class103 field3597 = new class103(70, 2);

    @OriginalMember(owner = "client!br", name = "n", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!br", name = "o", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!br", name = "w", descriptor = "I")
    private int field3601;

    @OriginalMember(owner = "client!br", name = "z", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!br", name = "A", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!br", name = "C", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!br", name = "F", descriptor = "I")
    private int field3610;

    @OriginalMember(owner = "client!br", name = "G", descriptor = "I")
    public static int field3611;

    static {
        new class305(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(BF)F", line = 6)
    public static final float method1639(byte arg0, float arg1) {
        int var2 = -31 % ((-arg0 - 28) / 36);
        field3592++;
        return arg1 * arg1 * arg1 * ((arg1 * 6.0F - 15.0F) * arg1 + 10.0F);
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(III[[ZB)V", line = 16)
    public final void method1640(int arg0, int arg1, int arg2, boolean[][] arg3, byte arg4) {
        field3611++;
        if (arg4 != -40) {
            this.field3608 = null;
        }
        if (this.field3599 == null || arg0 + arg2 < this.field3595 || this.field3591 < arg2 - arg0 || this.field3603 > (arg1 + arg0) || (arg1 - arg0) > this.field3614) {
            return;
        }
        for (int var6 = this.field3603; var6 <= this.field3614; var6++) {
            for (int var7 = this.field3595; var7 <= this.field3591; var7++) {
                int var8 = var7 - arg2;
                int var9 = var6 - arg1;
                if (-arg0 < var8 && var8 < arg0 && var9 > (-arg0) && arg0 > var9 && arg3[arg0 + var8][arg0 + var9]) {
                    this.field3596.method2276((int) (this.field3609.method1849(arg4 ^ 0xFFFFFFA8) * 255.0F) << 24, (byte) -22);
                    this.field3596.method2293(this.field3608, null, this.field3612, arg4 + 32924, null);
                    this.field3596.method2247(this.field3610, (byte) 81, 0, 4, this.field3599);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(Z)V", line = 76)
    public static void method1641(boolean arg0) {
        field3597 = null;
        if (arg0) {
            field3605 = -82;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(SI)V", line = 86)
    private final void method1642(short arg0, int arg1) {
        if (this.field3596.field5334) {
            this.field3613.method2444((byte) 65, arg0);
        } else {
            this.field3613.method2434(-12659, arg0);
        }
        if (arg1 == 4) {
            field3593++;
            this.field3610++;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IIIIIII)V", line = 113)
    private final void method1643(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3607++;
        int var8 = -75 % ((arg4 - 22) / 51);
        long var9 = -1L;
        int var11 = (arg2 << this.field3615.field387) + arg5;
        int var12 = (arg0 << this.field3615.field387) + arg1;
        int var13 = this.field3615.method216(var11, var12);
        if ((arg5 & 0x7F) == 0 || (arg1 & 0x7F) == 0) {
            var9 = (long) var11 & 0xFFFFL | ((long) var12 & 0xFFFFL) << 16;
            class435 var14 = this.field3602.method295(var9, -115);
            if (var14 != null) {
                this.method1642(((class267) var14).field3574, 4);
                return;
            }
        }
        short var15 = (short) (this.field3601++);
        if (var9 != -1L) {
            this.field3602.method291(var9, new class267(var15), -78);
        }
        float var16;
        float var17;
        float var18;
        if (arg5 == 0 && arg1 == 0) {
            var16 = this.field3606[arg3][arg6];
            var17 = this.field3600[arg3][arg6];
            var18 = this.field3590[arg3][arg6];
        } else if (this.field3615.field392 == arg5 && arg1 == 0) {
            var18 = this.field3590[arg3 + 1][arg6];
            var17 = this.field3600[arg3 + 1][arg6];
            var16 = this.field3606[arg3 + 1][arg6];
        } else if (this.field3615.field392 == arg5 && this.field3615.field392 == arg1) {
            var18 = this.field3590[arg3 + 1][arg6 + 1];
            var17 = this.field3600[arg3 + 1][arg6 + 1];
            var16 = this.field3606[arg3 + 1][arg6 + 1];
        } else if (arg5 == 0 && this.field3615.field392 == arg1) {
            var18 = this.field3590[arg3][arg6 + 1];
            var16 = this.field3606[arg3][arg6 + 1];
            var17 = this.field3600[arg3][arg6 + 1];
        } else {
            float var19 = (float) arg5 / (float) this.field3615.field392;
            float var20 = (float) arg1 / (float) this.field3615.field392;
            float var21 = this.field3606[arg3][arg6];
            float var22 = this.field3600[arg3][arg6];
            float var23 = this.field3590[arg3][arg6];
            float var24 = this.field3606[arg3 + 1][arg6];
            float var25 = this.field3600[arg3 + 1][arg6];
            float var26 = (this.field3606[arg3 + 1][arg6 + 1] - var24) * var19 + var24;
            float var27 = (this.field3606[arg3][arg6 + 1] - var21) * var19 + var21;
            float var28 = (this.field3600[arg3 + 1][arg6 + 1] - var25) * var19 + var25;
            float var29 = (this.field3600[arg3][arg6 + 1] - var22) * var19 + var22;
            float var30 = (this.field3590[arg3][arg6 + 1] - var23) * var19 + var23;
            float var31 = this.field3590[arg3 + 1][arg6];
            var16 = (var26 - var27) * var20 + var27;
            var17 = (var28 - var29) * var20 + var29;
            float var32 = (this.field3590[arg3 + 1][arg6 + 1] - var31) * var19 + var31;
            var18 = (var32 - var30) * var20 + var30;
        }
        float var33 = (float) (this.field3609.method1840((byte) -122) - var11);
        float var34 = (float) (this.field3609.method1841(0) - var13);
        float var35 = (float) (this.field3609.method1842((byte) 112) - var12);
        float var36 = (float) Math.sqrt((double) (var35 * var35 + var33 * var33 + var34 * var34));
        float var37 = 1.0F / var36;
        float var38 = var33 * var37;
        float var39 = var34 * var37;
        float var40 = var35 * var37;
        float var41 = var36 / (float) this.field3609.method1845((byte) -98);
        float var42 = 1.0F - var41 * var41;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var18 * var40 + var16 * var38 + var17 * var39;
        if (var43 < 0.0F) {
            var43 = 0.0F;
        }
        float var44 = var42 * var43 * 2.0F;
        if (var44 > 1.0F) {
            var44 = 1.0F;
        }
        int var45 = this.field3609.method1847(8);
        int var46 = (int) ((float) ((var45 & 0xFFA257) >> 16) * var44);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var45 >> 8 & 0xFF) * var44);
        if (var47 > 255) {
            var47 = 255;
        }
        int var48 = (int) ((float) (var45 & 0xFF) * var44);
        if (var48 > 255) {
            var48 = 255;
        }
        if (this.field3596.field5334) {
            this.field3594.method2498(-123, (float) var11);
            this.field3594.method2498(-123, (float) var13);
            this.field3594.method2498(-123, (float) var12);
        } else {
            this.field3594.method2497((byte) -123, (float) var11);
            this.field3594.method2497((byte) 127, (float) var13);
            this.field3594.method2497((byte) 126, (float) var12);
        }
        this.field3594.method2449((byte) 121, var46);
        this.field3594.method2449((byte) 116, var47);
        this.field3594.method2449((byte) 125, var48);
        this.field3594.method2449((byte) 127, 255);
        this.method1642(var15, 4);
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(BI)Z", line = 284)
    public static final boolean method1644(byte arg0, int arg1) {
        field3604++;
        int var2 = 51 / ((20 - arg0) / 32);
        return arg1 == 6 || arg1 == 7 || arg1 == 8;
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lur;Lsp;Lbn;[I)V", line = 301)
    public class270(class377 arg0, class452 arg1, class309 arg2, int[] arg3) {
        this.field3596 = arg0;
        this.field3609 = arg2;
        this.field3615 = arg1;
        int var5 = this.field3609.method1845((byte) -98) - (arg1.field392 >> 1);
        this.field3595 = this.field3609.method1840((byte) 100) - var5 >> arg1.field387;
        this.field3591 = this.field3609.method1840((byte) 50) + var5 >> arg1.field387;
        this.field3603 = this.field3609.method1842((byte) 107) - var5 >> arg1.field387;
        this.field3614 = var5 + this.field3609.method1842((byte) 98) >> arg1.field387;
        int var6 = this.field3591 + 1 - this.field3595;
        int var7 = this.field3614 + 1 - this.field3603;
        this.field3606 = new float[var6 + 1][var7 + 1];
        this.field3590 = new float[var6 + 1][var7 + 1];
        this.field3600 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var24 = this.field3603 + var8;
            if (var24 > 0 && var24 < (this.field3615.field394 - 1)) {
                for (int var25 = 0; var25 <= var6; var25++) {
                    int var26 = this.field3595 + var25;
                    if (var26 > 0 && this.field3615.field391 - 1 > var26) {
                        int var27 = arg1.method217(var26 + 1, var24) - arg1.method217(var26 - 1, var24);
                        int var28 = arg1.method217(var26, var24 + 1) - arg1.method217(var26, var24 - 1);
                        float var29 = (float) (1.0D / Math.sqrt((double) (var27 * var27 + var28 * var28 + 65536)));
                        this.field3606[var25][var8] = (float) var27 * var29;
                        this.field3600[var25][var8] = var29 * -256.0F;
                        this.field3590[var25][var8] = (float) var28 * var29;
                    }
                }
            }
        }
        int var9 = 0;
        int var10 = 0;
        for (int var11 = this.field3603; var11 <= this.field3614; var11++) {
            if (var11 >= 0 && arg1.field394 > var11) {
                for (int var21 = this.field3595; var21 <= this.field3591; var21++) {
                    if (var21 >= 0 && var21 < arg1.field391) {
                        int var22 = arg3[var10];
                        int[] var23 = arg1.field6730[var21][var11];
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
                var10 += this.field3591 - this.field3595;
            }
        }
        if (var9 <= 0) {
            this.field3599 = null;
            this.field3612 = null;
            this.field3608 = null;
            this.field3598 = null;
        } else {
            this.field3613 = new class396(var9 * 2);
            this.field3594 = new class408(var9 * 16);
            this.field3602 = new class50(class111.method682(-125, var9));
            int var12 = 0;
            int var13 = 0;
            for (int var14 = this.field3603; var14 <= this.field3614; var14++) {
                if (var14 >= 0 && var14 < arg1.field394) {
                    int var15 = 0;
                    for (int var16 = this.field3595; var16 <= this.field3591; var16++) {
                        if (var16 >= 0 && arg1.field391 > var16) {
                            int var17 = arg3[var13];
                            int[] var18 = arg1.field6730[var16][var14];
                            int[] var19 = arg1.field6756[var16][var14];
                            if (var18 != null && var17 != 0) {
                                if (var17 == 1) {
                                    for (int var20 = 0; var20 < var18.length; var20++) {
                                        this.method1643(var14, var19[var20], var16, var15, -113, var18[var20], var12);
                                    }
                                } else if (var17 == 3) {
                                    this.method1643(var14, 0, var16, var15, -87, 0, var12);
                                    this.method1643(var14, 0, var16, var15, -110, arg1.field392, var12);
                                    this.method1643(var14, arg1.field392, var16, var15, -85, 0, var12);
                                } else if (var17 == 2) {
                                    this.method1643(var14, 0, var16, var15, 84, arg1.field392, var12);
                                    this.method1643(var14, arg1.field392, var16, var15, 122, arg1.field392, var12);
                                    this.method1643(var14, 0, var16, var15, 111, 0, var12);
                                } else if (var17 == 5) {
                                    this.method1643(var14, arg1.field392, var16, var15, 126, arg1.field392, var12);
                                    this.method1643(var14, arg1.field392, var16, var15, -120, 0, var12);
                                    this.method1643(var14, 0, var16, var15, -90, arg1.field392, var12);
                                } else if (var17 == 4) {
                                    this.method1643(var14, arg1.field392, var16, var15, -103, 0, var12);
                                    this.method1643(var14, 0, var16, var15, 79, 0, var12);
                                    this.method1643(var14, arg1.field392, var16, var15, 127, arg1.field392, var12);
                                }
                            }
                        }
                        var15++;
                        var13++;
                    }
                } else {
                    var13 += this.field3591 - this.field3595;
                }
                var12++;
            }
            this.field3599 = this.field3596.method2308(false, 5123, this.field3613.field5729, this.field3613.field5761, 12905);
            this.field3598 = this.field3596.method2307(this.field3594.field5761, 7938, this.field3594.field5729, false, 16);
            this.field3608 = new class374(this.field3598, 5126, 3, 0);
            this.field3612 = new class374(this.field3598, 5121, 4, 12);
        }
        this.field3602 = null;
        this.field3613 = null;
        this.field3606 = this.field3600 = this.field3590 = null;
        this.field3594 = null;
    }
}
