import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class191 extends class159 {

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "Z")
    private boolean field2590 = false;

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "Lhq;")
    private class367 field2597;

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "I")
    public static int field2598 = 16777215;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BZ)V")
    public final void method370(byte arg0, boolean arg1) {
        ++field2592;
        if (arg0 >= 88) {
            super.field2221.method3729((byte) 95, 8448, 7681);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)Z")
    public final boolean method372(boolean arg0) {
        if (!arg0) {
            this.field2590 = false;
        }
        ++field2591;
        return true;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class177.field2420 = arg0;
        class489.field6851 = arg6;
        if (arg2 <= -4) {
            class593.field8041 = arg5;
            class40.field499 = arg3;
            class715.field9973 = arg1;
            class235.field3485 = arg4;
            ++field2596;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lwu;II)V")
    public final void method368(class559 arg0, int arg1, int arg2) {
        ++field2589;
        super.field2221.method3681(arg0, 0);
        if (arg1 == 26264) {
            super.field2221.method3720(-26014, arg2);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZII)V")
    public final void method367(boolean arg0, int arg1, int arg2) {
        ++field2593;
        if (!arg0) {
            this.method372(false);
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(B)V")
    public final void method369(byte arg0) {
        ++field2595;
        if (this.field2590) {
            this.field2597.method2315(true, '\u0001');
            super.field2221.method3738((byte) -63, 1);
            super.field2221.method3681((class559) null, 0);
            super.field2221.method3738((byte) -63, 0);
        } else {
            super.field2221.method3715(5890, 770, 0, (byte) -110);
        }
        super.field2221.method3729((byte) 95, 8448, 8448);
        this.field2590 = false;
        if (arg0 > -59) {
            method1183(8, 52, 87, 113, -62, 54, -93);
        }
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Ldw;)V")
    public class191(class664 arg0) {
        super(arg0);
        if (arg0.field9127) {
            this.field2597 = new class367(arg0, 2);
            this.field2597.method2311(true, 0);
            super.field2221.method3738((byte) -63, 1);
            super.field2221.method3729((byte) 95, 34165, 7681);
            super.field2221.method3718(34168, 113, 770, 2);
            super.field2221.method3715(34167, 770, 0, (byte) -94);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field2221.method3738((byte) -63, 0);
            this.field2597.method2314((byte) -119);
            this.field2597.method2311(true, 1);
            super.field2221.method3738((byte) -63, 1);
            super.field2221.method3729((byte) 95, 8448, 8448);
            super.field2221.method3718(34166, 114, 770, 2);
            super.field2221.method3715(5890, 770, 0, (byte) -98);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field2221.method3738((byte) -63, 0);
            this.field2597.method2314((byte) -124);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZB)V")
    public final void method373(boolean arg0, byte arg1) {
        ++field2594;
        class413 var3 = super.field2221.method3676(8);
        if (this.field2597 != null && var3 != null && arg0) {
            this.field2597.method2315(true, '\u0000');
            super.field2221.method3738((byte) -63, 1);
            super.field2221.method3681(var3, 0);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field2221.field9043.method2929(13), 0);
            OpenGL.glMatrixMode(5888);
            super.field2221.method3738((byte) -63, 0);
            this.field2590 = true;
        } else {
            super.field2221.method3715(34168, 770, 0, (byte) -88);
        }
        if (arg1 > -109) {
            this.method367(true, -17, -4);
        }
    }
}
