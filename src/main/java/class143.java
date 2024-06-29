import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class143 extends class648 {

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "Z")
    private boolean field2210 = false;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "Lud;")
    private class31 field2205;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "Z")
    public static boolean field2204 = false;

    @OriginalMember(owner = "client!uh", name = "r", descriptor = "I")
    public static int field2215 = 0;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!uh", name = "p", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!uh", name = "q", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "Lsq;")
    public static class153 field2203;

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "Lha;")
    public static class52 field2208;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "(I)V")
    public static void method940(int arg0) {
        field2208 = null;
        if (arg0 != -31618) {
            field2203 = null;
        }
        field2203 = null;
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Lgi;)V")
    public class143(class583 arg0) {
        super(arg0);
        if (arg0.field8287) {
            this.field2205 = new class31(arg0, 2);
            this.field2205.method320(-28457, 0);
            super.field9395.method3398(-94, 1);
            super.field9395.method3389(false, 34165, 7681);
            super.field9395.method3407(2, 770, -127, 34168);
            super.field9395.method3340(770, 0, 34167, 1);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field9395.method3398(-36, 0);
            this.field2205.method321(2);
            this.field2205.method320(-28457, 1);
            super.field9395.method3398(-98, 1);
            super.field9395.method3389(false, 8448, 8448);
            super.field9395.method3407(2, 770, -120, 34166);
            super.field9395.method3340(770, 0, 5890, 1);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field9395.method3398(-75, 0);
            this.field2205.method321(2);
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)V")
    public final void method941(int arg0) {
        if (!this.field2210) {
            super.field9395.method3340(770, 0, 5890, arg0);
        } else {
            this.field2205.method317('\u0001', true);
            super.field9395.method3398(-113, 1);
            super.field9395.method3358(32886, (class418) null);
            super.field9395.method3398(-64, 0);
        }
        if (arg0 != 1) {
            this.method941(-4);
        }
        ++field2212;
        super.field9395.method3389(false, 8448, 8448);
        this.field2210 = false;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(BLmw;I)V")
    public final void method942(byte arg0, class418 arg1, int arg2) {
        ++field2207;
        if (arg0 != -30) {
            method940(-94);
        }
        super.field9395.method3358(32886, arg1);
        super.field9395.method3396((byte) 109, arg2);
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(III)I")
    public static final int method943(int arg0, int arg1, int arg2) {
        ++field2206;
        if (~arg0 == 1) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg2 >= 2) {
                if (arg2 > 126) {
                    arg2 = 126;
                }
            } else {
                arg2 = 2;
            }
            return arg2;
        } else {
            int var3 = (arg0 & 127) * arg2 >> 7;
            if (arg1 > var3) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (65408 & arg0) + var3;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(BZ)V")
    public final void method944(byte arg0, boolean arg1) {
        if (arg0 > -111) {
            this.method947(30, false);
        }
        ++field2213;
        super.field9395.method3389(false, 8448, 7681);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(III)V")
    public final void method945(int arg0, int arg1, int arg2) {
        ++field2214;
        int var4 = 89 / ((30 - arg2) / 56);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)Z")
    public final boolean method946(int arg0) {
        if (arg0 < 122) {
            this.method942((byte) 11, (class418) null, -17);
        }
        ++field2211;
        return true;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IZ)V")
    public final void method947(int arg0, boolean arg1) {
        ++field2209;
        class403 var3 = super.field9395.method3409(0);
        if (arg0 != 17729) {
            field2215 = -80;
        }
        if (this.field2205 != null && var3 != null && arg1) {
            this.field2205.method317('\u0000', true);
            super.field9395.method3398(-105, 1);
            super.field9395.method3358(32886, var3);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field9395.field8314.method1740(false), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            super.field9395.method3398(arg0 + -17811, 0);
            this.field2210 = true;
        } else {
            super.field9395.method3340(770, 0, 34168, arg0 ^ 17728);
        }
    }
}
