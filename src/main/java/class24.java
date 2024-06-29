import jaggl.OpenGL;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public class class24 extends class140 {

    @OriginalMember(owner = "client!fba", name = "l", descriptor = "Lwq;")
    private class146 field228;

    @OriginalMember(owner = "client!fba", name = "s", descriptor = "Lwl;")
    private class348 field235;

    @OriginalMember(owner = "client!fba", name = "j", descriptor = "Z")
    public static boolean field226 = true;

    @OriginalMember(owner = "client!fba", name = "o", descriptor = "Lada;")
    public static class144 field231 = new class144(42, 3);

    @OriginalMember(owner = "client!fba", name = "v", descriptor = "[I")
    public static int[] field238 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!fba", name = "g", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!fba", name = "h", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!fba", name = "i", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!fba", name = "m", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!fba", name = "n", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!fba", name = "p", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!fba", name = "q", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!fba", name = "r", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!fba", name = "t", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!fba", name = "u", descriptor = "Ldj;")
    public static class289 field237;

    @OriginalMember(owner = "client!fba", name = "k", descriptor = "[Lmn;")
    public static class309[] field227;

    @OriginalMember(owner = "client!fba", name = "d", descriptor = "(I)V", line = 3)
    public static void method142(int arg0) {
        field231 = null;
        if (arg0 != -17491) {
            method142(-26);
        }
        field238 = null;
        field237 = null;
        field227 = null;
    }

    @OriginalMember(owner = "client!fba", name = "c", descriptor = "(I)V", line = 19)
    public final void method143(int arg0) {
        this.field235.method2110('\u0001', (byte) -127);
        if (arg0 == -7) {
            ++field229;
            super.field1984.method3111(33984, 1);
            super.field1984.method3152(arg0 + 5, (class228) null);
            super.field1984.method3111(33984, 0);
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(III)V", line = 33)
    public final void method144(int arg0, int arg1, int arg2) {
        ++field233;
        float var4 = (float) ((arg2 & 3) - -1) * -5.0E-4F;
        float var5 = (float) ((3 & arg2 >> 3) - -1) * 5.0E-4F;
        float var6 = (64 & arg2) != 0 ? 9.765625E-4F : 4.8828125E-4F;
        boolean var7 = ~(128 & arg2) != -1;
        super.field1984.method3111(33984, 1);
        if (var7) {
            class79.field1062[2] = 0.0F;
            class79.field1062[3] = 0.0F;
            class79.field1062[0] = var6;
            class79.field1062[1] = 0.0F;
        } else {
            class79.field1062[1] = 0.0F;
            class79.field1062[3] = 0.0F;
            class79.field1062[2] = var6;
            class79.field1062[0] = 0.0F;
        }
        OpenGL.glTexGenfv(8192, 9474, class79.field1062, 0);
        class79.field1062[3] = (float) super.field1984.field7747 * var4 % 1.0F;
        class79.field1062[2] = 0.0F;
        class79.field1062[0] = 0.0F;
        class79.field1062[1] = var6;
        OpenGL.glTexGenfv(8193, 9474, class79.field1062, 0);
        if (this.field228.field2123) {
            class79.field1062[3] = (float) super.field1984.field7747 * var5 % 1.0F;
            class79.field1062[2] = 0.0F;
            class79.field1062[1] = 0.0F;
            class79.field1062[0] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class79.field1062, 0);
        } else {
            int var8 = (int) ((float) super.field1984.field7747 * var5 * 16.0F);
            super.field1984.method3152(arg1 ^ 4741, this.field228.field2113[var8 % 16]);
        }
        super.field1984.method3111(33984, 0);
        if (arg1 != -4741) {
            field231 = null;
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IZ)V", line = 91)
    public final void method145(int arg0, boolean arg1) {
        if (arg0 != -7) {
            this.field235 = null;
        }
        ++field232;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IILjl;)V", line = 106)
    public final void method146(int arg0, int arg1, class228 arg2) {
        super.field1984.method3152(-2, arg2);
        if (arg0 == -7) {
            ++field225;
            super.field1984.method3121(-27745, arg1);
        }
    }

    @OriginalMember(owner = "client!fba", name = "e", descriptor = "(I)Z", line = 118)
    public static final boolean method147(int arg0) {
        ++field236;
        if (arg0 != 16) {
            return false;
        } else {
            try {
                return class247.method1565(-101);
            } catch (IOException var4) {
                class641.method3704(12);
                return true;
            } catch (Exception var5) {
                String var2 = "T2 - " + (class234.field3399 == null ? -1 : class234.field3399.method979((byte) -35)) + "," + (class564.field8360 == null ? -1 : class564.field8360.method979((byte) -128)) + "," + (class383.field5272 == null ? -1 : class383.field5272.method979((byte) -123)) + " - " + class333.field4615 + "," + (class541.field8119.field1957[0] + class473.field6687) + "," + (class541.field8119.field1955[0] + class38.field463) + " - ";
                for (int var3 = 0; var3 < class333.field4615 && var3 < 50; ++var3) {
                    var2 = var2 + class632.field9278.field2146[var3] + ",";
                }
                class378.method2255(var5, var2, arg0 + 73);
                class120.method861(false, -54);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(Lte;Lwq;)V", line = 157)
    public class24(class527 arg0, class146 arg1) {
        super(arg0);
        this.field228 = arg1;
        this.field235 = new class348(arg0, 2);
        this.field235.method2113(0, 25033);
        super.field1984.method3111(33984, 1);
        if (this.field228.field2123) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field1984.method3111(33984, 0);
        this.field235.method2114(0);
        this.field235.method2113(1, 25033);
        super.field1984.method3111(33984, 1);
        if (this.field228.field2123) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field1984.method3111(33984, 0);
        this.field235.method2114(0);
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(ZB)V", line = 189)
    public final void method148(boolean arg0, byte arg1) {
        this.field235.method2110('\u0000', (byte) -128);
        if (arg1 != -86) {
            field224 = -114;
        }
        ++field223;
        if (this.field228.field2123) {
            super.field1984.method3111(33984, 1);
            super.field1984.method3152(arg1 + 84, this.field228.field2117);
            super.field1984.method3111(33984, 0);
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(I)Z", line = 210)
    public final boolean method149(int arg0) {
        if (arg0 >= -36) {
            return true;
        } else {
            ++field230;
            return true;
        }
    }
}
