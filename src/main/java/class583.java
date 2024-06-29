import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class583 extends class83 {

    @OriginalMember(owner = "client!nl", name = "o", descriptor = "Z")
    private boolean field8283 = false;

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "Leaa;")
    private class43 field8277;

    @OriginalMember(owner = "client!nl", name = "m", descriptor = "I")
    public static int field8281 = 0;

    @OriginalMember(owner = "client!nl", name = "p", descriptor = "[I")
    public static int[] field8284 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "I")
    public static int field8276;

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "I")
    public static int field8278;

    @OriginalMember(owner = "client!nl", name = "k", descriptor = "I")
    public static int field8279;

    @OriginalMember(owner = "client!nl", name = "l", descriptor = "I")
    public static int field8280;

    @OriginalMember(owner = "client!nl", name = "n", descriptor = "I")
    public static int field8282;

    @OriginalMember(owner = "client!nl", name = "q", descriptor = "I")
    public static int field8285;

    @OriginalMember(owner = "client!nl", name = "r", descriptor = "I")
    public static int field8286;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(BZ)V")
    public final void method433(byte arg0, boolean arg1) {
        ++field8276;
        if (arg0 != -48) {
            field8284 = null;
        }
        class140 var3 = super.field855.method2367(1);
        if (this.field8277 != null && var3 != null && arg1) {
            this.field8277.method222('\u0000', (byte) -40);
            super.field855.method2431((byte) -41, 1);
            super.field855.method2396((byte) 36, var3);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field855.field5857.method1123(3), 0);
            OpenGL.glMatrixMode(5888);
            super.field855.method2431((byte) -58, 0);
            this.field8283 = true;
        } else {
            super.field855.method2371(770, 0, -118, 34168);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(III)V")
    public final void method435(int arg0, int arg1, int arg2) {
        ++field8280;
        int var4 = 127 % ((arg2 - -60) / 33);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(FIIIZIII)[I")
    public static final int[] method3301(float arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        ++field8285;
        int[] var8 = new int[arg2];
        class36 var9 = new class36();
        if (arg7 != 2) {
            field8284 = null;
        }
        var9.field358 = arg3;
        var9.field354 = (int) (arg0 * 4096.0F);
        var9.field367 = arg4;
        var9.field364 = arg5;
        var9.field361 = arg1;
        var9.field366 = arg6;
        var9.method34((byte) 23);
        class611.method3405(arg2, false, 1);
        var9.method191(111, 0, var8);
        return var8;
    }

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "(I)V")
    public static void method3302(int arg0) {
        field8284 = null;
        if (arg0 != 2) {
            field8281 = 61;
        }
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(I)V")
    public final void method438(int arg0) {
        if (arg0 == 18610) {
            if (this.field8283) {
                this.field8277.method222('\u0001', (byte) -122);
                super.field855.method2431((byte) -60, 1);
                super.field855.method2396((byte) 36, (class325) null);
                super.field855.method2431((byte) -57, 0);
            } else {
                super.field855.method2371(770, 0, -114, 5890);
            }
            ++field8279;
            super.field855.method2412((byte) -49, 8448, 8448);
            this.field8283 = false;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZI)V")
    public final void method439(boolean arg0, int arg1) {
        if (arg1 > -123) {
            field8281 = -125;
        }
        super.field855.method2412((byte) -49, 8448, 7681);
        ++field8278;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IILav;)V")
    public final void method441(int arg0, int arg1, class325 arg2) {
        ++field8286;
        super.field855.method2396((byte) 36, arg2);
        super.field855.method2421(arg1, arg0 + 29093);
        if (arg0 != -29092) {
            field8281 = 52;
        }
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Lvj;)V")
    public class583(class422 arg0) {
        super(arg0);
        if (arg0.field5883) {
            this.field8277 = new class43(arg0, 2);
            this.field8277.method219(24427, 0);
            super.field855.method2431((byte) -100, 1);
            super.field855.method2412((byte) -49, 34165, 7681);
            super.field855.method2428(770, 34168, 2, -4);
            super.field855.method2371(770, 0, -109, 34167);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field855.method2431((byte) -44, 0);
            this.field8277.method223(1);
            this.field8277.method219(24427, 1);
            super.field855.method2431((byte) -73, 1);
            super.field855.method2412((byte) -49, 8448, 8448);
            super.field855.method2428(770, 34166, 2, -4);
            super.field855.method2371(770, 0, -108, 5890);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field855.method2431((byte) -91, 0);
            this.field8277.method223(1);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)Z")
    public final boolean method440(byte arg0) {
        ++field8282;
        if (arg0 > -100) {
            field8284 = null;
        }
        return true;
    }
}
