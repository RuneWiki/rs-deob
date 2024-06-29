import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gha")
public class class497 extends class283 {

    @OriginalMember(owner = "client!gha", name = "j", descriptor = "Lrb;")
    private class401 field7148;

    @OriginalMember(owner = "client!gha", name = "o", descriptor = "Ltw;")
    private class523 field7153;

    @OriginalMember(owner = "client!gha", name = "r", descriptor = "J")
    public static long field7156 = 0L;

    @OriginalMember(owner = "client!gha", name = "l", descriptor = "I")
    public static int field7150;

    @OriginalMember(owner = "client!gha", name = "m", descriptor = "I")
    public static int field7151;

    @OriginalMember(owner = "client!gha", name = "n", descriptor = "I")
    public static int field7152;

    @OriginalMember(owner = "client!gha", name = "p", descriptor = "I")
    public static int field7154;

    @OriginalMember(owner = "client!gha", name = "q", descriptor = "I")
    public static int field7155;

    @OriginalMember(owner = "client!gha", name = "s", descriptor = "I")
    public static int field7157;

    @OriginalMember(owner = "client!gha", name = "t", descriptor = "I")
    public static int field7158;

    @OriginalMember(owner = "client!gha", name = "k", descriptor = "Ljk;")
    public static class183 field7149;

    @OriginalMember(owner = "client!gha", name = "i", descriptor = "Lla;")
    public static class423 field7147;

    @OriginalMember(owner = "client!gha", name = "<init>", descriptor = "(Lkw;Lrb;)V")
    public class497(class346 arg0, class401 arg1) {
        super(arg0);
        this.field7148 = arg1;
        this.field7153 = new class523(arg0, 2);
        this.field7153.method3184(0, 99);
        super.field3958.method2171(125, 1);
        if (this.field7148.field5748) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field3958.method2171(116, 0);
        this.field7153.method3181(true);
        this.field7153.method3184(1, -68);
        super.field3958.method2171(113, 1);
        if (this.field7148.field5748) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field3958.method2171(114, 0);
        this.field7153.method3181(true);
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(B)V")
    public final void method74(byte arg0) {
        ++field7155;
        this.field7153.method3185(127, '\u0001');
        if (arg0 != 85) {
            this.method79(false, -22, 90);
        }
        super.field3958.method2171(126, 1);
        super.field3958.method2164(arg0 + -79, (class158) null);
        super.field3958.method2171(114, 0);
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(Lou;II)V")
    public final void method75(class158 arg0, int arg1, int arg2) {
        ++field7157;
        super.field3958.method2164(arg1 ^ 4, arg0);
        super.field3958.method2120(arg2, 100);
        if (arg1 != 2) {
            this.method79(true, -12, 56);
        }
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(ZII)V")
    public final void method79(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            field7149 = null;
        }
        ++field7158;
        float var4 = (float) ((arg2 & 3) + 1) * -5.0E-4F;
        float var5 = (float) ((arg2 >> 3 & 3) + 1) * 5.0E-4F;
        float var6 = ~(arg2 & 64) == -1 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var7 = (arg2 & 128) != 0;
        super.field3958.method2171(109, 1);
        if (var7) {
            class139.field1907[2] = 0.0F;
            class139.field1907[0] = var6;
            class139.field1907[1] = 0.0F;
            class139.field1907[3] = 0.0F;
        } else {
            class139.field1907[3] = 0.0F;
            class139.field1907[2] = var6;
            class139.field1907[0] = 0.0F;
            class139.field1907[1] = 0.0F;
        }
        OpenGL.glTexGenfv(8192, 9474, class139.field1907, 0);
        class139.field1907[0] = 0.0F;
        class139.field1907[2] = 0.0F;
        class139.field1907[3] = (float) super.field3958.field4973 * var4 % 1.0F;
        class139.field1907[1] = var6;
        OpenGL.glTexGenfv(8193, 9474, class139.field1907, 0);
        if (!this.field7148.field5748) {
            int var8 = (int) ((float) super.field3958.field4973 * var5 * 16.0F);
            super.field3958.method2164(6, this.field7148.field5740[var8 % 16]);
        } else {
            class139.field1907[2] = 0.0F;
            class139.field1907[0] = 0.0F;
            class139.field1907[3] = (float) super.field3958.field4973 * var5 % 1.0F;
            class139.field1907[1] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class139.field1907, 0);
        }
        super.field3958.method2171(123, 0);
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(IIIIII)V")
    public static final void method3022(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7154;
        int var6 = class183.method1292(class377.field5458, -1, class362.field5291, arg2);
        int var7 = class183.method1292(class377.field5458, -1, class362.field5291, arg4);
        if (arg3 == 1) {
            int var8 = class183.method1292(class200.field2976, -1, class204.field3061, arg0);
            int var9 = class183.method1292(class200.field2976, arg3 ^ -2, class204.field3061, arg5);
            for (int var10 = var6; var7 >= var10; ++var10) {
                class518.method3153(var9, var8, class193.field2839[var10], -7, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(ZI)V")
    public final void method73(boolean arg0, int arg1) {
        ++field7151;
        if (arg1 != 2) {
            field7149 = null;
        }
    }

    @OriginalMember(owner = "client!gha", name = "c", descriptor = "(I)V")
    public static void method3023(int arg0) {
        field7147 = null;
        field7149 = null;
        if (arg0 != 8194) {
            method3022(102, 15, 76, 22, 63, -13);
        }
    }

    @OriginalMember(owner = "client!gha", name = "b", descriptor = "(IZ)V")
    public final void method76(int arg0, boolean arg1) {
        this.field7153.method3185(arg0 ^ -990, '\u0000');
        if (arg0 != -938) {
            this.field7148 = null;
        }
        ++field7152;
        if (this.field7148.field5748) {
            super.field3958.method2171(119, 1);
            super.field3958.method2164(6, this.field7148.field5745);
            super.field3958.method2171(123, 0);
        }
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(I)Z")
    public final boolean method77(int arg0) {
        if (arg0 < 96) {
            this.method79(false, -89, -22);
        }
        ++field7150;
        return true;
    }
}
