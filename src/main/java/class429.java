import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class429 extends class393 {

    @OriginalMember(owner = "client!tj", name = "w", descriptor = "Lfe;")
    private class403 field6351;

    @OriginalMember(owner = "client!tj", name = "q", descriptor = "Lms;")
    private class448 field6345;

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "Lih;")
    private class330 field6342;

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "I")
    private int field6341;

    @OriginalMember(owner = "client!tj", name = "C", descriptor = "I")
    private int field6357;

    @OriginalMember(owner = "client!tj", name = "E", descriptor = "I")
    private int field6359;

    @OriginalMember(owner = "client!tj", name = "y", descriptor = "I")
    private int field6353;

    @OriginalMember(owner = "client!tj", name = "v", descriptor = "[[F")
    private float[][] field6350;

    @OriginalMember(owner = "client!tj", name = "u", descriptor = "[[F")
    private float[][] field6349;

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "[[F")
    private float[][] field6343;

    @OriginalMember(owner = "client!tj", name = "A", descriptor = "Lil;")
    private class265 field6355;

    @OriginalMember(owner = "client!tj", name = "B", descriptor = "Lsb;")
    private class362 field6356;

    @OriginalMember(owner = "client!tj", name = "r", descriptor = "Lsf;")
    private class143 field6346;

    @OriginalMember(owner = "client!tj", name = "p", descriptor = "Lir;")
    private class217 field6344;

    @OriginalMember(owner = "client!tj", name = "s", descriptor = "Lcj;")
    private class182 field6347;

    @OriginalMember(owner = "client!tj", name = "x", descriptor = "Lam;")
    private class287 field6352;

    @OriginalMember(owner = "client!tj", name = "D", descriptor = "Lam;")
    private class287 field6358;

    @OriginalMember(owner = "client!tj", name = "t", descriptor = "I")
    private int field6348;

    @OriginalMember(owner = "client!tj", name = "z", descriptor = "I")
    private int field6354;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IS)V", line = 13)
    private final void method2738(int arg0, short arg1) {
        if (arg0 > -23) {
            this.method2739(-115, -80, 75, 30, -19, (byte) -64, 51);
        }
        if (this.field6342.field4797) {
            this.field6355.method1693(arg1, (byte) 52);
        } else {
            this.field6355.method1715(677910600, arg1);
        }
        this.field6354++;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIIIBI)V", line = 31)
    private final void method2739(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        long var8 = -1L;
        int var10 = (arg0 << this.field6345.field6522) + arg4;
        int var11 = (arg2 << this.field6345.field6522) + arg1;
        int var12 = this.field6345.method797(var10, var11);
        if ((arg4 & 0x7F) == 0 || (arg1 & 0x7F) == 0) {
            var8 = ((long) var11 & 0xFFFFL) << 16 | (long) var10 & 0xFFFFL;
            class393 var13 = this.field6346.method954(-115, var8);
            if (var13 != null) {
                this.method2738(-89, ((class124) var13).field1652);
                return;
            }
        }
        short var14 = (short) (this.field6348++);
        if (var8 != -1L) {
            this.field6346.method956(false, var8, new class124(var14));
        }
        float var15;
        float var16;
        float var17;
        if (arg4 == 0 && arg1 == 0) {
            var15 = this.field6350[arg3][arg6];
            var16 = this.field6349[arg3][arg6];
            var17 = this.field6343[arg3][arg6];
        } else if (this.field6345.field6533 == arg4 && arg1 == 0) {
            var15 = this.field6350[arg3 + 1][arg6];
            var17 = this.field6343[arg3 + 1][arg6];
            var16 = this.field6349[arg3 + 1][arg6];
        } else if (this.field6345.field6533 == arg4 && this.field6345.field6533 == arg1) {
            var17 = this.field6343[arg3 + 1][arg6 + 1];
            var15 = this.field6350[arg3 + 1][arg6 + 1];
            var16 = this.field6349[arg3 + 1][arg6 + 1];
        } else if (arg4 == 0 && this.field6345.field6533 == arg1) {
            var16 = this.field6349[arg3][arg6 + 1];
            var15 = this.field6350[arg3][arg6 + 1];
            var17 = this.field6343[arg3][arg6 + 1];
        } else {
            float var18 = (float) arg4 / (float) this.field6345.field6533;
            float var19 = (float) arg1 / (float) this.field6345.field6533;
            float var20 = this.field6350[arg3][arg6];
            float var21 = this.field6349[arg3][arg6];
            float var22 = this.field6343[arg3][arg6];
            float var23 = this.field6350[arg3 + 1][arg6];
            float var24 = this.field6349[arg3 + 1][arg6];
            float var25 = (this.field6350[arg3 + 1][arg6 + 1] - var23) * var18 + var23;
            float var26 = (this.field6350[arg3][arg6 + 1] - var20) * var18 + var20;
            float var27 = (this.field6349[arg3 + 1][arg6 + 1] - var24) * var18 + var24;
            float var28 = (this.field6343[arg3][arg6 + 1] - var22) * var18 + var22;
            float var29 = this.field6343[arg3 + 1][arg6];
            float var30 = (this.field6349[arg3][arg6 + 1] - var21) * var18 + var21;
            float var31 = (this.field6343[arg3 + 1][arg6 + 1] - var29) * var18 + var29;
            var15 = (var25 - var26) * var19 + var26;
            var16 = (var27 - var30) * var19 + var30;
            var17 = (var31 - var28) * var19 + var28;
        }
        float var32 = (float) (this.field6351.field5994 - var10);
        float var33 = (float) (this.field6351.field5984 - var12);
        float var34 = (float) (this.field6351.field5990 - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var34 * var36;
        float var38 = var32 * var36;
        float var39 = var33 * var36;
        float var40 = var35 / (float) this.field6351.field5991;
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var17 * var37 + var15 * var38 + var16 * var39;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field6351.field5988;
        int var45 = (int) ((float) ((var44 & 0xFFAF5A) >> 16) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFF4B) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (this.field6342.field4797) {
            this.field6356.method2376((float) var10, (byte) 126);
            this.field6356.method2376((float) var12, (byte) 126);
            this.field6356.method2376((float) var11, (byte) 126);
        } else {
            this.field6356.method2375((float) var10, (byte) -30);
            this.field6356.method2375((float) var12, (byte) -30);
            this.field6356.method2375((float) var11, (byte) -30);
        }
        if (arg5 < 35) {
            this.field6349 = (float[][]) ((float[][]) null);
        }
        if (var47 > 255) {
            var47 = 255;
        }
        this.field6356.method1707(26, var45);
        this.field6356.method1707(42, var46);
        this.field6356.method1707(-127, var47);
        this.field6356.method1707(-116, 255);
        this.method2738(-97, var14);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II[[ZBI)V", line = 196)
    public final void method2740(int arg0, int arg1, boolean[][] arg2, byte arg3, int arg4) {
        if (this.field6344 == null || this.field6341 > arg0 + arg1 || this.field6357 < (arg0 - arg1) || (arg1 + arg4) < this.field6359 || this.field6353 < arg4 - arg1) {
            return;
        }
        for (int var6 = this.field6359; var6 <= this.field6353; var6++) {
            for (int var7 = this.field6341; var7 <= this.field6357; var7++) {
                int var8 = var7 - arg0;
                int var9 = var6 - arg4;
                if ((-arg1) < var8 && var8 < arg1 && (-arg1) < var9 && arg1 > var9 && arg2[arg1 + var8][var9 + arg1]) {
                    this.field6342.method2115((int) (this.field6351.field5986 * 255.0F) << 24);
                    this.field6342.method2087(this.field6352, (class287) null, this.field6358, (class287) null);
                    this.field6342.method2100(this.field6344, 4, 0, this.field6354);
                    return;
                }
            }
        }
        if (arg3 != -29) {
            this.method2739(16, 18, -113, 85, 115, (byte) 43, -21);
        }
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lih;Lms;Lfe;[I)V", line = 254)
    public class429(class330 arg0, class448 arg1, class403 arg2, int[] arg3) {
        this.field6351 = arg2;
        this.field6345 = arg1;
        this.field6342 = arg0;
        int var5 = this.field6351.field5991 - (arg1.field6533 >> 1);
        this.field6341 = this.field6351.field5994 - var5 >> arg1.field6522;
        this.field6357 = this.field6351.field5994 + var5 >> arg1.field6522;
        this.field6359 = this.field6351.field5990 - var5 >> arg1.field6522;
        this.field6353 = this.field6351.field5990 + var5 >> arg1.field6522;
        int var6 = this.field6357 + 1 - this.field6341;
        int var7 = this.field6353 - (this.field6359 - 1);
        this.field6350 = new float[var6 + 1][var7 + 1];
        this.field6349 = new float[var6 + 1][var7 + 1];
        this.field6343 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var9 = this.field6359 + var8;
            if (var9 > 0 && var9 < this.field6345.field4970 - 1) {
                for (int var10 = 0; var10 <= var6; var10++) {
                    int var11 = var10 + this.field6341;
                    if (var11 > 0 && this.field6345.field4978 - 1 > var11) {
                        int var12 = arg1.method781(var11 + 1, var9) - arg1.method781(var11 - 1, var9);
                        int var13 = arg1.method781(var11, var9 + 1) - arg1.method781(var11, var9 - 1);
                        float var14 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + var13 * var13 + 65536)));
                        this.field6350[var10][var8] = (float) var12 * var14;
                        this.field6349[var10][var8] = var14 * -256.0F;
                        this.field6343[var10][var8] = (float) var13 * var14;
                    }
                }
            }
        }
        int var15 = 0;
        int var16 = 0;
        for (int var17 = this.field6359; var17 <= this.field6353; var17++) {
            if (var17 >= 0 && var17 < arg1.field4970) {
                for (int var18 = this.field6341; var18 <= this.field6357; var18++) {
                    if (var18 >= 0 && var18 < arg1.field4978) {
                        int var19 = arg3[var16];
                        int[] var20 = arg1.field6537[var18][var17];
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
                var16 += this.field6357 - this.field6341;
            }
        }
        if (var15 > 0) {
            this.field6355 = new class265(var15 * 2);
            this.field6356 = new class362(var15 * 16);
            this.field6346 = new class143(class8.method64(1388313616, var15));
            int var21 = 0;
            int var22 = 0;
            for (int var23 = this.field6359; var23 <= this.field6353; var23++) {
                if (var23 >= 0 && var23 < arg1.field4970) {
                    int var24 = 0;
                    for (int var25 = this.field6341; var25 <= this.field6357; var25++) {
                        if (var25 >= 0 && var25 < arg1.field4978) {
                            int var26 = arg3[var22];
                            int[] var27 = arg1.field6537[var25][var23];
                            int[] var28 = arg1.field6531[var25][var23];
                            if (var27 != null && var26 != 0) {
                                if (var26 == 1) {
                                    for (int var29 = 0; var29 < var27.length; var29++) {
                                        this.method2739(var25, var28[var29], var23, var24, var27[var29], (byte) 40, var21);
                                    }
                                } else if (var26 == 3) {
                                    this.method2739(var25, 0, var23, var24, 0, (byte) 124, var21);
                                    this.method2739(var25, 0, var23, var24, arg1.field6533, (byte) 53, var21);
                                    this.method2739(var25, arg1.field6533, var23, var24, 0, (byte) 118, var21);
                                } else if (var26 == 2) {
                                    this.method2739(var25, 0, var23, var24, arg1.field6533, (byte) 75, var21);
                                    this.method2739(var25, arg1.field6533, var23, var24, arg1.field6533, (byte) 107, var21);
                                    this.method2739(var25, 0, var23, var24, 0, (byte) 100, var21);
                                } else if (var26 == 5) {
                                    this.method2739(var25, arg1.field6533, var23, var24, arg1.field6533, (byte) 90, var21);
                                    this.method2739(var25, arg1.field6533, var23, var24, 0, (byte) 86, var21);
                                    this.method2739(var25, 0, var23, var24, arg1.field6533, (byte) 105, var21);
                                } else if (var26 == 4) {
                                    this.method2739(var25, arg1.field6533, var23, var24, 0, (byte) 54, var21);
                                    this.method2739(var25, 0, var23, var24, 0, (byte) 40, var21);
                                    this.method2739(var25, arg1.field6533, var23, var24, arg1.field6533, (byte) 42, var21);
                                }
                            }
                        }
                        var24++;
                        var22++;
                    }
                } else {
                    var22 += this.field6357 - this.field6341;
                }
                var21++;
            }
            this.field6344 = this.field6342.method2049(5123, this.field6355.field3879, this.field6355.field3915, false);
            this.field6347 = this.field6342.method2079(16, this.field6356.field3879, this.field6356.field3915, false);
            this.field6352 = new class287(this.field6342, this.field6347, 5126, 3, 0);
            this.field6358 = new class287(this.field6342, this.field6347, 5121, 4, 12);
        } else {
            this.field6352 = null;
            this.field6358 = null;
            this.field6347 = null;
            this.field6344 = null;
        }
        this.field6356 = null;
        this.field6350 = this.field6349 = this.field6343 = (float[][]) null;
        this.field6346 = null;
        this.field6355 = null;
    }
}
