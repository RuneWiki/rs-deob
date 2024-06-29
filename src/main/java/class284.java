import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class284 extends class312 {

    @OriginalMember(owner = "client!kv", name = "v", descriptor = "I")
    private int field3306 = 0;

    @OriginalMember(owner = "client!kv", name = "s", descriptor = "I")
    private int field3303 = 0;

    @OriginalMember(owner = "client!kv", name = "t", descriptor = "I")
    private int field3304 = 0;

    @OriginalMember(owner = "client!kv", name = "p", descriptor = "I")
    private int field3300 = 0;

    @OriginalMember(owner = "client!kv", name = "r", descriptor = "Z")
    private boolean field3302 = false;

    @OriginalMember(owner = "client!kv", name = "x", descriptor = "I")
    private int field3308 = 0;

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "Lpc;")
    private class700 field3288;

    @OriginalMember(owner = "client!kv", name = "z", descriptor = "Lqt;")
    private class664 field3310;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!kv", name = "e", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!kv", name = "f", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!kv", name = "g", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!kv", name = "h", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!kv", name = "i", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!kv", name = "j", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!kv", name = "l", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!kv", name = "m", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!kv", name = "n", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!kv", name = "o", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!kv", name = "q", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!kv", name = "u", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!kv", name = "w", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!kv", name = "y", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!kv", name = "A", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!kv", name = "k", descriptor = "Lqt;")
    private class664 field3295;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(I)V")
    private final void method1629(int arg0) {
        this.field3288.method3925((byte) 79, 1);
        field3305++;
        this.field3288.method3936(false, null);
        this.field3288.method3961(8448, 8448, 16127);
        this.field3288.method3903(34168, 1, 768, -116);
        this.field3288.method3931(arg0, 8960, 770, 5890);
        this.field3288.method3925((byte) 124, 0);
        this.field3288.method3903(34168, 1, 768, -123);
    }

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "(II)V")
    public static final void method1630(int arg0, int arg1) {
        field3296++;
        int var2 = class228.field2707 - class701.field9881;
        if (var2 >= 100) {
            class719.field10094 = -1;
            class131.field1617 = -1;
            class7.field100 = 1;
            return;
        }
        int var3 = (int) class229.field2718;
        if (var3 < class459.field6467 >> 8) {
            var3 = class459.field6467 >> 8;
        }
        if (class461.field6476[4] && var3 < class534.field7526[4] + 128) {
            var3 = class534.field7526[4] + 128;
        }
        int var4 = (int) class47.field626 + class136.field1711 & 0x3FFF;
        class481.method2857(class483.method2867(class581.field7921, (byte) -71, class300.field3596.field813, class300.field3596.field823) - 200, -5586, class353.field4390, (var3 >> 3) * 3 + 600 << 2, arg0, class713.field10000, var3, var4);
        float var5 = 1.0F - ((float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F);
        class599.field8107 = (int) ((float) (class599.field8107 - class231.field2759) * var5 + (float) class231.field2759);
        class350.field4366 = (int) ((float) (class350.field4366 - class460.field6473) * var5 + (float) class460.field6473);
        class303.field3622 = (int) ((float) (class303.field3622 - class353.field4397) * var5 + (float) class353.field4397);
        class793.field10893 = (int) ((float) (class793.field10893 - class316.field3889) * var5 + (float) class316.field3889);
        int var6 = class111.field1405 - class441.field5921;
        if (var6 > 8192) {
            var6 -= 16384;
        } else if (var6 < -8192) {
            var6 += 16384;
        }
        if (arg1 < 93) {
            method1630(73, -48);
        }
        class111.field1405 = (int) ((float) var6 * var5 + (float) class441.field5921);
        class111.field1405 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIII)V")
    public final void method240(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3310.method2347(false, 88);
        field3291++;
        this.field3288.method3951(-127);
        this.field3288.method3888((byte) 104, arg4);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field3308 + arg0;
        int var7 = this.field3300 + arg1;
        if (this.field3295 == null) {
            this.field3288.method3936(false, this.field3310);
            this.field3288.method3932(arg2, (byte) -99);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field3310.field9123);
            OpenGL.glVertex2i(var6, var7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var6, var7 + this.field3310.field9126);
            OpenGL.glTexCoord2f(this.field3310.field9127, 0.0F);
            OpenGL.glVertex2i(this.field3310.field9120 + var6, this.field3310.field9126 + var7);
            OpenGL.glTexCoord2f(this.field3310.field9127, this.field3310.field9123);
            OpenGL.glVertex2i(this.field3310.field9120 + var6, var7);
            OpenGL.glEnd();
            return;
        }
        this.method1639(arg2, false);
        this.field3295.method2347(false, -94);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field3310.field9123);
        OpenGL.glTexCoord2f(0.0F, this.field3310.field9123);
        OpenGL.glVertex2i(var6, var7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var6, var7 + this.field3310.field9126);
        OpenGL.glMultiTexCoord2f(33985, this.field3310.field9127, 0.0F);
        OpenGL.glTexCoord2f(this.field3310.field9127, 0.0F);
        OpenGL.glVertex2i(this.field3310.field9120 + var6, var7 - -this.field3310.field9126);
        OpenGL.glMultiTexCoord2f(33985, this.field3310.field9127, this.field3310.field9123);
        OpenGL.glTexCoord2f(this.field3310.field9127, this.field3310.field9123);
        OpenGL.glVertex2i(var6 + this.field3310.field9120, var7);
        OpenGL.glEnd();
        this.method1629(0);
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIII[III)V")
    private final void method1631(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        this.field3310.method1217(arg0, arg2, true, arg6, arg4, arg1, arg5, 0, arg3);
        field3311++;
    }

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "(IIII)V")
    public final void method1632(int arg0, int arg1, int arg2, int arg3) {
        this.field3300 = arg1;
        this.field3306 = arg3;
        field3287++;
        this.field3308 = arg0;
        this.field3303 = arg2;
        this.field3302 = this.field3308 != 0 || this.field3300 != 0 || this.field3303 != 0 || this.field3306 != 0;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(III)V")
    public final void method233(int arg0, int arg1, int arg2) {
        field3307++;
        OpenGL.glPixelTransferf(3348, 0.5F);
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field3295 = class594.method3404(arg1, this.field3310.field9126, (byte) 65, this.field3310.field9120, this.field3288, arg0);
        this.field3304 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "([I)V")
    public final void method1633(int[] arg0) {
        arg0[1] = this.field3300;
        arg0[2] = this.field3303;
        arg0[0] = this.field3308;
        arg0[3] = this.field3306;
        field3299++;
    }

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "()I")
    public final int method1634() {
        field3286++;
        return this.field3308 + this.field3303 + this.field3310.field9120;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIIIIII)V")
    public final void method234(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field3310.method2347((arg7 & 0x1) != 0, 79);
        field3292++;
        this.field3288.method3951(-91);
        this.field3288.method3888((byte) 54, arg6);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field3302) {
            float var9 = (float) arg2 / (float) this.method1634();
            float var10 = (float) arg3 / (float) this.method1636();
            float var11 = (float) this.field3308 * var9 + (float) arg0;
            float var12 = (float) this.field3300 * var10 + (float) arg1;
            float var13 = (float) this.field3310.field9120 * var9 + var11;
            float var14 = (float) this.field3310.field9126 * var10 + var12;
            if (this.field3295 == null) {
                this.field3288.method3936(false, this.field3310);
                this.field3288.method3932(arg4, (byte) 104);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field3310.field9123);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glTexCoord2f(this.field3310.field9127, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glTexCoord2f(this.field3310.field9127, this.field3310.field9123);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
            } else {
                this.method1639(arg4, false);
                this.field3295.method2347(true, -62);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field3310.field9123);
                OpenGL.glTexCoord2f(0.0F, this.field3310.field9123);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field3310.field9127, 0.0F);
                OpenGL.glTexCoord2f(this.field3310.field9127, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field3310.field9127, this.field3310.field9123);
                OpenGL.glTexCoord2f(this.field3310.field9127, this.field3310.field9123);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
                this.method1629(0);
            }
        } else if (this.field3295 == null) {
            this.field3288.method3936(false, this.field3310);
            this.field3288.method3932(arg4, (byte) 104);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field3310.field9123);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field3310.field9127, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field3310.field9127, this.field3310.field9123);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method1639(arg4, false);
            this.field3295.method2347(true, 123);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field3310.field9123);
            OpenGL.glTexCoord2f(0.0F, this.field3310.field9123);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field3310.field9127, 0.0F);
            OpenGL.glTexCoord2f(this.field3310.field9127, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field3310.field9127, this.field3310.field9123);
            OpenGL.glTexCoord2f(this.field3310.field9127, this.field3310.field9123);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method1629(0);
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIIIII)V")
    public final void method1635(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3309++;
        int var8 = arg0 + arg2;
        int var9 = arg1 + arg3;
        this.field3310.method2347(false, 86);
        this.field3288.method3951(-25);
        this.field3288.method3936(false, this.field3310);
        this.field3288.method3888((byte) 70, arg6);
        this.field3288.method3932(arg4, (byte) 60);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field3310.field9129 && !this.field3302) {
            float var10 = (float) arg3 * this.field3310.field9123 / (float) this.field3310.field9126;
            float var11 = (float) arg2 * this.field3310.field9127 / (float) this.field3310.field9120;
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
        OpenGL.glTranslatef((float) this.field3308, (float) this.field3300, 0.0F);
        int var12 = this.method1634();
        int var13 = this.method1636();
        int var14 = arg1 + this.field3310.field9126;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var9 >= var14) {
            int var20 = arg0 + this.field3310.field9120;
            int var21 = arg0;
            while (var8 >= var20) {
                OpenGL.glTexCoord2f(0.0F, this.field3310.field9123);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field3310.field9127, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field3310.field9127, this.field3310.field9123);
                OpenGL.glVertex2i(var20, var15);
                var20 += var12;
                var21 += var12;
            }
            if (var8 > var21) {
                float var22 = (float) (var8 - var21) * this.field3310.field9127 / (float) this.field3310.field9120;
                OpenGL.glTexCoord2f(0.0F, this.field3310.field9123);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field3310.field9123);
                OpenGL.glVertex2i(var8, var15);
            }
            var15 += var13;
            var14 += var13;
        }
        if (var9 > var15) {
            float var16 = (float) (this.field3310.field9126 + var15 - var9) * this.field3310.field9123 / (float) this.field3310.field9126;
            int var17 = this.field3310.field9120 + arg0;
            int var18 = arg0;
            while (var8 >= var17) {
                OpenGL.glTexCoord2f(0.0F, this.field3310.field9123);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field3310.field9127, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field3310.field9127, this.field3310.field9123);
                OpenGL.glVertex2i(var17, var15);
                var18 += var12;
                var17 += var12;
            }
            if (var8 > var18) {
                float var19 = (float) (var8 - var18) * this.field3310.field9127 / (float) this.field3310.field9120;
                OpenGL.glTexCoord2f(0.0F, this.field3310.field9123);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field3310.field9123);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IILaa;II)V")
    public final void method238(int arg0, int arg1, class513 arg2, int arg3, int arg4) {
        field3293++;
        class575 var6 = (class575) arg2;
        class664 var7 = var6.field7865;
        this.field3310.method2347(false, -88);
        this.field3288.method3951(-99);
        this.field3288.method3936(false, this.field3310);
        this.field3288.method3932(1, (byte) 59);
        this.field3288.method3925((byte) -122, 1);
        this.field3288.method3936(false, var7);
        this.field3288.method3961(8448, 7681, 16127);
        this.field3288.method3903(34168, 0, 768, -123);
        this.field3288.method3888((byte) 60, 1);
        int var8 = this.field3300 + arg1;
        int var9 = this.field3308 + arg0;
        int var10 = var9 + this.field3310.field9120;
        int var11 = var8 + this.field3310.field9126;
        float var12 = var7.field9127 / (float) var7.field9120;
        float var13 = var7.field9123 / (float) var7.field9126;
        float var14 = (float) (var9 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field9123 - (float) (var8 - arg4) * var13;
        float var17 = var7.field9123 - ((float) (var11 - arg4) * var13);
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field3310.field9123);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var9, var8);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var9, var8 + this.field3310.field9126);
        OpenGL.glMultiTexCoord2f(33984, this.field3310.field9127, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(this.field3310.field9120 + var9, this.field3310.field9126 + var8);
        OpenGL.glMultiTexCoord2f(33984, this.field3310.field9127, this.field3310.field9123);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(this.field3310.field9120 + var9, var8);
        OpenGL.glEnd();
        this.field3288.method3903(5890, 0, 768, -105);
        this.field3288.method3932(0, (byte) -91);
        this.field3288.method3936(false, null);
        this.field3288.method3925((byte) -107, 0);
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "()I")
    public final int method1636() {
        field3285++;
        return this.field3306 + this.field3300 + this.field3310.field9126;
    }

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "()I")
    public final int method1637() {
        field3301++;
        return this.field3310.field9126;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(FFFFFFIIII)V")
    public final void method1638(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field3302) {
            float var11 = (float) this.method1634();
            float var12 = (float) this.method1636();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field3300 * var15;
            float var18 = (float) this.field3300 * var16;
            float var19 = (float) this.field3308 * var13;
            float var20 = (float) this.field3308 * var14;
            float var21 = (float) this.field3303 * -var13;
            float var22 = (float) this.field3303 * -var14;
            float var23 = (float) this.field3306 * -var15;
            arg0 = arg0 + var19 + var17;
            arg2 = arg2 + var21 + var17;
            arg4 = arg4 + var19 + var23;
            float var24 = (float) this.field3306 * -var16;
            arg3 = arg3 + var22 + var18;
            arg1 = arg1 + var20 + var18;
            arg5 = arg5 + var20 + var24;
        }
        field3297++;
        float var25 = arg2 + arg4 - arg0;
        this.field3310.method2347((arg9 & 0x1) != 0, 74);
        float var26 = arg5 + arg3 - arg1;
        this.field3288.method3951(-97);
        this.field3288.method3936(false, this.field3310);
        this.field3288.method3888((byte) 95, arg8);
        this.field3288.method3932(arg6, (byte) 90);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field3310.field9123);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field3310.field9127, 0.0F);
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glTexCoord2f(this.field3310.field9127, this.field3310.field9123);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IZ)V")
    private final void method1639(int arg0, boolean arg1) {
        field3298++;
        this.field3288.method3925((byte) 25, 1);
        if (arg1) {
            this.method1634();
        }
        this.field3288.method3936(arg1, this.field3310);
        this.field3288.method3961(7681, this.field3288.method3937(arg0, -1), 16127);
        this.field3288.method3903(34167, 1, 768, -105);
        this.field3288.method3931(0, 8960, 770, 34168);
        this.field3288.method3925((byte) -117, 0);
        this.field3288.method3936(arg1, this.field3295);
        this.field3288.method3961(7681, 34479, 16127);
        this.field3288.method3903(34166, 1, 768, -117);
        if (this.field3304 == 0) {
            this.field3288.method3960(0.5F, 0.5F, 0.0F, 1.0F, -83);
        } else if (this.field3304 == 1) {
            this.field3288.method3960(1.0F, 0.5F, 0.0F, 0.5F, -38);
        } else if (this.field3304 == 2) {
            this.field3288.method3960(0.5F, 1.0F, 0.0F, 0.5F, -69);
        } else if (this.field3304 == 3) {
            this.field3288.method3960(128.5F, 128.5F, 0.0F, 128.5F, -64);
            return;
        }
    }

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "()I")
    public final int method1640() {
        field3289++;
        return this.field3310.field9120;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIIII)V")
    public final void method239(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3294++;
        if (!this.field3288.field9844) {
            this.field3310.method1220(arg5, arg4, (byte) -78, arg1, arg2, arg3, arg0);
            return;
        }
        int[] var7 = this.field3288.method87(arg4, arg5, arg2, arg3);
        if (var7 == null) {
            return;
        }
        for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = class5.method105(var7[var8], -16777216);
        }
        this.method1631(arg0, arg1, arg2, arg3, var7, 0, arg2);
        return;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public final void method1641(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class513 arg7, int arg8, int arg9) {
        field3290++;
        class664 var11 = ((class575) arg7).field7865;
        if (this.field3302) {
            float var12 = (float) this.method1634();
            float var13 = (float) this.method1636();
            float var14 = (arg2 - arg0) / var12;
            float var15 = (arg3 - arg1) / var12;
            float var16 = (arg4 - arg0) / var13;
            float var17 = (arg5 - arg1) / var13;
            float var18 = (float) this.field3300 * var16;
            float var19 = (float) this.field3300 * var17;
            float var20 = (float) this.field3308 * var14;
            float var21 = (float) this.field3308 * var15;
            float var22 = (float) this.field3303 * -var14;
            float var23 = (float) this.field3303 * -var15;
            float var24 = (float) this.field3306 * -var16;
            arg3 = arg3 + var23 + var19;
            arg4 = arg4 + var20 + var24;
            arg0 = arg0 + var20 + var18;
            float var25 = (float) this.field3306 * -var17;
            arg1 = arg1 + var21 + var19;
            arg2 = arg2 + var22 + var18;
            arg5 = arg5 + var21 + var25;
        }
        float var26 = arg2 + arg4 - arg0;
        this.field3310.method2347((arg6 & 0x1) != 0, -96);
        float var27 = arg5 + arg3 - arg1;
        this.field3288.method3951(-73);
        this.field3288.method3936(false, this.field3310);
        this.field3288.method3932(1, (byte) 93);
        this.field3288.method3925((byte) -97, 1);
        this.field3288.method3936(false, var11);
        this.field3288.method3961(8448, 7681, 16127);
        this.field3288.method3903(34168, 0, 768, -122);
        this.field3288.method3888((byte) 33, 1);
        float var28 = var11.field9127 / (float) var11.field9120;
        float var29 = var11.field9123 / (float) var11.field9126;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field3310.field9123);
        OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg8) * var28, var11.field9123 - (arg1 - (float) arg9) * var29);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + arg4) * var28, var11.field9123 - ((arg5 - (float) arg9) * var29));
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field3310.field9127, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (var26 - (float) arg8) * var28, var11.field9123 - ((float) (-arg9) + var27) * var29);
        OpenGL.glVertex2f(var26, var27);
        OpenGL.glMultiTexCoord2f(33984, this.field3310.field9127, this.field3310.field9123);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + arg2) * var28, var11.field9123 - (((float) (-arg9) + arg3) * var29));
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field3288.method3903(5890, 0, 768, -117);
        this.field3288.method3932(0, (byte) -126);
        this.field3288.method3936(false, null);
        this.field3288.method3925((byte) 113, 0);
    }

    @OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Lpc;IIZ)V")
    public class284(class700 arg0, int arg1, int arg2, boolean arg3) {
        this.field3288 = arg0;
        this.field3310 = class380.method2225(-95, arg2, arg3 ? 6408 : 6407, arg1, arg0);
    }

    @OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Lpc;IIII)V")
    public class284(class700 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3288 = arg0;
        this.field3310 = class594.method3404(arg2, arg4, (byte) 94, arg3, arg0, arg1);
    }

    @OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Lpc;II[III)V")
    public class284(class700 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field3288 = arg0;
        this.field3310 = class245.method1480(false, arg4, arg1, 3553, arg0, arg5, arg3, arg2);
    }
}
