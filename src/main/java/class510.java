import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class510 extends class221 {

    @OriginalMember(owner = "client!qj", name = "u", descriptor = "I")
    private int field6887 = -1;

    @OriginalMember(owner = "client!qj", name = "y", descriptor = "I")
    private int field6891 = -1;

    @OriginalMember(owner = "client!qj", name = "v", descriptor = "I")
    public int field6888;

    @OriginalMember(owner = "client!qj", name = "w", descriptor = "I")
    public int field6889;

    @OriginalMember(owner = "client!qj", name = "B", descriptor = "I")
    public int field6894;

    @OriginalMember(owner = "client!qj", name = "t", descriptor = "I")
    public static int field6886;

    @OriginalMember(owner = "client!qj", name = "x", descriptor = "I")
    public static int field6890;

    @OriginalMember(owner = "client!qj", name = "z", descriptor = "I")
    public static int field6892;

    @OriginalMember(owner = "client!qj", name = "A", descriptor = "I")
    public static int field6893;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIIIIII)V", line = 3)
    public final void method2829(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field6892;
        super.field2851.method3006(1, this);
        OpenGL.glCopyTexSubImage3D(super.field2849, arg3, arg1, arg7, arg2, arg0, arg4, arg5, arg6);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V", line = 17)
    public final void method832(byte arg0) {
        ++field6890;
        OpenGL.glFramebufferTexture3DEXT(this.field6891, this.field6887, super.field2849, 0, 0, 0);
        this.field6891 = -1;
        this.field6887 = -1;
        if (arg0 > -117) {
            field6893 = -122;
        }
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lac;IIII[BI)V", line = 38)
    public class510(class541 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg4 * arg3, false);
        this.field6888 = arg4;
        this.field6889 = arg2;
        this.field6894 = arg3;
        super.field2851.method3006(1, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field2849, 0, super.field2860, this.field6889, this.field6894, this.field6888, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method1258(-28003, true);
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lac;IIII)V", line = 59)
    public class510(class541 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field6889 = arg2;
        this.field6888 = arg4;
        this.field6894 = arg3;
        super.field2851.method3006(1, this);
        OpenGL.glTexImage3Dub(super.field2849, 0, super.field2860, this.field6889, this.field6894, this.field6888, 0, class716.method4008(super.field2860, 124), 5121, (byte[]) null, 0);
        this.method1258(-28003, true);
    }
}
