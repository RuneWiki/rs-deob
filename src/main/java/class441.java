import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class441 {

    @OriginalMember(owner = "client!up", name = "e", descriptor = "Lms;")
    private class448 field6446;

    @OriginalMember(owner = "client!up", name = "g", descriptor = "Lih;")
    private class330 field6448;

    @OriginalMember(owner = "client!up", name = "i", descriptor = "I")
    public int field6450;

    @OriginalMember(owner = "client!up", name = "c", descriptor = "I")
    private int field6444;

    @OriginalMember(owner = "client!up", name = "f", descriptor = "I")
    private int field6447;

    @OriginalMember(owner = "client!up", name = "d", descriptor = "[B")
    public byte[] field6445;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "I")
    private int field6442;

    @OriginalMember(owner = "client!up", name = "h", descriptor = "I")
    private int field6449;

    @OriginalMember(owner = "client!up", name = "b", descriptor = "[[Lin;")
    private class181[][] field6443;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "([B[BBIIIIII)V")
    private static final void method2781(byte[] arg0, byte[] arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -(arg7 >> 2);
        int var10 = -(arg7 & 0x3);
        for (int var11 = -arg3; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg4++;
                arg0[var10001] = (byte) (arg0[var10001] - arg1[arg6++]);
                int var14 = arg4++;
                arg0[var14] = (byte) (arg0[var14] - arg1[arg6++]);
                int var15 = arg4++;
                arg0[var15] = (byte) (arg0[var15] - arg1[arg6++]);
                int var16 = arg4++;
                arg0[var16] = (byte) (arg0[var16] - arg1[arg6++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg4++;
                arg0[var10001] = (byte) (arg0[var10001] - arg1[arg6++]);
            }
            arg4 += arg8;
            arg6 += arg5;
        }
        if (arg2 < 39) {
            method2789(13, -86, -48, -88, (byte[]) null, -83, 115);
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(ILoc;II)V")
    public final void method2782(int arg0, class93 arg1, int arg2, int arg3) {
        class267 var5 = (class267) arg1;
        int var6 = var5.field3924 + arg0 + 1;
        int var7 = var5.field3925 + arg3 + 1;
        int var8 = this.field6450 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field3922;
        int var11 = var5.field3926;
        int var12 = this.field6450 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var10 -= var13;
            var8 += this.field6450 * var13;
            var7 = 1;
            var9 += var11 * var13;
        }
        int var14 = 0;
        if ((var7 + var10) >= this.field6444) {
            int var15 = var7 - (this.field6444 - var10 - 1);
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var9 += var16;
            var11 -= var16;
            var12 += var16;
            var14 += var16;
            var8 += var16;
            var6 = 1;
        }
        if (var6 + var11 >= this.field6450) {
            int var17 = var6 + var11 + 1 - this.field6450;
            var12 += var17;
            var11 -= var17;
            var14 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            method2781(this.field6445, var5.field3923, (byte) 41, var10, var8, var14, var9, var11, var12);
            this.method2786(arg2, var7, var11, var10, var6);
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IIILoc;)Z")
    public final boolean method2783(int arg0, int arg1, int arg2, class93 arg3) {
        class267 var5 = (class267) arg3;
        int var6 = var5.field3925 + arg2 + 1;
        int var7 = var5.field3924 + arg0 - arg1;
        int var8 = var7 + (this.field6450 * var6);
        int var9 = var5.field3922;
        int var10 = var5.field3926;
        if (var6 <= 0) {
            int var11 = 1 - var6;
            var9 -= var11;
            var6 = 1;
            var8 += this.field6450 * var11;
        }
        int var12 = this.field6450 - var10;
        if (var6 + var9 >= this.field6444) {
            int var13 = var6 + var9 + 1 - this.field6444;
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var12 += var14;
            var8 += var14;
            var7 = 1;
            var10 -= var14;
        }
        if (var7 + var10 >= this.field6450) {
            int var15 = var7 + var10 + 1 - this.field6450;
            var10 -= var15;
            var12 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field6450 + var12;
            return method2789(var10, var8, arg1 ^ 0xFFFFFF99, var16, this.field6445, var9, var17);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "([BIZI[BIIII)V")
    private static final void method2784(byte[] arg0, int arg1, boolean arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -(arg8 >> 2);
        int var10 = -(arg8 & 0x3);
        int var11 = -arg7;
        if (!arg2) {
            method2789(-115, -3, 74, 104, (byte[]) null, -79, -54);
        }
        while (var11 < 0) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg3++;
                arg0[var10001] += arg4[arg6++];
                int var14 = arg3++;
                arg0[var14] += arg4[arg6++];
                int var15 = arg3++;
                arg0[var15] += arg4[arg6++];
                int var16 = arg3++;
                arg0[var16] += arg4[arg6++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg3++;
                arg0[var10001] += arg4[arg6++];
            }
            arg6 += arg1;
            arg3 += arg5;
            var11++;
        }
    }

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(ILoc;II)V")
    public final void method2785(int arg0, class93 arg1, int arg2, int arg3) {
        class267 var5 = (class267) arg1;
        int var6 = var5.field3924 + arg0 + 1;
        int var7 = var5.field3925 + arg3 + 1;
        int var8 = this.field6450 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field3922;
        int var11 = var5.field3926;
        int var12 = this.field6450 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var8 += this.field6450 * var13;
            var7 = 1;
            var10 -= var13;
            var9 += var11 * var13;
        }
        int var14 = 0;
        if ((var7 + var10) >= this.field6444) {
            int var15 = var7 + var10 + 1 - this.field6444;
            var10 -= var15;
        }
        if (arg2 <= ~var6) {
            int var16 = 1 - var6;
            var6 = 1;
            var11 -= var16;
            var14 += var16;
            var12 += var16;
            var8 += var16;
            var9 += var16;
        }
        if (this.field6450 <= var6 + var11) {
            int var17 = var6 + var11 + 1 - this.field6450;
            var14 += var17;
            var11 -= var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            method2784(this.field6445, var14, true, var8, var5.field3923, var12, var9, var10, var11);
            this.method2786(arg2 ^ 0x0, var7, var11, var10, var6);
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IIIII)V")
    private final void method2786(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field6443 == null) {
            return;
        }
        int var6 = arg0 + arg4 >> 7;
        int var7 = arg4 + arg2 - 1 - 1 >> 7;
        int var8 = arg1 - 1 >> 7;
        int var9 = arg1 + arg3 - 2 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class181[] var11 = this.field6443[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field2425 = true;
            }
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IIIZ[[ZI)V")
    public final void method2787(int arg0, int arg1, int arg2, boolean arg3, boolean[][] arg4, int arg5) {
        opengl var7 = this.field6448.field4741;
        this.field6448.method2187();
        this.field6448.method2134(false);
        this.field6448.method2184(false);
        this.field6448.method2127(-2);
        this.field6448.method2171(0);
        this.field6448.method2044(1);
        float var8 = 1.0F / (float) (this.field6448.field4751 * 128);
        if (arg3) {
            for (int var22 = 0; var22 < this.field6449; var22++) {
                int var23 = var22 << this.field6447;
                int var24 = var22 + 1 << this.field6447;
                label83: for (int var25 = 0; var25 < this.field6442; var25++) {
                    int var26 = var25 << this.field6447;
                    int var27 = var25 + 1 << this.field6447;
                    for (int var28 = var26; var28 < var27; var28++) {
                        if ((-arg0) <= (var28 - arg2) && (var28 - arg2) <= arg0) {
                            for (int var29 = var23; var29 < var24; var29++) {
                                if (var29 - arg5 >= -arg0 && var29 - arg5 <= arg0 && arg4[arg0 + var28 - arg2][arg0 + var29 - arg5]) {
                                    var7.glMatrixMode(5890);
                                    var7.glLoadIdentity();
                                    var7.glScalef(var8, var8, 1.0F);
                                    var7.glTranslatef((float) (-var25) / var8, (float) (-var22) / var8, 1.0F);
                                    var7.glMatrixMode(5888);
                                    this.field6443[var25][var22].method1124(true);
                                    continue label83;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var9 = 0; var9 < this.field6449; var9++) {
                int var10 = var9 << this.field6447;
                int var11 = var9 + 1 << this.field6447;
                for (int var12 = 0; var12 < this.field6442; var12++) {
                    int var13 = 0;
                    int var14 = var12 << this.field6447;
                    class448.field6524.field3915 = 0;
                    int var15 = var12 + 1 << this.field6447;
                    for (int var16 = var10; var16 < var11; var16++) {
                        if (var16 - arg5 >= -arg0 && arg0 >= (var16 - arg5)) {
                            int var17 = this.field6446.field4978 * var16 + var14;
                            for (int var18 = var14; var18 < var15; var18++) {
                                if (var18 - arg2 >= -arg0 && arg0 >= (var18 - arg2) && arg4[var18 + arg0 - arg2][var16 + arg0 - arg5]) {
                                    short[] var19 = this.field6446.field6542[var17];
                                    if (var19 != null) {
                                        if (this.field6448.field4797) {
                                            for (int var20 = 0; var20 < var19.length; var20++) {
                                                class448.field6524.method1693(var19[var20], (byte) 108);
                                                var13++;
                                            }
                                        } else {
                                            for (int var21 = 0; var21 < var19.length; var21++) {
                                                var13++;
                                                class448.field6524.method1715(677910600, var19[var21]);
                                            }
                                        }
                                    }
                                }
                                var17++;
                            }
                        }
                    }
                    if (var13 > 0) {
                        var7.glMatrixMode(5890);
                        var7.glLoadIdentity();
                        var7.glScalef(var8, var8, 1.0F);
                        var7.glTranslatef((float) (-var12) / var8, (float) (-var9) / var8, 1.0F);
                        var7.glMatrixMode(5888);
                        this.field6448.field4867.method1354(5123, class448.field6524.field3879, var13 * 2);
                        this.field6443[var12][var9].method1125(var13, (byte) 51, this.field6448.field4867);
                    }
                }
            }
        }
        var7.glMatrixMode(5890);
        var7.glLoadIdentity();
        var7.glMatrixMode(arg1);
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(I)V")
    public final void method2788(int arg0) {
        this.field6443 = new class181[this.field6442][this.field6449];
        for (int var2 = 0; var2 < this.field6449; var2++) {
            for (int var3 = 0; var3 < this.field6442; var3++) {
                this.field6443[var3][var2] = new class181(this.field6448, this, this.field6446, var3, var2, this.field6447, var3 * 128 + 1, var2 * 128 + 1);
            }
        }
        if (arg0 != -17567) {
            this.method2782(35, (class93) null, -4, -95);
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IIII[BII)Z")
    private static final boolean method2789(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        int var7 = arg0 % arg3;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg3 - var7;
        }
        int var9 = -((arg3 + arg5 - 1) / arg3);
        int var10 = -((arg0 - (1 - arg3)) / arg3);
        int var11 = -92 % ((31 - arg2) / 57);
        for (int var12 = var9; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                if (arg4[arg1] == 0) {
                    return true;
                }
                arg1 += arg3;
            }
            int var14 = arg1 - var8;
            if (arg4[var14 - 1] == 0) {
                return true;
            }
            arg1 = arg6 + var14;
        }
        return false;
    }

    @OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Lih;Lms;)V")
    public class441(class330 arg0, class448 arg1) {
        this.field6446 = arg1;
        this.field6448 = arg0;
        this.field6450 = (this.field6446.field6533 * this.field6446.field4978 >> this.field6448.field4758) + 2;
        this.field6444 = (this.field6446.field6533 * this.field6446.field4970 >> this.field6448.field4758) + 2;
        this.field6447 = this.field6448.field4758 + 7 - this.field6446.field6522;
        this.field6445 = new byte[this.field6450 * this.field6444];
        this.field6442 = this.field6446.field4978 >> this.field6447;
        this.field6449 = this.field6446.field4970 >> this.field6447;
    }
}
