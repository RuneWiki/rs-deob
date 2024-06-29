import jaggl.OpenGL;
import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class374 extends class702 {

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    private int field5559 = 0;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
    private int field5568 = 0;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "Z")
    private boolean field5565 = false;

    @OriginalMember(owner = "client!oh", name = "y", descriptor = "I")
    private int field5582 = 0;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    private int field5561 = 0;

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "I")
    private int field5573 = 0;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "Lus;")
    private class1 field5558;

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "Ldea;")
    public class225 field5577;

    @OriginalMember(owner = "client!oh", name = "u", descriptor = "F")
    public static float field5578;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public static int field5560;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
    public static int field5562;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
    public static int field5563;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
    public static int field5566;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "I")
    public static int field5567;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "I")
    public static int field5569;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "I")
    public static int field5570;

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "I")
    public static int field5571;

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "I")
    public static int field5572;

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "I")
    public static int field5574;

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "I")
    public static int field5575;

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "I")
    public static int field5576;

    @OriginalMember(owner = "client!oh", name = "v", descriptor = "I")
    public static int field5579;

    @OriginalMember(owner = "client!oh", name = "w", descriptor = "I")
    public static int field5580;

    @OriginalMember(owner = "client!oh", name = "x", descriptor = "I")
    public static int field5581;

    @OriginalMember(owner = "client!oh", name = "z", descriptor = "I")
    public static int field5583;

    @OriginalMember(owner = "client!oh", name = "A", descriptor = "I")
    public static int field5584;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "Ldea;")
    private class225 field5564;

    @OriginalMember(owner = "client!oh", name = "qa", descriptor = "(FFFFFFIIII)V")
    public final void method1790(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field5565) {
            float var11 = (float) this.method1784();
            float var12 = (float) this.method1789();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field5573 * var15;
            float var18 = (float) this.field5573 * var16;
            float var19 = (float) this.field5561 * var13;
            float var20 = (float) this.field5561 * var14;
            float var21 = (float) this.field5559 * -var13;
            float var22 = (float) this.field5559 * -var14;
            float var23 = (float) this.field5582 * -var15;
            arg4 = arg4 + var19 + var23;
            float var24 = (float) this.field5582 * -var16;
            arg1 = arg1 + var20 + var18;
            arg3 = arg3 + var22 + var18;
            arg2 = arg2 + var21 + var17;
            arg0 = arg0 + var19 + var17;
            arg5 = arg5 + var20 + var24;
        }
        field5560++;
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        this.field5577.method2939((arg9 & 0x1) != 0, (byte) -69);
        this.field5558.method136((byte) -128);
        this.field5558.method5(3845, this.field5577);
        this.field5558.method7(arg8, (byte) 76);
        this.field5558.method133(arg6, (byte) -121);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field5577.field3365);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field5577.field3371, 0.0F);
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glTexCoord2f(this.field5577.field3371, this.field5577.field3365);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!oh", name = "da", descriptor = "(IIIIII)V")
    public final void method1742(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5572++;
        this.field5577.method1969(arg3, arg4, arg5, 28126, arg1, arg2, arg0);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Throwable;)V")
    public static final void method2357(String arg0, int arg1, Throwable arg2) {
        field5566++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class239.method1585(arg2, (byte) -99);
            }
            if (arg0 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            class8.method265((byte) -102, var3);
            String var4 = class656.method3735("%3a", var3, ":", 1163);
            String var5 = class656.method3735("%40", var4, "@", 1163);
            String var6 = class656.method3735("%26", var5, "&", 1163);
            String var7 = class656.method3735("%23", var6, "#", 1163);
            if (arg1 >= 89 && class537.field7520 != null) {
                class456 var8 = class261.field3838.method397(new URL(class537.field7520.getCodeBase(), "clienterror.ws?c=" + class496.field7073 + "&u=" + class477.field6860 + "&v1=" + class17.field778 + "&v2=" + class17.field793 + "&e=" + var7), -66);
                while (var8.field6502 == 0) {
                    class185.method1354(1L, 10);
                }
                if (var8.field6502 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field6499;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IILua;II)V")
    public final void method1744(int arg0, int arg1, class619 arg2, int arg3, int arg4) {
        field5575++;
        class394 var6 = (class394) arg2;
        class225 var7 = var6.field5764;
        this.field5577.method2939(false, (byte) -69);
        this.field5558.method136((byte) 125);
        this.field5558.method5(3845, this.field5577);
        this.field5558.method133(1, (byte) -128);
        this.field5558.method125(1, 79);
        this.field5558.method5(3845, var7);
        this.field5558.method148(8448, 7681, (byte) -114);
        this.field5558.method10(0, 768, 34168, 34192);
        this.field5558.method7(1, (byte) 76);
        int var8 = this.field5573 + arg1;
        int var9 = this.field5561 + arg0;
        int var10 = var9 + this.field5577.field3370;
        int var11 = var8 + this.field5577.field3363;
        float var12 = var7.field3371 / (float) var7.field3370;
        float var13 = var7.field3365 / (float) var7.field3363;
        float var14 = (float) (var9 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field3365 - ((float) (var8 - arg4) * var13);
        float var17 = var7.field3365 - (float) (var11 - arg4) * var13;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field5577.field3365);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var9, var8);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var9, this.field5577.field3363 + var8);
        OpenGL.glMultiTexCoord2f(33984, this.field5577.field3371, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(this.field5577.field3370 + var9, this.field5577.field3363 + var8);
        OpenGL.glMultiTexCoord2f(33984, this.field5577.field3371, this.field5577.field3365);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(this.field5577.field3370 + var9, var8);
        OpenGL.glEnd();
        this.field5558.method10(0, 768, 5890, 34192);
        this.field5558.method133(0, (byte) -118);
        this.field5558.method5(3845, null);
        this.field5558.method125(0, -71);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BI)V")
    private final void method2358(byte arg0, int arg1) {
        field5581++;
        this.field5558.method125(1, -58);
        this.field5558.method5(3845, this.field5577);
        this.field5558.method148(7681, this.field5558.method110(arg1, true), (byte) -107);
        int var3 = -66 / ((arg0 + 1) / 32);
        this.field5558.method10(1, 768, 34167, 34192);
        this.field5558.method135((byte) -96, 34168, 0, 770);
        this.field5558.method125(0, -83);
        this.field5558.method5(3845, this.field5564);
        this.field5558.method148(7681, 34479, (byte) -105);
        this.field5558.method10(1, 768, 34166, 34192);
        if (this.field5568 == 0) {
            this.field5558.method137(1.0F, 0.0F, 0, 0.5F, 0.5F);
        } else if (this.field5568 == 1) {
            this.field5558.method137(0.5F, 0.0F, 0, 1.0F, 0.5F);
        } else if (this.field5568 == 2) {
            this.field5558.method137(0.5F, 0.0F, 0, 0.5F, 1.0F);
            return;
        } else if (this.field5568 == 3) {
            this.field5558.method137(128.5F, 0.0F, 0, 128.5F, 128.5F);
            return;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(FFFFFFILua;II)V")
    public final void method1794(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class619 arg7, int arg8, int arg9) {
        field5584++;
        class225 var11 = ((class394) arg7).field5764;
        if (this.field5565) {
            float var12 = (float) this.method1784();
            float var13 = (float) this.method1789();
            float var14 = (arg2 - arg0) / var12;
            float var15 = (arg3 - arg1) / var12;
            float var16 = (arg4 - arg0) / var13;
            float var17 = (arg5 - arg1) / var13;
            float var18 = (float) this.field5573 * var16;
            float var19 = (float) this.field5573 * var17;
            float var20 = (float) this.field5561 * var14;
            float var21 = (float) this.field5561 * var15;
            float var22 = (float) this.field5559 * -var14;
            float var23 = (float) this.field5559 * -var15;
            float var24 = (float) this.field5582 * -var16;
            arg1 = arg1 + var21 + var19;
            float var25 = (float) this.field5582 * -var17;
            arg4 = arg4 + var20 + var24;
            arg0 = arg0 + var20 + var18;
            arg2 = arg2 + var22 + var18;
            arg3 = arg3 + var23 + var19;
            arg5 = arg5 + var21 + var25;
        }
        float var26 = arg2 + arg4 - arg0;
        this.field5577.method2939((arg6 & 0x1) != 0, (byte) -69);
        float var27 = arg5 + arg3 - arg1;
        this.field5558.method136((byte) 127);
        this.field5558.method5(3845, this.field5577);
        this.field5558.method133(1, (byte) -126);
        this.field5558.method125(1, -45);
        this.field5558.method5(3845, var11);
        this.field5558.method148(8448, 7681, (byte) -126);
        this.field5558.method10(0, 768, 34168, 34192);
        this.field5558.method7(1, (byte) 76);
        float var28 = var11.field3371 / (float) var11.field3370;
        float var29 = var11.field3365 / (float) var11.field3363;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field5577.field3365);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + arg0) * var28, var11.field3365 - ((arg1 - (float) arg9) * var29));
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + arg4) * var28, var11.field3365 - (arg5 - (float) arg9) * var29);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field5577.field3371, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (var26 - (float) arg8) * var28, var11.field3365 - (((float) (-arg9) + var27) * var29));
        OpenGL.glVertex2f(var26, var27);
        OpenGL.glMultiTexCoord2f(33984, this.field5577.field3371, this.field5577.field3365);
        OpenGL.glMultiTexCoord2f(33985, (arg2 - (float) arg8) * var28, var11.field3365 - ((arg3 - (float) arg9) * var29));
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field5558.method10(0, 768, 5890, 34192);
        this.field5558.method133(0, (byte) -125);
        this.field5558.method5(3845, null);
        this.field5558.method125(0, 99);
    }

    @OriginalMember(owner = "client!oh", name = "ca", descriptor = "()I")
    public final int method1789() {
        field5562++;
        return this.field5577.field3363 + this.field5573 + this.field5582;
    }

    @OriginalMember(owner = "client!oh", name = "DA", descriptor = "(IIIIIII)V")
    public final void method1788(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5576++;
        int var8 = arg0 + arg2;
        int var9 = arg1 + arg3;
        this.field5577.method2939(false, (byte) -69);
        this.field5558.method136((byte) -67);
        this.field5558.method5(3845, this.field5577);
        this.field5558.method7(arg6, (byte) 76);
        this.field5558.method133(arg4, (byte) -124);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field5577.field3366 && !this.field5565) {
            float var10 = (float) arg3 * this.field5577.field3365 / (float) this.field5577.field3363;
            float var11 = (float) arg2 * this.field5577.field3371 / (float) this.field5577.field3370;
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
        OpenGL.glTranslatef((float) this.field5561, (float) this.field5573, 0.0F);
        int var12 = this.method1784();
        int var13 = this.method1789();
        int var14 = this.field5577.field3363 + arg1;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var14 <= var9) {
            int var20 = this.field5577.field3370 + arg0;
            int var21 = arg0;
            while (var20 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field5577.field3365);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field5577.field3371, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field5577.field3371, this.field5577.field3365);
                OpenGL.glVertex2i(var20, var15);
                var20 += var12;
                var21 += var12;
            }
            if (var21 < var8) {
                float var22 = (float) (var8 - var21) * this.field5577.field3371 / (float) this.field5577.field3370;
                OpenGL.glTexCoord2f(0.0F, this.field5577.field3365);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field5577.field3365);
                OpenGL.glVertex2i(var8, var15);
            }
            var15 += var13;
            var14 += var13;
        }
        if (var9 > var15) {
            float var16 = (float) (var15 + this.field5577.field3363 - var9) * this.field5577.field3365 / (float) this.field5577.field3363;
            int var17 = this.field5577.field3370 + arg0;
            int var18 = arg0;
            while (var17 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field5577.field3365);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field5577.field3371, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field5577.field3371, this.field5577.field3365);
                OpenGL.glVertex2i(var17, var15);
                var17 += var12;
                var18 += var12;
            }
            if (var18 < var8) {
                float var19 = (float) (var8 - var18) * this.field5577.field3371 / (float) this.field5577.field3370;
                OpenGL.glTexCoord2f(0.0F, this.field5577.field3365);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field5577.field3365);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!oh", name = "V", descriptor = "(IIIII)V")
    public final void method1743(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5577.method2939(false, (byte) -69);
        field5583++;
        this.field5558.method136((byte) -28);
        this.field5558.method7(arg4, (byte) 76);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field5573 + arg1;
        int var7 = this.field5561 + arg0;
        if (this.field5564 == null) {
            this.field5558.method5(3845, this.field5577);
            this.field5558.method133(arg2, (byte) -124);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field5577.field3365);
            OpenGL.glVertex2i(var7, var6);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var7, var6 + this.field5577.field3363);
            OpenGL.glTexCoord2f(this.field5577.field3371, 0.0F);
            OpenGL.glVertex2i(this.field5577.field3370 + var7, this.field5577.field3363 + var6);
            OpenGL.glTexCoord2f(this.field5577.field3371, this.field5577.field3365);
            OpenGL.glVertex2i(this.field5577.field3370 + var7, var6);
            OpenGL.glEnd();
            return;
        }
        this.method2358((byte) 34, arg2);
        this.field5564.method2939(false, (byte) -69);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field5577.field3365);
        OpenGL.glTexCoord2f(0.0F, this.field5577.field3365);
        OpenGL.glVertex2i(var7, var6);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var7, this.field5577.field3363 + var6);
        OpenGL.glMultiTexCoord2f(33985, this.field5577.field3371, 0.0F);
        OpenGL.glTexCoord2f(this.field5577.field3371, 0.0F);
        OpenGL.glVertex2i(this.field5577.field3370 + var7, var6 - -this.field5577.field3363);
        OpenGL.glMultiTexCoord2f(33985, this.field5577.field3371, this.field5577.field3365);
        OpenGL.glTexCoord2f(this.field5577.field3371, this.field5577.field3365);
        OpenGL.glVertex2i(this.field5577.field3370 + var7, var6);
        OpenGL.glEnd();
        this.method2359(1);
    }

    @OriginalMember(owner = "client!oh", name = "u", descriptor = "()I")
    public final int method1785() {
        field5579++;
        return this.field5577.field3363;
    }

    @OriginalMember(owner = "client!oh", name = "YA", descriptor = "(IIIIIIII)V")
    public final void method1740(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5570++;
        this.field5577.method2939((arg7 & 0x1) != 0, (byte) -69);
        this.field5558.method136((byte) -1);
        this.field5558.method7(arg6, (byte) 76);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field5565) {
            float var9 = (float) arg2 / (float) this.method1784();
            float var10 = (float) arg3 / (float) this.method1789();
            float var11 = (float) this.field5561 * var9 + (float) arg0;
            float var12 = (float) this.field5573 * var10 + (float) arg1;
            float var13 = (float) this.field5577.field3370 * var9 + var11;
            float var14 = (float) this.field5577.field3363 * var10 + var12;
            if (this.field5564 == null) {
                this.field5558.method5(3845, this.field5577);
                this.field5558.method133(arg4, (byte) -120);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field5577.field3365);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glTexCoord2f(this.field5577.field3371, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glTexCoord2f(this.field5577.field3371, this.field5577.field3365);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
            } else {
                this.method2358((byte) 39, arg4);
                this.field5564.method2939(true, (byte) -69);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field5577.field3365);
                OpenGL.glTexCoord2f(0.0F, this.field5577.field3365);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field5577.field3371, 0.0F);
                OpenGL.glTexCoord2f(this.field5577.field3371, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field5577.field3371, this.field5577.field3365);
                OpenGL.glTexCoord2f(this.field5577.field3371, this.field5577.field3365);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
                this.method2359(1);
            }
        } else if (this.field5564 == null) {
            this.field5558.method5(3845, this.field5577);
            this.field5558.method133(arg4, (byte) -120);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field5577.field3365);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field5577.field3371, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 - -arg3);
            OpenGL.glTexCoord2f(this.field5577.field3371, this.field5577.field3365);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method2358((byte) -56, arg4);
            this.field5564.method2939(true, (byte) -69);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field5577.field3365);
            OpenGL.glTexCoord2f(0.0F, this.field5577.field3365);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field5577.field3371, 0.0F);
            OpenGL.glTexCoord2f(this.field5577.field3371, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field5577.field3371, this.field5577.field3365);
            OpenGL.glTexCoord2f(this.field5577.field3371, this.field5577.field3365);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method2359(1);
        }
    }

    @OriginalMember(owner = "client!oh", name = "E", descriptor = "()I")
    public final int method1792() {
        field5574++;
        return this.field5577.field3370;
    }

    @OriginalMember(owner = "client!oh", name = "A", descriptor = "()I")
    public final int method1784() {
        field5571++;
        return this.field5577.field3370 + this.field5561 + this.field5559;
    }

    @OriginalMember(owner = "client!oh", name = "xa", descriptor = "(III)V")
    public final void method1746(int arg0, int arg1, int arg2) {
        OpenGL.glPixelTransferf(3348, 0.5F);
        field5563++;
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field5564 = class406.method2473(this.field5577.field3370, -116, arg0, this.field5577.field3363, this.field5558, arg1);
        this.field5568 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
    private final void method2359(int arg0) {
        field5567++;
        this.field5558.method125(1, -63);
        this.field5558.method5(arg0 + 3844, null);
        this.field5558.method148(8448, 8448, (byte) -118);
        this.field5558.method10(arg0, 768, 34168, 34192);
        this.field5558.method135((byte) -87, 5890, 0, 770);
        this.field5558.method125(0, -59);
        this.field5558.method10(1, 768, 34168, arg0 ^ 0x8591);
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lus;IIZ)V")
    public class374(class1 arg0, int arg1, int arg2, boolean arg3) {
        this.field5558 = arg0;
        this.field5577 = class699.method3906(arg1, arg2, 34037, arg0, arg3 ? 6408 : 6407);
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lus;IIII)V")
    public class374(class1 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5558 = arg0;
        this.field5577 = class406.method2473(arg3, -92, arg1, arg4, arg0, arg2);
    }

    @OriginalMember(owner = "client!oh", name = "Q", descriptor = "(IIII)V")
    public final void method1787(int arg0, int arg1, int arg2, int arg3) {
        field5580++;
        this.field5561 = arg0;
        this.field5573 = arg1;
        this.field5559 = arg2;
        this.field5582 = arg3;
        this.field5565 = this.field5561 != 0 || this.field5573 != 0 || this.field5559 != 0 || this.field5582 != 0;
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lus;II[III)V")
    public class374(class1 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field5558 = arg0;
        this.field5577 = class656.method3731(false, arg3, 34037, arg2, arg0, arg1);
    }
}
