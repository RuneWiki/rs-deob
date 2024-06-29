import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class453 extends class433 {

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
    private int field6755 = 0;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
    private int field6753 = 0;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "Z")
    private boolean field6751 = false;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    private int field6748 = 0;

    @OriginalMember(owner = "client!sf", name = "y", descriptor = "I")
    private int field6772 = 0;

    @OriginalMember(owner = "client!sf", name = "B", descriptor = "I")
    private int field6775 = 0;

    @OriginalMember(owner = "client!sf", name = "A", descriptor = "Lad;")
    private class362 field6774;

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "Lah;")
    private class325 field6758;

    @OriginalMember(owner = "client!sf", name = "z", descriptor = "[Lgea;")
    public static class66[] field6773 = new class66[14];

    @OriginalMember(owner = "client!sf", name = "t", descriptor = "Lig;")
    public static class206 field6767 = new class206(9, 0);

    @OriginalMember(owner = "client!sf", name = "C", descriptor = "Lkca;")
    public static class73 field6776 = new class73(51, 4);

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public static int field6749;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public static int field6750;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    public static int field6752;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
    public static int field6754;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
    public static int field6756;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "I")
    public static int field6757;

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "I")
    public static int field6759;

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "I")
    public static int field6760;

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "I")
    public static int field6761;

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "I")
    public static int field6762;

    @OriginalMember(owner = "client!sf", name = "q", descriptor = "I")
    public static int field6764;

    @OriginalMember(owner = "client!sf", name = "r", descriptor = "I")
    public static int field6765;

    @OriginalMember(owner = "client!sf", name = "s", descriptor = "I")
    public static int field6766;

    @OriginalMember(owner = "client!sf", name = "u", descriptor = "I")
    public static int field6768;

    @OriginalMember(owner = "client!sf", name = "v", descriptor = "I")
    public static int field6769;

    @OriginalMember(owner = "client!sf", name = "w", descriptor = "I")
    public static int field6770;

    @OriginalMember(owner = "client!sf", name = "x", descriptor = "I")
    public static int field6771;

    @OriginalMember(owner = "client!sf", name = "D", descriptor = "Ldea;")
    public static class208 field6777;

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "Lah;")
    private class325 field6763;

    @OriginalMember(owner = "client!sf", name = "F", descriptor = "Lxa;")
    public static class433 field6779;

    @OriginalMember(owner = "client!sf", name = "E", descriptor = "[Lvn;")
    public static class263[] field6778;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V", line = 3)
    public static final void method2798(byte arg0) {
        field6769++;
        int var1 = -100 / ((arg0 - 56) / 38);
        if (class227.field3184 != null) {
            class227.field3184.method161(81);
        }
        if (class321.field4651 != null) {
            class321.field4651.method161(95);
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(II)V", line = 23)
    public static final void method2799(int arg0, int arg1) {
        int var2 = -71 % ((47 - arg0) / 35);
        if (class253.field3576 == 1) {
            class511.field7473 = arg1;
        } else if (class253.field3576 == 2 || class253.field3576 == 3) {
            class123.field1539 = arg1;
        }
        field6750++;
    }

    @OriginalMember(owner = "client!sf", name = "GA", descriptor = "(IIIIII)V", line = 41)
    public final void method1581(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6758.method1873(arg1, arg5, arg3, arg2, arg0, 0, arg4);
        field6749++;
    }

    @OriginalMember(owner = "client!sf", name = "KA", descriptor = "(IIIIIII)V", line = 51)
    public final void method1582(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6757++;
        this.field6758.method3020(true, 0);
        this.field6774.method2323(true);
        this.field6774.method2327(arg6, (byte) 49);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field6751) {
            float var8 = (float) arg2 / (float) this.method1577();
            float var9 = (float) arg3 / (float) this.method1568();
            float var10 = (float) this.field6748 * var8 + (float) arg0;
            float var11 = (float) this.field6755 * var9 + (float) arg1;
            float var12 = (float) this.field6758.field4685 * var8 + var10;
            float var13 = (float) this.field6758.field4692 * var9 + var11;
            if (this.field6763 == null) {
                this.field6774.method2295(-73, this.field6758);
                this.field6774.method2288(arg4, 7681);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field6758.field4687);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glTexCoord2f(this.field6758.field4691, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glTexCoord2f(this.field6758.field4691, this.field6758.field4687);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
            } else {
                this.method2801(arg4, 0);
                this.field6763.method3020(true, 0);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field6758.field4687);
                OpenGL.glTexCoord2f(0.0F, this.field6758.field4687);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field6758.field4691, 0.0F);
                OpenGL.glTexCoord2f(this.field6758.field4691, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field6758.field4691, this.field6758.field4687);
                OpenGL.glTexCoord2f(this.field6758.field4691, this.field6758.field4687);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
                this.method2800(true);
            }
        } else if (this.field6763 == null) {
            this.field6774.method2295(-85, this.field6758);
            this.field6774.method2288(arg4, 7681);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field6758.field4687);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field6758.field4691, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field6758.field4691, this.field6758.field4687);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method2801(arg4, 0);
            this.field6763.method3020(true, 0);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field6758.field4687);
            OpenGL.glTexCoord2f(0.0F, this.field6758.field4687);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field6758.field4691, 0.0F);
            OpenGL.glTexCoord2f(this.field6758.field4691, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field6758.field4691, this.field6758.field4687);
            OpenGL.glTexCoord2f(this.field6758.field4691, this.field6758.field4687);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method2800(true);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "()I", line = 157)
    public final int method1568() {
        field6756++;
        return this.field6758.field4692 + this.field6753 + this.field6755;
    }

    @OriginalMember(owner = "client!sf", name = "t", descriptor = "(III)V", line = 165)
    public final void method1569(int arg0, int arg1, int arg2) {
        field6761++;
        OpenGL.glPixelTransferf(3348, 0.5F);
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field6763 = class298.method1992(this.field6774, arg0, this.field6758.field4692, this.field6758.field4685, -119, arg1);
        this.field6772 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)V", line = 188)
    private final void method2800(boolean arg0) {
        if (!arg0) {
            return;
        }
        this.field6774.method2269((byte) -94, 1);
        field6759++;
        this.field6774.method2295(-77, null);
        this.field6774.method2320(8448, 8448, 0);
        this.field6774.method2291(34168, 1, 768, (byte) -35);
        this.field6774.method2333(770, 5890, 0, (byte) 123);
        this.field6774.method2269((byte) -124, 0);
        this.field6774.method2291(34168, 1, 768, (byte) -35);
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(II)V", line = 207)
    private final void method2801(int arg0, int arg1) {
        field6765++;
        this.field6774.method2269((byte) -109, 1);
        this.field6774.method2295(-124, this.field6758);
        this.field6774.method2320(7681, this.field6774.method2316((byte) -56, arg0), 0);
        this.field6774.method2291(34167, 1, 768, (byte) -35);
        this.field6774.method2333(770, 34168, 0, (byte) 62);
        this.field6774.method2269((byte) 65, 0);
        this.field6774.method2295(-54, this.field6763);
        this.field6774.method2320(7681, 34479, arg1);
        this.field6774.method2291(34166, 1, 768, (byte) -35);
        if (this.field6772 == arg1) {
            this.field6774.method2322((byte) -116, 1.0F, 0.5F, 0.0F, 0.5F);
        } else if (this.field6772 == 1) {
            this.field6774.method2322((byte) -122, 0.5F, 0.5F, 0.0F, 1.0F);
        } else if (this.field6772 == 2) {
            this.field6774.method2322((byte) -123, 0.5F, 1.0F, 0.0F, 0.5F);
            return;
        } else if (this.field6772 == 3) {
            this.field6774.method2322((byte) -100, 128.5F, 128.5F, 0.0F, 128.5F);
            return;
        }
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lad;IIII)V", line = 720)
    public class453(class362 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field6774 = arg0;
        this.field6758 = class298.method1992(arg0, arg1, arg4, arg3, -108, arg2);
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lad;II[III)V", line = 745)
    public class453(class362 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field6774 = arg0;
        this.field6758 = class168.method965(arg3, false, arg0, (byte) 66, arg2, arg1);
    }

    @OriginalMember(owner = "client!sf", name = "AA", descriptor = "()I", line = 247)
    public final int method1577() {
        field6766++;
        return this.field6775 + this.field6748 + this.field6758.field4685;
    }

    @OriginalMember(owner = "client!sf", name = "sa", descriptor = "(FFFFFFIII)V", line = 255)
    public final void method1583(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field6751) {
            float var10 = (float) this.method1577();
            float var11 = (float) this.method1568();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field6755 * var14;
            float var17 = (float) this.field6755 * var15;
            float var18 = (float) this.field6748 * var12;
            float var19 = (float) this.field6748 * var13;
            float var20 = (float) this.field6775 * -var12;
            float var21 = (float) this.field6775 * -var13;
            float var22 = (float) this.field6753 * -var14;
            arg1 = arg1 + var19 + var17;
            arg0 = arg0 + var18 + var16;
            arg4 = arg4 + var18 + var22;
            arg3 = arg3 + var21 + var17;
            float var23 = (float) this.field6753 * -var15;
            arg2 = arg2 + var20 + var16;
            arg5 = arg5 + var19 + var23;
        }
        field6770++;
        float var24 = arg2 + arg4 - arg0;
        float var25 = arg5 + arg3 - arg1;
        this.field6758.method3020(true, 0);
        this.field6774.method2323(true);
        this.field6774.method2295(-55, this.field6758);
        this.field6774.method2327(arg8, (byte) 34);
        this.field6774.method2288(arg6, 7681);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field6758.field4687);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field6758.field4691, 0.0F);
        OpenGL.glVertex2f(var24, var25);
        OpenGL.glTexCoord2f(this.field6758.field4691, this.field6758.field4687);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "()I", line = 322)
    public final int method1576() {
        field6771++;
        return this.field6758.field4692;
    }

    @OriginalMember(owner = "client!sf", name = "I", descriptor = "(IIIII)V", line = 333)
    public final void method1571(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field6758.method3020(false, 0);
        field6768++;
        this.field6774.method2323(true);
        this.field6774.method2327(arg4, (byte) -125);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field6755 + arg1;
        int var7 = this.field6748 + arg0;
        if (this.field6763 == null) {
            this.field6774.method2295(-109, this.field6758);
            this.field6774.method2288(arg2, 7681);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field6758.field4687);
            OpenGL.glVertex2i(var7, var6);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var7, this.field6758.field4692 + var6);
            OpenGL.glTexCoord2f(this.field6758.field4691, 0.0F);
            OpenGL.glVertex2i(this.field6758.field4685 + var7, this.field6758.field4692 + var6);
            OpenGL.glTexCoord2f(this.field6758.field4691, this.field6758.field4687);
            OpenGL.glVertex2i(this.field6758.field4685 + var7, var6);
            OpenGL.glEnd();
            return;
        }
        this.method2801(arg2, 0);
        this.field6763.method3020(false, 0);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field6758.field4687);
        OpenGL.glTexCoord2f(0.0F, this.field6758.field4687);
        OpenGL.glVertex2i(var7, var6);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var7, var6 + this.field6758.field4692);
        OpenGL.glMultiTexCoord2f(33985, this.field6758.field4691, 0.0F);
        OpenGL.glTexCoord2f(this.field6758.field4691, 0.0F);
        OpenGL.glVertex2i(var7 + this.field6758.field4685, var6 - -this.field6758.field4692);
        OpenGL.glMultiTexCoord2f(33985, this.field6758.field4691, this.field6758.field4687);
        OpenGL.glTexCoord2f(this.field6758.field4691, this.field6758.field4687);
        OpenGL.glVertex2i(this.field6758.field4685 + var7, var6);
        OpenGL.glEnd();
        this.method2800(true);
    }

    @OriginalMember(owner = "client!sf", name = "QA", descriptor = "()I", line = 396)
    public final int method1570() {
        field6762++;
        return this.field6758.field4685;
    }

    @OriginalMember(owner = "client!sf", name = "ba", descriptor = "(IIIIIII)V", line = 412)
    public final void method1574(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6764++;
        int var8 = arg0 + arg2;
        this.field6758.method3020(false, 0);
        int var9 = arg1 + arg3;
        this.field6774.method2323(true);
        this.field6774.method2295(-67, this.field6758);
        this.field6774.method2327(arg6, (byte) -128);
        this.field6774.method2288(arg4, 7681);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field6758.field4686 && !this.field6751) {
            float var10 = (float) arg3 * this.field6758.field4687 / (float) this.field6758.field4692;
            float var11 = (float) arg2 * this.field6758.field4691 / (float) this.field6758.field4685;
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
        OpenGL.glTranslatef((float) this.field6748, (float) this.field6755, 0.0F);
        int var12 = this.method1577();
        int var13 = this.method1568();
        int var14 = this.field6758.field4692 + arg1;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var14 <= var9) {
            int var20 = this.field6758.field4685 + arg0;
            int var21 = arg0;
            while (var8 >= var20) {
                OpenGL.glTexCoord2f(0.0F, this.field6758.field4687);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field6758.field4691, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field6758.field4691, this.field6758.field4687);
                OpenGL.glVertex2i(var20, var15);
                var21 += var12;
                var20 += var12;
            }
            if (var21 < var8) {
                float var22 = (float) (var8 - var21) * this.field6758.field4691 / (float) this.field6758.field4685;
                OpenGL.glTexCoord2f(0.0F, this.field6758.field4687);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field6758.field4687);
                OpenGL.glVertex2i(var8, var15);
            }
            var14 += var13;
            var15 += var13;
        }
        if (var9 > var15) {
            float var16 = (float) (var15 + this.field6758.field4692 - var9) * this.field6758.field4687 / (float) this.field6758.field4692;
            int var17 = arg0 + this.field6758.field4685;
            int var18 = arg0;
            while (var8 >= var17) {
                OpenGL.glTexCoord2f(0.0F, this.field6758.field4687);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field6758.field4691, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field6758.field4691, this.field6758.field4687);
                OpenGL.glVertex2i(var17, var15);
                var18 += var12;
                var17 += var12;
            }
            if (var8 > var18) {
                float var19 = (float) (var8 - var18) * this.field6758.field4691 / (float) this.field6758.field4685;
                OpenGL.glTexCoord2f(0.0F, this.field6758.field4687);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field6758.field4687);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(FFFFFFLfa;II)V", line = 560)
    public final void method1578(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class199 arg6, int arg7, int arg8) {
        field6754++;
        class325 var10 = ((class34) arg6).field388;
        if (this.field6751) {
            float var11 = (float) this.method1577();
            float var12 = (float) this.method1568();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field6755 * var15;
            float var18 = (float) this.field6755 * var16;
            float var19 = (float) this.field6748 * var13;
            float var20 = (float) this.field6748 * var14;
            float var21 = (float) this.field6775 * -var13;
            float var22 = (float) this.field6775 * -var14;
            float var23 = (float) this.field6753 * -var15;
            arg3 = arg3 + var22 + var18;
            arg0 = arg0 + var19 + var17;
            arg2 = arg2 + var21 + var17;
            arg4 = arg4 + var19 + var23;
            float var24 = (float) this.field6753 * -var16;
            arg1 = arg1 + var20 + var18;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        this.field6758.method3020(true, 0);
        this.field6774.method2323(true);
        this.field6774.method2295(-91, this.field6758);
        this.field6774.method2288(1, 7681);
        this.field6774.method2269((byte) -95, 1);
        this.field6774.method2295(-102, var10);
        this.field6774.method2320(8448, 7681, 0);
        this.field6774.method2291(34168, 0, 768, (byte) -35);
        this.field6774.method2327(1, (byte) -122);
        float var27 = var10.field4691 / (float) var10.field4685;
        float var28 = var10.field4687 / (float) var10.field4692;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field6758.field4687);
        OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * var27, var10.field4687 - (((float) (-arg8) + arg1) * var28));
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * var27, var10.field4687 - ((arg5 - (float) arg8) * var28));
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field6758.field4691, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (var25 - (float) arg7) * var27, var10.field4687 - ((var26 - (float) arg8) * var28));
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glMultiTexCoord2f(33984, this.field6758.field4691, this.field6758.field4687);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + arg2) * var27, var10.field4687 - (arg3 - (float) arg8) * var28);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field6774.method2291(5890, 0, 768, (byte) -35);
        this.field6774.method2288(0, 7681);
        this.field6774.method2295(-110, null);
        this.field6774.method2269((byte) 64, 0);
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(Z)V", line = 646)
    public static void method2802(boolean arg0) {
        field6773 = null;
        field6776 = null;
        if (arg0) {
            method2802(true);
        }
        field6777 = null;
        field6778 = null;
        field6779 = null;
        field6767 = null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IILfa;II)V", line = 661)
    public final void method1572(int arg0, int arg1, class199 arg2, int arg3, int arg4) {
        field6760++;
        class34 var6 = (class34) arg2;
        class325 var7 = var6.field388;
        this.field6758.method3020(false, 0);
        this.field6774.method2323(true);
        this.field6774.method2295(-108, this.field6758);
        this.field6774.method2288(1, 7681);
        this.field6774.method2269((byte) -114, 1);
        this.field6774.method2295(-108, var7);
        this.field6774.method2320(8448, 7681, 0);
        this.field6774.method2291(34168, 0, 768, (byte) -35);
        this.field6774.method2327(1, (byte) -121);
        int var8 = this.field6755 + arg1;
        int var9 = this.field6748 + arg0;
        int var10 = this.field6758.field4685 + var9;
        int var11 = this.field6758.field4692 + var8;
        float var12 = var7.field4691 / (float) var7.field4685;
        float var13 = var7.field4687 / (float) var7.field4692;
        float var14 = (float) (var9 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field4687 - ((float) (var8 - arg4) * var13);
        float var17 = var7.field4687 - (float) (var11 - arg4) * var13;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field6758.field4687);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var9, var8);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var9, this.field6758.field4692 + var8);
        OpenGL.glMultiTexCoord2f(33984, this.field6758.field4691, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(this.field6758.field4685 + var9, this.field6758.field4692 + var8);
        OpenGL.glMultiTexCoord2f(33984, this.field6758.field4691, this.field6758.field4687);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(var9 + this.field6758.field4685, var8);
        OpenGL.glEnd();
        this.field6774.method2291(5890, 0, 768, (byte) -35);
        this.field6774.method2288(0, 7681);
        this.field6774.method2295(-86, null);
        this.field6774.method2269((byte) 95, 0);
    }

    @OriginalMember(owner = "client!sf", name = "EA", descriptor = "(IIII)V", line = 734)
    public final void method1580(int arg0, int arg1, int arg2, int arg3) {
        this.field6755 = arg1;
        this.field6748 = arg0;
        field6752++;
        this.field6753 = arg3;
        this.field6775 = arg2;
        this.field6751 = this.field6748 != 0 || this.field6755 != 0 || this.field6775 != 0 || this.field6753 != 0;
    }
}
