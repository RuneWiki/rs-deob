import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public class class428 extends class531 {

    @OriginalMember(owner = "client!taa", name = "i", descriptor = "Z")
    private boolean field5817 = false;

    @OriginalMember(owner = "client!taa", name = "l", descriptor = "Loi;")
    private class78 field5820;

    @OriginalMember(owner = "client!taa", name = "n", descriptor = "I")
    public static int field5822 = 0;

    @OriginalMember(owner = "client!taa", name = "g", descriptor = "I")
    public static int field5815;

    @OriginalMember(owner = "client!taa", name = "h", descriptor = "I")
    public static int field5816;

    @OriginalMember(owner = "client!taa", name = "j", descriptor = "I")
    public static int field5818;

    @OriginalMember(owner = "client!taa", name = "m", descriptor = "I")
    public static int field5821;

    @OriginalMember(owner = "client!taa", name = "o", descriptor = "I")
    public static int field5823;

    @OriginalMember(owner = "client!taa", name = "p", descriptor = "I")
    public static int field5824;

    @OriginalMember(owner = "client!taa", name = "q", descriptor = "I")
    public static int field5825;

    @OriginalMember(owner = "client!taa", name = "r", descriptor = "I")
    public static int field5826;

    @OriginalMember(owner = "client!taa", name = "k", descriptor = "Lwia;")
    public static class791 field5819;

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(BII)V", line = 3)
    public final void method311(byte arg0, int arg1, int arg2) {
        ++field5818;
        if (arg0 >= -55) {
            this.method309(false, 40);
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(ZI)V", line = 14)
    public final void method309(boolean arg0, int arg1) {
        ++field5823;
        super.field7676.method802(7681, 11762, 8448);
        if (arg1 > -67) {
            this.method300(106);
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(Z)V", line = 27)
    public static void method2577(boolean arg0) {
        if (arg0) {
            field5819 = null;
        }
    }

    @OriginalMember(owner = "client!taa", name = "d", descriptor = "(I)V", line = 39)
    public static final void method2578(int arg0) {
        class319.field4526 = null;
        class727.field10043 = null;
        class791.field10850 = null;
        ++field5821;
        class606.field8479 = null;
        if (arg0 != 0) {
            field5822 = -1;
        }
        class647.field9055 = false;
        class235.field3538 = null;
    }

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "(I)V", line = 56)
    public final void method300(int arg0) {
        if (arg0 != 1) {
            this.method311((byte) -99, 10, 52);
        }
        ++field5815;
        if (this.field5817) {
            this.field5820.method606(true, '\u0001');
            super.field7676.method813((byte) 103, 1);
            super.field7676.method808((byte) 34, (class188) null);
            super.field7676.method813((byte) 103, 0);
        } else {
            super.field7676.method745(5890, arg0 + -101, 770, 0);
        }
        super.field7676.method802(8448, arg0 ^ 11763, 8448);
        this.field5817 = false;
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(I)Z", line = 78)
    public final boolean method304(int arg0) {
        if (arg0 < 125) {
            field5819 = null;
        }
        ++field5824;
        return true;
    }

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "(ZI)V", line = 89)
    public final void method301(boolean arg0, int arg1) {
        if (arg1 < -9) {
            ++field5816;
            class425 var3 = super.field7676.method803(true);
            if (this.field5820 != null && var3 != null && arg0) {
                this.field5820.method606(true, '\u0000');
                super.field7676.method813((byte) 103, 1);
                super.field7676.method808((byte) 34, var3);
                OpenGL.glMatrixMode(5890);
                OpenGL.glLoadMatrixf(super.field7676.field1472.method3608((byte) -67), 0);
                OpenGL.glMatrixMode(5888);
                super.field7676.method813((byte) 103, 0);
                this.field5817 = true;
            } else {
                super.field7676.method745(34168, 54, 770, 0);
            }
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(IZLdca;)V", line = 115)
    public final void method307(int arg0, boolean arg1, class188 arg2) {
        ++field5826;
        super.field7676.method808((byte) 34, arg2);
        super.field7676.method795(arg0, 34023);
        if (arg1) {
            this.field5820 = null;
        }
    }

    @OriginalMember(owner = "client!taa", name = "<init>", descriptor = "(Lqfa;)V", line = 140)
    public class428(class106 arg0) {
        super(arg0);
        if (arg0.field1559) {
            this.field5820 = new class78(arg0, 2);
            this.field5820.method607(0, false);
            super.field7676.method813((byte) 103, 1);
            super.field7676.method802(7681, 11762, 34165);
            super.field7676.method789(34168, 770, 2, (byte) 47);
            super.field7676.method745(34167, -112, 770, 0);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field7676.method813((byte) 103, 0);
            this.field5820.method608(false);
            this.field5820.method607(1, false);
            super.field7676.method813((byte) 103, 1);
            super.field7676.method802(8448, 11762, 8448);
            super.field7676.method789(34166, 770, 2, (byte) 47);
            super.field7676.method745(5890, -120, 770, 0);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field7676.method813((byte) 103, 0);
            this.field5820.method608(false);
        }
    }
}
