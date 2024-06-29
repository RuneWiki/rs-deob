import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class510 extends class52 {

    @OriginalMember(owner = "client!kq", name = "f", descriptor = "I")
    private int field7116 = 0;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "I")
    private int field7111 = 0;

    @OriginalMember(owner = "client!kq", name = "q", descriptor = "I")
    private int field7127 = 0;

    @OriginalMember(owner = "client!kq", name = "v", descriptor = "I")
    private int field7132 = 0;

    @OriginalMember(owner = "client!kq", name = "y", descriptor = "I")
    private int field7135 = 0;

    @OriginalMember(owner = "client!kq", name = "r", descriptor = "Z")
    private boolean field7128 = false;

    @OriginalMember(owner = "client!kq", name = "u", descriptor = "Lgi;")
    private class583 field7131;

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "Les;")
    private class320 field7113;

    @OriginalMember(owner = "client!kq", name = "x", descriptor = "S")
    public static short field7134 = 256;

    @OriginalMember(owner = "client!kq", name = "j", descriptor = "Lej;")
    public static class104 field7120 = new class104("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

    @OriginalMember(owner = "client!kq", name = "D", descriptor = "I")
    public static int field7140 = 0;

    @OriginalMember(owner = "client!kq", name = "F", descriptor = "I")
    public static int field7142 = 0;

    @OriginalMember(owner = "client!kq", name = "E", descriptor = "Lvaa;")
    public static class399 field7141 = new class399();

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "I")
    public static int field7112;

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "I")
    public static int field7114;

    @OriginalMember(owner = "client!kq", name = "e", descriptor = "I")
    public static int field7115;

    @OriginalMember(owner = "client!kq", name = "g", descriptor = "I")
    public static int field7117;

    @OriginalMember(owner = "client!kq", name = "h", descriptor = "I")
    public static int field7118;

    @OriginalMember(owner = "client!kq", name = "i", descriptor = "I")
    public static int field7119;

    @OriginalMember(owner = "client!kq", name = "l", descriptor = "I")
    public static int field7122;

    @OriginalMember(owner = "client!kq", name = "m", descriptor = "I")
    public static int field7123;

    @OriginalMember(owner = "client!kq", name = "n", descriptor = "I")
    public static int field7124;

    @OriginalMember(owner = "client!kq", name = "o", descriptor = "I")
    public static int field7125;

    @OriginalMember(owner = "client!kq", name = "p", descriptor = "I")
    public static int field7126;

    @OriginalMember(owner = "client!kq", name = "s", descriptor = "I")
    public static int field7129;

    @OriginalMember(owner = "client!kq", name = "t", descriptor = "I")
    public static int field7130;

    @OriginalMember(owner = "client!kq", name = "w", descriptor = "I")
    public static int field7133;

    @OriginalMember(owner = "client!kq", name = "z", descriptor = "I")
    public static int field7136;

    @OriginalMember(owner = "client!kq", name = "A", descriptor = "I")
    public static int field7137;

    @OriginalMember(owner = "client!kq", name = "B", descriptor = "I")
    public static int field7138;

    @OriginalMember(owner = "client!kq", name = "C", descriptor = "I")
    public static int field7139;

    @OriginalMember(owner = "client!kq", name = "k", descriptor = "Les;")
    private class320 field7121;

    @OriginalMember(owner = "client!kq", name = "G", descriptor = "Ljava/lang/String;")
    public static String field7143;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public static final boolean method2945(String arg0, byte arg1) {
        field7125++;
        int var2 = -10 % ((arg1 - 41) / 60);
        return class319.method1987(16, true, arg0, 10);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IILpa;II)V")
    public final void method431(int arg0, int arg1, class310 arg2, int arg3, int arg4) {
        field7119++;
        class401 var6 = (class401) arg2;
        class320 var7 = var6.field5716;
        this.field7113.method2513(false, false);
        this.field7131.method3386(16654);
        this.field7131.method3358(32886, this.field7113);
        this.field7131.method3396((byte) -2, 1);
        this.field7131.method3398(-71, 1);
        this.field7131.method3358(32886, var7);
        this.field7131.method3389(false, 7681, 8448);
        this.field7131.method3407(0, 768, -118, 34168);
        this.field7131.method3348(1, (byte) 65);
        int var8 = this.field7132 + arg1;
        int var9 = this.field7116 + arg0;
        int var10 = this.field7113.field4333 + var9;
        int var11 = this.field7113.field4336 + var8;
        float var12 = var7.field4329 / (float) var7.field4333;
        float var13 = var7.field4331 / (float) var7.field4336;
        float var14 = (float) (var9 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field4331 - (float) (var8 - arg4) * var13;
        float var17 = var7.field4331 - ((float) (var11 - arg4) * var13);
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field7113.field4331);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var9, var8);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var9, var8 + this.field7113.field4336);
        OpenGL.glMultiTexCoord2f(33984, this.field7113.field4329, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(var9 + this.field7113.field4333, var8 - -this.field7113.field4336);
        OpenGL.glMultiTexCoord2f(33984, this.field7113.field4329, this.field7113.field4331);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(this.field7113.field4333 + var9, var8);
        OpenGL.glEnd();
        this.field7131.method3407(0, 768, -125, 5890);
        this.field7131.method3396((byte) 114, 0);
        this.field7131.method3358(32886, null);
        this.field7131.method3398(-77, 0);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(B)V")
    public static final void method2946(byte arg0) {
        field7112++;
        int var1 = 0;
        if (class491.field6875.method1502(class103.field1570, 1)) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        if (!class491.field6875.field3361) {
            var1 |= 0x40;
        }
        class2.method12(4, var1);
        class18.field227.method1211(false, var1);
        class181.field2574.method872(0, var1);
        class516.field7253.method3268((byte) -121, var1);
        if (arg0 > -118) {
            method2945(null, (byte) -51);
        }
        class78.field1263.method1568(false, var1);
        class559.method3185(var1, 252);
        class147.method976(25765, var1);
        class346.method2086(-115, var1);
        class634.method3683(var1, (byte) -77);
        class173.method1093(3);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(FFFFFFLpa;II)V")
    public final void method428(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class310 arg6, int arg7, int arg8) {
        field7118++;
        class320 var10 = ((class401) arg6).field5716;
        if (this.field7128) {
            float var11 = (float) this.method419();
            float var12 = (float) this.method432();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field7132 * var15;
            float var18 = (float) this.field7132 * var16;
            float var19 = (float) this.field7116 * var13;
            float var20 = (float) this.field7116 * var14;
            float var21 = (float) this.field7111 * -var13;
            float var22 = (float) this.field7111 * -var14;
            float var23 = (float) this.field7127 * -var15;
            arg4 = arg4 + var19 + var23;
            float var24 = (float) this.field7127 * -var16;
            arg2 = arg2 + var21 + var17;
            arg1 = arg1 + var20 + var18;
            arg3 = arg3 + var22 + var18;
            arg0 = arg0 + var19 + var17;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        this.field7113.method2513(false, true);
        float var26 = arg5 + arg3 - arg1;
        this.field7131.method3386(16654);
        this.field7131.method3358(32886, this.field7113);
        this.field7131.method3396((byte) -128, 1);
        this.field7131.method3398(-61, 1);
        this.field7131.method3358(32886, var10);
        this.field7131.method3389(false, 7681, 8448);
        this.field7131.method3407(0, 768, -125, 34168);
        this.field7131.method3348(1, (byte) 36);
        float var27 = var10.field4329 / (float) var10.field4333;
        float var28 = var10.field4331 / (float) var10.field4336;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field7113.field4331);
        OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * var27, var10.field4331 - ((float) (-arg8) + arg1) * var28);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * var27, var10.field4331 - (((float) (-arg8) + arg5) * var28));
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field7113.field4329, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (var25 - (float) arg7) * var27, var10.field4331 - (var26 - (float) arg8) * var28);
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glMultiTexCoord2f(33984, this.field7113.field4329, this.field7113.field4331);
        OpenGL.glMultiTexCoord2f(33985, (arg2 - (float) arg7) * var27, var10.field4331 - ((float) (-arg8) + arg3) * var28);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field7131.method3407(0, 768, -118, 5890);
        this.field7131.method3396((byte) -123, 0);
        this.field7131.method3358(32886, null);
        this.field7131.method3398(-35, 0);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lr;IILnk;II)V")
    public static final void method2947(class157 arg0, int arg1, int arg2, class611 arg3, int arg4, int arg5) {
        field7130++;
        if (arg0 != null && arg2 == 0) {
            arg3.method3577((byte) 74, arg0.method148(), arg4, arg0.method150(), arg0.method151(), arg0.method139(), arg0.method135(), arg1, arg0.method133(), arg5, arg0.method128());
        }
    }

    @OriginalMember(owner = "client!kq", name = "BA", descriptor = "(III)V")
    public final void method502(int arg0, int arg1, int arg2) {
        OpenGL.glPixelTransferf(3348, 0.5F);
        field7136++;
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field7121 = class164.method1055(-21747, arg1, arg0, this.field7131, this.field7113.field4333, this.field7113.field4336);
        this.field7135 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!kq", name = "ra", descriptor = "(IIIIIII)V")
    public final void method423(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7129++;
        this.field7113.method2513(false, true);
        this.field7131.method3386(16654);
        this.field7131.method3348(arg6, (byte) 36);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field7128) {
            float var8 = (float) arg2 / (float) this.method419();
            float var9 = (float) arg3 / (float) this.method432();
            float var10 = (float) this.field7116 * var8 + (float) arg0;
            float var11 = (float) this.field7132 * var9 + (float) arg1;
            float var12 = (float) this.field7113.field4333 * var8 + var10;
            float var13 = (float) this.field7113.field4336 * var9 + var11;
            if (this.field7121 == null) {
                this.field7131.method3358(32886, this.field7113);
                this.field7131.method3396((byte) 110, arg4);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field7113.field4331);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glTexCoord2f(this.field7113.field4329, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glTexCoord2f(this.field7113.field4329, this.field7113.field4331);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
            } else {
                this.method2948(0, arg4);
                this.field7121.method2513(false, true);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field7113.field4331);
                OpenGL.glTexCoord2f(0.0F, this.field7113.field4331);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field7113.field4329, 0.0F);
                OpenGL.glTexCoord2f(this.field7113.field4329, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field7113.field4329, this.field7113.field4331);
                OpenGL.glTexCoord2f(this.field7113.field4329, this.field7113.field4331);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
                this.method2949(0);
            }
        } else if (this.field7121 == null) {
            this.field7131.method3358(32886, this.field7113);
            this.field7131.method3396((byte) 107, arg4);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field7113.field4331);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field7113.field4329, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field7113.field4329, this.field7113.field4331);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method2948(0, arg4);
            this.field7121.method2513(false, true);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field7113.field4331);
            OpenGL.glTexCoord2f(0.0F, this.field7113.field4331);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field7113.field4329, 0.0F);
            OpenGL.glTexCoord2f(this.field7113.field4329, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field7113.field4329, this.field7113.field4331);
            OpenGL.glTexCoord2f(this.field7113.field4329, this.field7113.field4331);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method2949(0);
        }
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(II)V")
    private final void method2948(int arg0, int arg1) {
        field7133++;
        this.field7131.method3398(-55, 1);
        this.field7131.method3358(arg0 ^ 0x8076, this.field7113);
        this.field7131.method3389(false, this.field7131.method3394(-5, arg1), 7681);
        this.field7131.method3407(1, 768, -127, 34167);
        this.field7131.method3340(770, 0, 34168, 1);
        this.field7131.method3398(arg0 - 31, arg0);
        this.field7131.method3358(arg0 ^ 0x8076, this.field7121);
        this.field7131.method3389(false, 34479, 7681);
        this.field7131.method3407(1, 768, -120, 34166);
        if (this.field7135 == 0) {
            this.field7131.method3360(0.5F, 1.0F, 0.0F, (byte) -125, 0.5F);
        } else if (this.field7135 == 1) {
            this.field7131.method3360(1.0F, 0.5F, 0.0F, (byte) -83, 0.5F);
        } else if (this.field7135 == 2) {
            this.field7131.method3360(0.5F, 0.5F, 0.0F, (byte) 70, 1.0F);
        } else if (this.field7135 == 3) {
            this.field7131.method3360(128.5F, 128.5F, 0.0F, (byte) -92, 128.5F);
            return;
        }
    }

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "()I")
    public final int method429() {
        field7139++;
        return this.field7113.field4333;
    }

    @OriginalMember(owner = "client!kq", name = "i", descriptor = "(IIIIIII)V")
    public final void method426(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7122++;
        int var8 = arg0 + arg2;
        int var9 = arg1 + arg3;
        this.field7113.method2513(false, false);
        this.field7131.method3386(16654);
        this.field7131.method3358(32886, this.field7113);
        this.field7131.method3348(arg6, (byte) 90);
        this.field7131.method3396((byte) -75, arg4);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field7113.field4328 && !this.field7128) {
            float var10 = (float) arg3 * this.field7113.field4331 / (float) this.field7113.field4336;
            float var11 = (float) arg2 * this.field7113.field4329 / (float) this.field7113.field4333;
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
        OpenGL.glTranslatef((float) this.field7116, (float) this.field7132, 0.0F);
        int var12 = this.method419();
        int var13 = this.method432();
        int var14 = this.field7113.field4336 + arg1;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var14 <= var9) {
            int var20 = this.field7113.field4333 + arg0;
            int var21 = arg0;
            while (var20 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field7113.field4331);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field7113.field4329, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field7113.field4329, this.field7113.field4331);
                OpenGL.glVertex2i(var20, var15);
                var21 += var12;
                var20 += var12;
            }
            if (var8 > var21) {
                float var22 = (float) (var8 - var21) * this.field7113.field4329 / (float) this.field7113.field4333;
                OpenGL.glTexCoord2f(0.0F, this.field7113.field4331);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field7113.field4331);
                OpenGL.glVertex2i(var8, var15);
            }
            var15 += var13;
            var14 += var13;
        }
        if (var15 < var9) {
            float var16 = (float) (var15 - (var9 - this.field7113.field4336)) * this.field7113.field4331 / (float) this.field7113.field4336;
            int var17 = this.field7113.field4333 + arg0;
            int var18 = arg0;
            while (var8 >= var17) {
                OpenGL.glTexCoord2f(0.0F, this.field7113.field4331);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field7113.field4329, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field7113.field4329, this.field7113.field4331);
                OpenGL.glVertex2i(var17, var15);
                var17 += var12;
                var18 += var12;
            }
            if (var8 > var18) {
                float var19 = (float) (var8 - var18) * this.field7113.field4329 / (float) this.field7113.field4333;
                OpenGL.glTexCoord2f(0.0F, this.field7113.field4331);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field7113.field4331);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!kq", name = "DA", descriptor = "(IIIII)V")
    public final void method421(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7137++;
        this.field7113.method2513(false, false);
        this.field7131.method3386(16654);
        this.field7131.method3348(arg4, (byte) 57);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field7116 + arg0;
        int var7 = this.field7132 + arg1;
        if (this.field7121 == null) {
            this.field7131.method3358(32886, this.field7113);
            this.field7131.method3396((byte) 9, arg2);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field7113.field4331);
            OpenGL.glVertex2i(var6, var7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var6, this.field7113.field4336 + var7);
            OpenGL.glTexCoord2f(this.field7113.field4329, 0.0F);
            OpenGL.glVertex2i(this.field7113.field4333 + var6, this.field7113.field4336 + var7);
            OpenGL.glTexCoord2f(this.field7113.field4329, this.field7113.field4331);
            OpenGL.glVertex2i(this.field7113.field4333 + var6, var7);
            OpenGL.glEnd();
            return;
        }
        this.method2948(0, arg2);
        this.field7121.method2513(false, false);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field7113.field4331);
        OpenGL.glTexCoord2f(0.0F, this.field7113.field4331);
        OpenGL.glVertex2i(var6, var7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var6, this.field7113.field4336 + var7);
        OpenGL.glMultiTexCoord2f(33985, this.field7113.field4329, 0.0F);
        OpenGL.glTexCoord2f(this.field7113.field4329, 0.0F);
        OpenGL.glVertex2i(var6 + this.field7113.field4333, this.field7113.field4336 + var7);
        OpenGL.glMultiTexCoord2f(33985, this.field7113.field4329, this.field7113.field4331);
        OpenGL.glTexCoord2f(this.field7113.field4329, this.field7113.field4331);
        OpenGL.glVertex2i(var6 + this.field7113.field4333, var7);
        OpenGL.glEnd();
        this.method2949(0);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)V")
    private final void method2949(int arg0) {
        field7123++;
        this.field7131.method3398(-54, 1);
        this.field7131.method3358(32886, null);
        this.field7131.method3389(false, 8448, 8448);
        this.field7131.method3407(1, 768, -121, 34168);
        this.field7131.method3340(770, 0, 5890, 1);
        this.field7131.method3398(-91, arg0);
        this.field7131.method3407(1, 768, -126, 34168);
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(B)V")
    public static void method2950(byte arg0) {
        field7143 = null;
        field7120 = null;
        field7141 = null;
        int var1 = 14 / ((arg0 - 85) / 33);
    }

    @OriginalMember(owner = "client!kq", name = "CA", descriptor = "(FFFFFFIII)V")
    public final void method424(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        field7138++;
        if (this.field7128) {
            float var10 = (float) this.method419();
            float var11 = (float) this.method432();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field7132 * var14;
            float var17 = (float) this.field7132 * var15;
            float var18 = (float) this.field7116 * var12;
            float var19 = (float) this.field7116 * var13;
            float var20 = (float) this.field7111 * -var12;
            float var21 = (float) this.field7111 * -var13;
            float var22 = (float) this.field7127 * -var14;
            arg1 = arg1 + var19 + var17;
            arg4 = arg4 + var18 + var22;
            arg2 = arg2 + var20 + var16;
            float var23 = (float) this.field7127 * -var15;
            arg0 = arg0 + var18 + var16;
            arg3 = arg3 + var21 + var17;
            arg5 = arg5 + var19 + var23;
        }
        float var24 = arg2 + arg4 - arg0;
        this.field7113.method2513(false, true);
        float var25 = arg5 + arg3 - arg1;
        this.field7131.method3386(16654);
        this.field7131.method3358(32886, this.field7113);
        this.field7131.method3348(arg8, (byte) 101);
        this.field7131.method3396((byte) 108, arg6);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field7113.field4331);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field7113.field4329, 0.0F);
        OpenGL.glVertex2f(var24, var25);
        OpenGL.glTexCoord2f(this.field7113.field4329, this.field7113.field4331);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!kq", name = "ma", descriptor = "()I")
    public final int method432() {
        field7115++;
        return this.field7113.field4336 + this.field7132 + this.field7127;
    }

    @OriginalMember(owner = "client!kq", name = "EA", descriptor = "()I")
    public final int method419() {
        field7126++;
        return this.field7113.field4333 + this.field7116 + this.field7111;
    }

    @OriginalMember(owner = "client!kq", name = "P", descriptor = "(IIIIII)V")
    public final void method494(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field7113.method3660(arg5, (byte) 37, arg3, arg4, arg1, arg0, arg2);
        field7117++;
    }

    @OriginalMember(owner = "client!kq", name = "KA", descriptor = "(IIII)V")
    public final void method420(int arg0, int arg1, int arg2, int arg3) {
        field7124++;
        this.field7127 = arg3;
        this.field7111 = arg2;
        this.field7132 = arg1;
        this.field7116 = arg0;
        this.field7128 = this.field7116 != 0 || this.field7132 != 0 || this.field7111 != 0 || this.field7127 != 0;
    }

    @OriginalMember(owner = "client!kq", name = "la", descriptor = "()I")
    public final int method422() {
        field7114++;
        return this.field7113.field4336;
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lgi;IIII)V")
    public class510(class583 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field7131 = arg0;
        this.field7113 = class164.method1055(-21747, arg2, arg1, arg0, arg3, arg4);
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lgi;II[III)V")
    public class510(class583 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field7131 = arg0;
        this.field7113 = class568.method3227(arg3, arg2, false, arg1, arg0, false);
    }
}
