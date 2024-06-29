import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public class class491 extends class592 {

    @OriginalMember(owner = "client!sda", name = "r", descriptor = "Lpm;")
    private class553 field6507;

    @OriginalMember(owner = "client!sda", name = "n", descriptor = "Lak;")
    private class681 field6503;

    @OriginalMember(owner = "client!sda", name = "o", descriptor = "Lra;")
    public static class361 field6504 = new class361(16, -2);

    @OriginalMember(owner = "client!sda", name = "t", descriptor = "Lbc;")
    public static class9 field6509 = new class9(16);

    @OriginalMember(owner = "client!sda", name = "x", descriptor = "Lcr;")
    public static class162 field6513 = new class162(0, -1);

    @OriginalMember(owner = "client!sda", name = "w", descriptor = "F")
    public static float field6512;

    @OriginalMember(owner = "client!sda", name = "h", descriptor = "I")
    public static int field6497;

    @OriginalMember(owner = "client!sda", name = "i", descriptor = "I")
    public static int field6498;

    @OriginalMember(owner = "client!sda", name = "j", descriptor = "I")
    public static int field6499;

    @OriginalMember(owner = "client!sda", name = "k", descriptor = "I")
    public static int field6500;

    @OriginalMember(owner = "client!sda", name = "m", descriptor = "I")
    public static int field6502;

    @OriginalMember(owner = "client!sda", name = "p", descriptor = "I")
    public static int field6505;

    @OriginalMember(owner = "client!sda", name = "q", descriptor = "I")
    public static int field6506;

    @OriginalMember(owner = "client!sda", name = "s", descriptor = "I")
    public static int field6508;

    @OriginalMember(owner = "client!sda", name = "u", descriptor = "I")
    public static int field6510;

    @OriginalMember(owner = "client!sda", name = "v", descriptor = "Loo;")
    public static class10 field6511;

    @OriginalMember(owner = "client!sda", name = "l", descriptor = "Luj;")
    private class554 field6501;

    @OriginalMember(owner = "client!sda", name = "<init>", descriptor = "(Lji;Lpm;)V", line = 5)
    public class491(class622 arg0, class553 arg1) {
        super(arg0);
        this.field6507 = arg1;
        this.method2686(86);
        this.field6503 = new class681(super.field8014, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field6503.method3744((byte) -84, false);
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(IZ)V", line = 17)
    public final void method32(int arg0, boolean arg1) {
        if (arg0 > ~super.field8014.field8647) {
            float var3 = -0.5F / (float) super.field8014.field8647;
            super.field8014.method3469(1, false);
            class428.field5547[2] = var3;
            class428.field5547[0] = 0.0F;
            class428.field5547[1] = 0.0F;
            class428.field5547[3] = super.field8014.field8606 * var3 + 0.25F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class428.field5547, 0);
            OpenGL.glPopMatrix();
            super.field8014.method3437((float) super.field8014.field8647, arg0 ^ 28949, 0.5F);
            super.field8014.method3388(this.field6503, false);
            super.field8014.method3469(0, false);
        }
        ++field6499;
        this.field6501.method2973(arg0 + 26498, '\u0000');
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(0.25F, 0.25F, 1.0F);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(I)V", line = 47)
    public final void method29(int arg0) {
        ++field6510;
        this.field6501.method2973(26497, '\u0001');
        if (super.field8014.field8647 > 0) {
            super.field8014.method3469(1, false);
            super.field8014.method3388((class710) null, false);
            super.field8014.method3437(0.0F, arg0 + -27310, 1.0F);
            super.field8014.method3469(0, false);
        }
        if (arg0 != -1640) {
            field6513 = null;
        }
        super.field8014.method3462(8448, -5882, 8448);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!sda", name = "c", descriptor = "(B)V", line = 71)
    public static void method2683(byte arg0) {
        field6509 = null;
        field6504 = null;
        field6513 = null;
        if (arg0 <= 122) {
            field6513 = null;
        }
        field6511 = null;
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(ZII)V", line = 87)
    public final void method33(boolean arg0, int arg1, int arg2) {
        if (~(arg1 & 1) != -2) {
            if (!this.field6507.field7243) {
                super.field8014.method3388(this.field6507.field7242[0], false);
            } else {
                super.field8014.method3388(this.field6507.field7236, false);
                class428.field5547[1] = 0.0F;
                class428.field5547[3] = 0.0F;
                class428.field5547[0] = 0.0F;
                class428.field5547[2] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class428.field5547, 0);
            }
        } else if (!this.field6507.field7243) {
            int var4 = super.field8014.field8566 % 4000 * 16 / 4000;
            super.field8014.method3388(this.field6507.field7242[var4], arg0);
        } else {
            super.field8014.method3388(this.field6507.field7236, false);
            class428.field5547[2] = 0.0F;
            class428.field5547[1] = 0.0F;
            class428.field5547[3] = (float) (super.field8014.field8566 % 4000) / 4000.0F;
            class428.field5547[0] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class428.field5547, 0);
        }
        ++field6505;
        if (arg0) {
            this.method27(true, (byte) 52);
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(IBI)Z", line = 133)
    public static final boolean method2684(int arg0, byte arg1, int arg2) {
        if (arg1 != 5) {
            return false;
        } else {
            ++field6508;
            return ~(540800 & arg2) != -1;
        }
    }

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "(III)V", line = 146)
    public static final void method2685(int arg0, int arg1, int arg2) {
        ++field6497;
        if (arg1 != 2626) {
            field6509 = null;
        }
        if (class152.method1106(arg1 + -2544, arg2)) {
            class597.method3234(arg0, class322.field4179[arg2], (byte) -57);
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(ZB)V", line = 160)
    public final void method27(boolean arg0, byte arg1) {
        ++field6502;
        super.field8014.method3462(8448, -5882, 260);
        if (arg1 >= -67) {
            this.method33(false, -108, 88);
        }
    }

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "(I)V", line = 172)
    private final void method2686(int arg0) {
        this.field6501 = new class554(super.field8014, 2);
        ++field6506;
        this.field6501.method2971(0, 4864);
        super.field8014.method3469(1, false);
        super.field8014.method3462(260, -5882, 7681);
        super.field8014.method3453(false, 768, 34168, 0);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        int var2 = -121 / ((-32 - arg0) / 38);
        super.field8014.method3469(0, false);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field6507.field7243) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field6501.method2969((byte) -44);
        this.field6501.method2971(1, 4864);
        super.field8014.method3469(1, false);
        super.field8014.method3462(8448, -5882, 8448);
        super.field8014.method3453(false, 768, 5890, 0);
        OpenGL.glDisable(3168);
        super.field8014.method3469(0, false);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field6507.field7243) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field6501.method2969((byte) -29);
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(IILgq;)V", line = 216)
    public final void method35(int arg0, int arg1, class710 arg2) {
        ++field6498;
        if (arg1 != 458752) {
            field6511 = null;
        }
    }

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "(B)Z", line = 226)
    public final boolean method30(byte arg0) {
        ++field6500;
        if (arg0 > -90) {
            this.field6507 = null;
        }
        return true;
    }
}
