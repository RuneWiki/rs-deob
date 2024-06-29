import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class300 extends class675 {

    @OriginalMember(owner = "client!ao", name = "j", descriptor = "Lb;")
    private class350 field4514;

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "Lph;")
    private class668 field4512;

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "Lke;")
    public static class622 field4510 = new class622(98, 6);

    @OriginalMember(owner = "client!ao", name = "k", descriptor = "Lke;")
    public static class622 field4515 = new class622(15, 8);

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!ao", name = "i", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!ao", name = "l", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!ao", name = "o", descriptor = "I")
    public static int field4519;

    @OriginalMember(owner = "client!ao", name = "m", descriptor = "Lee;")
    private class703 field4517;

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "[I")
    public static int[] field4511;

    @OriginalMember(owner = "client!ao", name = "n", descriptor = "[Lqda;")
    public static class112[] field4518;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lfia;IZ)V", line = 3)
    public final void method1348(class599 arg0, int arg1, boolean arg2) {
        if (arg2) {
            ++field4519;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(ZI)V", line = 15)
    public final void method1354(boolean arg0, int arg1) {
        ++field4507;
        if (super.field9618.field4221 > 0) {
            float var3 = -0.5F / (float) super.field9618.field4221;
            super.field9618.method1825(1, 119);
            class593.field8364[3] = super.field9618.field4238 * var3 + 0.25F;
            class593.field8364[2] = var3;
            class593.field8364[0] = 0.0F;
            class593.field8364[1] = 0.0F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class593.field8364, 0);
            OpenGL.glPopMatrix();
            super.field9618.method1860(7681, (float) super.field9618.field4221, 0.5F);
            super.field9618.method1840(this.field4512, arg1 ^ -26658);
            super.field9618.method1825(0, -6);
        }
        this.field4517.method3982((byte) -120, '\u0000');
        if (arg1 != -24765) {
            field4518 = null;
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(0.25F, 0.25F, 1.0F);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(ZZ)V", line = 49)
    public final void method1350(boolean arg0, boolean arg1) {
        ++field4509;
        super.field9618.method1835(arg1, 260, 8448);
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "(B)V", line = 58)
    public static void method1999(byte arg0) {
        field4515 = null;
        field4510 = null;
        field4511 = null;
        if (arg0 != -112) {
            method1999((byte) 72);
        }
        field4518 = null;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)V", line = 71)
    public final void method1353(byte arg0) {
        if (arg0 == 52) {
            ++field4508;
            this.field4517.method3982((byte) -120, '\u0001');
            if (~super.field9618.field4221 < -1) {
                super.field9618.method1825(1, -83);
                super.field9618.method1840((class599) null, 2205);
                super.field9618.method1860(7681, 0.0F, 1.0F);
                super.field9618.method1825(0, -91);
            }
            super.field9618.method1835(false, 8448, 8448);
            OpenGL.glMatrixMode(5890);
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V", line = 95)
    private final void method2000(int arg0) {
        ++field4506;
        this.field4517 = new class703(super.field9618, 2);
        this.field4517.method3980(0, -27400);
        super.field9618.method1825(1, arg0 ^ -418);
        super.field9618.method1835(false, 7681, 260);
        super.field9618.method1842(768, -110, 0, 34168);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        super.field9618.method1825(0, -93);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field4514.field5113) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field4517.method3978(arg0 + 469);
        this.field4517.method3980(1, -27400);
        super.field9618.method1825(1, 120);
        super.field9618.method1835(false, 8448, 8448);
        super.field9618.method1842(768, -86, 0, 5890);
        OpenGL.glDisable(3168);
        super.field9618.method1825(0, -65);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field4514.field5113) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        if (arg0 == -469) {
            this.field4517.method3978(0);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(III)V", line = 138)
    public final void method1351(int arg0, int arg1, int arg2) {
        if ((arg0 & 1) != 1) {
            if (!this.field4514.field5113) {
                super.field9618.method1840(this.field4514.field5109[0], 2205);
            } else {
                super.field9618.method1840(this.field4514.field5108, 2205);
                class593.field8364[1] = 0.0F;
                class593.field8364[2] = 0.0F;
                class593.field8364[0] = 0.0F;
                class593.field8364[3] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class593.field8364, 0);
            }
        } else if (!this.field4514.field5113) {
            int var4 = super.field9618.field4167 % 4000 * 16 / 4000;
            super.field9618.method1840(this.field4514.field5109[var4], 2205);
        } else {
            super.field9618.method1840(this.field4514.field5108, 2205);
            class593.field8364[0] = 0.0F;
            class593.field8364[3] = (float) (super.field9618.field4167 % 4000) / 4000.0F;
            class593.field8364[1] = 0.0F;
            class593.field8364[2] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class593.field8364, 0);
        }
        if (arg1 != 8865) {
            this.method1353((byte) 124);
        }
        ++field4513;
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lkv;Lb;)V", line = 183)
    public class300(class280 arg0, class350 arg1) {
        super(arg0);
        this.field4514 = arg1;
        this.method2000(-469);
        this.field4512 = new class668(super.field9618, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field4512.method3796(false, 10497);
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(B)Z", line = 202)
    public final boolean method1347(byte arg0) {
        ++field4516;
        return arg0 >= 105;
    }
}
