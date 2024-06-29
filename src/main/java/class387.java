import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class387 extends class16 {

    @OriginalMember(owner = "client!nl", name = "m", descriptor = "I")
    private int field5089 = 0;

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "I")
    private int field5078 = 0;

    @OriginalMember(owner = "client!nl", name = "o", descriptor = "I")
    private int field5091 = 0;

    @OriginalMember(owner = "client!nl", name = "u", descriptor = "I")
    private int field5097 = 0;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "I")
    private int field5077 = 0;

    @OriginalMember(owner = "client!nl", name = "t", descriptor = "Z")
    private boolean field5096 = false;

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "Lug;")
    private class395 field5086;

    @OriginalMember(owner = "client!nl", name = "s", descriptor = "Lnq;")
    private class322 field5095;

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "I")
    public static int field5085 = -1;

    @OriginalMember(owner = "client!nl", name = "C", descriptor = "I")
    public static int field5104;

    @OriginalMember(owner = "client!nl", name = "F", descriptor = "[Lrd;")
    public static class223[] field5107;

    @OriginalMember(owner = "client!nl", name = "G", descriptor = "I")
    public static int field5108;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "I")
    public static int field5079;

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "I")
    public static int field5080;

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "I")
    public static int field5081;

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "I")
    public static int field5082;

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "I")
    public static int field5083;

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "I")
    public static int field5084;

    @OriginalMember(owner = "client!nl", name = "k", descriptor = "I")
    public static int field5087;

    @OriginalMember(owner = "client!nl", name = "n", descriptor = "I")
    public static int field5090;

    @OriginalMember(owner = "client!nl", name = "p", descriptor = "I")
    public static int field5092;

    @OriginalMember(owner = "client!nl", name = "q", descriptor = "I")
    public static int field5093;

    @OriginalMember(owner = "client!nl", name = "r", descriptor = "I")
    public static int field5094;

    @OriginalMember(owner = "client!nl", name = "v", descriptor = "I")
    public static int field5098;

    @OriginalMember(owner = "client!nl", name = "w", descriptor = "I")
    public static int field5099;

    @OriginalMember(owner = "client!nl", name = "y", descriptor = "I")
    public static int field5101;

    @OriginalMember(owner = "client!nl", name = "z", descriptor = "I")
    public static int field5102;

    @OriginalMember(owner = "client!nl", name = "B", descriptor = "I")
    public static int field5103;

    @OriginalMember(owner = "client!nl", name = "E", descriptor = "I")
    public static int field5106;

    @OriginalMember(owner = "client!nl", name = "x", descriptor = "Lnq;")
    private class322 field5100;

    @OriginalMember(owner = "client!nl", name = "l", descriptor = "[[I")
    public static int[][] field5088;

    @OriginalMember(owner = "client!nl", name = "D", descriptor = "[[[B")
    public static byte[][][] field5105;

    static {
        new class335("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
        field5104 = 0;
        field5107 = new class223[2048];
        field5108 = 0;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IILma;II)V", line = 3)
    public final void method129(int arg0, int arg1, class10 arg2, int arg3, int arg4) {
        field5081++;
        class195 var6 = (class195) arg2;
        class322 var7 = var6.field2521;
        this.field5095.method861(false, 9984);
        this.field5086.method2318(-20334);
        this.field5086.method2322(this.field5095, 14);
        this.field5086.method2305(7681, 1);
        this.field5086.method2321(1, 25322);
        this.field5086.method2322(var7, 14);
        this.field5086.method2271(-111, 7681, 8448);
        this.field5086.method2338(34168, 0, false, 768);
        this.field5086.method2290(true, 1);
        int var8 = this.field5077 + arg0;
        int var9 = this.field5089 + arg1;
        int var10 = this.field5095.field4084 + var8;
        int var11 = var9 + this.field5095.field4089;
        float var12 = var7.field4080 / (float) var7.field4084;
        float var13 = var7.field4082 / (float) var7.field4089;
        float var14 = (float) (var8 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field4082 - (float) (var9 - arg4) * var13;
        float var17 = var7.field4082 - (float) (var11 - arg4) * var13;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field5095.field4082);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var8, var9);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var8, this.field5095.field4089 + var9);
        OpenGL.glMultiTexCoord2f(33984, this.field5095.field4080, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(this.field5095.field4084 + var8, var9 - -this.field5095.field4089);
        OpenGL.glMultiTexCoord2f(33984, this.field5095.field4080, this.field5095.field4082);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(this.field5095.field4084 + var8, var9);
        OpenGL.glEnd();
        this.field5086.method2338(5890, 0, false, 768);
        this.field5086.method2305(7681, 0);
        this.field5086.method2322(null, 14);
        this.field5086.method2321(0, 25322);
    }

    @OriginalMember(owner = "client!nl", name = "ma", descriptor = "()I", line = 62)
    public final int method137() {
        field5103++;
        return this.field5095.field4089;
    }

    @OriginalMember(owner = "client!nl", name = "s", descriptor = "(IIIIIII)V", line = 81)
    public final void method135(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field5095.method861(true, 9984);
        field5106++;
        this.field5086.method2318(-20334);
        this.field5086.method2290(true, arg6);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field5096) {
            float var8 = (float) arg2 / (float) this.method148();
            float var9 = (float) arg3 / (float) this.method131();
            float var10 = (float) this.field5077 * var8 + (float) arg0;
            float var11 = (float) this.field5089 * var9 + (float) arg1;
            float var12 = (float) this.field5095.field4084 * var8 + var10;
            float var13 = (float) this.field5095.field4089 * var9 + var11;
            if (this.field5100 == null) {
                this.field5086.method2322(this.field5095, 14);
                this.field5086.method2305(7681, arg4);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field5095.field4082);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glTexCoord2f(this.field5095.field4080, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glTexCoord2f(this.field5095.field4080, this.field5095.field4082);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
            } else {
                this.method2183(arg4, 770);
                this.field5100.method861(true, 9984);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field5095.field4082);
                OpenGL.glTexCoord2f(0.0F, this.field5095.field4082);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field5095.field4080, 0.0F);
                OpenGL.glTexCoord2f(this.field5095.field4080, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field5095.field4080, this.field5095.field4082);
                OpenGL.glTexCoord2f(this.field5095.field4080, this.field5095.field4082);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
                this.method2185(false);
            }
        } else if (this.field5100 == null) {
            this.field5086.method2322(this.field5095, 14);
            this.field5086.method2305(7681, arg4);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field5095.field4082);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field5095.field4080, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field5095.field4080, this.field5095.field4082);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method2183(arg4, 770);
            this.field5100.method861(true, 9984);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field5095.field4082);
            OpenGL.glTexCoord2f(0.0F, this.field5095.field4082);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field5095.field4080, 0.0F);
            OpenGL.glTexCoord2f(this.field5095.field4080, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field5095.field4080, this.field5095.field4082);
            OpenGL.glTexCoord2f(this.field5095.field4080, this.field5095.field4082);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method2185(false);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(FFFFFFIII)V", line = 188)
    public final void method147(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field5096) {
            float var10 = (float) this.method148();
            float var11 = (float) this.method131();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field5089 * var14;
            float var17 = (float) this.field5089 * var15;
            float var18 = (float) this.field5077 * var12;
            float var19 = (float) this.field5077 * var13;
            float var20 = (float) this.field5078 * -var12;
            float var21 = (float) this.field5078 * -var13;
            float var22 = (float) this.field5097 * -var14;
            arg3 = arg3 + var21 + var17;
            float var23 = (float) this.field5097 * -var15;
            arg2 = arg2 + var20 + var16;
            arg1 = arg1 + var19 + var17;
            arg0 = arg0 + var18 + var16;
            arg4 = arg4 + var18 + var22;
            arg5 = arg5 + var19 + var23;
        }
        field5102++;
        float var24 = arg2 + arg4 - arg0;
        float var25 = arg5 + arg3 - arg1;
        this.field5095.method861(true, 9984);
        this.field5086.method2318(-20334);
        this.field5086.method2322(this.field5095, 14);
        this.field5086.method2290(true, arg8);
        this.field5086.method2305(7681, arg6);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field5095.field4082);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field5095.field4080, 0.0F);
        OpenGL.glVertex2f(var24, var25);
        OpenGL.glTexCoord2f(this.field5095.field4080, this.field5095.field4082);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!nl", name = "BA", descriptor = "(III)V", line = 261)
    public final void method146(int arg0, int arg1, int arg2) {
        OpenGL.glPixelTransferf(3348, 0.5F);
        field5080++;
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field5100 = class415.method2448(this.field5086, this.field5095.field4084, arg1, (byte) 6, arg0, this.field5095.field4089);
        this.field5091 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!nl", name = "T", descriptor = "()I", line = 284)
    public final int method131() {
        field5090++;
        return this.field5095.field4089 + this.field5089 + this.field5097;
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Lug;IIII)V", line = 886)
    public class387(class395 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5086 = arg0;
        this.field5095 = class415.method2448(arg0, arg3, arg2, (byte) 6, arg1, arg4);
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Lug;II[III)V", line = 896)
    public class387(class395 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field5086 = arg0;
        this.field5095 = class5.method31(arg1, false, (byte) -73, arg2, arg3, arg0);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Z)V", line = 295)
    public static void method2182(boolean arg0) {
        if (!arg0) {
            method2182(false);
        }
        field5088 = null;
        field5105 = null;
        field5107 = null;
    }

    @OriginalMember(owner = "client!nl", name = "la", descriptor = "()I", line = 307)
    public final int method134() {
        field5087++;
        return this.field5095.field4084;
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(II)V", line = 316)
    private final void method2183(int arg0, int arg1) {
        field5083++;
        this.field5086.method2321(1, 25322);
        this.field5086.method2322(this.field5095, 14);
        this.field5086.method2271(-122, this.field5086.method2347(arg0, true), 7681);
        this.field5086.method2338(34167, 1, false, 768);
        this.field5086.method2289(arg1, 56, 0, 34168);
        this.field5086.method2321(0, 25322);
        this.field5086.method2322(this.field5100, arg1 ^ 0x30C);
        this.field5086.method2271(80, 34479, 7681);
        this.field5086.method2338(34166, 1, false, 768);
        if (this.field5091 == 0) {
            this.field5086.method2273(1.0F, 0.5F, 0.0F, (byte) -124, 0.5F);
        } else if (this.field5091 == 1) {
            this.field5086.method2273(0.5F, 1.0F, 0.0F, (byte) -91, 0.5F);
            return;
        } else if (this.field5091 == 2) {
            this.field5086.method2273(0.5F, 0.5F, 0.0F, (byte) -94, 1.0F);
            return;
        } else if (this.field5091 == 3) {
            this.field5086.method2273(128.5F, 128.5F, 0.0F, (byte) -79, 128.5F);
            return;
        }
    }

    @OriginalMember(owner = "client!nl", name = "r", descriptor = "(IIIII)V", line = 358)
    public final void method139(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5095.method861(false, 9984);
        field5101++;
        this.field5086.method2318(-20334);
        this.field5086.method2290(true, arg4);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field5077 + arg0;
        int var7 = this.field5089 + arg1;
        if (this.field5100 == null) {
            this.field5086.method2322(this.field5095, 14);
            this.field5086.method2305(7681, arg2);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field5095.field4082);
            OpenGL.glVertex2i(var6, var7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var6, this.field5095.field4089 + var7);
            OpenGL.glTexCoord2f(this.field5095.field4080, 0.0F);
            OpenGL.glVertex2i(this.field5095.field4084 + var6, var7 - -this.field5095.field4089);
            OpenGL.glTexCoord2f(this.field5095.field4080, this.field5095.field4082);
            OpenGL.glVertex2i(this.field5095.field4084 + var6, var7);
            OpenGL.glEnd();
            return;
        }
        this.method2183(arg2, 770);
        this.field5100.method861(false, 9984);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field5095.field4082);
        OpenGL.glTexCoord2f(0.0F, this.field5095.field4082);
        OpenGL.glVertex2i(var6, var7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var6, this.field5095.field4089 + var7);
        OpenGL.glMultiTexCoord2f(33985, this.field5095.field4080, 0.0F);
        OpenGL.glTexCoord2f(this.field5095.field4080, 0.0F);
        OpenGL.glVertex2i(this.field5095.field4084 + var6, this.field5095.field4089 + var7);
        OpenGL.glMultiTexCoord2f(33985, this.field5095.field4080, this.field5095.field4082);
        OpenGL.glTexCoord2f(this.field5095.field4080, this.field5095.field4082);
        OpenGL.glVertex2i(this.field5095.field4084 + var6, var7);
        OpenGL.glEnd();
        this.method2185(false);
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(FFFFFFLma;II)V", line = 415)
    public final void method136(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class10 arg6, int arg7, int arg8) {
        field5092++;
        class322 var10 = ((class195) arg6).field2521;
        if (this.field5096) {
            float var11 = (float) this.method148();
            float var12 = (float) this.method131();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field5089 * var15;
            float var18 = (float) this.field5089 * var16;
            float var19 = (float) this.field5077 * var13;
            float var20 = (float) this.field5077 * var14;
            float var21 = (float) this.field5078 * -var13;
            float var22 = (float) this.field5078 * -var14;
            float var23 = (float) this.field5097 * -var15;
            arg0 = arg0 + var19 + var17;
            float var24 = (float) this.field5097 * -var16;
            arg3 = arg3 + var22 + var18;
            arg4 = arg4 + var19 + var23;
            arg2 = arg2 + var21 + var17;
            arg1 = arg1 + var20 + var18;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        this.field5095.method861(true, 9984);
        float var26 = arg5 + arg3 - arg1;
        this.field5086.method2318(-20334);
        this.field5086.method2322(this.field5095, 14);
        this.field5086.method2305(7681, 1);
        this.field5086.method2321(1, 25322);
        this.field5086.method2322(var10, 14);
        this.field5086.method2271(-128, 7681, 8448);
        this.field5086.method2338(34168, 0, false, 768);
        this.field5086.method2290(true, 1);
        float var27 = var10.field4080 / (float) var10.field4084;
        float var28 = var10.field4082 / (float) var10.field4089;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field5095.field4082);
        OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * var27, var10.field4082 - ((float) (-arg8) + arg1) * var28);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + arg4) * var27, var10.field4082 - (((float) (-arg8) + arg5) * var28));
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field5095.field4080, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (var25 - (float) arg7) * var27, var10.field4082 - (var26 - (float) arg8) * var28);
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glMultiTexCoord2f(33984, this.field5095.field4080, this.field5095.field4082);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + arg2) * var27, var10.field4082 - (arg3 - (float) arg8) * var28);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field5086.method2338(5890, 0, false, 768);
        this.field5086.method2305(7681, 0);
        this.field5086.method2322(null, 14);
        this.field5086.method2321(0, 25322);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V", line = 501)
    public static final void method2184(int arg0) {
        field5094++;
        int var1 = 0;
        if (arg0 != -99999) {
            method2184(33);
        }
        while (var1 < class189.field2475) {
            label135: {
                class212 var2 = class466.field6728[var1];
                boolean var3 = false;
                if (var2.field2720 == null) {
                    var2.field2727--;
                    if ((var2.field2732 == 2 ? -1500 : -10) > var2.field2727) {
                        var3 = true;
                    } else {
                        if (var2.field2732 == 1 && var2.field2722 == null) {
                            var2.field2722 = class207.method1286(class492.field7163, var2.field2721, 0);
                            if (var2.field2722 == null) {
                                break label135;
                            }
                            var2.field2727 += var2.field2722.method1285();
                        } else if (var2.field2732 == 2 && (var2.field2725 == null || var2.field2729 == null)) {
                            if (var2.field2725 == null) {
                                var2.field2725 = class396.method2354(class473.field6858, var2.field2721);
                            }
                            if (var2.field2725 == null) {
                                break label135;
                            }
                            if (var2.field2729 == null) {
                                var2.field2729 = var2.field2725.method2357(new int[] { 22050 });
                                if (var2.field2729 == null) {
                                    break label135;
                                }
                            }
                        }
                        if (var2.field2727 < 0) {
                            int var4;
                            if (var2.field2730 == 0) {
                                var4 = class407.field5817.field3619 * var2.field2724 >> 8;
                            } else {
                                int var5 = (var2.field2730 & 0x33EB241) >> 24;
                                if (class23.field336.field2676 == var5) {
                                    int var6 = (var2.field2730 & 0xFF) << 7;
                                    int var7 = var2.field2730 >> 16 & 0xFF;
                                    int var8 = (var7 << 7) + 64 - class23.field336.field2666;
                                    if (var8 < 0) {
                                        var8 = -var8;
                                    }
                                    int var9 = (var2.field2730 & 0xFF06) >> 8;
                                    int var10 = (var9 << 7) + 64 - class23.field336.field2677;
                                    if (var10 < 0) {
                                        var10 = -var10;
                                    }
                                    int var11 = var8 + var10 - 128;
                                    if (var11 > var6) {
                                        var2.field2727 = -99999;
                                        break label135;
                                    }
                                    if (var11 < 0) {
                                        var11 = 0;
                                    }
                                    var4 = class407.field5817.field3630 * var2.field2724 * (var6 - var11) / var6 >> 8;
                                } else {
                                    var4 = 0;
                                }
                            }
                            if (var4 > 0) {
                                class305 var12 = null;
                                if (var2.field2732 == 1) {
                                    var12 = var2.field2722.method1287().method1793(class294.field3759);
                                } else if (var2.field2732 == 2) {
                                    var12 = var2.field2729;
                                }
                                class393 var13 = var2.field2720 = class393.method2248(var12, 100, var4);
                                var13.method2246(var2.field2728 - 1);
                                class113.field1506.method2530(var13);
                            }
                        }
                    }
                } else if (!var2.field2720.method2166(0)) {
                    var3 = true;
                }
                if (var3) {
                    class189.field2475--;
                    for (int var14 = var1; var14 < class189.field2475; var14++) {
                        class466.field6728[var14] = class466.field6728[var14 + 1];
                    }
                    var1--;
                }
            }
            var1++;
        }
        if (class45.field538 && !class159.method1023((byte) 93)) {
            if (class407.field5817.field3629 != 0 && field5085 != -1) {
                class1.method3(class530.field7806, arg0 + 100061, 0, false, class407.field5817.field3629, field5085);
            }
            class45.field538 = false;
        } else if (class407.field5817.field3629 != 0 && field5085 != -1 && !class159.method1023((byte) -81)) {
            class73.field936++;
            class282.method1669(class172.field2195, false);
            class40.field511.method2777(field5085, -11);
            field5085 = -1;
        }
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(Z)V", line = 670)
    private final void method2185(boolean arg0) {
        this.field5086.method2321(1, 25322);
        field5084++;
        this.field5086.method2322(null, 14);
        this.field5086.method2271(120, 8448, 8448);
        this.field5086.method2338(34168, 1, false, 768);
        this.field5086.method2289(770, 107, 0, 5890);
        this.field5086.method2321(0, 25322);
        this.field5086.method2338(34168, 1, arg0, 768);
    }

    @OriginalMember(owner = "client!nl", name = "t", descriptor = "(IIIIII)V", line = 684)
    public final void method132(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5099++;
        this.field5095.method1577(arg2, arg3, arg1, arg5, arg0, arg4, -105);
    }

    @OriginalMember(owner = "client!nl", name = "JA", descriptor = "(IIIIIII)V", line = 699)
    public final void method143(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5098++;
        int var8 = arg0 + arg2;
        this.field5095.method861(false, 9984);
        int var9 = arg1 + arg3;
        this.field5086.method2318(-20334);
        this.field5086.method2322(this.field5095, 14);
        this.field5086.method2290(true, arg6);
        this.field5086.method2305(7681, arg4);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field5095.field4081 && !this.field5096) {
            float var10 = (float) arg3 * this.field5095.field4082 / (float) this.field5095.field4089;
            float var11 = (float) arg2 * this.field5095.field4080 / (float) this.field5095.field4084;
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
        OpenGL.glTranslatef((float) this.field5077, (float) this.field5089, 0.0F);
        int var12 = this.method148();
        int var13 = this.method131();
        int var14 = arg1 + this.field5095.field4089;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var9 >= var14) {
            int var20 = this.field5095.field4084 + arg0;
            int var21 = arg0;
            while (var8 >= var20) {
                OpenGL.glTexCoord2f(0.0F, this.field5095.field4082);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field5095.field4080, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field5095.field4080, this.field5095.field4082);
                OpenGL.glVertex2i(var20, var15);
                var20 += var12;
                var21 += var12;
            }
            if (var21 < var8) {
                float var22 = (float) (var8 - var21) * this.field5095.field4080 / (float) this.field5095.field4084;
                OpenGL.glTexCoord2f(0.0F, this.field5095.field4082);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field5095.field4082);
                OpenGL.glVertex2i(var8, var15);
            }
            var15 += var13;
            var14 += var13;
        }
        if (var15 < var9) {
            float var16 = (float) (-var9 - (-var15 - this.field5095.field4089)) * this.field5095.field4082 / (float) this.field5095.field4089;
            int var17 = arg0 + this.field5095.field4084;
            int var18 = arg0;
            while (var17 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field5095.field4082);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field5095.field4080, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field5095.field4080, this.field5095.field4082);
                OpenGL.glVertex2i(var17, var15);
                var18 += var12;
                var17 += var12;
            }
            if (var18 < var8) {
                float var19 = (float) (var8 - var18) * this.field5095.field4080 / (float) this.field5095.field4084;
                OpenGL.glTexCoord2f(0.0F, this.field5095.field4082);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field5095.field4082);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "()I", line = 837)
    public final int method148() {
        field5082++;
        return this.field5078 + this.field5077 + this.field5095.field4084;
    }

    @OriginalMember(owner = "client!nl", name = "MA", descriptor = "(IIII)V", line = 858)
    public final void method133(int arg0, int arg1, int arg2, int arg3) {
        field5079++;
        this.field5078 = arg2;
        this.field5097 = arg3;
        this.field5089 = arg1;
        this.field5077 = arg0;
        this.field5096 = this.field5077 != 0 || this.field5089 != 0 || this.field5078 != 0 || this.field5097 != 0;
    }
}
