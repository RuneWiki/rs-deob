import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class29 extends class359 {

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "I")
    private int field421 = 0;

    @OriginalMember(owner = "client!ap", name = "f", descriptor = "I")
    private int field423 = 0;

    @OriginalMember(owner = "client!ap", name = "q", descriptor = "I")
    private int field434 = 0;

    @OriginalMember(owner = "client!ap", name = "n", descriptor = "I")
    private int field431 = 0;

    @OriginalMember(owner = "client!ap", name = "k", descriptor = "I")
    private int field428 = 0;

    @OriginalMember(owner = "client!ap", name = "B", descriptor = "Z")
    private boolean field445 = false;

    @OriginalMember(owner = "client!ap", name = "m", descriptor = "Lpg;")
    private class333 field430;

    @OriginalMember(owner = "client!ap", name = "D", descriptor = "Lgq;")
    private class241 field446;

    @OriginalMember(owner = "client!ap", name = "j", descriptor = "I")
    public static int field427 = 999999;

    @OriginalMember(owner = "client!ap", name = "r", descriptor = "Lkc;")
    public static class157 field435 = new class157("wave:", "welle:", "ondulation:", "onda:");

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!ap", name = "e", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!ap", name = "h", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!ap", name = "i", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!ap", name = "l", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!ap", name = "o", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!ap", name = "p", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!ap", name = "s", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!ap", name = "t", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!ap", name = "u", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!ap", name = "v", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!ap", name = "w", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!ap", name = "x", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!ap", name = "y", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!ap", name = "z", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!ap", name = "A", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!ap", name = "E", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!ap", name = "F", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!ap", name = "g", descriptor = "Lgq;")
    private class241 field424;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIIIZI)V")
    public static final void method199(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        class375.field5391 = arg1;
        field420++;
        if (arg3 >= -7) {
            method213(-77, (byte) 109, 127, true, true);
        }
        class529.field7787 = arg6;
        class51.field750 = arg2;
        class187.field2753 = arg0;
        class300.field4106 = arg4;
        if (arg5 && class375.field5391 >= 100) {
            class108.field1747 = class187.field2753 * 128 + 64;
            class118.field1848 = class51.field750 * 128 + 64;
            class159.field2421 = class123.method893(class108.field1747, class118.field1848, (byte) -13, class366.field5260) - class300.field4106;
        }
        class247.field3363 = 2;
    }

    @OriginalMember(owner = "client!ap", name = "ZA", descriptor = "()I")
    public final int method200() {
        field448++;
        return this.field446.field3324;
    }

    @OriginalMember(owner = "client!ap", name = "oa", descriptor = "(III)V")
    public final void method201(int arg0, int arg1, int arg2) {
        field436++;
        OpenGL.glPixelTransferf(3348, 0.5F);
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field424 = class95.method771(true, this.field446.field3326, this.field446.field3324, arg1, arg0, this.field430);
        this.field434 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!ap", name = "XA", descriptor = "(IIIIII)V")
    public final void method202(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field437++;
        this.field446.method993(arg3, arg2, arg4, (byte) -98, arg5, arg1, arg0);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IILta;II)V")
    public final void method203(int arg0, int arg1, class336 arg2, int arg3, int arg4) {
        field426++;
        class397 var6 = (class397) arg2;
        class241 var7 = var6.field5703;
        this.field446.method928(107, false);
        this.field430.method2032(false);
        this.field430.method1977(this.field446, true);
        this.field430.method1966(-1, 1);
        this.field430.method1990(false, 1);
        this.field430.method1977(var7, true);
        this.field430.method2023(7681, 8448, 2929);
        this.field430.method2040(false, 0, 768, 34168);
        this.field430.method2033(1, -1743);
        int var8 = this.field428 + arg0;
        int var9 = this.field421 + arg1;
        int var10 = var8 + this.field446.field3326;
        int var11 = this.field446.field3324 + var9;
        float var12 = var7.field3329 / (float) var7.field3326;
        float var13 = var7.field3325 / (float) var7.field3324;
        float var14 = (float) (var8 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field3325 - (float) (var9 - arg4) * var13;
        float var17 = var7.field3325 - (float) (var11 - arg4) * var13;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field446.field3325);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var8, var9);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var8, this.field446.field3324 + var9);
        OpenGL.glMultiTexCoord2f(33984, this.field446.field3329, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(this.field446.field3326 + var8, var9 - -this.field446.field3324);
        OpenGL.glMultiTexCoord2f(33984, this.field446.field3329, this.field446.field3325);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(this.field446.field3326 + var8, var9);
        OpenGL.glEnd();
        this.field430.method2040(false, 0, 768, 5890);
        this.field430.method1966(-1, 0);
        this.field430.method1977(null, true);
        this.field430.method1990(false, 0);
    }

    @OriginalMember(owner = "client!ap", name = "RA", descriptor = "()I")
    public final int method204() {
        field444++;
        return this.field446.field3326 - (-this.field431 - this.field428);
    }

    @OriginalMember(owner = "client!ap", name = "YA", descriptor = "()I")
    public final int method205() {
        field432++;
        return this.field446.field3326;
    }

    @OriginalMember(owner = "client!ap", name = "ya", descriptor = "(IIIIIII)V")
    public final void method206(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field429++;
        this.field446.method928(96, true);
        this.field430.method2032(false);
        this.field430.method2033(arg6, -1743);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field445) {
            float var8 = (float) arg2 / (float) this.method204();
            float var9 = (float) arg3 / (float) this.method207();
            float var10 = (float) this.field428 * var8 + (float) arg0;
            float var11 = (float) this.field421 * var9 + (float) arg1;
            float var12 = (float) this.field446.field3326 * var8 + var10;
            float var13 = (float) this.field446.field3324 * var9 + var11;
            if (this.field424 == null) {
                this.field430.method1977(this.field446, true);
                this.field430.method1966(-1, arg4);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field446.field3325);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glTexCoord2f(this.field446.field3329, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glTexCoord2f(this.field446.field3329, this.field446.field3325);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
            } else {
                this.method219((byte) -128, arg4);
                this.field424.method928(107, true);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field446.field3325);
                OpenGL.glTexCoord2f(0.0F, this.field446.field3325);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field446.field3329, 0.0F);
                OpenGL.glTexCoord2f(this.field446.field3329, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field446.field3329, this.field446.field3325);
                OpenGL.glTexCoord2f(this.field446.field3329, this.field446.field3325);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
                this.method217(true);
            }
        } else if (this.field424 == null) {
            this.field430.method1977(this.field446, true);
            this.field430.method1966(-1, arg4);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field446.field3325);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field446.field3329, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 - -arg3);
            OpenGL.glTexCoord2f(this.field446.field3329, this.field446.field3325);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method219((byte) -127, arg4);
            this.field424.method928(100, true);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field446.field3325);
            OpenGL.glTexCoord2f(0.0F, this.field446.field3325);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field446.field3329, 0.0F);
            OpenGL.glTexCoord2f(this.field446.field3329, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 - -arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field446.field3329, this.field446.field3325);
            OpenGL.glTexCoord2f(this.field446.field3329, this.field446.field3325);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method217(true);
        }
    }

    @OriginalMember(owner = "client!ap", name = "Q", descriptor = "()I")
    public final int method207() {
        field447++;
        return this.field446.field3324 + this.field423 + this.field421;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
    public static final String[] method208(int arg0, String[] arg1) {
        field418++;
        String[] var2 = new String[5];
        for (int var3 = arg0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ap", name = "H", descriptor = "(FFFFFFIII)V")
    public final void method209(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        field433++;
        if (this.field445) {
            float var10 = (float) this.method204();
            float var11 = (float) this.method207();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field421 * var14;
            float var17 = (float) this.field421 * var15;
            float var18 = (float) this.field428 * var12;
            float var19 = (float) this.field428 * var13;
            float var20 = (float) this.field431 * -var12;
            float var21 = (float) this.field431 * -var13;
            float var22 = (float) this.field423 * -var14;
            arg0 = arg0 + var18 + var16;
            arg2 = arg2 + var20 + var16;
            arg1 = arg1 + var19 + var17;
            arg3 = arg3 + var21 + var17;
            arg4 = arg4 + var18 + var22;
            float var23 = (float) this.field423 * -var15;
            arg5 = arg5 + var19 + var23;
        }
        float var24 = arg2 + arg4 - arg0;
        float var25 = arg5 + arg3 - arg1;
        this.field446.method928(105, true);
        this.field430.method2032(false);
        this.field430.method1977(this.field446, true);
        this.field430.method2033(arg8, -1743);
        this.field430.method1966(-1, arg6);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field446.field3325);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field446.field3329, 0.0F);
        OpenGL.glVertex2f(var24, var25);
        OpenGL.glTexCoord2f(this.field446.field3329, this.field446.field3325);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ap", name = "ha", descriptor = "(IIII)V")
    public final void method210(int arg0, int arg1, int arg2, int arg3) {
        this.field423 = arg3;
        field439++;
        this.field428 = arg0;
        this.field431 = arg2;
        this.field421 = arg1;
        this.field445 = this.field428 != 0 || this.field421 != 0 || this.field431 != 0 || this.field423 != 0;
    }

    @OriginalMember(owner = "client!ap", name = "la", descriptor = "(IIIIIII)V")
    public final void method211(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field442++;
        int var8 = arg0 + arg2;
        this.field446.method928(106, false);
        int var9 = arg1 + arg3;
        this.field430.method2032(false);
        this.field430.method1977(this.field446, true);
        this.field430.method2033(arg6, -1743);
        this.field430.method1966(-1, arg4);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field446.field3328 && !this.field445) {
            float var10 = (float) arg3 * this.field446.field3325 / (float) this.field446.field3324;
            float var11 = (float) arg2 * this.field446.field3329 / (float) this.field446.field3326;
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
        OpenGL.glTranslatef((float) this.field428, (float) this.field421, 0.0F);
        int var12 = this.method204();
        int var13 = this.method207();
        int var14 = this.field446.field3324 + arg1;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var14 <= var9) {
            int var20 = this.field446.field3326 + arg0;
            int var21 = arg0;
            while (var20 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field446.field3325);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field446.field3329, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field446.field3329, this.field446.field3325);
                OpenGL.glVertex2i(var20, var15);
                var20 += var12;
                var21 += var12;
            }
            if (var21 < var8) {
                float var22 = (float) (var8 - var21) * this.field446.field3329 / (float) this.field446.field3326;
                OpenGL.glTexCoord2f(0.0F, this.field446.field3325);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field446.field3325);
                OpenGL.glVertex2i(var8, var15);
            }
            var14 += var13;
            var15 += var13;
        }
        if (var15 < var9) {
            float var16 = (float) (var15 + this.field446.field3324 - var9) * this.field446.field3325 / (float) this.field446.field3324;
            int var17 = this.field446.field3326 + arg0;
            int var18 = arg0;
            while (var17 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field446.field3325);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field446.field3329, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field446.field3329, this.field446.field3325);
                OpenGL.glVertex2i(var17, var15);
                var18 += var12;
                var17 += var12;
            }
            if (var8 > var18) {
                float var19 = (float) (var8 - var18) * this.field446.field3329 / (float) this.field446.field3326;
                OpenGL.glTexCoord2f(0.0F, this.field446.field3325);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field446.field3325);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIIIIIBII)V")
    public static final void method212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9) {
        if (arg1 == arg3 && arg2 == arg6 && arg5 == arg9 && arg4 == arg8) {
            class423.method2526(arg5, (byte) -122, arg2, arg0, arg4, arg1);
        } else {
            int var10 = arg1;
            int var11 = arg2;
            int var12 = arg1 * 3;
            int var13 = arg2 * 3;
            int var14 = arg3 * 3;
            int var15 = arg6 * 3;
            int var16 = arg9 * 3;
            int var17 = arg8 * 3;
            int var18 = arg5 - (var16 + arg1 - var14);
            int var19 = arg4 + var15 - (var17 + arg2);
            int var20 = var16 + var12 - var14 - var14;
            int var21 = var13 + var17 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var29 + var31 >> 12) + arg1;
                int var34 = (var28 + var32 + var30 >> 12) + arg2;
                class423.method2526(var33, (byte) -78, var11, arg0, var34, var10);
                var10 = var33;
                var11 = var34;
            }
        }
        if (arg7 > 62) {
            field443++;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IBIZZ)V")
    public static final void method213(int arg0, byte arg1, int arg2, boolean arg3, boolean arg4) {
        class114.method857(class504.field7378.length - 1, arg4, arg2, -1, arg0, 0, arg3);
        field441++;
        if (arg1 == -21) {
            class375.field5395 = null;
            class429.field6224 = 0;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)I")
    public static final int method214(int arg0) {
        if (arg0 >= 0) {
            method208(-43, null);
        }
        field425++;
        return 6;
    }

    @OriginalMember(owner = "client!ap", name = "W", descriptor = "(IIIII)V")
    public final void method215(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field446.method928(113, false);
        field419++;
        this.field430.method2032(false);
        this.field430.method2033(arg4, -1743);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field421 + arg1;
        int var7 = this.field428 + arg0;
        if (this.field424 == null) {
            this.field430.method1977(this.field446, true);
            this.field430.method1966(-1, arg2);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field446.field3325);
            OpenGL.glVertex2i(var7, var6);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var7, var6 + this.field446.field3324);
            OpenGL.glTexCoord2f(this.field446.field3329, 0.0F);
            OpenGL.glVertex2i(this.field446.field3326 + var7, this.field446.field3324 + var6);
            OpenGL.glTexCoord2f(this.field446.field3329, this.field446.field3325);
            OpenGL.glVertex2i(this.field446.field3326 + var7, var6);
            OpenGL.glEnd();
            return;
        }
        this.method219((byte) 23, arg2);
        this.field424.method928(109, false);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field446.field3325);
        OpenGL.glTexCoord2f(0.0F, this.field446.field3325);
        OpenGL.glVertex2i(var7, var6);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var7, this.field446.field3324 + var6);
        OpenGL.glMultiTexCoord2f(33985, this.field446.field3329, 0.0F);
        OpenGL.glTexCoord2f(this.field446.field3329, 0.0F);
        OpenGL.glVertex2i(this.field446.field3326 + var7, var6 - -this.field446.field3324);
        OpenGL.glMultiTexCoord2f(33985, this.field446.field3329, this.field446.field3325);
        OpenGL.glTexCoord2f(this.field446.field3329, this.field446.field3325);
        OpenGL.glVertex2i(this.field446.field3326 + var7, var6);
        OpenGL.glEnd();
        this.method217(true);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(FFFFFFLta;II)V")
    public final void method216(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class336 arg6, int arg7, int arg8) {
        field438++;
        class241 var10 = ((class397) arg6).field5703;
        if (this.field445) {
            float var11 = (float) this.method204();
            float var12 = (float) this.method207();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field421 * var15;
            float var18 = (float) this.field421 * var16;
            float var19 = (float) this.field428 * var13;
            float var20 = (float) this.field428 * var14;
            float var21 = (float) this.field431 * -var13;
            float var22 = (float) this.field431 * -var14;
            float var23 = (float) this.field423 * -var15;
            arg2 = arg2 + var21 + var17;
            arg3 = arg3 + var22 + var18;
            float var24 = (float) this.field423 * -var16;
            arg4 = arg4 + var19 + var23;
            arg1 = arg1 + var20 + var18;
            arg0 = arg0 + var19 + var17;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        this.field446.method928(117, true);
        this.field430.method2032(false);
        this.field430.method1977(this.field446, true);
        this.field430.method1966(-1, 1);
        this.field430.method1990(false, 1);
        this.field430.method1977(var10, true);
        this.field430.method2023(7681, 8448, 2929);
        this.field430.method2040(false, 0, 768, 34168);
        this.field430.method2033(1, -1743);
        float var27 = var10.field3329 / (float) var10.field3326;
        float var28 = var10.field3325 / (float) var10.field3324;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field446.field3325);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + arg0) * var27, var10.field3325 - (arg1 - (float) arg8) * var28);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * var27, var10.field3325 - (((float) (-arg8) + arg5) * var28));
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field446.field3329, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + var25) * var27, var10.field3325 - (((float) (-arg8) + var26) * var28));
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glMultiTexCoord2f(33984, this.field446.field3329, this.field446.field3325);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + arg2) * var27, var10.field3325 - ((float) (-arg8) + arg3) * var28);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field430.method2040(false, 0, 768, 5890);
        this.field430.method1966(-1, 0);
        this.field430.method1977(null, true);
        this.field430.method1990(false, 0);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Z)V")
    private final void method217(boolean arg0) {
        field422++;
        this.field430.method1990(false, 1);
        this.field430.method1977(null, arg0);
        this.field430.method2023(8448, 8448, 2929);
        this.field430.method2040(false, 1, 768, 34168);
        this.field430.method1994(0, 770, 5890, 8960);
        this.field430.method1990(false, 0);
        this.field430.method2040(!arg0, 1, 768, 34168);
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(I)V")
    public static void method218(int arg0) {
        if (arg0 != 0) {
            method208(-68, null);
        }
        field435 = null;
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Lpg;IIII)V")
    public class29(class333 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field430 = arg0;
        this.field446 = class95.method771(true, arg3, arg4, arg2, arg1, arg0);
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Lpg;II[III)V")
    public class29(class333 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field430 = arg0;
        this.field446 = class100.method789(arg3, arg1, arg0, arg2, false, -55);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(BI)V")
    private final void method219(byte arg0, int arg1) {
        this.field430.method1990(false, 1);
        field440++;
        this.field430.method1977(this.field446, true);
        this.field430.method2023(this.field430.method2039(arg1, 260), 7681, 2929);
        this.field430.method2040(false, 1, 768, 34167);
        this.field430.method1994(0, 770, 34168, 8960);
        this.field430.method1990(false, 0);
        this.field430.method1977(this.field424, true);
        this.field430.method2023(34479, 7681, 2929);
        this.field430.method2040(false, 1, 768, 34166);
        int var3 = -99 % ((arg0 + 73) / 52);
        if (this.field434 == 0) {
            this.field430.method2007(1.0F, 0.5F, true, 0.0F, 0.5F);
        } else if (this.field434 == 1) {
            this.field430.method2007(0.5F, 0.5F, true, 0.0F, 1.0F);
        } else if (this.field434 == 2) {
            this.field430.method2007(0.5F, 1.0F, true, 0.0F, 0.5F);
        } else if (this.field434 == 3) {
            this.field430.method2007(128.5F, 128.5F, true, 0.0F, 128.5F);
            return;
        }
    }

    static {
        new class157("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
    }
}
