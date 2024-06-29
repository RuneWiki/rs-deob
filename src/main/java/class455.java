import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class455 extends class176 {

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "Z")
    private boolean field6400 = false;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    private int field6399 = 0;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    private int field6403 = 0;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "I")
    private int field6405 = 0;

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
    private int field6407 = 0;

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "I")
    private int field6406 = 0;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "Lmi;")
    private class315 field6401;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "Lrh;")
    private class159 field6404;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "Lrh;")
    private class159 field6402;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(FFFFFFIII)V")
    public final void method523(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field6400) {
            float var10 = (float) this.method516();
            float var11 = (float) this.method524();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field6407 * var14;
            float var17 = (float) this.field6407 * var15;
            float var18 = (float) this.field6405 * var12;
            float var19 = (float) this.field6405 * var13;
            float var20 = (float) this.field6406 * -var12;
            float var21 = (float) this.field6406 * -var13;
            float var22 = (float) this.field6403 * -var14;
            float var23 = (float) this.field6403 * -var15;
            arg0 = arg0 + var18 + var16;
            arg1 = arg1 + var19 + var17;
            arg2 = arg2 + var20 + var16;
            arg3 = arg3 + var21 + var17;
            arg4 = arg4 + var18 + var22;
            arg5 = arg5 + var19 + var23;
        }
        float var24 = arg2 + arg4 - arg0;
        float var25 = arg5 + arg3 - arg1;
        opengl var26 = this.field6401.field4445;
        this.field6404.method2501(true);
        this.field6401.method1956();
        this.field6401.method1967(this.field6404);
        this.field6401.method1995(arg8);
        this.field6401.method1962(arg6);
        var26.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        var26.glBegin(7);
        var26.glTexCoord2f(0.0F, this.field6404.field2359);
        var26.glVertex2f(arg0, arg1);
        var26.glTexCoord2f(0.0F, 0.0F);
        var26.glVertex2f(arg4, arg5);
        var26.glTexCoord2f(this.field6404.field2357, 0.0F);
        var26.glVertex2f(var24, var25);
        var26.glTexCoord2f(this.field6404.field2357, this.field6404.field2359);
        var26.glVertex2f(arg2, arg3);
        var26.glEnd();
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(FFFFFFLsm;II)V")
    public final void method522(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class171 arg6, int arg7, int arg8) {
        class159 var10 = ((class4) arg6).field34;
        if (this.field6400) {
            float var11 = (float) this.method516();
            float var12 = (float) this.method524();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field6407 * var15;
            float var18 = (float) this.field6407 * var16;
            float var19 = (float) this.field6405 * var13;
            float var20 = (float) this.field6405 * var14;
            float var21 = (float) this.field6406 * -var13;
            float var22 = (float) this.field6406 * -var14;
            float var23 = (float) this.field6403 * -var15;
            float var24 = (float) this.field6403 * -var16;
            arg0 = arg0 + var19 + var17;
            arg1 = arg1 + var20 + var18;
            arg2 = arg2 + var21 + var17;
            arg3 = arg3 + var22 + var18;
            arg4 = arg4 + var19 + var23;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        opengl var27 = this.field6401.field4445;
        this.field6404.method2501(true);
        this.field6401.method1956();
        this.field6401.method1967(this.field6404);
        this.field6401.method1962(0);
        this.field6401.method1972(1);
        this.field6401.method1967(var10);
        this.field6401.method1992(7681, 8448);
        this.field6401.method2006(0, 34168, 768);
        this.field6401.method1995(1);
        float var28 = var10.field2357 / (float) var10.field2358;
        float var29 = var10.field2359 / (float) var10.field2361;
        var27.glBegin(7);
        var27.glColor3f(1.0F, 1.0F, 1.0F);
        var27.glMultiTexCoord2f(33984, 0.0F, this.field6404.field2359);
        var27.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * var28, var10.field2359 - (arg1 - (float) arg8) * var29);
        var27.glVertex2f(arg0, arg1);
        var27.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        var27.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * var28, var10.field2359 - (arg5 - (float) arg8) * var29);
        var27.glVertex2f(arg4, arg5);
        var27.glMultiTexCoord2f(33984, this.field6404.field2357, 0.0F);
        var27.glMultiTexCoord2f(33985, (var25 - (float) arg7) * var28, var10.field2359 - (var26 - (float) arg8) * var29);
        var27.glVertex2f(var25, var26);
        var27.glMultiTexCoord2f(33984, this.field6404.field2357, this.field6404.field2359);
        var27.glMultiTexCoord2f(33985, (arg2 - (float) arg7) * var28, var10.field2359 - (arg3 - (float) arg8) * var29);
        var27.glVertex2f(arg2, arg3);
        var27.glEnd();
        this.field6401.method2006(0, 5890, 768);
        this.field6401.method1962(1);
        this.field6401.method1967((class425) null);
        this.field6401.method1972(0);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIII)V")
    public final void method138(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6404.method94(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(III)V")
    public final void method142(int arg0, int arg1, int arg2) {
        opengl var4 = this.field6401.field4445;
        var4.glPixelTransferf(3348, 0.5F);
        var4.glPixelTransferf(3349, 0.499F);
        var4.glPixelTransferf(3352, 0.5F);
        var4.glPixelTransferf(3353, 0.499F);
        var4.glPixelTransferf(3354, 0.5F);
        var4.glPixelTransferf(3355, 0.499F);
        this.field6402 = class159.method992(this.field6401, this.field6404.field2361, (byte) 38, arg0, arg1, this.field6404.field2358);
        this.field6399 = arg2;
        var4.glPixelTransferf(3348, 1.0F);
        var4.glPixelTransferf(3349, 0.0F);
        var4.glPixelTransferf(3352, 1.0F);
        var4.glPixelTransferf(3353, 0.0F);
        var4.glPixelTransferf(3354, 1.0F);
        var4.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIIII)V")
    public final void method519(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        opengl var8 = this.field6401.field4445;
        int var9 = arg0 + arg2;
        int var10 = arg1 + arg3;
        this.field6404.method2501(false);
        this.field6401.method1956();
        this.field6401.method1967(this.field6404);
        this.field6401.method1995(arg6);
        this.field6401.method1962(arg4);
        var8.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field6404.field2360 && !this.field6400) {
            float var11 = (float) arg3 * this.field6404.field2359 / (float) this.field6404.field2361;
            float var12 = (float) arg2 * this.field6404.field2357 / (float) this.field6404.field2358;
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
        var8.glTranslatef((float) this.field6405, (float) this.field6407, 0.0F);
        int var13 = this.method516();
        int var14 = this.method524();
        int var15 = this.field6404.field2361 + arg1;
        var8.glBegin(7);
        int var16 = arg1;
        while (var15 <= var10) {
            int var17 = this.field6404.field2358 + arg0;
            int var18 = arg0;
            while (var17 <= var9) {
                var8.glTexCoord2f(0.0F, this.field6404.field2359);
                var8.glVertex2i(var18, var16);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2i(var18, var15);
                var8.glTexCoord2f(this.field6404.field2357, 0.0F);
                var8.glVertex2i(var17, var15);
                var8.glTexCoord2f(this.field6404.field2357, this.field6404.field2359);
                var8.glVertex2i(var17, var16);
                var17 += var13;
                var18 += var13;
            }
            if (var18 < var9) {
                float var19 = (float) (var9 - var18) * this.field6404.field2357 / (float) this.field6404.field2358;
                var8.glTexCoord2f(0.0F, this.field6404.field2359);
                var8.glVertex2i(var18, var16);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2i(var18, var15);
                var8.glTexCoord2f(var19, 0.0F);
                var8.glVertex2i(var9, var15);
                var8.glTexCoord2f(var19, this.field6404.field2359);
                var8.glVertex2i(var9, var16);
            }
            var16 += var14;
            var15 += var14;
        }
        if (var16 < var10) {
            float var20 = (float) (this.field6404.field2361 - (var10 - var16)) * this.field6404.field2359 / (float) this.field6404.field2361;
            int var21 = this.field6404.field2358 + arg0;
            int var22 = arg0;
            while (var21 <= var9) {
                var8.glTexCoord2f(0.0F, this.field6404.field2359);
                var8.glVertex2i(var22, var16);
                var8.glTexCoord2f(0.0F, var20);
                var8.glVertex2i(var22, var10);
                var8.glTexCoord2f(this.field6404.field2357, var20);
                var8.glVertex2i(var21, var10);
                var8.glTexCoord2f(this.field6404.field2357, this.field6404.field2359);
                var8.glVertex2i(var21, var16);
                var21 += var13;
                var22 += var13;
            }
            if (var22 < var9) {
                float var23 = (float) (var9 - var22) * this.field6404.field2357 / (float) this.field6404.field2358;
                var8.glTexCoord2f(0.0F, this.field6404.field2359);
                var8.glVertex2i(var22, var16);
                var8.glTexCoord2f(0.0F, var20);
                var8.glVertex2i(var22, var10);
                var8.glTexCoord2f(var23, var20);
                var8.glVertex2i(var9, var10);
                var8.glTexCoord2f(var23, this.field6404.field2359);
                var8.glVertex2i(var9, var16);
            }
        }
        var8.glEnd();
        var8.glPopMatrix();
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "()I")
    public final int method516() {
        return this.field6404.field2358 + this.field6405 + this.field6406;
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(IIIIIII)V")
    public final void method140(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        opengl var8 = this.field6401.field4445;
        this.field6404.method2501(true);
        this.field6401.method1956();
        this.field6401.method1995(arg6);
        var8.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field6400) {
            float var9 = (float) arg2 / (float) this.method516();
            float var10 = (float) arg3 / (float) this.method524();
            float var11 = (float) this.field6405 * var9 + (float) arg0;
            float var12 = (float) this.field6407 * var10 + (float) arg1;
            float var13 = (float) this.field6404.field2358 * var9 + var11;
            float var14 = (float) this.field6404.field2361 * var10 + var12;
            if (this.field6402 == null) {
                this.field6401.method1967(this.field6404);
                this.field6401.method1962(arg4);
                var8.glBegin(7);
                var8.glTexCoord2f(0.0F, this.field6404.field2359);
                var8.glVertex2f(var11, var12);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2f(var11, var14);
                var8.glTexCoord2f(this.field6404.field2357, 0.0F);
                var8.glVertex2f(var13, var14);
                var8.glTexCoord2f(this.field6404.field2357, this.field6404.field2359);
                var8.glVertex2f(var13, var12);
                var8.glEnd();
            } else {
                this.method2673(arg4);
                this.field6402.method2501(true);
                var8.glBegin(7);
                var8.glMultiTexCoord2f(33985, 0.0F, this.field6404.field2359);
                var8.glTexCoord2f(0.0F, this.field6404.field2359);
                var8.glVertex2f(var11, var12);
                var8.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2f(var11, var14);
                var8.glMultiTexCoord2f(33985, this.field6404.field2357, 0.0F);
                var8.glTexCoord2f(this.field6404.field2357, 0.0F);
                var8.glVertex2f(var13, var14);
                var8.glMultiTexCoord2f(33985, this.field6404.field2357, this.field6404.field2359);
                var8.glTexCoord2f(this.field6404.field2357, this.field6404.field2359);
                var8.glVertex2f(var13, var12);
                var8.glEnd();
                this.method2672();
            }
        } else if (this.field6402 == null) {
            this.field6401.method1967(this.field6404);
            this.field6401.method1962(arg4);
            var8.glBegin(7);
            var8.glTexCoord2f(0.0F, this.field6404.field2359);
            var8.glVertex2i(arg0, arg1);
            var8.glTexCoord2f(0.0F, 0.0F);
            var8.glVertex2i(arg0, arg1 + arg3);
            var8.glTexCoord2f(this.field6404.field2357, 0.0F);
            var8.glVertex2i(arg0 + arg2, arg1 + arg3);
            var8.glTexCoord2f(this.field6404.field2357, this.field6404.field2359);
            var8.glVertex2i(arg0 + arg2, arg1);
            var8.glEnd();
        } else {
            this.method2673(arg4);
            this.field6402.method2501(true);
            var8.glBegin(7);
            var8.glMultiTexCoord2f(33985, 0.0F, this.field6404.field2359);
            var8.glTexCoord2f(0.0F, this.field6404.field2359);
            var8.glVertex2i(arg0, arg1);
            var8.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            var8.glTexCoord2f(0.0F, 0.0F);
            var8.glVertex2i(arg0, arg1 + arg3);
            var8.glMultiTexCoord2f(33985, this.field6404.field2357, 0.0F);
            var8.glTexCoord2f(this.field6404.field2357, 0.0F);
            var8.glVertex2i(arg0 + arg2, arg1 + arg3);
            var8.glMultiTexCoord2f(33985, this.field6404.field2357, this.field6404.field2359);
            var8.glTexCoord2f(this.field6404.field2357, this.field6404.field2359);
            var8.glVertex2i(arg0 + arg2, arg1);
            var8.glEnd();
            this.method2672();
        }
    }

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "()V")
    private final void method2672() {
        this.field6401.method1972(1);
        this.field6401.method1967((class425) null);
        this.field6401.method1992(8448, 8448);
        this.field6401.method2006(1, 34168, 768);
        this.field6401.method2017(0, 5890, 770);
        this.field6401.method1972(0);
        this.field6401.method2006(1, 34168, 768);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "()I")
    public final int method521() {
        return this.field6404.field2361;
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "()I")
    public final int method518() {
        return this.field6404.field2358;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIII)V")
    public final void method144(int arg0, int arg1, int arg2, int arg3, int arg4) {
        opengl var6 = this.field6401.field4445;
        this.field6404.method2501(false);
        this.field6401.method1956();
        this.field6401.method1995(arg4);
        var6.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var7 = this.field6405 + arg0;
        int var8 = this.field6407 + arg1;
        if (this.field6402 == null) {
            this.field6401.method1967(this.field6404);
            this.field6401.method1962(arg2);
            var6.glBegin(7);
            var6.glTexCoord2f(0.0F, this.field6404.field2359);
            var6.glVertex2i(var7, var8);
            var6.glTexCoord2f(0.0F, 0.0F);
            var6.glVertex2i(var7, this.field6404.field2361 + var8);
            var6.glTexCoord2f(this.field6404.field2357, 0.0F);
            var6.glVertex2i(this.field6404.field2358 + var7, this.field6404.field2361 + var8);
            var6.glTexCoord2f(this.field6404.field2357, this.field6404.field2359);
            var6.glVertex2i(this.field6404.field2358 + var7, var8);
            var6.glEnd();
            return;
        }
        this.method2673(arg2);
        this.field6402.method2501(false);
        var6.glBegin(7);
        var6.glMultiTexCoord2f(33985, 0.0F, this.field6404.field2359);
        var6.glTexCoord2f(0.0F, this.field6404.field2359);
        var6.glVertex2i(var7, var8);
        var6.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var6.glTexCoord2f(0.0F, 0.0F);
        var6.glVertex2i(var7, this.field6404.field2361 + var8);
        var6.glMultiTexCoord2f(33985, this.field6404.field2357, 0.0F);
        var6.glTexCoord2f(this.field6404.field2357, 0.0F);
        var6.glVertex2i(this.field6404.field2358 + var7, this.field6404.field2361 + var8);
        var6.glMultiTexCoord2f(33985, this.field6404.field2357, this.field6404.field2359);
        var6.glTexCoord2f(this.field6404.field2357, this.field6404.field2359);
        var6.glVertex2i(this.field6404.field2358 + var7, var8);
        var6.glEnd();
        this.method2672();
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "()I")
    public final int method524() {
        return this.field6404.field2361 + this.field6407 + this.field6403;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IILsm;II)V")
    public final void method141(int arg0, int arg1, class171 arg2, int arg3, int arg4) {
        class4 var6 = (class4) arg2;
        class159 var7 = var6.field34;
        this.field6404.method2501(false);
        this.field6401.method1956();
        this.field6401.method1967(this.field6404);
        this.field6401.method1962(0);
        this.field6401.method1972(1);
        this.field6401.method1967(var7);
        this.field6401.method1992(7681, 8448);
        this.field6401.method2006(0, 34168, 768);
        this.field6401.method1995(1);
        int var8 = this.field6405 + arg0;
        int var9 = this.field6407 + arg1;
        int var10 = this.field6404.field2358 + var8;
        int var11 = this.field6404.field2361 + var9;
        float var12 = var7.field2357 / (float) var7.field2358;
        float var13 = var7.field2359 / (float) var7.field2361;
        float var14 = (float) (var8 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field2359 - (float) (var9 - arg4) * var13;
        float var17 = var7.field2359 - (float) (var11 - arg4) * var13;
        opengl var18 = this.field6401.field4445;
        var18.glBegin(7);
        var18.glColor3f(1.0F, 1.0F, 1.0F);
        var18.glMultiTexCoord2f(33984, 0.0F, this.field6404.field2359);
        var18.glMultiTexCoord2f(33985, var14, var16);
        var18.glVertex2i(var8, var9);
        var18.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        var18.glMultiTexCoord2f(33985, var14, var17);
        var18.glVertex2i(var8, this.field6404.field2361 + var9);
        var18.glMultiTexCoord2f(33984, this.field6404.field2357, 0.0F);
        var18.glMultiTexCoord2f(33985, var15, var17);
        var18.glVertex2i(this.field6404.field2358 + var8, this.field6404.field2361 + var9);
        var18.glMultiTexCoord2f(33984, this.field6404.field2357, this.field6404.field2359);
        var18.glMultiTexCoord2f(33985, var15, var16);
        var18.glVertex2i(this.field6404.field2358 + var8, var9);
        var18.glEnd();
        this.field6401.method2006(0, 5890, 768);
        this.field6401.method1962(1);
        this.field6401.method1967((class425) null);
        this.field6401.method1972(0);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIII)V")
    public final void method520(int arg0, int arg1, int arg2, int arg3) {
        this.field6405 = arg0;
        this.field6407 = arg1;
        this.field6406 = arg2;
        this.field6403 = arg3;
        this.field6400 = this.field6405 != 0 || this.field6407 != 0 || this.field6406 != 0 || this.field6403 != 0;
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(Lmi;IIII)V")
    public class455(class315 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field6401 = arg0;
        this.field6404 = class159.method992(arg0, arg4, (byte) 38, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(Lmi;II[III)V")
    public class455(class315 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field6401 = arg0;
        this.field6404 = class159.method991(-121, arg3, arg0, false, arg1, arg2);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
    private final void method2673(int arg0) {
        this.field6401.method1972(1);
        this.field6401.method1967(this.field6404);
        this.field6401.method1992(this.field6401.method1961(arg0), 7681);
        this.field6401.method2006(1, 34167, 768);
        this.field6401.method2017(0, 34168, 770);
        this.field6401.method1972(0);
        this.field6401.method1967(this.field6402);
        this.field6401.method1992(34479, 7681);
        this.field6401.method2006(1, 34166, 768);
        if (this.field6399 == 0) {
            this.field6401.method1960(1.0F, 0.5F, 0.5F, 0.0F);
        } else if (this.field6399 == 1) {
            this.field6401.method1960(0.5F, 1.0F, 0.5F, 0.0F);
        } else if (this.field6399 == 2) {
            this.field6401.method1960(0.5F, 0.5F, 1.0F, 0.0F);
        } else if (this.field6399 == 3) {
            this.field6401.method1960(128.5F, 128.5F, 128.5F, 0.0F);
        }
    }
}
