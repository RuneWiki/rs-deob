import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class295 extends class283 {

    @OriginalMember(owner = "client!qn", name = "r", descriptor = "Lrb;")
    private class401 field4051;

    @OriginalMember(owner = "client!qn", name = "p", descriptor = "Llda;")
    private class567 field4049;

    @OriginalMember(owner = "client!qn", name = "j", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!qn", name = "k", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!qn", name = "l", descriptor = "I")
    public static int field4045;

    @OriginalMember(owner = "client!qn", name = "m", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!qn", name = "n", descriptor = "I")
    public static int field4047;

    @OriginalMember(owner = "client!qn", name = "q", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!qn", name = "s", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!qn", name = "t", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!qn", name = "i", descriptor = "Ltw;")
    private class523 field4042;

    @OriginalMember(owner = "client!qn", name = "o", descriptor = "[Ldf;")
    public static class619[] field4048;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)Z", line = 5)
    public final boolean method77(int arg0) {
        ++field4044;
        if (arg0 <= 96) {
            method1847(true);
        }
        return true;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Z)V", line = 21)
    public static void method1847(boolean arg0) {
        field4048 = null;
        if (arg0) {
            field4048 = null;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(ZI)V", line = 31)
    public final void method73(boolean arg0, int arg1) {
        super.field3958.method2149(arg1 + -11773, 8448, 260);
        if (arg1 != 2) {
            field4053 = -21;
        }
        ++field4047;
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(IZ)V", line = 44)
    public final void method76(int arg0, boolean arg1) {
        if (~super.field3958.field5094 < -1) {
            float var3 = -0.5F / (float) super.field3958.field5094;
            super.field3958.method2171(arg0 ^ -988, 1);
            class401.field5736[2] = var3;
            class401.field5736[0] = 0.0F;
            class401.field5736[3] = super.field3958.field5071 * var3 + 0.25F;
            class401.field5736[1] = 0.0F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class401.field5736, 0);
            OpenGL.glPopMatrix();
            super.field3958.method2163((byte) -104, (float) super.field3958.field5094, 0.5F);
            super.field3958.method2164(6, this.field4049);
            super.field3958.method2171(109, 0);
        }
        ++field4045;
        this.field4042.method3185(121, '\u0000');
        if (arg0 != -938) {
            this.method76(-89, false);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(0.25F, 0.25F, 1.0F);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(B)V", line = 80)
    public final void method74(byte arg0) {
        ++field4046;
        this.field4042.method3185(116, '\u0001');
        if (super.field3958.field5094 > 0) {
            super.field3958.method2171(arg0 ^ 42, 1);
            super.field3958.method2164(6, (class158) null);
            super.field3958.method2163((byte) -36, 0.0F, 1.0F);
            super.field3958.method2171(arg0 ^ 33, 0);
        }
        if (arg0 == 85) {
            super.field3958.method2149(arg0 + -11856, 8448, 8448);
            OpenGL.glMatrixMode(5890);
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lou;II)V", line = 104)
    public final void method75(class158 arg0, int arg1, int arg2) {
        if (arg1 == 2) {
            ++field4050;
        }
    }

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "(I)V", line = 116)
    private final void method1848(int arg0) {
        ++field4052;
        this.field4042 = new class523(super.field3958, 2);
        this.field4042.method3184(0, -72);
        super.field3958.method2171(126, 1);
        super.field3958.method2149(-11771, 260, 7681);
        super.field3958.method2167(34168, 768, 10603, 0);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        if (arg0 != 10398) {
            field4048 = null;
        }
        super.field3958.method2171(113, 0);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field4051.field5748) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field4042.method3181(true);
        this.field4042.method3184(1, 67);
        super.field3958.method2171(118, 1);
        super.field3958.method2149(-11771, 8448, 8448);
        super.field3958.method2167(5890, 768, 10603, 0);
        OpenGL.glDisable(3168);
        super.field3958.method2171(126, 0);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field4051.field5748) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field4042.method3181(true);
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Lkw;Lrb;)V", line = 160)
    public class295(class346 arg0, class401 arg1) {
        super(arg0);
        this.field4051 = arg1;
        this.method1848(10398);
        this.field4049 = new class567(super.field3958, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field4049.method3385(false, 117);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(ZII)V", line = 171)
    public final void method79(boolean arg0, int arg1, int arg2) {
        ++field4043;
        if ((arg2 & 1) == 1) {
            if (!this.field4051.field5748) {
                int var4 = super.field3958.field4973 % 4000 * 16 / 4000;
                super.field3958.method2164(6, this.field4051.field5741[var4]);
            } else {
                super.field3958.method2164(6, this.field4051.field5742);
                class401.field5736[2] = 0.0F;
                class401.field5736[1] = 0.0F;
                class401.field5736[3] = (float) (super.field3958.field4973 % 4000) / 4000.0F;
                class401.field5736[0] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class401.field5736, 0);
            }
        } else if (this.field4051.field5748) {
            super.field3958.method2164(6, this.field4051.field5742);
            class401.field5736[3] = 0.0F;
            class401.field5736[0] = 0.0F;
            class401.field5736[1] = 0.0F;
            class401.field5736[2] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class401.field5736, 0);
        } else {
            super.field3958.method2164(6, this.field4051.field5741[0]);
        }
        if (!arg0) {
            this.field4049 = null;
        }
    }
}
