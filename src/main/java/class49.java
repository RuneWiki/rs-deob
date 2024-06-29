import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class49 extends class457 {

    @OriginalMember(owner = "client!qh", name = "v", descriptor = "Lmc;")
    private class88 field588;

    @OriginalMember(owner = "client!qh", name = "p", descriptor = "Ldk;")
    private class353 field582;

    @OriginalMember(owner = "client!qh", name = "n", descriptor = "Lwj;")
    public static class270 field580 = new class270(73, 6);

    @OriginalMember(owner = "client!qh", name = "y", descriptor = "Ldi;")
    public static class83 field591 = new class83(79, 8);

    @OriginalMember(owner = "client!qh", name = "z", descriptor = "[I")
    public static int[] field592 = new int[6];

    @OriginalMember(owner = "client!qh", name = "m", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!qh", name = "o", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!qh", name = "q", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!qh", name = "r", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!qh", name = "s", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!qh", name = "t", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!qh", name = "u", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!qh", name = "w", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!qh", name = "x", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!qh", name = "A", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "Lih;")
    private class492 field578;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)I")
    public static final int method428(int arg0, int arg1) {
        ++field590;
        return arg1 != 872959912 ? 38 : arg0 >>> 8;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)Z")
    public final boolean method429(int arg0) {
        ++field579;
        if (arg0 != 0) {
            this.method430(-114, 65, false);
        }
        return true;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIZ)V")
    public final void method430(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field592 = null;
        }
        if (~(1 & arg1) == -2) {
            if (!this.field588.field1289) {
                int var4 = super.field6706.field4743 % 4000 * 16 / 4000;
                super.field6706.method1996(2, this.field588.field1284[var4]);
            } else {
                super.field6706.method1996(2, this.field588.field1280);
                class409.field5979[3] = (float) (super.field6706.field4743 % 4000) / 4000.0F;
                class409.field5979[1] = 0.0F;
                class409.field5979[0] = 0.0F;
                class409.field5979[2] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class409.field5979, 0);
            }
        } else if (this.field588.field1289) {
            super.field6706.method1996(2, this.field588.field1280);
            class409.field5979[3] = 0.0F;
            class409.field5979[0] = 0.0F;
            class409.field5979[2] = 0.0F;
            class409.field5979[1] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class409.field5979, 0);
        } else {
            super.field6706.method1996(2, this.field588.field1284[0]);
        }
        ++field593;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lmk;II)V")
    public final void method431(class40 arg0, int arg1, int arg2) {
        ++field589;
        if (arg1 != 384) {
            method428(125, -25);
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(B)V")
    public static void method432(byte arg0) {
        field580 = null;
        if (arg0 == -1) {
            field591 = null;
            field592 = null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)V")
    public final void method433(byte arg0) {
        this.field578.method2881(arg0 + -8, '\u0001');
        ++field584;
        if (arg0 != 8) {
            this.method431((class40) null, -47, -31);
        }
        if (~super.field6706.field4844 < -1) {
            super.field6706.method1950(-29847, 1);
            super.field6706.method1996(2, (class40) null);
            super.field6706.method1930((byte) -85, 0.0F, 1.0F);
            super.field6706.method1950(arg0 ^ -29855, 0);
        }
        super.field6706.method1963(true, 8448, 8448);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IZ)V")
    public final void method434(int arg0, boolean arg1) {
        if (super.field6706.field4844 > 0) {
            float var3 = -0.5F / (float) super.field6706.field4844;
            super.field6706.method1950(-29847, 1);
            class409.field5979[0] = 0.0F;
            class409.field5979[2] = var3;
            class409.field5979[3] = super.field6706.field4823 * var3 + 0.25F;
            class409.field5979[1] = 0.0F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class409.field5979, 0);
            OpenGL.glPopMatrix();
            super.field6706.method1930((byte) -51, (float) super.field6706.field4844, 0.5F);
            super.field6706.method1996(2, this.field582);
            super.field6706.method1950(-29847, 0);
        }
        ++field581;
        if (arg0 == 28037) {
            this.field578.method2881(arg0 + -28037, '\u0000');
            OpenGL.glMatrixMode(5890);
            OpenGL.glPushMatrix();
            OpenGL.glScalef(0.25F, 0.25F, 1.0F);
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZB)V")
    public final void method435(boolean arg0, byte arg1) {
        super.field6706.method1963(true, 260, 8448);
        ++field583;
        if (arg1 <= 32) {
            this.field588 = null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "(I)V")
    public static final void method436(int arg0) {
        class225.field3205.method1066(arg0 ^ 12272);
        ++field585;
        class89.field1301.method1066(4080);
        if (arg0 == 8192) {
            class74.field1005.method1066(4080);
            class88.field1287.method1066(4080);
            class446.field6572.method1066(4080);
        }
    }

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "(I)V")
    private final void method437(int arg0) {
        ++field587;
        this.field578 = new class492(super.field6706, 2);
        this.field578.method2884(arg0 + 4864, 0);
        super.field6706.method1950(-29847, 1);
        super.field6706.method1963(true, 7681, 260);
        super.field6706.method1975(34176, 34168, 768, arg0);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        super.field6706.method1950(-29847, 0);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field588.field1289) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field578.method2883(-30137);
        this.field578.method2884(4864, 1);
        super.field6706.method1950(-29847, 1);
        super.field6706.method1963(true, 8448, 8448);
        super.field6706.method1975(34176, 5890, 768, 0);
        OpenGL.glDisable(3168);
        super.field6706.method1950(-29847, 0);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field588.field1289) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field578.method2883(-30137);
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lef;Lmc;)V")
    public class49(class338 arg0, class88 arg1) {
        super(arg0);
        this.field588 = arg1;
        this.method437(0);
        this.field582 = new class353(super.field6706, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field582.method2116(false, (byte) -20);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method438(String arg0, byte arg1) {
        class310.method1795(0, 0, "", "", 12406, arg0);
        if (arg1 <= -65) {
            ++field586;
        }
    }
}
