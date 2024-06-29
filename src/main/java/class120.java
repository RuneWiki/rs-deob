import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class120 extends class381 {

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "I")
    private int field1476 = 0;

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "Z")
    private boolean field1475 = false;

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "I")
    private int field1478 = 0;

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "I")
    private int field1477 = 0;

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "I")
    private int field1479 = 0;

    @OriginalMember(owner = "client!hm", name = "i", descriptor = "I")
    private int field1482 = 0;

    @OriginalMember(owner = "client!hm", name = "h", descriptor = "Lao;")
    private class157 field1481;

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "Lrn;")
    private class145 field1480;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "Lrn;")
    private class145 field1474;

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(IIIIIII)V")
    public final void method752(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        opengl var8 = this.field1481.field1927;
        this.field1480.method1476(true);
        this.field1481.method1004();
        this.field1481.method973(arg6);
        var8.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field1475) {
            float var9 = (float) arg2 / (float) this.method762();
            float var10 = (float) arg3 / (float) this.method761();
            float var11 = (float) this.field1478 * var9 + (float) arg0;
            float var12 = (float) this.field1482 * var10 + (float) arg1;
            float var13 = (float) this.field1480.field1786 * var9 + var11;
            float var14 = (float) this.field1480.field1785 * var10 + var12;
            if (this.field1474 == null) {
                this.field1481.method1003(this.field1480);
                this.field1481.method975(arg4);
                var8.glBegin(7);
                var8.glTexCoord2f(0.0F, this.field1480.field1784);
                var8.glVertex2f(var11, var12);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2f(var11, var14);
                var8.glTexCoord2f(this.field1480.field1788, 0.0F);
                var8.glVertex2f(var13, var14);
                var8.glTexCoord2f(this.field1480.field1788, this.field1480.field1784);
                var8.glVertex2f(var13, var12);
                var8.glEnd();
            } else {
                this.method754(arg4);
                this.field1474.method1476(true);
                var8.glBegin(7);
                var8.glMultiTexCoord2f(33985, 0.0F, this.field1480.field1784);
                var8.glTexCoord2f(0.0F, this.field1480.field1784);
                var8.glVertex2f(var11, var12);
                var8.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2f(var11, var14);
                var8.glMultiTexCoord2f(33985, this.field1480.field1788, 0.0F);
                var8.glTexCoord2f(this.field1480.field1788, 0.0F);
                var8.glVertex2f(var13, var14);
                var8.glMultiTexCoord2f(33985, this.field1480.field1788, this.field1480.field1784);
                var8.glTexCoord2f(this.field1480.field1788, this.field1480.field1784);
                var8.glVertex2f(var13, var12);
                var8.glEnd();
                this.method766();
            }
        } else if (this.field1474 == null) {
            this.field1481.method1003(this.field1480);
            this.field1481.method975(arg4);
            var8.glBegin(7);
            var8.glTexCoord2f(0.0F, this.field1480.field1784);
            var8.glVertex2i(arg0, arg1);
            var8.glTexCoord2f(0.0F, 0.0F);
            var8.glVertex2i(arg0, arg1 + arg3);
            var8.glTexCoord2f(this.field1480.field1788, 0.0F);
            var8.glVertex2i(arg0 + arg2, arg1 + arg3);
            var8.glTexCoord2f(this.field1480.field1788, this.field1480.field1784);
            var8.glVertex2i(arg0 + arg2, arg1);
            var8.glEnd();
        } else {
            this.method754(arg4);
            this.field1474.method1476(true);
            var8.glBegin(7);
            var8.glMultiTexCoord2f(33985, 0.0F, this.field1480.field1784);
            var8.glTexCoord2f(0.0F, this.field1480.field1784);
            var8.glVertex2i(arg0, arg1);
            var8.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            var8.glTexCoord2f(0.0F, 0.0F);
            var8.glVertex2i(arg0, arg1 + arg3);
            var8.glMultiTexCoord2f(33985, this.field1480.field1788, 0.0F);
            var8.glTexCoord2f(this.field1480.field1788, 0.0F);
            var8.glVertex2i(arg0 + arg2, arg1 + arg3);
            var8.glMultiTexCoord2f(33985, this.field1480.field1788, this.field1480.field1784);
            var8.glTexCoord2f(this.field1480.field1788, this.field1480.field1784);
            var8.glVertex2i(arg0 + arg2, arg1);
            var8.glEnd();
            this.method766();
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(FFFFFFIII)V")
    public final void method753(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field1475) {
            float var10 = (float) this.method762();
            float var11 = (float) this.method761();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field1482 * var14;
            float var17 = (float) this.field1482 * var15;
            float var18 = (float) this.field1478 * var12;
            float var19 = (float) this.field1478 * var13;
            float var20 = (float) this.field1477 * -var12;
            float var21 = (float) this.field1477 * -var13;
            float var22 = (float) this.field1476 * -var14;
            float var23 = (float) this.field1476 * -var15;
            arg0 = arg0 + var18 + var16;
            arg1 = arg1 + var19 + var17;
            arg2 = arg2 + var20 + var16;
            arg3 = arg3 + var21 + var17;
            arg4 = arg4 + var18 + var22;
            arg5 = arg5 + var19 + var23;
        }
        float var24 = arg2 + arg4 - arg0;
        float var25 = arg5 + arg3 - arg1;
        opengl var26 = this.field1481.field1927;
        this.field1480.method1476(true);
        this.field1481.method1004();
        this.field1481.method1003(this.field1480);
        this.field1481.method973(arg8);
        this.field1481.method975(arg6);
        var26.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        var26.glBegin(7);
        var26.glTexCoord2f(0.0F, this.field1480.field1784);
        var26.glVertex2f(arg0, arg1);
        var26.glTexCoord2f(0.0F, 0.0F);
        var26.glVertex2f(arg4, arg5);
        var26.glTexCoord2f(this.field1480.field1788, 0.0F);
        var26.glVertex2f(var24, var25);
        var26.glTexCoord2f(this.field1480.field1788, this.field1480.field1784);
        var26.glVertex2f(arg2, arg3);
        var26.glEnd();
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V")
    private final void method754(int arg0) {
        this.field1481.method1001(1);
        this.field1481.method1003(this.field1480);
        this.field1481.method981(this.field1481.method944(arg0), 7681);
        this.field1481.method991(1, 34167, 768);
        this.field1481.method989(0, 34168, 770);
        this.field1481.method1001(0);
        this.field1481.method1003(this.field1474);
        this.field1481.method981(34479, 7681);
        this.field1481.method991(1, 34166, 768);
        if (this.field1479 == 0) {
            this.field1481.method1000(1.0F, 0.5F, 0.5F, 0.0F);
        } else if (this.field1479 == 1) {
            this.field1481.method1000(0.5F, 1.0F, 0.5F, 0.0F);
        } else if (this.field1479 == 2) {
            this.field1481.method1000(0.5F, 0.5F, 1.0F, 0.0F);
        } else if (this.field1479 == 3) {
            this.field1481.method1000(128.5F, 128.5F, 128.5F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IILhb;II)V")
    public final void method755(int arg0, int arg1, class433 arg2, int arg3, int arg4) {
        class90 var6 = (class90) arg2;
        class145 var7 = var6.field1089;
        this.field1480.method1476(false);
        this.field1481.method1004();
        this.field1481.method1003(this.field1480);
        this.field1481.method975(0);
        this.field1481.method1001(1);
        this.field1481.method1003(var7);
        this.field1481.method981(7681, 8448);
        this.field1481.method991(0, 34168, 768);
        this.field1481.method973(1);
        int var8 = this.field1478 + arg0;
        int var9 = this.field1482 + arg1;
        int var10 = this.field1480.field1786 + var8;
        int var11 = this.field1480.field1785 + var9;
        float var12 = var7.field1788 / (float) var7.field1786;
        float var13 = var7.field1784 / (float) var7.field1785;
        float var14 = (float) (var8 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field1784 - (float) (var9 - arg4) * var13;
        float var17 = var7.field1784 - (float) (var11 - arg4) * var13;
        opengl var18 = this.field1481.field1927;
        var18.glBegin(7);
        var18.glColor3f(1.0F, 1.0F, 1.0F);
        var18.glMultiTexCoord2f(33984, 0.0F, this.field1480.field1784);
        var18.glMultiTexCoord2f(33985, var14, var16);
        var18.glVertex2i(var8, var9);
        var18.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        var18.glMultiTexCoord2f(33985, var14, var17);
        var18.glVertex2i(var8, this.field1480.field1785 + var9);
        var18.glMultiTexCoord2f(33984, this.field1480.field1788, 0.0F);
        var18.glMultiTexCoord2f(33985, var15, var17);
        var18.glVertex2i(this.field1480.field1786 + var8, this.field1480.field1785 + var9);
        var18.glMultiTexCoord2f(33984, this.field1480.field1788, this.field1480.field1784);
        var18.glMultiTexCoord2f(33985, var15, var16);
        var18.glVertex2i(this.field1480.field1786 + var8, var9);
        var18.glEnd();
        this.field1481.method991(0, 5890, 768);
        this.field1481.method975(1);
        this.field1481.method1003((class220) null);
        this.field1481.method1001(0);
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIII)V")
    public final void method756(int arg0, int arg1, int arg2, int arg3, int arg4) {
        opengl var6 = this.field1481.field1927;
        this.field1480.method1476(false);
        this.field1481.method1004();
        this.field1481.method973(arg4);
        var6.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var7 = this.field1478 + arg0;
        int var8 = this.field1482 + arg1;
        if (this.field1474 == null) {
            this.field1481.method1003(this.field1480);
            this.field1481.method975(arg2);
            var6.glBegin(7);
            var6.glTexCoord2f(0.0F, this.field1480.field1784);
            var6.glVertex2i(var7, var8);
            var6.glTexCoord2f(0.0F, 0.0F);
            var6.glVertex2i(var7, this.field1480.field1785 + var8);
            var6.glTexCoord2f(this.field1480.field1788, 0.0F);
            var6.glVertex2i(this.field1480.field1786 + var7, this.field1480.field1785 + var8);
            var6.glTexCoord2f(this.field1480.field1788, this.field1480.field1784);
            var6.glVertex2i(this.field1480.field1786 + var7, var8);
            var6.glEnd();
            return;
        }
        this.method754(arg2);
        this.field1474.method1476(false);
        var6.glBegin(7);
        var6.glMultiTexCoord2f(33985, 0.0F, this.field1480.field1784);
        var6.glTexCoord2f(0.0F, this.field1480.field1784);
        var6.glVertex2i(var7, var8);
        var6.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var6.glTexCoord2f(0.0F, 0.0F);
        var6.glVertex2i(var7, this.field1480.field1785 + var8);
        var6.glMultiTexCoord2f(33985, this.field1480.field1788, 0.0F);
        var6.glTexCoord2f(this.field1480.field1788, 0.0F);
        var6.glVertex2i(this.field1480.field1786 + var7, this.field1480.field1785 + var8);
        var6.glMultiTexCoord2f(33985, this.field1480.field1788, this.field1480.field1784);
        var6.glTexCoord2f(this.field1480.field1788, this.field1480.field1784);
        var6.glVertex2i(this.field1480.field1786 + var7, var8);
        var6.glEnd();
        this.method766();
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(FFFFFFLhb;II)V")
    public final void method757(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class433 arg6, int arg7, int arg8) {
        class145 var10 = ((class90) arg6).field1089;
        if (this.field1475) {
            float var11 = (float) this.method762();
            float var12 = (float) this.method761();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field1482 * var15;
            float var18 = (float) this.field1482 * var16;
            float var19 = (float) this.field1478 * var13;
            float var20 = (float) this.field1478 * var14;
            float var21 = (float) this.field1477 * -var13;
            float var22 = (float) this.field1477 * -var14;
            float var23 = (float) this.field1476 * -var15;
            float var24 = (float) this.field1476 * -var16;
            arg0 = arg0 + var19 + var17;
            arg1 = arg1 + var20 + var18;
            arg2 = arg2 + var21 + var17;
            arg3 = arg3 + var22 + var18;
            arg4 = arg4 + var19 + var23;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        opengl var27 = this.field1481.field1927;
        this.field1480.method1476(true);
        this.field1481.method1004();
        this.field1481.method1003(this.field1480);
        this.field1481.method975(0);
        this.field1481.method1001(1);
        this.field1481.method1003(var10);
        this.field1481.method981(7681, 8448);
        this.field1481.method991(0, 34168, 768);
        this.field1481.method973(1);
        float var28 = var10.field1788 / (float) var10.field1786;
        float var29 = var10.field1784 / (float) var10.field1785;
        var27.glBegin(7);
        var27.glColor3f(1.0F, 1.0F, 1.0F);
        var27.glMultiTexCoord2f(33984, 0.0F, this.field1480.field1784);
        var27.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * var28, var10.field1784 - (arg1 - (float) arg8) * var29);
        var27.glVertex2f(arg0, arg1);
        var27.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        var27.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * var28, var10.field1784 - (arg5 - (float) arg8) * var29);
        var27.glVertex2f(arg4, arg5);
        var27.glMultiTexCoord2f(33984, this.field1480.field1788, 0.0F);
        var27.glMultiTexCoord2f(33985, (var25 - (float) arg7) * var28, var10.field1784 - (var26 - (float) arg8) * var29);
        var27.glVertex2f(var25, var26);
        var27.glMultiTexCoord2f(33984, this.field1480.field1788, this.field1480.field1784);
        var27.glMultiTexCoord2f(33985, (arg2 - (float) arg7) * var28, var10.field1784 - (arg3 - (float) arg8) * var29);
        var27.glVertex2f(arg2, arg3);
        var27.glEnd();
        this.field1481.method991(0, 5890, 768);
        this.field1481.method975(1);
        this.field1481.method1003((class220) null);
        this.field1481.method1001(0);
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIIII)V")
    public final void method758(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1480.method2251(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "()I")
    public final int method759() {
        return this.field1480.field1785;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIIIII)V")
    public final void method760(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        opengl var8 = this.field1481.field1927;
        int var9 = arg0 + arg2;
        int var10 = arg1 + arg3;
        this.field1480.method1476(false);
        this.field1481.method1004();
        this.field1481.method1003(this.field1480);
        this.field1481.method973(arg6);
        this.field1481.method975(arg4);
        var8.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field1480.field1787 && !this.field1475) {
            float var11 = (float) arg3 * this.field1480.field1784 / (float) this.field1480.field1785;
            float var12 = (float) arg2 * this.field1480.field1788 / (float) this.field1480.field1786;
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
        var8.glTranslatef((float) this.field1478, (float) this.field1482, 0.0F);
        int var13 = this.method762();
        int var14 = this.method761();
        int var15 = this.field1480.field1785 + arg1;
        var8.glBegin(7);
        int var16 = arg1;
        while (var15 <= var10) {
            int var17 = this.field1480.field1786 + arg0;
            int var18 = arg0;
            while (var17 <= var9) {
                var8.glTexCoord2f(0.0F, this.field1480.field1784);
                var8.glVertex2i(var18, var16);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2i(var18, var15);
                var8.glTexCoord2f(this.field1480.field1788, 0.0F);
                var8.glVertex2i(var17, var15);
                var8.glTexCoord2f(this.field1480.field1788, this.field1480.field1784);
                var8.glVertex2i(var17, var16);
                var17 += var13;
                var18 += var13;
            }
            if (var18 < var9) {
                float var19 = (float) (var9 - var18) * this.field1480.field1788 / (float) this.field1480.field1786;
                var8.glTexCoord2f(0.0F, this.field1480.field1784);
                var8.glVertex2i(var18, var16);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2i(var18, var15);
                var8.glTexCoord2f(var19, 0.0F);
                var8.glVertex2i(var9, var15);
                var8.glTexCoord2f(var19, this.field1480.field1784);
                var8.glVertex2i(var9, var16);
            }
            var16 += var14;
            var15 += var14;
        }
        if (var16 < var10) {
            float var20 = (float) (this.field1480.field1785 - (var10 - var16)) * this.field1480.field1784 / (float) this.field1480.field1785;
            int var21 = this.field1480.field1786 + arg0;
            int var22 = arg0;
            while (var21 <= var9) {
                var8.glTexCoord2f(0.0F, this.field1480.field1784);
                var8.glVertex2i(var22, var16);
                var8.glTexCoord2f(0.0F, var20);
                var8.glVertex2i(var22, var10);
                var8.glTexCoord2f(this.field1480.field1788, var20);
                var8.glVertex2i(var21, var10);
                var8.glTexCoord2f(this.field1480.field1788, this.field1480.field1784);
                var8.glVertex2i(var21, var16);
                var21 += var13;
                var22 += var13;
            }
            if (var22 < var9) {
                float var23 = (float) (var9 - var22) * this.field1480.field1788 / (float) this.field1480.field1786;
                var8.glTexCoord2f(0.0F, this.field1480.field1784);
                var8.glVertex2i(var22, var16);
                var8.glTexCoord2f(0.0F, var20);
                var8.glVertex2i(var22, var10);
                var8.glTexCoord2f(var23, var20);
                var8.glVertex2i(var9, var10);
                var8.glTexCoord2f(var23, this.field1480.field1784);
                var8.glVertex2i(var9, var16);
            }
        }
        var8.glEnd();
        var8.glPopMatrix();
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "()I")
    public final int method761() {
        return this.field1480.field1785 + this.field1482 + this.field1476;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "()I")
    public final int method762() {
        return this.field1480.field1786 + this.field1478 + this.field1477;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIII)V")
    public final void method763(int arg0, int arg1, int arg2, int arg3) {
        this.field1478 = arg0;
        this.field1482 = arg1;
        this.field1477 = arg2;
        this.field1476 = arg3;
        this.field1475 = this.field1478 != 0 || this.field1482 != 0 || this.field1477 != 0 || this.field1476 != 0;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(III)V")
    public final void method764(int arg0, int arg1, int arg2) {
        opengl var4 = this.field1481.field1927;
        var4.glPixelTransferf(3348, 0.5F);
        var4.glPixelTransferf(3349, 0.499F);
        var4.glPixelTransferf(3352, 0.5F);
        var4.glPixelTransferf(3353, 0.499F);
        var4.glPixelTransferf(3354, 0.5F);
        var4.glPixelTransferf(3355, 0.499F);
        this.field1474 = class145.method885(arg0, this.field1481, this.field1480.field1786, arg1, this.field1480.field1785, (byte) -122);
        this.field1479 = arg2;
        var4.glPixelTransferf(3348, 1.0F);
        var4.glPixelTransferf(3349, 0.0F);
        var4.glPixelTransferf(3352, 1.0F);
        var4.glPixelTransferf(3353, 0.0F);
        var4.glPixelTransferf(3354, 1.0F);
        var4.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "()I")
    public final int method765() {
        return this.field1480.field1786;
    }

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "()V")
    private final void method766() {
        this.field1481.method1001(1);
        this.field1481.method1003((class220) null);
        this.field1481.method981(8448, 8448);
        this.field1481.method991(1, 34168, 768);
        this.field1481.method989(0, 5890, 770);
        this.field1481.method1001(0);
        this.field1481.method991(1, 34168, 768);
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lao;IIII)V")
    public class120(class157 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1481 = arg0;
        this.field1480 = class145.method885(arg1, arg0, arg3, arg2, arg4, (byte) -95);
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lao;II[III)V")
    public class120(class157 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field1481 = arg0;
        this.field1480 = class145.method884(arg2, arg0, arg1, (byte) -122, arg3, false);
    }
}
