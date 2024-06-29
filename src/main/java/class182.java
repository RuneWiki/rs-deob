import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class182 extends class418 {

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "Ldn;")
    private class16 field2433;

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "Lse;")
    private class282 field2435;

    @OriginalMember(owner = "client!gj", name = "t", descriptor = "Lsb;")
    private class153 field2442;

    @OriginalMember(owner = "client!gj", name = "z", descriptor = "I")
    private int field2448;

    @OriginalMember(owner = "client!gj", name = "v", descriptor = "I")
    private int field2444;

    @OriginalMember(owner = "client!gj", name = "C", descriptor = "I")
    private int field2451;

    @OriginalMember(owner = "client!gj", name = "p", descriptor = "I")
    private int field2438;

    @OriginalMember(owner = "client!gj", name = "u", descriptor = "[[F")
    private float[][] field2443;

    @OriginalMember(owner = "client!gj", name = "r", descriptor = "[[F")
    private float[][] field2440;

    @OriginalMember(owner = "client!gj", name = "x", descriptor = "[[F")
    private float[][] field2446;

    @OriginalMember(owner = "client!gj", name = "q", descriptor = "Lfb;")
    private class341 field2439;

    @OriginalMember(owner = "client!gj", name = "B", descriptor = "Lap;")
    private class111 field2450;

    @OriginalMember(owner = "client!gj", name = "w", descriptor = "Lbo;")
    private class453 field2445;

    @OriginalMember(owner = "client!gj", name = "A", descriptor = "Lrd;")
    private class323 field2449;

    @OriginalMember(owner = "client!gj", name = "y", descriptor = "Lmp;")
    private class89 field2447;

    @OriginalMember(owner = "client!gj", name = "o", descriptor = "Lkr;")
    private class26 field2437;

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "Lkr;")
    private class26 field2434;

    @OriginalMember(owner = "client!gj", name = "n", descriptor = "I")
    private int field2436;

    @OriginalMember(owner = "client!gj", name = "s", descriptor = "I")
    private int field2441;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BS)V")
    private final void method1190(byte arg0, short arg1) {
        if (this.field2435.field4232) {
            this.field2439.method2250(false, arg1);
        } else {
            this.field2439.method2206(107, arg1);
        }
        this.field2441++;
        if (arg0 != 106) {
            this.method1192(106, 99, 76, 114, 47, -60, -63);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(III[[ZI)V")
    public final void method1191(int arg0, int arg1, int arg2, boolean[][] arg3, int arg4) {
        if (this.field2449 == null || this.field2448 > arg0 + arg2 || this.field2444 < (arg0 - arg2) || this.field2451 > arg1 + arg2 || arg4 >= -113 || arg1 - arg2 > this.field2438) {
            return;
        }
        for (int var6 = this.field2451; var6 <= this.field2438; var6++) {
            for (int var7 = this.field2448; var7 <= this.field2444; var7++) {
                int var8 = var7 - arg0;
                int var9 = var6 - arg1;
                if (var8 > (-arg2) && arg2 > var8 && var9 > -arg2 && arg2 > var9 && arg3[arg2 + var8][arg2 + var9]) {
                    this.field2435.method1923((int) (this.field2433.field270 * 255.0F) << 24);
                    this.field2435.method1883(this.field2437);
                    this.field2435.method1902(this.field2434);
                    this.field2435.method1930();
                    this.field2435.method1891(this.field2449, 4, 0, this.field2441);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIIII)V")
    private final void method1192(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        long var8 = -1L;
        int var10 = arg1 + (arg3 << this.field2442.field1921);
        int var11 = (arg2 << this.field2442.field1921) + arg6;
        int var12 = this.field2442.method725(var10, var11);
        if ((arg1 & 0x7F) == 0 || (arg6 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | (long) var11 & 0xFFFFL << 16;
            class418 var13 = this.field2445.method2826(false, var8);
            if (var13 != null) {
                this.method1190((byte) 106, ((class116) var13).field1512);
                return;
            }
        }
        short var14 = (short) (this.field2436++);
        if (var8 != -1L) {
            this.field2445.method2815(arg5 ^ 0xFFFFFFFE, var8, new class116(var14));
        }
        float var15;
        float var16;
        float var17;
        if (arg1 == 0 && arg6 == 0) {
            var15 = this.field2446[arg4][arg0];
            var16 = this.field2440[arg4][arg0];
            var17 = this.field2443[arg4][arg0];
        } else if (this.field2442.field1923 == arg1 && arg6 == 0) {
            var17 = this.field2443[arg4 + 1][arg0];
            var16 = this.field2440[arg4 + 1][arg0];
            var15 = this.field2446[arg4 + 1][arg0];
        } else if (this.field2442.field1923 == arg1 && this.field2442.field1923 == arg6) {
            var17 = this.field2443[arg4 + 1][arg0 + 1];
            var15 = this.field2446[arg4 + 1][arg0 + 1];
            var16 = this.field2440[arg4 + 1][arg0 + 1];
        } else if (arg1 == 0 && this.field2442.field1923 == arg6) {
            var16 = this.field2440[arg4][arg0 + 1];
            var15 = this.field2446[arg4][arg0 + 1];
            var17 = this.field2443[arg4][arg0 + 1];
        } else {
            float var18 = (float) arg1 / (float) this.field2442.field1923;
            float var19 = (float) arg6 / (float) this.field2442.field1923;
            float var20 = this.field2446[arg4][arg0];
            float var21 = this.field2443[arg4][arg0];
            float var22 = this.field2440[arg4][arg0];
            float var23 = this.field2446[arg4 + 1][arg0];
            float var24 = this.field2443[arg4 + 1][arg0];
            float var25 = this.field2440[arg4 + 1][arg0];
            float var26 = (this.field2446[arg4 + 1][arg0 + 1] - var23) * var18 + var23;
            float var27 = (this.field2443[arg4][arg0 + 1] - var21) * var18 + var21;
            float var28 = (this.field2440[arg4][arg0 + 1] - var22) * var18 + var22;
            float var29 = (this.field2446[arg4][arg0 + 1] - var20) * var18 + var20;
            float var30 = (this.field2443[arg4 + 1][arg0 + 1] - var24) * var18 + var24;
            float var31 = (this.field2440[arg4 + 1][arg0 + 1] - var25) * var18 + var25;
            var15 = (var26 - var29) * var19 + var29;
            var17 = (var30 - var27) * var19 + var27;
            var16 = (var31 - var28) * var19 + var28;
        }
        float var32 = (float) (this.field2433.field264 - var10);
        float var33 = (float) (this.field2433.field272 - var12);
        float var34 = (float) (this.field2433.field269 - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var32 * var36;
        float var38 = var34 * var36;
        float var39 = var33 * var36;
        float var40 = var35 / (float) this.field2433.field263;
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var16 * var38 + var15 * var37 + var17 * var39;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > (float) arg5) {
            var43 = 1.0F;
        }
        int var44 = this.field2433.field268;
        int var45 = (int) ((float) ((var44 & 0xFFED4A) >> 16) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFF77) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field2435.field4232) {
            this.field2450.method826((float) var10, 2107956560);
            this.field2450.method826((float) var12, 2107956560);
            this.field2450.method826((float) var11, 2107956560);
        } else {
            this.field2450.method827(1300078504, (float) var10);
            this.field2450.method827(arg5 + 1300078503, (float) var12);
            this.field2450.method827(1300078504, (float) var11);
        }
        this.field2450.method2204(var45, 8);
        this.field2450.method2204(var46, 8);
        this.field2450.method2204(var47, 8);
        this.field2450.method2204(255, arg5 + 7);
        this.method1190((byte) 106, var14);
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lse;Lsb;Ldn;[I)V")
    public class182(class282 arg0, class153 arg1, class16 arg2, int[] arg3) {
        this.field2433 = arg2;
        this.field2435 = arg0;
        this.field2442 = arg1;
        int var5 = this.field2433.field263 - (arg1.field1923 >> 1);
        this.field2448 = this.field2433.field264 - var5 >> arg1.field1921;
        this.field2444 = this.field2433.field264 + var5 >> arg1.field1921;
        this.field2451 = this.field2433.field269 - var5 >> arg1.field1921;
        this.field2438 = this.field2433.field269 + var5 >> arg1.field1921;
        int var6 = this.field2444 + 1 - this.field2448;
        int var7 = this.field2438 + 1 - this.field2451;
        this.field2443 = new float[var6 + 1][var7 + 1];
        this.field2440 = new float[var6 + 1][var7 + 1];
        this.field2446 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var9 = var8 + this.field2451;
            if (var9 > 0 && var9 < (this.field2442.field2685 - 1)) {
                for (int var10 = 0; var10 <= var6; var10++) {
                    int var11 = this.field2448 + var10;
                    if (var11 > 0 && var11 < (this.field2442.field2681 - 1)) {
                        int var12 = arg1.method722(var11 + 1, var9) - arg1.method722(var11 - 1, var9);
                        int var13 = arg1.method722(var11, var9 + 1) - arg1.method722(var11, var9 - 1);
                        float var14 = (float) (1.0D / Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536)));
                        this.field2446[var10][var8] = (float) var12 * var14;
                        this.field2443[var10][var8] = var14 * -256.0F;
                        this.field2440[var10][var8] = (float) var13 * var14;
                    }
                }
            }
        }
        int var15 = 0;
        int var16 = 0;
        for (int var17 = this.field2451; var17 <= this.field2438; var17++) {
            if (var17 >= 0 && var17 < arg1.field2685) {
                for (int var18 = this.field2448; var18 <= this.field2444; var18++) {
                    if (var18 >= 0 && arg1.field2681 > var18) {
                        int var19 = arg3[var16];
                        int[] var20 = arg1.field1930[var18][var17];
                        if (var20 != null && var19 != 0) {
                            if (var19 == 1) {
                                var15 += var20.length;
                            } else {
                                var15 += 3;
                            }
                        }
                    }
                    var16++;
                }
            } else {
                var16 += this.field2444 - this.field2448;
            }
        }
        if (var15 > 0) {
            this.field2439 = new class341(var15 * 2);
            this.field2450 = new class111(var15 * 16);
            this.field2445 = new class453(class41.method299(2, var15));
            int var21 = 0;
            int var22 = 0;
            for (int var23 = this.field2451; var23 <= this.field2438; var23++) {
                if (var23 >= 0 && var23 < arg1.field2685) {
                    int var24 = 0;
                    for (int var25 = this.field2448; var25 <= this.field2444; var25++) {
                        if (var25 >= 0 && arg1.field2681 > var25) {
                            int var26 = arg3[var21];
                            int[] var27 = arg1.field1930[var25][var23];
                            int[] var28 = arg1.field1928[var25][var23];
                            if (var27 != null && var26 != 0) {
                                if (var26 == 1) {
                                    for (int var29 = 0; var29 < var27.length; var29++) {
                                        this.method1192(var22, var27[var29], var23, var25, var24, 1, var28[var29]);
                                    }
                                } else if (var26 == 3) {
                                    this.method1192(var22, 0, var23, var25, var24, 1, 0);
                                    this.method1192(var22, arg1.field1923, var23, var25, var24, 1, 0);
                                    this.method1192(var22, 0, var23, var25, var24, 1, arg1.field1923);
                                } else if (var26 == 2) {
                                    this.method1192(var22, arg1.field1923, var23, var25, var24, 1, 0);
                                    this.method1192(var22, arg1.field1923, var23, var25, var24, 1, arg1.field1923);
                                    this.method1192(var22, 0, var23, var25, var24, 1, 0);
                                } else if (var26 == 5) {
                                    this.method1192(var22, arg1.field1923, var23, var25, var24, 1, arg1.field1923);
                                    this.method1192(var22, 0, var23, var25, var24, 1, arg1.field1923);
                                    this.method1192(var22, arg1.field1923, var23, var25, var24, 1, 0);
                                } else if (var26 == 4) {
                                    this.method1192(var22, 0, var23, var25, var24, 1, arg1.field1923);
                                    this.method1192(var22, 0, var23, var25, var24, 1, 0);
                                    this.method1192(var22, arg1.field1923, var23, var25, var24, 1, arg1.field1923);
                                }
                            }
                        }
                        var24++;
                        var21++;
                    }
                } else {
                    var21 += this.field2444 - this.field2448;
                }
                var22++;
            }
            this.field2449 = this.field2435.method1882(5123, this.field2439.field5042, this.field2439.field5049, false);
            this.field2447 = this.field2435.method1934(16, this.field2450.field5042, this.field2450.field5049, false);
            this.field2437 = new class26(this.field2435, this.field2447, 5126, 3, 0);
            this.field2434 = new class26(this.field2435, this.field2447, 5121, 4, 12);
        } else {
            this.field2447 = null;
            this.field2449 = null;
            this.field2437 = null;
            this.field2434 = null;
        }
        this.field2446 = this.field2443 = this.field2440 = (float[][]) null;
        this.field2450 = null;
        this.field2445 = null;
        this.field2439 = null;
    }
}
