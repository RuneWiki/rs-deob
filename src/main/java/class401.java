import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class401 extends class88 {

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    private int field5673 = 0;

    @OriginalMember(owner = "client!je", name = "t", descriptor = "I")
    private int field5688 = 0;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "Z")
    private boolean field5680 = false;

    @OriginalMember(owner = "client!je", name = "y", descriptor = "I")
    private int field5693 = 0;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "I")
    private int field5683 = 0;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "I")
    private int field5687 = 0;

    @OriginalMember(owner = "client!je", name = "w", descriptor = "Leea;")
    private class131 field5691;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "Lll;")
    private class364 field5679;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "Lqfa;")
    public static class98 field5674 = new class98(110, 0);

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field5669;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public static int field5670;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field5671;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public static int field5672;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    public static int field5675;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    public static int field5676;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public static int field5677;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public static int field5678;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "I")
    public static int field5681;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "I")
    public static int field5682;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "I")
    public static int field5684;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "I")
    public static int field5685;

    @OriginalMember(owner = "client!je", name = "r", descriptor = "I")
    public static int field5686;

    @OriginalMember(owner = "client!je", name = "u", descriptor = "I")
    public static int field5689;

    @OriginalMember(owner = "client!je", name = "v", descriptor = "I")
    public static int field5690;

    @OriginalMember(owner = "client!je", name = "z", descriptor = "I")
    public static int field5694;

    @OriginalMember(owner = "client!je", name = "A", descriptor = "I")
    public static int field5695;

    @OriginalMember(owner = "client!je", name = "B", descriptor = "I")
    public static int field5696;

    @OriginalMember(owner = "client!je", name = "C", descriptor = "I")
    public static int field5697;

    @OriginalMember(owner = "client!je", name = "F", descriptor = "I")
    public static int field5700;

    @OriginalMember(owner = "client!je", name = "x", descriptor = "Lll;")
    private class364 field5692;

    @OriginalMember(owner = "client!je", name = "E", descriptor = "Lla;")
    public static class452 field5699;

    @OriginalMember(owner = "client!je", name = "D", descriptor = "[I")
    public static int[] field5698;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
    public static void method2503(int arg0) {
        if (arg0 != 1278894712) {
            field5699 = null;
        }
        field5699 = null;
        field5674 = null;
        field5698 = null;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(III)V")
    public final void method661(int arg0, int arg1, int arg2) {
        field5686++;
        OpenGL.glPixelTransferf(3348, 0.5F);
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field5692 = class488.method2920(3553, this.field5679.field5158, arg0, this.field5691, this.field5679.field5153, arg1);
        this.field5683 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
    public static final void method2504(byte arg0) {
        field5682++;
        if (class213.field2800 == null) {
            return;
        }
        try {
            String var1 = class213.field2800.getParameter("cookiehost");
            if (arg0 != -66) {
                method2503(99);
            }
            int var2 = (int) (class479.method2864((byte) -99) / 86400000L) - 11745;
            String var3 = "usrdob=" + var2 + "; version=1; path=/; domain=" + var1;
            class113.method796("document.cookie=\"" + var3 + "\"", class213.field2800, 122);
        } catch (Throwable var4) {
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V")
    private final void method2505(int arg0) {
        field5684++;
        this.field5691.method884(1, true);
        this.field5691.method926(null, 71);
        this.field5691.method946(false, 8448, 8448);
        this.field5691.method883((byte) 34, 1, 768, 34168);
        this.field5691.method948(5890, 0, 770, (byte) 73);
        this.field5691.method884(0, true);
        this.field5691.method883((byte) 34, 1, 768, 34168);
        if (arg0 <= 2) {
            field5697 = 62;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIIIII)V")
    public final void method674(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5694++;
        this.field5679.method1297((arg7 & 0x1) != 0, false);
        this.field5691.method875(2);
        this.field5691.method914(1, arg6);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field5680) {
            float var9 = (float) arg2 / (float) this.method656();
            float var10 = (float) arg3 / (float) this.method670();
            float var11 = (float) this.field5673 * var9 + (float) arg0;
            float var12 = (float) this.field5687 * var10 + (float) arg1;
            float var13 = (float) this.field5679.field5158 * var9 + var11;
            float var14 = (float) this.field5679.field5153 * var10 + var12;
            if (this.field5692 == null) {
                this.field5691.method926(this.field5679, 62);
                this.field5691.method891(arg4, (byte) 17);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field5679.field5152);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glTexCoord2f(this.field5679.field5154, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glTexCoord2f(this.field5679.field5154, this.field5679.field5152);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
            } else {
                this.method2508(arg4, (byte) 7);
                this.field5692.method1297(true, false);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field5679.field5152);
                OpenGL.glTexCoord2f(0.0F, this.field5679.field5152);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field5679.field5154, 0.0F);
                OpenGL.glTexCoord2f(this.field5679.field5154, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field5679.field5154, this.field5679.field5152);
                OpenGL.glTexCoord2f(this.field5679.field5154, this.field5679.field5152);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
                this.method2505(102);
            }
        } else if (this.field5692 == null) {
            this.field5691.method926(this.field5679, 91);
            this.field5691.method891(arg4, (byte) 17);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field5679.field5152);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field5679.field5154, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field5679.field5154, this.field5679.field5152);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method2508(arg4, (byte) 7);
            this.field5692.method1297(true, false);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field5679.field5152);
            OpenGL.glTexCoord2f(0.0F, this.field5679.field5152);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field5679.field5154, 0.0F);
            OpenGL.glTexCoord2f(this.field5679.field5154, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field5679.field5154, this.field5679.field5152);
            OpenGL.glTexCoord2f(this.field5679.field5154, this.field5679.field5152);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method2505(67);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ILfp;)V")
    public static final void method2506(int arg0, class323 arg1) {
        class511.field7308 = arg1;
        if (arg0 != 7) {
            field5698 = null;
        }
        field5700++;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIII)V")
    public final void method672(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5679.method1297(false, false);
        field5685++;
        this.field5691.method875(2);
        this.field5691.method914(1, arg4);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field5673 + arg0;
        int var7 = this.field5687 + arg1;
        if (this.field5692 == null) {
            this.field5691.method926(this.field5679, 106);
            this.field5691.method891(arg2, (byte) 17);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field5679.field5152);
            OpenGL.glVertex2i(var6, var7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var6, this.field5679.field5153 + var7);
            OpenGL.glTexCoord2f(this.field5679.field5154, 0.0F);
            OpenGL.glVertex2i(this.field5679.field5158 + var6, this.field5679.field5153 + var7);
            OpenGL.glTexCoord2f(this.field5679.field5154, this.field5679.field5152);
            OpenGL.glVertex2i(var6 + this.field5679.field5158, var7);
            OpenGL.glEnd();
            return;
        }
        this.method2508(arg2, (byte) 7);
        this.field5692.method1297(false, false);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field5679.field5152);
        OpenGL.glTexCoord2f(0.0F, this.field5679.field5152);
        OpenGL.glVertex2i(var6, var7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var6, this.field5679.field5153 + var7);
        OpenGL.glMultiTexCoord2f(33985, this.field5679.field5154, 0.0F);
        OpenGL.glTexCoord2f(this.field5679.field5154, 0.0F);
        OpenGL.glVertex2i(this.field5679.field5158 + var6, var7 - -this.field5679.field5153);
        OpenGL.glMultiTexCoord2f(33985, this.field5679.field5154, this.field5679.field5152);
        OpenGL.glTexCoord2f(this.field5679.field5154, this.field5679.field5152);
        OpenGL.glVertex2i(this.field5679.field5158 + var6, var7);
        OpenGL.glEnd();
        this.method2505(120);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public final void method676(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class486 arg7, int arg8, int arg9) {
        field5672++;
        class364 var11 = ((class397) arg7).field5597;
        if (this.field5680) {
            float var12 = (float) this.method656();
            float var13 = (float) this.method670();
            float var14 = (arg2 - arg0) / var12;
            float var15 = (arg3 - arg1) / var12;
            float var16 = (arg4 - arg0) / var13;
            float var17 = (arg5 - arg1) / var13;
            float var18 = (float) this.field5687 * var16;
            float var19 = (float) this.field5687 * var17;
            float var20 = (float) this.field5673 * var14;
            float var21 = (float) this.field5673 * var15;
            float var22 = (float) this.field5688 * -var14;
            float var23 = (float) this.field5688 * -var15;
            float var24 = (float) this.field5693 * -var16;
            arg0 = arg0 + var20 + var18;
            arg4 = arg4 + var20 + var24;
            arg1 = arg1 + var21 + var19;
            arg3 = arg3 + var23 + var19;
            float var25 = (float) this.field5693 * -var17;
            arg2 = arg2 + var22 + var18;
            arg5 = arg5 + var21 + var25;
        }
        float var26 = arg2 + arg4 - arg0;
        this.field5679.method1297((arg6 & 0x1) != 0, false);
        float var27 = arg5 + arg3 - arg1;
        this.field5691.method875(2);
        this.field5691.method926(this.field5679, 100);
        this.field5691.method891(1, (byte) 17);
        this.field5691.method884(1, true);
        this.field5691.method926(var11, 78);
        this.field5691.method946(false, 7681, 8448);
        this.field5691.method883((byte) 34, 0, 768, 34168);
        this.field5691.method914(1, 1);
        float var28 = var11.field5154 / (float) var11.field5158;
        float var29 = var11.field5152 / (float) var11.field5153;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field5679.field5152);
        OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg8) * var28, var11.field5152 - ((arg1 - (float) arg9) * var29));
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg8) * var28, var11.field5152 - ((arg5 - (float) arg9) * var29));
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field5679.field5154, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (var26 - (float) arg8) * var28, var11.field5152 - ((float) (-arg9) + var27) * var29);
        OpenGL.glVertex2f(var26, var27);
        OpenGL.glMultiTexCoord2f(33984, this.field5679.field5154, this.field5679.field5152);
        OpenGL.glMultiTexCoord2f(33985, (arg2 - (float) arg8) * var28, var11.field5152 - (arg3 - (float) arg9) * var29);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field5691.method883((byte) 34, 0, 768, 5890);
        this.field5691.method891(0, (byte) 17);
        this.field5691.method926(null, 103);
        this.field5691.method884(0, true);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IILaa;II)V")
    public final void method660(int arg0, int arg1, class486 arg2, int arg3, int arg4) {
        field5695++;
        class397 var6 = (class397) arg2;
        class364 var7 = var6.field5597;
        this.field5679.method1297(false, false);
        this.field5691.method875(2);
        this.field5691.method926(this.field5679, 47);
        this.field5691.method891(1, (byte) 17);
        this.field5691.method884(1, true);
        this.field5691.method926(var7, 92);
        this.field5691.method946(false, 7681, 8448);
        this.field5691.method883((byte) 34, 0, 768, 34168);
        this.field5691.method914(1, 1);
        int var8 = this.field5673 + arg0;
        int var9 = this.field5687 + arg1;
        int var10 = this.field5679.field5158 + var8;
        int var11 = this.field5679.field5153 + var9;
        float var12 = var7.field5154 / (float) var7.field5158;
        float var13 = var7.field5152 / (float) var7.field5153;
        float var14 = (float) (var8 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field5152 - (float) (var9 - arg4) * var13;
        float var17 = var7.field5152 - (float) (var11 - arg4) * var13;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field5679.field5152);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var8, var9);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var8, this.field5679.field5153 + var9);
        OpenGL.glMultiTexCoord2f(33984, this.field5679.field5154, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(this.field5679.field5158 + var8, this.field5679.field5153 + var9);
        OpenGL.glMultiTexCoord2f(33984, this.field5679.field5154, this.field5679.field5152);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(this.field5679.field5158 + var8, var9);
        OpenGL.glEnd();
        this.field5691.method883((byte) 34, 0, 768, 5890);
        this.field5691.method891(0, (byte) 17);
        this.field5691.method926(null, 68);
        this.field5691.method884(0, true);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIII)V")
    public final void method655(int arg0, int arg1, int arg2, int arg3) {
        this.field5693 = arg3;
        this.field5673 = arg0;
        this.field5688 = arg2;
        this.field5687 = arg1;
        field5676++;
        this.field5680 = this.field5673 != 0 || this.field5687 != 0 || this.field5688 != 0 || this.field5693 != 0;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lee;Z)Ldj;")
    public static final class342 method2507(class675 arg0, boolean arg1) {
        field5671++;
        String var2 = arg0.method3697(-1);
        class3 var3 = class759.method4211(-11911)[arg0.method3750((byte) 35)];
        class120 var4 = class720.method4047(25992)[arg0.method3750((byte) 35)];
        int var5 = arg0.method3706((byte) 102);
        if (!arg1) {
            field5699 = null;
        }
        int var6 = arg0.method3706((byte) -85);
        int var7 = arg0.method3750((byte) 35);
        int var8 = arg0.method3750((byte) 35);
        int var9 = arg0.method3750((byte) 35);
        int var10 = arg0.method3757((byte) -65);
        int var11 = arg0.method3757((byte) -65);
        int var12 = arg0.method3703(96);
        int var13 = arg0.method3703(103);
        int var14 = arg0.method3703(104);
        return new class342(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "()I")
    public final int method656() {
        field5677++;
        return this.field5679.field5158 + this.field5673 + this.field5688;
    }

    @OriginalMember(owner = "client!je", name = "d", descriptor = "()I")
    public final int method670() {
        field5696++;
        return this.field5679.field5153 + this.field5687 + this.field5693;
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "()I")
    public final int method663() {
        field5669++;
        return this.field5679.field5153;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IB)V")
    private final void method2508(int arg0, byte arg1) {
        this.field5691.method884(1, true);
        field5670++;
        this.field5691.method926(this.field5679, 74);
        if (arg1 != 7) {
            field5699 = null;
        }
        this.field5691.method946(false, this.field5691.method936(arg0, 7681), 7681);
        this.field5691.method883((byte) 34, 1, 768, 34167);
        this.field5691.method948(34168, 0, 770, (byte) -112);
        this.field5691.method884(0, true);
        this.field5691.method926(this.field5692, 38);
        this.field5691.method946(false, 34479, 7681);
        this.field5691.method883((byte) 34, 1, 768, 34166);
        if (this.field5683 == 0) {
            this.field5691.method924(111, 0.5F, 1.0F, 0.0F, 0.5F);
        } else if (this.field5683 == 1) {
            this.field5691.method924(46, 1.0F, 0.5F, 0.0F, 0.5F);
        } else if (this.field5683 == 2) {
            this.field5691.method924(arg1 + 117, 0.5F, 0.5F, 0.0F, 1.0F);
            return;
        } else if (this.field5683 == 3) {
            this.field5691.method924(arg1 ^ 0x4A, 128.5F, 128.5F, 0.0F, 128.5F);
            return;
        }
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(I)V")
    public static final void method2509(int arg0) {
        field5690++;
        if (arg0 <= 25) {
            field5699 = null;
        }
        short var1 = 1024;
        short var2 = 3072;
        if (class180.field2409) {
            if (class221.field2888) {
                var1 = 2048;
            }
            var2 = 4096;
        }
        if ((float) var1 > class2.field19) {
            class2.field19 = var1;
        }
        while (class552.field7773 >= 16384.0F) {
            class552.field7773 -= 16384.0F;
        }
        if ((float) var2 < class2.field19) {
            class2.field19 = var2;
        }
        while (class552.field7773 < 0.0F) {
            class552.field7773 += 16384.0F;
        }
        int var3 = class453.field6403 >> 9;
        int var4 = class191.field2552 >> 9;
        int var5 = class469.method2798(107, class191.field2552, class526.field7430, class453.field6403);
        int var6 = 0;
        if (var3 > 3 && var4 > 3 && var3 < (class336.field4683 - 4) && var4 < (class700.field9768 - 4)) {
            for (int var7 = var3 - 4; var7 <= (var3 + 4); var7++) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                    int var9 = class526.field7430;
                    if (var9 < 3 && class364.method2319((byte) -114, var7, var8)) {
                        var9++;
                    }
                    int var10 = 0;
                    if (class403.field5705.field6342 != null && class403.field5705.field6342[var9] != null) {
                        var10 = (class403.field5705.field6342[var9][var7][var8] & 0xFF) * 8 << 2;
                    }
                    if (class459.field6474 != null && class459.field6474[var9] != null) {
                        int var11 = var5 + var10 - class459.field6474[var9].method1816((byte) 6, var8, var7);
                        if (var6 < var11) {
                            var6 = var11;
                        }
                    }
                }
            }
        }
        int var12 = (var6 >> 2) * 1536;
        if (var12 > 786432) {
            var12 = 786432;
        }
        if (var12 < 262144) {
            var12 = 262144;
        }
        if (class336.field4682 < var12) {
            class336.field4682 += (var12 - class336.field4682) / 24;
        } else if (var12 < class336.field4682) {
            class336.field4682 += (var12 - class336.field4682) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(IIIIIII)V")
    public final void method673(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5689++;
        int var8 = arg0 + arg2;
        int var9 = arg1 + arg3;
        this.field5679.method1297(false, false);
        this.field5691.method875(2);
        this.field5691.method926(this.field5679, 111);
        this.field5691.method914(1, arg6);
        this.field5691.method891(arg4, (byte) 17);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field5679.field5156 && !this.field5680) {
            float var10 = (float) arg3 * this.field5679.field5152 / (float) this.field5679.field5153;
            float var11 = (float) arg2 * this.field5679.field5154 / (float) this.field5679.field5158;
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
        OpenGL.glTranslatef((float) this.field5673, (float) this.field5687, 0.0F);
        int var12 = this.method656();
        int var13 = this.method670();
        int var14 = arg1 + this.field5679.field5153;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var9 >= var14) {
            int var20 = this.field5679.field5158 + arg0;
            int var21 = arg0;
            while (var20 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field5679.field5152);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field5679.field5154, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field5679.field5154, this.field5679.field5152);
                OpenGL.glVertex2i(var20, var15);
                var21 += var12;
                var20 += var12;
            }
            if (var21 < var8) {
                float var22 = (float) (var8 - var21) * this.field5679.field5154 / (float) this.field5679.field5158;
                OpenGL.glTexCoord2f(0.0F, this.field5679.field5152);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field5679.field5152);
                OpenGL.glVertex2i(var8, var15);
            }
            var15 += var13;
            var14 += var13;
        }
        if (var15 < var9) {
            float var16 = (float) (this.field5679.field5153 + var15 - var9) * this.field5679.field5152 / (float) this.field5679.field5153;
            int var17 = arg0 + this.field5679.field5158;
            int var18 = arg0;
            while (var8 >= var17) {
                OpenGL.glTexCoord2f(0.0F, this.field5679.field5152);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field5679.field5154, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field5679.field5154, this.field5679.field5152);
                OpenGL.glVertex2i(var17, var15);
                var17 += var12;
                var18 += var12;
            }
            if (var18 < var8) {
                float var19 = (float) (var8 - var18) * this.field5679.field5154 / (float) this.field5679.field5158;
                OpenGL.glTexCoord2f(0.0F, this.field5679.field5152);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field5679.field5152);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIII)V")
    public final void method659(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5678++;
        this.field5679.method3444(28490, arg4, arg5, arg1, arg0, arg3, arg2);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(FFFFFFIIII)V")
    public final void method665(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field5680) {
            float var11 = (float) this.method656();
            float var12 = (float) this.method670();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field5687 * var15;
            float var18 = (float) this.field5687 * var16;
            float var19 = (float) this.field5673 * var13;
            float var20 = (float) this.field5673 * var14;
            float var21 = (float) this.field5688 * -var13;
            float var22 = (float) this.field5688 * -var14;
            float var23 = (float) this.field5693 * -var15;
            arg0 = arg0 + var19 + var17;
            arg1 = arg1 + var20 + var18;
            arg3 = arg3 + var22 + var18;
            float var24 = (float) this.field5693 * -var16;
            arg4 = arg4 + var19 + var23;
            arg2 = arg2 + var21 + var17;
            arg5 = arg5 + var20 + var24;
        }
        field5681++;
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        this.field5679.method1297((arg9 & 0x1) != 0, false);
        this.field5691.method875(2);
        this.field5691.method926(this.field5679, 58);
        this.field5691.method914(1, arg8);
        this.field5691.method891(arg6, (byte) 17);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field5679.field5152);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field5679.field5154, 0.0F);
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glTexCoord2f(this.field5679.field5154, this.field5679.field5152);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "()I")
    public final int method657() {
        field5675++;
        return this.field5679.field5158;
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Leea;IIZ)V")
    public class401(class131 arg0, int arg1, int arg2, boolean arg3) {
        this.field5691 = arg0;
        this.field5679 = class681.method3815((byte) 118, arg2, arg0, arg1, arg3 ? 6408 : 6407);
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Leea;IIII)V")
    public class401(class131 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5691 = arg0;
        this.field5679 = class488.method2920(3553, arg3, arg1, arg0, arg4, arg2);
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Leea;II[III)V")
    public class401(class131 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field5691 = arg0;
        this.field5679 = class479.method2862(false, arg4, arg0, arg3, arg5, 34037, arg1, arg2);
    }
}
