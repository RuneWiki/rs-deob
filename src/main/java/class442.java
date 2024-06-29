import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iea")
public class class442 extends class702 {

    @OriginalMember(owner = "client!iea", name = "w", descriptor = "I")
    private int field6128 = 0;

    @OriginalMember(owner = "client!iea", name = "y", descriptor = "I")
    private int field6130 = 0;

    @OriginalMember(owner = "client!iea", name = "q", descriptor = "I")
    private int field6122 = 0;

    @OriginalMember(owner = "client!iea", name = "p", descriptor = "I")
    private int field6121 = 0;

    @OriginalMember(owner = "client!iea", name = "v", descriptor = "Z")
    private boolean field6127 = false;

    @OriginalMember(owner = "client!iea", name = "F", descriptor = "I")
    private int field6137 = 0;

    @OriginalMember(owner = "client!iea", name = "g", descriptor = "Llj;")
    private class565 field6112;

    @OriginalMember(owner = "client!iea", name = "A", descriptor = "Lnea;")
    public class665 field6132;

    @OriginalMember(owner = "client!iea", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field6114 = new String[5];

    @OriginalMember(owner = "client!iea", name = "j", descriptor = "I")
    public static int field6115 = 0;

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "I")
    public static int field6106;

    @OriginalMember(owner = "client!iea", name = "b", descriptor = "I")
    public static int field6107;

    @OriginalMember(owner = "client!iea", name = "d", descriptor = "I")
    public static int field6109;

    @OriginalMember(owner = "client!iea", name = "e", descriptor = "I")
    public static int field6110;

    @OriginalMember(owner = "client!iea", name = "f", descriptor = "I")
    public static int field6111;

    @OriginalMember(owner = "client!iea", name = "h", descriptor = "I")
    public static int field6113;

    @OriginalMember(owner = "client!iea", name = "k", descriptor = "I")
    public static int field6116;

    @OriginalMember(owner = "client!iea", name = "l", descriptor = "I")
    public static int field6117;

    @OriginalMember(owner = "client!iea", name = "m", descriptor = "I")
    public static int field6118;

    @OriginalMember(owner = "client!iea", name = "n", descriptor = "I")
    public static int field6119;

    @OriginalMember(owner = "client!iea", name = "o", descriptor = "I")
    public static int field6120;

    @OriginalMember(owner = "client!iea", name = "r", descriptor = "I")
    public static int field6123;

    @OriginalMember(owner = "client!iea", name = "s", descriptor = "I")
    public static int field6124;

    @OriginalMember(owner = "client!iea", name = "t", descriptor = "I")
    public static int field6125;

    @OriginalMember(owner = "client!iea", name = "u", descriptor = "I")
    public static int field6126;

    @OriginalMember(owner = "client!iea", name = "x", descriptor = "I")
    public static int field6129;

    @OriginalMember(owner = "client!iea", name = "z", descriptor = "I")
    public static int field6131;

    @OriginalMember(owner = "client!iea", name = "B", descriptor = "I")
    public static int field6133;

    @OriginalMember(owner = "client!iea", name = "D", descriptor = "I")
    public static int field6135;

    @OriginalMember(owner = "client!iea", name = "E", descriptor = "I")
    public static int field6136;

    @OriginalMember(owner = "client!iea", name = "C", descriptor = "Lsea;")
    public static class648 field6134;

    @OriginalMember(owner = "client!iea", name = "c", descriptor = "Lnea;")
    private class665 field6108;

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(IIILml;Lml;)V", line = 5)
    public static final void method2510(int arg0, int arg1, int arg2, class353 arg3, class353 arg4) {
        class390 var5 = class568.method3255(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field5533 = arg3;
        var5.field5532 = arg4;
        int var6 = class52.field606 == class409.field5812 ? 1 : 0;
        if (!arg3.method216(true)) {
            class420.field5921[var6][class466.field6417[var6]++] = arg3;
        } else if (arg3.method209((byte) 97)) {
            class216.field3061[var6][class582.field8197[var6]++] = arg3;
        } else {
            class383.field5425[var6][class89.field1287[var6]++] = arg3;
        }
        if (arg4 == null) {
            return;
        }
        if (arg4.method216(true)) {
            if (arg4.method209((byte) 73)) {
                class216.field3061[var6][class582.field8197[var6]++] = arg4;
                return;
            }
            class383.field5425[var6][class89.field1287[var6]++] = arg4;
            return;
        }
        class420.field5921[var6][class466.field6417[var6]++] = arg4;
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(I)V", line = 43)
    private final void method2511(int arg0) {
        this.field6112.method3220(0, 1);
        field6117++;
        this.field6112.method3206(null, (byte) 26);
        this.field6112.method3210(8448, 8, 8448);
        this.field6112.method3164(34168, 1, (byte) 103, 768);
        this.field6112.method3198(0, 5890, true, 770);
        this.field6112.method3220(0, 0);
        this.field6112.method3164(34168, 1, (byte) 122, 768);
        if (arg0 < 13) {
            method2516(68, 70, true);
        }
    }

    @OriginalMember(owner = "client!iea", name = "qa", descriptor = "(FFFFFFIIII)V", line = 64)
    public final void method1657(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field6127) {
            float var11 = (float) this.method1660();
            float var12 = (float) this.method1661();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field6122 * var15;
            float var18 = (float) this.field6122 * var16;
            float var19 = (float) this.field6128 * var13;
            float var20 = (float) this.field6128 * var14;
            float var21 = (float) this.field6130 * -var13;
            float var22 = (float) this.field6130 * -var14;
            float var23 = (float) this.field6137 * -var15;
            arg1 = arg1 + var20 + var18;
            arg4 = arg4 + var19 + var23;
            float var24 = (float) this.field6137 * -var16;
            arg3 = arg3 + var22 + var18;
            arg2 = arg2 + var21 + var17;
            arg0 = arg0 + var19 + var17;
            arg5 = arg5 + var20 + var24;
        }
        field6109++;
        float var25 = arg2 + arg4 - arg0;
        this.field6132.method944((byte) -111, (arg9 & 0x1) != 0);
        float var26 = arg5 + arg3 - arg1;
        this.field6112.method3160(34168);
        this.field6112.method3206(this.field6132, (byte) 26);
        this.field6112.method3237(16015, arg8);
        this.field6112.method3205(5123, arg6);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field6132.field9322);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field6132.field9325, 0.0F);
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glTexCoord2f(this.field6132.field9325, this.field6132.field9322);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!iea", name = "DA", descriptor = "(IIIIIII)V", line = 136)
    public final void method1656(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6126++;
        int var8 = arg0 + arg2;
        this.field6132.method944((byte) -111, false);
        int var9 = arg1 + arg3;
        this.field6112.method3160(34168);
        this.field6112.method3206(this.field6132, (byte) 26);
        this.field6112.method3237(16015, arg6);
        this.field6112.method3205(5123, arg4);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field6132.field9326 && !this.field6127) {
            float var10 = (float) arg3 * this.field6132.field9322 / (float) this.field6132.field9324;
            float var11 = (float) arg2 * this.field6132.field9325 / (float) this.field6132.field9321;
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
        OpenGL.glTranslatef((float) this.field6128, (float) this.field6122, 0.0F);
        int var12 = this.method1660();
        int var13 = this.method1661();
        int var14 = arg1 + this.field6132.field9324;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var9 >= var14) {
            int var20 = this.field6132.field9321 + arg0;
            int var21 = arg0;
            while (var8 >= var20) {
                OpenGL.glTexCoord2f(0.0F, this.field6132.field9322);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field6132.field9325, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field6132.field9325, this.field6132.field9322);
                OpenGL.glVertex2i(var20, var15);
                var21 += var12;
                var20 += var12;
            }
            if (var8 > var21) {
                float var22 = (float) (var8 - var21) * this.field6132.field9325 / (float) this.field6132.field9321;
                OpenGL.glTexCoord2f(0.0F, this.field6132.field9322);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field6132.field9322);
                OpenGL.glVertex2i(var8, var15);
            }
            var14 += var13;
            var15 += var13;
        }
        if (var15 < var9) {
            float var16 = (float) (var15 + this.field6132.field9324 - var9) * this.field6132.field9322 / (float) this.field6132.field9324;
            int var17 = this.field6132.field9321 + arg0;
            int var18 = arg0;
            while (var17 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field6132.field9322);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field6132.field9325, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field6132.field9325, this.field6132.field9322);
                OpenGL.glVertex2i(var17, var15);
                var18 += var12;
                var17 += var12;
            }
            if (var18 < var8) {
                float var19 = (float) (var8 - var18) * this.field6132.field9325 / (float) this.field6132.field9321;
                OpenGL.glTexCoord2f(0.0F, this.field6132.field9322);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field6132.field9322);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(ZIJZLsea;II)V", line = 273)
    public static final void method2512(boolean arg0, int arg1, long arg2, boolean arg3, class648 arg4, int arg5, int arg6) {
        if (!arg0) {
            field6134 = null;
        }
        field6118++;
        class511.method2932(arg3, arg4, arg6, 115, arg2, arg1, 0, arg5);
    }

    @OriginalMember(owner = "client!iea", name = "E", descriptor = "()I", line = 284)
    public final int method1658() {
        field6136++;
        return this.field6132.field9321;
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(B)V", line = 293)
    public static void method2513(byte arg0) {
        if (arg0 < 35) {
            method2514(-96, 115, (byte) -112, -11);
        }
        field6114 = null;
        field6134 = null;
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(IIBI)Z", line = 305)
    public static final boolean method2514(int arg0, int arg1, byte arg2, int arg3) {
        class468.field6429.method682(arg3, arg1, arg0, class399.field5605);
        field6113++;
        int var4 = class399.field5605[2];
        if (var4 < 50) {
            return false;
        }
        if (arg2 != -82) {
            field6114 = null;
        }
        class399.field5605[1] = class668.field9384 + (class399.field5605[1] * class398.field5594 / var4);
        class399.field5605[0] = class399.field5605[0] * class353.field4689 / var4 + class297.field4065;
        class399.field5605[2] = var4;
        return true;
    }

    @OriginalMember(owner = "client!iea", name = "A", descriptor = "()I", line = 326)
    public final int method1660() {
        field6124++;
        return this.field6132.field9321 + this.field6128 + this.field6130;
    }

    @OriginalMember(owner = "client!iea", name = "b", descriptor = "(II)V", line = 334)
    private final void method2515(int arg0, int arg1) {
        field6116++;
        this.field6112.method3220(arg1 ^ arg1, 1);
        this.field6112.method3206(this.field6132, (byte) 26);
        this.field6112.method3210(this.field6112.method3233(arg0, (byte) 47), -107, 7681);
        this.field6112.method3164(34167, 1, (byte) 83, 768);
        this.field6112.method3198(0, 34168, true, 770);
        this.field6112.method3220(0, 0);
        this.field6112.method3206(this.field6108, (byte) 26);
        this.field6112.method3210(34479, -110, 7681);
        this.field6112.method3164(34166, 1, (byte) 119, 768);
        if (this.field6121 == 0) {
            this.field6112.method3171(0.5F, (byte) 89, 0.0F, 1.0F, 0.5F);
        } else if (this.field6121 == 1) {
            this.field6112.method3171(1.0F, (byte) 89, 0.0F, 0.5F, 0.5F);
        } else if (this.field6121 == 2) {
            this.field6112.method3171(0.5F, (byte) 89, 0.0F, 0.5F, 1.0F);
        } else if (this.field6121 == 3) {
            this.field6112.method3171(128.5F, (byte) 89, 0.0F, 128.5F, 128.5F);
            return;
        }
    }

    @OriginalMember(owner = "client!iea", name = "V", descriptor = "(IIIII)V", line = 366)
    public final void method935(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6123++;
        this.field6132.method944((byte) -111, false);
        this.field6112.method3160(34168);
        this.field6112.method3237(16015, arg4);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field6122 + arg1;
        int var7 = this.field6128 + arg0;
        if (this.field6108 == null) {
            this.field6112.method3206(this.field6132, (byte) 26);
            this.field6112.method3205(5123, arg2);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field6132.field9322);
            OpenGL.glVertex2i(var7, var6);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var7, var6 + this.field6132.field9324);
            OpenGL.glTexCoord2f(this.field6132.field9325, 0.0F);
            OpenGL.glVertex2i(this.field6132.field9321 + var7, this.field6132.field9324 + var6);
            OpenGL.glTexCoord2f(this.field6132.field9325, this.field6132.field9322);
            OpenGL.glVertex2i(this.field6132.field9321 + var7, var6);
            OpenGL.glEnd();
            return;
        }
        this.method2515(arg2, -275);
        this.field6108.method944((byte) -111, false);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field6132.field9322);
        OpenGL.glTexCoord2f(0.0F, this.field6132.field9322);
        OpenGL.glVertex2i(var7, var6);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var7, this.field6132.field9324 + var6);
        OpenGL.glMultiTexCoord2f(33985, this.field6132.field9325, 0.0F);
        OpenGL.glTexCoord2f(this.field6132.field9325, 0.0F);
        OpenGL.glVertex2i(var7 + this.field6132.field9321, this.field6132.field9324 + var6);
        OpenGL.glMultiTexCoord2f(33985, this.field6132.field9325, this.field6132.field9322);
        OpenGL.glTexCoord2f(this.field6132.field9325, this.field6132.field9322);
        OpenGL.glVertex2i(var7 + this.field6132.field9321, var6);
        OpenGL.glEnd();
        this.method2511(18);
    }

    @OriginalMember(owner = "client!iea", name = "u", descriptor = "()I", line = 421)
    public final int method1653() {
        field6125++;
        return this.field6132.field9324;
    }

    @OriginalMember(owner = "client!iea", name = "xa", descriptor = "(III)V", line = 443)
    public final void method939(int arg0, int arg1, int arg2) {
        OpenGL.glPixelTransferf(3348, 0.5F);
        field6119++;
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field6108 = class635.method3544(this.field6132.field9324, this.field6112, 72, arg0, this.field6132.field9321, arg1);
        this.field6121 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!iea", name = "Q", descriptor = "(IIII)V", line = 470)
    public final void method1663(int arg0, int arg1, int arg2, int arg3) {
        field6106++;
        this.field6130 = arg2;
        this.field6128 = arg0;
        this.field6122 = arg1;
        this.field6137 = arg3;
        this.field6127 = this.field6128 != 0 || this.field6122 != 0 || this.field6130 != 0 || this.field6137 != 0;
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(IIZ)Z", line = 482)
    public static final boolean method2516(int arg0, int arg1, boolean arg2) {
        field6111++;
        if (arg2) {
            field6114 = null;
        }
        return class630.method3525(arg0, true, arg1) | (arg1 & 0x70000) != 0 || class607.method3415(arg0, 29965, arg1);
    }

    @OriginalMember(owner = "client!iea", name = "<init>", descriptor = "(Llj;IIZ)V", line = 799)
    public class442(class565 arg0, int arg1, int arg2, boolean arg3) {
        this.field6112 = arg0;
        this.field6132 = class588.method3340(0, arg0, arg1, arg2, arg3 ? 6408 : 6407);
    }

    @OriginalMember(owner = "client!iea", name = "<init>", descriptor = "(Llj;IIII)V", line = 809)
    public class442(class565 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field6112 = arg0;
        this.field6132 = class635.method3544(arg4, arg0, 102, arg1, arg3, arg2);
    }

    @OriginalMember(owner = "client!iea", name = "<init>", descriptor = "(Llj;II[III)V", line = 819)
    public class442(class565 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field6112 = arg0;
        this.field6132 = class125.method902(false, arg0, arg2, arg3, 34037, arg4, arg1, arg5);
    }

    @OriginalMember(owner = "client!iea", name = "YA", descriptor = "(IIIIIIII)V", line = 496)
    public final void method938(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field6132.method944((byte) -111, (arg7 & 0x1) != 0);
        field6120++;
        this.field6112.method3160(34168);
        this.field6112.method3237(16015, arg6);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field6127) {
            float var9 = (float) arg2 / (float) this.method1660();
            float var10 = (float) arg3 / (float) this.method1661();
            float var11 = (float) this.field6128 * var9 + (float) arg0;
            float var12 = (float) this.field6122 * var10 + (float) arg1;
            float var13 = (float) this.field6132.field9321 * var9 + var11;
            float var14 = (float) this.field6132.field9324 * var10 + var12;
            if (this.field6108 == null) {
                this.field6112.method3206(this.field6132, (byte) 26);
                this.field6112.method3205(5123, arg4);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field6132.field9322);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glTexCoord2f(this.field6132.field9325, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glTexCoord2f(this.field6132.field9325, this.field6132.field9322);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
            } else {
                this.method2515(arg4, -275);
                this.field6108.method944((byte) -111, true);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field6132.field9322);
                OpenGL.glTexCoord2f(0.0F, this.field6132.field9322);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field6132.field9325, 0.0F);
                OpenGL.glTexCoord2f(this.field6132.field9325, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field6132.field9325, this.field6132.field9322);
                OpenGL.glTexCoord2f(this.field6132.field9325, this.field6132.field9322);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
                this.method2511(117);
            }
        } else if (this.field6108 == null) {
            this.field6112.method3206(this.field6132, (byte) 26);
            this.field6112.method3205(5123, arg4);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field6132.field9322);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field6132.field9325, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field6132.field9325, this.field6132.field9322);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method2515(arg4, -275);
            this.field6108.method944((byte) -111, true);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field6132.field9322);
            OpenGL.glTexCoord2f(0.0F, this.field6132.field9322);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field6132.field9325, 0.0F);
            OpenGL.glTexCoord2f(this.field6132.field9325, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field6132.field9325, this.field6132.field9322);
            OpenGL.glTexCoord2f(this.field6132.field9325, this.field6132.field9322);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method2511(14);
        }
    }

    @OriginalMember(owner = "client!iea", name = "ca", descriptor = "()I", line = 611)
    public final int method1661() {
        field6133++;
        return this.field6132.field9324 + this.field6122 + this.field6137;
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(FFFFFFILua;II)V", line = 620)
    public final void method1659(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class618 arg7, int arg8, int arg9) {
        field6110++;
        class665 var11 = ((class572) arg7).field8108;
        if (this.field6127) {
            float var12 = (float) this.method1660();
            float var13 = (float) this.method1661();
            float var14 = (arg2 - arg0) / var12;
            float var15 = (arg3 - arg1) / var12;
            float var16 = (arg4 - arg0) / var13;
            float var17 = (arg5 - arg1) / var13;
            float var18 = (float) this.field6122 * var16;
            float var19 = (float) this.field6122 * var17;
            float var20 = (float) this.field6128 * var14;
            float var21 = (float) this.field6128 * var15;
            float var22 = (float) this.field6130 * -var14;
            float var23 = (float) this.field6130 * -var15;
            float var24 = (float) this.field6137 * -var16;
            arg1 = arg1 + var21 + var19;
            float var25 = (float) this.field6137 * -var17;
            arg4 = arg4 + var20 + var24;
            arg2 = arg2 + var22 + var18;
            arg0 = arg0 + var20 + var18;
            arg3 = arg3 + var23 + var19;
            arg5 = arg5 + var21 + var25;
        }
        float var26 = arg2 + arg4 - arg0;
        this.field6132.method944((byte) -111, (arg6 & 0x1) != 0);
        float var27 = arg5 + arg3 - arg1;
        this.field6112.method3160(34168);
        this.field6112.method3206(this.field6132, (byte) 26);
        this.field6112.method3205(5123, 1);
        this.field6112.method3220(0, 1);
        this.field6112.method3206(var11, (byte) 26);
        this.field6112.method3210(7681, 98, 8448);
        this.field6112.method3164(34168, 0, (byte) 122, 768);
        this.field6112.method3237(16015, 1);
        float var28 = var11.field9325 / (float) var11.field9321;
        float var29 = var11.field9322 / (float) var11.field9324;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field6132.field9322);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + arg0) * var28, var11.field9322 - ((float) (-arg9) + arg1) * var29);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg8) * var28, var11.field9322 - ((float) (-arg9) + arg5) * var29);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field6132.field9325, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + var26) * var28, var11.field9322 - (((float) (-arg9) + var27) * var29));
        OpenGL.glVertex2f(var26, var27);
        OpenGL.glMultiTexCoord2f(33984, this.field6132.field9325, this.field6132.field9322);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + arg2) * var28, var11.field9322 - (((float) (-arg9) + arg3) * var29));
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field6112.method3164(5890, 0, (byte) 86, 768);
        this.field6112.method3205(5123, 0);
        this.field6112.method3206(null, (byte) 26);
        this.field6112.method3220(0, 0);
    }

    @OriginalMember(owner = "client!iea", name = "b", descriptor = "(I)V", line = 709)
    public static final void method2517(int arg0) {
        class261.field3550 = null;
        field6107++;
        class410.field5823 = null;
        if (arg0 != 34479) {
            field6134 = null;
        }
    }

    @OriginalMember(owner = "client!iea", name = "da", descriptor = "(IIIIII)V", line = 721)
    public final void method936(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6132.method1148(arg2, arg3, arg4, arg1, arg5, -95, arg0);
        field6135++;
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(IILua;II)V", line = 732)
    public final void method932(int arg0, int arg1, class618 arg2, int arg3, int arg4) {
        field6131++;
        class572 var6 = (class572) arg2;
        class665 var7 = var6.field8108;
        this.field6132.method944((byte) -111, false);
        this.field6112.method3160(34168);
        this.field6112.method3206(this.field6132, (byte) 26);
        this.field6112.method3205(5123, 1);
        this.field6112.method3220(0, 1);
        this.field6112.method3206(var7, (byte) 26);
        this.field6112.method3210(7681, 23, 8448);
        this.field6112.method3164(34168, 0, (byte) 96, 768);
        this.field6112.method3237(16015, 1);
        int var8 = this.field6122 + arg1;
        int var9 = this.field6128 + arg0;
        int var10 = this.field6132.field9321 + var9;
        int var11 = this.field6132.field9324 + var8;
        float var12 = var7.field9325 / (float) var7.field9321;
        float var13 = var7.field9322 / (float) var7.field9324;
        float var14 = (float) (var9 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field9322 - ((float) (var8 - arg4) * var13);
        float var17 = var7.field9322 - (float) (var11 - arg4) * var13;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field6132.field9322);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var9, var8);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var9, this.field6132.field9324 + var8);
        OpenGL.glMultiTexCoord2f(33984, this.field6132.field9325, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(var9 + this.field6132.field9321, this.field6132.field9324 + var8);
        OpenGL.glMultiTexCoord2f(33984, this.field6132.field9325, this.field6132.field9322);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(this.field6132.field9321 + var9, var8);
        OpenGL.glEnd();
        this.field6112.method3164(5890, 0, (byte) 111, 768);
        this.field6112.method3205(5123, 0);
        this.field6112.method3206(null, (byte) 26);
        this.field6112.method3220(0, 0);
    }
}
