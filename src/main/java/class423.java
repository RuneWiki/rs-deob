import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class423 extends class511 {

    @OriginalMember(owner = "client!rq", name = "e", descriptor = "I")
    private int field5472 = 0;

    @OriginalMember(owner = "client!rq", name = "p", descriptor = "I")
    private int field5483 = 0;

    @OriginalMember(owner = "client!rq", name = "m", descriptor = "I")
    private int field5480 = 0;

    @OriginalMember(owner = "client!rq", name = "x", descriptor = "Z")
    private boolean field5491 = false;

    @OriginalMember(owner = "client!rq", name = "o", descriptor = "I")
    private int field5482 = 0;

    @OriginalMember(owner = "client!rq", name = "B", descriptor = "I")
    private int field5495 = 0;

    @OriginalMember(owner = "client!rq", name = "l", descriptor = "Lji;")
    private class622 field5479;

    @OriginalMember(owner = "client!rq", name = "r", descriptor = "Lch;")
    public class219 field5485;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "I")
    public static int field5468;

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "I")
    public static int field5469;

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "I")
    public static int field5470;

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "I")
    public static int field5471;

    @OriginalMember(owner = "client!rq", name = "g", descriptor = "I")
    public static int field5474;

    @OriginalMember(owner = "client!rq", name = "h", descriptor = "I")
    public static int field5475;

    @OriginalMember(owner = "client!rq", name = "i", descriptor = "I")
    public static int field5476;

    @OriginalMember(owner = "client!rq", name = "j", descriptor = "I")
    public static int field5477;

    @OriginalMember(owner = "client!rq", name = "k", descriptor = "I")
    public static int field5478;

    @OriginalMember(owner = "client!rq", name = "n", descriptor = "I")
    public static int field5481;

    @OriginalMember(owner = "client!rq", name = "q", descriptor = "I")
    public static int field5484;

    @OriginalMember(owner = "client!rq", name = "s", descriptor = "I")
    public static int field5486;

    @OriginalMember(owner = "client!rq", name = "t", descriptor = "I")
    public static int field5487;

    @OriginalMember(owner = "client!rq", name = "u", descriptor = "I")
    public static int field5488;

    @OriginalMember(owner = "client!rq", name = "v", descriptor = "I")
    public static int field5489;

    @OriginalMember(owner = "client!rq", name = "w", descriptor = "I")
    public static int field5490;

    @OriginalMember(owner = "client!rq", name = "z", descriptor = "I")
    public static int field5493;

    @OriginalMember(owner = "client!rq", name = "A", descriptor = "I")
    public static int field5494;

    @OriginalMember(owner = "client!rq", name = "y", descriptor = "Lch;")
    private class219 field5492;

    @OriginalMember(owner = "client!rq", name = "f", descriptor = "Luk;")
    public static class265 field5473;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(FFFFFFLfa;II)V")
    public final void method609(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class619 arg6, int arg7, int arg8) {
        field5470++;
        class219 var10 = ((class273) arg6).field3598;
        if (this.field5491) {
            float var11 = (float) this.method602();
            float var12 = (float) this.method595();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field5495 * var15;
            float var18 = (float) this.field5495 * var16;
            float var19 = (float) this.field5482 * var13;
            float var20 = (float) this.field5482 * var14;
            float var21 = (float) this.field5483 * -var13;
            float var22 = (float) this.field5483 * -var14;
            float var23 = (float) this.field5480 * -var15;
            arg4 = arg4 + var19 + var23;
            arg2 = arg2 + var21 + var17;
            arg0 = arg0 + var19 + var17;
            arg3 = arg3 + var22 + var18;
            float var24 = (float) this.field5480 * -var16;
            arg1 = arg1 + var20 + var18;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        this.field5485.method3905(true, true);
        this.field5479.method3441(6369);
        this.field5479.method3388(this.field5485, false);
        this.field5479.method3443(1, true);
        this.field5479.method3469(1, false);
        this.field5479.method3388(var10, false);
        this.field5479.method3462(8448, -5882, 7681);
        this.field5479.method3453(false, 768, 34168, 0);
        this.field5479.method3403(1, -3);
        float var27 = var10.field2874 / (float) var10.field2877;
        float var28 = var10.field2872 / (float) var10.field2871;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field5485.field2872);
        OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * var27, var10.field2872 - (arg1 - (float) arg8) * var28);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + arg4) * var27, var10.field2872 - ((float) (-arg8) + arg5) * var28);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field5485.field2874, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + var25) * var27, var10.field2872 - (((float) (-arg8) + var26) * var28));
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glMultiTexCoord2f(33984, this.field5485.field2874, this.field5485.field2872);
        OpenGL.glMultiTexCoord2f(33985, (arg2 - (float) arg7) * var27, var10.field2872 - ((float) (-arg8) + arg3) * var28);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field5479.method3453(false, 768, 5890, 0);
        this.field5479.method3443(0, true);
        this.field5479.method3388(null, false);
        this.field5479.method3469(0, false);
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(B)V")
    public static final void method2433(byte arg0) {
        field5475++;
        if (arg0 >= -14) {
            return;
        }
        int var1 = 0;
        for (int var2 = 0; var2 < class611.field8258; var2++) {
            for (int var3 = 0; var3 < class656.field9155; var3++) {
                if (class201.method1310((byte) -75, class483.field6438, true, var2, var3, var1)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)V")
    private final void method2434(int arg0) {
        field5493++;
        if (arg0 != -22006) {
            this.method595();
        }
        this.field5479.method3469(1, false);
        this.field5479.method3388(null, false);
        this.field5479.method3462(8448, -5882, 8448);
        this.field5479.method3453(false, 768, 34168, 1);
        this.field5479.method3389((byte) 74, 770, 0, 5890);
        this.field5479.method3469(0, false);
        this.field5479.method3453(false, 768, 34168, 1);
    }

    @OriginalMember(owner = "client!rq", name = "t", descriptor = "(III)V")
    public final void method597(int arg0, int arg1, int arg2) {
        field5490++;
        OpenGL.glPixelTransferf(3348, 0.5F);
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field5492 = class125.method917(this.field5485.field2877, (byte) 122, this.field5485.field2871, arg1, arg0, this.field5479);
        this.field5472 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!rq", name = "QA", descriptor = "()I")
    public final int method608() {
        field5494++;
        return this.field5485.field2877;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IILfa;II)V")
    public final void method594(int arg0, int arg1, class619 arg2, int arg3, int arg4) {
        field5476++;
        class273 var6 = (class273) arg2;
        class219 var7 = var6.field3598;
        this.field5485.method3905(false, true);
        this.field5479.method3441(6369);
        this.field5479.method3388(this.field5485, false);
        this.field5479.method3443(1, true);
        this.field5479.method3469(1, false);
        this.field5479.method3388(var7, false);
        this.field5479.method3462(8448, -5882, 7681);
        this.field5479.method3453(false, 768, 34168, 0);
        this.field5479.method3403(1, -3);
        int var8 = this.field5495 + arg1;
        int var9 = this.field5482 + arg0;
        int var10 = this.field5485.field2877 + var9;
        int var11 = this.field5485.field2871 + var8;
        float var12 = var7.field2874 / (float) var7.field2877;
        float var13 = var7.field2872 / (float) var7.field2871;
        float var14 = (float) (var9 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field2872 - ((float) (var8 - arg4) * var13);
        float var17 = var7.field2872 - (float) (var11 - arg4) * var13;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field5485.field2872);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var9, var8);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var9, var8 + this.field5485.field2871);
        OpenGL.glMultiTexCoord2f(33984, this.field5485.field2874, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(this.field5485.field2877 + var9, var8 - -this.field5485.field2871);
        OpenGL.glMultiTexCoord2f(33984, this.field5485.field2874, this.field5485.field2872);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(var9 + this.field5485.field2877, var8);
        OpenGL.glEnd();
        this.field5479.method3453(false, 768, 5890, 0);
        this.field5479.method3443(0, true);
        this.field5479.method3388(null, false);
        this.field5479.method3469(0, false);
    }

    @OriginalMember(owner = "client!rq", name = "EA", descriptor = "(IIII)V")
    public final void method610(int arg0, int arg1, int arg2, int arg3) {
        field5468++;
        this.field5483 = arg2;
        this.field5480 = arg3;
        this.field5495 = arg1;
        this.field5482 = arg0;
        this.field5491 = this.field5482 != 0 || this.field5495 != 0 || this.field5483 != 0 || this.field5480 != 0;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IB)V")
    private final void method2435(int arg0, byte arg1) {
        int var3 = 73 % ((arg1 + 62) / 52);
        this.field5479.method3469(1, false);
        field5469++;
        this.field5479.method3388(this.field5485, false);
        this.field5479.method3462(7681, -5882, this.field5479.method3412(arg0, -120));
        this.field5479.method3453(false, 768, 34167, 1);
        this.field5479.method3389((byte) 91, 770, 0, 34168);
        this.field5479.method3469(0, false);
        this.field5479.method3388(this.field5492, false);
        this.field5479.method3462(7681, -5882, 34479);
        this.field5479.method3453(false, 768, 34166, 1);
        if (this.field5472 == 0) {
            this.field5479.method3428(0.0F, -46, 1.0F, 0.5F, 0.5F);
        } else if (this.field5472 == 1) {
            this.field5479.method3428(0.0F, -128, 0.5F, 0.5F, 1.0F);
        } else if (this.field5472 == 2) {
            this.field5479.method3428(0.0F, -118, 0.5F, 1.0F, 0.5F);
            return;
        } else if (this.field5472 == 3) {
            this.field5479.method3428(0.0F, -106, 128.5F, 128.5F, 128.5F);
            return;
        }
    }

    @OriginalMember(owner = "client!rq", name = "KA", descriptor = "(IIIIIII)V")
    public final void method604(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field5485.method3905(true, true);
        field5477++;
        this.field5479.method3441(6369);
        this.field5479.method3403(arg6, -3);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field5491) {
            float var8 = (float) arg2 / (float) this.method602();
            float var9 = (float) arg3 / (float) this.method595();
            float var10 = (float) this.field5482 * var8 + (float) arg0;
            float var11 = (float) this.field5495 * var9 + (float) arg1;
            float var12 = (float) this.field5485.field2877 * var8 + var10;
            float var13 = (float) this.field5485.field2871 * var9 + var11;
            if (this.field5492 == null) {
                this.field5479.method3388(this.field5485, false);
                this.field5479.method3443(arg4, true);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field5485.field2872);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glTexCoord2f(this.field5485.field2874, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glTexCoord2f(this.field5485.field2874, this.field5485.field2872);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
            } else {
                this.method2435(arg4, (byte) 2);
                this.field5492.method3905(true, true);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field5485.field2872);
                OpenGL.glTexCoord2f(0.0F, this.field5485.field2872);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field5485.field2874, 0.0F);
                OpenGL.glTexCoord2f(this.field5485.field2874, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field5485.field2874, this.field5485.field2872);
                OpenGL.glTexCoord2f(this.field5485.field2874, this.field5485.field2872);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
                this.method2434(-22006);
            }
        } else if (this.field5492 == null) {
            this.field5479.method3388(this.field5485, false);
            this.field5479.method3443(arg4, true);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field5485.field2872);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field5485.field2874, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field5485.field2874, this.field5485.field2872);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method2435(arg4, (byte) 121);
            this.field5492.method3905(true, true);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field5485.field2872);
            OpenGL.glTexCoord2f(0.0F, this.field5485.field2872);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field5485.field2874, 0.0F);
            OpenGL.glTexCoord2f(this.field5485.field2874, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field5485.field2874, this.field5485.field2872);
            OpenGL.glTexCoord2f(this.field5485.field2874, this.field5485.field2872);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method2434(-22006);
        }
    }

    @OriginalMember(owner = "client!rq", name = "GA", descriptor = "(IIIIII)V")
    public final void method603(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field5485.method1506(arg5, arg2, (byte) -75, arg0, arg3, arg1, arg4);
        field5487++;
    }

    @OriginalMember(owner = "client!rq", name = "ba", descriptor = "(IIIIIII)V")
    public final void method596(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5486++;
        int var8 = arg0 + arg2;
        this.field5485.method3905(false, true);
        int var9 = arg1 + arg3;
        this.field5479.method3441(6369);
        this.field5479.method3388(this.field5485, false);
        this.field5479.method3403(arg6, -3);
        this.field5479.method3443(arg4, true);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field5485.field2876 && !this.field5491) {
            float var10 = (float) arg3 * this.field5485.field2872 / (float) this.field5485.field2871;
            float var11 = (float) arg2 * this.field5485.field2874 / (float) this.field5485.field2877;
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
        OpenGL.glTranslatef((float) this.field5482, (float) this.field5495, 0.0F);
        int var12 = this.method602();
        int var13 = this.method595();
        int var14 = this.field5485.field2871 + arg1;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var9 >= var14) {
            int var20 = this.field5485.field2877 + arg0;
            int var21 = arg0;
            while (var20 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field5485.field2872);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field5485.field2874, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field5485.field2874, this.field5485.field2872);
                OpenGL.glVertex2i(var20, var15);
                var21 += var12;
                var20 += var12;
            }
            if (var8 > var21) {
                float var22 = (float) (var8 - var21) * this.field5485.field2874 / (float) this.field5485.field2877;
                OpenGL.glTexCoord2f(0.0F, this.field5485.field2872);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field5485.field2872);
                OpenGL.glVertex2i(var8, var15);
            }
            var15 += var13;
            var14 += var13;
        }
        if (var15 < var9) {
            float var16 = (float) (this.field5485.field2871 + var15 - var9) * this.field5485.field2872 / (float) this.field5485.field2871;
            int var17 = arg0 + this.field5485.field2877;
            int var18 = arg0;
            while (var17 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field5485.field2872);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field5485.field2874, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field5485.field2874, this.field5485.field2872);
                OpenGL.glVertex2i(var17, var15);
                var17 += var12;
                var18 += var12;
            }
            if (var18 < var8) {
                float var19 = (float) (var8 - var18) * this.field5485.field2874 / (float) this.field5485.field2877;
                OpenGL.glTexCoord2f(0.0F, this.field5485.field2872);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field5485.field2872);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!rq", name = "I", descriptor = "(IIIII)V")
    public final void method606(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5485.method3905(false, true);
        field5474++;
        this.field5479.method3441(6369);
        this.field5479.method3403(arg4, -3);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field5495 + arg1;
        int var7 = this.field5482 + arg0;
        if (this.field5492 == null) {
            this.field5479.method3388(this.field5485, false);
            this.field5479.method3443(arg2, true);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field5485.field2872);
            OpenGL.glVertex2i(var7, var6);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var7, this.field5485.field2871 + var6);
            OpenGL.glTexCoord2f(this.field5485.field2874, 0.0F);
            OpenGL.glVertex2i(this.field5485.field2877 + var7, this.field5485.field2871 + var6);
            OpenGL.glTexCoord2f(this.field5485.field2874, this.field5485.field2872);
            OpenGL.glVertex2i(var7 + this.field5485.field2877, var6);
            OpenGL.glEnd();
            return;
        }
        this.method2435(arg2, (byte) -118);
        this.field5492.method3905(false, true);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field5485.field2872);
        OpenGL.glTexCoord2f(0.0F, this.field5485.field2872);
        OpenGL.glVertex2i(var7, var6);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var7, this.field5485.field2871 + var6);
        OpenGL.glMultiTexCoord2f(33985, this.field5485.field2874, 0.0F);
        OpenGL.glTexCoord2f(this.field5485.field2874, 0.0F);
        OpenGL.glVertex2i(this.field5485.field2877 + var7, this.field5485.field2871 + var6);
        OpenGL.glMultiTexCoord2f(33985, this.field5485.field2874, this.field5485.field2872);
        OpenGL.glTexCoord2f(this.field5485.field2874, this.field5485.field2872);
        OpenGL.glVertex2i(this.field5485.field2877 + var7, var6);
        OpenGL.glEnd();
        this.method2434(-22006);
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(I)V")
    public static void method2436(int arg0) {
        if (arg0 != 33985) {
            field5473 = null;
        }
        field5473 = null;
    }

    @OriginalMember(owner = "client!rq", name = "AA", descriptor = "()I")
    public final int method602() {
        field5481++;
        return this.field5485.field2877 + this.field5482 + this.field5483;
    }

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "(I)Ldga;")
    public static final class230 method2437(int arg0) {
        field5488++;
        if (arg0 != 34168) {
            method2436(-59);
        }
        return class706.field9826;
    }

    @OriginalMember(owner = "client!rq", name = "sa", descriptor = "(FFFFFFIII)V")
    public final void method598(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field5491) {
            float var10 = (float) this.method602();
            float var11 = (float) this.method595();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field5495 * var14;
            float var17 = (float) this.field5495 * var15;
            float var18 = (float) this.field5482 * var12;
            float var19 = (float) this.field5482 * var13;
            float var20 = (float) this.field5483 * -var12;
            float var21 = (float) this.field5483 * -var13;
            float var22 = (float) this.field5480 * -var14;
            arg1 = arg1 + var19 + var17;
            arg4 = arg4 + var18 + var22;
            arg3 = arg3 + var21 + var17;
            arg2 = arg2 + var20 + var16;
            float var23 = (float) this.field5480 * -var15;
            arg0 = arg0 + var18 + var16;
            arg5 = arg5 + var19 + var23;
        }
        field5484++;
        float var24 = arg2 + arg4 - arg0;
        this.field5485.method3905(true, true);
        float var25 = arg5 + arg3 - arg1;
        this.field5479.method3441(6369);
        this.field5479.method3388(this.field5485, false);
        this.field5479.method3403(arg8, -3);
        this.field5479.method3443(arg6, true);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field5485.field2872);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field5485.field2874, 0.0F);
        OpenGL.glVertex2f(var24, var25);
        OpenGL.glTexCoord2f(this.field5485.field2874, this.field5485.field2872);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "()I")
    public final int method607() {
        field5471++;
        return this.field5485.field2871;
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lji;IIZ)V")
    public class423(class622 arg0, int arg1, int arg2, boolean arg3) {
        this.field5479 = arg0;
        this.field5485 = class510.method2748((byte) -91, arg3 ? 6408 : 6407, arg0, arg2, arg1);
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lji;IIII)V")
    public class423(class622 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5479 = arg0;
        this.field5485 = class125.method917(arg3, (byte) 114, arg4, arg2, arg1, arg0);
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lji;II[III)V")
    public class423(class622 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field5479 = arg0;
        this.field5485 = class43.method375(arg3, arg0, arg2, 34037, arg1, false);
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "()I")
    public final int method595() {
        field5489++;
        return this.field5485.field2871 + this.field5480 + this.field5495;
    }
}
