import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public class class417 extends class536 {

    @OriginalMember(owner = "client!eca", name = "i", descriptor = "I")
    private int field5234 = 0;

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "Z")
    private boolean field5226 = false;

    @OriginalMember(owner = "client!eca", name = "q", descriptor = "I")
    private int field5242 = 0;

    @OriginalMember(owner = "client!eca", name = "v", descriptor = "I")
    private int field5247 = 0;

    @OriginalMember(owner = "client!eca", name = "p", descriptor = "I")
    private int field5241 = 0;

    @OriginalMember(owner = "client!eca", name = "s", descriptor = "I")
    private int field5244 = 0;

    @OriginalMember(owner = "client!eca", name = "o", descriptor = "Lqj;")
    private class548 field5240;

    @OriginalMember(owner = "client!eca", name = "m", descriptor = "Lar;")
    public class4 field5238;

    @OriginalMember(owner = "client!eca", name = "w", descriptor = "F")
    public static float field5248;

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "I")
    public static int field5227;

    @OriginalMember(owner = "client!eca", name = "c", descriptor = "I")
    public static int field5228;

    @OriginalMember(owner = "client!eca", name = "d", descriptor = "I")
    public static int field5229;

    @OriginalMember(owner = "client!eca", name = "e", descriptor = "I")
    public static int field5230;

    @OriginalMember(owner = "client!eca", name = "f", descriptor = "I")
    public static int field5231;

    @OriginalMember(owner = "client!eca", name = "h", descriptor = "I")
    public static int field5233;

    @OriginalMember(owner = "client!eca", name = "j", descriptor = "I")
    public static int field5235;

    @OriginalMember(owner = "client!eca", name = "k", descriptor = "I")
    public static int field5236;

    @OriginalMember(owner = "client!eca", name = "l", descriptor = "I")
    public static int field5237;

    @OriginalMember(owner = "client!eca", name = "n", descriptor = "I")
    public static int field5239;

    @OriginalMember(owner = "client!eca", name = "r", descriptor = "I")
    public static int field5243;

    @OriginalMember(owner = "client!eca", name = "t", descriptor = "I")
    public static int field5245;

    @OriginalMember(owner = "client!eca", name = "u", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!eca", name = "x", descriptor = "I")
    public static int field5249;

    @OriginalMember(owner = "client!eca", name = "y", descriptor = "I")
    public static int field5250;

    @OriginalMember(owner = "client!eca", name = "z", descriptor = "I")
    public static int field5251;

    @OriginalMember(owner = "client!eca", name = "A", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!eca", name = "g", descriptor = "Lar;")
    private class4 field5232;

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "(II)V")
    private final void method2225(int arg0, int arg1) {
        this.field5240.method3027(1, true);
        field5243++;
        this.field5240.method2960(this.field5238, -2);
        this.field5240.method2983(this.field5240.method2948(arg0, 260), arg1 - 465309904, 7681);
        this.field5240.method2966(1, arg1, 768, 34167);
        this.field5240.method3015(34168, 770, 0, true);
        this.field5240.method3027(0, true);
        this.field5240.method2960(this.field5232, -2);
        this.field5240.method2983(34479, -465309136, 7681);
        this.field5240.method2966(1, 768, 768, 34166);
        if (this.field5241 == 0) {
            this.field5240.method2982(0.5F, 1.0F, 0.0F, arg1 ^ 0xFFFFA6B1, 0.5F);
        } else if (this.field5241 == 1) {
            this.field5240.method2982(0.5F, 0.5F, 0.0F, -23119, 1.0F);
        } else if (this.field5241 == 2) {
            this.field5240.method2982(1.0F, 0.5F, 0.0F, arg1 - 23887, 0.5F);
        } else if (this.field5241 == 3) {
            this.field5240.method2982(128.5F, 128.5F, 0.0F, -23119, 128.5F);
            return;
        }
    }

    @OriginalMember(owner = "client!eca", name = "A", descriptor = "()I")
    public final int method160() {
        field5239++;
        return this.field5238.field116 - (-this.field5247 - this.field5234);
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(IILua;II)V")
    public final void method153(int arg0, int arg1, class600 arg2, int arg3, int arg4) {
        field5250++;
        class268 var6 = (class268) arg2;
        class4 var7 = var6.field3385;
        this.field5238.method3396(false, 17137);
        this.field5240.method3022((byte) 3);
        this.field5240.method2960(this.field5238, -2);
        this.field5240.method3005(false, 1);
        this.field5240.method3027(1, true);
        this.field5240.method2960(var7, -2);
        this.field5240.method2983(7681, -465309136, 8448);
        this.field5240.method2966(0, 768, 768, 34168);
        this.field5240.method3017((byte) 40, 1);
        int var8 = this.field5247 + arg0;
        int var9 = this.field5242 + arg1;
        int var10 = var8 + this.field5238.field116;
        int var11 = this.field5238.field110 + var9;
        float var12 = var7.field111 / (float) var7.field116;
        float var13 = var7.field109 / (float) var7.field110;
        float var14 = (float) (var8 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field109 - ((float) (var9 - arg4) * var13);
        float var17 = var7.field109 - ((float) (var11 - arg4) * var13);
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field5238.field109);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var8, var9);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var8, this.field5238.field110 + var9);
        OpenGL.glMultiTexCoord2f(33984, this.field5238.field111, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(var8 + this.field5238.field116, var9 - -this.field5238.field110);
        OpenGL.glMultiTexCoord2f(33984, this.field5238.field111, this.field5238.field109);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(this.field5238.field116 + var8, var9);
        OpenGL.glEnd();
        this.field5240.method2966(0, 768, 768, 5890);
        this.field5240.method3005(false, 0);
        this.field5240.method2960(null, -2);
        this.field5240.method3027(0, true);
    }

    @OriginalMember(owner = "client!eca", name = "YA", descriptor = "(IIIIIIII)V")
    public final void method154(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5251++;
        this.field5238.method3396((arg7 & 0x1) != 0, 17137);
        this.field5240.method3022((byte) 3);
        this.field5240.method3017((byte) 85, arg6);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field5226) {
            float var9 = (float) arg2 / (float) this.method160();
            float var10 = (float) arg3 / (float) this.method166();
            float var11 = (float) this.field5247 * var9 + (float) arg0;
            float var12 = (float) this.field5242 * var10 + (float) arg1;
            float var13 = (float) this.field5238.field116 * var9 + var11;
            float var14 = (float) this.field5238.field110 * var10 + var12;
            if (this.field5232 == null) {
                this.field5240.method2960(this.field5238, -2);
                this.field5240.method3005(false, arg4);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field5238.field109);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glTexCoord2f(this.field5238.field111, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glTexCoord2f(this.field5238.field111, this.field5238.field109);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
            } else {
                this.method2225(arg4, 768);
                this.field5232.method3396(true, 17137);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field5238.field109);
                OpenGL.glTexCoord2f(0.0F, this.field5238.field109);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field5238.field111, 0.0F);
                OpenGL.glTexCoord2f(this.field5238.field111, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field5238.field111, this.field5238.field109);
                OpenGL.glTexCoord2f(this.field5238.field111, this.field5238.field109);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
                this.method2227((byte) -98);
            }
        } else if (this.field5232 == null) {
            this.field5240.method2960(this.field5238, -2);
            this.field5240.method3005(false, arg4);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field5238.field109);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field5238.field111, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field5238.field111, this.field5238.field109);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method2225(arg4, 768);
            this.field5232.method3396(true, 17137);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field5238.field109);
            OpenGL.glTexCoord2f(0.0F, this.field5238.field109);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field5238.field111, 0.0F);
            OpenGL.glTexCoord2f(this.field5238.field111, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field5238.field111, this.field5238.field109);
            OpenGL.glTexCoord2f(this.field5238.field111, this.field5238.field109);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method2227((byte) -84);
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(Lkp;IZ)I")
    public static final int method2226(class507 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            return 73;
        }
        field5230++;
        if (!client.method3819(arg0).method2021(arg1, (byte) 91) && arg0.field6868 == null) {
            return -1;
        } else if (arg0.field6761 == null || arg0.field6761.length <= arg1) {
            return -1;
        } else {
            return arg0.field6761[arg1];
        }
    }

    @OriginalMember(owner = "client!eca", name = "u", descriptor = "()I")
    public final int method162() {
        field5227++;
        return this.field5238.field110;
    }

    @OriginalMember(owner = "client!eca", name = "DA", descriptor = "(IIIIIII)V")
    public final void method164(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5228++;
        int var8 = arg0 + arg2;
        this.field5238.method3396(false, 17137);
        int var9 = arg1 + arg3;
        this.field5240.method3022((byte) 3);
        this.field5240.method2960(this.field5238, -2);
        this.field5240.method3017((byte) 90, arg6);
        this.field5240.method3005(false, arg4);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field5238.field112 && !this.field5226) {
            float var10 = (float) arg3 * this.field5238.field109 / (float) this.field5238.field110;
            float var11 = (float) arg2 * this.field5238.field111 / (float) this.field5238.field116;
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
        OpenGL.glTranslatef((float) this.field5247, (float) this.field5242, 0.0F);
        int var12 = this.method160();
        int var13 = this.method166();
        int var14 = this.field5238.field110 + arg1;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var9 >= var14) {
            int var20 = this.field5238.field116 + arg0;
            int var21 = arg0;
            while (var20 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field5238.field109);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field5238.field111, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field5238.field111, this.field5238.field109);
                OpenGL.glVertex2i(var20, var15);
                var20 += var12;
                var21 += var12;
            }
            if (var8 > var21) {
                float var22 = (float) (var8 - var21) * this.field5238.field111 / (float) this.field5238.field116;
                OpenGL.glTexCoord2f(0.0F, this.field5238.field109);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field5238.field109);
                OpenGL.glVertex2i(var8, var15);
            }
            var14 += var13;
            var15 += var13;
        }
        if (var9 > var15) {
            float var16 = (float) (this.field5238.field110 + var15 - var9) * this.field5238.field109 / (float) this.field5238.field110;
            int var17 = arg0 + this.field5238.field116;
            int var18 = arg0;
            while (var8 >= var17) {
                OpenGL.glTexCoord2f(0.0F, this.field5238.field109);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field5238.field111, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field5238.field111, this.field5238.field109);
                OpenGL.glVertex2i(var17, var15);
                var17 += var12;
                var18 += var12;
            }
            if (var18 < var8) {
                float var19 = (float) (var8 - var18) * this.field5238.field111 / (float) this.field5238.field116;
                OpenGL.glTexCoord2f(0.0F, this.field5238.field109);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field5238.field109);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(FFFFFFILua;II)V")
    public final void method163(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class600 arg7, int arg8, int arg9) {
        field5235++;
        class4 var11 = ((class268) arg7).field3385;
        if (this.field5226) {
            float var12 = (float) this.method160();
            float var13 = (float) this.method166();
            float var14 = (arg2 - arg0) / var12;
            float var15 = (arg3 - arg1) / var12;
            float var16 = (arg4 - arg0) / var13;
            float var17 = (arg5 - arg1) / var13;
            float var18 = (float) this.field5242 * var16;
            float var19 = (float) this.field5242 * var17;
            float var20 = (float) this.field5247 * var14;
            float var21 = (float) this.field5247 * var15;
            float var22 = (float) this.field5234 * -var14;
            float var23 = (float) this.field5234 * -var15;
            float var24 = (float) this.field5244 * -var16;
            arg3 = arg3 + var23 + var19;
            arg4 = arg4 + var20 + var24;
            float var25 = (float) this.field5244 * -var17;
            arg2 = arg2 + var22 + var18;
            arg0 = arg0 + var20 + var18;
            arg1 = arg1 + var21 + var19;
            arg5 = arg5 + var21 + var25;
        }
        float var26 = arg2 + arg4 - arg0;
        float var27 = arg5 + arg3 - arg1;
        this.field5238.method3396((arg6 & 0x1) != 0, 17137);
        this.field5240.method3022((byte) 3);
        this.field5240.method2960(this.field5238, -2);
        this.field5240.method3005(false, 1);
        this.field5240.method3027(1, true);
        this.field5240.method2960(var11, -2);
        this.field5240.method2983(7681, -465309136, 8448);
        this.field5240.method2966(0, 768, 768, 34168);
        this.field5240.method3017((byte) 99, 1);
        float var28 = var11.field111 / (float) var11.field116;
        float var29 = var11.field109 / (float) var11.field110;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field5238.field109);
        OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg8) * var28, var11.field109 - ((arg1 - (float) arg9) * var29));
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg8) * var28, var11.field109 - (arg5 - (float) arg9) * var29);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field5238.field111, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + var26) * var28, var11.field109 - (((float) (-arg9) + var27) * var29));
        OpenGL.glVertex2f(var26, var27);
        OpenGL.glMultiTexCoord2f(33984, this.field5238.field111, this.field5238.field109);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + arg2) * var28, var11.field109 - (((float) (-arg9) + arg3) * var29));
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field5240.method2966(0, 768, 768, 5890);
        this.field5240.method3005(false, 0);
        this.field5240.method2960(null, -2);
        this.field5240.method3027(0, true);
    }

    @OriginalMember(owner = "client!eca", name = "xa", descriptor = "(III)V")
    public final void method158(int arg0, int arg1, int arg2) {
        OpenGL.glPixelTransferf(3348, 0.5F);
        field5252++;
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field5232 = class450.method2405((byte) -87, this.field5240, this.field5238.field116, arg1, this.field5238.field110, arg0);
        this.field5241 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!eca", name = "da", descriptor = "(IIIIII)V")
    public final void method156(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5245++;
        this.field5238.method769(arg0, (byte) 40, arg5, arg4, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(B)V")
    private final void method2227(byte arg0) {
        this.field5240.method3027(1, true);
        field5229++;
        this.field5240.method2960(null, -2);
        if (arg0 > -53) {
            return;
        }
        this.field5240.method2983(8448, -465309136, 8448);
        this.field5240.method2966(1, 768, 768, 34168);
        this.field5240.method3015(5890, 770, 0, true);
        this.field5240.method3027(0, true);
        this.field5240.method2966(1, 768, 768, 34168);
    }

    @OriginalMember(owner = "client!eca", name = "ca", descriptor = "()I")
    public final int method166() {
        field5233++;
        return this.field5238.field110 + this.field5242 + this.field5244;
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(Llo;Z)V")
    public static final void method2228(class488 arg0, boolean arg1) {
        if (!class184.field2345) {
            class347.method1923(arg0, class701.field9910);
        } else if (arg1) {
            class523.field7115[class523.field7115.length - 1].method3657(true, arg0);
        } else {
            int var2 = class52.method334(arg0.field6462);
            int var3 = class244.field3024[2] * arg0.method72(-22496) / arg0.field6455;
            int var4 = class52.method334(arg0.field6462 - var3);
            int var5 = class52.method334(arg0.field6462 + var3);
            if (var4 == var5) {
                class523.field7115[var2].method3657(true, arg0);
            } else if (var5 - var4 == 1) {
                class523.field7115[class257.field3128 + var4].method3657(true, arg0);
            } else {
                class523.field7115[class523.field7115.length - 1].method3657(true, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!eca", name = "Q", descriptor = "(IIII)V")
    public final void method161(int arg0, int arg1, int arg2, int arg3) {
        this.field5247 = arg0;
        this.field5244 = arg3;
        field5249++;
        this.field5242 = arg1;
        this.field5234 = arg2;
        this.field5226 = this.field5247 != 0 || this.field5242 != 0 || this.field5234 != 0 || this.field5244 != 0;
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(BLr;)V")
    public static final void method2229(byte arg0, class566 arg1) {
        if (arg0 != -4) {
            field5248 = -1.049912F;
        }
        field5237++;
        if (class645.field9074.method241(arg0 ^ 0x48) == 0) {
            return;
        }
        if (class651.field9191 == 0) {
            for (class382 var4 = (class382) class645.field9074.method237(arg0 + 99); var4 != null; var4 = (class382) class645.field9074.method245((byte) 120)) {
                class633.field8881.method422(var4.field4826, false, arg1, var4.field4819, var4.field4822 ? class376.field4748.field7008 : null, false, var4.field4820, arg1, var4.field4827, class462.field5888, var4.field4825, 112);
                var4.method1871(-90);
            }
            class544.method2941(0);
            return;
        }
        if (class220.field2692 == null) {
            Canvas var2 = new Canvas();
            var2.setSize(36, 32);
            class220.field2692 = class566.method3111(0, 0, class651.field9183, var2, class689.field9772, -19464);
            class91.field1275 = class220.field2692.method989(class548.method2964((byte) 11, class301.field3700, 0, class622.field8710), class661.method3722(class631.field8846, class622.field8710, 0), true);
        }
        for (class382 var3 = (class382) class645.field9074.method237(arg0 + 111); var3 != null; var3 = (class382) class645.field9074.method245((byte) 90)) {
            class633.field8881.method422(var3.field4826, false, class220.field2692, var3.field4819, var3.field4822 ? class376.field4748.field7008 : null, false, var3.field4820, arg1, var3.field4827, class91.field1275, var3.field4825, arg0 ^ 0xFFFFFF8F);
            var3.method1871(arg0 ^ 0xA);
        }
    }

    @OriginalMember(owner = "client!eca", name = "V", descriptor = "(IIIII)V")
    public final void method155(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5236++;
        this.field5238.method3396(false, 17137);
        this.field5240.method3022((byte) 3);
        this.field5240.method3017((byte) 118, arg4);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field5242 + arg1;
        int var7 = this.field5247 + arg0;
        if (this.field5232 == null) {
            this.field5240.method2960(this.field5238, -2);
            this.field5240.method3005(false, arg2);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field5238.field109);
            OpenGL.glVertex2i(var7, var6);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var7, var6 + this.field5238.field110);
            OpenGL.glTexCoord2f(this.field5238.field111, 0.0F);
            OpenGL.glVertex2i(this.field5238.field116 + var7, var6 - -this.field5238.field110);
            OpenGL.glTexCoord2f(this.field5238.field111, this.field5238.field109);
            OpenGL.glVertex2i(this.field5238.field116 + var7, var6);
            OpenGL.glEnd();
            return;
        }
        this.method2225(arg2, 768);
        this.field5232.method3396(false, 17137);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field5238.field109);
        OpenGL.glTexCoord2f(0.0F, this.field5238.field109);
        OpenGL.glVertex2i(var7, var6);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var7, this.field5238.field110 + var6);
        OpenGL.glMultiTexCoord2f(33985, this.field5238.field111, 0.0F);
        OpenGL.glTexCoord2f(this.field5238.field111, 0.0F);
        OpenGL.glVertex2i(var7 + this.field5238.field116, var6 - -this.field5238.field110);
        OpenGL.glMultiTexCoord2f(33985, this.field5238.field111, this.field5238.field109);
        OpenGL.glTexCoord2f(this.field5238.field111, this.field5238.field109);
        OpenGL.glVertex2i(this.field5238.field116 + var7, var6);
        OpenGL.glEnd();
        this.method2227((byte) -112);
    }

    @OriginalMember(owner = "client!eca", name = "E", descriptor = "()I")
    public final int method167() {
        field5246++;
        return this.field5238.field116;
    }

    @OriginalMember(owner = "client!eca", name = "qa", descriptor = "(FFFFFFIIII)V")
    public final void method159(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        field5231++;
        if (this.field5226) {
            float var11 = (float) this.method160();
            float var12 = (float) this.method166();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field5242 * var15;
            float var18 = (float) this.field5242 * var16;
            float var19 = (float) this.field5247 * var13;
            float var20 = (float) this.field5247 * var14;
            float var21 = (float) this.field5234 * -var13;
            float var22 = (float) this.field5234 * -var14;
            float var23 = (float) this.field5244 * -var15;
            arg1 = arg1 + var20 + var18;
            float var24 = (float) this.field5244 * -var16;
            arg3 = arg3 + var22 + var18;
            arg0 = arg0 + var19 + var17;
            arg4 = arg4 + var19 + var23;
            arg2 = arg2 + var21 + var17;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        this.field5238.method3396((arg9 & 0x1) != 0, 17137);
        this.field5240.method3022((byte) 3);
        this.field5240.method2960(this.field5238, -2);
        this.field5240.method3017((byte) 76, arg8);
        this.field5240.method3005(false, arg6);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field5238.field109);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field5238.field111, 0.0F);
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glTexCoord2f(this.field5238.field111, this.field5238.field109);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(Lqj;IIZ)V")
    public class417(class548 arg0, int arg1, int arg2, boolean arg3) {
        this.field5240 = arg0;
        this.field5238 = class527.method2863(arg0, arg3 ? 6408 : 6407, arg2, arg1, 34037);
    }

    @OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(Lqj;IIII)V")
    public class417(class548 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5240 = arg0;
        this.field5238 = class450.method2405((byte) -87, arg0, arg3, arg2, arg4, arg1);
    }

    @OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(Lqj;II[III)V")
    public class417(class548 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field5240 = arg0;
        this.field5238 = class139.method805(26871, arg1, arg0, false, arg2, arg3);
    }
}
