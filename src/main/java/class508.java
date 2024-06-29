import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cga")
public class class508 extends class402 {

    @OriginalMember(owner = "client!cga", name = "j", descriptor = "Z")
    private boolean field7224 = false;

    @OriginalMember(owner = "client!cga", name = "i", descriptor = "Lpia;")
    private class104 field7223;

    @OriginalMember(owner = "client!cga", name = "l", descriptor = "Llja;")
    public static class744 field7226 = new class744(20, 18);

    @OriginalMember(owner = "client!cga", name = "m", descriptor = "[I")
    public static int[] field7227 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!cga", name = "d", descriptor = "I")
    public static int field7218;

    @OriginalMember(owner = "client!cga", name = "e", descriptor = "I")
    public static int field7219;

    @OriginalMember(owner = "client!cga", name = "f", descriptor = "I")
    public static int field7220;

    @OriginalMember(owner = "client!cga", name = "g", descriptor = "I")
    public static int field7221;

    @OriginalMember(owner = "client!cga", name = "h", descriptor = "I")
    public static int field7222;

    @OriginalMember(owner = "client!cga", name = "k", descriptor = "I")
    public static int field7225;

    @OriginalMember(owner = "client!cga", name = "b", descriptor = "(IZ)V", line = 4)
    public final void method176(int arg0, boolean arg1) {
        ++field7220;
        class331 var3 = super.field5243.method3962(3);
        if (this.field7223 != null && var3 != null && arg1) {
            this.field7223.method856(-86, '\u0000');
            super.field5243.method3925((byte) 109, 1);
            super.field5243.method3936(false, var3);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field5243.field9761.method2632((byte) -78), 0);
            OpenGL.glMatrixMode(5888);
            super.field5243.method3925((byte) 20, 0);
            this.field7224 = true;
        } else {
            super.field5243.method3931(0, 8960, 770, 34168);
        }
        if (arg0 >= -32) {
            this.field7224 = true;
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(B)Z", line = 32)
    public final boolean method178(byte arg0) {
        if (arg0 >= -55) {
            this.method176(103, false);
        }
        ++field7219;
        return true;
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(I)V", line = 46)
    public final void method181(int arg0) {
        if (this.field7224) {
            this.field7223.method856(-73, '\u0001');
            super.field5243.method3925((byte) -111, 1);
            super.field5243.method3936(false, (class400) null);
            super.field5243.method3925((byte) -119, 0);
        } else {
            super.field5243.method3931(0, 8960, 770, 5890);
        }
        ++field7222;
        super.field5243.method3961(8448, 8448, 16127);
        this.field7224 = false;
        if (arg0 != -1) {
            this.field7224 = true;
        }
    }

    @OriginalMember(owner = "client!cga", name = "<init>", descriptor = "(Lpc;)V", line = 68)
    public class508(class700 arg0) {
        super(arg0);
        if (arg0.field9858) {
            this.field7223 = new class104(arg0, 2);
            this.field7223.method858(0, (byte) -128);
            super.field5243.method3925((byte) -121, 1);
            super.field5243.method3961(7681, 34165, 16127);
            super.field5243.method3903(34168, 2, 770, -124);
            super.field5243.method3931(0, 8960, 770, 34167);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field5243.method3925((byte) 67, 0);
            this.field7223.method857(0);
            this.field7223.method858(1, (byte) -82);
            super.field5243.method3925((byte) 96, 1);
            super.field5243.method3961(8448, 8448, 16127);
            super.field5243.method3903(34166, 2, 770, -109);
            super.field5243.method3931(0, 8960, 770, 5890);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field5243.method3925((byte) -96, 0);
            this.field7223.method857(0);
        }
    }

    @OriginalMember(owner = "client!cga", name = "b", descriptor = "(B)V", line = 109)
    public static void method3042(byte arg0) {
        field7226 = null;
        field7227 = null;
        if (arg0 != 88) {
            method3042((byte) -104);
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(III)V", line = 122)
    public final void method183(int arg0, int arg1, int arg2) {
        ++field7221;
        if (arg0 != 64) {
            this.field7224 = true;
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(IBLfha;)V", line = 135)
    public final void method180(int arg0, byte arg1, class400 arg2) {
        ++field7218;
        super.field5243.method3936(false, arg2);
        super.field5243.method3932(arg0, (byte) 99);
        if (arg1 > -103) {
            this.method184(91, true);
        }
    }

    @OriginalMember(owner = "client!cga", name = "c", descriptor = "(IZ)V", line = 147)
    public final void method184(int arg0, boolean arg1) {
        ++field7225;
        super.field5243.method3961(7681, 8448, 16127);
        if (arg0 != 64) {
            this.method184(87, true);
        }
    }
}
