import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class474 extends class501 {

    @OriginalMember(owner = "client!fb", name = "w", descriptor = "I")
    private int field6549 = -1;

    @OriginalMember(owner = "client!fb", name = "A", descriptor = "I")
    private int field6553 = -1;

    @OriginalMember(owner = "client!fb", name = "y", descriptor = "I")
    public int field6551;

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "I")
    public int field6546;

    @OriginalMember(owner = "client!fb", name = "z", descriptor = "I")
    public int field6552;

    @OriginalMember(owner = "client!fb", name = "x", descriptor = "Lcu;")
    public static class145 field6550 = new class145(57, 4);

    @OriginalMember(owner = "client!fb", name = "B", descriptor = "[F")
    public static float[] field6554 = new float[4];

    @OriginalMember(owner = "client!fb", name = "C", descriptor = "I")
    public static int field6555 = -1;

    @OriginalMember(owner = "client!fb", name = "u", descriptor = "I")
    public static int field6547;

    @OriginalMember(owner = "client!fb", name = "v", descriptor = "I")
    public static int field6548;

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lbo;IIII[BI)V", line = 7)
    public class474(class511 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field6551 = arg3;
        this.field6546 = arg2;
        this.field6552 = arg4;
        super.field6916.method2980(this, 127);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field6920, 0, super.field6913, this.field6546, this.field6551, this.field6552, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method2866(10241, true);
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lbo;IIII)V", line = 27)
    public class474(class511 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg4 * arg3, false);
        this.field6552 = arg4;
        this.field6546 = arg2;
        this.field6551 = arg3;
        super.field6916.method2980(this, 123);
        OpenGL.glTexImage3Dub(super.field6920, 0, super.field6913, this.field6546, this.field6551, this.field6552, 0, class316.method1835(6407, super.field6913), 5121, (byte[]) null, 0);
        this.method2866(10241, true);
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)V", line = 41)
    public static void method2730(byte arg0) {
        field6550 = null;
        if (arg0 < 90) {
            method2730((byte) 82);
        }
        field6554 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V", line = 55)
    public final void method1503(int arg0) {
        ++field6548;
        if (arg0 <= 126) {
            this.field6552 = 105;
        }
        OpenGL.glFramebufferTexture3DEXT(this.field6549, this.field6553, super.field6920, 0, 0, 0);
        this.field6549 = -1;
        this.field6553 = -1;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIIII)V", line = 75)
    public final void method2731(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field6547;
        super.field6916.method2980(this, arg6 + 124);
        OpenGL.glCopyTexSubImage3D(super.field6920, arg6, arg2, arg7, arg4, arg1, arg0, arg5, arg3);
        OpenGL.glFlush();
    }
}
