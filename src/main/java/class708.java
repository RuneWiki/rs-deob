import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mga")
public class class708 extends class682 {

    @OriginalMember(owner = "client!mga", name = "h", descriptor = "Z")
    private boolean field9978 = false;

    @OriginalMember(owner = "client!mga", name = "g", descriptor = "Lqha;")
    private class102 field9977;

    @OriginalMember(owner = "client!mga", name = "k", descriptor = "[I")
    public static int[] field9981 = new int[1];

    @OriginalMember(owner = "client!mga", name = "p", descriptor = "Z")
    public static boolean field9986 = false;

    @OriginalMember(owner = "client!mga", name = "r", descriptor = "[I")
    public static int[] field9988 = new int[1];

    @OriginalMember(owner = "client!mga", name = "i", descriptor = "I")
    public static int field9979;

    @OriginalMember(owner = "client!mga", name = "l", descriptor = "I")
    public static int field9982;

    @OriginalMember(owner = "client!mga", name = "m", descriptor = "I")
    public static int field9983;

    @OriginalMember(owner = "client!mga", name = "n", descriptor = "I")
    public static int field9984;

    @OriginalMember(owner = "client!mga", name = "o", descriptor = "I")
    public static int field9985;

    @OriginalMember(owner = "client!mga", name = "q", descriptor = "I")
    public static int field9987;

    @OriginalMember(owner = "client!mga", name = "s", descriptor = "I")
    public static int field9989;

    @OriginalMember(owner = "client!mga", name = "j", descriptor = "Lfca;")
    public static class84 field9980;

    @OriginalMember(owner = "client!mga", name = "b", descriptor = "(Z)V")
    public static void method3964(boolean arg0) {
        field9988 = null;
        field9981 = null;
        if (arg0) {
            method3965((byte) -63, (char) 65452);
        }
        field9980 = null;
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(Ltha;II)V")
    public final void method292(class292 arg0, int arg1, int arg2) {
        ++field9984;
        super.field9647.method2621(-2, arg0);
        if (arg2 != -16997) {
            this.method287(-25, true);
        }
        super.field9647.method2573(arg1, false);
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(I)V")
    public final void method288(int arg0) {
        if (!this.field9978) {
            super.field9647.method2630(34166, 0, 770, 5890);
        } else {
            this.field9977.method712('\u0001', 1);
            super.field9647.method2545(arg0 ^ 32886, 1);
            super.field9647.method2621(-2, (class292) null);
            super.field9647.method2545(32886, 0);
        }
        ++field9989;
        super.field9647.method2558(8448, arg0, 8448);
        this.field9978 = false;
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(IBI)V")
    public final void method289(int arg0, byte arg1, int arg2) {
        if (arg1 > 72) {
            ++field9983;
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(IZ)V")
    public final void method287(int arg0, boolean arg1) {
        ++field9979;
        super.field9647.method2558(8448, 0, 7681);
        if (arg0 < 111) {
            field9981 = null;
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(BZ)V")
    public final void method285(byte arg0, boolean arg1) {
        ++field9982;
        class351 var3 = super.field9647.method2550(-20140);
        if (this.field9977 != null && var3 != null && arg1) {
            this.field9977.method712('\u0000', 1);
            super.field9647.method2545(arg0 + 32834, 1);
            super.field9647.method2621(-2, var3);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field9647.field5951.method3581((byte) 121), 0);
            OpenGL.glMatrixMode(5888);
            super.field9647.method2545(32886, 0);
            this.field9978 = true;
        } else {
            super.field9647.method2630(arg0 ^ 34114, 0, 770, 34168);
        }
        if (arg0 != 52) {
            field9981 = null;
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(Z)Z")
    public final boolean method286(boolean arg0) {
        if (!arg0) {
            return false;
        } else {
            ++field9985;
            return true;
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(BC)Z")
    public static final boolean method3965(byte arg0, char arg1) {
        if (arg0 != 122) {
            method3964(false);
        }
        ++field9987;
        return arg1 == 160 || ~arg1 == -33 || ~arg1 == -96 || ~arg1 == -46;
    }

    @OriginalMember(owner = "client!mga", name = "<init>", descriptor = "(Lnv;)V")
    public class708(class417 arg0) {
        super(arg0);
        if (arg0.field5953) {
            this.field9977 = new class102(arg0, 2);
            this.field9977.method705(0, (byte) 87);
            super.field9647.method2545(32886, 1);
            super.field9647.method2558(34165, 0, 7681);
            super.field9647.method2626(8960, 770, 2, 34168);
            super.field9647.method2630(34166, 0, 770, 34167);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field9647.method2545(32886, 0);
            this.field9977.method711(22972);
            this.field9977.method705(1, (byte) -88);
            super.field9647.method2545(32886, 1);
            super.field9647.method2558(8448, 0, 8448);
            super.field9647.method2626(8960, 770, 2, 34166);
            super.field9647.method2630(34166, 0, 770, 5890);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field9647.method2545(32886, 0);
            this.field9977.method711(22972);
        }
    }
}
