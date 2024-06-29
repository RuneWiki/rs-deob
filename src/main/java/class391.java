import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class391 extends class367 {

    @OriginalMember(owner = "client!ij", name = "v", descriptor = "I")
    private int field5158 = -1;

    @OriginalMember(owner = "client!ij", name = "u", descriptor = "I")
    private int field5157 = -1;

    @OriginalMember(owner = "client!ij", name = "z", descriptor = "I")
    public int field5162;

    @OriginalMember(owner = "client!ij", name = "C", descriptor = "I")
    public int field5165;

    @OriginalMember(owner = "client!ij", name = "A", descriptor = "I")
    public int field5163;

    @OriginalMember(owner = "client!ij", name = "y", descriptor = "I")
    public static int field5161 = 0;

    @OriginalMember(owner = "client!ij", name = "x", descriptor = "I")
    public static int field5160;

    @OriginalMember(owner = "client!ij", name = "B", descriptor = "I")
    public static int field5164;

    @OriginalMember(owner = "client!ij", name = "w", descriptor = "[Lxa;")
    public static class468[] field5159;

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Lno;IIII)V")
    public class391(class658 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg3 * arg4 * arg2, false);
        this.field5162 = arg4;
        this.field5165 = arg2;
        this.field5163 = arg3;
        super.field4971.method3630(this, -2);
        OpenGL.glTexImage3Dub(super.field4968, 0, super.field4966, this.field5165, this.field5163, this.field5162, 0, class501.method2783(true, super.field4966), 5121, (byte[]) null, 0);
        this.method2163(-30033, true);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIIIII)V")
    public final void method2254(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field5160;
        super.field4971.method3630(this, -2);
        OpenGL.glCopyTexSubImage3D(super.field4968, arg1, arg0, arg3, arg4, arg7, arg2, arg5, arg6);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
    public final void method773(int arg0) {
        OpenGL.glFramebufferTexture3DEXT(this.field5157, this.field5158, super.field4968, 0, 0, 0);
        ++field5164;
        this.field5157 = arg0;
        this.field5158 = -1;
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Lno;IIII[BI)V")
    public class391(class658 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field5162 = arg4;
        this.field5165 = arg2;
        this.field5163 = arg3;
        super.field4971.method3630(this, -2);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field4968, 0, super.field4966, this.field5165, this.field5163, this.field5162, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method2163(-30033, true);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V")
    public static void method2255(byte arg0) {
        if (arg0 < 56) {
            method2255((byte) 99);
        }
        field5159 = null;
    }
}
