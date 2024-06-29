import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class85 extends class80 {

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
    private int field1281 = 0;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    private int field1280 = 0;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    private int field1283 = 0;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "Z")
    private boolean field1284 = false;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    private int field1282 = 0;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
    private int field1286 = 0;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "Lhd;")
    private class17 field1278;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "Lmc;")
    private class317 field1285;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "Lmc;")
    private class317 field1279;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIIII)V")
    public final void method726(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        opengl var8 = this.field1278.field198;
        this.field1278.method198();
        this.field1278.method121(arg6);
        var8.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field1284) {
            float var9 = (float) arg2 / (float) this.method740();
            float var10 = (float) arg3 / (float) this.method739();
            float var11 = (float) this.field1282 * var9 + (float) arg0;
            float var12 = (float) this.field1283 * var10 + (float) arg1;
            float var13 = (float) this.field1285.field4300 * var9 + var11;
            float var14 = (float) this.field1285.field4299 * var10 + var12;
            if (this.field1279 == null) {
                this.field1278.method207(this.field1285);
                this.field1278.method159(arg4);
                var8.glBegin(7);
                var8.glTexCoord2f(0.0F, this.field1285.field4298);
                var8.glVertex2f(var11, var12);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2f(var11, var14);
                var8.glTexCoord2f(this.field1285.field4302, 0.0F);
                var8.glVertex2f(var13, var14);
                var8.glTexCoord2f(this.field1285.field4302, this.field1285.field4298);
                var8.glVertex2f(var13, var12);
                var8.glEnd();
            } else {
                this.method772(arg4);
                var8.glBegin(7);
                var8.glMultiTexCoord2f(33985, 0.0F, this.field1285.field4298);
                var8.glTexCoord2f(0.0F, this.field1285.field4298);
                var8.glVertex2f(var11, var12);
                var8.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2f(var11, var14);
                var8.glMultiTexCoord2f(33985, this.field1285.field4302, 0.0F);
                var8.glTexCoord2f(this.field1285.field4302, 0.0F);
                var8.glVertex2f(var13, var14);
                var8.glMultiTexCoord2f(33985, this.field1285.field4302, this.field1285.field4298);
                var8.glTexCoord2f(this.field1285.field4302, this.field1285.field4298);
                var8.glVertex2f(var13, var12);
                var8.glEnd();
                this.method773();
            }
        } else if (this.field1279 == null) {
            this.field1278.method207(this.field1285);
            this.field1278.method159(arg4);
            var8.glBegin(7);
            var8.glTexCoord2f(0.0F, this.field1285.field4298);
            var8.glVertex2i(arg0, arg1);
            var8.glTexCoord2f(0.0F, 0.0F);
            var8.glVertex2i(arg0, arg1 + arg3);
            var8.glTexCoord2f(this.field1285.field4302, 0.0F);
            var8.glVertex2i(arg0 + arg2, arg1 + arg3);
            var8.glTexCoord2f(this.field1285.field4302, this.field1285.field4298);
            var8.glVertex2i(arg0 + arg2, arg1);
            var8.glEnd();
        } else {
            this.method772(arg4);
            var8.glBegin(7);
            var8.glMultiTexCoord2f(33985, 0.0F, this.field1285.field4298);
            var8.glTexCoord2f(0.0F, this.field1285.field4298);
            var8.glVertex2i(arg0, arg1);
            var8.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            var8.glTexCoord2f(0.0F, 0.0F);
            var8.glVertex2i(arg0, arg1 + arg3);
            var8.glMultiTexCoord2f(33985, this.field1285.field4302, 0.0F);
            var8.glTexCoord2f(this.field1285.field4302, 0.0F);
            var8.glVertex2i(arg0 + arg2, arg1 + arg3);
            var8.glMultiTexCoord2f(33985, this.field1285.field4302, this.field1285.field4298);
            var8.glTexCoord2f(this.field1285.field4302, this.field1285.field4298);
            var8.glVertex2i(arg0 + arg2, arg1);
            var8.glEnd();
            this.method773();
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(FFFFFFIII)V")
    public final void method735(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field1284) {
            float var10 = (float) this.method740();
            float var11 = (float) this.method739();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field1283 * var14;
            float var17 = (float) this.field1283 * var15;
            float var18 = (float) this.field1282 * var12;
            float var19 = (float) this.field1282 * var13;
            float var20 = (float) this.field1281 * -var12;
            float var21 = (float) this.field1281 * -var13;
            float var22 = (float) this.field1286 * -var14;
            float var23 = (float) this.field1286 * -var15;
            arg0 = arg0 + var18 + var16;
            arg1 = arg1 + var19 + var17;
            arg2 = arg2 + var20 + var16;
            arg3 = arg3 + var21 + var17;
            arg4 = arg4 + var18 + var22;
            arg5 = arg5 + var19 + var23;
        }
        float var24 = arg2 + arg4 - arg0;
        float var25 = arg5 + arg3 - arg1;
        opengl var26 = this.field1278.field198;
        this.field1278.method198();
        this.field1278.method207(this.field1285);
        this.field1278.method121(arg8);
        this.field1278.method159(arg6);
        var26.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        var26.glBegin(7);
        var26.glTexCoord2f(0.0F, this.field1285.field4298);
        var26.glVertex2f(arg0, arg1);
        var26.glTexCoord2f(0.0F, 0.0F);
        var26.glVertex2f(arg4, arg5);
        var26.glTexCoord2f(this.field1285.field4302, 0.0F);
        var26.glVertex2f(var24, var25);
        var26.glTexCoord2f(this.field1285.field4302, this.field1285.field4298);
        var26.glVertex2f(arg2, arg3);
        var26.glEnd();
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "()I")
    public final int method723() {
        return this.field1285.field4300;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(IIII)V")
    public final void method738(int arg0, int arg1, int arg2, int arg3) {
        this.field1282 = arg0;
        this.field1283 = arg1;
        this.field1281 = arg2;
        this.field1286 = arg3;
        this.field1284 = this.field1282 != 0 || this.field1283 != 0 || this.field1281 != 0 || this.field1286 != 0;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "()I")
    public final int method733() {
        return this.field1285.field4299;
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "()I")
    public final int method740() {
        return this.field1285.field4300 + this.field1282 + this.field1281;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
    private final void method772(int arg0) {
        this.field1278.method176(1);
        this.field1278.method207(this.field1285);
        this.field1278.method145(this.field1278.method113(arg0), 7681);
        this.field1278.method93(1, 34167, 768);
        this.field1278.method223(0, 34168, 770);
        this.field1278.method176(0);
        this.field1278.method207(this.field1279);
        this.field1278.method145(34479, 7681);
        this.field1278.method93(1, 34166, 768);
        if (this.field1280 == 0) {
            this.field1278.method164(1.0F, 0.5F, 0.5F, 0.0F);
        } else if (this.field1280 == 1) {
            this.field1278.method164(0.5F, 1.0F, 0.5F, 0.0F);
        } else if (this.field1280 == 2) {
            this.field1278.method164(0.5F, 0.5F, 1.0F, 0.0F);
        } else if (this.field1280 == 3) {
            this.field1278.method164(128.5F, 128.5F, 128.5F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIII)V")
    public final void method736(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1285.method1545(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IILvj;II)V")
    public final void method721(int arg0, int arg1, class179 arg2, int arg3, int arg4) {
        class50 var6 = (class50) arg2;
        class317 var7 = var6.field836;
        this.field1278.method198();
        this.field1278.method207(this.field1285);
        this.field1278.method159(0);
        this.field1278.method176(1);
        this.field1278.method207(var7);
        this.field1278.method145(7681, 8448);
        this.field1278.method93(0, 34168, 768);
        this.field1278.method121(1);
        int var8 = this.field1282 + arg0;
        int var9 = this.field1283 + arg1;
        int var10 = this.field1285.field4300 + var8;
        int var11 = this.field1285.field4299 + var9;
        float var12 = var7.field4302 / (float) var7.field4300;
        float var13 = var7.field4298 / (float) var7.field4299;
        float var14 = (float) (var8 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field4298 - (float) (var9 - arg4) * var13;
        float var17 = var7.field4298 - (float) (var11 - arg4) * var13;
        opengl var18 = this.field1278.field198;
        var18.glBegin(7);
        var18.glColor3f(1.0F, 1.0F, 1.0F);
        var18.glMultiTexCoord2f(33984, 0.0F, this.field1285.field4298);
        var18.glMultiTexCoord2f(33985, var14, var16);
        var18.glVertex2i(var8, var9);
        var18.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        var18.glMultiTexCoord2f(33985, var14, var17);
        var18.glVertex2i(var8, this.field1285.field4299 + var9);
        var18.glMultiTexCoord2f(33984, this.field1285.field4302, 0.0F);
        var18.glMultiTexCoord2f(33985, var15, var17);
        var18.glVertex2i(this.field1285.field4300 + var8, this.field1285.field4299 + var9);
        var18.glMultiTexCoord2f(33984, this.field1285.field4302, this.field1285.field4298);
        var18.glMultiTexCoord2f(33985, var15, var16);
        var18.glVertex2i(this.field1285.field4300 + var8, var9);
        var18.glEnd();
        this.field1278.method93(0, 5890, 768);
        this.field1278.method159(1);
        this.field1278.method207((class4) null);
        this.field1278.method176(0);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(FFFFFFLvj;II)V")
    public final void method732(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class179 arg6, int arg7, int arg8) {
        class317 var10 = ((class50) arg6).field836;
        if (this.field1284) {
            float var11 = (float) this.method740();
            float var12 = (float) this.method739();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field1283 * var15;
            float var18 = (float) this.field1283 * var16;
            float var19 = (float) this.field1282 * var13;
            float var20 = (float) this.field1282 * var14;
            float var21 = (float) this.field1281 * -var13;
            float var22 = (float) this.field1281 * -var14;
            float var23 = (float) this.field1286 * -var15;
            float var24 = (float) this.field1286 * -var16;
            arg0 = arg0 + var19 + var17;
            arg1 = arg1 + var20 + var18;
            arg2 = arg2 + var21 + var17;
            arg3 = arg3 + var22 + var18;
            arg4 = arg4 + var19 + var23;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        opengl var27 = this.field1278.field198;
        this.field1278.method198();
        this.field1278.method207(this.field1285);
        this.field1278.method159(0);
        this.field1278.method176(1);
        this.field1278.method207(var10);
        this.field1278.method145(7681, 8448);
        this.field1278.method93(0, 34168, 768);
        this.field1278.method121(1);
        float var28 = var10.field4302 / (float) var10.field4300;
        float var29 = var10.field4298 / (float) var10.field4299;
        var27.glBegin(7);
        var27.glColor3f(1.0F, 1.0F, 1.0F);
        var27.glMultiTexCoord2f(33984, 0.0F, this.field1285.field4298);
        var27.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * var28, var10.field4298 - (arg1 - (float) arg8) * var29);
        var27.glVertex2f(arg0, arg1);
        var27.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        var27.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * var28, var10.field4298 - (arg5 - (float) arg8) * var29);
        var27.glVertex2f(arg4, arg5);
        var27.glMultiTexCoord2f(33984, this.field1285.field4302, 0.0F);
        var27.glMultiTexCoord2f(33985, (var25 - (float) arg7) * var28, var10.field4298 - (var26 - (float) arg8) * var29);
        var27.glVertex2f(var25, var26);
        var27.glMultiTexCoord2f(33984, this.field1285.field4302, this.field1285.field4298);
        var27.glMultiTexCoord2f(33985, (arg2 - (float) arg7) * var28, var10.field4298 - (arg3 - (float) arg8) * var29);
        var27.glVertex2f(arg2, arg3);
        var27.glEnd();
        this.field1278.method93(0, 5890, 768);
        this.field1278.method159(1);
        this.field1278.method207((class4) null);
        this.field1278.method176(0);
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(IIIIIII)V")
    public final void method737(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        opengl var8 = this.field1278.field198;
        int var9 = arg0 + arg2;
        int var10 = arg1 + arg3;
        this.field1278.method198();
        this.field1278.method207(this.field1285);
        this.field1278.method121(arg6);
        this.field1278.method159(arg4);
        var8.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field1285.field4301 && !this.field1284) {
            float var11 = (float) arg3 * this.field1285.field4298 / (float) this.field1285.field4299;
            float var12 = (float) arg2 * this.field1285.field4302 / (float) this.field1285.field4300;
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
        var8.glTranslatef((float) this.field1282, (float) this.field1283, 0.0F);
        int var13 = this.method740();
        int var14 = this.method739();
        int var15 = this.field1285.field4299 + arg1;
        var8.glBegin(7);
        int var16 = arg1;
        while (var15 <= var10) {
            int var17 = this.field1285.field4300 + arg0;
            int var18 = arg0;
            while (var17 <= var9) {
                var8.glTexCoord2f(0.0F, this.field1285.field4298);
                var8.glVertex2i(var18, var16);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2i(var18, var15);
                var8.glTexCoord2f(this.field1285.field4302, 0.0F);
                var8.glVertex2i(var17, var15);
                var8.glTexCoord2f(this.field1285.field4302, this.field1285.field4298);
                var8.glVertex2i(var17, var16);
                var17 += var13;
                var18 += var13;
            }
            if (var18 < var9) {
                float var19 = (float) (var9 - var18) * this.field1285.field4302 / (float) this.field1285.field4300;
                var8.glTexCoord2f(0.0F, this.field1285.field4298);
                var8.glVertex2i(var18, var16);
                var8.glTexCoord2f(0.0F, 0.0F);
                var8.glVertex2i(var18, var15);
                var8.glTexCoord2f(var19, 0.0F);
                var8.glVertex2i(var9, var15);
                var8.glTexCoord2f(var19, this.field1285.field4298);
                var8.glVertex2i(var9, var16);
            }
            var16 += var14;
            var15 += var14;
        }
        if (var16 < var10) {
            float var20 = (float) (this.field1285.field3192 - (var10 - var16)) * this.field1285.field4298 / (float) this.field1285.field4299;
            int var21 = this.field1285.field4300 + arg0;
            int var22 = arg0;
            while (var21 <= var9) {
                var8.glTexCoord2f(0.0F, this.field1285.field4298);
                var8.glVertex2i(var22, var16);
                var8.glTexCoord2f(0.0F, var20);
                var8.glVertex2i(var22, var10);
                var8.glTexCoord2f(this.field1285.field4302, var20);
                var8.glVertex2i(var21, var10);
                var8.glTexCoord2f(this.field1285.field4302, this.field1285.field4298);
                var8.glVertex2i(var21, var16);
                var21 += var13;
                var22 += var13;
            }
            if (var22 < var9) {
                float var23 = (float) (var9 - var22) * this.field1285.field4302 / (float) this.field1285.field4300;
                var8.glTexCoord2f(0.0F, this.field1285.field4298);
                var8.glVertex2i(var22, var16);
                var8.glTexCoord2f(0.0F, var20);
                var8.glVertex2i(var22, var10);
                var8.glTexCoord2f(var23, var20);
                var8.glVertex2i(var9, var10);
                var8.glTexCoord2f(var23, this.field1285.field4298);
                var8.glVertex2i(var9, var16);
            }
        }
        var8.glEnd();
        var8.glPopMatrix();
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIII)V")
    public final void method730(int arg0, int arg1, int arg2, int arg3, int arg4) {
        opengl var6 = this.field1278.field198;
        this.field1278.method198();
        this.field1278.method121(arg4);
        var6.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var7 = this.field1282 + arg0;
        int var8 = this.field1283 + arg1;
        if (this.field1279 == null) {
            this.field1278.method207(this.field1285);
            this.field1278.method159(arg2);
            var6.glBegin(7);
            var6.glTexCoord2f(0.0F, this.field1285.field4298);
            var6.glVertex2i(var7, var8);
            var6.glTexCoord2f(0.0F, 0.0F);
            var6.glVertex2i(var7, this.field1285.field4299 + var8);
            var6.glTexCoord2f(this.field1285.field4302, 0.0F);
            var6.glVertex2i(this.field1285.field4300 + var7, this.field1285.field4299 + var8);
            var6.glTexCoord2f(this.field1285.field4302, this.field1285.field4298);
            var6.glVertex2i(this.field1285.field4300 + var7, var8);
            var6.glEnd();
            return;
        }
        this.method772(arg2);
        var6.glBegin(7);
        var6.glMultiTexCoord2f(33985, 0.0F, this.field1285.field4298);
        var6.glTexCoord2f(0.0F, this.field1285.field4298);
        var6.glVertex2i(var7, var8);
        var6.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var6.glTexCoord2f(0.0F, 0.0F);
        var6.glVertex2i(var7, this.field1285.field4299 + var8);
        var6.glMultiTexCoord2f(33985, this.field1285.field4302, 0.0F);
        var6.glTexCoord2f(this.field1285.field4302, 0.0F);
        var6.glVertex2i(this.field1285.field4300 + var7, this.field1285.field4299 + var8);
        var6.glMultiTexCoord2f(33985, this.field1285.field4302, this.field1285.field4298);
        var6.glTexCoord2f(this.field1285.field4302, this.field1285.field4298);
        var6.glVertex2i(this.field1285.field4300 + var7, var8);
        var6.glEnd();
        this.method773();
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "()I")
    public final int method739() {
        return this.field1285.field4299 + this.field1283 + this.field1286;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)V")
    public final void method734(int arg0, int arg1, int arg2) {
        opengl var4 = this.field1278.field198;
        var4.glPixelTransferf(3348, 0.5F);
        var4.glPixelTransferf(3349, 0.499F);
        var4.glPixelTransferf(3352, 0.5F);
        var4.glPixelTransferf(3353, 0.499F);
        var4.glPixelTransferf(3354, 0.5F);
        var4.glPixelTransferf(3355, 0.499F);
        this.field1279 = class317.method2020(this.field1278, this.field1285.field4300, arg1, arg0, 14123, this.field1285.field4299);
        this.field1280 = arg2;
        var4.glPixelTransferf(3348, 1.0F);
        var4.glPixelTransferf(3349, 0.0F);
        var4.glPixelTransferf(3352, 1.0F);
        var4.glPixelTransferf(3353, 0.0F);
        var4.glPixelTransferf(3354, 1.0F);
        var4.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lhd;IIII)V")
    public class85(class17 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1278 = arg0;
        this.field1285 = class317.method2020(arg0, arg3, arg2, arg1, 14123, arg4);
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lhd;II[III)V")
    public class85(class17 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field1278 = arg0;
        this.field1285 = class317.method2019((byte) -104, arg1, arg0, false, arg3, arg2);
    }

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "()V")
    private final void method773() {
        this.field1278.method176(1);
        this.field1278.method207((class4) null);
        this.field1278.method145(8448, 8448);
        this.field1278.method93(1, 34168, 768);
        this.field1278.method223(0, 5890, 770);
        this.field1278.method176(0);
        this.field1278.method93(1, 34168, 768);
    }
}
