import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class269 extends class139 {

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "Z")
    private boolean field3586 = false;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    private int field3589 = 0;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    private int field3587 = 0;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    private int field3585 = 0;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    private int field3588 = 0;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
    private int field3592 = 0;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "Lbf;")
    private class344 field3590;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "Lln;")
    private class234 field3593;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "Lln;")
    private class234 field3591;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(IIIIIII)V", line = 4)
    public final void method776(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        opengl var8 = this.field3590.field4604;
        int var9 = arg0 + arg2;
        int var10 = arg1 + arg3;
        this.field3593.method2370(false);
        this.field3590.method2055();
        this.field3590.method2106(this.field3593);
        this.field3590.method1957(arg6);
        this.field3590.method1984(arg4);
        var8.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field3593.field3107 && !this.field3586) {
            float var11 = (float) arg3 * this.field3593.field3111 / (float) this.field3593.field3108;
            float var12 = (float) arg2 * this.field3593.field3110 / (float) this.field3593.field3109;
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
        var8.glTranslatef((float) this.field3588, (float) this.field3592, 0.0F);
        int var13 = this.method777();
        int var14 = this.method774();
        int var15 = this.field3593.field3108 + arg1;
        var8.glBegin(7);
        int var16 = arg1;
        while (var15 <= var10) {
            int var17 = this.field3593.field3109 + arg0;
            int var18 = arg0;
            while (var17 <= var9) {
                var8.glTexCoord2f(0.0F, this.field3593.field3111);
                var8.glVertex2i(var18, var16);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2i(var18, var15);
                var8.glTexCoord2f(this.field3593.field3110, 0.0F);
                var8.glVertex2i(var17, var15);
                var8.glTexCoord2f(this.field3593.field3110, this.field3593.field3111);
                var8.glVertex2i(var17, var16);
                var17 += var13;
                var18 += var13;
            }
            if (var18 < var9) {
                float var19 = (float) (var9 - var18) * this.field3593.field3110 / (float) this.field3593.field3109;
                var8.glTexCoord2f(0.0F, this.field3593.field3111);
                var8.glVertex2i(var18, var16);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2i(var18, var15);
                var8.glTexCoord2f(var19, 0.0F);
                var8.glVertex2i(var9, var15);
                var8.glTexCoord2f(var19, this.field3593.field3111);
                var8.glVertex2i(var9, var16);
            }
            var16 += var14;
            var15 += var14;
        }
        if (var16 < var10) {
            float var20 = (float) (this.field3593.field3108 - (var10 - var16)) * this.field3593.field3111 / (float) this.field3593.field3108;
            int var21 = this.field3593.field3109 + arg0;
            int var22 = arg0;
            while (var21 <= var9) {
                var8.glTexCoord2f(0.0F, this.field3593.field3111);
                var8.glVertex2i(var22, var16);
                var8.glTexCoord2f(0.0F, var20);
                var8.glVertex2i(var22, var10);
                var8.glTexCoord2f(this.field3593.field3110, var20);
                var8.glVertex2i(var21, var10);
                var8.glTexCoord2f(this.field3593.field3110, this.field3593.field3111);
                var8.glVertex2i(var21, var16);
                var21 += var13;
                var22 += var13;
            }
            if (var22 < var9) {
                float var23 = (float) (var9 - var22) * this.field3593.field3110 / (float) this.field3593.field3109;
                var8.glTexCoord2f(0.0F, this.field3593.field3111);
                var8.glVertex2i(var22, var16);
                var8.glTexCoord2f(0.0F, var20);
                var8.glVertex2i(var22, var10);
                var8.glTexCoord2f(var23, var20);
                var8.glVertex2i(var9, var10);
                var8.glTexCoord2f(var23, this.field3593.field3111);
                var8.glVertex2i(var9, var16);
            }
        }
        var8.glEnd();
        var8.glPopMatrix();
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIII)V", line = 136)
    public final void method768(int arg0, int arg1, int arg2, int arg3, int arg4) {
        opengl var6 = this.field3590.field4604;
        this.field3593.method2370(false);
        this.field3590.method2055();
        this.field3590.method1957(arg4);
        var6.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var7 = this.field3588 + arg0;
        int var8 = this.field3592 + arg1;
        if (this.field3591 == null) {
            this.field3590.method2106(this.field3593);
            this.field3590.method1984(arg2);
            var6.glBegin(7);
            var6.glTexCoord2f(0.0F, this.field3593.field3111);
            var6.glVertex2i(var7, var8);
            var6.glTexCoord2f(0.0F, 0.0F);
            var6.glVertex2i(var7, this.field3593.field3108 + var8);
            var6.glTexCoord2f(this.field3593.field3110, 0.0F);
            var6.glVertex2i(this.field3593.field3109 + var7, this.field3593.field3108 + var8);
            var6.glTexCoord2f(this.field3593.field3110, this.field3593.field3111);
            var6.glVertex2i(this.field3593.field3109 + var7, var8);
            var6.glEnd();
            return;
        }
        this.method1530(arg2);
        this.field3591.method2370(false);
        var6.glBegin(7);
        var6.glMultiTexCoord2f(33985, 0.0F, this.field3593.field3111);
        var6.glTexCoord2f(0.0F, this.field3593.field3111);
        var6.glVertex2i(var7, var8);
        var6.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var6.glTexCoord2f(0.0F, 0.0F);
        var6.glVertex2i(var7, this.field3593.field3108 + var8);
        var6.glMultiTexCoord2f(33985, this.field3593.field3110, 0.0F);
        var6.glTexCoord2f(this.field3593.field3110, 0.0F);
        var6.glVertex2i(this.field3593.field3109 + var7, this.field3593.field3108 + var8);
        var6.glMultiTexCoord2f(33985, this.field3593.field3110, this.field3593.field3111);
        var6.glTexCoord2f(this.field3593.field3110, this.field3593.field3111);
        var6.glVertex2i(this.field3593.field3109 + var7, var8);
        var6.glEnd();
        this.method1529();
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIII)V", line = 185)
    public final void method773(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        opengl var8 = this.field3590.field4604;
        this.field3593.method2370(true);
        this.field3590.method2055();
        this.field3590.method1957(arg6);
        var8.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field3586) {
            float var9 = (float) arg2 / (float) this.method777();
            float var10 = (float) arg3 / (float) this.method774();
            float var11 = (float) this.field3588 * var9 + (float) arg0;
            float var12 = (float) this.field3592 * var10 + (float) arg1;
            float var13 = (float) this.field3593.field3109 * var9 + var11;
            float var14 = (float) this.field3593.field3108 * var10 + var12;
            if (this.field3591 == null) {
                this.field3590.method2106(this.field3593);
                this.field3590.method1984(arg4);
                var8.glBegin(7);
                var8.glTexCoord2f(0.0F, this.field3593.field3111);
                var8.glVertex2f(var11, var12);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2f(var11, var14);
                var8.glTexCoord2f(this.field3593.field3110, 0.0F);
                var8.glVertex2f(var13, var14);
                var8.glTexCoord2f(this.field3593.field3110, this.field3593.field3111);
                var8.glVertex2f(var13, var12);
                var8.glEnd();
            } else {
                this.method1530(arg4);
                this.field3591.method2370(true);
                var8.glBegin(7);
                var8.glMultiTexCoord2f(33985, 0.0F, this.field3593.field3111);
                var8.glTexCoord2f(0.0F, this.field3593.field3111);
                var8.glVertex2f(var11, var12);
                var8.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2f(var11, var14);
                var8.glMultiTexCoord2f(33985, this.field3593.field3110, 0.0F);
                var8.glTexCoord2f(this.field3593.field3110, 0.0F);
                var8.glVertex2f(var13, var14);
                var8.glMultiTexCoord2f(33985, this.field3593.field3110, this.field3593.field3111);
                var8.glTexCoord2f(this.field3593.field3110, this.field3593.field3111);
                var8.glVertex2f(var13, var12);
                var8.glEnd();
                this.method1529();
            }
        } else if (this.field3591 == null) {
            this.field3590.method2106(this.field3593);
            this.field3590.method1984(arg4);
            var8.glBegin(7);
            var8.glTexCoord2f(0.0F, this.field3593.field3111);
            var8.glVertex2i(arg0, arg1);
            var8.glTexCoord2f(0.0F, 0.0F);
            var8.glVertex2i(arg0, arg1 + arg3);
            var8.glTexCoord2f(this.field3593.field3110, 0.0F);
            var8.glVertex2i(arg0 + arg2, arg1 + arg3);
            var8.glTexCoord2f(this.field3593.field3110, this.field3593.field3111);
            var8.glVertex2i(arg0 + arg2, arg1);
            var8.glEnd();
        } else {
            this.method1530(arg4);
            this.field3591.method2370(true);
            var8.glBegin(7);
            var8.glMultiTexCoord2f(33985, 0.0F, this.field3593.field3111);
            var8.glTexCoord2f(0.0F, this.field3593.field3111);
            var8.glVertex2i(arg0, arg1);
            var8.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            var8.glTexCoord2f(0.0F, 0.0F);
            var8.glVertex2i(arg0, arg1 + arg3);
            var8.glMultiTexCoord2f(33985, this.field3593.field3110, 0.0F);
            var8.glTexCoord2f(this.field3593.field3110, 0.0F);
            var8.glVertex2i(arg0 + arg2, arg1 + arg3);
            var8.glMultiTexCoord2f(33985, this.field3593.field3110, this.field3593.field3111);
            var8.glTexCoord2f(this.field3593.field3110, this.field3593.field3111);
            var8.glVertex2i(arg0 + arg2, arg1);
            var8.glEnd();
            this.method1529();
        }
    }

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "()V", line = 285)
    private final void method1529() {
        this.field3590.method2067(1);
        this.field3590.method2106((class386) null);
        this.field3590.method1994(8448, 8448);
        this.field3590.method1990(1, 34168, 768);
        this.field3590.method2068(0, 5890, 770);
        this.field3590.method2067(0);
        this.field3590.method1990(1, 34168, 768);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "()I", line = 294)
    public final int method771() {
        return this.field3593.field3108;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(FFFFFFIII)V", line = 300)
    public final void method769(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field3586) {
            float var10 = (float) this.method777();
            float var11 = (float) this.method774();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field3592 * var14;
            float var17 = (float) this.field3592 * var15;
            float var18 = (float) this.field3588 * var12;
            float var19 = (float) this.field3588 * var13;
            float var20 = (float) this.field3585 * -var12;
            float var21 = (float) this.field3585 * -var13;
            float var22 = (float) this.field3587 * -var14;
            float var23 = (float) this.field3587 * -var15;
            arg0 = arg0 + var18 + var16;
            arg1 = arg1 + var19 + var17;
            arg2 = arg2 + var20 + var16;
            arg3 = arg3 + var21 + var17;
            arg4 = arg4 + var18 + var22;
            arg5 = arg5 + var19 + var23;
        }
        float var24 = arg2 + arg4 - arg0;
        float var25 = arg5 + arg3 - arg1;
        opengl var26 = this.field3590.field4604;
        this.field3593.method2370(true);
        this.field3590.method2055();
        this.field3590.method2106(this.field3593);
        this.field3590.method1957(arg8);
        this.field3590.method1984(arg6);
        var26.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        var26.glBegin(7);
        var26.glTexCoord2f(0.0F, this.field3593.field3111);
        var26.glVertex2f(arg0, arg1);
        var26.glTexCoord2f(0.0F, 0.0F);
        var26.glVertex2f(arg4, arg5);
        var26.glTexCoord2f(this.field3593.field3110, 0.0F);
        var26.glVertex2f(var24, var25);
        var26.glTexCoord2f(this.field3593.field3110, this.field3593.field3111);
        var26.glVertex2f(arg2, arg3);
        var26.glEnd();
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V", line = 363)
    private final void method1530(int arg0) {
        this.field3590.method2067(1);
        this.field3590.method2106(this.field3593);
        this.field3590.method1994(this.field3590.method1953(arg0), 7681);
        this.field3590.method1990(1, 34167, 768);
        this.field3590.method2068(0, 34168, 770);
        this.field3590.method2067(0);
        this.field3590.method2106(this.field3591);
        this.field3590.method1994(34479, 7681);
        this.field3590.method1990(1, 34166, 768);
        if (this.field3589 == 0) {
            this.field3590.method2021(1.0F, 0.5F, 0.5F, 0.0F);
        } else if (this.field3589 == 1) {
            this.field3590.method2021(0.5F, 1.0F, 0.5F, 0.0F);
        } else if (this.field3589 == 2) {
            this.field3590.method2021(0.5F, 0.5F, 1.0F, 0.0F);
        } else if (this.field3589 == 3) {
            this.field3590.method2021(128.5F, 128.5F, 128.5F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lbf;IIII)V", line = 594)
    public class269(class344 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3590 = arg0;
        this.field3593 = class234.method1308(arg1, arg2, arg3, arg4, (byte) 88, arg0);
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lbf;II[III)V", line = 600)
    public class269(class344 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field3590 = arg0;
        this.field3593 = class234.method1306(false, -21262, arg0, arg3, arg1, arg2);
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "()I", line = 392)
    public final int method774() {
        return this.field3593.field3108 + this.field3592 + this.field3587;
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "()I", line = 399)
    public final int method777() {
        return this.field3593.field3109 + this.field3588 + this.field3585;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(FFFFFFLkf;II)V", line = 407)
    public final void method766(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class152 arg6, int arg7, int arg8) {
        class234 var10 = ((class415) arg6).field5655;
        if (this.field3586) {
            float var11 = (float) this.method777();
            float var12 = (float) this.method774();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field3592 * var15;
            float var18 = (float) this.field3592 * var16;
            float var19 = (float) this.field3588 * var13;
            float var20 = (float) this.field3588 * var14;
            float var21 = (float) this.field3585 * -var13;
            float var22 = (float) this.field3585 * -var14;
            float var23 = (float) this.field3587 * -var15;
            float var24 = (float) this.field3587 * -var16;
            arg0 = arg0 + var19 + var17;
            arg1 = arg1 + var20 + var18;
            arg2 = arg2 + var21 + var17;
            arg3 = arg3 + var22 + var18;
            arg4 = arg4 + var19 + var23;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        opengl var27 = this.field3590.field4604;
        this.field3593.method2370(true);
        this.field3590.method2055();
        this.field3590.method2106(this.field3593);
        this.field3590.method1984(0);
        this.field3590.method2067(1);
        this.field3590.method2106(var10);
        this.field3590.method1994(7681, 8448);
        this.field3590.method1990(0, 34168, 768);
        this.field3590.method1957(1);
        float var28 = var10.field3110 / (float) var10.field3109;
        float var29 = var10.field3111 / (float) var10.field3108;
        var27.glBegin(7);
        var27.glColor3f(1.0F, 1.0F, 1.0F);
        var27.glMultiTexCoord2f(33984, 0.0F, this.field3593.field3111);
        var27.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * var28, var10.field3111 - (arg1 - (float) arg8) * var29);
        var27.glVertex2f(arg0, arg1);
        var27.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        var27.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * var28, var10.field3111 - (arg5 - (float) arg8) * var29);
        var27.glVertex2f(arg4, arg5);
        var27.glMultiTexCoord2f(33984, this.field3593.field3110, 0.0F);
        var27.glMultiTexCoord2f(33985, (var25 - (float) arg7) * var28, var10.field3111 - (var26 - (float) arg8) * var29);
        var27.glVertex2f(var25, var26);
        var27.glMultiTexCoord2f(33984, this.field3593.field3110, this.field3593.field3111);
        var27.glMultiTexCoord2f(33985, (arg2 - (float) arg7) * var28, var10.field3111 - (arg3 - (float) arg8) * var29);
        var27.glVertex2f(arg2, arg3);
        var27.glEnd();
        this.field3590.method1990(0, 5890, 768);
        this.field3590.method1984(1);
        this.field3590.method2106((class386) null);
        this.field3590.method2067(0);
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "()I", line = 491)
    public final int method775() {
        return this.field3593.field3109;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIII)V", line = 497)
    public final void method839(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3593.method413(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)V", line = 505)
    public final void method840(int arg0, int arg1, int arg2) {
        opengl var4 = this.field3590.field4604;
        var4.glPixelTransferf(3348, 0.5F);
        var4.glPixelTransferf(3349, 0.499F);
        var4.glPixelTransferf(3352, 0.5F);
        var4.glPixelTransferf(3353, 0.499F);
        var4.glPixelTransferf(3354, 0.5F);
        var4.glPixelTransferf(3355, 0.499F);
        this.field3591 = class234.method1308(arg0, arg1, this.field3593.field3109, this.field3593.field3108, (byte) 88, this.field3590);
        this.field3589 = arg2;
        var4.glPixelTransferf(3348, 1.0F);
        var4.glPixelTransferf(3349, 0.0F);
        var4.glPixelTransferf(3352, 1.0F);
        var4.glPixelTransferf(3353, 0.0F);
        var4.glPixelTransferf(3354, 1.0F);
        var4.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IILkf;II)V", line = 525)
    public final void method770(int arg0, int arg1, class152 arg2, int arg3, int arg4) {
        class415 var6 = (class415) arg2;
        class234 var7 = var6.field5655;
        this.field3593.method2370(false);
        this.field3590.method2055();
        this.field3590.method2106(this.field3593);
        this.field3590.method1984(0);
        this.field3590.method2067(1);
        this.field3590.method2106(var7);
        this.field3590.method1994(7681, 8448);
        this.field3590.method1990(0, 34168, 768);
        this.field3590.method1957(1);
        int var8 = this.field3588 + arg0;
        int var9 = this.field3592 + arg1;
        int var10 = this.field3593.field3109 + var8;
        int var11 = this.field3593.field3108 + var9;
        float var12 = var7.field3110 / (float) var7.field3109;
        float var13 = var7.field3111 / (float) var7.field3108;
        float var14 = (float) (var8 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field3111 - (float) (var9 - arg4) * var13;
        float var17 = var7.field3111 - (float) (var11 - arg4) * var13;
        opengl var18 = this.field3590.field4604;
        var18.glBegin(7);
        var18.glColor3f(1.0F, 1.0F, 1.0F);
        var18.glMultiTexCoord2f(33984, 0.0F, this.field3593.field3111);
        var18.glMultiTexCoord2f(33985, var14, var16);
        var18.glVertex2i(var8, var9);
        var18.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        var18.glMultiTexCoord2f(33985, var14, var17);
        var18.glVertex2i(var8, this.field3593.field3108 + var9);
        var18.glMultiTexCoord2f(33984, this.field3593.field3110, 0.0F);
        var18.glMultiTexCoord2f(33985, var15, var17);
        var18.glVertex2i(this.field3593.field3109 + var8, this.field3593.field3108 + var9);
        var18.glMultiTexCoord2f(33984, this.field3593.field3110, this.field3593.field3111);
        var18.glMultiTexCoord2f(33985, var15, var16);
        var18.glVertex2i(this.field3593.field3109 + var8, var9);
        var18.glEnd();
        this.field3590.method1990(0, 5890, 768);
        this.field3590.method1984(1);
        this.field3590.method2106((class386) null);
        this.field3590.method2067(0);
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(IIII)V", line = 580)
    public final void method772(int arg0, int arg1, int arg2, int arg3) {
        this.field3588 = arg0;
        this.field3592 = arg1;
        this.field3585 = arg2;
        this.field3587 = arg3;
        this.field3586 = this.field3588 != 0 || this.field3592 != 0 || this.field3585 != 0 || this.field3587 != 0;
    }
}
