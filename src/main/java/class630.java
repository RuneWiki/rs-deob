import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class630 extends class412 {

    @OriginalMember(owner = "client!jm", name = "x", descriptor = "I")
    private int field8948 = -1;

    @OriginalMember(owner = "client!jm", name = "F", descriptor = "I")
    private int field8955 = -1;

    @OriginalMember(owner = "client!jm", name = "D", descriptor = "I")
    public int field8953;

    @OriginalMember(owner = "client!jm", name = "A", descriptor = "I")
    public int field8951;

    @OriginalMember(owner = "client!jm", name = "E", descriptor = "I")
    public int field8954;

    @OriginalMember(owner = "client!jm", name = "w", descriptor = "I")
    public static int field8947;

    @OriginalMember(owner = "client!jm", name = "y", descriptor = "I")
    public static int field8949;

    @OriginalMember(owner = "client!jm", name = "B", descriptor = "I")
    public static int field8952;

    @OriginalMember(owner = "client!jm", name = "z", descriptor = "Ljo;")
    public static class303 field8950;

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Lap;IIII[BI)V", line = 7)
    public class630(class435 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg4 * arg3, false);
        this.field8953 = arg2;
        this.field8951 = arg3;
        this.field8954 = arg4;
        super.field5478.method2388((byte) -96, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field5464, 0, super.field5470, this.field8953, this.field8951, this.field8954, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method2233((byte) -99, true);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)V", line = 28)
    public final void method260(byte arg0) {
        int var2 = 122 / (arg0 / 38);
        OpenGL.glFramebufferTexture3DEXT(this.field8955, this.field8948, super.field5464, 0, 0, 0);
        ++field8949;
        this.field8948 = -1;
        this.field8955 = -1;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 41)
    public static final boolean method3530(int arg0, String arg1) {
        if (arg0 <= 28) {
            method3530(44, (String) null);
        }
        ++field8947;
        return class253.method1453(10, arg1, true, true);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIIIII)V", line = 52)
    public final void method3531(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        super.field5478.method2388((byte) 99, this);
        ++field8952;
        OpenGL.glCopyTexSubImage3D(super.field5464, 0, arg5, arg2, arg1, arg0, arg6, arg7, arg4);
        OpenGL.glFlush();
        if (arg3 != 7318) {
            method3530(-53, (String) null);
        }
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Lap;IIII)V", line = 65)
    public class630(class435 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field8951 = arg3;
        this.field8953 = arg2;
        this.field8954 = arg4;
        super.field5478.method2388((byte) 113, this);
        OpenGL.glTexImage3Dub(super.field5464, 0, super.field5470, this.field8953, this.field8951, this.field8954, 0, class282.method1611(-94, super.field5470), 5121, (byte[]) null, 0);
        this.method2233((byte) -99, true);
    }

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "(B)V", line = 82)
    public static void method3532(byte arg0) {
        if (arg0 < -121) {
            field8950 = null;
        }
    }
}
