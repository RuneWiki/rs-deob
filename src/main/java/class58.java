import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class58 extends class67 {

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    private int field783 = 0;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "Z")
    private boolean field786 = false;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    private int field790 = 0;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    private int field789 = 0;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    private int field791 = 0;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    private int field785 = 0;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "Lnf;")
    private class256 field784;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "Ldh;")
    private class190 field788;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "Ldh;")
    private class190 field787;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "()I")
    public final int method398() {
        return this.field788.field2556;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
    private final void method399(int arg0) {
        this.field784.method1777(1);
        this.field784.method1669(this.field788);
        this.field784.method1627(this.field784.method1778(arg0), 7681);
        this.field784.method1634(1, 34167, 768);
        this.field784.method1763(0, 34168, 770);
        this.field784.method1777(0);
        this.field784.method1669(this.field787);
        this.field784.method1627(34479, 7681);
        this.field784.method1634(1, 34166, 768);
        if (this.field790 == 0) {
            this.field784.method1661(1.0F, 0.5F, 0.5F, 0.0F);
        } else if (this.field790 == 1) {
            this.field784.method1661(0.5F, 1.0F, 0.5F, 0.0F);
        } else if (this.field790 == 2) {
            this.field784.method1661(0.5F, 0.5F, 1.0F, 0.0F);
        } else if (this.field790 == 3) {
            this.field784.method1661(128.5F, 128.5F, 128.5F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "()V")
    private final void method400() {
        this.field784.method1777(1);
        this.field784.method1669((class360) null);
        this.field784.method1627(8448, 8448);
        this.field784.method1634(1, 34168, 768);
        this.field784.method1763(0, 5890, 770);
        this.field784.method1777(0);
        this.field784.method1634(1, 34168, 768);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)V")
    public final void method401(int arg0, int arg1, int arg2) {
        opengl var4 = this.field784.field3634;
        var4.glPixelTransferf(3348, 0.5F);
        var4.glPixelTransferf(3349, 0.499F);
        var4.glPixelTransferf(3352, 0.5F);
        var4.glPixelTransferf(3353, 0.499F);
        var4.glPixelTransferf(3354, 0.5F);
        var4.glPixelTransferf(3355, 0.499F);
        this.field787 = class190.method1149(this.field788.field2555, arg0, 105, arg1, this.field788.field2556, this.field784);
        this.field790 = arg2;
        var4.glPixelTransferf(3348, 1.0F);
        var4.glPixelTransferf(3349, 0.0F);
        var4.glPixelTransferf(3352, 1.0F);
        var4.glPixelTransferf(3353, 0.0F);
        var4.glPixelTransferf(3354, 1.0F);
        var4.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIIII)V")
    public final void method402(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        opengl var8 = this.field784.field3634;
        this.field788.method2351(true);
        this.field784.method1672();
        this.field784.method1701(arg6);
        var8.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field786) {
            float var9 = (float) arg2 / (float) this.method411();
            float var10 = (float) arg3 / (float) this.method409();
            float var11 = (float) this.field785 * var9 + (float) arg0;
            float var12 = (float) this.field789 * var10 + (float) arg1;
            float var13 = (float) this.field788.field2555 * var9 + var11;
            float var14 = (float) this.field788.field2556 * var10 + var12;
            if (this.field787 == null) {
                this.field784.method1669(this.field788);
                this.field784.method1745(arg4);
                var8.glBegin(7);
                var8.glTexCoord2f(0.0F, this.field788.field2553);
                var8.glVertex2f(var11, var12);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2f(var11, var14);
                var8.glTexCoord2f(this.field788.field2552, 0.0F);
                var8.glVertex2f(var13, var14);
                var8.glTexCoord2f(this.field788.field2552, this.field788.field2553);
                var8.glVertex2f(var13, var12);
                var8.glEnd();
            } else {
                this.method399(arg4);
                this.field787.method2351(true);
                var8.glBegin(7);
                var8.glMultiTexCoord2f(33985, 0.0F, this.field788.field2553);
                var8.glTexCoord2f(0.0F, this.field788.field2553);
                var8.glVertex2f(var11, var12);
                var8.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2f(var11, var14);
                var8.glMultiTexCoord2f(33985, this.field788.field2552, 0.0F);
                var8.glTexCoord2f(this.field788.field2552, 0.0F);
                var8.glVertex2f(var13, var14);
                var8.glMultiTexCoord2f(33985, this.field788.field2552, this.field788.field2553);
                var8.glTexCoord2f(this.field788.field2552, this.field788.field2553);
                var8.glVertex2f(var13, var12);
                var8.glEnd();
                this.method400();
            }
        } else if (this.field787 == null) {
            this.field784.method1669(this.field788);
            this.field784.method1745(arg4);
            var8.glBegin(7);
            var8.glTexCoord2f(0.0F, this.field788.field2553);
            var8.glVertex2i(arg0, arg1);
            var8.glTexCoord2f(0.0F, 0.0F);
            var8.glVertex2i(arg0, arg1 + arg3);
            var8.glTexCoord2f(this.field788.field2552, 0.0F);
            var8.glVertex2i(arg0 + arg2, arg1 + arg3);
            var8.glTexCoord2f(this.field788.field2552, this.field788.field2553);
            var8.glVertex2i(arg0 + arg2, arg1);
            var8.glEnd();
        } else {
            this.method399(arg4);
            this.field787.method2351(true);
            var8.glBegin(7);
            var8.glMultiTexCoord2f(33985, 0.0F, this.field788.field2553);
            var8.glTexCoord2f(0.0F, this.field788.field2553);
            var8.glVertex2i(arg0, arg1);
            var8.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            var8.glTexCoord2f(0.0F, 0.0F);
            var8.glVertex2i(arg0, arg1 + arg3);
            var8.glMultiTexCoord2f(33985, this.field788.field2552, 0.0F);
            var8.glTexCoord2f(this.field788.field2552, 0.0F);
            var8.glVertex2i(arg0 + arg2, arg1 + arg3);
            var8.glMultiTexCoord2f(33985, this.field788.field2552, this.field788.field2553);
            var8.glTexCoord2f(this.field788.field2552, this.field788.field2553);
            var8.glVertex2i(arg0 + arg2, arg1);
            var8.glEnd();
            this.method400();
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IILud;II)V")
    public final void method403(int arg0, int arg1, class2 arg2, int arg3, int arg4) {
        class176 var6 = (class176) arg2;
        class190 var7 = var6.field2335;
        this.field788.method2351(false);
        this.field784.method1672();
        this.field784.method1669(this.field788);
        this.field784.method1745(0);
        this.field784.method1777(1);
        this.field784.method1669(var7);
        this.field784.method1627(7681, 8448);
        this.field784.method1634(0, 34168, 768);
        this.field784.method1701(1);
        int var8 = this.field785 + arg0;
        int var9 = this.field789 + arg1;
        int var10 = this.field788.field2555 + var8;
        int var11 = this.field788.field2556 + var9;
        float var12 = var7.field2552 / (float) var7.field2555;
        float var13 = var7.field2553 / (float) var7.field2556;
        float var14 = (float) (var8 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field2553 - (float) (var9 - arg4) * var13;
        float var17 = var7.field2553 - (float) (var11 - arg4) * var13;
        opengl var18 = this.field784.field3634;
        var18.glBegin(7);
        var18.glColor3f(1.0F, 1.0F, 1.0F);
        var18.glMultiTexCoord2f(33984, 0.0F, this.field788.field2553);
        var18.glMultiTexCoord2f(33985, var14, var16);
        var18.glVertex2i(var8, var9);
        var18.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        var18.glMultiTexCoord2f(33985, var14, var17);
        var18.glVertex2i(var8, this.field788.field2556 + var9);
        var18.glMultiTexCoord2f(33984, this.field788.field2552, 0.0F);
        var18.glMultiTexCoord2f(33985, var15, var17);
        var18.glVertex2i(this.field788.field2555 + var8, this.field788.field2556 + var9);
        var18.glMultiTexCoord2f(33984, this.field788.field2552, this.field788.field2553);
        var18.glMultiTexCoord2f(33985, var15, var16);
        var18.glVertex2i(this.field788.field2555 + var8, var9);
        var18.glEnd();
        this.field784.method1634(0, 5890, 768);
        this.field784.method1745(1);
        this.field784.method1669((class360) null);
        this.field784.method1777(0);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(FFFFFFLud;II)V")
    public final void method404(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class2 arg6, int arg7, int arg8) {
        class190 var10 = ((class176) arg6).field2335;
        if (this.field786) {
            float var11 = (float) this.method411();
            float var12 = (float) this.method409();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field789 * var15;
            float var18 = (float) this.field789 * var16;
            float var19 = (float) this.field785 * var13;
            float var20 = (float) this.field785 * var14;
            float var21 = (float) this.field791 * -var13;
            float var22 = (float) this.field791 * -var14;
            float var23 = (float) this.field783 * -var15;
            float var24 = (float) this.field783 * -var16;
            arg0 = arg0 + var19 + var17;
            arg1 = arg1 + var20 + var18;
            arg2 = arg2 + var21 + var17;
            arg3 = arg3 + var22 + var18;
            arg4 = arg4 + var19 + var23;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        opengl var27 = this.field784.field3634;
        this.field788.method2351(true);
        this.field784.method1672();
        this.field784.method1669(this.field788);
        this.field784.method1745(0);
        this.field784.method1777(1);
        this.field784.method1669(var10);
        this.field784.method1627(7681, 8448);
        this.field784.method1634(0, 34168, 768);
        this.field784.method1701(1);
        float var28 = var10.field2552 / (float) var10.field2555;
        float var29 = var10.field2553 / (float) var10.field2556;
        var27.glBegin(7);
        var27.glColor3f(1.0F, 1.0F, 1.0F);
        var27.glMultiTexCoord2f(33984, 0.0F, this.field788.field2553);
        var27.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * var28, var10.field2553 - (arg1 - (float) arg8) * var29);
        var27.glVertex2f(arg0, arg1);
        var27.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        var27.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * var28, var10.field2553 - (arg5 - (float) arg8) * var29);
        var27.glVertex2f(arg4, arg5);
        var27.glMultiTexCoord2f(33984, this.field788.field2552, 0.0F);
        var27.glMultiTexCoord2f(33985, (var25 - (float) arg7) * var28, var10.field2553 - (var26 - (float) arg8) * var29);
        var27.glVertex2f(var25, var26);
        var27.glMultiTexCoord2f(33984, this.field788.field2552, this.field788.field2553);
        var27.glMultiTexCoord2f(33985, (arg2 - (float) arg7) * var28, var10.field2553 - (arg3 - (float) arg8) * var29);
        var27.glVertex2f(arg2, arg3);
        var27.glEnd();
        this.field784.method1634(0, 5890, 768);
        this.field784.method1745(1);
        this.field784.method1669((class360) null);
        this.field784.method1777(0);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIII)V")
    public final void method405(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field788.method1272(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(FFFFFFIII)V")
    public final void method406(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field786) {
            float var10 = (float) this.method411();
            float var11 = (float) this.method409();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field789 * var14;
            float var17 = (float) this.field789 * var15;
            float var18 = (float) this.field785 * var12;
            float var19 = (float) this.field785 * var13;
            float var20 = (float) this.field791 * -var12;
            float var21 = (float) this.field791 * -var13;
            float var22 = (float) this.field783 * -var14;
            float var23 = (float) this.field783 * -var15;
            arg0 = arg0 + var18 + var16;
            arg1 = arg1 + var19 + var17;
            arg2 = arg2 + var20 + var16;
            arg3 = arg3 + var21 + var17;
            arg4 = arg4 + var18 + var22;
            arg5 = arg5 + var19 + var23;
        }
        float var24 = arg2 + arg4 - arg0;
        float var25 = arg5 + arg3 - arg1;
        opengl var26 = this.field784.field3634;
        this.field788.method2351(true);
        this.field784.method1672();
        this.field784.method1669(this.field788);
        this.field784.method1701(arg8);
        this.field784.method1745(arg6);
        var26.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        var26.glBegin(7);
        var26.glTexCoord2f(0.0F, this.field788.field2553);
        var26.glVertex2f(arg0, arg1);
        var26.glTexCoord2f(0.0F, 0.0F);
        var26.glVertex2f(arg4, arg5);
        var26.glTexCoord2f(this.field788.field2552, 0.0F);
        var26.glVertex2f(var24, var25);
        var26.glTexCoord2f(this.field788.field2552, this.field788.field2553);
        var26.glVertex2f(arg2, arg3);
        var26.glEnd();
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIII)V")
    public final void method407(int arg0, int arg1, int arg2, int arg3, int arg4) {
        opengl var6 = this.field784.field3634;
        this.field788.method2351(false);
        this.field784.method1672();
        this.field784.method1701(arg4);
        var6.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var7 = this.field785 + arg0;
        int var8 = this.field789 + arg1;
        if (this.field787 == null) {
            this.field784.method1669(this.field788);
            this.field784.method1745(arg2);
            var6.glBegin(7);
            var6.glTexCoord2f(0.0F, this.field788.field2553);
            var6.glVertex2i(var7, var8);
            var6.glTexCoord2f(0.0F, 0.0F);
            var6.glVertex2i(var7, this.field788.field2556 + var8);
            var6.glTexCoord2f(this.field788.field2552, 0.0F);
            var6.glVertex2i(this.field788.field2555 + var7, this.field788.field2556 + var8);
            var6.glTexCoord2f(this.field788.field2552, this.field788.field2553);
            var6.glVertex2i(this.field788.field2555 + var7, var8);
            var6.glEnd();
            return;
        }
        this.method399(arg2);
        this.field787.method2351(false);
        var6.glBegin(7);
        var6.glMultiTexCoord2f(33985, 0.0F, this.field788.field2553);
        var6.glTexCoord2f(0.0F, this.field788.field2553);
        var6.glVertex2i(var7, var8);
        var6.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var6.glTexCoord2f(0.0F, 0.0F);
        var6.glVertex2i(var7, this.field788.field2556 + var8);
        var6.glMultiTexCoord2f(33985, this.field788.field2552, 0.0F);
        var6.glTexCoord2f(this.field788.field2552, 0.0F);
        var6.glVertex2i(this.field788.field2555 + var7, this.field788.field2556 + var8);
        var6.glMultiTexCoord2f(33985, this.field788.field2552, this.field788.field2553);
        var6.glTexCoord2f(this.field788.field2552, this.field788.field2553);
        var6.glVertex2i(this.field788.field2555 + var7, var8);
        var6.glEnd();
        this.method400();
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "()I")
    public final int method408() {
        return this.field788.field2555;
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "()I")
    public final int method409() {
        return this.field788.field2556 + this.field789 + this.field783;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIII)V")
    public final void method410(int arg0, int arg1, int arg2, int arg3) {
        this.field785 = arg0;
        this.field789 = arg1;
        this.field791 = arg2;
        this.field783 = arg3;
        this.field786 = this.field785 != 0 || this.field789 != 0 || this.field791 != 0 || this.field783 != 0;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "()I")
    public final int method411() {
        return this.field788.field2555 + this.field785 + this.field791;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(IIIIIII)V")
    public final void method412(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        opengl var8 = this.field784.field3634;
        int var9 = arg0 + arg2;
        int var10 = arg1 + arg3;
        this.field788.method2351(false);
        this.field784.method1672();
        this.field784.method1669(this.field788);
        this.field784.method1701(arg6);
        this.field784.method1745(arg4);
        var8.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field788.field2554 && !this.field786) {
            float var11 = (float) arg3 * this.field788.field2553 / (float) this.field788.field2556;
            float var12 = (float) arg2 * this.field788.field2552 / (float) this.field788.field2555;
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
        var8.glTranslatef((float) this.field785, (float) this.field789, 0.0F);
        int var13 = this.method411();
        int var14 = this.method409();
        int var15 = this.field788.field2556 + arg1;
        var8.glBegin(7);
        int var16 = arg1;
        while (var15 <= var10) {
            int var17 = this.field788.field2555 + arg0;
            int var18 = arg0;
            while (var17 <= var9) {
                var8.glTexCoord2f(0.0F, this.field788.field2553);
                var8.glVertex2i(var18, var16);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2i(var18, var15);
                var8.glTexCoord2f(this.field788.field2552, 0.0F);
                var8.glVertex2i(var17, var15);
                var8.glTexCoord2f(this.field788.field2552, this.field788.field2553);
                var8.glVertex2i(var17, var16);
                var17 += var13;
                var18 += var13;
            }
            if (var18 < var9) {
                float var19 = (float) (var9 - var18) * this.field788.field2552 / (float) this.field788.field2555;
                var8.glTexCoord2f(0.0F, this.field788.field2553);
                var8.glVertex2i(var18, var16);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2i(var18, var15);
                var8.glTexCoord2f(var19, 0.0F);
                var8.glVertex2i(var9, var15);
                var8.glTexCoord2f(var19, this.field788.field2553);
                var8.glVertex2i(var9, var16);
            }
            var16 += var14;
            var15 += var14;
        }
        if (var16 < var10) {
            float var20 = (float) (this.field788.field2556 - (var10 - var16)) * this.field788.field2553 / (float) this.field788.field2556;
            int var21 = this.field788.field2555 + arg0;
            int var22 = arg0;
            while (var21 <= var9) {
                var8.glTexCoord2f(0.0F, this.field788.field2553);
                var8.glVertex2i(var22, var16);
                var8.glTexCoord2f(0.0F, var20);
                var8.glVertex2i(var22, var10);
                var8.glTexCoord2f(this.field788.field2552, var20);
                var8.glVertex2i(var21, var10);
                var8.glTexCoord2f(this.field788.field2552, this.field788.field2553);
                var8.glVertex2i(var21, var16);
                var21 += var13;
                var22 += var13;
            }
            if (var22 < var9) {
                float var23 = (float) (var9 - var22) * this.field788.field2552 / (float) this.field788.field2555;
                var8.glTexCoord2f(0.0F, this.field788.field2553);
                var8.glVertex2i(var22, var16);
                var8.glTexCoord2f(0.0F, var20);
                var8.glVertex2i(var22, var10);
                var8.glTexCoord2f(var23, var20);
                var8.glVertex2i(var9, var10);
                var8.glTexCoord2f(var23, this.field788.field2553);
                var8.glVertex2i(var9, var16);
            }
        }
        var8.glEnd();
        var8.glPopMatrix();
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lnf;IIII)V")
    public class58(class256 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field784 = arg0;
        this.field788 = class190.method1149(arg3, arg1, 121, arg2, arg4, arg0);
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lnf;II[III)V")
    public class58(class256 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field784 = arg0;
        this.field788 = class190.method1150(arg2, arg1, arg3, false, (byte) -113, arg0);
    }
}
