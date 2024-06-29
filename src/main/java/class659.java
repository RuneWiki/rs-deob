import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class659 extends class345 {

    @OriginalMember(owner = "client!qp", name = "r", descriptor = "Llha;")
    private class626 field9186;

    @OriginalMember(owner = "client!qp", name = "g", descriptor = "Lvh;")
    private class363 field9175;

    @OriginalMember(owner = "client!qp", name = "q", descriptor = "[I")
    public static int[] field9185 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!qp", name = "p", descriptor = "[I")
    public static int[] field9184 = new int[8];

    @OriginalMember(owner = "client!qp", name = "f", descriptor = "I")
    public static int field9174;

    @OriginalMember(owner = "client!qp", name = "h", descriptor = "I")
    public static int field9176;

    @OriginalMember(owner = "client!qp", name = "i", descriptor = "I")
    public static int field9177;

    @OriginalMember(owner = "client!qp", name = "k", descriptor = "I")
    public static int field9179;

    @OriginalMember(owner = "client!qp", name = "l", descriptor = "I")
    public static int field9180;

    @OriginalMember(owner = "client!qp", name = "m", descriptor = "I")
    public static int field9181;

    @OriginalMember(owner = "client!qp", name = "n", descriptor = "I")
    public static int field9182;

    @OriginalMember(owner = "client!qp", name = "o", descriptor = "I")
    public static int field9183;

    @OriginalMember(owner = "client!qp", name = "j", descriptor = "Lnd;")
    public static class547 field9178;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)Z", line = 3)
    public final boolean method38(int arg0) {
        ++field9182;
        if (arg0 != 50560) {
            field9178 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(ZII)V", line = 18)
    public final void method37(boolean arg0, int arg1, int arg2) {
        ++field9183;
        float var4 = (float) ((arg2 & 3) - -1) * -5.0E-4F;
        float var5 = (float) (((arg2 & 31) >> 3) + 1) * 5.0E-4F;
        float var6 = ~(64 & arg2) != -1 ? 9.765625E-4F : 4.8828125E-4F;
        boolean var7 = ~(128 & arg2) != -1;
        super.field4357.method2847(1, false);
        if (var7) {
            class302.field3959[3] = 0.0F;
            class302.field3959[2] = 0.0F;
            class302.field3959[1] = 0.0F;
            class302.field3959[0] = var6;
        } else {
            class302.field3959[3] = 0.0F;
            class302.field3959[1] = 0.0F;
            class302.field3959[0] = 0.0F;
            class302.field3959[2] = var6;
        }
        OpenGL.glTexGenfv(8192, 9474, class302.field3959, 0);
        class302.field3959[0] = 0.0F;
        if (!arg0) {
            method3710(40);
        }
        class302.field3959[3] = (float) super.field4357.field6780 * var4 % 1.0F;
        class302.field3959[2] = 0.0F;
        class302.field3959[1] = var6;
        OpenGL.glTexGenfv(8193, 9474, class302.field3959, 0);
        if (!this.field9186.field8605) {
            int var8 = (int) ((float) super.field4357.field6780 * var5 * 16.0F);
            super.field4357.method2850(-57, this.field9186.field8604[var8 % 16]);
        } else {
            class302.field3959[2] = 0.0F;
            class302.field3959[0] = 0.0F;
            class302.field3959[1] = 0.0F;
            class302.field3959[3] = (float) super.field4357.field6780 * var5 % 1.0F;
            OpenGL.glTexGenfv(8194, 9473, class302.field3959, 0);
        }
        super.field4357.method2847(0, !arg0);
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IILcj;)V", line = 75)
    public final void method36(int arg0, int arg1, class695 arg2) {
        super.field4357.method2850(-84, arg2);
        ++field9180;
        if (arg0 != 50560) {
            this.method37(false, -4, -83);
        }
        super.field4357.method2800(arg1, -61);
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lnd;Lbl;ZLnd;Lnd;Lcea;)Z", line = 89)
    public static final boolean method3709(class547 arg0, class651 arg1, boolean arg2, class547 arg3, class547 arg4, class216 arg5) {
        class417.field5328 = arg3;
        class101.field1394 = arg1;
        ++field9177;
        class172.field2382 = arg4;
        class267.field3366 = arg0;
        class718.field10003 = new int[16];
        class126.field1799 = arg5;
        int var6 = 0;
        if (!arg2) {
            method3709((class547) null, (class651) null, false, (class547) null, (class547) null, (class216) null);
        }
        while (~var6 > -17) {
            class718.field10003[var6] = 255;
            ++var6;
        }
        return true;
    }

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Lbi;Llha;)V", line = 117)
    public class659(class483 arg0, class626 arg1) {
        super(arg0);
        this.field9186 = arg1;
        this.field9175 = new class363(arg0, 2);
        this.field9175.method2097(0, -80);
        super.field4357.method2847(1, false);
        if (this.field9186.field8605) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field4357.method2847(0, false);
        this.field9175.method2100(-60);
        this.field9175.method2097(1, -83);
        super.field4357.method2847(1, false);
        if (this.field9186.field8605) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field4357.method2847(0, false);
        this.field9175.method2100(-55);
    }

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "(I)V", line = 150)
    public static void method3710(int arg0) {
        field9178 = null;
        if (arg0 < 120) {
            field9184 = null;
        }
        field9184 = null;
        field9185 = null;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(ZI)V", line = 162)
    public final void method40(boolean arg0, int arg1) {
        ++field9181;
        if (arg1 != 50560) {
            this.field9186 = null;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(B)V", line = 173)
    public final void method41(byte arg0) {
        int var2 = -64 / ((60 - arg0) / 60);
        ++field9176;
        this.field9175.method2099('\u0001', -115);
        super.field4357.method2847(1, false);
        super.field4357.method2850(-88, (class695) null);
        super.field4357.method2847(0, false);
    }

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "(I)Llk;", line = 186)
    public static final class589 method3711(int arg0) {
        ++field9179;
        return class471.field6321 == arg0 ? new class589() : class85.field1175[--class471.field6321];
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(ZB)V", line = 206)
    public final void method34(boolean arg0, byte arg1) {
        ++field9174;
        this.field9175.method2099('\u0000', -107);
        if (this.field9186.field8605) {
            super.field4357.method2847(1, false);
            super.field4357.method2850(111, this.field9186.field8606);
            super.field4357.method2847(0, false);
        }
        if (arg1 != -82) {
            method3709((class547) null, (class651) null, false, (class547) null, (class547) null, (class216) null);
        }
    }
}
