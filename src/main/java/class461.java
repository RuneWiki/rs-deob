import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class461 {

    @OriginalMember(owner = "client!c", name = "c", descriptor = "Lch;")
    private class223 field6488;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "Lqi;")
    private class458 field6491;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    public int field6492;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    private int field6486;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    private int field6489;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "[B")
    public byte[] field6494;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    private int field6490;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    private int field6487;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "[[Lgi;")
    private class333[][] field6493;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I[BII[BIIII)V")
    private static final void method2723(int arg0, byte[] arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -(arg2 >> 2);
        int var10 = 26 % ((arg5 + 64) / 40);
        int var11 = -(arg2 & 0x3);
        for (int var12 = -arg7; var12 < 0; var12++) {
            int var10001;
            for (int var13 = var9; var13 < 0; var13++) {
                var10001 = arg3++;
                arg4[var10001] += arg1[arg0++];
                int var15 = arg3++;
                arg4[var15] += arg1[arg0++];
                int var16 = arg3++;
                arg4[var16] += arg1[arg0++];
                int var17 = arg3++;
                arg4[var17] += arg1[arg0++];
            }
            for (int var14 = var11; var14 < 0; var14++) {
                var10001 = arg3++;
                arg4[var10001] += arg1[arg0++];
            }
            arg3 += arg6;
            arg0 += arg8;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IZB[[ZII)V")
    public final void method2724(int arg0, boolean arg1, byte arg2, boolean[][] arg3, int arg4, int arg5) {
        opengl var7 = this.field6491.field6330;
        if (arg2 != 51) {
            method2723(126, (byte[]) null, -62, -20, (byte[]) null, 42, -122, -123, 88);
        }
        this.field6491.method2639();
        this.field6491.method2652(false);
        this.field6491.method2651(false);
        this.field6491.method2647(-2);
        this.field6491.method2696(0);
        this.field6491.method2653(1);
        float var8 = 1.0F / (float) (this.field6491.field6347 * 128);
        if (arg1) {
            for (int var23 = 0; var23 < this.field6487; var23++) {
                int var24 = var23 << this.field6489;
                int var25 = var23 + 1 << this.field6489;
                label87: for (int var26 = 0; var26 < this.field6490; var26++) {
                    int var27 = var26 << this.field6489;
                    int var28 = var26 + 1 << this.field6489;
                    for (int var29 = var27; var29 < var28; var29++) {
                        if ((var29 - arg5) >= (-arg0) && var29 - arg5 <= arg0) {
                            for (int var30 = var24; var30 < var25; var30++) {
                                if ((var30 - arg4) >= (-arg0) && (var30 - arg4) <= arg0 && arg3[arg0 + var29 - arg5][var30 + arg0 - arg4]) {
                                    var7.glMatrixMode(5890);
                                    var7.glLoadIdentity();
                                    var7.glScalef(var8, var8, 1.0F);
                                    var7.glTranslatef((float) (-var26) / var8, (float) (-var23) / var8, 1.0F);
                                    var7.glMatrixMode(5888);
                                    this.field6493[var26][var23].method1982(-12850);
                                    continue label87;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var9 = 0; var9 < this.field6487; var9++) {
                int var10 = var9 << this.field6489;
                int var11 = var9 + 1 << this.field6489;
                for (int var12 = 0; var12 < this.field6490; var12++) {
                    int var13 = 0;
                    int var14 = var12 << this.field6489;
                    int var15 = var12 + 1 << this.field6489;
                    class425 var16 = class223.field3137;
                    var16.field5830 = 0;
                    for (int var17 = var10; var17 < var11; var17++) {
                        if ((var17 - arg4) >= (-arg0) && (var17 - arg4) <= arg0) {
                            int var18 = this.field6488.field3729 * var17 + var14;
                            for (int var19 = var14; var19 < var15; var19++) {
                                if ((-arg0) <= (var19 - arg5) && arg0 >= (var19 - arg5) && arg3[var19 + arg0 - arg5][arg0 + var17 - arg4]) {
                                    short[] var20 = this.field6488.field3141[var18];
                                    if (var20 != null) {
                                        if (this.field6491.field6400) {
                                            for (int var22 = 0; var22 < var20.length; var22++) {
                                                var13++;
                                                var16.method2462(var20[var22] & 0xFFFF, (byte) -123);
                                            }
                                        } else {
                                            for (int var21 = 0; var21 < var20.length; var21++) {
                                                var16.method2506(var20[var21] & 0xFFFF, (byte) 79);
                                                var13++;
                                            }
                                        }
                                    }
                                }
                                var18++;
                            }
                        }
                    }
                    if (var13 > 0) {
                        var7.glMatrixMode(5890);
                        var7.glLoadIdentity();
                        var7.glScalef(var8, var8, 1.0F);
                        var7.glTranslatef((float) (-var12) / var8, (float) (-var9) / var8, 1.0F);
                        var7.glMatrixMode(5888);
                        this.field6493[var12][var9].method1983(var16.field5886, var13, (byte) 91, 5123);
                    }
                }
            }
        }
        var7.glMatrixMode(5890);
        var7.glLoadIdentity();
        var7.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
    public final void method2725(int arg0) {
        this.field6493 = new class333[this.field6490][this.field6487];
        if (arg0 <= 49) {
            this.method2725(45);
        }
        for (int var2 = 0; var2 < this.field6487; var2++) {
            for (int var3 = 0; var3 < this.field6490; var3++) {
                this.field6493[var3][var2] = new class333(this.field6491, this, this.field6488, var3, var2, this.field6489, var3 * 128 + 1, var2 * 128 + 1);
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lmr;IZI)V")
    public final void method2726(class173 arg0, int arg1, boolean arg2, int arg3) {
        class324 var5 = (class324) arg0;
        int var6 = var5.field4461 + arg1 + 1;
        int var7 = var5.field4460 + arg3 + 1;
        if (!arg2) {
            return;
        }
        int var8 = this.field6492 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field4458;
        int var11 = var5.field4459;
        int var12 = this.field6492 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var9 += var11 * var13;
            var8 += this.field6492 * var13;
            var10 -= var13;
            var7 = 1;
        }
        int var14 = 0;
        if (this.field6486 <= (var7 + var10)) {
            int var15 = var7 + var10 + 1 - this.field6486;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var12 += var16;
            var6 = 1;
            var9 += var16;
            var8 += var16;
            var14 += var16;
            var11 -= var16;
        }
        if ((var6 + var11) >= this.field6492) {
            int var17 = var6 + var11 + 1 - this.field6492;
            var14 += var17;
            var11 -= var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            method2723(var9, var5.field4462, var11, var8, this.field6494, -110, var12, var10, var14);
            this.method2729(var6, var7, var10, 1785, var11);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ILmr;II)V")
    public final void method2727(int arg0, class173 arg1, int arg2, int arg3) {
        class324 var5 = (class324) arg1;
        int var6 = var5.field4460 + arg2 + 1;
        int var7 = var5.field4461 + arg0 + 1;
        int var8 = this.field6492 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field4458;
        int var11 = var5.field4459;
        int var12 = this.field6492 - var11;
        int var13 = 0;
        if (arg3 != -19505) {
            this.field6493 = (class333[][]) ((class333[][]) null);
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var10 -= var14;
            var8 += this.field6492 * var14;
            var6 = 1;
            var9 += var11 * var14;
        }
        if (this.field6486 <= var6 + var10) {
            int var15 = var6 + var10 - (this.field6486 + -1);
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var8 += var16;
            var9 += var16;
            var12 += var16;
            var11 -= var16;
            var7 = 1;
            var13 += var16;
        }
        if (this.field6492 <= var7 + var11) {
            int var17 = var7 + var11 + 1 - this.field6492;
            var13 += var17;
            var11 -= var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            method2730(this.field6494, var9, var5.field4462, var12, var13, -1297772862, var10, var11, var8);
            this.method2729(var7, var6, var10, 1785, var11);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIILmr;)Z")
    public final boolean method2728(int arg0, int arg1, int arg2, class173 arg3) {
        class324 var5 = (class324) arg3;
        int var6 = var5.field4461 + arg1 + 1;
        int var7 = var5.field4460 + arg0 - arg2;
        int var8 = this.field6492 * var7 + var6;
        int var9 = var5.field4458;
        int var10 = var5.field4459;
        int var11 = this.field6492 - var10;
        if (var7 <= 0) {
            int var12 = 1 - var7;
            var7 = 1;
            var9 -= var12;
            var8 += this.field6492 * var12;
        }
        if (var7 + var9 >= this.field6486) {
            int var13 = var9 + var7 + 1 - this.field6486;
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var10 -= var14;
            var8 += var14;
            var6 = 1;
            var11 += var14;
        }
        if (this.field6492 <= var6 + var10) {
            int var15 = var10 + var6 + 1 - this.field6492;
            var11 += var15;
            var10 -= var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field6492 + var11;
            return method2731(var9, arg2 ^ 0x0, var16, this.field6494, var10, var8, var17);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIII)V")
    private final void method2729(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field6493 == null) {
            return;
        }
        int var6 = arg0 - 1 >> 7;
        int var7 = arg0 + arg4 - 1 - 1 >> 7;
        int var8 = arg1 - 1 >> 7;
        int var9 = arg1 + arg2 - 1 - 1 >> 7;
        if (arg3 != 1785) {
            this.field6488 = (class223) null;
        }
        for (int var10 = var6; var10 <= var7; var10++) {
            class333[] var11 = this.field6493[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field4564 = true;
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "([BI[BIIIIII)V")
    private static final void method2730(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -(arg7 >> 2);
        int var10 = -(arg7 & 0x3);
        if (arg5 != -1297772862) {
            return;
        }
        for (int var11 = -arg6; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg8++;
                arg0[var10001] = (byte) (arg0[var10001] - arg2[arg1++]);
                int var14 = arg8++;
                arg0[var14] = (byte) (arg0[var14] - arg2[arg1++]);
                int var15 = arg8++;
                arg0[var15] = (byte) (arg0[var15] - arg2[arg1++]);
                int var16 = arg8++;
                arg0[var16] = (byte) (arg0[var16] - arg2[arg1++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg8++;
                arg0[var10001] = (byte) (arg0[var10001] - arg2[arg1++]);
            }
            arg8 += arg3;
            arg1 += arg4;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III[BIII)Z")
    private static final boolean method2731(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6) {
        int var7 = arg4 % arg2;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg2 - var7;
        }
        int var9 = -((arg0 + arg1 + arg2) / arg2);
        int var10 = -((arg2 + arg4 - 1) / arg2);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg3[arg5] == 0) {
                    return true;
                }
                arg5 += arg2;
            }
            int var13 = arg5 - var8;
            if (arg3[var13 - 1] == 0) {
                return true;
            }
            arg5 = arg6 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(Lqi;Lch;)V")
    public class461(class458 arg0, class223 arg1) {
        this.field6488 = arg1;
        this.field6491 = arg0;
        this.field6492 = (this.field6488.field3729 * this.field6488.field3149 >> this.field6491.field6336) + 2;
        this.field6486 = (this.field6488.field3728 * this.field6488.field3149 >> this.field6491.field6336) + 2;
        this.field6489 = this.field6491.field6336 + 7 - this.field6488.field3142;
        this.field6494 = new byte[this.field6492 * this.field6486];
        this.field6490 = this.field6488.field3729 >> this.field6489;
        this.field6487 = this.field6488.field3728 >> this.field6489;
    }
}
