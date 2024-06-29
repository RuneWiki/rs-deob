import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class438 extends class421 {

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "I")
    private int field6374 = 0;

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "I")
    private int field6375 = 0;

    @OriginalMember(owner = "client!qs", name = "e", descriptor = "I")
    private int field6376 = 0;

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "I")
    private int field6373 = 0;

    @OriginalMember(owner = "client!qs", name = "h", descriptor = "Z")
    private boolean field6379 = false;

    @OriginalMember(owner = "client!qs", name = "i", descriptor = "I")
    private int field6380 = 0;

    @OriginalMember(owner = "client!qs", name = "f", descriptor = "Lge;")
    private class104 field6377;

    @OriginalMember(owner = "client!qs", name = "g", descriptor = "Lef;")
    private class343 field6378;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "Lef;")
    private class343 field6372;

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(IIIIIII)V", line = 4)
    public final void method494(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        opengl var8 = this.field6377.field1604;
        this.field6377.method933();
        this.field6377.method868(arg6);
        var8.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field6379) {
            float var9 = (float) arg2 / (float) this.method1461();
            float var10 = (float) arg3 / (float) this.method1463();
            float var11 = (float) this.field6374 * var9 + (float) arg0;
            float var12 = (float) this.field6373 * var10 + (float) arg1;
            float var13 = (float) this.field6378.field4856 * var9 + var11;
            float var14 = (float) this.field6378.field4853 * var10 + var12;
            if (this.field6372 == null) {
                this.field6377.method929(this.field6378);
                this.field6377.method884(arg4);
                var8.glBegin(7);
                var8.glTexCoord2f(0.0F, this.field6378.field4855);
                var8.glVertex2f(var11, var12);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2f(var11, var14);
                var8.glTexCoord2f(this.field6378.field4857, 0.0F);
                var8.glVertex2f(var13, var14);
                var8.glTexCoord2f(this.field6378.field4857, this.field6378.field4855);
                var8.glVertex2f(var13, var12);
                var8.glEnd();
            } else {
                this.method2740(arg4);
                var8.glBegin(7);
                var8.glMultiTexCoord2f(33985, 0.0F, this.field6378.field4855);
                var8.glTexCoord2f(0.0F, this.field6378.field4855);
                var8.glVertex2f(var11, var12);
                var8.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2f(var11, var14);
                var8.glMultiTexCoord2f(33985, this.field6378.field4857, 0.0F);
                var8.glTexCoord2f(this.field6378.field4857, 0.0F);
                var8.glVertex2f(var13, var14);
                var8.glMultiTexCoord2f(33985, this.field6378.field4857, this.field6378.field4855);
                var8.glTexCoord2f(this.field6378.field4857, this.field6378.field4855);
                var8.glVertex2f(var13, var12);
                var8.glEnd();
                this.method2741();
            }
        } else if (this.field6372 == null) {
            this.field6377.method929(this.field6378);
            this.field6377.method884(arg4);
            var8.glBegin(7);
            var8.glTexCoord2f(0.0F, this.field6378.field4855);
            var8.glVertex2i(arg0, arg1);
            var8.glTexCoord2f(0.0F, 0.0F);
            var8.glVertex2i(arg0, arg1 + arg3);
            var8.glTexCoord2f(this.field6378.field4857, 0.0F);
            var8.glVertex2i(arg0 + arg2, arg1 + arg3);
            var8.glTexCoord2f(this.field6378.field4857, this.field6378.field4855);
            var8.glVertex2i(arg0 + arg2, arg1);
            var8.glEnd();
        } else {
            this.method2740(arg4);
            var8.glBegin(7);
            var8.glMultiTexCoord2f(33985, 0.0F, this.field6378.field4855);
            var8.glTexCoord2f(0.0F, this.field6378.field4855);
            var8.glVertex2i(arg0, arg1);
            var8.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            var8.glTexCoord2f(0.0F, 0.0F);
            var8.glVertex2i(arg0, arg1 + arg3);
            var8.glMultiTexCoord2f(33985, this.field6378.field4857, 0.0F);
            var8.glTexCoord2f(this.field6378.field4857, 0.0F);
            var8.glVertex2i(arg0 + arg2, arg1 + arg3);
            var8.glMultiTexCoord2f(33985, this.field6378.field4857, this.field6378.field4855);
            var8.glTexCoord2f(this.field6378.field4857, this.field6378.field4855);
            var8.glVertex2i(arg0 + arg2, arg1);
            var8.glEnd();
            this.method2741();
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIII)V", line = 102)
    public final void method498(int arg0, int arg1, int arg2, int arg3, int arg4) {
        opengl var6 = this.field6377.field1604;
        this.field6377.method933();
        this.field6377.method868(arg4);
        var6.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var7 = this.field6374 + arg0;
        int var8 = this.field6373 + arg1;
        if (this.field6372 == null) {
            this.field6377.method929(this.field6378);
            this.field6377.method884(arg2);
            var6.glBegin(7);
            var6.glTexCoord2f(0.0F, this.field6378.field4855);
            var6.glVertex2i(var7, var8);
            var6.glTexCoord2f(0.0F, 0.0F);
            var6.glVertex2i(var7, this.field6378.field4853 + var8);
            var6.glTexCoord2f(this.field6378.field4857, 0.0F);
            var6.glVertex2i(this.field6378.field4856 + var7, this.field6378.field4853 + var8);
            var6.glTexCoord2f(this.field6378.field4857, this.field6378.field4855);
            var6.glVertex2i(this.field6378.field4856 + var7, var8);
            var6.glEnd();
            return;
        }
        this.method2740(arg2);
        var6.glBegin(7);
        var6.glMultiTexCoord2f(33985, 0.0F, this.field6378.field4855);
        var6.glTexCoord2f(0.0F, this.field6378.field4855);
        var6.glVertex2i(var7, var8);
        var6.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var6.glTexCoord2f(0.0F, 0.0F);
        var6.glVertex2i(var7, this.field6378.field4853 + var8);
        var6.glMultiTexCoord2f(33985, this.field6378.field4857, 0.0F);
        var6.glTexCoord2f(this.field6378.field4857, 0.0F);
        var6.glVertex2i(this.field6378.field4856 + var7, this.field6378.field4853 + var8);
        var6.glMultiTexCoord2f(33985, this.field6378.field4857, this.field6378.field4855);
        var6.glTexCoord2f(this.field6378.field4857, this.field6378.field4855);
        var6.glVertex2i(this.field6378.field4856 + var7, var8);
        var6.glEnd();
        this.method2741();
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "()I", line = 147)
    public final int method1469() {
        return this.field6378.field4856;
    }

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "()I", line = 152)
    public final int method1461() {
        return this.field6378.field4856 + this.field6374 + this.field6380;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IILrn;II)V", line = 156)
    public final void method499(int arg0, int arg1, class134 arg2, int arg3, int arg4) {
        class318 var6 = (class318) arg2;
        class343 var7 = var6.field4604;
        this.field6377.method933();
        this.field6377.method929(this.field6378);
        this.field6377.method884(0);
        this.field6377.method857(1);
        this.field6377.method929(var7);
        this.field6377.method870(7681, 8448);
        this.field6377.method891(0, 34168, 768);
        this.field6377.method868(1);
        int var8 = this.field6374 + arg0;
        int var9 = this.field6373 + arg1;
        int var10 = this.field6378.field4856 + var8;
        int var11 = this.field6378.field4853 + var9;
        float var12 = var7.field4857 / (float) var7.field4856;
        float var13 = var7.field4855 / (float) var7.field4853;
        float var14 = (float) (var8 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field4855 - (float) (var9 - arg4) * var13;
        float var17 = var7.field4855 - (float) (var11 - arg4) * var13;
        opengl var18 = this.field6377.field1604;
        var18.glBegin(7);
        var18.glColor3f(1.0F, 1.0F, 1.0F);
        var18.glMultiTexCoord2f(33984, 0.0F, this.field6378.field4855);
        var18.glMultiTexCoord2f(33985, var14, var16);
        var18.glVertex2i(var8, var9);
        var18.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        var18.glMultiTexCoord2f(33985, var14, var17);
        var18.glVertex2i(var8, this.field6378.field4853 + var9);
        var18.glMultiTexCoord2f(33984, this.field6378.field4857, 0.0F);
        var18.glMultiTexCoord2f(33985, var15, var17);
        var18.glVertex2i(this.field6378.field4856 + var8, this.field6378.field4853 + var9);
        var18.glMultiTexCoord2f(33984, this.field6378.field4857, this.field6378.field4855);
        var18.glMultiTexCoord2f(33985, var15, var16);
        var18.glVertex2i(this.field6378.field4856 + var8, var9);
        var18.glEnd();
        this.field6377.method891(0, 5890, 768);
        this.field6377.method884(1);
        this.field6377.method929((class195) null);
        this.field6377.method857(0);
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(FFFFFFIII)V", line = 213)
    public final void method1462(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field6379) {
            float var10 = (float) this.method1461();
            float var11 = (float) this.method1463();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field6373 * var14;
            float var17 = (float) this.field6373 * var15;
            float var18 = (float) this.field6374 * var12;
            float var19 = (float) this.field6374 * var13;
            float var20 = (float) this.field6380 * -var12;
            float var21 = (float) this.field6380 * -var13;
            float var22 = (float) this.field6376 * -var14;
            float var23 = (float) this.field6376 * -var15;
            arg0 = arg0 + var18 + var16;
            arg1 = arg1 + var19 + var17;
            arg2 = arg2 + var20 + var16;
            arg3 = arg3 + var21 + var17;
            arg4 = arg4 + var18 + var22;
            arg5 = arg5 + var19 + var23;
        }
        float var24 = arg2 + arg4 - arg0;
        float var25 = arg5 + arg3 - arg1;
        opengl var26 = this.field6377.field1604;
        this.field6377.method933();
        this.field6377.method929(this.field6378);
        this.field6377.method868(arg8);
        this.field6377.method884(arg6);
        var26.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        var26.glBegin(7);
        var26.glTexCoord2f(0.0F, this.field6378.field4855);
        var26.glVertex2f(arg0, arg1);
        var26.glTexCoord2f(0.0F, 0.0F);
        var26.glVertex2f(arg4, arg5);
        var26.glTexCoord2f(this.field6378.field4857, 0.0F);
        var26.glVertex2f(var24, var25);
        var26.glTexCoord2f(this.field6378.field4857, this.field6378.field4855);
        var26.glVertex2f(arg2, arg3);
        var26.glEnd();
    }

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lge;IIII)V", line = 585)
    public class438(class104 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field6377 = arg0;
        this.field6378 = class343.method2208(arg3, arg0, 3553, arg1, arg2, arg4);
    }

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lge;II[III)V", line = 591)
    public class438(class104 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field6377 = arg0;
        this.field6378 = class343.method2210(arg2, arg1, arg3, (byte) -57, false, arg0);
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V", line = 278)
    private final void method2740(int arg0) {
        this.field6377.method857(1);
        this.field6377.method929(this.field6378);
        this.field6377.method870(this.field6377.method920(arg0), 7681);
        this.field6377.method891(1, 34167, 768);
        this.field6377.method889(0, 34168, 770);
        this.field6377.method857(0);
        this.field6377.method929(this.field6372);
        this.field6377.method870(34479, 7681);
        this.field6377.method891(1, 34166, 768);
        if (this.field6375 == 0) {
            this.field6377.method907(1.0F, 0.5F, 0.5F, 0.0F);
        } else if (this.field6375 == 1) {
            this.field6377.method907(0.5F, 1.0F, 0.5F, 0.0F);
        } else if (this.field6375 == 2) {
            this.field6377.method907(0.5F, 0.5F, 1.0F, 0.0F);
        } else if (this.field6375 == 3) {
            this.field6377.method907(128.5F, 128.5F, 128.5F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(FFFFFFLrn;II)V", line = 305)
    public final void method1466(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class134 arg6, int arg7, int arg8) {
        class343 var10 = ((class318) arg6).field4604;
        if (this.field6379) {
            float var11 = (float) this.method1461();
            float var12 = (float) this.method1463();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field6373 * var15;
            float var18 = (float) this.field6373 * var16;
            float var19 = (float) this.field6374 * var13;
            float var20 = (float) this.field6374 * var14;
            float var21 = (float) this.field6380 * -var13;
            float var22 = (float) this.field6380 * -var14;
            float var23 = (float) this.field6376 * -var15;
            float var24 = (float) this.field6376 * -var16;
            arg0 = arg0 + var19 + var17;
            arg1 = arg1 + var20 + var18;
            arg2 = arg2 + var21 + var17;
            arg3 = arg3 + var22 + var18;
            arg4 = arg4 + var19 + var23;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        opengl var27 = this.field6377.field1604;
        this.field6377.method933();
        this.field6377.method929(this.field6378);
        this.field6377.method884(0);
        this.field6377.method857(1);
        this.field6377.method929(var10);
        this.field6377.method870(7681, 8448);
        this.field6377.method891(0, 34168, 768);
        this.field6377.method868(1);
        float var28 = var10.field4857 / (float) var10.field4856;
        float var29 = var10.field4855 / (float) var10.field4853;
        var27.glBegin(7);
        var27.glColor3f(1.0F, 1.0F, 1.0F);
        var27.glMultiTexCoord2f(33984, 0.0F, this.field6378.field4855);
        var27.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * var28, var10.field4855 - (arg1 - (float) arg8) * var29);
        var27.glVertex2f(arg0, arg1);
        var27.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        var27.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * var28, var10.field4855 - (arg5 - (float) arg8) * var29);
        var27.glVertex2f(arg4, arg5);
        var27.glMultiTexCoord2f(33984, this.field6378.field4857, 0.0F);
        var27.glMultiTexCoord2f(33985, (var25 - (float) arg7) * var28, var10.field4855 - (var26 - (float) arg8) * var29);
        var27.glVertex2f(var25, var26);
        var27.glMultiTexCoord2f(33984, this.field6378.field4857, this.field6378.field4855);
        var27.glMultiTexCoord2f(33985, (arg2 - (float) arg7) * var28, var10.field4855 - (arg3 - (float) arg8) * var29);
        var27.glVertex2f(arg2, arg3);
        var27.glEnd();
        this.field6377.method891(0, 5890, 768);
        this.field6377.method884(1);
        this.field6377.method929((class195) null);
        this.field6377.method857(0);
    }

    @OriginalMember(owner = "client!qs", name = "e", descriptor = "()V", line = 390)
    private final void method2741() {
        this.field6377.method857(1);
        this.field6377.method929((class195) null);
        this.field6377.method870(8448, 8448);
        this.field6377.method891(1, 34168, 768);
        this.field6377.method889(0, 5890, 770);
        this.field6377.method857(0);
        this.field6377.method891(1, 34168, 768);
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(IIII)V", line = 400)
    public final void method1468(int arg0, int arg1, int arg2, int arg3) {
        this.field6374 = arg0;
        this.field6373 = arg1;
        this.field6380 = arg2;
        this.field6376 = arg3;
        this.field6379 = this.field6374 != 0 || this.field6373 != 0 || this.field6380 != 0 || this.field6376 != 0;
    }

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "()I", line = 407)
    public final int method1463() {
        return this.field6378.field4853 + this.field6373 + this.field6376;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIIIII)V", line = 411)
    public final void method1464(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        opengl var8 = this.field6377.field1604;
        int var9 = arg0 + arg2;
        int var10 = arg1 + arg3;
        this.field6377.method933();
        this.field6377.method929(this.field6378);
        this.field6377.method868(arg6);
        this.field6377.method884(arg4);
        var8.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field6378.field4854 && !this.field6379) {
            float var11 = (float) arg3 * this.field6378.field4855 / (float) this.field6378.field4853;
            float var12 = (float) arg2 * this.field6378.field4857 / (float) this.field6378.field4856;
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
        var8.glTranslatef((float) this.field6374, (float) this.field6373, 0.0F);
        int var13 = this.method1461();
        int var14 = this.method1463();
        int var15 = this.field6378.field4853 + arg1;
        var8.glBegin(7);
        int var16 = arg1;
        while (var15 <= var10) {
            int var17 = this.field6378.field4856 + arg0;
            int var18 = arg0;
            while (var17 <= var9) {
                var8.glTexCoord2f(0.0F, this.field6378.field4855);
                var8.glVertex2i(var18, var16);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2i(var18, var15);
                var8.glTexCoord2f(this.field6378.field4857, 0.0F);
                var8.glVertex2i(var17, var15);
                var8.glTexCoord2f(this.field6378.field4857, this.field6378.field4855);
                var8.glVertex2i(var17, var16);
                var17 += var13;
                var18 += var13;
            }
            if (var18 < var9) {
                float var19 = (float) (var9 - var18) * this.field6378.field4857 / (float) this.field6378.field4856;
                var8.glTexCoord2f(0.0F, this.field6378.field4855);
                var8.glVertex2i(var18, var16);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2i(var18, var15);
                var8.glTexCoord2f(var19, 0.0F);
                var8.glVertex2i(var9, var15);
                var8.glTexCoord2f(var19, this.field6378.field4855);
                var8.glVertex2i(var9, var16);
            }
            var16 += var14;
            var15 += var14;
        }
        if (var16 < var10) {
            float var20 = (float) (this.field6378.field3039 - (var10 - var16)) * this.field6378.field4855 / (float) this.field6378.field4853;
            int var21 = this.field6378.field4856 + arg0;
            int var22 = arg0;
            while (var21 <= var9) {
                var8.glTexCoord2f(0.0F, this.field6378.field4855);
                var8.glVertex2i(var22, var16);
                var8.glTexCoord2f(0.0F, var20);
                var8.glVertex2i(var22, var10);
                var8.glTexCoord2f(this.field6378.field4857, var20);
                var8.glVertex2i(var21, var10);
                var8.glTexCoord2f(this.field6378.field4857, this.field6378.field4855);
                var8.glVertex2i(var21, var16);
                var21 += var13;
                var22 += var13;
            }
            if (var22 < var9) {
                float var23 = (float) (var9 - var22) * this.field6378.field4857 / (float) this.field6378.field4856;
                var8.glTexCoord2f(0.0F, this.field6378.field4855);
                var8.glVertex2i(var22, var16);
                var8.glTexCoord2f(0.0F, var20);
                var8.glVertex2i(var22, var10);
                var8.glTexCoord2f(var23, var20);
                var8.glVertex2i(var9, var10);
                var8.glTexCoord2f(var23, this.field6378.field4855);
                var8.glVertex2i(var9, var16);
            }
        }
        var8.glEnd();
        var8.glPopMatrix();
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIIII)V", line = 543)
    public final void method497(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6378.method1572(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(III)V", line = 547)
    public final void method500(int arg0, int arg1, int arg2) {
        opengl var4 = this.field6377.field1604;
        var4.glPixelTransferf(3348, 0.5F);
        var4.glPixelTransferf(3349, 0.499F);
        var4.glPixelTransferf(3352, 0.5F);
        var4.glPixelTransferf(3353, 0.499F);
        var4.glPixelTransferf(3354, 0.5F);
        var4.glPixelTransferf(3355, 0.499F);
        this.field6372 = class343.method2208(this.field6378.field4856, this.field6377, 3553, arg0, arg1, this.field6378.field4853);
        this.field6375 = arg2;
        var4.glPixelTransferf(3348, 1.0F);
        var4.glPixelTransferf(3349, 0.0F);
        var4.glPixelTransferf(3352, 1.0F);
        var4.glPixelTransferf(3353, 0.0F);
        var4.glPixelTransferf(3354, 1.0F);
        var4.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "()I", line = 579)
    public final int method1467() {
        return this.field6378.field4853;
    }
}
