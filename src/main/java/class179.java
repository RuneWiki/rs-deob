import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class179 extends class226 {

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "Z")
    private boolean field2461 = false;

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "I")
    private int field2462 = 0;

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "I")
    private int field2460 = 0;

    @OriginalMember(owner = "client!hp", name = "h", descriptor = "I")
    private int field2466 = 0;

    @OriginalMember(owner = "client!hp", name = "e", descriptor = "I")
    private int field2463 = 0;

    @OriginalMember(owner = "client!hp", name = "g", descriptor = "I")
    private int field2465 = 0;

    @OriginalMember(owner = "client!hp", name = "f", descriptor = "Ltb;")
    private class227 field2464;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "Lkf;")
    private class137 field2459;

    @OriginalMember(owner = "client!hp", name = "i", descriptor = "Lkf;")
    private class137 field2467;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(III)V", line = 4)
    public final void method591(int arg0, int arg1, int arg2) {
        opengl var4 = this.field2464.field3184;
        var4.glPixelTransferf(3348, 0.5F);
        var4.glPixelTransferf(3349, 0.499F);
        var4.glPixelTransferf(3352, 0.5F);
        var4.glPixelTransferf(3353, 0.499F);
        var4.glPixelTransferf(3354, 0.5F);
        var4.glPixelTransferf(3355, 0.499F);
        this.field2467 = class137.method947(this.field2459.field1977, arg1, -5252, this.field2464, this.field2459.field1974, arg0);
        this.field2466 = arg2;
        var4.glPixelTransferf(3348, 1.0F);
        var4.glPixelTransferf(3349, 0.0F);
        var4.glPixelTransferf(3352, 1.0F);
        var4.glPixelTransferf(3353, 0.0F);
        var4.glPixelTransferf(3354, 1.0F);
        var4.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIIII)V", line = 24)
    public final void method587(int arg0, int arg1, int arg2, int arg3, int arg4) {
        opengl var6 = this.field2464.field3184;
        this.field2459.method868(false);
        this.field2464.method1511();
        this.field2464.method1510(arg4);
        var6.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var7 = this.field2463 + arg0;
        int var8 = this.field2462 + arg1;
        if (this.field2467 == null) {
            this.field2464.method1559(this.field2459);
            this.field2464.method1569(arg2);
            var6.glBegin(7);
            var6.glTexCoord2f(0.0F, this.field2459.field1975);
            var6.glVertex2i(var7, var8);
            var6.glTexCoord2f(0.0F, 0.0F);
            var6.glVertex2i(var7, this.field2459.field1977 + var8);
            var6.glTexCoord2f(this.field2459.field1976, 0.0F);
            var6.glVertex2i(this.field2459.field1974 + var7, this.field2459.field1977 + var8);
            var6.glTexCoord2f(this.field2459.field1976, this.field2459.field1975);
            var6.glVertex2i(this.field2459.field1974 + var7, var8);
            var6.glEnd();
            return;
        }
        this.method1174(arg2);
        this.field2467.method868(false);
        var6.glBegin(7);
        var6.glMultiTexCoord2f(33985, 0.0F, this.field2459.field1975);
        var6.glTexCoord2f(0.0F, this.field2459.field1975);
        var6.glVertex2i(var7, var8);
        var6.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var6.glTexCoord2f(0.0F, 0.0F);
        var6.glVertex2i(var7, this.field2459.field1977 + var8);
        var6.glMultiTexCoord2f(33985, this.field2459.field1976, 0.0F);
        var6.glTexCoord2f(this.field2459.field1976, 0.0F);
        var6.glVertex2i(this.field2459.field1974 + var7, this.field2459.field1977 + var8);
        var6.glMultiTexCoord2f(33985, this.field2459.field1976, this.field2459.field1975);
        var6.glTexCoord2f(this.field2459.field1976, this.field2459.field1975);
        var6.glVertex2i(this.field2459.field1974 + var7, var8);
        var6.glEnd();
        this.method1175();
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIIIII)V", line = 74)
    public final void method590(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2459.method2170(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "()I", line = 77)
    public final int method600() {
        return this.field2459.field1974;
    }

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(IIIIIII)V", line = 82)
    public final void method593(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        opengl var8 = this.field2464.field3184;
        int var9 = arg0 + arg2;
        int var10 = arg1 + arg3;
        this.field2459.method868(false);
        this.field2464.method1511();
        this.field2464.method1559(this.field2459);
        this.field2464.method1510(arg6);
        this.field2464.method1569(arg4);
        var8.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field2459.field1973 && !this.field2461) {
            float var11 = (float) arg3 * this.field2459.field1975 / (float) this.field2459.field1977;
            float var12 = (float) arg2 * this.field2459.field1976 / (float) this.field2459.field1974;
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
        var8.glTranslatef((float) this.field2463, (float) this.field2462, 0.0F);
        int var13 = this.method597();
        int var14 = this.method596();
        int var15 = this.field2459.field1977 + arg1;
        var8.glBegin(7);
        int var16 = arg1;
        while (var15 <= var10) {
            int var17 = this.field2459.field1974 + arg0;
            int var18 = arg0;
            while (var17 <= var9) {
                var8.glTexCoord2f(0.0F, this.field2459.field1975);
                var8.glVertex2i(var18, var16);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2i(var18, var15);
                var8.glTexCoord2f(this.field2459.field1976, 0.0F);
                var8.glVertex2i(var17, var15);
                var8.glTexCoord2f(this.field2459.field1976, this.field2459.field1975);
                var8.glVertex2i(var17, var16);
                var17 += var13;
                var18 += var13;
            }
            if (var18 < var9) {
                float var19 = (float) (var9 - var18) * this.field2459.field1976 / (float) this.field2459.field1974;
                var8.glTexCoord2f(0.0F, this.field2459.field1975);
                var8.glVertex2i(var18, var16);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2i(var18, var15);
                var8.glTexCoord2f(var19, 0.0F);
                var8.glVertex2i(var9, var15);
                var8.glTexCoord2f(var19, this.field2459.field1975);
                var8.glVertex2i(var9, var16);
            }
            var16 += var14;
            var15 += var14;
        }
        if (var16 < var10) {
            float var20 = (float) (this.field2459.field1977 - (var10 - var16)) * this.field2459.field1975 / (float) this.field2459.field1977;
            int var21 = this.field2459.field1974 + arg0;
            int var22 = arg0;
            while (var21 <= var9) {
                var8.glTexCoord2f(0.0F, this.field2459.field1975);
                var8.glVertex2i(var22, var16);
                var8.glTexCoord2f(0.0F, var20);
                var8.glVertex2i(var22, var10);
                var8.glTexCoord2f(this.field2459.field1976, var20);
                var8.glVertex2i(var21, var10);
                var8.glTexCoord2f(this.field2459.field1976, this.field2459.field1975);
                var8.glVertex2i(var21, var16);
                var21 += var13;
                var22 += var13;
            }
            if (var22 < var9) {
                float var23 = (float) (var9 - var22) * this.field2459.field1976 / (float) this.field2459.field1974;
                var8.glTexCoord2f(0.0F, this.field2459.field1975);
                var8.glVertex2i(var22, var16);
                var8.glTexCoord2f(0.0F, var20);
                var8.glVertex2i(var22, var10);
                var8.glTexCoord2f(var23, var20);
                var8.glVertex2i(var9, var10);
                var8.glTexCoord2f(var23, this.field2459.field1975);
                var8.glVertex2i(var9, var16);
            }
        }
        var8.glEnd();
        var8.glPopMatrix();
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V", line = 213)
    private final void method1174(int arg0) {
        this.field2464.method1566(1);
        this.field2464.method1559(this.field2459);
        this.field2464.method1542(this.field2464.method1525(arg0), 7681);
        this.field2464.method1512(1, 34167, 768);
        this.field2464.method1572(0, 34168, 770);
        this.field2464.method1566(0);
        this.field2464.method1559(this.field2467);
        this.field2464.method1542(34479, 7681);
        this.field2464.method1512(1, 34166, 768);
        if (this.field2466 == 0) {
            this.field2464.method1561(1.0F, 0.5F, 0.5F, 0.0F);
        } else if (this.field2466 == 1) {
            this.field2464.method1561(0.5F, 1.0F, 0.5F, 0.0F);
        } else if (this.field2466 == 2) {
            this.field2464.method1561(0.5F, 0.5F, 1.0F, 0.0F);
        } else if (this.field2466 == 3) {
            this.field2464.method1561(128.5F, 128.5F, 128.5F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IILep;II)V", line = 241)
    public final void method585(int arg0, int arg1, class241 arg2, int arg3, int arg4) {
        class234 var6 = (class234) arg2;
        class137 var7 = var6.field3353;
        this.field2459.method868(false);
        this.field2464.method1511();
        this.field2464.method1559(this.field2459);
        this.field2464.method1569(0);
        this.field2464.method1566(1);
        this.field2464.method1559(var7);
        this.field2464.method1542(7681, 8448);
        this.field2464.method1512(0, 34168, 768);
        this.field2464.method1510(1);
        int var8 = this.field2463 + arg0;
        int var9 = this.field2462 + arg1;
        int var10 = this.field2459.field1974 + var8;
        int var11 = this.field2459.field1977 + var9;
        float var12 = var7.field1976 / (float) var7.field1974;
        float var13 = var7.field1975 / (float) var7.field1977;
        float var14 = (float) (var8 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field1975 - (float) (var9 - arg4) * var13;
        float var17 = var7.field1975 - (float) (var11 - arg4) * var13;
        opengl var18 = this.field2464.field3184;
        var18.glBegin(7);
        var18.glColor3f(1.0F, 1.0F, 1.0F);
        var18.glMultiTexCoord2f(33984, 0.0F, this.field2459.field1975);
        var18.glMultiTexCoord2f(33985, var14, var16);
        var18.glVertex2i(var8, var9);
        var18.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        var18.glMultiTexCoord2f(33985, var14, var17);
        var18.glVertex2i(var8, this.field2459.field1977 + var9);
        var18.glMultiTexCoord2f(33984, this.field2459.field1976, 0.0F);
        var18.glMultiTexCoord2f(33985, var15, var17);
        var18.glVertex2i(this.field2459.field1974 + var8, this.field2459.field1977 + var9);
        var18.glMultiTexCoord2f(33984, this.field2459.field1976, this.field2459.field1975);
        var18.glMultiTexCoord2f(33985, var15, var16);
        var18.glVertex2i(this.field2459.field1974 + var8, var9);
        var18.glEnd();
        this.field2464.method1512(0, 5890, 768);
        this.field2464.method1569(1);
        this.field2464.method1559((class127) null);
        this.field2464.method1566(0);
    }

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(IIII)V", line = 297)
    public final void method595(int arg0, int arg1, int arg2, int arg3) {
        this.field2463 = arg0;
        this.field2462 = arg1;
        this.field2465 = arg2;
        this.field2460 = arg3;
        this.field2461 = this.field2463 != 0 || this.field2462 != 0 || this.field2465 != 0 || this.field2460 != 0;
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Ltb;IIII)V", line = 594)
    public class179(class227 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2464 = arg0;
        this.field2459 = class137.method947(arg4, arg2, -5252, arg0, arg3, arg1);
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Ltb;II[III)V", line = 600)
    public class179(class227 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field2464 = arg0;
        this.field2459 = class137.method948(arg1, false, arg3, arg2, arg0, 34037);
    }

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "()I", line = 310)
    public final int method598() {
        return this.field2459.field1977;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(FFFFFFLep;II)V", line = 327)
    public final void method592(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class241 arg6, int arg7, int arg8) {
        class137 var10 = ((class234) arg6).field3353;
        if (this.field2461) {
            float var11 = (float) this.method597();
            float var12 = (float) this.method596();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field2462 * var15;
            float var18 = (float) this.field2462 * var16;
            float var19 = (float) this.field2463 * var13;
            float var20 = (float) this.field2463 * var14;
            float var21 = (float) this.field2465 * -var13;
            float var22 = (float) this.field2465 * -var14;
            float var23 = (float) this.field2460 * -var15;
            float var24 = (float) this.field2460 * -var16;
            arg0 = arg0 + var19 + var17;
            arg1 = arg1 + var20 + var18;
            arg2 = arg2 + var21 + var17;
            arg3 = arg3 + var22 + var18;
            arg4 = arg4 + var19 + var23;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        opengl var27 = this.field2464.field3184;
        this.field2459.method868(true);
        this.field2464.method1511();
        this.field2464.method1559(this.field2459);
        this.field2464.method1569(0);
        this.field2464.method1566(1);
        this.field2464.method1559(var10);
        this.field2464.method1542(7681, 8448);
        this.field2464.method1512(0, 34168, 768);
        this.field2464.method1510(1);
        float var28 = var10.field1976 / (float) var10.field1974;
        float var29 = var10.field1975 / (float) var10.field1977;
        var27.glBegin(7);
        var27.glColor3f(1.0F, 1.0F, 1.0F);
        var27.glMultiTexCoord2f(33984, 0.0F, this.field2459.field1975);
        var27.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * var28, var10.field1975 - (arg1 - (float) arg8) * var29);
        var27.glVertex2f(arg0, arg1);
        var27.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        var27.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * var28, var10.field1975 - (arg5 - (float) arg8) * var29);
        var27.glVertex2f(arg4, arg5);
        var27.glMultiTexCoord2f(33984, this.field2459.field1976, 0.0F);
        var27.glMultiTexCoord2f(33985, (var25 - (float) arg7) * var28, var10.field1975 - (var26 - (float) arg8) * var29);
        var27.glVertex2f(var25, var26);
        var27.glMultiTexCoord2f(33984, this.field2459.field1976, this.field2459.field1975);
        var27.glMultiTexCoord2f(33985, (arg2 - (float) arg7) * var28, var10.field1975 - (arg3 - (float) arg8) * var29);
        var27.glVertex2f(arg2, arg3);
        var27.glEnd();
        this.field2464.method1512(0, 5890, 768);
        this.field2464.method1569(1);
        this.field2464.method1559((class127) null);
        this.field2464.method1566(0);
    }

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "()I", line = 409)
    public final int method596() {
        return this.field2459.field1977 + this.field2462 + this.field2460;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIIIIII)V", line = 413)
    public final void method588(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        opengl var8 = this.field2464.field3184;
        this.field2459.method868(true);
        this.field2464.method1511();
        this.field2464.method1510(arg6);
        var8.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field2461) {
            float var9 = (float) arg2 / (float) this.method597();
            float var10 = (float) arg3 / (float) this.method596();
            float var11 = (float) this.field2463 * var9 + (float) arg0;
            float var12 = (float) this.field2462 * var10 + (float) arg1;
            float var13 = (float) this.field2459.field1974 * var9 + var11;
            float var14 = (float) this.field2459.field1977 * var10 + var12;
            if (this.field2467 == null) {
                this.field2464.method1559(this.field2459);
                this.field2464.method1569(arg4);
                var8.glBegin(7);
                var8.glTexCoord2f(0.0F, this.field2459.field1975);
                var8.glVertex2f(var11, var12);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2f(var11, var14);
                var8.glTexCoord2f(this.field2459.field1976, 0.0F);
                var8.glVertex2f(var13, var14);
                var8.glTexCoord2f(this.field2459.field1976, this.field2459.field1975);
                var8.glVertex2f(var13, var12);
                var8.glEnd();
            } else {
                this.method1174(arg4);
                this.field2467.method868(true);
                var8.glBegin(7);
                var8.glMultiTexCoord2f(33985, 0.0F, this.field2459.field1975);
                var8.glTexCoord2f(0.0F, this.field2459.field1975);
                var8.glVertex2f(var11, var12);
                var8.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2f(var11, var14);
                var8.glMultiTexCoord2f(33985, this.field2459.field1976, 0.0F);
                var8.glTexCoord2f(this.field2459.field1976, 0.0F);
                var8.glVertex2f(var13, var14);
                var8.glMultiTexCoord2f(33985, this.field2459.field1976, this.field2459.field1975);
                var8.glTexCoord2f(this.field2459.field1976, this.field2459.field1975);
                var8.glVertex2f(var13, var12);
                var8.glEnd();
                this.method1175();
            }
        } else if (this.field2467 == null) {
            this.field2464.method1559(this.field2459);
            this.field2464.method1569(arg4);
            var8.glBegin(7);
            var8.glTexCoord2f(0.0F, this.field2459.field1975);
            var8.glVertex2i(arg0, arg1);
            var8.glTexCoord2f(0.0F, 0.0F);
            var8.glVertex2i(arg0, arg1 + arg3);
            var8.glTexCoord2f(this.field2459.field1976, 0.0F);
            var8.glVertex2i(arg0 + arg2, arg1 + arg3);
            var8.glTexCoord2f(this.field2459.field1976, this.field2459.field1975);
            var8.glVertex2i(arg0 + arg2, arg1);
            var8.glEnd();
        } else {
            this.method1174(arg4);
            this.field2467.method868(true);
            var8.glBegin(7);
            var8.glMultiTexCoord2f(33985, 0.0F, this.field2459.field1975);
            var8.glTexCoord2f(0.0F, this.field2459.field1975);
            var8.glVertex2i(arg0, arg1);
            var8.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            var8.glTexCoord2f(0.0F, 0.0F);
            var8.glVertex2i(arg0, arg1 + arg3);
            var8.glMultiTexCoord2f(33985, this.field2459.field1976, 0.0F);
            var8.glTexCoord2f(this.field2459.field1976, 0.0F);
            var8.glVertex2i(arg0 + arg2, arg1 + arg3);
            var8.glMultiTexCoord2f(33985, this.field2459.field1976, this.field2459.field1975);
            var8.glTexCoord2f(this.field2459.field1976, this.field2459.field1975);
            var8.glVertex2i(arg0 + arg2, arg1);
            var8.glEnd();
            this.method1175();
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "()I", line = 513)
    public final int method597() {
        return this.field2459.field1974 + this.field2463 + this.field2465;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(FFFFFFIII)V", line = 521)
    public final void method594(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field2461) {
            float var10 = (float) this.method597();
            float var11 = (float) this.method596();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field2462 * var14;
            float var17 = (float) this.field2462 * var15;
            float var18 = (float) this.field2463 * var12;
            float var19 = (float) this.field2463 * var13;
            float var20 = (float) this.field2465 * -var12;
            float var21 = (float) this.field2465 * -var13;
            float var22 = (float) this.field2460 * -var14;
            float var23 = (float) this.field2460 * -var15;
            arg0 = arg0 + var18 + var16;
            arg1 = arg1 + var19 + var17;
            arg2 = arg2 + var20 + var16;
            arg3 = arg3 + var21 + var17;
            arg4 = arg4 + var18 + var22;
            arg5 = arg5 + var19 + var23;
        }
        float var24 = arg2 + arg4 - arg0;
        float var25 = arg5 + arg3 - arg1;
        opengl var26 = this.field2464.field3184;
        this.field2459.method868(true);
        this.field2464.method1511();
        this.field2464.method1559(this.field2459);
        this.field2464.method1510(arg8);
        this.field2464.method1569(arg6);
        var26.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        var26.glBegin(7);
        var26.glTexCoord2f(0.0F, this.field2459.field1975);
        var26.glVertex2f(arg0, arg1);
        var26.glTexCoord2f(0.0F, 0.0F);
        var26.glVertex2f(arg4, arg5);
        var26.glTexCoord2f(this.field2459.field1976, 0.0F);
        var26.glVertex2f(var24, var25);
        var26.glTexCoord2f(this.field2459.field1976, this.field2459.field1975);
        var26.glVertex2f(arg2, arg3);
        var26.glEnd();
    }

    @OriginalMember(owner = "client!hp", name = "e", descriptor = "()V", line = 586)
    private final void method1175() {
        this.field2464.method1566(1);
        this.field2464.method1559((class127) null);
        this.field2464.method1542(8448, 8448);
        this.field2464.method1512(1, 34168, 768);
        this.field2464.method1572(0, 5890, 770);
        this.field2464.method1566(0);
        this.field2464.method1512(1, 34168, 768);
    }
}
