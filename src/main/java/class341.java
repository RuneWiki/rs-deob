import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class341 extends class446 {

    @OriginalMember(owner = "client!mi", name = "r", descriptor = "I")
    private int field4858 = -1;

    @OriginalMember(owner = "client!mi", name = "s", descriptor = "I")
    private int field4859 = -1;

    @OriginalMember(owner = "client!mi", name = "w", descriptor = "I")
    public int field4863;

    @OriginalMember(owner = "client!mi", name = "u", descriptor = "I")
    public int field4861;

    @OriginalMember(owner = "client!mi", name = "v", descriptor = "I")
    public int field4862;

    @OriginalMember(owner = "client!mi", name = "t", descriptor = "I")
    public static int field4860;

    @OriginalMember(owner = "client!mi", name = "x", descriptor = "I")
    public static int field4864;

    @OriginalMember(owner = "client!mi", name = "y", descriptor = "I")
    public static int field4865;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V", line = 4)
    public final void method1726(int arg0) {
        ++field4865;
        OpenGL.glFramebufferTexture3DEXT(this.field4859, this.field4858, super.field6633, arg0, 0, 0);
        this.field4858 = -1;
        this.field4859 = -1;
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Lod;IIII[BI)V", line = 14)
    public class341(class349 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg4 * arg3, false);
        this.field4863 = arg3;
        this.field4861 = arg2;
        this.field4862 = arg4;
        super.field6637.method2200(this, (byte) 120);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field6633, 0, super.field6646, this.field4861, this.field4863, this.field4862, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method2683(true, 0);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIIIII)V", line = 30)
    public final void method2083(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field4864;
        super.field6637.method2200(this, (byte) 121);
        OpenGL.glCopyTexSubImage3D(super.field6633, arg2, arg4, arg7, arg6, arg5, arg0, arg3, arg1);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Lod;IIII)V", line = 45)
    public class341(class349 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg4 * arg3, false);
        this.field4861 = arg2;
        this.field4862 = arg4;
        this.field4863 = arg3;
        super.field6637.method2200(this, (byte) 120);
        OpenGL.glTexImage3Dub(super.field6633, 0, super.field6646, this.field4861, this.field4863, this.field4862, 0, class301.method1901(super.field6646, false), 5121, (byte[]) null, 0);
        this.method2683(true, 0);
    }
}
