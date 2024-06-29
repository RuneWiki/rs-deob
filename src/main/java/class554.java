import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public class class554 extends class184 {

    @OriginalMember(owner = "client!nda", name = "h", descriptor = "Z")
    private boolean field7751 = false;

    @OriginalMember(owner = "client!nda", name = "k", descriptor = "Leha;")
    private class89 field7754;

    @OriginalMember(owner = "client!nda", name = "j", descriptor = "I")
    public static int field7753;

    @OriginalMember(owner = "client!nda", name = "l", descriptor = "I")
    public static int field7755;

    @OriginalMember(owner = "client!nda", name = "m", descriptor = "I")
    public static int field7756;

    @OriginalMember(owner = "client!nda", name = "n", descriptor = "I")
    public static int field7757;

    @OriginalMember(owner = "client!nda", name = "o", descriptor = "I")
    public static int field7758;

    @OriginalMember(owner = "client!nda", name = "p", descriptor = "I")
    public static int field7759;

    @OriginalMember(owner = "client!nda", name = "q", descriptor = "I")
    public static int field7760;

    @OriginalMember(owner = "client!nda", name = "r", descriptor = "I")
    public static int field7761;

    @OriginalMember(owner = "client!nda", name = "i", descriptor = "Lgba;")
    public static class664 field7752;

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(ZI)V", line = 8)
    public final void method704(boolean arg0, int arg1) {
        super.field2626.method3485(8448, (byte) 82, 7681);
        ++field7755;
        if (arg1 != -28981) {
            this.field7751 = false;
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(I)Z", line = 19)
    public final boolean method698(int arg0) {
        ++field7756;
        if (arg0 != -20958) {
            this.field7754 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!nda", name = "b", descriptor = "(B)I", line = 31)
    public static final int method3243(byte arg0) {
        ++field7757;
        if (arg0 > -103) {
            field7752 = null;
        }
        return class399.field5582++;
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(III)Z", line = 43)
    public static final boolean method3244(int arg0, int arg1, int arg2) {
        ++field7760;
        if (!class731.method4073(2048, arg2, arg1)) {
            return false;
        } else if ((arg2 & 45056) != 0 | class115.method946(arg2, arg1, -128) | class609.method3516(arg2, arg1, (byte) 70)) {
            return true;
        } else {
            return arg0 != -1 ? true : ~(55 & arg1) == -1 & (class618.method3580(544, arg1, arg2) | class583.method3372(arg2, (byte) 115, arg1));
        }
    }

    @OriginalMember(owner = "client!nda", name = "<init>", descriptor = "(Loea;)V", line = 62)
    public class554(class594 arg0) {
        super(arg0);
        if (arg0.field8606) {
            this.field7754 = new class89(arg0, 2);
            this.field7754.method836(4864, 0);
            super.field2626.method3413(1, 33984);
            super.field2626.method3485(34165, (byte) 41, 7681);
            super.field2626.method3464(2, 770, false, 34168);
            super.field2626.method3453(7482, 34167, 0, 770);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field2626.method3413(0, 33984);
            this.field7754.method832(99);
            this.field7754.method836(4864, 1);
            super.field2626.method3413(1, 33984);
            super.field2626.method3485(8448, (byte) 108, 8448);
            super.field2626.method3464(2, 770, false, 34166);
            super.field2626.method3453(7482, 5890, 0, 770);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field2626.method3413(0, 33984);
            this.field7754.method832(99);
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(Z)V", line = 100)
    public final void method702(boolean arg0) {
        if (!this.field7751) {
            super.field2626.method3453(7482, 5890, 0, 770);
        } else {
            this.field7754.method834((byte) 105, '\u0001');
            super.field2626.method3413(1, 33984);
            super.field2626.method3425((class87) null, 110);
            super.field2626.method3413(0, 33984);
        }
        ++field7753;
        super.field2626.method3485(8448, (byte) 83, 8448);
        if (arg0) {
            this.field7751 = false;
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(Liia;ZI)V", line = 126)
    public final void method700(class87 arg0, boolean arg1, int arg2) {
        super.field2626.method3425(arg0, 79);
        ++field7761;
        if (arg1) {
            this.field7754 = null;
        }
        super.field2626.method3417(arg2, 0);
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIZ)V", line = 140)
    public final void method705(int arg0, int arg1, boolean arg2) {
        ++field7758;
        if (arg2) {
            method3244(-120, 63, -55);
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(IZ)V", line = 153)
    public final void method699(int arg0, boolean arg1) {
        ++field7759;
        if (arg0 >= -54) {
            this.method698(35);
        }
        class518 var3 = super.field2626.method3432(-114);
        if (this.field7754 != null && var3 != null && arg1) {
            this.field7754.method834((byte) 105, '\u0000');
            super.field2626.method3413(1, 33984);
            super.field2626.method3425(var3, -73);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field2626.field8580.method4029((byte) 116), 0);
            OpenGL.glMatrixMode(5888);
            super.field2626.method3413(0, 33984);
            this.field7751 = true;
        } else {
            super.field2626.method3453(7482, 34168, 0, 770);
        }
    }

    @OriginalMember(owner = "client!nda", name = "b", descriptor = "(I)V", line = 179)
    public static void method3245(int arg0) {
        if (arg0 != 8448) {
            method3245(103);
        }
        field7752 = null;
    }
}
