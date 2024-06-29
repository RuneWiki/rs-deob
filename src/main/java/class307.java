import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class307 extends class387 {

    @OriginalMember(owner = "client!vt", name = "h", descriptor = "Llba;")
    private class550 field4413;

    @OriginalMember(owner = "client!vt", name = "m", descriptor = "Lvi;")
    private class540 field4418;

    @OriginalMember(owner = "client!vt", name = "g", descriptor = "[I")
    public static int[] field4412 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!vt", name = "i", descriptor = "Lhda;")
    public static class752 field4414 = new class752(104, -2);

    @OriginalMember(owner = "client!vt", name = "s", descriptor = "Lht;")
    public static class582 field4424 = new class582(8, -1);

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!vt", name = "d", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!vt", name = "f", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!vt", name = "j", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!vt", name = "k", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!vt", name = "n", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!vt", name = "o", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!vt", name = "p", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!vt", name = "q", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!vt", name = "r", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!vt", name = "t", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!vt", name = "l", descriptor = "Z")
    public static boolean field4417;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(BIJIZ)Ljava/lang/String;", line = 3)
    public static final String method1897(byte arg0, int arg1, long arg2, int arg3, boolean arg4) {
        ++field4421;
        char var6 = ',';
        char var7 = '.';
        if (arg3 == 0) {
            var7 = ',';
            var6 = '.';
        }
        if (arg3 == 2) {
            var7 = 160;
        }
        boolean var8 = false;
        if (~arg2 > -1L) {
            arg2 = -arg2;
            var8 = true;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (~arg1 < -1) {
            for (int var10 = 0; ~arg1 < ~var10; ++var10) {
                int var11 = (int) arg2;
                arg2 /= 10L;
                var9.append((char) (var11 + 48 + -((int) arg2 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        if (arg0 >= -5) {
            field4416 = -44;
        }
        while (true) {
            int var13 = (int) arg2;
            arg2 /= 10L;
            var9.append((char) (-((int) arg2 * 10) + var13 + 48));
            if (~arg2 == -1L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg4) {
                ++var12;
                if (~(var12 % 3) == -1) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(II)V", line = 87)
    public static final void method1898(int arg0, int arg1) {
        for (class656 var2 = class33.field501.method2144(true); var2 != null; var2 = class33.field501.method2146(false)) {
            if ((long) arg0 == (var2.field8680 >> 48 & 65535L)) {
                var2.method3564(true);
            }
        }
        if (arg1 == 28986) {
            ++field4410;
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(III)V", line = 109)
    public final void method643(int arg0, int arg1, int arg2) {
        ++field4409;
        float var4 = (float) ((3 & arg0) + 1) * -5.0E-4F;
        float var5 = (float) ((3 & arg0 >> 3) + 1) * 5.0E-4F;
        float var6 = (arg0 & 64) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var7 = ~(128 & arg0) != -1;
        super.field5405.method3630(true, 1);
        if (!var7) {
            class385.field5387[0] = 0.0F;
            class385.field5387[1] = 0.0F;
            class385.field5387[3] = 0.0F;
            class385.field5387[2] = var6;
        } else {
            class385.field5387[3] = 0.0F;
            class385.field5387[1] = 0.0F;
            class385.field5387[2] = 0.0F;
            class385.field5387[0] = var6;
        }
        OpenGL.glTexGenfv(8192, 9474, class385.field5387, 0);
        class385.field5387[2] = 0.0F;
        class385.field5387[3] = (float) super.field5405.field8949 * var4 % 1.0F;
        class385.field5387[1] = var6;
        int var8 = -116 / ((74 - arg2) / 36);
        class385.field5387[0] = 0.0F;
        OpenGL.glTexGenfv(8193, 9474, class385.field5387, 0);
        if (this.field4413.field7264) {
            class385.field5387[2] = 0.0F;
            class385.field5387[0] = 0.0F;
            class385.field5387[3] = (float) super.field5405.field8949 * var5 % 1.0F;
            class385.field5387[1] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class385.field5387, 0);
        } else {
            int var9 = (int) ((float) super.field5405.field8949 * var5 * 16.0F);
            super.field5405.method3639(-2, this.field4413.field7261[var9 % 16]);
        }
        super.field5405.method3630(true, 0);
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Z)V", line = 167)
    public final void method644(boolean arg0) {
        if (arg0) {
            field4412 = null;
        }
        this.field4418.method3013((byte) 100, '\u0001');
        ++field4423;
        super.field5405.method3630(!arg0, 1);
        super.field5405.method3639(-2, (class460) null);
        super.field5405.method3630(true, 0);
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(BILiga;)V", line = 182)
    public final void method638(byte arg0, int arg1, class460 arg2) {
        ++field4422;
        super.field5405.method3639(-2, arg2);
        super.field5405.method3631((byte) 112, arg1);
        if (arg0 <= 53) {
            field4425 = 73;
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)Z", line = 201)
    public final boolean method641(int arg0) {
        ++field4415;
        if (arg0 != -16777216) {
            method1897((byte) 95, -21, 6L, -85, false);
        }
        return true;
    }

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(I)V", line = 212)
    public static void method1899(int arg0) {
        field4414 = null;
        field4424 = null;
        if (arg0 != -8554) {
            field4414 = null;
        }
        field4412 = null;
    }

    @OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Lrda;Llba;)V", line = 232)
    public class307(class663 arg0, class550 arg1) {
        super(arg0);
        this.field4413 = arg1;
        this.field4418 = new class540(arg0, 2);
        this.field4418.method3012(-108, 0);
        super.field5405.method3630(true, 1);
        if (this.field4413.field7264) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field5405.method3630(true, 0);
        this.field4418.method3015((byte) 26);
        this.field4418.method3012(-88, 1);
        super.field5405.method3630(true, 1);
        if (this.field4413.field7264) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field5405.method3630(true, 0);
        this.field4418.method3015((byte) 26);
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(BZ)V", line = 270)
    public final void method639(byte arg0, boolean arg1) {
        if (arg0 >= -123) {
            field4425 = -64;
        }
        ++field4408;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(ZB)V", line = 280)
    public final void method640(boolean arg0, byte arg1) {
        this.field4418.method3013((byte) 101, '\u0000');
        ++field4420;
        if (arg1 <= 1) {
            this.method640(false, (byte) -59);
        }
        if (this.field4413.field7264) {
            super.field5405.method3630(true, 1);
            super.field5405.method3639(-2, this.field4413.field7262);
            super.field5405.method3630(true, 0);
        }
    }
}
