import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class682 {

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "Lpc;")
    private class700 field9340;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "Lcea;")
    private class227 field9334;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
    public int field9323;

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "I")
    private int field9339;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    private int field9324;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "[B")
    public byte[] field9326;

    @OriginalMember(owner = "client!mj", name = "s", descriptor = "I")
    private int field9341;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
    private int field9328;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "Lhj;")
    public static class596 field9331 = new class596(101, -1);

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "[I")
    public static int[] field9338 = new int[6];

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
    public static int field9325;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "I")
    public static int field9327;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "I")
    public static int field9329;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
    public static int field9330;

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "I")
    public static int field9333;

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "I")
    public static int field9335;

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "I")
    public static int field9336;

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "I")
    public static int field9337;

    @OriginalMember(owner = "client!mj", name = "t", descriptor = "I")
    public static int field9342;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "[[Lek;")
    private class534[][] field9332;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BILr;I)V")
    public final void method3826(byte arg0, int arg1, class196 arg2, int arg3) {
        field9335++;
        class709 var5 = (class709) arg2;
        int var6 = var5.field9960 + arg3 + 1;
        int var7 = var5.field9959 + arg1 + 1;
        int var8 = var6 + (this.field9323 * var7);
        int var9 = 0;
        int var10 = var5.field9952;
        int var11 = var5.field9957;
        int var12 = this.field9323 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var8 += this.field9323 * var13;
            var9 += var11 * var13;
            var7 = 1;
            var10 -= var13;
        }
        int var14 = 0;
        if (arg0 != -12) {
            method3827(77, null, -128, 122, 72, (byte) 31, 27, -116);
        }
        if (var7 + var10 >= this.field9339) {
            int var15 = var7 + var10 + 1 - this.field9339;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var9 += var16;
            var12 += var16;
            var14 += var16;
            var8 += var16;
            var11 -= var16;
            var6 = 1;
        }
        if ((var6 + var11) >= this.field9323) {
            int var17 = var6 + var11 + 1 - this.field9323;
            var14 += var17;
            var12 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            class103.method854(var12, var5.field9958, false, var11, var14, this.field9326, var10, var8, var9);
            this.method3832(101, var10, var6, var11, var7);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILjava/lang/String;IIIBII)V")
    public static final void method3827(int arg0, String arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field9336++;
        class707 var8 = new class707();
        if (arg5 != -95) {
            field9331 = null;
        }
        var8.field9931 = arg0;
        var8.field9938 = arg6;
        var8.field9934 = arg7;
        var8.field9928 = arg1;
        var8.field9925 = class228.field2707 + arg3;
        var8.field9937 = arg4;
        var8.field9929 = arg2;
        class196.field2343.method2444(11586, var8);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIII[[ZZ)V")
    public final void method3828(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4, boolean arg5) {
        if (arg0 < 108) {
            return;
        }
        field9333++;
        this.field9340.method3892(false, 1);
        this.field9340.method3908(false, (byte) 122);
        this.field9340.method3901(-2, false);
        this.field9340.method3932(1, (byte) -97);
        this.field9340.method3888((byte) 93, 1);
        float var7 = 1.0F / (float) (this.field9340.field9724 * 128);
        if (arg5) {
            for (int var22 = 0; var22 < this.field9328; var22++) {
                int var23 = var22 << this.field9324;
                int var24 = var22 + 1 << this.field9324;
                label88: for (int var25 = 0; var25 < this.field9341; var25++) {
                    int var26 = var25 << this.field9324;
                    int var27 = var25 + 1 << this.field9324;
                    for (int var28 = var26; var28 < var27; var28++) {
                        if (var28 - arg3 >= -arg2 && arg2 >= var28 - arg3) {
                            for (int var29 = var23; var29 < var24; var29++) {
                                if (var29 - arg1 >= -arg2 && (var29 - arg1) <= arg2 && arg4[var28 + arg2 - arg3][arg2 + var29 - arg1]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var25) / var7, (float) (-var22) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field9332[var25][var22].method3175(0);
                                    continue label88;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field9328; var8++) {
                int var9 = var8 << this.field9324;
                int var10 = var8 + 1 << this.field9324;
                for (int var11 = 0; var11 < this.field9341; var11++) {
                    int var12 = 0;
                    int var13 = var11 << this.field9324;
                    int var14 = var11 + 1 << this.field9324;
                    class283 var15 = this.field9340.field9779;
                    var15.field5262 = 0;
                    for (int var16 = var9; var16 < var10; var16++) {
                        if (-arg2 <= var16 - arg1 && (var16 - arg1) <= arg2) {
                            int var17 = this.field9334.field3533 * var16 + var13;
                            for (int var18 = var13; var18 < var14; var18++) {
                                if (-arg2 <= var18 - arg3 && var18 - arg3 <= arg2 && arg4[var18 + arg2 - arg3][arg2 + var16 - arg1]) {
                                    short[] var19 = this.field9334.field2643[var17];
                                    if (var19 != null) {
                                        if (this.field9340.field9772) {
                                            for (int var20 = 0; var20 < var19.length; var20++) {
                                                var12++;
                                                var15.method2369(-18090, var19[var20] & 0xFFFF);
                                            }
                                        } else {
                                            for (int var21 = 0; var21 < var19.length; var21++) {
                                                var12++;
                                                var15.method2379(var19[var21] & 0xFFFF, -12098);
                                            }
                                        }
                                    }
                                }
                                var17++;
                            }
                        }
                    }
                    if (var12 > 0) {
                        OpenGL.glMatrixMode(5890);
                        OpenGL.glLoadIdentity();
                        OpenGL.glScalef(var7, var7, 1.0F);
                        OpenGL.glTranslatef((float) (-var11) / var7, (float) (-var8) / var7, 1.0F);
                        OpenGL.glMatrixMode(5888);
                        this.field9332[var11][var8].method3178((byte) 7, var12, var15.field5275, 5123);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V")
    public final void method3829(byte arg0) {
        this.field9332 = new class534[this.field9341][this.field9328];
        field9330++;
        int var2 = 0;
        if (arg0 >= -111) {
            return;
        }
        while (this.field9328 > var2) {
            for (int var3 = 0; var3 < this.field9341; var3++) {
                this.field9332[var3][var2] = new class534(this.field9340, this, this.field9334, var3, var2, this.field9324, var3 * 128 + 1, var2 * 128 + 1);
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZJ)I")
    public static final int method3830(boolean arg0, long arg1) {
        if (arg0) {
            method3831(-83);
        }
        class200.method1297(-30414, arg1);
        field9337++;
        return class532.field7493.get(1);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V")
    public static void method3831(int arg0) {
        field9338 = null;
        field9331 = null;
        if (arg0 != 5888) {
            field9338 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIII)V")
    private final void method3832(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field9325++;
        if (this.field9332 == null) {
            return;
        }
        int var6 = arg2 - 1 >> 7;
        if (arg0 <= 97) {
            this.field9332 = null;
        }
        int var7 = arg2 + arg3 - 2 >> 7;
        int var8 = arg4 - 1 >> 7;
        int var9 = arg1 + arg4 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class534[] var11 = this.field9332[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field7525 = true;
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IILr;Z)Z")
    public final boolean method3833(int arg0, int arg1, class196 arg2, boolean arg3) {
        field9342++;
        class709 var5 = (class709) arg2;
        int var6 = var5.field9960 + arg1 + 1;
        int var7 = var5.field9959 + arg0 + 1;
        int var8 = this.field9323 * var7 + var6;
        int var9 = var5.field9952;
        int var10 = var5.field9957;
        if (var7 <= 0) {
            int var11 = 1 - var7;
            var7 = 1;
            var8 += this.field9323 * var11;
            var9 -= var11;
        }
        int var12 = this.field9323 - var10;
        if (!arg3) {
            this.method3828(122, 93, 33, -122, null, true);
        }
        if (this.field9339 <= var7 + var9) {
            int var13 = var7 - (-var9 - 1) - this.field9339;
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var12 += var14;
            var10 -= var14;
            var8 += var14;
            var6 = 1;
        }
        if (this.field9323 <= var6 + var10) {
            int var15 = var6 + var10 + 1 - this.field9323;
            var10 -= var15;
            var12 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field9323 + var12;
            return class219.method1356(var16, this.field9326, 0, var17, var10, var8, var9);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)I")
    public static final int method3834(int arg0, int arg1, int arg2) {
        field9329++;
        if (arg1 != 3) {
            method3834(-18, -71, -104);
        }
        return arg0 == 1 || arg0 == 3 ? class259.field3069[arg2 & 0x3] : class322.field3996[arg2 & 0x3];
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILr;II)V")
    public final void method3835(int arg0, class196 arg1, int arg2, int arg3) {
        field9327++;
        class709 var5 = (class709) arg1;
        int var6 = var5.field9959 + arg0 + arg3;
        int var7 = var5.field9960 + arg2 + 1;
        int var8 = var7 + (this.field9323 * var6);
        int var9 = 0;
        int var10 = var5.field9952;
        int var11 = var5.field9957;
        int var12 = this.field9323 - var11;
        int var13 = 0;
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var10 -= var14;
            var6 = 1;
            var9 += var11 * var14;
            var8 += this.field9323 * var14;
        }
        if ((var6 + var10) >= this.field9339) {
            int var15 = var10 + var6 + 1 - this.field9339;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var11 -= var16;
            var13 += var16;
            var8 += var16;
            var7 = 1;
            var12 += var16;
            var9 += var16;
        }
        if (this.field9323 <= (var7 + var11)) {
            int var17 = var7 + var11 + 1 - this.field9323;
            var13 += var17;
            var11 -= var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class116.method908(var9, this.field9326, false, var8, var10, var11, var12, var5.field9958, var13);
            this.method3832(110, var10, var7, var11, var6);
        }
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Lpc;Lcea;)V")
    public class682(class700 arg0, class227 arg1) {
        this.field9340 = arg0;
        this.field9334 = arg1;
        this.field9323 = (this.field9334.field3533 * this.field9334.field3525 >> this.field9340.field9727) + 2;
        this.field9339 = (this.field9334.field3525 * this.field9334.field3524 >> this.field9340.field9727) + 2;
        this.field9324 = this.field9340.field9727 + 7 - this.field9334.field3530;
        this.field9326 = new byte[this.field9339 * this.field9323];
        this.field9341 = this.field9334.field3533 >> this.field9324;
        this.field9328 = this.field9334.field3524 >> this.field9324;
    }
}
