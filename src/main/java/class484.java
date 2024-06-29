import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class484 extends class24 {

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
    private int field6745 = 0;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
    private int field6740 = 0;

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
    private int field6750 = 0;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    private int field6743 = 0;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
    private int field6748 = 0;

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "Z")
    private boolean field6755 = false;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "Lih;")
    private class503 field6744;

    @OriginalMember(owner = "client!pc", name = "v", descriptor = "Lwh;")
    private class102 field6758;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public static int field6738;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public static int field6739;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public static int field6741;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    public static int field6742;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public static int field6746;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
    public static int field6747;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
    public static int field6749;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
    public static int field6751;

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "I")
    public static int field6752;

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "I")
    public static int field6753;

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "I")
    public static int field6754;

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "I")
    public static int field6756;

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "I")
    public static int field6757;

    @OriginalMember(owner = "client!pc", name = "w", descriptor = "I")
    public static int field6759;

    @OriginalMember(owner = "client!pc", name = "x", descriptor = "I")
    public static int field6760;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "Lwh;")
    private class102 field6737;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BI)V")
    private final void method2789(byte arg0, int arg1) {
        if (arg0 != -86) {
            this.method162(26, 118, -122, -116, 97, -126, -90);
        }
        this.field6744.method2940(1, (byte) 102);
        field6739++;
        this.field6744.method2968(this.field6758, arg0 + 4);
        this.field6744.method2935((byte) 87, 7681, this.field6744.method2994((byte) -103, arg1));
        this.field6744.method2969(1, 4611, 34167, 768);
        this.field6744.method2956(770, 34168, 0, (byte) 55);
        this.field6744.method2940(0, (byte) 106);
        this.field6744.method2968(this.field6737, -109);
        this.field6744.method2935((byte) 87, 7681, 34479);
        this.field6744.method2969(1, 4611, 34166, 768);
        if (this.field6748 == 0) {
            this.field6744.method2954(1.0F, 0.5F, 0.0F, 0.5F, 1);
        } else if (this.field6748 == 1) {
            this.field6744.method2954(0.5F, 1.0F, 0.0F, 0.5F, 1);
        } else if (this.field6748 == 2) {
            this.field6744.method2954(0.5F, 0.5F, 0.0F, 1.0F, 1);
        } else if (this.field6748 == 3) {
            this.field6744.method2954(128.5F, 128.5F, 0.0F, 128.5F, 1);
            return;
        }
    }

    @OriginalMember(owner = "client!pc", name = "W", descriptor = "(IIIII)V")
    public final void method144(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field6758.method2762(9728, false);
        field6752++;
        this.field6744.method2930((byte) -57);
        this.field6744.method2967(arg4, 74);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field6743 + arg0;
        int var7 = this.field6745 + arg1;
        if (this.field6737 == null) {
            this.field6744.method2968(this.field6758, -99);
            this.field6744.method2999(arg2, 70);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field6758.field1351);
            OpenGL.glVertex2i(var6, var7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var6, var7 + this.field6758.field1349);
            OpenGL.glTexCoord2f(this.field6758.field1354, 0.0F);
            OpenGL.glVertex2i(this.field6758.field1350 + var6, this.field6758.field1349 + var7);
            OpenGL.glTexCoord2f(this.field6758.field1354, this.field6758.field1351);
            OpenGL.glVertex2i(var6 + this.field6758.field1350, var7);
            OpenGL.glEnd();
            return;
        }
        this.method2789((byte) -86, arg2);
        this.field6737.method2762(9728, false);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field6758.field1351);
        OpenGL.glTexCoord2f(0.0F, this.field6758.field1351);
        OpenGL.glVertex2i(var6, var7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var6, this.field6758.field1349 + var7);
        OpenGL.glMultiTexCoord2f(33985, this.field6758.field1354, 0.0F);
        OpenGL.glTexCoord2f(this.field6758.field1354, 0.0F);
        OpenGL.glVertex2i(this.field6758.field1350 + var6, this.field6758.field1349 + var7);
        OpenGL.glMultiTexCoord2f(33985, this.field6758.field1354, this.field6758.field1351);
        OpenGL.glTexCoord2f(this.field6758.field1354, this.field6758.field1351);
        OpenGL.glVertex2i(var6 + this.field6758.field1350, var7);
        OpenGL.glEnd();
        this.method2790(-60);
    }

    @OriginalMember(owner = "client!pc", name = "RA", descriptor = "()I")
    public final int method145() {
        field6741++;
        return this.field6758.field1350 + this.field6743 + this.field6750;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(FFFFFFLta;II)V")
    public final void method154(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class145 arg6, int arg7, int arg8) {
        field6747++;
        class102 var10 = ((class198) arg6).field2811;
        if (this.field6755) {
            float var11 = (float) this.method145();
            float var12 = (float) this.method157();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field6745 * var15;
            float var18 = (float) this.field6745 * var16;
            float var19 = (float) this.field6743 * var13;
            float var20 = (float) this.field6743 * var14;
            float var21 = (float) this.field6750 * -var13;
            float var22 = (float) this.field6750 * -var14;
            float var23 = (float) this.field6740 * -var15;
            arg4 = arg4 + var19 + var23;
            arg3 = arg3 + var22 + var18;
            arg1 = arg1 + var20 + var18;
            arg2 = arg2 + var21 + var17;
            float var24 = (float) this.field6740 * -var16;
            arg0 = arg0 + var19 + var17;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        this.field6758.method2762(9728, true);
        this.field6744.method2930((byte) -128);
        this.field6744.method2968(this.field6758, -93);
        this.field6744.method2999(1, 73);
        this.field6744.method2940(1, (byte) 95);
        this.field6744.method2968(var10, -108);
        this.field6744.method2935((byte) 87, 8448, 7681);
        this.field6744.method2969(0, 4611, 34168, 768);
        this.field6744.method2967(1, 126);
        float var27 = var10.field1354 / (float) var10.field1350;
        float var28 = var10.field1351 / (float) var10.field1349;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field6758.field1351);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + arg0) * var27, var10.field1351 - ((arg1 - (float) arg8) * var28));
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + arg4) * var27, var10.field1351 - (arg5 - (float) arg8) * var28);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field6758.field1354, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + var25) * var27, var10.field1351 - ((float) (-arg8) + var26) * var28);
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glMultiTexCoord2f(33984, this.field6758.field1354, this.field6758.field1351);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + arg2) * var27, var10.field1351 - (((float) (-arg8) + arg3) * var28));
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field6744.method2969(0, 4611, 5890, 768);
        this.field6744.method2999(0, 83);
        this.field6744.method2968(null, -70);
        this.field6744.method2940(0, (byte) 120);
    }

    @OriginalMember(owner = "client!pc", name = "YA", descriptor = "()I")
    public final int method146() {
        field6738++;
        return this.field6758.field1350;
    }

    @OriginalMember(owner = "client!pc", name = "ya", descriptor = "(IIIIIII)V")
    public final void method162(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field6758.method2762(9728, true);
        field6760++;
        this.field6744.method2930((byte) -105);
        this.field6744.method2967(arg6, 84);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field6755) {
            float var8 = (float) arg2 / (float) this.method145();
            float var9 = (float) arg3 / (float) this.method157();
            float var10 = (float) this.field6743 * var8 + (float) arg0;
            float var11 = (float) this.field6745 * var9 + (float) arg1;
            float var12 = (float) this.field6758.field1350 * var8 + var10;
            float var13 = (float) this.field6758.field1349 * var9 + var11;
            if (this.field6737 == null) {
                this.field6744.method2968(this.field6758, -88);
                this.field6744.method2999(arg4, 80);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field6758.field1351);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glTexCoord2f(this.field6758.field1354, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glTexCoord2f(this.field6758.field1354, this.field6758.field1351);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
            } else {
                this.method2789((byte) -86, arg4);
                this.field6737.method2762(9728, true);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field6758.field1351);
                OpenGL.glTexCoord2f(0.0F, this.field6758.field1351);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field6758.field1354, 0.0F);
                OpenGL.glTexCoord2f(this.field6758.field1354, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field6758.field1354, this.field6758.field1351);
                OpenGL.glTexCoord2f(this.field6758.field1354, this.field6758.field1351);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
                this.method2790(-73);
            }
        } else if (this.field6737 == null) {
            this.field6744.method2968(this.field6758, -114);
            this.field6744.method2999(arg4, 84);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field6758.field1351);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field6758.field1354, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field6758.field1354, this.field6758.field1351);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method2789((byte) -86, arg4);
            this.field6737.method2762(9728, true);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field6758.field1351);
            OpenGL.glTexCoord2f(0.0F, this.field6758.field1351);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field6758.field1354, 0.0F);
            OpenGL.glTexCoord2f(this.field6758.field1354, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field6758.field1354, this.field6758.field1351);
            OpenGL.glTexCoord2f(this.field6758.field1354, this.field6758.field1351);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method2790(-31);
        }
    }

    @OriginalMember(owner = "client!pc", name = "oa", descriptor = "(III)V")
    public final void method160(int arg0, int arg1, int arg2) {
        field6749++;
        OpenGL.glPixelTransferf(3348, 0.5F);
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field6737 = class362.method2137(arg0, this.field6758.field1350, 105, arg1, this.field6744, this.field6758.field1349);
        this.field6748 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IILta;II)V")
    public final void method148(int arg0, int arg1, class145 arg2, int arg3, int arg4) {
        field6754++;
        class198 var6 = (class198) arg2;
        class102 var7 = var6.field2811;
        this.field6758.method2762(9728, false);
        this.field6744.method2930((byte) -115);
        this.field6744.method2968(this.field6758, -69);
        this.field6744.method2999(1, 73);
        this.field6744.method2940(1, (byte) 119);
        this.field6744.method2968(var7, -124);
        this.field6744.method2935((byte) 87, 8448, 7681);
        this.field6744.method2969(0, 4611, 34168, 768);
        this.field6744.method2967(1, 117);
        int var8 = this.field6745 + arg1;
        int var9 = this.field6743 + arg0;
        int var10 = var9 + this.field6758.field1350;
        int var11 = var8 + this.field6758.field1349;
        float var12 = var7.field1354 / (float) var7.field1350;
        float var13 = var7.field1351 / (float) var7.field1349;
        float var14 = (float) (var9 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field1351 - (float) (var8 - arg4) * var13;
        float var17 = var7.field1351 - ((float) (var11 - arg4) * var13);
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field6758.field1351);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var9, var8);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var9, var8 + this.field6758.field1349);
        OpenGL.glMultiTexCoord2f(33984, this.field6758.field1354, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(this.field6758.field1350 + var9, var8 - -this.field6758.field1349);
        OpenGL.glMultiTexCoord2f(33984, this.field6758.field1354, this.field6758.field1351);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(this.field6758.field1350 + var9, var8);
        OpenGL.glEnd();
        this.field6744.method2969(0, 4611, 5890, 768);
        this.field6744.method2999(0, 125);
        this.field6744.method2968(null, -79);
        this.field6744.method2940(0, (byte) 118);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
    private final void method2790(int arg0) {
        field6759++;
        this.field6744.method2940(1, (byte) 116);
        this.field6744.method2968(null, -51);
        this.field6744.method2935((byte) 87, 8448, 8448);
        this.field6744.method2969(1, 4611, 34168, 768);
        this.field6744.method2956(770, 5890, 0, (byte) 55);
        this.field6744.method2940(0, (byte) 115);
        if (arg0 >= -13) {
            this.method157();
        }
        this.field6744.method2969(1, 4611, 34168, 768);
    }

    @OriginalMember(owner = "client!pc", name = "ZA", descriptor = "()I")
    public final int method155() {
        field6756++;
        return this.field6758.field1349;
    }

    @OriginalMember(owner = "client!pc", name = "H", descriptor = "(FFFFFFIII)V")
    public final void method158(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field6755) {
            float var10 = (float) this.method145();
            float var11 = (float) this.method157();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field6745 * var14;
            float var17 = (float) this.field6745 * var15;
            float var18 = (float) this.field6743 * var12;
            float var19 = (float) this.field6743 * var13;
            float var20 = (float) this.field6750 * -var12;
            float var21 = (float) this.field6750 * -var13;
            float var22 = (float) this.field6740 * -var14;
            float var23 = (float) this.field6740 * -var15;
            arg4 = arg4 + var18 + var22;
            arg0 = arg0 + var18 + var16;
            arg1 = arg1 + var19 + var17;
            arg3 = arg3 + var21 + var17;
            arg2 = arg2 + var20 + var16;
            arg5 = arg5 + var19 + var23;
        }
        field6753++;
        float var24 = arg2 + arg4 - arg0;
        this.field6758.method2762(9728, true);
        float var25 = arg5 + arg3 - arg1;
        this.field6744.method2930((byte) -86);
        this.field6744.method2968(this.field6758, -62);
        this.field6744.method2967(arg8, 81);
        this.field6744.method2999(arg6, 82);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field6758.field1351);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field6758.field1354, 0.0F);
        OpenGL.glVertex2f(var24, var25);
        OpenGL.glTexCoord2f(this.field6758.field1354, this.field6758.field1351);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!pc", name = "ha", descriptor = "(IIII)V")
    public final void method152(int arg0, int arg1, int arg2, int arg3) {
        this.field6750 = arg2;
        this.field6745 = arg1;
        this.field6743 = arg0;
        field6742++;
        this.field6740 = arg3;
        this.field6755 = this.field6743 != 0 || this.field6745 != 0 || this.field6750 != 0 || this.field6740 != 0;
    }

    @OriginalMember(owner = "client!pc", name = "XA", descriptor = "(IIIIII)V")
    public final void method147(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6758.method2468(arg5, arg2, arg0, arg3, arg1, 0, arg4);
        field6751++;
    }

    @OriginalMember(owner = "client!pc", name = "la", descriptor = "(IIIIIII)V")
    public final void method159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6746++;
        int var8 = arg0 + arg2;
        int var9 = arg1 + arg3;
        this.field6758.method2762(9728, false);
        this.field6744.method2930((byte) -109);
        this.field6744.method2968(this.field6758, -38);
        this.field6744.method2967(arg6, 114);
        this.field6744.method2999(arg4, 122);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field6758.field1352 && !this.field6755) {
            float var10 = (float) arg3 * this.field6758.field1351 / (float) this.field6758.field1349;
            float var11 = (float) arg2 * this.field6758.field1354 / (float) this.field6758.field1350;
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
        OpenGL.glTranslatef((float) this.field6743, (float) this.field6745, 0.0F);
        int var12 = this.method145();
        int var13 = this.method157();
        int var14 = this.field6758.field1349 + arg1;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var14 <= var9) {
            int var20 = this.field6758.field1350 + arg0;
            int var21 = arg0;
            while (var8 >= var20) {
                OpenGL.glTexCoord2f(0.0F, this.field6758.field1351);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field6758.field1354, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field6758.field1354, this.field6758.field1351);
                OpenGL.glVertex2i(var20, var15);
                var21 += var12;
                var20 += var12;
            }
            if (var21 < var8) {
                float var22 = (float) (var8 - var21) * this.field6758.field1354 / (float) this.field6758.field1350;
                OpenGL.glTexCoord2f(0.0F, this.field6758.field1351);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field6758.field1351);
                OpenGL.glVertex2i(var8, var15);
            }
            var14 += var13;
            var15 += var13;
        }
        if (var9 > var15) {
            float var16 = (float) (this.field6758.field1349 - (var9 - var15)) * this.field6758.field1351 / (float) this.field6758.field1349;
            int var17 = this.field6758.field1350 + arg0;
            int var18 = arg0;
            while (var17 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field6758.field1351);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field6758.field1354, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field6758.field1354, this.field6758.field1351);
                OpenGL.glVertex2i(var17, var15);
                var18 += var12;
                var17 += var12;
            }
            if (var18 < var8) {
                float var19 = (float) (var8 - var18) * this.field6758.field1354 / (float) this.field6758.field1350;
                OpenGL.glTexCoord2f(0.0F, this.field6758.field1351);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field6758.field1351);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!pc", name = "Q", descriptor = "()I")
    public final int method157() {
        field6757++;
        return this.field6758.field1349 + this.field6740 + this.field6745;
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lih;IIII)V")
    public class484(class503 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field6744 = arg0;
        this.field6758 = class362.method2137(arg1, arg3, 111, arg2, arg0, arg4);
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lih;II[III)V")
    public class484(class503 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field6744 = arg0;
        this.field6758 = class362.method2134(arg2, false, arg3, (byte) -74, arg1, arg0);
    }

    static {
        new class530("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
    }
}
