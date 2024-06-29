import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public class class281 extends class301 {

    @OriginalMember(owner = "client!wba", name = "q", descriptor = "Lwo;")
    private class722 field3645;

    @OriginalMember(owner = "client!wba", name = "i", descriptor = "Ldfa;")
    private class561 field3637;

    @OriginalMember(owner = "client!wba", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field3634 = new String[100];

    @OriginalMember(owner = "client!wba", name = "k", descriptor = "I")
    public static int field3639 = 0;

    @OriginalMember(owner = "client!wba", name = "g", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!wba", name = "j", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!wba", name = "l", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!wba", name = "m", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!wba", name = "n", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!wba", name = "o", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!wba", name = "p", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!wba", name = "h", descriptor = "Lnc;")
    private class516 field3636;

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(IZ)V", line = 3)
    public final void method29(int arg0, boolean arg1) {
        if (~super.field3803.field9842 < -1) {
            float var3 = -0.5F / (float) super.field3803.field9842;
            super.field3803.method3945(1, false);
            class689.field8860[2] = var3;
            class689.field8860[0] = 0.0F;
            class689.field8860[1] = 0.0F;
            class689.field8860[3] = super.field3803.field9938 * var3 + 0.25F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class689.field8860, 0);
            OpenGL.glPopMatrix();
            super.field3803.method3942(-13019, 0.5F, (float) super.field3803.field9842);
            super.field3803.method3975((byte) 121, this.field3637);
            super.field3803.method3945(0, false);
        }
        ++field3638;
        this.field3636.method2855(4864, '\u0000');
        if (arg0 > 18) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glPushMatrix();
            OpenGL.glScalef(0.25F, 0.25F, 1.0F);
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!wba", name = "c", descriptor = "(B)V", line = 36)
    public static void method1722(byte arg0) {
        field3634 = null;
        if (arg0 >= -124) {
            method1722((byte) 111);
        }
    }

    @OriginalMember(owner = "client!wba", name = "d", descriptor = "(B)V", line = 51)
    private final void method1723(byte arg0) {
        this.field3636 = new class516(super.field3803, 2);
        ++field3635;
        this.field3636.method2857(0, (byte) -128);
        super.field3803.method3945(1, false);
        super.field3803.method3917(6, 7681, 260);
        super.field3803.method3954(0, 768, 34168, (byte) 116);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        if (arg0 < 91) {
            this.field3636 = null;
        }
        super.field3803.method3945(0, false);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field3645.field9478) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field3636.method2856((byte) -111);
        this.field3636.method2857(1, (byte) -122);
        super.field3803.method3945(1, false);
        super.field3803.method3917(53, 8448, 8448);
        super.field3803.method3954(0, 768, 5890, (byte) 112);
        OpenGL.glDisable(3168);
        super.field3803.method3945(0, false);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field3645.field9478) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field3636.method2856((byte) -82);
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(Lwj;II)V", line = 95)
    public final void method28(class128 arg0, int arg1, int arg2) {
        ++field3644;
        if (arg1 != 0) {
            this.method1723((byte) 125);
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(JJ)J", line = 106)
    public static long method1724(long arg0, long arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(III)V", line = 125)
    public final void method22(int arg0, int arg1, int arg2) {
        ++field3642;
        if ((arg1 & 1) != 1) {
            if (!this.field3645.field9478) {
                super.field3803.method3975((byte) 115, this.field3645.field9479[0]);
            } else {
                super.field3803.method3975((byte) 120, this.field3645.field9483);
                class689.field8860[2] = 0.0F;
                class689.field8860[3] = 0.0F;
                class689.field8860[0] = 0.0F;
                class689.field8860[1] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class689.field8860, 0);
            }
        } else if (this.field3645.field9478) {
            super.field3803.method3975((byte) 121, this.field3645.field9483);
            class689.field8860[1] = 0.0F;
            class689.field8860[2] = 0.0F;
            class689.field8860[0] = 0.0F;
            class689.field8860[3] = (float) (super.field3803.field9807 % 4000) / 4000.0F;
            OpenGL.glTexGenfv(8194, 9473, class689.field8860, 0);
        } else {
            int var4 = super.field3803.field9807 % 4000 * 16 / 4000;
            super.field3803.method3975((byte) 127, this.field3645.field9479[var4]);
        }
        if (arg2 != 0) {
            this.field3645 = null;
        }
    }

    @OriginalMember(owner = "client!wba", name = "<init>", descriptor = "(Lck;Lwo;)V", line = 170)
    public class281(class733 arg0, class722 arg1) {
        super(arg0);
        this.field3645 = arg1;
        this.method1723((byte) 124);
        this.field3637 = new class561(super.field3803, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field3637.method3035(255, false);
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(B)Z", line = 185)
    public final boolean method25(byte arg0) {
        ++field3641;
        return arg0 < 7 ? true : true;
    }

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "(IZ)V", line = 197)
    public final void method27(int arg0, boolean arg1) {
        if (arg0 != 0) {
            this.method28((class128) null, 121, 114);
        }
        super.field3803.method3917(21, 260, 8448);
        ++field3640;
    }

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "(B)V", line = 209)
    public final void method24(byte arg0) {
        ++field3643;
        if (arg0 <= -89) {
            this.field3636.method2855(4864, '\u0001');
            if (~super.field3803.field9842 < -1) {
                super.field3803.method3945(1, false);
                super.field3803.method3975((byte) 114, (class128) null);
                super.field3803.method3942(-13019, 1.0F, 0.0F);
                super.field3803.method3945(0, false);
            }
            super.field3803.method3917(110, 8448, 8448);
            OpenGL.glMatrixMode(5890);
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
        }
    }
}
