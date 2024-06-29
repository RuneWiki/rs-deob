import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class291 extends class315 {

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "I")
    private int field4398 = 0;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
    private int field4396 = 0;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "I")
    private int field4397 = 0;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
    private int field4400 = 0;

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "Z")
    private boolean field4402 = false;

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "I")
    private int field4403 = 0;

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "Lse;")
    private class282 field4404;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "Lfj;")
    private class146 field4399;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "Lfj;")
    private class146 field4401;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(III)V")
    public final void method261(int arg0, int arg1, int arg2) {
        opengl var4 = this.field4404.field4140;
        var4.glPixelTransferf(3348, 0.5F);
        var4.glPixelTransferf(3349, 0.499F);
        var4.glPixelTransferf(3352, 0.5F);
        var4.glPixelTransferf(3353, 0.499F);
        var4.glPixelTransferf(3354, 0.5F);
        var4.glPixelTransferf(3355, 0.499F);
        this.field4401 = class146.method1012(this.field4399.field1873, arg0, this.field4404, arg1, (byte) -117, this.field4399.field1874);
        this.field4398 = arg2;
        var4.glPixelTransferf(3348, 1.0F);
        var4.glPixelTransferf(3349, 0.0F);
        var4.glPixelTransferf(3352, 1.0F);
        var4.glPixelTransferf(3353, 0.0F);
        var4.glPixelTransferf(3354, 1.0F);
        var4.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "()I")
    public final int method202() {
        return this.field4399.field1874;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "()I")
    public final int method208() {
        return this.field4399.field1873;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V")
    private final void method1979(int arg0) {
        this.field4404.method1862(1);
        this.field4404.method1915(this.field4399);
        this.field4404.method1911(this.field4404.method1860(arg0), 7681);
        this.field4404.method1866(1, 34167, 768);
        this.field4404.method1867(0, 34168, 770);
        this.field4404.method1862(0);
        this.field4404.method1915(this.field4401);
        this.field4404.method1911(34479, 7681);
        this.field4404.method1866(1, 34166, 768);
        if (this.field4398 == 0) {
            this.field4404.method1908(1.0F, 0.5F, 0.5F, 0.0F);
        } else if (this.field4398 == 1) {
            this.field4404.method1908(0.5F, 1.0F, 0.5F, 0.0F);
        } else if (this.field4398 == 2) {
            this.field4404.method1908(0.5F, 0.5F, 1.0F, 0.0F);
        } else if (this.field4398 == 3) {
            this.field4404.method1908(128.5F, 128.5F, 128.5F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIII)V")
    public final void method262(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4399.method870(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIII)V")
    public final void method211(int arg0, int arg1, int arg2, int arg3, int arg4) {
        opengl var6 = this.field4404.field4140;
        this.field4404.method1928();
        this.field4404.method1933(arg4);
        var6.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var7 = this.field4397 + arg0;
        int var8 = this.field4400 + arg1;
        if (this.field4401 == null) {
            this.field4404.method1915(this.field4399);
            this.field4404.method1910(arg2);
            var6.glBegin(7);
            var6.glTexCoord2f(0.0F, this.field4399.field1872);
            var6.glVertex2i(var7, var8);
            var6.glTexCoord2f(0.0F, 0.0F);
            var6.glVertex2i(var7, this.field4399.field1874 + var8);
            var6.glTexCoord2f(this.field4399.field1870, 0.0F);
            var6.glVertex2i(this.field4399.field1873 + var7, this.field4399.field1874 + var8);
            var6.glTexCoord2f(this.field4399.field1870, this.field4399.field1872);
            var6.glVertex2i(this.field4399.field1873 + var7, var8);
            var6.glEnd();
            return;
        }
        this.method1979(arg2);
        var6.glBegin(7);
        var6.glMultiTexCoord2f(33985, 0.0F, this.field4399.field1872);
        var6.glTexCoord2f(0.0F, this.field4399.field1872);
        var6.glVertex2i(var7, var8);
        var6.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var6.glTexCoord2f(0.0F, 0.0F);
        var6.glVertex2i(var7, this.field4399.field1874 + var8);
        var6.glMultiTexCoord2f(33985, this.field4399.field1870, 0.0F);
        var6.glTexCoord2f(this.field4399.field1870, 0.0F);
        var6.glVertex2i(this.field4399.field1873 + var7, this.field4399.field1874 + var8);
        var6.glMultiTexCoord2f(33985, this.field4399.field1870, this.field4399.field1872);
        var6.glTexCoord2f(this.field4399.field1870, this.field4399.field1872);
        var6.glVertex2i(this.field4399.field1873 + var7, var8);
        var6.glEnd();
        this.method1980();
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(IIIIIII)V")
    public final void method200(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        opengl var8 = this.field4404.field4140;
        this.field4404.method1928();
        this.field4404.method1933(arg6);
        var8.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field4402) {
            float var9 = (float) arg2 / (float) this.method199();
            float var10 = (float) arg3 / (float) this.method207();
            float var11 = (float) this.field4397 * var9 + (float) arg0;
            float var12 = (float) this.field4400 * var10 + (float) arg1;
            float var13 = (float) this.field4399.field1873 * var9 + var11;
            float var14 = (float) this.field4399.field1874 * var10 + var12;
            if (this.field4401 == null) {
                this.field4404.method1915(this.field4399);
                this.field4404.method1910(arg4);
                var8.glBegin(7);
                var8.glTexCoord2f(0.0F, this.field4399.field1872);
                var8.glVertex2f(var11, var12);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2f(var11, var14);
                var8.glTexCoord2f(this.field4399.field1870, 0.0F);
                var8.glVertex2f(var13, var14);
                var8.glTexCoord2f(this.field4399.field1870, this.field4399.field1872);
                var8.glVertex2f(var13, var12);
                var8.glEnd();
            } else {
                this.method1979(arg4);
                var8.glBegin(7);
                var8.glMultiTexCoord2f(33985, 0.0F, this.field4399.field1872);
                var8.glTexCoord2f(0.0F, this.field4399.field1872);
                var8.glVertex2f(var11, var12);
                var8.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2f(var11, var14);
                var8.glMultiTexCoord2f(33985, this.field4399.field1870, 0.0F);
                var8.glTexCoord2f(this.field4399.field1870, 0.0F);
                var8.glVertex2f(var13, var14);
                var8.glMultiTexCoord2f(33985, this.field4399.field1870, this.field4399.field1872);
                var8.glTexCoord2f(this.field4399.field1870, this.field4399.field1872);
                var8.glVertex2f(var13, var12);
                var8.glEnd();
                this.method1980();
            }
        } else if (this.field4401 == null) {
            this.field4404.method1915(this.field4399);
            this.field4404.method1910(arg4);
            var8.glBegin(7);
            var8.glTexCoord2f(0.0F, this.field4399.field1872);
            var8.glVertex2i(arg0, arg1);
            var8.glTexCoord2f(0.0F, 0.0F);
            var8.glVertex2i(arg0, arg1 + arg3);
            var8.glTexCoord2f(this.field4399.field1870, 0.0F);
            var8.glVertex2i(arg0 + arg2, arg1 + arg3);
            var8.glTexCoord2f(this.field4399.field1870, this.field4399.field1872);
            var8.glVertex2i(arg0 + arg2, arg1);
            var8.glEnd();
        } else {
            this.method1979(arg4);
            var8.glBegin(7);
            var8.glMultiTexCoord2f(33985, 0.0F, this.field4399.field1872);
            var8.glTexCoord2f(0.0F, this.field4399.field1872);
            var8.glVertex2i(arg0, arg1);
            var8.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            var8.glTexCoord2f(0.0F, 0.0F);
            var8.glVertex2i(arg0, arg1 + arg3);
            var8.glMultiTexCoord2f(33985, this.field4399.field1870, 0.0F);
            var8.glTexCoord2f(this.field4399.field1870, 0.0F);
            var8.glVertex2i(arg0 + arg2, arg1 + arg3);
            var8.glMultiTexCoord2f(33985, this.field4399.field1870, this.field4399.field1872);
            var8.glTexCoord2f(this.field4399.field1870, this.field4399.field1872);
            var8.glVertex2i(arg0 + arg2, arg1);
            var8.glEnd();
            this.method1980();
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIIII)V")
    public final void method210(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        opengl var8 = this.field4404.field4140;
        int var9 = arg0 + arg2;
        int var10 = arg1 + arg3;
        this.field4404.method1928();
        this.field4404.method1915(this.field4399);
        this.field4404.method1933(arg6);
        this.field4404.method1910(arg4);
        var8.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field4399.field1871 && !this.field4402) {
            float var11 = (float) arg3 * this.field4399.field1872 / (float) this.field4399.field1874;
            float var12 = (float) arg2 * this.field4399.field1870 / (float) this.field4399.field1873;
            var8.glBegin(7);
            var8.glTexCoord2f(0.0F, var11);
            var8.glVertex2i(arg0, arg1);
            var8.glTexCoord2f(0.0F, 0.0F);
            var8.glVertex2i(arg0, var10);
            var8.glTexCoord2f(var12, 0.0F);
            var8.glVertex2i(var9, var10);
            var8.glTexCoord2f(var12, var11);
            var8.glVertex2i(var9, arg1);
            var8.glEnd();
            return;
        }
        var8.glPushMatrix();
        var8.glTranslatef((float) this.field4397, (float) this.field4400, 0.0F);
        int var13 = this.method199();
        int var14 = this.method207();
        int var15 = this.field4399.field1874 + arg1;
        var8.glBegin(7);
        int var16 = arg1;
        while (var15 <= var10) {
            int var17 = this.field4399.field1873 + arg0;
            int var18 = arg0;
            while (var17 <= var9) {
                var8.glTexCoord2f(0.0F, this.field4399.field1872);
                var8.glVertex2i(var18, var16);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2i(var18, var15);
                var8.glTexCoord2f(this.field4399.field1870, 0.0F);
                var8.glVertex2i(var17, var15);
                var8.glTexCoord2f(this.field4399.field1870, this.field4399.field1872);
                var8.glVertex2i(var17, var16);
                var17 += var13;
                var18 += var13;
            }
            if (var18 < var9) {
                float var19 = (float) (var9 - var18) * this.field4399.field1870 / (float) this.field4399.field1873;
                var8.glTexCoord2f(0.0F, this.field4399.field1872);
                var8.glVertex2i(var18, var16);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2i(var18, var15);
                var8.glTexCoord2f(var19, 0.0F);
                var8.glVertex2i(var9, var15);
                var8.glTexCoord2f(var19, this.field4399.field1872);
                var8.glVertex2i(var9, var16);
            }
            var16 += var14;
            var15 += var14;
        }
        if (var16 < var10) {
            float var20 = (float) (this.field4399.field1568 - (var10 - var16)) * this.field4399.field1872 / (float) this.field4399.field1874;
            int var21 = this.field4399.field1873 + arg0;
            int var22 = arg0;
            while (var21 <= var9) {
                var8.glTexCoord2f(0.0F, this.field4399.field1872);
                var8.glVertex2i(var22, var16);
                var8.glTexCoord2f(0.0F, var20);
                var8.glVertex2i(var22, var10);
                var8.glTexCoord2f(this.field4399.field1870, var20);
                var8.glVertex2i(var21, var10);
                var8.glTexCoord2f(this.field4399.field1870, this.field4399.field1872);
                var8.glVertex2i(var21, var16);
                var21 += var13;
                var22 += var13;
            }
            if (var22 < var9) {
                float var23 = (float) (var9 - var22) * this.field4399.field1870 / (float) this.field4399.field1873;
                var8.glTexCoord2f(0.0F, this.field4399.field1872);
                var8.glVertex2i(var22, var16);
                var8.glTexCoord2f(0.0F, var20);
                var8.glVertex2i(var22, var10);
                var8.glTexCoord2f(var23, var20);
                var8.glVertex2i(var9, var10);
                var8.glTexCoord2f(var23, this.field4399.field1872);
                var8.glVertex2i(var9, var16);
            }
        }
        var8.glEnd();
        var8.glPopMatrix();
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(FFFFFFIII)V")
    public final void method206(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field4402) {
            float var10 = (float) this.method199();
            float var11 = (float) this.method207();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field4400 * var14;
            float var17 = (float) this.field4400 * var15;
            float var18 = (float) this.field4397 * var12;
            float var19 = (float) this.field4397 * var13;
            float var20 = (float) this.field4396 * -var12;
            float var21 = (float) this.field4396 * -var13;
            float var22 = (float) this.field4403 * -var14;
            float var23 = (float) this.field4403 * -var15;
            arg0 = arg0 + var18 + var16;
            arg1 = arg1 + var19 + var17;
            arg2 = arg2 + var20 + var16;
            arg3 = arg3 + var21 + var17;
            arg4 = arg4 + var18 + var22;
            arg5 = arg5 + var19 + var23;
        }
        float var24 = arg2 + arg4 - arg0;
        float var25 = arg5 + arg3 - arg1;
        opengl var26 = this.field4404.field4140;
        this.field4404.method1928();
        this.field4404.method1915(this.field4399);
        this.field4404.method1933(arg8);
        this.field4404.method1910(arg6);
        var26.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        var26.glBegin(7);
        var26.glTexCoord2f(0.0F, this.field4399.field1872);
        var26.glVertex2f(arg0, arg1);
        var26.glTexCoord2f(0.0F, 0.0F);
        var26.glVertex2f(arg4, arg5);
        var26.glTexCoord2f(this.field4399.field1870, 0.0F);
        var26.glVertex2f(var24, var25);
        var26.glTexCoord2f(this.field4399.field1870, this.field4399.field1872);
        var26.glVertex2f(arg2, arg3);
        var26.glEnd();
    }

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "()V")
    private final void method1980() {
        this.field4404.method1862(1);
        this.field4404.method1915((class344) null);
        this.field4404.method1911(8448, 8448);
        this.field4404.method1866(1, 34168, 768);
        this.field4404.method1867(0, 5890, 770);
        this.field4404.method1862(0);
        this.field4404.method1866(1, 34168, 768);
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "()I")
    public final int method207() {
        return this.field4399.field1874 + this.field4400 + this.field4403;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IILsf;II)V")
    public final void method209(int arg0, int arg1, class421 arg2, int arg3, int arg4) {
        class442 var6 = (class442) arg2;
        class146 var7 = var6.field6397;
        this.field4404.method1928();
        this.field4404.method1915(this.field4399);
        this.field4404.method1910(0);
        this.field4404.method1862(1);
        this.field4404.method1915(var7);
        this.field4404.method1911(7681, 8448);
        this.field4404.method1866(0, 34168, 768);
        this.field4404.method1933(1);
        int var8 = this.field4397 + arg0;
        int var9 = this.field4400 + arg1;
        int var10 = this.field4399.field1873 + var8;
        int var11 = this.field4399.field1874 + var9;
        float var12 = var7.field1870 / (float) var7.field1873;
        float var13 = var7.field1872 / (float) var7.field1874;
        float var14 = (float) (var8 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field1872 - (float) (var9 - arg4) * var13;
        float var17 = var7.field1872 - (float) (var11 - arg4) * var13;
        opengl var18 = this.field4404.field4140;
        var18.glBegin(7);
        var18.glColor3f(1.0F, 1.0F, 1.0F);
        var18.glMultiTexCoord2f(33984, 0.0F, this.field4399.field1872);
        var18.glMultiTexCoord2f(33985, var14, var16);
        var18.glVertex2i(var8, var9);
        var18.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        var18.glMultiTexCoord2f(33985, var14, var17);
        var18.glVertex2i(var8, this.field4399.field1874 + var9);
        var18.glMultiTexCoord2f(33984, this.field4399.field1870, 0.0F);
        var18.glMultiTexCoord2f(33985, var15, var17);
        var18.glVertex2i(this.field4399.field1873 + var8, this.field4399.field1874 + var9);
        var18.glMultiTexCoord2f(33984, this.field4399.field1870, this.field4399.field1872);
        var18.glMultiTexCoord2f(33985, var15, var16);
        var18.glVertex2i(this.field4399.field1873 + var8, var9);
        var18.glEnd();
        this.field4404.method1866(0, 5890, 768);
        this.field4404.method1910(1);
        this.field4404.method1915((class344) null);
        this.field4404.method1862(0);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "()I")
    public final int method199() {
        return this.field4399.field1873 + this.field4397 + this.field4396;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(IIII)V")
    public final void method205(int arg0, int arg1, int arg2, int arg3) {
        this.field4397 = arg0;
        this.field4400 = arg1;
        this.field4396 = arg2;
        this.field4403 = arg3;
        this.field4402 = this.field4397 != 0 || this.field4400 != 0 || this.field4396 != 0 || this.field4403 != 0;
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lse;IIII)V")
    public class291(class282 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4404 = arg0;
        this.field4399 = class146.method1012(arg3, arg1, arg0, arg2, (byte) -117, arg4);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(FFFFFFLsf;II)V")
    public final void method198(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class421 arg6, int arg7, int arg8) {
        class146 var10 = ((class442) arg6).field6397;
        if (this.field4402) {
            float var11 = (float) this.method199();
            float var12 = (float) this.method207();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field4400 * var15;
            float var18 = (float) this.field4400 * var16;
            float var19 = (float) this.field4397 * var13;
            float var20 = (float) this.field4397 * var14;
            float var21 = (float) this.field4396 * -var13;
            float var22 = (float) this.field4396 * -var14;
            float var23 = (float) this.field4403 * -var15;
            float var24 = (float) this.field4403 * -var16;
            arg0 = arg0 + var19 + var17;
            arg1 = arg1 + var20 + var18;
            arg2 = arg2 + var21 + var17;
            arg3 = arg3 + var22 + var18;
            arg4 = arg4 + var19 + var23;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        opengl var27 = this.field4404.field4140;
        this.field4404.method1928();
        this.field4404.method1915(this.field4399);
        this.field4404.method1910(0);
        this.field4404.method1862(1);
        this.field4404.method1915(var10);
        this.field4404.method1911(7681, 8448);
        this.field4404.method1866(0, 34168, 768);
        this.field4404.method1933(1);
        float var28 = var10.field1870 / (float) var10.field1873;
        float var29 = var10.field1872 / (float) var10.field1874;
        var27.glBegin(7);
        var27.glColor3f(1.0F, 1.0F, 1.0F);
        var27.glMultiTexCoord2f(33984, 0.0F, this.field4399.field1872);
        var27.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * var28, var10.field1872 - (arg1 - (float) arg8) * var29);
        var27.glVertex2f(arg0, arg1);
        var27.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        var27.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * var28, var10.field1872 - (arg5 - (float) arg8) * var29);
        var27.glVertex2f(arg4, arg5);
        var27.glMultiTexCoord2f(33984, this.field4399.field1870, 0.0F);
        var27.glMultiTexCoord2f(33985, (var25 - (float) arg7) * var28, var10.field1872 - (var26 - (float) arg8) * var29);
        var27.glVertex2f(var25, var26);
        var27.glMultiTexCoord2f(33984, this.field4399.field1870, this.field4399.field1872);
        var27.glMultiTexCoord2f(33985, (arg2 - (float) arg7) * var28, var10.field1872 - (arg3 - (float) arg8) * var29);
        var27.glVertex2f(arg2, arg3);
        var27.glEnd();
        this.field4404.method1866(0, 5890, 768);
        this.field4404.method1910(1);
        this.field4404.method1915((class344) null);
        this.field4404.method1862(0);
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lse;II[III)V")
    public class291(class282 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field4404 = arg0;
        this.field4399 = class146.method1010(-19065, arg1, false, arg2, arg0, arg3);
    }
}
