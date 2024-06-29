import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class308 extends class528 {

    @OriginalMember(owner = "client!qv", name = "i", descriptor = "I")
    private int field4390 = 0;

    @OriginalMember(owner = "client!qv", name = "s", descriptor = "Z")
    private boolean field4400 = false;

    @OriginalMember(owner = "client!qv", name = "y", descriptor = "I")
    private int field4406 = 0;

    @OriginalMember(owner = "client!qv", name = "r", descriptor = "I")
    private int field4399 = 0;

    @OriginalMember(owner = "client!qv", name = "A", descriptor = "I")
    private int field4408 = 0;

    @OriginalMember(owner = "client!qv", name = "m", descriptor = "I")
    private int field4394 = 0;

    @OriginalMember(owner = "client!qv", name = "p", descriptor = "Lqg;")
    private class321 field4397;

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "Lls;")
    private class92 field4384;

    @OriginalMember(owner = "client!qv", name = "q", descriptor = "Lao;")
    public static class188 field4398 = new class188(95, -1);

    @OriginalMember(owner = "client!qv", name = "B", descriptor = "Luj;")
    public static class259 field4409 = new class259();

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!qv", name = "d", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!qv", name = "e", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!qv", name = "f", descriptor = "I")
    public static int field4387;

    @OriginalMember(owner = "client!qv", name = "g", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!qv", name = "j", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!qv", name = "k", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!qv", name = "l", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!qv", name = "n", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!qv", name = "o", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!qv", name = "t", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!qv", name = "u", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!qv", name = "v", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!qv", name = "w", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!qv", name = "x", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!qv", name = "z", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!qv", name = "h", descriptor = "Lls;")
    private class92 field4389;

    @OriginalMember(owner = "client!qv", name = "ka", descriptor = "(IIII)V")
    public final void method141(int arg0, int arg1, int arg2, int arg3) {
        this.field4406 = arg3;
        this.field4390 = arg1;
        field4393++;
        this.field4394 = arg0;
        this.field4399 = arg2;
        this.field4400 = this.field4394 != 0 || this.field4390 != 0 || this.field4399 != 0 || this.field4406 != 0;
    }

    @OriginalMember(owner = "client!qv", name = "ja", descriptor = "()I")
    public final int method134() {
        field4383++;
        return this.field4399 + this.field4394 + this.field4384.field1522;
    }

    @OriginalMember(owner = "client!qv", name = "qa", descriptor = "()I")
    public final int method139() {
        field4403++;
        return this.field4384.field1520;
    }

    @OriginalMember(owner = "client!qv", name = "M", descriptor = "(IIIIIII)V")
    public final void method136(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4407++;
        this.field4384.method2673(-72, true);
        this.field4397.method2035(-3);
        this.field4397.method2061(arg6, (byte) -99);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field4400) {
            float var8 = (float) arg2 / (float) this.method134();
            float var9 = (float) arg3 / (float) this.method131();
            float var10 = (float) this.field4394 * var8 + (float) arg0;
            float var11 = (float) this.field4390 * var9 + (float) arg1;
            float var12 = (float) this.field4384.field1522 * var8 + var10;
            float var13 = (float) this.field4384.field1520 * var9 + var11;
            if (this.field4389 == null) {
                this.field4397.method2042(this.field4384, 0);
                this.field4397.method2068(arg4, 13134);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field4384.field1517);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glTexCoord2f(this.field4384.field1513, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glTexCoord2f(this.field4384.field1513, this.field4384.field1517);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
            } else {
                this.method1934(0, arg4);
                this.field4389.method2673(110, true);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field4384.field1517);
                OpenGL.glTexCoord2f(0.0F, this.field4384.field1517);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field4384.field1513, 0.0F);
                OpenGL.glTexCoord2f(this.field4384.field1513, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field4384.field1513, this.field4384.field1517);
                OpenGL.glTexCoord2f(this.field4384.field1513, this.field4384.field1517);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
                this.method1936((byte) 73);
            }
        } else if (this.field4389 == null) {
            this.field4397.method2042(this.field4384, 0);
            this.field4397.method2068(arg4, 13134);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field4384.field1517);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field4384.field1513, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field4384.field1513, this.field4384.field1517);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method1934(0, arg4);
            this.field4389.method2673(72, true);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field4384.field1517);
            OpenGL.glTexCoord2f(0.0F, this.field4384.field1517);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field4384.field1513, 0.0F);
            OpenGL.glTexCoord2f(this.field4384.field1513, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field4384.field1513, this.field4384.field1517);
            OpenGL.glTexCoord2f(this.field4384.field1513, this.field4384.field1517);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method1936((byte) 46);
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(B[SI)[S")
    public static final short[] method1933(byte arg0, short[] arg1, int arg2) {
        if (arg0 <= 26) {
            return null;
        } else {
            field4382++;
            short[] var3 = new short[arg2];
            class486.method2902(arg1, 0, var3, 0, arg2);
            return var3;
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(IILea;II)V")
    public final void method138(int arg0, int arg1, class381 arg2, int arg3, int arg4) {
        field4404++;
        class124 var6 = (class124) arg2;
        class92 var7 = var6.field1919;
        this.field4384.method2673(125, false);
        this.field4397.method2035(123);
        this.field4397.method2042(this.field4384, 0);
        this.field4397.method2068(1, 13134);
        this.field4397.method2030(1, (byte) -13);
        this.field4397.method2042(var7, 0);
        this.field4397.method2070(73, 8448, 7681);
        this.field4397.method2053(-108, 0, 34168, 768);
        this.field4397.method2061(1, (byte) -87);
        int var8 = this.field4390 + arg1;
        int var9 = this.field4394 + arg0;
        int var10 = this.field4384.field1522 + var9;
        int var11 = this.field4384.field1520 + var8;
        float var12 = var7.field1513 / (float) var7.field1522;
        float var13 = var7.field1517 / (float) var7.field1520;
        float var14 = (float) (var9 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field1517 - ((float) (var8 - arg4) * var13);
        float var17 = var7.field1517 - ((float) (var11 - arg4) * var13);
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field4384.field1517);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var9, var8);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var9, this.field4384.field1520 + var8);
        OpenGL.glMultiTexCoord2f(33984, this.field4384.field1513, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(var9 + this.field4384.field1522, this.field4384.field1520 + var8);
        OpenGL.glMultiTexCoord2f(33984, this.field4384.field1513, this.field4384.field1517);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(var9 + this.field4384.field1522, var8);
        OpenGL.glEnd();
        this.field4397.method2053(70, 0, 5890, 768);
        this.field4397.method2068(0, 13134);
        this.field4397.method2042(null, 0);
        this.field4397.method2030(0, (byte) 41);
    }

    @OriginalMember(owner = "client!qv", name = "V", descriptor = "(III)V")
    public final void method140(int arg0, int arg1, int arg2) {
        OpenGL.glPixelTransferf(3348, 0.5F);
        field4387++;
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field4389 = class335.method2200(this.field4384.field1520, 1, arg1, this.field4384.field1522, arg0, this.field4397);
        this.field4408 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!qv", name = "aa", descriptor = "(FFFFFFIII)V")
    public final void method132(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field4400) {
            float var10 = (float) this.method134();
            float var11 = (float) this.method131();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field4390 * var14;
            float var17 = (float) this.field4390 * var15;
            float var18 = (float) this.field4394 * var12;
            float var19 = (float) this.field4394 * var13;
            float var20 = (float) this.field4399 * -var12;
            float var21 = (float) this.field4399 * -var13;
            float var22 = (float) this.field4406 * -var14;
            float var23 = (float) this.field4406 * -var15;
            arg1 = arg1 + var19 + var17;
            arg0 = arg0 + var18 + var16;
            arg3 = arg3 + var21 + var17;
            arg2 = arg2 + var20 + var16;
            arg4 = arg4 + var18 + var22;
            arg5 = arg5 + var19 + var23;
        }
        field4405++;
        float var24 = arg2 + arg4 - arg0;
        this.field4384.method2673(69, true);
        float var25 = arg5 + arg3 - arg1;
        this.field4397.method2035(124);
        this.field4397.method2042(this.field4384, 0);
        this.field4397.method2061(arg8, (byte) -81);
        this.field4397.method2068(arg6, 13134);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field4384.field1517);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field4384.field1513, 0.0F);
        OpenGL.glVertex2f(var24, var25);
        OpenGL.glTexCoord2f(this.field4384.field1513, this.field4384.field1517);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!qv", name = "UA", descriptor = "()I")
    public final int method137() {
        field4388++;
        return this.field4384.field1522;
    }

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "(II)V")
    private final void method1934(int arg0, int arg1) {
        this.field4397.method2030(1, (byte) 117);
        field4386++;
        this.field4397.method2042(this.field4384, 0);
        this.field4397.method2070(108, 7681, this.field4397.method2073(arg1, (byte) 125));
        this.field4397.method2053(-108, 1, 34167, 768);
        this.field4397.method2034(arg0, 34168, 770, 8960);
        this.field4397.method2030(0, (byte) 40);
        this.field4397.method2042(this.field4389, 0);
        this.field4397.method2070(86, 7681, 34479);
        this.field4397.method2053(29, 1, 34166, 768);
        if (this.field4408 == 0) {
            this.field4397.method2074(0.5F, 0.5F, 0.0F, (byte) -30, 1.0F);
        } else if (this.field4408 == 1) {
            this.field4397.method2074(0.5F, 1.0F, 0.0F, (byte) -25, 0.5F);
            return;
        } else if (this.field4408 == 2) {
            this.field4397.method2074(1.0F, 0.5F, 0.0F, (byte) -26, 0.5F);
            return;
        } else if (this.field4408 == 3) {
            this.field4397.method2074(128.5F, 128.5F, 0.0F, (byte) -57, 128.5F);
            return;
        }
    }

    @OriginalMember(owner = "client!qv", name = "JA", descriptor = "()I")
    public final int method131() {
        field4402++;
        return this.field4384.field1520 + this.field4390 + this.field4406;
    }

    @OriginalMember(owner = "client!qv", name = "D", descriptor = "(IIIIIII)V")
    public final void method145(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4392++;
        int var8 = arg0 + arg2;
        this.field4384.method2673(-101, false);
        int var9 = arg1 + arg3;
        this.field4397.method2035(2);
        this.field4397.method2042(this.field4384, 0);
        this.field4397.method2061(arg6, (byte) -46);
        this.field4397.method2068(arg4, 13134);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field4384.field1519 && !this.field4400) {
            float var10 = (float) arg3 * this.field4384.field1517 / (float) this.field4384.field1520;
            float var11 = (float) arg2 * this.field4384.field1513 / (float) this.field4384.field1522;
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, var10);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, var9);
            OpenGL.glTexCoord2f(var11, 0.0F);
            OpenGL.glVertex2i(var8, var9);
            OpenGL.glTexCoord2f(var11, var10);
            OpenGL.glVertex2i(var8, arg1);
            OpenGL.glEnd();
            return;
        }
        OpenGL.glPushMatrix();
        OpenGL.glTranslatef((float) this.field4394, (float) this.field4390, 0.0F);
        int var12 = this.method134();
        int var13 = this.method131();
        int var14 = this.field4384.field1520 + arg1;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var14 <= var9) {
            int var20 = this.field4384.field1522 + arg0;
            int var21 = arg0;
            while (var8 >= var20) {
                OpenGL.glTexCoord2f(0.0F, this.field4384.field1517);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field4384.field1513, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field4384.field1513, this.field4384.field1517);
                OpenGL.glVertex2i(var20, var15);
                var21 += var12;
                var20 += var12;
            }
            if (var8 > var21) {
                float var22 = (float) (var8 - var21) * this.field4384.field1513 / (float) this.field4384.field1522;
                OpenGL.glTexCoord2f(0.0F, this.field4384.field1517);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field4384.field1517);
                OpenGL.glVertex2i(var8, var15);
            }
            var15 += var13;
            var14 += var13;
        }
        if (var9 > var15) {
            float var16 = (float) (var15 + this.field4384.field1520 - var9) * this.field4384.field1517 / (float) this.field4384.field1520;
            int var17 = this.field4384.field1522 + arg0;
            int var18 = arg0;
            while (var17 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field4384.field1517);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field4384.field1513, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field4384.field1513, this.field4384.field1517);
                OpenGL.glVertex2i(var17, var15);
                var17 += var12;
                var18 += var12;
            }
            if (var8 > var18) {
                float var19 = (float) (var8 - var18) * this.field4384.field1513 / (float) this.field4384.field1522;
                OpenGL.glTexCoord2f(0.0F, this.field4384.field1517);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field4384.field1517);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!qv", name = "W", descriptor = "(IIIIII)V")
    public final void method143(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4384.method1531(arg3, arg1, arg5, arg4, (byte) 39, arg0, arg2);
        field4391++;
    }

    @OriginalMember(owner = "client!qv", name = "YA", descriptor = "(IIIII)V")
    public final void method133(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4384.method2673(92, false);
        field4396++;
        this.field4397.method2035(127);
        this.field4397.method2061(arg4, (byte) -56);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field4390 + arg1;
        int var7 = this.field4394 + arg0;
        if (this.field4389 == null) {
            this.field4397.method2042(this.field4384, 0);
            this.field4397.method2068(arg2, 13134);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field4384.field1517);
            OpenGL.glVertex2i(var7, var6);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var7, var6 + this.field4384.field1520);
            OpenGL.glTexCoord2f(this.field4384.field1513, 0.0F);
            OpenGL.glVertex2i(this.field4384.field1522 + var7, var6 - -this.field4384.field1520);
            OpenGL.glTexCoord2f(this.field4384.field1513, this.field4384.field1517);
            OpenGL.glVertex2i(this.field4384.field1522 + var7, var6);
            OpenGL.glEnd();
            return;
        }
        this.method1934(0, arg2);
        this.field4389.method2673(-79, false);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field4384.field1517);
        OpenGL.glTexCoord2f(0.0F, this.field4384.field1517);
        OpenGL.glVertex2i(var7, var6);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var7, this.field4384.field1520 + var6);
        OpenGL.glMultiTexCoord2f(33985, this.field4384.field1513, 0.0F);
        OpenGL.glTexCoord2f(this.field4384.field1513, 0.0F);
        OpenGL.glVertex2i(this.field4384.field1522 + var7, this.field4384.field1520 + var6);
        OpenGL.glMultiTexCoord2f(33985, this.field4384.field1513, this.field4384.field1517);
        OpenGL.glTexCoord2f(this.field4384.field1513, this.field4384.field1517);
        OpenGL.glVertex2i(this.field4384.field1522 + var7, var6);
        OpenGL.glEnd();
        this.method1936((byte) 110);
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(B)V")
    public static void method1935(byte arg0) {
        if (arg0 > -124) {
            method1935((byte) -66);
        }
        field4398 = null;
        field4409 = null;
    }

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "(B)V")
    private final void method1936(byte arg0) {
        field4401++;
        this.field4397.method2030(1, (byte) 125);
        this.field4397.method2042(null, 0);
        this.field4397.method2070(110, 8448, 8448);
        this.field4397.method2053(122, 1, 34168, 768);
        this.field4397.method2034(0, 5890, 770, 8960);
        this.field4397.method2030(0, (byte) 17);
        if (arg0 > 33) {
            this.field4397.method2053(23, 1, 34168, 768);
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(FFFFFFLea;II)V")
    public final void method144(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class381 arg6, int arg7, int arg8) {
        field4395++;
        class92 var10 = ((class124) arg6).field1919;
        if (this.field4400) {
            float var11 = (float) this.method134();
            float var12 = (float) this.method131();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field4390 * var15;
            float var18 = (float) this.field4390 * var16;
            float var19 = (float) this.field4394 * var13;
            float var20 = (float) this.field4394 * var14;
            float var21 = (float) this.field4399 * -var13;
            float var22 = (float) this.field4399 * -var14;
            float var23 = (float) this.field4406 * -var15;
            arg0 = arg0 + var19 + var17;
            arg1 = arg1 + var20 + var18;
            float var24 = (float) this.field4406 * -var16;
            arg4 = arg4 + var19 + var23;
            arg3 = arg3 + var22 + var18;
            arg2 = arg2 + var21 + var17;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        this.field4384.method2673(-73, true);
        float var26 = arg5 + arg3 - arg1;
        this.field4397.method2035(125);
        this.field4397.method2042(this.field4384, 0);
        this.field4397.method2068(1, 13134);
        this.field4397.method2030(1, (byte) 50);
        this.field4397.method2042(var10, 0);
        this.field4397.method2070(117, 8448, 7681);
        this.field4397.method2053(56, 0, 34168, 768);
        this.field4397.method2061(1, (byte) -50);
        float var27 = var10.field1513 / (float) var10.field1522;
        float var28 = var10.field1517 / (float) var10.field1520;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field4384.field1517);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + arg0) * var27, var10.field1517 - ((float) (-arg8) + arg1) * var28);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + arg4) * var27, var10.field1517 - (arg5 - (float) arg8) * var28);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field4384.field1513, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (var25 - (float) arg7) * var27, var10.field1517 - (((float) (-arg8) + var26) * var28));
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glMultiTexCoord2f(33984, this.field4384.field1513, this.field4384.field1517);
        OpenGL.glMultiTexCoord2f(33985, (arg2 - (float) arg7) * var27, var10.field1517 - ((float) (-arg8) + arg3) * var28);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field4397.method2053(59, 0, 5890, 768);
        this.field4397.method2068(0, 13134);
        this.field4397.method2042(null, 0);
        this.field4397.method2030(0, (byte) 103);
    }

    @OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(Lqg;IIII)V")
    public class308(class321 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4397 = arg0;
        this.field4384 = class335.method2200(arg4, 1, arg2, arg3, arg1, arg0);
    }

    @OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(Lqg;II[III)V")
    public class308(class321 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field4397 = arg0;
        this.field4384 = class440.method2668(false, arg1, arg2, 3553, arg3, arg0);
    }
}
