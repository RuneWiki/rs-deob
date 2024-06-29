import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class14 extends class256 {

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    private int field207 = 0;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    private int field208 = 0;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "I")
    private int field211 = 0;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "I")
    private int field210 = 0;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "I")
    private int field213 = 0;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "Z")
    private boolean field212 = false;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "Lig;")
    private class132 field205;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "Lrk;")
    private class22 field206;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "Lrk;")
    private class22 field209;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(IIIIIII)V", line = 5)
    public final void method74(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        opengl var8 = this.field205.field1918;
        this.field206.method2524(true);
        this.field205.method889();
        this.field205.method972(arg6);
        var8.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field212) {
            float var9 = (float) arg2 / (float) this.method83();
            float var10 = (float) arg3 / (float) this.method75();
            float var11 = (float) this.field213 * var9 + (float) arg0;
            float var12 = (float) this.field208 * var10 + (float) arg1;
            float var13 = (float) this.field206.field278 * var9 + var11;
            float var14 = (float) this.field206.field277 * var10 + var12;
            if (this.field209 == null) {
                this.field205.method888(this.field206);
                this.field205.method913(arg4);
                var8.glBegin(7);
                var8.glTexCoord2f(0.0F, this.field206.field276);
                var8.glVertex2f(var11, var12);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2f(var11, var14);
                var8.glTexCoord2f(this.field206.field279, 0.0F);
                var8.glVertex2f(var13, var14);
                var8.glTexCoord2f(this.field206.field279, this.field206.field276);
                var8.glVertex2f(var13, var12);
                var8.glEnd();
            } else {
                this.method79(arg4);
                this.field209.method2524(true);
                var8.glBegin(7);
                var8.glMultiTexCoord2f(33985, 0.0F, this.field206.field276);
                var8.glTexCoord2f(0.0F, this.field206.field276);
                var8.glVertex2f(var11, var12);
                var8.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2f(var11, var14);
                var8.glMultiTexCoord2f(33985, this.field206.field279, 0.0F);
                var8.glTexCoord2f(this.field206.field279, 0.0F);
                var8.glVertex2f(var13, var14);
                var8.glMultiTexCoord2f(33985, this.field206.field279, this.field206.field276);
                var8.glTexCoord2f(this.field206.field279, this.field206.field276);
                var8.glVertex2f(var13, var12);
                var8.glEnd();
                this.method76();
            }
        } else if (this.field209 == null) {
            this.field205.method888(this.field206);
            this.field205.method913(arg4);
            var8.glBegin(7);
            var8.glTexCoord2f(0.0F, this.field206.field276);
            var8.glVertex2i(arg0, arg1);
            var8.glTexCoord2f(0.0F, 0.0F);
            var8.glVertex2i(arg0, arg1 + arg3);
            var8.glTexCoord2f(this.field206.field279, 0.0F);
            var8.glVertex2i(arg0 + arg2, arg1 + arg3);
            var8.glTexCoord2f(this.field206.field279, this.field206.field276);
            var8.glVertex2i(arg0 + arg2, arg1);
            var8.glEnd();
        } else {
            this.method79(arg4);
            this.field209.method2524(true);
            var8.glBegin(7);
            var8.glMultiTexCoord2f(33985, 0.0F, this.field206.field276);
            var8.glTexCoord2f(0.0F, this.field206.field276);
            var8.glVertex2i(arg0, arg1);
            var8.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            var8.glTexCoord2f(0.0F, 0.0F);
            var8.glVertex2i(arg0, arg1 + arg3);
            var8.glMultiTexCoord2f(33985, this.field206.field279, 0.0F);
            var8.glTexCoord2f(this.field206.field279, 0.0F);
            var8.glVertex2i(arg0 + arg2, arg1 + arg3);
            var8.glMultiTexCoord2f(33985, this.field206.field279, this.field206.field276);
            var8.glTexCoord2f(this.field206.field279, this.field206.field276);
            var8.glVertex2i(arg0 + arg2, arg1);
            var8.glEnd();
            this.method76();
        }
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "()I", line = 105)
    public final int method75() {
        return this.field206.field277 + this.field208 + this.field207;
    }

    @OriginalMember(owner = "client!l", name = "e", descriptor = "()V", line = 109)
    private final void method76() {
        this.field205.method1002(1);
        this.field205.method888((class404) null);
        this.field205.method926(8448, 8448);
        this.field205.method949(1, 34168, 768);
        this.field205.method958(0, 5890, 770);
        this.field205.method1002(0);
        this.field205.method949(1, 34168, 768);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIII)V", line = 123)
    public final void method77(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field206.method1576(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IILsg;II)V", line = 127)
    public final void method78(int arg0, int arg1, class226 arg2, int arg3, int arg4) {
        class133 var6 = (class133) arg2;
        class22 var7 = var6.field2052;
        this.field206.method2524(false);
        this.field205.method889();
        this.field205.method888(this.field206);
        this.field205.method913(0);
        this.field205.method1002(1);
        this.field205.method888(var7);
        this.field205.method926(7681, 8448);
        this.field205.method949(0, 34168, 768);
        this.field205.method972(1);
        int var8 = this.field213 + arg0;
        int var9 = this.field208 + arg1;
        int var10 = this.field206.field278 + var8;
        int var11 = this.field206.field277 + var9;
        float var12 = var7.field279 / (float) var7.field278;
        float var13 = var7.field276 / (float) var7.field277;
        float var14 = (float) (var8 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field276 - (float) (var9 - arg4) * var13;
        float var17 = var7.field276 - (float) (var11 - arg4) * var13;
        opengl var18 = this.field205.field1918;
        var18.glBegin(7);
        var18.glColor3f(1.0F, 1.0F, 1.0F);
        var18.glMultiTexCoord2f(33984, 0.0F, this.field206.field276);
        var18.glMultiTexCoord2f(33985, var14, var16);
        var18.glVertex2i(var8, var9);
        var18.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        var18.glMultiTexCoord2f(33985, var14, var17);
        var18.glVertex2i(var8, this.field206.field277 + var9);
        var18.glMultiTexCoord2f(33984, this.field206.field279, 0.0F);
        var18.glMultiTexCoord2f(33985, var15, var17);
        var18.glVertex2i(this.field206.field278 + var8, this.field206.field277 + var9);
        var18.glMultiTexCoord2f(33984, this.field206.field279, this.field206.field276);
        var18.glMultiTexCoord2f(33985, var15, var16);
        var18.glVertex2i(this.field206.field278 + var8, var9);
        var18.glEnd();
        this.field205.method949(0, 5890, 768);
        this.field205.method913(1);
        this.field205.method888((class404) null);
        this.field205.method1002(0);
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lig;IIII)V", line = 594)
    public class14(class132 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field205 = arg0;
        this.field206 = class22.method119(arg1, 34037, arg0, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lig;II[III)V", line = 600)
    public class14(class132 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field205 = arg0;
        this.field206 = class22.method120(false, false, arg1, arg0, arg2, arg3);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V", line = 188)
    private final void method79(int arg0) {
        this.field205.method1002(1);
        this.field205.method888(this.field206);
        this.field205.method926(this.field205.method902(arg0), 7681);
        this.field205.method949(1, 34167, 768);
        this.field205.method958(0, 34168, 770);
        this.field205.method1002(0);
        this.field205.method888(this.field209);
        this.field205.method926(34479, 7681);
        this.field205.method949(1, 34166, 768);
        if (this.field210 == 0) {
            this.field205.method929(1.0F, 0.5F, 0.5F, 0.0F);
        } else if (this.field210 == 1) {
            this.field205.method929(0.5F, 1.0F, 0.5F, 0.0F);
        } else if (this.field210 == 2) {
            this.field205.method929(0.5F, 0.5F, 1.0F, 0.0F);
        } else if (this.field210 == 3) {
            this.field205.method929(128.5F, 128.5F, 128.5F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "()I", line = 215)
    public final int method80() {
        return this.field206.field277;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(FFFFFFIII)V", line = 221)
    public final void method81(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field212) {
            float var10 = (float) this.method83();
            float var11 = (float) this.method75();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field208 * var14;
            float var17 = (float) this.field208 * var15;
            float var18 = (float) this.field213 * var12;
            float var19 = (float) this.field213 * var13;
            float var20 = (float) this.field211 * -var12;
            float var21 = (float) this.field211 * -var13;
            float var22 = (float) this.field207 * -var14;
            float var23 = (float) this.field207 * -var15;
            arg0 = arg0 + var18 + var16;
            arg1 = arg1 + var19 + var17;
            arg2 = arg2 + var20 + var16;
            arg3 = arg3 + var21 + var17;
            arg4 = arg4 + var18 + var22;
            arg5 = arg5 + var19 + var23;
        }
        float var24 = arg2 + arg4 - arg0;
        float var25 = arg5 + arg3 - arg1;
        opengl var26 = this.field205.field1918;
        this.field206.method2524(true);
        this.field205.method889();
        this.field205.method888(this.field206);
        this.field205.method972(arg8);
        this.field205.method913(arg6);
        var26.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        var26.glBegin(7);
        var26.glTexCoord2f(0.0F, this.field206.field276);
        var26.glVertex2f(arg0, arg1);
        var26.glTexCoord2f(0.0F, 0.0F);
        var26.glVertex2f(arg4, arg5);
        var26.glTexCoord2f(this.field206.field279, 0.0F);
        var26.glVertex2f(var24, var25);
        var26.glTexCoord2f(this.field206.field279, this.field206.field276);
        var26.glVertex2f(arg2, arg3);
        var26.glEnd();
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(FFFFFFLsg;II)V", line = 284)
    public final void method82(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class226 arg6, int arg7, int arg8) {
        class22 var10 = ((class133) arg6).field2052;
        if (this.field212) {
            float var11 = (float) this.method83();
            float var12 = (float) this.method75();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field208 * var15;
            float var18 = (float) this.field208 * var16;
            float var19 = (float) this.field213 * var13;
            float var20 = (float) this.field213 * var14;
            float var21 = (float) this.field211 * -var13;
            float var22 = (float) this.field211 * -var14;
            float var23 = (float) this.field207 * -var15;
            float var24 = (float) this.field207 * -var16;
            arg0 = arg0 + var19 + var17;
            arg1 = arg1 + var20 + var18;
            arg2 = arg2 + var21 + var17;
            arg3 = arg3 + var22 + var18;
            arg4 = arg4 + var19 + var23;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        opengl var27 = this.field205.field1918;
        this.field206.method2524(true);
        this.field205.method889();
        this.field205.method888(this.field206);
        this.field205.method913(0);
        this.field205.method1002(1);
        this.field205.method888(var10);
        this.field205.method926(7681, 8448);
        this.field205.method949(0, 34168, 768);
        this.field205.method972(1);
        float var28 = var10.field279 / (float) var10.field278;
        float var29 = var10.field276 / (float) var10.field277;
        var27.glBegin(7);
        var27.glColor3f(1.0F, 1.0F, 1.0F);
        var27.glMultiTexCoord2f(33984, 0.0F, this.field206.field276);
        var27.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * var28, var10.field276 - (arg1 - (float) arg8) * var29);
        var27.glVertex2f(arg0, arg1);
        var27.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        var27.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * var28, var10.field276 - (arg5 - (float) arg8) * var29);
        var27.glVertex2f(arg4, arg5);
        var27.glMultiTexCoord2f(33984, this.field206.field279, 0.0F);
        var27.glMultiTexCoord2f(33985, (var25 - (float) arg7) * var28, var10.field276 - (var26 - (float) arg8) * var29);
        var27.glVertex2f(var25, var26);
        var27.glMultiTexCoord2f(33984, this.field206.field279, this.field206.field276);
        var27.glMultiTexCoord2f(33985, (arg2 - (float) arg7) * var28, var10.field276 - (arg3 - (float) arg8) * var29);
        var27.glVertex2f(arg2, arg3);
        var27.glEnd();
        this.field205.method949(0, 5890, 768);
        this.field205.method913(1);
        this.field205.method888((class404) null);
        this.field205.method1002(0);
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "()I", line = 365)
    public final int method83() {
        return this.field206.field278 + this.field213 + this.field211;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(III)V", line = 369)
    public final void method84(int arg0, int arg1, int arg2) {
        opengl var4 = this.field205.field1918;
        var4.glPixelTransferf(3348, 0.5F);
        var4.glPixelTransferf(3349, 0.499F);
        var4.glPixelTransferf(3352, 0.5F);
        var4.glPixelTransferf(3353, 0.499F);
        var4.glPixelTransferf(3354, 0.5F);
        var4.glPixelTransferf(3355, 0.499F);
        this.field209 = class22.method119(arg0, 34037, this.field205, this.field206.field278, this.field206.field277, arg1);
        this.field210 = arg2;
        var4.glPixelTransferf(3348, 1.0F);
        var4.glPixelTransferf(3349, 0.0F);
        var4.glPixelTransferf(3352, 1.0F);
        var4.glPixelTransferf(3353, 0.0F);
        var4.glPixelTransferf(3354, 1.0F);
        var4.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(IIII)V", line = 388)
    public final void method85(int arg0, int arg1, int arg2, int arg3) {
        this.field213 = arg0;
        this.field208 = arg1;
        this.field211 = arg2;
        this.field207 = arg3;
        this.field212 = this.field213 != 0 || this.field208 != 0 || this.field211 != 0 || this.field207 != 0;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIII)V", line = 396)
    public final void method86(int arg0, int arg1, int arg2, int arg3, int arg4) {
        opengl var6 = this.field205.field1918;
        this.field206.method2524(false);
        this.field205.method889();
        this.field205.method972(arg4);
        var6.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var7 = this.field213 + arg0;
        int var8 = this.field208 + arg1;
        if (this.field209 == null) {
            this.field205.method888(this.field206);
            this.field205.method913(arg2);
            var6.glBegin(7);
            var6.glTexCoord2f(0.0F, this.field206.field276);
            var6.glVertex2i(var7, var8);
            var6.glTexCoord2f(0.0F, 0.0F);
            var6.glVertex2i(var7, this.field206.field277 + var8);
            var6.glTexCoord2f(this.field206.field279, 0.0F);
            var6.glVertex2i(this.field206.field278 + var7, this.field206.field277 + var8);
            var6.glTexCoord2f(this.field206.field279, this.field206.field276);
            var6.glVertex2i(this.field206.field278 + var7, var8);
            var6.glEnd();
            return;
        }
        this.method79(arg2);
        this.field209.method2524(false);
        var6.glBegin(7);
        var6.glMultiTexCoord2f(33985, 0.0F, this.field206.field276);
        var6.glTexCoord2f(0.0F, this.field206.field276);
        var6.glVertex2i(var7, var8);
        var6.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var6.glTexCoord2f(0.0F, 0.0F);
        var6.glVertex2i(var7, this.field206.field277 + var8);
        var6.glMultiTexCoord2f(33985, this.field206.field279, 0.0F);
        var6.glTexCoord2f(this.field206.field279, 0.0F);
        var6.glVertex2i(this.field206.field278 + var7, this.field206.field277 + var8);
        var6.glMultiTexCoord2f(33985, this.field206.field279, this.field206.field276);
        var6.glTexCoord2f(this.field206.field279, this.field206.field276);
        var6.glVertex2i(this.field206.field278 + var7, var8);
        var6.glEnd();
        this.method76();
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "()I", line = 443)
    public final int method87() {
        return this.field206.field278;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIII)V", line = 461)
    public final void method88(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        opengl var8 = this.field205.field1918;
        int var9 = arg0 + arg2;
        int var10 = arg1 + arg3;
        this.field206.method2524(false);
        this.field205.method889();
        this.field205.method888(this.field206);
        this.field205.method972(arg6);
        this.field205.method913(arg4);
        var8.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field206.field280 && !this.field212) {
            float var11 = (float) arg3 * this.field206.field276 / (float) this.field206.field277;
            float var12 = (float) arg2 * this.field206.field279 / (float) this.field206.field278;
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
        var8.glTranslatef((float) this.field213, (float) this.field208, 0.0F);
        int var13 = this.method83();
        int var14 = this.method75();
        int var15 = this.field206.field277 + arg1;
        var8.glBegin(7);
        int var16 = arg1;
        while (var15 <= var10) {
            int var17 = this.field206.field278 + arg0;
            int var18 = arg0;
            while (var17 <= var9) {
                var8.glTexCoord2f(0.0F, this.field206.field276);
                var8.glVertex2i(var18, var16);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2i(var18, var15);
                var8.glTexCoord2f(this.field206.field279, 0.0F);
                var8.glVertex2i(var17, var15);
                var8.glTexCoord2f(this.field206.field279, this.field206.field276);
                var8.glVertex2i(var17, var16);
                var17 += var13;
                var18 += var13;
            }
            if (var18 < var9) {
                float var19 = (float) (var9 - var18) * this.field206.field279 / (float) this.field206.field278;
                var8.glTexCoord2f(0.0F, this.field206.field276);
                var8.glVertex2i(var18, var16);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2i(var18, var15);
                var8.glTexCoord2f(var19, 0.0F);
                var8.glVertex2i(var9, var15);
                var8.glTexCoord2f(var19, this.field206.field276);
                var8.glVertex2i(var9, var16);
            }
            var16 += var14;
            var15 += var14;
        }
        if (var16 < var10) {
            float var20 = (float) (this.field206.field277 - (var10 - var16)) * this.field206.field276 / (float) this.field206.field277;
            int var21 = this.field206.field278 + arg0;
            int var22 = arg0;
            while (var21 <= var9) {
                var8.glTexCoord2f(0.0F, this.field206.field276);
                var8.glVertex2i(var22, var16);
                var8.glTexCoord2f(0.0F, var20);
                var8.glVertex2i(var22, var10);
                var8.glTexCoord2f(this.field206.field279, var20);
                var8.glVertex2i(var21, var10);
                var8.glTexCoord2f(this.field206.field279, this.field206.field276);
                var8.glVertex2i(var21, var16);
                var21 += var13;
                var22 += var13;
            }
            if (var22 < var9) {
                float var23 = (float) (var9 - var22) * this.field206.field279 / (float) this.field206.field278;
                var8.glTexCoord2f(0.0F, this.field206.field276);
                var8.glVertex2i(var22, var16);
                var8.glTexCoord2f(0.0F, var20);
                var8.glVertex2i(var22, var10);
                var8.glTexCoord2f(var23, var20);
                var8.glVertex2i(var9, var10);
                var8.glTexCoord2f(var23, this.field206.field276);
                var8.glVertex2i(var9, var16);
            }
        }
        var8.glEnd();
        var8.glPopMatrix();
    }
}
