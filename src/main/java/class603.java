import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class603 extends class481 {

    @OriginalMember(owner = "client!re", name = "h", descriptor = "I")
    private int field8376 = 0;

    @OriginalMember(owner = "client!re", name = "t", descriptor = "I")
    private int field8388 = 0;

    @OriginalMember(owner = "client!re", name = "w", descriptor = "I")
    private int field8391 = 0;

    @OriginalMember(owner = "client!re", name = "q", descriptor = "Z")
    private boolean field8385 = false;

    @OriginalMember(owner = "client!re", name = "s", descriptor = "I")
    private int field8387 = 0;

    @OriginalMember(owner = "client!re", name = "F", descriptor = "I")
    private int field8400 = 0;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "Lbi;")
    private class483 field8369;

    @OriginalMember(owner = "client!re", name = "v", descriptor = "Lbaa;")
    private class525 field8390;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "Lfia;")
    public static class577 field8372 = new class577(6, 0, 4, 2);

    @OriginalMember(owner = "client!re", name = "p", descriptor = "[I")
    public static int[] field8384 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!re", name = "f", descriptor = "Lkg;")
    public static class275 field8374 = new class275(109, 3);

    @OriginalMember(owner = "client!re", name = "C", descriptor = "I")
    public static int field8397 = -1;

    @OriginalMember(owner = "client!re", name = "D", descriptor = "I")
    public static int field8398 = 0;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public static int field8370;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field8371;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public static int field8373;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    public static int field8375;

    @OriginalMember(owner = "client!re", name = "i", descriptor = "I")
    public static int field8377;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "I")
    public static int field8378;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "I")
    public static int field8379;

    @OriginalMember(owner = "client!re", name = "l", descriptor = "I")
    public static int field8380;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "I")
    public static int field8381;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "I")
    public static int field8382;

    @OriginalMember(owner = "client!re", name = "o", descriptor = "I")
    public static int field8383;

    @OriginalMember(owner = "client!re", name = "r", descriptor = "I")
    public static int field8386;

    @OriginalMember(owner = "client!re", name = "u", descriptor = "I")
    public static int field8389;

    @OriginalMember(owner = "client!re", name = "x", descriptor = "I")
    public static int field8392;

    @OriginalMember(owner = "client!re", name = "y", descriptor = "I")
    public static int field8393;

    @OriginalMember(owner = "client!re", name = "z", descriptor = "I")
    public static int field8394;

    @OriginalMember(owner = "client!re", name = "B", descriptor = "I")
    public static int field8396;

    @OriginalMember(owner = "client!re", name = "E", descriptor = "I")
    public static int field8399;

    @OriginalMember(owner = "client!re", name = "A", descriptor = "Lbaa;")
    private class525 field8395;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIII[III)V", line = 5)
    private final void method3409(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        this.field8390.method1757(arg0, true, arg3, arg6, arg1, arg2, arg4, arg5, (byte) -105);
        field8373++;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(III)V", line = 15)
    public final void method145(int arg0, int arg1, int arg2) {
        field8396++;
        OpenGL.glPixelTransferf(3348, 0.5F);
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field8395 = class39.method237(this.field8390.field7336, arg1, 34037, arg0, this.field8390.field7334, this.field8369);
        this.field8388 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIII)V", line = 38)
    public final void method148(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field8390.method3898(false, 87);
        field8393++;
        this.field8369.method2804((byte) 23);
        this.field8369.method2844(121, arg4);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field8400 + arg0;
        int var7 = this.field8391 + arg1;
        if (this.field8395 == null) {
            this.field8369.method2850(123, this.field8390);
            this.field8369.method2800(arg2, -11);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field8390.field7330);
            OpenGL.glVertex2i(var6, var7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var6, this.field8390.field7336 + var7);
            OpenGL.glTexCoord2f(this.field8390.field7335, 0.0F);
            OpenGL.glVertex2i(this.field8390.field7334 + var6, this.field8390.field7336 + var7);
            OpenGL.glTexCoord2f(this.field8390.field7335, this.field8390.field7330);
            OpenGL.glVertex2i(this.field8390.field7334 + var6, var7);
            OpenGL.glEnd();
            return;
        }
        this.method3412(arg2, 4164);
        this.field8395.method3898(false, 49);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field8390.field7330);
        OpenGL.glTexCoord2f(0.0F, this.field8390.field7330);
        OpenGL.glVertex2i(var6, var7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var6, this.field8390.field7336 + var7);
        OpenGL.glMultiTexCoord2f(33985, this.field8390.field7335, 0.0F);
        OpenGL.glTexCoord2f(this.field8390.field7335, 0.0F);
        OpenGL.glVertex2i(var6 + this.field8390.field7334, this.field8390.field7336 + var7);
        OpenGL.glMultiTexCoord2f(33985, this.field8390.field7335, this.field8390.field7330);
        OpenGL.glTexCoord2f(this.field8390.field7335, this.field8390.field7330);
        OpenGL.glVertex2i(var6 + this.field8390.field7334, var7);
        OpenGL.glEnd();
        this.method3413(111);
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(III)V", line = 90)
    public static final void method3410(int arg0, int arg1, int arg2) {
        field8383++;
        if (class565.field7943 == null || arg1 != 33984) {
            return;
        }
        int var3 = class15.field303;
        int var4 = class405.field5126;
        class151.method1065(arg1 ^ 0x5283C841, arg0, arg2);
        if (class259.field3281 == 0) {
            class55.field761 = null;
            class55.field761 = class565.field7943.method464(class565.field7943.method523(class300.field3937, class631.field8709), class565.field7943.method481(class300.field3937, class631.field8709));
        } else if (class259.field3281 == 1 && (class313.field4093 == null || class15.field303 != var3 || class405.field5126 != var4)) {
            class313.field4093 = new class554[class405.field5126 * class15.field303];
            for (int var5 = 0; var5 < class313.field4093.length; var5++) {
                class313.field4093[var5] = class565.field7943.method464(class565.field7943.method523(class409.field5194, class543.field7592), class565.field7943.method481(class409.field5194, class543.field7592));
            }
            class353.field4537 = new int[class405.field5126 * class15.field303];
            class224.field2988 = 1;
        }
        class563.field7924 = true;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(IIIIIII)V", line = 142)
    public final void method138(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field8389++;
        int var8 = arg0 + arg2;
        int var9 = arg1 + arg3;
        this.field8390.method3898(false, 100);
        this.field8369.method2804((byte) 23);
        this.field8369.method2850(-62, this.field8390);
        this.field8369.method2844(108, arg6);
        this.field8369.method2800(arg4, -118);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field8390.field7339 && !this.field8385) {
            float var10 = (float) arg3 * this.field8390.field7330 / (float) this.field8390.field7336;
            float var11 = (float) arg2 * this.field8390.field7335 / (float) this.field8390.field7334;
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
        OpenGL.glTranslatef((float) this.field8400, (float) this.field8391, 0.0F);
        int var12 = this.method142();
        int var13 = this.method149();
        int var14 = arg1 + this.field8390.field7336;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var9 >= var14) {
            int var20 = this.field8390.field7334 + arg0;
            int var21 = arg0;
            while (var20 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field8390.field7330);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field8390.field7335, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field8390.field7335, this.field8390.field7330);
                OpenGL.glVertex2i(var20, var15);
                var21 += var12;
                var20 += var12;
            }
            if (var8 > var21) {
                float var22 = (float) (var8 - var21) * this.field8390.field7335 / (float) this.field8390.field7334;
                OpenGL.glTexCoord2f(0.0F, this.field8390.field7330);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field8390.field7330);
                OpenGL.glVertex2i(var8, var15);
            }
            var15 += var13;
            var14 += var13;
        }
        if (var15 < var9) {
            float var16 = (float) (var15 + this.field8390.field7336 - var9) * this.field8390.field7330 / (float) this.field8390.field7336;
            int var17 = this.field8390.field7334 + arg0;
            int var18 = arg0;
            while (var8 >= var17) {
                OpenGL.glTexCoord2f(0.0F, this.field8390.field7330);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field8390.field7335, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field8390.field7335, this.field8390.field7330);
                OpenGL.glVertex2i(var17, var15);
                var18 += var12;
                var17 += var12;
            }
            if (var18 < var8) {
                float var19 = (float) (var8 - var18) * this.field8390.field7335 / (float) this.field8390.field7334;
                OpenGL.glTexCoord2f(0.0F, this.field8390.field7330);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field8390.field7330);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIIIII)V", line = 281)
    public final void method151(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field8377++;
        this.field8390.method3898((arg7 & 0x1) != 0, 31);
        this.field8369.method2804((byte) 23);
        this.field8369.method2844(112, arg6);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field8385) {
            float var9 = (float) arg2 / (float) this.method142();
            float var10 = (float) arg3 / (float) this.method149();
            float var11 = (float) this.field8400 * var9 + (float) arg0;
            float var12 = (float) this.field8391 * var10 + (float) arg1;
            float var13 = (float) this.field8390.field7334 * var9 + var11;
            float var14 = (float) this.field8390.field7336 * var10 + var12;
            if (this.field8395 == null) {
                this.field8369.method2850(-30, this.field8390);
                this.field8369.method2800(arg4, -3);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field8390.field7330);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glTexCoord2f(this.field8390.field7335, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glTexCoord2f(this.field8390.field7335, this.field8390.field7330);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
            } else {
                this.method3412(arg4, 4164);
                this.field8395.method3898(true, 14);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field8390.field7330);
                OpenGL.glTexCoord2f(0.0F, this.field8390.field7330);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field8390.field7335, 0.0F);
                OpenGL.glTexCoord2f(this.field8390.field7335, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field8390.field7335, this.field8390.field7330);
                OpenGL.glTexCoord2f(this.field8390.field7335, this.field8390.field7330);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
                this.method3413(107);
            }
        } else if (this.field8395 == null) {
            this.field8369.method2850(-66, this.field8390);
            this.field8369.method2800(arg4, -107);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field8390.field7330);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field8390.field7335, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field8390.field7335, this.field8390.field7330);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method3412(arg4, 4164);
            this.field8395.method3898(true, 76);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field8390.field7330);
            OpenGL.glTexCoord2f(0.0F, this.field8390.field7330);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field8390.field7335, 0.0F);
            OpenGL.glTexCoord2f(this.field8390.field7335, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field8390.field7335, this.field8390.field7330);
            OpenGL.glTexCoord2f(this.field8390.field7335, this.field8390.field7330);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method3413(112);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IILaa;II)V", line = 385)
    public final void method140(int arg0, int arg1, class489 arg2, int arg3, int arg4) {
        field8375++;
        class622 var6 = (class622) arg2;
        class525 var7 = var6.field8565;
        this.field8390.method3898(false, 47);
        this.field8369.method2804((byte) 23);
        this.field8369.method2850(-53, this.field8390);
        this.field8369.method2800(1, -111);
        this.field8369.method2847(1, false);
        this.field8369.method2850(77, var7);
        this.field8369.method2799(-27874, 7681, 8448);
        this.field8369.method2775(34168, (byte) -88, 768, 0);
        this.field8369.method2844(123, 1);
        int var8 = this.field8391 + arg1;
        int var9 = this.field8400 + arg0;
        int var10 = this.field8390.field7334 + var9;
        int var11 = this.field8390.field7336 + var8;
        float var12 = var7.field7335 / (float) var7.field7334;
        float var13 = var7.field7330 / (float) var7.field7336;
        float var14 = (float) (var9 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field7330 - (float) (var8 - arg4) * var13;
        float var17 = var7.field7330 - ((float) (var11 - arg4) * var13);
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field8390.field7330);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var9, var8);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var9, this.field8390.field7336 + var8);
        OpenGL.glMultiTexCoord2f(33984, this.field8390.field7335, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(this.field8390.field7334 + var9, var8 - -this.field8390.field7336);
        OpenGL.glMultiTexCoord2f(33984, this.field8390.field7335, this.field8390.field7330);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(this.field8390.field7334 + var9, var8);
        OpenGL.glEnd();
        this.field8369.method2775(5890, (byte) -88, 768, 0);
        this.field8369.method2800(0, 127);
        this.field8369.method2850(83, null);
        this.field8369.method2847(0, false);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(FFFFFFIIII)V", line = 444)
    public final void method150(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field8385) {
            float var11 = (float) this.method142();
            float var12 = (float) this.method149();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field8391 * var15;
            float var18 = (float) this.field8391 * var16;
            float var19 = (float) this.field8400 * var13;
            float var20 = (float) this.field8400 * var14;
            float var21 = (float) this.field8387 * -var13;
            float var22 = (float) this.field8387 * -var14;
            float var23 = (float) this.field8376 * -var15;
            arg1 = arg1 + var20 + var18;
            arg2 = arg2 + var21 + var17;
            float var24 = (float) this.field8376 * -var16;
            arg3 = arg3 + var22 + var18;
            arg4 = arg4 + var19 + var23;
            arg0 = arg0 + var19 + var17;
            arg5 = arg5 + var20 + var24;
        }
        field8399++;
        float var25 = arg2 + arg4 - arg0;
        this.field8390.method3898((arg9 & 0x1) != 0, 99);
        float var26 = arg5 + arg3 - arg1;
        this.field8369.method2804((byte) 23);
        this.field8369.method2850(108, this.field8390);
        this.field8369.method2844(122, arg8);
        this.field8369.method2800(arg6, -19);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field8390.field7330);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field8390.field7335, 0.0F);
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glTexCoord2f(this.field8390.field7335, this.field8390.field7330);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lbi;IIZ)V", line = 798)
    public class603(class483 arg0, int arg1, int arg2, boolean arg3) {
        this.field8369 = arg0;
        this.field8390 = class255.method1555(arg1, arg3 ? 6408 : 6407, arg0, false, arg2);
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lbi;IIII)V", line = 808)
    public class603(class483 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field8369 = arg0;
        this.field8390 = class39.method237(arg4, arg2, 34037, arg1, arg3, arg0);
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lbi;II[III)V", line = 818)
    public class603(class483 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field8369 = arg0;
        this.field8390 = class700.method3934(arg3, arg4, arg5, arg0, true, arg2, false, arg1);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "([I)V", line = 518)
    public final void method152(int[] arg0) {
        arg0[3] = this.field8376;
        field8382++;
        arg0[2] = this.field8387;
        arg0[1] = this.field8391;
        arg0[0] = this.field8400;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V", line = 540)
    public static void method3411(int arg0) {
        field8384 = null;
        field8374 = null;
        if (arg0 <= 83) {
            field8372 = null;
        }
        field8372 = null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "()I", line = 552)
    public final int method142() {
        field8379++;
        return this.field8390.field7334 + this.field8387 + this.field8400;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(FFFFFFILaa;II)V", line = 567)
    public final void method146(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class489 arg7, int arg8, int arg9) {
        field8370++;
        class525 var11 = ((class622) arg7).field8565;
        if (this.field8385) {
            float var12 = (float) this.method142();
            float var13 = (float) this.method149();
            float var14 = (arg2 - arg0) / var12;
            float var15 = (arg3 - arg1) / var12;
            float var16 = (arg4 - arg0) / var13;
            float var17 = (arg5 - arg1) / var13;
            float var18 = (float) this.field8391 * var16;
            float var19 = (float) this.field8391 * var17;
            float var20 = (float) this.field8400 * var14;
            float var21 = (float) this.field8400 * var15;
            float var22 = (float) this.field8387 * -var14;
            float var23 = (float) this.field8387 * -var15;
            float var24 = (float) this.field8376 * -var16;
            arg2 = arg2 + var22 + var18;
            arg4 = arg4 + var20 + var24;
            float var25 = (float) this.field8376 * -var17;
            arg1 = arg1 + var21 + var19;
            arg3 = arg3 + var23 + var19;
            arg0 = arg0 + var20 + var18;
            arg5 = arg5 + var21 + var25;
        }
        float var26 = arg2 + arg4 - arg0;
        this.field8390.method3898((arg6 & 0x1) != 0, 111);
        float var27 = arg5 + arg3 - arg1;
        this.field8369.method2804((byte) 23);
        this.field8369.method2850(-91, this.field8390);
        this.field8369.method2800(1, -20);
        this.field8369.method2847(1, false);
        this.field8369.method2850(108, var11);
        this.field8369.method2799(-27874, 7681, 8448);
        this.field8369.method2775(34168, (byte) -88, 768, 0);
        this.field8369.method2844(114, 1);
        float var28 = var11.field7335 / (float) var11.field7334;
        float var29 = var11.field7330 / (float) var11.field7336;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field8390.field7330);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + arg0) * var28, var11.field7330 - ((float) (-arg9) + arg1) * var29);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg8) * var28, var11.field7330 - ((float) (-arg9) + arg5) * var29);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field8390.field7335, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (var26 - (float) arg8) * var28, var11.field7330 - ((float) (-arg9) + var27) * var29);
        OpenGL.glVertex2f(var26, var27);
        OpenGL.glMultiTexCoord2f(33984, this.field8390.field7335, this.field8390.field7330);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + arg2) * var28, var11.field7330 - (arg3 - (float) arg9) * var29);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field8369.method2775(5890, (byte) -88, 768, 0);
        this.field8369.method2800(0, 126);
        this.field8369.method2850(-120, null);
        this.field8369.method2847(0, false);
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "()I", line = 652)
    public final int method144() {
        field8371++;
        return this.field8390.field7336;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIII)V", line = 660)
    public final void method147(int arg0, int arg1, int arg2, int arg3) {
        this.field8376 = arg3;
        this.field8400 = arg0;
        this.field8387 = arg2;
        field8378++;
        this.field8391 = arg1;
        this.field8385 = this.field8400 != 0 || this.field8391 != 0 || this.field8387 != 0 || this.field8376 != 0;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(II)V", line = 676)
    private final void method3412(int arg0, int arg1) {
        field8392++;
        this.field8369.method2847(1, false);
        this.field8369.method2850(103, this.field8390);
        this.field8369.method2799(-27874, this.field8369.method2817(23013, arg0), 7681);
        this.field8369.method2775(34167, (byte) -88, 768, 1);
        if (arg1 != 4164) {
            return;
        }
        this.field8369.method2788(770, 34168, false, 0);
        this.field8369.method2847(0, false);
        this.field8369.method2850(-78, this.field8395);
        this.field8369.method2799(-27874, 34479, 7681);
        this.field8369.method2775(34166, (byte) -88, 768, 1);
        if (this.field8388 == 0) {
            this.field8369.method2825((byte) 110, 0.5F, 0.0F, 1.0F, 0.5F);
        } else if (this.field8388 == 1) {
            this.field8369.method2825((byte) 48, 1.0F, 0.0F, 0.5F, 0.5F);
        } else if (this.field8388 == 2) {
            this.field8369.method2825((byte) -124, 0.5F, 0.0F, 0.5F, 1.0F);
        } else if (this.field8388 == 3) {
            this.field8369.method2825((byte) -101, 128.5F, 0.0F, 128.5F, 128.5F);
            return;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIII)V", line = 711)
    public final void method154(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field8386++;
        if (!this.field8369.field6825) {
            this.field8390.method1761(arg1, arg3, arg2, arg4, 4, arg5, arg0);
            return;
        }
        int[] var7 = this.field8369.method465(arg4, arg5, arg2, arg3);
        if (var7 == null) {
            return;
        }
        for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = class683.method3840(var7[var8], -16777216);
        }
        this.method3409(arg0, arg1, arg2, arg3, var7, 0, arg2);
        return;
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "()I", line = 746)
    public final int method143() {
        field8380++;
        return this.field8390.field7334;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V", line = 754)
    private final void method3413(int arg0) {
        this.field8369.method2847(1, false);
        field8394++;
        if (arg0 <= 104) {
            this.field8387 = 83;
        }
        this.field8369.method2850(124, null);
        this.field8369.method2799(-27874, 8448, 8448);
        this.field8369.method2775(34168, (byte) -88, 768, 1);
        this.field8369.method2788(770, 5890, false, 0);
        this.field8369.method2847(0, false);
        this.field8369.method2775(34168, (byte) -88, 768, 1);
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "()I", line = 785)
    public final int method149() {
        field8381++;
        return this.field8390.field7336 + this.field8376 + this.field8391;
    }
}
