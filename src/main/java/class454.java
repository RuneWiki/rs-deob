import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class454 {

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "Lah;")
    private class238 field6159;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "Lbf;")
    private class344 field6162;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
    public int field6164;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    private int field6161;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    private int field6158;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "[B")
    public byte[] field6157;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    private int field6156;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    private int field6160;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "[[Lu;")
    private class50[][] field6163;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II[BIIII[BI)V", line = 5)
    private static final void method2663(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8) {
        int var9 = -(arg8 >> 2);
        int var10 = -(arg8 & arg0);
        for (int var11 = -arg1; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg3++;
                arg7[var10001] += arg2[arg6++];
                int var14 = arg3++;
                arg7[var14] += arg2[arg6++];
                int var15 = arg3++;
                arg7[var15] += arg2[arg6++];
                int var16 = arg3++;
                arg7[var16] += arg2[arg6++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg3++;
                arg7[var10001] += arg2[arg6++];
            }
            arg3 += arg5;
            arg6 += arg4;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V", line = 44)
    public final void method2664(byte arg0) {
        this.field6163 = new class50[this.field6156][this.field6160];
        for (int var2 = 0; var2 < this.field6160; var2++) {
            for (int var3 = 0; var3 < this.field6156; var3++) {
                this.field6163[var3][var2] = new class50(this.field6162, this, this.field6159, var3, var2, this.field6158, var3 * 128 + 1, var2 * 128 - -1);
            }
        }
        if (arg0 != -27) {
            this.field6158 = 124;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lkb;IIB)V", line = 73)
    public final void method2665(class449 arg0, int arg1, int arg2, byte arg3) {
        class207 var5 = (class207) arg0;
        int var6 = var5.field2798 + arg2 + 1;
        int var7 = var5.field2795 + arg1 + 1;
        int var8 = this.field6164 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field2797;
        int var11 = -6 / ((arg3 + 20) / 63);
        int var12 = var5.field2796;
        int var13 = this.field6164 - var12;
        int var14 = 0;
        if (var7 <= 0) {
            int var15 = 1 - var7;
            var10 -= var15;
            var7 = 1;
            var9 += var12 * var15;
            var8 += this.field6164 * var15;
        }
        if (this.field6161 <= var7 + var10) {
            int var16 = var7 + var10 + 1 - this.field6161;
            var10 -= var16;
        }
        if (var6 <= 0) {
            int var17 = 1 - var6;
            var14 += var17;
            var13 += var17;
            var8 += var17;
            var12 -= var17;
            var9 += var17;
            var6 = 1;
        }
        if (this.field6164 <= var6 + var12) {
            int var18 = var6 + var12 - (this.field6164 - 1);
            var13 += var18;
            var12 -= var18;
            var14 += var18;
        }
        if (var12 > 0 && var10 > 0) {
            method2663(3, var10, var5.field2799, var8, var14, var13, var9, this.field6157, var12);
            this.method2667((byte) 43, var10, var7, var12, var6);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([BBIIIII)Z", line = 147)
    private static final boolean method2666(byte[] arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg6 % arg4;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg4 - var7;
        }
        int var9 = -((arg3 - (1 - arg4)) / arg4);
        int var10 = -((arg6 + arg4 - 1) / arg4);
        if (arg1 != -108) {
            return true;
        }
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg0[arg5] == 0) {
                    return true;
                }
                arg5 += arg4;
            }
            int var13 = arg5 - var8;
            if (arg0[var13 - 1] == 0) {
                return true;
            }
            arg5 = arg2 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BIIII)V", line = 197)
    private final void method2667(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field6163 == null) {
            return;
        }
        int var6 = 7 % ((90 - arg0) / 35);
        int var7 = arg4 - 1 >> 7;
        int var8 = arg3 + arg4 - 1 - 1 >> 7;
        int var9 = arg2 - 1 >> 7;
        int var10 = arg2 + arg1 - 1 - 1 >> 7;
        for (int var11 = var7; var11 <= var8; var11++) {
            class50[] var12 = this.field6163[var11];
            for (int var13 = var9; var13 <= var10; var13++) {
                var12[var13].field657 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IILkb;I)Z", line = 234)
    public final boolean method2668(int arg0, int arg1, class449 arg2, int arg3) {
        class207 var5 = (class207) arg2;
        int var6 = var5.field2795 + arg0 + 1;
        int var7 = var5.field2798 + arg3 + 1;
        int var8 = this.field6164 * var6 + var7;
        int var9 = var5.field2797;
        int var10 = var5.field2796;
        if (~var6 >= arg1) {
            int var11 = 1 - var6;
            var6 = 1;
            var9 -= var11;
            var8 += this.field6164 * var11;
        }
        int var12 = this.field6164 - var10;
        if (this.field6161 <= var6 + var9) {
            int var13 = var6 + var9 - (-1 - -this.field6161);
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var12 += var14;
            var7 = 1;
            var8 += var14;
            var10 -= var14;
        }
        if (var7 + var10 >= this.field6164) {
            int var15 = var7 + var10 + 1 - this.field6164;
            var10 -= var15;
            var12 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field6164 + var12;
            return method2666(this.field6157, (byte) -108, var17, var9, var16, var8, var10);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([B[BIIIIIII)V", line = 301)
    private static final void method2669(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 != -14880) {
            return;
        }
        int var9 = -(arg2 >> 2);
        int var10 = -(arg2 & 0x3);
        for (int var11 = -arg8; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg3++;
                arg0[var10001] = (byte) (arg0[var10001] - arg1[arg6++]);
                int var14 = arg3++;
                arg0[var14] = (byte) (arg0[var14] - arg1[arg6++]);
                int var15 = arg3++;
                arg0[var15] = (byte) (arg0[var15] - arg1[arg6++]);
                int var16 = arg3++;
                arg0[var16] = (byte) (arg0[var16] - arg1[arg6++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg3++;
                arg0[var10001] = (byte) (arg0[var10001] - arg1[arg6++]);
            }
            arg6 += arg7;
            arg3 += arg5;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILkb;II)V", line = 347)
    public final void method2670(int arg0, class449 arg1, int arg2, int arg3) {
        class207 var5 = (class207) arg1;
        int var6 = var5.field2795 + arg0 + 1;
        int var7 = var5.field2798 + arg2 + 1;
        int var8 = var7 + (this.field6164 * var6);
        int var9 = 0;
        int var10 = var5.field2797;
        int var11 = var5.field2796;
        int var12 = this.field6164 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var9 += var11 * var13;
            var8 += this.field6164 * var13;
            var6 = 1;
            var10 -= var13;
        }
        int var14 = 0;
        if (this.field6161 <= var6 + var10) {
            int var15 = var6 + var10 - (this.field6161 - 1);
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var7 = 1;
            var11 -= var16;
            var9 += var16;
            var12 += var16;
            var14 += var16;
            var8 += var16;
        }
        if (this.field6164 <= var7 + var11) {
            int var17 = var11 + var7 + 1 - this.field6164;
            var14 += var17;
            var12 += var17;
            var11 -= var17;
        }
        if (arg3 > 20 && var11 > 0 && var10 > 0) {
            method2669(this.field6157, var5.field2799, var11, var8, -14880, var12, var9, var14, var10);
            this.method2667((byte) 46, var10, var6, var11, var7);
        }
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lbf;Lah;)V", line = 414)
    public class454(class344 arg0, class238 arg1) {
        this.field6159 = arg1;
        this.field6162 = arg0;
        this.field6164 = (this.field6159.field3143 * this.field6159.field2410 >> this.field6162.field4623) + 2;
        this.field6161 = (this.field6159.field3143 * this.field6159.field2409 >> this.field6162.field4623) + 2;
        this.field6158 = this.field6162.field4623 + 7 - this.field6159.field3146;
        this.field6157 = new byte[this.field6164 * this.field6161];
        this.field6156 = this.field6159.field2410 >> this.field6158;
        this.field6160 = this.field6159.field2409 >> this.field6158;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([[ZIZIII)V", line = 431)
    public final void method2671(boolean[][] arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        opengl var7 = this.field6162.field4604;
        this.field6162.method2060();
        this.field6162.method1961(false);
        this.field6162.method2040(false);
        this.field6162.method1963(-2);
        this.field6162.method1984(0);
        this.field6162.method1957(1);
        float var8 = 1.0F / (float) (this.field6162.field4620 * 128);
        if (arg5 < 46) {
            return;
        }
        if (arg2) {
            for (int var9 = 0; var9 < this.field6160; var9++) {
                int var10 = var9 << this.field6158;
                int var11 = var9 + 1 << this.field6158;
                label133: for (int var12 = 0; var12 < this.field6156; var12++) {
                    int var13 = var12 << this.field6158;
                    int var14 = var12 + 1 << this.field6158;
                    for (int var15 = var13; var15 < var14; var15++) {
                        if ((-arg1) <= (var15 - arg4) && arg1 >= var15 - arg4) {
                            for (int var16 = var10; var16 < var11; var16++) {
                                if ((var16 - arg3) >= (-arg1) && (var16 - arg3) <= arg1 && arg0[arg1 + var15 - arg4][var16 + arg1 - arg3]) {
                                    var7.glMatrixMode(5890);
                                    var7.glLoadIdentity();
                                    var7.glScalef(var8, var8, 1.0F);
                                    var7.glTranslatef((float) (-var12) / var8, (float) (-var9) / var8, 1.0F);
                                    var7.glMatrixMode(5888);
                                    this.field6163[var12][var9].method351((byte) -108);
                                    continue label133;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var17 = 0; var17 < this.field6160; var17++) {
                int var18 = var17 << this.field6158;
                int var19 = var17 + 1 << this.field6158;
                for (int var20 = 0; var20 < this.field6156; var20++) {
                    int var21 = 0;
                    int var22 = var20 << this.field6158;
                    int var23 = var20 + 1 << this.field6158;
                    class32 var24 = class238.field3135;
                    var24.field456 = 0;
                    for (int var25 = var18; var25 < var19; var25++) {
                        if (-arg1 <= var25 - arg3 && arg1 >= var25 - arg3) {
                            int var26 = this.field6159.field2410 * var25 + var22;
                            for (int var27 = var22; var27 < var23; var27++) {
                                if ((var27 - arg4) >= (-arg1) && arg1 >= (var27 - arg4) && arg0[var27 + arg1 - arg4][var25 + arg1 - arg3]) {
                                    short[] var28 = this.field6159.field3130[var26];
                                    if (var28 != null) {
                                        if (this.field6162.field4721) {
                                            for (int var30 = 0; var30 < var28.length; var30++) {
                                                var24.method229(var28[var30] & 0xFFFF, 1309449544);
                                                var21++;
                                            }
                                        } else {
                                            for (int var29 = 0; var29 < var28.length; var29++) {
                                                var24.method231(87, var28[var29] & 0xFFFF);
                                                var21++;
                                            }
                                        }
                                    }
                                }
                                var26++;
                            }
                        }
                    }
                    if (var21 > 0) {
                        var7.glMatrixMode(5890);
                        var7.glLoadIdentity();
                        var7.glScalef(var8, var8, 1.0F);
                        var7.glTranslatef((float) (-var20) / var8, (float) (-var17) / var8, 1.0F);
                        var7.glMatrixMode(5888);
                        this.field6163[var20][var17].method353(var24.field472, 5123, 5586, var21);
                    }
                }
            }
        }
        var7.glMatrixMode(5890);
        var7.glLoadIdentity();
        var7.glMatrixMode(5888);
    }
}
