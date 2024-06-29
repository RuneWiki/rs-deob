import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class327 extends class229 {

    @OriginalMember(owner = "client!so", name = "p", descriptor = "Lgo;")
    private class442 field4484;

    @OriginalMember(owner = "client!so", name = "k", descriptor = "Lhu;")
    private class85 field4479;

    @OriginalMember(owner = "client!so", name = "f", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!so", name = "g", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!so", name = "i", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!so", name = "j", descriptor = "I")
    public static int field4478;

    @OriginalMember(owner = "client!so", name = "l", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!so", name = "n", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!so", name = "o", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!so", name = "q", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!so", name = "r", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!so", name = "s", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!so", name = "m", descriptor = "Lwu;")
    private class250 field4481;

    @OriginalMember(owner = "client!so", name = "h", descriptor = "[Lf;")
    public static class529[] field4476;

    @OriginalMember(owner = "client!so", name = "c", descriptor = "(III)V", line = 4)
    public final void method12(int arg0, int arg1, int arg2) {
        int var4 = -5 / ((13 - arg1) / 46);
        if (~(1 & arg0) != -2) {
            if (this.field4484.field6430) {
                super.field3194.method2412((byte) 4, this.field4484.field6429);
                class391.field5463[0] = 0.0F;
                class391.field5463[2] = 0.0F;
                class391.field5463[3] = 0.0F;
                class391.field5463[1] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class391.field5463, 0);
            } else {
                super.field3194.method2412((byte) 4, this.field4484.field6431[0]);
            }
        } else if (this.field4484.field6430) {
            super.field3194.method2412((byte) 4, this.field4484.field6429);
            class391.field5463[2] = 0.0F;
            class391.field5463[0] = 0.0F;
            class391.field5463[3] = (float) (super.field3194.field5863 % 4000) / 4000.0F;
            class391.field5463[1] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class391.field5463, 0);
        } else {
            int var5 = super.field3194.field5863 % 4000 * 16 / 4000;
            super.field3194.method2412((byte) 4, this.field4484.field6431[var5]);
        }
        ++field4477;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(ZZ)V", line = 53)
    public final void method20(boolean arg0, boolean arg1) {
        if (super.field3194.field5953 > 0) {
            float var3 = -0.5F / (float) super.field3194.field5953;
            super.field3194.method2398(1, (byte) 114);
            class391.field5463[2] = var3;
            class391.field5463[0] = 0.0F;
            class391.field5463[1] = 0.0F;
            class391.field5463[3] = super.field3194.field5900 * var3 + 0.25F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class391.field5463, 0);
            OpenGL.glPopMatrix();
            super.field3194.method2424(-123, (float) super.field3194.field5953, 0.5F);
            super.field3194.method2412((byte) 4, this.field4479);
            super.field3194.method2398(0, (byte) 123);
        }
        ++field4482;
        this.field4481.method1473(-2, '\u0000');
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(0.25F, 0.25F, 1.0F);
        if (arg0) {
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(I)V", line = 86)
    public final void method19(int arg0) {
        if (arg0 != 262144) {
            this.method20(false, true);
        }
        this.field4481.method1473(-2, '\u0001');
        ++field4487;
        if (super.field3194.field5953 > 0) {
            super.field3194.method2398(1, (byte) 109);
            super.field3194.method2412((byte) 4, (class188) null);
            super.field3194.method2424(-122, 0.0F, 1.0F);
            super.field3194.method2398(0, (byte) -31);
        }
        super.field3194.method2383(8448, 70, 8448);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IILao;)V", line = 109)
    public final void method22(int arg0, int arg1, class188 arg2) {
        ++field4486;
        if (arg0 >= -45) {
            this.field4481 = null;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(ZI)V", line = 119)
    public final void method17(boolean arg0, int arg1) {
        ++field4480;
        if (arg1 != -27632) {
            this.field4481 = null;
        }
        super.field3194.method2383(260, 69, 8448);
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(I)V", line = 132)
    public static void method1825(int arg0) {
        field4476 = null;
        if (arg0 != 8448) {
            field4476 = null;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Lof;B)Z", line = 142)
    public static final boolean method1826(class438 arg0, byte arg1) {
        if (arg1 != -93) {
            method1827(-72, -31);
        }
        ++field4475;
        return class330.field4500 == arg0 || class190.field2645 == arg0 || class54.field749 == arg0 || class17.field179 == arg0;
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(B)Z", line = 155)
    public final boolean method13(byte arg0) {
        if (arg0 < 123) {
            return false;
        } else {
            ++field4485;
            return true;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(II)Z", line = 170)
    public static final boolean method1827(int arg0, int arg1) {
        ++field4474;
        if (arg0 != -4427) {
            field4483 = -9;
        }
        return ~arg1 == -1 || ~arg1 == -2 || arg1 == 2;
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lht;Lgo;)V", line = 184)
    public class327(class410 arg0, class442 arg1) {
        super(arg0);
        this.field4484 = arg1;
        this.method1828((byte) -68);
        this.field4479 = new class85(super.field3194, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field4479.method596(-29322, false);
    }

    @OriginalMember(owner = "client!so", name = "c", descriptor = "(B)V", line = 195)
    private final void method1828(byte arg0) {
        ++field4478;
        this.field4481 = new class250(super.field3194, 2);
        this.field4481.method1471(2, 0);
        super.field3194.method2398(1, (byte) 118);
        super.field3194.method2383(7681, 79, 260);
        super.field3194.method2362(34168, (byte) 65, 768, 0);
        if (arg0 > -61) {
            this.field4479 = null;
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        super.field3194.method2398(0, (byte) 114);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field4484.field6430) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field4481.method1475(17);
        this.field4481.method1471(2, 1);
        super.field3194.method2398(1, (byte) 124);
        super.field3194.method2383(8448, 106, 8448);
        super.field3194.method2362(5890, (byte) 65, 768, 0);
        OpenGL.glDisable(3168);
        super.field3194.method2398(0, (byte) -115);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field4484.field6430) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field4481.method1475(17);
    }
}
