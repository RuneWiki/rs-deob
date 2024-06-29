import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class420 extends class229 {

    @OriginalMember(owner = "client!et", name = "g", descriptor = "Lgo;")
    private class442 field6130;

    @OriginalMember(owner = "client!et", name = "s", descriptor = "Lwu;")
    private class250 field6142;

    @OriginalMember(owner = "client!et", name = "q", descriptor = "Lqo;")
    public static class19 field6140 = new class19("", 11);

    @OriginalMember(owner = "client!et", name = "u", descriptor = "I")
    public static int field6144 = 0;

    @OriginalMember(owner = "client!et", name = "h", descriptor = "I")
    public static int field6131;

    @OriginalMember(owner = "client!et", name = "i", descriptor = "I")
    public static int field6132;

    @OriginalMember(owner = "client!et", name = "j", descriptor = "I")
    public static int field6133;

    @OriginalMember(owner = "client!et", name = "k", descriptor = "I")
    public static int field6134;

    @OriginalMember(owner = "client!et", name = "l", descriptor = "I")
    public static int field6135;

    @OriginalMember(owner = "client!et", name = "m", descriptor = "I")
    public static int field6136;

    @OriginalMember(owner = "client!et", name = "n", descriptor = "I")
    public static int field6137;

    @OriginalMember(owner = "client!et", name = "o", descriptor = "I")
    public static int field6138;

    @OriginalMember(owner = "client!et", name = "p", descriptor = "I")
    public static int field6139;

    @OriginalMember(owner = "client!et", name = "r", descriptor = "I")
    public static int field6141;

    @OriginalMember(owner = "client!et", name = "t", descriptor = "I")
    public static int field6143;

    @OriginalMember(owner = "client!et", name = "f", descriptor = "Lvh;")
    public static class240 field6129;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(ZZ)V", line = 3)
    public final void method20(boolean arg0, boolean arg1) {
        this.field6142.method1473(-2, '\u0000');
        ++field6131;
        if (!arg0) {
            this.method17(false, -121);
        }
        if (this.field6130.field6430) {
            super.field3194.method2398(1, (byte) 119);
            super.field3194.method2412((byte) 4, this.field6130.field6427);
            super.field3194.method2398(0, (byte) -46);
        }
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(B)Z", line = 22)
    public final boolean method13(byte arg0) {
        ++field6143;
        if (arg0 <= 123) {
            this.field6130 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IILao;)V", line = 34)
    public final void method22(int arg0, int arg1, class188 arg2) {
        super.field3194.method2412((byte) 4, arg2);
        ++field6132;
        super.field3194.method2365(true, arg1);
        if (arg0 >= -45) {
            field6140 = null;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Z)V", line = 51)
    public static final void method2512(boolean arg0) {
        ++field6137;
        if (!arg0) {
            class378.field5320 = class305.method1731(2048, 0.4F, 35, 8, 4, -98, 8, true);
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(II)I", line = 63)
    public static final int method2513(int arg0, int arg1) {
        ++field6134;
        int var7 = arg0 - 1;
        if (arg1 != 0) {
            return 109;
        } else {
            int var2 = var7 | var7 >>> 1;
            int var3 = var2 | var2 >>> 2;
            int var4 = var3 | var3 >>> 4;
            int var5 = var4 | var4 >>> 8;
            int var6 = var5 | var5 >>> 16;
            return var6 + 1;
        }
    }

    @OriginalMember(owner = "client!et", name = "d", descriptor = "(III)V", line = 81)
    public static final void method2514(int arg0, int arg1, int arg2) {
        ++field6135;
        if (arg1 <= 93) {
            method2514(114, -100, 21);
        }
        if (class13.field147 == 1) {
            class299.method1711(false, class173.field2480, arg2, arg0);
        } else if (class13.field147 == 2) {
            class190.method1145(arg2, arg0, 26);
        }
        class13.field147 = 0;
        class173.field2480 = null;
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Lht;Lgo;)V", line = 101)
    public class420(class410 arg0, class442 arg1) {
        super(arg0);
        this.field6130 = arg1;
        this.field6142 = new class250(arg0, 2);
        this.field6142.method1471(2, 0);
        super.field3194.method2398(1, (byte) -72);
        if (this.field6130.field6430) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field3194.method2398(0, (byte) 0);
        this.field6142.method1475(17);
        this.field6142.method1471(2, 1);
        super.field3194.method2398(1, (byte) 113);
        if (this.field6130.field6430) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field3194.method2398(0, (byte) 111);
        this.field6142.method1475(17);
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(Z)V", line = 133)
    public static void method2515(boolean arg0) {
        field6140 = null;
        if (arg0) {
            method2512(false);
        }
        field6129 = null;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(I)V", line = 145)
    public final void method19(int arg0) {
        this.field6142.method1473(-2, '\u0001');
        ++field6138;
        super.field3194.method2398(1, (byte) -127);
        if (arg0 != 262144) {
            this.method13((byte) 72);
        }
        super.field3194.method2412((byte) 4, (class188) null);
        super.field3194.method2398(0, (byte) -40);
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIIIIII)V", line = 160)
    public static final void method2516(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = -78 % ((arg4 - -57) / 43);
        if (class382.field5379 <= arg3 && ~arg2 >= ~class175.field2497 && arg7 >= class343.field4727 && class54.field753 >= arg6) {
            class351.method1941(arg1, (byte) -104, arg5, arg3, arg0, arg2, arg6, arg7);
        } else {
            class411.method2448(arg2, arg5, arg7, false, arg0, arg1, arg6, arg3);
        }
        ++field6141;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(ZI)V", line = 178)
    public final void method17(boolean arg0, int arg1) {
        if (arg1 != -27632) {
            field6129 = null;
        }
        ++field6139;
    }

    @OriginalMember(owner = "client!et", name = "c", descriptor = "(III)V", line = 193)
    public final void method12(int arg0, int arg1, int arg2) {
        ++field6136;
        float var4 = (float) ((3 & arg0) + 1) * -5.0E-4F;
        float var5 = (float) ((3 & arg0 >> 3) + 1) * 5.0E-4F;
        float var6 = ~(arg0 & 64) == -1 ? 4.8828125E-4F : 9.765625E-4F;
        super.field3194.method2398(1, (byte) 100);
        boolean var7 = ~(128 & arg0) != -1;
        if (!var7) {
            class50.field685[1] = 0.0F;
            class50.field685[2] = var6;
            class50.field685[0] = 0.0F;
            class50.field685[3] = 0.0F;
        } else {
            class50.field685[0] = var6;
            class50.field685[2] = 0.0F;
            class50.field685[1] = 0.0F;
            class50.field685[3] = 0.0F;
        }
        int var8 = -27 % ((13 - arg1) / 46);
        OpenGL.glTexGenfv(8192, 9474, class50.field685, 0);
        class50.field685[1] = var6;
        class50.field685[2] = 0.0F;
        class50.field685[0] = 0.0F;
        class50.field685[3] = (float) super.field3194.field5863 * var4 % 1.0F;
        OpenGL.glTexGenfv(8193, 9474, class50.field685, 0);
        if (!this.field6130.field6430) {
            int var9 = (int) ((float) super.field3194.field5863 * var5 * 16.0F);
            super.field3194.method2412((byte) 4, this.field6130.field6426[var9 % 16]);
        } else {
            class50.field685[2] = 0.0F;
            class50.field685[0] = 0.0F;
            class50.field685[3] = (float) super.field3194.field5863 * var5 % 1.0F;
            class50.field685[1] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class50.field685, 0);
        }
        super.field3194.method2398(0, (byte) 126);
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(II)V", line = 250)
    public static final void method2517(int arg0, int arg1) {
        ++field6133;
        class163 var2 = class271.method1546(arg0, arg1, true);
        var2.method1010(1504);
    }
}
