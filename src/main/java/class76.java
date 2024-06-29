import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class76 {

    @OriginalMember(owner = "client!am", name = "f", descriptor = "Lsb;")
    private class153 field1053;

    @OriginalMember(owner = "client!am", name = "i", descriptor = "Lse;")
    private class282 field1056;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "I")
    public int field1048;

    @OriginalMember(owner = "client!am", name = "h", descriptor = "I")
    private int field1055;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "I")
    private int field1049;

    @OriginalMember(owner = "client!am", name = "e", descriptor = "[B")
    public byte[] field1052;

    @OriginalMember(owner = "client!am", name = "g", descriptor = "I")
    private int field1054;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "I")
    private int field1050;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "[[Lor;")
    private class286[][] field1051;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IZ[[ZIII)V", line = 7)
    public final void method604(int arg0, boolean arg1, boolean[][] arg2, int arg3, int arg4, int arg5) {
        opengl var7 = this.field1056.field4140;
        this.field1056.method1905();
        this.field1056.method1931(false);
        this.field1056.method1892(false);
        if (arg3 != 1162127586) {
            return;
        }
        this.field1056.method1861(-2);
        this.field1056.method1910(0);
        this.field1056.method1933(1);
        float var8 = 1.0F / (float) (this.field1056.field4155 * 128);
        if (arg1) {
            for (int var9 = 0; var9 < this.field1050; var9++) {
                int var10 = var9 << this.field1049;
                int var11 = var9 + 1 << this.field1049;
                label132: for (int var12 = 0; var12 < this.field1054; var12++) {
                    int var13 = var12 << this.field1049;
                    int var14 = var12 + 1 << this.field1049;
                    for (int var15 = var13; var15 < var14; var15++) {
                        if (-arg0 <= var15 - arg4 && arg0 >= (var15 - arg4)) {
                            for (int var16 = var10; var16 < var11; var16++) {
                                if ((-arg0) <= (var16 - arg5) && (var16 - arg5) <= arg0 && arg2[var15 - (arg4 - arg0)][var16 - (arg5 - arg0)]) {
                                    var7.glMatrixMode(5890);
                                    var7.glLoadIdentity();
                                    var7.glScalef(var8, var8, 1.0F);
                                    var7.glTranslatef((float) (-var12) / var8, (float) (-var9) / var8, 1.0F);
                                    var7.glMatrixMode(5888);
                                    this.field1051[var12][var9].method1945(true);
                                    continue label132;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var17 = 0; var17 < this.field1050; var17++) {
                int var18 = var17 << this.field1049;
                int var19 = var17 + 1 << this.field1049;
                for (int var20 = 0; var20 < this.field1054; var20++) {
                    int var21 = 0;
                    int var22 = var20 << this.field1049;
                    int var23 = var20 + 1 << this.field1049;
                    class153.field1922.field5049 = 0;
                    for (int var24 = var18; var24 < var19; var24++) {
                        if ((var24 - arg5) >= (-arg0) && (var24 - arg5) <= arg0) {
                            int var25 = this.field1053.field2681 * var24 + var22;
                            for (int var26 = var22; var26 < var23; var26++) {
                                if ((var26 - arg4) >= (-arg0) && (var26 - arg4) <= arg0 && arg2[var26 + arg0 - arg4][var24 + arg0 - arg5]) {
                                    short[] var27 = this.field1053.field1931[var25];
                                    if (var27 != null) {
                                        if (this.field1056.field4232) {
                                            for (int var29 = 0; var29 < var27.length; var29++) {
                                                var21++;
                                                class153.field1922.method2250(false, var27[var29]);
                                            }
                                        } else {
                                            for (int var28 = 0; var28 < var27.length; var28++) {
                                                var21++;
                                                class153.field1922.method2206(79, var27[var28]);
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
                        this.field1056.field4181.method2126(5123, class153.field1922.field5042, var21 * 2);
                        this.field1051[var20][var17].method1944(var21, this.field1056.field4181, 1004);
                    }
                }
            }
        }
        var7.glMatrixMode(5890);
        var7.glLoadIdentity();
        var7.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "([BIIIIII[BI)V", line = 191)
    private static final void method605(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8) {
        int var9 = -(arg8 >> 2);
        int var10 = -(arg8 & 0x3);
        for (int var11 = -arg1; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg5++;
                arg7[var10001] = (byte) (arg7[var10001] - arg0[arg2++]);
                int var14 = arg5++;
                arg7[var14] = (byte) (arg7[var14] - arg0[arg2++]);
                int var15 = arg5++;
                arg7[var15] = (byte) (arg7[var15] - arg0[arg2++]);
                int var16 = arg5++;
                arg7[var16] = (byte) (arg7[var16] - arg0[arg2++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg5++;
                arg7[var10001] = (byte) (arg7[var10001] - arg0[arg2++]);
            }
            arg5 += arg3;
            arg2 += arg4;
        }
        if (arg6 != -1) {
            method607(-80, (byte) -63, 30, -36, (byte[]) null, 92, 124);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V", line = 233)
    public final void method606(int arg0) {
        this.field1051 = new class286[this.field1054][this.field1050];
        int var2 = 123 % ((-arg0 - 19) / 48);
        for (int var3 = 0; var3 < this.field1050; var3++) {
            for (int var4 = 0; var4 < this.field1054; var4++) {
                this.field1051[var4][var3] = new class286(this.field1056, this, this.field1053, var4, var3, this.field1049, var4 * 128 + 1, var3 * 128 + 1);
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IBII[BII)Z", line = 260)
    private static final boolean method607(int arg0, byte arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        if (arg1 > -82) {
            return false;
        }
        int var7 = arg6 % arg3;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg3 - var7;
        }
        int var9 = -((arg3 + arg5 - 1) / arg3);
        int var10 = -((arg3 + arg6 - 1) / arg3);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg4[arg0] == 0) {
                    return true;
                }
                arg0 += arg3;
            }
            int var13 = arg0 - var8;
            if (arg4[var13 - 1] == 0) {
                return true;
            }
            arg0 = arg2 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIII)V", line = 308)
    private final void method608(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field1051 == null) {
            return;
        }
        int var6 = arg0 - 1 >> 7;
        int var7 = arg0 - (1 - arg2) - 1 >> 7;
        int var8 = arg1 - 1 >> 7;
        int var9 = arg1 + arg4 - 2 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class286[] var11 = this.field1051[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field4300 = true;
            }
        }
        if (arg3 > -101) {
            this.method612(-92, 41, (class308) null, (byte) -84);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lc;III)Z", line = 349)
    public final boolean method609(class308 arg0, int arg1, int arg2, int arg3) {
        class220 var5 = (class220) arg0;
        int var6 = var5.field3056 + arg1 + 1;
        int var7 = var5.field3058 + arg3 + 1;
        int var8 = this.field1048 * var6 + var7;
        if (arg2 != -8635) {
            this.method609((class308) null, -34, 37, 104);
        }
        int var9 = var5.field3059;
        int var10 = var5.field3057;
        int var11 = this.field1048 - var10;
        if (var6 <= 0) {
            int var12 = 1 - var6;
            var8 += this.field1048 * var12;
            var6 = 1;
            var9 -= var12;
        }
        if (this.field1055 <= (var6 + var9)) {
            int var13 = var6 + var9 + 1 - this.field1055;
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var8 += var14;
            var7 = 1;
            var10 -= var14;
            var11 += var14;
        }
        if (this.field1048 <= (var7 + var10)) {
            int var15 = var7 + var10 + 1 - this.field1048;
            var11 += var15;
            var10 -= var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field1048 + var11;
            return method607(var8, (byte) -98, var17, var16, this.field1052, var9, var10);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I[BIIII[BII)V", line = 422)
    private static final void method610(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        int var9 = -(arg7 >> 2);
        int var10 = -(arg7 & 0x3);
        if (arg0 != 1162127586) {
            return;
        }
        for (int var11 = -arg2; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg5++;
                arg1[var10001] += arg6[arg8++];
                int var14 = arg5++;
                arg1[var14] += arg6[arg8++];
                int var15 = arg5++;
                arg1[var15] += arg6[arg8++];
                int var16 = arg5++;
                arg1[var16] += arg6[arg8++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg5++;
                arg1[var10001] += arg6[arg8++];
            }
            arg8 += arg4;
            arg5 += arg3;
        }
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(Lc;III)V", line = 466)
    public final void method611(class308 arg0, int arg1, int arg2, int arg3) {
        class220 var5 = (class220) arg0;
        int var6 = var5.field3056 + arg1 + 1;
        int var7 = var5.field3058 + arg3 + 1;
        int var8 = this.field1048 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field3059;
        int var11 = var5.field3057;
        int var12 = this.field1048 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var6 = 1;
            var10 -= var13;
            var9 += var11 * var13;
            var8 += this.field1048 * var13;
        }
        int var14 = 0;
        if (this.field1055 <= (var6 + var10)) {
            int var15 = var10 + var6 + 1 - this.field1055;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var12 += var16;
            var8 += var16;
            var9 += var16;
            var14 += var16;
            var7 = 1;
            var11 -= var16;
        }
        if (this.field1048 <= (var7 + var11)) {
            int var17 = var11 + var7 + 1 - this.field1048;
            var14 += var17;
            var11 -= var17;
            var12 += var17;
        }
        if (var11 <= 0 || var10 <= 0) {
            return;
        }
        method610(1162127586, this.field1052, var10, var12, var14, var8, var5.field3060, var11, var9);
        this.method608(var7, var6, var11, -120, var10);
        if (arg2 != -28479) {
            this.field1055 = -39;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IILc;B)V", line = 537)
    public final void method612(int arg0, int arg1, class308 arg2, byte arg3) {
        class220 var5 = (class220) arg2;
        int var6 = var5.field3056 + arg1 + 1;
        int var7 = var5.field3058 + arg0 + 1;
        int var8 = this.field1048 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field3059;
        int var11 = var5.field3057;
        if (arg3 <= 12) {
            method605((byte[]) null, -13, -86, 78, 20, 125, -13, (byte[]) null, 73);
        }
        int var12 = this.field1048 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var8 += this.field1048 * var13;
            var6 = 1;
            var9 += var11 * var13;
            var10 -= var13;
        }
        int var14 = 0;
        if (this.field1055 <= (var6 + var10)) {
            int var15 = var6 + var10 + 1 - this.field1055;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var9 += var16;
            var11 -= var16;
            var12 += var16;
            var14 += var16;
            var8 += var16;
            var7 = 1;
        }
        if (this.field1048 <= (var7 + var11)) {
            int var17 = var11 + var7 + 1 - this.field1048;
            var14 += var17;
            var11 -= var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            method605(var5.field3060, var10, var9, var12, var14, var8, -1, this.field1052, var11);
            this.method608(var7, var6, var11, -118, var10);
        }
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lse;Lsb;)V", line = 604)
    public class76(class282 arg0, class153 arg1) {
        this.field1053 = arg1;
        this.field1056 = arg0;
        this.field1048 = (this.field1053.field2681 * this.field1053.field1923 >> this.field1056.field4154) + 2;
        this.field1055 = (this.field1053.field2685 * this.field1053.field1923 >> this.field1056.field4154) + 2;
        this.field1049 = 7 - (this.field1053.field1921 - this.field1056.field4154);
        this.field1052 = new byte[this.field1055 * this.field1048];
        this.field1054 = this.field1053.field2681 >> this.field1049;
        this.field1050 = this.field1053.field2685 >> this.field1049;
    }
}
