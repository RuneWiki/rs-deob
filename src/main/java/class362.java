import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class362 extends class337 {

    @OriginalMember(owner = "client!li", name = "o", descriptor = "Z")
    private boolean field4764 = false;

    @OriginalMember(owner = "client!li", name = "q", descriptor = "Lam;")
    private class538 field4766;

    @OriginalMember(owner = "client!li", name = "m", descriptor = "I")
    public static int field4762 = 0;

    @OriginalMember(owner = "client!li", name = "t", descriptor = "I")
    public static int field4769 = 0;

    @OriginalMember(owner = "client!li", name = "s", descriptor = "F")
    public static float field4768;

    @OriginalMember(owner = "client!li", name = "g", descriptor = "I")
    public static int field4756;

    @OriginalMember(owner = "client!li", name = "h", descriptor = "I")
    public static int field4757;

    @OriginalMember(owner = "client!li", name = "i", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!li", name = "k", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!li", name = "l", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!li", name = "p", descriptor = "I")
    public static int field4765;

    @OriginalMember(owner = "client!li", name = "r", descriptor = "I")
    public static int field4767;

    @OriginalMember(owner = "client!li", name = "u", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!li", name = "n", descriptor = "Ldn;")
    public static class438 field4763;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IBLuu;)V")
    public final void method253(int arg0, byte arg1, class238 arg2) {
        if (arg1 != 93) {
            field4769 = 121;
        }
        super.field4382.method3083((byte) 100, arg2);
        ++field4760;
        super.field4382.method3063(arg0, (byte) -107);
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(B)Z")
    public final boolean method257(byte arg0) {
        ++field4770;
        return arg0 >= 115;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ZII)V")
    public final void method258(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            ++field4757;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ZI)V")
    public final void method256(boolean arg0, int arg1) {
        ++field4758;
        super.field4382.method3099(7681, 8448, 8);
        if (arg1 != 28300) {
            this.method256(true, 48);
        }
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(II)Z")
    public static final boolean method2032(int arg0, int arg1) {
        ++field4767;
        if (arg0 <= 1) {
            field4769 = 121;
        }
        return arg1 == 6 || arg1 == 7 || arg1 == 8;
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lmh;)V")
    public class362(class537 arg0) {
        super(arg0);
        if (arg0.field7772) {
            this.field4766 = new class538(arg0, 2);
            this.field4766.method3139(0, 0);
            super.field4382.method3078(33984, 1);
            super.field4382.method3099(7681, 34165, 8);
            super.field4382.method3126(false, 2, 770, 34168);
            super.field4382.method3098(770, 0, (byte) 14, 34167);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field4382.method3078(33984, 0);
            this.field4766.method3144(-105);
            this.field4766.method3139(1, 0);
            super.field4382.method3078(33984, 1);
            super.field4382.method3099(8448, 8448, 8);
            super.field4382.method3126(false, 2, 770, 34166);
            super.field4382.method3098(770, 0, (byte) 14, 5890);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field4382.method3078(33984, 0);
            this.field4766.method3144(-126);
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B)V")
    public final void method251(byte arg0) {
        ++field4765;
        if (arg0 > -21) {
            field4768 = 0.21771714F;
        }
        if (this.field4764) {
            this.field4766.method3141(106, '\u0001');
            super.field4382.method3078(33984, 1);
            super.field4382.method3083((byte) 86, (class238) null);
            super.field4382.method3078(33984, 0);
        } else {
            super.field4382.method3098(770, 0, (byte) 14, 5890);
        }
        super.field4382.method3099(8448, 8448, 8);
        this.field4764 = false;
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(I)V")
    public static void method2033(int arg0) {
        if (arg0 == 3168) {
            field4763 = null;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(BZ)V")
    public final void method252(byte arg0, boolean arg1) {
        if (arg0 > 10) {
            ++field4761;
            class15 var3 = super.field4382.method3111(-95);
            if (this.field4766 != null && var3 != null && arg1) {
                this.field4766.method3141(32, '\u0000');
                super.field4382.method3078(33984, 1);
                super.field4382.method3083((byte) 115, var3);
                OpenGL.glMatrixMode(5890);
                OpenGL.glLoadMatrixf(super.field4382.field7783.method665((byte) -122), 0);
                OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
                OpenGL.glMatrixMode(5888);
                super.field4382.method3078(33984, 0);
                this.field4764 = true;
            } else {
                super.field4382.method3098(770, 0, (byte) 14, 34168);
            }
        }
    }
}
