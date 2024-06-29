import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class323 extends class234 {

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "I")
    private int field4857 = 0;

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "I")
    private int field4858 = 0;

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "I")
    private int field4859 = 0;

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "Z")
    private boolean field4861 = false;

    @OriginalMember(owner = "client!cr", name = "g", descriptor = "I")
    private int field4863 = 0;

    @OriginalMember(owner = "client!cr", name = "i", descriptor = "I")
    private int field4865 = 0;

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "Lcg;")
    private class393 field4860;

    @OriginalMember(owner = "client!cr", name = "f", descriptor = "Lqq;")
    private class434 field4862;

    @OriginalMember(owner = "client!cr", name = "h", descriptor = "Lqq;")
    private class434 field4864;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(FFFFFFIII)V")
    public final void method1221(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field4861) {
            float var10 = (float) this.method1226();
            float var11 = (float) this.method1219();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field4865 * var14;
            float var17 = (float) this.field4865 * var15;
            float var18 = (float) this.field4859 * var12;
            float var19 = (float) this.field4859 * var13;
            float var20 = (float) this.field4857 * -var12;
            float var21 = (float) this.field4857 * -var13;
            float var22 = (float) this.field4863 * -var14;
            float var23 = (float) this.field4863 * -var15;
            arg0 = arg0 + var18 + var16;
            arg1 = arg1 + var19 + var17;
            arg2 = arg2 + var20 + var16;
            arg3 = arg3 + var21 + var17;
            arg4 = arg4 + var18 + var22;
            arg5 = arg5 + var19 + var23;
        }
        float var24 = arg2 + arg4 - arg0;
        float var25 = arg5 + arg3 - arg1;
        opengl var26 = this.field4860.field5783;
        this.field4862.method2001(true);
        this.field4860.method2447();
        this.field4860.method2460(this.field4862);
        this.field4860.method2424(arg8);
        this.field4860.method2467(arg6);
        var26.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        var26.glBegin(7);
        var26.glTexCoord2f(0.0F, this.field4862.field6398);
        var26.glVertex2f(arg0, arg1);
        var26.glTexCoord2f(0.0F, 0.0F);
        var26.glVertex2f(arg4, arg5);
        var26.glTexCoord2f(this.field4862.field6397, 0.0F);
        var26.glVertex2f(var24, var25);
        var26.glTexCoord2f(this.field4862.field6397, this.field4862.field6398);
        var26.glVertex2f(arg2, arg3);
        var26.glEnd();
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIIIIII)V")
    public final void method1228(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        opengl var8 = this.field4860.field5783;
        int var9 = arg0 + arg2;
        int var10 = arg1 + arg3;
        this.field4862.method2001(false);
        this.field4860.method2447();
        this.field4860.method2460(this.field4862);
        this.field4860.method2424(arg6);
        this.field4860.method2467(arg4);
        var8.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field4862.field6396 && !this.field4861) {
            float var11 = (float) arg3 * this.field4862.field6398 / (float) this.field4862.field6399;
            float var12 = (float) arg2 * this.field4862.field6397 / (float) this.field4862.field6400;
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
        var8.glTranslatef((float) this.field4859, (float) this.field4865, 0.0F);
        int var13 = this.method1226();
        int var14 = this.method1219();
        int var15 = this.field4862.field6399 + arg1;
        var8.glBegin(7);
        int var16 = arg1;
        while (var15 <= var10) {
            int var17 = this.field4862.field6400 + arg0;
            int var18 = arg0;
            while (var17 <= var9) {
                var8.glTexCoord2f(0.0F, this.field4862.field6398);
                var8.glVertex2i(var18, var16);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2i(var18, var15);
                var8.glTexCoord2f(this.field4862.field6397, 0.0F);
                var8.glVertex2i(var17, var15);
                var8.glTexCoord2f(this.field4862.field6397, this.field4862.field6398);
                var8.glVertex2i(var17, var16);
                var17 += var13;
                var18 += var13;
            }
            if (var18 < var9) {
                float var19 = (float) (var9 - var18) * this.field4862.field6397 / (float) this.field4862.field6400;
                var8.glTexCoord2f(0.0F, this.field4862.field6398);
                var8.glVertex2i(var18, var16);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2i(var18, var15);
                var8.glTexCoord2f(var19, 0.0F);
                var8.glVertex2i(var9, var15);
                var8.glTexCoord2f(var19, this.field4862.field6398);
                var8.glVertex2i(var9, var16);
            }
            var16 += var14;
            var15 += var14;
        }
        if (var16 < var10) {
            float var20 = (float) (this.field4862.field6399 - (var10 - var16)) * this.field4862.field6398 / (float) this.field4862.field6399;
            int var21 = this.field4862.field6400 + arg0;
            int var22 = arg0;
            while (var21 <= var9) {
                var8.glTexCoord2f(0.0F, this.field4862.field6398);
                var8.glVertex2i(var22, var16);
                var8.glTexCoord2f(0.0F, var20);
                var8.glVertex2i(var22, var10);
                var8.glTexCoord2f(this.field4862.field6397, var20);
                var8.glVertex2i(var21, var10);
                var8.glTexCoord2f(this.field4862.field6397, this.field4862.field6398);
                var8.glVertex2i(var21, var16);
                var21 += var13;
                var22 += var13;
            }
            if (var22 < var9) {
                float var23 = (float) (var9 - var22) * this.field4862.field6397 / (float) this.field4862.field6400;
                var8.glTexCoord2f(0.0F, this.field4862.field6398);
                var8.glVertex2i(var22, var16);
                var8.glTexCoord2f(0.0F, var20);
                var8.glVertex2i(var22, var10);
                var8.glTexCoord2f(var23, var20);
                var8.glVertex2i(var9, var10);
                var8.glTexCoord2f(var23, this.field4862.field6398);
                var8.glVertex2i(var9, var16);
            }
        }
        var8.glEnd();
        var8.glPopMatrix();
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "()I")
    public final int method1219() {
        return this.field4862.field6399 + this.field4865 + this.field4863;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(III)V")
    public final void method1410(int arg0, int arg1, int arg2) {
        opengl var4 = this.field4860.field5783;
        var4.glPixelTransferf(3348, 0.5F);
        var4.glPixelTransferf(3349, 0.499F);
        var4.glPixelTransferf(3352, 0.5F);
        var4.glPixelTransferf(3353, 0.499F);
        var4.glPixelTransferf(3354, 0.5F);
        var4.glPixelTransferf(3355, 0.499F);
        this.field4864 = class434.method2667(arg1, 3553, this.field4862.field6400, this.field4860, arg0, this.field4862.field6399);
        this.field4858 = arg2;
        var4.glPixelTransferf(3348, 1.0F);
        var4.glPixelTransferf(3349, 0.0F);
        var4.glPixelTransferf(3352, 1.0F);
        var4.glPixelTransferf(3353, 0.0F);
        var4.glPixelTransferf(3354, 1.0F);
        var4.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIIII)V")
    public final void method1218(int arg0, int arg1, int arg2, int arg3, int arg4) {
        opengl var6 = this.field4860.field5783;
        this.field4862.method2001(false);
        this.field4860.method2447();
        this.field4860.method2424(arg4);
        var6.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var7 = this.field4859 + arg0;
        int var8 = this.field4865 + arg1;
        if (this.field4864 == null) {
            this.field4860.method2460(this.field4862);
            this.field4860.method2467(arg2);
            var6.glBegin(7);
            var6.glTexCoord2f(0.0F, this.field4862.field6398);
            var6.glVertex2i(var7, var8);
            var6.glTexCoord2f(0.0F, 0.0F);
            var6.glVertex2i(var7, this.field4862.field6399 + var8);
            var6.glTexCoord2f(this.field4862.field6397, 0.0F);
            var6.glVertex2i(this.field4862.field6400 + var7, this.field4862.field6399 + var8);
            var6.glTexCoord2f(this.field4862.field6397, this.field4862.field6398);
            var6.glVertex2i(this.field4862.field6400 + var7, var8);
            var6.glEnd();
            return;
        }
        this.method1990(arg2);
        this.field4864.method2001(false);
        var6.glBegin(7);
        var6.glMultiTexCoord2f(33985, 0.0F, this.field4862.field6398);
        var6.glTexCoord2f(0.0F, this.field4862.field6398);
        var6.glVertex2i(var7, var8);
        var6.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var6.glTexCoord2f(0.0F, 0.0F);
        var6.glVertex2i(var7, this.field4862.field6399 + var8);
        var6.glMultiTexCoord2f(33985, this.field4862.field6397, 0.0F);
        var6.glTexCoord2f(this.field4862.field6397, 0.0F);
        var6.glVertex2i(this.field4862.field6400 + var7, this.field4862.field6399 + var8);
        var6.glMultiTexCoord2f(33985, this.field4862.field6397, this.field4862.field6398);
        var6.glTexCoord2f(this.field4862.field6397, this.field4862.field6398);
        var6.glVertex2i(this.field4862.field6400 + var7, var8);
        var6.glEnd();
        this.method1989();
    }

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "()I")
    public final int method1226() {
        return this.field4862.field6400 + this.field4859 + this.field4857;
    }

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "()I")
    public final int method1229() {
        return this.field4862.field6399;
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(IIIIIII)V")
    public final void method1222(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        opengl var8 = this.field4860.field5783;
        this.field4862.method2001(true);
        this.field4860.method2447();
        this.field4860.method2424(arg6);
        var8.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field4861) {
            float var9 = (float) arg2 / (float) this.method1226();
            float var10 = (float) arg3 / (float) this.method1219();
            float var11 = (float) this.field4859 * var9 + (float) arg0;
            float var12 = (float) this.field4865 * var10 + (float) arg1;
            float var13 = (float) this.field4862.field6400 * var9 + var11;
            float var14 = (float) this.field4862.field6399 * var10 + var12;
            if (this.field4864 == null) {
                this.field4860.method2460(this.field4862);
                this.field4860.method2467(arg4);
                var8.glBegin(7);
                var8.glTexCoord2f(0.0F, this.field4862.field6398);
                var8.glVertex2f(var11, var12);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2f(var11, var14);
                var8.glTexCoord2f(this.field4862.field6397, 0.0F);
                var8.glVertex2f(var13, var14);
                var8.glTexCoord2f(this.field4862.field6397, this.field4862.field6398);
                var8.glVertex2f(var13, var12);
                var8.glEnd();
            } else {
                this.method1990(arg4);
                this.field4864.method2001(true);
                var8.glBegin(7);
                var8.glMultiTexCoord2f(33985, 0.0F, this.field4862.field6398);
                var8.glTexCoord2f(0.0F, this.field4862.field6398);
                var8.glVertex2f(var11, var12);
                var8.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2f(var11, var14);
                var8.glMultiTexCoord2f(33985, this.field4862.field6397, 0.0F);
                var8.glTexCoord2f(this.field4862.field6397, 0.0F);
                var8.glVertex2f(var13, var14);
                var8.glMultiTexCoord2f(33985, this.field4862.field6397, this.field4862.field6398);
                var8.glTexCoord2f(this.field4862.field6397, this.field4862.field6398);
                var8.glVertex2f(var13, var12);
                var8.glEnd();
                this.method1989();
            }
        } else if (this.field4864 == null) {
            this.field4860.method2460(this.field4862);
            this.field4860.method2467(arg4);
            var8.glBegin(7);
            var8.glTexCoord2f(0.0F, this.field4862.field6398);
            var8.glVertex2i(arg0, arg1);
            var8.glTexCoord2f(0.0F, 0.0F);
            var8.glVertex2i(arg0, arg1 + arg3);
            var8.glTexCoord2f(this.field4862.field6397, 0.0F);
            var8.glVertex2i(arg0 + arg2, arg1 + arg3);
            var8.glTexCoord2f(this.field4862.field6397, this.field4862.field6398);
            var8.glVertex2i(arg0 + arg2, arg1);
            var8.glEnd();
        } else {
            this.method1990(arg4);
            this.field4864.method2001(true);
            var8.glBegin(7);
            var8.glMultiTexCoord2f(33985, 0.0F, this.field4862.field6398);
            var8.glTexCoord2f(0.0F, this.field4862.field6398);
            var8.glVertex2i(arg0, arg1);
            var8.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            var8.glTexCoord2f(0.0F, 0.0F);
            var8.glVertex2i(arg0, arg1 + arg3);
            var8.glMultiTexCoord2f(33985, this.field4862.field6397, 0.0F);
            var8.glTexCoord2f(this.field4862.field6397, 0.0F);
            var8.glVertex2i(arg0 + arg2, arg1 + arg3);
            var8.glMultiTexCoord2f(33985, this.field4862.field6397, this.field4862.field6398);
            var8.glTexCoord2f(this.field4862.field6397, this.field4862.field6398);
            var8.glVertex2i(arg0 + arg2, arg1);
            var8.glEnd();
            this.method1989();
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIIIII)V")
    public final void method1413(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4862.method260(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "()V")
    private final void method1989() {
        this.field4860.method2452(1);
        this.field4860.method2460((class325) null);
        this.field4860.method2428(8448, 8448);
        this.field4860.method2425(1, 34168, 768);
        this.field4860.method2462(0, 5890, 770);
        this.field4860.method2452(0);
        this.field4860.method2425(1, 34168, 768);
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIII)V")
    public final void method1220(int arg0, int arg1, int arg2, int arg3) {
        this.field4859 = arg0;
        this.field4865 = arg1;
        this.field4857 = arg2;
        this.field4863 = arg3;
        this.field4861 = this.field4859 != 0 || this.field4865 != 0 || this.field4857 != 0 || this.field4863 != 0;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(FFFFFFLor;II)V")
    public final void method1216(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class153 arg6, int arg7, int arg8) {
        class434 var10 = ((class76) arg6).field1023;
        if (this.field4861) {
            float var11 = (float) this.method1226();
            float var12 = (float) this.method1219();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field4865 * var15;
            float var18 = (float) this.field4865 * var16;
            float var19 = (float) this.field4859 * var13;
            float var20 = (float) this.field4859 * var14;
            float var21 = (float) this.field4857 * -var13;
            float var22 = (float) this.field4857 * -var14;
            float var23 = (float) this.field4863 * -var15;
            float var24 = (float) this.field4863 * -var16;
            arg0 = arg0 + var19 + var17;
            arg1 = arg1 + var20 + var18;
            arg2 = arg2 + var21 + var17;
            arg3 = arg3 + var22 + var18;
            arg4 = arg4 + var19 + var23;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        opengl var27 = this.field4860.field5783;
        this.field4862.method2001(true);
        this.field4860.method2447();
        this.field4860.method2460(this.field4862);
        this.field4860.method2467(0);
        this.field4860.method2452(1);
        this.field4860.method2460(var10);
        this.field4860.method2428(7681, 8448);
        this.field4860.method2425(0, 34168, 768);
        this.field4860.method2424(1);
        float var28 = var10.field6397 / (float) var10.field6400;
        float var29 = var10.field6398 / (float) var10.field6399;
        var27.glBegin(7);
        var27.glColor3f(1.0F, 1.0F, 1.0F);
        var27.glMultiTexCoord2f(33984, 0.0F, this.field4862.field6398);
        var27.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * var28, var10.field6398 - (arg1 - (float) arg8) * var29);
        var27.glVertex2f(arg0, arg1);
        var27.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        var27.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * var28, var10.field6398 - (arg5 - (float) arg8) * var29);
        var27.glVertex2f(arg4, arg5);
        var27.glMultiTexCoord2f(33984, this.field4862.field6397, 0.0F);
        var27.glMultiTexCoord2f(33985, (var25 - (float) arg7) * var28, var10.field6398 - (var26 - (float) arg8) * var29);
        var27.glVertex2f(var25, var26);
        var27.glMultiTexCoord2f(33984, this.field4862.field6397, this.field4862.field6398);
        var27.glMultiTexCoord2f(33985, (arg2 - (float) arg7) * var28, var10.field6398 - (arg3 - (float) arg8) * var29);
        var27.glVertex2f(arg2, arg3);
        var27.glEnd();
        this.field4860.method2425(0, 5890, 768);
        this.field4860.method2467(1);
        this.field4860.method2460((class325) null);
        this.field4860.method2452(0);
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)V")
    private final void method1990(int arg0) {
        this.field4860.method2452(1);
        this.field4860.method2460(this.field4862);
        this.field4860.method2428(this.field4860.method2440(arg0), 7681);
        this.field4860.method2425(1, 34167, 768);
        this.field4860.method2462(0, 34168, 770);
        this.field4860.method2452(0);
        this.field4860.method2460(this.field4864);
        this.field4860.method2428(34479, 7681);
        this.field4860.method2425(1, 34166, 768);
        if (this.field4858 == 0) {
            this.field4860.method2480(1.0F, 0.5F, 0.5F, 0.0F);
        } else if (this.field4858 == 1) {
            this.field4860.method2480(0.5F, 1.0F, 0.5F, 0.0F);
        } else if (this.field4858 == 2) {
            this.field4860.method2480(0.5F, 0.5F, 1.0F, 0.0F);
        } else if (this.field4858 == 3) {
            this.field4860.method2480(128.5F, 128.5F, 128.5F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "()I")
    public final int method1227() {
        return this.field4862.field6400;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IILor;II)V")
    public final void method1217(int arg0, int arg1, class153 arg2, int arg3, int arg4) {
        class76 var6 = (class76) arg2;
        class434 var7 = var6.field1023;
        this.field4862.method2001(false);
        this.field4860.method2447();
        this.field4860.method2460(this.field4862);
        this.field4860.method2467(0);
        this.field4860.method2452(1);
        this.field4860.method2460(var7);
        this.field4860.method2428(7681, 8448);
        this.field4860.method2425(0, 34168, 768);
        this.field4860.method2424(1);
        int var8 = this.field4859 + arg0;
        int var9 = this.field4865 + arg1;
        int var10 = this.field4862.field6400 + var8;
        int var11 = this.field4862.field6399 + var9;
        float var12 = var7.field6397 / (float) var7.field6400;
        float var13 = var7.field6398 / (float) var7.field6399;
        float var14 = (float) (var8 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field6398 - (float) (var9 - arg4) * var13;
        float var17 = var7.field6398 - (float) (var11 - arg4) * var13;
        opengl var18 = this.field4860.field5783;
        var18.glBegin(7);
        var18.glColor3f(1.0F, 1.0F, 1.0F);
        var18.glMultiTexCoord2f(33984, 0.0F, this.field4862.field6398);
        var18.glMultiTexCoord2f(33985, var14, var16);
        var18.glVertex2i(var8, var9);
        var18.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        var18.glMultiTexCoord2f(33985, var14, var17);
        var18.glVertex2i(var8, this.field4862.field6399 + var9);
        var18.glMultiTexCoord2f(33984, this.field4862.field6397, 0.0F);
        var18.glMultiTexCoord2f(33985, var15, var17);
        var18.glVertex2i(this.field4862.field6400 + var8, this.field4862.field6399 + var9);
        var18.glMultiTexCoord2f(33984, this.field4862.field6397, this.field4862.field6398);
        var18.glMultiTexCoord2f(33985, var15, var16);
        var18.glVertex2i(this.field4862.field6400 + var8, var9);
        var18.glEnd();
        this.field4860.method2425(0, 5890, 768);
        this.field4860.method2467(1);
        this.field4860.method2460((class325) null);
        this.field4860.method2452(0);
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Lcg;IIII)V")
    public class323(class393 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4860 = arg0;
        this.field4862 = class434.method2667(arg2, 3553, arg3, arg0, arg1, arg4);
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Lcg;II[III)V")
    public class323(class393 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field4860 = arg0;
        this.field4862 = class434.method2668(0, arg1, false, arg2, arg0, arg3);
    }
}
