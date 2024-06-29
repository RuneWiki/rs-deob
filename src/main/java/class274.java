import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class274 {

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "Lmu;")
    private class304 field3811;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "Lrda;")
    private class663 field3809;

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "I")
    public int field3816;

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "I")
    private int field3819;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "[B")
    public byte[] field3818;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
    private int field3813;

    @OriginalMember(owner = "client!jl", name = "n", descriptor = "I")
    private int field3820;

    @OriginalMember(owner = "client!jl", name = "p", descriptor = "I")
    private int field3822;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
    public static int field3807 = 0;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!jl", name = "o", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!jl", name = "q", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "[[Lwga;")
    private class750[][] field3810;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lr;ZII)V", line = 3)
    public final void method1644(class184 arg0, boolean arg1, int arg2, int arg3) {
        field3815++;
        class330 var5 = (class330) arg0;
        int var6 = var5.field4709 + arg3 + 1;
        int var7 = var5.field4706 + arg2 + 1;
        int var8 = var6 + (this.field3816 * var7);
        int var9 = 0;
        int var10 = var5.field4703;
        int var11 = var5.field4708;
        int var12 = this.field3816 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var7 = 1;
            var10 -= var13;
            var9 += var11 * var13;
            var8 += this.field3816 * var13;
        }
        int var14 = 0;
        if (arg1) {
            this.method1648(3, null, 72, true, 119, 69);
        }
        if ((var7 + var10) >= this.field3819) {
            int var15 = var7 - (-var10 - (1 - this.field3819));
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var12 += var16;
            var9 += var16;
            var11 -= var16;
            var8 += var16;
            var14 += var16;
            var6 = 1;
        }
        if (this.field3816 <= (var6 + var11)) {
            int var17 = var6 + var11 + 1 - this.field3816;
            var11 -= var17;
            var14 += var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class505.method2838(var10, this.field3818, var5.field4705, var9, var14, 104, var8, var11, var12);
            this.method1649(var10, arg1, var11, var7, var6);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIILr;)Z", line = 74)
    public final boolean method1645(int arg0, int arg1, int arg2, class184 arg3) {
        field3821++;
        class330 var5 = (class330) arg3;
        if (arg1 != -26332) {
            this.method1647(74);
        }
        int var6 = var5.field4709 + arg0 + 1;
        int var7 = var5.field4706 + arg2 + 1;
        int var8 = this.field3816 * var7 + var6;
        int var9 = var5.field4703;
        int var10 = var5.field4708;
        if (var7 <= 0) {
            int var11 = 1 - var7;
            var9 -= var11;
            var7 = 1;
            var8 += this.field3816 * var11;
        }
        int var12 = this.field3816 - var10;
        if (this.field3819 <= var7 + var9) {
            int var13 = var7 + var9 + 1 - this.field3819;
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var6 = 1;
            var8 += var14;
            var10 -= var14;
            var12 += var14;
        }
        if (var6 + var10 >= this.field3816) {
            int var15 = var6 + var10 + 1 - this.field3816;
            var10 -= var15;
            var12 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field3816 + var12;
            return class507.method2848(119, var9, var16, var17, this.field3818, var8, var10);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lr;III)V", line = 158)
    public final void method1646(class184 arg0, int arg1, int arg2, int arg3) {
        field3808++;
        class330 var5 = (class330) arg0;
        int var6 = var5.field4706 + arg2 + arg3;
        int var7 = var5.field4709 + arg1 + 1;
        int var8 = var7 + (this.field3816 * var6);
        int var9 = 0;
        int var10 = var5.field4703;
        int var11 = var5.field4708;
        int var12 = this.field3816 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var10 -= var13;
            var6 = 1;
            var8 += this.field3816 * var13;
            var9 += var11 * var13;
        }
        int var14 = 0;
        if (this.field3819 <= var6 + var10) {
            int var15 = var6 + var10 + 1 - this.field3819;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var8 += var16;
            var12 += var16;
            var7 = 1;
            var9 += var16;
            var11 -= var16;
            var14 += var16;
        }
        if (this.field3816 <= var7 + var11) {
            int var17 = var7 + var11 + (1 - this.field3816);
            var12 += var17;
            var14 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            class237.method1495(var8, var5.field4705, var10, var9, var11, var12, (byte) -108, var14, this.field3818);
            this.method1649(var10, false, var11, var6, var7);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V", line = 228)
    public final void method1647(int arg0) {
        this.field3810 = new class750[this.field3820][this.field3822];
        field3817++;
        int var2 = 0;
        if (arg0 != 1) {
            this.method1648(-50, null, 122, false, 104, -36);
        }
        while (var2 < this.field3822) {
            for (int var3 = 0; var3 < this.field3820; var3++) {
                this.field3810[var3][var2] = new class750(this.field3809, this, this.field3811, var3, var2, this.field3813, var3 * 128 + 1, var2 * 128 + 1);
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I[[ZIZII)V", line = 256)
    public final void method1648(int arg0, boolean[][] arg1, int arg2, boolean arg3, int arg4, int arg5) {
        this.field3809.method3628(false, -109);
        field3823++;
        this.field3809.method3620(108, false);
        this.field3809.method3632(-2, (byte) -108);
        this.field3809.method3631((byte) 123, 1);
        this.field3809.method3635(arg0 + arg0, 1);
        float var7 = 1.0F / (float) (this.field3809.field8952 * 128);
        if (arg3) {
            for (int var22 = 0; var22 < this.field3822; var22++) {
                int var23 = var22 << this.field3813;
                int var24 = var22 + 1 << this.field3813;
                label85: for (int var25 = 0; var25 < this.field3820; var25++) {
                    int var26 = var25 << this.field3813;
                    int var27 = var25 + 1 << this.field3813;
                    for (int var28 = var26; var28 < var27; var28++) {
                        if ((var28 - arg5) >= (-arg2) && arg2 >= var28 - arg5) {
                            for (int var29 = var23; var29 < var24; var29++) {
                                if ((var29 - arg4) >= (-arg2) && (var29 - arg4) <= arg2 && arg1[var28 - (arg5 - arg2)][var29 + arg2 - arg4]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var25) / var7, (float) (-var22) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field3810[var25][var22].method4205((byte) 113);
                                    continue label85;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field3822; var8++) {
                int var9 = var8 << this.field3813;
                int var10 = var8 + 1 << this.field3813;
                for (int var11 = 0; var11 < this.field3820; var11++) {
                    int var12 = 0;
                    int var13 = var11 << this.field3813;
                    int var14 = var11 + 1 << this.field3813;
                    class451 var15 = this.field3809.field8994;
                    var15.field9419 = 0;
                    for (int var16 = var9; var16 < var10; var16++) {
                        if (var16 - arg4 >= -arg2 && (var16 - arg4) <= arg2) {
                            int var17 = this.field3811.field3992 * var16 + var13;
                            for (int var18 = var13; var18 < var14; var18++) {
                                if (-arg2 <= var18 - arg5 && arg2 >= var18 - arg5 && arg1[arg2 + var18 - arg5][var16 + arg2 - arg4]) {
                                    short[] var19 = this.field3811.field4329[var17];
                                    if (var19 != null) {
                                        if (this.field3809.field9021) {
                                            for (int var20 = 0; var20 < var19.length; var20++) {
                                                var15.method3831(1182, var19[var20] & 0xFFFF);
                                                var12++;
                                            }
                                        } else {
                                            for (int var21 = 0; var21 < var19.length; var21++) {
                                                var15.method3819(var19[var21] & 0xFFFF, 113);
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
                        this.field3810[var11][var8].method4210((byte) 99, 5123, var15.field9399, var12);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IZIII)V", line = 445)
    private final void method1649(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field3812++;
        if (this.field3810 == null) {
            return;
        }
        int var6 = arg4 - 1 >> 7;
        int var7 = arg2 + arg4 - 1 - 1 >> 7;
        int var8 = arg3 - 1 >> 7;
        int var9 = arg3 + arg0 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class750[] var11 = this.field3810[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field10447 = true;
            }
        }
        if (arg1) {
            field3807 = -23;
        }
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Lrda;Lmu;)V", line = 485)
    public class274(class663 arg0, class304 arg1) {
        this.field3811 = arg1;
        this.field3809 = arg0;
        this.field3816 = (this.field3811.field3992 * this.field3811.field3989 >> this.field3809.field8947) + 2;
        this.field3819 = (this.field3811.field3996 * this.field3811.field3989 >> this.field3809.field8947) + 2;
        this.field3818 = new byte[this.field3819 * this.field3816];
        this.field3813 = this.field3809.field8947 + 7 - this.field3811.field3990;
        this.field3820 = this.field3811.field3992 >> this.field3813;
        this.field3822 = this.field3811.field3996 >> this.field3813;
    }
}
