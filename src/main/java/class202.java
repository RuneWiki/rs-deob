import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class202 extends class20 {

    @OriginalMember(owner = "client!po", name = "a", descriptor = "Z")
    private boolean field2706 = false;

    @OriginalMember(owner = "client!po", name = "d", descriptor = "I")
    private int field2709 = 0;

    @OriginalMember(owner = "client!po", name = "c", descriptor = "I")
    private int field2708 = 0;

    @OriginalMember(owner = "client!po", name = "f", descriptor = "I")
    private int field2711 = 0;

    @OriginalMember(owner = "client!po", name = "g", descriptor = "I")
    private int field2712 = 0;

    @OriginalMember(owner = "client!po", name = "e", descriptor = "I")
    private int field2710 = 0;

    @OriginalMember(owner = "client!po", name = "i", descriptor = "Lql;")
    private class346 field2714;

    @OriginalMember(owner = "client!po", name = "b", descriptor = "Lgn;")
    private class170 field2707;

    @OriginalMember(owner = "client!po", name = "h", descriptor = "Lgn;")
    private class170 field2713;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(III)V", line = 4)
    public final void method111(int arg0, int arg1, int arg2) {
        opengl var4 = this.field2714.field4697;
        var4.glPixelTransferf(3348, 0.5F);
        var4.glPixelTransferf(3349, 0.499F);
        var4.glPixelTransferf(3352, 0.5F);
        var4.glPixelTransferf(3353, 0.499F);
        var4.glPixelTransferf(3354, 0.5F);
        var4.glPixelTransferf(3355, 0.499F);
        this.field2713 = class170.method898(this.field2714, arg0, 121, this.field2707.field2142, this.field2707.field2143, arg1);
        this.field2708 = arg2;
        var4.glPixelTransferf(3348, 1.0F);
        var4.glPixelTransferf(3349, 0.0F);
        var4.glPixelTransferf(3352, 1.0F);
        var4.glPixelTransferf(3353, 0.0F);
        var4.glPixelTransferf(3354, 1.0F);
        var4.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IIIII)V", line = 24)
    public final void method100(int arg0, int arg1, int arg2, int arg3, int arg4) {
        opengl var6 = this.field2714.field4697;
        this.field2714.method2106();
        this.field2714.method2044(arg4);
        var6.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var7 = this.field2709 + arg0;
        int var8 = this.field2710 + arg1;
        if (this.field2713 == null) {
            this.field2714.method2032(this.field2707);
            this.field2714.method2054(arg2);
            var6.glBegin(7);
            var6.glTexCoord2f(0.0F, this.field2707.field2141);
            var6.glVertex2i(var7, var8);
            var6.glTexCoord2f(0.0F, 0.0F);
            var6.glVertex2i(var7, this.field2707.field2142 + var8);
            var6.glTexCoord2f(this.field2707.field2144, 0.0F);
            var6.glVertex2i(this.field2707.field2143 + var7, this.field2707.field2142 + var8);
            var6.glTexCoord2f(this.field2707.field2144, this.field2707.field2141);
            var6.glVertex2i(this.field2707.field2143 + var7, var8);
            var6.glEnd();
            return;
        }
        this.method1099(arg2);
        var6.glBegin(7);
        var6.glMultiTexCoord2f(33985, 0.0F, this.field2707.field2141);
        var6.glTexCoord2f(0.0F, this.field2707.field2141);
        var6.glVertex2i(var7, var8);
        var6.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var6.glTexCoord2f(0.0F, 0.0F);
        var6.glVertex2i(var7, this.field2707.field2142 + var8);
        var6.glMultiTexCoord2f(33985, this.field2707.field2144, 0.0F);
        var6.glTexCoord2f(this.field2707.field2144, 0.0F);
        var6.glVertex2i(this.field2707.field2143 + var7, this.field2707.field2142 + var8);
        var6.glMultiTexCoord2f(33985, this.field2707.field2144, this.field2707.field2141);
        var6.glTexCoord2f(this.field2707.field2144, this.field2707.field2141);
        var6.glVertex2i(this.field2707.field2143 + var7, var8);
        var6.glEnd();
        this.method1100();
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IIIIIII)V", line = 70)
    public final void method107(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        opengl var8 = this.field2714.field4697;
        int var9 = arg0 + arg2;
        int var10 = arg1 + arg3;
        this.field2714.method2106();
        this.field2714.method2032(this.field2707);
        this.field2714.method2044(arg6);
        this.field2714.method2054(arg4);
        var8.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field2707.field2145 && !this.field2706) {
            float var11 = (float) arg3 * this.field2707.field2141 / (float) this.field2707.field2142;
            float var12 = (float) arg2 * this.field2707.field2144 / (float) this.field2707.field2143;
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
        var8.glTranslatef((float) this.field2709, (float) this.field2710, 0.0F);
        int var13 = this.method101();
        int var14 = this.method109();
        int var15 = this.field2707.field2142 + arg1;
        var8.glBegin(7);
        int var16 = arg1;
        while (var15 <= var10) {
            int var17 = this.field2707.field2143 + arg0;
            int var18 = arg0;
            while (var17 <= var9) {
                var8.glTexCoord2f(0.0F, this.field2707.field2141);
                var8.glVertex2i(var18, var16);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2i(var18, var15);
                var8.glTexCoord2f(this.field2707.field2144, 0.0F);
                var8.glVertex2i(var17, var15);
                var8.glTexCoord2f(this.field2707.field2144, this.field2707.field2141);
                var8.glVertex2i(var17, var16);
                var17 += var13;
                var18 += var13;
            }
            if (var18 < var9) {
                float var19 = (float) (var9 - var18) * this.field2707.field2144 / (float) this.field2707.field2143;
                var8.glTexCoord2f(0.0F, this.field2707.field2141);
                var8.glVertex2i(var18, var16);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2i(var18, var15);
                var8.glTexCoord2f(var19, 0.0F);
                var8.glVertex2i(var9, var15);
                var8.glTexCoord2f(var19, this.field2707.field2141);
                var8.glVertex2i(var9, var16);
            }
            var16 += var14;
            var15 += var14;
        }
        if (var16 < var10) {
            float var20 = (float) (this.field2707.field2923 - (var10 - var16)) * this.field2707.field2141 / (float) this.field2707.field2142;
            int var21 = this.field2707.field2143 + arg0;
            int var22 = arg0;
            while (var21 <= var9) {
                var8.glTexCoord2f(0.0F, this.field2707.field2141);
                var8.glVertex2i(var22, var16);
                var8.glTexCoord2f(0.0F, var20);
                var8.glVertex2i(var22, var10);
                var8.glTexCoord2f(this.field2707.field2144, var20);
                var8.glVertex2i(var21, var10);
                var8.glTexCoord2f(this.field2707.field2144, this.field2707.field2141);
                var8.glVertex2i(var21, var16);
                var21 += var13;
                var22 += var13;
            }
            if (var22 < var9) {
                float var23 = (float) (var9 - var22) * this.field2707.field2144 / (float) this.field2707.field2143;
                var8.glTexCoord2f(0.0F, this.field2707.field2141);
                var8.glVertex2i(var22, var16);
                var8.glTexCoord2f(0.0F, var20);
                var8.glVertex2i(var22, var10);
                var8.glTexCoord2f(var23, var20);
                var8.glVertex2i(var9, var10);
                var8.glTexCoord2f(var23, this.field2707.field2141);
                var8.glVertex2i(var9, var16);
            }
        }
        var8.glEnd();
        var8.glPopMatrix();
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(FFFFFFLgo;II)V", line = 201)
    public final void method96(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class175 arg6, int arg7, int arg8) {
        class170 var10 = ((class113) arg6).field1409;
        if (this.field2706) {
            float var11 = (float) this.method101();
            float var12 = (float) this.method109();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field2710 * var15;
            float var18 = (float) this.field2710 * var16;
            float var19 = (float) this.field2709 * var13;
            float var20 = (float) this.field2709 * var14;
            float var21 = (float) this.field2712 * -var13;
            float var22 = (float) this.field2712 * -var14;
            float var23 = (float) this.field2711 * -var15;
            float var24 = (float) this.field2711 * -var16;
            arg0 = arg0 + var19 + var17;
            arg1 = arg1 + var20 + var18;
            arg2 = arg2 + var21 + var17;
            arg3 = arg3 + var22 + var18;
            arg4 = arg4 + var19 + var23;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        opengl var27 = this.field2714.field4697;
        this.field2714.method2106();
        this.field2714.method2032(this.field2707);
        this.field2714.method2054(0);
        this.field2714.method2052(1);
        this.field2714.method2032(var10);
        this.field2714.method2053(7681, 8448);
        this.field2714.method2062(0, 34168, 768);
        this.field2714.method2044(1);
        float var28 = var10.field2144 / (float) var10.field2143;
        float var29 = var10.field2141 / (float) var10.field2142;
        var27.glBegin(7);
        var27.glColor3f(1.0F, 1.0F, 1.0F);
        var27.glMultiTexCoord2f(33984, 0.0F, this.field2707.field2141);
        var27.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * var28, var10.field2141 - (arg1 - (float) arg8) * var29);
        var27.glVertex2f(arg0, arg1);
        var27.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        var27.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * var28, var10.field2141 - (arg5 - (float) arg8) * var29);
        var27.glVertex2f(arg4, arg5);
        var27.glMultiTexCoord2f(33984, this.field2707.field2144, 0.0F);
        var27.glMultiTexCoord2f(33985, (var25 - (float) arg7) * var28, var10.field2141 - (var26 - (float) arg8) * var29);
        var27.glVertex2f(var25, var26);
        var27.glMultiTexCoord2f(33984, this.field2707.field2144, this.field2707.field2141);
        var27.glMultiTexCoord2f(33985, (arg2 - (float) arg7) * var28, var10.field2141 - (arg3 - (float) arg8) * var29);
        var27.glVertex2f(arg2, arg3);
        var27.glEnd();
        this.field2714.method2062(0, 5890, 768);
        this.field2714.method2054(1);
        this.field2714.method2032((class50) null);
        this.field2714.method2052(0);
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lql;IIII)V", line = 585)
    public class202(class346 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2714 = arg0;
        this.field2707 = class170.method898(arg0, arg1, -90, arg4, arg3, arg2);
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lql;II[III)V", line = 591)
    public class202(class346 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field2714 = arg0;
        this.field2707 = class170.method896(arg0, arg3, arg1, false, arg2, 99);
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(IIII)V", line = 285)
    public final void method108(int arg0, int arg1, int arg2, int arg3) {
        this.field2709 = arg0;
        this.field2710 = arg1;
        this.field2712 = arg2;
        this.field2711 = arg3;
        this.field2706 = this.field2709 != 0 || this.field2710 != 0 || this.field2712 != 0 || this.field2711 != 0;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IIIIII)V", line = 294)
    public final void method95(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2707.method1174(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V", line = 297)
    private final void method1099(int arg0) {
        this.field2714.method2052(1);
        this.field2714.method2032(this.field2707);
        this.field2714.method2053(this.field2714.method2064(arg0), 7681);
        this.field2714.method2062(1, 34167, 768);
        this.field2714.method2040(0, 34168, 770);
        this.field2714.method2052(0);
        this.field2714.method2032(this.field2713);
        this.field2714.method2053(34479, 7681);
        this.field2714.method2062(1, 34166, 768);
        if (this.field2708 == 0) {
            this.field2714.method2056(1.0F, 0.5F, 0.5F, 0.0F);
        } else if (this.field2708 == 1) {
            this.field2714.method2056(0.5F, 1.0F, 0.5F, 0.0F);
        } else if (this.field2708 == 2) {
            this.field2714.method2056(0.5F, 0.5F, 1.0F, 0.0F);
        } else if (this.field2708 == 3) {
            this.field2714.method2056(128.5F, 128.5F, 128.5F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "()I", line = 326)
    public final int method101() {
        return this.field2707.field2143 + this.field2709 + this.field2712;
    }

    @OriginalMember(owner = "client!po", name = "e", descriptor = "()V", line = 334)
    private final void method1100() {
        this.field2714.method2052(1);
        this.field2714.method2032((class50) null);
        this.field2714.method2053(8448, 8448);
        this.field2714.method2062(1, 34168, 768);
        this.field2714.method2040(0, 5890, 770);
        this.field2714.method2052(0);
        this.field2714.method2062(1, 34168, 768);
    }

    @OriginalMember(owner = "client!po", name = "d", descriptor = "()I", line = 345)
    public final int method109() {
        return this.field2707.field2142 + this.field2710 + this.field2711;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(FFFFFFIII)V", line = 350)
    public final void method98(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field2706) {
            float var10 = (float) this.method101();
            float var11 = (float) this.method109();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field2710 * var14;
            float var17 = (float) this.field2710 * var15;
            float var18 = (float) this.field2709 * var12;
            float var19 = (float) this.field2709 * var13;
            float var20 = (float) this.field2712 * -var12;
            float var21 = (float) this.field2712 * -var13;
            float var22 = (float) this.field2711 * -var14;
            float var23 = (float) this.field2711 * -var15;
            arg0 = arg0 + var18 + var16;
            arg1 = arg1 + var19 + var17;
            arg2 = arg2 + var20 + var16;
            arg3 = arg3 + var21 + var17;
            arg4 = arg4 + var18 + var22;
            arg5 = arg5 + var19 + var23;
        }
        float var24 = arg2 + arg4 - arg0;
        float var25 = arg5 + arg3 - arg1;
        opengl var26 = this.field2714.field4697;
        this.field2714.method2106();
        this.field2714.method2032(this.field2707);
        this.field2714.method2044(arg8);
        this.field2714.method2054(arg6);
        var26.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        var26.glBegin(7);
        var26.glTexCoord2f(0.0F, this.field2707.field2141);
        var26.glVertex2f(arg0, arg1);
        var26.glTexCoord2f(0.0F, 0.0F);
        var26.glVertex2f(arg4, arg5);
        var26.glTexCoord2f(this.field2707.field2144, 0.0F);
        var26.glVertex2f(var24, var25);
        var26.glTexCoord2f(this.field2707.field2144, this.field2707.field2141);
        var26.glVertex2f(arg2, arg3);
        var26.glEnd();
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "()I", line = 417)
    public final int method97() {
        return this.field2707.field2143;
    }

    @OriginalMember(owner = "client!po", name = "c", descriptor = "()I", line = 421)
    public final int method105() {
        return this.field2707.field2142;
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(IIIIIII)V", line = 426)
    public final void method110(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        opengl var8 = this.field2714.field4697;
        this.field2714.method2106();
        this.field2714.method2044(arg6);
        var8.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field2706) {
            float var9 = (float) arg2 / (float) this.method101();
            float var10 = (float) arg3 / (float) this.method109();
            float var11 = (float) this.field2709 * var9 + (float) arg0;
            float var12 = (float) this.field2710 * var10 + (float) arg1;
            float var13 = (float) this.field2707.field2143 * var9 + var11;
            float var14 = (float) this.field2707.field2142 * var10 + var12;
            if (this.field2713 == null) {
                this.field2714.method2032(this.field2707);
                this.field2714.method2054(arg4);
                var8.glBegin(7);
                var8.glTexCoord2f(0.0F, this.field2707.field2141);
                var8.glVertex2f(var11, var12);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2f(var11, var14);
                var8.glTexCoord2f(this.field2707.field2144, 0.0F);
                var8.glVertex2f(var13, var14);
                var8.glTexCoord2f(this.field2707.field2144, this.field2707.field2141);
                var8.glVertex2f(var13, var12);
                var8.glEnd();
            } else {
                this.method1099(arg4);
                var8.glBegin(7);
                var8.glMultiTexCoord2f(33985, 0.0F, this.field2707.field2141);
                var8.glTexCoord2f(0.0F, this.field2707.field2141);
                var8.glVertex2f(var11, var12);
                var8.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2f(var11, var14);
                var8.glMultiTexCoord2f(33985, this.field2707.field2144, 0.0F);
                var8.glTexCoord2f(this.field2707.field2144, 0.0F);
                var8.glVertex2f(var13, var14);
                var8.glMultiTexCoord2f(33985, this.field2707.field2144, this.field2707.field2141);
                var8.glTexCoord2f(this.field2707.field2144, this.field2707.field2141);
                var8.glVertex2f(var13, var12);
                var8.glEnd();
                this.method1100();
            }
        } else if (this.field2713 == null) {
            this.field2714.method2032(this.field2707);
            this.field2714.method2054(arg4);
            var8.glBegin(7);
            var8.glTexCoord2f(0.0F, this.field2707.field2141);
            var8.glVertex2i(arg0, arg1);
            var8.glTexCoord2f(0.0F, 0.0F);
            var8.glVertex2i(arg0, arg1 + arg3);
            var8.glTexCoord2f(this.field2707.field2144, 0.0F);
            var8.glVertex2i(arg0 + arg2, arg1 + arg3);
            var8.glTexCoord2f(this.field2707.field2144, this.field2707.field2141);
            var8.glVertex2i(arg0 + arg2, arg1);
            var8.glEnd();
        } else {
            this.method1099(arg4);
            var8.glBegin(7);
            var8.glMultiTexCoord2f(33985, 0.0F, this.field2707.field2141);
            var8.glTexCoord2f(0.0F, this.field2707.field2141);
            var8.glVertex2i(arg0, arg1);
            var8.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            var8.glTexCoord2f(0.0F, 0.0F);
            var8.glVertex2i(arg0, arg1 + arg3);
            var8.glMultiTexCoord2f(33985, this.field2707.field2144, 0.0F);
            var8.glTexCoord2f(this.field2707.field2144, 0.0F);
            var8.glVertex2i(arg0 + arg2, arg1 + arg3);
            var8.glMultiTexCoord2f(33985, this.field2707.field2144, this.field2707.field2141);
            var8.glTexCoord2f(this.field2707.field2144, this.field2707.field2141);
            var8.glVertex2i(arg0 + arg2, arg1);
            var8.glEnd();
            this.method1100();
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IILgo;II)V", line = 526)
    public final void method104(int arg0, int arg1, class175 arg2, int arg3, int arg4) {
        class113 var6 = (class113) arg2;
        class170 var7 = var6.field1409;
        this.field2714.method2106();
        this.field2714.method2032(this.field2707);
        this.field2714.method2054(0);
        this.field2714.method2052(1);
        this.field2714.method2032(var7);
        this.field2714.method2053(7681, 8448);
        this.field2714.method2062(0, 34168, 768);
        this.field2714.method2044(1);
        int var8 = this.field2709 + arg0;
        int var9 = this.field2710 + arg1;
        int var10 = this.field2707.field2143 + var8;
        int var11 = this.field2707.field2142 + var9;
        float var12 = var7.field2144 / (float) var7.field2143;
        float var13 = var7.field2141 / (float) var7.field2142;
        float var14 = (float) (var8 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field2141 - (float) (var9 - arg4) * var13;
        float var17 = var7.field2141 - (float) (var11 - arg4) * var13;
        opengl var18 = this.field2714.field4697;
        var18.glBegin(7);
        var18.glColor3f(1.0F, 1.0F, 1.0F);
        var18.glMultiTexCoord2f(33984, 0.0F, this.field2707.field2141);
        var18.glMultiTexCoord2f(33985, var14, var16);
        var18.glVertex2i(var8, var9);
        var18.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        var18.glMultiTexCoord2f(33985, var14, var17);
        var18.glVertex2i(var8, this.field2707.field2142 + var9);
        var18.glMultiTexCoord2f(33984, this.field2707.field2144, 0.0F);
        var18.glMultiTexCoord2f(33985, var15, var17);
        var18.glVertex2i(this.field2707.field2143 + var8, this.field2707.field2142 + var9);
        var18.glMultiTexCoord2f(33984, this.field2707.field2144, this.field2707.field2141);
        var18.glMultiTexCoord2f(33985, var15, var16);
        var18.glVertex2i(this.field2707.field2143 + var8, var9);
        var18.glEnd();
        this.field2714.method2062(0, 5890, 768);
        this.field2714.method2054(1);
        this.field2714.method2032((class50) null);
        this.field2714.method2052(0);
    }
}
