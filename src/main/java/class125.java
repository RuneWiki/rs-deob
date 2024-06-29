import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class125 extends class53 {

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "Z")
    private boolean field1735 = false;

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "I")
    private int field1733 = 0;

    @OriginalMember(owner = "client!mr", name = "l", descriptor = "I")
    private int field1743 = 0;

    @OriginalMember(owner = "client!mr", name = "n", descriptor = "I")
    private int field1745 = 0;

    @OriginalMember(owner = "client!mr", name = "A", descriptor = "I")
    private int field1758 = 0;

    @OriginalMember(owner = "client!mr", name = "q", descriptor = "I")
    private int field1748 = 0;

    @OriginalMember(owner = "client!mr", name = "m", descriptor = "Lte;")
    private class527 field1744;

    @OriginalMember(owner = "client!mr", name = "k", descriptor = "Lrp;")
    private class371 field1742;

    @OriginalMember(owner = "client!mr", name = "w", descriptor = "[I")
    public static int[] field1754 = new int[14];

    @OriginalMember(owner = "client!mr", name = "y", descriptor = "Lada;")
    public static class144 field1756 = new class144(83, 8);

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!mr", name = "e", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!mr", name = "f", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!mr", name = "g", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!mr", name = "h", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!mr", name = "i", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!mr", name = "j", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!mr", name = "o", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!mr", name = "p", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!mr", name = "s", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!mr", name = "t", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!mr", name = "u", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!mr", name = "v", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!mr", name = "x", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!mr", name = "z", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!mr", name = "B", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!mr", name = "C", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!mr", name = "D", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!mr", name = "E", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!mr", name = "F", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!mr", name = "H", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!mr", name = "r", descriptor = "Lrp;")
    private class371 field1749;

    @OriginalMember(owner = "client!mr", name = "DA", descriptor = "(IIIII)V")
    public final void method333(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1742.method1460(false, -5286);
        field1746++;
        this.field1744.method3159((byte) 122);
        this.field1744.method3105(arg4, 2);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field1748 + arg0;
        int var7 = this.field1745 + arg1;
        if (this.field1749 == null) {
            this.field1744.method3152(-2, this.field1742);
            this.field1744.method3121(-27745, arg2);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field1742.field5101);
            OpenGL.glVertex2i(var6, var7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var6, this.field1742.field5099 + var7);
            OpenGL.glTexCoord2f(this.field1742.field5100, 0.0F);
            OpenGL.glVertex2i(var6 + this.field1742.field5095, this.field1742.field5099 + var7);
            OpenGL.glTexCoord2f(this.field1742.field5100, this.field1742.field5101);
            OpenGL.glVertex2i(this.field1742.field5095 + var6, var7);
            OpenGL.glEnd();
            return;
        }
        this.method883(8, arg2);
        this.field1749.method1460(false, -5286);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field1742.field5101);
        OpenGL.glTexCoord2f(0.0F, this.field1742.field5101);
        OpenGL.glVertex2i(var6, var7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var6, var7 + this.field1742.field5099);
        OpenGL.glMultiTexCoord2f(33985, this.field1742.field5100, 0.0F);
        OpenGL.glTexCoord2f(this.field1742.field5100, 0.0F);
        OpenGL.glVertex2i(this.field1742.field5095 + var6, this.field1742.field5099 + var7);
        OpenGL.glMultiTexCoord2f(33985, this.field1742.field5100, this.field1742.field5101);
        OpenGL.glTexCoord2f(this.field1742.field5100, this.field1742.field5101);
        OpenGL.glVertex2i(this.field1742.field5095 + var6, var7);
        OpenGL.glEnd();
        this.method881((byte) -15);
    }

    @OriginalMember(owner = "client!mr", name = "EA", descriptor = "()I")
    public final int method326() {
        field1747++;
        return this.field1742.field5095 + this.field1748 + this.field1733;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IILpa;II)V")
    public final void method323(int arg0, int arg1, class311 arg2, int arg3, int arg4) {
        field1751++;
        class97 var6 = (class97) arg2;
        class371 var7 = var6.field1412;
        this.field1742.method1460(false, -5286);
        this.field1744.method3159((byte) 102);
        this.field1744.method3152(-2, this.field1742);
        this.field1744.method3121(-27745, 1);
        this.field1744.method3111(33984, 1);
        this.field1744.method3152(-2, var7);
        this.field1744.method3183(7681, -126, 8448);
        this.field1744.method3157(34168, 0, true, 768);
        this.field1744.method3105(1, 2);
        int var8 = this.field1745 + arg1;
        int var9 = this.field1748 + arg0;
        int var10 = this.field1742.field5095 + var9;
        int var11 = var8 + this.field1742.field5099;
        float var12 = var7.field5100 / (float) var7.field5095;
        float var13 = var7.field5101 / (float) var7.field5099;
        float var14 = (float) (var9 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field5101 - (float) (var8 - arg4) * var13;
        float var17 = var7.field5101 - (float) (var11 - arg4) * var13;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field1742.field5101);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var9, var8);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var9, var8 + this.field1742.field5099);
        OpenGL.glMultiTexCoord2f(33984, this.field1742.field5100, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(var9 + this.field1742.field5095, this.field1742.field5099 + var8);
        OpenGL.glMultiTexCoord2f(33984, this.field1742.field5100, this.field1742.field5101);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(this.field1742.field5095 + var9, var8);
        OpenGL.glEnd();
        this.field1744.method3157(5890, 0, true, 768);
        this.field1744.method3121(-27745, 0);
        this.field1744.method3152(-2, null);
        this.field1744.method3111(33984, 0);
    }

    @OriginalMember(owner = "client!mr", name = "BA", descriptor = "(III)V")
    public final void method321(int arg0, int arg1, int arg2) {
        field1736++;
        OpenGL.glPixelTransferf(3348, 0.5F);
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field1749 = class477.method2876(this.field1742.field5095, (byte) -127, arg1, arg0, this.field1742.field5099, this.field1744);
        this.field1743 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)V")
    public static void method877(int arg0) {
        if (arg0 >= -57) {
            method878(14);
        }
        field1756 = null;
        field1754 = null;
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(I)Lwn;")
    public static final class618 method878(int arg0) {
        field1739++;
        class618 var1 = (class618) class526.field7527.method2242((byte) 45);
        int var2 = -55 / ((-arg0 - 49) / 43);
        if (var1 == null) {
            return new class618();
        } else {
            class574.field8456--;
            return var1;
        }
    }

    @OriginalMember(owner = "client!mr", name = "ra", descriptor = "(IIIIIII)V")
    public final void method314(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1742.method1460(true, -5286);
        field1763++;
        this.field1744.method3159((byte) 90);
        this.field1744.method3105(arg6, 2);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field1735) {
            float var8 = (float) arg2 / (float) this.method326();
            float var9 = (float) arg3 / (float) this.method322();
            float var10 = (float) this.field1748 * var8 + (float) arg0;
            float var11 = (float) this.field1745 * var9 + (float) arg1;
            float var12 = (float) this.field1742.field5095 * var8 + var10;
            float var13 = (float) this.field1742.field5099 * var9 + var11;
            if (this.field1749 == null) {
                this.field1744.method3152(-2, this.field1742);
                this.field1744.method3121(-27745, arg4);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field1742.field5101);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glTexCoord2f(this.field1742.field5100, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glTexCoord2f(this.field1742.field5100, this.field1742.field5101);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
            } else {
                this.method883(8, arg4);
                this.field1749.method1460(true, -5286);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field1742.field5101);
                OpenGL.glTexCoord2f(0.0F, this.field1742.field5101);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field1742.field5100, 0.0F);
                OpenGL.glTexCoord2f(this.field1742.field5100, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field1742.field5100, this.field1742.field5101);
                OpenGL.glTexCoord2f(this.field1742.field5100, this.field1742.field5101);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
                this.method881((byte) -15);
            }
        } else if (this.field1749 == null) {
            this.field1744.method3152(-2, this.field1742);
            this.field1744.method3121(-27745, arg4);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field1742.field5101);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field1742.field5100, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field1742.field5100, this.field1742.field5101);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method883(8, arg4);
            this.field1749.method1460(true, -5286);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field1742.field5101);
            OpenGL.glTexCoord2f(0.0F, this.field1742.field5101);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field1742.field5100, 0.0F);
            OpenGL.glTexCoord2f(this.field1742.field5100, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field1742.field5100, this.field1742.field5101);
            OpenGL.glTexCoord2f(this.field1742.field5100, this.field1742.field5101);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method881((byte) -15);
        }
    }

    @OriginalMember(owner = "client!mr", name = "i", descriptor = "(IIIIIII)V")
    public final void method329(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1750++;
        int var8 = arg0 + arg2;
        int var9 = arg1 + arg3;
        this.field1742.method1460(false, -5286);
        this.field1744.method3159((byte) 116);
        this.field1744.method3152(-2, this.field1742);
        this.field1744.method3105(arg6, 2);
        this.field1744.method3121(-27745, arg4);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field1742.field5097 && !this.field1735) {
            float var10 = (float) arg3 * this.field1742.field5101 / (float) this.field1742.field5099;
            float var11 = (float) arg2 * this.field1742.field5100 / (float) this.field1742.field5095;
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
        OpenGL.glTranslatef((float) this.field1748, (float) this.field1745, 0.0F);
        int var12 = this.method326();
        int var13 = this.method322();
        int var14 = this.field1742.field5099 + arg1;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var14 <= var9) {
            int var20 = arg0 + this.field1742.field5095;
            int var21 = arg0;
            while (var20 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field1742.field5101);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field1742.field5100, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field1742.field5100, this.field1742.field5101);
                OpenGL.glVertex2i(var20, var15);
                var21 += var12;
                var20 += var12;
            }
            if (var21 < var8) {
                float var22 = (float) (var8 - var21) * this.field1742.field5100 / (float) this.field1742.field5095;
                OpenGL.glTexCoord2f(0.0F, this.field1742.field5101);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field1742.field5101);
                OpenGL.glVertex2i(var8, var15);
            }
            var14 += var13;
            var15 += var13;
        }
        if (var15 < var9) {
            float var16 = (float) (-var9 - (-var15 - this.field1742.field5099)) * this.field1742.field5101 / (float) this.field1742.field5099;
            int var17 = arg0 + this.field1742.field5095;
            int var18 = arg0;
            while (var17 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field1742.field5101);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field1742.field5100, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field1742.field5100, this.field1742.field5101);
                OpenGL.glVertex2i(var17, var15);
                var17 += var12;
                var18 += var12;
            }
            if (var18 < var8) {
                float var19 = (float) (var8 - var18) * this.field1742.field5100 / (float) this.field1742.field5095;
                OpenGL.glTexCoord2f(0.0F, this.field1742.field5101);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field1742.field5101);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!mr", name = "la", descriptor = "()I")
    public final int method318() {
        field1759++;
        return this.field1742.field5099;
    }

    @OriginalMember(owner = "client!mr", name = "P", descriptor = "(IIIIII)V")
    public final void method320(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1742.method2825(arg0, arg1, arg4, arg5, arg3, -102, arg2);
        field1741++;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)I")
    public static final int method879(byte arg0) {
        field1738++;
        if (class446.field6245) {
            return 6;
        } else if (class151.field2298 == null) {
            return 0;
        } else if (arg0 == 124) {
            int var1 = class151.field2298.field8566;
            if (class271.method1707(61, var1)) {
                return 1;
            } else if (class397.method2359(var1, (byte) -117)) {
                return 2;
            } else if (class513.method3044(var1, 1012)) {
                return 3;
            } else if (class555.method3354(-96, var1)) {
                return 4;
            } else {
                return 5;
            }
        } else {
            return 86;
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IBLn;Ljava/awt/Canvas;Lkda;)Lqa;")
    public static final class208 method880(int arg0, byte arg1, class17 arg2, Canvas arg3, class328 arg4) {
        field1740++;
        if (!class136.method953((byte) 71)) {
            throw new RuntimeException("");
        } else if (class230.method1488(-74, "jaggl")) {
            OpenGL var5 = new OpenGL();
            long var6 = var5.init(arg3, 8, 8, 8, 24, 0, arg0);
            if (var6 == 0L) {
                throw new RuntimeException("");
            }
            int var8 = 50 % ((-arg1 - 76) / 37);
            class587 var9 = new class587(var5, arg3, var6, arg2, arg4, arg0);
            var9.method2693(7);
            return var9;
        } else {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!mr", name = "ma", descriptor = "()I")
    public final int method322() {
        field1761++;
        return this.field1758 + this.field1745 + this.field1742.field5099;
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(B)V")
    private final void method881(byte arg0) {
        field1752++;
        this.field1744.method3111(33984, 1);
        this.field1744.method3152(-2, null);
        if (arg0 != -15) {
            this.method321(80, 4, 3);
        }
        this.field1744.method3183(8448, -128, 8448);
        this.field1744.method3157(34168, 1, true, 768);
        this.field1744.method3107(5890, (byte) -63, 770, 0);
        this.field1744.method3111(33984, 0);
        this.field1744.method3157(34168, 1, true, 768);
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(II)V")
    public static final void method882(int arg0, int arg1) {
        field1734++;
        class221 var2 = class65.method413(6, arg0, (byte) 98);
        var2.method1432(arg1);
    }

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "()I")
    public final int method325() {
        field1737++;
        return this.field1742.field5095;
    }

    @OriginalMember(owner = "client!mr", name = "CA", descriptor = "(FFFFFFIII)V")
    public final void method331(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        field1732++;
        if (this.field1735) {
            float var10 = (float) this.method326();
            float var11 = (float) this.method322();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field1745 * var14;
            float var17 = (float) this.field1745 * var15;
            float var18 = (float) this.field1748 * var12;
            float var19 = (float) this.field1748 * var13;
            float var20 = (float) this.field1733 * -var12;
            float var21 = (float) this.field1733 * -var13;
            float var22 = (float) this.field1758 * -var14;
            float var23 = (float) this.field1758 * -var15;
            arg4 = arg4 + var18 + var22;
            arg3 = arg3 + var21 + var17;
            arg0 = arg0 + var18 + var16;
            arg2 = arg2 + var20 + var16;
            arg1 = arg1 + var19 + var17;
            arg5 = arg5 + var19 + var23;
        }
        float var24 = arg2 + arg4 - arg0;
        float var25 = arg5 + arg3 - arg1;
        this.field1742.method1460(true, -5286);
        this.field1744.method3159((byte) 104);
        this.field1744.method3152(-2, this.field1742);
        this.field1744.method3105(arg8, 2);
        this.field1744.method3121(-27745, arg6);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field1742.field5101);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field1742.field5100, 0.0F);
        OpenGL.glVertex2f(var24, var25);
        OpenGL.glTexCoord2f(this.field1742.field5100, this.field1742.field5101);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!mr", name = "KA", descriptor = "(IIII)V")
    public final void method324(int arg0, int arg1, int arg2, int arg3) {
        this.field1733 = arg2;
        this.field1745 = arg1;
        this.field1748 = arg0;
        this.field1758 = arg3;
        field1753++;
        this.field1735 = this.field1748 != 0 || this.field1745 != 0 || this.field1733 != 0 || this.field1758 != 0;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(FFFFFFLpa;II)V")
    public final void method315(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class311 arg6, int arg7, int arg8) {
        field1755++;
        class371 var10 = ((class97) arg6).field1412;
        if (this.field1735) {
            float var11 = (float) this.method326();
            float var12 = (float) this.method322();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field1745 * var15;
            float var18 = (float) this.field1745 * var16;
            float var19 = (float) this.field1748 * var13;
            float var20 = (float) this.field1748 * var14;
            float var21 = (float) this.field1733 * -var13;
            float var22 = (float) this.field1733 * -var14;
            float var23 = (float) this.field1758 * -var15;
            arg3 = arg3 + var22 + var18;
            arg0 = arg0 + var19 + var17;
            arg2 = arg2 + var21 + var17;
            float var24 = (float) this.field1758 * -var16;
            arg4 = arg4 + var19 + var23;
            arg1 = arg1 + var20 + var18;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        this.field1742.method1460(true, -5286);
        float var26 = arg5 + arg3 - arg1;
        this.field1744.method3159((byte) 93);
        this.field1744.method3152(-2, this.field1742);
        this.field1744.method3121(-27745, 1);
        this.field1744.method3111(33984, 1);
        this.field1744.method3152(-2, var10);
        this.field1744.method3183(7681, -126, 8448);
        this.field1744.method3157(34168, 0, true, 768);
        this.field1744.method3105(1, 2);
        float var27 = var10.field5100 / (float) var10.field5095;
        float var28 = var10.field5101 / (float) var10.field5099;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field1742.field5101);
        OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * var27, var10.field5101 - (((float) (-arg8) + arg1) * var28));
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + arg4) * var27, var10.field5101 - (arg5 - (float) arg8) * var28);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field1742.field5100, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + var25) * var27, var10.field5101 - (((float) (-arg8) + var26) * var28));
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glMultiTexCoord2f(33984, this.field1742.field5100, this.field1742.field5101);
        OpenGL.glMultiTexCoord2f(33985, (arg2 - (float) arg7) * var27, var10.field5101 - ((arg3 - (float) arg8) * var28));
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field1744.method3157(5890, 0, true, 768);
        this.field1744.method3121(-27745, 0);
        this.field1744.method3152(-2, null);
        this.field1744.method3111(33984, 0);
    }

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "(II)V")
    private final void method883(int arg0, int arg1) {
        this.field1744.method3111(arg0 ^ 0x84C8, 1);
        field1762++;
        this.field1744.method3152(-2, this.field1742);
        this.field1744.method3183(this.field1744.method3139(-30575, arg1), -124, 7681);
        this.field1744.method3157(34167, 1, true, 768);
        this.field1744.method3107(34168, (byte) -83, 770, 0);
        this.field1744.method3111(33984, 0);
        this.field1744.method3152(-2, this.field1749);
        this.field1744.method3183(34479, -126, 7681);
        this.field1744.method3157(34166, 1, true, 768);
        if (arg0 != 8) {
            this.method331(-0.18261555F, -2.2829285F, 0.09927547F, -0.077752456F, 0.9935251F, 2.1876526F, -103, 103, -63);
        }
        if (this.field1743 == 0) {
            this.field1744.method3160(0.5F, 1.0F, 0.0F, 0.5F, (byte) 26);
        } else if (this.field1743 == 1) {
            this.field1744.method3160(0.5F, 0.5F, 0.0F, 1.0F, (byte) 26);
        } else if (this.field1743 == 2) {
            this.field1744.method3160(1.0F, 0.5F, 0.0F, 0.5F, (byte) 26);
        } else if (this.field1743 == 3) {
            this.field1744.method3160(128.5F, 128.5F, 0.0F, 128.5F, (byte) 26);
            return;
        }
    }

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Lte;IIII)V")
    public class125(class527 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1744 = arg0;
        this.field1742 = class477.method2876(arg3, (byte) -125, arg2, arg1, arg4, arg0);
    }

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Lte;II[III)V")
    public class125(class527 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field1744 = arg0;
        this.field1742 = class271.method1708(false, arg1, arg2, arg0, arg3, 53);
    }
}
