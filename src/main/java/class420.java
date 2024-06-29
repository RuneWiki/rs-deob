import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class420 extends class319 {

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    private int field6027 = 0;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    private int field6031 = 0;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
    private int field6033 = 0;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    private int field6029 = 0;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    private int field6034 = 0;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "Z")
    private boolean field6032 = false;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "Lnm;")
    private class254 field6030;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "Lup;")
    private class259 field6028;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "Lup;")
    private class259 field6035;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "()I", line = 4)
    public final int method796() {
        return this.field6028.field3859;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(IIIIIII)V", line = 8)
    public final void method792(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        opengl var8 = this.field6030.field3648;
        this.field6028.method228(true);
        this.field6030.method1673();
        this.field6030.method1657(arg6);
        var8.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field6032) {
            float var9 = (float) arg2 / (float) this.method791();
            float var10 = (float) arg3 / (float) this.method789();
            float var11 = (float) this.field6031 * var9 + (float) arg0;
            float var12 = (float) this.field6034 * var10 + (float) arg1;
            float var13 = (float) this.field6028.field3863 * var9 + var11;
            float var14 = (float) this.field6028.field3859 * var10 + var12;
            if (this.field6035 == null) {
                this.field6030.method1653(this.field6028);
                this.field6030.method1636(arg4);
                var8.glBegin(7);
                var8.glTexCoord2f(0.0F, this.field6028.field3861);
                var8.glVertex2f(var11, var12);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2f(var11, var14);
                var8.glTexCoord2f(this.field6028.field3860, 0.0F);
                var8.glVertex2f(var13, var14);
                var8.glTexCoord2f(this.field6028.field3860, this.field6028.field3861);
                var8.glVertex2f(var13, var12);
                var8.glEnd();
            } else {
                this.method2488(arg4);
                this.field6035.method228(true);
                var8.glBegin(7);
                var8.glMultiTexCoord2f(33985, 0.0F, this.field6028.field3861);
                var8.glTexCoord2f(0.0F, this.field6028.field3861);
                var8.glVertex2f(var11, var12);
                var8.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2f(var11, var14);
                var8.glMultiTexCoord2f(33985, this.field6028.field3860, 0.0F);
                var8.glTexCoord2f(this.field6028.field3860, 0.0F);
                var8.glVertex2f(var13, var14);
                var8.glMultiTexCoord2f(33985, this.field6028.field3860, this.field6028.field3861);
                var8.glTexCoord2f(this.field6028.field3860, this.field6028.field3861);
                var8.glVertex2f(var13, var12);
                var8.glEnd();
                this.method2489();
            }
        } else if (this.field6035 == null) {
            this.field6030.method1653(this.field6028);
            this.field6030.method1636(arg4);
            var8.glBegin(7);
            var8.glTexCoord2f(0.0F, this.field6028.field3861);
            var8.glVertex2i(arg0, arg1);
            var8.glTexCoord2f(0.0F, 0.0F);
            var8.glVertex2i(arg0, arg1 + arg3);
            var8.glTexCoord2f(this.field6028.field3860, 0.0F);
            var8.glVertex2i(arg0 + arg2, arg1 + arg3);
            var8.glTexCoord2f(this.field6028.field3860, this.field6028.field3861);
            var8.glVertex2i(arg0 + arg2, arg1);
            var8.glEnd();
        } else {
            this.method2488(arg4);
            this.field6035.method228(true);
            var8.glBegin(7);
            var8.glMultiTexCoord2f(33985, 0.0F, this.field6028.field3861);
            var8.glTexCoord2f(0.0F, this.field6028.field3861);
            var8.glVertex2i(arg0, arg1);
            var8.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            var8.glTexCoord2f(0.0F, 0.0F);
            var8.glVertex2i(arg0, arg1 + arg3);
            var8.glMultiTexCoord2f(33985, this.field6028.field3860, 0.0F);
            var8.glTexCoord2f(this.field6028.field3860, 0.0F);
            var8.glVertex2i(arg0 + arg2, arg1 + arg3);
            var8.glMultiTexCoord2f(33985, this.field6028.field3860, this.field6028.field3861);
            var8.glTexCoord2f(this.field6028.field3860, this.field6028.field3861);
            var8.glVertex2i(arg0 + arg2, arg1);
            var8.glEnd();
            this.method2489();
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIII)V", line = 112)
    public final void method813(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6028.method308(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(FFFFFFIII)V", line = 119)
    public final void method790(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field6032) {
            float var10 = (float) this.method791();
            float var11 = (float) this.method789();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field6034 * var14;
            float var17 = (float) this.field6034 * var15;
            float var18 = (float) this.field6031 * var12;
            float var19 = (float) this.field6031 * var13;
            float var20 = (float) this.field6029 * -var12;
            float var21 = (float) this.field6029 * -var13;
            float var22 = (float) this.field6027 * -var14;
            float var23 = (float) this.field6027 * -var15;
            arg0 = arg0 + var18 + var16;
            arg1 = arg1 + var19 + var17;
            arg2 = arg2 + var20 + var16;
            arg3 = arg3 + var21 + var17;
            arg4 = arg4 + var18 + var22;
            arg5 = arg5 + var19 + var23;
        }
        float var24 = arg2 + arg4 - arg0;
        float var25 = arg5 + arg3 - arg1;
        opengl var26 = this.field6030.field3648;
        this.field6028.method228(true);
        this.field6030.method1673();
        this.field6030.method1653(this.field6028);
        this.field6030.method1657(arg8);
        this.field6030.method1636(arg6);
        var26.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        var26.glBegin(7);
        var26.glTexCoord2f(0.0F, this.field6028.field3861);
        var26.glVertex2f(arg0, arg1);
        var26.glTexCoord2f(0.0F, 0.0F);
        var26.glVertex2f(arg4, arg5);
        var26.glTexCoord2f(this.field6028.field3860, 0.0F);
        var26.glVertex2f(var24, var25);
        var26.glTexCoord2f(this.field6028.field3860, this.field6028.field3861);
        var26.glVertex2f(arg2, arg3);
        var26.glEnd();
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIII)V", line = 182)
    public final void method793(int arg0, int arg1, int arg2, int arg3, int arg4) {
        opengl var6 = this.field6030.field3648;
        this.field6028.method228(false);
        this.field6030.method1673();
        this.field6030.method1657(arg4);
        var6.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var7 = this.field6031 + arg0;
        int var8 = this.field6034 + arg1;
        if (this.field6035 == null) {
            this.field6030.method1653(this.field6028);
            this.field6030.method1636(arg2);
            var6.glBegin(7);
            var6.glTexCoord2f(0.0F, this.field6028.field3861);
            var6.glVertex2i(var7, var8);
            var6.glTexCoord2f(0.0F, 0.0F);
            var6.glVertex2i(var7, this.field6028.field3859 + var8);
            var6.glTexCoord2f(this.field6028.field3860, 0.0F);
            var6.glVertex2i(this.field6028.field3863 + var7, this.field6028.field3859 + var8);
            var6.glTexCoord2f(this.field6028.field3860, this.field6028.field3861);
            var6.glVertex2i(this.field6028.field3863 + var7, var8);
            var6.glEnd();
            return;
        }
        this.method2488(arg2);
        this.field6035.method228(false);
        var6.glBegin(7);
        var6.glMultiTexCoord2f(33985, 0.0F, this.field6028.field3861);
        var6.glTexCoord2f(0.0F, this.field6028.field3861);
        var6.glVertex2i(var7, var8);
        var6.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var6.glTexCoord2f(0.0F, 0.0F);
        var6.glVertex2i(var7, this.field6028.field3859 + var8);
        var6.glMultiTexCoord2f(33985, this.field6028.field3860, 0.0F);
        var6.glTexCoord2f(this.field6028.field3860, 0.0F);
        var6.glVertex2i(this.field6028.field3863 + var7, this.field6028.field3859 + var8);
        var6.glMultiTexCoord2f(33985, this.field6028.field3860, this.field6028.field3861);
        var6.glTexCoord2f(this.field6028.field3860, this.field6028.field3861);
        var6.glVertex2i(this.field6028.field3863 + var7, var8);
        var6.glEnd();
        this.method2489();
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIII)V", line = 229)
    public final void method797(int arg0, int arg1, int arg2, int arg3) {
        this.field6031 = arg0;
        this.field6034 = arg1;
        this.field6029 = arg2;
        this.field6027 = arg3;
        this.field6032 = this.field6031 != 0 || this.field6034 != 0 || this.field6029 != 0 || this.field6027 != 0;
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "()I", line = 236)
    public final int method791() {
        return this.field6028.field3863 + this.field6031 + this.field6029;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(FFFFFFLus;II)V", line = 240)
    public final void method800(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class401 arg6, int arg7, int arg8) {
        class259 var10 = ((class445) arg6).field6264;
        if (this.field6032) {
            float var11 = (float) this.method791();
            float var12 = (float) this.method789();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field6034 * var15;
            float var18 = (float) this.field6034 * var16;
            float var19 = (float) this.field6031 * var13;
            float var20 = (float) this.field6031 * var14;
            float var21 = (float) this.field6029 * -var13;
            float var22 = (float) this.field6029 * -var14;
            float var23 = (float) this.field6027 * -var15;
            float var24 = (float) this.field6027 * -var16;
            arg0 = arg0 + var19 + var17;
            arg1 = arg1 + var20 + var18;
            arg2 = arg2 + var21 + var17;
            arg3 = arg3 + var22 + var18;
            arg4 = arg4 + var19 + var23;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        opengl var27 = this.field6030.field3648;
        this.field6028.method228(true);
        this.field6030.method1673();
        this.field6030.method1653(this.field6028);
        this.field6030.method1636(0);
        this.field6030.method1634(1);
        this.field6030.method1653(var10);
        this.field6030.method1679(7681, 8448);
        this.field6030.method1621(0, 34168, 768);
        this.field6030.method1657(1);
        float var28 = var10.field3860 / (float) var10.field3863;
        float var29 = var10.field3861 / (float) var10.field3859;
        var27.glBegin(7);
        var27.glColor3f(1.0F, 1.0F, 1.0F);
        var27.glMultiTexCoord2f(33984, 0.0F, this.field6028.field3861);
        var27.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * var28, var10.field3861 - (arg1 - (float) arg8) * var29);
        var27.glVertex2f(arg0, arg1);
        var27.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        var27.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * var28, var10.field3861 - (arg5 - (float) arg8) * var29);
        var27.glVertex2f(arg4, arg5);
        var27.glMultiTexCoord2f(33984, this.field6028.field3860, 0.0F);
        var27.glMultiTexCoord2f(33985, (var25 - (float) arg7) * var28, var10.field3861 - (var26 - (float) arg8) * var29);
        var27.glVertex2f(var25, var26);
        var27.glMultiTexCoord2f(33984, this.field6028.field3860, this.field6028.field3861);
        var27.glMultiTexCoord2f(33985, (arg2 - (float) arg7) * var28, var10.field3861 - (arg3 - (float) arg8) * var29);
        var27.glVertex2f(arg2, arg3);
        var27.glEnd();
        this.field6030.method1621(0, 5890, 768);
        this.field6030.method1636(1);
        this.field6030.method1653((class26) null);
        this.field6030.method1634(0);
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "()I", line = 322)
    public final int method798() {
        return this.field6028.field3863;
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lnm;IIII)V", line = 594)
    public class420(class254 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field6030 = arg0;
        this.field6028 = class259.method1712(arg2, arg1, 30887, arg0, arg4, arg3);
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lnm;II[III)V", line = 600)
    public class420(class254 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field6030 = arg0;
        this.field6028 = class259.method1714(arg3, arg1, arg2, 3553, false, arg0);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "()I", line = 332)
    public final int method789() {
        return this.field6028.field3859 + this.field6034 + this.field6027;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V", line = 335)
    private final void method2488(int arg0) {
        this.field6030.method1634(1);
        this.field6030.method1653(this.field6028);
        this.field6030.method1679(this.field6030.method1630(arg0), 7681);
        this.field6030.method1621(1, 34167, 768);
        this.field6030.method1662(0, 34168, 770);
        this.field6030.method1634(0);
        this.field6030.method1653(this.field6035);
        this.field6030.method1679(34479, 7681);
        this.field6030.method1621(1, 34166, 768);
        if (this.field6033 == 0) {
            this.field6030.method1616(1.0F, 0.5F, 0.5F, 0.0F);
        } else if (this.field6033 == 1) {
            this.field6030.method1616(0.5F, 1.0F, 0.5F, 0.0F);
        } else if (this.field6033 == 2) {
            this.field6030.method1616(0.5F, 0.5F, 1.0F, 0.0F);
        } else if (this.field6033 == 3) {
            this.field6030.method1616(128.5F, 128.5F, 128.5F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "()V", line = 362)
    private final void method2489() {
        this.field6030.method1634(1);
        this.field6030.method1653((class26) null);
        this.field6030.method1679(8448, 8448);
        this.field6030.method1621(1, 34168, 768);
        this.field6030.method1662(0, 5890, 770);
        this.field6030.method1634(0);
        this.field6030.method1621(1, 34168, 768);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIII)V", line = 374)
    public final void method794(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        opengl var8 = this.field6030.field3648;
        int var9 = arg0 + arg2;
        int var10 = arg1 + arg3;
        this.field6028.method228(false);
        this.field6030.method1673();
        this.field6030.method1653(this.field6028);
        this.field6030.method1657(arg6);
        this.field6030.method1636(arg4);
        var8.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field6028.field3862 && !this.field6032) {
            float var11 = (float) arg3 * this.field6028.field3861 / (float) this.field6028.field3859;
            float var12 = (float) arg2 * this.field6028.field3860 / (float) this.field6028.field3863;
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
        var8.glTranslatef((float) this.field6031, (float) this.field6034, 0.0F);
        int var13 = this.method791();
        int var14 = this.method789();
        int var15 = this.field6028.field3859 + arg1;
        var8.glBegin(7);
        int var16 = arg1;
        while (var15 <= var10) {
            int var17 = this.field6028.field3863 + arg0;
            int var18 = arg0;
            while (var17 <= var9) {
                var8.glTexCoord2f(0.0F, this.field6028.field3861);
                var8.glVertex2i(var18, var16);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2i(var18, var15);
                var8.glTexCoord2f(this.field6028.field3860, 0.0F);
                var8.glVertex2i(var17, var15);
                var8.glTexCoord2f(this.field6028.field3860, this.field6028.field3861);
                var8.glVertex2i(var17, var16);
                var17 += var13;
                var18 += var13;
            }
            if (var18 < var9) {
                float var19 = (float) (var9 - var18) * this.field6028.field3860 / (float) this.field6028.field3863;
                var8.glTexCoord2f(0.0F, this.field6028.field3861);
                var8.glVertex2i(var18, var16);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2i(var18, var15);
                var8.glTexCoord2f(var19, 0.0F);
                var8.glVertex2i(var9, var15);
                var8.glTexCoord2f(var19, this.field6028.field3861);
                var8.glVertex2i(var9, var16);
            }
            var16 += var14;
            var15 += var14;
        }
        if (var16 < var10) {
            float var20 = (float) (this.field6028.field3859 - (var10 - var16)) * this.field6028.field3861 / (float) this.field6028.field3859;
            int var21 = this.field6028.field3863 + arg0;
            int var22 = arg0;
            while (var21 <= var9) {
                var8.glTexCoord2f(0.0F, this.field6028.field3861);
                var8.glVertex2i(var22, var16);
                var8.glTexCoord2f(0.0F, var20);
                var8.glVertex2i(var22, var10);
                var8.glTexCoord2f(this.field6028.field3860, var20);
                var8.glVertex2i(var21, var10);
                var8.glTexCoord2f(this.field6028.field3860, this.field6028.field3861);
                var8.glVertex2i(var21, var16);
                var21 += var13;
                var22 += var13;
            }
            if (var22 < var9) {
                float var23 = (float) (var9 - var22) * this.field6028.field3860 / (float) this.field6028.field3863;
                var8.glTexCoord2f(0.0F, this.field6028.field3861);
                var8.glVertex2i(var22, var16);
                var8.glTexCoord2f(0.0F, var20);
                var8.glVertex2i(var22, var10);
                var8.glTexCoord2f(var23, var20);
                var8.glVertex2i(var9, var10);
                var8.glTexCoord2f(var23, this.field6028.field3861);
                var8.glVertex2i(var9, var16);
            }
        }
        var8.glEnd();
        var8.glPopMatrix();
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IILus;II)V", line = 509)
    public final void method795(int arg0, int arg1, class401 arg2, int arg3, int arg4) {
        class445 var6 = (class445) arg2;
        class259 var7 = var6.field6264;
        this.field6028.method228(false);
        this.field6030.method1673();
        this.field6030.method1653(this.field6028);
        this.field6030.method1636(0);
        this.field6030.method1634(1);
        this.field6030.method1653(var7);
        this.field6030.method1679(7681, 8448);
        this.field6030.method1621(0, 34168, 768);
        this.field6030.method1657(1);
        int var8 = this.field6031 + arg0;
        int var9 = this.field6034 + arg1;
        int var10 = this.field6028.field3863 + var8;
        int var11 = this.field6028.field3859 + var9;
        float var12 = var7.field3860 / (float) var7.field3863;
        float var13 = var7.field3861 / (float) var7.field3859;
        float var14 = (float) (var8 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field3861 - (float) (var9 - arg4) * var13;
        float var17 = var7.field3861 - (float) (var11 - arg4) * var13;
        opengl var18 = this.field6030.field3648;
        var18.glBegin(7);
        var18.glColor3f(1.0F, 1.0F, 1.0F);
        var18.glMultiTexCoord2f(33984, 0.0F, this.field6028.field3861);
        var18.glMultiTexCoord2f(33985, var14, var16);
        var18.glVertex2i(var8, var9);
        var18.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        var18.glMultiTexCoord2f(33985, var14, var17);
        var18.glVertex2i(var8, this.field6028.field3859 + var9);
        var18.glMultiTexCoord2f(33984, this.field6028.field3860, 0.0F);
        var18.glMultiTexCoord2f(33985, var15, var17);
        var18.glVertex2i(this.field6028.field3863 + var8, this.field6028.field3859 + var9);
        var18.glMultiTexCoord2f(33984, this.field6028.field3860, this.field6028.field3861);
        var18.glMultiTexCoord2f(33985, var15, var16);
        var18.glVertex2i(this.field6028.field3863 + var8, var9);
        var18.glEnd();
        this.field6030.method1621(0, 5890, 768);
        this.field6030.method1636(1);
        this.field6030.method1653((class26) null);
        this.field6030.method1634(0);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)V", line = 572)
    public final void method814(int arg0, int arg1, int arg2) {
        opengl var4 = this.field6030.field3648;
        var4.glPixelTransferf(3348, 0.5F);
        var4.glPixelTransferf(3349, 0.499F);
        var4.glPixelTransferf(3352, 0.5F);
        var4.glPixelTransferf(3353, 0.499F);
        var4.glPixelTransferf(3354, 0.5F);
        var4.glPixelTransferf(3355, 0.499F);
        this.field6035 = class259.method1712(arg1, arg0, 30887, this.field6030, this.field6028.field3859, this.field6028.field3863);
        this.field6033 = arg2;
        var4.glPixelTransferf(3348, 1.0F);
        var4.glPixelTransferf(3349, 0.0F);
        var4.glPixelTransferf(3352, 1.0F);
        var4.glPixelTransferf(3353, 0.0F);
        var4.glPixelTransferf(3354, 1.0F);
        var4.glPixelTransferf(3355, 0.0F);
    }
}
