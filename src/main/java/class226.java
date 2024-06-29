import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class226 extends class297 {

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "Lri;")
    private class73 field3051;

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "Liq;")
    private class429 field3058;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
    public static int field3052 = 20;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "Lup;")
    public static class179 field3055;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "Lpc;")
    public static class473 field3054;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "Lpc;")
    public static class473 field3056;

    static {
        new class304("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lnk;II)V", line = 4)
    public final void method248(class501 arg0, int arg1, int arg2) {
        super.field3881.method2980(arg0, arg1 + 124);
        if (arg1 == 0) {
            ++field3047;
            super.field3881.method2976((byte) 77, arg2);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IZ)V", line = 16)
    public final void method244(int arg0, boolean arg1) {
        if (arg0 != 0) {
            this.method246(47);
        }
        ++field3059;
        this.field3058.method2480('\u0000', ~arg0);
        if (this.field3051.field1096) {
            super.field3881.method3003(1, arg0 ^ 57);
            super.field3881.method2980(this.field3051.field1100, arg0 ^ 116);
            super.field3881.method3003(0, arg0 ^ 26);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V", line = 36)
    public final void method246(int arg0) {
        if (arg0 != 6) {
            this.field3051 = null;
        }
        this.field3058.method2480('\u0001', arg0 + -7);
        ++field3048;
        super.field3881.method3003(1, 70);
        super.field3881.method2980((class501) null, arg0 + 118);
        super.field3881.method3003(0, 70);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z)Z", line = 51)
    public final boolean method240(boolean arg0) {
        if (arg0) {
            this.method241(false, -52);
        }
        ++field3057;
        return true;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZI)V", line = 62)
    public final void method241(boolean arg0, int arg1) {
        ++field3053;
        if (arg1 != -30965) {
            field3055 = null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lbo;Lri;)V", line = 74)
    public class226(class511 arg0, class73 arg1) {
        super(arg0);
        this.field3051 = arg1;
        this.field3058 = new class429(arg0, 2);
        this.field3058.method2482(0, -47);
        super.field3881.method3003(1, 10);
        if (this.field3051.field1096) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field3881.method3003(0, 57);
        this.field3058.method2479(-16981);
        this.field3058.method2482(1, -120);
        super.field3881.method3003(1, 62);
        if (this.field3051.field1096) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field3881.method3003(0, 107);
        this.field3058.method2479(-16981);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZII)V", line = 108)
    public final void method245(boolean arg0, int arg1, int arg2) {
        ++field3050;
        float var4 = (float) ((arg2 & 3) + 1) * -5.0E-4F;
        float var5 = (float) (((27 & arg2) >> 3) + 1) * 5.0E-4F;
        float var6 = ~(64 & arg2) != -1 ? 9.765625E-4F : 4.8828125E-4F;
        boolean var7 = ~(arg2 & 128) != -1;
        super.field3881.method3003(1, 72);
        if (!var7) {
            class266.field3512[3] = 0.0F;
            class266.field3512[2] = var6;
            class266.field3512[0] = 0.0F;
            class266.field3512[1] = 0.0F;
        } else {
            class266.field3512[3] = 0.0F;
            class266.field3512[0] = var6;
            class266.field3512[1] = 0.0F;
            class266.field3512[2] = 0.0F;
        }
        OpenGL.glTexGenfv(8192, 9474, class266.field3512, 0);
        class266.field3512[1] = var6;
        class266.field3512[3] = (float) super.field3881.field7404 * var4 % 1.0F;
        class266.field3512[0] = 0.0F;
        class266.field3512[2] = 0.0F;
        OpenGL.glTexGenfv(8193, 9474, class266.field3512, 0);
        if (arg0) {
            if (this.field3051.field1096) {
                class266.field3512[3] = (float) super.field3881.field7404 * var5 % 1.0F;
                class266.field3512[0] = 0.0F;
                class266.field3512[1] = 0.0F;
                class266.field3512[2] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class266.field3512, 0);
            } else {
                int var8 = (int) ((float) super.field3881.field7404 * var5 * 16.0F);
                super.field3881.method2980(this.field3051.field1102[var8 % 16], 127);
            }
            super.field3881.method3003(0, 81);
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)V", line = 169)
    public static void method1415(int arg0) {
        field3054 = null;
        field3055 = null;
        field3056 = null;
        int var1 = 103 / ((-52 - arg0) / 33);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)V", line = 186)
    public static final void method1416(int arg0, int arg1) {
        ++field3049;
        class253 var2 = class332.method1911(arg1, (byte) -125, 10);
        var2.method1523((byte) -123);
        int var3 = 113 / ((arg0 - -20) / 49);
    }
}
