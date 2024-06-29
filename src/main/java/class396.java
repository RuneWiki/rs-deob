import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public class class396 extends class702 {

    @OriginalMember(owner = "client!mea", name = "r", descriptor = "Z")
    private boolean field5597 = false;

    @OriginalMember(owner = "client!mea", name = "j", descriptor = "Lqt;")
    private class588 field5589;

    @OriginalMember(owner = "client!mea", name = "n", descriptor = "Lwo;")
    public static class690 field5593 = new class690(37, 6);

    @OriginalMember(owner = "client!mea", name = "i", descriptor = "I")
    public static int field5588;

    @OriginalMember(owner = "client!mea", name = "k", descriptor = "I")
    public static int field5590;

    @OriginalMember(owner = "client!mea", name = "l", descriptor = "I")
    public static int field5591;

    @OriginalMember(owner = "client!mea", name = "m", descriptor = "I")
    public static int field5592;

    @OriginalMember(owner = "client!mea", name = "o", descriptor = "I")
    public static int field5594;

    @OriginalMember(owner = "client!mea", name = "p", descriptor = "I")
    public static int field5595;

    @OriginalMember(owner = "client!mea", name = "q", descriptor = "I")
    public static int field5596;

    @OriginalMember(owner = "client!mea", name = "s", descriptor = "I")
    public static int field5598;

    @OriginalMember(owner = "client!mea", name = "t", descriptor = "I")
    public static int field5599;

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(Ljf;II)V", line = 7)
    public final void method1004(class197 arg0, int arg1, int arg2) {
        super.field9912.method2932(true, arg0);
        ++field5595;
        super.field9912.method2985(arg1, arg2 ^ -26983);
        if (arg2 != 58) {
            method2396(-83, 60, true, 84, -35, -61, false);
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(IIII)I", line = 20)
    public static final int method2393(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 5890) {
            method2393(-25, 100, -62, 63);
        }
        ++field5592;
        if (arg3 >= arg0) {
            return ~arg1 > ~arg3 ? arg1 : arg3;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(ZZ)V", line = 32)
    public final void method1000(boolean arg0, boolean arg1) {
        super.field9912.method2948(8448, 7681, (byte) -102);
        if (!arg0) {
            field5593 = null;
        }
        ++field5596;
    }

    @OriginalMember(owner = "client!mea", name = "c", descriptor = "(Z)V", line = 45)
    public static void method2394(boolean arg0) {
        if (!arg0) {
            method2395(96);
        }
        field5593 = null;
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(ZI)V", line = 56)
    public final void method1005(boolean arg0, int arg1) {
        ++field5594;
        if (arg1 >= -102) {
            method2396(120, 33, false, -63, 78, -72, false);
        }
        class187 var3 = super.field9912.method2930(91);
        if (this.field5589 != null && var3 != null && arg0) {
            this.field5589.method3409((byte) 118, '\u0000');
            super.field9912.method2975(1, 116);
            super.field9912.method2932(true, var3);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field9912.field7301.method3026(true), 0);
            OpenGL.glMatrixMode(5888);
            super.field9912.method2975(0, 69);
            this.field5597 = true;
        } else {
            super.field9912.method2938(-125, 34168, 770, 0);
        }
    }

    @OriginalMember(owner = "client!mea", name = "b", descriptor = "(I)Lio;", line = 83)
    public static final class404 method2395(int arg0) {
        class228.field2973 = 0;
        if (arg0 != 2) {
            field5593 = null;
        }
        ++field5598;
        return class519.method3071(arg0 + -70);
    }

    @OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(Lkga;)V", line = 95)
    public class396(class506 arg0) {
        super(arg0);
        if (arg0.field7410) {
            this.field5589 = new class588(arg0, 2);
            this.field5589.method3405(0, (byte) 117);
            super.field9912.method2975(1, 73);
            super.field9912.method2948(34165, 7681, (byte) -122);
            super.field9912.method2968(770, 2, (byte) 85, 34168);
            super.field9912.method2938(-128, 34167, 770, 0);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field9912.method2975(0, 107);
            this.field5589.method3410(1);
            this.field5589.method3405(1, (byte) 103);
            super.field9912.method2975(1, 70);
            super.field9912.method2948(8448, 8448, (byte) 35);
            super.field9912.method2968(770, 2, (byte) 62, 34166);
            super.field9912.method2938(-126, 5890, 770, 0);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field9912.method2975(0, 113);
            this.field5589.method3410(1);
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(Z)V", line = 134)
    public final void method1002(boolean arg0) {
        ++field5599;
        if (this.field5597) {
            this.field5589.method3409((byte) 124, '\u0001');
            super.field9912.method2975(1, 113);
            super.field9912.method2932(true, (class197) null);
            super.field9912.method2975(0, 90);
        } else {
            super.field9912.method2938(-126, 5890, 770, 0);
        }
        if (!arg0) {
            this.method998(true);
        }
        super.field9912.method2948(8448, 8448, (byte) -102);
        this.field5597 = false;
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(IIZIIIZ)V", line = 162)
    public static final void method2396(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (~arg0 < ~arg3) {
            int var7 = (arg0 + arg3) / 2;
            int var8 = arg3;
            class404 var9 = class501.field7005[var7];
            class501.field7005[var7] = class501.field7005[arg0];
            class501.field7005[arg0] = var9;
            for (int var10 = arg3; arg0 > var10; ++var10) {
                if (~class590.method3424(arg2, var9, arg6, arg1, arg4, 123, class501.field7005[var10]) >= -1) {
                    class404 var11 = class501.field7005[var10];
                    class501.field7005[var10] = class501.field7005[var8];
                    class501.field7005[var8++] = var11;
                }
            }
            class501.field7005[arg0] = class501.field7005[var8];
            class501.field7005[var8] = var9;
            method2396(var8 + -1, arg1, arg2, arg3, arg4, arg5, arg6);
            method2396(arg0, arg1, arg2, var8 + 1, arg4, 7681, arg6);
        }
        ++field5591;
        if (arg5 != 7681) {
            method2395(-14);
        }
    }

    @OriginalMember(owner = "client!mea", name = "b", descriptor = "(Z)Z", line = 211)
    public final boolean method998(boolean arg0) {
        ++field5590;
        return arg0 ? true : true;
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(III)V", line = 223)
    public final void method1001(int arg0, int arg1, int arg2) {
        int var4 = 92 / ((arg1 - 55) / 36);
        ++field5588;
    }
}
