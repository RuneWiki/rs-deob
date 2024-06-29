import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class346 extends class604 {

    @OriginalMember(owner = "client!hs", name = "g", descriptor = "I")
    private int field4648 = 0;

    @OriginalMember(owner = "client!hs", name = "o", descriptor = "Z")
    private boolean field4656 = false;

    @OriginalMember(owner = "client!hs", name = "x", descriptor = "I")
    private int field4665 = 0;

    @OriginalMember(owner = "client!hs", name = "A", descriptor = "I")
    private int field4668 = 0;

    @OriginalMember(owner = "client!hs", name = "E", descriptor = "I")
    private int field4672 = 0;

    @OriginalMember(owner = "client!hs", name = "u", descriptor = "I")
    private int field4662 = 0;

    @OriginalMember(owner = "client!hs", name = "s", descriptor = "Lhk;")
    private class111 field4660;

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "Lvq;")
    private class488 field4643;

    @OriginalMember(owner = "client!hs", name = "p", descriptor = "I")
    public static int field4657 = 0;

    @OriginalMember(owner = "client!hs", name = "i", descriptor = "Lvl;")
    public static class15 field4650 = new class15(26, 7);

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "I")
    public static int field4645;

    @OriginalMember(owner = "client!hs", name = "f", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!hs", name = "h", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!hs", name = "j", descriptor = "I")
    public static int field4651;

    @OriginalMember(owner = "client!hs", name = "k", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!hs", name = "l", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!hs", name = "m", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!hs", name = "n", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!hs", name = "q", descriptor = "I")
    public static int field4658;

    @OriginalMember(owner = "client!hs", name = "r", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!hs", name = "t", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!hs", name = "v", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!hs", name = "z", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!hs", name = "B", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!hs", name = "C", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!hs", name = "D", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!hs", name = "F", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!hs", name = "y", descriptor = "Len;")
    public static class339 field4666;

    @OriginalMember(owner = "client!hs", name = "e", descriptor = "Lvq;")
    private class488 field4646;

    @OriginalMember(owner = "client!hs", name = "w", descriptor = "Lgj;")
    public static class662 field4664;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Z)V", line = 3)
    private final void method2135(boolean arg0) {
        this.field4660.method1002(1, -5172);
        field4642++;
        this.field4660.method939(null, 8448);
        this.field4660.method990(8448, 8448, -29641);
        this.field4660.method988(34168, 6, 1, 768);
        this.field4660.method980(0, 5890, true, 770);
        this.field4660.method1002(0, -5172);
        this.field4660.method988(34168, 6, 1, 768);
        if (arg0) {
            this.method212(null);
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIIIIII)V", line = 26)
    public final void method226(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4652++;
        int var8 = arg0 + arg2;
        int var9 = arg1 + arg3;
        this.field4643.method126(false, -22513);
        this.field4660.method952((byte) -86);
        this.field4660.method939(this.field4643, 8448);
        this.field4660.method973(1, arg6);
        this.field4660.method999(true, arg4);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field4643.field6590 && !this.field4656) {
            float var10 = (float) arg3 * this.field4643.field6586 / (float) this.field4643.field6584;
            float var11 = (float) arg2 * this.field4643.field6581 / (float) this.field4643.field6588;
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
        OpenGL.glTranslatef((float) this.field4662, (float) this.field4668, 0.0F);
        int var12 = this.method224();
        int var13 = this.method218();
        int var14 = arg1 + this.field4643.field6584;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var14 <= var9) {
            int var20 = this.field4643.field6588 + arg0;
            int var21 = arg0;
            while (var8 >= var20) {
                OpenGL.glTexCoord2f(0.0F, this.field4643.field6586);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field4643.field6581, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field4643.field6581, this.field4643.field6586);
                OpenGL.glVertex2i(var20, var15);
                var21 += var12;
                var20 += var12;
            }
            if (var8 > var21) {
                float var22 = (float) (var8 - var21) * this.field4643.field6581 / (float) this.field4643.field6588;
                OpenGL.glTexCoord2f(0.0F, this.field4643.field6586);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field4643.field6586);
                OpenGL.glVertex2i(var8, var15);
            }
            var14 += var13;
            var15 += var13;
        }
        if (var9 > var15) {
            float var16 = (float) (this.field4643.field6584 + var15 - var9) * this.field4643.field6586 / (float) this.field4643.field6584;
            int var17 = arg0 + this.field4643.field6588;
            int var18 = arg0;
            while (var8 >= var17) {
                OpenGL.glTexCoord2f(0.0F, this.field4643.field6586);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field4643.field6581, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field4643.field6581, this.field4643.field6586);
                OpenGL.glVertex2i(var17, var15);
                var18 += var12;
                var17 += var12;
            }
            if (var8 > var18) {
                float var19 = (float) (var8 - var18) * this.field4643.field6581 / (float) this.field4643.field6588;
                OpenGL.glTexCoord2f(0.0F, this.field4643.field6586);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field4643.field6586);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IILaa;II)V", line = 162)
    public final void method211(int arg0, int arg1, class514 arg2, int arg3, int arg4) {
        field4653++;
        class699 var6 = (class699) arg2;
        class488 var7 = var6.field9649;
        this.field4643.method126(false, -22513);
        this.field4660.method952((byte) -127);
        this.field4660.method939(this.field4643, 8448);
        this.field4660.method999(true, 1);
        this.field4660.method1002(1, -5172);
        this.field4660.method939(var7, 8448);
        this.field4660.method990(7681, 8448, -29641);
        this.field4660.method988(34168, 6, 0, 768);
        this.field4660.method973(1, 1);
        int var8 = this.field4668 + arg1;
        int var9 = this.field4662 + arg0;
        int var10 = this.field4643.field6588 + var9;
        int var11 = this.field4643.field6584 + var8;
        float var12 = var7.field6581 / (float) var7.field6588;
        float var13 = var7.field6586 / (float) var7.field6584;
        float var14 = (float) (var9 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field6586 - ((float) (var8 - arg4) * var13);
        float var17 = var7.field6586 - (float) (var11 - arg4) * var13;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field4643.field6586);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var9, var8);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var9, var8 + this.field4643.field6584);
        OpenGL.glMultiTexCoord2f(33984, this.field4643.field6581, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(this.field4643.field6588 + var9, this.field4643.field6584 + var8);
        OpenGL.glMultiTexCoord2f(33984, this.field4643.field6581, this.field4643.field6586);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(this.field4643.field6588 + var9, var8);
        OpenGL.glEnd();
        this.field4660.method988(5890, 6, 0, 768);
        this.field4660.method999(true, 0);
        this.field4660.method939(null, 8448);
        this.field4660.method1002(0, -5172);
    }

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "(IIII)V", line = 222)
    public final void method213(int arg0, int arg1, int arg2, int arg3) {
        this.field4668 = arg1;
        field4645++;
        this.field4665 = arg2;
        this.field4662 = arg0;
        this.field4672 = arg3;
        this.field4656 = this.field4662 != 0 || this.field4668 != 0 || this.field4665 != 0 || this.field4672 != 0;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(FFFFFFILaa;II)V", line = 235)
    public final void method223(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class514 arg7, int arg8, int arg9) {
        field4658++;
        class488 var11 = ((class699) arg7).field9649;
        if (this.field4656) {
            float var12 = (float) this.method224();
            float var13 = (float) this.method218();
            float var14 = (arg2 - arg0) / var12;
            float var15 = (arg3 - arg1) / var12;
            float var16 = (arg4 - arg0) / var13;
            float var17 = (arg5 - arg1) / var13;
            float var18 = (float) this.field4668 * var16;
            float var19 = (float) this.field4668 * var17;
            float var20 = (float) this.field4662 * var14;
            float var21 = (float) this.field4662 * var15;
            float var22 = (float) this.field4665 * -var14;
            float var23 = (float) this.field4665 * -var15;
            float var24 = (float) this.field4672 * -var16;
            arg4 = arg4 + var20 + var24;
            float var25 = (float) this.field4672 * -var17;
            arg1 = arg1 + var21 + var19;
            arg0 = arg0 + var20 + var18;
            arg2 = arg2 + var22 + var18;
            arg3 = arg3 + var23 + var19;
            arg5 = arg5 + var21 + var25;
        }
        float var26 = arg2 + arg4 - arg0;
        float var27 = arg5 + arg3 - arg1;
        this.field4643.method126((arg6 & 0x1) != 0, -22513);
        this.field4660.method952((byte) 116);
        this.field4660.method939(this.field4643, 8448);
        this.field4660.method999(true, 1);
        this.field4660.method1002(1, -5172);
        this.field4660.method939(var11, 8448);
        this.field4660.method990(7681, 8448, -29641);
        this.field4660.method988(34168, 6, 0, 768);
        this.field4660.method973(1, 1);
        float var28 = var11.field6581 / (float) var11.field6588;
        float var29 = var11.field6586 / (float) var11.field6584;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field4643.field6586);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + arg0) * var28, var11.field6586 - (arg1 - (float) arg9) * var29);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg8) * var28, var11.field6586 - (arg5 - (float) arg9) * var29);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field4643.field6581, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + var26) * var28, var11.field6586 - ((var27 - (float) arg9) * var29));
        OpenGL.glVertex2f(var26, var27);
        OpenGL.glMultiTexCoord2f(33984, this.field4643.field6581, this.field4643.field6586);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + arg2) * var28, var11.field6586 - ((arg3 - (float) arg9) * var29));
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field4660.method988(5890, 6, 0, 768);
        this.field4660.method999(true, 0);
        this.field4660.method939(null, 8448);
        this.field4660.method1002(0, -5172);
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "()I", line = 320)
    public final int method220() {
        field4669++;
        return this.field4643.field6588;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIII[III)V", line = 330)
    private final void method2136(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        field4659++;
        this.field4643.method1746(arg2, arg0, true, arg1, arg5, arg6, arg4, arg3, 0);
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIIII)V", line = 340)
    public final void method215(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4655++;
        this.field4643.method126(false, -22513);
        this.field4660.method952((byte) -72);
        this.field4660.method973(1, arg4);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field4662 + arg0;
        int var7 = this.field4668 + arg1;
        if (this.field4646 == null) {
            this.field4660.method939(this.field4643, 8448);
            this.field4660.method999(true, arg2);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field4643.field6586);
            OpenGL.glVertex2i(var6, var7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var6, this.field4643.field6584 + var7);
            OpenGL.glTexCoord2f(this.field4643.field6581, 0.0F);
            OpenGL.glVertex2i(this.field4643.field6588 + var6, this.field4643.field6584 + var7);
            OpenGL.glTexCoord2f(this.field4643.field6581, this.field4643.field6586);
            OpenGL.glVertex2i(this.field4643.field6588 + var6, var7);
            OpenGL.glEnd();
            return;
        }
        this.method2139((byte) 127, arg2);
        this.field4646.method126(false, -22513);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field4643.field6586);
        OpenGL.glTexCoord2f(0.0F, this.field4643.field6586);
        OpenGL.glVertex2i(var6, var7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var6, this.field4643.field6584 + var7);
        OpenGL.glMultiTexCoord2f(33985, this.field4643.field6581, 0.0F);
        OpenGL.glTexCoord2f(this.field4643.field6581, 0.0F);
        OpenGL.glVertex2i(this.field4643.field6588 + var6, this.field4643.field6584 + var7);
        OpenGL.glMultiTexCoord2f(33985, this.field4643.field6581, this.field4643.field6586);
        OpenGL.glTexCoord2f(this.field4643.field6581, this.field4643.field6586);
        OpenGL.glVertex2i(this.field4643.field6588 + var6, var7);
        OpenGL.glEnd();
        this.method2135(false);
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIIIZII)V", line = 392)
    public static final void method2137(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg4) {
            field4657 = 71;
        }
        for (class459 var7 = (class459) class236.field3389.method1597((byte) 107); var7 != null; var7 = (class459) class236.field3389.method1601(90)) {
            if (var7.field6238 <= class440.field5977) {
                var7.method731((byte) 39);
            } else {
                class68.method621((byte) 110, var7.field6233 * 2, arg2 >> 1, (var7.field6234 << 9) + 256, var7.field6235, arg6 >> 1, (var7.field6239 << 9) + 256, arg5, arg3);
                class557.field7861.method613(arg0 + class538.field7307[0], 0, var7.field6231, var7.field6242 | 0xFF000000, true, class538.field7307[1] + arg1);
            }
        }
        field4644++;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "([I)V", line = 421)
    public final void method212(int[] arg0) {
        arg0[2] = this.field4665;
        arg0[1] = this.field4668;
        arg0[3] = this.field4672;
        field4671++;
        arg0[0] = this.field4662;
    }

    @OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Lhk;IIZ)V", line = 775)
    public class346(class111 arg0, int arg1, int arg2, boolean arg3) {
        this.field4660 = arg0;
        this.field4643 = class530.method3010(arg0, arg3 ? 6408 : 6407, arg2, arg1, 3553);
    }

    @OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Lhk;IIII)V", line = 785)
    public class346(class111 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4660 = arg0;
        this.field4643 = class287.method1833(arg0, arg4, arg3, false, arg1, arg2);
    }

    @OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Lhk;II[III)V", line = 795)
    public class346(class111 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field4660 = arg0;
        this.field4643 = class568.method3281(arg2, false, arg4, arg0, arg5, arg1, arg3, 20539);
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIIIII)V", line = 443)
    public final void method642(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field4660.field2066) {
            int[] var7 = this.field4660.method484(arg4, arg5, arg2, arg3);
            if (var7 != null) {
                for (int var8 = 0; var8 < var7.length; var8++) {
                    var7[var8] = class530.method3011(var7[var8], -16777216);
                }
                this.method2136(arg0, arg1, arg2, arg3, var7, 0, arg2);
            }
        } else {
            this.field4643.method1745(arg3, arg2, 0, arg5, arg4, arg0, arg1);
        }
        field4649++;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(III)V", line = 472)
    public final void method641(int arg0, int arg1, int arg2) {
        OpenGL.glPixelTransferf(3348, 0.5F);
        field4670++;
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field4646 = class287.method1833(this.field4660, this.field4643.field6584, this.field4643.field6588, false, arg0, arg1);
        this.field4648 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIIIIIII)V", line = 497)
    public final void method221(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field4643.method126((arg7 & 0x1) != 0, -22513);
        field4661++;
        this.field4660.method952((byte) 111);
        this.field4660.method973(1, arg6);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field4656) {
            float var9 = (float) arg2 / (float) this.method224();
            float var10 = (float) arg3 / (float) this.method218();
            float var11 = (float) this.field4662 * var9 + (float) arg0;
            float var12 = (float) this.field4668 * var10 + (float) arg1;
            float var13 = (float) this.field4643.field6588 * var9 + var11;
            float var14 = (float) this.field4643.field6584 * var10 + var12;
            if (this.field4646 == null) {
                this.field4660.method939(this.field4643, 8448);
                this.field4660.method999(true, arg4);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field4643.field6586);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glTexCoord2f(this.field4643.field6581, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glTexCoord2f(this.field4643.field6581, this.field4643.field6586);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
            } else {
                this.method2139((byte) 127, arg4);
                this.field4646.method126(true, -22513);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field4643.field6586);
                OpenGL.glTexCoord2f(0.0F, this.field4643.field6586);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field4643.field6581, 0.0F);
                OpenGL.glTexCoord2f(this.field4643.field6581, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field4643.field6581, this.field4643.field6586);
                OpenGL.glTexCoord2f(this.field4643.field6581, this.field4643.field6586);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
                this.method2135(false);
            }
        } else if (this.field4646 == null) {
            this.field4660.method939(this.field4643, 8448);
            this.field4660.method999(true, arg4);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field4643.field6586);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field4643.field6581, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field4643.field6581, this.field4643.field6586);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method2139((byte) 127, arg4);
            this.field4646.method126(true, -22513);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field4643.field6586);
            OpenGL.glTexCoord2f(0.0F, this.field4643.field6586);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field4643.field6581, 0.0F);
            OpenGL.glTexCoord2f(this.field4643.field6581, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field4643.field6581, this.field4643.field6586);
            OpenGL.glTexCoord2f(this.field4643.field6581, this.field4643.field6586);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method2135(false);
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "()I", line = 605)
    public final int method224() {
        field4673++;
        return this.field4643.field6588 + this.field4665 + this.field4662;
    }

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "()I", line = 617)
    public final int method218() {
        field4654++;
        return this.field4643.field6584 + this.field4668 + this.field4672;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(B)V", line = 626)
    public static void method2138(byte arg0) {
        field4650 = null;
        field4664 = null;
        if (arg0 >= -44) {
            method2138((byte) -4);
        }
        field4666 = null;
    }

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "()I", line = 646)
    public final int method214() {
        field4651++;
        return this.field4643.field6584;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(FFFFFFIIII)V", line = 655)
    public final void method219(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field4656) {
            float var11 = (float) this.method224();
            float var12 = (float) this.method218();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field4668 * var15;
            float var18 = (float) this.field4668 * var16;
            float var19 = (float) this.field4662 * var13;
            float var20 = (float) this.field4662 * var14;
            float var21 = (float) this.field4665 * -var13;
            float var22 = (float) this.field4665 * -var14;
            float var23 = (float) this.field4672 * -var15;
            arg0 = arg0 + var19 + var17;
            arg1 = arg1 + var20 + var18;
            arg2 = arg2 + var21 + var17;
            arg4 = arg4 + var19 + var23;
            arg3 = arg3 + var22 + var18;
            float var24 = (float) this.field4672 * -var16;
            arg5 = arg5 + var20 + var24;
        }
        field4647++;
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        this.field4643.method126((arg9 & 0x1) != 0, -22513);
        this.field4660.method952((byte) 87);
        this.field4660.method939(this.field4643, 8448);
        this.field4660.method973(1, arg8);
        this.field4660.method999(true, arg6);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field4643.field6586);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field4643.field6581, 0.0F);
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glTexCoord2f(this.field4643.field6581, this.field4643.field6586);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(BI)V", line = 723)
    private final void method2139(byte arg0, int arg1) {
        field4667++;
        this.field4660.method1002(1, -5172);
        this.field4660.method939(this.field4643, 8448);
        this.field4660.method990(this.field4660.method996(2, arg1), 7681, -29641);
        this.field4660.method988(34167, 6, 1, 768);
        this.field4660.method980(0, 34168, true, 770);
        this.field4660.method1002(0, -5172);
        this.field4660.method939(this.field4646, 8448);
        if (arg0 != 127) {
            field4657 = 69;
        }
        this.field4660.method990(34479, 7681, arg0 - 29768);
        this.field4660.method988(34166, 6, 1, 768);
        if (this.field4648 == 0) {
            this.field4660.method970((byte) 125, 0.5F, 1.0F, 0.5F, 0.0F);
        } else if (this.field4648 == 1) {
            this.field4660.method970((byte) 53, 1.0F, 0.5F, 0.5F, 0.0F);
        } else if (this.field4648 == 2) {
            this.field4660.method970((byte) 100, 0.5F, 0.5F, 1.0F, 0.0F);
            return;
        } else if (this.field4648 == 3) {
            this.field4660.method970((byte) 74, 128.5F, 128.5F, 128.5F, 0.0F);
            return;
        }
    }
}
