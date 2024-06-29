import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class421 {

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "Lmm;")
    private class357 field5829;

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "Leb;")
    private class384 field5833;

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "I")
    public int field5832;

    @OriginalMember(owner = "client!lo", name = "i", descriptor = "I")
    private int field5836;

    @OriginalMember(owner = "client!lo", name = "h", descriptor = "I")
    private int field5835;

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "[B")
    public byte[] field5830;

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "I")
    private int field5834;

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "I")
    private int field5831;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "[[Lnp;")
    private class207[][] field5828;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIBI[B[BIII)V")
    private static final void method2595(int arg0, int arg1, byte arg2, int arg3, byte[] arg4, byte[] arg5, int arg6, int arg7, int arg8) {
        int var9 = -(arg7 >> 2);
        if (arg2 != -117) {
            return;
        }
        int var10 = -(arg7 & 0x3);
        for (int var11 = -arg3; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg8++;
                arg5[var10001] += arg4[arg1++];
                int var14 = arg8++;
                arg5[var14] += arg4[arg1++];
                int var15 = arg8++;
                arg5[var15] += arg4[arg1++];
                int var16 = arg8++;
                arg5[var16] += arg4[arg1++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg8++;
                arg5[var10001] += arg4[arg1++];
            }
            arg8 += arg6;
            arg1 += arg0;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILlb;ZI)V")
    public final void method2596(int arg0, class210 arg1, boolean arg2, int arg3) {
        class270 var5 = (class270) arg1;
        int var6 = var5.field3689 + arg0 + 1;
        int var7 = var5.field3692 + arg3 + 1;
        int var8 = var7 + (this.field5832 * var6);
        int var9 = 0;
        int var10 = var5.field3693;
        int var11 = var5.field3690;
        int var12 = this.field5832 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var9 += var11 * var13;
            var8 += this.field5832 * var13;
            var10 -= var13;
            var6 = 1;
        }
        int var14 = 0;
        if (this.field5836 <= (var6 + var10)) {
            int var15 = var10 + var6 + 1 - this.field5836;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var12 += var16;
            var7 = 1;
            var9 += var16;
            var8 += var16;
            var11 -= var16;
            var14 += var16;
        }
        if (this.field5832 <= var7 + var11) {
            int var17 = var7 + var11 + 1 - this.field5832;
            var11 -= var17;
            var14 += var17;
            var12 += var17;
        }
        if (var11 <= 0 || var10 <= 0) {
            return;
        }
        method2595(var14, var9, (byte) -117, var10, var5.field3691, this.field5830, var12, var11, var8);
        if (!arg2) {
            method2595(52, 13, (byte) 25, -60, (byte[]) null, (byte[]) null, -87, 122, 16);
        }
        this.method2601(var11, var6, var10, var7, -48);
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILlb;II)Z")
    public final boolean method2597(int arg0, class210 arg1, int arg2, int arg3) {
        class270 var5 = (class270) arg1;
        int var6 = var5.field3692 + arg3 + 1;
        int var7 = var5.field3689 + arg2 + 1;
        int var8 = this.field5832 * var7 + var6;
        if (arg0 != 9113) {
            this.method2602((byte) -59);
        }
        int var9 = var5.field3693;
        int var10 = var5.field3690;
        int var11 = this.field5832 - var10;
        if (var7 <= 0) {
            int var12 = 1 - var7;
            var7 = 1;
            var9 -= var12;
            var8 += this.field5832 * var12;
        }
        if (this.field5836 <= var7 + var9) {
            int var13 = var7 + 1 - (-var9 + this.field5836);
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var11 += var14;
            var8 += var14;
            var10 -= var14;
            var6 = 1;
        }
        if (this.field5832 <= (var6 + var10)) {
            int var15 = var6 - this.field5832 - (-var10 + -1);
            var10 -= var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field5832 + var11;
            return method2599(this.field5830, var10, var16, var8, var9, 7861, var17);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IILlb;B)V")
    public final void method2598(int arg0, int arg1, class210 arg2, byte arg3) {
        class270 var5 = (class270) arg2;
        int var6 = var5.field3692 + arg0 + 1;
        int var7 = var5.field3689 + arg1 + 1;
        int var8 = this.field5832 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field3693;
        int var11 = var5.field3690;
        int var12 = this.field5832 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var9 += var11 * var13;
            var7 = 1;
            var10 -= var13;
            var8 += this.field5832 * var13;
        }
        int var14 = 0;
        if (var7 + var10 >= this.field5836) {
            int var15 = var7 + var10 + 1 - this.field5836;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var11 -= var16;
            var14 += var16;
            var8 += var16;
            var9 += var16;
            var6 = 1;
            var12 += var16;
        }
        if (this.field5832 <= var6 + var11) {
            int var17 = var11 + var6 + 1 - this.field5832;
            var11 -= var17;
            var12 += var17;
            var14 += var17;
        }
        if (arg3 < 29) {
            this.field5831 = 118;
        }
        if (var11 > 0 && var10 > 0) {
            method2600(this.field5830, var9, var11, var5.field3691, var8, var12, var14, var10, (byte) -10);
            this.method2601(var11, var7, var10, var6, -110);
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "([BIIIIII)Z")
    private static final boolean method2599(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg1 % arg2;
        if (arg5 != 7861) {
            return false;
        }
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg2 - var7;
        }
        int var9 = -((arg2 + arg4 - 1) / arg2);
        int var10 = -((arg1 + arg2 - 1) / arg2);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg0[arg3] == 0) {
                    return true;
                }
                arg3 += arg2;
            }
            int var13 = arg3 - var8;
            if (arg0[var13 - 1] == 0) {
                return true;
            }
            arg3 = arg6 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "([BII[BIIIIB)V")
    private static final void method2600(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        int var9 = -(arg2 >> 2);
        int var10 = -(arg2 & 0x3);
        if (arg8 != -10) {
            method2595(-96, 50, (byte) 34, -4, (byte[]) null, (byte[]) null, 11, -63, -78);
        }
        for (int var11 = -arg7; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg4++;
                arg0[var10001] = (byte) (arg0[var10001] - arg3[arg1++]);
                int var14 = arg4++;
                arg0[var14] = (byte) (arg0[var14] - arg3[arg1++]);
                int var15 = arg4++;
                arg0[var15] = (byte) (arg0[var15] - arg3[arg1++]);
                int var16 = arg4++;
                arg0[var16] = (byte) (arg0[var16] - arg3[arg1++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg4++;
                arg0[var10001] = (byte) (arg0[var10001] - arg3[arg1++]);
            }
            arg4 += arg5;
            arg1 += arg6;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIIII)V")
    private final void method2601(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field5828 == null) {
            return;
        }
        int var6 = arg3 - 1 >> 7;
        int var7 = arg3 + arg0 - 1 - 1 >> 7;
        int var8 = arg1 - 1 >> 7;
        int var9 = 30 % ((arg4 - 28) / 58);
        int var10 = arg2 + arg1 - 1 - 1 >> 7;
        for (int var11 = var6; var11 <= var7; var11++) {
            class207[] var12 = this.field5828[var11];
            for (int var13 = var8; var13 <= var10; var13++) {
                var12[var13].field2916 = true;
            }
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)V")
    public final void method2602(byte arg0) {
        this.field5828 = new class207[this.field5834][this.field5831];
        for (int var2 = 0; var2 < this.field5831; var2++) {
            for (int var3 = 0; var3 < this.field5834; var3++) {
                this.field5828[var3][var2] = new class207(this.field5829, this, this.field5833, var3, var2, this.field5835, var3 * 128 + 1, var2 * 128 + 1);
            }
        }
        int var4 = 91 % ((arg0 + 21) / 53);
    }

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lmm;Leb;)V")
    public class421(class357 arg0, class384 arg1) {
        this.field5829 = arg0;
        this.field5833 = arg1;
        this.field5832 = (this.field5833.field5285 * this.field5833.field4384 >> this.field5829.field4806) + 2;
        this.field5836 = (this.field5833.field5285 * this.field5833.field4382 >> this.field5829.field4806) + 2;
        this.field5835 = this.field5829.field4806 + 7 - this.field5833.field5282;
        this.field5830 = new byte[this.field5836 * this.field5832];
        this.field5834 = this.field5833.field4384 >> this.field5835;
        this.field5831 = this.field5833.field4382 >> this.field5835;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIZII[[Z)V")
    public final void method2603(int arg0, int arg1, boolean arg2, int arg3, int arg4, boolean[][] arg5) {
        opengl var7 = this.field5829.field4794;
        this.field5829.method2153();
        this.field5829.method2198(false);
        this.field5829.method2174(false);
        if (arg4 != 5945) {
            this.method2601(-26, -45, -17, 3, -66);
        }
        this.field5829.method2169(-2);
        this.field5829.method2158(0);
        this.field5829.method2195(1);
        float var8 = 1.0F / (float) (this.field5829.field4811 * 128);
        if (arg2) {
            for (int var9 = 0; var9 < this.field5831; var9++) {
                int var10 = var9 << this.field5835;
                int var11 = var9 + 1 << this.field5835;
                label134: for (int var12 = 0; var12 < this.field5834; var12++) {
                    int var13 = var12 << this.field5835;
                    int var14 = var12 + 1 << this.field5835;
                    for (int var15 = var13; var15 < var14; var15++) {
                        if (-arg0 <= var15 - arg1 && arg0 >= var15 - arg1) {
                            for (int var16 = var10; var16 < var11; var16++) {
                                if ((-arg0) <= (var16 - arg3) && var16 - arg3 <= arg0 && arg5[var15 + arg0 - arg1][var16 + arg0 - arg3]) {
                                    var7.glMatrixMode(5890);
                                    var7.glLoadIdentity();
                                    var7.glScalef(var8, var8, 1.0F);
                                    var7.glTranslatef((float) (-var12) / var8, (float) (-var9) / var8, 1.0F);
                                    var7.glMatrixMode(5888);
                                    this.field5828[var12][var9].method1400((byte) -38);
                                    continue label134;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var17 = 0; var17 < this.field5831; var17++) {
                int var18 = var17 << this.field5835;
                int var19 = var17 + 1 << this.field5835;
                for (int var20 = 0; var20 < this.field5834; var20++) {
                    int var21 = 0;
                    int var22 = var20 << this.field5835;
                    int var23 = var20 + 1 << this.field5835;
                    class366 var24 = class384.field5279;
                    var24.field5048 = 0;
                    for (int var25 = var18; var25 < var19; var25++) {
                        if (var25 - arg3 >= -arg0 && var25 - arg3 <= arg0) {
                            int var26 = this.field5833.field4384 * var25 + var22;
                            for (int var27 = var22; var27 < var23; var27++) {
                                if (-arg0 <= var27 - arg1 && (var27 - arg1) <= arg0 && arg5[var27 + arg0 - arg1][var25 - (arg3 - arg0)]) {
                                    short[] var28 = this.field5833.field5281[var26];
                                    if (var28 != null) {
                                        if (this.field5829.field4829) {
                                            for (int var29 = 0; var29 < var28.length; var29++) {
                                                var21++;
                                                var24.method2275(arg4 ^ 0x172D, var28[var29] & 0xFFFF);
                                            }
                                        } else {
                                            for (int var30 = 0; var30 < var28.length; var30++) {
                                                var24.method2271(-125, var28[var30] & 0xFFFF);
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
                        this.field5828[var20][var17].method1399(0, var21, var24.field5076, 5123);
                    }
                }
            }
        }
        var7.glMatrixMode(5890);
        var7.glLoadIdentity();
        var7.glMatrixMode(5888);
    }
}
