import jaggl.OpenGL;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class680 extends class458 {

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "I")
    private int field9631 = 0;

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "I")
    private int field9633 = 0;

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "I")
    private int field9637 = 0;

    @OriginalMember(owner = "client!nh", name = "u", descriptor = "Z")
    private boolean field9641 = false;

    @OriginalMember(owner = "client!nh", name = "D", descriptor = "I")
    private int field9650 = 0;

    @OriginalMember(owner = "client!nh", name = "E", descriptor = "I")
    private int field9651 = 0;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "Lap;")
    private class435 field9626;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "Lhea;")
    private class385 field9625;

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "Llt;")
    public static class617 field9630 = new class617(5000);

    @OriginalMember(owner = "client!nh", name = "x", descriptor = "Lgs;")
    public static class41 field9644 = new class41("WTRC", 1);

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public static int field9621;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field9622;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field9623;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public static int field9624;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
    public static int field9627;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "I")
    public static int field9628;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "I")
    public static int field9629;

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "I")
    public static int field9632;

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "I")
    public static int field9634;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "I")
    public static int field9635;

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "I")
    public static int field9636;

    @OriginalMember(owner = "client!nh", name = "s", descriptor = "I")
    public static int field9639;

    @OriginalMember(owner = "client!nh", name = "t", descriptor = "I")
    public static int field9640;

    @OriginalMember(owner = "client!nh", name = "v", descriptor = "I")
    public static int field9642;

    @OriginalMember(owner = "client!nh", name = "w", descriptor = "I")
    public static int field9643;

    @OriginalMember(owner = "client!nh", name = "y", descriptor = "I")
    public static int field9645;

    @OriginalMember(owner = "client!nh", name = "z", descriptor = "I")
    public static int field9646;

    @OriginalMember(owner = "client!nh", name = "A", descriptor = "I")
    public static int field9647;

    @OriginalMember(owner = "client!nh", name = "B", descriptor = "I")
    public static int field9648;

    @OriginalMember(owner = "client!nh", name = "r", descriptor = "Lhea;")
    private class385 field9638;

    @OriginalMember(owner = "client!nh", name = "C", descriptor = "Ljava/awt/Frame;")
    public static Frame field9649;

    @OriginalMember(owner = "client!nh", name = "ba", descriptor = "(IIIIIII)V", line = 3)
    public final void method420(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field9639++;
        int var8 = arg0 + arg2;
        this.field9625.method2233((byte) -99, false);
        int var9 = arg1 + arg3;
        this.field9626.method2391((byte) -103);
        this.field9626.method2388((byte) 87, this.field9625);
        this.field9626.method2378(true, arg6);
        this.field9626.method2396(arg4, -1);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field9625.field5145 && !this.field9641) {
            float var10 = (float) arg3 * this.field9625.field5147 / (float) this.field9625.field5151;
            float var11 = (float) arg2 * this.field9625.field5143 / (float) this.field9625.field5148;
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
        OpenGL.glTranslatef((float) this.field9650, (float) this.field9633, 0.0F);
        int var12 = this.method418();
        int var13 = this.method408();
        int var14 = this.field9625.field5151 + arg1;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var14 <= var9) {
            int var20 = this.field9625.field5148 + arg0;
            int var21 = arg0;
            while (var8 >= var20) {
                OpenGL.glTexCoord2f(0.0F, this.field9625.field5147);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field9625.field5143, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field9625.field5143, this.field9625.field5147);
                OpenGL.glVertex2i(var20, var15);
                var21 += var12;
                var20 += var12;
            }
            if (var8 > var21) {
                float var22 = (float) (var8 - var21) * this.field9625.field5143 / (float) this.field9625.field5148;
                OpenGL.glTexCoord2f(0.0F, this.field9625.field5147);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field9625.field5147);
                OpenGL.glVertex2i(var8, var15);
            }
            var14 += var13;
            var15 += var13;
        }
        if (var9 > var15) {
            float var16 = (float) (var15 - (var9 - this.field9625.field5151)) * this.field9625.field5147 / (float) this.field9625.field5151;
            int var17 = arg0 + this.field9625.field5148;
            int var18 = arg0;
            while (var8 >= var17) {
                OpenGL.glTexCoord2f(0.0F, this.field9625.field5147);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field9625.field5143, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field9625.field5143, this.field9625.field5147);
                OpenGL.glVertex2i(var17, var15);
                var17 += var12;
                var18 += var12;
            }
            if (var18 < var8) {
                float var19 = (float) (var8 - var18) * this.field9625.field5143 / (float) this.field9625.field5148;
                OpenGL.glTexCoord2f(0.0F, this.field9625.field5147);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field9625.field5147);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)I", line = 142)
    public static final int method3798(int arg0, int arg1, int arg2) {
        field9627++;
        if (arg0 < 114) {
            field9649 = null;
        }
        return arg1 == 4 || arg1 == 5 ? class513.field7347[arg2 & 0x3] : 256;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "()I", line = 156)
    public final int method408() {
        field9623++;
        return this.field9633 + this.field9631 + this.field9625.field5151;
    }

    @OriginalMember(owner = "client!nh", name = "t", descriptor = "(III)V", line = 171)
    public final void method414(int arg0, int arg1, int arg2) {
        OpenGL.glPixelTransferf(3348, 0.5F);
        field9628++;
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field9638 = class98.method608(this.field9625.field5151, arg1, arg0, this.field9625.field5148, this.field9626, (byte) -88);
        this.field9637 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lnb;B)I", line = 194)
    public static final int method3799(class271 arg0, byte arg1) {
        field9621++;
        if (arg1 != -42) {
            return 19;
        } else if (class271.field3424 == arg0) {
            return 5120;
        } else if (class271.field3427 == arg0) {
            return 5122;
        } else if (class271.field3428 == arg0) {
            return 5124;
        } else if (class271.field3429 == arg0) {
            return 5121;
        } else if (class271.field3430 == arg0) {
            return 5123;
        } else if (class271.field3431 == arg0) {
            return 5125;
        } else if (class271.field3432 == arg0) {
            return 5131;
        } else if (class271.field3433 == arg0) {
            return 5126;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!nh", name = "KA", descriptor = "(IIIIIII)V", line = 236)
    public final void method413(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field9625.method2233((byte) -99, true);
        field9632++;
        this.field9626.method2391((byte) -103);
        this.field9626.method2378(true, arg6);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field9641) {
            float var8 = (float) arg2 / (float) this.method418();
            float var9 = (float) arg3 / (float) this.method408();
            float var10 = (float) this.field9650 * var8 + (float) arg0;
            float var11 = (float) this.field9633 * var9 + (float) arg1;
            float var12 = (float) this.field9625.field5148 * var8 + var10;
            float var13 = (float) this.field9625.field5151 * var9 + var11;
            if (this.field9638 == null) {
                this.field9626.method2388((byte) 97, this.field9625);
                this.field9626.method2396(arg4, -1);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field9625.field5147);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glTexCoord2f(this.field9625.field5143, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glTexCoord2f(this.field9625.field5143, this.field9625.field5147);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
            } else {
                this.method3800(arg4, -55);
                this.field9638.method2233((byte) -99, true);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field9625.field5147);
                OpenGL.glTexCoord2f(0.0F, this.field9625.field5147);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field9625.field5143, 0.0F);
                OpenGL.glTexCoord2f(this.field9625.field5143, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field9625.field5143, this.field9625.field5147);
                OpenGL.glTexCoord2f(this.field9625.field5143, this.field9625.field5147);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
                this.method3803(29861);
            }
        } else if (this.field9638 == null) {
            this.field9626.method2388((byte) -87, this.field9625);
            this.field9626.method2396(arg4, -1);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field9625.field5147);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field9625.field5143, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field9625.field5143, this.field9625.field5147);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method3800(arg4, -122);
            this.field9638.method2233((byte) -99, true);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field9625.field5147);
            OpenGL.glTexCoord2f(0.0F, this.field9625.field5147);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field9625.field5143, 0.0F);
            OpenGL.glTexCoord2f(this.field9625.field5143, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field9625.field5143, this.field9625.field5147);
            OpenGL.glTexCoord2f(this.field9625.field5143, this.field9625.field5147);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method3803(29861);
        }
    }

    @OriginalMember(owner = "client!nh", name = "AA", descriptor = "()I", line = 340)
    public final int method418() {
        field9636++;
        return this.field9625.field5148 + this.field9650 + this.field9651;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(II)V", line = 349)
    private final void method3800(int arg0, int arg1) {
        this.field9626.method2380(1, (byte) -69);
        if (arg1 >= -5) {
            this.method411(92, -34, 1, 75, -101, -46);
        }
        field9643++;
        this.field9626.method2388((byte) 111, this.field9625);
        this.field9626.method2371(this.field9626.method2376(17, arg0), 7681, -128);
        this.field9626.method2372(1, false, 768, 34167);
        this.field9626.method2390(34168, true, 0, 770);
        this.field9626.method2380(0, (byte) -117);
        this.field9626.method2388((byte) -32, this.field9638);
        this.field9626.method2371(34479, 7681, -84);
        this.field9626.method2372(1, false, 768, 34166);
        if (this.field9637 == 0) {
            this.field9626.method2369(1.0F, -21409, 0.0F, 0.5F, 0.5F);
        } else if (this.field9637 == 1) {
            this.field9626.method2369(0.5F, -21409, 0.0F, 0.5F, 1.0F);
        } else if (this.field9637 == 2) {
            this.field9626.method2369(0.5F, -21409, 0.0F, 1.0F, 0.5F);
        } else if (this.field9637 == 3) {
            this.field9626.method2369(128.5F, -21409, 0.0F, 128.5F, 128.5F);
            return;
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "()I", line = 387)
    public final int method417() {
        field9635++;
        return this.field9625.field5151;
    }

    @OriginalMember(owner = "client!nh", name = "sa", descriptor = "(FFFFFFIII)V", line = 397)
    public final void method419(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field9641) {
            float var10 = (float) this.method418();
            float var11 = (float) this.method408();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field9633 * var14;
            float var17 = (float) this.field9633 * var15;
            float var18 = (float) this.field9650 * var12;
            float var19 = (float) this.field9650 * var13;
            float var20 = (float) this.field9651 * -var12;
            float var21 = (float) this.field9651 * -var13;
            float var22 = (float) this.field9631 * -var14;
            arg4 = arg4 + var18 + var22;
            arg3 = arg3 + var21 + var17;
            arg1 = arg1 + var19 + var17;
            arg0 = arg0 + var18 + var16;
            float var23 = (float) this.field9631 * -var15;
            arg2 = arg2 + var20 + var16;
            arg5 = arg5 + var19 + var23;
        }
        field9642++;
        float var24 = arg2 + arg4 - arg0;
        this.field9625.method2233((byte) -99, true);
        float var25 = arg5 + arg3 - arg1;
        this.field9626.method2391((byte) -103);
        this.field9626.method2388((byte) -108, this.field9625);
        this.field9626.method2378(true, arg8);
        this.field9626.method2396(arg6, -1);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field9625.field5147);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field9625.field5143, 0.0F);
        OpenGL.glVertex2f(var24, var25);
        OpenGL.glTexCoord2f(this.field9625.field5143, this.field9625.field5147);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!nh", name = "I", descriptor = "(IIIII)V", line = 464)
    public final void method416(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field9647++;
        this.field9625.method2233((byte) -99, false);
        this.field9626.method2391((byte) -103);
        this.field9626.method2378(true, arg4);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field9650 + arg0;
        int var7 = this.field9633 + arg1;
        if (this.field9638 == null) {
            this.field9626.method2388((byte) -34, this.field9625);
            this.field9626.method2396(arg2, -1);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field9625.field5147);
            OpenGL.glVertex2i(var6, var7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var6, this.field9625.field5151 + var7);
            OpenGL.glTexCoord2f(this.field9625.field5143, 0.0F);
            OpenGL.glVertex2i(var6 + this.field9625.field5148, this.field9625.field5151 + var7);
            OpenGL.glTexCoord2f(this.field9625.field5143, this.field9625.field5147);
            OpenGL.glVertex2i(this.field9625.field5148 + var6, var7);
            OpenGL.glEnd();
            return;
        }
        this.method3800(arg2, -29);
        this.field9638.method2233((byte) -99, false);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field9625.field5147);
        OpenGL.glTexCoord2f(0.0F, this.field9625.field5147);
        OpenGL.glVertex2i(var6, var7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var6, this.field9625.field5151 + var7);
        OpenGL.glMultiTexCoord2f(33985, this.field9625.field5143, 0.0F);
        OpenGL.glTexCoord2f(this.field9625.field5143, 0.0F);
        OpenGL.glVertex2i(var6 + this.field9625.field5148, this.field9625.field5151 + var7);
        OpenGL.glMultiTexCoord2f(33985, this.field9625.field5143, this.field9625.field5147);
        OpenGL.glTexCoord2f(this.field9625.field5143, this.field9625.field5147);
        OpenGL.glVertex2i(this.field9625.field5148 + var6, var7);
        OpenGL.glEnd();
        this.method3803(29861);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V", line = 517)
    public static void method3801(int arg0) {
        field9649 = null;
        int var1 = -77 / ((54 - arg0) / 43);
        field9644 = null;
        field9630 = null;
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lap;IIII)V", line = 773)
    public class680(class435 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field9626 = arg0;
        this.field9625 = class98.method608(arg4, arg2, arg1, arg3, arg0, (byte) 52);
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lap;II[III)V", line = 783)
    public class680(class435 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field9626 = arg0;
        this.field9625 = class472.method2681(arg0, (byte) -103, false, arg3, arg1, arg2);
    }

    @OriginalMember(owner = "client!nh", name = "GA", descriptor = "(IIIIII)V", line = 532)
    public final void method411(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field9634++;
        this.field9625.method2470(arg5, arg0, arg3, arg1, arg2, arg4, false);
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)I", line = 542)
    public static final int method3802(int arg0) {
        field9640++;
        if (arg0 != 16) {
            field9649 = null;
        }
        return 16;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(FFFFFFLfa;II)V", line = 556)
    public final void method421(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class213 arg6, int arg7, int arg8) {
        field9622++;
        class385 var10 = ((class690) arg6).field9740;
        if (this.field9641) {
            float var11 = (float) this.method418();
            float var12 = (float) this.method408();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field9633 * var15;
            float var18 = (float) this.field9633 * var16;
            float var19 = (float) this.field9650 * var13;
            float var20 = (float) this.field9650 * var14;
            float var21 = (float) this.field9651 * -var13;
            float var22 = (float) this.field9651 * -var14;
            float var23 = (float) this.field9631 * -var15;
            arg2 = arg2 + var21 + var17;
            arg0 = arg0 + var19 + var17;
            arg3 = arg3 + var22 + var18;
            arg1 = arg1 + var20 + var18;
            arg4 = arg4 + var19 + var23;
            float var24 = (float) this.field9631 * -var16;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        this.field9625.method2233((byte) -99, true);
        float var26 = arg5 + arg3 - arg1;
        this.field9626.method2391((byte) -103);
        this.field9626.method2388((byte) -36, this.field9625);
        this.field9626.method2396(1, -1);
        this.field9626.method2380(1, (byte) -113);
        this.field9626.method2388((byte) 124, var10);
        this.field9626.method2371(7681, 8448, -65);
        this.field9626.method2372(0, false, 768, 34168);
        this.field9626.method2378(true, 1);
        float var27 = var10.field5143 / (float) var10.field5148;
        float var28 = var10.field5147 / (float) var10.field5151;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field9625.field5147);
        OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * var27, var10.field5147 - ((arg1 - (float) arg8) * var28));
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * var27, var10.field5147 - (((float) (-arg8) + arg5) * var28));
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field9625.field5143, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (var25 - (float) arg7) * var27, var10.field5147 - (((float) (-arg8) + var26) * var28));
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glMultiTexCoord2f(33984, this.field9625.field5143, this.field9625.field5147);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + arg2) * var27, var10.field5147 - (arg3 - (float) arg8) * var28);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field9626.method2372(0, false, 768, 5890);
        this.field9626.method2396(0, -1);
        this.field9626.method2388((byte) 112, null);
        this.field9626.method2380(0, (byte) -70);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IILfa;II)V", line = 648)
    public final void method410(int arg0, int arg1, class213 arg2, int arg3, int arg4) {
        field9648++;
        class690 var6 = (class690) arg2;
        class385 var7 = var6.field9740;
        this.field9625.method2233((byte) -99, false);
        this.field9626.method2391((byte) -103);
        this.field9626.method2388((byte) 88, this.field9625);
        this.field9626.method2396(1, -1);
        this.field9626.method2380(1, (byte) -99);
        this.field9626.method2388((byte) -24, var7);
        this.field9626.method2371(7681, 8448, -105);
        this.field9626.method2372(0, false, 768, 34168);
        this.field9626.method2378(true, 1);
        int var8 = this.field9633 + arg1;
        int var9 = this.field9650 + arg0;
        int var10 = this.field9625.field5148 + var9;
        int var11 = this.field9625.field5151 + var8;
        float var12 = var7.field5143 / (float) var7.field5148;
        float var13 = var7.field5147 / (float) var7.field5151;
        float var14 = (float) (var9 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field5147 - ((float) (var8 - arg4) * var13);
        float var17 = var7.field5147 - (float) (var11 - arg4) * var13;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field9625.field5147);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var9, var8);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var9, this.field9625.field5151 + var8);
        OpenGL.glMultiTexCoord2f(33984, this.field9625.field5143, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(this.field9625.field5148 + var9, var8 - -this.field9625.field5151);
        OpenGL.glMultiTexCoord2f(33984, this.field9625.field5143, this.field9625.field5147);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(this.field9625.field5148 + var9, var8);
        OpenGL.glEnd();
        this.field9626.method2372(0, false, 768, 5890);
        this.field9626.method2396(0, -1);
        this.field9626.method2388((byte) -26, null);
        this.field9626.method2380(0, (byte) -120);
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)V", line = 708)
    private final void method3803(int arg0) {
        if (arg0 != 29861) {
            field9649 = null;
        }
        this.field9626.method2380(1, (byte) -116);
        field9629++;
        this.field9626.method2388((byte) 99, null);
        this.field9626.method2371(8448, 8448, arg0 ^ 0xFFFF8B32);
        this.field9626.method2372(1, false, 768, 34168);
        this.field9626.method2390(5890, true, 0, 770);
        this.field9626.method2380(0, (byte) -83);
        this.field9626.method2372(1, false, 768, 34168);
    }

    @OriginalMember(owner = "client!nh", name = "EA", descriptor = "(IIII)V", line = 725)
    public final void method409(int arg0, int arg1, int arg2, int arg3) {
        field9624++;
        this.field9651 = arg2;
        this.field9650 = arg0;
        this.field9631 = arg3;
        this.field9633 = arg1;
        this.field9641 = this.field9650 != 0 || this.field9633 != 0 || this.field9651 != 0 || this.field9631 != 0;
    }

    @OriginalMember(owner = "client!nh", name = "QA", descriptor = "()I", line = 740)
    public final int method415() {
        field9646++;
        return this.field9625.field5148;
    }
}
