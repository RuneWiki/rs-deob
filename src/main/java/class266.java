import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class266 {

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "Lge;")
    private class104 field3996;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "Lwh;")
    private class312 field3993;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
    public int field3991;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    private int field3988;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "[B")
    public byte[] field3989;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
    private int field3992;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "I")
    private int field3994;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
    private int field3990;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "[[Lvi;")
    private class309[][] field3995;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIII[BII)Z", line = 6)
    private static final boolean method1894(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        int var7 = arg0 % arg6;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg6 - var7;
        }
        int var9 = -((arg5 + arg6 - 1) / arg6);
        int var10 = -((arg0 + arg6 - 1) / arg6);
        if (arg3 > -65) {
            return true;
        }
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg4[arg1] == 0) {
                    return true;
                }
                arg1 += arg6;
            }
            int var13 = arg1 - var8;
            if (arg4[var13 - 1] == 0) {
                return true;
            }
            arg1 = arg2 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "([[ZZIIIB)V", line = 56)
    public final void method1895(boolean[][] arg0, boolean arg1, int arg2, int arg3, int arg4, byte arg5) {
        opengl var7 = this.field3996.field1604;
        this.field3996.method912();
        this.field3996.method911(false);
        this.field3996.method864(false);
        this.field3996.method899(-2);
        this.field3996.method884(0);
        this.field3996.method868(1);
        float var8 = 1.0F / (float) (this.field3996.field1608 * 128);
        if (arg1) {
            for (int var9 = 0; var9 < this.field3990; var9++) {
                int var10 = var9 << this.field3992;
                int var11 = var9 + 1 << this.field3992;
                label136: for (int var12 = 0; var12 < this.field3994; var12++) {
                    int var13 = var12 << this.field3992;
                    int var14 = var12 + 1 << this.field3992;
                    for (int var15 = var13; var15 < var14; var15++) {
                        if ((-arg4) <= (var15 - arg2) && var15 - arg2 <= arg4) {
                            for (int var16 = var10; var16 < var11; var16++) {
                                if ((var16 - arg3) >= (-arg4) && arg4 >= var16 - arg3 && arg0[var15 + arg4 - arg2][arg4 + var16 - arg3]) {
                                    var7.glMatrixMode(5890);
                                    var7.glLoadIdentity();
                                    var7.glScalef(var8, var8, 1.0F);
                                    var7.glTranslatef((float) (-var12) / var8, (float) (-var9) / var8, 1.0F);
                                    var7.glMatrixMode(5888);
                                    this.field3995[var12][var9].method2112((byte) 68);
                                    continue label136;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var17 = 0; var17 < this.field3990; var17++) {
                int var18 = var17 << this.field3992;
                int var19 = var17 + 1 << this.field3992;
                for (int var20 = 0; var20 < this.field3994; var20++) {
                    int var21 = 0;
                    int var22 = var20 << this.field3992;
                    class312.field4540.field565 = 0;
                    int var23 = var20 + 1 << this.field3992;
                    for (int var24 = var18; var24 < var19; var24++) {
                        if (var24 - arg3 >= -arg4 && (var24 - arg3) <= arg4) {
                            int var25 = this.field3993.field2037 * var24 + var22;
                            for (int var26 = var22; var26 < var23; var26++) {
                                if ((var26 - arg2) >= (-arg4) && var26 - arg2 <= arg4 && arg0[var26 + arg4 - arg2][var24 - (arg3 - arg4)]) {
                                    short[] var27 = this.field3993.field4557[var25];
                                    if (var27 != null) {
                                        if (this.field3996.field1727) {
                                            for (int var29 = 0; var29 < var27.length; var29++) {
                                                class312.field4540.method324(var27[var29], -122);
                                                var21++;
                                            }
                                        } else {
                                            for (int var28 = 0; var28 < var27.length; var28++) {
                                                var21++;
                                                class312.field4540.method301((byte) 120, var27[var28]);
                                            }
                                        }
                                    }
                                }
                                var25++;
                            }
                        }
                    }
                    if (var21 > 0) {
                        var7.glMatrixMode(5890);
                        var7.glLoadIdentity();
                        var7.glScalef(var8, var8, 1.0F);
                        var7.glTranslatef((float) (-var20) / var8, (float) (-var17) / var8, 1.0F);
                        var7.glMatrixMode(5888);
                        this.field3996.field1675.method979(5123, class312.field4540.field578, var21 * 2);
                        this.field3995[var20][var17].method2113(this.field3996.field1675, 0, var21);
                    }
                }
            }
        }
        var7.glMatrixMode(5890);
        if (arg5 >= -49) {
            this.method1902(-39, -39, 118, -33, 33);
        }
        var7.glLoadIdentity();
        var7.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIII[B[BIII)V", line = 244)
    private static final void method1896(int arg0, int arg1, int arg2, int arg3, byte[] arg4, byte[] arg5, int arg6, int arg7, int arg8) {
        int var9 = -(arg3 >> 2);
        int var10 = -(arg3 & 0x3);
        for (int var11 = -arg7; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg2++;
                arg4[var10001] += arg5[arg0++];
                int var14 = arg2++;
                arg4[var14] += arg5[arg0++];
                int var15 = arg2++;
                arg4[var15] += arg5[arg0++];
                int var16 = arg2++;
                arg4[var16] += arg5[arg0++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg2++;
                arg4[var10001] += arg5[arg0++];
            }
            arg2 += arg1;
            arg0 += arg6;
        }
        if (arg8 < 31) {
            method1894(-52, -123, -35, 28, (byte[]) null, 98, 95);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILsr;II)V", line = 288)
    public final void method1897(int arg0, class135 arg1, int arg2, int arg3) {
        class241 var5 = (class241) arg1;
        int var6 = var5.field3479 + arg0 + 1;
        int var7 = var5.field3480 + arg2 + 1;
        int var8 = this.field3991 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field3482;
        int var11 = var5.field3481;
        int var12 = this.field3991 - var11;
        if (arg3 != -13798) {
            this.method1898(31);
        }
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var8 += this.field3991 * var13;
            var9 += var11 * var13;
            var6 = 1;
            var10 -= var13;
        }
        int var14 = 0;
        if (this.field3988 <= (var6 + var10)) {
            int var15 = var6 + var10 - (this.field3988 + -1);
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var7 = 1;
            var12 += var16;
            var9 += var16;
            var11 -= var16;
            var8 += var16;
            var14 += var16;
        }
        if (this.field3991 <= var7 + var11) {
            int var17 = var7 + var11 - (this.field3991 - 1);
            var12 += var17;
            var14 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            method1899(var5.field3478, var12, (byte) 101, this.field3989, var10, var9, var14, var11, var8);
            this.method1902(var7, -1845059705, var11, var6, var10);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V", line = 356)
    public final void method1898(int arg0) {
        this.field3995 = new class309[this.field3994][this.field3990];
        if (arg0 != 1) {
            this.method1902(94, -77, -70, 50, -31);
        }
        for (int var2 = 0; var2 < this.field3990; var2++) {
            for (int var3 = 0; var3 < this.field3994; var3++) {
                this.field3995[var3][var2] = new class309(this.field3996, this, this.field3993, var3, var2, this.field3992, var3 * 128 + 1, var2 * 128 + 1);
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "([BIB[BIIIII)V", line = 385)
    private static final void method1899(byte[] arg0, int arg1, byte arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -(arg7 >> 2);
        int var10 = -(arg7 & 0x3);
        for (int var11 = -arg4; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg8++;
                arg3[var10001] = (byte) (arg3[var10001] - arg0[arg5++]);
                int var14 = arg8++;
                arg3[var14] = (byte) (arg3[var14] - arg0[arg5++]);
                int var15 = arg8++;
                arg3[var15] = (byte) (arg3[var15] - arg0[arg5++]);
                int var16 = arg8++;
                arg3[var16] = (byte) (arg3[var16] - arg0[arg5++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg8++;
                arg3[var10001] = (byte) (arg3[var10001] - arg0[arg5++]);
            }
            arg5 += arg6;
            arg8 += arg1;
        }
        if (arg2 == 101) {
            ;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BLsr;II)V", line = 428)
    public final void method1900(byte arg0, class135 arg1, int arg2, int arg3) {
        class241 var5 = (class241) arg1;
        int var6 = var5.field3479 + arg2 + 1;
        int var7 = var5.field3480 + arg3 + 1;
        int var8 = this.field3991 * var6 + var7;
        int var9 = 0;
        if (arg0 <= 23) {
            this.method1900((byte) -115, (class135) null, 11, -66);
        }
        int var10 = var5.field3482;
        int var11 = var5.field3481;
        int var12 = this.field3991 - var11;
        int var13 = 0;
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var6 = 1;
            var9 += var11 * var14;
            var8 += this.field3991 * var14;
            var10 -= var14;
        }
        if (var6 + var10 >= this.field3988) {
            int var15 = var6 + var10 - (-1 - -this.field3988);
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var11 -= var16;
            var13 += var16;
            var9 += var16;
            var12 += var16;
            var8 += var16;
            var7 = 1;
        }
        if (this.field3991 <= (var7 + var11)) {
            int var17 = var7 + var11 + 1 - this.field3991;
            var12 += var17;
            var13 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            method1896(var9, var12, var8, var11, this.field3989, var5.field3478, var13, var10, 118);
            this.method1902(var7, -1845059705, var11, var6, var10);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lsr;III)Z", line = 498)
    public final boolean method1901(class135 arg0, int arg1, int arg2, int arg3) {
        class241 var5 = (class241) arg0;
        int var6 = var5.field3480 + arg3 + 1;
        int var7 = var5.field3479 + arg2 + 1;
        int var8 = this.field3991 * var7 + var6;
        if (arg1 != -18481) {
            return false;
        }
        int var9 = var5.field3482;
        int var10 = var5.field3481;
        int var11 = this.field3991 - var10;
        if (var7 <= 0) {
            int var12 = 1 - var7;
            var9 -= var12;
            var8 += this.field3991 * var12;
            var7 = 1;
        }
        if (this.field3988 <= (var7 + var9)) {
            int var13 = var7 + var9 + 1 - this.field3988;
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var6 = 1;
            var8 += var14;
            var10 -= var14;
            var11 += var14;
        }
        if ((var6 + var10) >= this.field3991) {
            int var15 = var6 + var10 + 1 - this.field3991;
            var10 -= var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field3991 + var11;
            return method1894(var10, var8, var17, arg1 ^ 0x4849, this.field3989, var9, var16);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIII)V", line = 571)
    private final void method1902(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field3995 == null) {
            return;
        }
        int var6 = arg0 - 1 >> 7;
        int var7 = arg2 + arg0 - 1 - 1 >> 7;
        if (arg1 != -1845059705) {
            this.field3993 = (class312) null;
        }
        int var8 = arg3 - 1 >> 7;
        int var9 = arg3 + arg4 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class309[] var11 = this.field3995[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field4519 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lge;Lwh;)V", line = 607)
    public class266(class104 arg0, class312 arg1) {
        this.field3996 = arg0;
        this.field3993 = arg1;
        this.field3991 = (this.field3993.field4549 * this.field3993.field2037 >> this.field3996.field1619) + 2;
        this.field3988 = (this.field3993.field4549 * this.field3993.field2045 >> this.field3996.field1619) + 2;
        this.field3989 = new byte[this.field3991 * this.field3988];
        this.field3992 = this.field3996.field1619 + 7 - this.field3993.field4553;
        this.field3994 = this.field3993.field2037 >> this.field3992;
        this.field3990 = this.field3993.field2045 >> this.field3992;
    }
}
