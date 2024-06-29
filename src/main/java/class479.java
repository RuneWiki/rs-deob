import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class479 extends class497 {

    @OriginalMember(owner = "client!la", name = "g", descriptor = "Lmha;")
    private class438 field6636;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "Llv;")
    private class471 field6637;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field6638;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    public static int field6639;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public static int field6640;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    public static int field6641;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "I")
    public static int field6643;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "I")
    public static int field6644;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "I")
    public static int field6645;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "I")
    public static int field6646;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "I")
    public static int field6647;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "Lpba;")
    private class352 field6642;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILil;I)V", line = 4)
    public final void method158(int arg0, class7 arg1, int arg2) {
        if (arg0 != 9) {
            this.method158(33, (class7) null, 77);
        }
        ++field6640;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IZ)V", line = 17)
    public final void method164(int arg0, boolean arg1) {
        ++field6644;
        if (arg0 != 0) {
            this.method163(false, true);
        }
        super.field6867.method1622(8448, 260, (byte) 4);
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Ldia;Lmha;)V", line = 34)
    public class479(class246 arg0, class438 arg1) {
        super(arg0);
        this.field6636 = arg1;
        this.method2792((byte) 45);
        this.field6637 = new class471(super.field6867, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field6637.method2775((byte) 95, false);
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(ZZ)V", line = 45)
    public final void method163(boolean arg0, boolean arg1) {
        ++field6645;
        if (~super.field6867.field3578 < -1) {
            float var3 = -0.5F / (float) super.field6867.field3578;
            super.field6867.method1637(33984, 1);
            class495.field6847[3] = super.field6867.field3660 * var3 + 0.25F;
            class495.field6847[1] = 0.0F;
            class495.field6847[2] = var3;
            class495.field6847[0] = 0.0F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class495.field6847, 0);
            OpenGL.glPopMatrix();
            super.field6867.method1604((float) super.field6867.field3578, 32884, 0.5F);
            super.field6867.method1653((byte) 124, this.field6637);
            super.field6867.method1637(33984, 0);
        }
        this.field6642.method2219('\u0000', (byte) -89);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(0.25F, 0.25F, 1.0F);
        OpenGL.glMatrixMode(5888);
        if (arg1) {
            this.field6642 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(III)V", line = 81)
    public final void method162(int arg0, int arg1, int arg2) {
        ++field6647;
        if ((arg1 & 1) == 1) {
            if (!this.field6636.field6164) {
                int var4 = super.field6867.field3532 % 4000 * 16 / 4000;
                super.field6867.method1653((byte) 88, this.field6636.field6169[var4]);
            } else {
                super.field6867.method1653((byte) 111, this.field6636.field6166);
                class495.field6847[3] = (float) (super.field6867.field3532 % 4000) / 4000.0F;
                class495.field6847[1] = 0.0F;
                class495.field6847[2] = 0.0F;
                class495.field6847[0] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class495.field6847, 0);
            }
        } else if (!this.field6636.field6164) {
            super.field6867.method1653((byte) 104, this.field6636.field6169[0]);
        } else {
            super.field6867.method1653((byte) 112, this.field6636.field6166);
            class495.field6847[0] = 0.0F;
            class495.field6847[2] = 0.0F;
            class495.field6847[3] = 0.0F;
            class495.field6847[1] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class495.field6847, 0);
        }
        if (arg0 <= 122) {
            method2791((byte) -90);
        }
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(I)V", line = 128)
    public final void method161(int arg0) {
        ++field6639;
        this.field6642.method2219('\u0001', (byte) -89);
        if (~super.field6867.field3578 < -1) {
            super.field6867.method1637(arg0 ^ -33308, 1);
            super.field6867.method1653((byte) 86, (class7) null);
            super.field6867.method1604(0.0F, 32884, 1.0F);
            super.field6867.method1637(33984, 0);
        }
        super.field6867.method1622(8448, 8448, (byte) 124);
        OpenGL.glMatrixMode(5890);
        if (arg0 != -1756) {
            this.method158(3, (class7) null, -86);
        }
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(I)Z", line = 151)
    public final boolean method157(int arg0) {
        ++field6646;
        return arg0 == -6808;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V", line = 162)
    public static final void method2791(byte arg0) {
        ++field6641;
        if (arg0 != -67) {
            field6638 = 105;
        }
        if (class570.field7586 == null) {
            if (class450.field6276 != -1) {
                class18.method150(arg0 ^ -68);
            } else {
                class440.method2645((byte) 93, class537.field7310, class83.field1175);
            }
        } else {
            class600.method3336(arg0 ^ 19704);
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(B)V", line = 181)
    private final void method2792(byte arg0) {
        ++field6643;
        if (arg0 == 45) {
            this.field6642 = new class352(super.field6867, 2);
            this.field6642.method2218(0, false);
            super.field6867.method1637(33984, 1);
            super.field6867.method1622(260, 7681, (byte) 4);
            super.field6867.method1641(34168, 768, 0, 34192);
            OpenGL.glTexGeni(8192, 9472, 9216);
            OpenGL.glEnable(3168);
            super.field6867.method1637(33984, 0);
            OpenGL.glTexEnvf(8960, 34163, 2.0F);
            if (this.field6636.field6164) {
                OpenGL.glTexGeni(8194, 9472, 9217);
                OpenGL.glTexGeni(8195, 9472, 9217);
                OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
                OpenGL.glEnable(3170);
                OpenGL.glEnable(3171);
            }
            this.field6642.method2220(27294);
            this.field6642.method2218(1, false);
            super.field6867.method1637(33984, 1);
            super.field6867.method1622(8448, 8448, (byte) 126);
            super.field6867.method1641(5890, 768, 0, arg0 + 34147);
            OpenGL.glDisable(3168);
            super.field6867.method1637(arg0 + 33939, 0);
            OpenGL.glTexEnvf(8960, 34163, 1.0F);
            if (this.field6636.field6164) {
                OpenGL.glDisable(3170);
                OpenGL.glDisable(3171);
            }
            this.field6642.method2220(27294);
        }
    }
}
