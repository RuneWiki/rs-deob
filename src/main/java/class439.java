import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class439 extends class395 {

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    private int field6288 = 0;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "Z")
    private boolean field6293 = false;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
    private int field6295 = 0;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
    private int field6291 = 0;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "I")
    private int field6296 = 0;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    private int field6294 = 0;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "Lic;")
    private class246 field6289;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "Llm;")
    private class374 field6290;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "Llm;")
    private class374 field6292;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIII)V", line = 5)
    public final void method214(int arg0, int arg1, int arg2, int arg3, int arg4) {
        opengl var6 = this.field6289.field3342;
        this.field6290.method46(false);
        this.field6289.method1389();
        this.field6289.method1371(arg4);
        var6.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var7 = this.field6288 + arg0;
        int var8 = this.field6296 + arg1;
        if (this.field6292 == null) {
            this.field6289.method1379(this.field6290);
            this.field6289.method1455(arg2);
            var6.glBegin(7);
            var6.glTexCoord2f(0.0F, this.field6290.field5339);
            var6.glVertex2i(var7, var8);
            var6.glTexCoord2f(0.0F, 0.0F);
            var6.glVertex2i(var7, this.field6290.field5340 + var8);
            var6.glTexCoord2f(this.field6290.field5341, 0.0F);
            var6.glVertex2i(this.field6290.field5338 + var7, this.field6290.field5340 + var8);
            var6.glTexCoord2f(this.field6290.field5341, this.field6290.field5339);
            var6.glVertex2i(this.field6290.field5338 + var7, var8);
            var6.glEnd();
            return;
        }
        this.method2604(arg2);
        this.field6292.method46(false);
        var6.glBegin(7);
        var6.glMultiTexCoord2f(33985, 0.0F, this.field6290.field5339);
        var6.glTexCoord2f(0.0F, this.field6290.field5339);
        var6.glVertex2i(var7, var8);
        var6.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var6.glTexCoord2f(0.0F, 0.0F);
        var6.glVertex2i(var7, this.field6290.field5340 + var8);
        var6.glMultiTexCoord2f(33985, this.field6290.field5341, 0.0F);
        var6.glTexCoord2f(this.field6290.field5341, 0.0F);
        var6.glVertex2i(this.field6290.field5338 + var7, this.field6290.field5340 + var8);
        var6.glMultiTexCoord2f(33985, this.field6290.field5341, this.field6290.field5339);
        var6.glTexCoord2f(this.field6290.field5341, this.field6290.field5339);
        var6.glVertex2i(this.field6290.field5338 + var7, var8);
        var6.glEnd();
        this.method2605();
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lic;IIII)V", line = 594)
    public class439(class246 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field6289 = arg0;
        this.field6290 = class374.method2258(arg2, arg1, 34037, arg3, arg0, arg4);
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lic;II[III)V", line = 600)
    public class439(class246 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field6289 = arg0;
        this.field6290 = class374.method2260(arg2, arg0, arg1, arg3, -2026, false);
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(IIII)V", line = 56)
    public final void method219(int arg0, int arg1, int arg2, int arg3) {
        this.field6288 = arg0;
        this.field6296 = arg1;
        this.field6294 = arg2;
        this.field6291 = arg3;
        this.field6293 = this.field6288 != 0 || this.field6296 != 0 || this.field6294 != 0 || this.field6291 != 0;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(IIIIIII)V", line = 65)
    public final void method225(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        opengl var8 = this.field6289.field3342;
        this.field6290.method46(true);
        this.field6289.method1389();
        this.field6289.method1371(arg6);
        var8.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field6293) {
            float var9 = (float) arg2 / (float) this.method216();
            float var10 = (float) arg3 / (float) this.method222();
            float var11 = (float) this.field6288 * var9 + (float) arg0;
            float var12 = (float) this.field6296 * var10 + (float) arg1;
            float var13 = (float) this.field6290.field5338 * var9 + var11;
            float var14 = (float) this.field6290.field5340 * var10 + var12;
            if (this.field6292 == null) {
                this.field6289.method1379(this.field6290);
                this.field6289.method1455(arg4);
                var8.glBegin(7);
                var8.glTexCoord2f(0.0F, this.field6290.field5339);
                var8.glVertex2f(var11, var12);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2f(var11, var14);
                var8.glTexCoord2f(this.field6290.field5341, 0.0F);
                var8.glVertex2f(var13, var14);
                var8.glTexCoord2f(this.field6290.field5341, this.field6290.field5339);
                var8.glVertex2f(var13, var12);
                var8.glEnd();
            } else {
                this.method2604(arg4);
                this.field6292.method46(true);
                var8.glBegin(7);
                var8.glMultiTexCoord2f(33985, 0.0F, this.field6290.field5339);
                var8.glTexCoord2f(0.0F, this.field6290.field5339);
                var8.glVertex2f(var11, var12);
                var8.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2f(var11, var14);
                var8.glMultiTexCoord2f(33985, this.field6290.field5341, 0.0F);
                var8.glTexCoord2f(this.field6290.field5341, 0.0F);
                var8.glVertex2f(var13, var14);
                var8.glMultiTexCoord2f(33985, this.field6290.field5341, this.field6290.field5339);
                var8.glTexCoord2f(this.field6290.field5341, this.field6290.field5339);
                var8.glVertex2f(var13, var12);
                var8.glEnd();
                this.method2605();
            }
        } else if (this.field6292 == null) {
            this.field6289.method1379(this.field6290);
            this.field6289.method1455(arg4);
            var8.glBegin(7);
            var8.glTexCoord2f(0.0F, this.field6290.field5339);
            var8.glVertex2i(arg0, arg1);
            var8.glTexCoord2f(0.0F, 0.0F);
            var8.glVertex2i(arg0, arg1 + arg3);
            var8.glTexCoord2f(this.field6290.field5341, 0.0F);
            var8.glVertex2i(arg0 + arg2, arg1 + arg3);
            var8.glTexCoord2f(this.field6290.field5341, this.field6290.field5339);
            var8.glVertex2i(arg0 + arg2, arg1);
            var8.glEnd();
        } else {
            this.method2604(arg4);
            this.field6292.method46(true);
            var8.glBegin(7);
            var8.glMultiTexCoord2f(33985, 0.0F, this.field6290.field5339);
            var8.glTexCoord2f(0.0F, this.field6290.field5339);
            var8.glVertex2i(arg0, arg1);
            var8.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            var8.glTexCoord2f(0.0F, 0.0F);
            var8.glVertex2i(arg0, arg1 + arg3);
            var8.glMultiTexCoord2f(33985, this.field6290.field5341, 0.0F);
            var8.glTexCoord2f(this.field6290.field5341, 0.0F);
            var8.glVertex2i(arg0 + arg2, arg1 + arg3);
            var8.glMultiTexCoord2f(33985, this.field6290.field5341, this.field6290.field5339);
            var8.glTexCoord2f(this.field6290.field5341, this.field6290.field5339);
            var8.glVertex2i(arg0 + arg2, arg1);
            var8.glEnd();
            this.method2605();
        }
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "()I", line = 165)
    public final int method223() {
        return this.field6290.field5340;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "()I", line = 168)
    public final int method220() {
        return this.field6290.field5338;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V", line = 171)
    private final void method2604(int arg0) {
        this.field6289.method1365(1);
        this.field6289.method1379(this.field6290);
        this.field6289.method1360(this.field6289.method1471(arg0), 7681);
        this.field6289.method1458(1, 34167, 768);
        this.field6289.method1384(0, 34168, 770);
        this.field6289.method1365(0);
        this.field6289.method1379(this.field6292);
        this.field6289.method1360(34479, 7681);
        this.field6289.method1458(1, 34166, 768);
        if (this.field6295 == 0) {
            this.field6289.method1452(1.0F, 0.5F, 0.5F, 0.0F);
        } else if (this.field6295 == 1) {
            this.field6289.method1452(0.5F, 1.0F, 0.5F, 0.0F);
        } else if (this.field6295 == 2) {
            this.field6289.method1452(0.5F, 0.5F, 1.0F, 0.0F);
        } else if (this.field6295 == 3) {
            this.field6289.method1452(128.5F, 128.5F, 128.5F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(FFFFFFLhg;II)V", line = 200)
    public final void method221(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class313 arg6, int arg7, int arg8) {
        class374 var10 = ((class124) arg6).field1533;
        if (this.field6293) {
            float var11 = (float) this.method216();
            float var12 = (float) this.method222();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field6296 * var15;
            float var18 = (float) this.field6296 * var16;
            float var19 = (float) this.field6288 * var13;
            float var20 = (float) this.field6288 * var14;
            float var21 = (float) this.field6294 * -var13;
            float var22 = (float) this.field6294 * -var14;
            float var23 = (float) this.field6291 * -var15;
            float var24 = (float) this.field6291 * -var16;
            arg0 = arg0 + var19 + var17;
            arg1 = arg1 + var20 + var18;
            arg2 = arg2 + var21 + var17;
            arg3 = arg3 + var22 + var18;
            arg4 = arg4 + var19 + var23;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        opengl var27 = this.field6289.field3342;
        this.field6290.method46(true);
        this.field6289.method1389();
        this.field6289.method1379(this.field6290);
        this.field6289.method1455(0);
        this.field6289.method1365(1);
        this.field6289.method1379(var10);
        this.field6289.method1360(7681, 8448);
        this.field6289.method1458(0, 34168, 768);
        this.field6289.method1371(1);
        float var28 = var10.field5341 / (float) var10.field5338;
        float var29 = var10.field5339 / (float) var10.field5340;
        var27.glBegin(7);
        var27.glColor3f(1.0F, 1.0F, 1.0F);
        var27.glMultiTexCoord2f(33984, 0.0F, this.field6290.field5339);
        var27.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * var28, var10.field5339 - (arg1 - (float) arg8) * var29);
        var27.glVertex2f(arg0, arg1);
        var27.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        var27.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * var28, var10.field5339 - (arg5 - (float) arg8) * var29);
        var27.glVertex2f(arg4, arg5);
        var27.glMultiTexCoord2f(33984, this.field6290.field5341, 0.0F);
        var27.glMultiTexCoord2f(33985, (var25 - (float) arg7) * var28, var10.field5339 - (var26 - (float) arg8) * var29);
        var27.glVertex2f(var25, var26);
        var27.glMultiTexCoord2f(33984, this.field6290.field5341, this.field6290.field5339);
        var27.glMultiTexCoord2f(33985, (arg2 - (float) arg7) * var28, var10.field5339 - (arg3 - (float) arg8) * var29);
        var27.glVertex2f(arg2, arg3);
        var27.glEnd();
        this.field6289.method1458(0, 5890, 768);
        this.field6289.method1455(1);
        this.field6289.method1379((class5) null);
        this.field6289.method1365(0);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIII)V", line = 285)
    public final void method1963(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6290.method731(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "()V", line = 288)
    private final void method2605() {
        this.field6289.method1365(1);
        this.field6289.method1379((class5) null);
        this.field6289.method1360(8448, 8448);
        this.field6289.method1458(1, 34168, 768);
        this.field6289.method1384(0, 5890, 770);
        this.field6289.method1365(0);
        this.field6289.method1458(1, 34168, 768);
    }

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "()I", line = 297)
    public final int method222() {
        return this.field6290.field5340 + this.field6296 + this.field6291;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILhg;II)V", line = 301)
    public final void method217(int arg0, int arg1, class313 arg2, int arg3, int arg4) {
        class124 var6 = (class124) arg2;
        class374 var7 = var6.field1533;
        this.field6290.method46(false);
        this.field6289.method1389();
        this.field6289.method1379(this.field6290);
        this.field6289.method1455(0);
        this.field6289.method1365(1);
        this.field6289.method1379(var7);
        this.field6289.method1360(7681, 8448);
        this.field6289.method1458(0, 34168, 768);
        this.field6289.method1371(1);
        int var8 = this.field6288 + arg0;
        int var9 = this.field6296 + arg1;
        int var10 = this.field6290.field5338 + var8;
        int var11 = this.field6290.field5340 + var9;
        float var12 = var7.field5341 / (float) var7.field5338;
        float var13 = var7.field5339 / (float) var7.field5340;
        float var14 = (float) (var8 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field5339 - (float) (var9 - arg4) * var13;
        float var17 = var7.field5339 - (float) (var11 - arg4) * var13;
        opengl var18 = this.field6289.field3342;
        var18.glBegin(7);
        var18.glColor3f(1.0F, 1.0F, 1.0F);
        var18.glMultiTexCoord2f(33984, 0.0F, this.field6290.field5339);
        var18.glMultiTexCoord2f(33985, var14, var16);
        var18.glVertex2i(var8, var9);
        var18.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        var18.glMultiTexCoord2f(33985, var14, var17);
        var18.glVertex2i(var8, this.field6290.field5340 + var9);
        var18.glMultiTexCoord2f(33984, this.field6290.field5341, 0.0F);
        var18.glMultiTexCoord2f(33985, var15, var17);
        var18.glVertex2i(this.field6290.field5338 + var8, this.field6290.field5340 + var9);
        var18.glMultiTexCoord2f(33984, this.field6290.field5341, this.field6290.field5339);
        var18.glMultiTexCoord2f(33985, var15, var16);
        var18.glVertex2i(this.field6290.field5338 + var8, var9);
        var18.glEnd();
        this.field6289.method1458(0, 5890, 768);
        this.field6289.method1455(1);
        this.field6289.method1379((class5) null);
        this.field6289.method1365(0);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(FFFFFFIII)V", line = 358)
    public final void method226(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field6293) {
            float var10 = (float) this.method216();
            float var11 = (float) this.method222();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field6296 * var14;
            float var17 = (float) this.field6296 * var15;
            float var18 = (float) this.field6288 * var12;
            float var19 = (float) this.field6288 * var13;
            float var20 = (float) this.field6294 * -var12;
            float var21 = (float) this.field6294 * -var13;
            float var22 = (float) this.field6291 * -var14;
            float var23 = (float) this.field6291 * -var15;
            arg0 = arg0 + var18 + var16;
            arg1 = arg1 + var19 + var17;
            arg2 = arg2 + var20 + var16;
            arg3 = arg3 + var21 + var17;
            arg4 = arg4 + var18 + var22;
            arg5 = arg5 + var19 + var23;
        }
        float var24 = arg2 + arg4 - arg0;
        float var25 = arg5 + arg3 - arg1;
        opengl var26 = this.field6289.field3342;
        this.field6290.method46(true);
        this.field6289.method1389();
        this.field6289.method1379(this.field6290);
        this.field6289.method1371(arg8);
        this.field6289.method1455(arg6);
        var26.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        var26.glBegin(7);
        var26.glTexCoord2f(0.0F, this.field6290.field5339);
        var26.glVertex2f(arg0, arg1);
        var26.glTexCoord2f(0.0F, 0.0F);
        var26.glVertex2f(arg4, arg5);
        var26.glTexCoord2f(this.field6290.field5341, 0.0F);
        var26.glVertex2f(var24, var25);
        var26.glTexCoord2f(this.field6290.field5341, this.field6290.field5339);
        var26.glVertex2f(arg2, arg3);
        var26.glEnd();
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "()I", line = 420)
    public final int method216() {
        return this.field6290.field5338 + this.field6288 + this.field6294;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIII)V", line = 426)
    public final void method215(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        opengl var8 = this.field6289.field3342;
        int var9 = arg0 + arg2;
        int var10 = arg1 + arg3;
        this.field6290.method46(false);
        this.field6289.method1389();
        this.field6289.method1379(this.field6290);
        this.field6289.method1371(arg6);
        this.field6289.method1455(arg4);
        var8.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field6290.field5342 && !this.field6293) {
            float var11 = (float) arg3 * this.field6290.field5339 / (float) this.field6290.field5340;
            float var12 = (float) arg2 * this.field6290.field5341 / (float) this.field6290.field5338;
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
        var8.glTranslatef((float) this.field6288, (float) this.field6296, 0.0F);
        int var13 = this.method216();
        int var14 = this.method222();
        int var15 = this.field6290.field5340 + arg1;
        var8.glBegin(7);
        int var16 = arg1;
        while (var15 <= var10) {
            int var17 = this.field6290.field5338 + arg0;
            int var18 = arg0;
            while (var17 <= var9) {
                var8.glTexCoord2f(0.0F, this.field6290.field5339);
                var8.glVertex2i(var18, var16);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2i(var18, var15);
                var8.glTexCoord2f(this.field6290.field5341, 0.0F);
                var8.glVertex2i(var17, var15);
                var8.glTexCoord2f(this.field6290.field5341, this.field6290.field5339);
                var8.glVertex2i(var17, var16);
                var17 += var13;
                var18 += var13;
            }
            if (var18 < var9) {
                float var19 = (float) (var9 - var18) * this.field6290.field5341 / (float) this.field6290.field5338;
                var8.glTexCoord2f(0.0F, this.field6290.field5339);
                var8.glVertex2i(var18, var16);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2i(var18, var15);
                var8.glTexCoord2f(var19, 0.0F);
                var8.glVertex2i(var9, var15);
                var8.glTexCoord2f(var19, this.field6290.field5339);
                var8.glVertex2i(var9, var16);
            }
            var16 += var14;
            var15 += var14;
        }
        if (var16 < var10) {
            float var20 = (float) (this.field6290.field5340 - (var10 - var16)) * this.field6290.field5339 / (float) this.field6290.field5340;
            int var21 = this.field6290.field5338 + arg0;
            int var22 = arg0;
            while (var21 <= var9) {
                var8.glTexCoord2f(0.0F, this.field6290.field5339);
                var8.glVertex2i(var22, var16);
                var8.glTexCoord2f(0.0F, var20);
                var8.glVertex2i(var22, var10);
                var8.glTexCoord2f(this.field6290.field5341, var20);
                var8.glVertex2i(var21, var10);
                var8.glTexCoord2f(this.field6290.field5341, this.field6290.field5339);
                var8.glVertex2i(var21, var16);
                var21 += var13;
                var22 += var13;
            }
            if (var22 < var9) {
                float var23 = (float) (var9 - var22) * this.field6290.field5341 / (float) this.field6290.field5338;
                var8.glTexCoord2f(0.0F, this.field6290.field5339);
                var8.glVertex2i(var22, var16);
                var8.glTexCoord2f(0.0F, var20);
                var8.glVertex2i(var22, var10);
                var8.glTexCoord2f(var23, var20);
                var8.glVertex2i(var9, var10);
                var8.glTexCoord2f(var23, this.field6290.field5339);
                var8.glVertex2i(var9, var16);
            }
        }
        var8.glEnd();
        var8.glPopMatrix();
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)V", line = 569)
    public final void method1962(int arg0, int arg1, int arg2) {
        opengl var4 = this.field6289.field3342;
        var4.glPixelTransferf(3348, 0.5F);
        var4.glPixelTransferf(3349, 0.499F);
        var4.glPixelTransferf(3352, 0.5F);
        var4.glPixelTransferf(3353, 0.499F);
        var4.glPixelTransferf(3354, 0.5F);
        var4.glPixelTransferf(3355, 0.499F);
        this.field6292 = class374.method2258(arg1, arg0, 34037, this.field6290.field5338, this.field6289, this.field6290.field5340);
        this.field6295 = arg2;
        var4.glPixelTransferf(3348, 1.0F);
        var4.glPixelTransferf(3349, 0.0F);
        var4.glPixelTransferf(3352, 1.0F);
        var4.glPixelTransferf(3353, 0.0F);
        var4.glPixelTransferf(3354, 1.0F);
        var4.glPixelTransferf(3355, 0.0F);
    }
}
