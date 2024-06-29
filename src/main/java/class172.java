import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class172 extends class130 {

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    private int field2446 = 0;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
    private int field2448 = 0;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "Z")
    private boolean field2450 = false;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    private int field2449 = 0;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    private int field2452 = 0;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    private int field2451 = 0;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "Lhj;")
    private class338 field2453;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "Lbc;")
    private class205 field2454;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "Lbc;")
    private class205 field2447;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIII)V", line = 4)
    public final void method809(int arg0, int arg1, int arg2, int arg3, int arg4) {
        opengl var6 = this.field2453.field4607;
        this.field2454.method915(false);
        this.field2453.method2118();
        this.field2453.method2125(arg4);
        var6.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var7 = this.field2446 + arg0;
        int var8 = this.field2451 + arg1;
        if (this.field2447 == null) {
            this.field2453.method2165(this.field2454);
            this.field2453.method2129(arg2);
            var6.glBegin(7);
            var6.glTexCoord2f(0.0F, this.field2454.field2777);
            var6.glVertex2i(var7, var8);
            var6.glTexCoord2f(0.0F, 0.0F);
            var6.glVertex2i(var7, this.field2454.field2774 + var8);
            var6.glTexCoord2f(this.field2454.field2776, 0.0F);
            var6.glVertex2i(this.field2454.field2775 + var7, this.field2454.field2774 + var8);
            var6.glTexCoord2f(this.field2454.field2776, this.field2454.field2777);
            var6.glVertex2i(this.field2454.field2775 + var7, var8);
            var6.glEnd();
            return;
        }
        this.method1166(arg2);
        this.field2447.method915(false);
        var6.glBegin(7);
        var6.glMultiTexCoord2f(33985, 0.0F, this.field2454.field2777);
        var6.glTexCoord2f(0.0F, this.field2454.field2777);
        var6.glVertex2i(var7, var8);
        var6.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var6.glTexCoord2f(0.0F, 0.0F);
        var6.glVertex2i(var7, this.field2454.field2774 + var8);
        var6.glMultiTexCoord2f(33985, this.field2454.field2776, 0.0F);
        var6.glTexCoord2f(this.field2454.field2776, 0.0F);
        var6.glVertex2i(this.field2454.field2775 + var7, this.field2454.field2774 + var8);
        var6.glMultiTexCoord2f(33985, this.field2454.field2776, this.field2454.field2777);
        var6.glTexCoord2f(this.field2454.field2776, this.field2454.field2777);
        var6.glVertex2i(this.field2454.field2775 + var7, var8);
        var6.glEnd();
        this.method1165();
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(IIIIIII)V", line = 53)
    public final void method875(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        opengl var8 = this.field2453.field4607;
        int var9 = arg0 + arg2;
        int var10 = arg1 + arg3;
        this.field2454.method915(false);
        this.field2453.method2118();
        this.field2453.method2165(this.field2454);
        this.field2453.method2125(arg6);
        this.field2453.method2129(arg4);
        var8.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field2454.field2778 && !this.field2450) {
            float var11 = (float) arg3 * this.field2454.field2777 / (float) this.field2454.field2774;
            float var12 = (float) arg2 * this.field2454.field2776 / (float) this.field2454.field2775;
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
        var8.glTranslatef((float) this.field2446, (float) this.field2451, 0.0F);
        int var13 = this.method874();
        int var14 = this.method877();
        int var15 = this.field2454.field2774 + arg1;
        var8.glBegin(7);
        int var16 = arg1;
        while (var15 <= var10) {
            int var17 = this.field2454.field2775 + arg0;
            int var18 = arg0;
            while (var17 <= var9) {
                var8.glTexCoord2f(0.0F, this.field2454.field2777);
                var8.glVertex2i(var18, var16);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2i(var18, var15);
                var8.glTexCoord2f(this.field2454.field2776, 0.0F);
                var8.glVertex2i(var17, var15);
                var8.glTexCoord2f(this.field2454.field2776, this.field2454.field2777);
                var8.glVertex2i(var17, var16);
                var17 += var13;
                var18 += var13;
            }
            if (var18 < var9) {
                float var19 = (float) (var9 - var18) * this.field2454.field2776 / (float) this.field2454.field2775;
                var8.glTexCoord2f(0.0F, this.field2454.field2777);
                var8.glVertex2i(var18, var16);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2i(var18, var15);
                var8.glTexCoord2f(var19, 0.0F);
                var8.glVertex2i(var9, var15);
                var8.glTexCoord2f(var19, this.field2454.field2777);
                var8.glVertex2i(var9, var16);
            }
            var16 += var14;
            var15 += var14;
        }
        if (var16 < var10) {
            float var20 = (float) (this.field2454.field2774 - (var10 - var16)) * this.field2454.field2777 / (float) this.field2454.field2774;
            int var21 = this.field2454.field2775 + arg0;
            int var22 = arg0;
            while (var21 <= var9) {
                var8.glTexCoord2f(0.0F, this.field2454.field2777);
                var8.glVertex2i(var22, var16);
                var8.glTexCoord2f(0.0F, var20);
                var8.glVertex2i(var22, var10);
                var8.glTexCoord2f(this.field2454.field2776, var20);
                var8.glVertex2i(var21, var10);
                var8.glTexCoord2f(this.field2454.field2776, this.field2454.field2777);
                var8.glVertex2i(var21, var16);
                var21 += var13;
                var22 += var13;
            }
            if (var22 < var9) {
                float var23 = (float) (var9 - var22) * this.field2454.field2776 / (float) this.field2454.field2775;
                var8.glTexCoord2f(0.0F, this.field2454.field2777);
                var8.glVertex2i(var22, var16);
                var8.glTexCoord2f(0.0F, var20);
                var8.glVertex2i(var22, var10);
                var8.glTexCoord2f(var23, var20);
                var8.glVertex2i(var9, var10);
                var8.glTexCoord2f(var23, this.field2454.field2777);
                var8.glVertex2i(var9, var16);
            }
        }
        var8.glEnd();
        var8.glPopMatrix();
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(III)V", line = 185)
    public final void method806(int arg0, int arg1, int arg2) {
        opengl var4 = this.field2453.field4607;
        var4.glPixelTransferf(3348, 0.5F);
        var4.glPixelTransferf(3349, 0.499F);
        var4.glPixelTransferf(3352, 0.5F);
        var4.glPixelTransferf(3353, 0.499F);
        var4.glPixelTransferf(3354, 0.5F);
        var4.glPixelTransferf(3355, 0.499F);
        this.field2447 = class205.method1342(this.field2454.field2774, arg1, arg0, this.field2453, this.field2454.field2775, false);
        this.field2449 = arg2;
        var4.glPixelTransferf(3348, 1.0F);
        var4.glPixelTransferf(3349, 0.0F);
        var4.glPixelTransferf(3352, 1.0F);
        var4.glPixelTransferf(3353, 0.0F);
        var4.glPixelTransferf(3354, 1.0F);
        var4.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "()V", line = 204)
    private final void method1165() {
        this.field2453.method2162(1);
        this.field2453.method2165((class133) null);
        this.field2453.method2140(8448, 8448);
        this.field2453.method2161(1, 34168, 768);
        this.field2453.method2135(0, 5890, 770);
        this.field2453.method2162(0);
        this.field2453.method2161(1, 34168, 768);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "()I", line = 214)
    public final int method874() {
        return this.field2454.field2775 + this.field2446 + this.field2448;
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "()I", line = 217)
    public final int method876() {
        return this.field2454.field2774;
    }

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "()I", line = 221)
    public final int method880() {
        return this.field2454.field2775;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(FFFFFFIII)V", line = 226)
    public final void method873(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field2450) {
            float var10 = (float) this.method874();
            float var11 = (float) this.method877();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field2451 * var14;
            float var17 = (float) this.field2451 * var15;
            float var18 = (float) this.field2446 * var12;
            float var19 = (float) this.field2446 * var13;
            float var20 = (float) this.field2448 * -var12;
            float var21 = (float) this.field2448 * -var13;
            float var22 = (float) this.field2452 * -var14;
            float var23 = (float) this.field2452 * -var15;
            arg0 = arg0 + var18 + var16;
            arg1 = arg1 + var19 + var17;
            arg2 = arg2 + var20 + var16;
            arg3 = arg3 + var21 + var17;
            arg4 = arg4 + var18 + var22;
            arg5 = arg5 + var19 + var23;
        }
        float var24 = arg2 + arg4 - arg0;
        float var25 = arg5 + arg3 - arg1;
        opengl var26 = this.field2453.field4607;
        this.field2454.method915(true);
        this.field2453.method2118();
        this.field2453.method2165(this.field2454);
        this.field2453.method2125(arg8);
        this.field2453.method2129(arg6);
        var26.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        var26.glBegin(7);
        var26.glTexCoord2f(0.0F, this.field2454.field2777);
        var26.glVertex2f(arg0, arg1);
        var26.glTexCoord2f(0.0F, 0.0F);
        var26.glVertex2f(arg4, arg5);
        var26.glTexCoord2f(this.field2454.field2776, 0.0F);
        var26.glVertex2f(var24, var25);
        var26.glTexCoord2f(this.field2454.field2776, this.field2454.field2777);
        var26.glVertex2f(arg2, arg3);
        var26.glEnd();
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIII)V", line = 288)
    public final void method868(int arg0, int arg1, int arg2, int arg3) {
        this.field2446 = arg0;
        this.field2451 = arg1;
        this.field2448 = arg2;
        this.field2452 = arg3;
        this.field2450 = this.field2446 != 0 || this.field2451 != 0 || this.field2448 != 0 || this.field2452 != 0;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIIII)V", line = 296)
    public final void method807(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        opengl var8 = this.field2453.field4607;
        this.field2454.method915(true);
        this.field2453.method2118();
        this.field2453.method2125(arg6);
        var8.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field2450) {
            float var9 = (float) arg2 / (float) this.method874();
            float var10 = (float) arg3 / (float) this.method877();
            float var11 = (float) this.field2446 * var9 + (float) arg0;
            float var12 = (float) this.field2451 * var10 + (float) arg1;
            float var13 = (float) this.field2454.field2775 * var9 + var11;
            float var14 = (float) this.field2454.field2774 * var10 + var12;
            if (this.field2447 == null) {
                this.field2453.method2165(this.field2454);
                this.field2453.method2129(arg4);
                var8.glBegin(7);
                var8.glTexCoord2f(0.0F, this.field2454.field2777);
                var8.glVertex2f(var11, var12);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2f(var11, var14);
                var8.glTexCoord2f(this.field2454.field2776, 0.0F);
                var8.glVertex2f(var13, var14);
                var8.glTexCoord2f(this.field2454.field2776, this.field2454.field2777);
                var8.glVertex2f(var13, var12);
                var8.glEnd();
            } else {
                this.method1166(arg4);
                this.field2447.method915(true);
                var8.glBegin(7);
                var8.glMultiTexCoord2f(33985, 0.0F, this.field2454.field2777);
                var8.glTexCoord2f(0.0F, this.field2454.field2777);
                var8.glVertex2f(var11, var12);
                var8.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2f(var11, var14);
                var8.glMultiTexCoord2f(33985, this.field2454.field2776, 0.0F);
                var8.glTexCoord2f(this.field2454.field2776, 0.0F);
                var8.glVertex2f(var13, var14);
                var8.glMultiTexCoord2f(33985, this.field2454.field2776, this.field2454.field2777);
                var8.glTexCoord2f(this.field2454.field2776, this.field2454.field2777);
                var8.glVertex2f(var13, var12);
                var8.glEnd();
                this.method1165();
            }
        } else if (this.field2447 == null) {
            this.field2453.method2165(this.field2454);
            this.field2453.method2129(arg4);
            var8.glBegin(7);
            var8.glTexCoord2f(0.0F, this.field2454.field2777);
            var8.glVertex2i(arg0, arg1);
            var8.glTexCoord2f(0.0F, 0.0F);
            var8.glVertex2i(arg0, arg1 + arg3);
            var8.glTexCoord2f(this.field2454.field2776, 0.0F);
            var8.glVertex2i(arg0 + arg2, arg1 + arg3);
            var8.glTexCoord2f(this.field2454.field2776, this.field2454.field2777);
            var8.glVertex2i(arg0 + arg2, arg1);
            var8.glEnd();
        } else {
            this.method1166(arg4);
            this.field2447.method915(true);
            var8.glBegin(7);
            var8.glMultiTexCoord2f(33985, 0.0F, this.field2454.field2777);
            var8.glTexCoord2f(0.0F, this.field2454.field2777);
            var8.glVertex2i(arg0, arg1);
            var8.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            var8.glTexCoord2f(0.0F, 0.0F);
            var8.glVertex2i(arg0, arg1 + arg3);
            var8.glMultiTexCoord2f(33985, this.field2454.field2776, 0.0F);
            var8.glTexCoord2f(this.field2454.field2776, 0.0F);
            var8.glVertex2i(arg0 + arg2, arg1 + arg3);
            var8.glMultiTexCoord2f(33985, this.field2454.field2776, this.field2454.field2777);
            var8.glTexCoord2f(this.field2454.field2776, this.field2454.field2777);
            var8.glVertex2i(arg0 + arg2, arg1);
            var8.glEnd();
            this.method1165();
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIII)V", line = 398)
    public final void method808(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2454.method1296(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lhj;IIII)V", line = 594)
    public class172(class338 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2453 = arg0;
        this.field2454 = class205.method1342(arg4, arg2, arg1, arg0, arg3, false);
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lhj;II[III)V", line = 600)
    public class172(class338 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field2453 = arg0;
        this.field2454 = class205.method1344(arg0, arg3, false, arg2, (byte) 28, arg1);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V", line = 408)
    private final void method1166(int arg0) {
        this.field2453.method2162(1);
        this.field2453.method2165(this.field2454);
        this.field2453.method2140(this.field2453.method2109(arg0), 7681);
        this.field2453.method2161(1, 34167, 768);
        this.field2453.method2135(0, 34168, 770);
        this.field2453.method2162(0);
        this.field2453.method2165(this.field2447);
        this.field2453.method2140(34479, 7681);
        this.field2453.method2161(1, 34166, 768);
        if (this.field2449 == 0) {
            this.field2453.method2104(1.0F, 0.5F, 0.5F, 0.0F);
        } else if (this.field2449 == 1) {
            this.field2453.method2104(0.5F, 1.0F, 0.5F, 0.0F);
        } else if (this.field2449 == 2) {
            this.field2453.method2104(0.5F, 0.5F, 1.0F, 0.0F);
        } else if (this.field2449 == 3) {
            this.field2453.method2104(128.5F, 128.5F, 128.5F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(FFFFFFLtm;II)V", line = 436)
    public final void method870(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class220 arg6, int arg7, int arg8) {
        class205 var10 = ((class19) arg6).field249;
        if (this.field2450) {
            float var11 = (float) this.method874();
            float var12 = (float) this.method877();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field2451 * var15;
            float var18 = (float) this.field2451 * var16;
            float var19 = (float) this.field2446 * var13;
            float var20 = (float) this.field2446 * var14;
            float var21 = (float) this.field2448 * -var13;
            float var22 = (float) this.field2448 * -var14;
            float var23 = (float) this.field2452 * -var15;
            float var24 = (float) this.field2452 * -var16;
            arg0 = arg0 + var19 + var17;
            arg1 = arg1 + var20 + var18;
            arg2 = arg2 + var21 + var17;
            arg3 = arg3 + var22 + var18;
            arg4 = arg4 + var19 + var23;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        opengl var27 = this.field2453.field4607;
        this.field2454.method915(true);
        this.field2453.method2118();
        this.field2453.method2165(this.field2454);
        this.field2453.method2129(0);
        this.field2453.method2162(1);
        this.field2453.method2165(var10);
        this.field2453.method2140(7681, 8448);
        this.field2453.method2161(0, 34168, 768);
        this.field2453.method2125(1);
        float var28 = var10.field2776 / (float) var10.field2775;
        float var29 = var10.field2777 / (float) var10.field2774;
        var27.glBegin(7);
        var27.glColor3f(1.0F, 1.0F, 1.0F);
        var27.glMultiTexCoord2f(33984, 0.0F, this.field2454.field2777);
        var27.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * var28, var10.field2777 - (arg1 - (float) arg8) * var29);
        var27.glVertex2f(arg0, arg1);
        var27.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        var27.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * var28, var10.field2777 - (arg5 - (float) arg8) * var29);
        var27.glVertex2f(arg4, arg5);
        var27.glMultiTexCoord2f(33984, this.field2454.field2776, 0.0F);
        var27.glMultiTexCoord2f(33985, (var25 - (float) arg7) * var28, var10.field2777 - (var26 - (float) arg8) * var29);
        var27.glVertex2f(var25, var26);
        var27.glMultiTexCoord2f(33984, this.field2454.field2776, this.field2454.field2777);
        var27.glMultiTexCoord2f(33985, (arg2 - (float) arg7) * var28, var10.field2777 - (arg3 - (float) arg8) * var29);
        var27.glVertex2f(arg2, arg3);
        var27.glEnd();
        this.field2453.method2161(0, 5890, 768);
        this.field2453.method2129(1);
        this.field2453.method2165((class133) null);
        this.field2453.method2162(0);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IILtm;II)V", line = 518)
    public final void method805(int arg0, int arg1, class220 arg2, int arg3, int arg4) {
        class19 var6 = (class19) arg2;
        class205 var7 = var6.field249;
        this.field2454.method915(false);
        this.field2453.method2118();
        this.field2453.method2165(this.field2454);
        this.field2453.method2129(0);
        this.field2453.method2162(1);
        this.field2453.method2165(var7);
        this.field2453.method2140(7681, 8448);
        this.field2453.method2161(0, 34168, 768);
        this.field2453.method2125(1);
        int var8 = this.field2446 + arg0;
        int var9 = this.field2451 + arg1;
        int var10 = this.field2454.field2775 + var8;
        int var11 = this.field2454.field2774 + var9;
        float var12 = var7.field2776 / (float) var7.field2775;
        float var13 = var7.field2777 / (float) var7.field2774;
        float var14 = (float) (var8 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field2777 - (float) (var9 - arg4) * var13;
        float var17 = var7.field2777 - (float) (var11 - arg4) * var13;
        opengl var18 = this.field2453.field4607;
        var18.glBegin(7);
        var18.glColor3f(1.0F, 1.0F, 1.0F);
        var18.glMultiTexCoord2f(33984, 0.0F, this.field2454.field2777);
        var18.glMultiTexCoord2f(33985, var14, var16);
        var18.glVertex2i(var8, var9);
        var18.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        var18.glMultiTexCoord2f(33985, var14, var17);
        var18.glVertex2i(var8, this.field2454.field2774 + var9);
        var18.glMultiTexCoord2f(33984, this.field2454.field2776, 0.0F);
        var18.glMultiTexCoord2f(33985, var15, var17);
        var18.glVertex2i(this.field2454.field2775 + var8, this.field2454.field2774 + var9);
        var18.glMultiTexCoord2f(33984, this.field2454.field2776, this.field2454.field2777);
        var18.glMultiTexCoord2f(33985, var15, var16);
        var18.glVertex2i(this.field2454.field2775 + var8, var9);
        var18.glEnd();
        this.field2453.method2161(0, 5890, 768);
        this.field2453.method2129(1);
        this.field2453.method2165((class133) null);
        this.field2453.method2162(0);
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "()I", line = 574)
    public final int method877() {
        return this.field2454.field2774 + this.field2451 + this.field2452;
    }
}
