import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class354 {

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "Lnm;")
    private class254 field5373;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "Llg;")
    private class22 field5374;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "I")
    public int field5379;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
    private int field5372;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "[B")
    public byte[] field5376;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "I")
    private int field5375;

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "I")
    private int field5378;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
    private int field5371;

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "[[Lln;")
    private class66[][] field5377;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(II[[ZIZB)V")
    public final void method2177(int arg0, int arg1, boolean[][] arg2, int arg3, boolean arg4, byte arg5) {
        if (arg5 < 22) {
            this.method2177(95, -20, (boolean[][]) ((boolean[][]) null), 55, false, (byte) 112);
        }
        opengl var7 = this.field5373.field3648;
        this.field5373.method1639();
        this.field5373.method1631(false);
        this.field5373.method1656(false);
        this.field5373.method1680(-2);
        this.field5373.method1636(0);
        this.field5373.method1657(1);
        float var8 = 1.0F / (float) (this.field5373.field3660 * 128);
        if (arg4) {
            for (int var23 = 0; var23 < this.field5371; var23++) {
                int var24 = var23 << this.field5375;
                int var25 = var23 + 1 << this.field5375;
                label86: for (int var26 = 0; var26 < this.field5378; var26++) {
                    int var27 = var26 << this.field5375;
                    int var28 = var26 + 1 << this.field5375;
                    for (int var29 = var27; var29 < var28; var29++) {
                        if ((var29 - arg0) >= (-arg1) && var29 - arg0 <= arg1) {
                            for (int var30 = var24; var30 < var25; var30++) {
                                if (-arg1 <= var30 - arg3 && (var30 - arg3) <= arg1 && arg2[var29 + arg1 - arg0][arg1 + var30 - arg3]) {
                                    var7.glMatrixMode(5890);
                                    var7.glLoadIdentity();
                                    var7.glScalef(var8, var8, 1.0F);
                                    var7.glTranslatef((float) (-var26) / var8, (float) (-var23) / var8, 1.0F);
                                    var7.glMatrixMode(5888);
                                    this.field5377[var26][var23].method599(-122);
                                    continue label86;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var9 = 0; var9 < this.field5371; var9++) {
                int var10 = var9 << this.field5375;
                int var11 = var9 + 1 << this.field5375;
                for (int var12 = 0; var12 < this.field5378; var12++) {
                    int var13 = 0;
                    int var14 = var12 << this.field5375;
                    int var15 = var12 + 1 << this.field5375;
                    class446 var16 = class22.field280;
                    var16.field6315 = 0;
                    for (int var17 = var10; var17 < var11; var17++) {
                        if (-arg1 <= var17 - arg3 && arg1 >= var17 - arg3) {
                            int var18 = this.field5374.field686 * var17 + var14;
                            for (int var19 = var14; var19 < var15; var19++) {
                                if ((var19 - arg0) >= (-arg1) && (var19 - arg0) <= arg1 && arg2[arg1 + var19 - arg0][arg1 + var17 - arg3]) {
                                    short[] var20 = this.field5374.field283[var18];
                                    if (var20 != null) {
                                        if (this.field5373.field3742) {
                                            for (int var22 = 0; var22 < var20.length; var22++) {
                                                var13++;
                                                var16.method2592(var20[var22] & 0xFFFF, (byte) -128);
                                            }
                                        } else {
                                            for (int var21 = 0; var21 < var20.length; var21++) {
                                                var13++;
                                                var16.method2623(var20[var21] & 0xFFFF, (byte) -87);
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
                        this.field5377[var12][var9].method598(5123, var13, var16.field6316, false);
                    }
                }
            }
        }
        var7.glMatrixMode(5890);
        var7.glLoadIdentity();
        var7.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lfq;III)V")
    public final void method2178(class87 arg0, int arg1, int arg2, int arg3) {
        class440 var5 = (class440) arg0;
        if (arg2 != 7) {
            return;
        }
        int var6 = var5.field6224 + arg3 + 1;
        int var7 = var5.field6223 + arg1 + 1;
        int var8 = this.field5379 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field6226;
        int var11 = var5.field6222;
        int var12 = this.field5379 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var7 = 1;
            var10 -= var13;
            var8 += this.field5379 * var13;
            var9 += var11 * var13;
        }
        int var14 = 0;
        if (this.field5372 <= var7 + var10) {
            int var15 = var7 - (-var10 - 1) - this.field5372;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var12 += var16;
            var14 += var16;
            var6 = 1;
            var8 += var16;
            var11 -= var16;
            var9 += var16;
        }
        if ((var6 + var11) >= this.field5379) {
            int var17 = var11 + var6 + 1 - this.field5379;
            var11 -= var17;
            var14 += var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            method2183(var5.field6225, var10, var9, var12, (byte) 81, var8, var14, this.field5376, var11);
            this.method2182(var6, var11, var10, var7, (byte) 110);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIBLfq;)Z")
    public final boolean method2179(int arg0, int arg1, byte arg2, class87 arg3) {
        class440 var5 = (class440) arg3;
        int var6 = var5.field6224 + arg1 + 1;
        int var7 = var5.field6223 + arg0 + 1;
        int var8 = var6 + (this.field5379 * var7);
        if (arg2 != -122) {
            return true;
        }
        int var9 = var5.field6226;
        int var10 = var5.field6222;
        int var11 = this.field5379 - var10;
        if (var7 <= 0) {
            int var12 = 1 - var7;
            var8 += this.field5379 * var12;
            var9 -= var12;
            var7 = 1;
        }
        if ((var7 + var9) >= this.field5372) {
            int var13 = var7 + var9 + 1 - this.field5372;
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var6 = 1;
            var10 -= var14;
            var11 += var14;
            var8 += var14;
        }
        if ((var6 + var10) >= this.field5379) {
            int var15 = var6 + var10 + 1 - this.field5379;
            var11 += var15;
            var10 -= var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field5379 + var11;
            return method2181(var17, var16, var10, var8, this.field5376, (byte) -113, var9);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILfq;II)V")
    public final void method2180(int arg0, class87 arg1, int arg2, int arg3) {
        class440 var5 = (class440) arg1;
        int var6 = var5.field6224 + arg0 + 1;
        int var7 = var5.field6223 + arg2 + 1;
        int var8 = this.field5379 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field6226;
        int var11 = var5.field6222;
        int var12 = this.field5379 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var8 += this.field5379 * var13;
            var9 += var11 * var13;
            var10 -= var13;
            var7 = 1;
        }
        int var14 = 0;
        if (var7 + var10 >= this.field5372) {
            int var15 = var7 + var10 + 1 - this.field5372;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var14 += var16;
            var6 = 1;
            var8 += var16;
            var9 += var16;
            var11 -= var16;
            var12 += var16;
        }
        if (var6 + var11 >= this.field5379) {
            int var17 = var6 + var11 + 1 - this.field5379;
            var11 -= var17;
            var14 += var17;
            var12 += var17;
        }
        if (arg3 != -13428) {
            this.field5372 = -119;
        }
        if (var11 > 0 && var10 > 0) {
            method2185(var5.field6225, (byte) -105, var10, var14, var12, var8, var9, this.field5376, var11);
            this.method2182(var6, var11, var10, var7, (byte) 110);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIII[BBI)Z")
    private static final boolean method2181(int arg0, int arg1, int arg2, int arg3, byte[] arg4, byte arg5, int arg6) {
        int var7 = arg2 % arg1;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg1 - var7;
        }
        int var9 = -((arg6 + arg1 - 1) / arg1);
        int var10 = -((arg2 + arg1 - 1) / arg1);
        int var11 = var9;
        if (arg5 >= -64) {
            method2185((byte[]) null, (byte) -128, 63, 54, 49, 79, -76, (byte[]) null, 63);
        }
        while (var11 < 0) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg4[arg3] == 0) {
                    return true;
                }
                arg3 += arg1;
            }
            int var13 = arg3 - var8;
            if (arg4[var13 - 1] == 0) {
                return true;
            }
            arg3 = arg0 + var13;
            var11++;
        }
        return false;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIIB)V")
    private final void method2182(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (this.field5377 == null) {
            return;
        }
        int var6 = arg0 - 1 >> 7;
        int var7 = arg0 + arg1 - 1 - 1 >> 7;
        int var8 = arg3 - 1 >> 7;
        int var9 = arg3 + arg2 - 1 - 1 >> 7;
        if (arg4 != 110) {
            return;
        }
        for (int var10 = var6; var10 <= var7; var10++) {
            class66[] var11 = this.field5377[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field910 = true;
            }
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "([BIIIBII[BI)V")
    private static final void method2183(byte[] arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, byte[] arg7, int arg8) {
        int var9 = -(arg8 >> 2);
        if (arg4 != 81) {
            return;
        }
        int var10 = -(arg8 & 0x3);
        for (int var11 = -arg1; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg5++;
                arg7[var10001] += arg0[arg2++];
                int var14 = arg5++;
                arg7[var14] += arg0[arg2++];
                int var15 = arg5++;
                arg7[var15] += arg0[arg2++];
                int var16 = arg5++;
                arg7[var16] += arg0[arg2++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg5++;
                arg7[var10001] += arg0[arg2++];
            }
            arg2 += arg6;
            arg5 += arg3;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V")
    public final void method2184(int arg0) {
        this.field5377 = new class66[this.field5378][this.field5371];
        if (arg0 != -23720) {
            this.method2178((class87) null, 50, -56, -74);
        }
        for (int var2 = 0; var2 < this.field5371; var2++) {
            for (int var3 = 0; var3 < this.field5378; var3++) {
                this.field5377[var3][var2] = new class66(this.field5373, this, this.field5374, var3, var2, this.field5375, var3 * 128 + 1, var2 * 128 - -1);
            }
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "([BBIIIII[BI)V")
    private static final void method2185(byte[] arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8) {
        int var9 = -(arg8 >> 2);
        int var10 = -(arg8 & 0x3);
        if (arg1 >= -38) {
            method2185((byte[]) null, (byte) -17, -81, -85, -40, 102, -78, (byte[]) null, 47);
        }
        for (int var11 = -arg2; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg5++;
                arg7[var10001] = (byte) (arg7[var10001] - arg0[arg6++]);
                int var14 = arg5++;
                arg7[var14] = (byte) (arg7[var14] - arg0[arg6++]);
                int var15 = arg5++;
                arg7[var15] = (byte) (arg7[var15] - arg0[arg6++]);
                int var16 = arg5++;
                arg7[var16] = (byte) (arg7[var16] - arg0[arg6++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg5++;
                arg7[var10001] = (byte) (arg7[var10001] - arg0[arg6++]);
            }
            arg5 += arg4;
            arg6 += arg3;
        }
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lnm;Llg;)V")
    public class354(class254 arg0, class22 arg1) {
        this.field5373 = arg0;
        this.field5374 = arg1;
        this.field5379 = (this.field5374.field686 * this.field5374.field286 >> this.field5373.field3665) + 2;
        this.field5372 = (this.field5374.field690 * this.field5374.field286 >> this.field5373.field3665) + 2;
        this.field5376 = new byte[this.field5379 * this.field5372];
        this.field5375 = this.field5373.field3665 + 7 - this.field5374.field278;
        this.field5378 = this.field5374.field686 >> this.field5375;
        this.field5371 = this.field5374.field690 >> this.field5375;
    }
}
