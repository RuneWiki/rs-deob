import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class149 {

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "Ler;")
    private class55 field2227;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "Lig;")
    private class132 field2231;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
    public int field2233;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    private int field2228;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    private int field2235;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "[B")
    public byte[] field2229;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
    private int field2234;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    private int field2232;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "[[Laq;")
    private class90[][] field2230;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILo;II)V", line = 5)
    public final void method1100(int arg0, class21 arg1, int arg2, int arg3) {
        class67 var5 = (class67) arg1;
        int var6 = var5.field903 + arg0 + 1;
        int var7 = var5.field900 + arg2 + 1;
        int var8 = var7 + (this.field2233 * var6);
        int var9 = 0;
        int var10 = var5.field901;
        int var11 = var5.field899;
        int var12 = this.field2233 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var6 = 1;
            var9 += var11 * var13;
            var10 -= var13;
            var8 += this.field2233 * var13;
        }
        int var14 = 0;
        if (var6 + var10 >= this.field2228) {
            int var15 = var6 + 1 - (-var10 + this.field2228);
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var8 += var16;
            var12 += var16;
            var7 = 1;
            var11 -= var16;
            var14 += var16;
            var9 += var16;
        }
        if (this.field2233 <= var7 + var11) {
            int var17 = var7 + var11 + 1 - this.field2233;
            var14 += var17;
            var12 += var17;
            var11 -= var17;
        }
        if (var11 <= 0 || var10 <= 0) {
            return;
        }
        if (arg3 != -27533) {
            this.field2235 = 38;
        }
        method1107(var8, var9, var5.field902, var10, var12, this.field2229, arg3 + 27424, var11, var14);
        this.method1103(var7, var11, 1, var10, var6);
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(ILo;II)Z", line = 73)
    public final boolean method1101(int arg0, class21 arg1, int arg2, int arg3) {
        class67 var5 = (class67) arg1;
        int var6 = var5.field903 + arg2 + arg3;
        int var7 = var5.field900 + arg0 + 1;
        int var8 = this.field2233 * var6 + var7;
        int var9 = var5.field901;
        int var10 = var5.field899;
        int var11 = this.field2233 - var10;
        if (var6 <= 0) {
            int var12 = 1 - var6;
            var8 += this.field2233 * var12;
            var9 -= var12;
            var6 = 1;
        }
        if (var6 + var9 >= this.field2228) {
            int var13 = var6 - (-var9 - (1 - this.field2228));
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var11 += var14;
            var10 -= var14;
            var7 = 1;
            var8 += var14;
        }
        if (var7 + var10 >= this.field2233) {
            int var15 = var7 + var10 + 1 - this.field2233;
            var10 -= var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field2233 + var11;
            return method1102((byte) 109, var9, var10, var17, this.field2229, var8, var16);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BIII[BII)Z", line = 142)
    private static final boolean method1102(byte arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        int var7 = arg2 % arg6;
        if (arg0 != 109) {
            return true;
        }
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg6 - var7;
        }
        int var9 = -((arg1 + arg6 - 1) / arg6);
        int var10 = -((arg2 + arg6 - 1) / arg6);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg4[arg5] == 0) {
                    return true;
                }
                arg5 += arg6;
            }
            int var13 = arg5 - var8;
            if (arg4[var13 - 1] == 0) {
                return true;
            }
            arg5 = arg3 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIII)V", line = 190)
    private final void method1103(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field2230 == null) {
            return;
        }
        int var6 = arg0 - 1 >> 7;
        int var7 = arg0 + arg1 - 1 - 1 >> 7;
        int var8 = arg4 - arg2 >> 7;
        int var9 = arg4 + arg3 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class90[] var11 = this.field2230[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field1165 = true;
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)V", line = 228)
    public final void method1104(boolean arg0) {
        this.field2230 = new class90[this.field2234][this.field2232];
        for (int var2 = 0; var2 < this.field2232; var2++) {
            for (int var3 = 0; var3 < this.field2234; var3++) {
                this.field2230[var3][var2] = new class90(this.field2231, this, this.field2227, var3, var2, this.field2235, var3 * 128 + 1, var2 * 128 + 1);
            }
        }
        if (arg0) {
            this.method1104(true);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZIB[[ZII)V", line = 256)
    public final void method1105(boolean arg0, int arg1, byte arg2, boolean[][] arg3, int arg4, int arg5) {
        opengl var7 = this.field2231.field1918;
        this.field2231.method908();
        this.field2231.method996(false);
        this.field2231.method969(false);
        this.field2231.method977(-2);
        this.field2231.method913(0);
        if (arg2 >= -5) {
            this.field2227 = (class55) null;
        }
        this.field2231.method972(1);
        float var8 = 1.0F / (float) (this.field2231.field1936 * 128);
        if (arg0) {
            for (int var23 = 0; var23 < this.field2232; var23++) {
                int var24 = var23 << this.field2235;
                int var25 = var23 + 1 << this.field2235;
                label87: for (int var26 = 0; var26 < this.field2234; var26++) {
                    int var27 = var26 << this.field2235;
                    int var28 = var26 + 1 << this.field2235;
                    for (int var29 = var27; var29 < var28; var29++) {
                        if (-arg4 <= var29 - arg1 && arg4 >= (var29 - arg1)) {
                            for (int var30 = var24; var30 < var25; var30++) {
                                if ((var30 - arg5) >= (-arg4) && arg4 >= var30 - arg5 && arg3[var29 + arg4 - arg1][var30 + arg4 - arg5]) {
                                    var7.glMatrixMode(5890);
                                    var7.glLoadIdentity();
                                    var7.glScalef(var8, var8, 1.0F);
                                    var7.glTranslatef((float) (-var26) / var8, (float) (-var23) / var8, 1.0F);
                                    var7.glMatrixMode(5888);
                                    this.field2230[var26][var23].method529(-36);
                                    continue label87;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var9 = 0; var9 < this.field2232; var9++) {
                int var10 = var9 << this.field2235;
                int var11 = var9 + 1 << this.field2235;
                for (int var12 = 0; var12 < this.field2234; var12++) {
                    int var13 = 0;
                    int var14 = var12 << this.field2235;
                    int var15 = var12 + 1 << this.field2235;
                    class130 var16 = class55.field718;
                    var16.field1880 = 0;
                    for (int var17 = var10; var17 < var11; var17++) {
                        if ((-arg4) <= (var17 - arg5) && (var17 - arg5) <= arg4) {
                            int var18 = this.field2227.field1187 * var17 + var14;
                            for (int var19 = var14; var19 < var15; var19++) {
                                if (var19 - arg1 >= -arg4 && (var19 - arg1) <= arg4 && arg3[var19 + arg4 - arg1][var17 + arg4 - arg5]) {
                                    short[] var20 = this.field2227.field717[var18];
                                    if (var20 != null) {
                                        if (this.field2231.field1998) {
                                            for (int var22 = 0; var22 < var20.length; var22++) {
                                                var13++;
                                                var16.method799(var20[var22] & 0xFFFF, 123);
                                            }
                                        } else {
                                            for (int var21 = 0; var21 < var20.length; var21++) {
                                                var16.method827(var20[var21] & 0xFFFF, 124);
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
                        this.field2230[var12][var9].method532(var13, 5123, var16.field1851, 24);
                    }
                }
            }
        }
        var7.glMatrixMode(5890);
        var7.glLoadIdentity();
        var7.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "([BI[BIIIBII)V", line = 444)
    private static final void method1106(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
        int var9 = -(arg3 >> 2);
        int var10 = -(arg3 & 0x3);
        for (int var11 = -arg5; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg7++;
                arg2[var10001] = (byte) (arg2[var10001] - arg0[arg4++]);
                int var14 = arg7++;
                arg2[var14] = (byte) (arg2[var14] - arg0[arg4++]);
                int var15 = arg7++;
                arg2[var15] = (byte) (arg2[var15] - arg0[arg4++]);
                int var16 = arg7++;
                arg2[var16] = (byte) (arg2[var16] - arg0[arg4++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg7++;
                arg2[var10001] = (byte) (arg2[var10001] - arg0[arg4++]);
            }
            arg4 += arg1;
            arg7 += arg8;
        }
        if (arg6 != 80) {
            method1106((byte[]) null, -123, (byte[]) null, 5, 21, -21, (byte) -3, -113, 105);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II[BII[BIII)V", line = 487)
    private static final void method1107(int arg0, int arg1, byte[] arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8) {
        int var9 = -(arg7 >> 2);
        int var10 = -(arg7 & 0x3);
        if (arg6 > -106) {
            return;
        }
        for (int var11 = -arg3; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg0++;
                arg5[var10001] += arg2[arg1++];
                int var14 = arg0++;
                arg5[var14] += arg2[arg1++];
                int var15 = arg0++;
                arg5[var15] += arg2[arg1++];
                int var16 = arg0++;
                arg5[var16] += arg2[arg1++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg0++;
                arg5[var10001] += arg2[arg1++];
            }
            arg1 += arg8;
            arg0 += arg4;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lo;III)V", line = 530)
    public final void method1108(class21 arg0, int arg1, int arg2, int arg3) {
        class67 var5 = (class67) arg0;
        int var6 = var5.field900 + arg3 + arg1;
        int var7 = var5.field903 + arg2 + 1;
        int var8 = this.field2233 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field901;
        int var11 = var5.field899;
        int var12 = this.field2233 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var10 -= var13;
            var7 = 1;
            var8 += this.field2233 * var13;
            var9 += var11 * var13;
        }
        int var14 = 0;
        if (this.field2228 <= var7 + var10) {
            int var15 = var7 + var10 - (this.field2228 - 1);
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var11 -= var16;
            var6 = 1;
            var14 += var16;
            var9 += var16;
            var8 += var16;
            var12 += var16;
        }
        if (this.field2233 <= var6 + var11) {
            int var17 = var6 + var11 + 1 - this.field2233;
            var12 += var17;
            var14 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            method1106(var5.field902, var14, this.field2229, var11, var9, var10, (byte) 80, var8, var12);
            this.method1103(var6, var11, 1, var10, var7);
        }
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lig;Ler;)V", line = 594)
    public class149(class132 arg0, class55 arg1) {
        this.field2227 = arg1;
        this.field2231 = arg0;
        this.field2233 = (this.field2227.field712 * this.field2227.field1187 >> this.field2231.field1933) + 2;
        this.field2228 = (this.field2227.field712 * this.field2227.field1183 >> this.field2231.field1933) + 2;
        this.field2235 = this.field2231.field1933 + 7 - this.field2227.field722;
        this.field2229 = new byte[this.field2233 * this.field2228];
        this.field2234 = this.field2227.field1187 >> this.field2235;
        this.field2232 = this.field2227.field1183 >> this.field2235;
    }
}
