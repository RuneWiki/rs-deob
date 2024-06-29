import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class509 {

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "Lwv;")
    private class26 field7406;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "Lda;")
    private class44 field7404;

    @OriginalMember(owner = "client!dr", name = "i", descriptor = "I")
    public int field7412;

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "I")
    private int field7408;

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "[B")
    public byte[] field7405;

    @OriginalMember(owner = "client!dr", name = "o", descriptor = "I")
    private int field7418;

    @OriginalMember(owner = "client!dr", name = "f", descriptor = "I")
    private int field7409;

    @OriginalMember(owner = "client!dr", name = "j", descriptor = "I")
    private int field7413;

    @OriginalMember(owner = "client!dr", name = "m", descriptor = "Lbj;")
    public static class162 field7416 = new class162(9, -1);

    @OriginalMember(owner = "client!dr", name = "t", descriptor = "I")
    public static int field7423 = 0;

    @OriginalMember(owner = "client!dr", name = "s", descriptor = "I")
    public static int field7422 = 0;

    @OriginalMember(owner = "client!dr", name = "u", descriptor = "Lbj;")
    public static class162 field7424 = new class162(56, 2);

    @OriginalMember(owner = "client!dr", name = "w", descriptor = "Lbj;")
    public static class162 field7426 = new class162(49, 7);

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "I")
    public static int field7407;

    @OriginalMember(owner = "client!dr", name = "g", descriptor = "I")
    public static int field7410;

    @OriginalMember(owner = "client!dr", name = "h", descriptor = "I")
    public static int field7411;

    @OriginalMember(owner = "client!dr", name = "k", descriptor = "I")
    public static int field7414;

    @OriginalMember(owner = "client!dr", name = "l", descriptor = "I")
    public static int field7415;

    @OriginalMember(owner = "client!dr", name = "n", descriptor = "I")
    public static int field7417;

    @OriginalMember(owner = "client!dr", name = "q", descriptor = "I")
    public static int field7420;

    @OriginalMember(owner = "client!dr", name = "r", descriptor = "I")
    public static int field7421;

    @OriginalMember(owner = "client!dr", name = "x", descriptor = "I")
    public static int field7427;

    @OriginalMember(owner = "client!dr", name = "y", descriptor = "I")
    public static int field7428;

    @OriginalMember(owner = "client!dr", name = "v", descriptor = "[Ljava/lang/String;")
    public static String[] field7425;

    @OriginalMember(owner = "client!dr", name = "p", descriptor = "[[Lrg;")
    private class458[][] field7419;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IZ[[ZBII)V", line = 5)
    public final void method3046(int arg0, boolean arg1, boolean[][] arg2, byte arg3, int arg4, int arg5) {
        field7415++;
        this.field7404.method386(false, -8);
        this.field7404.method447((byte) 46, false);
        this.field7404.method430(-2, (byte) -84);
        this.field7404.method288((byte) -101, 1);
        this.field7404.method340((byte) 111, 1);
        float var7 = 1.0F / (float) (this.field7404.field804 * 128);
        if (arg3 != 27) {
            field7416 = null;
        }
        if (arg1) {
            for (int var22 = 0; var22 < this.field7413; var22++) {
                int var23 = var22 << this.field7418;
                int var24 = var22 + 1 << this.field7418;
                label88: for (int var25 = 0; var25 < this.field7409; var25++) {
                    int var26 = var25 << this.field7418;
                    int var27 = var25 + 1 << this.field7418;
                    for (int var28 = var26; var28 < var27; var28++) {
                        if (var28 - arg0 >= -arg4 && arg4 >= var28 - arg0) {
                            for (int var29 = var23; var29 < var24; var29++) {
                                if (var29 - arg5 >= -arg4 && (var29 - arg5) <= arg4 && arg2[arg4 + var28 - arg0][var29 - (arg5 - arg4)]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var25) / var7, (float) (-var22) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field7419[var25][var22].method2726(false);
                                    continue label88;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field7413; var8++) {
                int var9 = var8 << this.field7418;
                int var10 = var8 + 1 << this.field7418;
                for (int var11 = 0; var11 < this.field7409; var11++) {
                    int var12 = 0;
                    int var13 = var11 << this.field7418;
                    int var14 = var11 + 1 << this.field7418;
                    class364 var15 = this.field7404.field934;
                    var15.field4399 = 0;
                    for (int var16 = var9; var16 < var10; var16++) {
                        if (-arg4 <= var16 - arg5 && (var16 - arg5) <= arg4) {
                            int var17 = this.field7406.field551 * var16 + var13;
                            for (int var18 = var13; var18 < var14; var18++) {
                                if ((-arg4) <= (var18 - arg0) && (var18 - arg0) <= arg4 && arg2[arg4 + var18 - arg0][var16 + arg4 - arg5]) {
                                    short[] var19 = this.field7406.field395[var17];
                                    if (var19 != null) {
                                        if (this.field7404.field924) {
                                            for (int var20 = 0; var20 < var19.length; var20++) {
                                                var15.method1865(var19[var20] & 0xFFFF, 812856296);
                                                var12++;
                                            }
                                        } else {
                                            for (int var21 = 0; var21 < var19.length; var21++) {
                                                var15.method1852(-119, var19[var21] & 0xFFFF);
                                                var12++;
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
                        this.field7419[var11][var8].method2728(5123, (byte) 60, var12, var15.field4408);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(BII)V", line = 191)
    public static final void method3047(byte arg0, int arg1, int arg2) {
        field7411++;
        if (arg0 < 69) {
            method3053(-87, -72);
        }
        class18 var3 = class140.method1047(7, arg2, false);
        var3.method122(true);
        var3.field283 = arg1;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(II)I", line = 209)
    public static int method3048(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Z)V", line = 216)
    public final void method3049(boolean arg0) {
        if (!arg0) {
            this.method3049(false);
        }
        this.field7419 = new class458[this.field7409][this.field7413];
        field7407++;
        for (int var2 = 0; var2 < this.field7413; var2++) {
            for (int var3 = 0; var3 < this.field7409; var3++) {
                this.field7419[var3][var2] = new class458(this.field7404, this, this.field7406, var3, var2, this.field7418, var3 * 128 + 1, var2 * 128 - -1);
            }
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IILi;B)Z", line = 246)
    public final boolean method3050(int arg0, int arg1, class31 arg2, byte arg3) {
        field7414++;
        class134 var5 = (class134) arg2;
        int var6 = var5.field2242 + arg0 + 1;
        int var7 = var5.field2244 + arg1 + 1;
        int var8 = this.field7412 * var7 + var6;
        int var9 = var5.field2252;
        int var10 = var5.field2251;
        int var11 = this.field7412 - var10;
        if (var7 <= 0) {
            int var12 = 1 - var7;
            var9 -= var12;
            var7 = 1;
            var8 += this.field7412 * var12;
        }
        if (arg3 >= -59) {
            field7424 = null;
        }
        if (var7 + var9 >= this.field7408) {
            int var13 = var7 + var9 + 1 - this.field7408;
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var10 -= var14;
            var8 += var14;
            var6 = 1;
            var11 += var14;
        }
        if (this.field7412 <= (var6 + var10)) {
            int var15 = var6 + var10 + 1 - this.field7412;
            var11 += var15;
            var10 -= var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field7412 + var11;
            return class506.method3036(var16, 21723, var9, var17, var8, var10, this.field7405);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Li;III)V", line = 321)
    public final void method3051(class31 arg0, int arg1, int arg2, int arg3) {
        field7417++;
        class134 var5 = (class134) arg0;
        int var6 = var5.field2244 + arg1 + 1;
        int var7 = var5.field2242 + arg3 + 1;
        int var8 = this.field7412 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field2252;
        if (arg2 != -27641) {
            return;
        }
        int var11 = var5.field2251;
        int var12 = this.field7412 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var10 -= var13;
            var9 += var11 * var13;
            var8 += this.field7412 * var13;
            var6 = 1;
        }
        int var14 = 0;
        if (var6 + var10 >= this.field7408) {
            int var15 = var10 + var6 + 1 - this.field7408;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var11 -= var16;
            var9 += var16;
            var14 += var16;
            var8 += var16;
            var7 = 1;
            var12 += var16;
        }
        if ((var7 + var11) >= this.field7412) {
            int var17 = var7 + var11 - (this.field7412 - 1);
            var14 += var17;
            var12 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            class276.method1745(var10, arg2 ^ 0x17BF, var11, var5.field2243, this.field7405, var14, var9, var8, var12);
            this.method3055(var11, -2532, var6, var7, var10);
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)V", line = 396)
    public static void method3052(int arg0) {
        field7424 = null;
        if (arg0 == 1) {
            field7425 = null;
            field7416 = null;
            field7426 = null;
        }
    }

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(II)V", line = 416)
    public static final void method3053(int arg0, int arg1) {
        class457.field6775 = arg0;
        field7420++;
        class322.field4926 = -1;
        class322.field4926 = arg1;
        class191.method1295(1130);
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILi;II)V", line = 427)
    public final void method3054(int arg0, class31 arg1, int arg2, int arg3) {
        field7421++;
        class134 var5 = (class134) arg1;
        int var6 = var5.field2244 + arg3 + 1;
        int var7 = var5.field2242 + arg2 + 1;
        int var8 = this.field7412 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field2252;
        int var11 = var5.field2251;
        int var12 = this.field7412 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var10 -= var13;
            var6 = 1;
            var9 += var11 * var13;
            var8 += this.field7412 * var13;
        }
        int var14 = 0;
        if ((var6 + var10) >= this.field7408) {
            int var15 = var10 + var6 + 1 - this.field7408;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var7 = 1;
            var14 += var16;
            var9 += var16;
            var11 -= var16;
            var8 += var16;
            var12 += var16;
        }
        if (var7 + var11 >= this.field7412) {
            int var17 = var11 + var7 + 1 - this.field7412;
            var12 += var17;
            var14 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0 && arg0 == -26970) {
            class123.method984(var12, var9, var10, var14, (byte) 68, var11, var8, this.field7405, var5.field2243);
            this.method3055(var11, -2532, var6, var7, var10);
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIII)V", line = 498)
    private final void method3055(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7410++;
        if (this.field7419 == null) {
            return;
        }
        int var6 = arg3 - 1 >> 7;
        if (arg1 != -2532) {
            field7423 = 42;
        }
        int var7 = arg3 + arg0 - 1 - 1 >> 7;
        int var8 = arg2 - 1 >> 7;
        int var9 = arg2 + arg4 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class458[] var11 = this.field7419[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field6781 = true;
            }
        }
    }

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Lda;Lwv;)V", line = 537)
    public class509(class44 arg0, class26 arg1) {
        this.field7406 = arg1;
        this.field7404 = arg0;
        this.field7412 = (this.field7406.field552 * this.field7406.field551 >> this.field7404.field807) + 2;
        this.field7408 = (this.field7406.field554 * this.field7406.field552 >> this.field7404.field807) + 2;
        this.field7405 = new byte[this.field7412 * this.field7408];
        this.field7418 = this.field7404.field807 + 7 - this.field7406.field558;
        this.field7409 = this.field7406.field551 >> this.field7418;
        this.field7413 = this.field7406.field554 >> this.field7418;
    }
}
