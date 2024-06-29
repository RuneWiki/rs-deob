import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class754 extends class187 {

    @OriginalMember(owner = "client!wn", name = "n", descriptor = "Z")
    private boolean field10406 = false;

    @OriginalMember(owner = "client!wn", name = "t", descriptor = "Lcga;")
    private class509 field10412;

    @OriginalMember(owner = "client!wn", name = "q", descriptor = "Lfja;")
    public static class783 field10409 = new class783(48, 9);

    @OriginalMember(owner = "client!wn", name = "l", descriptor = "I")
    public static int field10404;

    @OriginalMember(owner = "client!wn", name = "m", descriptor = "I")
    public static int field10405;

    @OriginalMember(owner = "client!wn", name = "o", descriptor = "I")
    public static int field10407;

    @OriginalMember(owner = "client!wn", name = "p", descriptor = "I")
    public static int field10408;

    @OriginalMember(owner = "client!wn", name = "r", descriptor = "I")
    public static int field10410;

    @OriginalMember(owner = "client!wn", name = "s", descriptor = "I")
    public static int field10411;

    @OriginalMember(owner = "client!wn", name = "u", descriptor = "I")
    public static int field10413;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(ZB)V", line = 3)
    public final void method168(boolean arg0, byte arg1) {
        int var3 = -74 % ((36 - arg1) / 48);
        ++field10413;
        class34 var4 = super.field2885.method1004(3553);
        if (this.field10412 != null && var4 != null && arg0) {
            this.field10412.method2906('\u0000', -89);
            super.field2885.method1002(1, -5172);
            super.field2885.method939(var4, 8448);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field2885.field1970.method3958(116), 0);
            OpenGL.glMatrixMode(5888);
            super.field2885.method1002(0, -5172);
            this.field10406 = true;
        } else {
            super.field2885.method980(0, 34168, true, 770);
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Z)V", line = 28)
    public final void method169(boolean arg0) {
        if (!arg0) {
            this.method172(-106, false);
        }
        if (this.field10406) {
            this.field10412.method2906('\u0001', -105);
            super.field2885.method1002(1, -5172);
            super.field2885.method939((class18) null, 8448);
            super.field2885.method1002(0, -5172);
        } else {
            super.field2885.method980(0, 5890, true, 770);
        }
        ++field10410;
        super.field2885.method990(8448, 8448, -29641);
        this.field10406 = false;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(III)Z", line = 50)
    public static final boolean method4182(int arg0, int arg1, int arg2) {
        ++field10408;
        if (arg2 != -12026) {
            return true;
        } else {
            return ~(32 & arg1) != -1;
        }
    }

    @OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Lhk;)V", line = 61)
    public class754(class111 arg0) {
        super(arg0);
        if (arg0.field2045) {
            this.field10412 = new class509(arg0, 2);
            this.field10412.method2902(0, 4864);
            super.field2885.method1002(1, -5172);
            super.field2885.method990(34165, 7681, -29641);
            super.field2885.method988(34168, 6, 2, 770);
            super.field2885.method980(0, 34167, true, 770);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field2885.method1002(0, -5172);
            this.field10412.method2901(4);
            this.field10412.method2902(1, 4864);
            super.field2885.method1002(1, -5172);
            super.field2885.method990(8448, 8448, -29641);
            super.field2885.method988(34166, 6, 2, 770);
            super.field2885.method980(0, 5890, true, 770);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field2885.method1002(0, -5172);
            this.field10412.method2901(4);
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IZI)V", line = 103)
    public final void method170(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.method171(-101);
        }
        ++field10407;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IZ)V", line = 116)
    public final void method172(int arg0, boolean arg1) {
        super.field2885.method990(8448, 7681, -29641);
        if (arg0 < 56) {
            this.method171(85);
        }
        ++field10405;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)Z", line = 128)
    public final boolean method171(int arg0) {
        ++field10404;
        return arg0 == 20220;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IBLqk;)V", line = 139)
    public final void method167(int arg0, byte arg1, class18 arg2) {
        super.field2885.method939(arg2, 8448);
        if (arg1 != -126) {
            method4182(57, -70, -17);
        }
        ++field10411;
        super.field2885.method999(true, arg0);
    }

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "(I)V", line = 162)
    public static void method4183(int arg0) {
        field10409 = null;
        if (arg0 != 7681) {
            field10409 = null;
        }
    }
}
