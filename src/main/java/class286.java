import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class286 extends class131 {

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "Z")
    private boolean field3488 = false;

    @OriginalMember(owner = "client!ao", name = "w", descriptor = "I")
    private int field3510 = 0;

    @OriginalMember(owner = "client!ao", name = "z", descriptor = "I")
    private int field3513 = 0;

    @OriginalMember(owner = "client!ao", name = "v", descriptor = "I")
    private int field3509 = 0;

    @OriginalMember(owner = "client!ao", name = "r", descriptor = "I")
    private int field3505 = 0;

    @OriginalMember(owner = "client!ao", name = "C", descriptor = "I")
    private int field3516 = 0;

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "Lnv;")
    private class417 field3494;

    @OriginalMember(owner = "client!ao", name = "o", descriptor = "Ltea;")
    private class238 field3502;

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "[F")
    public static float[] field3492 = new float[4];

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "[I")
    public static int[] field3490 = new int[50];

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!ao", name = "j", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!ao", name = "k", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!ao", name = "l", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!ao", name = "m", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!ao", name = "n", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!ao", name = "p", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!ao", name = "q", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!ao", name = "s", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!ao", name = "t", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!ao", name = "y", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!ao", name = "A", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!ao", name = "B", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!ao", name = "D", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!ao", name = "x", descriptor = "Lhu;")
    public static class131 field3511;

    @OriginalMember(owner = "client!ao", name = "u", descriptor = "Ltea;")
    private class238 field3508;

    @OriginalMember(owner = "client!ao", name = "i", descriptor = "[[Ltp;")
    public static class532[][] field3496;

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "()I")
    public final int method510() {
        field3493++;
        return this.field3513 + this.field3505 + this.field3502.field2836;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V")
    private final void method1702(int arg0) {
        field3506++;
        this.field3494.method2545(32886, 1);
        this.field3494.method2621(-2, null);
        this.field3494.method2558(8448, 0, 8448);
        this.field3494.method2626(8960, 768, 1, 34168);
        if (arg0 == 32570) {
            this.field3494.method2630(34166, 0, 770, 5890);
            this.field3494.method2545(32886, 0);
            this.field3494.method2626(8960, 768, 1, 34168);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIII)V")
    public final void method826(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3502.method4014(arg4, arg3, arg0, arg2, arg1, false, arg5);
        field3499++;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(III)V")
    public final void method822(int arg0, int arg1, int arg2) {
        field3495++;
        OpenGL.glPixelTransferf(3348, 0.5F);
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field3508 = class303.method1824(this.field3502.field2836, 3553, this.field3502.field2834, arg1, this.field3494, arg0);
        this.field3516 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(FFFFFFIIII)V")
    public final void method506(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        field3517++;
        if (this.field3488) {
            float var11 = (float) this.method501();
            float var12 = (float) this.method510();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field3505 * var15;
            float var18 = (float) this.field3505 * var16;
            float var19 = (float) this.field3509 * var13;
            float var20 = (float) this.field3509 * var14;
            float var21 = (float) this.field3510 * -var13;
            float var22 = (float) this.field3510 * -var14;
            float var23 = (float) this.field3513 * -var15;
            arg0 = arg0 + var19 + var17;
            arg3 = arg3 + var22 + var18;
            arg4 = arg4 + var19 + var23;
            arg1 = arg1 + var20 + var18;
            arg2 = arg2 + var21 + var17;
            float var24 = (float) this.field3513 * -var16;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        this.field3502.method1742((arg9 & 0x1) != 0, 29646);
        float var26 = arg5 + arg3 - arg1;
        this.field3494.method2620(false);
        this.field3494.method2621(-2, this.field3502);
        this.field3494.method2606(arg8, -24754);
        this.field3494.method2573(arg6, false);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field3502.field2835);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field3502.field2830, 0.0F);
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glTexCoord2f(this.field3502.field2830, this.field3502.field2835);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "()I")
    public final int method503() {
        field3512++;
        return this.field3502.field2834;
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(IIIII)V")
    public static final void method1703(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class497.field7021 = arg1;
        class443.field6425 = arg4;
        class147.field1640 = arg3;
        field3501++;
        class643.field9205 = arg0;
        if (arg2 >= -29) {
            method1703(79, -126, 32, 77, -27);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIII)V")
    public final void method512(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3491++;
        this.field3502.method1742(false, 29646);
        this.field3494.method2620(false);
        this.field3494.method2606(arg4, -24754);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field3509 + arg0;
        int var7 = this.field3505 + arg1;
        if (this.field3508 == null) {
            this.field3494.method2621(-2, this.field3502);
            this.field3494.method2573(arg2, false);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field3502.field2835);
            OpenGL.glVertex2i(var6, var7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var6, this.field3502.field2836 + var7);
            OpenGL.glTexCoord2f(this.field3502.field2830, 0.0F);
            OpenGL.glVertex2i(this.field3502.field2834 + var6, this.field3502.field2836 + var7);
            OpenGL.glTexCoord2f(this.field3502.field2830, this.field3502.field2835);
            OpenGL.glVertex2i(this.field3502.field2834 + var6, var7);
            OpenGL.glEnd();
            return;
        }
        this.method1704(arg2, 127);
        this.field3508.method1742(false, 29646);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field3502.field2835);
        OpenGL.glTexCoord2f(0.0F, this.field3502.field2835);
        OpenGL.glVertex2i(var6, var7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var6, this.field3502.field2836 + var7);
        OpenGL.glMultiTexCoord2f(33985, this.field3502.field2830, 0.0F);
        OpenGL.glTexCoord2f(this.field3502.field2830, 0.0F);
        OpenGL.glVertex2i(this.field3502.field2834 + var6, var7 - -this.field3502.field2836);
        OpenGL.glMultiTexCoord2f(33985, this.field3502.field2830, this.field3502.field2835);
        OpenGL.glTexCoord2f(this.field3502.field2830, this.field3502.field2835);
        OpenGL.glVertex2i(var6 + this.field3502.field2834, var7);
        OpenGL.glEnd();
        this.method1702(32570);
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "()I")
    public final int method509() {
        field3498++;
        return this.field3502.field2836;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIII)V")
    public final void method513(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3515++;
        int var8 = arg0 + arg2;
        this.field3502.method1742(false, 29646);
        int var9 = arg1 + arg3;
        this.field3494.method2620(false);
        this.field3494.method2621(-2, this.field3502);
        this.field3494.method2606(arg6, -24754);
        this.field3494.method2573(arg4, false);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field3502.field2833 && !this.field3488) {
            float var10 = (float) arg3 * this.field3502.field2835 / (float) this.field3502.field2836;
            float var11 = (float) arg2 * this.field3502.field2830 / (float) this.field3502.field2834;
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, var10);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, var9);
            OpenGL.glTexCoord2f(var11, 0.0F);
            OpenGL.glVertex2i(var8, var9);
            OpenGL.glTexCoord2f(var11, var10);
            OpenGL.glVertex2i(var8, arg1);
            OpenGL.glEnd();
            return;
        }
        OpenGL.glPushMatrix();
        OpenGL.glTranslatef((float) this.field3509, (float) this.field3505, 0.0F);
        int var12 = this.method501();
        int var13 = this.method510();
        int var14 = this.field3502.field2836 + arg1;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var14 <= var9) {
            int var20 = this.field3502.field2834 + arg0;
            int var21 = arg0;
            while (var20 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field3502.field2835);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field3502.field2830, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field3502.field2830, this.field3502.field2835);
                OpenGL.glVertex2i(var20, var15);
                var20 += var12;
                var21 += var12;
            }
            if (var8 > var21) {
                float var22 = (float) (var8 - var21) * this.field3502.field2830 / (float) this.field3502.field2834;
                OpenGL.glTexCoord2f(0.0F, this.field3502.field2835);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field3502.field2835);
                OpenGL.glVertex2i(var8, var15);
            }
            var14 += var13;
            var15 += var13;
        }
        if (var9 > var15) {
            float var16 = (float) (var15 + this.field3502.field2836 - var9) * this.field3502.field2835 / (float) this.field3502.field2836;
            int var17 = this.field3502.field2834 + arg0;
            int var18 = arg0;
            while (var17 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field3502.field2835);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field3502.field2830, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field3502.field2830, this.field3502.field2835);
                OpenGL.glVertex2i(var17, var15);
                var17 += var12;
                var18 += var12;
            }
            if (var18 < var8) {
                float var19 = (float) (var8 - var18) * this.field3502.field2830 / (float) this.field3502.field2834;
                OpenGL.glTexCoord2f(0.0F, this.field3502.field2835);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field3502.field2835);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIIII)V")
    public final void method505(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field3502.method1742((arg7 & 0x1) != 0, 29646);
        field3504++;
        this.field3494.method2620(false);
        this.field3494.method2606(arg6, -24754);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field3488) {
            float var9 = (float) arg2 / (float) this.method501();
            float var10 = (float) arg3 / (float) this.method510();
            float var11 = (float) this.field3509 * var9 + (float) arg0;
            float var12 = (float) this.field3505 * var10 + (float) arg1;
            float var13 = (float) this.field3502.field2834 * var9 + var11;
            float var14 = (float) this.field3502.field2836 * var10 + var12;
            if (this.field3508 == null) {
                this.field3494.method2621(-2, this.field3502);
                this.field3494.method2573(arg4, false);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field3502.field2835);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glTexCoord2f(this.field3502.field2830, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glTexCoord2f(this.field3502.field2830, this.field3502.field2835);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
            } else {
                this.method1704(arg4, 127);
                this.field3508.method1742(true, 29646);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field3502.field2835);
                OpenGL.glTexCoord2f(0.0F, this.field3502.field2835);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field3502.field2830, 0.0F);
                OpenGL.glTexCoord2f(this.field3502.field2830, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field3502.field2830, this.field3502.field2835);
                OpenGL.glTexCoord2f(this.field3502.field2830, this.field3502.field2835);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
                this.method1702(32570);
            }
        } else if (this.field3508 == null) {
            this.field3494.method2621(-2, this.field3502);
            this.field3494.method2573(arg4, false);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field3502.field2835);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field3502.field2830, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field3502.field2830, this.field3502.field2835);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method1704(arg4, 127);
            this.field3508.method1742(true, 29646);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field3502.field2835);
            OpenGL.glTexCoord2f(0.0F, this.field3502.field2835);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field3502.field2830, 0.0F);
            OpenGL.glTexCoord2f(this.field3502.field2830, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field3502.field2830, this.field3502.field2835);
            OpenGL.glTexCoord2f(this.field3502.field2830, this.field3502.field2835);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method1702(32570);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IILaa;II)V")
    public final void method502(int arg0, int arg1, class485 arg2, int arg3, int arg4) {
        field3500++;
        class291 var6 = (class291) arg2;
        class238 var7 = var6.field3585;
        this.field3502.method1742(false, 29646);
        this.field3494.method2620(false);
        this.field3494.method2621(-2, this.field3502);
        this.field3494.method2573(1, false);
        this.field3494.method2545(32886, 1);
        this.field3494.method2621(-2, var7);
        this.field3494.method2558(7681, 0, 8448);
        this.field3494.method2626(8960, 768, 0, 34168);
        this.field3494.method2606(1, -24754);
        int var8 = this.field3505 + arg1;
        int var9 = this.field3509 + arg0;
        int var10 = var9 + this.field3502.field2834;
        int var11 = this.field3502.field2836 + var8;
        float var12 = var7.field2830 / (float) var7.field2834;
        float var13 = var7.field2835 / (float) var7.field2836;
        float var14 = (float) (var9 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field2835 - (float) (var8 - arg4) * var13;
        float var17 = var7.field2835 - ((float) (var11 - arg4) * var13);
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field3502.field2835);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var9, var8);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var9, var8 + this.field3502.field2836);
        OpenGL.glMultiTexCoord2f(33984, this.field3502.field2830, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(this.field3502.field2834 + var9, this.field3502.field2836 + var8);
        OpenGL.glMultiTexCoord2f(33984, this.field3502.field2830, this.field3502.field2835);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(this.field3502.field2834 + var9, var8);
        OpenGL.glEnd();
        this.field3494.method2626(8960, 768, 0, 5890);
        this.field3494.method2573(0, false);
        this.field3494.method2621(-2, null);
        this.field3494.method2545(32886, 0);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public final void method500(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class485 arg7, int arg8, int arg9) {
        field3497++;
        class238 var11 = ((class291) arg7).field3585;
        if (this.field3488) {
            float var12 = (float) this.method501();
            float var13 = (float) this.method510();
            float var14 = (arg2 - arg0) / var12;
            float var15 = (arg3 - arg1) / var12;
            float var16 = (arg4 - arg0) / var13;
            float var17 = (arg5 - arg1) / var13;
            float var18 = (float) this.field3505 * var16;
            float var19 = (float) this.field3505 * var17;
            float var20 = (float) this.field3509 * var14;
            float var21 = (float) this.field3509 * var15;
            float var22 = (float) this.field3510 * -var14;
            float var23 = (float) this.field3510 * -var15;
            float var24 = (float) this.field3513 * -var16;
            arg2 = arg2 + var22 + var18;
            arg0 = arg0 + var20 + var18;
            float var25 = (float) this.field3513 * -var17;
            arg1 = arg1 + var21 + var19;
            arg3 = arg3 + var23 + var19;
            arg4 = arg4 + var20 + var24;
            arg5 = arg5 + var21 + var25;
        }
        float var26 = arg2 + arg4 - arg0;
        this.field3502.method1742((arg6 & 0x1) != 0, 29646);
        float var27 = arg5 + arg3 - arg1;
        this.field3494.method2620(false);
        this.field3494.method2621(-2, this.field3502);
        this.field3494.method2573(1, false);
        this.field3494.method2545(32886, 1);
        this.field3494.method2621(-2, var11);
        this.field3494.method2558(7681, 0, 8448);
        this.field3494.method2626(8960, 768, 0, 34168);
        this.field3494.method2606(1, -24754);
        float var28 = var11.field2830 / (float) var11.field2834;
        float var29 = var11.field2835 / (float) var11.field2836;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field3502.field2835);
        OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg8) * var28, var11.field2835 - ((arg1 - (float) arg9) * var29));
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + arg4) * var28, var11.field2835 - ((float) (-arg9) + arg5) * var29);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field3502.field2830, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (var26 - (float) arg8) * var28, var11.field2835 - (((float) (-arg9) + var27) * var29));
        OpenGL.glVertex2f(var26, var27);
        OpenGL.glMultiTexCoord2f(33984, this.field3502.field2830, this.field3502.field2835);
        OpenGL.glMultiTexCoord2f(33985, (arg2 - (float) arg8) * var28, var11.field2835 - (((float) (-arg9) + arg3) * var29));
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field3494.method2626(8960, 768, 0, 5890);
        this.field3494.method2573(0, false);
        this.field3494.method2621(-2, null);
        this.field3494.method2545(32886, 0);
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(II)V")
    private final void method1704(int arg0, int arg1) {
        this.field3494.method2545(32886, 1);
        field3514++;
        if (arg1 < 126) {
            this.method511(43, 40, -52, 62);
        }
        this.field3494.method2621(-2, this.field3502);
        this.field3494.method2558(this.field3494.method2567(7681, arg0), 0, 7681);
        this.field3494.method2626(8960, 768, 1, 34167);
        this.field3494.method2630(34166, 0, 770, 34168);
        this.field3494.method2545(32886, 0);
        this.field3494.method2621(-2, this.field3508);
        this.field3494.method2558(34479, 0, 7681);
        this.field3494.method2626(8960, 768, 1, 34166);
        if (this.field3516 == 0) {
            this.field3494.method2575(0.5F, 6294, 1.0F, 0.5F, 0.0F);
        } else if (this.field3516 == 1) {
            this.field3494.method2575(0.5F, 6294, 0.5F, 1.0F, 0.0F);
        } else if (this.field3516 == 2) {
            this.field3494.method2575(1.0F, 6294, 0.5F, 0.5F, 0.0F);
        } else if (this.field3516 == 3) {
            this.field3494.method2575(128.5F, 6294, 128.5F, 128.5F, 0.0F);
            return;
        }
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(IIII)V")
    public final void method511(int arg0, int arg1, int arg2, int arg3) {
        field3503++;
        this.field3509 = arg0;
        this.field3505 = arg1;
        this.field3513 = arg3;
        this.field3510 = arg2;
        this.field3488 = this.field3509 != 0 || this.field3505 != 0 || this.field3510 != 0 || this.field3513 != 0;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "()I")
    public final int method501() {
        field3489++;
        return this.field3502.field2834 + this.field3509 + this.field3510;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)V")
    public static final void method1705(byte arg0) {
        field3507++;
        class47 var1 = class258.method1546(15, 0, (byte) 121);
        var1.method274(false);
        if (arg0 != 8) {
            field3492 = null;
        }
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lnv;IIZ)V")
    public class286(class417 arg0, int arg1, int arg2, boolean arg3) {
        this.field3494 = arg0;
        this.field3502 = class748.method4155(arg2, arg0, arg1, (byte) 29, arg3 ? 6408 : 6407);
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lnv;IIII)V")
    public class286(class417 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3494 = arg0;
        this.field3502 = class303.method1824(arg4, 3553, arg3, arg2, arg0, arg1);
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)V")
    public static void method1706(int arg0) {
        field3492 = null;
        if (arg0 != 0) {
            field3492 = null;
        }
        field3496 = null;
        field3511 = null;
        field3490 = null;
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lnv;II[III)V")
    public class286(class417 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field3494 = arg0;
        this.field3502 = class13.method64(arg3, arg2, arg1, true, arg5, false, arg4, arg0);
    }
}
