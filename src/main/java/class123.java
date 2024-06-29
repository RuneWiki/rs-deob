import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class123 extends class702 {

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "I")
    private int field1834 = 0;

    @OriginalMember(owner = "client!fn", name = "j", descriptor = "Z")
    private boolean field1843 = false;

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "I")
    private int field1839 = 0;

    @OriginalMember(owner = "client!fn", name = "t", descriptor = "I")
    private int field1853 = 0;

    @OriginalMember(owner = "client!fn", name = "l", descriptor = "I")
    private int field1845 = 0;

    @OriginalMember(owner = "client!fn", name = "n", descriptor = "I")
    private int field1847 = 0;

    @OriginalMember(owner = "client!fn", name = "p", descriptor = "Lok;")
    private class228 field1849;

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "Lot;")
    public class546 field1836;

    @OriginalMember(owner = "client!fn", name = "u", descriptor = "Lnea;")
    public static class664 field1854 = new class664(3, 6);

    @OriginalMember(owner = "client!fn", name = "B", descriptor = "Z")
    public static boolean field1861 = false;

    @OriginalMember(owner = "client!fn", name = "v", descriptor = "Lmf;")
    public static class382 field1855 = new class382(8);

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!fn", name = "i", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!fn", name = "k", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!fn", name = "m", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!fn", name = "o", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!fn", name = "q", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!fn", name = "r", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!fn", name = "s", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!fn", name = "w", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!fn", name = "x", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!fn", name = "y", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!fn", name = "z", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!fn", name = "A", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!fn", name = "h", descriptor = "Lot;")
    private class546 field1841;

    @OriginalMember(owner = "client!fn", name = "C", descriptor = "Lf;")
    public static class702 field1862;

    @OriginalMember(owner = "client!fn", name = "DA", descriptor = "(IIIIIII)V", line = 3)
    public final void method926(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1846++;
        int var8 = arg0 + arg2;
        this.field1836.method3617((byte) 41, false);
        int var9 = arg1 + arg3;
        this.field1849.method1494(118);
        this.field1849.method1505(-2, this.field1836);
        this.field1849.method1536(0, arg6);
        this.field1849.method1497(arg4, (byte) -29);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field1836.field7680 && !this.field1843) {
            float var10 = (float) arg3 * this.field1836.field7682 / (float) this.field1836.field7677;
            float var11 = (float) arg2 * this.field1836.field7676 / (float) this.field1836.field7681;
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
        OpenGL.glTranslatef((float) this.field1847, (float) this.field1839, 0.0F);
        int var12 = this.method931();
        int var13 = this.method936();
        int var14 = this.field1836.field7677 + arg1;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var9 >= var14) {
            int var20 = this.field1836.field7681 + arg0;
            int var21 = arg0;
            while (var8 >= var20) {
                OpenGL.glTexCoord2f(0.0F, this.field1836.field7682);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field1836.field7676, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field1836.field7676, this.field1836.field7682);
                OpenGL.glVertex2i(var20, var15);
                var21 += var12;
                var20 += var12;
            }
            if (var21 < var8) {
                float var22 = (float) (var8 - var21) * this.field1836.field7676 / (float) this.field1836.field7681;
                OpenGL.glTexCoord2f(0.0F, this.field1836.field7682);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field1836.field7682);
                OpenGL.glVertex2i(var8, var15);
            }
            var14 += var13;
            var15 += var13;
        }
        if (var15 < var9) {
            float var16 = (float) (var15 + this.field1836.field7677 - var9) * this.field1836.field7682 / (float) this.field1836.field7677;
            int var17 = arg0 + this.field1836.field7681;
            int var18 = arg0;
            while (var8 >= var17) {
                OpenGL.glTexCoord2f(0.0F, this.field1836.field7682);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field1836.field7676, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field1836.field7676, this.field1836.field7682);
                OpenGL.glVertex2i(var17, var15);
                var17 += var12;
                var18 += var12;
            }
            if (var8 > var18) {
                float var19 = (float) (var8 - var18) * this.field1836.field7676 / (float) this.field1836.field7681;
                OpenGL.glTexCoord2f(0.0F, this.field1836.field7682);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field1836.field7682);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!fn", name = "E", descriptor = "()I", line = 142)
    public final int method927() {
        field1857++;
        return this.field1836.field7681;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZI)Z", line = 155)
    public static final boolean method928(boolean arg0, int arg1) {
        if (!arg0) {
            field1854 = null;
        }
        field1838++;
        return arg1 == 0 || arg1 == 1 || arg1 == 2;
    }

    @OriginalMember(owner = "client!fn", name = "V", descriptor = "(IIIII)V", line = 167)
    public final void method929(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1852++;
        this.field1836.method3617((byte) 41, false);
        this.field1849.method1494(99);
        this.field1849.method1536(0, arg4);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field1847 + arg0;
        int var7 = this.field1839 + arg1;
        if (this.field1841 == null) {
            this.field1849.method1505(-2, this.field1836);
            this.field1849.method1497(arg2, (byte) -29);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field1836.field7682);
            OpenGL.glVertex2i(var6, var7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var6, this.field1836.field7677 + var7);
            OpenGL.glTexCoord2f(this.field1836.field7676, 0.0F);
            OpenGL.glVertex2i(this.field1836.field7681 + var6, this.field1836.field7677 + var7);
            OpenGL.glTexCoord2f(this.field1836.field7676, this.field1836.field7682);
            OpenGL.glVertex2i(var6 + this.field1836.field7681, var7);
            OpenGL.glEnd();
            return;
        }
        this.method932(arg2, (byte) 54);
        this.field1841.method3617((byte) 41, false);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field1836.field7682);
        OpenGL.glTexCoord2f(0.0F, this.field1836.field7682);
        OpenGL.glVertex2i(var6, var7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var6, this.field1836.field7677 + var7);
        OpenGL.glMultiTexCoord2f(33985, this.field1836.field7676, 0.0F);
        OpenGL.glTexCoord2f(this.field1836.field7676, 0.0F);
        OpenGL.glVertex2i(this.field1836.field7681 + var6, this.field1836.field7677 + var7);
        OpenGL.glMultiTexCoord2f(33985, this.field1836.field7676, this.field1836.field7682);
        OpenGL.glTexCoord2f(this.field1836.field7676, this.field1836.field7682);
        OpenGL.glVertex2i(this.field1836.field7681 + var6, var7);
        OpenGL.glEnd();
        this.method938(-117);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(FFFFFFILua;II)V", line = 222)
    public final void method930(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class617 arg7, int arg8, int arg9) {
        field1848++;
        class546 var11 = ((class448) arg7).field6481;
        if (this.field1843) {
            float var12 = (float) this.method931();
            float var13 = (float) this.method936();
            float var14 = (arg2 - arg0) / var12;
            float var15 = (arg3 - arg1) / var12;
            float var16 = (arg4 - arg0) / var13;
            float var17 = (arg5 - arg1) / var13;
            float var18 = (float) this.field1839 * var16;
            float var19 = (float) this.field1839 * var17;
            float var20 = (float) this.field1847 * var14;
            float var21 = (float) this.field1847 * var15;
            float var22 = (float) this.field1834 * -var14;
            float var23 = (float) this.field1834 * -var15;
            float var24 = (float) this.field1845 * -var16;
            float var25 = (float) this.field1845 * -var17;
            arg3 = arg3 + var23 + var19;
            arg2 = arg2 + var22 + var18;
            arg0 = arg0 + var20 + var18;
            arg1 = arg1 + var21 + var19;
            arg4 = arg4 + var20 + var24;
            arg5 = arg5 + var21 + var25;
        }
        float var26 = arg2 + arg4 - arg0;
        this.field1836.method3617((byte) 41, (arg6 & 0x1) != 0);
        float var27 = arg5 + arg3 - arg1;
        this.field1849.method1494(4);
        this.field1849.method1505(-2, this.field1836);
        this.field1849.method1497(1, (byte) -29);
        this.field1849.method1500(33984, 1);
        this.field1849.method1505(-2, var11);
        this.field1849.method1527(1, 7681, 8448);
        this.field1849.method1503(0, 34168, (byte) 2, 768);
        this.field1849.method1536(0, 1);
        float var28 = var11.field7676 / (float) var11.field7681;
        float var29 = var11.field7682 / (float) var11.field7677;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field1836.field7682);
        OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg8) * var28, var11.field7682 - ((float) (-arg9) + arg1) * var29);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + arg4) * var28, var11.field7682 - ((arg5 - (float) arg9) * var29));
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field1836.field7676, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (var26 - (float) arg8) * var28, var11.field7682 - ((float) (-arg9) + var27) * var29);
        OpenGL.glVertex2f(var26, var27);
        OpenGL.glMultiTexCoord2f(33984, this.field1836.field7676, this.field1836.field7682);
        OpenGL.glMultiTexCoord2f(33985, (arg2 - (float) arg8) * var28, var11.field7682 - ((arg3 - (float) arg9) * var29));
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field1849.method1503(0, 5890, (byte) 2, 768);
        this.field1849.method1497(0, (byte) -29);
        this.field1849.method1505(-2, null);
        this.field1849.method1500(33984, 0);
    }

    @OriginalMember(owner = "client!fn", name = "A", descriptor = "()I", line = 308)
    public final int method931() {
        field1837++;
        return this.field1847 + this.field1834 + this.field1836.field7681;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IB)V", line = 317)
    private final void method932(int arg0, byte arg1) {
        field1860++;
        this.field1849.method1500(33984, 1);
        this.field1849.method1505(-2, this.field1836);
        this.field1849.method1527(1, this.field1849.method1508(arg0, -117), 7681);
        this.field1849.method1503(1, 34167, (byte) 2, 768);
        this.field1849.method1574(34168, (byte) -128, 770, 0);
        this.field1849.method1500(33984, 0);
        this.field1849.method1505(-2, this.field1841);
        this.field1849.method1527(1, 34479, 7681);
        this.field1849.method1503(1, 34166, (byte) 2, 768);
        if (this.field1853 == 0) {
            this.field1849.method1550(0.5F, true, 1.0F, 0.0F, 0.5F);
        } else if (this.field1853 == 1) {
            this.field1849.method1550(1.0F, true, 0.5F, 0.0F, 0.5F);
        } else if (this.field1853 == 2) {
            this.field1849.method1550(0.5F, true, 0.5F, 0.0F, 1.0F);
        } else if (this.field1853 == 3) {
            this.field1849.method1550(128.5F, true, 128.5F, 0.0F, 128.5F);
        }
        int var3 = 112 % ((arg1 + 58) / 54);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IILua;II)V", line = 352)
    public final void method933(int arg0, int arg1, class617 arg2, int arg3, int arg4) {
        field1850++;
        class448 var6 = (class448) arg2;
        class546 var7 = var6.field6481;
        this.field1836.method3617((byte) 41, false);
        this.field1849.method1494(99);
        this.field1849.method1505(-2, this.field1836);
        this.field1849.method1497(1, (byte) -29);
        this.field1849.method1500(33984, 1);
        this.field1849.method1505(-2, var7);
        this.field1849.method1527(1, 7681, 8448);
        this.field1849.method1503(0, 34168, (byte) 2, 768);
        this.field1849.method1536(0, 1);
        int var8 = this.field1839 + arg1;
        int var9 = this.field1847 + arg0;
        int var10 = this.field1836.field7681 + var9;
        int var11 = this.field1836.field7677 + var8;
        float var12 = var7.field7676 / (float) var7.field7681;
        float var13 = var7.field7682 / (float) var7.field7677;
        float var14 = (float) (var9 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field7682 - (float) (var8 - arg4) * var13;
        float var17 = var7.field7682 - ((float) (var11 - arg4) * var13);
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field1836.field7682);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var9, var8);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var9, this.field1836.field7677 + var8);
        OpenGL.glMultiTexCoord2f(33984, this.field1836.field7676, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(this.field1836.field7681 + var9, this.field1836.field7677 + var8);
        OpenGL.glMultiTexCoord2f(33984, this.field1836.field7676, this.field1836.field7682);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(this.field1836.field7681 + var9, var8);
        OpenGL.glEnd();
        this.field1849.method1503(0, 5890, (byte) 2, 768);
        this.field1849.method1497(0, (byte) -29);
        this.field1849.method1505(-2, null);
        this.field1849.method1500(33984, 0);
    }

    @OriginalMember(owner = "client!fn", name = "xa", descriptor = "(III)V", line = 413)
    public final void method934(int arg0, int arg1, int arg2) {
        field1840++;
        OpenGL.glPixelTransferf(3348, 0.5F);
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field1841 = class697.method3893(arg1, arg0, this.field1836.field7681, this.field1849, (byte) 97, this.field1836.field7677);
        this.field1853 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lok;IIZ)V", line = 703)
    public class123(class228 arg0, int arg1, int arg2, boolean arg3) {
        this.field1849 = arg0;
        this.field1836 = class238.method1621(arg1, 3553, arg3 ? 6408 : 6407, arg0, arg2);
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lok;IIII)V", line = 717)
    public class123(class228 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1849 = arg0;
        this.field1836 = class697.method3893(arg2, arg1, arg3, arg0, (byte) 86, arg4);
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lok;II[III)V", line = 737)
    public class123(class228 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field1849 = arg0;
        this.field1836 = class64.method656(false, arg2, arg0, arg1, 127, arg3);
    }

    @OriginalMember(owner = "client!fn", name = "Q", descriptor = "(IIII)V", line = 445)
    public final void method935(int arg0, int arg1, int arg2, int arg3) {
        this.field1847 = arg0;
        this.field1834 = arg2;
        this.field1845 = arg3;
        field1835++;
        this.field1839 = arg1;
        this.field1843 = this.field1847 != 0 || this.field1839 != 0 || this.field1834 != 0 || this.field1845 != 0;
    }

    @OriginalMember(owner = "client!fn", name = "ca", descriptor = "()I", line = 459)
    public final int method936() {
        field1844++;
        return this.field1845 + this.field1839 + this.field1836.field7677;
    }

    @OriginalMember(owner = "client!fn", name = "YA", descriptor = "(IIIIIIII)V", line = 467)
    public final void method937(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field1836.method3617((byte) 41, (arg7 & 0x1) != 0);
        field1842++;
        this.field1849.method1494(111);
        this.field1849.method1536(0, arg6);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field1843) {
            float var9 = (float) arg2 / (float) this.method931();
            float var10 = (float) arg3 / (float) this.method936();
            float var11 = (float) this.field1847 * var9 + (float) arg0;
            float var12 = (float) this.field1839 * var10 + (float) arg1;
            float var13 = (float) this.field1836.field7681 * var9 + var11;
            float var14 = (float) this.field1836.field7677 * var10 + var12;
            if (this.field1841 == null) {
                this.field1849.method1505(-2, this.field1836);
                this.field1849.method1497(arg4, (byte) -29);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field1836.field7682);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glTexCoord2f(this.field1836.field7676, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glTexCoord2f(this.field1836.field7676, this.field1836.field7682);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
            } else {
                this.method932(arg4, (byte) -124);
                this.field1841.method3617((byte) 41, true);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field1836.field7682);
                OpenGL.glTexCoord2f(0.0F, this.field1836.field7682);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field1836.field7676, 0.0F);
                OpenGL.glTexCoord2f(this.field1836.field7676, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field1836.field7676, this.field1836.field7682);
                OpenGL.glTexCoord2f(this.field1836.field7676, this.field1836.field7682);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
                this.method938(-116);
            }
        } else if (this.field1841 == null) {
            this.field1849.method1505(-2, this.field1836);
            this.field1849.method1497(arg4, (byte) -29);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field1836.field7682);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field1836.field7676, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 - -arg3);
            OpenGL.glTexCoord2f(this.field1836.field7676, this.field1836.field7682);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method932(arg4, (byte) 6);
            this.field1841.method3617((byte) 41, true);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field1836.field7682);
            OpenGL.glTexCoord2f(0.0F, this.field1836.field7682);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field1836.field7676, 0.0F);
            OpenGL.glTexCoord2f(this.field1836.field7676, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field1836.field7676, this.field1836.field7682);
            OpenGL.glTexCoord2f(this.field1836.field7676, this.field1836.field7682);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method938(-120);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V", line = 574)
    private final void method938(int arg0) {
        if (arg0 >= -115) {
            field1862 = null;
        }
        field1851++;
        this.field1849.method1500(33984, 1);
        this.field1849.method1505(-2, null);
        this.field1849.method1527(1, 8448, 8448);
        this.field1849.method1503(1, 34168, (byte) 2, 768);
        this.field1849.method1574(5890, (byte) -128, 770, 0);
        this.field1849.method1500(33984, 0);
        this.field1849.method1503(1, 34168, (byte) 2, 768);
    }

    @OriginalMember(owner = "client!fn", name = "u", descriptor = "()I", line = 594)
    public final int method939() {
        field1858++;
        return this.field1836.field7677;
    }

    @OriginalMember(owner = "client!fn", name = "qa", descriptor = "(FFFFFFIIII)V", line = 603)
    public final void method940(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field1843) {
            float var11 = (float) this.method931();
            float var12 = (float) this.method936();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field1839 * var15;
            float var18 = (float) this.field1839 * var16;
            float var19 = (float) this.field1847 * var13;
            float var20 = (float) this.field1847 * var14;
            float var21 = (float) this.field1834 * -var13;
            float var22 = (float) this.field1834 * -var14;
            float var23 = (float) this.field1845 * -var15;
            arg3 = arg3 + var22 + var18;
            arg0 = arg0 + var19 + var17;
            arg4 = arg4 + var19 + var23;
            arg1 = arg1 + var20 + var18;
            float var24 = (float) this.field1845 * -var16;
            arg2 = arg2 + var21 + var17;
            arg5 = arg5 + var20 + var24;
        }
        field1856++;
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        this.field1836.method3617((byte) 41, (arg9 & 0x1) != 0);
        this.field1849.method1494(119);
        this.field1849.method1505(-2, this.field1836);
        this.field1849.method1536(0, arg8);
        this.field1849.method1497(arg6, (byte) -29);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field1836.field7682);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field1836.field7676, 0.0F);
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glTexCoord2f(this.field1836.field7676, this.field1836.field7682);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(I)V", line = 683)
    public static void method941(int arg0) {
        field1854 = null;
        field1855 = null;
        field1862 = null;
        if (arg0 <= 53) {
            method928(true, -120);
        }
    }

    @OriginalMember(owner = "client!fn", name = "da", descriptor = "(IIIIII)V", line = 728)
    public final void method942(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1859++;
        this.field1836.method3737(arg0, (byte) -58, arg1, arg2, arg5, arg3, arg4);
    }
}
