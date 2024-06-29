import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class550 extends class366 {

    @OriginalMember(owner = "client!kq", name = "r", descriptor = "Z")
    private boolean field8002 = false;

    @OriginalMember(owner = "client!kq", name = "n", descriptor = "Lsr;")
    private class231 field7998;

    @OriginalMember(owner = "client!kq", name = "i", descriptor = "I")
    public static int field7993 = -1;

    @OriginalMember(owner = "client!kq", name = "k", descriptor = "F")
    public static float field7995;

    @OriginalMember(owner = "client!kq", name = "g", descriptor = "I")
    public static int field7991;

    @OriginalMember(owner = "client!kq", name = "h", descriptor = "I")
    public static int field7992;

    @OriginalMember(owner = "client!kq", name = "j", descriptor = "I")
    public static int field7994;

    @OriginalMember(owner = "client!kq", name = "l", descriptor = "I")
    public static int field7996;

    @OriginalMember(owner = "client!kq", name = "o", descriptor = "I")
    public static int field7999;

    @OriginalMember(owner = "client!kq", name = "p", descriptor = "I")
    public static int field8000;

    @OriginalMember(owner = "client!kq", name = "q", descriptor = "I")
    public static int field8001;

    @OriginalMember(owner = "client!kq", name = "s", descriptor = "I")
    public static int field8003;

    @OriginalMember(owner = "client!kq", name = "t", descriptor = "I")
    public static int field8004;

    @OriginalMember(owner = "client!kq", name = "m", descriptor = "[[Z")
    public static boolean[][] field7997;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Z)Z", line = 4)
    public final boolean method1137(boolean arg0) {
        if (arg0) {
            this.field7998 = null;
        }
        ++field8003;
        return true;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(ZI)V", line = 15)
    public final void method1133(boolean arg0, int arg1) {
        ++field7991;
        class58 var3 = super.field5742.method880(113);
        if (arg1 != 0) {
            method3316((byte) -123);
        }
        if (this.field7998 != null && var3 != null && arg0) {
            this.field7998.method1687('\u0000', arg1 + 4864);
            super.field5742.method834(true, 1);
            super.field5742.method856(false, var3);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field5742.field1364.method496(false), 0);
            OpenGL.glMatrixMode(5888);
            super.field5742.method834(true, 0);
            this.field8002 = true;
        } else {
            super.field5742.method820(34168, 770, 0, arg1 + 121);
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "([BI)Ljava/lang/String;", line = 42)
    public static final String method3315(byte[] arg0, int arg1) {
        ++field8004;
        if (arg1 != -1710) {
            method3317(-120, -60);
        }
        return class267.method1897(arg0.length, 0, arg0, 0);
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Ler;)V", line = 58)
    public class550(class92 arg0) {
        super(arg0);
        if (arg0.field1371) {
            this.field7998 = new class231(arg0, 2);
            this.field7998.method1689(-31885, 0);
            super.field5742.method834(true, 1);
            super.field5742.method857(8960, 7681, 34165);
            super.field5742.method844(770, 34168, 2, (byte) -102);
            super.field5742.method820(34167, 770, 0, 121);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field5742.method834(true, 0);
            this.field7998.method1690(34);
            this.field7998.method1689(-31885, 1);
            super.field5742.method834(true, 1);
            super.field5742.method857(8960, 8448, 8448);
            super.field5742.method844(770, 34166, 2, (byte) -102);
            super.field5742.method820(5890, 770, 0, 121);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field5742.method834(true, 0);
            this.field7998.method1690(-122);
        }
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(B)V", line = 97)
    public static void method3316(byte arg0) {
        field7997 = null;
        int var1 = -50 / ((arg0 - -29) / 44);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(ILep;I)V", line = 113)
    public final void method1130(int arg0, class386 arg1, int arg2) {
        super.field5742.method856(false, arg1);
        ++field7992;
        super.field5742.method816(arg2, arg0 + -128);
        if (arg0 != 1) {
            this.method1131(true, true);
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(II)Z", line = 125)
    public static final boolean method3317(int arg0, int arg1) {
        ++field7996;
        if (arg0 >= -69) {
            field7997 = null;
        }
        return ~arg1 <= -13 && ~arg1 >= -18;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(ZZ)V", line = 136)
    public final void method1131(boolean arg0, boolean arg1) {
        if (!arg1) {
            this.field8002 = true;
        }
        ++field8000;
        super.field5742.method857(8960, 7681, 8448);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)V", line = 147)
    public final void method1132(int arg0) {
        ++field7999;
        if (!this.field8002) {
            super.field5742.method820(5890, 770, 0, 121);
        } else {
            this.field7998.method1687('\u0001', arg0 + 4864);
            super.field5742.method834(true, 1);
            super.field5742.method856(false, (class386) null);
            super.field5742.method834(true, 0);
        }
        super.field5742.method857(8960, 8448, 8448);
        if (arg0 == 0) {
            this.field8002 = false;
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(III)V", line = 173)
    public final void method1136(int arg0, int arg1, int arg2) {
        if (arg0 != -6561) {
            this.field8002 = true;
        }
        ++field8001;
    }
}
