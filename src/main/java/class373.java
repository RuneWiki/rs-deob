import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class373 extends class116 {

    @OriginalMember(owner = "client!rr", name = "s", descriptor = "Z")
    private boolean field5400 = false;

    @OriginalMember(owner = "client!rr", name = "u", descriptor = "I")
    private int field5402 = 0;

    @OriginalMember(owner = "client!rr", name = "w", descriptor = "I")
    private int field5404 = 0;

    @OriginalMember(owner = "client!rr", name = "i", descriptor = "I")
    private int field5390 = 0;

    @OriginalMember(owner = "client!rr", name = "x", descriptor = "I")
    private int field5405 = 0;

    @OriginalMember(owner = "client!rr", name = "v", descriptor = "I")
    private int field5403 = 0;

    @OriginalMember(owner = "client!rr", name = "m", descriptor = "Ljj;")
    private class66 field5394;

    @OriginalMember(owner = "client!rr", name = "l", descriptor = "Log;")
    private class98 field5393;

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "I")
    public static int field5383;

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "I")
    public static int field5384;

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "I")
    public static int field5385;

    @OriginalMember(owner = "client!rr", name = "e", descriptor = "I")
    public static int field5386;

    @OriginalMember(owner = "client!rr", name = "f", descriptor = "I")
    public static int field5387;

    @OriginalMember(owner = "client!rr", name = "g", descriptor = "I")
    public static int field5388;

    @OriginalMember(owner = "client!rr", name = "h", descriptor = "I")
    public static int field5389;

    @OriginalMember(owner = "client!rr", name = "j", descriptor = "I")
    public static int field5391;

    @OriginalMember(owner = "client!rr", name = "k", descriptor = "I")
    public static int field5392;

    @OriginalMember(owner = "client!rr", name = "n", descriptor = "I")
    public static int field5395;

    @OriginalMember(owner = "client!rr", name = "o", descriptor = "I")
    public static int field5396;

    @OriginalMember(owner = "client!rr", name = "p", descriptor = "I")
    public static int field5397;

    @OriginalMember(owner = "client!rr", name = "q", descriptor = "I")
    public static int field5398;

    @OriginalMember(owner = "client!rr", name = "r", descriptor = "I")
    public static int field5399;

    @OriginalMember(owner = "client!rr", name = "y", descriptor = "I")
    public static int field5406;

    @OriginalMember(owner = "client!rr", name = "z", descriptor = "I")
    public static int field5407;

    @OriginalMember(owner = "client!rr", name = "A", descriptor = "I")
    public static int field5408;

    @OriginalMember(owner = "client!rr", name = "t", descriptor = "Lm;")
    public static class105 field5401;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "Log;")
    private class98 field5382;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)V")
    public static void method2262(int arg0) {
        if (arg0 > -96) {
            method2262(62);
        }
        field5401 = null;
    }

    @OriginalMember(owner = "client!rr", name = "i", descriptor = "(IIIIIII)V")
    public final void method961(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5384++;
        int var8 = arg0 + arg2;
        this.field5393.method1490((byte) 116, false);
        int var9 = arg1 + arg3;
        this.field5394.method597(false);
        this.field5394.method648(-90, this.field5393);
        this.field5394.method598(arg6, (byte) -112);
        this.field5394.method634(-114, arg4);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field5393.field1700 && !this.field5400) {
            float var10 = (float) arg3 * this.field5393.field1702 / (float) this.field5393.field1701;
            float var11 = (float) arg2 * this.field5393.field1705 / (float) this.field5393.field1704;
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
        OpenGL.glTranslatef((float) this.field5402, (float) this.field5404, 0.0F);
        int var12 = this.method955();
        int var13 = this.method960();
        int var14 = this.field5393.field1701 + arg1;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var9 >= var14) {
            int var20 = this.field5393.field1704 + arg0;
            int var21 = arg0;
            while (var20 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field5393.field1702);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field5393.field1705, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field5393.field1705, this.field5393.field1702);
                OpenGL.glVertex2i(var20, var15);
                var21 += var12;
                var20 += var12;
            }
            if (var21 < var8) {
                float var22 = (float) (var8 - var21) * this.field5393.field1705 / (float) this.field5393.field1704;
                OpenGL.glTexCoord2f(0.0F, this.field5393.field1702);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field5393.field1702);
                OpenGL.glVertex2i(var8, var15);
            }
            var14 += var13;
            var15 += var13;
        }
        if (var15 < var9) {
            float var16 = (float) (this.field5393.field1701 + var15 - var9) * this.field5393.field1702 / (float) this.field5393.field1701;
            int var17 = this.field5393.field1704 + arg0;
            int var18 = arg0;
            while (var17 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field5393.field1702);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field5393.field1705, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field5393.field1705, this.field5393.field1702);
                OpenGL.glVertex2i(var17, var15);
                var17 += var12;
                var18 += var12;
            }
            if (var8 > var18) {
                float var19 = (float) (var8 - var18) * this.field5393.field1705 / (float) this.field5393.field1704;
                OpenGL.glTexCoord2f(0.0F, this.field5393.field1702);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field5393.field1702);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!rr", name = "P", descriptor = "(IIIIII)V")
    public final void method662(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field5393.method2162(37, arg2, arg3, arg4, arg0, arg5, arg1);
        field5391++;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IILpa;II)V")
    public final void method663(int arg0, int arg1, class593 arg2, int arg3, int arg4) {
        field5408++;
        class435 var6 = (class435) arg2;
        class98 var7 = var6.field6382;
        this.field5393.method1490((byte) 74, false);
        this.field5394.method597(false);
        this.field5394.method648(-96, this.field5393);
        this.field5394.method634(-119, 1);
        this.field5394.method654(false, 1);
        this.field5394.method648(92, var7);
        this.field5394.method656(-12645, 8448, 7681);
        this.field5394.method607(34168, 0, 768, -100);
        this.field5394.method598(1, (byte) -101);
        int var8 = this.field5404 + arg1;
        int var9 = this.field5402 + arg0;
        int var10 = var9 + this.field5393.field1704;
        int var11 = this.field5393.field1701 + var8;
        float var12 = var7.field1705 / (float) var7.field1704;
        float var13 = var7.field1702 / (float) var7.field1701;
        float var14 = (float) (var9 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field1702 - (float) (var8 - arg4) * var13;
        float var17 = var7.field1702 - ((float) (var11 - arg4) * var13);
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field5393.field1702);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var9, var8);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var9, this.field5393.field1701 + var8);
        OpenGL.glMultiTexCoord2f(33984, this.field5393.field1705, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(this.field5393.field1704 + var9, this.field5393.field1701 + var8);
        OpenGL.glMultiTexCoord2f(33984, this.field5393.field1705, this.field5393.field1702);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(var9 + this.field5393.field1704, var8);
        OpenGL.glEnd();
        this.field5394.method607(5890, 0, 768, 51);
        this.field5394.method634(-125, 0);
        this.field5394.method648(-106, null);
        this.field5394.method654(false, 0);
    }

    @OriginalMember(owner = "client!rr", name = "DA", descriptor = "(IIIII)V")
    public final void method668(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5393.method1490((byte) 122, false);
        field5387++;
        this.field5394.method597(false);
        this.field5394.method598(arg4, (byte) 15);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field5404 + arg1;
        int var7 = this.field5402 + arg0;
        if (this.field5382 == null) {
            this.field5394.method648(-115, this.field5393);
            this.field5394.method634(25, arg2);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field5393.field1702);
            OpenGL.glVertex2i(var7, var6);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var7, this.field5393.field1701 + var6);
            OpenGL.glTexCoord2f(this.field5393.field1705, 0.0F);
            OpenGL.glVertex2i(var7 + this.field5393.field1704, var6 - -this.field5393.field1701);
            OpenGL.glTexCoord2f(this.field5393.field1705, this.field5393.field1702);
            OpenGL.glVertex2i(this.field5393.field1704 + var7, var6);
            OpenGL.glEnd();
            return;
        }
        this.method2266(arg2, -5307);
        this.field5382.method1490((byte) 119, false);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field5393.field1702);
        OpenGL.glTexCoord2f(0.0F, this.field5393.field1702);
        OpenGL.glVertex2i(var7, var6);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var7, this.field5393.field1701 + var6);
        OpenGL.glMultiTexCoord2f(33985, this.field5393.field1705, 0.0F);
        OpenGL.glTexCoord2f(this.field5393.field1705, 0.0F);
        OpenGL.glVertex2i(this.field5393.field1704 + var7, var6 - -this.field5393.field1701);
        OpenGL.glMultiTexCoord2f(33985, this.field5393.field1705, this.field5393.field1702);
        OpenGL.glTexCoord2f(this.field5393.field1705, this.field5393.field1702);
        OpenGL.glVertex2i(this.field5393.field1704 + var7, var6);
        OpenGL.glEnd();
        this.method2263(0);
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)V")
    private final void method2263(int arg0) {
        field5388++;
        this.field5394.method654(false, 1);
        this.field5394.method648(126, null);
        this.field5394.method656(-12645, 8448, 8448);
        this.field5394.method607(34168, 1, 768, arg0 ^ 0x22);
        this.field5394.method643(770, 0, -31364, 5890);
        this.field5394.method654(false, arg0);
        this.field5394.method607(34168, 1, 768, 33);
    }

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "()I")
    public final int method962() {
        field5389++;
        return this.field5393.field1704;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(FFFFFFLpa;II)V")
    public final void method966(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class593 arg6, int arg7, int arg8) {
        field5406++;
        class98 var10 = ((class435) arg6).field6382;
        if (this.field5400) {
            float var11 = (float) this.method955();
            float var12 = (float) this.method960();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field5404 * var15;
            float var18 = (float) this.field5404 * var16;
            float var19 = (float) this.field5402 * var13;
            float var20 = (float) this.field5402 * var14;
            float var21 = (float) this.field5390 * -var13;
            float var22 = (float) this.field5390 * -var14;
            float var23 = (float) this.field5405 * -var15;
            arg2 = arg2 + var21 + var17;
            arg0 = arg0 + var19 + var17;
            arg1 = arg1 + var20 + var18;
            float var24 = (float) this.field5405 * -var16;
            arg4 = arg4 + var19 + var23;
            arg3 = arg3 + var22 + var18;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        this.field5393.method1490((byte) 121, true);
        float var26 = arg5 + arg3 - arg1;
        this.field5394.method597(false);
        this.field5394.method648(-118, this.field5393);
        this.field5394.method634(29, 1);
        this.field5394.method654(false, 1);
        this.field5394.method648(-93, var10);
        this.field5394.method656(-12645, 8448, 7681);
        this.field5394.method607(34168, 0, 768, -117);
        this.field5394.method598(1, (byte) -115);
        float var27 = var10.field1705 / (float) var10.field1704;
        float var28 = var10.field1702 / (float) var10.field1701;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field5393.field1702);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + arg0) * var27, var10.field1702 - ((arg1 - (float) arg8) * var28));
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * var27, var10.field1702 - (((float) (-arg8) + arg5) * var28));
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field5393.field1705, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + var25) * var27, var10.field1702 - (((float) (-arg8) + var26) * var28));
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glMultiTexCoord2f(33984, this.field5393.field1705, this.field5393.field1702);
        OpenGL.glMultiTexCoord2f(33985, (arg2 - (float) arg7) * var27, var10.field1702 - ((arg3 - (float) arg8) * var28));
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field5394.method607(5890, 0, 768, -127);
        this.field5394.method634(-12, 0);
        this.field5394.method648(116, null);
        this.field5394.method654(false, 0);
    }

    @OriginalMember(owner = "client!rr", name = "KA", descriptor = "(IIII)V")
    public final void method963(int arg0, int arg1, int arg2, int arg3) {
        this.field5402 = arg0;
        this.field5404 = arg1;
        this.field5405 = arg3;
        field5398++;
        this.field5390 = arg2;
        this.field5400 = this.field5402 != 0 || this.field5404 != 0 || this.field5390 != 0 || this.field5405 != 0;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIIBI)V")
    public static final void method2264(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field5399++;
        if (arg2 >= class183.field2638 && arg2 <= class268.field3911) {
            int var5 = class34.method306(class222.field3350, arg4, class409.field6071, (byte) 104);
            int var6 = class34.method306(class222.field3350, arg1, class409.field6071, (byte) 115);
            class170.method1183(var5, arg2, (byte) -115, var6, arg0);
        }
        if (arg3 != 96) {
            field5401 = null;
        }
    }

    @OriginalMember(owner = "client!rr", name = "ma", descriptor = "()I")
    public final int method960() {
        field5396++;
        return this.field5405 + this.field5404 + this.field5393.field1701;
    }

    @OriginalMember(owner = "client!rr", name = "CA", descriptor = "(FFFFFFIII)V")
    public final void method958(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        field5386++;
        if (this.field5400) {
            float var10 = (float) this.method955();
            float var11 = (float) this.method960();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field5404 * var14;
            float var17 = (float) this.field5404 * var15;
            float var18 = (float) this.field5402 * var12;
            float var19 = (float) this.field5402 * var13;
            float var20 = (float) this.field5390 * -var12;
            float var21 = (float) this.field5390 * -var13;
            float var22 = (float) this.field5405 * -var14;
            float var23 = (float) this.field5405 * -var15;
            arg2 = arg2 + var20 + var16;
            arg4 = arg4 + var18 + var22;
            arg1 = arg1 + var19 + var17;
            arg0 = arg0 + var18 + var16;
            arg3 = arg3 + var21 + var17;
            arg5 = arg5 + var19 + var23;
        }
        float var24 = arg2 + arg4 - arg0;
        this.field5393.method1490((byte) 110, true);
        float var25 = arg5 + arg3 - arg1;
        this.field5394.method597(false);
        this.field5394.method648(93, this.field5393);
        this.field5394.method598(arg8, (byte) -93);
        this.field5394.method634(-117, arg6);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field5393.field1702);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field5393.field1705, 0.0F);
        OpenGL.glVertex2f(var24, var25);
        OpenGL.glTexCoord2f(this.field5393.field1705, this.field5393.field1702);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!rr", name = "BA", descriptor = "(III)V")
    public final void method666(int arg0, int arg1, int arg2) {
        field5392++;
        OpenGL.glPixelTransferf(3348, 0.5F);
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field5382 = class21.method225(34037, this.field5394, this.field5393.field1704, arg0, this.field5393.field1701, arg1);
        this.field5403 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(BIILid;)Lah;")
    public static final class240 method2265(byte arg0, int arg1, int arg2, class224 arg3) {
        field5397++;
        int var4 = arg2 << 8 | arg3.field3357;
        class240 var5 = (class240) class390.field5814.method3286(arg0 ^ 0x36, (long) var4 << 16);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class108.field1804.method3177(0, class108.field1804.method3178(var4, arg0 ^ 0x18));
        if (var6 == null) {
            if (arg0 != -109) {
                return null;
            }
            int var8 = arg1 + 65536 << 8 | arg3.field3357;
            class240 var9 = (class240) class390.field5814.method3286(arg0 + 18, (long) var8 << 16);
            if (var9 != null) {
                return var9;
            }
            byte[] var10 = class108.field1804.method3177(arg0 ^ 0xFFFFFF93, class108.field1804.method3178(var8, -88));
            if (var10 == null) {
                int var12 = arg3.field3357 | 0xFFFF00;
                class240 var13 = (class240) class390.field5814.method3286(-91, (long) var12 << 16);
                if (var13 != null) {
                    return var13;
                }
                byte[] var14 = class108.field1804.method3177(0, class108.field1804.method3178(var12, -91));
                if (var14 == null) {
                    return null;
                } else if (var14.length <= 1) {
                    return null;
                } else {
                    class240 var15 = class69.method680(var14, -1);
                    var15.field3486 = arg3;
                    class390.field5814.method3287(0, (long) var12 << 16, var15);
                    return var15;
                }
            } else if (var10.length <= 1) {
                return null;
            } else {
                class240 var11 = class69.method680(var10, arg0 ^ 0x6C);
                var11.field3486 = arg3;
                class390.field5814.method3287(0, (long) var8 << 16, var11);
                return var11;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class240 var7 = class69.method680(var6, -1);
            var7.field3486 = arg3;
            class390.field5814.method3287(0, (long) var4 << 16, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(II)V")
    private final void method2266(int arg0, int arg1) {
        this.field5394.method654(false, 1);
        field5383++;
        this.field5394.method648(-75, this.field5393);
        this.field5394.method656(arg1 - 7338, 7681, this.field5394.method579(arg1 + 20304, arg0));
        this.field5394.method607(34167, 1, 768, 12);
        this.field5394.method643(770, 0, -31364, 34168);
        this.field5394.method654(false, 0);
        this.field5394.method648(arg1 ^ 0xFFFFEB00, this.field5382);
        this.field5394.method656(-12645, 7681, 34479);
        if (arg1 != -5307) {
            return;
        }
        this.field5394.method607(34166, 1, 768, -111);
        if (this.field5403 == 0) {
            this.field5394.method530(0.5F, 0.5F, (byte) 117, 0.0F, 1.0F);
        } else if (this.field5403 == 1) {
            this.field5394.method530(1.0F, 0.5F, (byte) 117, 0.0F, 0.5F);
        } else if (this.field5403 == 2) {
            this.field5394.method530(0.5F, 1.0F, (byte) 117, 0.0F, 0.5F);
            return;
        } else if (this.field5403 == 3) {
            this.field5394.method530(128.5F, 128.5F, (byte) 117, 0.0F, 128.5F);
            return;
        }
    }

    @OriginalMember(owner = "client!rr", name = "ra", descriptor = "(IIIIIII)V")
    public final void method664(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field5393.method1490((byte) 108, true);
        field5395++;
        this.field5394.method597(false);
        this.field5394.method598(arg6, (byte) -99);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field5400) {
            float var8 = (float) arg2 / (float) this.method955();
            float var9 = (float) arg3 / (float) this.method960();
            float var10 = (float) this.field5402 * var8 + (float) arg0;
            float var11 = (float) this.field5404 * var9 + (float) arg1;
            float var12 = (float) this.field5393.field1704 * var8 + var10;
            float var13 = (float) this.field5393.field1701 * var9 + var11;
            if (this.field5382 == null) {
                this.field5394.method648(71, this.field5393);
                this.field5394.method634(39, arg4);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field5393.field1702);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glTexCoord2f(this.field5393.field1705, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glTexCoord2f(this.field5393.field1705, this.field5393.field1702);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
            } else {
                this.method2266(arg4, -5307);
                this.field5382.method1490((byte) 121, true);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field5393.field1702);
                OpenGL.glTexCoord2f(0.0F, this.field5393.field1702);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field5393.field1705, 0.0F);
                OpenGL.glTexCoord2f(this.field5393.field1705, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field5393.field1705, this.field5393.field1702);
                OpenGL.glTexCoord2f(this.field5393.field1705, this.field5393.field1702);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
                this.method2263(0);
            }
        } else if (this.field5382 == null) {
            this.field5394.method648(-83, this.field5393);
            this.field5394.method634(-116, arg4);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field5393.field1702);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field5393.field1705, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field5393.field1705, this.field5393.field1702);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method2266(arg4, -5307);
            this.field5382.method1490((byte) 70, true);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field5393.field1702);
            OpenGL.glTexCoord2f(0.0F, this.field5393.field1702);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field5393.field1705, 0.0F);
            OpenGL.glTexCoord2f(this.field5393.field1705, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field5393.field1705, this.field5393.field1702);
            OpenGL.glTexCoord2f(this.field5393.field1705, this.field5393.field1702);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method2263(0);
        }
    }

    @OriginalMember(owner = "client!rr", name = "EA", descriptor = "()I")
    public final int method955() {
        field5385++;
        return this.field5393.field1704 + this.field5402 + this.field5390;
    }

    @OriginalMember(owner = "client!rr", name = "la", descriptor = "()I")
    public final int method968() {
        field5407++;
        return this.field5393.field1701;
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Ljj;IIII)V")
    public class373(class66 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5394 = arg0;
        this.field5393 = class21.method225(34037, arg0, arg3, arg1, arg4, arg2);
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Ljj;II[III)V")
    public class373(class66 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field5394 = arg0;
        this.field5393 = class503.method2850(0, arg2, arg0, arg3, false, arg1);
    }
}
