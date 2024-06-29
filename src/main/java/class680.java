import jaggl.OpenGL;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class680 extends class318 {

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "I")
    private int field9501 = 0;

    @OriginalMember(owner = "client!rp", name = "s", descriptor = "I")
    private int field9518 = 0;

    @OriginalMember(owner = "client!rp", name = "y", descriptor = "I")
    private int field9524 = 0;

    @OriginalMember(owner = "client!rp", name = "i", descriptor = "Z")
    private boolean field9508 = false;

    @OriginalMember(owner = "client!rp", name = "n", descriptor = "I")
    private int field9513 = 0;

    @OriginalMember(owner = "client!rp", name = "z", descriptor = "I")
    private int field9525 = 0;

    @OriginalMember(owner = "client!rp", name = "w", descriptor = "Lpq;")
    private class194 field9522;

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "Liq;")
    private class227 field9504;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "I")
    public static int field9500;

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "I")
    public static int field9502;

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "I")
    public static int field9503;

    @OriginalMember(owner = "client!rp", name = "f", descriptor = "I")
    public static int field9505;

    @OriginalMember(owner = "client!rp", name = "g", descriptor = "I")
    public static int field9506;

    @OriginalMember(owner = "client!rp", name = "h", descriptor = "I")
    public static int field9507;

    @OriginalMember(owner = "client!rp", name = "j", descriptor = "I")
    public static int field9509;

    @OriginalMember(owner = "client!rp", name = "k", descriptor = "I")
    public static int field9510;

    @OriginalMember(owner = "client!rp", name = "l", descriptor = "I")
    public static int field9511;

    @OriginalMember(owner = "client!rp", name = "m", descriptor = "I")
    public static int field9512;

    @OriginalMember(owner = "client!rp", name = "o", descriptor = "I")
    public static int field9514;

    @OriginalMember(owner = "client!rp", name = "p", descriptor = "I")
    public static int field9515;

    @OriginalMember(owner = "client!rp", name = "q", descriptor = "I")
    public static int field9516;

    @OriginalMember(owner = "client!rp", name = "r", descriptor = "I")
    public static int field9517;

    @OriginalMember(owner = "client!rp", name = "t", descriptor = "I")
    public static int field9519;

    @OriginalMember(owner = "client!rp", name = "u", descriptor = "I")
    public static int field9520;

    @OriginalMember(owner = "client!rp", name = "v", descriptor = "I")
    public static int field9521;

    @OriginalMember(owner = "client!rp", name = "x", descriptor = "I")
    public static int field9523;

    @OriginalMember(owner = "client!rp", name = "A", descriptor = "I")
    public static int field9526;

    @OriginalMember(owner = "client!rp", name = "B", descriptor = "Liq;")
    private class227 field9527;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(FFFFFFILaa;II)V", line = 3)
    public final void method745(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class87 arg7, int arg8, int arg9) {
        field9512++;
        class227 var11 = ((class339) arg7).field4913;
        if (this.field9508) {
            float var12 = (float) this.method749();
            float var13 = (float) this.method736();
            float var14 = (arg2 - arg0) / var12;
            float var15 = (arg3 - arg1) / var12;
            float var16 = (arg4 - arg0) / var13;
            float var17 = (arg5 - arg1) / var13;
            float var18 = (float) this.field9525 * var16;
            float var19 = (float) this.field9525 * var17;
            float var20 = (float) this.field9513 * var14;
            float var21 = (float) this.field9513 * var15;
            float var22 = (float) this.field9518 * -var14;
            float var23 = (float) this.field9518 * -var15;
            float var24 = (float) this.field9524 * -var16;
            arg1 = arg1 + var21 + var19;
            arg3 = arg3 + var23 + var19;
            arg4 = arg4 + var20 + var24;
            arg2 = arg2 + var22 + var18;
            arg0 = arg0 + var20 + var18;
            float var25 = (float) this.field9524 * -var17;
            arg5 = arg5 + var21 + var25;
        }
        float var26 = arg2 + arg4 - arg0;
        this.field9504.method3201(true, (arg6 & 0x1) != 0);
        float var27 = arg5 + arg3 - arg1;
        this.field9522.method1227(0);
        this.field9522.method1219((byte) 83, this.field9504);
        this.field9522.method1263(1, 100);
        this.field9522.method1262(1, 0);
        this.field9522.method1219((byte) 117, var11);
        this.field9522.method1230(8448, 7681, false);
        this.field9522.method1223(0, 57, 768, 34168);
        this.field9522.method1241(1, (byte) 124);
        float var28 = var11.field3440 / (float) var11.field3437;
        float var29 = var11.field3441 / (float) var11.field3442;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field9504.field3441);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + arg0) * var28, var11.field3441 - ((arg1 - (float) arg9) * var29));
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + arg4) * var28, var11.field3441 - (((float) (-arg9) + arg5) * var29));
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field9504.field3440, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + var26) * var28, var11.field3441 - ((float) (-arg9) + var27) * var29);
        OpenGL.glVertex2f(var26, var27);
        OpenGL.glMultiTexCoord2f(33984, this.field9504.field3440, this.field9504.field3441);
        OpenGL.glMultiTexCoord2f(33985, (arg2 - (float) arg8) * var28, var11.field3441 - (((float) (-arg9) + arg3) * var29));
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field9522.method1223(0, 76, 768, 5890);
        this.field9522.method1263(0, 103);
        this.field9522.method1219((byte) 94, null);
        this.field9522.method1262(0, 0);
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(IIIIIII)V", line = 91)
    public final void method748(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field9509++;
        int var8 = arg0 + arg2;
        this.field9504.method3201(true, false);
        int var9 = arg1 + arg3;
        this.field9522.method1227(0);
        this.field9522.method1219((byte) 85, this.field9504);
        this.field9522.method1241(arg6, (byte) 124);
        this.field9522.method1263(arg4, 112);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field9504.field3439 && !this.field9508) {
            float var10 = (float) arg3 * this.field9504.field3441 / (float) this.field9504.field3442;
            float var11 = (float) arg2 * this.field9504.field3440 / (float) this.field9504.field3437;
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
        OpenGL.glTranslatef((float) this.field9513, (float) this.field9525, 0.0F);
        int var12 = this.method749();
        int var13 = this.method736();
        int var14 = this.field9504.field3442 + arg1;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var9 >= var14) {
            int var20 = this.field9504.field3437 + arg0;
            int var21 = arg0;
            while (var20 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field9504.field3441);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field9504.field3440, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field9504.field3440, this.field9504.field3441);
                OpenGL.glVertex2i(var20, var15);
                var20 += var12;
                var21 += var12;
            }
            if (var8 > var21) {
                float var22 = (float) (var8 - var21) * this.field9504.field3440 / (float) this.field9504.field3437;
                OpenGL.glTexCoord2f(0.0F, this.field9504.field3441);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field9504.field3441);
                OpenGL.glVertex2i(var8, var15);
            }
            var15 += var13;
            var14 += var13;
        }
        if (var9 > var15) {
            float var16 = (float) (this.field9504.field3442 - (var9 - var15)) * this.field9504.field3441 / (float) this.field9504.field3442;
            int var17 = this.field9504.field3437 + arg0;
            int var18 = arg0;
            while (var17 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field9504.field3441);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field9504.field3440, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field9504.field3440, this.field9504.field3441);
                OpenGL.glVertex2i(var17, var15);
                var17 += var12;
                var18 += var12;
            }
            if (var18 < var8) {
                float var19 = (float) (var8 - var18) * this.field9504.field3440 / (float) this.field9504.field3437;
                OpenGL.glTexCoord2f(0.0F, this.field9504.field3441);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field9504.field3441);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "([I)V", line = 228)
    public final void method744(int[] arg0) {
        arg0[3] = this.field9524;
        arg0[0] = this.field9513;
        arg0[1] = this.field9525;
        arg0[2] = this.field9518;
        field9503++;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "()I", line = 240)
    public final int method738() {
        field9511++;
        return this.field9504.field3442;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ljava/awt/Color;Ljava/lang/String;BLjava/awt/Color;ILjava/awt/Color;)V", line = 249)
    public static final void method3865(Color arg0, String arg1, byte arg2, Color arg3, int arg4, Color arg5) {
        try {
            Graphics var6 = class749.field10341.getGraphics();
            if (class153.field2003 == null) {
                class153.field2003 = new Font("Helvetica", 1, 13);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            if (arg5 == null) {
                arg5 = new Color(255, 255, 255);
            }
            try {
                if (class58.field674 == null) {
                    class58.field674 = class749.field10341.createImage(class742.field10226, class249.field3700);
                }
                Graphics var7 = class58.field674.getGraphics();
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class742.field10226, class249.field3700);
                int var8 = class742.field10226 / 2 - 152;
                if (arg2 < 81) {
                    method3865(null, null, (byte) 44, null, -17, null);
                }
                int var9 = class249.field3700 / 2 - 18;
                var7.setColor(arg0);
                var7.drawRect(var8, var9, 303, 33);
                var7.setColor(arg3);
                var7.fillRect(var8 + 2, var9 - -2, arg4 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var8 + 1, var9 + 1, 301, 31);
                var7.fillRect(arg4 * 3 + var8 + 2, var9 + 2, 300 - arg4 * 3, 30);
                var7.setFont(class153.field2003);
                var7.setColor(arg5);
                var7.drawString(arg1, var8 + ((304 - (arg1.length() * 6)) / 2), var9 - -22);
                if (class32.field305 != null) {
                    var7.setFont(class153.field2003);
                    var7.setColor(arg5);
                    var7.drawString(class32.field305, class742.field10226 / 2 - (class32.field305.length() * 6 / 2), class249.field3700 / 2 - 26);
                }
                var6.drawImage(class58.field674, 0, 0, null);
            } catch (Exception var12) {
                var6.setColor(Color.black);
                var6.fillRect(0, 0, class742.field10226, class249.field3700);
                int var10 = class742.field10226 / 2 - 152;
                int var11 = class249.field3700 / 2 - 18;
                var6.setColor(arg0);
                var6.drawRect(var10, var11, 303, 33);
                var6.setColor(arg3);
                var6.fillRect(var10 + 2, var11 + 2, arg4 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(var10 + 1, var11 - -1, 301, 31);
                var6.fillRect(var10 + (arg4 * 3) + 2, var11 - -2, 300 - (arg4 * 3), 30);
                var6.setFont(class153.field2003);
                var6.setColor(arg5);
                if (class32.field305 != null) {
                    var6.setFont(class153.field2003);
                    var6.setColor(arg5);
                    var6.drawString(class32.field305, class742.field10226 / 2 - (class32.field305.length() * 6 / 2), class249.field3700 / 2 + -26);
                }
                var6.drawString(arg1, (304 - arg1.length() * 6) / 2 + var10, var11 + 22);
            }
        } catch (Exception var13) {
            class749.field10341.repaint();
        }
        field9515++;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(B)V", line = 341)
    private final void method3866(byte arg0) {
        field9502++;
        this.field9522.method1262(1, 0);
        this.field9522.method1219((byte) 97, null);
        this.field9522.method1230(8448, 8448, false);
        this.field9522.method1223(1, 109, 768, 34168);
        this.field9522.method1220(5890, 770, 34200, 0);
        this.field9522.method1262(0, 0);
        this.field9522.method1223(1, 117, 768, 34168);
        if (arg0 < 48) {
            this.method745(-1.5253167F, -0.3588791F, -0.42630878F, -0.031235665F, -2.0421581F, 2.9240453F, 107, null, 42, 4);
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(III)V", line = 360)
    public final void method992(int arg0, int arg1, int arg2) {
        OpenGL.glPixelTransferf(3348, 0.5F);
        field9507++;
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field9527 = class540.method3211(-110, this.field9504.field3437, this.field9522, this.field9504.field3442, arg0, arg1);
        this.field9501 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Lpq;IIZ)V", line = 815)
    public class680(class194 arg0, int arg1, int arg2, boolean arg3) {
        this.field9522 = arg0;
        this.field9504 = class246.method1656(arg0, arg2, arg1, 34037, arg3 ? 6408 : 6407);
    }

    @OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Lpq;IIII)V", line = 825)
    public class680(class194 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field9522 = arg0;
        this.field9504 = class540.method3211(-124, arg3, arg0, arg4, arg1, arg2);
    }

    @OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Lpq;II[III)V", line = 835)
    public class680(class194 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field9522 = arg0;
        this.field9504 = class394.method2432(arg3, arg1, arg5, arg0, -7072, arg4, arg2, false);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(FFFFFFIIII)V", line = 390)
    public final void method742(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field9508) {
            float var11 = (float) this.method749();
            float var12 = (float) this.method736();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field9525 * var15;
            float var18 = (float) this.field9525 * var16;
            float var19 = (float) this.field9513 * var13;
            float var20 = (float) this.field9513 * var14;
            float var21 = (float) this.field9518 * -var13;
            float var22 = (float) this.field9518 * -var14;
            float var23 = (float) this.field9524 * -var15;
            arg0 = arg0 + var19 + var17;
            float var24 = (float) this.field9524 * -var16;
            arg4 = arg4 + var19 + var23;
            arg1 = arg1 + var20 + var18;
            arg3 = arg3 + var22 + var18;
            arg2 = arg2 + var21 + var17;
            arg5 = arg5 + var20 + var24;
        }
        field9517++;
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        this.field9504.method3201(true, (arg9 & 0x1) != 0);
        this.field9522.method1227(0);
        this.field9522.method1219((byte) 101, this.field9504);
        this.field9522.method1241(arg8, (byte) 125);
        this.field9522.method1263(arg6, 104);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field9504.field3441);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field9504.field3440, 0.0F);
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glTexCoord2f(this.field9504.field3440, this.field9504.field3441);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "()I", line = 459)
    public final int method749() {
        field9505++;
        return this.field9504.field3437 + this.field9518 + this.field9513;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IB)V", line = 467)
    private final void method3867(int arg0, byte arg1) {
        field9519++;
        this.field9522.method1262(1, arg1 + 85);
        this.field9522.method1219((byte) 115, this.field9504);
        if (arg1 != -85) {
            this.field9524 = -23;
        }
        this.field9522.method1230(7681, this.field9522.method1250((byte) -123, arg0), false);
        this.field9522.method1223(1, 109, 768, 34167);
        this.field9522.method1220(34168, 770, 34200, 0);
        this.field9522.method1262(0, 0);
        this.field9522.method1219((byte) 107, this.field9527);
        this.field9522.method1230(7681, 34479, false);
        this.field9522.method1223(1, 68, 768, 34166);
        if (this.field9501 == 0) {
            this.field9522.method1206(1.0F, 0.5F, (byte) 122, 0.5F, 0.0F);
        } else if (this.field9501 == 1) {
            this.field9522.method1206(0.5F, 0.5F, (byte) 122, 1.0F, 0.0F);
        } else if (this.field9501 == 2) {
            this.field9522.method1206(0.5F, 1.0F, (byte) 122, 0.5F, 0.0F);
        } else if (this.field9501 == 3) {
            this.field9522.method1206(128.5F, 128.5F, (byte) 122, 128.5F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "()I", line = 501)
    public final int method737() {
        field9523++;
        return this.field9504.field3437;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IILaa;II)V", line = 516)
    public final void method747(int arg0, int arg1, class87 arg2, int arg3, int arg4) {
        field9520++;
        class339 var6 = (class339) arg2;
        class227 var7 = var6.field4913;
        this.field9504.method3201(true, false);
        this.field9522.method1227(0);
        this.field9522.method1219((byte) 118, this.field9504);
        this.field9522.method1263(1, 87);
        this.field9522.method1262(1, 0);
        this.field9522.method1219((byte) 104, var7);
        this.field9522.method1230(8448, 7681, false);
        this.field9522.method1223(0, 44, 768, 34168);
        this.field9522.method1241(1, (byte) 125);
        int var8 = this.field9525 + arg1;
        int var9 = this.field9513 + arg0;
        int var10 = var9 + this.field9504.field3437;
        int var11 = this.field9504.field3442 + var8;
        float var12 = var7.field3440 / (float) var7.field3437;
        float var13 = var7.field3441 / (float) var7.field3442;
        float var14 = (float) (var9 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field3441 - ((float) (var8 - arg4) * var13);
        float var17 = var7.field3441 - (float) (var11 - arg4) * var13;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field9504.field3441);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var9, var8);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var9, var8 + this.field9504.field3442);
        OpenGL.glMultiTexCoord2f(33984, this.field9504.field3440, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(this.field9504.field3437 + var9, this.field9504.field3442 + var8);
        OpenGL.glMultiTexCoord2f(33984, this.field9504.field3440, this.field9504.field3441);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(this.field9504.field3437 + var9, var8);
        OpenGL.glEnd();
        this.field9522.method1223(0, 102, 768, 5890);
        this.field9522.method1263(0, 92);
        this.field9522.method1219((byte) 87, null);
        this.field9522.method1262(0, 0);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIIIIII)V", line = 581)
    public final void method735(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field9510++;
        this.field9504.method3201(true, (arg7 & 0x1) != 0);
        this.field9522.method1227(0);
        this.field9522.method1241(arg6, (byte) 126);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field9508) {
            float var9 = (float) arg2 / (float) this.method749();
            float var10 = (float) arg3 / (float) this.method736();
            float var11 = (float) this.field9513 * var9 + (float) arg0;
            float var12 = (float) this.field9525 * var10 + (float) arg1;
            float var13 = (float) this.field9504.field3437 * var9 + var11;
            float var14 = (float) this.field9504.field3442 * var10 + var12;
            if (this.field9527 == null) {
                this.field9522.method1219((byte) 88, this.field9504);
                this.field9522.method1263(arg4, 101);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field9504.field3441);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glTexCoord2f(this.field9504.field3440, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glTexCoord2f(this.field9504.field3440, this.field9504.field3441);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
            } else {
                this.method3867(arg4, (byte) -85);
                this.field9527.method3201(true, true);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field9504.field3441);
                OpenGL.glTexCoord2f(0.0F, this.field9504.field3441);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field9504.field3440, 0.0F);
                OpenGL.glTexCoord2f(this.field9504.field3440, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field9504.field3440, this.field9504.field3441);
                OpenGL.glTexCoord2f(this.field9504.field3440, this.field9504.field3441);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
                this.method3866((byte) 49);
            }
        } else if (this.field9527 == null) {
            this.field9522.method1219((byte) 108, this.field9504);
            this.field9522.method1263(arg4, 114);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field9504.field3441);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field9504.field3440, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field9504.field3440, this.field9504.field3441);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method3867(arg4, (byte) -85);
            this.field9527.method3201(true, true);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field9504.field3441);
            OpenGL.glTexCoord2f(0.0F, this.field9504.field3441);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field9504.field3440, 0.0F);
            OpenGL.glTexCoord2f(this.field9504.field3440, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field9504.field3440, this.field9504.field3441);
            OpenGL.glTexCoord2f(this.field9504.field3440, this.field9504.field3441);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method3866((byte) 110);
        }
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(IIII)V", line = 685)
    public final void method741(int arg0, int arg1, int arg2, int arg3) {
        this.field9525 = arg1;
        this.field9518 = arg2;
        this.field9513 = arg0;
        field9514++;
        this.field9524 = arg3;
        this.field9508 = this.field9513 != 0 || this.field9525 != 0 || this.field9518 != 0 || this.field9524 != 0;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIII[III)V", line = 697)
    private final void method3868(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        field9521++;
        this.field9504.method2801(true, arg0, arg6, arg4, arg2, arg3, arg5, true, arg1);
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "()I", line = 708)
    public final int method736() {
        field9526++;
        return this.field9504.field3442 + this.field9525 + this.field9524;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIIII)V", line = 723)
    public final void method988(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field9516++;
        if (!this.field9522.field2712) {
            this.field9504.method2806(3314, arg1, arg4, arg3, arg0, arg2, arg5);
            return;
        }
        int[] var7 = this.field9522.method243(arg4, arg5, arg2, arg3);
        if (var7 == null) {
            return;
        }
        for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = class613.method3544(var7[var8], -16777216);
        }
        this.method3868(arg0, arg1, arg2, arg3, var7, 0, arg2);
        return;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIII)V", line = 762)
    public final void method746(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field9504.method3201(true, false);
        field9506++;
        this.field9522.method1227(0);
        this.field9522.method1241(arg4, (byte) 124);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field9513 + arg0;
        int var7 = this.field9525 + arg1;
        if (this.field9527 == null) {
            this.field9522.method1219((byte) 107, this.field9504);
            this.field9522.method1263(arg2, 111);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field9504.field3441);
            OpenGL.glVertex2i(var6, var7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var6, this.field9504.field3442 + var7);
            OpenGL.glTexCoord2f(this.field9504.field3440, 0.0F);
            OpenGL.glVertex2i(var6 + this.field9504.field3437, this.field9504.field3442 + var7);
            OpenGL.glTexCoord2f(this.field9504.field3440, this.field9504.field3441);
            OpenGL.glVertex2i(this.field9504.field3437 + var6, var7);
            OpenGL.glEnd();
            return;
        }
        this.method3867(arg2, (byte) -85);
        this.field9527.method3201(true, false);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field9504.field3441);
        OpenGL.glTexCoord2f(0.0F, this.field9504.field3441);
        OpenGL.glVertex2i(var6, var7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var6, var7 + this.field9504.field3442);
        OpenGL.glMultiTexCoord2f(33985, this.field9504.field3440, 0.0F);
        OpenGL.glTexCoord2f(this.field9504.field3440, 0.0F);
        OpenGL.glVertex2i(var6 + this.field9504.field3437, this.field9504.field3442 + var7);
        OpenGL.glMultiTexCoord2f(33985, this.field9504.field3440, this.field9504.field3441);
        OpenGL.glTexCoord2f(this.field9504.field3440, this.field9504.field3441);
        OpenGL.glVertex2i(this.field9504.field3437 + var6, var7);
        OpenGL.glEnd();
        this.method3866((byte) 71);
    }
}
