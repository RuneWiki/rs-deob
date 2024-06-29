import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class69 extends class24 {

    @OriginalMember(owner = "client!jt", name = "e", descriptor = "I")
    private int field790 = 0;

    @OriginalMember(owner = "client!jt", name = "o", descriptor = "I")
    private int field800 = 0;

    @OriginalMember(owner = "client!jt", name = "m", descriptor = "I")
    private int field798 = 0;

    @OriginalMember(owner = "client!jt", name = "n", descriptor = "I")
    private int field799 = 0;

    @OriginalMember(owner = "client!jt", name = "p", descriptor = "I")
    private int field801 = 0;

    @OriginalMember(owner = "client!jt", name = "t", descriptor = "Z")
    private boolean field805 = false;

    @OriginalMember(owner = "client!jt", name = "A", descriptor = "Lur;")
    private class377 field812;

    @OriginalMember(owner = "client!jt", name = "l", descriptor = "Lal;")
    private class67 field797;

    @OriginalMember(owner = "client!jt", name = "u", descriptor = "Lsr;")
    public static class167 field806 = new class167();

    @OriginalMember(owner = "client!jt", name = "y", descriptor = "[C")
    public static char[] field810 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!jt", name = "f", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!jt", name = "g", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!jt", name = "h", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!jt", name = "i", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!jt", name = "j", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!jt", name = "k", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!jt", name = "q", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!jt", name = "r", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!jt", name = "s", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!jt", name = "v", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!jt", name = "w", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!jt", name = "x", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!jt", name = "z", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!jt", name = "B", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!jt", name = "C", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!jt", name = "d", descriptor = "Lal;")
    private class67 field789;

    static {
        new class305("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
    }

    @OriginalMember(owner = "client!jt", name = "RA", descriptor = "()I", line = 3)
    public final int method155() {
        field791++;
        return this.field797.field765 + this.field799 + this.field800;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(I)V", line = 11)
    public static void method398(int arg0) {
        if (arg0 == -1) {
            field806 = null;
            field810 = null;
        }
    }

    @OriginalMember(owner = "client!jt", name = "ha", descriptor = "(IIII)V", line = 22)
    public final void method147(int arg0, int arg1, int arg2, int arg3) {
        this.field799 = arg2;
        this.field801 = arg3;
        field794++;
        this.field800 = arg0;
        this.field790 = arg1;
        this.field805 = this.field800 != 0 || this.field790 != 0 || this.field799 != 0 || this.field801 != 0;
    }

    @OriginalMember(owner = "client!jt", name = "ya", descriptor = "(IIIIIII)V", line = 35)
    public final void method6(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field797.method1555((byte) 117, true);
        field793++;
        this.field812.method2273((byte) 80);
        this.field812.method2279(arg6, (byte) 24);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field805) {
            float var8 = (float) arg2 / (float) this.method155();
            float var9 = (float) arg3 / (float) this.method153();
            float var10 = (float) this.field800 * var8 + (float) arg0;
            float var11 = (float) this.field790 * var9 + (float) arg1;
            float var12 = (float) this.field797.field765 * var8 + var10;
            float var13 = (float) this.field797.field766 * var9 + var11;
            if (this.field789 == null) {
                this.field812.method2236(this.field797, -62);
                this.field812.method2260(16640, arg4);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field797.field769);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glTexCoord2f(this.field797.field770, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glTexCoord2f(this.field797.field770, this.field797.field769);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
            } else {
                this.method402(arg4, 25917);
                this.field789.method1555((byte) 116, true);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field797.field769);
                OpenGL.glTexCoord2f(0.0F, this.field797.field769);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field797.field770, 0.0F);
                OpenGL.glTexCoord2f(this.field797.field770, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field797.field770, this.field797.field769);
                OpenGL.glTexCoord2f(this.field797.field770, this.field797.field769);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
                this.method400(-10026);
            }
        } else if (this.field789 == null) {
            this.field812.method2236(this.field797, 121);
            this.field812.method2260(16640, arg4);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field797.field769);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field797.field770, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field797.field770, this.field797.field769);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method402(arg4, 25917);
            this.field789.method1555((byte) 112, true);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field797.field769);
            OpenGL.glTexCoord2f(0.0F, this.field797.field769);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field797.field770, 0.0F);
            OpenGL.glTexCoord2f(this.field797.field770, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field797.field770, this.field797.field769);
            OpenGL.glTexCoord2f(this.field797.field770, this.field797.field769);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method400(-10026);
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(Z)V", line = 143)
    public static final void method399(boolean arg0) {
        if (!arg0) {
            class415.field5979 = true;
            field795++;
        }
    }

    @OriginalMember(owner = "client!jt", name = "oa", descriptor = "(III)V", line = 155)
    public final void method9(int arg0, int arg1, int arg2) {
        field802++;
        OpenGL.glPixelTransferf(3348, 0.5F);
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field789 = class106.method658(this.field797.field765, this.field797.field766, arg1, arg0, this.field812, 1);
        this.field798 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!jt", name = "YA", descriptor = "()I", line = 178)
    public final int method150() {
        field811++;
        return this.field797.field765;
    }

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "(I)V", line = 186)
    private final void method400(int arg0) {
        field813++;
        if (arg0 != -10026) {
            return;
        }
        this.field812.method2250((byte) 97, 1);
        this.field812.method2236(null, -66);
        this.field812.method2269(8448, 8960, 8448);
        this.field812.method2229(34168, (byte) -18, 1, 768);
        this.field812.method2277((byte) -114, 770, 0, 5890);
        this.field812.method2250((byte) 97, 0);
        this.field812.method2229(34168, (byte) -18, 1, 768);
    }

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "(I)V", line = 209)
    public static final void method401(int arg0) {
        field788++;
        class279.field3702.method2899((byte) -125);
        class144.field1914.method2178(51);
        class453.field6782.method1486(14239);
        class123.field1593.method2912(-48);
        class87.field1032.method1676(5);
        class237.field3158.method229((byte) 35);
        class7.field97.method2954(8);
        class71.field914.method1609(false);
        class373.field5063.method678((byte) 82);
        class180.field2350.method804(false);
        if (arg0 >= -20) {
            return;
        }
        class254.field3381.method1919(-124);
        class465.field6927.method501(true);
        class60.field698.method995(true);
        class468.field6947.method1081(-29854);
        class104.field1405.method448(false);
        client.field2571.method2818((byte) -27);
        class333.field4407.method2506(4);
        class211.field2834.method1620((byte) 92);
        class211.field2827.method1341(6333);
        class505.field7341.method1572(true);
        class304.method1820(-128);
        class93.method522(46);
        class440.method2694((byte) 90);
        class52.method317((byte) -73);
        class68.field784.method3034((byte) 123);
        class347.field4619.method3034((byte) 115);
        class312.field4168.method3034((byte) 102);
        class266.field3565.method3034((byte) 83);
        class432.field6300.method3034((byte) 107);
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(FFFFFFLta;II)V", line = 249)
    public final void method151(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class144 arg6, int arg7, int arg8) {
        field804++;
        class67 var10 = ((class357) arg6).field4863;
        if (this.field805) {
            float var11 = (float) this.method155();
            float var12 = (float) this.method153();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field790 * var15;
            float var18 = (float) this.field790 * var16;
            float var19 = (float) this.field800 * var13;
            float var20 = (float) this.field800 * var14;
            float var21 = (float) this.field799 * -var13;
            float var22 = (float) this.field799 * -var14;
            float var23 = (float) this.field801 * -var15;
            arg3 = arg3 + var22 + var18;
            arg0 = arg0 + var19 + var17;
            float var24 = (float) this.field801 * -var16;
            arg1 = arg1 + var20 + var18;
            arg4 = arg4 + var19 + var23;
            arg2 = arg2 + var21 + var17;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        this.field797.method1555((byte) 124, true);
        float var26 = arg5 + arg3 - arg1;
        this.field812.method2273((byte) 52);
        this.field812.method2236(this.field797, 95);
        this.field812.method2260(16640, 1);
        this.field812.method2250((byte) 74, 1);
        this.field812.method2236(var10, -59);
        this.field812.method2269(7681, 8960, 8448);
        this.field812.method2229(34168, (byte) -18, 0, 768);
        this.field812.method2279(1, (byte) 16);
        float var27 = var10.field770 / (float) var10.field765;
        float var28 = var10.field769 / (float) var10.field766;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field797.field769);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + arg0) * var27, var10.field769 - ((arg1 - (float) arg8) * var28));
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + arg4) * var27, var10.field769 - (arg5 - (float) arg8) * var28);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field797.field770, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + var25) * var27, var10.field769 - ((var26 - (float) arg8) * var28));
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glMultiTexCoord2f(33984, this.field797.field770, this.field797.field769);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + arg2) * var27, var10.field769 - (arg3 - (float) arg8) * var28);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field812.method2229(5890, (byte) -18, 0, 768);
        this.field812.method2260(16640, 0);
        this.field812.method2236(null, 102);
        this.field812.method2250((byte) 72, 0);
    }

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(Lur;IIII)V", line = 760)
    public class69(class377 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field812 = arg0;
        this.field797 = class106.method658(arg3, arg4, arg2, arg1, arg0, 1);
    }

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(Lur;II[III)V", line = 770)
    public class69(class377 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field812 = arg0;
        this.field797 = class380.method2318(arg3, arg0, arg2, arg1, false, 3553);
    }

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "(II)V", line = 342)
    private final void method402(int arg0, int arg1) {
        this.field812.method2250((byte) 84, 1);
        field796++;
        this.field812.method2236(this.field797, 107);
        if (arg1 != 25917) {
            return;
        }
        this.field812.method2269(this.field812.method2292(arg0, true), arg1 - 16957, 7681);
        this.field812.method2229(34167, (byte) -18, 1, 768);
        this.field812.method2277((byte) -110, 770, 0, 34168);
        this.field812.method2250((byte) 100, 0);
        this.field812.method2236(this.field789, 126);
        this.field812.method2269(34479, 8960, 7681);
        this.field812.method2229(34166, (byte) -18, 1, 768);
        if (this.field798 == 0) {
            this.field812.method2246(0.5F, -13680, 1.0F, 0.5F, 0.0F);
        } else if (this.field798 == 1) {
            this.field812.method2246(0.5F, arg1 ^ 0xFFFFAFAD, 0.5F, 1.0F, 0.0F);
        } else if (this.field798 == 2) {
            this.field812.method2246(1.0F, -13680, 0.5F, 0.5F, 0.0F);
            return;
        } else if (this.field798 == 3) {
            this.field812.method2246(128.5F, -13680, 128.5F, 128.5F, 0.0F);
            return;
        }
    }

    @OriginalMember(owner = "client!jt", name = "la", descriptor = "(IIIIIII)V", line = 376)
    public final void method149(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field787++;
        int var8 = arg0 + arg2;
        this.field797.method1555((byte) 108, false);
        int var9 = arg1 + arg3;
        this.field812.method2273((byte) 80);
        this.field812.method2236(this.field797, 111);
        this.field812.method2279(arg6, (byte) 51);
        this.field812.method2260(16640, arg4);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field797.field771 && !this.field805) {
            float var10 = (float) arg3 * this.field797.field769 / (float) this.field797.field766;
            float var11 = (float) arg2 * this.field797.field770 / (float) this.field797.field765;
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
        OpenGL.glTranslatef((float) this.field800, (float) this.field790, 0.0F);
        int var12 = this.method155();
        int var13 = this.method153();
        int var14 = this.field797.field766 + arg1;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var14 <= var9) {
            int var20 = this.field797.field765 + arg0;
            int var21 = arg0;
            while (var20 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field797.field769);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field797.field770, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field797.field770, this.field797.field769);
                OpenGL.glVertex2i(var20, var15);
                var21 += var12;
                var20 += var12;
            }
            if (var8 > var21) {
                float var22 = (float) (var8 - var21) * this.field797.field770 / (float) this.field797.field765;
                OpenGL.glTexCoord2f(0.0F, this.field797.field769);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field797.field769);
                OpenGL.glVertex2i(var8, var15);
            }
            var15 += var13;
            var14 += var13;
        }
        if (var15 < var9) {
            float var16 = (float) (-var9 - (-var15 - this.field797.field766)) * this.field797.field769 / (float) this.field797.field766;
            int var17 = this.field797.field765 + arg0;
            int var18 = arg0;
            while (var8 >= var17) {
                OpenGL.glTexCoord2f(0.0F, this.field797.field769);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field797.field770, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field797.field770, this.field797.field769);
                OpenGL.glVertex2i(var17, var15);
                var17 += var12;
                var18 += var12;
            }
            if (var8 > var18) {
                float var19 = (float) (var8 - var18) * this.field797.field770 / (float) this.field797.field765;
                OpenGL.glTexCoord2f(0.0F, this.field797.field769);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field797.field769);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!jt", name = "W", descriptor = "(IIIII)V", line = 525)
    public final void method12(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field797.method1555((byte) 120, false);
        field786++;
        this.field812.method2273((byte) 50);
        this.field812.method2279(arg4, (byte) 125);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field800 + arg0;
        int var7 = this.field790 + arg1;
        if (this.field789 == null) {
            this.field812.method2236(this.field797, 98);
            this.field812.method2260(16640, arg2);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field797.field769);
            OpenGL.glVertex2i(var6, var7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var6, this.field797.field766 + var7);
            OpenGL.glTexCoord2f(this.field797.field770, 0.0F);
            OpenGL.glVertex2i(this.field797.field765 + var6, this.field797.field766 + var7);
            OpenGL.glTexCoord2f(this.field797.field770, this.field797.field769);
            OpenGL.glVertex2i(this.field797.field765 + var6, var7);
            OpenGL.glEnd();
            return;
        }
        this.method402(arg2, 25917);
        this.field789.method1555((byte) 114, false);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field797.field769);
        OpenGL.glTexCoord2f(0.0F, this.field797.field769);
        OpenGL.glVertex2i(var6, var7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var6, this.field797.field766 + var7);
        OpenGL.glMultiTexCoord2f(33985, this.field797.field770, 0.0F);
        OpenGL.glTexCoord2f(this.field797.field770, 0.0F);
        OpenGL.glVertex2i(this.field797.field765 + var6, this.field797.field766 + var7);
        OpenGL.glMultiTexCoord2f(33985, this.field797.field770, this.field797.field769);
        OpenGL.glTexCoord2f(this.field797.field770, this.field797.field769);
        OpenGL.glVertex2i(this.field797.field765 + var6, var7);
        OpenGL.glEnd();
        this.method400(-10026);
    }

    @OriginalMember(owner = "client!jt", name = "Q", descriptor = "()I", line = 585)
    public final int method153() {
        field807++;
        return this.field797.field766 + this.field790 + this.field801;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(IILta;II)V", line = 593)
    public final void method7(int arg0, int arg1, class144 arg2, int arg3, int arg4) {
        field792++;
        class357 var6 = (class357) arg2;
        class67 var7 = var6.field4863;
        this.field797.method1555((byte) 109, false);
        this.field812.method2273((byte) 75);
        this.field812.method2236(this.field797, 120);
        this.field812.method2260(16640, 1);
        this.field812.method2250((byte) 109, 1);
        this.field812.method2236(var7, 6);
        this.field812.method2269(7681, 8960, 8448);
        this.field812.method2229(34168, (byte) -18, 0, 768);
        this.field812.method2279(1, (byte) 17);
        int var8 = this.field800 + arg0;
        int var9 = this.field790 + arg1;
        int var10 = this.field797.field765 + var8;
        int var11 = this.field797.field766 + var9;
        float var12 = var7.field770 / (float) var7.field765;
        float var13 = var7.field769 / (float) var7.field766;
        float var14 = (float) (var8 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field769 - (float) (var9 - arg4) * var13;
        float var17 = var7.field769 - ((float) (var11 - arg4) * var13);
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field797.field769);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var8, var9);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var8, this.field797.field766 + var9);
        OpenGL.glMultiTexCoord2f(33984, this.field797.field770, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(this.field797.field765 + var8, this.field797.field766 + var9);
        OpenGL.glMultiTexCoord2f(33984, this.field797.field770, this.field797.field769);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(this.field797.field765 + var8, var9);
        OpenGL.glEnd();
        this.field812.method2229(5890, (byte) -18, 0, 768);
        this.field812.method2260(16640, 0);
        this.field812.method2236(null, -104);
        this.field812.method2250((byte) 101, 0);
    }

    @OriginalMember(owner = "client!jt", name = "ZA", descriptor = "()I", line = 656)
    public final int method146() {
        field809++;
        return this.field797.field766;
    }

    @OriginalMember(owner = "client!jt", name = "H", descriptor = "(FFFFFFIII)V", line = 667)
    public final void method143(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field805) {
            float var10 = (float) this.method155();
            float var11 = (float) this.method153();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field790 * var14;
            float var17 = (float) this.field790 * var15;
            float var18 = (float) this.field800 * var12;
            float var19 = (float) this.field800 * var13;
            float var20 = (float) this.field799 * -var12;
            float var21 = (float) this.field799 * -var13;
            float var22 = (float) this.field801 * -var14;
            float var23 = (float) this.field801 * -var15;
            arg0 = arg0 + var18 + var16;
            arg3 = arg3 + var21 + var17;
            arg1 = arg1 + var19 + var17;
            arg4 = arg4 + var18 + var22;
            arg2 = arg2 + var20 + var16;
            arg5 = arg5 + var19 + var23;
        }
        field803++;
        float var24 = arg2 + arg4 - arg0;
        this.field797.method1555((byte) 107, true);
        float var25 = arg5 + arg3 - arg1;
        this.field812.method2273((byte) 47);
        this.field812.method2236(this.field797, 127);
        this.field812.method2279(arg8, (byte) 11);
        this.field812.method2260(16640, arg6);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field797.field769);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field797.field770, 0.0F);
        OpenGL.glVertex2f(var24, var25);
        OpenGL.glTexCoord2f(this.field797.field770, this.field797.field769);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!jt", name = "XA", descriptor = "(IIIIII)V", line = 734)
    public final void method8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field797.method1496(arg0, arg1, arg4, 32993, arg5, arg2, arg3);
        field808++;
    }
}
