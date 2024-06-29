import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class443 extends class702 {

    @OriginalMember(owner = "client!ap", name = "u", descriptor = "Lwca;")
    private class628 field6313;

    @OriginalMember(owner = "client!ap", name = "s", descriptor = "Lqi;")
    private class525 field6311;

    @OriginalMember(owner = "client!ap", name = "x", descriptor = "Z")
    public static boolean field6316 = false;

    @OriginalMember(owner = "client!ap", name = "n", descriptor = "[B")
    public static byte[] field6306 = new byte[520];

    @OriginalMember(owner = "client!ap", name = "w", descriptor = "Lada;")
    public static class147 field6315 = new class147(0, 0);

    @OriginalMember(owner = "client!ap", name = "i", descriptor = "I")
    public static int field6301;

    @OriginalMember(owner = "client!ap", name = "j", descriptor = "I")
    public static int field6302;

    @OriginalMember(owner = "client!ap", name = "k", descriptor = "I")
    public static int field6303;

    @OriginalMember(owner = "client!ap", name = "l", descriptor = "I")
    public static int field6304;

    @OriginalMember(owner = "client!ap", name = "o", descriptor = "I")
    public static int field6307;

    @OriginalMember(owner = "client!ap", name = "p", descriptor = "I")
    public static int field6308;

    @OriginalMember(owner = "client!ap", name = "q", descriptor = "I")
    public static int field6309;

    @OriginalMember(owner = "client!ap", name = "r", descriptor = "I")
    public static int field6310;

    @OriginalMember(owner = "client!ap", name = "t", descriptor = "I")
    public static int field6312;

    @OriginalMember(owner = "client!ap", name = "v", descriptor = "I")
    public static int field6314;

    @OriginalMember(owner = "client!ap", name = "m", descriptor = "Lqt;")
    private class588 field6305;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Z)V")
    public final void method1002(boolean arg0) {
        ++field6303;
        this.field6305.method3409((byte) 122, '\u0001');
        if (!arg0) {
            this.method998(false);
        }
        if (super.field9912.field7372 > 0) {
            super.field9912.method2975(1, 126);
            super.field9912.method2932(arg0, (class197) null);
            super.field9912.method3006(1.0F, 105, 0.0F);
            super.field9912.method2975(0, 101);
        }
        super.field9912.method2948(8448, 8448, (byte) -115);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ZI)V")
    public final void method1005(boolean arg0, int arg1) {
        ++field6301;
        if (~super.field9912.field7372 < -1) {
            float var3 = -0.5F / (float) super.field9912.field7372;
            super.field9912.method2975(1, 81);
            class100.field1343[2] = var3;
            class100.field1343[1] = 0.0F;
            class100.field1343[3] = super.field9912.field7327 * var3 + 0.25F;
            class100.field1343[0] = 0.0F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class100.field1343, 0);
            OpenGL.glPopMatrix();
            super.field9912.method3006(0.5F, -97, (float) super.field9912.field7372);
            super.field9912.method2932(true, this.field6311);
            super.field9912.method2975(0, 107);
        }
        if (arg1 < -102) {
            this.field6305.method3409((byte) 126, '\u0000');
            OpenGL.glMatrixMode(5890);
            OpenGL.glPushMatrix();
            OpenGL.glScalef(0.25F, 0.25F, 1.0F);
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(B)V")
    private final void method2624(byte arg0) {
        ++field6308;
        this.field6305 = new class588(super.field9912, 2);
        this.field6305.method3405(0, (byte) 90);
        super.field9912.method2975(1, 90);
        if (arg0 < 85) {
            field6316 = false;
        }
        super.field9912.method2948(7681, 260, (byte) 7);
        super.field9912.method2968(768, 0, (byte) -106, 34168);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        super.field9912.method2975(0, 119);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field6313.field9008) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field6305.method3410(1);
        this.field6305.method3405(1, (byte) 95);
        super.field9912.method2975(1, 93);
        super.field9912.method2948(8448, 8448, (byte) -120);
        super.field9912.method2968(768, 0, (byte) -113, 5890);
        OpenGL.glDisable(3168);
        super.field9912.method2975(0, 95);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field6313.field9008) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field6305.method3410(1);
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Lkga;Lwca;)V")
    public class443(class506 arg0, class628 arg1) {
        super(arg0);
        this.field6313 = arg1;
        this.method2624((byte) 122);
        this.field6311 = new class525(super.field9912, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field6311.method3101((byte) 122, false);
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(Z)Z")
    public final boolean method998(boolean arg0) {
        if (arg0) {
            this.method1000(false, false);
        }
        ++field6304;
        return true;
    }

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "(B)V")
    public static void method2625(byte arg0) {
        field6306 = null;
        field6315 = null;
        if (arg0 < 27) {
            field6315 = null;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ZZ)V")
    public final void method1000(boolean arg0, boolean arg1) {
        ++field6312;
        super.field9912.method2948(260, 8448, (byte) -106);
        if (!arg0) {
            method2627(-74, 14);
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(III)V")
    public final void method1001(int arg0, int arg1, int arg2) {
        if ((1 & arg0) == 1) {
            if (this.field6313.field9008) {
                super.field9912.method2932(true, this.field6313.field8998);
                class100.field1343[1] = 0.0F;
                class100.field1343[0] = 0.0F;
                class100.field1343[3] = (float) (super.field9912.field7264 % 4000) / 4000.0F;
                class100.field1343[2] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class100.field1343, 0);
            } else {
                int var4 = super.field9912.field7264 % 4000 * 16 / 4000;
                super.field9912.method2932(true, this.field6313.field9004[var4]);
            }
        } else if (this.field6313.field9008) {
            super.field9912.method2932(true, this.field6313.field8998);
            class100.field1343[2] = 0.0F;
            class100.field1343[3] = 0.0F;
            class100.field1343[1] = 0.0F;
            class100.field1343[0] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class100.field1343, 0);
        } else {
            super.field9912.method2932(true, this.field6313.field9004[0]);
        }
        int var5 = 62 % ((arg1 - 55) / 36);
        ++field6314;
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(II)V")
    public static final void method2626(int arg0, int arg1) {
        int var2 = 80 % ((arg1 - -62) / 40);
        class200.field2421 = 3;
        class167.field2045 = 100;
        class523.field7669 = -1;
        ++field6309;
        class409.field5794 = arg0;
    }

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "(II)I")
    public static final int method2627(int arg0, int arg1) {
        if (arg1 != 28818) {
            method2627(-11, -102);
        }
        ++field6310;
        return arg0 & 1023;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Ljf;II)V")
    public final void method1004(class197 arg0, int arg1, int arg2) {
        if (arg2 == 58) {
            ++field6307;
        }
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(I)[I")
    public static final int[] method2628(int arg0) {
        if (arg0 != 9474) {
            field6316 = true;
        }
        ++field6302;
        return new int[] { class336.field4467, class524.field7694, class113.field1454 };
    }
}
