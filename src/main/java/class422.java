import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class422 extends class541 {

    @OriginalMember(owner = "client!mu", name = "w", descriptor = "I")
    private int field6043 = -1;

    @OriginalMember(owner = "client!mu", name = "x", descriptor = "I")
    private int field6044 = -1;

    @OriginalMember(owner = "client!mu", name = "z", descriptor = "I")
    public int field6046;

    @OriginalMember(owner = "client!mu", name = "D", descriptor = "I")
    public int field6049;

    @OriginalMember(owner = "client!mu", name = "B", descriptor = "I")
    public int field6047;

    @OriginalMember(owner = "client!mu", name = "H", descriptor = "Lmh;")
    public static class145 field6051 = new class145("", 12);

    @OriginalMember(owner = "client!mu", name = "y", descriptor = "I")
    public static int field6045;

    @OriginalMember(owner = "client!mu", name = "C", descriptor = "I")
    public static int field6048;

    @OriginalMember(owner = "client!mu", name = "F", descriptor = "I")
    public static int field6050;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Z)V")
    public static void method2507(boolean arg0) {
        field6051 = null;
        if (!arg0) {
            method2507(true);
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(IIIIIIII)V")
    public final void method2508(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3 != 3317) {
            method2507(true);
        }
        ++field6045;
        super.field8091.method2811(this, -2);
        OpenGL.glCopyTexSubImage3D(super.field8096, 0, arg7, arg4, arg1, arg0, arg5, arg6, arg2);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(B)V")
    public final void method1363(byte arg0) {
        OpenGL.glFramebufferTexture3DEXT(this.field6044, this.field6043, super.field8096, 0, 0, 0);
        ++field6050;
        this.field6044 = -1;
        this.field6043 = -1;
        if (arg0 != -19) {
            this.method1363((byte) -106);
        }
    }

    @OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Los;IIII[BI)V")
    public class422(class468 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg3 * arg4 * arg2, false);
        this.field6046 = arg4;
        this.field6049 = arg2;
        this.field6047 = arg3;
        super.field8091.method2811(this, -2);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field8096, 0, super.field8095, this.field6049, this.field6047, this.field6046, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method3174(true, -17759);
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(IIZII)I")
    public static final int method2509(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        ++field6048;
        int var5 = 65536 - class14.field130[arg0 * 8192 / arg3] >> 1;
        return !arg2 ? -79 : ((-var5 + 65536) * arg1 >> 16) + (arg4 * var5 >> 16);
    }

    @OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Los;IIII)V")
    public class422(class468 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field6046 = arg4;
        this.field6047 = arg3;
        this.field6049 = arg2;
        super.field8091.method2811(this, -2);
        OpenGL.glTexImage3Dub(super.field8096, 0, super.field8095, this.field6049, this.field6047, this.field6046, 0, class128.method802(super.field8095, 1), 5121, (byte[]) null, 0);
        this.method3174(true, -17759);
    }
}
