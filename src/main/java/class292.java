import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class292 extends class489 {

    @OriginalMember(owner = "client!cq", name = "s", descriptor = "Lfaa;")
    private class452 field3789;

    @OriginalMember(owner = "client!cq", name = "q", descriptor = "Lqj;")
    private class545 field3787;

    @OriginalMember(owner = "client!cq", name = "i", descriptor = "[I")
    public static int[] field3779 = new int[200];

    @OriginalMember(owner = "client!cq", name = "j", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!cq", name = "k", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!cq", name = "m", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!cq", name = "n", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!cq", name = "o", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!cq", name = "p", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!cq", name = "r", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!cq", name = "t", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!cq", name = "u", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!cq", name = "l", descriptor = "Lbp;")
    private class458 field3782;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(III)V", line = 9)
    public final void method8(int arg0, int arg1, int arg2) {
        if ((arg1 & 1) == 1) {
            if (this.field3789.field6337) {
                super.field6956.method2120(-1, this.field3789.field6341);
                class469.field6742[3] = (float) (super.field6956.field4961 % 4000) / 4000.0F;
                class469.field6742[1] = 0.0F;
                class469.field6742[0] = 0.0F;
                class469.field6742[2] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class469.field6742, 0);
            } else {
                int var4 = super.field6956.field4961 % 4000 * 16 / 4000;
                super.field6956.method2120(-1, this.field3789.field6334[var4]);
            }
        } else if (!this.field3789.field6337) {
            super.field6956.method2120(-1, this.field3789.field6334[0]);
        } else {
            super.field6956.method2120(-1, this.field3789.field6341);
            class469.field6742[2] = 0.0F;
            class469.field6742[3] = 0.0F;
            class469.field6742[1] = 0.0F;
            class469.field6742[0] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class469.field6742, 0);
        }
        if (arg2 != 40) {
            this.field3782 = null;
        }
        ++field3791;
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(IZ)V", line = 56)
    public final void method9(int arg0, boolean arg1) {
        ++field3781;
        super.field6956.method2165((byte) 74, 8448, 260);
        if (arg0 != -5) {
            this.method6(72);
        }
    }

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "(B)Z", line = 67)
    public static final boolean method1751(byte arg0) {
        ++field3788;
        if (class730.field10214 == null) {
            return false;
        } else {
            if (~class730.field10214.field10134 <= -2001) {
                class730.field10214.field10134 -= 2000;
            }
            if (class730.field10214.field10134 == 1011) {
                return true;
            } else {
                return arg0 <= 52;
            }
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IZ)V", line = 89)
    public final void method10(int arg0, boolean arg1) {
        if (~super.field6956.field5063 < -1) {
            float var3 = -0.5F / (float) super.field6956.field5063;
            super.field6956.method2135(1, -5027);
            class469.field6742[0] = 0.0F;
            class469.field6742[1] = 0.0F;
            class469.field6742[3] = super.field6956.field5043 * var3 + 0.25F;
            class469.field6742[2] = var3;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class469.field6742, 0);
            OpenGL.glPopMatrix();
            super.field6956.method2151((byte) -119, (float) super.field6956.field5063, 0.5F);
            super.field6956.method2120(-1, this.field3787);
            super.field6956.method2135(0, -5027);
        }
        int var4 = 36 / ((-43 - arg0) / 37);
        ++field3785;
        this.field3782.method2682('\u0000', 114);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(0.25F, 0.25F, 1.0F);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Leq;Lfaa;)V", line = 122)
    public class292(class357 arg0, class452 arg1) {
        super(arg0);
        this.field3789 = arg1;
        this.method1753(2);
        this.field3787 = new class545(super.field6956, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field3787.method3093(false, (byte) 60);
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(BLkp;I)V", line = 134)
    public final void method12(byte arg0, class411 arg1, int arg2) {
        if (arg0 < -66) {
            ++field3780;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)V", line = 150)
    public final void method6(int arg0) {
        ++field3784;
        this.field3782.method2682('\u0001', 104);
        if (arg0 < super.field6956.field5063) {
            super.field6956.method2135(1, -5027);
            super.field6956.method2120(arg0 + -1, (class411) null);
            super.field6956.method2151((byte) -114, 0.0F, 1.0F);
            super.field6956.method2135(0, arg0 ^ -5027);
        }
        super.field6956.method2165((byte) 74, 8448, 8448);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(I)V", line = 171)
    public static void method1752(int arg0) {
        field3779 = null;
        int var1 = -118 % ((-50 - arg0) / 57);
    }

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "(I)V", line = 182)
    private final void method1753(int arg0) {
        this.field3782 = new class458(super.field6956, arg0);
        ++field3783;
        this.field3782.method2686(0, (byte) -50);
        super.field6956.method2135(1, -5027);
        super.field6956.method2165((byte) 74, 260, 7681);
        super.field6956.method2132(768, (byte) 16, 34168, 0);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        super.field6956.method2135(0, arg0 ^ -5025);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field3789.field6337) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field3782.method2685(0);
        this.field3782.method2686(1, (byte) -81);
        super.field6956.method2135(1, -5027);
        super.field6956.method2165((byte) 74, 8448, 8448);
        super.field6956.method2132(768, (byte) 106, 5890, 0);
        OpenGL.glDisable(3168);
        super.field6956.method2135(0, arg0 + -5029);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field3789.field6337) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field3782.method2685(0);
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(B)Z", line = 223)
    public final boolean method7(byte arg0) {
        ++field3786;
        if (arg0 < 95) {
            this.method9(63, true);
        }
        return true;
    }
}
