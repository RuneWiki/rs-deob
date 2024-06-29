import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class139 {

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "Lac;")
    private class541 field1788;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "Lok;")
    private class257 field1791;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    public int field1782;

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "I")
    private int field1794;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "I")
    private int field1790;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "[B")
    public byte[] field1793;

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "I")
    private int field1795;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    private int field1787;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "Lkba;")
    public static class108 field1783 = new class108();

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "Z")
    public static boolean field1786 = false;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "[[Ldf;")
    private class403[][] field1781;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZII[[ZBI)V", line = 6)
    public final void method857(boolean arg0, int arg1, int arg2, boolean[][] arg3, byte arg4, int arg5) {
        if (arg4 < 8) {
            return;
        }
        this.field1788.method2994(false, false);
        field1780++;
        this.field1788.method3018((byte) -127, false);
        this.field1788.method2977(104, -2);
        this.field1788.method3039(260, 1);
        this.field1788.method3013((byte) -93, 1);
        float var7 = 1.0F / (float) (this.field1788.field7529 * 128);
        if (arg0) {
            for (int var22 = 0; var22 < this.field1787; var22++) {
                int var23 = var22 << this.field1790;
                int var24 = var22 + 1 << this.field1790;
                label88: for (int var25 = 0; var25 < this.field1795; var25++) {
                    int var26 = var25 << this.field1790;
                    int var27 = var25 + 1 << this.field1790;
                    for (int var28 = var26; var28 < var27; var28++) {
                        if ((var28 - arg2) >= (-arg1) && arg1 >= (var28 - arg2)) {
                            for (int var29 = var23; var29 < var24; var29++) {
                                if ((var29 - arg5) >= (-arg1) && arg1 >= var29 - arg5 && arg3[arg1 + var28 - arg2][var29 + arg1 - arg5]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var25) / var7, (float) (-var22) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field1781[var25][var22].method2333(6401);
                                    continue label88;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field1787; var8++) {
                int var9 = var8 << this.field1790;
                int var10 = var8 + 1 << this.field1790;
                for (int var11 = 0; var11 < this.field1795; var11++) {
                    int var12 = 0;
                    int var13 = var11 << this.field1790;
                    int var14 = var11 + 1 << this.field1790;
                    class183 var15 = this.field1788.field7657;
                    var15.field8520 = 0;
                    for (int var16 = var9; var16 < var10; var16++) {
                        if ((var16 - arg5) >= (-arg1) && var16 - arg5 <= arg1) {
                            int var17 = this.field1791.field3727 * var16 + var13;
                            for (int var18 = var13; var18 < var14; var18++) {
                                if (-arg1 <= var18 - arg2 && (var18 - arg2) <= arg1 && arg3[arg1 + var18 - arg2][var16 + arg1 - arg5]) {
                                    short[] var19 = this.field1791.field3336[var17];
                                    if (var19 != null) {
                                        if (this.field1788.field7608) {
                                            for (int var21 = 0; var21 < var19.length; var21++) {
                                                var12++;
                                                var15.method3423(var19[var21] & 0xFFFF, 1571862888);
                                            }
                                        } else {
                                            for (int var20 = 0; var20 < var19.length; var20++) {
                                                var12++;
                                                var15.method3446(var19[var20] & 0xFFFF, 4);
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
                        this.field1781[var11][var8].method2334(var12, 0, 5123, var15.field8529);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V", line = 199)
    public final void method858(int arg0) {
        field1784++;
        this.field1781 = new class403[this.field1795][this.field1787];
        for (int var2 = 0; var2 < this.field1787; var2++) {
            for (int var3 = 0; var3 < this.field1795; var3++) {
                this.field1781[var3][var2] = new class403(this.field1788, this, this.field1791, var3, var2, this.field1790, var3 * 128 + 1, var2 * 128 - -1);
            }
        }
        if (arg0 < 103) {
            this.field1781 = null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIZLr;)V", line = 231)
    public final void method859(int arg0, int arg1, boolean arg2, class184 arg3) {
        field1785++;
        class322 var5 = (class322) arg3;
        int var6 = var5.field4327 + arg1 + 1;
        int var7 = var5.field4320 + arg0 + 1;
        int var8 = this.field1782 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field4329;
        int var11 = var5.field4326;
        int var12 = this.field1782 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var10 -= var14;
            var7 = 1;
            var8 += this.field1782 * var14;
            var9 += var11 * var14;
        }
        if (this.field1794 <= var7 + var10) {
            int var15 = var7 + var10 - (-1 - -this.field1794);
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var11 -= var16;
            var8 += var16;
            var13 += var16;
            var9 += var16;
            var6 = 1;
            var12 += var16;
        }
        if ((var6 + var11) >= this.field1782) {
            int var17 = var6 + var11 + 1 - this.field1782;
            var11 -= var17;
            var12 += var17;
            var13 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class631.method3550(var10, var8, var9, var5.field4328, this.field1793, -18305, var13, var12, var11);
            this.method863(var10, var11, var6, var7, arg2);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "([I[Ljava/lang/Object;III)V", line = 300)
    public static final void method860(int[] arg0, Object[] arg1, int arg2, int arg3, int arg4) {
        field1792++;
        if (arg2 != 0) {
            field1783 = null;
        }
        if (arg3 <= arg4) {
            return;
        }
        int var5 = (arg3 + arg4) / 2;
        int var6 = arg4;
        int var7 = arg0[var5];
        arg0[var5] = arg0[arg3];
        arg0[arg3] = var7;
        Object var8 = arg1[var5];
        arg1[var5] = arg1[arg3];
        arg1[arg3] = var8;
        int var9 = var7 == Integer.MAX_VALUE ? 0 : 1;
        for (int var10 = arg4; var10 < arg3; var10++) {
            if (arg0[var10] < (var9 & var10) + var7) {
                int var11 = arg0[var10];
                arg0[var10] = arg0[var6];
                arg0[var6] = var11;
                Object var12 = arg1[var10];
                arg1[var10] = arg1[var6];
                arg1[var6++] = var12;
            }
        }
        arg0[arg3] = arg0[var6];
        arg0[var6] = var7;
        arg1[arg3] = arg1[var6];
        arg1[var6] = var8;
        method860(arg0, arg1, arg2, var6 - 1, arg4);
        method860(arg0, arg1, 0, arg3, var6 + 1);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BIILr;)V", line = 362)
    public final void method861(byte arg0, int arg1, int arg2, class184 arg3) {
        if (arg0 <= 87) {
            field1786 = true;
        }
        field1797++;
        class322 var5 = (class322) arg3;
        int var6 = var5.field4327 + arg2 + 1;
        int var7 = var5.field4320 + arg1 + 1;
        int var8 = this.field1782 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field4329;
        int var11 = var5.field4326;
        int var12 = this.field1782 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var9 += var11 * var14;
            var7 = 1;
            var10 -= var14;
            var8 += this.field1782 * var14;
        }
        if ((var7 + var10) >= this.field1794) {
            int var15 = var10 + var7 + 1 - this.field1794;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var6 = 1;
            var13 += var16;
            var8 += var16;
            var11 -= var16;
            var9 += var16;
            var12 += var16;
        }
        if (this.field1782 <= var6 + var11) {
            int var17 = var6 + var11 - (this.field1782 - 1);
            var11 -= var17;
            var12 += var17;
            var13 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class556.method3151(var13, this.field1793, var10, var5.field4328, var9, var12, var8, var11, 0);
            this.method863(var10, var11, var6, var7, false);
        }
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lac;Lok;)V", line = 434)
    public class139(class541 arg0, class257 arg1) {
        this.field1788 = arg0;
        this.field1791 = arg1;
        this.field1782 = (this.field1791.field3730 * this.field1791.field3727 >> this.field1788.field7530) + 2;
        this.field1794 = (this.field1791.field3730 * this.field1791.field3728 >> this.field1788.field7530) + 2;
        this.field1790 = this.field1788.field7530 + 7 - this.field1791.field3722;
        this.field1793 = new byte[this.field1794 * this.field1782];
        this.field1795 = this.field1791.field3727 >> this.field1790;
        this.field1787 = this.field1791.field3728 >> this.field1790;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lr;III)Z", line = 450)
    public final boolean method862(class184 arg0, int arg1, int arg2, int arg3) {
        field1789++;
        class322 var5 = (class322) arg0;
        int var6 = var5.field4327 + arg2 + 1;
        int var7 = var5.field4320 + arg3 + 1;
        int var8 = this.field1782 * var7 + var6;
        int var9 = var5.field4329;
        int var10 = var5.field4326;
        int var11 = this.field1782 - var10;
        if (var7 <= 0) {
            int var12 = 1 - var7;
            var7 = 1;
            var8 += this.field1782 * var12;
            var9 -= var12;
        }
        if ((var7 + var9) >= this.field1794) {
            int var13 = var7 + var9 + 1 - this.field1794;
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var10 -= var14;
            var8 += var14;
            var11 += var14;
            var6 = 1;
        }
        if ((var6 + var10) >= this.field1782) {
            int var15 = var6 + var10 + 1 - this.field1782;
            var11 += var15;
            var10 -= var15;
        }
        if (var10 <= 0 || var9 <= 0) {
            return false;
        }
        byte var16 = 8;
        if (arg1 > -109) {
            this.field1791 = null;
        }
        int var17 = (var16 - 1) * this.field1782 + var11;
        return class707.method3978(var16, var8, 1, var17, var10, this.field1793, var9);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIZ)V", line = 523)
    private final void method863(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1796++;
        if (arg4 || this.field1781 == null) {
            return;
        }
        int var6 = arg2 - 1 >> 7;
        int var7 = arg1 + arg2 - 2 >> 7;
        int var8 = arg3 - 1 >> 7;
        int var9 = arg3 - (1 - arg0) - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class403[] var11 = this.field1781[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field5696 = true;
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V", line = 562)
    public static void method864(byte arg0) {
        field1783 = null;
        if (arg0 > -124) {
            field1786 = false;
        }
    }
}
