import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class91 extends class385 {

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
    private int field1351 = 0;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
    private int field1352 = 0;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
    private int field1353 = 0;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
    private int field1355 = 0;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "Z")
    private boolean field1354 = false;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "I")
    private int field1356 = 0;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "Lqi;")
    private class458 field1350;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "Lr;")
    private class414 field1349;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "Lr;")
    private class414 field1348;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "()I")
    public final int method389() {
        return this.field1349.field5721 + this.field1356 + this.field1355;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(FFFFFFIII)V")
    public final void method387(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field1354) {
            float var10 = (float) this.method382();
            float var11 = (float) this.method389();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field1356 * var14;
            float var17 = (float) this.field1356 * var15;
            float var18 = (float) this.field1351 * var12;
            float var19 = (float) this.field1351 * var13;
            float var20 = (float) this.field1352 * -var12;
            float var21 = (float) this.field1352 * -var13;
            float var22 = (float) this.field1355 * -var14;
            float var23 = (float) this.field1355 * -var15;
            arg0 = arg0 + var18 + var16;
            arg1 = arg1 + var19 + var17;
            arg2 = arg2 + var20 + var16;
            arg3 = arg3 + var21 + var17;
            arg4 = arg4 + var18 + var22;
            arg5 = arg5 + var19 + var23;
        }
        float var24 = arg2 + arg4 - arg0;
        float var25 = arg5 + arg3 - arg1;
        opengl var26 = this.field1350.field6330;
        this.field1349.method1168(true);
        this.field1350.method2704();
        this.field1350.method2692(this.field1349);
        this.field1350.method2653(arg8);
        this.field1350.method2696(arg6);
        var26.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        var26.glBegin(7);
        var26.glTexCoord2f(0.0F, this.field1349.field5720);
        var26.glVertex2f(arg0, arg1);
        var26.glTexCoord2f(0.0F, 0.0F);
        var26.glVertex2f(arg4, arg5);
        var26.glTexCoord2f(this.field1349.field5718, 0.0F);
        var26.glVertex2f(var24, var25);
        var26.glTexCoord2f(this.field1349.field5718, this.field1349.field5720);
        var26.glVertex2f(arg2, arg3);
        var26.glEnd();
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(IIIIIII)V")
    public final void method384(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        opengl var8 = this.field1350.field6330;
        this.field1349.method1168(true);
        this.field1350.method2704();
        this.field1350.method2653(arg6);
        var8.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field1354) {
            float var9 = (float) arg2 / (float) this.method382();
            float var10 = (float) arg3 / (float) this.method389();
            float var11 = (float) this.field1351 * var9 + (float) arg0;
            float var12 = (float) this.field1356 * var10 + (float) arg1;
            float var13 = (float) this.field1349.field5719 * var9 + var11;
            float var14 = (float) this.field1349.field5721 * var10 + var12;
            if (this.field1348 == null) {
                this.field1350.method2692(this.field1349);
                this.field1350.method2696(arg4);
                var8.glBegin(7);
                var8.glTexCoord2f(0.0F, this.field1349.field5720);
                var8.glVertex2f(var11, var12);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2f(var11, var14);
                var8.glTexCoord2f(this.field1349.field5718, 0.0F);
                var8.glVertex2f(var13, var14);
                var8.glTexCoord2f(this.field1349.field5718, this.field1349.field5720);
                var8.glVertex2f(var13, var12);
                var8.glEnd();
            } else {
                this.method614(arg4);
                this.field1348.method1168(true);
                var8.glBegin(7);
                var8.glMultiTexCoord2f(33985, 0.0F, this.field1349.field5720);
                var8.glTexCoord2f(0.0F, this.field1349.field5720);
                var8.glVertex2f(var11, var12);
                var8.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2f(var11, var14);
                var8.glMultiTexCoord2f(33985, this.field1349.field5718, 0.0F);
                var8.glTexCoord2f(this.field1349.field5718, 0.0F);
                var8.glVertex2f(var13, var14);
                var8.glMultiTexCoord2f(33985, this.field1349.field5718, this.field1349.field5720);
                var8.glTexCoord2f(this.field1349.field5718, this.field1349.field5720);
                var8.glVertex2f(var13, var12);
                var8.glEnd();
                this.method611();
            }
        } else if (this.field1348 == null) {
            this.field1350.method2692(this.field1349);
            this.field1350.method2696(arg4);
            var8.glBegin(7);
            var8.glTexCoord2f(0.0F, this.field1349.field5720);
            var8.glVertex2i(arg0, arg1);
            var8.glTexCoord2f(0.0F, 0.0F);
            var8.glVertex2i(arg0, arg1 + arg3);
            var8.glTexCoord2f(this.field1349.field5718, 0.0F);
            var8.glVertex2i(arg0 + arg2, arg1 + arg3);
            var8.glTexCoord2f(this.field1349.field5718, this.field1349.field5720);
            var8.glVertex2i(arg0 + arg2, arg1);
            var8.glEnd();
        } else {
            this.method614(arg4);
            this.field1348.method1168(true);
            var8.glBegin(7);
            var8.glMultiTexCoord2f(33985, 0.0F, this.field1349.field5720);
            var8.glTexCoord2f(0.0F, this.field1349.field5720);
            var8.glVertex2i(arg0, arg1);
            var8.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            var8.glTexCoord2f(0.0F, 0.0F);
            var8.glVertex2i(arg0, arg1 + arg3);
            var8.glMultiTexCoord2f(33985, this.field1349.field5718, 0.0F);
            var8.glTexCoord2f(this.field1349.field5718, 0.0F);
            var8.glVertex2i(arg0 + arg2, arg1 + arg3);
            var8.glMultiTexCoord2f(33985, this.field1349.field5718, this.field1349.field5720);
            var8.glTexCoord2f(this.field1349.field5718, this.field1349.field5720);
            var8.glVertex2i(arg0 + arg2, arg1);
            var8.glEnd();
            this.method611();
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIII)V")
    public final void method385(int arg0, int arg1, int arg2, int arg3, int arg4) {
        opengl var6 = this.field1350.field6330;
        this.field1349.method1168(false);
        this.field1350.method2704();
        this.field1350.method2653(arg4);
        var6.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var7 = this.field1351 + arg0;
        int var8 = this.field1356 + arg1;
        if (this.field1348 == null) {
            this.field1350.method2692(this.field1349);
            this.field1350.method2696(arg2);
            var6.glBegin(7);
            var6.glTexCoord2f(0.0F, this.field1349.field5720);
            var6.glVertex2i(var7, var8);
            var6.glTexCoord2f(0.0F, 0.0F);
            var6.glVertex2i(var7, this.field1349.field5721 + var8);
            var6.glTexCoord2f(this.field1349.field5718, 0.0F);
            var6.glVertex2i(this.field1349.field5719 + var7, this.field1349.field5721 + var8);
            var6.glTexCoord2f(this.field1349.field5718, this.field1349.field5720);
            var6.glVertex2i(this.field1349.field5719 + var7, var8);
            var6.glEnd();
            return;
        }
        this.method614(arg2);
        this.field1348.method1168(false);
        var6.glBegin(7);
        var6.glMultiTexCoord2f(33985, 0.0F, this.field1349.field5720);
        var6.glTexCoord2f(0.0F, this.field1349.field5720);
        var6.glVertex2i(var7, var8);
        var6.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var6.glTexCoord2f(0.0F, 0.0F);
        var6.glVertex2i(var7, this.field1349.field5721 + var8);
        var6.glMultiTexCoord2f(33985, this.field1349.field5718, 0.0F);
        var6.glTexCoord2f(this.field1349.field5718, 0.0F);
        var6.glVertex2i(this.field1349.field5719 + var7, this.field1349.field5721 + var8);
        var6.glMultiTexCoord2f(33985, this.field1349.field5718, this.field1349.field5720);
        var6.glTexCoord2f(this.field1349.field5718, this.field1349.field5720);
        var6.glVertex2i(this.field1349.field5719 + var7, var8);
        var6.glEnd();
        this.method611();
    }

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "()V")
    private final void method611() {
        this.field1350.method2660(1);
        this.field1350.method2692((class179) null);
        this.field1350.method2702(8448, 8448);
        this.field1350.method2670(1, 34168, 768);
        this.field1350.method2709(0, 5890, 770);
        this.field1350.method2660(0);
        this.field1350.method2670(1, 34168, 768);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "()I")
    public final int method382() {
        return this.field1349.field5719 + this.field1351 + this.field1352;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIIIII)V")
    public final void method383(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        opengl var8 = this.field1350.field6330;
        int var9 = arg0 + arg2;
        int var10 = arg1 + arg3;
        this.field1349.method1168(false);
        this.field1350.method2704();
        this.field1350.method2692(this.field1349);
        this.field1350.method2653(arg6);
        this.field1350.method2696(arg4);
        var8.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field1349.field5722 && !this.field1354) {
            float var11 = (float) arg3 * this.field1349.field5720 / (float) this.field1349.field5721;
            float var12 = (float) arg2 * this.field1349.field5718 / (float) this.field1349.field5719;
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
        var8.glTranslatef((float) this.field1351, (float) this.field1356, 0.0F);
        int var13 = this.method382();
        int var14 = this.method389();
        int var15 = this.field1349.field5721 + arg1;
        var8.glBegin(7);
        int var16 = arg1;
        while (var15 <= var10) {
            int var17 = this.field1349.field5719 + arg0;
            int var18 = arg0;
            while (var17 <= var9) {
                var8.glTexCoord2f(0.0F, this.field1349.field5720);
                var8.glVertex2i(var18, var16);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2i(var18, var15);
                var8.glTexCoord2f(this.field1349.field5718, 0.0F);
                var8.glVertex2i(var17, var15);
                var8.glTexCoord2f(this.field1349.field5718, this.field1349.field5720);
                var8.glVertex2i(var17, var16);
                var17 += var13;
                var18 += var13;
            }
            if (var18 < var9) {
                float var19 = (float) (var9 - var18) * this.field1349.field5718 / (float) this.field1349.field5719;
                var8.glTexCoord2f(0.0F, this.field1349.field5720);
                var8.glVertex2i(var18, var16);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2i(var18, var15);
                var8.glTexCoord2f(var19, 0.0F);
                var8.glVertex2i(var9, var15);
                var8.glTexCoord2f(var19, this.field1349.field5720);
                var8.glVertex2i(var9, var16);
            }
            var16 += var14;
            var15 += var14;
        }
        if (var16 < var10) {
            float var20 = (float) (this.field1349.field5721 - (var10 - var16)) * this.field1349.field5720 / (float) this.field1349.field5721;
            int var21 = this.field1349.field5719 + arg0;
            int var22 = arg0;
            while (var21 <= var9) {
                var8.glTexCoord2f(0.0F, this.field1349.field5720);
                var8.glVertex2i(var22, var16);
                var8.glTexCoord2f(0.0F, var20);
                var8.glVertex2i(var22, var10);
                var8.glTexCoord2f(this.field1349.field5718, var20);
                var8.glVertex2i(var21, var10);
                var8.glTexCoord2f(this.field1349.field5718, this.field1349.field5720);
                var8.glVertex2i(var21, var16);
                var21 += var13;
                var22 += var13;
            }
            if (var22 < var9) {
                float var23 = (float) (var9 - var22) * this.field1349.field5718 / (float) this.field1349.field5719;
                var8.glTexCoord2f(0.0F, this.field1349.field5720);
                var8.glVertex2i(var22, var16);
                var8.glTexCoord2f(0.0F, var20);
                var8.glVertex2i(var22, var10);
                var8.glTexCoord2f(var23, var20);
                var8.glVertex2i(var9, var10);
                var8.glTexCoord2f(var23, this.field1349.field5720);
                var8.glVertex2i(var9, var16);
            }
        }
        var8.glEnd();
        var8.glPopMatrix();
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "()I")
    public final int method394() {
        return this.field1349.field5721;
    }

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "()I")
    public final int method388() {
        return this.field1349.field5719;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(III)V")
    public final void method612(int arg0, int arg1, int arg2) {
        opengl var4 = this.field1350.field6330;
        var4.glPixelTransferf(3348, 0.5F);
        var4.glPixelTransferf(3349, 0.499F);
        var4.glPixelTransferf(3352, 0.5F);
        var4.glPixelTransferf(3353, 0.499F);
        var4.glPixelTransferf(3354, 0.5F);
        var4.glPixelTransferf(3355, 0.499F);
        this.field1348 = class414.method2418(3553, this.field1349.field5721, arg1, this.field1350, arg0, this.field1349.field5719);
        this.field1353 = arg2;
        var4.glPixelTransferf(3348, 1.0F);
        var4.glPixelTransferf(3349, 0.0F);
        var4.glPixelTransferf(3352, 1.0F);
        var4.glPixelTransferf(3353, 0.0F);
        var4.glPixelTransferf(3354, 1.0F);
        var4.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(FFFFFFLvb;II)V")
    public final void method391(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class90 arg6, int arg7, int arg8) {
        class414 var10 = ((class470) arg6).field6580;
        if (this.field1354) {
            float var11 = (float) this.method382();
            float var12 = (float) this.method389();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field1356 * var15;
            float var18 = (float) this.field1356 * var16;
            float var19 = (float) this.field1351 * var13;
            float var20 = (float) this.field1351 * var14;
            float var21 = (float) this.field1352 * -var13;
            float var22 = (float) this.field1352 * -var14;
            float var23 = (float) this.field1355 * -var15;
            float var24 = (float) this.field1355 * -var16;
            arg0 = arg0 + var19 + var17;
            arg1 = arg1 + var20 + var18;
            arg2 = arg2 + var21 + var17;
            arg3 = arg3 + var22 + var18;
            arg4 = arg4 + var19 + var23;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        opengl var27 = this.field1350.field6330;
        this.field1349.method1168(true);
        this.field1350.method2704();
        this.field1350.method2692(this.field1349);
        this.field1350.method2696(0);
        this.field1350.method2660(1);
        this.field1350.method2692(var10);
        this.field1350.method2702(7681, 8448);
        this.field1350.method2670(0, 34168, 768);
        this.field1350.method2653(1);
        float var28 = var10.field5718 / (float) var10.field5719;
        float var29 = var10.field5720 / (float) var10.field5721;
        var27.glBegin(7);
        var27.glColor3f(1.0F, 1.0F, 1.0F);
        var27.glMultiTexCoord2f(33984, 0.0F, this.field1349.field5720);
        var27.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * var28, var10.field5720 - (arg1 - (float) arg8) * var29);
        var27.glVertex2f(arg0, arg1);
        var27.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        var27.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * var28, var10.field5720 - (arg5 - (float) arg8) * var29);
        var27.glVertex2f(arg4, arg5);
        var27.glMultiTexCoord2f(33984, this.field1349.field5718, 0.0F);
        var27.glMultiTexCoord2f(33985, (var25 - (float) arg7) * var28, var10.field5720 - (var26 - (float) arg8) * var29);
        var27.glVertex2f(var25, var26);
        var27.glMultiTexCoord2f(33984, this.field1349.field5718, this.field1349.field5720);
        var27.glMultiTexCoord2f(33985, (arg2 - (float) arg7) * var28, var10.field5720 - (arg3 - (float) arg8) * var29);
        var27.glVertex2f(arg2, arg3);
        var27.glEnd();
        this.field1350.method2670(0, 5890, 768);
        this.field1350.method2696(1);
        this.field1350.method2692((class179) null);
        this.field1350.method2660(0);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIIII)V")
    public final void method613(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1349.method1275(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
    private final void method614(int arg0) {
        this.field1350.method2660(1);
        this.field1350.method2692(this.field1349);
        this.field1350.method2702(this.field1350.method2701(arg0), 7681);
        this.field1350.method2670(1, 34167, 768);
        this.field1350.method2709(0, 34168, 770);
        this.field1350.method2660(0);
        this.field1350.method2692(this.field1348);
        this.field1350.method2702(34479, 7681);
        this.field1350.method2670(1, 34166, 768);
        if (this.field1353 == 0) {
            this.field1350.method2669(1.0F, 0.5F, 0.5F, 0.0F);
        } else if (this.field1353 == 1) {
            this.field1350.method2669(0.5F, 1.0F, 0.5F, 0.0F);
        } else if (this.field1353 == 2) {
            this.field1350.method2669(0.5F, 0.5F, 1.0F, 0.0F);
        } else if (this.field1353 == 3) {
            this.field1350.method2669(128.5F, 128.5F, 128.5F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(IIII)V")
    public final void method392(int arg0, int arg1, int arg2, int arg3) {
        this.field1351 = arg0;
        this.field1356 = arg1;
        this.field1352 = arg2;
        this.field1355 = arg3;
        this.field1354 = this.field1351 != 0 || this.field1356 != 0 || this.field1352 != 0 || this.field1355 != 0;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IILvb;II)V")
    public final void method393(int arg0, int arg1, class90 arg2, int arg3, int arg4) {
        class470 var6 = (class470) arg2;
        class414 var7 = var6.field6580;
        this.field1349.method1168(false);
        this.field1350.method2704();
        this.field1350.method2692(this.field1349);
        this.field1350.method2696(0);
        this.field1350.method2660(1);
        this.field1350.method2692(var7);
        this.field1350.method2702(7681, 8448);
        this.field1350.method2670(0, 34168, 768);
        this.field1350.method2653(1);
        int var8 = this.field1351 + arg0;
        int var9 = this.field1356 + arg1;
        int var10 = this.field1349.field5719 + var8;
        int var11 = this.field1349.field5721 + var9;
        float var12 = var7.field5718 / (float) var7.field5719;
        float var13 = var7.field5720 / (float) var7.field5721;
        float var14 = (float) (var8 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field5720 - (float) (var9 - arg4) * var13;
        float var17 = var7.field5720 - (float) (var11 - arg4) * var13;
        opengl var18 = this.field1350.field6330;
        var18.glBegin(7);
        var18.glColor3f(1.0F, 1.0F, 1.0F);
        var18.glMultiTexCoord2f(33984, 0.0F, this.field1349.field5720);
        var18.glMultiTexCoord2f(33985, var14, var16);
        var18.glVertex2i(var8, var9);
        var18.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        var18.glMultiTexCoord2f(33985, var14, var17);
        var18.glVertex2i(var8, this.field1349.field5721 + var9);
        var18.glMultiTexCoord2f(33984, this.field1349.field5718, 0.0F);
        var18.glMultiTexCoord2f(33985, var15, var17);
        var18.glVertex2i(this.field1349.field5719 + var8, this.field1349.field5721 + var9);
        var18.glMultiTexCoord2f(33984, this.field1349.field5718, this.field1349.field5720);
        var18.glMultiTexCoord2f(33985, var15, var16);
        var18.glVertex2i(this.field1349.field5719 + var8, var9);
        var18.glEnd();
        this.field1350.method2670(0, 5890, 768);
        this.field1350.method2696(1);
        this.field1350.method2692((class179) null);
        this.field1350.method2660(0);
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Lqi;IIII)V")
    public class91(class458 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1350 = arg0;
        this.field1349 = class414.method2418(3553, arg4, arg2, arg0, arg1, arg3);
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Lqi;II[III)V")
    public class91(class458 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field1350 = arg0;
        this.field1349 = class414.method2417(arg3, arg0, arg2, false, false, arg1);
    }
}
