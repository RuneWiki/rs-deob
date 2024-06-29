import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public class class392 extends class34 {

    @OriginalMember(owner = "client!dda", name = "g", descriptor = "I")
    private int field5850 = 0;

    @OriginalMember(owner = "client!dda", name = "k", descriptor = "Z")
    private boolean field5854 = false;

    @OriginalMember(owner = "client!dda", name = "l", descriptor = "I")
    private int field5855 = 0;

    @OriginalMember(owner = "client!dda", name = "f", descriptor = "I")
    private int field5849 = 0;

    @OriginalMember(owner = "client!dda", name = "x", descriptor = "I")
    private int field5867 = 0;

    @OriginalMember(owner = "client!dda", name = "s", descriptor = "I")
    private int field5862 = 0;

    @OriginalMember(owner = "client!dda", name = "c", descriptor = "Lrs;")
    private class166 field5846;

    @OriginalMember(owner = "client!dda", name = "A", descriptor = "Lsb;")
    private class89 field5870;

    @OriginalMember(owner = "client!dda", name = "e", descriptor = "[[I")
    public static int[][] field5848 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "I")
    public static int field5845;

    @OriginalMember(owner = "client!dda", name = "d", descriptor = "I")
    public static int field5847;

    @OriginalMember(owner = "client!dda", name = "h", descriptor = "I")
    public static int field5851;

    @OriginalMember(owner = "client!dda", name = "i", descriptor = "I")
    public static int field5852;

    @OriginalMember(owner = "client!dda", name = "j", descriptor = "I")
    public static int field5853;

    @OriginalMember(owner = "client!dda", name = "m", descriptor = "I")
    public static int field5856;

    @OriginalMember(owner = "client!dda", name = "n", descriptor = "I")
    public static int field5857;

    @OriginalMember(owner = "client!dda", name = "o", descriptor = "I")
    public static int field5858;

    @OriginalMember(owner = "client!dda", name = "p", descriptor = "I")
    public static int field5859;

    @OriginalMember(owner = "client!dda", name = "q", descriptor = "I")
    public static int field5860;

    @OriginalMember(owner = "client!dda", name = "r", descriptor = "I")
    public static int field5861;

    @OriginalMember(owner = "client!dda", name = "t", descriptor = "I")
    public static int field5863;

    @OriginalMember(owner = "client!dda", name = "u", descriptor = "I")
    public static int field5864;

    @OriginalMember(owner = "client!dda", name = "v", descriptor = "I")
    public static int field5865;

    @OriginalMember(owner = "client!dda", name = "w", descriptor = "I")
    public static int field5866;

    @OriginalMember(owner = "client!dda", name = "y", descriptor = "I")
    public static int field5868;

    @OriginalMember(owner = "client!dda", name = "z", descriptor = "I")
    public static int field5869;

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "Lsb;")
    private class89 field5844;

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "(II)V", line = 4)
    private final void method2443(int arg0, int arg1) {
        this.field5846.method1298(1, (byte) -124);
        field5857++;
        this.field5846.method1306(this.field5870, 71);
        this.field5846.method1256(7681, -4, this.field5846.method1236(8, arg0));
        this.field5846.method1239(1, 34167, 768, 768);
        this.field5846.method1264(34168, 2, 0, 770);
        this.field5846.method1298(0, (byte) -124);
        this.field5846.method1306(this.field5844, 120);
        this.field5846.method1256(7681, -4, 34479);
        this.field5846.method1239(1, 34166, 768, 768);
        if (arg1 <= 56) {
            return;
        }
        if (this.field5862 == 0) {
            this.field5846.method1330(0.5F, 1.0F, 0.5F, 0.0F, -29089);
        } else if (this.field5862 == 1) {
            this.field5846.method1330(0.5F, 0.5F, 1.0F, 0.0F, -29089);
        } else if (this.field5862 == 2) {
            this.field5846.method1330(1.0F, 0.5F, 0.5F, 0.0F, -29089);
        } else if (this.field5862 == 3) {
            this.field5846.method1330(128.5F, 128.5F, 128.5F, 0.0F, -29089);
            return;
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(I)V", line = 38)
    public static void method2444(int arg0) {
        field5848 = null;
        if (arg0 != 29229) {
            field5848 = null;
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIIII)V", line = 49)
    public final void method48(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5870.method2967(true, false);
        field5851++;
        this.field5846.method1299((byte) -89);
        this.field5846.method1320(arg4, false);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field5850 + arg1;
        int var7 = this.field5855 + arg0;
        if (this.field5844 == null) {
            this.field5846.method1306(this.field5870, 72);
            this.field5846.method1334(0, arg2);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field5870.field1359);
            OpenGL.glVertex2i(var7, var6);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var7, var6 + this.field5870.field1357);
            OpenGL.glTexCoord2f(this.field5870.field1360, 0.0F);
            OpenGL.glVertex2i(var7 + this.field5870.field1356, this.field5870.field1357 + var6);
            OpenGL.glTexCoord2f(this.field5870.field1360, this.field5870.field1359);
            OpenGL.glVertex2i(this.field5870.field1356 + var7, var6);
            OpenGL.glEnd();
            return;
        }
        this.method2443(arg2, 96);
        this.field5844.method2967(true, false);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field5870.field1359);
        OpenGL.glTexCoord2f(0.0F, this.field5870.field1359);
        OpenGL.glVertex2i(var7, var6);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var7, this.field5870.field1357 + var6);
        OpenGL.glMultiTexCoord2f(33985, this.field5870.field1360, 0.0F);
        OpenGL.glTexCoord2f(this.field5870.field1360, 0.0F);
        OpenGL.glVertex2i(this.field5870.field1356 + var7, this.field5870.field1357 + var6);
        OpenGL.glMultiTexCoord2f(33985, this.field5870.field1360, this.field5870.field1359);
        OpenGL.glTexCoord2f(this.field5870.field1360, this.field5870.field1359);
        OpenGL.glVertex2i(this.field5870.field1356 + var7, var6);
        OpenGL.glEnd();
        this.method2445(768);
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIIIIII)V", line = 100)
    public final void method181(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5852++;
        int var8 = arg0 + arg2;
        this.field5870.method2967(true, false);
        int var9 = arg1 + arg3;
        this.field5846.method1299((byte) -89);
        this.field5846.method1306(this.field5870, 45);
        this.field5846.method1320(arg6, false);
        this.field5846.method1334(0, arg4);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field5870.field1361 && !this.field5854) {
            float var10 = (float) arg3 * this.field5870.field1359 / (float) this.field5870.field1357;
            float var11 = (float) arg2 * this.field5870.field1360 / (float) this.field5870.field1356;
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
        OpenGL.glTranslatef((float) this.field5855, (float) this.field5850, 0.0F);
        int var12 = this.method177();
        int var13 = this.method184();
        int var14 = this.field5870.field1357 + arg1;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var14 <= var9) {
            int var20 = this.field5870.field1356 + arg0;
            int var21 = arg0;
            while (var20 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field5870.field1359);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field5870.field1360, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field5870.field1360, this.field5870.field1359);
                OpenGL.glVertex2i(var20, var15);
                var20 += var12;
                var21 += var12;
            }
            if (var8 > var21) {
                float var22 = (float) (var8 - var21) * this.field5870.field1360 / (float) this.field5870.field1356;
                OpenGL.glTexCoord2f(0.0F, this.field5870.field1359);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field5870.field1359);
                OpenGL.glVertex2i(var8, var15);
            }
            var14 += var13;
            var15 += var13;
        }
        if (var9 > var15) {
            float var16 = (float) (var15 + this.field5870.field1357 - var9) * this.field5870.field1359 / (float) this.field5870.field1357;
            int var17 = arg0 + this.field5870.field1356;
            int var18 = arg0;
            while (var17 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field5870.field1359);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field5870.field1360, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field5870.field1360, this.field5870.field1359);
                OpenGL.glVertex2i(var17, var15);
                var18 += var12;
                var17 += var12;
            }
            if (var18 < var8) {
                float var19 = (float) (var8 - var18) * this.field5870.field1360 / (float) this.field5870.field1356;
                OpenGL.glTexCoord2f(0.0F, this.field5870.field1359);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field5870.field1359);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIIIIIII)V", line = 237)
    public final void method49(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field5870.method2967(true, (arg7 & 0x1) != 0);
        field5865++;
        this.field5846.method1299((byte) -89);
        this.field5846.method1320(arg6, false);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field5854) {
            float var9 = (float) arg2 / (float) this.method177();
            float var10 = (float) arg3 / (float) this.method184();
            float var11 = (float) this.field5855 * var9 + (float) arg0;
            float var12 = (float) this.field5850 * var10 + (float) arg1;
            float var13 = (float) this.field5870.field1356 * var9 + var11;
            float var14 = (float) this.field5870.field1357 * var10 + var12;
            if (this.field5844 == null) {
                this.field5846.method1306(this.field5870, 89);
                this.field5846.method1334(0, arg4);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field5870.field1359);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glTexCoord2f(this.field5870.field1360, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glTexCoord2f(this.field5870.field1360, this.field5870.field1359);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
            } else {
                this.method2443(arg4, 92);
                this.field5844.method2967(true, true);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field5870.field1359);
                OpenGL.glTexCoord2f(0.0F, this.field5870.field1359);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field5870.field1360, 0.0F);
                OpenGL.glTexCoord2f(this.field5870.field1360, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field5870.field1360, this.field5870.field1359);
                OpenGL.glTexCoord2f(this.field5870.field1360, this.field5870.field1359);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
                this.method2445(768);
            }
        } else if (this.field5844 == null) {
            this.field5846.method1306(this.field5870, 64);
            this.field5846.method1334(0, arg4);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field5870.field1359);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field5870.field1360, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 - -arg3);
            OpenGL.glTexCoord2f(this.field5870.field1360, this.field5870.field1359);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method2443(arg4, 123);
            this.field5844.method2967(true, true);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field5870.field1359);
            OpenGL.glTexCoord2f(0.0F, this.field5870.field1359);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field5870.field1360, 0.0F);
            OpenGL.glTexCoord2f(this.field5870.field1360, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field5870.field1360, this.field5870.field1359);
            OpenGL.glTexCoord2f(this.field5870.field1360, this.field5870.field1359);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method2445(768);
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIIIII)V", line = 341)
    public final void method47(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5860++;
        if (!this.field5846.field2882) {
            this.field5870.method3863(true, arg2, arg3, arg0, arg1, arg4, arg5);
            return;
        }
        int[] var7 = this.field5846.method1262(arg4, arg5, arg2, arg3);
        if (var7 == null) {
            return;
        }
        for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = class112.method903(var7[var8], -16777216);
        }
        this.method2446(arg0, arg1, arg2, arg3, var7, 0, arg2);
        return;
    }

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "(I)V", line = 377)
    private final void method2445(int arg0) {
        field5863++;
        this.field5846.method1298(1, (byte) -124);
        this.field5846.method1306(null, 79);
        this.field5846.method1256(8448, -4, 8448);
        this.field5846.method1239(1, 34168, 768, 768);
        this.field5846.method1264(5890, arg0 - 766, 0, 770);
        this.field5846.method1298(0, (byte) -124);
        this.field5846.method1239(1, 34168, arg0, 768);
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(FFFFFFIIII)V", line = 392)
    public final void method173(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field5854) {
            float var11 = (float) this.method177();
            float var12 = (float) this.method184();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field5850 * var15;
            float var18 = (float) this.field5850 * var16;
            float var19 = (float) this.field5855 * var13;
            float var20 = (float) this.field5855 * var14;
            float var21 = (float) this.field5867 * -var13;
            float var22 = (float) this.field5867 * -var14;
            float var23 = (float) this.field5849 * -var15;
            arg1 = arg1 + var20 + var18;
            float var24 = (float) this.field5849 * -var16;
            arg0 = arg0 + var19 + var17;
            arg2 = arg2 + var21 + var17;
            arg3 = arg3 + var22 + var18;
            arg4 = arg4 + var19 + var23;
            arg5 = arg5 + var20 + var24;
        }
        field5869++;
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        this.field5870.method2967(true, (arg9 & 0x1) != 0);
        this.field5846.method1299((byte) -89);
        this.field5846.method1306(this.field5870, 125);
        this.field5846.method1320(arg8, false);
        this.field5846.method1334(0, arg6);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field5870.field1359);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field5870.field1360, 0.0F);
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glTexCoord2f(this.field5870.field1360, this.field5870.field1359);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIII[III)V", line = 463)
    private final void method2446(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        field5868++;
        this.field5870.method3860(arg1, arg2, arg0, arg5, arg4, arg6, -74, true, arg3);
    }

    @OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Lrs;IIZ)V", line = 730)
    public class392(class166 arg0, int arg1, int arg2, boolean arg3) {
        this.field5846 = arg0;
        this.field5870 = class482.method2913(34037, arg0, arg2, arg3 ? 6408 : 6407, arg1);
    }

    @OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Lrs;IIII)V", line = 740)
    public class392(class166 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5846 = arg0;
        this.field5870 = class12.method57(arg4, arg1, arg2, arg0, arg3, 34037);
    }

    @OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Lrs;II[III)V", line = 750)
    public class392(class166 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field5846 = arg0;
        this.field5870 = class613.method3499(arg2, arg1, false, arg3, arg0, 122, arg5, arg4);
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(FFFFFFILaa;II)V", line = 482)
    public final void method180(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class570 arg7, int arg8, int arg9) {
        field5866++;
        class89 var11 = ((class229) arg7).field3704;
        if (this.field5854) {
            float var12 = (float) this.method177();
            float var13 = (float) this.method184();
            float var14 = (arg2 - arg0) / var12;
            float var15 = (arg3 - arg1) / var12;
            float var16 = (arg4 - arg0) / var13;
            float var17 = (arg5 - arg1) / var13;
            float var18 = (float) this.field5850 * var16;
            float var19 = (float) this.field5850 * var17;
            float var20 = (float) this.field5855 * var14;
            float var21 = (float) this.field5855 * var15;
            float var22 = (float) this.field5867 * -var14;
            float var23 = (float) this.field5867 * -var15;
            float var24 = (float) this.field5849 * -var16;
            arg0 = arg0 + var20 + var18;
            arg2 = arg2 + var22 + var18;
            arg3 = arg3 + var23 + var19;
            float var25 = (float) this.field5849 * -var17;
            arg1 = arg1 + var21 + var19;
            arg4 = arg4 + var20 + var24;
            arg5 = arg5 + var21 + var25;
        }
        float var26 = arg2 + arg4 - arg0;
        this.field5870.method2967(true, (arg6 & 0x1) != 0);
        float var27 = arg5 + arg3 - arg1;
        this.field5846.method1299((byte) -89);
        this.field5846.method1306(this.field5870, 71);
        this.field5846.method1334(0, 1);
        this.field5846.method1298(1, (byte) -124);
        this.field5846.method1306(var11, 98);
        this.field5846.method1256(8448, -4, 7681);
        this.field5846.method1239(0, 34168, 768, 768);
        this.field5846.method1320(1, false);
        float var28 = var11.field1360 / (float) var11.field1356;
        float var29 = var11.field1359 / (float) var11.field1357;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field5870.field1359);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + arg0) * var28, var11.field1359 - (arg1 - (float) arg9) * var29);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg8) * var28, var11.field1359 - ((float) (-arg9) + arg5) * var29);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field5870.field1360, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (var26 - (float) arg8) * var28, var11.field1359 - (var27 - (float) arg9) * var29);
        OpenGL.glVertex2f(var26, var27);
        OpenGL.glMultiTexCoord2f(33984, this.field5870.field1360, this.field5870.field1359);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + arg2) * var28, var11.field1359 - ((arg3 - (float) arg9) * var29));
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field5846.method1239(0, 5890, 768, 768);
        this.field5846.method1334(0, 0);
        this.field5846.method1306(null, 122);
        this.field5846.method1298(0, (byte) -124);
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIII)V", line = 573)
    public final void method185(int arg0, int arg1, int arg2, int arg3) {
        this.field5855 = arg0;
        field5861++;
        this.field5867 = arg2;
        this.field5850 = arg1;
        this.field5849 = arg3;
        this.field5854 = this.field5855 != 0 || this.field5850 != 0 || this.field5867 != 0 || this.field5849 != 0;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "([I)V", line = 586)
    public final void method186(int[] arg0) {
        arg0[2] = this.field5867;
        arg0[1] = this.field5850;
        field5847++;
        arg0[3] = this.field5849;
        arg0[0] = this.field5855;
    }

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "()I", line = 607)
    public final int method177() {
        field5853++;
        return this.field5870.field1356 + this.field5855 + this.field5867;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "()I", line = 617)
    public final int method175() {
        field5845++;
        return this.field5870.field1356;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(III)V", line = 629)
    public final void method51(int arg0, int arg1, int arg2) {
        OpenGL.glPixelTransferf(3348, 0.5F);
        field5858++;
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field5844 = class12.method57(this.field5870.field1357, arg0, arg1, this.field5846, this.field5870.field1356, 34037);
        this.field5862 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(IILaa;II)V", line = 652)
    public final void method52(int arg0, int arg1, class570 arg2, int arg3, int arg4) {
        field5856++;
        class229 var6 = (class229) arg2;
        class89 var7 = var6.field3704;
        this.field5870.method2967(true, false);
        this.field5846.method1299((byte) -89);
        this.field5846.method1306(this.field5870, 83);
        this.field5846.method1334(0, 1);
        this.field5846.method1298(1, (byte) -124);
        this.field5846.method1306(var7, 107);
        this.field5846.method1256(8448, -4, 7681);
        this.field5846.method1239(0, 34168, 768, 768);
        this.field5846.method1320(1, false);
        int var8 = this.field5855 + arg0;
        int var9 = this.field5850 + arg1;
        int var10 = this.field5870.field1356 + var8;
        int var11 = this.field5870.field1357 + var9;
        float var12 = var7.field1360 / (float) var7.field1356;
        float var13 = var7.field1359 / (float) var7.field1357;
        float var14 = (float) (var8 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field1359 - ((float) (var9 - arg4) * var13);
        float var17 = var7.field1359 - (float) (var11 - arg4) * var13;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field5870.field1359);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var8, var9);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var8, var9 + this.field5870.field1357);
        OpenGL.glMultiTexCoord2f(33984, this.field5870.field1360, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(this.field5870.field1356 + var8, var9 - -this.field5870.field1357);
        OpenGL.glMultiTexCoord2f(33984, this.field5870.field1360, this.field5870.field1359);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(this.field5870.field1356 + var8, var9);
        OpenGL.glEnd();
        this.field5846.method1239(0, 5890, 768, 768);
        this.field5846.method1334(0, 0);
        this.field5846.method1306(null, 32);
        this.field5846.method1298(0, (byte) -124);
    }

    @OriginalMember(owner = "client!dda", name = "c", descriptor = "()I", line = 711)
    public final int method179() {
        field5864++;
        return this.field5870.field1357;
    }

    @OriginalMember(owner = "client!dda", name = "d", descriptor = "()I", line = 719)
    public final int method184() {
        field5859++;
        return this.field5850 + this.field5849 + this.field5870.field1357;
    }
}
