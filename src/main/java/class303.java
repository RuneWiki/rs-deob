import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class303 extends class85 {

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "I")
    private int field4357 = 0;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    private int field4346 = 0;

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "Z")
    private boolean field4361 = false;

    @OriginalMember(owner = "client!qg", name = "y", descriptor = "I")
    private int field4369 = 0;

    @OriginalMember(owner = "client!qg", name = "C", descriptor = "I")
    private int field4373 = 0;

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "I")
    private int field4355 = 0;

    @OriginalMember(owner = "client!qg", name = "A", descriptor = "Llea;")
    private class573 field4371;

    @OriginalMember(owner = "client!qg", name = "w", descriptor = "Luk;")
    private class296 field4367;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "S")
    public static short field4353 = 205;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "Z")
    public static boolean field4345 = false;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!qg", name = "r", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!qg", name = "t", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!qg", name = "u", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!qg", name = "v", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!qg", name = "x", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!qg", name = "z", descriptor = "I")
    public static int field4370;

    @OriginalMember(owner = "client!qg", name = "B", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!qg", name = "D", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "Luk;")
    private class296 field4351;

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "Lmq;")
    public static class85 field4359;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qg", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field4375;

    // $FF: synthetic method
    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1887(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V", line = 5)
    public static void method1882(int arg0) {
        field4359 = null;
        if (arg0 != 19512) {
            field4345 = true;
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "()I", line = 19)
    public final int method5() {
        field4365++;
        return this.field4367.field4305;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIII[III)V", line = 28)
    private final void method1883(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        field4354++;
        this.field4367.method2946(arg4, arg2, arg6, arg1, arg0, true, arg3, arg5, true);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIII)V", line = 38)
    public final void method6(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4367.method2266(105, false);
        field4370++;
        this.field4371.method3320(26936);
        this.field4371.method3308((byte) 76, arg4);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field4346 + arg1;
        int var7 = this.field4357 + arg0;
        if (this.field4351 == null) {
            this.field4371.method3384(this.field4367, (byte) 51);
            this.field4371.method3375(arg2, (byte) 102);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field4367.field4303);
            OpenGL.glVertex2i(var7, var6);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var7, var6 + this.field4367.field4305);
            OpenGL.glTexCoord2f(this.field4367.field4299, 0.0F);
            OpenGL.glVertex2i(this.field4367.field4301 + var7, this.field4367.field4305 + var6);
            OpenGL.glTexCoord2f(this.field4367.field4299, this.field4367.field4303);
            OpenGL.glVertex2i(this.field4367.field4301 + var7, var6);
            OpenGL.glEnd();
            return;
        }
        this.method1884(34166, arg2);
        this.field4351.method2266(22, false);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field4367.field4303);
        OpenGL.glTexCoord2f(0.0F, this.field4367.field4303);
        OpenGL.glVertex2i(var7, var6);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var7, this.field4367.field4305 + var6);
        OpenGL.glMultiTexCoord2f(33985, this.field4367.field4299, 0.0F);
        OpenGL.glTexCoord2f(this.field4367.field4299, 0.0F);
        OpenGL.glVertex2i(this.field4367.field4301 + var7, this.field4367.field4305 + var6);
        OpenGL.glMultiTexCoord2f(33985, this.field4367.field4299, this.field4367.field4303);
        OpenGL.glTexCoord2f(this.field4367.field4299, this.field4367.field4303);
        OpenGL.glVertex2i(this.field4367.field4301 + var7, var6);
        OpenGL.glEnd();
        this.method1885(-127);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIIII)V", line = 89)
    public final void method8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4347++;
        int var8 = arg0 + arg2;
        this.field4367.method2266(75, false);
        int var9 = arg1 + arg3;
        this.field4371.method3320(26936);
        this.field4371.method3384(this.field4367, (byte) 93);
        this.field4371.method3308((byte) 76, arg6);
        this.field4371.method3375(arg4, (byte) 102);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field4367.field4306 && !this.field4361) {
            float var10 = (float) arg3 * this.field4367.field4303 / (float) this.field4367.field4305;
            float var11 = (float) arg2 * this.field4367.field4299 / (float) this.field4367.field4301;
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
        OpenGL.glTranslatef((float) this.field4357, (float) this.field4346, 0.0F);
        int var12 = this.method11();
        int var13 = this.method14();
        int var14 = this.field4367.field4305 + arg1;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var9 >= var14) {
            int var20 = arg0 + this.field4367.field4301;
            int var21 = arg0;
            while (var20 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field4367.field4303);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field4367.field4299, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field4367.field4299, this.field4367.field4303);
                OpenGL.glVertex2i(var20, var15);
                var20 += var12;
                var21 += var12;
            }
            if (var8 > var21) {
                float var22 = (float) (var8 - var21) * this.field4367.field4299 / (float) this.field4367.field4301;
                OpenGL.glTexCoord2f(0.0F, this.field4367.field4303);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field4367.field4303);
                OpenGL.glVertex2i(var8, var15);
            }
            var15 += var13;
            var14 += var13;
        }
        if (var15 < var9) {
            float var16 = (float) (this.field4367.field4305 + var15 - var9) * this.field4367.field4303 / (float) this.field4367.field4305;
            int var17 = this.field4367.field4301 + arg0;
            int var18 = arg0;
            while (var17 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field4367.field4303);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field4367.field4299, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field4367.field4299, this.field4367.field4303);
                OpenGL.glVertex2i(var17, var15);
                var17 += var12;
                var18 += var12;
            }
            if (var18 < var8) {
                float var19 = (float) (var8 - var18) * this.field4367.field4299 / (float) this.field4367.field4301;
                OpenGL.glTexCoord2f(0.0F, this.field4367.field4303);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field4367.field4303);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIIIII)V", line = 227)
    public final void method10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4368++;
        this.field4367.method2266(102, (arg7 & 0x1) != 0);
        this.field4371.method3320(26936);
        this.field4371.method3308((byte) 76, arg6);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field4361) {
            float var9 = (float) arg2 / (float) this.method11();
            float var10 = (float) arg3 / (float) this.method14();
            float var11 = (float) this.field4357 * var9 + (float) arg0;
            float var12 = (float) this.field4346 * var10 + (float) arg1;
            float var13 = (float) this.field4367.field4301 * var9 + var11;
            float var14 = (float) this.field4367.field4305 * var10 + var12;
            if (this.field4351 == null) {
                this.field4371.method3384(this.field4367, (byte) 108);
                this.field4371.method3375(arg4, (byte) 102);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field4367.field4303);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glTexCoord2f(this.field4367.field4299, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glTexCoord2f(this.field4367.field4299, this.field4367.field4303);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
            } else {
                this.method1884(34166, arg4);
                this.field4351.method2266(87, true);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field4367.field4303);
                OpenGL.glTexCoord2f(0.0F, this.field4367.field4303);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field4367.field4299, 0.0F);
                OpenGL.glTexCoord2f(this.field4367.field4299, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field4367.field4299, this.field4367.field4303);
                OpenGL.glTexCoord2f(this.field4367.field4299, this.field4367.field4303);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
                this.method1885(39);
            }
        } else if (this.field4351 == null) {
            this.field4371.method3384(this.field4367, (byte) 127);
            this.field4371.method3375(arg4, (byte) 102);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field4367.field4303);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field4367.field4299, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field4367.field4299, this.field4367.field4303);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method1884(34166, arg4);
            this.field4351.method2266(119, true);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field4367.field4303);
            OpenGL.glTexCoord2f(0.0F, this.field4367.field4303);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field4367.field4299, 0.0F);
            OpenGL.glTexCoord2f(this.field4367.field4299, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field4367.field4299, this.field4367.field4303);
            OpenGL.glTexCoord2f(this.field4367.field4299, this.field4367.field4303);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method1885(-128);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIII)V", line = 331)
    public final void method2(int arg0, int arg1, int arg2, int arg3) {
        this.field4357 = arg0;
        this.field4373 = arg3;
        this.field4346 = arg1;
        field4363++;
        this.field4355 = arg2;
        this.field4361 = this.field4357 != 0 || this.field4346 != 0 || this.field4355 != 0 || this.field4373 != 0;
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(II)V", line = 350)
    private final void method1884(int arg0, int arg1) {
        this.field4371.method3321(1, -19587);
        field4349++;
        this.field4371.method3384(this.field4367, (byte) 119);
        this.field4371.method3359(this.field4371.method3348(arg1, (byte) 92), 7681, true);
        this.field4371.method3351(768, 1, 34167, (byte) -85);
        this.field4371.method3374(0, 770, 34168, 75);
        this.field4371.method3321(0, -19587);
        this.field4371.method3384(this.field4351, (byte) 82);
        this.field4371.method3359(34479, 7681, true);
        this.field4371.method3351(768, 1, arg0, (byte) -85);
        if (this.field4369 == 0) {
            this.field4371.method3361(1.0F, 0.5F, 0.0F, (byte) -123, 0.5F);
        } else if (this.field4369 == 1) {
            this.field4371.method3361(0.5F, 1.0F, 0.0F, (byte) -31, 0.5F);
        } else if (this.field4369 == 2) {
            this.field4371.method3361(0.5F, 0.5F, 0.0F, (byte) -92, 1.0F);
        } else if (this.field4369 == 3) {
            this.field4371.method3361(128.5F, 128.5F, 0.0F, (byte) -27, 128.5F);
            return;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(FFFFFFILaa;II)V", line = 383)
    public final void method7(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class88 arg7, int arg8, int arg9) {
        field4352++;
        class296 var11 = ((class410) arg7).field5613;
        if (this.field4361) {
            float var12 = (float) this.method11();
            float var13 = (float) this.method14();
            float var14 = (arg2 - arg0) / var12;
            float var15 = (arg3 - arg1) / var12;
            float var16 = (arg4 - arg0) / var13;
            float var17 = (arg5 - arg1) / var13;
            float var18 = (float) this.field4346 * var16;
            float var19 = (float) this.field4346 * var17;
            float var20 = (float) this.field4357 * var14;
            float var21 = (float) this.field4357 * var15;
            float var22 = (float) this.field4355 * -var14;
            float var23 = (float) this.field4355 * -var15;
            float var24 = (float) this.field4373 * -var16;
            arg3 = arg3 + var23 + var19;
            arg2 = arg2 + var22 + var18;
            arg1 = arg1 + var21 + var19;
            arg0 = arg0 + var20 + var18;
            float var25 = (float) this.field4373 * -var17;
            arg4 = arg4 + var20 + var24;
            arg5 = arg5 + var21 + var25;
        }
        float var26 = arg2 + arg4 - arg0;
        this.field4367.method2266(74, (arg6 & 0x1) != 0);
        float var27 = arg5 + arg3 - arg1;
        this.field4371.method3320(26936);
        this.field4371.method3384(this.field4367, (byte) 53);
        this.field4371.method3375(1, (byte) 102);
        this.field4371.method3321(1, -19587);
        this.field4371.method3384(var11, (byte) 123);
        this.field4371.method3359(7681, 8448, true);
        this.field4371.method3351(768, 0, 34168, (byte) -85);
        this.field4371.method3308((byte) 76, 1);
        float var28 = var11.field4299 / (float) var11.field4301;
        float var29 = var11.field4303 / (float) var11.field4305;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field4367.field4303);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + arg0) * var28, var11.field4303 - (((float) (-arg9) + arg1) * var29));
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + arg4) * var28, var11.field4303 - (((float) (-arg9) + arg5) * var29));
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field4367.field4299, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + var26) * var28, var11.field4303 - (var27 - (float) arg9) * var29);
        OpenGL.glVertex2f(var26, var27);
        OpenGL.glMultiTexCoord2f(33984, this.field4367.field4299, this.field4367.field4303);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + arg2) * var28, var11.field4303 - (arg3 - (float) arg9) * var29);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field4371.method3351(768, 0, 5890, (byte) -85);
        this.field4371.method3375(0, (byte) 102);
        this.field4371.method3384(null, (byte) 71);
        this.field4371.method3321(0, -19587);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IILaa;II)V", line = 470)
    public final void method9(int arg0, int arg1, class88 arg2, int arg3, int arg4) {
        field4372++;
        class410 var6 = (class410) arg2;
        class296 var7 = var6.field5613;
        this.field4367.method2266(39, false);
        this.field4371.method3320(26936);
        this.field4371.method3384(this.field4367, (byte) 90);
        this.field4371.method3375(1, (byte) 102);
        this.field4371.method3321(1, -19587);
        this.field4371.method3384(var7, (byte) 110);
        this.field4371.method3359(7681, 8448, true);
        this.field4371.method3351(768, 0, 34168, (byte) -85);
        this.field4371.method3308((byte) 76, 1);
        int var8 = this.field4357 + arg0;
        int var9 = this.field4346 + arg1;
        int var10 = var8 + this.field4367.field4301;
        int var11 = var9 + this.field4367.field4305;
        float var12 = var7.field4299 / (float) var7.field4301;
        float var13 = var7.field4303 / (float) var7.field4305;
        float var14 = (float) (var8 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field4303 - (float) (var9 - arg4) * var13;
        float var17 = var7.field4303 - (float) (var11 - arg4) * var13;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field4367.field4303);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var8, var9);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var8, var9 + this.field4367.field4305);
        OpenGL.glMultiTexCoord2f(33984, this.field4367.field4299, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(var8 + this.field4367.field4301, this.field4367.field4305 + var9);
        OpenGL.glMultiTexCoord2f(33984, this.field4367.field4299, this.field4367.field4303);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(var8 + this.field4367.field4301, var9);
        OpenGL.glEnd();
        this.field4371.method3351(768, 0, 5890, (byte) -85);
        this.field4371.method3375(0, (byte) 102);
        this.field4371.method3384(null, (byte) 125);
        this.field4371.method3321(0, -19587);
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Llea;IIZ)V", line = 1185)
    public class303(class573 arg0, int arg1, int arg2, boolean arg3) {
        this.field4371 = arg0;
        this.field4367 = class602.method3498(arg3 ? 6408 : 6407, arg2, arg1, arg0, -552);
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Llea;IIII)V", line = 1195)
    public class303(class573 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4371 = arg0;
        this.field4367 = class180.method1312(arg3, 123, arg2, arg4, arg1, arg0);
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Llea;II[III)V", line = 1205)
    public class303(class573 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field4371 = arg0;
        this.field4367 = class596.method3481(arg0, arg5, arg1, arg2, arg3, 15765, false, arg4);
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "()I", line = 532)
    public final int method11() {
        field4350++;
        return this.field4367.field4301 + this.field4357 + this.field4355;
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)V", line = 541)
    private final void method1885(int arg0) {
        field4348++;
        int var2 = -84 % ((-arg0 - 93) / 33);
        this.field4371.method3321(1, -19587);
        this.field4371.method3384(null, (byte) 127);
        this.field4371.method3359(8448, 8448, true);
        this.field4371.method3351(768, 1, 34168, (byte) -85);
        this.field4371.method3374(0, 770, 5890, 102);
        this.field4371.method3321(0, -19587);
        this.field4371.method3351(768, 1, 34168, (byte) -85);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "([I)V", line = 564)
    public final void method3(int[] arg0) {
        arg0[2] = this.field4355;
        arg0[1] = this.field4346;
        arg0[3] = this.field4373;
        field4358++;
        arg0[0] = this.field4357;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IILha;)Z", line = 577)
    public static final boolean method1886(int arg0, int arg1, class475 arg2) {
        field4374++;
        int var3 = (class192.field2891 - 104) / 2;
        int var4 = (class456.field6225 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < (var3 + 104); var6++) {
            for (int var57 = var4; var57 < (var4 + 104); var57++) {
                for (int var58 = arg1; var58 <= 3; var58++) {
                    if (class530.method3091(var6, arg1, -104, var57, var58)) {
                        int var59 = var58;
                        if (class717.method3994(arg0 ^ 0x7E18, var6, var57)) {
                            var59 = var58 - 1;
                        }
                        if (var59 >= 0) {
                            var5 &= class329.method2004(var57, -1, var59, var6);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        }
        int[] var7 = new int[262144];
        for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = -16777216;
        }
        class136.field2268 = arg2.method2773(arg0, 512, var7, 0, 512, 512);
        class98.method804((byte) 24);
        int var9 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 228 << 8) + ((int) (Math.random() * 20.0D) + 238 + -10 << 16) + 238 - 10 | 0xFF000000;
        int var10 = ((int) (Math.random() * 20.0D) + 228 | 0x1F1AFF00) << 16;
        int var11 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16;
        boolean[][] var12 = new boolean[class664.field9357 + arg0 + 2][class664.field9357 + 1 + 2];
        for (int var13 = var3; var13 < var3 + 104; var13 += class664.field9357) {
            for (int var36 = var4; var36 < var4 + 104; var36 += class664.field9357) {
                int var37 = 0;
                int var38 = 0;
                int var39 = var13;
                if (var13 > 0) {
                    var39 = var13 - 1;
                    var37 += 4;
                }
                int var40 = var36;
                if (var36 > 0) {
                    var40 = var36 - 1;
                }
                int var41 = var13 + class664.field9357;
                if (var41 < 104) {
                    var41++;
                }
                int var42 = var36 + class664.field9357;
                if (var42 < 104) {
                    var38 += 4;
                    var42++;
                }
                arg2.method488(0, 0, class664.field9357 * 4 + var37, class664.field9357 * 4 + var38);
                arg2.method97(-16777216);
                for (int var43 = arg1; var43 <= 3; var43++) {
                    for (int var50 = 0; var50 <= class664.field9357; var50++) {
                        for (int var56 = 0; var56 <= class664.field9357; var56++) {
                            var12[var50][var56] = class530.method3091(var39 + var50, arg1, arg0 - 97, var40 + var56, var43);
                        }
                    }
                    class495.field6799[var43].method832(0, 0, 1024, var39, var40, var41, var42, var12);
                    if (!class164.field2512) {
                        for (int var51 = -4; var51 < class664.field9357; var51++) {
                            for (int var52 = -4; var52 < class664.field9357; var52++) {
                                int var53 = var13 + var51;
                                int var54 = var36 + var52;
                                if (var3 <= var53 && var4 <= var54 && class530.method3091(var53, arg1, arg0 - 75, var54, var43)) {
                                    int var55 = var43;
                                    if (class717.method3994(arg0 + 32280, var53, var54)) {
                                        var55 = var43 - 1;
                                    }
                                    if (var55 >= 0) {
                                        class539.method3125(var10, var54, var53, var9, var51 * 4 + var37, var55, 28214, arg2, (class664.field9357 - var52) * 4 + var38 - 4);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class164.field2512) {
                    class340 var44 = class605.field8591[arg1];
                    for (int var45 = 0; var45 < class664.field9357; var45++) {
                        for (int var46 = 0; var46 < class664.field9357; var46++) {
                            int var47 = var13 + var45;
                            int var48 = var36 + var46;
                            int var49 = var44.field4822[var47 - var44.field4824][var48 - var44.field4837];
                            if ((var49 & 0x40240000) != 0) {
                                arg2.method2765((class664.field9357 - var46) * 4 + var38 - 4, 4, 116, -1713569622, var45 * 4 + var37, 4);
                            } else if ((var49 & 0x800000) != 0) {
                                arg2.method2770((class664.field9357 - var46) * 4 + var38 - 4, 4, var45 * 4 + var37, 1, -1713569622);
                            } else if ((var49 & 0x2000000) != 0) {
                                arg2.method2774(4, true, var45 * 4 + var37 + 3, -1713569622, (class664.field9357 - var46) * 4 + var38 - 4);
                            } else if ((var49 & 0x8000000) != 0) {
                                arg2.method2770(var38 + ((class664.field9357 - var46) * 4) - 1, 4, var45 * 4 + var37, arg0, -1713569622);
                            } else if ((var49 & 0x20000000) != 0) {
                                arg2.method2774(4, true, var45 * 4 + var37, -1713569622, (class664.field9357 - var46) * 4 + (var38 - 4));
                            }
                        }
                    }
                }
                arg2.method436(var37, var38, class664.field9357 * 4, class664.field9357 * 4, var11, 2);
                class136.field2268.method276(((var13 - var3) * 4) + 48, -(class664.field9357 * 4) + 464 + -((-var4 + var36) * 4), class664.field9357 * 4, class664.field9357 * 4, var37, var38);
            }
        }
        arg2.method512();
        arg2.method97(-16777215);
        class31.method262((byte) -78);
        class504.field6921 = 0;
        class470.field6400.method3735(-4676);
        if (!class164.field2512) {
            for (int var14 = var3; var14 < var3 + 104; var14++) {
                for (int var20 = var4; var20 < (var4 + 104); var20++) {
                    for (int var21 = arg1; var21 <= (arg1 + 1) && var21 <= 3; var21++) {
                        if (class530.method3091(var14, arg1, arg0 - 109, var20, var21)) {
                            class226 var22 = (class226) class180.method1311(var21, var14, var20);
                            if (var22 == null) {
                                var22 = (class226) class608.method3523(var21, var14, var20, field4375 == null ? (field4375 = method1887("vu")) : field4375);
                            }
                            if (var22 == null) {
                                var22 = (class226) class133.method1109(var21, var14, var20);
                            }
                            if (var22 == null) {
                                var22 = (class226) class87.method770(var21, var14, var20);
                            }
                            if (var22 != null) {
                                class416 var23 = class312.field4418.method369((byte) 126, var22.method1165((byte) 122));
                                if (!var23.field5763 || class362.field5127) {
                                    int var24 = var23.field5737;
                                    if (var23.field5736 != null) {
                                        for (int var25 = 0; var25 < var23.field5736.length; var25++) {
                                            if (var23.field5736[var25] != -1) {
                                                class416 var26 = class312.field4418.method369((byte) 122, var23.field5736[var25]);
                                                if (var26.field5737 >= 0) {
                                                    var24 = var26.field5737;
                                                }
                                            }
                                        }
                                    }
                                    if (var24 >= 0) {
                                        boolean var27 = false;
                                        if (var24 >= 0) {
                                            class548 var28 = class451.field6195.method4105(var24, arg0 - 100);
                                            if (var28 != null && var28.field7605) {
                                                var27 = true;
                                            }
                                        }
                                        int var29 = var14;
                                        int var30 = var20;
                                        if (var27) {
                                            int[][] var31 = class605.field8591[var21].field4822;
                                            int var32 = class605.field8591[var21].field4824;
                                            int var33 = class605.field8591[var21].field4837;
                                            for (int var34 = 0; var34 < 10; var34++) {
                                                int var35 = (int) (Math.random() * 4.0D);
                                                if (var35 == 0 && var29 > var3 && var29 > (var14 - 3) && (var31[var29 - var32 - 1][var30 - var33] & 0x2C0108) == 0) {
                                                    var29--;
                                                }
                                                if (var35 == 1 && var3 + 104 - 1 > var29 && (var14 + 3) > var29 && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                    var29++;
                                                }
                                                if (var35 == 2 && var4 < var30 && var30 > (var20 - 3) && (var31[var29 - var32][var30 - var33 - 1] & 0x2C0102) == 0) {
                                                    var30--;
                                                }
                                                if (var35 == 3 && var30 < var4 + 104 - 1 && var30 < var20 + 3 && (var31[var29 - var32][var30 - (var33 - 1)] & 0x2C0120) == 0) {
                                                    var30++;
                                                }
                                            }
                                        }
                                        class361.field5090[class504.field6921] = var23.field5746;
                                        class608.field8644[class504.field6921] = var29;
                                        class102.field1503[class504.field6921] = var30;
                                        class504.field6921++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class447.field6170 != null) {
                class461.field6293.field7051 = 1;
                class451.field6195.method4107(false, 64, 1024);
                for (int var15 = 0; var15 < class447.field6170.field1170; var15++) {
                    int var16 = class447.field6170.field1167[var15];
                    if (var16 >> 28 == class719.field10041.field10361) {
                        int var17 = ((var16 & 0xFFFE65D) >> 14) - class222.field3266;
                        int var18 = (var16 & 0x3FFF) - class697.field9798;
                        if (var17 >= 0 && class192.field2891 > var17 && var18 >= 0 && var18 < class456.field6225) {
                            class470.field6400.method3728((byte) 101, new class725(var15));
                        } else {
                            class548 var19 = class451.field6195.method4105(class447.field6170.field1168[var15], -85);
                            if (var19.field7592 != null && var19.field7627 + var17 >= 0 && var19.field7591 + var17 < class192.field2891 && (var19.field7618 + var18) >= 0 && class456.field6225 > var18 + var19.field7596) {
                                class470.field6400.method3728((byte) 107, new class725(var15));
                            }
                        }
                    }
                }
                class451.field6195.method4107(false, 64, 128);
                class461.field6293.field7051 = 2;
                class461.field6293.method2992((byte) 99);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(FFFFFFIIII)V", line = 1025)
    public final void method4(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field4361) {
            float var11 = (float) this.method11();
            float var12 = (float) this.method14();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field4346 * var15;
            float var18 = (float) this.field4346 * var16;
            float var19 = (float) this.field4357 * var13;
            float var20 = (float) this.field4357 * var14;
            float var21 = (float) this.field4355 * -var13;
            float var22 = (float) this.field4355 * -var14;
            float var23 = (float) this.field4373 * -var15;
            arg4 = arg4 + var19 + var23;
            arg0 = arg0 + var19 + var17;
            arg1 = arg1 + var20 + var18;
            arg2 = arg2 + var21 + var17;
            arg3 = arg3 + var22 + var18;
            float var24 = (float) this.field4373 * -var16;
            arg5 = arg5 + var20 + var24;
        }
        field4364++;
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        this.field4367.method2266(84, (arg9 & 0x1) != 0);
        this.field4371.method3320(26936);
        this.field4371.method3384(this.field4367, (byte) 58);
        this.field4371.method3308((byte) 76, arg8);
        this.field4371.method3375(arg6, (byte) 102);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field4367.field4303);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field4367.field4299, 0.0F);
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glTexCoord2f(this.field4367.field4299, this.field4367.field4303);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(III)V", line = 1093)
    public final void method277(int arg0, int arg1, int arg2) {
        field4356++;
        OpenGL.glPixelTransferf(3348, 0.5F);
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field4351 = class180.method1312(this.field4367.field4301, 122, arg1, this.field4367.field4305, arg0, this.field4371);
        this.field4369 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "()I", line = 1117)
    public final int method16() {
        field4366++;
        return this.field4367.field4301;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIII)V", line = 1134)
    public final void method276(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4362++;
        if (!this.field4371.field8203) {
            this.field4367.method2949(arg2, arg5, arg4, arg1, false, arg3, arg0);
            return;
        }
        int[] var7 = this.field4371.method82(arg4, arg5, arg2, arg3);
        if (var7 != null) {
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = class694.method3895(var7[var8], -16777216);
            }
            this.method1883(arg0, arg1, arg2, arg3, var7, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "()I", line = 1169)
    public final int method14() {
        field4360++;
        return this.field4373 + this.field4346 + this.field4367.field4305;
    }
}
