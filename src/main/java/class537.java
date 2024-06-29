import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class537 extends class605 {

    @OriginalMember(owner = "client!gu", name = "e", descriptor = "Lsda;")
    private class232 field7518;

    @OriginalMember(owner = "client!gu", name = "g", descriptor = "Lhg;")
    private class642 field7520;

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "I")
    public static int field7517;

    @OriginalMember(owner = "client!gu", name = "f", descriptor = "I")
    public static int field7519;

    @OriginalMember(owner = "client!gu", name = "h", descriptor = "I")
    public static int field7521;

    @OriginalMember(owner = "client!gu", name = "i", descriptor = "I")
    public static int field7522;

    @OriginalMember(owner = "client!gu", name = "j", descriptor = "I")
    public static int field7523;

    @OriginalMember(owner = "client!gu", name = "k", descriptor = "I")
    public static int field7524;

    @OriginalMember(owner = "client!gu", name = "l", descriptor = "I")
    public static int field7525;

    @OriginalMember(owner = "client!gu", name = "m", descriptor = "I")
    public static int field7526;

    @OriginalMember(owner = "client!gu", name = "n", descriptor = "I")
    public static int field7527;

    @OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Lok;Lsda;)V", line = 4)
    public class537(class228 arg0, class232 arg1) {
        super(arg0);
        this.field7518 = arg1;
        this.field7520 = new class642(arg0, 2);
        this.field7520.method3579((byte) -104, 0);
        super.field8542.method1500(33984, 1);
        if (this.field7518.field3609) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field8542.method1500(33984, 0);
        this.field7520.method3577((byte) -93);
        this.field7520.method3579((byte) -114, 1);
        super.field8542.method1500(33984, 1);
        if (this.field7518.field3609) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field8542.method1500(33984, 0);
        this.field7520.method3577((byte) -65);
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(Z)Z", line = 38)
    public final boolean method48(boolean arg0) {
        if (arg0) {
            this.method45(4);
        }
        ++field7523;
        return true;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZI)V", line = 50)
    public final void method51(boolean arg0, int arg1) {
        ++field7525;
        if (arg1 > -127) {
            this.method45(-40);
        }
        this.field7520.method3574(90, '\u0000');
        if (this.field7518.field3609) {
            super.field8542.method1500(33984, 1);
            super.field8542.method1505(-2, this.field7518.field3620);
            super.field8542.method1500(33984, 0);
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILip;I)V", line = 70)
    public final void method43(int arg0, class657 arg1, int arg2) {
        super.field8542.method1505(-2, arg1);
        ++field7522;
        if (arg2 != 0) {
            this.field7518 = null;
        }
        super.field8542.method1497(arg0, (byte) -29);
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIII)I", line = 83)
    public static final int method3051(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -10168) {
            method3052(false);
        }
        ++field7527;
        if (arg3 <= arg1) {
            return arg2 >= arg1 ? arg1 : arg2;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IZI)V", line = 98)
    public final void method47(int arg0, boolean arg1, int arg2) {
        ++field7519;
        if (!arg1) {
            float var4 = (float) ((3 & arg0) + 1) * -5.0E-4F;
            float var5 = (float) (((24 & arg0) >> 3) + 1) * 5.0E-4F;
            float var6 = (arg0 & 64) != 0 ? 9.765625E-4F : 4.8828125E-4F;
            super.field8542.method1500(33984, 1);
            boolean var7 = (128 & arg0) != 0;
            if (!var7) {
                class334.field4949[3] = 0.0F;
                class334.field4949[0] = 0.0F;
                class334.field4949[2] = var6;
                class334.field4949[1] = 0.0F;
            } else {
                class334.field4949[2] = 0.0F;
                class334.field4949[1] = 0.0F;
                class334.field4949[0] = var6;
                class334.field4949[3] = 0.0F;
            }
            OpenGL.glTexGenfv(8192, 9474, class334.field4949, 0);
            class334.field4949[1] = var6;
            class334.field4949[2] = 0.0F;
            class334.field4949[0] = 0.0F;
            class334.field4949[3] = (float) super.field8542.field3405 * var4 % 1.0F;
            OpenGL.glTexGenfv(8193, 9474, class334.field4949, 0);
            if (this.field7518.field3609) {
                class334.field4949[0] = 0.0F;
                class334.field4949[2] = 0.0F;
                class334.field4949[3] = (float) super.field8542.field3405 * var5 % 1.0F;
                class334.field4949[1] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class334.field4949, 0);
            } else {
                int var8 = (int) ((float) super.field8542.field3405 * var5 * 16.0F);
                super.field8542.method1505(-2, this.field7518.field3617[var8 % 16]);
            }
            super.field8542.method1500(33984, 0);
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)V", line = 159)
    public final void method45(int arg0) {
        ++field7517;
        this.field7520.method3574(114, '\u0001');
        super.field8542.method1500(arg0 ^ 33984, 1);
        super.field8542.method1505(-2, (class657) null);
        super.field8542.method1500(33984, arg0);
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(Z)V", line = 170)
    public static final void method3052(boolean arg0) {
        ++field7526;
        if (arg0) {
            method3051(-111, 75, 63, 90);
        }
        for (int var1 = 0; class8.field83 > var1; ++var1) {
            class603 var2 = class106.field1642[var1];
            if (~var2.field8517 == -4) {
                if (var2.field8519 != null) {
                    class627.field8780.method2114(var2.field8519);
                } else {
                    var2.field8520 = Integer.MIN_VALUE;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZB)V", line = 200)
    public final void method46(boolean arg0, byte arg1) {
        ++field7524;
        if (arg1 > -16) {
            this.field7518 = null;
        }
    }
}
