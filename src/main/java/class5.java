import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class5 extends class11 {

    @OriginalMember(owner = "client!il", name = "a", descriptor = "I")
    private int field55 = 0;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "I")
    private int field57 = 0;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "I")
    private int field56 = 0;

    @OriginalMember(owner = "client!il", name = "e", descriptor = "I")
    private int field59 = 0;

    @OriginalMember(owner = "client!il", name = "f", descriptor = "Z")
    private boolean field60 = false;

    @OriginalMember(owner = "client!il", name = "g", descriptor = "I")
    private int field61 = 0;

    @OriginalMember(owner = "client!il", name = "i", descriptor = "Lpo;")
    private class332 field63;

    @OriginalMember(owner = "client!il", name = "h", descriptor = "Lan;")
    private class17 field62;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "Lan;")
    private class17 field58;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIII)V")
    public final void method40(int arg0, int arg1, int arg2, int arg3, int arg4) {
        opengl var6 = this.field63.field4752;
        this.field62.method2725(false);
        this.field63.method2094();
        this.field63.method2131(arg4);
        var6.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var7 = this.field61 + arg0;
        int var8 = this.field59 + arg1;
        if (this.field58 == null) {
            this.field63.method2085(this.field62);
            this.field63.method2116(arg2);
            var6.glBegin(7);
            var6.glTexCoord2f(0.0F, this.field62.field171);
            var6.glVertex2i(var7, var8);
            var6.glTexCoord2f(0.0F, 0.0F);
            var6.glVertex2i(var7, this.field62.field174 + var8);
            var6.glTexCoord2f(this.field62.field172, 0.0F);
            var6.glVertex2i(this.field62.field175 + var7, this.field62.field174 + var8);
            var6.glTexCoord2f(this.field62.field172, this.field62.field171);
            var6.glVertex2i(this.field62.field175 + var7, var8);
            var6.glEnd();
            return;
        }
        this.method48(arg2);
        this.field58.method2725(false);
        var6.glBegin(7);
        var6.glMultiTexCoord2f(33985, 0.0F, this.field62.field171);
        var6.glTexCoord2f(0.0F, this.field62.field171);
        var6.glVertex2i(var7, var8);
        var6.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var6.glTexCoord2f(0.0F, 0.0F);
        var6.glVertex2i(var7, this.field62.field174 + var8);
        var6.glMultiTexCoord2f(33985, this.field62.field172, 0.0F);
        var6.glTexCoord2f(this.field62.field172, 0.0F);
        var6.glVertex2i(this.field62.field175 + var7, this.field62.field174 + var8);
        var6.glMultiTexCoord2f(33985, this.field62.field172, this.field62.field171);
        var6.glTexCoord2f(this.field62.field172, this.field62.field171);
        var6.glVertex2i(this.field62.field175 + var7, var8);
        var6.glEnd();
        this.method50();
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(III)V")
    public final void method41(int arg0, int arg1, int arg2) {
        opengl var4 = this.field63.field4752;
        var4.glPixelTransferf(3348, 0.5F);
        var4.glPixelTransferf(3349, 0.499F);
        var4.glPixelTransferf(3352, 0.5F);
        var4.glPixelTransferf(3353, 0.499F);
        var4.glPixelTransferf(3354, 0.5F);
        var4.glPixelTransferf(3355, 0.499F);
        this.field58 = class17.method115(arg0, 3553, this.field63, this.field62.field175, arg1, this.field62.field174);
        this.field57 = arg2;
        var4.glPixelTransferf(3348, 1.0F);
        var4.glPixelTransferf(3349, 0.0F);
        var4.glPixelTransferf(3352, 1.0F);
        var4.glPixelTransferf(3353, 0.0F);
        var4.glPixelTransferf(3354, 1.0F);
        var4.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIIII)V")
    public final void method42(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        opengl var8 = this.field63.field4752;
        int var9 = arg0 + arg2;
        int var10 = arg1 + arg3;
        this.field62.method2725(false);
        this.field63.method2094();
        this.field63.method2085(this.field62);
        this.field63.method2131(arg6);
        this.field63.method2116(arg4);
        var8.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field62.field173 && !this.field60) {
            float var11 = (float) arg3 * this.field62.field171 / (float) this.field62.field174;
            float var12 = (float) arg2 * this.field62.field172 / (float) this.field62.field175;
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
        var8.glTranslatef((float) this.field61, (float) this.field59, 0.0F);
        int var13 = this.method52();
        int var14 = this.method47();
        int var15 = this.field62.field174 + arg1;
        var8.glBegin(7);
        int var16 = arg1;
        while (var15 <= var10) {
            int var17 = this.field62.field175 + arg0;
            int var18 = arg0;
            while (var17 <= var9) {
                var8.glTexCoord2f(0.0F, this.field62.field171);
                var8.glVertex2i(var18, var16);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2i(var18, var15);
                var8.glTexCoord2f(this.field62.field172, 0.0F);
                var8.glVertex2i(var17, var15);
                var8.glTexCoord2f(this.field62.field172, this.field62.field171);
                var8.glVertex2i(var17, var16);
                var17 += var13;
                var18 += var13;
            }
            if (var18 < var9) {
                float var19 = (float) (var9 - var18) * this.field62.field172 / (float) this.field62.field175;
                var8.glTexCoord2f(0.0F, this.field62.field171);
                var8.glVertex2i(var18, var16);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2i(var18, var15);
                var8.glTexCoord2f(var19, 0.0F);
                var8.glVertex2i(var9, var15);
                var8.glTexCoord2f(var19, this.field62.field171);
                var8.glVertex2i(var9, var16);
            }
            var16 += var14;
            var15 += var14;
        }
        if (var16 < var10) {
            float var20 = (float) (this.field62.field174 - (var10 - var16)) * this.field62.field171 / (float) this.field62.field174;
            int var21 = this.field62.field175 + arg0;
            int var22 = arg0;
            while (var21 <= var9) {
                var8.glTexCoord2f(0.0F, this.field62.field171);
                var8.glVertex2i(var22, var16);
                var8.glTexCoord2f(0.0F, var20);
                var8.glVertex2i(var22, var10);
                var8.glTexCoord2f(this.field62.field172, var20);
                var8.glVertex2i(var21, var10);
                var8.glTexCoord2f(this.field62.field172, this.field62.field171);
                var8.glVertex2i(var21, var16);
                var21 += var13;
                var22 += var13;
            }
            if (var22 < var9) {
                float var23 = (float) (var9 - var22) * this.field62.field172 / (float) this.field62.field175;
                var8.glTexCoord2f(0.0F, this.field62.field171);
                var8.glVertex2i(var22, var16);
                var8.glTexCoord2f(0.0F, var20);
                var8.glVertex2i(var22, var10);
                var8.glTexCoord2f(var23, var20);
                var8.glVertex2i(var9, var10);
                var8.glTexCoord2f(var23, this.field62.field171);
                var8.glVertex2i(var9, var16);
            }
        }
        var8.glEnd();
        var8.glPopMatrix();
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(FFFFFFIII)V")
    public final void method43(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field60) {
            float var10 = (float) this.method52();
            float var11 = (float) this.method47();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field59 * var14;
            float var17 = (float) this.field59 * var15;
            float var18 = (float) this.field61 * var12;
            float var19 = (float) this.field61 * var13;
            float var20 = (float) this.field55 * -var12;
            float var21 = (float) this.field55 * -var13;
            float var22 = (float) this.field56 * -var14;
            float var23 = (float) this.field56 * -var15;
            arg0 = arg0 + var18 + var16;
            arg1 = arg1 + var19 + var17;
            arg2 = arg2 + var20 + var16;
            arg3 = arg3 + var21 + var17;
            arg4 = arg4 + var18 + var22;
            arg5 = arg5 + var19 + var23;
        }
        float var24 = arg2 + arg4 - arg0;
        float var25 = arg5 + arg3 - arg1;
        opengl var26 = this.field63.field4752;
        this.field62.method2725(true);
        this.field63.method2094();
        this.field63.method2085(this.field62);
        this.field63.method2131(arg8);
        this.field63.method2116(arg6);
        var26.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        var26.glBegin(7);
        var26.glTexCoord2f(0.0F, this.field62.field171);
        var26.glVertex2f(arg0, arg1);
        var26.glTexCoord2f(0.0F, 0.0F);
        var26.glVertex2f(arg4, arg5);
        var26.glTexCoord2f(this.field62.field172, 0.0F);
        var26.glVertex2f(var24, var25);
        var26.glTexCoord2f(this.field62.field172, this.field62.field171);
        var26.glVertex2f(arg2, arg3);
        var26.glEnd();
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIII)V")
    public final void method44(int arg0, int arg1, int arg2, int arg3) {
        this.field61 = arg0;
        this.field59 = arg1;
        this.field55 = arg2;
        this.field56 = arg3;
        this.field60 = this.field61 != 0 || this.field59 != 0 || this.field55 != 0 || this.field56 != 0;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IILhm;II)V")
    public final void method45(int arg0, int arg1, class121 arg2, int arg3, int arg4) {
        class405 var6 = (class405) arg2;
        class17 var7 = var6.field5894;
        this.field62.method2725(false);
        this.field63.method2094();
        this.field63.method2085(this.field62);
        this.field63.method2116(0);
        this.field63.method2062(1);
        this.field63.method2085(var7);
        this.field63.method2100(7681, 8448);
        this.field63.method2086(0, 34168, 768);
        this.field63.method2131(1);
        int var8 = this.field61 + arg0;
        int var9 = this.field59 + arg1;
        int var10 = this.field62.field175 + var8;
        int var11 = this.field62.field174 + var9;
        float var12 = var7.field172 / (float) var7.field175;
        float var13 = var7.field171 / (float) var7.field174;
        float var14 = (float) (var8 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field171 - (float) (var9 - arg4) * var13;
        float var17 = var7.field171 - (float) (var11 - arg4) * var13;
        opengl var18 = this.field63.field4752;
        var18.glBegin(7);
        var18.glColor3f(1.0F, 1.0F, 1.0F);
        var18.glMultiTexCoord2f(33984, 0.0F, this.field62.field171);
        var18.glMultiTexCoord2f(33985, var14, var16);
        var18.glVertex2i(var8, var9);
        var18.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        var18.glMultiTexCoord2f(33985, var14, var17);
        var18.glVertex2i(var8, this.field62.field174 + var9);
        var18.glMultiTexCoord2f(33984, this.field62.field172, 0.0F);
        var18.glMultiTexCoord2f(33985, var15, var17);
        var18.glVertex2i(this.field62.field175 + var8, this.field62.field174 + var9);
        var18.glMultiTexCoord2f(33984, this.field62.field172, this.field62.field171);
        var18.glMultiTexCoord2f(33985, var15, var16);
        var18.glVertex2i(this.field62.field175 + var8, var9);
        var18.glEnd();
        this.field63.method2086(0, 5890, 768);
        this.field63.method2116(1);
        this.field63.method2085((class439) null);
        this.field63.method2062(0);
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(IIIIIII)V")
    public final void method46(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        opengl var8 = this.field63.field4752;
        this.field62.method2725(true);
        this.field63.method2094();
        this.field63.method2131(arg6);
        var8.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field60) {
            float var9 = (float) arg2 / (float) this.method52();
            float var10 = (float) arg3 / (float) this.method47();
            float var11 = (float) this.field61 * var9 + (float) arg0;
            float var12 = (float) this.field59 * var10 + (float) arg1;
            float var13 = (float) this.field62.field175 * var9 + var11;
            float var14 = (float) this.field62.field174 * var10 + var12;
            if (this.field58 == null) {
                this.field63.method2085(this.field62);
                this.field63.method2116(arg4);
                var8.glBegin(7);
                var8.glTexCoord2f(0.0F, this.field62.field171);
                var8.glVertex2f(var11, var12);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2f(var11, var14);
                var8.glTexCoord2f(this.field62.field172, 0.0F);
                var8.glVertex2f(var13, var14);
                var8.glTexCoord2f(this.field62.field172, this.field62.field171);
                var8.glVertex2f(var13, var12);
                var8.glEnd();
            } else {
                this.method48(arg4);
                this.field58.method2725(true);
                var8.glBegin(7);
                var8.glMultiTexCoord2f(33985, 0.0F, this.field62.field171);
                var8.glTexCoord2f(0.0F, this.field62.field171);
                var8.glVertex2f(var11, var12);
                var8.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2f(var11, var14);
                var8.glMultiTexCoord2f(33985, this.field62.field172, 0.0F);
                var8.glTexCoord2f(this.field62.field172, 0.0F);
                var8.glVertex2f(var13, var14);
                var8.glMultiTexCoord2f(33985, this.field62.field172, this.field62.field171);
                var8.glTexCoord2f(this.field62.field172, this.field62.field171);
                var8.glVertex2f(var13, var12);
                var8.glEnd();
                this.method50();
            }
        } else if (this.field58 == null) {
            this.field63.method2085(this.field62);
            this.field63.method2116(arg4);
            var8.glBegin(7);
            var8.glTexCoord2f(0.0F, this.field62.field171);
            var8.glVertex2i(arg0, arg1);
            var8.glTexCoord2f(0.0F, 0.0F);
            var8.glVertex2i(arg0, arg1 + arg3);
            var8.glTexCoord2f(this.field62.field172, 0.0F);
            var8.glVertex2i(arg0 + arg2, arg1 + arg3);
            var8.glTexCoord2f(this.field62.field172, this.field62.field171);
            var8.glVertex2i(arg0 + arg2, arg1);
            var8.glEnd();
        } else {
            this.method48(arg4);
            this.field58.method2725(true);
            var8.glBegin(7);
            var8.glMultiTexCoord2f(33985, 0.0F, this.field62.field171);
            var8.glTexCoord2f(0.0F, this.field62.field171);
            var8.glVertex2i(arg0, arg1);
            var8.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            var8.glTexCoord2f(0.0F, 0.0F);
            var8.glVertex2i(arg0, arg1 + arg3);
            var8.glMultiTexCoord2f(33985, this.field62.field172, 0.0F);
            var8.glTexCoord2f(this.field62.field172, 0.0F);
            var8.glVertex2i(arg0 + arg2, arg1 + arg3);
            var8.glMultiTexCoord2f(33985, this.field62.field172, this.field62.field171);
            var8.glTexCoord2f(this.field62.field172, this.field62.field171);
            var8.glVertex2i(arg0 + arg2, arg1);
            var8.glEnd();
            this.method50();
        }
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "()I")
    public final int method47() {
        return this.field62.field174 + this.field59 + this.field56;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V")
    private final void method48(int arg0) {
        this.field63.method2062(1);
        this.field63.method2085(this.field62);
        this.field63.method2100(this.field63.method2069(arg0), 7681);
        this.field63.method2086(1, 34167, 768);
        this.field63.method2087(0, 34168, 770);
        this.field63.method2062(0);
        this.field63.method2085(this.field58);
        this.field63.method2100(34479, 7681);
        this.field63.method2086(1, 34166, 768);
        if (this.field57 == 0) {
            this.field63.method2076(1.0F, 0.5F, 0.5F, 0.0F);
        } else if (this.field57 == 1) {
            this.field63.method2076(0.5F, 1.0F, 0.5F, 0.0F);
        } else if (this.field57 == 2) {
            this.field63.method2076(0.5F, 0.5F, 1.0F, 0.0F);
        } else if (this.field57 == 3) {
            this.field63.method2076(128.5F, 128.5F, 128.5F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "()I")
    public final int method49() {
        return this.field62.field174;
    }

    @OriginalMember(owner = "client!il", name = "e", descriptor = "()V")
    private final void method50() {
        this.field63.method2062(1);
        this.field63.method2085((class439) null);
        this.field63.method2100(8448, 8448);
        this.field63.method2086(1, 34168, 768);
        this.field63.method2087(0, 5890, 770);
        this.field63.method2062(0);
        this.field63.method2086(1, 34168, 768);
    }

    @OriginalMember(owner = "client!il", name = "d", descriptor = "()I")
    public final int method51() {
        return this.field62.field175;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "()I")
    public final int method52() {
        return this.field62.field175 + this.field61 + this.field55;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(FFFFFFLhm;II)V")
    public final void method53(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class121 arg6, int arg7, int arg8) {
        class17 var10 = ((class405) arg6).field5894;
        if (this.field60) {
            float var11 = (float) this.method52();
            float var12 = (float) this.method47();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field59 * var15;
            float var18 = (float) this.field59 * var16;
            float var19 = (float) this.field61 * var13;
            float var20 = (float) this.field61 * var14;
            float var21 = (float) this.field55 * -var13;
            float var22 = (float) this.field55 * -var14;
            float var23 = (float) this.field56 * -var15;
            float var24 = (float) this.field56 * -var16;
            arg0 = arg0 + var19 + var17;
            arg1 = arg1 + var20 + var18;
            arg2 = arg2 + var21 + var17;
            arg3 = arg3 + var22 + var18;
            arg4 = arg4 + var19 + var23;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        opengl var27 = this.field63.field4752;
        this.field62.method2725(true);
        this.field63.method2094();
        this.field63.method2085(this.field62);
        this.field63.method2116(0);
        this.field63.method2062(1);
        this.field63.method2085(var10);
        this.field63.method2100(7681, 8448);
        this.field63.method2086(0, 34168, 768);
        this.field63.method2131(1);
        float var28 = var10.field172 / (float) var10.field175;
        float var29 = var10.field171 / (float) var10.field174;
        var27.glBegin(7);
        var27.glColor3f(1.0F, 1.0F, 1.0F);
        var27.glMultiTexCoord2f(33984, 0.0F, this.field62.field171);
        var27.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * var28, var10.field171 - (arg1 - (float) arg8) * var29);
        var27.glVertex2f(arg0, arg1);
        var27.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        var27.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * var28, var10.field171 - (arg5 - (float) arg8) * var29);
        var27.glVertex2f(arg4, arg5);
        var27.glMultiTexCoord2f(33984, this.field62.field172, 0.0F);
        var27.glMultiTexCoord2f(33985, (var25 - (float) arg7) * var28, var10.field171 - (var26 - (float) arg8) * var29);
        var27.glVertex2f(var25, var26);
        var27.glMultiTexCoord2f(33984, this.field62.field172, this.field62.field171);
        var27.glMultiTexCoord2f(33985, (arg2 - (float) arg7) * var28, var10.field171 - (arg3 - (float) arg8) * var29);
        var27.glVertex2f(arg2, arg3);
        var27.glEnd();
        this.field63.method2086(0, 5890, 768);
        this.field63.method2116(1);
        this.field63.method2085((class439) null);
        this.field63.method2062(0);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIII)V")
    public final void method54(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field62.method835(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lpo;IIII)V")
    public class5(class332 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field63 = arg0;
        this.field62 = class17.method115(arg1, 3553, arg0, arg3, arg2, arg4);
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lpo;II[III)V")
    public class5(class332 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field63 = arg0;
        this.field62 = class17.method114(arg3, arg1, arg2, arg0, (byte) 115, false);
    }
}
