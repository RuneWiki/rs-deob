import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class523 extends class24 {

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    private int field7586 = 0;

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "I")
    private int field7596 = 0;

    @OriginalMember(owner = "client!fl", name = "v", descriptor = "I")
    private int field7605 = 0;

    @OriginalMember(owner = "client!fl", name = "y", descriptor = "I")
    private int field7608 = 0;

    @OriginalMember(owner = "client!fl", name = "s", descriptor = "Z")
    private boolean field7602 = false;

    @OriginalMember(owner = "client!fl", name = "u", descriptor = "I")
    private int field7604 = 0;

    @OriginalMember(owner = "client!fl", name = "n", descriptor = "Lda;")
    private class44 field7597;

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "Lal;")
    private class67 field7591;

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "Ls;")
    public static class186 field7592 = null;

    @OriginalMember(owner = "client!fl", name = "w", descriptor = "Log;")
    public static class462 field7606 = new class462("RC", 1);

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "I")
    public static int field7584;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
    public static int field7585;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "I")
    public static int field7587;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "I")
    public static int field7588;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "I")
    public static int field7589;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "I")
    public static int field7590;

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "I")
    public static int field7593;

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "I")
    public static int field7594;

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "I")
    public static int field7598;

    @OriginalMember(owner = "client!fl", name = "p", descriptor = "I")
    public static int field7599;

    @OriginalMember(owner = "client!fl", name = "q", descriptor = "I")
    public static int field7600;

    @OriginalMember(owner = "client!fl", name = "r", descriptor = "I")
    public static int field7601;

    @OriginalMember(owner = "client!fl", name = "t", descriptor = "I")
    public static int field7603;

    @OriginalMember(owner = "client!fl", name = "x", descriptor = "I")
    public static int field7607;

    @OriginalMember(owner = "client!fl", name = "z", descriptor = "I")
    public static int field7609;

    @OriginalMember(owner = "client!fl", name = "C", descriptor = "I")
    public static int field7611;

    @OriginalMember(owner = "client!fl", name = "A", descriptor = "Lkm;")
    public static class238 field7610;

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "Lal;")
    private class67 field7595;

    @OriginalMember(owner = "client!fl", name = "ya", descriptor = "(IIIIIII)V")
    public final void method163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7603++;
        this.field7591.method2346(3, true);
        this.field7597.method315((byte) -37);
        this.field7597.method340((byte) -14, arg6);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field7602) {
            float var8 = (float) arg2 / (float) this.method147();
            float var9 = (float) arg3 / (float) this.method165();
            float var10 = (float) this.field7604 * var8 + (float) arg0;
            float var11 = (float) this.field7605 * var9 + (float) arg1;
            float var12 = (float) this.field7591.field1365 * var8 + var10;
            float var13 = (float) this.field7591.field1368 * var9 + var11;
            if (this.field7595 == null) {
                this.field7597.method381((byte) 28, this.field7591);
                this.field7597.method288((byte) 120, arg4);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field7591.field1364);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glTexCoord2f(this.field7591.field1369, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glTexCoord2f(this.field7591.field1369, this.field7591.field1364);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
            } else {
                this.method3090(6408, arg4);
                this.field7595.method2346(3, true);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field7591.field1364);
                OpenGL.glTexCoord2f(0.0F, this.field7591.field1364);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field7591.field1369, 0.0F);
                OpenGL.glTexCoord2f(this.field7591.field1369, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field7591.field1369, this.field7591.field1364);
                OpenGL.glTexCoord2f(this.field7591.field1369, this.field7591.field1364);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
                this.method3095(-84);
            }
        } else if (this.field7595 == null) {
            this.field7597.method381((byte) 28, this.field7591);
            this.field7597.method288((byte) -112, arg4);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field7591.field1364);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field7591.field1369, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 - -arg3);
            OpenGL.glTexCoord2f(this.field7591.field1369, this.field7591.field1364);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method3090(6408, arg4);
            this.field7595.method2346(3, true);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field7591.field1364);
            OpenGL.glTexCoord2f(0.0F, this.field7591.field1364);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field7591.field1369, 0.0F);
            OpenGL.glTexCoord2f(this.field7591.field1369, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 - -arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field7591.field1369, this.field7591.field1364);
            OpenGL.glTexCoord2f(this.field7591.field1369, this.field7591.field1364);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method3095(110);
        }
    }

    @OriginalMember(owner = "client!fl", name = "la", descriptor = "(IIIIIII)V")
    public final void method152(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7599++;
        int var8 = arg0 + arg2;
        int var9 = arg1 + arg3;
        this.field7591.method2346(3, false);
        this.field7597.method315((byte) -37);
        this.field7597.method381((byte) 28, this.field7591);
        this.field7597.method340((byte) 118, arg6);
        this.field7597.method288((byte) -113, arg4);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field7591.field1360 && !this.field7602) {
            float var10 = (float) arg3 * this.field7591.field1364 / (float) this.field7591.field1368;
            float var11 = (float) arg2 * this.field7591.field1369 / (float) this.field7591.field1365;
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
        OpenGL.glTranslatef((float) this.field7604, (float) this.field7605, 0.0F);
        int var12 = this.method147();
        int var13 = this.method165();
        int var14 = arg1 + this.field7591.field1368;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var9 >= var14) {
            int var20 = this.field7591.field1365 + arg0;
            int var21 = arg0;
            while (var20 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field7591.field1364);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field7591.field1369, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field7591.field1369, this.field7591.field1364);
                OpenGL.glVertex2i(var20, var15);
                var21 += var12;
                var20 += var12;
            }
            if (var21 < var8) {
                float var22 = (float) (var8 - var21) * this.field7591.field1369 / (float) this.field7591.field1365;
                OpenGL.glTexCoord2f(0.0F, this.field7591.field1364);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field7591.field1364);
                OpenGL.glVertex2i(var8, var15);
            }
            var14 += var13;
            var15 += var13;
        }
        if (var15 < var9) {
            float var16 = (float) (var15 + this.field7591.field1368 - var9) * this.field7591.field1364 / (float) this.field7591.field1368;
            int var17 = this.field7591.field1365 + arg0;
            int var18 = arg0;
            while (var8 >= var17) {
                OpenGL.glTexCoord2f(0.0F, this.field7591.field1364);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field7591.field1369, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field7591.field1369, this.field7591.field1364);
                OpenGL.glVertex2i(var17, var15);
                var17 += var12;
                var18 += var12;
            }
            if (var18 < var8) {
                float var19 = (float) (var8 - var18) * this.field7591.field1369 / (float) this.field7591.field1365;
                OpenGL.glTexCoord2f(0.0F, this.field7591.field1364);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field7591.field1364);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(II)V")
    private final void method3090(int arg0, int arg1) {
        this.field7597.method392((byte) 106, 1);
        field7611++;
        this.field7597.method381((byte) 28, this.field7591);
        this.field7597.method426(this.field7597.method314(arg1, (byte) 127), 7681, -24610);
        this.field7597.method412(1, 34167, 768, -116);
        if (arg0 != 6408) {
            this.method158(0.14950414F, 0.35601905F, 0.74991304F, 0.09224288F, -1.2714406F, 1.1072718F, null, 116, 40);
        }
        this.field7597.method325(34168, 5126, 770, 0);
        this.field7597.method392((byte) 106, 0);
        this.field7597.method381((byte) 28, this.field7595);
        this.field7597.method426(34479, 7681, arg0 - 31018);
        this.field7597.method412(1, 34166, 768, 73);
        if (this.field7586 == 0) {
            this.field7597.method411(0.5F, 1.0F, 19390, 0.0F, 0.5F);
        } else if (this.field7586 == 1) {
            this.field7597.method411(1.0F, 0.5F, 19390, 0.0F, 0.5F);
        } else if (this.field7586 == 2) {
            this.field7597.method411(0.5F, 0.5F, 19390, 0.0F, 1.0F);
        } else if (this.field7586 == 3) {
            this.field7597.method411(128.5F, 128.5F, 19390, 0.0F, 128.5F);
            return;
        }
    }

    @OriginalMember(owner = "client!fl", name = "XA", descriptor = "(IIIIII)V")
    public final void method150(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field7591.method971(arg0, arg1, arg3, arg2, arg4, arg5, 0);
        field7594++;
    }

    @OriginalMember(owner = "client!fl", name = "W", descriptor = "(IIIII)V")
    public final void method167(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7584++;
        this.field7591.method2346(3, false);
        this.field7597.method315((byte) -37);
        this.field7597.method340((byte) 109, arg4);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field7604 + arg0;
        int var7 = this.field7605 + arg1;
        if (this.field7595 == null) {
            this.field7597.method381((byte) 28, this.field7591);
            this.field7597.method288((byte) 97, arg2);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field7591.field1364);
            OpenGL.glVertex2i(var6, var7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var6, var7 + this.field7591.field1368);
            OpenGL.glTexCoord2f(this.field7591.field1369, 0.0F);
            OpenGL.glVertex2i(this.field7591.field1365 + var6, this.field7591.field1368 + var7);
            OpenGL.glTexCoord2f(this.field7591.field1369, this.field7591.field1364);
            OpenGL.glVertex2i(var6 + this.field7591.field1365, var7);
            OpenGL.glEnd();
            return;
        }
        this.method3090(6408, arg2);
        this.field7595.method2346(3, false);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field7591.field1364);
        OpenGL.glTexCoord2f(0.0F, this.field7591.field1364);
        OpenGL.glVertex2i(var6, var7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var6, this.field7591.field1368 + var7);
        OpenGL.glMultiTexCoord2f(33985, this.field7591.field1369, 0.0F);
        OpenGL.glTexCoord2f(this.field7591.field1369, 0.0F);
        OpenGL.glVertex2i(this.field7591.field1365 + var6, var7 - -this.field7591.field1368);
        OpenGL.glMultiTexCoord2f(33985, this.field7591.field1369, this.field7591.field1364);
        OpenGL.glTexCoord2f(this.field7591.field1369, this.field7591.field1364);
        OpenGL.glVertex2i(this.field7591.field1365 + var6, var7);
        OpenGL.glEnd();
        this.method3095(96);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IILta;II)V")
    public final void method166(int arg0, int arg1, class144 arg2, int arg3, int arg4) {
        field7609++;
        class171 var6 = (class171) arg2;
        class67 var7 = var6.field2770;
        this.field7591.method2346(3, false);
        this.field7597.method315((byte) -37);
        this.field7597.method381((byte) 28, this.field7591);
        this.field7597.method288((byte) 102, 1);
        this.field7597.method392((byte) 106, 1);
        this.field7597.method381((byte) 28, var7);
        this.field7597.method426(7681, 8448, -24610);
        this.field7597.method412(0, 34168, 768, 95);
        this.field7597.method340((byte) -57, 1);
        int var8 = this.field7604 + arg0;
        int var9 = this.field7605 + arg1;
        int var10 = this.field7591.field1365 + var8;
        int var11 = this.field7591.field1368 + var9;
        float var12 = var7.field1369 / (float) var7.field1365;
        float var13 = var7.field1364 / (float) var7.field1368;
        float var14 = (float) (var8 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field1364 - ((float) (var9 - arg4) * var13);
        float var17 = var7.field1364 - ((float) (var11 - arg4) * var13);
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field7591.field1364);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var8, var9);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var8, this.field7591.field1368 + var9);
        OpenGL.glMultiTexCoord2f(33984, this.field7591.field1369, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(this.field7591.field1365 + var8, var9 - -this.field7591.field1368);
        OpenGL.glMultiTexCoord2f(33984, this.field7591.field1369, this.field7591.field1364);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(this.field7591.field1365 + var8, var9);
        OpenGL.glEnd();
        this.field7597.method412(0, 5890, 768, -117);
        this.field7597.method288((byte) -92, 0);
        this.field7597.method381((byte) 28, null);
        this.field7597.method392((byte) 106, 0);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lza;Lvs;III)V")
    public static final void method3091(class288 arg0, class421 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class493.field7231) {
            class234 var5 = class518.field7511[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field3619 != null && var5.field3619.method19((byte) 126)) {
                arg1.method18(0, (byte) 93, class19.field312, var5.field3619, arg0, true, 0);
            }
        }
        if (arg4 < class493.field7231) {
            class234 var6 = class518.field7511[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field3619 != null && var6.field3619.method19((byte) 122)) {
                arg1.method18(0, (byte) 93, 0, var6.field3619, arg0, true, class19.field312);
            }
        }
        if (arg3 < class493.field7231 && arg4 < class220.field3464) {
            class234 var7 = class518.field7511[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field3619 != null && var7.field3619.method19((byte) 123)) {
                arg1.method18(0, (byte) 93, class19.field312, var7.field3619, arg0, true, class19.field312);
            }
        }
        if (arg3 < class493.field7231 && arg4 > 0) {
            class234 var8 = class518.field7511[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field3619 != null && var8.field3619.method19((byte) 122)) {
                arg1.method18(0, (byte) 93, class19.field312, var8.field3619, arg0, true, -class19.field312);
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V")
    public static void method3092(int arg0) {
        field7606 = null;
        field7592 = null;
        if (arg0 != -29155) {
            field7610 = null;
        }
        field7610 = null;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Z)V")
    public static final void method3093(boolean arg0) {
        if (class99.field1922 != null) {
            class99.field1922.method1486((byte) -73);
        }
        if (arg0) {
            field7588++;
            if (class52.field1122 != null) {
                class52.field1122.method1486((byte) -77);
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "H", descriptor = "(FFFFFFIII)V")
    public final void method160(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        field7598++;
        if (this.field7602) {
            float var10 = (float) this.method147();
            float var11 = (float) this.method165();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field7605 * var14;
            float var17 = (float) this.field7605 * var15;
            float var18 = (float) this.field7604 * var12;
            float var19 = (float) this.field7604 * var13;
            float var20 = (float) this.field7608 * -var12;
            float var21 = (float) this.field7608 * -var13;
            float var22 = (float) this.field7596 * -var14;
            arg4 = arg4 + var18 + var22;
            arg1 = arg1 + var19 + var17;
            arg0 = arg0 + var18 + var16;
            float var23 = (float) this.field7596 * -var15;
            arg2 = arg2 + var20 + var16;
            arg3 = arg3 + var21 + var17;
            arg5 = arg5 + var19 + var23;
        }
        float var24 = arg2 + arg4 - arg0;
        float var25 = arg5 + arg3 - arg1;
        this.field7591.method2346(3, true);
        this.field7597.method315((byte) -37);
        this.field7597.method381((byte) 28, this.field7591);
        this.field7597.method340((byte) 109, arg8);
        this.field7597.method288((byte) 87, arg6);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field7591.field1364);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field7591.field1369, 0.0F);
        OpenGL.glVertex2f(var24, var25);
        OpenGL.glTexCoord2f(this.field7591.field1369, this.field7591.field1364);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!fl", name = "RA", descriptor = "()I")
    public final int method147() {
        field7585++;
        return this.field7591.field1365 + this.field7608 + this.field7604;
    }

    @OriginalMember(owner = "client!fl", name = "YA", descriptor = "()I")
    public final int method157() {
        field7589++;
        return this.field7591.field1365;
    }

    @OriginalMember(owner = "client!fl", name = "Q", descriptor = "()I")
    public final int method165() {
        field7590++;
        return this.field7591.field1368 + this.field7605 + this.field7596;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Li;III[Z)V")
    public static final void method3094(class31 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class520.field7560 == class293.field4481) {
            return;
        }
        int var5 = class531.field7727[arg1].method186(arg2, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class38 var7 = class531.field7727[var6];
                if (var7 != null) {
                    var7.method185(arg0, arg2, var5 - var7.method186(arg2, arg3), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(I)V")
    private final void method3095(int arg0) {
        field7601++;
        this.field7597.method392((byte) 106, 1);
        int var2 = 12 % ((arg0 - 22) / 43);
        this.field7597.method381((byte) 28, null);
        this.field7597.method426(8448, 8448, -24610);
        this.field7597.method412(1, 34168, 768, -58);
        this.field7597.method325(5890, 5126, 770, 0);
        this.field7597.method392((byte) 106, 0);
        this.field7597.method412(1, 34168, 768, 118);
    }

    @OriginalMember(owner = "client!fl", name = "ha", descriptor = "(IIII)V")
    public final void method148(int arg0, int arg1, int arg2, int arg3) {
        field7600++;
        this.field7604 = arg0;
        this.field7596 = arg3;
        this.field7605 = arg1;
        this.field7608 = arg2;
        this.field7602 = this.field7604 != 0 || this.field7605 != 0 || this.field7608 != 0 || this.field7596 != 0;
    }

    @OriginalMember(owner = "client!fl", name = "ZA", descriptor = "()I")
    public final int method154() {
        field7607++;
        return this.field7591.field1368;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(FFFFFFLta;II)V")
    public final void method158(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class144 arg6, int arg7, int arg8) {
        field7593++;
        class67 var10 = ((class171) arg6).field2770;
        if (this.field7602) {
            float var11 = (float) this.method147();
            float var12 = (float) this.method165();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field7605 * var15;
            float var18 = (float) this.field7605 * var16;
            float var19 = (float) this.field7604 * var13;
            float var20 = (float) this.field7604 * var14;
            float var21 = (float) this.field7608 * -var13;
            float var22 = (float) this.field7608 * -var14;
            float var23 = (float) this.field7596 * -var15;
            arg3 = arg3 + var22 + var18;
            arg0 = arg0 + var19 + var17;
            float var24 = (float) this.field7596 * -var16;
            arg4 = arg4 + var19 + var23;
            arg1 = arg1 + var20 + var18;
            arg2 = arg2 + var21 + var17;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        this.field7591.method2346(3, true);
        float var26 = arg5 + arg3 - arg1;
        this.field7597.method315((byte) -37);
        this.field7597.method381((byte) 28, this.field7591);
        this.field7597.method288((byte) -120, 1);
        this.field7597.method392((byte) 106, 1);
        this.field7597.method381((byte) 28, var10);
        this.field7597.method426(7681, 8448, -24610);
        this.field7597.method412(0, 34168, 768, -126);
        this.field7597.method340((byte) 104, 1);
        float var27 = var10.field1369 / (float) var10.field1365;
        float var28 = var10.field1364 / (float) var10.field1368;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field7591.field1364);
        OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * var27, var10.field1364 - (arg1 - (float) arg8) * var28);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + arg4) * var27, var10.field1364 - (((float) (-arg8) + arg5) * var28));
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field7591.field1369, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + var25) * var27, var10.field1364 - (((float) (-arg8) + var26) * var28));
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glMultiTexCoord2f(33984, this.field7591.field1369, this.field7591.field1364);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + arg2) * var27, var10.field1364 - (arg3 - (float) arg8) * var28);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field7597.method412(0, 5890, 768, 95);
        this.field7597.method288((byte) -104, 0);
        this.field7597.method381((byte) 28, null);
        this.field7597.method392((byte) 106, 0);
    }

    @OriginalMember(owner = "client!fl", name = "oa", descriptor = "(III)V")
    public final void method153(int arg0, int arg1, int arg2) {
        OpenGL.glPixelTransferf(3348, 0.5F);
        field7587++;
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field7595 = class374.method2301(this.field7597, this.field7591.field1365, this.field7591.field1368, arg1, arg0, (byte) 3);
        this.field7586 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Lda;IIII)V")
    public class523(class44 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field7597 = arg0;
        this.field7591 = class374.method2301(arg0, arg3, arg4, arg2, arg1, (byte) 3);
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Lda;II[III)V")
    public class523(class44 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field7597 = arg0;
        this.field7591 = class374.method2297(arg0, arg2, arg1, arg3, 34037, false);
    }
}
