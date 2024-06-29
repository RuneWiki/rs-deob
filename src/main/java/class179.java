import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class179 extends class417 {

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    private int field2714 = 0;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "Z")
    private boolean field2716 = false;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    private int field2713 = 0;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    private int field2718 = 0;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    private int field2719 = 0;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    private int field2721 = 0;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "Lfu;")
    private class42 field2720;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "Lwc;")
    private class245 field2715;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "Lwc;")
    private class245 field2717;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(FFFFFFLoj;II)V")
    public final void method1286(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class405 arg6, int arg7, int arg8) {
        class245 var10 = ((class60) arg6).field880;
        if (this.field2716) {
            float var11 = (float) this.method1294();
            float var12 = (float) this.method1295();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field2719 * var15;
            float var18 = (float) this.field2719 * var16;
            float var19 = (float) this.field2713 * var13;
            float var20 = (float) this.field2713 * var14;
            float var21 = (float) this.field2714 * -var13;
            float var22 = (float) this.field2714 * -var14;
            float var23 = (float) this.field2721 * -var15;
            float var24 = (float) this.field2721 * -var16;
            arg0 = arg0 + var19 + var17;
            arg1 = arg1 + var20 + var18;
            arg2 = arg2 + var21 + var17;
            arg3 = arg3 + var22 + var18;
            arg4 = arg4 + var19 + var23;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        opengl var27 = this.field2720.field557;
        this.field2715.method2297(true);
        this.field2720.method449();
        this.field2720.method303(this.field2715);
        this.field2720.method421(0);
        this.field2720.method407(1);
        this.field2720.method303(var10);
        this.field2720.method353(7681, 8448);
        this.field2720.method335(0, 34168, 768);
        this.field2720.method349(1);
        float var28 = var10.field3550 / (float) var10.field3553;
        float var29 = var10.field3549 / (float) var10.field3551;
        var27.glBegin(7);
        var27.glColor3f(1.0F, 1.0F, 1.0F);
        var27.glMultiTexCoord2f(33984, 0.0F, this.field2715.field3549);
        var27.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * var28, var10.field3549 - (arg1 - (float) arg8) * var29);
        var27.glVertex2f(arg0, arg1);
        var27.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        var27.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * var28, var10.field3549 - (arg5 - (float) arg8) * var29);
        var27.glVertex2f(arg4, arg5);
        var27.glMultiTexCoord2f(33984, this.field2715.field3550, 0.0F);
        var27.glMultiTexCoord2f(33985, (var25 - (float) arg7) * var28, var10.field3549 - (var26 - (float) arg8) * var29);
        var27.glVertex2f(var25, var26);
        var27.glMultiTexCoord2f(33984, this.field2715.field3550, this.field2715.field3549);
        var27.glMultiTexCoord2f(33985, (arg2 - (float) arg7) * var28, var10.field3549 - (arg3 - (float) arg8) * var29);
        var27.glVertex2f(arg2, arg3);
        var27.glEnd();
        this.field2720.method335(0, 5890, 768);
        this.field2720.method421(1);
        this.field2720.method303((class375) null);
        this.field2720.method407(0);
    }

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "()I")
    public final int method1287() {
        return this.field2715.field3551;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)V")
    public final void method723(int arg0, int arg1, int arg2) {
        opengl var4 = this.field2720.field557;
        var4.glPixelTransferf(3348, 0.5F);
        var4.glPixelTransferf(3349, 0.499F);
        var4.glPixelTransferf(3352, 0.5F);
        var4.glPixelTransferf(3353, 0.499F);
        var4.glPixelTransferf(3354, 0.5F);
        var4.glPixelTransferf(3355, 0.499F);
        this.field2717 = class245.method1689((byte) 105, this.field2715.field3553, this.field2720, arg1, this.field2715.field3551, arg0);
        this.field2718 = arg2;
        var4.glPixelTransferf(3348, 1.0F);
        var4.glPixelTransferf(3349, 0.0F);
        var4.glPixelTransferf(3352, 1.0F);
        var4.glPixelTransferf(3353, 0.0F);
        var4.glPixelTransferf(3354, 1.0F);
        var4.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(IIIIIII)V")
    public final void method725(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        opengl var8 = this.field2720.field557;
        this.field2715.method2297(true);
        this.field2720.method449();
        this.field2720.method349(arg6);
        var8.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field2716) {
            float var9 = (float) arg2 / (float) this.method1294();
            float var10 = (float) arg3 / (float) this.method1295();
            float var11 = (float) this.field2713 * var9 + (float) arg0;
            float var12 = (float) this.field2719 * var10 + (float) arg1;
            float var13 = (float) this.field2715.field3553 * var9 + var11;
            float var14 = (float) this.field2715.field3551 * var10 + var12;
            if (this.field2717 == null) {
                this.field2720.method303(this.field2715);
                this.field2720.method421(arg4);
                var8.glBegin(7);
                var8.glTexCoord2f(0.0F, this.field2715.field3549);
                var8.glVertex2f(var11, var12);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2f(var11, var14);
                var8.glTexCoord2f(this.field2715.field3550, 0.0F);
                var8.glVertex2f(var13, var14);
                var8.glTexCoord2f(this.field2715.field3550, this.field2715.field3549);
                var8.glVertex2f(var13, var12);
                var8.glEnd();
            } else {
                this.method1290(arg4);
                this.field2717.method2297(true);
                var8.glBegin(7);
                var8.glMultiTexCoord2f(33985, 0.0F, this.field2715.field3549);
                var8.glTexCoord2f(0.0F, this.field2715.field3549);
                var8.glVertex2f(var11, var12);
                var8.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2f(var11, var14);
                var8.glMultiTexCoord2f(33985, this.field2715.field3550, 0.0F);
                var8.glTexCoord2f(this.field2715.field3550, 0.0F);
                var8.glVertex2f(var13, var14);
                var8.glMultiTexCoord2f(33985, this.field2715.field3550, this.field2715.field3549);
                var8.glTexCoord2f(this.field2715.field3550, this.field2715.field3549);
                var8.glVertex2f(var13, var12);
                var8.glEnd();
                this.method1289();
            }
        } else if (this.field2717 == null) {
            this.field2720.method303(this.field2715);
            this.field2720.method421(arg4);
            var8.glBegin(7);
            var8.glTexCoord2f(0.0F, this.field2715.field3549);
            var8.glVertex2i(arg0, arg1);
            var8.glTexCoord2f(0.0F, 0.0F);
            var8.glVertex2i(arg0, arg1 + arg3);
            var8.glTexCoord2f(this.field2715.field3550, 0.0F);
            var8.glVertex2i(arg0 + arg2, arg1 + arg3);
            var8.glTexCoord2f(this.field2715.field3550, this.field2715.field3549);
            var8.glVertex2i(arg0 + arg2, arg1);
            var8.glEnd();
        } else {
            this.method1290(arg4);
            this.field2717.method2297(true);
            var8.glBegin(7);
            var8.glMultiTexCoord2f(33985, 0.0F, this.field2715.field3549);
            var8.glTexCoord2f(0.0F, this.field2715.field3549);
            var8.glVertex2i(arg0, arg1);
            var8.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            var8.glTexCoord2f(0.0F, 0.0F);
            var8.glVertex2i(arg0, arg1 + arg3);
            var8.glMultiTexCoord2f(33985, this.field2715.field3550, 0.0F);
            var8.glTexCoord2f(this.field2715.field3550, 0.0F);
            var8.glVertex2i(arg0 + arg2, arg1 + arg3);
            var8.glMultiTexCoord2f(33985, this.field2715.field3550, this.field2715.field3549);
            var8.glTexCoord2f(this.field2715.field3550, this.field2715.field3549);
            var8.glVertex2i(arg0 + arg2, arg1);
            var8.glEnd();
            this.method1289();
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIII)V")
    public final void method722(int arg0, int arg1, int arg2, int arg3, int arg4) {
        opengl var6 = this.field2720.field557;
        this.field2715.method2297(false);
        this.field2720.method449();
        this.field2720.method349(arg4);
        var6.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var7 = this.field2713 + arg0;
        int var8 = this.field2719 + arg1;
        if (this.field2717 == null) {
            this.field2720.method303(this.field2715);
            this.field2720.method421(arg2);
            var6.glBegin(7);
            var6.glTexCoord2f(0.0F, this.field2715.field3549);
            var6.glVertex2i(var7, var8);
            var6.glTexCoord2f(0.0F, 0.0F);
            var6.glVertex2i(var7, this.field2715.field3551 + var8);
            var6.glTexCoord2f(this.field2715.field3550, 0.0F);
            var6.glVertex2i(this.field2715.field3553 + var7, this.field2715.field3551 + var8);
            var6.glTexCoord2f(this.field2715.field3550, this.field2715.field3549);
            var6.glVertex2i(this.field2715.field3553 + var7, var8);
            var6.glEnd();
            return;
        }
        this.method1290(arg2);
        this.field2717.method2297(false);
        var6.glBegin(7);
        var6.glMultiTexCoord2f(33985, 0.0F, this.field2715.field3549);
        var6.glTexCoord2f(0.0F, this.field2715.field3549);
        var6.glVertex2i(var7, var8);
        var6.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var6.glTexCoord2f(0.0F, 0.0F);
        var6.glVertex2i(var7, this.field2715.field3551 + var8);
        var6.glMultiTexCoord2f(33985, this.field2715.field3550, 0.0F);
        var6.glTexCoord2f(this.field2715.field3550, 0.0F);
        var6.glVertex2i(this.field2715.field3553 + var7, this.field2715.field3551 + var8);
        var6.glMultiTexCoord2f(33985, this.field2715.field3550, this.field2715.field3549);
        var6.glTexCoord2f(this.field2715.field3550, this.field2715.field3549);
        var6.glVertex2i(this.field2715.field3553 + var7, var8);
        var6.glEnd();
        this.method1289();
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIII)V")
    public final void method726(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2715.method2562(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(FFFFFFIII)V")
    public final void method1288(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field2716) {
            float var10 = (float) this.method1294();
            float var11 = (float) this.method1295();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field2719 * var14;
            float var17 = (float) this.field2719 * var15;
            float var18 = (float) this.field2713 * var12;
            float var19 = (float) this.field2713 * var13;
            float var20 = (float) this.field2714 * -var12;
            float var21 = (float) this.field2714 * -var13;
            float var22 = (float) this.field2721 * -var14;
            float var23 = (float) this.field2721 * -var15;
            arg0 = arg0 + var18 + var16;
            arg1 = arg1 + var19 + var17;
            arg2 = arg2 + var20 + var16;
            arg3 = arg3 + var21 + var17;
            arg4 = arg4 + var18 + var22;
            arg5 = arg5 + var19 + var23;
        }
        float var24 = arg2 + arg4 - arg0;
        float var25 = arg5 + arg3 - arg1;
        opengl var26 = this.field2720.field557;
        this.field2715.method2297(true);
        this.field2720.method449();
        this.field2720.method303(this.field2715);
        this.field2720.method349(arg8);
        this.field2720.method421(arg6);
        var26.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        var26.glBegin(7);
        var26.glTexCoord2f(0.0F, this.field2715.field3549);
        var26.glVertex2f(arg0, arg1);
        var26.glTexCoord2f(0.0F, 0.0F);
        var26.glVertex2f(arg4, arg5);
        var26.glTexCoord2f(this.field2715.field3550, 0.0F);
        var26.glVertex2f(var24, var25);
        var26.glTexCoord2f(this.field2715.field3550, this.field2715.field3549);
        var26.glVertex2f(arg2, arg3);
        var26.glEnd();
    }

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "()V")
    private final void method1289() {
        this.field2720.method407(1);
        this.field2720.method303((class375) null);
        this.field2720.method353(8448, 8448);
        this.field2720.method335(1, 34168, 768);
        this.field2720.method289(0, 5890, 770);
        this.field2720.method407(0);
        this.field2720.method335(1, 34168, 768);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
    private final void method1290(int arg0) {
        this.field2720.method407(1);
        this.field2720.method303(this.field2715);
        this.field2720.method353(this.field2720.method398(arg0), 7681);
        this.field2720.method335(1, 34167, 768);
        this.field2720.method289(0, 34168, 770);
        this.field2720.method407(0);
        this.field2720.method303(this.field2717);
        this.field2720.method353(34479, 7681);
        this.field2720.method335(1, 34166, 768);
        if (this.field2718 == 0) {
            this.field2720.method371(1.0F, 0.5F, 0.5F, 0.0F);
        } else if (this.field2718 == 1) {
            this.field2720.method371(0.5F, 1.0F, 0.5F, 0.0F);
        } else if (this.field2718 == 2) {
            this.field2720.method371(0.5F, 0.5F, 1.0F, 0.0F);
        } else if (this.field2718 == 3) {
            this.field2720.method371(128.5F, 128.5F, 128.5F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIII)V")
    public final void method1291(int arg0, int arg1, int arg2, int arg3) {
        this.field2713 = arg0;
        this.field2719 = arg1;
        this.field2714 = arg2;
        this.field2721 = arg3;
        this.field2716 = this.field2713 != 0 || this.field2719 != 0 || this.field2714 != 0 || this.field2721 != 0;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IILoj;II)V")
    public final void method728(int arg0, int arg1, class405 arg2, int arg3, int arg4) {
        class60 var6 = (class60) arg2;
        class245 var7 = var6.field880;
        this.field2715.method2297(false);
        this.field2720.method449();
        this.field2720.method303(this.field2715);
        this.field2720.method421(0);
        this.field2720.method407(1);
        this.field2720.method303(var7);
        this.field2720.method353(7681, 8448);
        this.field2720.method335(0, 34168, 768);
        this.field2720.method349(1);
        int var8 = this.field2713 + arg0;
        int var9 = this.field2719 + arg1;
        int var10 = this.field2715.field3553 + var8;
        int var11 = this.field2715.field3551 + var9;
        float var12 = var7.field3550 / (float) var7.field3553;
        float var13 = var7.field3549 / (float) var7.field3551;
        float var14 = (float) (var8 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field3549 - (float) (var9 - arg4) * var13;
        float var17 = var7.field3549 - (float) (var11 - arg4) * var13;
        opengl var18 = this.field2720.field557;
        var18.glBegin(7);
        var18.glColor3f(1.0F, 1.0F, 1.0F);
        var18.glMultiTexCoord2f(33984, 0.0F, this.field2715.field3549);
        var18.glMultiTexCoord2f(33985, var14, var16);
        var18.glVertex2i(var8, var9);
        var18.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        var18.glMultiTexCoord2f(33985, var14, var17);
        var18.glVertex2i(var8, this.field2715.field3551 + var9);
        var18.glMultiTexCoord2f(33984, this.field2715.field3550, 0.0F);
        var18.glMultiTexCoord2f(33985, var15, var17);
        var18.glVertex2i(this.field2715.field3553 + var8, this.field2715.field3551 + var9);
        var18.glMultiTexCoord2f(33984, this.field2715.field3550, this.field2715.field3549);
        var18.glMultiTexCoord2f(33985, var15, var16);
        var18.glVertex2i(this.field2715.field3553 + var8, var9);
        var18.glEnd();
        this.field2720.method335(0, 5890, 768);
        this.field2720.method421(1);
        this.field2720.method303((class375) null);
        this.field2720.method407(0);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIII)V")
    public final void method1292(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        opengl var8 = this.field2720.field557;
        int var9 = arg0 + arg2;
        int var10 = arg1 + arg3;
        this.field2715.method2297(false);
        this.field2720.method449();
        this.field2720.method303(this.field2715);
        this.field2720.method349(arg6);
        this.field2720.method421(arg4);
        var8.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field2715.field3552 && !this.field2716) {
            float var11 = (float) arg3 * this.field2715.field3549 / (float) this.field2715.field3551;
            float var12 = (float) arg2 * this.field2715.field3550 / (float) this.field2715.field3553;
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
        var8.glTranslatef((float) this.field2713, (float) this.field2719, 0.0F);
        int var13 = this.method1294();
        int var14 = this.method1295();
        int var15 = this.field2715.field3551 + arg1;
        var8.glBegin(7);
        int var16 = arg1;
        while (var15 <= var10) {
            int var17 = this.field2715.field3553 + arg0;
            int var18 = arg0;
            while (var17 <= var9) {
                var8.glTexCoord2f(0.0F, this.field2715.field3549);
                var8.glVertex2i(var18, var16);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2i(var18, var15);
                var8.glTexCoord2f(this.field2715.field3550, 0.0F);
                var8.glVertex2i(var17, var15);
                var8.glTexCoord2f(this.field2715.field3550, this.field2715.field3549);
                var8.glVertex2i(var17, var16);
                var17 += var13;
                var18 += var13;
            }
            if (var18 < var9) {
                float var19 = (float) (var9 - var18) * this.field2715.field3550 / (float) this.field2715.field3553;
                var8.glTexCoord2f(0.0F, this.field2715.field3549);
                var8.glVertex2i(var18, var16);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2i(var18, var15);
                var8.glTexCoord2f(var19, 0.0F);
                var8.glVertex2i(var9, var15);
                var8.glTexCoord2f(var19, this.field2715.field3549);
                var8.glVertex2i(var9, var16);
            }
            var16 += var14;
            var15 += var14;
        }
        if (var16 < var10) {
            float var20 = (float) (this.field2715.field3551 - (var10 - var16)) * this.field2715.field3549 / (float) this.field2715.field3551;
            int var21 = this.field2715.field3553 + arg0;
            int var22 = arg0;
            while (var21 <= var9) {
                var8.glTexCoord2f(0.0F, this.field2715.field3549);
                var8.glVertex2i(var22, var16);
                var8.glTexCoord2f(0.0F, var20);
                var8.glVertex2i(var22, var10);
                var8.glTexCoord2f(this.field2715.field3550, var20);
                var8.glVertex2i(var21, var10);
                var8.glTexCoord2f(this.field2715.field3550, this.field2715.field3549);
                var8.glVertex2i(var21, var16);
                var21 += var13;
                var22 += var13;
            }
            if (var22 < var9) {
                float var23 = (float) (var9 - var22) * this.field2715.field3550 / (float) this.field2715.field3553;
                var8.glTexCoord2f(0.0F, this.field2715.field3549);
                var8.glVertex2i(var22, var16);
                var8.glTexCoord2f(0.0F, var20);
                var8.glVertex2i(var22, var10);
                var8.glTexCoord2f(var23, var20);
                var8.glVertex2i(var9, var10);
                var8.glTexCoord2f(var23, this.field2715.field3549);
                var8.glVertex2i(var9, var16);
            }
        }
        var8.glEnd();
        var8.glPopMatrix();
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "()I")
    public final int method1293() {
        return this.field2715.field3553;
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "()I")
    public final int method1294() {
        return this.field2715.field3553 + this.field2713 + this.field2714;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "()I")
    public final int method1295() {
        return this.field2715.field3551 + this.field2719 + this.field2721;
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lfu;IIII)V")
    public class179(class42 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2720 = arg0;
        this.field2715 = class245.method1689((byte) 126, arg3, arg0, arg2, arg4, arg1);
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lfu;II[III)V")
    public class179(class42 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field2720 = arg0;
        this.field2715 = class245.method1691(arg3, (byte) -109, false, arg0, arg1, arg2);
    }
}
