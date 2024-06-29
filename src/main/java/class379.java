import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class379 extends class529 {

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "Z")
    private boolean field5334 = false;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
    private int field5336 = 0;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "I")
    private int field5339 = 0;

    @OriginalMember(owner = "client!lb", name = "x", descriptor = "I")
    private int field5346 = 0;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    private int field5328 = 0;

    @OriginalMember(owner = "client!lb", name = "v", descriptor = "I")
    private int field5344 = 0;

    @OriginalMember(owner = "client!lb", name = "C", descriptor = "Lht;")
    private class410 field5351;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "Lcq;")
    private class325 field5326;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public static int field5329 = 0;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public static int field5323;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public static int field5324;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field5325;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public static int field5327;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public static int field5330;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public static int field5331;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public static int field5332;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    public static int field5333;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    public static int field5335;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
    public static int field5337;

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "I")
    public static int field5340;

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "I")
    public static int field5341;

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "I")
    public static int field5342;

    @OriginalMember(owner = "client!lb", name = "u", descriptor = "I")
    public static int field5343;

    @OriginalMember(owner = "client!lb", name = "w", descriptor = "I")
    public static int field5345;

    @OriginalMember(owner = "client!lb", name = "y", descriptor = "I")
    public static int field5347;

    @OriginalMember(owner = "client!lb", name = "z", descriptor = "I")
    public static int field5348;

    @OriginalMember(owner = "client!lb", name = "B", descriptor = "I")
    public static int field5350;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "Lcq;")
    private class325 field5338;

    @OriginalMember(owner = "client!lb", name = "A", descriptor = "[[[I")
    public static int[][][] field5349;

    @OriginalMember(owner = "client!lb", name = "M", descriptor = "(IIIIIII)V", line = 3)
    public final void method119(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field5326.method1132(true, (byte) 62);
        field5340++;
        this.field5351.method2423(8448);
        this.field5351.method2356((byte) -21, arg6);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field5334) {
            float var8 = (float) arg2 / (float) this.method126();
            float var9 = (float) arg3 / (float) this.method121();
            float var10 = (float) this.field5328 * var8 + (float) arg0;
            float var11 = (float) this.field5346 * var9 + (float) arg1;
            float var12 = (float) this.field5326.field4461 * var8 + var10;
            float var13 = (float) this.field5326.field4470 * var9 + var11;
            if (this.field5338 == null) {
                this.field5351.method2412((byte) 4, this.field5326);
                this.field5351.method2365(true, arg4);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field5326.field4466);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glTexCoord2f(this.field5326.field4467, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glTexCoord2f(this.field5326.field4467, this.field5326.field4466);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
            } else {
                this.method2184(123, arg4);
                this.field5338.method1132(true, (byte) 62);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field5326.field4466);
                OpenGL.glTexCoord2f(0.0F, this.field5326.field4466);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field5326.field4467, 0.0F);
                OpenGL.glTexCoord2f(this.field5326.field4467, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field5326.field4467, this.field5326.field4466);
                OpenGL.glTexCoord2f(this.field5326.field4467, this.field5326.field4466);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
                this.method2183((byte) -84);
            }
        } else if (this.field5338 == null) {
            this.field5351.method2412((byte) 4, this.field5326);
            this.field5351.method2365(true, arg4);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field5326.field4466);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field5326.field4467, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field5326.field4467, this.field5326.field4466);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method2184(100, arg4);
            this.field5338.method1132(true, (byte) 62);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field5326.field4466);
            OpenGL.glTexCoord2f(0.0F, this.field5326.field4466);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field5326.field4467, 0.0F);
            OpenGL.glTexCoord2f(this.field5326.field4467, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field5326.field4467, this.field5326.field4466);
            OpenGL.glTexCoord2f(this.field5326.field4467, this.field5326.field4466);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method2183((byte) -84);
        }
    }

    @OriginalMember(owner = "client!lb", name = "qa", descriptor = "()I", line = 107)
    public final int method129() {
        field5348++;
        return this.field5326.field4470;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V", line = 116)
    public static void method2182(byte arg0) {
        if (arg0 >= -33) {
            method2182((byte) -19);
        }
        field5349 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IILea;II)V", line = 129)
    public final void method122(int arg0, int arg1, class382 arg2, int arg3, int arg4) {
        field5350++;
        class482 var6 = (class482) arg2;
        class325 var7 = var6.field7073;
        this.field5326.method1132(false, (byte) 62);
        this.field5351.method2423(8448);
        this.field5351.method2412((byte) 4, this.field5326);
        this.field5351.method2365(true, 1);
        this.field5351.method2398(1, (byte) 20);
        this.field5351.method2412((byte) 4, var7);
        this.field5351.method2383(7681, 99, 8448);
        this.field5351.method2362(34168, (byte) 65, 768, 0);
        this.field5351.method2356((byte) -21, 1);
        int var8 = this.field5328 + arg0;
        int var9 = this.field5346 + arg1;
        int var10 = this.field5326.field4461 + var8;
        int var11 = var9 + this.field5326.field4470;
        float var12 = var7.field4467 / (float) var7.field4461;
        float var13 = var7.field4466 / (float) var7.field4470;
        float var14 = (float) (var8 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field4466 - (float) (var9 - arg4) * var13;
        float var17 = var7.field4466 - (float) (var11 - arg4) * var13;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field5326.field4466);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var8, var9);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var8, this.field5326.field4470 + var9);
        OpenGL.glMultiTexCoord2f(33984, this.field5326.field4467, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(var8 + this.field5326.field4461, this.field5326.field4470 + var9);
        OpenGL.glMultiTexCoord2f(33984, this.field5326.field4467, this.field5326.field4466);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(this.field5326.field4461 + var8, var9);
        OpenGL.glEnd();
        this.field5351.method2362(5890, (byte) 65, 768, 0);
        this.field5351.method2365(true, 0);
        this.field5351.method2412((byte) 4, null);
        this.field5351.method2398(0, (byte) 27);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(FFFFFFLea;II)V", line = 188)
    public final void method132(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class382 arg6, int arg7, int arg8) {
        field5342++;
        class325 var10 = ((class482) arg6).field7073;
        if (this.field5334) {
            float var11 = (float) this.method126();
            float var12 = (float) this.method121();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field5346 * var15;
            float var18 = (float) this.field5346 * var16;
            float var19 = (float) this.field5328 * var13;
            float var20 = (float) this.field5328 * var14;
            float var21 = (float) this.field5336 * -var13;
            float var22 = (float) this.field5336 * -var14;
            float var23 = (float) this.field5339 * -var15;
            float var24 = (float) this.field5339 * -var16;
            arg1 = arg1 + var20 + var18;
            arg4 = arg4 + var19 + var23;
            arg2 = arg2 + var21 + var17;
            arg3 = arg3 + var22 + var18;
            arg0 = arg0 + var19 + var17;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        this.field5326.method1132(true, (byte) 62);
        this.field5351.method2423(8448);
        this.field5351.method2412((byte) 4, this.field5326);
        this.field5351.method2365(true, 1);
        this.field5351.method2398(1, (byte) 107);
        this.field5351.method2412((byte) 4, var10);
        this.field5351.method2383(7681, 79, 8448);
        this.field5351.method2362(34168, (byte) 65, 768, 0);
        this.field5351.method2356((byte) -21, 1);
        float var27 = var10.field4467 / (float) var10.field4461;
        float var28 = var10.field4466 / (float) var10.field4470;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field5326.field4466);
        OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * var27, var10.field4466 - (arg1 - (float) arg8) * var28);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + arg4) * var27, var10.field4466 - (((float) (-arg8) + arg5) * var28));
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field5326.field4467, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (var25 - (float) arg7) * var27, var10.field4466 - (((float) (-arg8) + var26) * var28));
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glMultiTexCoord2f(33984, this.field5326.field4467, this.field5326.field4466);
        OpenGL.glMultiTexCoord2f(33985, (arg2 - (float) arg7) * var27, var10.field4466 - ((float) (-arg8) + arg3) * var28);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field5351.method2362(5890, (byte) 65, 768, 0);
        this.field5351.method2365(true, 0);
        this.field5351.method2412((byte) 4, null);
        this.field5351.method2398(0, (byte) 107);
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(B)V", line = 274)
    private final void method2183(byte arg0) {
        this.field5351.method2398(1, (byte) 5);
        field5325++;
        this.field5351.method2412((byte) 4, null);
        this.field5351.method2383(8448, 79, 8448);
        this.field5351.method2362(34168, (byte) 65, 768, 1);
        this.field5351.method2379(770, arg0, 5890, 0);
        this.field5351.method2398(0, (byte) -90);
        this.field5351.method2362(34168, (byte) 65, 768, 1);
    }

    @OriginalMember(owner = "client!lb", name = "W", descriptor = "(IIIIII)V", line = 289)
    public final void method116(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5333++;
        this.field5326.method1752(arg0, arg1, arg4, 900, arg5, arg2, arg3);
    }

    @OriginalMember(owner = "client!lb", name = "ka", descriptor = "(IIII)V", line = 300)
    public final void method118(int arg0, int arg1, int arg2, int arg3) {
        this.field5346 = arg1;
        this.field5339 = arg3;
        this.field5336 = arg2;
        field5343++;
        this.field5328 = arg0;
        this.field5334 = this.field5328 != 0 || this.field5346 != 0 || this.field5336 != 0 || this.field5339 != 0;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(II)V", line = 319)
    private final void method2184(int arg0, int arg1) {
        field5330++;
        this.field5351.method2398(1, (byte) 119);
        this.field5351.method2412((byte) 4, this.field5326);
        this.field5351.method2383(this.field5351.method2427(arg1, 3089), 117, 7681);
        if (arg0 < 70) {
            field5349 = null;
        }
        this.field5351.method2362(34167, (byte) 65, 768, 1);
        this.field5351.method2379(770, (byte) -74, 34168, 0);
        this.field5351.method2398(0, (byte) 9);
        this.field5351.method2412((byte) 4, this.field5338);
        this.field5351.method2383(34479, 98, 7681);
        this.field5351.method2362(34166, (byte) 65, 768, 1);
        if (this.field5344 == 0) {
            this.field5351.method2374(0.0F, 0.5F, 0.5F, 1.0F, 125);
        } else if (this.field5344 == 1) {
            this.field5351.method2374(0.0F, 1.0F, 0.5F, 0.5F, 126);
        } else if (this.field5344 == 2) {
            this.field5351.method2374(0.0F, 0.5F, 1.0F, 0.5F, 127);
        } else if (this.field5344 == 3) {
            this.field5351.method2374(0.0F, 128.5F, 128.5F, 128.5F, 126);
            return;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIBI)V", line = 354)
    public static final void method2185(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        class44.field616 = arg1;
        class160.field2294 = arg2;
        class388.field5451 = arg4;
        class52.field694 = arg0;
        if (arg3 > -79) {
            method2185(47, 35, 90, (byte) 61, 25);
        }
        field5323++;
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lht;IIII)V", line = 724)
    public class379(class410 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5351 = arg0;
        this.field5326 = class425.method2544(arg0, (byte) -103, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lht;II[III)V", line = 734)
    public class379(class410 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field5351 = arg0;
        this.field5326 = class178.method1086(arg2, false, arg1, (byte) -126, arg0, arg3);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lvh;B)V", line = 375)
    public static final void method2186(class240 arg0, byte arg1) {
        field5337++;
        class141.field2013 = 0;
        class14.field168 = 0;
        class297.field4104 = new class398();
        int var2 = -114 % ((64 - arg1) / 61);
        class331.field4509 = new class187[1024];
        class233.method1362(126, arg0);
        class407.method2349(arg0, 85);
    }

    @OriginalMember(owner = "client!lb", name = "JA", descriptor = "()I", line = 391)
    public final int method121() {
        field5332++;
        return this.field5326.field4470 + this.field5346 + this.field5339;
    }

    @OriginalMember(owner = "client!lb", name = "D", descriptor = "(IIIIIII)V", line = 401)
    public final void method124(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5341++;
        int var8 = arg0 + arg2;
        int var9 = arg1 + arg3;
        this.field5326.method1132(false, (byte) 62);
        this.field5351.method2423(8448);
        this.field5351.method2412((byte) 4, this.field5326);
        this.field5351.method2356((byte) -21, arg6);
        this.field5351.method2365(true, arg4);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field5326.field4469 && !this.field5334) {
            float var10 = (float) arg3 * this.field5326.field4466 / (float) this.field5326.field4470;
            float var11 = (float) arg2 * this.field5326.field4467 / (float) this.field5326.field4461;
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
        OpenGL.glTranslatef((float) this.field5328, (float) this.field5346, 0.0F);
        int var12 = this.method126();
        int var13 = this.method121();
        int var14 = this.field5326.field4470 + arg1;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var14 <= var9) {
            int var20 = arg0 + this.field5326.field4461;
            int var21 = arg0;
            while (var20 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field5326.field4466);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field5326.field4467, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field5326.field4467, this.field5326.field4466);
                OpenGL.glVertex2i(var20, var15);
                var21 += var12;
                var20 += var12;
            }
            if (var21 < var8) {
                float var22 = (float) (var8 - var21) * this.field5326.field4467 / (float) this.field5326.field4461;
                OpenGL.glTexCoord2f(0.0F, this.field5326.field4466);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field5326.field4466);
                OpenGL.glVertex2i(var8, var15);
            }
            var15 += var13;
            var14 += var13;
        }
        if (var9 > var15) {
            float var16 = (float) (this.field5326.field4470 - (var9 - var15)) * this.field5326.field4466 / (float) this.field5326.field4470;
            int var17 = this.field5326.field4461 + arg0;
            int var18 = arg0;
            while (var17 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field5326.field4466);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field5326.field4467, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field5326.field4467, this.field5326.field4466);
                OpenGL.glVertex2i(var17, var15);
                var17 += var12;
                var18 += var12;
            }
            if (var18 < var8) {
                float var19 = (float) (var8 - var18) * this.field5326.field4467 / (float) this.field5326.field4461;
                OpenGL.glTexCoord2f(0.0F, this.field5326.field4466);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field5326.field4466);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!lb", name = "YA", descriptor = "(IIIII)V", line = 540)
    public final void method130(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5326.method1132(false, (byte) 62);
        field5331++;
        this.field5351.method2423(8448);
        this.field5351.method2356((byte) -21, arg4);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field5328 + arg0;
        int var7 = this.field5346 + arg1;
        if (this.field5338 == null) {
            this.field5351.method2412((byte) 4, this.field5326);
            this.field5351.method2365(true, arg2);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field5326.field4466);
            OpenGL.glVertex2i(var6, var7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var6, var7 + this.field5326.field4470);
            OpenGL.glTexCoord2f(this.field5326.field4467, 0.0F);
            OpenGL.glVertex2i(this.field5326.field4461 + var6, this.field5326.field4470 + var7);
            OpenGL.glTexCoord2f(this.field5326.field4467, this.field5326.field4466);
            OpenGL.glVertex2i(this.field5326.field4461 + var6, var7);
            OpenGL.glEnd();
            return;
        }
        this.method2184(106, arg2);
        this.field5338.method1132(false, (byte) 62);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field5326.field4466);
        OpenGL.glTexCoord2f(0.0F, this.field5326.field4466);
        OpenGL.glVertex2i(var6, var7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var6, this.field5326.field4470 + var7);
        OpenGL.glMultiTexCoord2f(33985, this.field5326.field4467, 0.0F);
        OpenGL.glTexCoord2f(this.field5326.field4467, 0.0F);
        OpenGL.glVertex2i(this.field5326.field4461 + var6, var7 - -this.field5326.field4470);
        OpenGL.glMultiTexCoord2f(33985, this.field5326.field4467, this.field5326.field4466);
        OpenGL.glTexCoord2f(this.field5326.field4467, this.field5326.field4466);
        OpenGL.glVertex2i(this.field5326.field4461 + var6, var7);
        OpenGL.glEnd();
        this.method2183((byte) -84);
    }

    @OriginalMember(owner = "client!lb", name = "V", descriptor = "(III)V", line = 591)
    public final void method128(int arg0, int arg1, int arg2) {
        field5335++;
        OpenGL.glPixelTransferf(3348, 0.5F);
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field5338 = class425.method2544(this.field5351, (byte) -124, arg0, this.field5326.field4461, this.field5326.field4470, arg1);
        this.field5344 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!lb", name = "UA", descriptor = "()I", line = 626)
    public final int method125() {
        field5324++;
        return this.field5326.field4461;
    }

    @OriginalMember(owner = "client!lb", name = "aa", descriptor = "(FFFFFFIII)V", line = 635)
    public final void method123(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        field5347++;
        if (this.field5334) {
            float var10 = (float) this.method126();
            float var11 = (float) this.method121();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field5346 * var14;
            float var17 = (float) this.field5346 * var15;
            float var18 = (float) this.field5328 * var12;
            float var19 = (float) this.field5328 * var13;
            float var20 = (float) this.field5336 * -var12;
            float var21 = (float) this.field5336 * -var13;
            float var22 = (float) this.field5339 * -var14;
            arg3 = arg3 + var21 + var17;
            arg2 = arg2 + var20 + var16;
            arg0 = arg0 + var18 + var16;
            arg4 = arg4 + var18 + var22;
            arg1 = arg1 + var19 + var17;
            float var23 = (float) this.field5339 * -var15;
            arg5 = arg5 + var19 + var23;
        }
        float var24 = arg2 + arg4 - arg0;
        float var25 = arg5 + arg3 - arg1;
        this.field5326.method1132(true, (byte) 62);
        this.field5351.method2423(8448);
        this.field5351.method2412((byte) 4, this.field5326);
        this.field5351.method2356((byte) -21, arg8);
        this.field5351.method2365(true, arg6);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field5326.field4466);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field5326.field4467, 0.0F);
        OpenGL.glVertex2f(var24, var25);
        OpenGL.glTexCoord2f(this.field5326.field4467, this.field5326.field4466);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!lb", name = "ja", descriptor = "()I", line = 715)
    public final int method126() {
        field5345++;
        return this.field5326.field4461 + this.field5328 + this.field5336;
    }
}
