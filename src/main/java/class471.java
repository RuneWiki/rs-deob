import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!faa")
public class class471 extends class203 {

    @OriginalMember(owner = "client!faa", name = "r", descriptor = "Z")
    private boolean field6532 = false;

    @OriginalMember(owner = "client!faa", name = "i", descriptor = "Lup;")
    private class545 field6523;

    @OriginalMember(owner = "client!faa", name = "g", descriptor = "[I")
    public static int[] field6521 = null;

    @OriginalMember(owner = "client!faa", name = "n", descriptor = "I")
    public static int field6528 = 0;

    @OriginalMember(owner = "client!faa", name = "m", descriptor = "I")
    public static int field6527 = 0;

    @OriginalMember(owner = "client!faa", name = "s", descriptor = "Ljava/lang/String;")
    public static String field6533 = null;

    @OriginalMember(owner = "client!faa", name = "h", descriptor = "I")
    public static int field6522;

    @OriginalMember(owner = "client!faa", name = "j", descriptor = "I")
    public static int field6524;

    @OriginalMember(owner = "client!faa", name = "k", descriptor = "I")
    public static int field6525;

    @OriginalMember(owner = "client!faa", name = "l", descriptor = "I")
    public static int field6526;

    @OriginalMember(owner = "client!faa", name = "o", descriptor = "I")
    public static int field6529;

    @OriginalMember(owner = "client!faa", name = "p", descriptor = "I")
    public static int field6530;

    @OriginalMember(owner = "client!faa", name = "q", descriptor = "I")
    public static int field6531;

    @OriginalMember(owner = "client!faa", name = "c", descriptor = "(I)V")
    public static void method2808(int arg0) {
        if (arg0 != 770) {
            field6533 = null;
        }
        field6533 = null;
        field6521 = null;
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(I)V")
    public final void method686(int arg0) {
        ++field6530;
        if (this.field6532) {
            this.field6523.method3226(6, '\u0001');
            super.field2843.method1262(1, 0);
            super.field2843.method1219((byte) 68, (class539) null);
            super.field2843.method1262(0, 0);
        } else {
            super.field2843.method1220(5890, 770, 34200, 0);
        }
        super.field2843.method1230(8448, 8448, false);
        this.field6532 = false;
        if (arg0 <= 64) {
            this.method682(-13, -65, true);
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(BZ)V")
    public final void method688(byte arg0, boolean arg1) {
        ++field6531;
        class734 var3 = super.field2843.method1244(-126);
        if (this.field6523 != null && var3 != null && arg1) {
            this.field6523.method3226(6, '\u0000');
            super.field2843.method1262(1, 0);
            super.field2843.method1219((byte) 93, var3);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field2843.field2646.method286((byte) -128), 0);
            OpenGL.glMatrixMode(5888);
            super.field2843.method1262(0, 0);
            this.field6532 = true;
        } else {
            super.field2843.method1220(34168, 770, 34200, 0);
        }
        if (arg0 > -25) {
            field6533 = null;
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(IZLwha;)V")
    public final void method683(int arg0, boolean arg1, class539 arg2) {
        ++field6529;
        if (arg1) {
            field6533 = null;
        }
        super.field2843.method1219((byte) 104, arg2);
        super.field2843.method1263(arg0, 92);
    }

    @OriginalMember(owner = "client!faa", name = "<init>", descriptor = "(Lpq;)V")
    public class471(class194 arg0) {
        super(arg0);
        if (arg0.field2727) {
            this.field6523 = new class545(arg0, 2);
            this.field6523.method3227(0, (byte) -89);
            super.field2843.method1262(1, 0);
            super.field2843.method1230(7681, 34165, false);
            super.field2843.method1223(2, 33, 770, 34168);
            super.field2843.method1220(34167, 770, 34200, 0);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field2843.method1262(0, 0);
            this.field6523.method3225(-109);
            this.field6523.method3227(1, (byte) -84);
            super.field2843.method1262(1, 0);
            super.field2843.method1230(8448, 8448, false);
            super.field2843.method1223(2, 55, 770, 34166);
            super.field2843.method1220(5890, 770, 34200, 0);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field2843.method1262(0, 0);
            this.field6523.method3225(-63);
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(IIZ)V")
    public final void method682(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field6524 = -33;
        }
        ++field6522;
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(ZB)V")
    public final void method681(boolean arg0, byte arg1) {
        ++field6525;
        if (arg1 <= 0) {
            this.method687(27);
        }
        super.field2843.method1230(7681, 8448, false);
    }

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "(I)Z")
    public final boolean method687(int arg0) {
        if (arg0 != -12) {
            this.method688((byte) 1, false);
        }
        ++field6526;
        return true;
    }
}
