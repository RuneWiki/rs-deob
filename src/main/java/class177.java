import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class177 extends class648 {

    @OriginalMember(owner = "client!su", name = "f", descriptor = "Lde;")
    private class454 field2527;

    @OriginalMember(owner = "client!su", name = "h", descriptor = "Leaa;")
    private class426 field2529;

    @OriginalMember(owner = "client!su", name = "l", descriptor = "[I")
    public static int[] field2533 = new int[1];

    @OriginalMember(owner = "client!su", name = "g", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!su", name = "i", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!su", name = "j", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!su", name = "k", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!su", name = "m", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!su", name = "o", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!su", name = "p", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!su", name = "r", descriptor = "I")
    public static int field2539;

    @OriginalMember(owner = "client!su", name = "s", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!su", name = "t", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!su", name = "q", descriptor = "Lud;")
    private class31 field2538;

    @OriginalMember(owner = "client!su", name = "n", descriptor = "Ljava/lang/Object;")
    public static Object field2535;

    @OriginalMember(owner = "client!su", name = "b", descriptor = "(I)V")
    public final void method941(int arg0) {
        if (arg0 != 1) {
            this.method941(-23);
        }
        ++field2534;
        this.field2538.method317('\u0001', true);
        if (super.field9395.field8286 > 0) {
            super.field9395.method3398(-102, 1);
            super.field9395.method3358(32886, (class418) null);
            super.field9395.method3404(1.0F, -23549, 0.0F);
            super.field9395.method3398(-33, 0);
        }
        super.field9395.method3389(false, 8448, 8448);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(I)Z")
    public final boolean method946(int arg0) {
        if (arg0 < 122) {
            field2533 = null;
        }
        ++field2531;
        return true;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(BLmw;I)V")
    public final void method942(byte arg0, class418 arg1, int arg2) {
        if (arg0 != -30) {
            this.method945(82, -74, 44);
        }
        ++field2528;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(B)V")
    private final void method1123(byte arg0) {
        ++field2532;
        this.field2538 = new class31(super.field9395, 2);
        this.field2538.method320(-28457, 0);
        super.field9395.method3398(-48, 1);
        super.field9395.method3389(false, 7681, 260);
        super.field9395.method3407(0, 768, -122, 34168);
        if (arg0 < -81) {
            OpenGL.glTexGeni(8192, 9472, 9216);
            OpenGL.glEnable(3168);
            super.field9395.method3398(-91, 0);
            OpenGL.glTexEnvf(8960, 34163, 2.0F);
            if (this.field2527.field6411) {
                OpenGL.glTexGeni(8194, 9472, 9217);
                OpenGL.glTexGeni(8195, 9472, 9217);
                OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
                OpenGL.glEnable(3170);
                OpenGL.glEnable(3171);
            }
            this.field2538.method321(2);
            this.field2538.method320(-28457, 1);
            super.field9395.method3398(-100, 1);
            super.field9395.method3389(false, 8448, 8448);
            super.field9395.method3407(0, 768, -125, 5890);
            OpenGL.glDisable(3168);
            super.field9395.method3398(-71, 0);
            OpenGL.glTexEnvf(8960, 34163, 1.0F);
            if (this.field2527.field6411) {
                OpenGL.glDisable(3170);
                OpenGL.glDisable(3171);
            }
            this.field2538.method321(2);
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(BZ)V")
    public final void method944(byte arg0, boolean arg1) {
        if (arg0 >= -111) {
            this.field2529 = null;
        }
        super.field9395.method3389(false, 260, 8448);
        ++field2530;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(III)V")
    public final void method945(int arg0, int arg1, int arg2) {
        int var4 = 16 % ((30 - arg2) / 56);
        if ((arg1 & 1) == 1) {
            if (!this.field2527.field6411) {
                int var5 = super.field9395.field8202 % 4000 * 16 / 4000;
                super.field9395.method3358(32886, this.field2527.field6419[var5]);
            } else {
                super.field9395.method3358(32886, this.field2527.field6410);
                class65.field1109[3] = (float) (super.field9395.field8202 % 4000) / 4000.0F;
                class65.field1109[2] = 0.0F;
                class65.field1109[0] = 0.0F;
                class65.field1109[1] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class65.field1109, 0);
            }
        } else if (!this.field2527.field6411) {
            super.field9395.method3358(32886, this.field2527.field6419[0]);
        } else {
            super.field9395.method3358(32886, this.field2527.field6410);
            class65.field1109[0] = 0.0F;
            class65.field1109[1] = 0.0F;
            class65.field1109[3] = 0.0F;
            class65.field1109[2] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class65.field1109, 0);
        }
        ++field2539;
    }

    @OriginalMember(owner = "client!su", name = "d", descriptor = "(I)V")
    public static final void method1124(int arg0) {
        for (int var1 = 0; var1 < 100; ++var1) {
            class11.field120[var1] = null;
        }
        if (arg0 != 1) {
            field2535 = null;
        }
        ++field2536;
        class597.field8634 = 0;
    }

    @OriginalMember(owner = "client!su", name = "b", descriptor = "(B)V")
    public static void method1125(byte arg0) {
        int var1 = -36 / ((arg0 - -56) / 42);
        field2533 = null;
        field2535 = null;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IZ)V")
    public final void method947(int arg0, boolean arg1) {
        ++field2541;
        if (super.field9395.field8286 > 0) {
            float var3 = -0.5F / (float) super.field9395.field8286;
            super.field9395.method3398(arg0 + -17855, 1);
            class65.field1109[2] = var3;
            class65.field1109[3] = super.field9395.field8281 * var3 + 0.25F;
            class65.field1109[0] = 0.0F;
            class65.field1109[1] = 0.0F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class65.field1109, 0);
            OpenGL.glPopMatrix();
            super.field9395.method3404(0.5F, -23549, (float) super.field9395.field8286);
            super.field9395.method3358(32886, this.field2529);
            super.field9395.method3398(arg0 ^ -17680, 0);
        }
        this.field2538.method317('\u0000', true);
        if (arg0 == 17729) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glPushMatrix();
            OpenGL.glScalef(0.25F, 0.25F, 1.0F);
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(ID)V")
    public static final void method1126(int arg0, double arg1) {
        if (class226.field3240 != arg1) {
            for (int var3 = 0; var3 < 256; ++var3) {
                int var4 = (int) (255.0D * Math.pow((double) var3 / 255.0D, arg1));
                class75.field1194[var3] = ~var4 < -256 ? 255 : var4;
            }
            class226.field3240 = arg1;
        }
        ++field2537;
        if (arg0 != 19048) {
            field2535 = null;
        }
    }

    @OriginalMember(owner = "client!su", name = "<init>", descriptor = "(Lgi;Lde;)V")
    public class177(class583 arg0, class454 arg1) {
        super(arg0);
        this.field2527 = arg1;
        this.method1123((byte) -111);
        this.field2529 = new class426(super.field9395, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field2529.method2536(false, false);
    }
}
