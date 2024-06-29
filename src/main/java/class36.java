import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class36 extends class436 {

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
    private int field389 = 0;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
    private int field391 = 0;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
    private int field396 = 0;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
    private int field393 = 0;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
    private int field394 = 0;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "Z")
    private boolean field395 = false;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "Lh;")
    private class327 field388;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "Ldg;")
    private class10 field390;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "Ldg;")
    private class10 field392;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V", line = 3)
    private final void method229(int arg0) {
        this.field388.method2115(1);
        this.field388.method2088(this.field390);
        this.field388.method2056(this.field388.method2064(arg0), 7681);
        this.field388.method2077(1, 34167, 768);
        this.field388.method2066(0, 34168, 770);
        this.field388.method2115(0);
        this.field388.method2088(this.field392);
        this.field388.method2056(34479, 7681);
        this.field388.method2077(1, 34166, 768);
        if (this.field396 == 0) {
            this.field388.method2109(1.0F, 0.5F, 0.5F, 0.0F);
        } else if (this.field396 == 1) {
            this.field388.method2109(0.5F, 1.0F, 0.5F, 0.0F);
        } else if (this.field396 == 2) {
            this.field388.method2109(0.5F, 0.5F, 1.0F, 0.0F);
        } else if (this.field396 == 3) {
            this.field388.method2109(128.5F, 128.5F, 128.5F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "()I", line = 29)
    public final int method230() {
        return this.field390.field127;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(FFFFFFLem;II)V", line = 36)
    public final void method231(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class423 arg6, int arg7, int arg8) {
        class10 var10 = ((class100) arg6).field1172;
        if (this.field395) {
            float var11 = (float) this.method235();
            float var12 = (float) this.method236();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field393 * var15;
            float var18 = (float) this.field393 * var16;
            float var19 = (float) this.field389 * var13;
            float var20 = (float) this.field389 * var14;
            float var21 = (float) this.field391 * -var13;
            float var22 = (float) this.field391 * -var14;
            float var23 = (float) this.field394 * -var15;
            float var24 = (float) this.field394 * -var16;
            arg0 = arg0 + var19 + var17;
            arg1 = arg1 + var20 + var18;
            arg2 = arg2 + var21 + var17;
            arg3 = arg3 + var22 + var18;
            arg4 = arg4 + var19 + var23;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        opengl var27 = this.field388.field4363;
        this.field390.method1507(true);
        this.field388.method2094();
        this.field388.method2088(this.field390);
        this.field388.method2083(0);
        this.field388.method2115(1);
        this.field388.method2088(var10);
        this.field388.method2056(7681, 8448);
        this.field388.method2077(0, 34168, 768);
        this.field388.method2092(1);
        float var28 = var10.field126 / (float) var10.field127;
        float var29 = var10.field128 / (float) var10.field125;
        var27.glBegin(7);
        var27.glColor3f(1.0F, 1.0F, 1.0F);
        var27.glMultiTexCoord2f(33984, 0.0F, this.field390.field128);
        var27.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * var28, var10.field128 - (arg1 - (float) arg8) * var29);
        var27.glVertex2f(arg0, arg1);
        var27.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        var27.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * var28, var10.field128 - (arg5 - (float) arg8) * var29);
        var27.glVertex2f(arg4, arg5);
        var27.glMultiTexCoord2f(33984, this.field390.field126, 0.0F);
        var27.glMultiTexCoord2f(33985, (var25 - (float) arg7) * var28, var10.field128 - (var26 - (float) arg8) * var29);
        var27.glVertex2f(var25, var26);
        var27.glMultiTexCoord2f(33984, this.field390.field126, this.field390.field128);
        var27.glMultiTexCoord2f(33985, (arg2 - (float) arg7) * var28, var10.field128 - (arg3 - (float) arg8) * var29);
        var27.glVertex2f(arg2, arg3);
        var27.glEnd();
        this.field388.method2077(0, 5890, 768);
        this.field388.method2083(1);
        this.field388.method2088((class233) null);
        this.field388.method2115(0);
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(IIII)V", line = 117)
    public final void method232(int arg0, int arg1, int arg2, int arg3) {
        this.field389 = arg0;
        this.field393 = arg1;
        this.field391 = arg2;
        this.field394 = arg3;
        this.field395 = this.field389 != 0 || this.field393 != 0 || this.field391 != 0 || this.field394 != 0;
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Lh;IIII)V", line = 493)
    public class36(class327 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field388 = arg0;
        this.field390 = class10.method50(arg4, arg2, arg0, false, arg3, arg1);
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Lh;II[III)V", line = 600)
    public class36(class327 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field388 = arg0;
        this.field390 = class10.method51(arg1, false, arg0, (byte) -113, arg3, arg2);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(FFFFFFIII)V", line = 129)
    public final void method233(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field395) {
            float var10 = (float) this.method235();
            float var11 = (float) this.method236();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field393 * var14;
            float var17 = (float) this.field393 * var15;
            float var18 = (float) this.field389 * var12;
            float var19 = (float) this.field389 * var13;
            float var20 = (float) this.field391 * -var12;
            float var21 = (float) this.field391 * -var13;
            float var22 = (float) this.field394 * -var14;
            float var23 = (float) this.field394 * -var15;
            arg0 = arg0 + var18 + var16;
            arg1 = arg1 + var19 + var17;
            arg2 = arg2 + var20 + var16;
            arg3 = arg3 + var21 + var17;
            arg4 = arg4 + var18 + var22;
            arg5 = arg5 + var19 + var23;
        }
        float var24 = arg2 + arg4 - arg0;
        float var25 = arg5 + arg3 - arg1;
        opengl var26 = this.field388.field4363;
        this.field390.method1507(true);
        this.field388.method2094();
        this.field388.method2088(this.field390);
        this.field388.method2092(arg8);
        this.field388.method2083(arg6);
        var26.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        var26.glBegin(7);
        var26.glTexCoord2f(0.0F, this.field390.field128);
        var26.glVertex2f(arg0, arg1);
        var26.glTexCoord2f(0.0F, 0.0F);
        var26.glVertex2f(arg4, arg5);
        var26.glTexCoord2f(this.field390.field126, 0.0F);
        var26.glVertex2f(var24, var25);
        var26.glTexCoord2f(this.field390.field126, this.field390.field128);
        var26.glVertex2f(arg2, arg3);
        var26.glEnd();
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IILem;II)V", line = 198)
    public final void method165(int arg0, int arg1, class423 arg2, int arg3, int arg4) {
        class100 var6 = (class100) arg2;
        class10 var7 = var6.field1172;
        this.field390.method1507(false);
        this.field388.method2094();
        this.field388.method2088(this.field390);
        this.field388.method2083(0);
        this.field388.method2115(1);
        this.field388.method2088(var7);
        this.field388.method2056(7681, 8448);
        this.field388.method2077(0, 34168, 768);
        this.field388.method2092(1);
        int var8 = this.field389 + arg0;
        int var9 = this.field393 + arg1;
        int var10 = this.field390.field127 + var8;
        int var11 = this.field390.field125 + var9;
        float var12 = var7.field126 / (float) var7.field127;
        float var13 = var7.field128 / (float) var7.field125;
        float var14 = (float) (var8 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field128 - (float) (var9 - arg4) * var13;
        float var17 = var7.field128 - (float) (var11 - arg4) * var13;
        opengl var18 = this.field388.field4363;
        var18.glBegin(7);
        var18.glColor3f(1.0F, 1.0F, 1.0F);
        var18.glMultiTexCoord2f(33984, 0.0F, this.field390.field128);
        var18.glMultiTexCoord2f(33985, var14, var16);
        var18.glVertex2i(var8, var9);
        var18.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        var18.glMultiTexCoord2f(33985, var14, var17);
        var18.glVertex2i(var8, this.field390.field125 + var9);
        var18.glMultiTexCoord2f(33984, this.field390.field126, 0.0F);
        var18.glMultiTexCoord2f(33985, var15, var17);
        var18.glVertex2i(this.field390.field127 + var8, this.field390.field125 + var9);
        var18.glMultiTexCoord2f(33984, this.field390.field126, this.field390.field128);
        var18.glMultiTexCoord2f(33985, var15, var16);
        var18.glVertex2i(this.field390.field127 + var8, var9);
        var18.glEnd();
        this.field388.method2077(0, 5890, 768);
        this.field388.method2083(1);
        this.field388.method2088((class233) null);
        this.field388.method2115(0);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIIII)V", line = 255)
    public final void method234(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        opengl var8 = this.field388.field4363;
        int var9 = arg0 + arg2;
        int var10 = arg1 + arg3;
        this.field390.method1507(false);
        this.field388.method2094();
        this.field388.method2088(this.field390);
        this.field388.method2092(arg6);
        this.field388.method2083(arg4);
        var8.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field390.field124 && !this.field395) {
            float var11 = (float) arg3 * this.field390.field128 / (float) this.field390.field125;
            float var12 = (float) arg2 * this.field390.field126 / (float) this.field390.field127;
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
        var8.glTranslatef((float) this.field389, (float) this.field393, 0.0F);
        int var13 = this.method235();
        int var14 = this.method236();
        int var15 = this.field390.field125 + arg1;
        var8.glBegin(7);
        int var16 = arg1;
        while (var15 <= var10) {
            int var17 = this.field390.field127 + arg0;
            int var18 = arg0;
            while (var17 <= var9) {
                var8.glTexCoord2f(0.0F, this.field390.field128);
                var8.glVertex2i(var18, var16);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2i(var18, var15);
                var8.glTexCoord2f(this.field390.field126, 0.0F);
                var8.glVertex2i(var17, var15);
                var8.glTexCoord2f(this.field390.field126, this.field390.field128);
                var8.glVertex2i(var17, var16);
                var17 += var13;
                var18 += var13;
            }
            if (var18 < var9) {
                float var19 = (float) (var9 - var18) * this.field390.field126 / (float) this.field390.field127;
                var8.glTexCoord2f(0.0F, this.field390.field128);
                var8.glVertex2i(var18, var16);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2i(var18, var15);
                var8.glTexCoord2f(var19, 0.0F);
                var8.glVertex2i(var9, var15);
                var8.glTexCoord2f(var19, this.field390.field128);
                var8.glVertex2i(var9, var16);
            }
            var16 += var14;
            var15 += var14;
        }
        if (var16 < var10) {
            float var20 = (float) (this.field390.field125 - (var10 - var16)) * this.field390.field128 / (float) this.field390.field125;
            int var21 = this.field390.field127 + arg0;
            int var22 = arg0;
            while (var21 <= var9) {
                var8.glTexCoord2f(0.0F, this.field390.field128);
                var8.glVertex2i(var22, var16);
                var8.glTexCoord2f(0.0F, var20);
                var8.glVertex2i(var22, var10);
                var8.glTexCoord2f(this.field390.field126, var20);
                var8.glVertex2i(var21, var10);
                var8.glTexCoord2f(this.field390.field126, this.field390.field128);
                var8.glVertex2i(var21, var16);
                var21 += var13;
                var22 += var13;
            }
            if (var22 < var9) {
                float var23 = (float) (var9 - var22) * this.field390.field126 / (float) this.field390.field127;
                var8.glTexCoord2f(0.0F, this.field390.field128);
                var8.glVertex2i(var22, var16);
                var8.glTexCoord2f(0.0F, var20);
                var8.glVertex2i(var22, var10);
                var8.glTexCoord2f(var23, var20);
                var8.glVertex2i(var9, var10);
                var8.glTexCoord2f(var23, this.field390.field128);
                var8.glVertex2i(var9, var16);
            }
        }
        var8.glEnd();
        var8.glPopMatrix();
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIII)V", line = 390)
    public final void method167(int arg0, int arg1, int arg2, int arg3, int arg4) {
        opengl var6 = this.field388.field4363;
        this.field390.method1507(false);
        this.field388.method2094();
        this.field388.method2092(arg4);
        var6.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var7 = this.field389 + arg0;
        int var8 = this.field393 + arg1;
        if (this.field392 == null) {
            this.field388.method2088(this.field390);
            this.field388.method2083(arg2);
            var6.glBegin(7);
            var6.glTexCoord2f(0.0F, this.field390.field128);
            var6.glVertex2i(var7, var8);
            var6.glTexCoord2f(0.0F, 0.0F);
            var6.glVertex2i(var7, this.field390.field125 + var8);
            var6.glTexCoord2f(this.field390.field126, 0.0F);
            var6.glVertex2i(this.field390.field127 + var7, this.field390.field125 + var8);
            var6.glTexCoord2f(this.field390.field126, this.field390.field128);
            var6.glVertex2i(this.field390.field127 + var7, var8);
            var6.glEnd();
            return;
        }
        this.method229(arg2);
        this.field392.method1507(false);
        var6.glBegin(7);
        var6.glMultiTexCoord2f(33985, 0.0F, this.field390.field128);
        var6.glTexCoord2f(0.0F, this.field390.field128);
        var6.glVertex2i(var7, var8);
        var6.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var6.glTexCoord2f(0.0F, 0.0F);
        var6.glVertex2i(var7, this.field390.field125 + var8);
        var6.glMultiTexCoord2f(33985, this.field390.field126, 0.0F);
        var6.glTexCoord2f(this.field390.field126, 0.0F);
        var6.glVertex2i(this.field390.field127 + var7, this.field390.field125 + var8);
        var6.glMultiTexCoord2f(33985, this.field390.field126, this.field390.field128);
        var6.glTexCoord2f(this.field390.field126, this.field390.field128);
        var6.glVertex2i(this.field390.field127 + var7, var8);
        var6.glEnd();
        this.method238();
    }

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "()I", line = 438)
    public final int method235() {
        return this.field390.field127 + this.field389 + this.field391;
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "()I", line = 441)
    public final int method236() {
        return this.field390.field125 + this.field393 + this.field394;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "()I", line = 448)
    public final int method237() {
        return this.field390.field125;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIII)V", line = 453)
    public final void method168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field390.method1972(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "()V", line = 459)
    private final void method238() {
        this.field388.method2115(1);
        this.field388.method2088((class233) null);
        this.field388.method2056(8448, 8448);
        this.field388.method2077(1, 34168, 768);
        this.field388.method2066(0, 5890, 770);
        this.field388.method2115(0);
        this.field388.method2077(1, 34168, 768);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(III)V", line = 475)
    public final void method164(int arg0, int arg1, int arg2) {
        opengl var4 = this.field388.field4363;
        var4.glPixelTransferf(3348, 0.5F);
        var4.glPixelTransferf(3349, 0.499F);
        var4.glPixelTransferf(3352, 0.5F);
        var4.glPixelTransferf(3353, 0.499F);
        var4.glPixelTransferf(3354, 0.5F);
        var4.glPixelTransferf(3355, 0.499F);
        this.field392 = class10.method50(this.field390.field125, arg1, this.field388, false, this.field390.field127, arg0);
        this.field396 = arg2;
        var4.glPixelTransferf(3348, 1.0F);
        var4.glPixelTransferf(3349, 0.0F);
        var4.glPixelTransferf(3352, 1.0F);
        var4.glPixelTransferf(3353, 0.0F);
        var4.glPixelTransferf(3354, 1.0F);
        var4.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(IIIIIII)V", line = 501)
    public final void method163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        opengl var8 = this.field388.field4363;
        this.field390.method1507(true);
        this.field388.method2094();
        this.field388.method2092(arg6);
        var8.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field395) {
            float var9 = (float) arg2 / (float) this.method235();
            float var10 = (float) arg3 / (float) this.method236();
            float var11 = (float) this.field389 * var9 + (float) arg0;
            float var12 = (float) this.field393 * var10 + (float) arg1;
            float var13 = (float) this.field390.field127 * var9 + var11;
            float var14 = (float) this.field390.field125 * var10 + var12;
            if (this.field392 == null) {
                this.field388.method2088(this.field390);
                this.field388.method2083(arg4);
                var8.glBegin(7);
                var8.glTexCoord2f(0.0F, this.field390.field128);
                var8.glVertex2f(var11, var12);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2f(var11, var14);
                var8.glTexCoord2f(this.field390.field126, 0.0F);
                var8.glVertex2f(var13, var14);
                var8.glTexCoord2f(this.field390.field126, this.field390.field128);
                var8.glVertex2f(var13, var12);
                var8.glEnd();
            } else {
                this.method229(arg4);
                this.field392.method1507(true);
                var8.glBegin(7);
                var8.glMultiTexCoord2f(33985, 0.0F, this.field390.field128);
                var8.glTexCoord2f(0.0F, this.field390.field128);
                var8.glVertex2f(var11, var12);
                var8.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2f(var11, var14);
                var8.glMultiTexCoord2f(33985, this.field390.field126, 0.0F);
                var8.glTexCoord2f(this.field390.field126, 0.0F);
                var8.glVertex2f(var13, var14);
                var8.glMultiTexCoord2f(33985, this.field390.field126, this.field390.field128);
                var8.glTexCoord2f(this.field390.field126, this.field390.field128);
                var8.glVertex2f(var13, var12);
                var8.glEnd();
                this.method238();
            }
        } else if (this.field392 == null) {
            this.field388.method2088(this.field390);
            this.field388.method2083(arg4);
            var8.glBegin(7);
            var8.glTexCoord2f(0.0F, this.field390.field128);
            var8.glVertex2i(arg0, arg1);
            var8.glTexCoord2f(0.0F, 0.0F);
            var8.glVertex2i(arg0, arg1 + arg3);
            var8.glTexCoord2f(this.field390.field126, 0.0F);
            var8.glVertex2i(arg0 + arg2, arg1 + arg3);
            var8.glTexCoord2f(this.field390.field126, this.field390.field128);
            var8.glVertex2i(arg0 + arg2, arg1);
            var8.glEnd();
        } else {
            this.method229(arg4);
            this.field392.method1507(true);
            var8.glBegin(7);
            var8.glMultiTexCoord2f(33985, 0.0F, this.field390.field128);
            var8.glTexCoord2f(0.0F, this.field390.field128);
            var8.glVertex2i(arg0, arg1);
            var8.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            var8.glTexCoord2f(0.0F, 0.0F);
            var8.glVertex2i(arg0, arg1 + arg3);
            var8.glMultiTexCoord2f(33985, this.field390.field126, 0.0F);
            var8.glTexCoord2f(this.field390.field126, 0.0F);
            var8.glVertex2i(arg0 + arg2, arg1 + arg3);
            var8.glMultiTexCoord2f(33985, this.field390.field126, this.field390.field128);
            var8.glTexCoord2f(this.field390.field126, this.field390.field128);
            var8.glVertex2i(arg0 + arg2, arg1);
            var8.glEnd();
            this.method238();
        }
    }
}
