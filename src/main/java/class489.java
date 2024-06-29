import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public class class489 extends class387 {

    @OriginalMember(owner = "client!lda", name = "i", descriptor = "Llba;")
    private class550 field6640;

    @OriginalMember(owner = "client!lda", name = "p", descriptor = "Lb;")
    private class338 field6647;

    @OriginalMember(owner = "client!lda", name = "g", descriptor = "I")
    public static int field6638 = 0;

    @OriginalMember(owner = "client!lda", name = "l", descriptor = "I")
    public static int field6643 = 0;

    @OriginalMember(owner = "client!lda", name = "c", descriptor = "I")
    public static int field6634;

    @OriginalMember(owner = "client!lda", name = "d", descriptor = "I")
    public static int field6635;

    @OriginalMember(owner = "client!lda", name = "e", descriptor = "I")
    public static int field6636;

    @OriginalMember(owner = "client!lda", name = "f", descriptor = "I")
    public static int field6637;

    @OriginalMember(owner = "client!lda", name = "h", descriptor = "I")
    public static int field6639;

    @OriginalMember(owner = "client!lda", name = "j", descriptor = "I")
    public static int field6641;

    @OriginalMember(owner = "client!lda", name = "k", descriptor = "I")
    public static int field6642;

    @OriginalMember(owner = "client!lda", name = "m", descriptor = "I")
    public static int field6644;

    @OriginalMember(owner = "client!lda", name = "o", descriptor = "I")
    public static int field6646;

    @OriginalMember(owner = "client!lda", name = "n", descriptor = "Lvi;")
    private class540 field6645;

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(ZB)V")
    public final void method640(boolean arg0, byte arg1) {
        if (~super.field5405.field9070 < -1) {
            float var3 = -0.5F / (float) super.field5405.field9070;
            super.field5405.method3630(true, 1);
            class299.field4257[2] = var3;
            class299.field4257[0] = 0.0F;
            class299.field4257[1] = 0.0F;
            class299.field4257[3] = super.field5405.field9017 * var3 + 0.25F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class299.field4257, 0);
            OpenGL.glPopMatrix();
            super.field5405.method3601(0.5F, -1026034392, (float) super.field5405.field9070);
            super.field5405.method3639(-2, this.field6647);
            super.field5405.method3630(true, 0);
        }
        ++field6637;
        this.field6645.method3013((byte) 59, '\u0000');
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        if (arg1 > 1) {
            OpenGL.glScalef(0.25F, 0.25F, 1.0F);
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(I)Z")
    public final boolean method641(int arg0) {
        if (arg0 != -16777216) {
            this.field6647 = null;
        }
        ++field6644;
        return true;
    }

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "(Z)V")
    private final void method2773(boolean arg0) {
        this.field6645 = new class540(super.field5405, 2);
        ++field6636;
        this.field6645.method3012(-115, 0);
        super.field5405.method3630(arg0, 1);
        super.field5405.method3608(124, 260, 7681);
        super.field5405.method3661(768, 34168, 0, (byte) 4);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        super.field5405.method3630(true, 0);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field6640.field7264) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field6645.method3015((byte) 26);
        this.field6645.method3012(-102, 1);
        super.field5405.method3630(true, 1);
        super.field5405.method3608(-110, 8448, 8448);
        super.field5405.method3661(768, 5890, 0, (byte) 4);
        OpenGL.glDisable(3168);
        super.field5405.method3630(true, 0);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field6640.field7264) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field6645.method3015((byte) 26);
        if (!arg0) {
            field6638 = -28;
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(Z)V")
    public final void method644(boolean arg0) {
        ++field6641;
        this.field6645.method3013((byte) 71, '\u0001');
        if (arg0) {
            method2774(58, 124);
        }
        if (super.field5405.field9070 > 0) {
            super.field5405.method3630(true, 1);
            super.field5405.method3639(-2, (class460) null);
            super.field5405.method3601(1.0F, -1026034392, 0.0F);
            super.field5405.method3630(true, 0);
        }
        super.field5405.method3608(120, 8448, 8448);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!lda", name = "<init>", descriptor = "(Lrda;Llba;)V")
    public class489(class663 arg0, class550 arg1) {
        super(arg0);
        this.field6640 = arg1;
        this.method2773(true);
        this.field6647 = new class338(super.field5405, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field6647.method2031(-11983, false);
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(II)V")
    public static final void method2774(int arg0, int arg1) {
        ++field6639;
        class127 var2 = class760.method4231(arg1, -874792672, 17);
        var2.method1002(-114);
        if (arg0 > -112) {
            field6638 = 82;
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(III)V")
    public final void method643(int arg0, int arg1, int arg2) {
        ++field6635;
        int var4 = -27 / ((arg2 - 74) / 36);
        if (~(1 & arg0) == -2) {
            if (this.field6640.field7264) {
                super.field5405.method3639(-2, this.field6640.field7265);
                class299.field4257[3] = (float) (super.field5405.field8949 % 4000) / 4000.0F;
                class299.field4257[2] = 0.0F;
                class299.field4257[1] = 0.0F;
                class299.field4257[0] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class299.field4257, 0);
            } else {
                int var5 = super.field5405.field8949 % 4000 * 16 / 4000;
                super.field5405.method3639(-2, this.field6640.field7266[var5]);
            }
        } else if (!this.field6640.field7264) {
            super.field5405.method3639(-2, this.field6640.field7266[0]);
        } else {
            super.field5405.method3639(-2, this.field6640.field7265);
            class299.field4257[1] = 0.0F;
            class299.field4257[3] = 0.0F;
            class299.field4257[0] = 0.0F;
            class299.field4257[2] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class299.field4257, 0);
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(BILiga;)V")
    public final void method638(byte arg0, int arg1, class460 arg2) {
        ++field6642;
        if (arg0 < 53) {
            this.method641(75);
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(BZ)V")
    public final void method639(byte arg0, boolean arg1) {
        if (arg0 <= -123) {
            super.field5405.method3608(120, 8448, 260);
            ++field6646;
        }
    }
}
