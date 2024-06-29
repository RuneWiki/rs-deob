import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class160 extends class427 {

    @OriginalMember(owner = "client!er", name = "y", descriptor = "I")
    private int field2188 = -1;

    @OriginalMember(owner = "client!er", name = "C", descriptor = "I")
    private int field2191 = -1;

    @OriginalMember(owner = "client!er", name = "B", descriptor = "I")
    public int field2190;

    @OriginalMember(owner = "client!er", name = "z", descriptor = "I")
    public int field2189;

    @OriginalMember(owner = "client!er", name = "E", descriptor = "I")
    public int field2193;

    @OriginalMember(owner = "client!er", name = "x", descriptor = "[I")
    public static int[] field2187 = new int[2];

    @OriginalMember(owner = "client!er", name = "D", descriptor = "I")
    public static int field2192 = 0;

    @OriginalMember(owner = "client!er", name = "G", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!er", name = "H", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lna;IIII)V")
    public class160(class211 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field2190 = arg3;
        this.field2189 = arg2;
        this.field2193 = arg4;
        super.field6451.method1540(68, this);
        OpenGL.glTexImage3Dub(super.field6455, 0, super.field6449, this.field2189, this.field2190, this.field2193, 0, class531.method3157(6406, super.field6449), 5121, (byte[]) null, 0);
        this.method2703(0, true);
    }

    @OriginalMember(owner = "client!er", name = "e", descriptor = "(I)V")
    public static void method973(int arg0) {
        if (arg0 <= -44) {
            field2187 = null;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IIBIIIII)V")
    public final void method974(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field2194;
        if (arg2 >= -47) {
            this.method974(-75, -6, (byte) 51, 52, 59, -30, -40, -67);
        }
        super.field6451.method1540(100, this);
        OpenGL.glCopyTexSubImage3D(super.field6455, 0, arg3, arg4, arg1, arg6, arg5, arg0, arg7);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lna;IIII[BI)V")
    public class160(class211 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg3 * arg4 * arg2, false);
        this.field2193 = arg4;
        this.field2189 = arg2;
        this.field2190 = arg3;
        super.field6451.method1540(81, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field6455, 0, super.field6449, this.field2189, this.field2190, this.field2193, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method2703(0, true);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V")
    public final void method82(int arg0) {
        OpenGL.glFramebufferTexture3DEXT(this.field2188, this.field2191, super.field6455, 0, 0, 0);
        ++field2195;
        this.field2191 = -1;
        this.field2188 = -1;
        if (arg0 <= 16) {
            this.method82(2);
        }
    }
}
