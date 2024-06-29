import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class178 extends class243 {

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    private int field2337 = 0;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
    private int field2341 = 0;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    private int field2338 = 0;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
    private int field2340 = 0;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
    private int field2344 = 0;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "Z")
    private boolean field2345 = false;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "Lih;")
    private class330 field2342;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "Lns;")
    private class173 field2339;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "Lns;")
    private class173 field2343;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "()V")
    private final void method1086() {
        this.field2342.method2037(1);
        this.field2342.method2186((class223) null);
        this.field2342.method2109(8448, 8448);
        this.field2342.method2072(1, 34168, 768);
        this.field2342.method2029(0, 5890, 770);
        this.field2342.method2037(0);
        this.field2342.method2072(1, 34168, 768);
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(IIIIIII)V")
    public final void method1087(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        opengl var8 = this.field2342.field4741;
        int var9 = arg0 + arg2;
        int var10 = arg1 + arg3;
        this.field2339.method1390(false);
        this.field2342.method2076();
        this.field2342.method2186(this.field2339);
        this.field2342.method2044(arg6);
        this.field2342.method2171(arg4);
        var8.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field2339.field2262 && !this.field2345) {
            float var11 = (float) arg3 * this.field2339.field2263 / (float) this.field2339.field2261;
            float var12 = (float) arg2 * this.field2339.field2260 / (float) this.field2339.field2264;
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
        var8.glTranslatef((float) this.field2341, (float) this.field2337, 0.0F);
        int var13 = this.method1088();
        int var14 = this.method1091();
        int var15 = this.field2339.field2261 + arg1;
        var8.glBegin(7);
        int var16 = arg1;
        while (var15 <= var10) {
            int var17 = this.field2339.field2264 + arg0;
            int var18 = arg0;
            while (var17 <= var9) {
                var8.glTexCoord2f(0.0F, this.field2339.field2263);
                var8.glVertex2i(var18, var16);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2i(var18, var15);
                var8.glTexCoord2f(this.field2339.field2260, 0.0F);
                var8.glVertex2i(var17, var15);
                var8.glTexCoord2f(this.field2339.field2260, this.field2339.field2263);
                var8.glVertex2i(var17, var16);
                var17 += var13;
                var18 += var13;
            }
            if (var18 < var9) {
                float var19 = (float) (var9 - var18) * this.field2339.field2260 / (float) this.field2339.field2264;
                var8.glTexCoord2f(0.0F, this.field2339.field2263);
                var8.glVertex2i(var18, var16);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2i(var18, var15);
                var8.glTexCoord2f(var19, 0.0F);
                var8.glVertex2i(var9, var15);
                var8.glTexCoord2f(var19, this.field2339.field2263);
                var8.glVertex2i(var9, var16);
            }
            var16 += var14;
            var15 += var14;
        }
        if (var16 < var10) {
            float var20 = (float) (this.field2339.field2261 - (var10 - var16)) * this.field2339.field2263 / (float) this.field2339.field2261;
            int var21 = this.field2339.field2264 + arg0;
            int var22 = arg0;
            while (var21 <= var9) {
                var8.glTexCoord2f(0.0F, this.field2339.field2263);
                var8.glVertex2i(var22, var16);
                var8.glTexCoord2f(0.0F, var20);
                var8.glVertex2i(var22, var10);
                var8.glTexCoord2f(this.field2339.field2260, var20);
                var8.glVertex2i(var21, var10);
                var8.glTexCoord2f(this.field2339.field2260, this.field2339.field2263);
                var8.glVertex2i(var21, var16);
                var21 += var13;
                var22 += var13;
            }
            if (var22 < var9) {
                float var23 = (float) (var9 - var22) * this.field2339.field2260 / (float) this.field2339.field2264;
                var8.glTexCoord2f(0.0F, this.field2339.field2263);
                var8.glVertex2i(var22, var16);
                var8.glTexCoord2f(0.0F, var20);
                var8.glVertex2i(var22, var10);
                var8.glTexCoord2f(var23, var20);
                var8.glVertex2i(var9, var10);
                var8.glTexCoord2f(var23, this.field2339.field2263);
                var8.glVertex2i(var9, var16);
            }
        }
        var8.glEnd();
        var8.glPopMatrix();
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIII)V")
    public final void method36(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2339.method943(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "()I")
    public final int method1088() {
        return this.field2339.field2264 + this.field2341 + this.field2340;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IILsn;II)V")
    public final void method34(int arg0, int arg1, class449 arg2, int arg3, int arg4) {
        class221 var6 = (class221) arg2;
        class173 var7 = var6.field3143;
        this.field2339.method1390(false);
        this.field2342.method2076();
        this.field2342.method2186(this.field2339);
        this.field2342.method2171(0);
        this.field2342.method2037(1);
        this.field2342.method2186(var7);
        this.field2342.method2109(7681, 8448);
        this.field2342.method2072(0, 34168, 768);
        this.field2342.method2044(1);
        int var8 = this.field2341 + arg0;
        int var9 = this.field2337 + arg1;
        int var10 = this.field2339.field2264 + var8;
        int var11 = this.field2339.field2261 + var9;
        float var12 = var7.field2260 / (float) var7.field2264;
        float var13 = var7.field2263 / (float) var7.field2261;
        float var14 = (float) (var8 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field2263 - (float) (var9 - arg4) * var13;
        float var17 = var7.field2263 - (float) (var11 - arg4) * var13;
        opengl var18 = this.field2342.field4741;
        var18.glBegin(7);
        var18.glColor3f(1.0F, 1.0F, 1.0F);
        var18.glMultiTexCoord2f(33984, 0.0F, this.field2339.field2263);
        var18.glMultiTexCoord2f(33985, var14, var16);
        var18.glVertex2i(var8, var9);
        var18.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        var18.glMultiTexCoord2f(33985, var14, var17);
        var18.glVertex2i(var8, this.field2339.field2261 + var9);
        var18.glMultiTexCoord2f(33984, this.field2339.field2260, 0.0F);
        var18.glMultiTexCoord2f(33985, var15, var17);
        var18.glVertex2i(this.field2339.field2264 + var8, this.field2339.field2261 + var9);
        var18.glMultiTexCoord2f(33984, this.field2339.field2260, this.field2339.field2263);
        var18.glMultiTexCoord2f(33985, var15, var16);
        var18.glVertex2i(this.field2339.field2264 + var8, var9);
        var18.glEnd();
        this.field2342.method2072(0, 5890, 768);
        this.field2342.method2171(1);
        this.field2342.method2186((class223) null);
        this.field2342.method2037(0);
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(IIII)V")
    public final void method1089(int arg0, int arg1, int arg2, int arg3) {
        this.field2341 = arg0;
        this.field2337 = arg1;
        this.field2340 = arg2;
        this.field2338 = arg3;
        this.field2345 = this.field2341 != 0 || this.field2337 != 0 || this.field2340 != 0 || this.field2338 != 0;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "()I")
    public final int method1090() {
        return this.field2339.field2261;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "()I")
    public final int method1091() {
        return this.field2339.field2261 + this.field2337 + this.field2338;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(FFFFFFIII)V")
    public final void method1092(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field2345) {
            float var10 = (float) this.method1088();
            float var11 = (float) this.method1091();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field2337 * var14;
            float var17 = (float) this.field2337 * var15;
            float var18 = (float) this.field2341 * var12;
            float var19 = (float) this.field2341 * var13;
            float var20 = (float) this.field2340 * -var12;
            float var21 = (float) this.field2340 * -var13;
            float var22 = (float) this.field2338 * -var14;
            float var23 = (float) this.field2338 * -var15;
            arg0 = arg0 + var18 + var16;
            arg1 = arg1 + var19 + var17;
            arg2 = arg2 + var20 + var16;
            arg3 = arg3 + var21 + var17;
            arg4 = arg4 + var18 + var22;
            arg5 = arg5 + var19 + var23;
        }
        float var24 = arg2 + arg4 - arg0;
        float var25 = arg5 + arg3 - arg1;
        opengl var26 = this.field2342.field4741;
        this.field2339.method1390(true);
        this.field2342.method2076();
        this.field2342.method2186(this.field2339);
        this.field2342.method2044(arg8);
        this.field2342.method2171(arg6);
        var26.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        var26.glBegin(7);
        var26.glTexCoord2f(0.0F, this.field2339.field2263);
        var26.glVertex2f(arg0, arg1);
        var26.glTexCoord2f(0.0F, 0.0F);
        var26.glVertex2f(arg4, arg5);
        var26.glTexCoord2f(this.field2339.field2260, 0.0F);
        var26.glVertex2f(var24, var25);
        var26.glTexCoord2f(this.field2339.field2260, this.field2339.field2263);
        var26.glVertex2f(arg2, arg3);
        var26.glEnd();
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(III)V")
    public final void method33(int arg0, int arg1, int arg2) {
        opengl var4 = this.field2342.field4741;
        var4.glPixelTransferf(3348, 0.5F);
        var4.glPixelTransferf(3349, 0.499F);
        var4.glPixelTransferf(3352, 0.5F);
        var4.glPixelTransferf(3353, 0.499F);
        var4.glPixelTransferf(3354, 0.5F);
        var4.glPixelTransferf(3355, 0.499F);
        this.field2343 = class173.method1061(this.field2339.field2261, this.field2342, arg1, this.field2339.field2264, arg0, (byte) 116);
        this.field2344 = arg2;
        var4.glPixelTransferf(3348, 1.0F);
        var4.glPixelTransferf(3349, 0.0F);
        var4.glPixelTransferf(3352, 1.0F);
        var4.glPixelTransferf(3353, 0.0F);
        var4.glPixelTransferf(3354, 1.0F);
        var4.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIII)V")
    public final void method35(int arg0, int arg1, int arg2, int arg3, int arg4) {
        opengl var6 = this.field2342.field4741;
        this.field2339.method1390(false);
        this.field2342.method2076();
        this.field2342.method2044(arg4);
        var6.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var7 = this.field2341 + arg0;
        int var8 = this.field2337 + arg1;
        if (this.field2343 == null) {
            this.field2342.method2186(this.field2339);
            this.field2342.method2171(arg2);
            var6.glBegin(7);
            var6.glTexCoord2f(0.0F, this.field2339.field2263);
            var6.glVertex2i(var7, var8);
            var6.glTexCoord2f(0.0F, 0.0F);
            var6.glVertex2i(var7, this.field2339.field2261 + var8);
            var6.glTexCoord2f(this.field2339.field2260, 0.0F);
            var6.glVertex2i(this.field2339.field2264 + var7, this.field2339.field2261 + var8);
            var6.glTexCoord2f(this.field2339.field2260, this.field2339.field2263);
            var6.glVertex2i(this.field2339.field2264 + var7, var8);
            var6.glEnd();
            return;
        }
        this.method1093(arg2);
        this.field2343.method1390(false);
        var6.glBegin(7);
        var6.glMultiTexCoord2f(33985, 0.0F, this.field2339.field2263);
        var6.glTexCoord2f(0.0F, this.field2339.field2263);
        var6.glVertex2i(var7, var8);
        var6.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var6.glTexCoord2f(0.0F, 0.0F);
        var6.glVertex2i(var7, this.field2339.field2261 + var8);
        var6.glMultiTexCoord2f(33985, this.field2339.field2260, 0.0F);
        var6.glTexCoord2f(this.field2339.field2260, 0.0F);
        var6.glVertex2i(this.field2339.field2264 + var7, this.field2339.field2261 + var8);
        var6.glMultiTexCoord2f(33985, this.field2339.field2260, this.field2339.field2263);
        var6.glTexCoord2f(this.field2339.field2260, this.field2339.field2263);
        var6.glVertex2i(this.field2339.field2264 + var7, var8);
        var6.glEnd();
        this.method1086();
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V")
    private final void method1093(int arg0) {
        this.field2342.method2037(1);
        this.field2342.method2186(this.field2339);
        this.field2342.method2109(this.field2342.method2141(arg0), 7681);
        this.field2342.method2072(1, 34167, 768);
        this.field2342.method2029(0, 34168, 770);
        this.field2342.method2037(0);
        this.field2342.method2186(this.field2343);
        this.field2342.method2109(34479, 7681);
        this.field2342.method2072(1, 34166, 768);
        if (this.field2344 == 0) {
            this.field2342.method2094(1.0F, 0.5F, 0.5F, 0.0F);
        } else if (this.field2344 == 1) {
            this.field2342.method2094(0.5F, 1.0F, 0.5F, 0.0F);
        } else if (this.field2344 == 2) {
            this.field2342.method2094(0.5F, 0.5F, 1.0F, 0.0F);
        } else if (this.field2344 == 3) {
            this.field2342.method2094(128.5F, 128.5F, 128.5F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(FFFFFFLsn;II)V")
    public final void method1094(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class449 arg6, int arg7, int arg8) {
        class173 var10 = ((class221) arg6).field3143;
        if (this.field2345) {
            float var11 = (float) this.method1088();
            float var12 = (float) this.method1091();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field2337 * var15;
            float var18 = (float) this.field2337 * var16;
            float var19 = (float) this.field2341 * var13;
            float var20 = (float) this.field2341 * var14;
            float var21 = (float) this.field2340 * -var13;
            float var22 = (float) this.field2340 * -var14;
            float var23 = (float) this.field2338 * -var15;
            float var24 = (float) this.field2338 * -var16;
            arg0 = arg0 + var19 + var17;
            arg1 = arg1 + var20 + var18;
            arg2 = arg2 + var21 + var17;
            arg3 = arg3 + var22 + var18;
            arg4 = arg4 + var19 + var23;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        opengl var27 = this.field2342.field4741;
        this.field2339.method1390(true);
        this.field2342.method2076();
        this.field2342.method2186(this.field2339);
        this.field2342.method2171(0);
        this.field2342.method2037(1);
        this.field2342.method2186(var10);
        this.field2342.method2109(7681, 8448);
        this.field2342.method2072(0, 34168, 768);
        this.field2342.method2044(1);
        float var28 = var10.field2260 / (float) var10.field2264;
        float var29 = var10.field2263 / (float) var10.field2261;
        var27.glBegin(7);
        var27.glColor3f(1.0F, 1.0F, 1.0F);
        var27.glMultiTexCoord2f(33984, 0.0F, this.field2339.field2263);
        var27.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * var28, var10.field2263 - (arg1 - (float) arg8) * var29);
        var27.glVertex2f(arg0, arg1);
        var27.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        var27.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * var28, var10.field2263 - (arg5 - (float) arg8) * var29);
        var27.glVertex2f(arg4, arg5);
        var27.glMultiTexCoord2f(33984, this.field2339.field2260, 0.0F);
        var27.glMultiTexCoord2f(33985, (var25 - (float) arg7) * var28, var10.field2263 - (var26 - (float) arg8) * var29);
        var27.glVertex2f(var25, var26);
        var27.glMultiTexCoord2f(33984, this.field2339.field2260, this.field2339.field2263);
        var27.glMultiTexCoord2f(33985, (arg2 - (float) arg7) * var28, var10.field2263 - (arg3 - (float) arg8) * var29);
        var27.glVertex2f(arg2, arg3);
        var27.glEnd();
        this.field2342.method2072(0, 5890, 768);
        this.field2342.method2171(1);
        this.field2342.method2186((class223) null);
        this.field2342.method2037(0);
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "()I")
    public final int method1095() {
        return this.field2339.field2264;
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lih;IIII)V")
    public class178(class330 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2342 = arg0;
        this.field2339 = class173.method1061(arg4, arg0, arg2, arg3, arg1, (byte) 116);
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lih;II[III)V")
    public class178(class330 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field2342 = arg0;
        this.field2339 = class173.method1060(arg2, arg0, arg1, -100, arg3, false);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIIII)V")
    public final void method32(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        opengl var8 = this.field2342.field4741;
        this.field2339.method1390(true);
        this.field2342.method2076();
        this.field2342.method2044(arg6);
        var8.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field2345) {
            float var9 = (float) arg2 / (float) this.method1088();
            float var10 = (float) arg3 / (float) this.method1091();
            float var11 = (float) this.field2341 * var9 + (float) arg0;
            float var12 = (float) this.field2337 * var10 + (float) arg1;
            float var13 = (float) this.field2339.field2264 * var9 + var11;
            float var14 = (float) this.field2339.field2261 * var10 + var12;
            if (this.field2343 == null) {
                this.field2342.method2186(this.field2339);
                this.field2342.method2171(arg4);
                var8.glBegin(7);
                var8.glTexCoord2f(0.0F, this.field2339.field2263);
                var8.glVertex2f(var11, var12);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2f(var11, var14);
                var8.glTexCoord2f(this.field2339.field2260, 0.0F);
                var8.glVertex2f(var13, var14);
                var8.glTexCoord2f(this.field2339.field2260, this.field2339.field2263);
                var8.glVertex2f(var13, var12);
                var8.glEnd();
            } else {
                this.method1093(arg4);
                this.field2343.method1390(true);
                var8.glBegin(7);
                var8.glMultiTexCoord2f(33985, 0.0F, this.field2339.field2263);
                var8.glTexCoord2f(0.0F, this.field2339.field2263);
                var8.glVertex2f(var11, var12);
                var8.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2f(var11, var14);
                var8.glMultiTexCoord2f(33985, this.field2339.field2260, 0.0F);
                var8.glTexCoord2f(this.field2339.field2260, 0.0F);
                var8.glVertex2f(var13, var14);
                var8.glMultiTexCoord2f(33985, this.field2339.field2260, this.field2339.field2263);
                var8.glTexCoord2f(this.field2339.field2260, this.field2339.field2263);
                var8.glVertex2f(var13, var12);
                var8.glEnd();
                this.method1086();
            }
        } else if (this.field2343 == null) {
            this.field2342.method2186(this.field2339);
            this.field2342.method2171(arg4);
            var8.glBegin(7);
            var8.glTexCoord2f(0.0F, this.field2339.field2263);
            var8.glVertex2i(arg0, arg1);
            var8.glTexCoord2f(0.0F, 0.0F);
            var8.glVertex2i(arg0, arg1 + arg3);
            var8.glTexCoord2f(this.field2339.field2260, 0.0F);
            var8.glVertex2i(arg0 + arg2, arg1 + arg3);
            var8.glTexCoord2f(this.field2339.field2260, this.field2339.field2263);
            var8.glVertex2i(arg0 + arg2, arg1);
            var8.glEnd();
        } else {
            this.method1093(arg4);
            this.field2343.method1390(true);
            var8.glBegin(7);
            var8.glMultiTexCoord2f(33985, 0.0F, this.field2339.field2263);
            var8.glTexCoord2f(0.0F, this.field2339.field2263);
            var8.glVertex2i(arg0, arg1);
            var8.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            var8.glTexCoord2f(0.0F, 0.0F);
            var8.glVertex2i(arg0, arg1 + arg3);
            var8.glMultiTexCoord2f(33985, this.field2339.field2260, 0.0F);
            var8.glTexCoord2f(this.field2339.field2260, 0.0F);
            var8.glVertex2i(arg0 + arg2, arg1 + arg3);
            var8.glMultiTexCoord2f(33985, this.field2339.field2260, this.field2339.field2263);
            var8.glTexCoord2f(this.field2339.field2260, this.field2339.field2263);
            var8.glVertex2i(arg0 + arg2, arg1);
            var8.glEnd();
            this.method1086();
        }
    }
}
