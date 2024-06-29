import jaggl.OpenGL;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class460 extends class31 {

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "I")
    private int field6422 = -1;

    @OriginalMember(owner = "client!rg", name = "x", descriptor = "I")
    private int field6426 = -1;

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "I")
    public int field6428;

    @OriginalMember(owner = "client!rg", name = "v", descriptor = "I")
    public int field6424;

    @OriginalMember(owner = "client!rg", name = "C", descriptor = "I")
    public int field6431;

    @OriginalMember(owner = "client!rg", name = "u", descriptor = "[I")
    public static int[] field6423 = new int[4096];

    @OriginalMember(owner = "client!rg", name = "A", descriptor = "[I")
    public static int[] field6429 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!rg", name = "w", descriptor = "Ltu;")
    public static class7 field6425 = new class7();

    @OriginalMember(owner = "client!rg", name = "y", descriptor = "I")
    public static int field6427;

    @OriginalMember(owner = "client!rg", name = "B", descriptor = "I")
    public static int field6430;

    @OriginalMember(owner = "client!rg", name = "D", descriptor = "Ljava/awt/Frame;")
    public static Frame field6432;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V")
    public static void method2713(byte arg0) {
        field6425 = null;
        field6429 = null;
        field6423 = null;
        if (arg0 == -22) {
            field6432 = null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lgk;IIII[BI)V")
    public class460(class463 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg4 * arg3, false);
        this.field6428 = arg3;
        this.field6424 = arg4;
        this.field6431 = arg2;
        super.field512.method2771(this, -16785);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field521, 0, super.field519, this.field6431, this.field6428, this.field6424, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method210(true, (byte) -91);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
    public final void method220(int arg0) {
        OpenGL.glFramebufferTexture3DEXT(this.field6426, this.field6422, super.field521, 0, arg0, 0);
        ++field6430;
        this.field6426 = -1;
        this.field6422 = -1;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIZIIII)V")
    public final void method2714(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        super.field512.method2771(this, -16785);
        if (arg3) {
            method2713((byte) -82);
        }
        ++field6427;
        OpenGL.glCopyTexSubImage3D(super.field521, 0, arg0, arg5, arg6, arg7, arg2, arg1, arg4);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lgk;IIII)V")
    public class460(class463 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg3 * arg4 * arg2, false);
        this.field6428 = arg3;
        this.field6424 = arg4;
        this.field6431 = arg2;
        super.field512.method2771(this, -16785);
        OpenGL.glTexImage3Dub(super.field521, 0, super.field519, this.field6431, this.field6428, this.field6424, 0, class65.method365(super.field519, false), 5121, (byte[]) null, 0);
        this.method210(true, (byte) 33);
    }
}
