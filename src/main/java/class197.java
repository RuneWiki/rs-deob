import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class197 extends class77 {

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "I")
    private int field2853 = 0;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "I")
    private int field2852 = 0;

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "I")
    private int field2857 = 0;

    @OriginalMember(owner = "client!mo", name = "h", descriptor = "I")
    private int field2859 = 0;

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "I")
    private int field2854 = 0;

    @OriginalMember(owner = "client!mo", name = "i", descriptor = "Z")
    private boolean field2860 = false;

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "Lmm;")
    private class357 field2858;

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "Lvj;")
    private class179 field2855;

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "Lvj;")
    private class179 field2856;

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(IIIIIII)V", line = 4)
    public final void method627(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        opengl var8 = this.field2858.field4794;
        int var9 = arg0 + arg2;
        int var10 = arg1 + arg3;
        this.field2855.method1954(false);
        this.field2858.method2173();
        this.field2858.method2180(this.field2855);
        this.field2858.method2195(arg6);
        this.field2858.method2158(arg4);
        var8.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field2855.field2550 && !this.field2860) {
            float var11 = (float) arg3 * this.field2855.field2548 / (float) this.field2855.field2549;
            float var12 = (float) arg2 * this.field2855.field2552 / (float) this.field2855.field2551;
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
        var8.glTranslatef((float) this.field2857, (float) this.field2852, 0.0F);
        int var13 = this.method632();
        int var14 = this.method619();
        int var15 = this.field2855.field2549 + arg1;
        var8.glBegin(7);
        int var16 = arg1;
        while (var15 <= var10) {
            int var17 = this.field2855.field2551 + arg0;
            int var18 = arg0;
            while (var17 <= var9) {
                var8.glTexCoord2f(0.0F, this.field2855.field2548);
                var8.glVertex2i(var18, var16);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2i(var18, var15);
                var8.glTexCoord2f(this.field2855.field2552, 0.0F);
                var8.glVertex2i(var17, var15);
                var8.glTexCoord2f(this.field2855.field2552, this.field2855.field2548);
                var8.glVertex2i(var17, var16);
                var17 += var13;
                var18 += var13;
            }
            if (var18 < var9) {
                float var19 = (float) (var9 - var18) * this.field2855.field2552 / (float) this.field2855.field2551;
                var8.glTexCoord2f(0.0F, this.field2855.field2548);
                var8.glVertex2i(var18, var16);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2i(var18, var15);
                var8.glTexCoord2f(var19, 0.0F);
                var8.glVertex2i(var9, var15);
                var8.glTexCoord2f(var19, this.field2855.field2548);
                var8.glVertex2i(var9, var16);
            }
            var16 += var14;
            var15 += var14;
        }
        if (var16 < var10) {
            float var20 = (float) (this.field2855.field2549 - (var10 - var16)) * this.field2855.field2548 / (float) this.field2855.field2549;
            int var21 = this.field2855.field2551 + arg0;
            int var22 = arg0;
            while (var21 <= var9) {
                var8.glTexCoord2f(0.0F, this.field2855.field2548);
                var8.glVertex2i(var22, var16);
                var8.glTexCoord2f(0.0F, var20);
                var8.glVertex2i(var22, var10);
                var8.glTexCoord2f(this.field2855.field2552, var20);
                var8.glVertex2i(var21, var10);
                var8.glTexCoord2f(this.field2855.field2552, this.field2855.field2548);
                var8.glVertex2i(var21, var16);
                var21 += var13;
                var22 += var13;
            }
            if (var22 < var9) {
                float var23 = (float) (var9 - var22) * this.field2855.field2552 / (float) this.field2855.field2551;
                var8.glTexCoord2f(0.0F, this.field2855.field2548);
                var8.glVertex2i(var22, var16);
                var8.glTexCoord2f(0.0F, var20);
                var8.glVertex2i(var22, var10);
                var8.glTexCoord2f(var23, var20);
                var8.glVertex2i(var9, var10);
                var8.glTexCoord2f(var23, this.field2855.field2548);
                var8.glVertex2i(var9, var16);
            }
        }
        var8.glEnd();
        var8.glPopMatrix();
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(IIII)V", line = 135)
    public final void method621(int arg0, int arg1, int arg2, int arg3) {
        this.field2857 = arg0;
        this.field2852 = arg1;
        this.field2853 = arg2;
        this.field2859 = arg3;
        this.field2860 = this.field2857 != 0 || this.field2852 != 0 || this.field2853 != 0 || this.field2859 != 0;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(FFFFFFLde;II)V", line = 148)
    public final void method614(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class165 arg6, int arg7, int arg8) {
        class179 var10 = ((class360) arg6).field4976;
        if (this.field2860) {
            float var11 = (float) this.method632();
            float var12 = (float) this.method619();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field2852 * var15;
            float var18 = (float) this.field2852 * var16;
            float var19 = (float) this.field2857 * var13;
            float var20 = (float) this.field2857 * var14;
            float var21 = (float) this.field2853 * -var13;
            float var22 = (float) this.field2853 * -var14;
            float var23 = (float) this.field2859 * -var15;
            float var24 = (float) this.field2859 * -var16;
            arg0 = arg0 + var19 + var17;
            arg1 = arg1 + var20 + var18;
            arg2 = arg2 + var21 + var17;
            arg3 = arg3 + var22 + var18;
            arg4 = arg4 + var19 + var23;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        opengl var27 = this.field2858.field4794;
        this.field2855.method1954(true);
        this.field2858.method2173();
        this.field2858.method2180(this.field2855);
        this.field2858.method2158(0);
        this.field2858.method2196(1);
        this.field2858.method2180(var10);
        this.field2858.method2212(7681, 8448);
        this.field2858.method2187(0, 34168, 768);
        this.field2858.method2195(1);
        float var28 = var10.field2552 / (float) var10.field2551;
        float var29 = var10.field2548 / (float) var10.field2549;
        var27.glBegin(7);
        var27.glColor3f(1.0F, 1.0F, 1.0F);
        var27.glMultiTexCoord2f(33984, 0.0F, this.field2855.field2548);
        var27.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * var28, var10.field2548 - (arg1 - (float) arg8) * var29);
        var27.glVertex2f(arg0, arg1);
        var27.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        var27.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * var28, var10.field2548 - (arg5 - (float) arg8) * var29);
        var27.glVertex2f(arg4, arg5);
        var27.glMultiTexCoord2f(33984, this.field2855.field2552, 0.0F);
        var27.glMultiTexCoord2f(33985, (var25 - (float) arg7) * var28, var10.field2548 - (var26 - (float) arg8) * var29);
        var27.glVertex2f(var25, var26);
        var27.glMultiTexCoord2f(33984, this.field2855.field2552, this.field2855.field2548);
        var27.glMultiTexCoord2f(33985, (arg2 - (float) arg7) * var28, var10.field2548 - (arg3 - (float) arg8) * var29);
        var27.glVertex2f(arg2, arg3);
        var27.glEnd();
        this.field2858.method2187(0, 5890, 768);
        this.field2858.method2158(1);
        this.field2858.method2180((class321) null);
        this.field2858.method2196(0);
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(Lmm;IIII)V", line = 594)
    public class197(class357 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2858 = arg0;
        this.field2855 = class179.method1266(arg4, -75, arg2, arg1, arg3, arg0);
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(Lmm;II[III)V", line = 600)
    public class197(class357 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field2858 = arg0;
        this.field2855 = class179.method1265(arg1, arg3, arg2, arg0, false, 3553);
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIIII)V", line = 234)
    public final void method617(int arg0, int arg1, int arg2, int arg3, int arg4) {
        opengl var6 = this.field2858.field4794;
        this.field2855.method1954(false);
        this.field2858.method2173();
        this.field2858.method2195(arg4);
        var6.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var7 = this.field2857 + arg0;
        int var8 = this.field2852 + arg1;
        if (this.field2856 == null) {
            this.field2858.method2180(this.field2855);
            this.field2858.method2158(arg2);
            var6.glBegin(7);
            var6.glTexCoord2f(0.0F, this.field2855.field2548);
            var6.glVertex2i(var7, var8);
            var6.glTexCoord2f(0.0F, 0.0F);
            var6.glVertex2i(var7, this.field2855.field2549 + var8);
            var6.glTexCoord2f(this.field2855.field2552, 0.0F);
            var6.glVertex2i(this.field2855.field2551 + var7, this.field2855.field2549 + var8);
            var6.glTexCoord2f(this.field2855.field2552, this.field2855.field2548);
            var6.glVertex2i(this.field2855.field2551 + var7, var8);
            var6.glEnd();
            return;
        }
        this.method1369(arg2);
        this.field2856.method1954(false);
        var6.glBegin(7);
        var6.glMultiTexCoord2f(33985, 0.0F, this.field2855.field2548);
        var6.glTexCoord2f(0.0F, this.field2855.field2548);
        var6.glVertex2i(var7, var8);
        var6.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var6.glTexCoord2f(0.0F, 0.0F);
        var6.glVertex2i(var7, this.field2855.field2549 + var8);
        var6.glMultiTexCoord2f(33985, this.field2855.field2552, 0.0F);
        var6.glTexCoord2f(this.field2855.field2552, 0.0F);
        var6.glVertex2i(this.field2855.field2551 + var7, this.field2855.field2549 + var8);
        var6.glMultiTexCoord2f(33985, this.field2855.field2552, this.field2855.field2548);
        var6.glTexCoord2f(this.field2855.field2552, this.field2855.field2548);
        var6.glVertex2i(this.field2855.field2551 + var7, var8);
        var6.glEnd();
        this.method1370();
    }

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "()I", line = 281)
    public final int method631() {
        return this.field2855.field2549;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "()I", line = 284)
    public final int method619() {
        return this.field2855.field2549 + this.field2852 + this.field2859;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(III)V", line = 288)
    public final void method624(int arg0, int arg1, int arg2) {
        opengl var4 = this.field2858.field4794;
        var4.glPixelTransferf(3348, 0.5F);
        var4.glPixelTransferf(3349, 0.499F);
        var4.glPixelTransferf(3352, 0.5F);
        var4.glPixelTransferf(3353, 0.499F);
        var4.glPixelTransferf(3354, 0.5F);
        var4.glPixelTransferf(3355, 0.499F);
        this.field2856 = class179.method1266(this.field2855.field2549, -81, arg1, arg0, this.field2855.field2551, this.field2858);
        this.field2854 = arg2;
        var4.glPixelTransferf(3348, 1.0F);
        var4.glPixelTransferf(3349, 0.0F);
        var4.glPixelTransferf(3352, 1.0F);
        var4.glPixelTransferf(3353, 0.0F);
        var4.glPixelTransferf(3354, 1.0F);
        var4.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "()I", line = 309)
    public final int method628() {
        return this.field2855.field2551;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(FFFFFFIII)V", line = 314)
    public final void method633(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field2860) {
            float var10 = (float) this.method632();
            float var11 = (float) this.method619();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field2852 * var14;
            float var17 = (float) this.field2852 * var15;
            float var18 = (float) this.field2857 * var12;
            float var19 = (float) this.field2857 * var13;
            float var20 = (float) this.field2853 * -var12;
            float var21 = (float) this.field2853 * -var13;
            float var22 = (float) this.field2859 * -var14;
            float var23 = (float) this.field2859 * -var15;
            arg0 = arg0 + var18 + var16;
            arg1 = arg1 + var19 + var17;
            arg2 = arg2 + var20 + var16;
            arg3 = arg3 + var21 + var17;
            arg4 = arg4 + var18 + var22;
            arg5 = arg5 + var19 + var23;
        }
        float var24 = arg2 + arg4 - arg0;
        float var25 = arg5 + arg3 - arg1;
        opengl var26 = this.field2858.field4794;
        this.field2855.method1954(true);
        this.field2858.method2173();
        this.field2858.method2180(this.field2855);
        this.field2858.method2195(arg8);
        this.field2858.method2158(arg6);
        var26.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        var26.glBegin(7);
        var26.glTexCoord2f(0.0F, this.field2855.field2548);
        var26.glVertex2f(arg0, arg1);
        var26.glTexCoord2f(0.0F, 0.0F);
        var26.glVertex2f(arg4, arg5);
        var26.glTexCoord2f(this.field2855.field2552, 0.0F);
        var26.glVertex2f(var24, var25);
        var26.glTexCoord2f(this.field2855.field2552, this.field2855.field2548);
        var26.glVertex2f(arg2, arg3);
        var26.glEnd();
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IILde;II)V", line = 381)
    public final void method623(int arg0, int arg1, class165 arg2, int arg3, int arg4) {
        class360 var6 = (class360) arg2;
        class179 var7 = var6.field4976;
        this.field2855.method1954(false);
        this.field2858.method2173();
        this.field2858.method2180(this.field2855);
        this.field2858.method2158(0);
        this.field2858.method2196(1);
        this.field2858.method2180(var7);
        this.field2858.method2212(7681, 8448);
        this.field2858.method2187(0, 34168, 768);
        this.field2858.method2195(1);
        int var8 = this.field2857 + arg0;
        int var9 = this.field2852 + arg1;
        int var10 = this.field2855.field2551 + var8;
        int var11 = this.field2855.field2549 + var9;
        float var12 = var7.field2552 / (float) var7.field2551;
        float var13 = var7.field2548 / (float) var7.field2549;
        float var14 = (float) (var8 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field2548 - (float) (var9 - arg4) * var13;
        float var17 = var7.field2548 - (float) (var11 - arg4) * var13;
        opengl var18 = this.field2858.field4794;
        var18.glBegin(7);
        var18.glColor3f(1.0F, 1.0F, 1.0F);
        var18.glMultiTexCoord2f(33984, 0.0F, this.field2855.field2548);
        var18.glMultiTexCoord2f(33985, var14, var16);
        var18.glVertex2i(var8, var9);
        var18.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        var18.glMultiTexCoord2f(33985, var14, var17);
        var18.glVertex2i(var8, this.field2855.field2549 + var9);
        var18.glMultiTexCoord2f(33984, this.field2855.field2552, 0.0F);
        var18.glMultiTexCoord2f(33985, var15, var17);
        var18.glVertex2i(this.field2855.field2551 + var8, this.field2855.field2549 + var9);
        var18.glMultiTexCoord2f(33984, this.field2855.field2552, this.field2855.field2548);
        var18.glMultiTexCoord2f(33985, var15, var16);
        var18.glVertex2i(this.field2855.field2551 + var8, var9);
        var18.glEnd();
        this.field2858.method2187(0, 5890, 768);
        this.field2858.method2158(1);
        this.field2858.method2180((class321) null);
        this.field2858.method2196(0);
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)V", line = 436)
    private final void method1369(int arg0) {
        this.field2858.method2196(1);
        this.field2858.method2180(this.field2855);
        this.field2858.method2212(this.field2858.method2193(arg0), 7681);
        this.field2858.method2187(1, 34167, 768);
        this.field2858.method2192(0, 34168, 770);
        this.field2858.method2196(0);
        this.field2858.method2180(this.field2856);
        this.field2858.method2212(34479, 7681);
        this.field2858.method2187(1, 34166, 768);
        if (this.field2854 == 0) {
            this.field2858.method2179(1.0F, 0.5F, 0.5F, 0.0F);
        } else if (this.field2854 == 1) {
            this.field2858.method2179(0.5F, 1.0F, 0.5F, 0.0F);
        } else if (this.field2854 == 2) {
            this.field2858.method2179(0.5F, 0.5F, 1.0F, 0.0F);
        } else if (this.field2854 == 3) {
            this.field2858.method2179(128.5F, 128.5F, 128.5F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "()V", line = 462)
    private final void method1370() {
        this.field2858.method2196(1);
        this.field2858.method2180((class321) null);
        this.field2858.method2212(8448, 8448);
        this.field2858.method2187(1, 34168, 768);
        this.field2858.method2192(0, 5890, 770);
        this.field2858.method2196(0);
        this.field2858.method2187(1, 34168, 768);
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIIIII)V", line = 476)
    public final void method622(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2855.method1661(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "()I", line = 479)
    public final int method632() {
        return this.field2855.field2551 + this.field2857 + this.field2853;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIIIIII)V", line = 492)
    public final void method618(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        opengl var8 = this.field2858.field4794;
        this.field2855.method1954(true);
        this.field2858.method2173();
        this.field2858.method2195(arg6);
        var8.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field2860) {
            float var9 = (float) arg2 / (float) this.method632();
            float var10 = (float) arg3 / (float) this.method619();
            float var11 = (float) this.field2857 * var9 + (float) arg0;
            float var12 = (float) this.field2852 * var10 + (float) arg1;
            float var13 = (float) this.field2855.field2551 * var9 + var11;
            float var14 = (float) this.field2855.field2549 * var10 + var12;
            if (this.field2856 == null) {
                this.field2858.method2180(this.field2855);
                this.field2858.method2158(arg4);
                var8.glBegin(7);
                var8.glTexCoord2f(0.0F, this.field2855.field2548);
                var8.glVertex2f(var11, var12);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2f(var11, var14);
                var8.glTexCoord2f(this.field2855.field2552, 0.0F);
                var8.glVertex2f(var13, var14);
                var8.glTexCoord2f(this.field2855.field2552, this.field2855.field2548);
                var8.glVertex2f(var13, var12);
                var8.glEnd();
            } else {
                this.method1369(arg4);
                this.field2856.method1954(true);
                var8.glBegin(7);
                var8.glMultiTexCoord2f(33985, 0.0F, this.field2855.field2548);
                var8.glTexCoord2f(0.0F, this.field2855.field2548);
                var8.glVertex2f(var11, var12);
                var8.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2f(var11, var14);
                var8.glMultiTexCoord2f(33985, this.field2855.field2552, 0.0F);
                var8.glTexCoord2f(this.field2855.field2552, 0.0F);
                var8.glVertex2f(var13, var14);
                var8.glMultiTexCoord2f(33985, this.field2855.field2552, this.field2855.field2548);
                var8.glTexCoord2f(this.field2855.field2552, this.field2855.field2548);
                var8.glVertex2f(var13, var12);
                var8.glEnd();
                this.method1370();
            }
        } else if (this.field2856 == null) {
            this.field2858.method2180(this.field2855);
            this.field2858.method2158(arg4);
            var8.glBegin(7);
            var8.glTexCoord2f(0.0F, this.field2855.field2548);
            var8.glVertex2i(arg0, arg1);
            var8.glTexCoord2f(0.0F, 0.0F);
            var8.glVertex2i(arg0, arg1 + arg3);
            var8.glTexCoord2f(this.field2855.field2552, 0.0F);
            var8.glVertex2i(arg0 + arg2, arg1 + arg3);
            var8.glTexCoord2f(this.field2855.field2552, this.field2855.field2548);
            var8.glVertex2i(arg0 + arg2, arg1);
            var8.glEnd();
        } else {
            this.method1369(arg4);
            this.field2856.method1954(true);
            var8.glBegin(7);
            var8.glMultiTexCoord2f(33985, 0.0F, this.field2855.field2548);
            var8.glTexCoord2f(0.0F, this.field2855.field2548);
            var8.glVertex2i(arg0, arg1);
            var8.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            var8.glTexCoord2f(0.0F, 0.0F);
            var8.glVertex2i(arg0, arg1 + arg3);
            var8.glMultiTexCoord2f(33985, this.field2855.field2552, 0.0F);
            var8.glTexCoord2f(this.field2855.field2552, 0.0F);
            var8.glVertex2i(arg0 + arg2, arg1 + arg3);
            var8.glMultiTexCoord2f(33985, this.field2855.field2552, this.field2855.field2548);
            var8.glTexCoord2f(this.field2855.field2552, this.field2855.field2548);
            var8.glVertex2i(arg0 + arg2, arg1);
            var8.glEnd();
            this.method1370();
        }
    }
}
