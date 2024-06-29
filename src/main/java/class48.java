import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class48 extends class158 {

    @OriginalMember(owner = "client!te", name = "A", descriptor = "I")
    private int field795 = -1;

    @OriginalMember(owner = "client!te", name = "C", descriptor = "I")
    private int field797 = -1;

    @OriginalMember(owner = "client!te", name = "E", descriptor = "I")
    public int field799;

    @OriginalMember(owner = "client!te", name = "u", descriptor = "I")
    public int field789;

    @OriginalMember(owner = "client!te", name = "t", descriptor = "I")
    public int field788;

    @OriginalMember(owner = "client!te", name = "v", descriptor = "Lmp;")
    public static class315 field790 = new class315("stellardawn", 1);

    @OriginalMember(owner = "client!te", name = "D", descriptor = "Z")
    public static boolean field798 = false;

    @OriginalMember(owner = "client!te", name = "s", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!te", name = "w", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!te", name = "x", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!te", name = "y", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!te", name = "B", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!te", name = "z", descriptor = "Lla;")
    public static class423 field794;

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lkw;IIII)V", line = 5)
    public class48(class346 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg4 * arg3, false);
        this.field799 = arg4;
        this.field789 = arg2;
        this.field788 = arg3;
        super.field2275.method2164(6, this);
        OpenGL.glTexImage3Dub(super.field2261, 0, super.field2272, this.field789, this.field788, this.field799, 0, class347.method2202(super.field2272, (byte) 23), 5121, (byte[]) null, 0);
        this.method1131((byte) 42, true);
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(I)V", line = 18)
    public static void method460(int arg0) {
        if (arg0 <= 105) {
            method462((int[][]) null, 85);
        }
        field790 = null;
        field794 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIIIII)V", line = 31)
    public final void method461(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field787;
        super.field2275.method2164(6, this);
        OpenGL.glCopyTexSubImage3D(super.field2261, 0, arg3, arg0, arg6, arg5, arg7, arg2, arg1);
        if (arg4 >= 5) {
            OpenGL.glFlush();
        }
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lkw;IIII[BI)V", line = 47)
    public class48(class346 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field789 = arg2;
        this.field799 = arg4;
        this.field788 = arg3;
        super.field2275.method2164(6, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field2261, 0, super.field2272, this.field789, this.field788, this.field799, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method1131((byte) 42, true);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "([[II)V", line = 62)
    public static final void method462(int[][] arg0, int arg1) {
        class193.field2839 = arg0;
        ++field792;
        if (arg1 != 5121) {
            method462((int[][]) null, 74);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V", line = 76)
    public final void method463(byte arg0) {
        OpenGL.glFramebufferTexture3DEXT(this.field797, this.field795, super.field2261, 0, 0, 0);
        ++field796;
        if (arg0 >= -96) {
            method462((int[][]) null, -124);
        }
        this.field797 = -1;
        this.field795 = -1;
    }
}
