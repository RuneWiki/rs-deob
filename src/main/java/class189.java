import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class189 extends class190 {

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "Lah;")
    private class374 field3179;

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "Lkl;")
    private class709 field3185;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "I")
    public static int field3184 = 0;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "Ltm;")
    public static class334 field3181 = new class334(61, 4);

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
    public static int field3190 = 0;

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "Leda;")
    public static class14 field3191 = new class14(64);

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "Lla;")
    public static class422 field3192;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "Liw;")
    private class607 field3189;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIB)V")
    public final void method914(int arg0, int arg1, byte arg2) {
        if (arg2 != -122) {
            method1434(-119, -0.3369119F, 103, -11, (float[]) null, -59, (float[]) null, 27, 78, 0.61170727F, -68, -1.3671094F, -83, 12);
        }
        ++field3187;
        if (~(1 & arg0) != -2) {
            if (!this.field3179.field5655) {
                super.field3195.method1306(this.field3179.field5657[0], 114);
            } else {
                super.field3195.method1306(this.field3179.field5648, arg2 + 230);
                class237.field3814[3] = 0.0F;
                class237.field3814[1] = 0.0F;
                class237.field3814[0] = 0.0F;
                class237.field3814[2] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class237.field3814, 0);
            }
        } else if (!this.field3179.field5655) {
            int var4 = super.field3195.field2757 % 4000 * 16 / 4000;
            super.field3195.method1306(this.field3179.field5657[var4], 55);
        } else {
            super.field3195.method1306(this.field3179.field5648, 85);
            class237.field3814[3] = (float) (super.field3195.field2757 % 4000) / 4000.0F;
            class237.field3814[0] = 0.0F;
            class237.field3814[1] = 0.0F;
            class237.field3814[2] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class237.field3814, 0);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZ)V")
    public final void method909(int arg0, boolean arg1) {
        if (arg0 == 16450) {
            super.field3195.method1256(8448, -4, 260);
            ++field3188;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZI)V")
    public final void method915(boolean arg0, int arg1) {
        if (super.field3195.field2893 > arg1) {
            float var3 = -0.5F / (float) super.field3195.field2893;
            super.field3195.method1298(1, (byte) -124);
            class237.field3814[1] = 0.0F;
            class237.field3814[0] = 0.0F;
            class237.field3814[2] = var3;
            class237.field3814[3] = super.field3195.field2894 * var3 + 0.25F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class237.field3814, 0);
            OpenGL.glPopMatrix();
            super.field3195.method1323(-8, 0.5F, (float) super.field3195.field2893);
            super.field3195.method1306(this.field3185, 32);
            super.field3195.method1298(0, (byte) -124);
        }
        ++field3183;
        this.field3189.method3477((byte) 98, '\u0000');
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(0.25F, 0.25F, 1.0F);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IFII[FI[FIIFIFII)V")
    public static final void method1434(int arg0, float arg1, int arg2, int arg3, float[] arg4, int arg5, float[] arg6, int arg7, int arg8, float arg9, int arg10, float arg11, int arg12, int arg13) {
        if (arg3 <= 87) {
            field3190 = -40;
        }
        int var14 = arg0 - arg12;
        int var15 = arg5 - arg8;
        int var16 = arg13 - arg10;
        ++field3178;
        float var17 = arg4[2] * (float) var15 + arg4[0] * (float) var14 + arg4[1] * (float) var16;
        float var18 = arg4[5] * (float) var15 + arg4[3] * (float) var14 + arg4[4] * (float) var16;
        float var19 = arg4[8] * (float) var15 + arg4[6] * (float) var14 + arg4[7] * (float) var16;
        float var20;
        float var21;
        if (~arg7 == -1) {
            var20 = arg9 + var17 + 0.5F;
            var21 = -var19 + arg11 + 0.5F;
        } else if (~arg7 != -2) {
            if (~arg7 == -3) {
                var20 = -var17 + arg9 + 0.5F;
                var21 = -var18 + arg1 + 0.5F;
            } else if (~arg7 != -4) {
                if (arg7 != 4) {
                    var20 = -var19 + arg11 + 0.5F;
                    var21 = -var18 + arg1 + 0.5F;
                } else {
                    var21 = -var18 + arg1 + 0.5F;
                    var20 = arg11 + var19 + 0.5F;
                }
            } else {
                var21 = -var18 + arg1 + 0.5F;
                var20 = arg9 + var17 + 0.5F;
            }
        } else {
            var20 = arg9 + var17 + 0.5F;
            var21 = arg11 + var19 + 0.5F;
        }
        if (~arg2 != -2) {
            if (arg2 == 2) {
                var21 = -var21;
                var20 = -var20;
            } else if (~arg2 == -4) {
                float var22 = var20;
                var20 = var21;
                var21 = -var22;
            }
        } else {
            float var23 = var20;
            var20 = -var21;
            var21 = var23;
        }
        arg6[0] = var20;
        arg6[1] = var21;
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lrs;Lah;)V")
    public class189(class166 arg0, class374 arg1) {
        super(arg0);
        this.field3179 = arg1;
        this.method1436(9711);
        this.field3185 = new class709(super.field3195, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field3185.method3928((byte) -4, false);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)V")
    public final void method910(boolean arg0) {
        this.field3189.method3477((byte) 98, '\u0001');
        ++field3186;
        if (~super.field3195.field2893 < -1) {
            super.field3195.method1298(1, (byte) -124);
            super.field3195.method1306((class487) null, 42);
            super.field3195.method1323(-8, 1.0F, 0.0F);
            super.field3195.method1298(0, (byte) -124);
        }
        super.field3195.method1256(8448, -4, 8448);
        if (arg0) {
            this.method914(37, -19, (byte) -75);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V")
    public static void method1435(int arg0) {
        field3191 = null;
        field3192 = null;
        if (arg0 > 49) {
            field3181 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)Z")
    public final boolean method908(int arg0) {
        if (arg0 <= 37) {
            this.method910(true);
        }
        ++field3180;
        return true;
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)V")
    private final void method1436(int arg0) {
        this.field3189 = new class607(super.field3195, 2);
        ++field3182;
        this.field3189.method3481(-127, 0);
        super.field3195.method1298(1, (byte) -124);
        super.field3195.method1256(260, -4, 7681);
        super.field3195.method1239(0, 34168, arg0 + -8943, 768);
        if (arg0 == 9711) {
            OpenGL.glTexGeni(8192, 9472, 9216);
            OpenGL.glEnable(3168);
            super.field3195.method1298(0, (byte) -124);
            OpenGL.glTexEnvf(8960, 34163, 2.0F);
            if (this.field3179.field5655) {
                OpenGL.glTexGeni(8194, 9472, 9217);
                OpenGL.glTexGeni(8195, 9472, 9217);
                OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
                OpenGL.glEnable(3170);
                OpenGL.glEnable(3171);
            }
            this.field3189.method3479((byte) -49);
            this.field3189.method3481(-128, 1);
            super.field3195.method1298(1, (byte) -124);
            super.field3195.method1256(8448, -4, 8448);
            super.field3195.method1239(0, 5890, 768, 768);
            OpenGL.glDisable(3168);
            super.field3195.method1298(0, (byte) -124);
            OpenGL.glTexEnvf(8960, 34163, 1.0F);
            if (this.field3179.field5655) {
                OpenGL.glDisable(3170);
                OpenGL.glDisable(3171);
            }
            this.field3189.method3479((byte) -83);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILnba;I)V")
    public final void method911(int arg0, class487 arg1, int arg2) {
        if (arg2 != 0) {
            this.field3179 = null;
        }
        ++field3193;
    }
}
