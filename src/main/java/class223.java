import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class223 {

    @OriginalMember(owner = "client!rr", name = "f", descriptor = "Lag;")
    private class445 field3386;

    @OriginalMember(owner = "client!rr", name = "h", descriptor = "Lmi;")
    private class315 field3388;

    @OriginalMember(owner = "client!rr", name = "g", descriptor = "I")
    public int field3387;

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "I")
    private int field3383;

    @OriginalMember(owner = "client!rr", name = "e", descriptor = "I")
    private int field3385;

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "[B")
    public byte[] field3384;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "I")
    private int field3381;

    @OriginalMember(owner = "client!rr", name = "i", descriptor = "I")
    private int field3389;

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "[[Lpd;")
    private class155[][] field3382;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(BLtm;II)Z")
    public final boolean method1428(byte arg0, class242 arg1, int arg2, int arg3) {
        class274 var5 = (class274) arg1;
        int var6 = var5.field3982 + arg2 + 1;
        int var7 = var5.field3978 + arg3 + 1;
        if (arg0 != 122) {
            this.field3383 = -92;
        }
        int var8 = var7 + (this.field3387 * var6);
        int var9 = var5.field3979;
        int var10 = var5.field3980;
        if (var6 <= 0) {
            int var11 = 1 - var6;
            var9 -= var11;
            var8 += this.field3387 * var11;
            var6 = 1;
        }
        int var12 = this.field3387 - var10;
        if (var6 + var9 >= this.field3383) {
            int var13 = var6 + var9 + 1 - this.field3383;
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var8 += var14;
            var12 += var14;
            var7 = 1;
            var10 -= var14;
        }
        if ((var7 + var10) >= this.field3387) {
            int var15 = var7 + var10 + 1 - this.field3387;
            var12 += var15;
            var10 -= var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field3387 + var12;
            return method1430(var8, var10, var17, -71, var16, this.field3384, var9);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(ILtm;II)V")
    public final void method1429(int arg0, class242 arg1, int arg2, int arg3) {
        class274 var5 = (class274) arg1;
        int var6 = var5.field3982 + arg0 + 1;
        int var7 = var5.field3978 + arg3 + 1;
        int var8 = var7 + (this.field3387 * var6);
        if (arg2 >= -81) {
            return;
        }
        int var9 = 0;
        int var10 = var5.field3979;
        int var11 = var5.field3980;
        int var12 = this.field3387 - var11;
        int var13 = 0;
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var6 = 1;
            var10 -= var14;
            var8 += this.field3387 * var14;
            var9 += var11 * var14;
        }
        if (var6 + var10 >= this.field3383) {
            int var15 = var6 + var10 + 1 - this.field3383;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var9 += var16;
            var12 += var16;
            var11 -= var16;
            var8 += var16;
            var13 += var16;
            var7 = 1;
        }
        if ((var7 + var11) >= this.field3387) {
            int var17 = var7 + var11 + 1 - this.field3387;
            var11 -= var17;
            var13 += var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            method1435(var12, var13, var10, 5888, var11, var8, var5.field3981, this.field3384, var9);
            this.method1433(var7, 121, var6, var10, var11);
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIIII[BI)Z")
    private static final boolean method1430(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        int var7 = arg1 % arg4;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg4 - var7;
        }
        int var9 = -((arg4 + arg6 - 1) / arg4);
        int var10 = -((arg1 + arg4 - 1) / arg4);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg5[arg0] == 0) {
                    return true;
                }
                arg0 += arg4;
            }
            int var13 = arg0 - var8;
            if (arg5[var13 - 1] == 0) {
                return true;
            }
            arg0 = arg2 + var13;
        }
        int var14 = -30 % ((12 - arg3) / 50);
        return false;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "([BIII[BIIII)V")
    private static final void method1431(byte[] arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -(arg1 >> 2);
        int var10 = -(arg1 & 0x3);
        int var11 = -arg7;
        if (arg2 != -335694526) {
            method1435(61, 40, -89, -73, 120, -113, (byte[]) null, (byte[]) null, -63);
        }
        while (var11 < 0) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg6++;
                arg4[var10001] += arg0[arg5++];
                int var14 = arg6++;
                arg4[var14] += arg0[arg5++];
                int var15 = arg6++;
                arg4[var15] += arg0[arg5++];
                int var16 = arg6++;
                arg4[var16] += arg0[arg5++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg6++;
                arg4[var10001] += arg0[arg5++];
            }
            arg6 += arg8;
            arg5 += arg3;
            var11++;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)V")
    public final void method1432(int arg0) {
        this.field3382 = new class155[this.field3381][this.field3389];
        if (arg0 != 9431) {
            return;
        }
        for (int var2 = 0; var2 < this.field3389; var2++) {
            for (int var3 = 0; var3 < this.field3381; var3++) {
                this.field3382[var3][var2] = new class155(this.field3388, this, this.field3386, var3, var2, this.field3385, var3 * 128 + 1, var2 * 128 + 1);
            }
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIIII)V")
    private final void method1433(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field3382 == null) {
            return;
        }
        int var6 = arg0 - 1 >> 7;
        int var7 = arg0 + arg4 - 1 - 1 >> 7;
        int var8 = arg2 - 1 >> 7;
        if (arg1 <= 61) {
            this.field3382 = (class155[][]) ((class155[][]) null);
        }
        int var9 = arg2 + arg3 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class155[] var11 = this.field3382[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field2299 = true;
            }
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "([[ZZIIIB)V")
    public final void method1434(boolean[][] arg0, boolean arg1, int arg2, int arg3, int arg4, byte arg5) {
        opengl var7 = this.field3388.field4445;
        this.field3388.method1968();
        this.field3388.method1950(false);
        this.field3388.method1966(false);
        this.field3388.method2002(-2);
        this.field3388.method1962(0);
        this.field3388.method1995(1);
        float var8 = 1.0F / (float) (this.field3388.field4460 * 128);
        if (arg1) {
            for (int var23 = 0; var23 < this.field3389; var23++) {
                int var24 = var23 << this.field3385;
                int var25 = var23 + 1 << this.field3385;
                label89: for (int var26 = 0; var26 < this.field3381; var26++) {
                    int var27 = var26 << this.field3385;
                    int var28 = var26 + 1 << this.field3385;
                    for (int var29 = var27; var29 < var28; var29++) {
                        if (-arg3 <= var29 - arg4 && var29 - arg4 <= arg3) {
                            for (int var30 = var24; var30 < var25; var30++) {
                                if ((var30 - arg2) >= (-arg3) && arg3 >= (var30 - arg2) && arg0[var29 + arg3 - arg4][var30 - (arg2 - arg3)]) {
                                    var7.glMatrixMode(5890);
                                    var7.glLoadIdentity();
                                    var7.glScalef(var8, var8, 1.0F);
                                    var7.glTranslatef((float) (-var26) / var8, (float) (-var23) / var8, 1.0F);
                                    var7.glMatrixMode(5888);
                                    this.field3382[var26][var23].method970(124);
                                    continue label89;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var9 = 0; var9 < this.field3389; var9++) {
                int var10 = var9 << this.field3385;
                int var11 = var9 + 1 << this.field3385;
                for (int var12 = 0; var12 < this.field3381; var12++) {
                    int var13 = 0;
                    int var14 = var12 << this.field3385;
                    int var15 = var12 + 1 << this.field3385;
                    class276 var16 = class445.field6143;
                    var16.field4021 = 0;
                    for (int var17 = var10; var17 < var11; var17++) {
                        if ((var17 - arg2) >= (-arg3) && var17 - arg2 <= arg3) {
                            int var18 = this.field3386.field5967 * var17 + var14;
                            for (int var19 = var14; var19 < var15; var19++) {
                                if ((var19 - arg4) >= (-arg3) && (var19 - arg4) <= arg3 && arg0[arg3 + var19 - arg4][arg3 + var17 - arg2]) {
                                    short[] var20 = this.field3386.field6150[var18];
                                    if (var20 != null) {
                                        if (this.field3388.field4514) {
                                            for (int var21 = 0; var21 < var20.length; var21++) {
                                                var13++;
                                                var16.method1711(false, var20[var21] & 0xFFFF);
                                            }
                                        } else {
                                            for (int var22 = 0; var22 < var20.length; var22++) {
                                                var13++;
                                                var16.method1691(var20[var22] & 0xFFFF, (byte) -88);
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
                        this.field3382[var12][var9].method973(var13, 0, 5123, var16.field4064);
                    }
                }
            }
        }
        var7.glMatrixMode(5890);
        var7.glLoadIdentity();
        if (arg5 < 58) {
            this.method1436(-86, -38, 71, (class242) null);
        }
        var7.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIIIII[B[BI)V")
    private static final void method1435(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, byte[] arg7, int arg8) {
        int var9 = -(arg4 >> 2);
        int var10 = -(arg4 & 0x3);
        if (arg3 != 5888) {
            return;
        }
        for (int var11 = -arg2; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg5++;
                arg7[var10001] = (byte) (arg7[var10001] - arg6[arg8++]);
                int var14 = arg5++;
                arg7[var14] = (byte) (arg7[var14] - arg6[arg8++]);
                int var15 = arg5++;
                arg7[var15] = (byte) (arg7[var15] - arg6[arg8++]);
                int var16 = arg5++;
                arg7[var16] = (byte) (arg7[var16] - arg6[arg8++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg5++;
                arg7[var10001] = (byte) (arg7[var10001] - arg6[arg8++]);
            }
            arg5 += arg0;
            arg8 += arg1;
        }
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lmi;Lag;)V")
    public class223(class315 arg0, class445 arg1) {
        this.field3386 = arg1;
        this.field3388 = arg0;
        this.field3387 = (this.field3386.field6147 * this.field3386.field5967 >> this.field3388.field4464) + 2;
        this.field3383 = (this.field3386.field6147 * this.field3386.field5970 >> this.field3388.field4464) + 2;
        this.field3385 = this.field3388.field4464 + 7 - this.field3386.field6145;
        this.field3384 = new byte[this.field3387 * this.field3383];
        this.field3381 = this.field3386.field5967 >> this.field3385;
        this.field3389 = this.field3386.field5970 >> this.field3385;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIILtm;)V")
    public final void method1436(int arg0, int arg1, int arg2, class242 arg3) {
        class274 var5 = (class274) arg3;
        int var6 = var5.field3978 + arg2 + 1;
        int var7 = var5.field3982 + arg0 + 1;
        int var8 = this.field3387 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field3979;
        int var11 = var5.field3980;
        int var12 = this.field3387 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var9 += var11 * var13;
            var8 += this.field3387 * var13;
            var7 = 1;
            var10 -= var13;
        }
        int var14 = 0;
        if (this.field3383 <= var7 + var10) {
            int var15 = var7 + var10 + 1 - this.field3383;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var8 += var16;
            var11 -= var16;
            var14 += var16;
            var9 += var16;
            var12 += var16;
            var6 = 1;
        }
        if (var6 + var11 >= this.field3387) {
            int var17 = var6 + var11 + 1 - this.field3387;
            var14 += var17;
            var11 -= var17;
            var12 += var17;
        }
        if (var11 <= 0 || var10 <= 0) {
            return;
        }
        method1431(var5.field3981, var11, -335694526, var14, this.field3384, var9, var8, var10, var12);
        this.method1433(var6, 80, var7, var10, var11);
        if (arg1 != -15101) {
            this.method1434((boolean[][]) ((boolean[][]) null), false, 51, -24, -15, (byte) 56);
        }
    }
}
