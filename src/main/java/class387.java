import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class387 extends class356 {

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "I")
    private int field5840 = 0;

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "Z")
    private boolean field5841 = false;

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "I")
    private int field5846 = 0;

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "I")
    private int field5845 = 0;

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "I")
    private int field5844 = 0;

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "I")
    private int field5843 = 0;

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "Lsq;")
    private class96 field5847;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "Ll;")
    private class14 field5842;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "Ll;")
    private class14 field5839;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "()I")
    public final int method2315() {
        return this.field5842.field199 + this.field5844 + this.field5846;
    }

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "()I")
    public final int method2325() {
        return this.field5842.field199;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(FFFFFFIII)V")
    public final void method2323(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field5841) {
            float var10 = (float) this.method2318();
            float var11 = (float) this.method2315();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field5844 * var14;
            float var17 = (float) this.field5844 * var15;
            float var18 = (float) this.field5843 * var12;
            float var19 = (float) this.field5843 * var13;
            float var20 = (float) this.field5840 * -var12;
            float var21 = (float) this.field5840 * -var13;
            float var22 = (float) this.field5846 * -var14;
            float var23 = (float) this.field5846 * -var15;
            arg0 = arg0 + var18 + var16;
            arg1 = arg1 + var19 + var17;
            arg2 = arg2 + var20 + var16;
            arg3 = arg3 + var21 + var17;
            arg4 = arg4 + var18 + var22;
            arg5 = arg5 + var19 + var23;
        }
        float var24 = arg2 + arg4 - arg0;
        float var25 = arg5 + arg3 - arg1;
        opengl var26 = this.field5847.field1156;
        this.field5842.method1980(true);
        this.field5847.method570();
        this.field5847.method688(this.field5842);
        this.field5847.method699(arg8);
        this.field5847.method691(arg6);
        var26.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        var26.glBegin(7);
        var26.glTexCoord2f(0.0F, this.field5842.field198);
        var26.glVertex2f(arg0, arg1);
        var26.glTexCoord2f(0.0F, 0.0F);
        var26.glVertex2f(arg4, arg5);
        var26.glTexCoord2f(this.field5842.field195, 0.0F);
        var26.glVertex2f(var24, var25);
        var26.glTexCoord2f(this.field5842.field195, this.field5842.field198);
        var26.glVertex2f(arg2, arg3);
        var26.glEnd();
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(FFFFFFLq;II)V")
    public final void method2322(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class245 arg6, int arg7, int arg8) {
        class14 var10 = ((class438) arg6).field6430;
        if (this.field5841) {
            float var11 = (float) this.method2318();
            float var12 = (float) this.method2315();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field5844 * var15;
            float var18 = (float) this.field5844 * var16;
            float var19 = (float) this.field5843 * var13;
            float var20 = (float) this.field5843 * var14;
            float var21 = (float) this.field5840 * -var13;
            float var22 = (float) this.field5840 * -var14;
            float var23 = (float) this.field5846 * -var15;
            float var24 = (float) this.field5846 * -var16;
            arg0 = arg0 + var19 + var17;
            arg1 = arg1 + var20 + var18;
            arg2 = arg2 + var21 + var17;
            arg3 = arg3 + var22 + var18;
            arg4 = arg4 + var19 + var23;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        opengl var27 = this.field5847.field1156;
        this.field5842.method1980(true);
        this.field5847.method570();
        this.field5847.method688(this.field5842);
        this.field5847.method691(0);
        this.field5847.method628(1);
        this.field5847.method688(var10);
        this.field5847.method680(7681, 8448);
        this.field5847.method712(0, 34168, 768);
        this.field5847.method699(1);
        float var28 = var10.field195 / (float) var10.field196;
        float var29 = var10.field198 / (float) var10.field199;
        var27.glBegin(7);
        var27.glColor3f(1.0F, 1.0F, 1.0F);
        var27.glMultiTexCoord2f(33984, 0.0F, this.field5842.field198);
        var27.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * var28, var10.field198 - (arg1 - (float) arg8) * var29);
        var27.glVertex2f(arg0, arg1);
        var27.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        var27.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * var28, var10.field198 - (arg5 - (float) arg8) * var29);
        var27.glVertex2f(arg4, arg5);
        var27.glMultiTexCoord2f(33984, this.field5842.field195, 0.0F);
        var27.glMultiTexCoord2f(33985, (var25 - (float) arg7) * var28, var10.field198 - (var26 - (float) arg8) * var29);
        var27.glVertex2f(var25, var26);
        var27.glMultiTexCoord2f(33984, this.field5842.field195, this.field5842.field198);
        var27.glMultiTexCoord2f(33985, (arg2 - (float) arg7) * var28, var10.field198 - (arg3 - (float) arg8) * var29);
        var27.glVertex2f(arg2, arg3);
        var27.glEnd();
        this.field5847.method712(0, 5890, 768);
        this.field5847.method691(1);
        this.field5847.method688((class293) null);
        this.field5847.method628(0);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIIII)V")
    public final void method420(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        opengl var8 = this.field5847.field1156;
        this.field5842.method1980(true);
        this.field5847.method570();
        this.field5847.method699(arg6);
        var8.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field5841) {
            float var9 = (float) arg2 / (float) this.method2318();
            float var10 = (float) arg3 / (float) this.method2315();
            float var11 = (float) this.field5843 * var9 + (float) arg0;
            float var12 = (float) this.field5844 * var10 + (float) arg1;
            float var13 = (float) this.field5842.field196 * var9 + var11;
            float var14 = (float) this.field5842.field199 * var10 + var12;
            if (this.field5839 == null) {
                this.field5847.method688(this.field5842);
                this.field5847.method691(arg4);
                var8.glBegin(7);
                var8.glTexCoord2f(0.0F, this.field5842.field198);
                var8.glVertex2f(var11, var12);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2f(var11, var14);
                var8.glTexCoord2f(this.field5842.field195, 0.0F);
                var8.glVertex2f(var13, var14);
                var8.glTexCoord2f(this.field5842.field195, this.field5842.field198);
                var8.glVertex2f(var13, var12);
                var8.glEnd();
            } else {
                this.method2453(arg4);
                this.field5839.method1980(true);
                var8.glBegin(7);
                var8.glMultiTexCoord2f(33985, 0.0F, this.field5842.field198);
                var8.glTexCoord2f(0.0F, this.field5842.field198);
                var8.glVertex2f(var11, var12);
                var8.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2f(var11, var14);
                var8.glMultiTexCoord2f(33985, this.field5842.field195, 0.0F);
                var8.glTexCoord2f(this.field5842.field195, 0.0F);
                var8.glVertex2f(var13, var14);
                var8.glMultiTexCoord2f(33985, this.field5842.field195, this.field5842.field198);
                var8.glTexCoord2f(this.field5842.field195, this.field5842.field198);
                var8.glVertex2f(var13, var12);
                var8.glEnd();
                this.method2452();
            }
        } else if (this.field5839 == null) {
            this.field5847.method688(this.field5842);
            this.field5847.method691(arg4);
            var8.glBegin(7);
            var8.glTexCoord2f(0.0F, this.field5842.field198);
            var8.glVertex2i(arg0, arg1);
            var8.glTexCoord2f(0.0F, 0.0F);
            var8.glVertex2i(arg0, arg1 + arg3);
            var8.glTexCoord2f(this.field5842.field195, 0.0F);
            var8.glVertex2i(arg0 + arg2, arg1 + arg3);
            var8.glTexCoord2f(this.field5842.field195, this.field5842.field198);
            var8.glVertex2i(arg0 + arg2, arg1);
            var8.glEnd();
        } else {
            this.method2453(arg4);
            this.field5839.method1980(true);
            var8.glBegin(7);
            var8.glMultiTexCoord2f(33985, 0.0F, this.field5842.field198);
            var8.glTexCoord2f(0.0F, this.field5842.field198);
            var8.glVertex2i(arg0, arg1);
            var8.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            var8.glTexCoord2f(0.0F, 0.0F);
            var8.glVertex2i(arg0, arg1 + arg3);
            var8.glMultiTexCoord2f(33985, this.field5842.field195, 0.0F);
            var8.glTexCoord2f(this.field5842.field195, 0.0F);
            var8.glVertex2i(arg0 + arg2, arg1 + arg3);
            var8.glMultiTexCoord2f(33985, this.field5842.field195, this.field5842.field198);
            var8.glTexCoord2f(this.field5842.field195, this.field5842.field198);
            var8.glVertex2i(arg0 + arg2, arg1);
            var8.glEnd();
            this.method2452();
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIII)V")
    public final void method419(int arg0, int arg1, int arg2, int arg3, int arg4) {
        opengl var6 = this.field5847.field1156;
        this.field5842.method1980(false);
        this.field5847.method570();
        this.field5847.method699(arg4);
        var6.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var7 = this.field5843 + arg0;
        int var8 = this.field5844 + arg1;
        if (this.field5839 == null) {
            this.field5847.method688(this.field5842);
            this.field5847.method691(arg2);
            var6.glBegin(7);
            var6.glTexCoord2f(0.0F, this.field5842.field198);
            var6.glVertex2i(var7, var8);
            var6.glTexCoord2f(0.0F, 0.0F);
            var6.glVertex2i(var7, this.field5842.field199 + var8);
            var6.glTexCoord2f(this.field5842.field195, 0.0F);
            var6.glVertex2i(this.field5842.field196 + var7, this.field5842.field199 + var8);
            var6.glTexCoord2f(this.field5842.field195, this.field5842.field198);
            var6.glVertex2i(this.field5842.field196 + var7, var8);
            var6.glEnd();
            return;
        }
        this.method2453(arg2);
        this.field5839.method1980(false);
        var6.glBegin(7);
        var6.glMultiTexCoord2f(33985, 0.0F, this.field5842.field198);
        var6.glTexCoord2f(0.0F, this.field5842.field198);
        var6.glVertex2i(var7, var8);
        var6.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var6.glTexCoord2f(0.0F, 0.0F);
        var6.glVertex2i(var7, this.field5842.field199 + var8);
        var6.glMultiTexCoord2f(33985, this.field5842.field195, 0.0F);
        var6.glTexCoord2f(this.field5842.field195, 0.0F);
        var6.glVertex2i(this.field5842.field196 + var7, this.field5842.field199 + var8);
        var6.glMultiTexCoord2f(33985, this.field5842.field195, this.field5842.field198);
        var6.glTexCoord2f(this.field5842.field195, this.field5842.field198);
        var6.glVertex2i(this.field5842.field196 + var7, var8);
        var6.glEnd();
        this.method2452();
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "()I")
    public final int method2318() {
        return this.field5842.field196 + this.field5843 + this.field5840;
    }

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "()V")
    private final void method2452() {
        this.field5847.method628(1);
        this.field5847.method688((class293) null);
        this.field5847.method680(8448, 8448);
        this.field5847.method712(1, 34168, 768);
        this.field5847.method658(0, 5890, 770);
        this.field5847.method628(0);
        this.field5847.method712(1, 34168, 768);
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(IIIIIII)V")
    public final void method2326(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        opengl var8 = this.field5847.field1156;
        int var9 = arg0 + arg2;
        int var10 = arg1 + arg3;
        this.field5842.method1980(false);
        this.field5847.method570();
        this.field5847.method688(this.field5842);
        this.field5847.method699(arg6);
        this.field5847.method691(arg4);
        var8.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field5842.field197 && !this.field5841) {
            float var11 = (float) arg3 * this.field5842.field198 / (float) this.field5842.field199;
            float var12 = (float) arg2 * this.field5842.field195 / (float) this.field5842.field196;
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
        var8.glTranslatef((float) this.field5843, (float) this.field5844, 0.0F);
        int var13 = this.method2318();
        int var14 = this.method2315();
        int var15 = this.field5842.field199 + arg1;
        var8.glBegin(7);
        int var16 = arg1;
        while (var15 <= var10) {
            int var17 = this.field5842.field196 + arg0;
            int var18 = arg0;
            while (var17 <= var9) {
                var8.glTexCoord2f(0.0F, this.field5842.field198);
                var8.glVertex2i(var18, var16);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2i(var18, var15);
                var8.glTexCoord2f(this.field5842.field195, 0.0F);
                var8.glVertex2i(var17, var15);
                var8.glTexCoord2f(this.field5842.field195, this.field5842.field198);
                var8.glVertex2i(var17, var16);
                var17 += var13;
                var18 += var13;
            }
            if (var18 < var9) {
                float var19 = (float) (var9 - var18) * this.field5842.field195 / (float) this.field5842.field196;
                var8.glTexCoord2f(0.0F, this.field5842.field198);
                var8.glVertex2i(var18, var16);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2i(var18, var15);
                var8.glTexCoord2f(var19, 0.0F);
                var8.glVertex2i(var9, var15);
                var8.glTexCoord2f(var19, this.field5842.field198);
                var8.glVertex2i(var9, var16);
            }
            var16 += var14;
            var15 += var14;
        }
        if (var16 < var10) {
            float var20 = (float) (this.field5842.field199 - (var10 - var16)) * this.field5842.field198 / (float) this.field5842.field199;
            int var21 = this.field5842.field196 + arg0;
            int var22 = arg0;
            while (var21 <= var9) {
                var8.glTexCoord2f(0.0F, this.field5842.field198);
                var8.glVertex2i(var22, var16);
                var8.glTexCoord2f(0.0F, var20);
                var8.glVertex2i(var22, var10);
                var8.glTexCoord2f(this.field5842.field195, var20);
                var8.glVertex2i(var21, var10);
                var8.glTexCoord2f(this.field5842.field195, this.field5842.field198);
                var8.glVertex2i(var21, var16);
                var21 += var13;
                var22 += var13;
            }
            if (var22 < var9) {
                float var23 = (float) (var9 - var22) * this.field5842.field195 / (float) this.field5842.field196;
                var8.glTexCoord2f(0.0F, this.field5842.field198);
                var8.glVertex2i(var22, var16);
                var8.glTexCoord2f(0.0F, var20);
                var8.glVertex2i(var22, var10);
                var8.glTexCoord2f(var23, var20);
                var8.glVertex2i(var9, var10);
                var8.glTexCoord2f(var23, this.field5842.field198);
                var8.glVertex2i(var9, var16);
            }
        }
        var8.glEnd();
        var8.glPopMatrix();
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V")
    private final void method2453(int arg0) {
        this.field5847.method628(1);
        this.field5847.method688(this.field5842);
        this.field5847.method680(this.field5847.method650(arg0), 7681);
        this.field5847.method712(1, 34167, 768);
        this.field5847.method658(0, 34168, 770);
        this.field5847.method628(0);
        this.field5847.method688(this.field5839);
        this.field5847.method680(34479, 7681);
        this.field5847.method712(1, 34166, 768);
        if (this.field5845 == 0) {
            this.field5847.method593(1.0F, 0.5F, 0.5F, 0.0F);
        } else if (this.field5845 == 1) {
            this.field5847.method593(0.5F, 1.0F, 0.5F, 0.0F);
        } else if (this.field5845 == 2) {
            this.field5847.method593(0.5F, 0.5F, 1.0F, 0.0F);
        } else if (this.field5845 == 3) {
            this.field5847.method593(128.5F, 128.5F, 128.5F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IILq;II)V")
    public final void method418(int arg0, int arg1, class245 arg2, int arg3, int arg4) {
        class438 var6 = (class438) arg2;
        class14 var7 = var6.field6430;
        this.field5842.method1980(false);
        this.field5847.method570();
        this.field5847.method688(this.field5842);
        this.field5847.method691(0);
        this.field5847.method628(1);
        this.field5847.method688(var7);
        this.field5847.method680(7681, 8448);
        this.field5847.method712(0, 34168, 768);
        this.field5847.method699(1);
        int var8 = this.field5843 + arg0;
        int var9 = this.field5844 + arg1;
        int var10 = this.field5842.field196 + var8;
        int var11 = this.field5842.field199 + var9;
        float var12 = var7.field195 / (float) var7.field196;
        float var13 = var7.field198 / (float) var7.field199;
        float var14 = (float) (var8 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field198 - (float) (var9 - arg4) * var13;
        float var17 = var7.field198 - (float) (var11 - arg4) * var13;
        opengl var18 = this.field5847.field1156;
        var18.glBegin(7);
        var18.glColor3f(1.0F, 1.0F, 1.0F);
        var18.glMultiTexCoord2f(33984, 0.0F, this.field5842.field198);
        var18.glMultiTexCoord2f(33985, var14, var16);
        var18.glVertex2i(var8, var9);
        var18.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        var18.glMultiTexCoord2f(33985, var14, var17);
        var18.glVertex2i(var8, this.field5842.field199 + var9);
        var18.glMultiTexCoord2f(33984, this.field5842.field195, 0.0F);
        var18.glMultiTexCoord2f(33985, var15, var17);
        var18.glVertex2i(this.field5842.field196 + var8, this.field5842.field199 + var9);
        var18.glMultiTexCoord2f(33984, this.field5842.field195, this.field5842.field198);
        var18.glMultiTexCoord2f(33985, var15, var16);
        var18.glVertex2i(this.field5842.field196 + var8, var9);
        var18.glEnd();
        this.field5847.method712(0, 5890, 768);
        this.field5847.method691(1);
        this.field5847.method688((class293) null);
        this.field5847.method628(0);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(III)V")
    public final void method417(int arg0, int arg1, int arg2) {
        opengl var4 = this.field5847.field1156;
        var4.glPixelTransferf(3348, 0.5F);
        var4.glPixelTransferf(3349, 0.499F);
        var4.glPixelTransferf(3352, 0.5F);
        var4.glPixelTransferf(3353, 0.499F);
        var4.glPixelTransferf(3354, 0.5F);
        var4.glPixelTransferf(3355, 0.499F);
        this.field5839 = class14.method125(this.field5842.field199, (byte) -46, arg1, arg0, this.field5847, this.field5842.field196);
        this.field5845 = arg2;
        var4.glPixelTransferf(3348, 1.0F);
        var4.glPixelTransferf(3349, 0.0F);
        var4.glPixelTransferf(3352, 1.0F);
        var4.glPixelTransferf(3353, 0.0F);
        var4.glPixelTransferf(3354, 1.0F);
        var4.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "()I")
    public final int method2324() {
        return this.field5842.field196;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIII)V")
    public final void method421(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field5842.method2308(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(IIII)V")
    public final void method2321(int arg0, int arg1, int arg2, int arg3) {
        this.field5843 = arg0;
        this.field5844 = arg1;
        this.field5840 = arg2;
        this.field5846 = arg3;
        this.field5841 = this.field5843 != 0 || this.field5844 != 0 || this.field5840 != 0 || this.field5846 != 0;
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lsq;IIII)V")
    public class387(class96 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5847 = arg0;
        this.field5842 = class14.method125(arg4, (byte) -64, arg2, arg1, arg0, arg3);
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lsq;II[III)V")
    public class387(class96 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field5847 = arg0;
        this.field5842 = class14.method126(84, arg3, false, arg1, arg0, arg2);
    }
}
