import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class424 extends class285 {

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "I")
    private int field6121 = 0;

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "I")
    private int field6122 = 0;

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "I")
    private int field6123 = 0;

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "I")
    private int field6124 = 0;

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "I")
    private int field6125 = 0;

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "Z")
    private boolean field6120 = false;

    @OriginalMember(owner = "client!cn", name = "i", descriptor = "Lks;")
    private class173 field6127;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "Lmf;")
    private class16 field6119;

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "Lmf;")
    private class16 field6126;

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "()I", line = 3)
    public final int method1861() {
        return this.field6119.field257 + this.field6123 + this.field6125;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIIIII)V", line = 7)
    public final void method1866(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        opengl var8 = this.field6127.field2253;
        int var9 = arg0 + arg2;
        int var10 = arg1 + arg3;
        this.field6119.method1405(false);
        this.field6127.method1128();
        this.field6127.method1160(this.field6119);
        this.field6127.method1179(arg6);
        this.field6127.method1143(arg4);
        var8.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field6119.field253 && !this.field6120) {
            float var11 = (float) arg3 * this.field6119.field254 / (float) this.field6119.field255;
            float var12 = (float) arg2 * this.field6119.field256 / (float) this.field6119.field257;
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
        var8.glTranslatef((float) this.field6123, (float) this.field6122, 0.0F);
        int var13 = this.method1861();
        int var14 = this.method1860();
        int var15 = this.field6119.field255 + arg1;
        var8.glBegin(7);
        int var16 = arg1;
        while (var15 <= var10) {
            int var17 = this.field6119.field257 + arg0;
            int var18 = arg0;
            while (var17 <= var9) {
                var8.glTexCoord2f(0.0F, this.field6119.field254);
                var8.glVertex2i(var18, var16);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2i(var18, var15);
                var8.glTexCoord2f(this.field6119.field256, 0.0F);
                var8.glVertex2i(var17, var15);
                var8.glTexCoord2f(this.field6119.field256, this.field6119.field254);
                var8.glVertex2i(var17, var16);
                var17 += var13;
                var18 += var13;
            }
            if (var18 < var9) {
                float var19 = (float) (var9 - var18) * this.field6119.field256 / (float) this.field6119.field257;
                var8.glTexCoord2f(0.0F, this.field6119.field254);
                var8.glVertex2i(var18, var16);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2i(var18, var15);
                var8.glTexCoord2f(var19, 0.0F);
                var8.glVertex2i(var9, var15);
                var8.glTexCoord2f(var19, this.field6119.field254);
                var8.glVertex2i(var9, var16);
            }
            var16 += var14;
            var15 += var14;
        }
        if (var16 < var10) {
            float var20 = (float) (this.field6119.field255 - (var10 - var16)) * this.field6119.field254 / (float) this.field6119.field255;
            int var21 = this.field6119.field257 + arg0;
            int var22 = arg0;
            while (var21 <= var9) {
                var8.glTexCoord2f(0.0F, this.field6119.field254);
                var8.glVertex2i(var22, var16);
                var8.glTexCoord2f(0.0F, var20);
                var8.glVertex2i(var22, var10);
                var8.glTexCoord2f(this.field6119.field256, var20);
                var8.glVertex2i(var21, var10);
                var8.glTexCoord2f(this.field6119.field256, this.field6119.field254);
                var8.glVertex2i(var21, var16);
                var21 += var13;
                var22 += var13;
            }
            if (var22 < var9) {
                float var23 = (float) (var9 - var22) * this.field6119.field256 / (float) this.field6119.field257;
                var8.glTexCoord2f(0.0F, this.field6119.field254);
                var8.glVertex2i(var22, var16);
                var8.glTexCoord2f(0.0F, var20);
                var8.glVertex2i(var22, var10);
                var8.glTexCoord2f(var23, var20);
                var8.glVertex2i(var9, var10);
                var8.glTexCoord2f(var23, this.field6119.field254);
                var8.glVertex2i(var9, var16);
            }
        }
        var8.glEnd();
        var8.glPopMatrix();
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIIII)V", line = 140)
    public final void method930(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6119.method596(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(III)V", line = 144)
    public final void method931(int arg0, int arg1, int arg2) {
        opengl var4 = this.field6127.field2253;
        var4.glPixelTransferf(3348, 0.5F);
        var4.glPixelTransferf(3349, 0.499F);
        var4.glPixelTransferf(3352, 0.5F);
        var4.glPixelTransferf(3353, 0.499F);
        var4.glPixelTransferf(3354, 0.5F);
        var4.glPixelTransferf(3355, 0.499F);
        this.field6126 = class16.method219(this.field6119.field255, arg1, this.field6119.field257, 34037, arg0, this.field6127);
        this.field6121 = arg2;
        var4.glPixelTransferf(3348, 1.0F);
        var4.glPixelTransferf(3349, 0.0F);
        var4.glPixelTransferf(3352, 1.0F);
        var4.glPixelTransferf(3353, 0.0F);
        var4.glPixelTransferf(3354, 1.0F);
        var4.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIII)V", line = 167)
    public final void method927(int arg0, int arg1, int arg2, int arg3, int arg4) {
        opengl var6 = this.field6127.field2253;
        this.field6119.method1405(false);
        this.field6127.method1128();
        this.field6127.method1179(arg4);
        var6.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var7 = this.field6123 + arg0;
        int var8 = this.field6122 + arg1;
        if (this.field6126 == null) {
            this.field6127.method1160(this.field6119);
            this.field6127.method1143(arg2);
            var6.glBegin(7);
            var6.glTexCoord2f(0.0F, this.field6119.field254);
            var6.glVertex2i(var7, var8);
            var6.glTexCoord2f(0.0F, 0.0F);
            var6.glVertex2i(var7, this.field6119.field255 + var8);
            var6.glTexCoord2f(this.field6119.field256, 0.0F);
            var6.glVertex2i(this.field6119.field257 + var7, this.field6119.field255 + var8);
            var6.glTexCoord2f(this.field6119.field256, this.field6119.field254);
            var6.glVertex2i(this.field6119.field257 + var7, var8);
            var6.glEnd();
            return;
        }
        this.method2614(arg2);
        this.field6126.method1405(false);
        var6.glBegin(7);
        var6.glMultiTexCoord2f(33985, 0.0F, this.field6119.field254);
        var6.glTexCoord2f(0.0F, this.field6119.field254);
        var6.glVertex2i(var7, var8);
        var6.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var6.glTexCoord2f(0.0F, 0.0F);
        var6.glVertex2i(var7, this.field6119.field255 + var8);
        var6.glMultiTexCoord2f(33985, this.field6119.field256, 0.0F);
        var6.glTexCoord2f(this.field6119.field256, 0.0F);
        var6.glVertex2i(this.field6119.field257 + var7, this.field6119.field255 + var8);
        var6.glMultiTexCoord2f(33985, this.field6119.field256, this.field6119.field254);
        var6.glTexCoord2f(this.field6119.field256, this.field6119.field254);
        var6.glVertex2i(this.field6119.field257 + var7, var8);
        var6.glEnd();
        this.method2613();
    }

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "()I", line = 215)
    public final int method1868() {
        return this.field6119.field257;
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lks;IIII)V", line = 593)
    public class424(class173 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field6127 = arg0;
        this.field6119 = class16.method219(arg4, arg2, arg3, 34037, arg1, arg0);
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lks;II[III)V", line = 599)
    public class424(class173 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field6127 = arg0;
        this.field6119 = class16.method221(false, arg3, arg1, 0, arg0, arg2);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(FFFFFFLtm;II)V", line = 222)
    public final void method1863(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class195 arg6, int arg7, int arg8) {
        class16 var10 = ((class324) arg6).field4778;
        if (this.field6120) {
            float var11 = (float) this.method1861();
            float var12 = (float) this.method1860();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field6122 * var15;
            float var18 = (float) this.field6122 * var16;
            float var19 = (float) this.field6123 * var13;
            float var20 = (float) this.field6123 * var14;
            float var21 = (float) this.field6125 * -var13;
            float var22 = (float) this.field6125 * -var14;
            float var23 = (float) this.field6124 * -var15;
            float var24 = (float) this.field6124 * -var16;
            arg0 = arg0 + var19 + var17;
            arg1 = arg1 + var20 + var18;
            arg2 = arg2 + var21 + var17;
            arg3 = arg3 + var22 + var18;
            arg4 = arg4 + var19 + var23;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        opengl var27 = this.field6127.field2253;
        this.field6119.method1405(true);
        this.field6127.method1128();
        this.field6127.method1160(this.field6119);
        this.field6127.method1143(0);
        this.field6127.method1150(1);
        this.field6127.method1160(var10);
        this.field6127.method1161(7681, 8448);
        this.field6127.method1127(0, 34168, 768);
        this.field6127.method1179(1);
        float var28 = var10.field256 / (float) var10.field257;
        float var29 = var10.field254 / (float) var10.field255;
        var27.glBegin(7);
        var27.glColor3f(1.0F, 1.0F, 1.0F);
        var27.glMultiTexCoord2f(33984, 0.0F, this.field6119.field254);
        var27.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * var28, var10.field254 - (arg1 - (float) arg8) * var29);
        var27.glVertex2f(arg0, arg1);
        var27.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        var27.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * var28, var10.field254 - (arg5 - (float) arg8) * var29);
        var27.glVertex2f(arg4, arg5);
        var27.glMultiTexCoord2f(33984, this.field6119.field256, 0.0F);
        var27.glMultiTexCoord2f(33985, (var25 - (float) arg7) * var28, var10.field254 - (var26 - (float) arg8) * var29);
        var27.glVertex2f(var25, var26);
        var27.glMultiTexCoord2f(33984, this.field6119.field256, this.field6119.field254);
        var27.glMultiTexCoord2f(33985, (arg2 - (float) arg7) * var28, var10.field254 - (arg3 - (float) arg8) * var29);
        var27.glVertex2f(arg2, arg3);
        var27.glEnd();
        this.field6127.method1127(0, 5890, 768);
        this.field6127.method1143(1);
        this.field6127.method1160((class205) null);
        this.field6127.method1150(0);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IILtm;II)V", line = 309)
    public final void method926(int arg0, int arg1, class195 arg2, int arg3, int arg4) {
        class324 var6 = (class324) arg2;
        class16 var7 = var6.field4778;
        this.field6119.method1405(false);
        this.field6127.method1128();
        this.field6127.method1160(this.field6119);
        this.field6127.method1143(0);
        this.field6127.method1150(1);
        this.field6127.method1160(var7);
        this.field6127.method1161(7681, 8448);
        this.field6127.method1127(0, 34168, 768);
        this.field6127.method1179(1);
        int var8 = this.field6123 + arg0;
        int var9 = this.field6122 + arg1;
        int var10 = this.field6119.field257 + var8;
        int var11 = this.field6119.field255 + var9;
        float var12 = var7.field256 / (float) var7.field257;
        float var13 = var7.field254 / (float) var7.field255;
        float var14 = (float) (var8 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field254 - (float) (var9 - arg4) * var13;
        float var17 = var7.field254 - (float) (var11 - arg4) * var13;
        opengl var18 = this.field6127.field2253;
        var18.glBegin(7);
        var18.glColor3f(1.0F, 1.0F, 1.0F);
        var18.glMultiTexCoord2f(33984, 0.0F, this.field6119.field254);
        var18.glMultiTexCoord2f(33985, var14, var16);
        var18.glVertex2i(var8, var9);
        var18.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        var18.glMultiTexCoord2f(33985, var14, var17);
        var18.glVertex2i(var8, this.field6119.field255 + var9);
        var18.glMultiTexCoord2f(33984, this.field6119.field256, 0.0F);
        var18.glMultiTexCoord2f(33985, var15, var17);
        var18.glVertex2i(this.field6119.field257 + var8, this.field6119.field255 + var9);
        var18.glMultiTexCoord2f(33984, this.field6119.field256, this.field6119.field254);
        var18.glMultiTexCoord2f(33985, var15, var16);
        var18.glVertex2i(this.field6119.field257 + var8, var9);
        var18.glEnd();
        this.field6127.method1127(0, 5890, 768);
        this.field6127.method1143(1);
        this.field6127.method1160((class205) null);
        this.field6127.method1150(0);
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(IIII)V", line = 367)
    public final void method1867(int arg0, int arg1, int arg2, int arg3) {
        this.field6123 = arg0;
        this.field6122 = arg1;
        this.field6125 = arg2;
        this.field6124 = arg3;
        this.field6120 = this.field6123 != 0 || this.field6122 != 0 || this.field6125 != 0 || this.field6124 != 0;
    }

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "()I", line = 375)
    public final int method1860() {
        return this.field6119.field255 + this.field6122 + this.field6124;
    }

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "()V", line = 383)
    private final void method2613() {
        this.field6127.method1150(1);
        this.field6127.method1160((class205) null);
        this.field6127.method1161(8448, 8448);
        this.field6127.method1127(1, 34168, 768);
        this.field6127.method1176(0, 5890, 770);
        this.field6127.method1150(0);
        this.field6127.method1127(1, 34168, 768);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V", line = 398)
    private final void method2614(int arg0) {
        this.field6127.method1150(1);
        this.field6127.method1160(this.field6119);
        this.field6127.method1161(this.field6127.method1177(arg0), 7681);
        this.field6127.method1127(1, 34167, 768);
        this.field6127.method1176(0, 34168, 770);
        this.field6127.method1150(0);
        this.field6127.method1160(this.field6126);
        this.field6127.method1161(34479, 7681);
        this.field6127.method1127(1, 34166, 768);
        if (this.field6121 == 0) {
            this.field6127.method1137(1.0F, 0.5F, 0.5F, 0.0F);
        } else if (this.field6121 == 1) {
            this.field6127.method1137(0.5F, 1.0F, 0.5F, 0.0F);
        } else if (this.field6121 == 2) {
            this.field6127.method1137(0.5F, 0.5F, 1.0F, 0.0F);
        } else if (this.field6121 == 3) {
            this.field6127.method1137(128.5F, 128.5F, 128.5F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(FFFFFFIII)V", line = 426)
    public final void method1864(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field6120) {
            float var10 = (float) this.method1861();
            float var11 = (float) this.method1860();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field6122 * var14;
            float var17 = (float) this.field6122 * var15;
            float var18 = (float) this.field6123 * var12;
            float var19 = (float) this.field6123 * var13;
            float var20 = (float) this.field6125 * -var12;
            float var21 = (float) this.field6125 * -var13;
            float var22 = (float) this.field6124 * -var14;
            float var23 = (float) this.field6124 * -var15;
            arg0 = arg0 + var18 + var16;
            arg1 = arg1 + var19 + var17;
            arg2 = arg2 + var20 + var16;
            arg3 = arg3 + var21 + var17;
            arg4 = arg4 + var18 + var22;
            arg5 = arg5 + var19 + var23;
        }
        float var24 = arg2 + arg4 - arg0;
        float var25 = arg5 + arg3 - arg1;
        opengl var26 = this.field6127.field2253;
        this.field6119.method1405(true);
        this.field6127.method1128();
        this.field6127.method1160(this.field6119);
        this.field6127.method1179(arg8);
        this.field6127.method1143(arg6);
        var26.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        var26.glBegin(7);
        var26.glTexCoord2f(0.0F, this.field6119.field254);
        var26.glVertex2f(arg0, arg1);
        var26.glTexCoord2f(0.0F, 0.0F);
        var26.glVertex2f(arg4, arg5);
        var26.glTexCoord2f(this.field6119.field256, 0.0F);
        var26.glVertex2f(var24, var25);
        var26.glTexCoord2f(this.field6119.field256, this.field6119.field254);
        var26.glVertex2f(arg2, arg3);
        var26.glEnd();
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "()I", line = 489)
    public final int method1862() {
        return this.field6119.field255;
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(IIIIIII)V", line = 494)
    public final void method929(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        opengl var8 = this.field6127.field2253;
        this.field6119.method1405(true);
        this.field6127.method1128();
        this.field6127.method1179(arg6);
        var8.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field6120) {
            float var9 = (float) arg2 / (float) this.method1861();
            float var10 = (float) arg3 / (float) this.method1860();
            float var11 = (float) this.field6123 * var9 + (float) arg0;
            float var12 = (float) this.field6122 * var10 + (float) arg1;
            float var13 = (float) this.field6119.field257 * var9 + var11;
            float var14 = (float) this.field6119.field255 * var10 + var12;
            if (this.field6126 == null) {
                this.field6127.method1160(this.field6119);
                this.field6127.method1143(arg4);
                var8.glBegin(7);
                var8.glTexCoord2f(0.0F, this.field6119.field254);
                var8.glVertex2f(var11, var12);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2f(var11, var14);
                var8.glTexCoord2f(this.field6119.field256, 0.0F);
                var8.glVertex2f(var13, var14);
                var8.glTexCoord2f(this.field6119.field256, this.field6119.field254);
                var8.glVertex2f(var13, var12);
                var8.glEnd();
            } else {
                this.method2614(arg4);
                this.field6126.method1405(true);
                var8.glBegin(7);
                var8.glMultiTexCoord2f(33985, 0.0F, this.field6119.field254);
                var8.glTexCoord2f(0.0F, this.field6119.field254);
                var8.glVertex2f(var11, var12);
                var8.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2f(var11, var14);
                var8.glMultiTexCoord2f(33985, this.field6119.field256, 0.0F);
                var8.glTexCoord2f(this.field6119.field256, 0.0F);
                var8.glVertex2f(var13, var14);
                var8.glMultiTexCoord2f(33985, this.field6119.field256, this.field6119.field254);
                var8.glTexCoord2f(this.field6119.field256, this.field6119.field254);
                var8.glVertex2f(var13, var12);
                var8.glEnd();
                this.method2613();
            }
        } else if (this.field6126 == null) {
            this.field6127.method1160(this.field6119);
            this.field6127.method1143(arg4);
            var8.glBegin(7);
            var8.glTexCoord2f(0.0F, this.field6119.field254);
            var8.glVertex2i(arg0, arg1);
            var8.glTexCoord2f(0.0F, 0.0F);
            var8.glVertex2i(arg0, arg1 + arg3);
            var8.glTexCoord2f(this.field6119.field256, 0.0F);
            var8.glVertex2i(arg0 + arg2, arg1 + arg3);
            var8.glTexCoord2f(this.field6119.field256, this.field6119.field254);
            var8.glVertex2i(arg0 + arg2, arg1);
            var8.glEnd();
        } else {
            this.method2614(arg4);
            this.field6126.method1405(true);
            var8.glBegin(7);
            var8.glMultiTexCoord2f(33985, 0.0F, this.field6119.field254);
            var8.glTexCoord2f(0.0F, this.field6119.field254);
            var8.glVertex2i(arg0, arg1);
            var8.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            var8.glTexCoord2f(0.0F, 0.0F);
            var8.glVertex2i(arg0, arg1 + arg3);
            var8.glMultiTexCoord2f(33985, this.field6119.field256, 0.0F);
            var8.glTexCoord2f(this.field6119.field256, 0.0F);
            var8.glVertex2i(arg0 + arg2, arg1 + arg3);
            var8.glMultiTexCoord2f(33985, this.field6119.field256, this.field6119.field254);
            var8.glTexCoord2f(this.field6119.field256, this.field6119.field254);
            var8.glVertex2i(arg0 + arg2, arg1);
            var8.glEnd();
            this.method2613();
        }
    }
}
